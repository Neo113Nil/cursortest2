package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.g;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class yo8 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        vo8 uo8Var;
        vo8 vo8Var;
        ro8 ro8Var = (ro8) obj;
        po8 po8Var = ro8Var.a;
        if (po8Var.equals(msb1.B)) {
            vo8Var = qtb1.y;
        } else {
            if (po8Var instanceof qo8) {
                uo8Var = new wo8(((qo8) po8Var).a);
            } else {
                if (!(po8Var instanceof oo8)) {
                    w511.b();
                    return null;
                }
                Throwable th = ((oo8) po8Var).a;
                BottomSheetDialogView.State.a aVar = new BottomSheetDialogView.State.a(gao.f(th, gao.a), gao.b(th, gao.b), new g(gao.c(th), BottomSheetDialogView.State.ImageScale.FIT_CENTER, null, null, 28), null, Integer.valueOf(kp50.r(41)), Integer.valueOf(ModuleDescriptor.MODULE_VERSION), 72);
                Text.Resource resource = gao.c;
                if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
                    resource = gao.f;
                } else {
                    boolean z = th instanceof FailDataException;
                }
                uo8Var = new uo8(new BottomSheetDialogView.State(aVar, new YbButtonView.a(resource, null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068));
            }
            vo8Var = uo8Var;
        }
        return new xo8(ro8Var.b, vo8Var);
    }
}
