package defpackage;

import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class sxk {
    public static omk a(omk omkVar) {
        List<mmk> list = omkVar.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (mmk mmkVar : list) {
            arrayList.add(new mmk(b(mmkVar.a), mmkVar.b));
        }
        return new omk(omkVar.a, omkVar.b, arrayList, omkVar.d, omkVar.e, omkVar.f, omkVar.g, null, 128);
    }

    public static m3k b(m3k m3kVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4 = null;
        if (m3kVar instanceof m2k) {
            hsk hskVar = (hsk) m3kVar.d();
            List list = hskVar.y;
            if (list != null) {
                List list2 = list;
                arrayList3 = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(b((m3k) it.next()));
                }
            } else {
                arrayList3 = null;
            }
            return new m2k(hsk.B(hskVar, null, arrayList3, -16777217));
        }
        if (m3kVar instanceof k2k) {
            DivGallery divGallery = (DivGallery) m3kVar.d();
            List list3 = divGallery.u;
            if (list3 != null) {
                List list4 = list3;
                arrayList4 = new ArrayList(tcc.n(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(b((m3k) it2.next()));
                }
            }
            return new k2k(DivGallery.copy$default(divGallery, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 4095, null));
        }
        if (m3kVar instanceof q2k) {
            t1l t1lVar = (t1l) m3kVar.d();
            List list5 = t1lVar.t;
            if (list5 != null) {
                List list6 = list5;
                arrayList2 = new ArrayList(tcc.n(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(b((m3k) it3.next()));
                }
            } else {
                arrayList2 = null;
            }
            return new q2k(t1l.B(t1lVar, null, arrayList2, -524289));
        }
        boolean z = m3kVar instanceof i2k;
        Collection collection = EmptyList.a;
        if (z) {
            DivContainer divContainer = (DivContainer) m3kVar.d();
            List list7 = divContainer.B;
            if (list7 != null) {
                List list8 = list7;
                arrayList = new ArrayList(tcc.n(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList.add(b((m3k) it4.next()));
                }
            } else {
                arrayList = null;
            }
            Collection collection2 = divContainer.s;
            if (collection2 != null) {
                collection = collection2;
            }
            return new i2k(DivContainer.B(divContainer, a.o0(collection, new bpk("debug_show_actions_by_longtap", null)), null, arrayList, -134479873));
        }
        if (m3kVar instanceof x2k) {
            ffl fflVar = (ffl) m3kVar.d();
            Collection collection3 = fflVar.q;
            if (collection3 != null) {
                collection = collection3;
            }
            return new x2k(ffl.B(fflVar, a.o0(collection, new bpk("debug_show_actions_by_longtap", null)), null, -65537));
        }
        if (!(m3kVar instanceof n2k)) {
            return m3kVar;
        }
        psk pskVar = (psk) m3kVar.d();
        Collection collection4 = pskVar.s;
        if (collection4 != null) {
            collection = collection4;
        }
        return new n2k(psk.B(pskVar, a.o0(collection, new bpk("debug_show_actions_by_longtap", null)), null, -262145));
    }
}
