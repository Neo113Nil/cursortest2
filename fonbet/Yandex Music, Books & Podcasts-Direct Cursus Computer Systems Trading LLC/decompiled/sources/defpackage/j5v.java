package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class j5v {
    public final jyr a;
    public final chn b;
    public final ime c;
    public final jyr d;

    public j5v() {
        l18 l18Var = l18.b;
        this.a = l18Var.b(hag.I(vyk.class), true);
        this.b = new chn();
        bdt I = hag.I(z5l.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        z5l z5lVar = (z5l) qdcVar.C(I);
        bdt I2 = hag.I(Context.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.c = new ime(z5lVar, (Context) qdcVar2.C(I2));
        this.d = l18Var.b(hag.I(lwc.class), true);
    }

    public final boolean a() {
        return !((((lwc) this.d.getValue()).b.a() ? hni.a : ini.a) instanceof hni);
    }
}
