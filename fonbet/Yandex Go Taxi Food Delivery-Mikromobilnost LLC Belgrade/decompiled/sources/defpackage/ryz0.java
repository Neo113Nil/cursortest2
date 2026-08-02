package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.camera.camera2.internal.b;
import androidx.camera.core.CameraControl$OperationCanceledException;

/* loaded from: classes10.dex */
public final class ryz0 {
    public final b a;
    public final dy40 b;
    public final dy40 c;
    public final boolean d;
    public final androidx.camera.core.impl.utils.executor.b e;
    public boolean f;
    public final int g;
    public androidx.concurrent.futures.b h;
    public boolean i;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if ((r1 == null ? 1 : r1.intValue()) > 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ryz0(b bVar, ep7 ep7Var, androidx.camera.core.impl.utils.executor.b bVar2) {
        int i;
        Integer num;
        CameraCharacteristics.Key key;
        this.a = bVar;
        this.e = bVar2;
        boolean z = true;
        boolean d = dpa1.d(new qm7(ep7Var, 1));
        this.d = d;
        if (ep7Var.d() && (i = Build.VERSION.SDK_INT) >= 35) {
            if (!ep7Var.d() || i < 35) {
                num = null;
            } else {
                key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
                num = (Integer) ep7Var.a(key);
            }
        }
        z = false;
        int b = (d && z) ? ep7Var.b() : 0;
        this.g = b;
        this.b = new dy40(0);
        this.c = new dy40(Integer.valueOf(b));
        bVar.r(new im7() { // from class: qyz0
            @Override // defpackage.im7
            public final boolean b(TotalCaptureResult totalCaptureResult) {
                ryz0 ryz0Var = ryz0.this;
                if (ryz0Var.h != null) {
                    Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num2 != null && num2.intValue() == 2) == ryz0Var.i) {
                        ryz0Var.h.b(null);
                        ryz0Var.h = null;
                    }
                }
                return false;
            }
        });
    }

    public final void a(int i, androidx.concurrent.futures.b bVar) {
        if (!this.d) {
            if (bVar != null) {
                bVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f) {
            b(0);
            if (bVar != null) {
                bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.i = i != 0;
        this.a.t(i);
        b(i);
        androidx.concurrent.futures.b bVar2 = this.h;
        if (bVar2 != null) {
            bVar2.d(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
        }
        this.h = bVar;
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i != 1 ? 0 : 1);
        boolean d = tob1.d();
        dy40 dy40Var = this.b;
        if (d) {
            dy40Var.l(valueOf);
        } else {
            dy40Var.m(valueOf);
        }
    }
}
