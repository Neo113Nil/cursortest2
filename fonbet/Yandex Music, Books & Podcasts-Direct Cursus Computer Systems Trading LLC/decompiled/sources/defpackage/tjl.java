package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class tjl implements eym, unj, m7t {
    public static void b(cko ckoVar, Object obj) {
        int i;
        t4w t4wVar = (t4w) obj;
        ckoVar.getClass();
        String str = t4wVar.a;
        int i2 = 1;
        ckoVar.E(1, str);
        ckoVar.bindLong(2, ezf.P(t4wVar.b));
        ckoVar.E(3, t4wVar.c);
        ckoVar.E(4, t4wVar.d);
        q97 q97Var = q97.b;
        ckoVar.bindBlob(5, cxb.l0(t4wVar.e));
        ckoVar.bindBlob(6, cxb.l0(t4wVar.f));
        ckoVar.bindLong(7, t4wVar.g);
        ckoVar.bindLong(8, t4wVar.h);
        ckoVar.bindLong(9, t4wVar.i);
        ckoVar.bindLong(10, t4wVar.k);
        bk2 bk2Var = t4wVar.l;
        bk2Var.getClass();
        int ordinal = bk2Var.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            i = 1;
        }
        ckoVar.bindLong(11, i);
        ckoVar.bindLong(12, t4wVar.m);
        ckoVar.bindLong(13, t4wVar.n);
        ckoVar.bindLong(14, t4wVar.o);
        ckoVar.bindLong(15, t4wVar.p);
        ckoVar.bindLong(16, t4wVar.q ? 1L : 0L);
        nxj nxjVar = t4wVar.r;
        nxjVar.getClass();
        int ordinal2 = nxjVar.ordinal();
        if (ordinal2 == 0) {
            i2 = 0;
        } else if (ordinal2 != 1) {
            b6e.s();
            return;
        }
        ckoVar.bindLong(17, i2);
        ckoVar.bindLong(18, t4wVar.s);
        ckoVar.bindLong(19, t4wVar.t);
        ckoVar.bindLong(20, t4wVar.u);
        ckoVar.bindLong(21, t4wVar.v);
        ckoVar.bindLong(22, t4wVar.w);
        String str2 = t4wVar.x;
        if (str2 == null) {
            ckoVar.bindNull(23);
        } else {
            ckoVar.E(23, str2);
        }
        Boolean bool = t4wVar.y;
        if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
            ckoVar.bindNull(24);
        } else {
            ckoVar.bindLong(24, r1.intValue());
        }
        fa6 fa6Var = t4wVar.j;
        ckoVar.bindLong(25, ezf.K(fa6Var.a));
        ckoVar.bindBlob(26, ezf.C(fa6Var.b));
        ckoVar.bindLong(27, fa6Var.c ? 1L : 0L);
        ckoVar.bindLong(28, fa6Var.d ? 1L : 0L);
        ckoVar.bindLong(29, fa6Var.e ? 1L : 0L);
        ckoVar.bindLong(30, fa6Var.f ? 1L : 0L);
        ckoVar.bindLong(31, fa6Var.g);
        ckoVar.bindLong(32, fa6Var.h);
        ckoVar.bindBlob(33, ezf.O(fa6Var.i));
        ckoVar.E(34, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [gfu] */
    public static bnd h(kfu kfuVar, mt7 mt7Var, int i) {
        mt7 mt7Var2 = mt7Var;
        if ((i & 2) != 0) {
            kfuVar.getClass();
            mt7Var2 = kfuVar instanceof ssd ? ((ssd) kfuVar).getDefaultViewModelProviderFactory() : mt7.b;
        }
        kfuVar.getClass();
        is6 defaultViewModelCreationExtras = kfuVar instanceof ssd ? ((ssd) kfuVar).getDefaultViewModelCreationExtras() : gs6.b;
        kfuVar.getClass();
        mt7Var2.getClass();
        defaultViewModelCreationExtras.getClass();
        return new bnd(kfuVar.getViewModelStore(), mt7Var2, defaultViewModelCreationExtras);
    }

    @Override // defpackage.eym
    public ja8 a(szb szbVar, Function0 function0) {
        return ja8.b0;
    }

    @Override // defpackage.m7t
    public Object apply(Object obj) {
        return ((fgx) obj).b();
    }

    @Override // defpackage.unj
    public long c(s2c s2cVar) {
        return -1L;
    }

    @Override // defpackage.eym
    public Object d(szb szbVar) {
        return new Object();
    }

    @Override // defpackage.unj
    public fap e() {
        return new zg2(-9223372036854775807L);
    }

    public String i(z77 z77Var) {
        z77Var.getClass();
        return z77Var instanceof ydb ? "https://egw.home-gateway.plus.tst.yandex.net" : "https://egw.home-gateway.plus.yandex.net";
    }

    @Override // defpackage.unj
    public void g(long j) {
    }

    @Override // defpackage.eym
    public void f(String str, String str2, List list, Object obj) {
    }
}
