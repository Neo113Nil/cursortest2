package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c4d {
    public final b5d a;
    public final zzp b;
    public final qqi c;
    public String d;
    public a4d e;
    public final LinkedHashMap f;
    public final long g;

    public c4d(b5d b5dVar, zzp zzpVar) {
        b5dVar.getClass();
        this.a = b5dVar;
        this.b = zzpVar;
        this.c = rqi.a();
        this.e = a4d.a;
        this.f = new LinkedHashMap();
        msa msaVar = nsa.b;
        this.g = yd5.M(2, ssa.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:29:0x00da, B:31:0x00e2, B:32:0x00ec, B:34:0x00fa, B:37:0x011b), top: B:28:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:29:0x00da, B:31:0x00e2, B:32:0x00ec, B:34:0x00fa, B:37:0x011b), top: B:28:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b A[Catch: all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:29:0x00da, B:31:0x00e2, B:32:0x00ec, B:34:0x00fa, B:37:0x011b), top: B:28:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.String, qqi] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e4d e4dVar, d5d d5dVar, String str, cg6 cg6Var) {
        b4d b4dVar;
        int i;
        long a;
        qqi qqiVar;
        nm6 nm6Var;
        qqi qqiVar2;
        e4d e4dVar2;
        String str2;
        long j;
        d5d d5dVar2;
        qqi qqiVar3;
        e4d e4dVar3;
        d5d d5dVar3;
        String str3;
        ?? r9;
        Long l;
        rj6 rj6Var;
        boolean z;
        boolean z2;
        e4d e4dVar4 = e4dVar;
        d5d d5dVar4 = d5dVar;
        String str4 = str;
        LinkedHashMap linkedHashMap = this.f;
        if (cg6Var instanceof b4d) {
            b4dVar = (b4d) cg6Var;
            int i2 = b4dVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b4dVar.q = i2 - Integer.MIN_VALUE;
                Object obj = b4dVar.o;
                nm6 nm6Var2 = nm6.a;
                i = b4dVar.q;
                String str5 = "GenerativeFeedbackMaster";
                boolean z3 = true;
                int i3 = 3;
                if (i != 0) {
                    qgg.h0(obj);
                    StringBuilder sb = new StringBuilder("sendFeedback type=");
                    sb.append(e4dVar4);
                    sb.append(" station=");
                    sb.append(d5dVar4);
                    ssg.a(i3, str5, su4.o(sb, " streamId=", str4), null);
                    a = this.b.a();
                    int ordinal = e4dVar4.ordinal();
                    qqiVar = this.c;
                    if (ordinal == 0) {
                        nm6Var = nm6Var2;
                        b4dVar.j = e4dVar4;
                        b4dVar.k = d5dVar4;
                        b4dVar.l = str4;
                        b4dVar.m = qqiVar;
                        b4dVar.n = a;
                        b4dVar.q = 2;
                        if (qqiVar.a(b4dVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar2 = qqiVar;
                        if (Intrinsics.d(this.d, str4)) {
                        }
                        z3 = false;
                        if (z3) {
                        }
                    } else if (ordinal != 1) {
                        b4dVar.j = e4dVar4;
                        b4dVar.k = d5dVar4;
                        b4dVar.l = str4;
                        b4dVar.m = qqiVar;
                        b4dVar.n = a;
                        b4dVar.q = i3;
                        if (qqiVar.a(b4dVar) == nm6Var2) {
                            return nm6Var2;
                        }
                        e4dVar2 = e4dVar4;
                        str2 = str4;
                        j = a;
                        d5dVar2 = d5dVar4;
                        qqiVar3 = qqiVar;
                        l = (Long) linkedHashMap.get(e4dVar2);
                        if (j - (l == null ? l.longValue() : 0L) >= nsa.f(this.g)) {
                        }
                    } else {
                        b4dVar.j = e4dVar4;
                        b4dVar.k = d5dVar4;
                        b4dVar.l = str4;
                        b4dVar.m = qqiVar;
                        b4dVar.n = a;
                        b4dVar.q = 1;
                        nm6Var = nm6Var2;
                        if (qqiVar.a(b4dVar) == nm6Var) {
                            return nm6Var;
                        }
                        this.d = str4;
                        this.e = a4d.b;
                        qqiVar.b(null);
                        d5d d5dVar5 = d5dVar4;
                        e4dVar3 = e4dVar4;
                        d5dVar3 = d5dVar5;
                        str3 = str4;
                        Object obj2 = null;
                        j = a;
                        r9 = obj2;
                        z3d z3dVar = new z3d(e4dVar3, j);
                        b4dVar.j = e4dVar3;
                        b4dVar.k = d5dVar3;
                        b4dVar.l = r9;
                        b4dVar.m = r9;
                        b4dVar.n = j;
                        b4dVar.q = 4;
                        obj = this.a.a(d5dVar3, z3dVar, str3, b4dVar);
                        if (obj == nm6Var) {
                        }
                    }
                } else if (i == 1) {
                    long j2 = b4dVar.n;
                    qqi qqiVar4 = b4dVar.m;
                    String str6 = b4dVar.l;
                    d5d d5dVar6 = b4dVar.k;
                    e4d e4dVar5 = b4dVar.j;
                    qgg.h0(obj);
                    qqiVar = qqiVar4;
                    e4dVar4 = e4dVar5;
                    a = j2;
                    str4 = str6;
                    d5dVar4 = d5dVar6;
                    nm6Var = nm6Var2;
                    try {
                        this.d = str4;
                        this.e = a4d.b;
                        qqiVar.b(null);
                        d5d d5dVar52 = d5dVar4;
                        e4dVar3 = e4dVar4;
                        d5dVar3 = d5dVar52;
                        str3 = str4;
                        Object obj22 = null;
                        j = a;
                        r9 = obj22;
                        z3d z3dVar2 = new z3d(e4dVar3, j);
                        b4dVar.j = e4dVar3;
                        b4dVar.k = d5dVar3;
                        b4dVar.l = r9;
                        b4dVar.m = r9;
                        b4dVar.n = j;
                        b4dVar.q = 4;
                        obj = this.a.a(d5dVar3, z3dVar2, str3, b4dVar);
                        if (obj == nm6Var) {
                        }
                    } catch (Throwable th) {
                        qqiVar.b(null);
                        throw th;
                    }
                } else if (i == 2) {
                    long j3 = b4dVar.n;
                    qqi qqiVar5 = b4dVar.m;
                    String str7 = b4dVar.l;
                    d5d d5dVar7 = b4dVar.k;
                    e4d e4dVar6 = b4dVar.j;
                    qgg.h0(obj);
                    qqiVar2 = qqiVar5;
                    a = j3;
                    str4 = str7;
                    d5dVar4 = d5dVar7;
                    nm6Var = nm6Var2;
                    e4dVar4 = e4dVar6;
                    try {
                        if (Intrinsics.d(this.d, str4) || this.e != a4d.b) {
                            z3 = false;
                        } else {
                            this.e = a4d.c;
                        }
                        if (z3) {
                            ssg.a(i3, str5, hrg.q("Skip streamPlay for streamId=", str4, " – no preceding streamPause"), z2 ? 1 : 0);
                            return Boolean.FALSE;
                        }
                        d5d d5dVar8 = d5dVar4;
                        e4dVar3 = e4dVar4;
                        d5dVar3 = d5dVar8;
                        str3 = str4;
                        j = a;
                        r9 = obj22;
                        z3d z3dVar22 = new z3d(e4dVar3, j);
                        b4dVar.j = e4dVar3;
                        b4dVar.k = d5dVar3;
                        b4dVar.l = r9;
                        b4dVar.m = r9;
                        b4dVar.n = j;
                        b4dVar.q = 4;
                        obj = this.a.a(d5dVar3, z3dVar22, str3, b4dVar);
                        if (obj == nm6Var) {
                        }
                    } finally {
                        qqiVar2.b(null);
                    }
                } else if (i == i3) {
                    long j4 = b4dVar.n;
                    qqi qqiVar6 = b4dVar.m;
                    String str8 = b4dVar.l;
                    d5dVar2 = b4dVar.k;
                    e4dVar2 = b4dVar.j;
                    qgg.h0(obj);
                    j = j4;
                    str2 = str8;
                    qqiVar3 = qqiVar6;
                    try {
                        l = (Long) linkedHashMap.get(e4dVar2);
                        if (j - (l == null ? l.longValue() : 0L) >= nsa.f(this.g)) {
                            String str9 = "Skip feedback=" + e4dVar2 + " for station=" + d5dVar2 + " due to delay";
                            Boolean bool = Boolean.FALSE;
                            qqiVar3.b(r9);
                            return bool;
                        }
                        linkedHashMap.put(e4dVar2, new Long(j));
                        qqiVar3.b(null);
                        str3 = str2;
                        d5dVar3 = d5dVar2;
                        e4dVar3 = e4dVar2;
                        nm6Var = nm6Var2;
                        r9 = 0;
                        z3d z3dVar222 = new z3d(e4dVar3, j);
                        b4dVar.j = e4dVar3;
                        b4dVar.k = d5dVar3;
                        b4dVar.l = r9;
                        b4dVar.m = r9;
                        b4dVar.n = j;
                        b4dVar.q = 4;
                        obj = this.a.a(d5dVar3, z3dVar222, str3, b4dVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } catch (Throwable th2) {
                        qqiVar3.b(null);
                        throw th2;
                    }
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d5dVar3 = b4dVar.k;
                    e4dVar3 = b4dVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    z = ((d4d) ((qj6) rj6Var).a).a;
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, str5, "Failed to send feedback=" + e4dVar3 + " for station=" + d5dVar3, ((pj6) rj6Var).a());
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        b4dVar = new b4d(this, cg6Var);
        Object obj3 = b4dVar.o;
        nm6 nm6Var22 = nm6.a;
        i = b4dVar.q;
        String str52 = "GenerativeFeedbackMaster";
        boolean z32 = true;
        int i32 = 3;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
        return Boolean.valueOf(z);
    }
}
