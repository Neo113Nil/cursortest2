package defpackage;

import android.webkit.WebView;
import com.yandex.music.shared.promo.data.AlbumPromoApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class u4 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ u4(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = 3;
        Object[] objArr = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                vz1.e((o18) obj, v4.class).E(new u4(i2));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return v4.a;
            case 2:
                vz1.e((o18) obj, v8s.class).E(new u4(i));
                return Unit.a;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new v8s(l13Var.b(hag.I(uaa.class), true));
            case 4:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                j3 j3Var = new j3(2);
                s9f[] s9fVarArr = wfp.a;
                jfpVar.o(hfp.d, new sa(null, j3Var));
                return Unit.a;
            case 5:
                ((jfp) obj).getClass();
                return Unit.a;
            case 6:
                ((WebView) obj).getClass();
                return Unit.a;
            case 7:
                Map map = (Map) obj;
                map.getClass();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!((mk5) entry.getValue()).a) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new zd((String) it.next()));
                }
                return arrayList2;
            case 8:
                Map map2 = (Map) obj;
                map2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (!((mk5) entry2.getValue()).a) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList3.add(str2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new zd((String) it2.next()));
                }
                return arrayList4;
            case 9:
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                ArrayList arrayList5 = new ArrayList(v75.o(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new fe((ie) it3.next()));
                }
                return arrayList5;
            case 10:
                List<ie> list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList6 = new ArrayList();
                for (ie ieVar : list3) {
                    String str3 = ieVar.a;
                    if (!ieVar.f) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        arrayList6.add(str3);
                    }
                }
                return arrayList6;
            case 11:
                ((mip) obj).l(ern.a(t7c.class), new qg(1));
                return Unit.a;
            case 12:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.e(jfpVar2);
                return Unit.a;
            case 13:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.e(jfpVar3);
                return Unit.a;
            case 14:
                bxl bxlVar = (bxl) obj;
                bxlVar.getClass();
                return bxlVar.a;
            case 15:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.q(jfpVar4, 0);
                return Unit.a;
            case 16:
                vz1.e((o18) obj, zb5.class).D(new u4(17));
                return Unit.a;
            case 17:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(oq7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new zb5((oq7) qdcVar.C(I));
            case 18:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 19:
                u51 u51Var2 = (u51) obj;
                u51Var2.getClass();
                return u51Var2.b;
            case 20:
                xxq xxqVar = (xxq) obj;
                xxqVar.getClass();
                return xxqVar.a;
            case 21:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return (AlbumPromoApi) ((e0j) l13Var2.a.D(hag.I(e0j.class), l13Var2, l13Var2.b)).a.b(AlbumPromoApi.class);
            case 22:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new ox((AlbumPromoApi) l13Var3.a.D(hag.I(AlbumPromoApi.class), l13Var3, l13Var3.b));
            case 23:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new ax(l13Var4.b(hag.I(ox.class), true));
            case 24:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new mx((e0j) l13Var5.a.D(hag.I(e0j.class), l13Var5, l13Var5.b));
            case 25:
                vz1.e((o18) obj, oz.class).D(new u4(26));
                return Unit.a;
            case 26:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new oz(l13Var6);
            case 27:
                r00 r00Var = (r00) obj;
                r00Var.getClass();
                ssg.a(3, "AlbumScreenViewModel", "New screen state: " + r00Var, null);
                if (r00Var instanceof m00) {
                    j = 0;
                } else if ((r00Var instanceof o00) || (r00Var instanceof p00) || (r00Var instanceof q00)) {
                    j = 200;
                } else {
                    if (!Intrinsics.d(r00Var, k00.a)) {
                        b6e.s();
                        return null;
                    }
                    j = 2000;
                }
                return Long.valueOf(j);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                u0j u0jVar = (u0j) obj;
                u0jVar.getClass();
                return Boolean.valueOf(u0jVar == u0j.a);
            default:
                vz1.e((o18) obj, b20.class).E(new u10(objArr == true ? 1 : 0));
                return Unit.a;
        }
    }
}
