package androidx.media3.decoder;

import android.opengl.GLES20;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes3.dex */
public abstract class Buffer {
    public final /* synthetic */ int $r8$classId;
    public int flags;

    public Buffer(int i) {
        this.$r8$classId = 1;
        this.flags = i;
    }

    public static String getBoxTypeString(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public void compile() {
        int loadShader = CompositeException.WrappedPrintStream.loadShader(35633, "attribute vec2 aPosition;\nvarying vec2 vTexCoord;\n\nvoid main() {\n  vTexCoord = aPosition * 0.5 + 0.5;\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n}");
        int loadShader2 = CompositeException.WrappedPrintStream.loadShader(35632, getFragmentSource());
        int glCreateProgram = GLES20.glCreateProgram();
        CompositeException.WrappedPrintStream.checkGlError("glCreateProgram");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        CompositeException.WrappedPrintStream.checkGlError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        CompositeException.WrappedPrintStream.checkGlError("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Could not link program: ", glGetProgramInfoLog));
        } else {
            this.flags = glCreateProgram;
            GLES20.glDeleteShader(loadShader);
            GLES20.glDeleteShader(loadShader2);
            onProgramCompiled();
        }
    }

    public boolean getFlag(int i) {
        return (this.flags & i) == i;
    }

    public abstract String getFragmentSource();

    public abstract void onProgramCompiled();

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                return getBoxTypeString(this.flags);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Buffer(byte b, int i) {
        this.$r8$classId = i;
    }
}
