package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class y7l {
    public static final gx0 o = new gx0(2);
    public final Context a;
    public final lis b = new lis(1);
    public final x7l c;
    public final SparseArray d;
    public final qsn e;
    public final tyi f;
    public final dzr g;
    public final CopyOnWriteArraySet h;
    public hzr i;
    public Pair j;
    public int k;
    public long l;
    public long m;
    public int n;

    public y7l(d18 d18Var) {
        this.a = (Context) d18Var.b;
        x7l x7lVar = (x7l) d18Var.e;
        vq1.B(x7lVar);
        this.c = x7lVar;
        this.d = new SparseArray();
        this.e = (qsn) d18Var.f;
        dzr dzrVar = (dzr) d18Var.h;
        this.g = dzrVar;
        this.f = new tyi((dbu) d18Var.c, dzrVar);
        this.h = new CopyOnWriteArraySet();
        new bsc().a();
        this.l = -9223372036854775807L;
        this.n = -1;
        this.k = 0;
    }
}
