package ru.yandex.taxi.map_common.map.intersection;

import defpackage.fn00;
import defpackage.g8e;
import defpackage.hst;
import defpackage.jo0;
import defpackage.jst;
import defpackage.lp00;
import defpackage.mp00;
import defpackage.msb1;
import defpackage.muw;
import defpackage.np00;
import defpackage.nuw;
import defpackage.op00;
import defpackage.pp00;
import defpackage.pzt0;
import defpackage.ro00;
import defpackage.sls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zoi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;
import ru.yandex.taxi.map_common.map.process.b;

/* loaded from: classes9.dex */
public final class a implements lp00 {
    public final b a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final fn00 d = new fn00();
    public final HashMap e = new HashMap();

    public a(b bVar) {
        this.a = bVar;
    }

    public final synchronized void a(Participant participant, muw muwVar) {
        this.c.put(participant, muwVar);
        fn00 fn00Var = this.d;
        synchronized (fn00Var) {
            fn00Var.a.put(participant, new fn00.a());
        }
        if (!this.b.isEmpty()) {
            for (Participant participant2 : this.c.keySet()) {
                if (participant2 != participant) {
                    m(participant, participant2);
                    m(participant2, participant);
                }
            }
        }
        List<op00> list = (List) this.e.remove(participant);
        if (list != null) {
            for (op00 op00Var : list) {
                MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType = op00Var.b;
                Participant participant3 = op00Var.a;
                MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2 = MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType.WHO;
                Participant participant4 = mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType == mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2 ? participant3 : participant;
                if (mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType == mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2) {
                    participant3 = participant;
                }
                i(participant4, participant3, op00Var.c, op00Var.d);
            }
        }
    }

