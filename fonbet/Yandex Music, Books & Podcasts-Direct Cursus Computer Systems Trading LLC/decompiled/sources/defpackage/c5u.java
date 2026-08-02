package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c5u implements u4u {
    public static final /* synthetic */ s9f[] i;
    public final tf6 a;
    public final frt b;
    public final p3u c;
    public final e1g d;
    public final wt5 e;
    public final rhp f;
    public final xdr g;
    public final x0q h;

    static {
        opi opiVar = new opi(c5u.class, "updateLikesJob", "getUpdateLikesJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar};
    }

    public c5u(tf6 tf6Var, frt frtVar, p3u p3uVar, e1g e1gVar, ehv ehvVar, wt5 wt5Var) {
        p3uVar.getClass();
        e1gVar.getClass();
        this.a = tf6Var;
        this.b = frtVar;
        this.c = p3uVar;
        this.d = e1gVar;
        this.e = wt5Var;
        this.f = new rhp();
        this.g = ydr.a(null);
        this.h = y0q.b(0, 0, null, 7);
        ox6.B(q6k.m(frtVar.g(), new d4u(10), q6k.g), tf6Var, new lot(6, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[LOOP:0: B:21:0x006e->B:23:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[LOOP:1: B:26:0x008a->B:28:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c5u c5uVar, String str, Continuation continuation) {
        v4u v4uVar;
        Object obj;
        int i2;
        String str2;
        HashMap hashMap;
        Iterator it;
        Iterator it2;
        HashMap hashMap2;
        xdr xdrVar = c5uVar.g;
        if (continuation instanceof v4u) {
            v4uVar = (v4u) continuation;
            int i3 = v4uVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v4uVar.n = i3 - Integer.MIN_VALUE;
                Object obj2 = v4uVar.l;
                obj = nm6.a;
                i2 = v4uVar.n;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    ssg.a(4, "VideoClipLikesCenter", "Initializing video clip likes from DB", null);
                    HashMap hashMap3 = new HashMap();
                    p3u p3uVar = c5uVar.c;
                    v4uVar.j = str;
                    v4uVar.k = hashMap3;
                    v4uVar.n = 1;
                    Object e = ((b4u) p3uVar).e(str, v4uVar);
                    if (e != obj) {
                        str2 = str;
                        hashMap = hashMap3;
                        obj2 = e;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap2 = v4uVar.k;
                    qgg.h0(obj2);
                    if (xdrVar.getValue() == null) {
                        xdrVar.l(hashMap2);
                    }
                    return Unit.a;
                }
                hashMap = v4uVar.k;
                str2 = v4uVar.j;
                qgg.h0(obj2);
                s4u s4uVar = (s4u) obj2;
                it = s4uVar.a.iterator();
                while (it.hasNext()) {
                    hashMap.put(((r4u) it.next()).a, j1g.a);
                }
                it2 = s4uVar.b.iterator();
                while (it2.hasNext()) {
                    hashMap.put(((r4u) it2.next()).a, j1g.c);
                }
                v4uVar.j = null;
                v4uVar.k = hashMap;
                v4uVar.n = 2;
                if (c5uVar.g(str2, hashMap, v4uVar) != obj) {
                    hashMap2 = hashMap;
                    if (xdrVar.getValue() == null) {
                    }
                    return Unit.a;
                }
                return obj;
            }
        }
        v4uVar = new v4u(c5uVar, continuation);
        Object obj22 = v4uVar.l;
        obj = nm6.a;
        i2 = v4uVar.n;
        if (i2 != 0) {
        }
        s4u s4uVar2 = (s4u) obj22;
        it = s4uVar2.a.iterator();
        while (it.hasNext()) {
        }
        it2 = s4uVar2.b.iterator();
        while (it2.hasNext()) {
        }
        v4uVar.j = null;
        v4uVar.k = hashMap;
        v4uVar.n = 2;
        if (c5uVar.g(str2, hashMap, v4uVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(String str, cg6 cg6Var) {
        w4u w4uVar;
        int i2;
        if (cg6Var instanceof w4u) {
            w4uVar = (w4u) cg6Var;
            int i3 = w4uVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w4uVar.m = i3 - Integer.MIN_VALUE;
                Object obj = w4uVar.k;
                nm6 nm6Var = nm6.a;
                i2 = w4uVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(this.g, 18);
                    w4uVar.j = str;
                    w4uVar.m = 1;
                    obj = zsd.g0(bcaVar, w4uVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = w4uVar.j;
                    qgg.h0(obj);
                }
                j1g j1gVar = (j1g) ((Map) obj).get(str);
                return j1gVar != null ? j1g.b : j1gVar;
            }
        }
        w4uVar = new w4u(this, cg6Var);
        Object obj2 = w4uVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = w4uVar.m;
        if (i2 != 0) {
        }
        j1g j1gVar2 = (j1g) ((Map) obj2).get(str);
        if (j1gVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x013e, code lost:
    
        if (r9.l(r8, r3, r4) != r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x019c, code lost:
    
        if (r9.l(r8, r3, r4) != r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01f8, code lost:
    
        if (r9.l(r8, r3, r4) != r5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(x1u x1uVar, j1g j1gVar, long j, cg6 cg6Var) {
        z4u z4uVar;
        int i2;
        long j2;
        x1u x1uVar2;
        int i3;
        x1u x1uVar3;
        long j3;
        int ordinal;
        x1u x1uVar4;
        long j4;
        int i4;
        String str;
        int i5;
        x1u x1uVar5;
        long j5;
        int i6;
        String str2;
        int i7;
        x1u x1uVar6;
        long j6;
        int i8;
        String str3;
        int i9;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof z4u) {
            z4uVar = (z4u) cg6Var;
            int i10 = z4uVar.s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z4uVar.s = i10 - Integer.MIN_VALUE;
                Object obj = z4uVar.q;
                Object obj2 = nm6.a;
                i2 = z4uVar.s;
                e1g e1gVar = this.d;
                int i11 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        String str4 = x1uVar.a;
                        z4uVar.j = x1uVar;
                        z4uVar.k = j1gVar2;
                        z4uVar.m = j;
                        z4uVar.s = 1;
                        obj = f(str4, j1gVar2, z4uVar);
                        if (obj != obj2) {
                            j2 = j;
                            x1uVar2 = x1uVar;
                            if (!((Boolean) obj).booleanValue()) {
                                z4uVar.j = x1uVar2;
                                z4uVar.k = j1gVar2;
                                z4uVar.m = j2;
                                z4uVar.n = 0;
                                z4uVar.s = 2;
                                obj = this.b.f(z4uVar);
                                if (obj != obj2) {
                                    i3 = 0;
                                    x1uVar3 = x1uVar2;
                                    j3 = j2;
                                    String str5 = ((xxq) obj).a;
                                    str5.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    p3u p3uVar = this.c;
                                    if (ordinal != 0) {
                                        x1u a = x1u.a(x1uVar3, j1g.a, new Date(j3));
                                        z4uVar.j = x1uVar3;
                                        z4uVar.k = null;
                                        z4uVar.l = str5;
                                        z4uVar.m = j3;
                                        z4uVar.n = i3;
                                        z4uVar.o = 0;
                                        z4uVar.p = 0;
                                        z4uVar.s = 3;
                                        b4u b4uVar = (b4u) p3uVar;
                                        b4uVar.getClass();
                                        Object c = b4uVar.c(str5, t75.c(a), z4uVar);
                                        if (c != obj2) {
                                            c = Unit.a;
                                        }
                                        if (c != obj2) {
                                            long j7 = j3;
                                            x1uVar4 = x1uVar3;
                                            j4 = j7;
                                            i4 = i3;
                                            str = str5;
                                            i5 = 0;
                                            p0g p0gVar = new p0g(q0g.a, x1uVar4.a, j4);
                                            z4uVar.j = null;
                                            z4uVar.k = null;
                                            z4uVar.l = null;
                                            z4uVar.m = j4;
                                            z4uVar.n = i4;
                                            z4uVar.o = i11;
                                            z4uVar.p = i5;
                                            z4uVar.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new r4u(x1uVar3.a, j1g.b, new Date(j3)));
                                        z4uVar.j = x1uVar3;
                                        z4uVar.k = null;
                                        z4uVar.l = str5;
                                        z4uVar.m = j3;
                                        z4uVar.n = i3;
                                        z4uVar.o = 0;
                                        z4uVar.p = 0;
                                        z4uVar.s = 5;
                                        if (((b4u) p3uVar).m(str5, c2, z4uVar) != obj2) {
                                            long j8 = j3;
                                            x1uVar5 = x1uVar3;
                                            j5 = j8;
                                            i6 = i3;
                                            str2 = str5;
                                            i7 = 0;
                                            p0g p0gVar2 = new p0g(q0g.b, x1uVar5.a, j5);
                                            z4uVar.j = null;
                                            z4uVar.k = null;
                                            z4uVar.l = null;
                                            z4uVar.m = j5;
                                            z4uVar.n = i6;
                                            z4uVar.o = i11;
                                            z4uVar.p = i7;
                                            z4uVar.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        x1u a2 = x1u.a(x1uVar3, j1g.c, new Date(j3));
                                        z4uVar.j = x1uVar3;
                                        z4uVar.k = null;
                                        z4uVar.l = str5;
                                        z4uVar.m = j3;
                                        z4uVar.n = i3;
                                        z4uVar.o = 0;
                                        z4uVar.p = 0;
                                        z4uVar.s = 7;
                                        b4u b4uVar2 = (b4u) p3uVar;
                                        b4uVar2.getClass();
                                        Object c3 = b4uVar2.c(str5, t75.c(a2), z4uVar);
                                        if (c3 != obj2) {
                                            c3 = Unit.a;
                                        }
                                        if (c3 != obj2) {
                                            long j9 = j3;
                                            x1uVar6 = x1uVar3;
                                            j6 = j9;
                                            i8 = i3;
                                            str3 = str5;
                                            i9 = 0;
                                            p0g p0gVar3 = new p0g(q0g.c, x1uVar6.a, j6);
                                            z4uVar.j = null;
                                            z4uVar.k = null;
                                            z4uVar.l = null;
                                            z4uVar.m = j6;
                                            z4uVar.n = i8;
                                            z4uVar.o = i11;
                                            z4uVar.p = i9;
                                            z4uVar.s = 8;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 1:
                        long j10 = z4uVar.m;
                        j1g j1gVar3 = z4uVar.k;
                        x1uVar2 = z4uVar.j;
                        qgg.h0(obj);
                        j2 = j10;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = z4uVar.n;
                        j3 = z4uVar.m;
                        j1gVar2 = z4uVar.k;
                        x1uVar3 = z4uVar.j;
                        qgg.h0(obj);
                        String str52 = ((xxq) obj).a;
                        str52.getClass();
                        ordinal = j1gVar2.ordinal();
                        p3u p3uVar2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i12 = z4uVar.p;
                        int i13 = z4uVar.o;
                        i4 = z4uVar.n;
                        j4 = z4uVar.m;
                        str = z4uVar.l;
                        x1uVar4 = z4uVar.j;
                        qgg.h0(obj);
                        i11 = i13;
                        i5 = i12;
                        p0g p0gVar4 = new p0g(q0g.a, x1uVar4.a, j4);
                        z4uVar.j = null;
                        z4uVar.k = null;
                        z4uVar.l = null;
                        z4uVar.m = j4;
                        z4uVar.n = i4;
                        z4uVar.o = i11;
                        z4uVar.p = i5;
                        z4uVar.s = 4;
                        break;
                    case 4:
                    case 6:
                    case 8:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i14 = z4uVar.p;
                        int i15 = z4uVar.o;
                        i6 = z4uVar.n;
                        j5 = z4uVar.m;
                        str2 = z4uVar.l;
                        x1uVar5 = z4uVar.j;
                        qgg.h0(obj);
                        i11 = i15;
                        i7 = i14;
                        p0g p0gVar22 = new p0g(q0g.b, x1uVar5.a, j5);
                        z4uVar.j = null;
                        z4uVar.k = null;
                        z4uVar.l = null;
                        z4uVar.m = j5;
                        z4uVar.n = i6;
                        z4uVar.o = i11;
                        z4uVar.p = i7;
                        z4uVar.s = 6;
                        break;
                    case 7:
                        int i16 = z4uVar.p;
                        int i17 = z4uVar.o;
                        i8 = z4uVar.n;
                        j6 = z4uVar.m;
                        str3 = z4uVar.l;
                        x1uVar6 = z4uVar.j;
                        qgg.h0(obj);
                        i11 = i17;
                        i9 = i16;
                        p0g p0gVar32 = new p0g(q0g.c, x1uVar6.a, j6);
                        z4uVar.j = null;
                        z4uVar.k = null;
                        z4uVar.l = null;
                        z4uVar.m = j6;
                        z4uVar.n = i8;
                        z4uVar.o = i11;
                        z4uVar.p = i9;
                        z4uVar.s = 8;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        z4uVar = new z4u(this, cg6Var);
        Object obj3 = z4uVar.q;
        Object obj22 = nm6.a;
        i2 = z4uVar.s;
        e1g e1gVar2 = this.d;
        int i112 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012b, code lost:
    
        if (r9.l(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0183, code lost:
    
        if (r9.l(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01d4, code lost:
    
        if (r9.l(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, j1g j1gVar, long j, cg6 cg6Var) {
        y4u y4uVar;
        int i2;
        long j2;
        String str2;
        int i3;
        String str3;
        long j3;
        int ordinal;
        String str4;
        long j4;
        int i4;
        String str5;
        int i5;
        String str6;
        long j5;
        int i6;
        String str7;
        int i7;
        String str8;
        long j6;
        int i8;
        String str9;
        int i9;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof y4u) {
            y4uVar = (y4u) cg6Var;
            int i10 = y4uVar.s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                y4uVar.s = i10 - Integer.MIN_VALUE;
                Object obj = y4uVar.q;
                Object obj2 = nm6.a;
                i2 = y4uVar.s;
                e1g e1gVar = this.d;
                int i11 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        y4uVar.j = str;
                        y4uVar.k = j1gVar2;
                        y4uVar.m = j;
                        y4uVar.s = 1;
                        obj = f(str, j1gVar2, y4uVar);
                        if (obj != obj2) {
                            j2 = j;
                            str2 = str;
                            if (!((Boolean) obj).booleanValue()) {
                                y4uVar.j = str2;
                                y4uVar.k = j1gVar2;
                                y4uVar.m = j2;
                                y4uVar.n = 0;
                                y4uVar.s = 2;
                                obj = this.b.f(y4uVar);
                                if (obj != obj2) {
                                    i3 = 0;
                                    str3 = str2;
                                    j3 = j2;
                                    String str10 = ((xxq) obj).a;
                                    str10.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    p3u p3uVar = this.c;
                                    if (ordinal != 0) {
                                        List c = t75.c(new r4u(str3, j1g.a, new Date(j3)));
                                        y4uVar.j = str3;
                                        y4uVar.k = null;
                                        y4uVar.l = str10;
                                        y4uVar.m = j3;
                                        y4uVar.n = i3;
                                        y4uVar.o = 0;
                                        y4uVar.p = 0;
                                        y4uVar.s = 3;
                                        if (((b4u) p3uVar).m(str10, c, y4uVar) != obj2) {
                                            long j7 = j3;
                                            str4 = str3;
                                            j4 = j7;
                                            i4 = i3;
                                            str5 = str10;
                                            i5 = 0;
                                            p0g p0gVar = new p0g(q0g.a, str4, j4);
                                            y4uVar.j = null;
                                            y4uVar.k = null;
                                            y4uVar.l = null;
                                            y4uVar.m = j4;
                                            y4uVar.n = i4;
                                            y4uVar.o = i11;
                                            y4uVar.p = i5;
                                            y4uVar.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new r4u(str3, j1g.b, new Date(j3)));
                                        y4uVar.j = str3;
                                        y4uVar.k = null;
                                        y4uVar.l = str10;
                                        y4uVar.m = j3;
                                        y4uVar.n = i3;
                                        y4uVar.o = 0;
                                        y4uVar.p = 0;
                                        y4uVar.s = 5;
                                        if (((b4u) p3uVar).m(str10, c2, y4uVar) != obj2) {
                                            long j8 = j3;
                                            str6 = str3;
                                            j5 = j8;
                                            i6 = i3;
                                            str7 = str10;
                                            i7 = 0;
                                            p0g p0gVar2 = new p0g(q0g.b, str6, j5);
                                            y4uVar.j = null;
                                            y4uVar.k = null;
                                            y4uVar.l = null;
                                            y4uVar.m = j5;
                                            y4uVar.n = i6;
                                            y4uVar.o = i11;
                                            y4uVar.p = i7;
                                            y4uVar.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        List c3 = t75.c(new r4u(str3, j1g.c, new Date(j3)));
                                        y4uVar.j = str3;
                                        y4uVar.k = null;
                                        y4uVar.l = str10;
                                        y4uVar.m = j3;
                                        y4uVar.n = i3;
                                        y4uVar.o = 0;
                                        y4uVar.p = 0;
                                        y4uVar.s = 7;
                                        if (((b4u) p3uVar).m(str10, c3, y4uVar) != obj2) {
                                            long j9 = j3;
                                            str8 = str3;
                                            j6 = j9;
                                            i8 = i3;
                                            str9 = str10;
                                            i9 = 0;
                                            p0g p0gVar3 = new p0g(q0g.c, str8, j6);
                                            y4uVar.j = null;
                                            y4uVar.k = null;
                                            y4uVar.l = null;
                                            y4uVar.m = j6;
                                            y4uVar.n = i8;
                                            y4uVar.o = i11;
                                            y4uVar.p = i9;
                                            y4uVar.s = 8;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 1:
                        long j10 = y4uVar.m;
                        j1g j1gVar3 = y4uVar.k;
                        str2 = y4uVar.j;
                        qgg.h0(obj);
                        j2 = j10;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = y4uVar.n;
                        j3 = y4uVar.m;
                        j1gVar2 = y4uVar.k;
                        str3 = y4uVar.j;
                        qgg.h0(obj);
                        String str102 = ((xxq) obj).a;
                        str102.getClass();
                        ordinal = j1gVar2.ordinal();
                        p3u p3uVar2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i12 = y4uVar.p;
                        int i13 = y4uVar.o;
                        i4 = y4uVar.n;
                        j4 = y4uVar.m;
                        str5 = y4uVar.l;
                        str4 = y4uVar.j;
                        qgg.h0(obj);
                        i11 = i13;
                        i5 = i12;
                        p0g p0gVar4 = new p0g(q0g.a, str4, j4);
                        y4uVar.j = null;
                        y4uVar.k = null;
                        y4uVar.l = null;
                        y4uVar.m = j4;
                        y4uVar.n = i4;
                        y4uVar.o = i11;
                        y4uVar.p = i5;
                        y4uVar.s = 4;
                        break;
                    case 4:
                    case 6:
                    case 8:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i14 = y4uVar.p;
                        int i15 = y4uVar.o;
                        i6 = y4uVar.n;
                        j5 = y4uVar.m;
                        str7 = y4uVar.l;
                        str6 = y4uVar.j;
                        qgg.h0(obj);
                        i11 = i15;
                        i7 = i14;
                        p0g p0gVar22 = new p0g(q0g.b, str6, j5);
                        y4uVar.j = null;
                        y4uVar.k = null;
                        y4uVar.l = null;
                        y4uVar.m = j5;
                        y4uVar.n = i6;
                        y4uVar.o = i11;
                        y4uVar.p = i7;
                        y4uVar.s = 6;
                        break;
                    case 7:
                        int i16 = y4uVar.p;
                        int i17 = y4uVar.o;
                        i8 = y4uVar.n;
                        j6 = y4uVar.m;
                        str9 = y4uVar.l;
                        str8 = y4uVar.j;
                        qgg.h0(obj);
                        i11 = i17;
                        i9 = i16;
                        p0g p0gVar32 = new p0g(q0g.c, str8, j6);
                        y4uVar.j = null;
                        y4uVar.k = null;
                        y4uVar.l = null;
                        y4uVar.m = j6;
                        y4uVar.n = i8;
                        y4uVar.o = i11;
                        y4uVar.p = i9;
                        y4uVar.s = 8;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        y4uVar = new y4u(this, cg6Var);
        Object obj3 = y4uVar.q;
        Object obj22 = nm6.a;
        i2 = y4uVar.s;
        e1g e1gVar2 = this.d;
        int i112 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
    
        if (r11.h.emit(r14, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, j1g j1gVar, cg6 cg6Var) {
        a5u a5uVar;
        Object obj;
        int i2;
        String str2;
        j1g j1gVar2;
        if (cg6Var instanceof a5u) {
            a5uVar = (a5u) cg6Var;
            int i3 = a5uVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a5uVar.n = i3 - Integer.MIN_VALUE;
                obj = a5uVar.l;
                Object obj2 = nm6.a;
                i2 = a5uVar.n;
                xdr xdrVar = this.g;
                if (i2 != 0) {
                    qgg.h0(obj);
                    a5uVar.j = str;
                    a5uVar.k = j1gVar;
                    a5uVar.n = 1;
                    obj = c(str, a5uVar);
                } else if (i2 == 1) {
                    j1gVar = a5uVar.k;
                    str = a5uVar.j;
                    qgg.h0(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            qgg.h0(obj);
                            return Boolean.TRUE;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j1gVar2 = a5uVar.k;
                    str2 = a5uVar.j;
                    qgg.h0(obj);
                    Map map = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(str2, map) : uah.j(map, new Pair(str2, j1gVar2)));
                    str2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, str2);
                    t4u t4uVar = new t4u(j1gVar2, str2);
                    a5uVar.j = null;
                    a5uVar.k = null;
                    a5uVar.n = 3;
                }
                if (obj != j1gVar) {
                    ssg.a(4, "VideoClipLikesCenter", "Change video clip " + str + " like state to " + j1gVar + " skipped", null);
                    return Boolean.FALSE;
                }
                ssg.a(4, "VideoClipLikesCenter", "Change video clip " + str + " like state to " + j1gVar, null);
                bca bcaVar = new bca(xdrVar, 18);
                a5uVar.j = str;
                a5uVar.k = j1gVar;
                a5uVar.n = 2;
                obj = zsd.g0(bcaVar, a5uVar);
                if (obj != obj2) {
                    j1g j1gVar3 = j1gVar;
                    str2 = str;
                    j1gVar2 = j1gVar3;
                    Map map2 = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(str2, map2) : uah.j(map2, new Pair(str2, j1gVar2)));
                    str2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, str2);
                    t4u t4uVar2 = new t4u(j1gVar2, str2);
                    a5uVar.j = null;
                    a5uVar.k = null;
                    a5uVar.n = 3;
                }
                return obj2;
            }
        }
        a5uVar = new a5u(this, cg6Var);
        obj = a5uVar.l;
        Object obj22 = nm6.a;
        i2 = a5uVar.n;
        xdr xdrVar2 = this.g;
        if (i2 != 0) {
        }
        if (obj != j1gVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, HashMap hashMap, cg6 cg6Var) {
        b5u b5uVar;
        int i2;
        if (cg6Var instanceof b5u) {
            b5uVar = (b5u) cg6Var;
            int i3 = b5uVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b5uVar.m = i3 - Integer.MIN_VALUE;
                Object obj = b5uVar.k;
                Object obj2 = nm6.a;
                i2 = b5uVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    b5uVar.j = hashMap;
                    b5uVar.m = 1;
                    obj = this.d.h(str, b5uVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap = b5uVar.j;
                    qgg.h0(obj);
                }
                for (p0g p0gVar : (List) obj) {
                    q0g q0gVar = p0gVar.a;
                    String str2 = p0gVar.b;
                    int ordinal = q0gVar.ordinal();
                    if (ordinal == 0) {
                        hashMap.put(str2, j1g.a);
                    } else if (ordinal == 1) {
                        hashMap.remove(str2);
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        hashMap.put(str2, j1g.c);
                    }
                }
                return Unit.a;
            }
        }
        b5uVar = new b5u(this, cg6Var);
        Object obj3 = b5uVar.k;
        Object obj22 = nm6.a;
        i2 = b5uVar.m;
        if (i2 != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.a;
    }
}
