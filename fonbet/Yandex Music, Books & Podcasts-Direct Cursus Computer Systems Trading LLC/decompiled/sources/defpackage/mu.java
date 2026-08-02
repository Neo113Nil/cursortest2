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
public final class mu implements cu {
    public static final /* synthetic */ s9f[] i;
    public final tf6 a;
    public final frt b;
    public final et c;
    public final e1g d;
    public final wt5 e;
    public final rhp f;
    public final xdr g;
    public final x0q h;

    static {
        opi opiVar = new opi(mu.class, "updateLikesJob", "getUpdateLikesJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar};
    }

    public mu(tf6 tf6Var, frt frtVar, et etVar, e1g e1gVar, ehv ehvVar, wt5 wt5Var) {
        etVar.getClass();
        e1gVar.getClass();
        this.a = tf6Var;
        this.b = frtVar;
        this.c = etVar;
        this.d = e1gVar;
        this.e = wt5Var;
        this.f = new rhp();
        this.g = ydr.a(null);
        this.h = y0q.b(0, 0, null, 7);
        ox6.B(q6k.m(frtVar.g(), new u4(20), q6k.g), tf6Var, new ri(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[LOOP:0: B:21:0x0067->B:23:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mu muVar, String str, Continuation continuation) {
        du duVar;
        Object obj;
        int i2;
        String str2;
        HashMap hashMap;
        Iterator it;
        HashMap hashMap2;
        xdr xdrVar = muVar.g;
        if (continuation instanceof du) {
            duVar = (du) continuation;
            int i3 = duVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                duVar.n = i3 - Integer.MIN_VALUE;
                Object obj2 = duVar.l;
                obj = nm6.a;
                i2 = duVar.n;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    ssg.a(4, "AlbumLikesCenter", "Initializing album likes from DB", null);
                    HashMap hashMap3 = new HashMap();
                    et etVar = muVar.c;
                    duVar.j = str;
                    duVar.k = hashMap3;
                    duVar.n = 1;
                    Object i4 = etVar.i(str, duVar);
                    if (i4 != obj) {
                        str2 = str;
                        hashMap = hashMap3;
                        obj2 = i4;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap2 = duVar.k;
                    qgg.h0(obj2);
                    if (xdrVar.getValue() == null) {
                        xdrVar.l(hashMap2);
                    }
                    return Unit.a;
                }
                hashMap = duVar.k;
                str2 = duVar.j;
                qgg.h0(obj2);
                it = ((Iterable) obj2).iterator();
                while (it.hasNext()) {
                    hashMap.put(((q1g) it.next()).a, j1g.a);
                }
                duVar.j = null;
                duVar.k = hashMap;
                duVar.n = 2;
                if (muVar.h(str2, hashMap, duVar) != obj) {
                    hashMap2 = hashMap;
                    if (xdrVar.getValue() == null) {
                    }
                    return Unit.a;
                }
                return obj;
            }
        }
        duVar = new du(muVar, continuation);
        Object obj22 = duVar.l;
        obj = nm6.a;
        i2 = duVar.n;
        if (i2 != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (it.hasNext()) {
        }
        duVar.j = null;
        duVar.k = hashMap;
        duVar.n = 2;
        if (muVar.h(str2, hashMap, duVar) != obj) {
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
        eu euVar;
        int i2;
        if (cg6Var instanceof eu) {
            euVar = (eu) cg6Var;
            int i3 = euVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                euVar.m = i3 - Integer.MIN_VALUE;
                Object obj = euVar.k;
                nm6 nm6Var = nm6.a;
                i2 = euVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(this.g, 18);
                    euVar.j = str;
                    euVar.m = 1;
                    obj = zsd.g0(bcaVar, euVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = euVar.j;
                    qgg.h0(obj);
                }
                j1g j1gVar = (j1g) ((Map) obj).get(str);
                return j1gVar != null ? j1g.b : j1gVar;
            }
        }
        euVar = new eu(this, cg6Var);
        Object obj2 = euVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = euVar.m;
        if (i2 != 0) {
        }
        j1g j1gVar2 = (j1g) ((Map) obj2).get(str);
        if (j1gVar2 != null) {
        }
    }

    public final pjc d(String str) {
        str.getClass();
        return zsd.b0(new gu(new bca(this.g, 18), str, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0129, code lost:
    
        if (r7.i(r6, r3, r4) != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0181, code lost:
    
        if (r7.i(r6, r3, r4) != r5) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(oq oqVar, j1g j1gVar, long j, cg6 cg6Var) {
        iu iuVar;
        int i2;
        long j2;
        oq oqVar2;
        int i3;
        oq oqVar3;
        long j3;
        int ordinal;
        int i4;
        int i5;
        long j4;
        oq oqVar4;
        String str;
        int i6;
        int i7;
        long j5;
        oq oqVar5;
        String str2;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof iu) {
            iuVar = (iu) cg6Var;
            int i8 = iuVar.s;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iuVar.s = i8 - Integer.MIN_VALUE;
                Object obj = iuVar.q;
                Object obj2 = nm6.a;
                i2 = iuVar.s;
                e1g e1gVar = this.d;
                int i9 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        String str3 = oqVar.a;
                        iuVar.j = oqVar;
                        iuVar.k = j1gVar2;
                        iuVar.m = j;
                        iuVar.s = 1;
                        obj = g(str3, j1gVar2, iuVar);
                        if (obj != obj2) {
                            j2 = j;
                            oqVar2 = oqVar;
                            if (!((Boolean) obj).booleanValue()) {
                                iuVar.j = oqVar2;
                                iuVar.k = j1gVar2;
                                iuVar.m = j2;
                                iuVar.n = 0;
                                iuVar.s = 2;
                                obj = this.b.f(iuVar);
                                if (obj != obj2) {
                                    i3 = 0;
                                    oqVar3 = oqVar2;
                                    j3 = j2;
                                    String str4 = ((xxq) obj).a;
                                    str4.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    et etVar = this.c;
                                    if (ordinal != 0) {
                                        oqVar3.E = new Date(j3);
                                        List c = t75.c(oqVar3);
                                        Map b = tah.b(new Pair(oqVar3.a, Boolean.TRUE));
                                        iuVar.j = oqVar3;
                                        iuVar.k = null;
                                        iuVar.l = str4;
                                        iuVar.m = j3;
                                        iuVar.n = i3;
                                        iuVar.o = 0;
                                        iuVar.p = 0;
                                        iuVar.s = 3;
                                        if (etVar.a(str4, c, b, iuVar) != obj2) {
                                            i4 = i3;
                                            i5 = 0;
                                            j4 = j3;
                                            oqVar4 = oqVar3;
                                            str = str4;
                                            m0g m0gVar = new m0g(q0g.a, oqVar4.a);
                                            iuVar.j = null;
                                            iuVar.k = null;
                                            iuVar.l = null;
                                            iuVar.m = j4;
                                            iuVar.n = i4;
                                            iuVar.o = i9;
                                            iuVar.p = i5;
                                            iuVar.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new au(oqVar3.a, false, new Date(j3)));
                                        iuVar.j = oqVar3;
                                        iuVar.k = null;
                                        iuVar.l = str4;
                                        iuVar.m = j3;
                                        iuVar.n = i3;
                                        iuVar.o = 0;
                                        iuVar.p = 0;
                                        iuVar.s = 5;
                                        if (etVar.j(str4, c2, iuVar) != obj2) {
                                            i6 = i3;
                                            i7 = 0;
                                            j5 = j3;
                                            oqVar5 = oqVar3;
                                            str2 = str4;
                                            m0g m0gVar2 = new m0g(q0g.b, oqVar5.a);
                                            iuVar.j = null;
                                            iuVar.k = null;
                                            iuVar.l = null;
                                            iuVar.m = j5;
                                            iuVar.n = i6;
                                            iuVar.o = i9;
                                            iuVar.p = i7;
                                            iuVar.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        dfi.r("Unsupported album LikeState.DISLIKED", "AlbumLikesCenter");
                                        qxr.a();
                                        return Unit.a;
                                    }
                                }
                            } else {
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 1:
                        long j6 = iuVar.m;
                        j1g j1gVar3 = iuVar.k;
                        oqVar2 = iuVar.j;
                        qgg.h0(obj);
                        j2 = j6;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = iuVar.n;
                        j3 = iuVar.m;
                        j1gVar2 = iuVar.k;
                        oqVar3 = iuVar.j;
                        qgg.h0(obj);
                        String str42 = ((xxq) obj).a;
                        str42.getClass();
                        ordinal = j1gVar2.ordinal();
                        et etVar2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i10 = iuVar.p;
                        int i11 = iuVar.o;
                        i4 = iuVar.n;
                        j4 = iuVar.m;
                        str = iuVar.l;
                        oqVar4 = iuVar.j;
                        qgg.h0(obj);
                        i9 = i11;
                        i5 = i10;
                        m0g m0gVar3 = new m0g(q0g.a, oqVar4.a);
                        iuVar.j = null;
                        iuVar.k = null;
                        iuVar.l = null;
                        iuVar.m = j4;
                        iuVar.n = i4;
                        iuVar.o = i9;
                        iuVar.p = i5;
                        iuVar.s = 4;
                        break;
                    case 4:
                    case 6:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i12 = iuVar.p;
                        int i13 = iuVar.o;
                        i6 = iuVar.n;
                        j5 = iuVar.m;
                        str2 = iuVar.l;
                        oqVar5 = iuVar.j;
                        qgg.h0(obj);
                        i9 = i13;
                        i7 = i12;
                        m0g m0gVar22 = new m0g(q0g.b, oqVar5.a);
                        iuVar.j = null;
                        iuVar.k = null;
                        iuVar.l = null;
                        iuVar.m = j5;
                        iuVar.n = i6;
                        iuVar.o = i9;
                        iuVar.p = i7;
                        iuVar.s = 6;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        iuVar = new iu(this, cg6Var);
        Object obj3 = iuVar.q;
        Object obj22 = nm6.a;
        i2 = iuVar.s;
        e1g e1gVar2 = this.d;
        int i92 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x011f, code lost:
    
        if (r7.i(r6, r3, r4) != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x016b, code lost:
    
        if (r7.i(r6, r3, r4) != r5) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, j1g j1gVar, long j, cg6 cg6Var) {
        hu huVar;
        int i2;
        long j2;
        String str2;
        int i3;
        String str3;
        long j3;
        int ordinal;
        int i4;
        int i5;
        long j4;
        String str4;
        String str5;
        int i6;
        int i7;
        long j5;
        String str6;
        String str7;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof hu) {
            huVar = (hu) cg6Var;
            int i8 = huVar.s;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                huVar.s = i8 - Integer.MIN_VALUE;
                Object obj = huVar.q;
                Object obj2 = nm6.a;
                i2 = huVar.s;
                e1g e1gVar = this.d;
                int i9 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        huVar.j = str;
                        huVar.k = j1gVar2;
                        huVar.m = j;
                        huVar.s = 1;
                        obj = g(str, j1gVar2, huVar);
                        if (obj != obj2) {
                            j2 = j;
                            str2 = str;
                            if (!((Boolean) obj).booleanValue()) {
                                huVar.j = str2;
                                huVar.k = j1gVar2;
                                huVar.m = j2;
                                huVar.n = 0;
                                huVar.s = 2;
                                obj = this.b.f(huVar);
                                if (obj != obj2) {
                                    i3 = 0;
                                    str3 = str2;
                                    j3 = j2;
                                    String str8 = ((xxq) obj).a;
                                    str8.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    et etVar = this.c;
                                    if (ordinal != 0) {
                                        List c = t75.c(new au(str3, true, new Date(j3)));
                                        huVar.j = str3;
                                        huVar.k = null;
                                        huVar.l = str8;
                                        huVar.m = j3;
                                        huVar.n = i3;
                                        huVar.o = 0;
                                        huVar.p = 0;
                                        huVar.s = 3;
                                        if (etVar.j(str8, c, huVar) != obj2) {
                                            i4 = i3;
                                            i5 = 0;
                                            j4 = j3;
                                            str4 = str3;
                                            str5 = str8;
                                            m0g m0gVar = new m0g(q0g.a, str4);
                                            huVar.j = null;
                                            huVar.k = null;
                                            huVar.l = null;
                                            huVar.m = j4;
                                            huVar.n = i4;
                                            huVar.o = i9;
                                            huVar.p = i5;
                                            huVar.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new au(str3, false, new Date(j3)));
                                        huVar.j = str3;
                                        huVar.k = null;
                                        huVar.l = str8;
                                        huVar.m = j3;
                                        huVar.n = i3;
                                        huVar.o = 0;
                                        huVar.p = 0;
                                        huVar.s = 5;
                                        if (etVar.j(str8, c2, huVar) != obj2) {
                                            i6 = i3;
                                            i7 = 0;
                                            j5 = j3;
                                            str6 = str3;
                                            str7 = str8;
                                            m0g m0gVar2 = new m0g(q0g.b, str6);
                                            huVar.j = null;
                                            huVar.k = null;
                                            huVar.l = null;
                                            huVar.m = j5;
                                            huVar.n = i6;
                                            huVar.o = i9;
                                            huVar.p = i7;
                                            huVar.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        dfi.r("Unsupported album LikeState.DISLIKED", "AlbumLikesCenter");
                                        qxr.a();
                                        return Unit.a;
                                    }
                                }
                            } else {
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 1:
                        long j6 = huVar.m;
                        j1g j1gVar3 = huVar.k;
                        str2 = huVar.j;
                        qgg.h0(obj);
                        j2 = j6;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = huVar.n;
                        j3 = huVar.m;
                        j1gVar2 = huVar.k;
                        str3 = huVar.j;
                        qgg.h0(obj);
                        String str82 = ((xxq) obj).a;
                        str82.getClass();
                        ordinal = j1gVar2.ordinal();
                        et etVar2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i10 = huVar.p;
                        int i11 = huVar.o;
                        i4 = huVar.n;
                        j4 = huVar.m;
                        str5 = huVar.l;
                        str4 = huVar.j;
                        qgg.h0(obj);
                        i9 = i11;
                        i5 = i10;
                        m0g m0gVar3 = new m0g(q0g.a, str4);
                        huVar.j = null;
                        huVar.k = null;
                        huVar.l = null;
                        huVar.m = j4;
                        huVar.n = i4;
                        huVar.o = i9;
                        huVar.p = i5;
                        huVar.s = 4;
                        break;
                    case 4:
                    case 6:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i12 = huVar.p;
                        int i13 = huVar.o;
                        i6 = huVar.n;
                        j5 = huVar.m;
                        str7 = huVar.l;
                        str6 = huVar.j;
                        qgg.h0(obj);
                        i9 = i13;
                        i7 = i12;
                        m0g m0gVar22 = new m0g(q0g.b, str6);
                        huVar.j = null;
                        huVar.k = null;
                        huVar.l = null;
                        huVar.m = j5;
                        huVar.n = i6;
                        huVar.o = i9;
                        huVar.p = i7;
                        huVar.s = 6;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        huVar = new hu(this, cg6Var);
        Object obj3 = huVar.q;
        Object obj22 = nm6.a;
        i2 = huVar.s;
        e1g e1gVar2 = this.d;
        int i92 = 0;
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
    public final Object g(String str, j1g j1gVar, cg6 cg6Var) {
        ju juVar;
        Object obj;
        int i2;
        String str2;
        j1g j1gVar2;
        if (cg6Var instanceof ju) {
            juVar = (ju) cg6Var;
            int i3 = juVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                juVar.n = i3 - Integer.MIN_VALUE;
                obj = juVar.l;
                Object obj2 = nm6.a;
                i2 = juVar.n;
                xdr xdrVar = this.g;
                if (i2 != 0) {
                    qgg.h0(obj);
                    juVar.j = str;
                    juVar.k = j1gVar;
                    juVar.n = 1;
                    obj = c(str, juVar);
                } else if (i2 == 1) {
                    j1gVar = juVar.k;
                    str = juVar.j;
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
                    j1gVar2 = juVar.k;
                    str2 = juVar.j;
                    qgg.h0(obj);
                    Map map = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(str2, map) : uah.j(map, new Pair(str2, j1gVar2)));
                    str2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, str2);
                    bu buVar = new bu(j1gVar2, str2);
                    juVar.j = null;
                    juVar.k = null;
                    juVar.n = 3;
                }
                if (obj != j1gVar) {
                    ssg.a(4, "AlbumLikesCenter", "Change album " + str + " like state to " + j1gVar + " skipped", null);
                    return Boolean.FALSE;
                }
                ssg.a(4, "AlbumLikesCenter", "Change album " + str + " like state to " + j1gVar, null);
                bca bcaVar = new bca(xdrVar, 18);
                juVar.j = str;
                juVar.k = j1gVar;
                juVar.n = 2;
                obj = zsd.g0(bcaVar, juVar);
                if (obj != obj2) {
                    j1g j1gVar3 = j1gVar;
                    str2 = str;
                    j1gVar2 = j1gVar3;
                    Map map2 = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(str2, map2) : uah.j(map2, new Pair(str2, j1gVar2)));
                    str2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, str2);
                    bu buVar2 = new bu(j1gVar2, str2);
                    juVar.j = null;
                    juVar.k = null;
                    juVar.n = 3;
                }
                return obj2;
            }
        }
        juVar = new ju(this, cg6Var);
        obj = juVar.l;
        Object obj22 = nm6.a;
        i2 = juVar.n;
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
    public final Object h(String str, HashMap hashMap, cg6 cg6Var) {
        lu luVar;
        int i2;
        if (cg6Var instanceof lu) {
            luVar = (lu) cg6Var;
            int i3 = luVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                luVar.m = i3 - Integer.MIN_VALUE;
                Object obj = luVar.k;
                Object obj2 = nm6.a;
                i2 = luVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    luVar.j = hashMap;
                    luVar.m = 1;
                    obj = this.d.e(str, luVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap = luVar.j;
                    qgg.h0(obj);
                }
                for (m0g m0gVar : (List) obj) {
                    q0g q0gVar = m0gVar.a;
                    String str2 = m0gVar.b;
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
        luVar = new lu(this, cg6Var);
        Object obj3 = luVar.k;
        Object obj22 = nm6.a;
        i2 = luVar.m;
        if (i2 != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.a;
    }
}
