package defpackage;

import com.yandex.go.payments.api.card.CardScrollMode;

/* loaded from: classes13.dex */
public final class s2p0 extends h55 {
    public final /* synthetic */ int D;
    public final yvf0 E;
    public final yvf0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2p0(yvf0 yvf0Var, yvf0 yvf0Var2, int i) {
        super(null);
        this.D = i;
        this.E = yvf0Var;
        this.F = yvf0Var2;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        int i2 = 1;
        yvf0 yvf0Var = this.E;
        switch (i) {
            case 0:
                r2p0 r2p0Var = (r2p0) obj;
                t2p0 t2p0Var = r2p0Var.a;
                String str = t2p0Var != null ? t2p0Var.a : null;
                String str2 = t2p0Var != null ? t2p0Var.b : null;
                String str3 = t2p0Var != null ? t2p0Var.c : null;
                String str4 = t2p0Var != null ? t2p0Var.d : null;
                String str5 = t2p0Var != null ? t2p0Var.e : null;
                String str6 = str;
                String str7 = str3;
                String str8 = str5;
                A((m950) yvf0Var.get(), new wpc(new dqc(str6, str2, str7, str4, str8, r2p0Var.b.getScreenName()), 2), new tva(this, r2p0Var, i2));
                break;
            default:
                A((m950) yvf0Var.get(), new gj8(new cj8(((b1p) obj).a), CardScrollMode.VERTICAL), new eb0(i2, this));
                break;
        }
    }
}
