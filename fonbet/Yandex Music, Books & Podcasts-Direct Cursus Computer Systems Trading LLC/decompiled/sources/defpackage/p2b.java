package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class p2b {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Serializable c;
    public final Object d;

    public p2b(mhp mhpVar, le0 le0Var) {
        mhpVar.getClass();
        this.b = mhpVar;
        this.c = le0Var;
        int e2 = mhpVar.e();
        if (e2 <= 64) {
            this.a = e2 != 64 ? (-1) << e2 : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (e2 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((e2 & 63) != 0) {
            jArr[i - 1] = (-1) << e2;
        }
        this.d = jArr;
    }

    public void a() {
        String str;
        String str2;
        nwh nwhVar = (nwh) this.d;
        if (((mwk) this.b) != null && ((r9l) this.c) == r9l.b) {
            this.c = r9l.c;
            this.a = System.currentTimeMillis();
            nmb nmbVar = (nmb) nwhVar.h;
            nwk p = nwhVar.p();
            String str3 = "";
            if (p == null || (str = p.a) == null) {
                str = "";
            }
            nwk p2 = nwhVar.p();
            if (p2 != null && (str2 = p2.b) != null) {
                str3 = str2;
            }
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str);
            dfi.p(1, "track_name", str3, "_meta", linkedHashMap);
            nmbVar.C("ExpandedPlayer.VideoStarted", linkedHashMap);
        }
    }

    public void b() {
        String str;
        String str2;
        nwh nwhVar = (nwh) this.d;
        if (((mwk) this.b) != null && ((r9l) this.c) == r9l.c) {
            this.c = r9l.b;
            nmb nmbVar = (nmb) nwhVar.h;
            nwk p = nwhVar.p();
            String str3 = "";
            if (p == null || (str = p.a) == null) {
                str = "";
            }
            nwk p2 = nwhVar.p();
            if (p2 != null && (str2 = p2.b) != null) {
                str3 = str2;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.a);
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str);
            eta.m(currentTimeMillis, "track_name", str3, "watched_time", linkedHashMap);
            linkedHashMap.put("_meta", nmb.u(1));
            nmbVar.C("ExpandedPlayer.VideoWatched", linkedHashMap);
        }
    }

    public p2b(nwh nwhVar) {
        this.d = nwhVar;
    }
}
