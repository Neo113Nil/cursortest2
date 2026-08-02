package com.squareup.cash.card.onboarding.core;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.swampgl.components.shaders.DecayShaderProgram;
import com.squareup.cash.graphics.swampgl.components.shaders.HeatShaderProgram;
import com.squareup.cash.graphics.swampgl.components.shaders.MaxAlphaShaderProgram;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class HeatMaskRenderer implements HeatMaskProvider {
    public final StateFlowImpl _ready;
    public int checkFbo;
    public final ByteBuffer checkPixelBuffer;
    public int checkTexture;
    public final Config config;
    public int currentReadFbo;
    public int currentReadTexture;
    public int currentWriteFbo;
    public int currentWriteTexture;
    public final float decayAmountPerFrame;
    public final int decayEveryNFrames;
    public final DecayShaderProgram decayShader;
    public int fboA;
    public int fboB;
    public int framesSinceLastDecay;
    public int framesSinceLastHeat;
    public boolean hasHeat;
    public final float heatRadius;
    public final HeatShaderProgram heatShader;
    public final Bitmap initialBitmap;
    public long lastAddTimeNanos;
    public final HeatShaderProgram luminanceShader;
    public final MaxAlphaShaderProgram maxShader;
    public final long minAddIntervalNanos;
    public final Function0 onNeedsRender;
    public final ArrayList pendingHeatPoints;
    public final ArrayList pointsToRender;
    public int quadVbo;
    public final ReadonlyStateFlow ready;
    public StandaloneCoroutine renderJob;
    public boolean renderLoopActive;
    public final Function0 shouldRender;
    public final Object swapLock;
    public int textureA;
    public int textureB;

    /* loaded from: classes6.dex */
    public final class Config {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Float.compare(0.2f, 0.2f) == 0 && Float.compare(0.29411766f, 0.29411766f) == 0 && Float.compare(0.003921569f, 0.003921569f) == 0;
        }

        public final int hashCode() {
            return Integer.hashCode(200) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, CameraState$Type$EnumUnboxingLocalUtility.m(0.003921569f, CameraState$Type$EnumUnboxingLocalUtility.m(0.29411766f, CameraState$Type$EnumUnboxingLocalUtility.m(0.2f, Long.hashCode(33L) * 31, 31), 31), 31), 31), 31, 8000000L);
        }

        public final String toString() {
            return "Config(renderLoopDelayMs=33, heatRadius=0.2, defaultHeatIntensity=0.29411766, decayAmountPerFrame=0.003921569, decayEveryNFrames=1, minAddIntervalNanos=8000000, framesUntilHeatCheck=200)";
        }
    }

    public final class HeatPoint {
        public final float intensity;
        public final float u;
        public final float v;

        public HeatPoint(float f, float f2, float f3) {
            this.u = f;
            this.v = f2;
            this.intensity = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeatPoint)) {
                return false;
            }
            HeatPoint heatPoint = (HeatPoint) obj;
            return Float.compare(this.u, heatPoint.u) == 0 && Float.compare(this.v, heatPoint.v) == 0 && Float.compare(this.intensity, heatPoint.intensity) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.intensity) + CameraState$Type$EnumUnboxingLocalUtility.m(this.v, Float.hashCode(this.u) * 31, 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(this.intensity, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeatPoint(u=", this.u, ", v=", this.v, ", intensity="));
        }
    }

    public HeatMaskRenderer(Bitmap bitmap, Function0 function0, Function0 function02, Config config) {
        config.getClass();
        this.initialBitmap = bitmap;
        this.onNeedsRender = function0;
        this.shouldRender = function02;
        this.config = config;
        this.swapLock = new Object();
        HeatShaderProgram heatShaderProgram = new HeatShaderProgram(0);
        heatShaderProgram.centerLoc = -1;
        heatShaderProgram.radiusLoc = -1;
        heatShaderProgram.intensityLoc = -1;
        this.heatShader = heatShaderProgram;
        DecayShaderProgram decayShaderProgram = new DecayShaderProgram((byte) 0, 2);
        decayShaderProgram.textureLoc = -1;
        decayShaderProgram.decayFactorLoc = -1;
        this.decayShader = decayShaderProgram;
        MaxAlphaShaderProgram maxAlphaShaderProgram = new MaxAlphaShaderProgram((byte) 0, 2);
        maxAlphaShaderProgram.textureLoc = -1;
        this.maxShader = maxAlphaShaderProgram;
        HeatShaderProgram heatShaderProgram2 = new HeatShaderProgram(1);
        heatShaderProgram2.centerLoc = -1;
        heatShaderProgram2.radiusLoc = -1;
        heatShaderProgram2.intensityLoc = -1;
        this.luminanceShader = heatShaderProgram2;
        this.pendingHeatPoints = new ArrayList();
        this.pointsToRender = new ArrayList();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.checkPixelBuffer = allocateDirect;
        this.heatRadius = 0.2f;
        this.decayAmountPerFrame = 0.003921569f;
        this.minAddIntervalNanos = 8000000L;
        this.decayEveryNFrames = 1;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._ready = MutableStateFlow;
        this.ready = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static void setupTexture(int i, int i2, int i3) {
        GLES20.glActiveTexture(34001);
        GLES20.glBindTexture(3553, i);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
    }

    public final void drawFullScreenQuad() {
        GLES20.glBindBuffer(34962, this.quadVbo);
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(35725, iArr, 0);
        int glGetAttribLocation = GLES20.glGetAttribLocation(iArr[0], "aPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
    }

    @Override // com.squareup.cash.card.onboarding.core.HeatMaskProvider
    public final int getTextureId() {
        int i;
        synchronized (this.swapLock) {
            i = this.currentReadTexture;
        }
        return i;
    }

    public final void initialize() {
        while (GLES20.glGetError() != 0) {
        }
        int[] iArr = new int[2];
        GLES20.glGenTextures(2, iArr, 0);
        int i = iArr[0];
        this.textureA = i;
        this.textureB = iArr[1];
        setupTexture(i, 380, 512);
        setupTexture(this.textureB, 380, 512);
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i2 = iArr2[0];
        this.checkTexture = i2;
        setupTexture(i2, 1, 1);
        int[] iArr3 = new int[2];
        GLES20.glGenFramebuffers(2, iArr3, 0);
        int i3 = iArr3[0];
        this.fboA = i3;
        this.fboB = iArr3[1];
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureA, 0);
        CompositeException.WrappedPrintStream.checkFramebufferStatus();
        GLES20.glViewport(0, 0, 380, 512);
        GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, this.fboB);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureB, 0);
        CompositeException.WrappedPrintStream.checkFramebufferStatus();
        GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        GLES20.glClear(16384);
        int[] iArr4 = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        int i4 = iArr4[0];
        this.checkFbo = i4;
        GLES20.glBindFramebuffer(36160, i4);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.checkTexture, 0);
        CompositeException.WrappedPrintStream.checkFramebufferStatus();
        GLES20.glBindFramebuffer(36160, 0);
        this.currentReadTexture = this.textureA;
        this.currentWriteTexture = this.textureB;
        this.currentReadFbo = this.fboA;
        this.currentWriteFbo = this.fboB;
        this.heatShader.compile();
        this.decayShader.compile();
        this.maxShader.compile();
        this.luminanceShader.compile();
        int[] iArr5 = new int[1];
        GLES20.glGenBuffers(1, iArr5, 0);
        this.quadVbo = iArr5[0];
        Buffer position = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
        GLES20.glBindBuffer(34962, this.quadVbo);
        GLES20.glBufferData(34962, 32, position, 35044);
        if (this.initialBitmap == null) {
            Boolean bool = Boolean.TRUE;
            StateFlowImpl stateFlowImpl = this._ready;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool);
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("HeatMaskRenderer");
        forest.d("Initialized ping-pong textures (380x512)", new Object[0]);
    }

    @Override // com.squareup.cash.card.onboarding.core.HeatMaskProvider
    public final boolean isReady() {
        return ((Boolean) this._ready.getValue()).booleanValue();
    }

    public final void release() {
        HeatShaderProgram heatShaderProgram = this.heatShader;
        int i = heatShaderProgram.flags;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        heatShaderProgram.flags = 0;
        DecayShaderProgram decayShaderProgram = this.decayShader;
        int i2 = decayShaderProgram.flags;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
        }
        decayShaderProgram.flags = 0;
        MaxAlphaShaderProgram maxAlphaShaderProgram = this.maxShader;
        int i3 = maxAlphaShaderProgram.flags;
        if (i3 != 0) {
            GLES20.glDeleteProgram(i3);
        }
        maxAlphaShaderProgram.flags = 0;
        HeatShaderProgram heatShaderProgram2 = this.luminanceShader;
        int i4 = heatShaderProgram2.flags;
        if (i4 != 0) {
            GLES20.glDeleteProgram(i4);
        }
        heatShaderProgram2.flags = 0;
        int i5 = this.quadVbo;
        if (i5 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i5}, 0);
        }
        this.quadVbo = 0;
        int i6 = this.fboA;
        if (i6 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i6}, 0);
        }
        this.fboA = 0;
        int i7 = this.fboB;
        if (i7 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i7}, 0);
        }
        this.fboB = 0;
        int i8 = this.checkFbo;
        if (i8 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i8}, 0);
        }
        this.checkFbo = 0;
        int i9 = this.textureA;
        if (i9 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i9}, 0);
        }
        this.textureA = 0;
        int i10 = this.textureB;
        if (i10 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        }
        this.textureB = 0;
        int i11 = this.checkTexture;
        if (i11 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        }
        this.checkTexture = 0;
    }

    public final void renderBitmapToHeatMask(Bitmap bitmap) {
        int[] iArr;
        int[] iArr2;
        HeatShaderProgram heatShaderProgram = this.luminanceShader;
        DecayShaderProgram decayShaderProgram = this.decayShader;
        bitmap.getClass();
        int width = (int) (380.0f / (bitmap.getWidth() / bitmap.getHeight()));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 380, width, true);
        createScaledBitmap.getClass();
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        int i = iArr3[0];
        GLES20.glActiveTexture(34001);
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, createScaledBitmap, 0);
        createScaledBitmap.recycle();
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[1];
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[1];
        int[] iArr9 = new int[1];
        int[] iArr10 = new int[1];
        GLES20.glGetIntegerv(2978, iArr4, 0);
        GLES20.glGetIntegerv(36006, iArr5, 0);
        GLES20.glGetIntegerv(34016, iArr8, 0);
        GLES20.glGetIntegerv(35725, iArr9, 0);
        GLES20.glGetIntegerv(2885, iArr10, 0);
        boolean glIsEnabled = GLES20.glIsEnabled(2929);
        boolean glIsEnabled2 = GLES20.glIsEnabled(3042);
        boolean glIsEnabled3 = GLES20.glIsEnabled(2884);
        GLES20.glGetIntegerv(32969, iArr6, 0);
        GLES20.glGetIntegerv(32968, iArr7, 0);
        try {
            GLES20.glBindFramebuffer(36160, this.currentWriteFbo);
            iArr = iArr10;
            iArr2 = iArr4;
        } catch (Throwable th) {
            th = th;
            iArr = iArr10;
            iArr2 = iArr4;
        }
        try {
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.currentWriteTexture, 0);
            GLES20.glViewport(0, 0, 380, 512);
            if (this.hasHeat) {
                GLES20.glUseProgram(decayShaderProgram.flags);
                GLES20.glActiveTexture(34001);
                GLES20.glBindTexture(3553, this.currentReadTexture);
                GLES20.glUniform1i(decayShaderProgram.textureLoc, 17);
                GLES20.glUniform1f(decayShaderProgram.decayFactorLoc, RecyclerView.DECELERATION_RATE);
                GLES20.glDisable(3042);
                drawFullScreenQuad();
            } else {
                GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                GLES20.glClear(16384);
            }
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 1);
            GLES20.glUseProgram(heatShaderProgram.flags);
            GLES20.glActiveTexture(34001);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(heatShaderProgram.centerLoc, 17);
            GLES20.glUniform2f(heatShaderProgram.radiusLoc, 1.0f, width / 512.0f);
            GLES20.glUniform2f(heatShaderProgram.intensityLoc, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            drawFullScreenQuad();
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, iArr5[0]);
            GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            GLES20.glActiveTexture(iArr8[0]);
            GLES20.glUseProgram(iArr9[0]);
            if (glIsEnabled) {
                GLES20.glEnable(2929);
            } else {
                GLES20.glDisable(2929);
            }
            if (glIsEnabled2) {
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(iArr6[0], iArr7[0]);
            } else {
                GLES20.glDisable(3042);
            }
            if (glIsEnabled3) {
                GLES20.glEnable(2884);
                GLES20.glCullFace(iArr[0]);
            } else {
                GLES20.glDisable(2884);
            }
            GLES20.glDeleteTextures(1, iArr3, 0);
            swapTextures();
            this.hasHeat = true;
            GLES20.glFlush();
            Boolean bool = Boolean.TRUE;
            StateFlowImpl stateFlowImpl = this._ready;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool);
        } catch (Throwable th2) {
            th = th2;
            GLES20.glBindFramebuffer(36160, iArr5[0]);
            GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            GLES20.glActiveTexture(iArr8[0]);
            GLES20.glUseProgram(iArr9[0]);
            if (glIsEnabled) {
                GLES20.glEnable(2929);
            } else {
                GLES20.glDisable(2929);
            }
            if (glIsEnabled2) {
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(iArr6[0], iArr7[0]);
            } else {
                GLES20.glDisable(3042);
            }
            if (glIsEnabled3) {
                GLES20.glEnable(2884);
                GLES20.glCullFace(iArr[0]);
            } else {
                GLES20.glDisable(2884);
            }
            throw th;
        }
    }

    public final void swapTextures() {
        synchronized (this.swapLock) {
            int i = this.currentReadTexture;
            int i2 = this.currentReadFbo;
            this.currentReadTexture = this.currentWriteTexture;
            this.currentReadFbo = this.currentWriteFbo;
            this.currentWriteTexture = i;
            this.currentWriteFbo = i2;
        }
    }
}
