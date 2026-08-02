package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mdw {
    public final uiq a;
    public final efw b;
    public final ydw c;
    public final vtm d;
    public final dgw e;
    public String f;
    public long g;
    public final String h;
    public long i;

    public mdw(uiq uiqVar, efw efwVar, ydw ydwVar, vtm vtmVar, dgw dgwVar) {
        vtmVar.getClass();
        this.a = uiqVar;
        this.b = efwVar;
        this.c = ydwVar;
        this.d = vtmVar;
        this.e = dgwVar;
        this.g = -1L;
        this.h = dgwVar.b();
    }

    public static f9h a(Throwable th) {
        String str = "grpc";
        if (!(th instanceof tgr)) {
            if (th instanceof IOException) {
                str = "io";
            } else if (!(th instanceof bqn)) {
                str = "other";
            }
        }
        f9h f9hVar = new f9h();
        f9hVar.put("errorType", str);
        String message = th.getMessage();
        if (message != null) {
            f9hVar.put("errorDescription", message);
        }
        f9hVar.put("errorLogName", th.getClass().getSimpleName());
        if (th instanceof tgr) {
            f9hVar.put("errorSubType", "biErrorCode");
            rgr rgrVar = ((tgr) th).a.a;
            rgrVar.getClass();
            String lowerCase = rgrVar.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            f9hVar.put("code", lowerCase + " (" + rgrVar.a + ")");
        } else if (th instanceof bqn) {
            f9hVar.put("errorSubType", "monoConnectivityState");
            String lowerCase2 = ((bqn) th).a.name().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            f9hVar.put("errorConnectivityState", lowerCase2);
        }
        return f9hVar.b();
    }

    public final LinkedHashMap b(Long l) {
        long longValue = (l == null && (l = this.a.C()) == null) ? this.g : l.longValue();
        this.g = longValue;
        Pair pair = new Pair("uuid", String.valueOf(longValue));
        String str = this.c.a.b.c().a;
        if (Intrinsics.d(str, yrt.a.a)) {
            str = null;
        }
        Pair pair2 = new Pair("puid", str);
        Pair pair3 = new Pair("mode", Intrinsics.d(this.f, this.h) ? "active" : "passive");
        Pair pair4 = new Pair("activeDeviceId", this.f);
        Pair pair5 = new Pair("currentDeviceId", this.e.b());
        String lowerCase = ((zzi) ((bew) this.d.a).a.d().getValue()).b.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Map e = uah.e(pair, pair2, pair3, pair4, pair5, new Pair("connectionType", lowerCase));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : e.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    public final void c(Long l) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        f9h f9hVar = new f9h();
        f9hVar.putAll(b(l));
        f9hVar.put("time", Double.valueOf(elapsedRealtime));
        e(new nsw("YNISON_CONNECTED", f9hVar.b()));
    }

    public final void d(Long l, Throwable th) {
        th.getClass();
        f9h f9hVar = new f9h();
        f9hVar.putAll(b(l));
        f9hVar.putAll(a(th));
        f9hVar.put("destination", "redirect");
        e(new nsw("YNISON_CONNECTING_ERROR", f9hVar.b()));
    }

    public final void e(nsw nswVar) {
        String str = nswVar.a;
        Map map = nswVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!Intrinsics.d(entry.getKey(), "puid")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ssg.a(4, "YnisonAnalytics", "sendEvent " + str + "  event = " + linkedHashMap, null);
        this.b.invoke(nswVar);
    }
}
