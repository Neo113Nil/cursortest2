package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.report.s6;
import com.yandex.passport.internal.report.t6;
import com.yandex.passport.internal.report.v6;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.g84;
import defpackage.gld;
import defpackage.j9w;
import defpackage.nm6;
import defpackage.ox6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.flags.i b;
    public final q0 c;
    public final com.yandex.passport.common.a d;
    public final n0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.flags.i iVar, q0 q0Var, com.yandex.passport.common.a aVar2, n0 n0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        iVar.getClass();
        q0Var.getClass();
        aVar2.getClass();
        n0Var.getClass();
        this.b = iVar;
        this.c = q0Var;
        this.d = aVar2;
        this.e = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2 A[Catch: Exception -> 0x0031, LOOP:0: B:12:0x009c->B:14:0x00a2, LOOP_END, TryCatch #0 {Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0093, B:12:0x009c, B:14:0x00a2, B:16:0x00d4, B:23:0x003d, B:25:0x0045, B:26:0x0073), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(w0 w0Var, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, cg6 cg6Var) {
        u0 u0Var;
        int i;
        com.yandex.passport.internal.database.diary.f fVar2;
        try {
            if (cg6Var instanceof u0) {
                u0Var = (u0) cg6Var;
                int i2 = u0Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    u0Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = u0Var.j;
                    nm6 nm6Var = nm6.a;
                    i = u0Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                            StringBuilder sb = new StringBuilder("Start uploading methods for day: [");
                            sb.append((Object) com.yandex.passport.common.time.a.g(j));
                            sb.append(", ");
                            sb.append((Object) com.yandex.passport.common.time.a.g(j2));
                            sb.append("] with upload ");
                            fVar2 = fVar;
                            sb.append(fVar2);
                            com.yandex.passport.common.logger.a.c(bVar, null, sb.toString(), 8);
                        } else {
                            fVar2 = fVar;
                        }
                        q0 q0Var = w0Var.c;
                        u0Var.l = 1;
                        obj = x97.V(((com.yandex.passport.common.coroutine.b) q0Var.b).f, new p0(q0Var, j, j2, fVar2, null, 0), u0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    List<f0> list = (List) obj;
                    for (f0 f0Var : list) {
                        String str = f0Var.a;
                        int i3 = f0Var.b;
                        n0 n0Var = w0Var.e;
                        n0Var.getClass();
                        str.getClass();
                        n0Var.n(new s6(t6.d, str), new com.yandex.passport.internal.report.a(str, 24), new com.yandex.passport.internal.report.a(i3, 23));
                    }
                    return new Integer(list.size());
                }
            }
            if (i != 0) {
            }
            List<f0> list2 = (List) obj;
            while (r2.hasNext()) {
            }
            return new Integer(list2.size());
        } catch (Exception e) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.d, null, String.valueOf(e.getMessage()), 8);
            }
            return new Integer(0);
        }
        u0Var = new u0(w0Var, cg6Var);
        Object obj2 = u0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = u0Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[Catch: Exception -> 0x0030, LOOP:0: B:12:0x009a->B:14:0x00a0, LOOP_END, TryCatch #0 {Exception -> 0x0030, blocks: (B:10:0x002c, B:11:0x0091, B:12:0x009a, B:14:0x00a0, B:16:0x00b4, B:23:0x003d, B:25:0x0045, B:26:0x0073), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(w0 w0Var, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, cg6 cg6Var) {
        v0 v0Var;
        int i;
        com.yandex.passport.internal.database.diary.f fVar2;
        try {
            if (cg6Var instanceof v0) {
                v0Var = (v0) cg6Var;
                int i2 = v0Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    v0Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = v0Var.j;
                    nm6 nm6Var = nm6.a;
                    i = v0Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                            StringBuilder sb = new StringBuilder("Start uploading parameters for day: [");
                            sb.append((Object) com.yandex.passport.common.time.a.g(j));
                            sb.append(", ");
                            sb.append((Object) com.yandex.passport.common.time.a.g(j2));
                            sb.append("] with upload ");
                            fVar2 = fVar;
                            sb.append(fVar2);
                            com.yandex.passport.common.logger.a.c(bVar, null, sb.toString(), 8);
                        } else {
                            fVar2 = fVar;
                        }
                        q0 q0Var = w0Var.c;
                        v0Var.l = 1;
                        obj = x97.V(((com.yandex.passport.common.coroutine.b) q0Var.b).f, new p0(q0Var, j, j2, fVar2, null, 1), v0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    List<g0> list = (List) obj;
                    for (g0 g0Var : list) {
                        String str = g0Var.a;
                        String str2 = g0Var.b;
                        String str3 = g0Var.c;
                        w0Var.e.v(str, g0Var.d, str2, str3);
                    }
                    return new Integer(list.size());
                }
            }
            if (i != 0) {
            }
            List<g0> list2 = (List) obj;
            while (r2.hasNext()) {
            }
            return new Integer(list2.size());
        } catch (Exception e) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.d, null, String.valueOf(e.getMessage()), 8);
            }
            return new Integer(0);
        }
        v0Var = new v0(w0Var, cg6Var);
        Object obj2 = v0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = v0Var.l;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ Object x(Object obj, rhw rhwVar) {
        return w(rhwVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(3:15|(1:17)|18)|19|20)(2:22|23))(2:24|25))(3:29|30|(4:32|(1:34)|35|36)(5:37|(1:39)|40|(1:42)(1:46)|(2:44|28)(1:45)))|26))|50|6|7|(0)(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (r15 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(Continuation continuation) {
        r0 r0Var;
        int i;
        w0 w0Var;
        int i2;
        if (continuation instanceof r0) {
            r0Var = (r0) continuation;
            int i3 = r0Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r0Var.n = i3 - Integer.MIN_VALUE;
                Object obj = r0Var.l;
                nm6 nm6Var = nm6.a;
                i = r0Var.n;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    if (!((Boolean) this.b.b(com.yandex.passport.internal.flags.o.G)).booleanValue()) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Skip uploading diary: Disabled by flag", 8);
                        }
                        return new z7o(new Integer(0));
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Start uploading diary", 8);
                    }
                    q0 q0Var = this.c;
                    this.d.getClass();
                    long a = com.yandex.passport.common.a.a() - com.yandex.plus.pay.ui.core.b.E(0, 253);
                    r0Var.j = this;
                    r0Var.k = 0;
                    r0Var.n = 1;
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) q0Var.b).f, new g84(q0Var, a, continuation2, 5), r0Var);
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    w0Var = this;
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object t7oVar = new Integer(((Number) obj).intValue());
                        r7o r7oVar2 = z7o.b;
                        Throwable a2 = z7o.a(t7oVar);
                        if (a2 != null) {
                            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Internal error catching to calling DiaryUploadDaoWrapper::deleteUploaded", a2);
                            }
                            this.e.u(a2, x0.DELETE_UPLOADED);
                        }
                        return new z7o(t7oVar);
                    }
                    i2 = r0Var.k;
                    w0Var = r0Var.j;
                    qgg.h0(obj);
                }
                r0Var.j = null;
                r0Var.k = i2;
                r0Var.n = 2;
                obj = w0Var.x(r0Var);
            }
        }
        r0Var = new r0(this, (cg6) continuation);
        Object obj2 = r0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = r0Var.n;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        r0Var.j = null;
        r0Var.k = i2;
        r0Var.n = 2;
        obj2 = w0Var.x(r0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x00d6, code lost:
    
        if (r0 == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00b5, code lost:
    
        if (r0 == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x033a, code lost:
    
        if (r0 == r9) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c3 A[Catch: Exception -> 0x0088, TRY_LEAVE, TryCatch #5 {Exception -> 0x0088, blocks: (B:30:0x0069, B:77:0x008d, B:78:0x00d9, B:81:0x00be, B:82:0x00de, B:84:0x00f5, B:85:0x0125, B:87:0x0137, B:89:0x013f, B:90:0x0149, B:92:0x0150, B:94:0x0158, B:95:0x0162, B:96:0x0165, B:112:0x0095, B:114:0x00ba, B:116:0x00c3, B:129:0x00a3), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c8 A[Catch: Exception -> 0x01a3, TryCatch #7 {Exception -> 0x01a3, blocks: (B:44:0x01c2, B:46:0x01c8, B:48:0x01e8, B:49:0x0223, B:99:0x016c, B:103:0x0181, B:105:0x018d, B:106:0x01a8), top: B:98:0x016c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f7 A[Catch: Exception -> 0x02e5, TryCatch #6 {Exception -> 0x02e5, blocks: (B:19:0x033d, B:43:0x02c4, B:57:0x02f7, B:58:0x030e, B:60:0x0314, B:62:0x0325, B:101:0x0365, B:107:0x0382, B:109:0x038c, B:110:0x0395), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5 A[Catch: Exception -> 0x0088, TryCatch #5 {Exception -> 0x0088, blocks: (B:30:0x0069, B:77:0x008d, B:78:0x00d9, B:81:0x00be, B:82:0x00de, B:84:0x00f5, B:85:0x0125, B:87:0x0137, B:89:0x013f, B:90:0x0149, B:92:0x0150, B:94:0x0158, B:95:0x0162, B:96:0x0165, B:112:0x0095, B:114:0x00ba, B:116:0x00c3, B:129:0x00a3), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137 A[Catch: Exception -> 0x0088, TryCatch #5 {Exception -> 0x0088, blocks: (B:30:0x0069, B:77:0x008d, B:78:0x00d9, B:81:0x00be, B:82:0x00de, B:84:0x00f5, B:85:0x0125, B:87:0x0137, B:89:0x013f, B:90:0x0149, B:92:0x0150, B:94:0x0158, B:95:0x0162, B:96:0x0165, B:112:0x0095, B:114:0x00ba, B:116:0x00c3, B:129:0x00a3), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150 A[Catch: Exception -> 0x0088, TryCatch #5 {Exception -> 0x0088, blocks: (B:30:0x0069, B:77:0x008d, B:78:0x00d9, B:81:0x00be, B:82:0x00de, B:84:0x00f5, B:85:0x0125, B:87:0x0137, B:89:0x013f, B:90:0x0149, B:92:0x0150, B:94:0x0158, B:95:0x0162, B:96:0x0165, B:112:0x0095, B:114:0x00ba, B:116:0x00c3, B:129:0x00a3), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v8, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v17, types: [kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0277 -> B:31:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(cg6 cg6Var) {
        s0 s0Var;
        int i;
        String str;
        Continuation continuation;
        Object V;
        ?? r15;
        Long l;
        Object V2;
        long b;
        long j;
        long j2;
        long j3;
        long j4;
        ArrayList arrayList;
        s0 s0Var2;
        long j5;
        int i2;
        int i3;
        Iterator it;
        w0 w0Var;
        int i4;
        long j6;
        q0 q0Var;
        w0 w0Var2 = this;
        try {
            try {
                if (cg6Var instanceof s0) {
                    s0Var = (s0) cg6Var;
                    int i5 = s0Var.w;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        s0Var.w = i5 - Integer.MIN_VALUE;
                        Object obj = s0Var.u;
                        nm6 nm6Var = nm6.a;
                        i = s0Var.w;
                        q0 q0Var2 = w0Var2.c;
                        if (i != 0) {
                            qgg.h0(obj);
                            int i6 = 1;
                            s0Var.w = 1;
                            continuation = null;
                            try {
                            } catch (Exception e) {
                                e = e;
                                r15 = continuation;
                                str = r15;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.d, str, String.valueOf(e.getMessage()), 8);
                                }
                                return new Integer(0);
                            }
                            try {
                                V = x97.V(((com.yandex.passport.common.coroutine.b) q0Var2.b).f, new o0(q0Var2, continuation, i6), s0Var);
                            } catch (Exception e2) {
                                e = e2;
                                r15 = 0;
                                str = r15;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                }
                                return new Integer(0);
                            }
                        } else if (i == 1) {
                            qgg.h0(obj);
                            V = obj;
                        } else {
                            if (i == 2) {
                                qgg.h0(obj);
                                V2 = obj;
                                l = (Long) V2;
                                if (l == null) {
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Nothing to upload", 8);
                                    }
                                    return new Integer(0);
                                }
                                long longValue = l.longValue();
                                b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, longValue);
                                w0Var2.d.getClass();
                                long a = com.yandex.passport.common.a.a();
                                j = a - b;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Try start uploading: lastUploadTime=" + ((Object) com.yandex.passport.common.time.a.g(b)) + ", now=" + ((Object) com.yandex.passport.common.time.a.g(a)) + ", interval=" + ((Object) com.yandex.passport.common.time.a.g(j)), 8);
                                }
                                int i7 = 14;
                                int i8 = 24;
                                s0 s0Var3 = s0Var;
                                if (Intrinsics.f(j, com.yandex.passport.common.time.a.c(24, 0, 0, 14)) < 0) {
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "It's not a time for upload a diary now.", 8);
                                    }
                                    return new Integer(0);
                                }
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "It's a good time to upload", 8);
                                }
                                Collection collection = c5b.a;
                                long j7 = b;
                                while (true) {
                                    long c = j7 + com.yandex.passport.common.time.a.c(i8, 0, 0, i7);
                                    try {
                                        Pair pair = new Pair(new com.yandex.passport.common.time.a(j7), new com.yandex.passport.common.time.a(a));
                                        if (Intrinsics.f(c, a) > 0) {
                                            break;
                                        }
                                        collection = CollectionsKt.h0(collection, pair);
                                        j7 = c;
                                        s0Var3 = s0Var3;
                                        q0Var2 = q0Var2;
                                        i7 = 14;
                                        i8 = 24;
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = null;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        }
                                        return new Integer(0);
                                    }
                                }
                                com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(bVar, null, "Uploading diary for intervals: " + collection, 10);
                                }
                                Collection collection2 = collection;
                                ArrayList arrayList2 = new ArrayList(v75.o(collection2, 10));
                                Iterator it2 = collection2.iterator();
                                j2 = b;
                                j3 = a;
                                j4 = j;
                                arrayList = arrayList2;
                                s0Var2 = s0Var3;
                                j5 = longValue;
                                i2 = 0;
                                i3 = 0;
                                it = it2;
                                if (it.hasNext()) {
                                }
                                return nm6Var;
                            }
                            if (i != 3) {
                                if (i != 4) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                try {
                                    qgg.h0(obj);
                                    w0Var = w0Var2;
                                    Integer num = new Integer(CollectionsKt.p0((Iterable) obj));
                                    int intValue = num.intValue();
                                    n0 n0Var = w0Var.e;
                                    n0Var.getClass();
                                    n0Var.n(v6.d, new com.yandex.passport.internal.report.a(intValue, 23));
                                    return num;
                                } catch (Exception e4) {
                                    e = e4;
                                    str = null;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    }
                                    return new Integer(0);
                                }
                            }
                            long j8 = s0Var.o;
                            long j9 = s0Var.n;
                            int i9 = s0Var.t;
                            int i10 = s0Var.s;
                            long j10 = s0Var.m;
                            j3 = s0Var.l;
                            long j11 = s0Var.k;
                            long j12 = s0Var.j;
                            Collection collection3 = s0Var.r;
                            Iterator it3 = s0Var.q;
                            Collection collection4 = s0Var.p;
                            qgg.h0(obj);
                            Iterator it4 = it3;
                            Object V3 = obj;
                            ArrayList arrayList3 = collection4;
                            long j13 = j11;
                            q0 q0Var3 = q0Var2;
                            ?? r14 = null;
                            ArrayList arrayList4 = collection3;
                            int i11 = i9;
                            s0 s0Var4 = s0Var;
                            long j14 = j12;
                            long j15 = j9;
                            long j16 = j8;
                            long j17 = j10;
                            long j18 = j3;
                            try {
                                try {
                                    try {
                                        com.yandex.passport.internal.database.diary.f fVar = (com.yandex.passport.internal.database.diary.f) V3;
                                        q0 q0Var4 = q0Var3;
                                        s0 s0Var5 = s0Var4;
                                        arrayList4.add(new Pair(x97.p(gld.e(s0Var4.getContext()), r15, r15, new t0(w0Var2, j15, j16, fVar, null, 0), 3), x97.p(gld.e(s0Var4.getContext()), r15, r15, new t0(this, j15, j16, fVar, null, 1), 3)));
                                        j5 = j14;
                                        i2 = i10;
                                        j3 = j18;
                                        i3 = i11;
                                        j4 = j17;
                                        j2 = j13;
                                        it = it4;
                                        q0Var2 = q0Var4;
                                        arrayList = r28;
                                        s0Var2 = s0Var5;
                                        if (it.hasNext()) {
                                            Pair pair2 = (Pair) it.next();
                                            ArrayList arrayList5 = arrayList;
                                            nm6 nm6Var2 = nm6Var;
                                            long j19 = ((com.yandex.passport.common.time.a) pair2.a).a;
                                            long j20 = ((com.yandex.passport.common.time.a) pair2.b).a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                                                q0Var = q0Var2;
                                                StringBuilder sb = new StringBuilder();
                                                i4 = i3;
                                                sb.append("Uploading diary for interval: [");
                                                sb.append((Object) com.yandex.passport.common.time.a.g(j19));
                                                sb.append(", ");
                                                sb.append((Object) com.yandex.passport.common.time.a.g(j20));
                                                sb.append(']');
                                                j6 = j4;
                                                com.yandex.passport.common.logger.a.c(bVar2, null, sb.toString(), 8);
                                            } else {
                                                i4 = i3;
                                                j6 = j4;
                                                q0Var = q0Var2;
                                            }
                                            com.yandex.passport.internal.database.diary.f fVar2 = new com.yandex.passport.internal.database.diary.f(0L, j20);
                                            s0Var2.p = arrayList5;
                                            s0Var2.q = it;
                                            s0Var2.r = arrayList5;
                                            s0Var2.j = j5;
                                            s0Var2.k = j2;
                                            s0Var2.l = j3;
                                            long j21 = j6;
                                            s0Var2.m = j21;
                                            s0Var2.s = i2;
                                            int i12 = i4;
                                            s0Var2.t = i12;
                                            Iterator it5 = it;
                                            s0Var2.n = j19;
                                            s0Var2.o = j20;
                                            int i13 = i2;
                                            s0Var2.w = 3;
                                            i11 = i12;
                                            q0Var3 = q0Var;
                                            r14 = null;
                                            V3 = x97.V(((com.yandex.passport.common.coroutine.b) q0Var3.b).f, new j9w(q0Var3, fVar2, r14, 27), s0Var2);
                                            nm6Var = nm6Var2;
                                            if (V3 != nm6Var) {
                                                j17 = j21;
                                                arrayList3 = arrayList5;
                                                s0Var4 = s0Var2;
                                                i10 = i13;
                                                j15 = j19;
                                                arrayList4 = arrayList3;
                                                j14 = j5;
                                                j16 = j20;
                                                it4 = it5;
                                                j13 = j2;
                                                long j182 = j3;
                                                com.yandex.passport.internal.database.diary.f fVar3 = (com.yandex.passport.internal.database.diary.f) V3;
                                                q0 q0Var42 = q0Var3;
                                                ArrayList arrayList6 = arrayList3;
                                                r15 = r14;
                                                w0Var2 = this;
                                                s0 s0Var52 = s0Var4;
                                                arrayList4.add(new Pair(x97.p(gld.e(s0Var4.getContext()), r15, r15, new t0(w0Var2, j15, j16, fVar3, null, 0), 3), x97.p(gld.e(s0Var4.getContext()), r15, r15, new t0(this, j15, j16, fVar3, null, 1), 3)));
                                                j5 = j14;
                                                i2 = i10;
                                                j3 = j182;
                                                i3 = i11;
                                                j4 = j17;
                                                j2 = j13;
                                                it = it4;
                                                q0Var2 = q0Var42;
                                                arrayList = arrayList6;
                                                s0Var2 = s0Var52;
                                                if (it.hasNext()) {
                                                    w0Var = this;
                                                    ArrayList<Pair> arrayList7 = arrayList;
                                                    arrayList7.getClass();
                                                    ArrayList arrayList8 = new ArrayList();
                                                    for (Pair pair3 : arrayList7) {
                                                        arrayList8.add(pair3.a);
                                                        arrayList8.add(pair3.b);
                                                    }
                                                    s0Var2.p = null;
                                                    s0Var2.q = null;
                                                    s0Var2.r = null;
                                                    s0Var2.j = j5;
                                                    s0Var2.k = j2;
                                                    s0Var2.l = j3;
                                                    s0Var2.m = j4;
                                                    s0Var2.w = 4;
                                                    obj = ox6.v(arrayList8, s0Var2);
                                                }
                                            }
                                        }
                                        return nm6Var;
                                    } catch (Exception e5) {
                                        e = e5;
                                        str = r15;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        }
                                        return new Integer(0);
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    str = r15;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    }
                                    return new Integer(0);
                                }
                                ArrayList arrayList62 = arrayList3;
                                r15 = r14;
                                w0Var2 = this;
                            } catch (Exception e7) {
                                e = e7;
                                str = r14;
                            }
                        }
                        l = (Long) V;
                        if (l == null) {
                            s0Var.w = 2;
                            continuation = null;
                            V2 = x97.V(((com.yandex.passport.common.coroutine.b) q0Var2.b).f, new o0(q0Var2, continuation, 0), s0Var);
                        }
                        long longValue2 = l.longValue();
                        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, longValue2);
                        w0Var2.d.getClass();
                        long a2 = com.yandex.passport.common.a.a();
                        j = a2 - b;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        int i72 = 14;
                        int i82 = 24;
                        s0 s0Var32 = s0Var;
                        if (Intrinsics.f(j, com.yandex.passport.common.time.a.c(24, 0, 0, 14)) < 0) {
                        }
                    }
                }
                if (i != 0) {
                }
                l = (Long) V;
                if (l == null) {
                }
                long longValue22 = l.longValue();
                b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, longValue22);
                w0Var2.d.getClass();
                long a22 = com.yandex.passport.common.a.a();
                j = a22 - b;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                int i722 = 14;
                int i822 = 24;
                s0 s0Var322 = s0Var;
                if (Intrinsics.f(j, com.yandex.passport.common.time.a.c(24, 0, 0, 14)) < 0) {
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
        }
        s0Var = new s0(w0Var2, cg6Var);
        Object obj2 = s0Var.u;
        nm6 nm6Var3 = nm6.a;
        i = s0Var.w;
        q0 q0Var22 = w0Var2.c;
    }
}
