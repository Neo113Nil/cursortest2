package yads;

import android.content.Context;
import defpackage.a081;
import defpackage.bi61;
import defpackage.ga71;
import defpackage.gg81;
import defpackage.gm61;
import defpackage.id71;
import defpackage.jl40;
import defpackage.lml;
import defpackage.mml;
import defpackage.ntk;
import defpackage.plk;
import defpackage.q071;
import defpackage.qlk;
import defpackage.rs81;
import defpackage.sls;
import defpackage.tjk;
import defpackage.tp61;
import defpackage.ty61;
import defpackage.vp61;
import defpackage.vy71;
import defpackage.w671;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class gi0 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ bi61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(Context context, bi61 bi61Var) {
        super(0);
        this.b = context;
        this.c = bi61Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a081 a081Var;
        ntk ntkVar = new ntk(this.b);
        qlk qlkVar = new qlk(new plk[]{new tp61(), new ga71(), new w671(), new gm61(), new id71(), new q071()});
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(this.b);
        if (a != null) {
            ty61 ty61Var = a.J0;
            r3 = Boolean.valueOf((ty61Var != null ? ty61Var.a : null) != null);
        }
        boolean l = jl40.l(r3, Boolean.TRUE);
        Context context = this.b;
        lml mmlVar = l ? new mml(context) : new rs81(context);
        tjk tjkVar = new tjk(ntkVar);
        tjkVar.e = qlkVar;
        tjkVar.h = mmlVar;
        bi61 bi61Var = this.c;
        if (bi61Var != null) {
            tjkVar.b(new vp61(bi61Var));
        }
        tjkVar.b(new vy71());
        return tjkVar.a();
    }
}
