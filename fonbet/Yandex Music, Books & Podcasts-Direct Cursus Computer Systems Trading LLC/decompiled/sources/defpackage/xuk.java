package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class xuk {
    public final cvk a;

    public xuk(Context context, tuk tukVar, e0j e0jVar, uuk uukVar, wuk wukVar, usr usrVar, z2b z2bVar, u9w u9wVar, lib libVar) {
        cvk cvkVar = new cvk();
        dvk dvkVar = new dvk(context, tukVar, e0jVar, u9wVar, uukVar, wukVar, libVar, usrVar, z2bVar, 0);
        if (cvkVar.a != null) {
            xq0.q("Di already initialized");
            throw null;
        }
        o18 o18Var = new o18();
        o18Var.c = hag.I(cvk.class);
        rp7 rp7Var = o18Var.b;
        rp7Var.getClass();
        rp7Var.C(cvkVar);
        dvkVar.invoke(o18Var);
        cvkVar.a = new qdc(new ix6(o18Var.a));
        this.a = cvkVar;
    }
}
