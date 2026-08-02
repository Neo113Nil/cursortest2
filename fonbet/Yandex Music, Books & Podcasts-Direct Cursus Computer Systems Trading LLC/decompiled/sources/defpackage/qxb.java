package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class qxb implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qxb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        nrf nrfVar;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new pxb();
            case 1:
                ((l13) obj).getClass();
                return new sxb();
            case 2:
                ((l13) obj).getClass();
                return new mxb();
            case 3:
                ((l13) obj).getClass();
                return new txb();
            case 4:
                ((l13) obj).getClass();
                return new uxb();
            case 5:
                ((l13) obj).getClass();
                return new vxb();
            case 6:
                ((l13) obj).getClass();
                return new wxb();
            case 7:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                eyb eybVar = new eyb(new g06((Context) qdcVar.D(I, l13Var, set), (Integer) 24026391, jyb.b, (i0j) qdcVar.D(hag.I(i0j.class), l13Var, set)));
                byb bybVar = (byb) eybVar.h.getValue();
                ListIterator listIterator = ut0.a.listIterator(0);
                while (true) {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        return eybVar;
                    }
                    gxb gxbVar = (gxb) ezdVar.next();
                    bybVar.getClass();
                    gxbVar.getClass();
                    gxbVar.d = bybVar;
                    x3n x3nVar = bybVar.l;
                    Class<?> cls = gxbVar.getClass();
                    HashMap hashMap = (HashMap) x3nVar.b;
                    ReentrantLock reentrantLock = (ReentrantLock) x3nVar.a;
                    reentrantLock.lock();
                    try {
                        String str = gxbVar.c;
                        if (hashMap.containsKey(str)) {
                            throw new IllegalArgumentException(("Experiment " + str + " already registered").toString());
                        }
                        hashMap.put(str, gxbVar);
                        ((HashMap) x3nVar.c).put(cls, gxbVar);
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            case 8:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return (byb) ((eyb) l13Var2.a.D(hag.I(eyb.class), l13Var2, l13Var2.b)).h.getValue();
            case 9:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new hyb();
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                split$default = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null);
                return split$default;
            case 11:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() == 2);
            case 12:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, gzb.class).E(new qxb(13));
                o18Var.b(hag.I(ezb.class)).E(new qxb(14));
                o18Var.b(hag.I(wyb.class)).D(new qxb(15));
                return Unit.a;
            case 13:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new gzb((Context) l13Var4.a.D(hag.I(Context.class), l13Var4, l13Var4.b));
            case 14:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I2 = hag.I(frt.class);
                qdc qdcVar2 = l13Var5.a;
                Set set2 = l13Var5.b;
                return new ezb((frt) qdcVar2.D(I2, l13Var5, set2), (gzb) qdcVar2.D(hag.I(gzb.class), l13Var5, set2));
            case 15:
                return (wyb) vz1.l((l13) obj, ezb.class);
            case 16:
                ((ksk) obj).getClass();
                return Integer.valueOf((int) (r11.Z() * 0.86d));
            case 17:
                vz1.e((o18) obj, c2c.class).E(new qxb(18));
                return Unit.a;
            case 18:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new c2c((Context) l13Var6.a.D(hag.I(Context.class), l13Var6, l13Var6.b));
            case 19:
                vjg vjgVar = (vjg) obj;
                if (vjgVar == null || (nrfVar = vjgVar.a) == null) {
                    return null;
                }
                return new q5c(nrfVar, null);
            case 20:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.i(jfpVar, new ky4(1, -1));
                return Unit.a;
            case 21:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.f(jfpVar2);
                return Unit.a;
            case 22:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.f(jfpVar3);
                return Unit.a;
            case 23:
                ((jfp) obj).getClass();
                return Unit.a;
            case 24:
                vz1.e((o18) obj, ibc.class).E(new qxb(25));
                return Unit.a;
            case 25:
                ((l13) obj).getClass();
                return new ibc();
            case 26:
                xxq xxqVar = (xxq) obj;
                xxqVar.getClass();
                return xxqVar.a;
            case 27:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new bdc((ddc) l13Var7.a.D(hag.I(ddc.class), l13Var7, l13Var7.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ConcurrentHashMap();
            default:
                ((jsk) obj).getClass();
                return Unit.a;
        }
    }
}
