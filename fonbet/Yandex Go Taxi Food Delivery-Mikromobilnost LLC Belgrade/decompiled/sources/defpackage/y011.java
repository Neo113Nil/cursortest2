package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import java.util.List;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class y011 extends g6a0 {
    public final d111 b;
    public final PaymentOptionState c;
    public final DividerType d;
    public final boolean e;
    public final cf70 f;
    public final CharSequence g;
    public final c6a0 h;

    public y011(d111 d111Var, PaymentOptionState paymentOptionState, DividerType dividerType, boolean z, boolean z2, cf70 cf70Var, List list, CharSequence charSequence, c6a0 c6a0Var, t0a0 t0a0Var, boolean z3) {
        super(new fvc(new Object[]{d111Var, paymentOptionState, dividerType, Boolean.valueOf(z), Boolean.valueOf(z2), cf70Var, list, Boolean.valueOf(z3), c6a0Var, charSequence, t0a0Var}));
        this.b = d111Var;
        this.c = paymentOptionState;
        this.d = dividerType;
        this.e = z2;
        this.f = cf70Var;
        this.g = charSequence;
        this.h = c6a0Var;
    }

    public final PaymentOptionState c() {
        return this.c;
    }

    public final cf70 m() {
        return this.f;
    }
}
