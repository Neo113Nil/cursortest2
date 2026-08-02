package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class sea0 implements rea0 {
    public final eq51 a;
    public final bia0 b;
    public final se8 c;

    public sea0(eq51 eq51Var, bia0 bia0Var, se8 se8Var) {
        this.a = eq51Var;
        this.b = bia0Var;
        this.c = se8Var;
    }

    public final String a(Context context, lea0 lea0Var) {
        if (lea0Var == null) {
            return "";
        }
        if (lea0Var instanceof fl8) {
            fl8 fl8Var = (fl8) lea0Var;
            return g8e.p(this.c.c(fl8Var.e), " ", se8.a(fl8Var.d));
        }
        if (lea0Var instanceof t19) {
            return ((t19) lea0Var).c;
        }
        boolean z = lea0Var instanceof u19;
        bia0 bia0Var = this.b;
        if (z) {
            ((qy90) bia0Var).getClass();
            return context.getString(kyh0.paymentmethod_cash_nominative);
        }
        if (lea0Var instanceof wxc) {
            return "";
        }
        if (lea0Var instanceof jve) {
            return ((jve) lea0Var).c;
        }
        if (lea0Var instanceof yhi) {
            return ((yhi) lea0Var).c.c;
        }
        if (lea0Var instanceof ivt) {
            ((qy90) bia0Var).getClass();
            return context.getString(kyh0.google_pay);
        }
        if (lea0Var instanceof a000) {
            return ((a000) lea0Var).d;
        }
        if (lea0Var instanceof h8b0) {
            return ((h8b0) lea0Var).c;
        }
        if (lea0Var instanceof bjm0) {
            return ((bjm0) lea0Var).f;
        }
        if (lea0Var instanceof ep51) {
            return ((ep51) lea0Var).d;
        }
        if (lea0Var instanceof um50) {
            return ((um50) lea0Var).d;
        }
        if (lea0Var instanceof cfm0) {
            return ((cfm0) lea0Var).c;
        }
        if (lea0Var instanceof qgx) {
            return ((qgx) lea0Var).c;
        }
        if (lea0Var instanceof p1c) {
            return ((p1c) lea0Var).c;
        }
        if (lea0Var instanceof vbn) {
            return ((vbn) lea0Var).d;
        }
        if (lea0Var instanceof v7x) {
            return ((v7x) lea0Var).d;
        }
        if (lea0Var instanceof mcp) {
            return ((mcp) lea0Var).d;
        }
        if (lea0Var instanceof snr0) {
            return ((snr0) lea0Var).h.a;
        }
        if (lea0Var instanceof d111) {
            return ((d111) lea0Var).e;
        }
        if (lea0Var instanceof yy51) {
            return this.a.a((yy51) lea0Var).b;
        }
        if (lea0Var instanceof jo51) {
            jo51 jo51Var = (jo51) lea0Var;
            return (!(jo51Var instanceof yo51) && (jo51Var instanceof wo51)) ? ((wo51) jo51Var).c : "";
        }
        if (lea0Var instanceof h211) {
            return ((h211) lea0Var).d;
        }
        w511.b();
        return null;
    }
}