    public final pzt0 b(Participant participant, Participant participant2) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            return null;
        }
        String p = g8e.p(participant.name(), ":", participant2.name());
        np00 np00Var = (np00) hashMap.get(p);
        if (np00Var == null) {
            unr0.C(new Object[]{p}, 1, "Unknown intersectable id: %s. Check the order of the participants.", jst.e);
            return null;
        }
        muw muwVar = np00Var.b;
        muw muwVar2 = np00Var.a;
        int i = pp00.a[np00Var.c.ordinal()];
        if (i == 1) {
            return k(new jo0(this, np00Var, muwVar2.a(), muwVar.a(), 17));
        }
        if (i == 2) {
            return k(new mp00(this, np00Var, participant2, muwVar2.a(), muwVar.b()));
        }
        if (i == 3) {
            return k(new mp00(this, np00Var, participant, muwVar2.b(), muwVar.a()));
        }
        if (i == 4) {
            return k(new zoi(this, np00Var, participant, participant2, muwVar2.b(), muwVar.b(), 1));
        }
        w511.b();
        return null;
    }

    public final void c(np00 np00Var, Participant participant, Participant participant2, List list, List list2) {
        fn00 fn00Var = this.d;
        fn00Var.d(participant, list, participant2, list2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ro00 ro00Var = (ro00) it.next();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ro00 ro00Var2 = (ro00) it2.next();
                fn00Var.b(ro00Var, ro00Var2, np00Var.d.b(ro00Var.a(), ro00Var2.a()));
            }
        }
    }

    public final void d(ro00 ro00Var, np00 np00Var, List list, Participant participant) {
        Participant c = ro00Var.c();
        List singletonList = Collections.singletonList(ro00Var);
        fn00 fn00Var = this.d;
        fn00Var.d(participant, list, c, singletonList);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ro00 ro00Var2 = (ro00) it.next();
            fn00Var.b(ro00Var2, ro00Var, np00Var.d.b(ro00Var2.a(), ro00Var.a()));
        }
    }

    public final void e(ro00 ro00Var, np00 np00Var, List list, Participant participant) {
        Participant c = ro00Var.c();
        List singletonList = Collections.singletonList(ro00Var);
        fn00 fn00Var = this.d;
        fn00Var.d(c, singletonList, participant, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ro00 ro00Var2 = (ro00) it.next();
            fn00Var.b(ro00Var, ro00Var2, np00Var.d.b(ro00Var.a(), ro00Var2.a()));
        }
    }

    public final void f(np00 np00Var, ro00 ro00Var, ro00 ro00Var2) {
        Participant c = ro00Var.c();
        List singletonList = Collections.singletonList(ro00Var);
        Participant c2 = ro00Var2.c();
        List singletonList2 = Collections.singletonList(ro00Var2);
        fn00 fn00Var = this.d;
        fn00Var.d(c, singletonList, c2, singletonList2);
        fn00Var.b(ro00Var, ro00Var2, np00Var.d.b(ro00Var.a(), ro00Var2.a()));
    }

    public final Set g(String str, Participant participant) {
        fn00 fn00Var = this.d;
        ro00 ro00Var = new ro00(str, participant);
        synchronized (fn00Var) {
            fn00.a aVar = (fn00.a) fn00Var.a.get(ro00Var.c());
            if (aVar == null) {
                return EmptySet.a;
            }
            Set set = (Set) aVar.a.get(ro00Var);
            if (set == null) {
                return EmptySet.a;
            }
            return new HashSet(set);
        }
    }

    public final void h(Participant participant, Participant participant2, ParticipantRelationsMode participantRelationsMode) {
        i(participant, participant2, participantRelationsMode, msb1.K);
    }

    public final synchronized void i(Participant participant, Participant participant2, ParticipantRelationsMode participantRelationsMode, nuw nuwVar) {
        muw muwVar = (muw) this.c.get(participant);
        muw muwVar2 = (muw) this.c.get(participant2);
        if (muwVar == null) {
            MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType = MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType.WITH_WHOM;
            HashMap hashMap = this.e;
            List list = (List) hashMap.get(participant);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(new op00(participant2, mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType, participantRelationsMode, nuwVar));
            hashMap.put(participant, list);
            hst hstVar = jst.e;
            String.format("Unknown IntersectableSpaceProvider: incoming 'who' id = %s. ", Arrays.copyOf(new Object[]{participant}, 1));
            hstVar.getClass();
            return;
        }
        if (muwVar2 != null) {
            this.b.put(participant.name() + ":" + participant2.name(), new np00(muwVar, muwVar2, participantRelationsMode, nuwVar));
            return;
        }
        MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2 = MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType.WHO;
        HashMap hashMap2 = this.e;
        List list2 = (List) hashMap2.get(participant2);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.add(new op00(participant, mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2, participantRelationsMode, nuwVar));
        hashMap2.put(participant2, list2);
        hst hstVar2 = jst.e;
        String.format("Unknown IntersectableSpaceProvider: incoming 'withWhom' id = %s. ", Arrays.copyOf(new Object[]{participant2}, 1));
        hstVar2.getClass();
    }

    public final synchronized void j(Participant participant) {
        this.c.remove(participant);
        fn00 fn00Var = this.d;
        synchronized (fn00Var) {
            fn00Var.a.remove(participant);
        }
    }

    public final pzt0 k(sls slsVar) {
        MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn = MapComputationsProcessor$ExecuteOn.WORKER;
        MapObjectsIntersectionCheckerImpl$submit$1 mapObjectsIntersectionCheckerImpl$submit$1 = new MapObjectsIntersectionCheckerImpl$submit$1(slsVar);
        b bVar = this.a;
        return ru.yandex.taxi.map_common.map.process.a.a(mapComputationsProcessor$ExecuteOn, bVar.b, bVar.a, bVar.c, mapObjectsIntersectionCheckerImpl$submit$1);
    }

    public final void l(Participant participant, Participant participant2) {
        this.b.remove(participant.name() + ":" + participant2.name());
        HashMap hashMap = this.e;
        hashMap.remove(participant);
        hashMap.remove(participant2);
    }

    public final void m(Participant participant, Participant participant2) {
        np00 np00Var = (np00) this.b.get(participant.name() + ":" + participant2.name());
        if (np00Var == null) {
            return;
        }
        i(participant, participant2, np00Var.c, np00Var.d);
    }
}
