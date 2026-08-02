package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class jsk {
    public boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(jsk jskVar, ksk kskVar) {
        jskVar.getClass();
        if (kskVar instanceof vei) {
            ((vei) kskVar).o(jskVar.a);
        }
    }

    public static void f(jsk jskVar, ksk kskVar, long j) {
        jskVar.getClass();
        a(jskVar, kskVar);
        kskVar.r0(wpe.d(j, kskVar.e), 0.0f, null);
    }

    public static void g(jsk jskVar, ksk kskVar, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (jskVar.b() == xof.a || jskVar.c() == 0) {
            a(jskVar, kskVar);
            kskVar.r0(wpe.d(j, kskVar.e), 0.0f, null);
        } else {
            int c = (jskVar.c() - kskVar.a) - ((int) (j >> 32));
            a(jskVar, kskVar);
            kskVar.r0(wpe.d((c << 32) | (((int) (j & 4294967295L)) & 4294967295L), kskVar.e), 0.0f, null);
        }
    }

    public static void h(jsk jskVar, ksk kskVar, long j) {
        if (jskVar.b() == xof.a || jskVar.c() == 0) {
            a(jskVar, kskVar);
            kskVar.r0(wpe.d(j, kskVar.e), 0.0f, null);
        } else {
            int c = (jskVar.c() - kskVar.a) - ((int) (j >> 32));
            a(jskVar, kskVar);
            kskVar.r0(wpe.d((((int) (j & 4294967295L)) & 4294967295L) | (c << 32), kskVar.e), 0.0f, null);
        }
    }

    public static /* synthetic */ void j(jsk jskVar, ksk kskVar, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = lsk.b;
            function1 = kzj.x0;
        }
        jskVar.i(kskVar, i, i2, 0.0f, function1);
    }

    public static void k(jsk jskVar, ksk kskVar, long j) {
        int i = lsk.b;
        kzj kzjVar = kzj.x0;
        if (jskVar.b() == xof.a || jskVar.c() == 0) {
            a(jskVar, kskVar);
            kskVar.r0(wpe.d(j, kskVar.e), 0.0f, kzjVar);
        } else {
            int c = (jskVar.c() - kskVar.a) - ((int) (j >> 32));
            a(jskVar, kskVar);
            kskVar.r0(wpe.d((((int) (j & 4294967295L)) & 4294967295L) | (c << 32), kskVar.e), 0.0f, kzjVar);
        }
    }

    public static void l(jsk jskVar, ksk kskVar, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = lsk.b;
            function1 = kzj.x0;
        }
        jskVar.getClass();
        a(jskVar, kskVar);
        kskVar.r0(wpe.d((i2 & 4294967295L) | (i << 32), kskVar.e), 0.0f, function1);
    }

    public static void m(jsk jskVar, ksk kskVar, long j) {
        int i = lsk.b;
        kzj kzjVar = kzj.x0;
        jskVar.getClass();
        a(jskVar, kskVar);
        kskVar.r0(wpe.d(j, kskVar.e), 0.0f, kzjVar);
    }

    public abstract xof b();

    public abstract int c();

    public final void d(ksk kskVar, int i, int i2, float f) {
        a(this, kskVar);
        kskVar.r0(wpe.d((i2 & 4294967295L) | (i << 32), kskVar.e), f, null);
    }

    public final void i(ksk kskVar, int i, int i2, float f, Function1 function1) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (b() == xof.a || c() == 0) {
            a(this, kskVar);
            kskVar.r0(wpe.d(j, kskVar.e), f, function1);
        } else {
            int c = (c() - kskVar.a) - ((int) (j >> 32));
            a(this, kskVar);
            kskVar.r0(wpe.d((c << 32) | (((int) (j & 4294967295L)) & 4294967295L), kskVar.e), f, function1);
        }
    }
}
