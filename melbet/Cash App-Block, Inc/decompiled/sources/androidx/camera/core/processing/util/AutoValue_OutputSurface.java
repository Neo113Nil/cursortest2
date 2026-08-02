package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_OutputSurface {
    public final EGLSurface eglSurface;
    public final int height;
    public final int width;

    public AutoValue_OutputSurface(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null eglSurface");
            throw null;
        }
        this.eglSurface = eGLSurface;
        this.width = i;
        this.height = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_OutputSurface) {
            AutoValue_OutputSurface autoValue_OutputSurface = (AutoValue_OutputSurface) obj;
            if (this.eglSurface.equals(autoValue_OutputSurface.eglSurface) && this.width == autoValue_OutputSurface.width && this.height == autoValue_OutputSurface.height) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.height ^ ((((this.eglSurface.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.eglSurface);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, "}", sb);
    }
}
