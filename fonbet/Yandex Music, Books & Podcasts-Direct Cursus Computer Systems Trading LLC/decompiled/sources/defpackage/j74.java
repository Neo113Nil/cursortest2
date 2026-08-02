package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class j74 {
    public static final nmb a = qld.m();

    public static void a(okb okbVar, slb slbVar, tlb tlbVar) {
        nmb nmbVar = a;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
        linkedHashMap.put("protocol_type", slbVar.a);
        dfi.p(2, "connection_type", tlbVar.a, "_meta", linkedHashMap);
        nmbVar.C("Pult.Connected", linkedHashMap);
    }

    public static void b(okb okbVar, slb slbVar) {
        List c = t75.c(slbVar.a);
        nmb nmbVar = a;
        nmbVar.getClass();
        c.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, okbVar.a);
        linkedHashMap.put("protocol_types", c);
        linkedHashMap.put("_meta", nmb.u(2));
        nmbVar.C("Pult.Discovered", linkedHashMap);
    }
}
