package ru.yandex.taxi.masstransit.domain;

import defpackage.hnm0;
import defpackage.jtq0;
import defpackage.mdh;
import defpackage.qv10;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class q {
    public final tt2 a;
    public final ru.yandex.taxi.masstransit.datasource.schedule.a b;
    public final jtq0 c;

    public q(tt2 tt2Var, ru.yandex.taxi.masstransit.datasource.schedule.a aVar, jtq0 jtq0Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = jtq0Var;
    }

    public final Object a(hnm0 hnm0Var, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new MtOnlineScheduleInteractor$fullSchedules$2(this, hnm0Var, null), continuation);
    }

    public final tpr b(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((hnm0) obj).a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = qv10.w(str, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new rol0(new MtOnlineScheduleInteractor$scheduleFlow$2$1(this, (String) entry.getKey(), (List) entry.getValue(), null)));
        }
        kotlinx.coroutines.flow.internal.h J = kotlinx.coroutines.flow.e.J(arrayList);
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(J, mdh.b);
    }
}
