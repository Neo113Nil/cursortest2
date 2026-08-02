package defpackage;

import android.os.Parcelable;
import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final class cus {
    public final rus a;
    public final i5h b;

    public cus() {
        bdt I = hag.I(rus.class);
        l18 l18Var = l18.b;
        this.a = (rus) l18Var.c(I);
        this.b = (i5h) l18Var.c(hag.I(i5h.class));
    }

    public static ArrayList a(cvl cvlVar) {
        cvlVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        bdt I2 = hag.I(i5h.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        List y = ((MainDatabase) ((i5h) qdcVar2.C(I2)).c(str)).M().y(cvlVar, null);
        ArrayList arrayList = new ArrayList(v75.o(y, 10));
        Iterator it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(q7g.T((h4m) it.next()));
        }
        return arrayList;
    }

    public static ArrayList b(String str, boolean z) {
        str.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str2 = ((frt) qdcVar.C(I)).c().a;
        str2.getClass();
        bdt I2 = hag.I(i5h.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        h2t S = ((MainDatabase) ((i5h) qdcVar2.C(I2)).c(str2)).S();
        S.getClass();
        List list = (List) up6.F(S.a, true, false, new ag3(str, z, 4));
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ig5 ig5Var = ((i2t) obj).a;
            Pair pair = new Pair(ig5Var.a, ig5Var.F);
            Object obj2 = linkedHashMap.get(pair);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(pair, obj2);
            }
            ((List) obj2).add(obj);
        }
        Collection<List> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(v75.o(values, 10));
        for (List list2 : values) {
            i2t i2tVar = (i2t) CollectionsKt.Q(list2);
            List<i2t> list3 = list2;
            ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
            for (i2t i2tVar2 : list3) {
                String str3 = i2tVar2.b;
                String str4 = i2tVar2.c;
                boolean z2 = i2tVar2.d;
                String str5 = i2tVar2.e;
                WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                CoverPath x = men.x(str5, webPath$Storage);
                CoverPath x2 = men.x(i2tVar2.f, webPath$Storage);
                List B = q7g.B(i2tVar2.g);
                B.getClass();
                arrayList2.add(new c01(str3, str4, z2, false, null, 0, null, x, x2, B, null, false, 54264));
            }
            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                c01 c01Var = (c01) it.next();
                Parcelable.Creator<zp2> creator = zp2.CREATOR;
                arrayList3.add(vq2.E(c01Var));
            }
            arrayList.add(j66.u0(i2tVar.a, arrayList3, arrayList2, ezf.Q(i2tVar, arrayList3), 8));
        }
        return arrayList;
    }

    public final eno c(mqs mqsVar) {
        mqsVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        return this.b.f(str, new String[]{"playlist_track"}, new aa0(this, str, mqsVar, null, 11));
    }
}
