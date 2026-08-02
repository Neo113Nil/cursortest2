package defpackage;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class qqb {
    public final Context a;
    public final dzr b;
    public yqr c;
    public final yqr d;
    public final yqr e;
    public yqr f;
    public final yqr g;
    public final myc h;
    public Looper i;
    public final int j;
    public dv1 k;
    public boolean l;
    public int m;
    public int n;
    public final boolean o;
    public final hap p;
    public final long q;
    public final long r;
    public final long s;
    public bo7 t;
    public long u;
    public final long v;
    public boolean w;
    public boolean x;
    public final String y;

    public qqb(Context context, yqr yqrVar, yqr yqrVar2, yqr yqrVar3, yqr yqrVar4, yqr yqrVar5, myc mycVar) {
        context.getClass();
        this.a = context;
        this.c = yqrVar;
        this.d = yqrVar2;
        this.e = yqrVar3;
        this.f = yqrVar4;
        this.g = yqrVar5;
        this.h = mycVar;
        this.i = dvt.C();
        this.k = dv1.g;
        this.m = 0;
        this.n = 1;
        this.o = true;
        this.p = hap.e;
        this.q = 5000L;
        this.r = 15000L;
        this.s = 3000L;
        this.t = new bo7(0, dvt.Y(20L), dvt.Y(500L));
        this.b = dzr.a;
        this.u = 500L;
        this.v = 2000L;
        this.w = true;
        this.y = "";
        this.j = -1000;
        new fs7();
    }

    public final xrb a() {
        vq1.A(!this.x);
        this.x = true;
        return new xrb(this);
    }

    public qqb(Context context) {
        this(context, new qw1(context, 1), new qw1(context, 2), new qw1(context, 3), new eb7(2), new qw1(context, 4), new xla(24));
    }
}
