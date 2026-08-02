package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.ImageCaptureException;
import androidx.concurrent.futures.b;
import defpackage.xo7;

/* loaded from: classes10.dex */
public final class zm7 extends uo7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ zm7(int i, b bVar) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.uo7
    public final void a(int i) {
        int i2 = this.a;
        b bVar = this.b;
        switch (i2) {
            case 0:
                bVar.d(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                break;
            default:
                bVar.d(new CameraControl$OperationCanceledException("Camera is closed"));
                break;
        }
    }

    @Override // defpackage.uo7
    public final void b(int i, ap7 ap7Var) {
        int i2 = this.a;
        b bVar = this.b;
        switch (i2) {
            case 0:
                bVar.b(null);
                break;
            default:
                sgb1.g(3, "FocusMeteringControl");
                bVar.b(null);
                break;
        }
    }

    @Override // defpackage.uo7
    public final void c(int i, final xo7 xo7Var) {
        int i2 = this.a;
        b bVar = this.b;
        switch (i2) {
            case 0:
                bVar.d(new ImageCaptureException(2, "Capture request failed with reason " + xo7Var.a, null));
                break;
            default:
                bVar.d(new Exception(xo7Var) { // from class: androidx.camera.core.impl.CameraControlInternal$CameraControlException
                    private xo7 mCameraCaptureFailure;

                    {
                        this.mCameraCaptureFailure = xo7Var;
                    }
                });
                break;
        }
    }
}
