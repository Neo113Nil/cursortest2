package defpackage;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzng;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class sp91 implements ga91, fan {
    public static final /* synthetic */ sp91 b = new sp91(0);
    public static final /* synthetic */ sp91 c = new sp91(1);
    public static final /* synthetic */ sp91 w = new sp91(2);
    public static final /* synthetic */ sp91 x = new sp91(3);
    public static final /* synthetic */ sp91 y = new sp91(4);
    public final /* synthetic */ int a;

    public /* synthetic */ sp91(int i) {
        this.a = i;
    }

    public static final zzng a(Object obj, Object obj2) {
        zzng zzngVar = (zzng) obj;
        zzng zzngVar2 = (zzng) obj2;
        if (!zzngVar2.isEmpty()) {
            if (!zzngVar.c()) {
                zzngVar = zzngVar.a();
            }
            zzngVar.g();
            if (!zzngVar2.isEmpty()) {
                zzngVar.putAll(zzngVar2);
            }
        }
        return zzngVar;
    }

    @Override // defpackage.fan
    public ean b(Context context, String str, dan danVar) {
        ean eanVar = new ean();
        eanVar.a = danVar.i(context, str);
        int i = 1;
        int v = danVar.v(context, str, true);
        eanVar.b = v;
        int i2 = eanVar.a;
        if (i2 == 0) {
            i2 = 0;
            if (v == 0) {
                i = 0;
                eanVar.c = i;
                return eanVar;
            }
        }
        if (i2 >= v) {
            i = -1;
        }
        eanVar.c = i;
        return eanVar;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 0:
                List list = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.i0.b()).longValue());
            case 1:
                List list2 = nw91.a;
                ((yeb1) reb1.b.a.get()).getClass();
                Boolean bool = (Boolean) yeb1.a.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.m0.b()).longValue());
            case 3:
                List list4 = nw91.a;
                ((aeb1) sdb1.b.a.get()).getClass();
                Boolean bool2 = (Boolean) aeb1.b.b();
                bool2.getClass();
                return bool2;
            default:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.a.b();
                l.getClass();
                return l;
        }
    }
}
