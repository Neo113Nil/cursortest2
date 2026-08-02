package defpackage;

import com.yandex.go.overdraft.data.model.TapAction$OpenRidesHistoryAction;
import com.yandex.go.overdraft.data.model.TapAction$OpenSBPAction;
import com.yandex.go.overdraft.data.model.TapAction$OpenUrlAction;
import com.yandex.go.overdraft.data.model.TapAction$PayDebtAction;
import com.yandex.go.overdraft.data.model.TapAction$SwitchPaymentMethodAction;
import com.yandex.go.overdraft.data.model.f0;
import com.yandex.go.overdraft.data.model.g0;
import com.yandex.go.overdraft.data.model.h0;
import com.yandex.go.overdraft.data.model.i0;
import com.yandex.go.overdraft.data.model.j0;
import com.yandex.go.overdraft.data.model.o0;
import com.yandex.go.overdraft.data.model.q0;
import com.yandex.go.overdraft.data.model.r0;
import com.yandex.go.overdraft.data.model.s0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class u9x0 extends xqt {
    public static final u9x0 e = new u9x0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s0.INSTANCE.serializer(), qoi0.a(s0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_debt_info", h0.INSTANCE.serializer(), qoi0.a(h0.class)), new f9("switch_payment_method_and_open_summary", TapAction$SwitchPaymentMethodAction.Companion.serializer(), qoi0.a(TapAction$SwitchPaymentMethodAction.class)), new f9("top_up_yandex_card", q0.INSTANCE.serializer(), qoi0.a(q0.class)), new f9("top_up_yango_pay", r0.INSTANCE.serializer(), qoi0.a(r0.class)), new f9("open_payment_methods_to_pay_debt", i0.INSTANCE.serializer(), qoi0.a(i0.class)), new f9("open_payment_methods", j0.INSTANCE.serializer(), qoi0.a(j0.class)), new f9("plus_toggle", o0.INSTANCE.serializer(), qoi0.a(o0.class)), new f9("close", f0.INSTANCE.serializer(), qoi0.a(f0.class)), new f9("open_history", TapAction$OpenRidesHistoryAction.Companion.serializer(), qoi0.a(TapAction$OpenRidesHistoryAction.class)), new f9("pay_debt", TapAction$PayDebtAction.Companion.serializer(), qoi0.a(TapAction$PayDebtAction.class)), new f9("open_sbp", TapAction$OpenSBPAction.Companion.serializer(), qoi0.a(TapAction$OpenSBPAction.class)), new f9("open_url", TapAction$OpenUrlAction.Companion.serializer(), qoi0.a(TapAction$OpenUrlAction.class)), new f9("continue_create_order", g0.INSTANCE.serializer(), qoi0.a(g0.class)));
    }
}
