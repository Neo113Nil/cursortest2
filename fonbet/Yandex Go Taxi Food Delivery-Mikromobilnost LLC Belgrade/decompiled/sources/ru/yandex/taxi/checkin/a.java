package ru.yandex.taxi.checkin;

import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.CheckInZone;
import defpackage.g6u;
import defpackage.ike;
import defpackage.l8x;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class a {
    public final d a;

    public a(d dVar) {
        this.a = dVar;
    }

    public final void a(o2y0 o2y0Var) {
        List list;
        CheckInZone checkInZone;
        CheckInInfo checkInInfo = o2y0Var.b().V().a0;
        String str = (checkInInfo == null || (list = checkInInfo.a) == null || (checkInZone = (CheckInZone) kotlin.collections.a.R(list)) == null) ? null : checkInZone.b;
        if (str == null) {
            str = "";
        }
        d dVar = this.a;
        LinkedHashMap linkedHashMap = dVar.g;
        tt2 tt2Var = dVar.c;
        ike ikeVar = dVar.e;
        String str2 = o2y0Var.b().a;
        LinkedHashMap linkedHashMap2 = dVar.f;
        l8x l8xVar = (l8x) linkedHashMap2.get(str2);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        linkedHashMap2.put(str2, tje.N(ikeVar, g6uVar, null, new CheckInRepository$sendCheckInRequest$1(dVar, str2, str, null), 2));
        l8x l8xVar2 = (l8x) linkedHashMap.get(str2);
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        linkedHashMap.put(str2, tje.N(ikeVar, g6uVar, null, new CheckInRepository$sendCheckInRequest$2(dVar, o2y0Var, str2, null), 2));
    }
}
