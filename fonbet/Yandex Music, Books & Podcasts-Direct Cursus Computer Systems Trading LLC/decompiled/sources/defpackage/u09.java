package defpackage;

import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class u09 extends lr8 {
    public final e23 l;
    public final hp8 m;
    public final p0a n;
    public int o;
    public int p;
    public float q;
    public final WeakHashMap r;
    public long s;

    public u09(List list, e23 e23Var, hp8 hp8Var, p0a p0aVar, pm9 pm9Var) {
        super(e23Var, pm9Var, list);
        this.l = e23Var;
        this.m = hp8Var;
        this.n = p0aVar;
        this.p = 1;
        this.r = new WeakHashMap();
        s(true);
    }

    @Override // defpackage.qon
    public final long d(int i) {
        k79 k79Var = (k79) u().get(i);
        WeakHashMap weakHashMap = this.r;
        Long l = (Long) weakHashMap.get(k79Var);
        if (l != null) {
            return l.longValue();
        }
        long j = this.s;
        this.s = 1 + j;
        weakHashMap.put(k79Var, Long.valueOf(j));
        return j;
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        e23 e23Var = this.l;
        z09 z09Var = new z09(e23Var.a.getContext$div_release());
        z09Var.setOrientation(new t09(this, 0));
        z09Var.setColumnCount(new t09(this, 1));
        z09Var.setCrossSpacing(new t09(this, 2));
        return new g19(e23Var, z09Var, this.m, this.n);
    }
}
