package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dbs {
    public final axf a;
    public final qbs b;
    public final ybs c;
    public final boolean d;
    public final boolean e;
    public final pds f;
    public final mnj g;
    public final mit h;
    public final ae7 i;
    public final bs4 j;
    public final Function1 k;
    public final int l;

    public dbs(axf axfVar, qbs qbsVar, ybs ybsVar, boolean z, boolean z2, pds pdsVar, mnj mnjVar, mit mitVar, ae7 ae7Var, Function1 function1, int i) {
        bs4 bs4Var = ox6.h;
        this.a = axfVar;
        this.b = qbsVar;
        this.c = ybsVar;
        this.d = z;
        this.e = z2;
        this.f = pdsVar;
        this.g = mnjVar;
        this.h = mitVar;
        this.i = ae7Var;
        this.j = bs4Var;
        this.k = function1;
        this.l = i;
    }

    public final void a(List list) {
        pt0 pt0Var = this.a.d;
        ArrayList y0 = CollectionsKt.y0(list);
        y0.add(0, new sdc());
        this.k.invoke(pt0Var.l(y0));
    }
}
