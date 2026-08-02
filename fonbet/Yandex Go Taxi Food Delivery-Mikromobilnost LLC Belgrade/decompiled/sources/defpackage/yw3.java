package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class yw3 implements ev31 {
    public final Context a;

    public yw3(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        sw3 sw3Var = (sw3) obj;
        ug6 ug6Var = sw3Var.b;
        if (ug6Var instanceof rg6) {
            h5a0 h5a0Var = ((rg6) ug6Var).a;
            String id = h5a0Var != null ? h5a0Var.getId() : null;
            uda0 uda0Var = sw3Var.c;
            String str = sw3Var.a;
            return new xw3(new gh6(odq0.b(this.a, id, null, uda0Var, str != null ? g8e.i(Text.Companion, str) : null, 2), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_payment_method_select_action), null, null, null, null, null, null, false, false, null, 4094)));
        }
        if (jl40.l(ug6Var, sg6.a)) {
            return new xw3(new eh6(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_title), new Text.Resource(dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_description), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_deposit_deposit_sbp_enable_instruction_button_text), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068)));
        }
        if (ug6Var == null) {
            return new xw3(null);
        }
        w511.b();
        return null;
    }
}
