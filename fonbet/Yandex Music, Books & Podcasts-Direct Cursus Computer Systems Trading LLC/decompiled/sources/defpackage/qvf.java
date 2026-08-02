package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qvf implements koo, hoo {
    public final loo a;
    public final ioo b;
    public final upi c;

    public qvf(koo kooVar, Map map, ioo iooVar) {
        kma kmaVar = new kma(28, kooVar);
        agr agrVar = moo.a;
        this.a = new loo(map, kmaVar);
        this.b = iooVar;
        int i = xso.a;
        this.c = new upi();
    }

    @Override // defpackage.koo
    public final joo a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // defpackage.hoo
    public final void b(Object obj, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-697180401);
        this.b.b(obj, wn5Var, oq5Var, i & 126);
        boolean h = oq5Var.h(this) | oq5Var.h(obj);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new sea(26, this, obj);
            oq5Var.k0(K);
        }
        gld.k(obj, (Function1) K, oq5Var);
        oq5Var.p(false);
    }

    @Override // defpackage.koo
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.koo
    public final Map d() {
        upi upiVar = this.c;
        Object[] objArr = upiVar.b;
        long[] jArr = upiVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            ioo iooVar = this.b;
                            if (iooVar.b.k(obj) == null) {
                                iooVar.a.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.a.d();
    }

    @Override // defpackage.koo
    public final Object e(String str) {
        return this.a.e(str);
    }
}
