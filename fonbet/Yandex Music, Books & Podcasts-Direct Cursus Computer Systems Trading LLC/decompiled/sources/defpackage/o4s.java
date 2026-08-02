package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.List;

/* loaded from: classes4.dex */
public final class o4s {
    public static float a() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        jxb a = ((q4s) ((byb) qdcVar.C(I)).b(q4s.class)).a();
        a.getClass();
        JsonElement v = a.a.v("batteryBarrier");
        Float f = null;
        if (v != null) {
            try {
                JsonPrimitive S = cxb.S(v);
                if (S != null) {
                    if (!(S.a instanceof Number)) {
                        S = null;
                    }
                    if (S != null) {
                        f = Float.valueOf(S.a instanceof Number ? S.u().floatValue() : Float.parseFloat(S.q()));
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.2f;
    }

    public static boolean b() {
        List h = u75.h("default", "off", "control");
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        l18Var.a.getClass();
        return !h.contains(((q4s) ((byb) r1.C(I)).b(q4s.class)).b());
    }

    public static String c() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String f = ((q4s) ((byb) qdcVar.C(I)).b(q4s.class)).a().f("promoImageUrl");
        return f == null ? "https://avatars.mds.yandex.net/get-music-misc/28052/img.68465a90bb920718e27e08f4/orig" : f;
    }

    public static boolean d() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Boolean a = ((q4s) ((byb) qdcVar.C(I)).b(q4s.class)).a().a("showNotification");
        if (a != null) {
            return a.booleanValue();
        }
        return true;
    }
}
