package defpackage;

import com.ybsdk.core.utils.text.Text;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class qh90 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        dqg dqgVar;
        ph90 ph90Var = (ph90) obj;
        Result result = ph90Var.c;
        if (result == null || !(result.getValue() instanceof Result.Failure)) {
            if (result != null) {
                Object value = result.getValue();
                if (value instanceof Result.Failure) {
                    value = null;
                }
                dqgVar = (dqg) value;
            } else {
                dqgVar = null;
            }
            if (!(dqgVar instanceof bqg)) {
                return ph90Var.a == null ? wh90.a : xh90.a;
            }
        }
        return new vh90(r501.a(Result.a(result.getValue()), unr0.h(Text.Companion, dzh0.ybsdk_common_error_layout_title), new Text.Resource(dzh0.ybsdk_common_error_try_again), new Text.Resource(dzh0.ybsdk_common_open_product_retry_button_title), new Text.Resource(dzh0.ybsdk_common_close), null, null, null, null, null, new nbv(txg0.ybsdk_ic_status_error, null), null, null, 63426));
    }
}
