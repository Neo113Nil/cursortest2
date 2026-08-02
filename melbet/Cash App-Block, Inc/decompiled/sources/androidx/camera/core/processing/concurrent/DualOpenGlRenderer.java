package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.SurfaceOutputImpl;
import androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo;
import androidx.camera.core.processing.util.AutoValue_OutputSurface;
import androidx.camera.core.processing.util.GLUtils;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class DualOpenGlRenderer extends OpenGlRenderer {
    public final UseCaseGroup mPrimaryCompositionSettings;
    public final UseCaseGroup mSecondaryCompositionSettings;
    public int mPrimaryExternalTextureId = -1;
    public int mSecondaryExternalTextureId = -1;

    public DualOpenGlRenderer(UseCaseGroup useCaseGroup, UseCaseGroup useCaseGroup2) {
        this.mPrimaryCompositionSettings = useCaseGroup;
        this.mSecondaryCompositionSettings = useCaseGroup2;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public final AutoValue_GraphicDeviceInfo init(DynamicRange dynamicRange) {
        Map map = Collections.EMPTY_MAP;
        AutoValue_GraphicDeviceInfo init = super.init(dynamicRange);
        this.mPrimaryExternalTextureId = GLUtils.createTexture();
        this.mSecondaryExternalTextureId = GLUtils.createTexture();
        return init;
    }

    public final void render(long j, Surface surface, SurfaceOutputImpl surfaceOutputImpl, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        GLUtils.checkInitializedOrThrow((AtomicBoolean) this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow((Thread) this.mGlThread);
        HashMap hashMap = (HashMap) this.mOutputSurfaceMap;
        TransactorKt.checkState("The surface is not registered.", hashMap.containsKey(surface));
        AutoValue_OutputSurface autoValue_OutputSurface = (AutoValue_OutputSurface) hashMap.get(surface);
        Objects.requireNonNull(autoValue_OutputSurface);
        if (autoValue_OutputSurface == GLUtils.NO_OUTPUT_SURFACE) {
            autoValue_OutputSurface = createOutputSurfaceInternal(surface);
            if (autoValue_OutputSurface == null) {
                return;
            } else {
                hashMap.put(surface, autoValue_OutputSurface);
            }
        }
        AutoValue_OutputSurface autoValue_OutputSurface2 = autoValue_OutputSurface;
        EGLSurface eGLSurface = autoValue_OutputSurface2.eglSurface;
        if (surface != ((Surface) this.mCurrentSurface)) {
            makeCurrent(eGLSurface);
            this.mCurrentSurface = surface;
        }
        GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        GLES20.glClear(16384);
        renderInternal(autoValue_OutputSurface2, surfaceOutputImpl, surfaceTexture, this.mPrimaryCompositionSettings, this.mPrimaryExternalTextureId, true);
        renderInternal(autoValue_OutputSurface2, surfaceOutputImpl, surfaceTexture2, this.mSecondaryCompositionSettings, this.mSecondaryExternalTextureId, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.mEglDisplay, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.mEglDisplay, eGLSurface)) {
            return;
        }
        StringUtilsKt.w("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }

    public final void renderInternal(AutoValue_OutputSurface autoValue_OutputSurface, SurfaceOutputImpl surfaceOutputImpl, SurfaceTexture surfaceTexture, UseCaseGroup useCaseGroup, int i, boolean z) {
        useAndConfigureProgramWithTexture(i);
        int i2 = autoValue_OutputSurface.width;
        int i3 = autoValue_OutputSurface.height;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? surfaceOutputImpl.mAdditionalTransform : surfaceOutputImpl.mSecondaryAdditionalTransform, 0);
        GLUtils.Program2D program2D = (GLUtils.Program2D) this.mCurrentProgram;
        program2D.getClass();
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            GLES20.glUniformMatrix4fv(((GLUtils.SamplerShaderProgram) program2D).mTexMatrixLoc, 1, false, fArr2, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }
        Pair pair = (Pair) useCaseGroup.mEffects;
        Size size = new Size((int) (((Float) pair.first).floatValue() * i2), (int) (((Float) pair.second).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Pair pair2 = (Pair) useCaseGroup.mUseCases;
        if (((Float) pair.first).floatValue() != RecyclerView.DECELERATION_RATE || ((Float) pair.second).floatValue() != RecyclerView.DECELERATION_RATE) {
            Matrix.translateM(fArr4, 0, ((Float) pair2.first).floatValue() / ((Float) pair.first).floatValue(), ((Float) pair2.second).floatValue() / ((Float) pair.second).floatValue(), RecyclerView.DECELERATION_RATE);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(program2D.mTransMatrixLoc, 1, false, fArr5, 0);
        GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        GLES20.glUniform1f(program2D.mAlphaScaleLoc, 1.0f);
        GLUtils.checkGlErrorOrThrow("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
