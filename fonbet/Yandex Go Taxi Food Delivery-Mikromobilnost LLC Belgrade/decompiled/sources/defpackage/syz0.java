package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class syz0 {
    public final boolean a;

    public syz0() {
        this.a = xbj.a.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public static s38 a(s38 s38Var) {
        r38 r38Var = new r38();
        r38Var.c = s38Var.c;
        Iterator it = Collections.unmodifiableList(s38Var.a).iterator();
        while (it.hasNext()) {
            r38Var.d((DeferrableSurface) it.next());
        }
        r38Var.c(s38Var.b);
        vn7 vn7Var = new vn7();
        vn7Var.b(CaptureRequest.FLASH_MODE, 0);
        r38Var.c(vn7Var.a());
        return r38Var.e();
    }

    public final boolean b(ArrayList arrayList, boolean z) {
        if (!this.a || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
