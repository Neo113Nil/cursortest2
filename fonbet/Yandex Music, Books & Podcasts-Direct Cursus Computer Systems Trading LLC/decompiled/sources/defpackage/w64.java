package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class w64 {
    public static final nmb a = qld.m();

    public static String a(String str, String str2) {
        if (str2 == null && str == null) {
            return null;
        }
        return str2 == null ? str : str == null ? str2 : ouj.o(str, ": ", str2);
    }

    public static void b(ulb ulbVar, String str) {
        if (str == null) {
            return;
        }
        nmb nmbVar = a;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_type", ulbVar.a);
        dfi.p(2, "error_message", str, "_meta", linkedHashMap);
        nmbVar.C("Pult.ErrorRaised", linkedHashMap);
    }
}
