package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.map.overlay.pickup.a;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes6.dex */
public final class wqb0 implements muw {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ wqb0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.muw
    public final ro00 a() {
        switch (this.a) {
        }
        return ro00.d;
    }

    @Override // defpackage.muw
    public final List b() {
        ro00 u;
        ro00 u2;
        ro00 u3;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                int j = (int) ((gh00) ((ah00) dVar.b)).j();
                Set<Map.Entry> entrySet = dVar.M.entrySet();
                ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
                for (Map.Entry entry : entrySet) {
                    ro00 ro00Var = ro00.d;
                    arrayList.add(vuz.u(Participant.PICKUP_POINT_BUBBLES_COLLECTION, ((a) entry.getValue()).h.e, ((a) entry.getValue()).k, j, ((wpb0) entry.getKey()).a, 480));
                }
                return arrayList;
            case 1:
                int j2 = (int) ((gh00) ((ah00) dVar.b)).j();
                Set<Map.Entry> entrySet2 = dVar.M.entrySet();
                ArrayList arrayList2 = new ArrayList(tcc.n(entrySet2, 10));
                for (Map.Entry entry2 : entrySet2) {
                    ro00 ro00Var2 = ro00.d;
                    arrayList2.add(vuz.u(Participant.PICKUP_POINT_DOTS_COLLECTION, ((a) entry2.getValue()).j, ((a) entry2.getValue()).k, j2, ((wpb0) entry2.getKey()).a, 480));
                }
                return arrayList2;
            case 2:
                int j3 = (int) ((gh00) ((ah00) dVar.b)).j();
                Set<Map.Entry> entrySet3 = dVar.M.entrySet();
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry3 : entrySet3) {
                    if (((wpb0) entry3.getKey()).l) {
                        u = null;
                    } else {
                        ro00 ro00Var3 = ro00.d;
                        u = vuz.u(Participant.PICKUP_POINT_LABELS_COLLECTION, ((a) entry3.getValue()).l, ((a) entry3.getValue()).k, j3, ((wpb0) entry3.getKey()).a, 480);
                    }
                    if (u != null) {
                        arrayList3.add(u);
                    }
                }
                return arrayList3;
            case 3:
                int j4 = (int) ((gh00) ((ah00) dVar.b)).j();
                Set<Map.Entry> entrySet4 = dVar.M.entrySet();
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry4 : entrySet4) {
                    if (((wpb0) entry4.getKey()).l) {
                        ro00 ro00Var4 = ro00.d;
                        u2 = vuz.u(Participant.PICKUP_POINT_LAST_LABEL, ((a) entry4.getValue()).l, ((a) entry4.getValue()).k, j4, ((wpb0) entry4.getKey()).a, 480);
                    } else {
                        u2 = null;
                    }
                    if (u2 != null) {
                        arrayList4.add(u2);
                    }
                }
                return arrayList4;
            default:
                int j5 = (int) ((gh00) ((ah00) dVar.b)).j();
                Set<Map.Entry> entrySet5 = dVar.M.entrySet();
                ArrayList arrayList5 = new ArrayList();
                for (Map.Entry entry5 : entrySet5) {
                    if (((wpb0) entry5.getKey()).m) {
                        ro00 ro00Var5 = ro00.d;
                        u3 = vuz.u(Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION, ((a) entry5.getValue()).l, ((a) entry5.getValue()).k, j5, ((wpb0) entry5.getKey()).a, 480);
                    } else {
                        u3 = null;
                    }
                    if (u3 != null) {
                        arrayList5.add(u3);
                    }
                }
                return arrayList5;
        }
    }
}
