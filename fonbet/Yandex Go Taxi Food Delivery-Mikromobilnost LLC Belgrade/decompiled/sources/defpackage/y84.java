package defpackage;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes10.dex */
public final class y84 extends w7x0 {
    public final int a;
    public final ImageCaptureException b;

    public y84(int i, ImageCaptureException imageCaptureException) {
        this.a = i;
        this.b = imageCaptureException;
    }

    @Override // defpackage.w7x0
    public final ImageCaptureException a() {
        return this.b;
    }

    @Override // defpackage.w7x0
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w7x0)) {
            return false;
        }
        w7x0 w7x0Var = (w7x0) obj;
        return this.a == w7x0Var.b() && this.b.equals(w7x0Var.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
