package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class rx2 {
    public final t a;
    public final rw2 b;
    public final lx2 c;
    public final qyf d;
    public final wnd e;
    public final sai f;

    public rx2(t tVar, rw2 rw2Var, lx2 lx2Var, qyf qyfVar) {
        rw2Var.getClass();
        lx2Var.getClass();
        this.a = tVar;
        this.b = rw2Var;
        this.c = lx2Var;
        this.d = qyfVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(hw2.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        l13 l13Var = ((hw2) qdcVar.C(I)).a;
        this.e = new wnd((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), (iw2) l13Var.a.D(hag.I(iw2.class), l13Var, l13Var.b));
        this.f = new sai(false);
    }

    public final void a() {
        ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Show dialog")));
        x97.y(this.d, dm6.b, null, new qx2(this, null, 1), 2);
    }
}
