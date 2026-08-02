package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import com.yandex.go.payments.paymentlist.ui.PlusOption$TrailMode;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes8.dex */
public final class u6d0 extends l6a0 implements e6v {
    public final PaymentOptionState b;
    public final DividerType c;
    public final boolean d;
    public final CharSequence e;
    public final cf70 f;
    public final boolean g;
    public final j4a0 h;
    public final t0a0 i;
    public final c6a0 j;
    public final h8b0 k;
    public final PlusOption$TrailMode l;
    public final boolean m;
    public final CharSequence n;
    public final CharSequence o;
    public final boolean p;

    public u6d0(PaymentOptionState paymentOptionState, DividerType dividerType, boolean z, CharSequence charSequence, cf70 cf70Var, boolean z2, j4a0 j4a0Var, t0a0 t0a0Var, c6a0 c6a0Var, h8b0 h8b0Var, PlusOption$TrailMode plusOption$TrailMode, boolean z3, String str, String str2) {
        super(new fvc(new Object[]{h8b0Var, paymentOptionState, dividerType, Boolean.valueOf(z), cf70Var, plusOption$TrailMode, Boolean.valueOf(z3), Boolean.TRUE, str, str2, Boolean.valueOf(z2), charSequence, t0a0Var, c6a0Var}));
        this.b = paymentOptionState;
        this.c = dividerType;
        this.d = z;
        this.e = charSequence;
        this.f = cf70Var;
        this.g = z2;
        this.h = j4a0Var;
        this.i = t0a0Var;
        this.j = c6a0Var;
        this.k = h8b0Var;
        this.l = plusOption$TrailMode;
        this.m = z3;
        this.n = str;
        this.o = str2;
        this.p = paymentOptionState == PaymentOptionState.SELECTED;
    }

    @Override // defpackage.l6a0
    public final j4a0 c() {
        return this.h;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.k.a;
    }

    @Override // defpackage.l6a0
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // defpackage.l6a0
    public final DividerType m() {
        return this.c;
    }

    @Override // defpackage.l6a0
    public final t0a0 n() {
        return this.i;
    }

    @Override // defpackage.l6a0
    public final boolean v() {
        return this.g;
    }

    @Override // defpackage.l6a0
    public final boolean w() {
        return this.d;
    }

    @Override // defpackage.l6a0
    public final PaymentOptionState x() {
        return this.b;
    }

    @Override // defpackage.l6a0
    public final cf70 y() {
        return this.f;
    }

    @Override // defpackage.l6a0
    public final boolean z() {
        return false;
    }
}
