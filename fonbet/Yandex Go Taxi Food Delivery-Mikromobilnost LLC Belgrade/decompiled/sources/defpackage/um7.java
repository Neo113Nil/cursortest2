package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.b;

/* loaded from: classes10.dex */
public final class um7 implements bn7 {
    public final b a;
    public boolean b = false;

    public um7(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.bn7
    public final euy a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int intValue;
        hiv f = ni91.f(Boolean.TRUE);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
            sgb1.g(3, "Camera2CapturePipeline");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                sgb1.g(3, "Camera2CapturePipeline");
                this.b = true;
                this.a.h.g(false);
            }
        }
        return f;
    }

    @Override // defpackage.bn7
    public final boolean b() {
        return true;
    }

    @Override // defpackage.bn7
    public final void c() {
        if (this.b) {
            sgb1.g(3, "Camera2CapturePipeline");
            this.a.h.a(true, false);
        }
    }
}
