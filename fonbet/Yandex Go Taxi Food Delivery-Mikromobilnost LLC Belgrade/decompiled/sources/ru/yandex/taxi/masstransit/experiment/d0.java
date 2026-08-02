package ru.yandex.taxi.masstransit.experiment;

import defpackage.d6z;
import defpackage.e3n;
import defpackage.e9s;
import defpackage.ij40;
import defpackage.jbh;
import defpackage.kdc;
import defpackage.kp50;
import defpackage.o430;
import defpackage.pdc;
import defpackage.q0l0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tcc;
import defpackage.u311;
import defpackage.ub6;
import defpackage.ufu;
import defpackage.z3l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes6.dex */
public final class d0 {
    public static final /* synthetic */ int d = 0;
    public final pdc a;
    public final TransportOnSummaryExperiment b;
    public final qqo c;

    static {
        l lVar = TransportOnSummaryExperiment.Companion;
    }

    public d0(rqo rqoVar, pdc pdcVar) {
        this.a = pdcVar;
        TransportOnSummaryExperiment.Companion.getClass();
        TransportOnSummaryExperiment transportOnSummaryExperiment = new TransportOnSummaryExperiment(0);
        this.b = transportOnSummaryExperiment;
        this.c = ((jbh) rqoVar).c(transportOnSummaryExperiment);
    }

    public final f a() {
        Object b = this.c.b();
        if (!((TransportOnSummaryExperiment) b).b) {
            b = null;
        }
        TransportOnSummaryExperiment transportOnSummaryExperiment = (TransportOnSummaryExperiment) b;
        if (transportOnSummaryExperiment == null) {
            transportOnSummaryExperiment = this.b;
        }
        return c(transportOnSummaryExperiment);
    }

    public final c0 b() {
        return new c0(new a0(ru.yandex.taxi.experiments.d.a(this.c), this), this);
    }

    public final f c(TransportOnSummaryExperiment transportOnSummaryExperiment) {
        Long l;
        pdc pdcVar;
        boolean z = transportOnSummaryExperiment.d;
        String str = transportOnSummaryExperiment.o;
        String str2 = transportOnSummaryExperiment.f;
        String str3 = transportOnSummaryExperiment.g;
        Long l2 = transportOnSummaryExperiment.i;
        if (l2 != null) {
            o430 o430Var = e3n.b;
            l = Long.valueOf(e3n.e(kp50.V(l2.longValue(), DurationUnit.SECONDS)));
        } else {
            l = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = transportOnSummaryExperiment.h.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            pdcVar = this.a;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            TransportOnSummaryExperiment.e eVar = (TransportOnSummaryExperiment.e) entry.getValue();
            MtTransportType.Companion.getClass();
            MtTransportType a = ij40.a(str4);
            if (a == MtTransportType.UNKNOWN) {
                a = null;
            }
            if (a != null) {
                kdc b = ((ufu) pdcVar).b(eVar.a);
                if (b != null) {
                    linkedHashMap.put(a, new u311(b));
                }
            }
        }
        ArrayList<TransportOnSummaryExperiment.b> arrayList = transportOnSummaryExperiment.j.a;
        Long l3 = l;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (TransportOnSummaryExperiment.b bVar : arrayList) {
            ExperimentAction experimentAction = bVar.a;
            TransportOnSummaryExperiment.a aVar = bVar.b;
            arrayList2.add(new ub6(experimentAction, e9s.b(aVar.a, transportOnSummaryExperiment), e9s.b(aVar.b, transportOnSummaryExperiment), ((ufu) pdcVar).b(aVar.c)));
            z = z;
        }
        boolean z2 = z;
        ArrayList arrayList3 = transportOnSummaryExperiment.k.a;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        for (Iterator it2 = arrayList3.iterator(); it2.hasNext(); it2 = it2) {
            TransportOnSummaryExperiment.b bVar2 = (TransportOnSummaryExperiment.b) it2.next();
            TransportOnSummaryExperiment.a aVar2 = bVar2.b;
            arrayList4.add(new z3l0(bVar2.a, e9s.b(aVar2.a, transportOnSummaryExperiment), e9s.b(aVar2.b, transportOnSummaryExperiment), ((ufu) pdcVar).b(aVar2.c)));
        }
        q0l0 q0l0Var = new q0l0(arrayList4);
        String Y = d6z.Y(transportOnSummaryExperiment, transportOnSummaryExperiment.l);
        String Y2 = d6z.Y(transportOnSummaryExperiment, transportOnSummaryExperiment.m);
        TransportOnSummaryExperiment.g gVar = transportOnSummaryExperiment.n;
        if (d6z.Z(transportOnSummaryExperiment, str)) {
            d6z.Y(transportOnSummaryExperiment, str);
        }
        return new f(z2, str2, str3, l3, linkedHashMap, arrayList2, q0l0Var, Y, Y2, gVar, transportOnSummaryExperiment.q, transportOnSummaryExperiment.r);
    }
}
