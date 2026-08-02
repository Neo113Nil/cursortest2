package defpackage;

import android.net.Uri;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class z35 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ z35(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                break;
            case 1:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, f65.class).D(new z35(i));
                o18Var.b(hag.I(c65.class)).E(new z35(3));
                o18Var.b(hag.I(n65.class)).D(new z35(4));
                o18Var.b(hag.I(m65.class)).E(new z35(5));
                break;
            case 2:
                ((l13) obj).getClass();
                break;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                break;
            case 4:
                ((l13) obj).getClass();
                break;
            case 5:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                break;
            case 6:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                break;
            case 7:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.e(jfpVar2);
                break;
            case 8:
                ((String) obj).getClass();
                break;
            case 9:
                vjg vjgVar = (vjg) obj;
                if (vjgVar != null && (r8 = vjgVar.a) != null) {
                    break;
                }
                break;
            case 10:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.t(jfpVar3, "collection_wave_onboarding_image");
                break;
            case 11:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    xh5 xh5Var = (xh5) CollectionsKt.firstOrNull((List) entry.getValue());
                    linkedHashMap.put(key, xh5Var != null ? new mk5(xh5Var.a().b) : null);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object value = entry2.getValue();
                    if (value != null) {
                        linkedHashMap2.put(entry2.getKey(), value);
                    }
                }
                break;
            case 12:
                Map map2 = (Map) obj;
                map2.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(map2.size()));
                for (Map.Entry entry3 : map2.entrySet()) {
                    Object key2 = entry3.getKey();
                    Iterator it = ((List) entry3.getValue()).iterator();
                    linkedHashMap3.put(key2, it.hasNext() ? new mk5(((mte) it.next()).getMeta().getHasTabDot()) : null);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    Object value2 = entry4.getValue();
                    if (value2 != null) {
                        linkedHashMap4.put(entry4.getKey(), value2);
                    }
                }
                break;
            case 13:
                Map.Entry entry5 = (Map.Entry) obj;
                String str = (String) entry5.getKey();
                List list = (List) entry5.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof mh5) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str, (mh5) it2.next()));
                }
                break;
            case 14:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, dgj.class).E(new z35(15));
                o18Var2.b(hag.I(oh7.class)).D(new z35(16));
                o18Var2.b(hag.I(h7h.class)).D(new z35(17));
                o18Var2.b(hag.I(fqq.class)).D(new z35(18));
                break;
            case 15:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                jyr jyrVar = k3j.e;
                if (!ixf.x()) {
                    l13Var3.a.D(hag.I(pi5.class), l13Var3, l13Var3.b);
                }
                jyr b = l13Var3.b(hag.I(oi5.class), true);
                jyr b2 = l13Var3.b(hag.I(pi5.class), true);
                l18 l18Var = l18.b;
                bdt I = hag.I(bsr.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                break;
            case 16:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                break;
            case 17:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                break;
            case 18:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                break;
            case 19:
                ((Integer) obj).intValue();
                break;
            case 20:
                ((jfp) obj).getClass();
                break;
            case 21:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.e(jfpVar4);
                break;
            case 22:
                ((Uri) obj).getClass();
                break;
            case 23:
                ((v84) obj).getClass();
                break;
            case 24:
                ((Integer) obj).intValue();
                break;
            case 25:
                ((Integer) obj).intValue();
                break;
            case 26:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                break;
            case 27:
                ((nyn) obj).getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Boolean) obj).booleanValue();
                break;
            default:
                ((xgl) obj).getClass();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z35(int i, Object obj) {
        this.a = i;
    }
}
