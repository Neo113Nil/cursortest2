package defpackage;

import android.content.Context;
import com.connectsdk.discovery.DiscoveryProvider;
import com.connectsdk.service.airplay.PListParser;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class vyq {
    public final Context a;
    public final t70 b;

    public vyq(Context context, t70 t70Var) {
        this.a = context;
        this.b = t70Var;
    }

    public static void a(ub ubVar, String str, Object obj) {
        if (obj != null) {
            ubVar.a(obj, str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [arf, java.lang.Object] */
    public static void b(ub ubVar, String str, List list, e5w e5wVar, long j, boolean z, boolean z2, String str2, Long l, syq syqVar, String str3) {
        e5w e5wVar2 = (e5w) CollectionsKt.firstOrNull(list);
        TimeZone timeZone = e5wVar2 != null ? e5wVar2.e : null;
        ubVar.a(str, "workId");
        ubVar.a(rzf.y(list), "intervals");
        ubVar.a(e5wVar != null ? rzf.z(e5wVar) : "none", "interval");
        ubVar.a(zwf.C(timeZone), PListParser.TAG_DATE);
        ubVar.a(Long.valueOf(j / DiscoveryProvider.TIMEOUT), "nextStartDelayMinutes");
        ubVar.a(Boolean.valueOf(z), "retryFlag");
        ubVar.a(Boolean.valueOf(z2), "needToRetryFlag");
        ubVar.a(str2, "workPolicy");
        ubVar.a(l != null ? zwf.b0(l.longValue(), timeZone) : null, "prevLaunchDate");
        a(ubVar, "error", str3);
        if (syqVar != null) {
            a(ubVar, "tracksToAdd", syqVar.b);
            a(ubVar, "tracksToDelete", syqVar.c);
            ubVar.a(Boolean.valueOf(syqVar.d), "requestUpdate");
            Long l2 = syqVar.e;
            a(ubVar, "prevUpdateDate", l2 != null ? zwf.b0(l2.longValue(), timeZone) : null);
            Long l3 = syqVar.f;
            a(ubVar, "nextUpdateDate", l3 != null ? zwf.b0(l3.longValue(), timeZone) : null);
            a(ubVar, "tracksToDownload", syqVar.g);
            a(ubVar, "tracksDownloaded", syqVar.h);
            a(ubVar, "tracksRemoved", syqVar.i);
            a(ubVar, "currentQuality", syqVar.p);
            a(ubVar, "payload", syqVar.r);
            ubVar.a(Long.valueOf(syqVar.s), "totalTimeSec");
            Map map = (Map) ubVar.a.getValue();
            ub ubVar2 = new ub();
            a(ubVar2, "userCachedTracks", syqVar.j);
            a(ubVar2, "autoCachedTracks", syqVar.k);
            a(ubVar2, "smartCachedTracks", syqVar.l);
            a(ubVar2, "maxSizeMb", syqVar.m);
            a(ubVar2, "occupiedSizeMb", syqVar.n);
            a(ubVar2, "totalOccupiedSizeMb", syqVar.o);
            map.put("storage", ubVar2.b());
        }
    }

    public final void c(ryq ryqVar, String str, List list, e5w e5wVar, long j, boolean z, boolean z2, String str2, Long l, syq syqVar) {
        ryqVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        boolean equals = ryqVar.equals(qyq.a);
        t70 t70Var = this.b;
        if (equals) {
            boolean z3 = (syqVar != null ? syqVar.q : null) == null;
            ub ubVar = new ub();
            ubVar.a(Boolean.valueOf(z3), "success");
            b(ubVar, str, list, e5wVar, j, z, z2, str2, l, syqVar, syqVar != null ? syqVar.q : null);
            Map b = ubVar.b();
            if (b == null) {
                b = e5b.a;
                b.getClass();
            }
            ot0.A(t70Var.e(), "SMART_DOWNLOAD_FINISHED", b);
            return;
        }
        if (!(ryqVar instanceof pyq)) {
            b6e.s();
            return;
        }
        String str3 = ((pyq) ryqVar).a;
        ub ubVar2 = new ub();
        b(ubVar2, str, list, e5wVar, j, z, z2, str2, l, syqVar, str3);
        Map b2 = ubVar2.b();
        if (b2 == null) {
            b2 = e5b.a;
            b2.getClass();
        }
        ot0.A(t70Var.e(), "SMART_DOWNLOAD_ERROR", b2);
    }
}
