package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class ouu {
    public final pv9 a;

    public ouu(pv9 pv9Var) {
        pv9Var.getClass();
        this.a = pv9Var;
    }

    public final void a(tlj tljVar, d9b d9bVar) {
        f9h f9hVar = new f9h();
        f9hVar.put("reason", d9bVar.name());
        f9hVar.put("sessionId", tljVar.b);
        f9hVar.put("batchId", tljVar.c);
        olj oljVar = tljVar.a;
        f9hVar.put("seeds", oljVar.g);
        f9hVar.put("serverDataCount", oljVar.h);
        f9hVar.put("lastTrackCount", oljVar.d);
        f9hVar.put("tracks", CollectionsKt.X(tljVar.d, null, null, null, new xlu(27), 31));
        f9hVar.put("programVersion", oljVar.a);
        f9hVar.put("programUpdateDate", oljVar.b);
        f9hVar.put("programSize", Integer.valueOf(oljVar.e));
        f9hVar.put("programStateSize", Integer.valueOf(oljVar.f));
        f9hVar.put("availableTrackCount", Integer.valueOf(oljVar.c));
        f9hVar.put("synthetic", Boolean.valueOf(tljVar.f));
        f9hVar.put("telemetry", tljVar.e);
        ((it0) this.a.b).a("OFFLINEWAVE_START", f9hVar.b());
    }

    public final void b(String str, String str2, olj oljVar, String str3, int[] iArr) {
        f9h f9hVar = new f9h();
        f9hVar.put(Constants.KEY_MESSAGE, str);
        f9hVar.put("payload", str2);
        f9hVar.put("batchId", str3);
        f9hVar.put("programVersion", oljVar != null ? oljVar.a : null);
        f9hVar.put("programUpdateDate", oljVar != null ? oljVar.b : null);
        f9hVar.put("programSize", oljVar != null ? Integer.valueOf(oljVar.e) : null);
        f9hVar.put("programStateSize", oljVar != null ? Integer.valueOf(oljVar.f) : null);
        f9hVar.put("availableTrackCount", oljVar != null ? Integer.valueOf(oljVar.c) : null);
        f9hVar.put("seeds", oljVar != null ? oljVar.g : null);
        f9hVar.put("serverDataCount", oljVar != null ? oljVar.h : null);
        f9hVar.put("lastTrackCount", oljVar != null ? oljVar.d : null);
        f9hVar.put("telemetry", iArr);
        ((it0) this.a.b).a("OFFLINEWAVE_ERROR", f9hVar.b());
    }
}
