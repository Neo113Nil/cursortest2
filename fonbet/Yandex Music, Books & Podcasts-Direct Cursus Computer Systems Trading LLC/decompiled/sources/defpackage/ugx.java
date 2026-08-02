package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ugx extends jmx {
    private static final ugx zzb;
    private int zzd;
    private ygx zze;
    private ejx zzf;
    private rmx zzg = inx.d;
    private pmx zzh = kmx.d;

    static {
        ugx ugxVar = new ugx();
        zzb = ugxVar;
        jmx.f(ugx.class, ugxVar);
    }

    public static tgx m() {
        return (tgx) zzb.k();
    }

    public static void n(ugx ugxVar, ArrayList arrayList) {
        List list = ugxVar.zzh;
        if (!((tlx) list).a) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            kmx kmxVar = (kmx) list;
            if (i < kmxVar.c) {
                e7o.e();
                return;
            }
            ugxVar.zzh = new kmx(Arrays.copyOf(kmxVar.b, i), kmxVar.c, true);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kmx) ugxVar.zzh).m(((rgx) it.next()).a);
        }
    }

    public static /* synthetic */ void o(ugx ugxVar, ygx ygxVar) {
        ugxVar.zze = ygxVar;
        ugxVar.zzd |= 1;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzd", "zze", "zzf", "zzg", cjx.class, "zzh", imp.n});
        }
        if (i2 == 3) {
            return new ugx();
        }
        if (i2 == 4) {
            return new tgx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
