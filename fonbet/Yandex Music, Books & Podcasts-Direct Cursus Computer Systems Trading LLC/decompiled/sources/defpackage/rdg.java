package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rdg {
    public final bma a;
    public final pv9 b;
    public final zzp c;
    public long d;
    public v5j e;
    public long f;
    public long g;
    public List h;
    public long i;
    public long j;
    public long k;
    public long l;
    public boolean m;

    public rdg(bma bmaVar, pv9 pv9Var, zzp zzpVar) {
        pv9Var.getClass();
        this.a = bmaVar;
        this.b = pv9Var;
        this.c = zzpVar;
    }

    public final void a() {
        List list;
        String str;
        v5j v5jVar = this.e;
        if (v5jVar == null || (list = this.h) == null) {
            return;
        }
        long a = this.c.a();
        long j = this.f;
        long j2 = j - this.d;
        long j3 = this.g;
        long j4 = j3 - j;
        long j5 = this.i;
        long j6 = j5 - j3;
        long j7 = this.j;
        long j8 = j7 - j5;
        long j9 = this.k;
        long j10 = j9 - j7;
        long j11 = this.l;
        long j12 = j11 - j9;
        long j13 = a - j11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            w7c w7cVar = (w7c) it.next();
            long j14 = j13;
            String str2 = w7cVar.a;
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                linkedHashMap.containsKey(str2);
            }
            Long l = (Long) obj;
            long j15 = j4;
            linkedHashMap.put(str2, Long.valueOf((l != null ? l.longValue() : 0L) + w7cVar.b));
            it = it2;
            j13 = j14;
            j4 = j15;
        }
        long j16 = j13;
        long j17 = j4;
        int ordinal = v5jVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            str = "naturalCompleted";
        } else if (ordinal == 2 || ordinal == 3) {
            str = "naturalOther";
        } else if (ordinal == 4) {
            str = "skip";
        } else {
            if (ordinal != 5) {
                b6e.s();
                return;
            }
            str = "dislike";
        }
        f9h f9hVar = new f9h();
        f9hVar.put("liteDozeMode", this.a.a());
        f9hVar.put("nextMode", str);
        f9hVar.put("notImmediateSkip", Boolean.valueOf(this.m));
        f9hVar.put("elapsedTimeMs0_untilFirstStateEmitted", Long.valueOf(j2));
        f9hVar.put("elapsedTimeMs1_untilBeginJoinAsyncJobs", Long.valueOf(j17));
        f9hVar.put("elapsedTimeMs2_untilEndJoinAsyncJobs", Long.valueOf(j6));
        f9hVar.put("elapsedTimeMs3_untilEndDbGetFeedback", Long.valueOf(j8));
        f9hVar.put("elapsedTimeMs4_untilBeginGetTracks", Long.valueOf(j10));
        f9hVar.put("elapsedTimeMs5_untilEndGetTracks", Long.valueOf(j12));
        f9hVar.put("elapsedTimeMs6_untilProlongationFinished", Long.valueOf(j16));
        f9hVar.putAll(linkedHashMap);
        ((it0) this.b.b).a("Wave.LiveNextProlongationDetails", f9hVar.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdg)) {
            return false;
        }
        rdg rdgVar = (rdg) obj;
        return this.a.equals(rdgVar.a) && Intrinsics.d(this.b, rdgVar.b) && this.c.equals(rdgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LiveNextProlongationAnalyticalBatch(dozeModeInfoProvider=" + this.a + ", eventsTransport=" + this.b + ", clock=" + this.c + ")";
    }
}
