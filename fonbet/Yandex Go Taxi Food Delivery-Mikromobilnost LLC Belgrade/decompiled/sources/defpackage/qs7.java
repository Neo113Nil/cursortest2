package defpackage;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* loaded from: classes10.dex */
public final class qs7 implements b2k0 {
    public final /* synthetic */ int b;
    public final b2k0 c;

    public qs7(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new bez0(j, new ps7(j));
                break;
            default:
                this.c = new qs7(j, 1);
                break;
        }
    }

    @Override // defpackage.b2k0
    public final long a() {
        switch (this.b) {
            case 0:
                return ((bez0) ((qs7) this.c).c).b;
            default:
                return ((bez0) this.c).b;
        }
    }

    @Override // defpackage.b2k0
    public final a2k0 b(os7 os7Var) {
        int i = this.b;
        b2k0 b2k0Var = this.c;
        switch (i) {
            case 0:
                if (((bez0) ((qs7) b2k0Var).c).b(os7Var).b) {
                    return a2k0.e;
                }
                Throwable th = (Throwable) os7Var.c;
                if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                    sgb1.d("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator$CameraIdListIncorrectException) th).a() > 0) {
                        return a2k0.f;
                    }
                }
                return a2k0.d;
            default:
                return ((bez0) b2k0Var).b(os7Var);
        }
    }
}
