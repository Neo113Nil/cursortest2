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
public final class bwl implements tvl {
    public static final /* synthetic */ s9f[] i;
    public final tf6 a;
    public final frt b;
    public final rtl c;
    public final e1g d;
    public final wt5 e;
    public final rhp f;
    public final xdr g;
    public final x0q h;

    static {
        opi opiVar = new opi(bwl.class, "updateLikesJob", "getUpdateLikesJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar};
    }

    public bwl(tf6 tf6Var, frt frtVar, rtl rtlVar, e1g e1gVar, ehv ehvVar, wt5 wt5Var) {
        rtlVar.getClass();
        e1gVar.getClass();
        this.a = tf6Var;
        this.b = frtVar;
        this.c = rtlVar;
        this.d = e1gVar;
        this.e = wt5Var;
        this.f = new rhp();
        this.g = ydr.a(null);
        this.h = y0q.b(0, 0, null, 7);
        ox6.B(q6k.m(frtVar.g(), new osl(4), q6k.g), tf6Var, new gfl(3, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[LOOP:0: B:21:0x0067->B:23:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(bwl bwlVar, String str, Continuation continuation) {
        uvl uvlVar;
        Object obj;
        int i2;
        String str2;
        HashMap hashMap;
        Iterator it;
        HashMap hashMap2;
        xdr xdrVar = bwlVar.g;
        if (continuation instanceof uvl) {
            uvlVar = (uvl) continuation;
            int i3 = uvlVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uvlVar.n = i3 - Integer.MIN_VALUE;
                Object obj2 = uvlVar.l;
                obj = nm6.a;
                i2 = uvlVar.n;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    ssg.a(4, "PlaylistLikesCenter", "Initializing playlist likes from DB", null);
                    HashMap hashMap3 = new HashMap();
                    rtl rtlVar = bwlVar.c;
                    uvlVar.j = str;
                    uvlVar.k = hashMap3;
                    uvlVar.n = 1;
                    Object c = rtlVar.c(str, uvlVar);
                    if (c != obj) {
                        str2 = str;
                        hashMap = hashMap3;
                        obj2 = c;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap2 = uvlVar.k;
                    qgg.h0(obj2);
                    if (xdrVar.getValue() == null) {
                        xdrVar.l(hashMap2);
                    }
                    return Unit.a;
                }
                hashMap = uvlVar.k;
                str2 = uvlVar.j;
                qgg.h0(obj2);
                it = ((Iterable) obj2).iterator();
                while (it.hasNext()) {
                    hashMap.put((nvl) it.next(), j1g.a);
                }
                uvlVar.j = null;
                uvlVar.k = hashMap;
                uvlVar.n = 2;
                if (bwlVar.h(str2, hashMap, uvlVar) != obj) {
                    hashMap2 = hashMap;
                    if (xdrVar.getValue() == null) {
                    }
                    return Unit.a;
                }
                return obj;
            }
        }
        uvlVar = new uvl(bwlVar, continuation);
        Object obj22 = uvlVar.l;
        obj = nm6.a;
        i2 = uvlVar.n;
        if (i2 != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (it.hasNext()) {
        }
        uvlVar.j = null;
        uvlVar.k = hashMap;
        uvlVar.n = 2;
        if (bwlVar.h(str2, hashMap, uvlVar) != obj) {
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
    public final Enum c(nvl nvlVar, cg6 cg6Var) {
        vvl vvlVar;
        int i2;
        if (cg6Var instanceof vvl) {
            vvlVar = (vvl) cg6Var;
            int i3 = vvlVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vvlVar.m = i3 - Integer.MIN_VALUE;
                Object obj = vvlVar.k;
                nm6 nm6Var = nm6.a;
                i2 = vvlVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(this.g, 18);
                    vvlVar.j = nvlVar;
                    vvlVar.m = 1;
                    obj = zsd.g0(bcaVar, vvlVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nvlVar = vvlVar.j;
                    qgg.h0(obj);
                }
                j1g j1gVar = (j1g) ((Map) obj).get(nvlVar);
                return j1gVar != null ? j1g.b : j1gVar;
            }
        }
        vvlVar = new vvl(this, cg6Var);
        Object obj2 = vvlVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = vvlVar.m;
        if (i2 != 0) {
        }
        j1g j1gVar2 = (j1g) ((Map) obj2).get(nvlVar);
        if (j1gVar2 != null) {
        }
    }

    public final pjc d(nvl nvlVar) {
        return zsd.b0(new ail(2, new bca(this.g, 18), nvlVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0123, code lost:
    
        if (r10.k(r7, r2, r9) != r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
    
        if (r10.k(r7, r2, r9) != r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r2 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cvl cvlVar, j1g j1gVar, long j, cg6 cg6Var) {
        yvl yvlVar;
        int i2;
        cvl cvlVar2;
        long j2;
        cvl cvlVar3;
        j1g j1gVar2;
        int i3;
        int ordinal;
        int i4;
        String str;
        int i5;
        long j3;
        cvl cvlVar4;
        int i6;
        String str2;
        int i7;
        long j4;
        cvl cvlVar5;
        j1g j1gVar3 = j1gVar;
        if (cg6Var instanceof yvl) {
            yvlVar = (yvl) cg6Var;
            int i8 = yvlVar.s;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                yvlVar.s = i8 - Integer.MIN_VALUE;
                yvl yvlVar2 = yvlVar;
                Object obj = yvlVar2.q;
                Object obj2 = nm6.a;
                i2 = yvlVar2.s;
                e1g e1gVar = this.d;
                int i9 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        nvl g = cvlVar.g();
                        cvlVar2 = cvlVar;
                        yvlVar2.j = cvlVar2;
                        yvlVar2.k = j1gVar3;
                        j2 = j;
                        yvlVar2.m = j2;
                        yvlVar2.s = 1;
                        obj = g(g, j1gVar3, yvlVar2);
                        break;
                    case 1:
                        j2 = yvlVar2.m;
                        j1gVar3 = yvlVar2.k;
                        cvlVar2 = yvlVar2.j;
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return Unit.a;
                        }
                        yvlVar2.j = cvlVar2;
                        yvlVar2.k = j1gVar3;
                        yvlVar2.m = j2;
                        yvlVar2.n = 0;
                        yvlVar2.s = 2;
                        obj = this.b.f(yvlVar2);
                        if (obj != obj2) {
                            cvlVar3 = cvlVar2;
                            j1gVar2 = j1gVar3;
                            i3 = 0;
                            long j5 = j2;
                            String str3 = ((xxq) obj).a;
                            str3.getClass();
                            ordinal = j1gVar2.ordinal();
                            if (ordinal != 0) {
                                cvlVar3.A = new Date(j5);
                                yvlVar2.j = cvlVar3;
                                yvlVar2.k = null;
                                yvlVar2.l = str3;
                                yvlVar2.m = j5;
                                yvlVar2.n = i3;
                                yvlVar2.o = 0;
                                yvlVar2.p = 0;
                                yvlVar2.s = 3;
                                if (this.c.a.d(str3, cvlVar3, true, yvlVar2) != obj2) {
                                    i4 = i3;
                                    str = str3;
                                    i5 = 0;
                                    j3 = j5;
                                    cvlVar4 = cvlVar3;
                                    o0g o0gVar = new o0g(q0g.a, cvlVar4.g());
                                    yvlVar2.j = null;
                                    yvlVar2.k = null;
                                    yvlVar2.l = null;
                                    yvlVar2.m = j3;
                                    yvlVar2.n = i4;
                                    yvlVar2.o = i9;
                                    yvlVar2.p = i5;
                                    yvlVar2.s = 4;
                                    break;
                                }
                            } else if (ordinal == 1) {
                                nvl g2 = cvlVar3.g();
                                yvlVar2.j = cvlVar3;
                                yvlVar2.k = null;
                                yvlVar2.l = str3;
                                yvlVar2.m = j5;
                                yvlVar2.n = i3;
                                yvlVar2.o = 0;
                                yvlVar2.p = 0;
                                yvlVar2.s = 5;
                                if (this.c.m(str3, g2, false, null, yvlVar2) != obj2) {
                                    i6 = i3;
                                    str2 = str3;
                                    i7 = 0;
                                    j4 = j5;
                                    cvlVar5 = cvlVar3;
                                    o0g o0gVar2 = new o0g(q0g.b, cvlVar5.g());
                                    yvlVar2.j = null;
                                    yvlVar2.k = null;
                                    yvlVar2.l = null;
                                    yvlVar2.m = j4;
                                    yvlVar2.n = i6;
                                    yvlVar2.o = i9;
                                    yvlVar2.p = i7;
                                    yvlVar2.s = 6;
                                    break;
                                }
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                dfi.r("Unsupported playlist LikeState.DISLIKED", "PlaylistLikesCenter");
                                qxr.a();
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 2:
                        i3 = yvlVar2.n;
                        j2 = yvlVar2.m;
                        j1gVar2 = yvlVar2.k;
                        cvl cvlVar6 = yvlVar2.j;
                        qgg.h0(obj);
                        cvlVar3 = cvlVar6;
                        long j52 = j2;
                        String str32 = ((xxq) obj).a;
                        str32.getClass();
                        ordinal = j1gVar2.ordinal();
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i10 = yvlVar2.p;
                        int i11 = yvlVar2.o;
                        i4 = yvlVar2.n;
                        j3 = yvlVar2.m;
                        str = yvlVar2.l;
                        cvlVar4 = yvlVar2.j;
                        qgg.h0(obj);
                        i9 = i11;
                        i5 = i10;
                        o0g o0gVar3 = new o0g(q0g.a, cvlVar4.g());
                        yvlVar2.j = null;
                        yvlVar2.k = null;
                        yvlVar2.l = null;
                        yvlVar2.m = j3;
                        yvlVar2.n = i4;
                        yvlVar2.o = i9;
                        yvlVar2.p = i5;
                        yvlVar2.s = 4;
                        break;
                    case 4:
                    case 6:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i12 = yvlVar2.p;
                        int i13 = yvlVar2.o;
                        i6 = yvlVar2.n;
                        j4 = yvlVar2.m;
                        str2 = yvlVar2.l;
                        cvlVar5 = yvlVar2.j;
                        qgg.h0(obj);
                        i9 = i13;
                        i7 = i12;
                        o0g o0gVar22 = new o0g(q0g.b, cvlVar5.g());
                        yvlVar2.j = null;
                        yvlVar2.k = null;
                        yvlVar2.l = null;
                        yvlVar2.m = j4;
                        yvlVar2.n = i6;
                        yvlVar2.o = i9;
                        yvlVar2.p = i7;
                        yvlVar2.s = 6;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        yvlVar = new yvl(this, cg6Var);
        yvl yvlVar22 = yvlVar;
        Object obj3 = yvlVar22.q;
        Object obj22 = nm6.a;
        i2 = yvlVar22.s;
        e1g e1gVar2 = this.d;
        int i92 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x011c, code lost:
    
        if (r11.k(r7, r3, r10) != r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0162, code lost:
    
        if (r11.k(r7, r3, r10) != r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        if (r3 == r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(nvl nvlVar, j1g j1gVar, long j, cg6 cg6Var) {
        xvl xvlVar;
        int i2;
        long j2;
        nvl nvlVar2;
        int i3;
        int ordinal;
        int i4;
        nvl nvlVar3;
        int i5;
        String str;
        long j3;
        int i6;
        nvl nvlVar4;
        int i7;
        String str2;
        long j4;
        nvl nvlVar5 = nvlVar;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof xvl) {
            xvlVar = (xvl) cg6Var;
            int i8 = xvlVar.s;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                xvlVar.s = i8 - Integer.MIN_VALUE;
                xvl xvlVar2 = xvlVar;
                Object obj = xvlVar2.q;
                Object obj2 = nm6.a;
                i2 = xvlVar2.s;
                e1g e1gVar = this.d;
                int i9 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        xvlVar2.j = nvlVar5;
                        xvlVar2.k = j1gVar2;
                        j2 = j;
                        xvlVar2.m = j2;
                        xvlVar2.s = 1;
                        obj = g(nvlVar5, j1gVar2, xvlVar2);
                        break;
                    case 1:
                        long j5 = xvlVar2.m;
                        j1g j1gVar3 = xvlVar2.k;
                        nvl nvlVar6 = xvlVar2.j;
                        qgg.h0(obj);
                        nvlVar5 = nvlVar6;
                        j2 = j5;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            return Unit.a;
                        }
                        xvlVar2.j = nvlVar5;
                        xvlVar2.k = j1gVar2;
                        xvlVar2.m = j2;
                        xvlVar2.n = 0;
                        xvlVar2.s = 2;
                        obj = this.b.f(xvlVar2);
                        if (obj != obj2) {
                            nvlVar2 = nvlVar5;
                            i3 = 0;
                            long j6 = j2;
                            String str3 = ((xxq) obj).a;
                            str3.getClass();
                            ordinal = j1gVar2.ordinal();
                            if (ordinal != 0) {
                                nvl nvlVar7 = nvlVar2;
                                Long l = new Long(j6);
                                xvlVar2.j = nvlVar7;
                                xvlVar2.k = null;
                                xvlVar2.l = str3;
                                xvlVar2.m = j6;
                                xvlVar2.n = i3;
                                xvlVar2.o = 0;
                                xvlVar2.p = 0;
                                xvlVar2.s = 3;
                                if (this.c.m(str3, nvlVar7, true, l, xvlVar2) != obj2) {
                                    i4 = i3;
                                    nvlVar3 = nvlVar7;
                                    i5 = 0;
                                    str = str3;
                                    j3 = j6;
                                    o0g o0gVar = new o0g(q0g.a, nvlVar3);
                                    xvlVar2.j = null;
                                    xvlVar2.k = null;
                                    xvlVar2.l = null;
                                    xvlVar2.m = j3;
                                    xvlVar2.n = i4;
                                    xvlVar2.o = i9;
                                    xvlVar2.p = i5;
                                    xvlVar2.s = 4;
                                    break;
                                }
                            } else if (ordinal == 1) {
                                xvlVar2.j = nvlVar2;
                                xvlVar2.k = null;
                                xvlVar2.l = str3;
                                xvlVar2.m = j6;
                                xvlVar2.n = i3;
                                xvlVar2.o = 0;
                                xvlVar2.p = 0;
                                xvlVar2.s = 5;
                                nvl nvlVar8 = nvlVar2;
                                if (this.c.m(str3, nvlVar8, false, null, xvlVar2) != obj2) {
                                    i6 = i3;
                                    nvlVar4 = nvlVar8;
                                    i7 = 0;
                                    str2 = str3;
                                    j4 = j6;
                                    o0g o0gVar2 = new o0g(q0g.b, nvlVar4);
                                    xvlVar2.j = null;
                                    xvlVar2.k = null;
                                    xvlVar2.l = null;
                                    xvlVar2.m = j4;
                                    xvlVar2.n = i6;
                                    xvlVar2.o = i9;
                                    xvlVar2.p = i7;
                                    xvlVar2.s = 6;
                                    break;
                                }
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                dfi.r("Unsupported playlist LikeState.DISLIKED", "PlaylistLikesCenter");
                                qxr.a();
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 2:
                        i3 = xvlVar2.n;
                        j2 = xvlVar2.m;
                        j1gVar2 = xvlVar2.k;
                        nvlVar2 = xvlVar2.j;
                        qgg.h0(obj);
                        long j62 = j2;
                        String str32 = ((xxq) obj).a;
                        str32.getClass();
                        ordinal = j1gVar2.ordinal();
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i10 = xvlVar2.p;
                        int i11 = xvlVar2.o;
                        i4 = xvlVar2.n;
                        j3 = xvlVar2.m;
                        str = xvlVar2.l;
                        nvlVar3 = xvlVar2.j;
                        qgg.h0(obj);
                        i9 = i11;
                        i5 = i10;
                        o0g o0gVar3 = new o0g(q0g.a, nvlVar3);
                        xvlVar2.j = null;
                        xvlVar2.k = null;
                        xvlVar2.l = null;
                        xvlVar2.m = j3;
                        xvlVar2.n = i4;
                        xvlVar2.o = i9;
                        xvlVar2.p = i5;
                        xvlVar2.s = 4;
                        break;
                    case 4:
                    case 6:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i12 = xvlVar2.p;
                        int i13 = xvlVar2.o;
                        i6 = xvlVar2.n;
                        j4 = xvlVar2.m;
                        str2 = xvlVar2.l;
                        nvlVar4 = xvlVar2.j;
                        qgg.h0(obj);
                        i9 = i13;
                        i7 = i12;
                        o0g o0gVar22 = new o0g(q0g.b, nvlVar4);
                        xvlVar2.j = null;
                        xvlVar2.k = null;
                        xvlVar2.l = null;
                        xvlVar2.m = j4;
                        xvlVar2.n = i6;
                        xvlVar2.o = i9;
                        xvlVar2.p = i7;
                        xvlVar2.s = 6;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        xvlVar = new xvl(this, cg6Var);
        xvl xvlVar22 = xvlVar;
        Object obj3 = xvlVar22.q;
        Object obj22 = nm6.a;
        i2 = xvlVar22.s;
        e1g e1gVar2 = this.d;
        int i92 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
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
    public final Object g(nvl nvlVar, j1g j1gVar, cg6 cg6Var) {
        zvl zvlVar;
        Object obj;
        int i2;
        nvl nvlVar2;
        j1g j1gVar2;
        if (cg6Var instanceof zvl) {
            zvlVar = (zvl) cg6Var;
            int i3 = zvlVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zvlVar.n = i3 - Integer.MIN_VALUE;
                obj = zvlVar.l;
                Object obj2 = nm6.a;
                i2 = zvlVar.n;
                xdr xdrVar = this.g;
                if (i2 != 0) {
                    qgg.h0(obj);
                    zvlVar.j = nvlVar;
                    zvlVar.k = j1gVar;
                    zvlVar.n = 1;
                    obj = c(nvlVar, zvlVar);
                } else if (i2 == 1) {
                    j1gVar = zvlVar.k;
                    nvlVar = zvlVar.j;
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
                    j1gVar2 = zvlVar.k;
                    nvlVar2 = zvlVar.j;
                    qgg.h0(obj);
                    Map map = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(nvlVar2, map) : uah.j(map, new Pair(nvlVar2, j1gVar2)));
                    nvlVar2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, nvlVar2.d());
                    svl svlVar = new svl(nvlVar2, j1gVar2);
                    zvlVar.j = null;
                    zvlVar.k = null;
                    zvlVar.n = 3;
                }
                if (obj != j1gVar) {
                    ssg.a(4, "PlaylistLikesCenter", "Change playlist " + nvlVar + " like state to " + j1gVar + " skipped", null);
                    return Boolean.FALSE;
                }
                ssg.a(4, "PlaylistLikesCenter", "Change playlist " + nvlVar + " like state to " + j1gVar, null);
                bca bcaVar = new bca(xdrVar, 18);
                zvlVar.j = nvlVar;
                zvlVar.k = j1gVar;
                zvlVar.n = 2;
                obj = zsd.g0(bcaVar, zvlVar);
                if (obj != obj2) {
                    j1g j1gVar3 = j1gVar;
                    nvlVar2 = nvlVar;
                    j1gVar2 = j1gVar3;
                    Map map2 = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(nvlVar2, map2) : uah.j(map2, new Pair(nvlVar2, j1gVar2)));
                    nvlVar2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, nvlVar2.d());
                    svl svlVar2 = new svl(nvlVar2, j1gVar2);
                    zvlVar.j = null;
                    zvlVar.k = null;
                    zvlVar.n = 3;
                }
                return obj2;
            }
        }
        zvlVar = new zvl(this, cg6Var);
        obj = zvlVar.l;
        Object obj22 = nm6.a;
        i2 = zvlVar.n;
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
        awl awlVar;
        int i2;
        if (cg6Var instanceof awl) {
            awlVar = (awl) cg6Var;
            int i3 = awlVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                awlVar.m = i3 - Integer.MIN_VALUE;
                Object obj = awlVar.k;
                Object obj2 = nm6.a;
                i2 = awlVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    awlVar.j = hashMap;
                    awlVar.m = 1;
                    obj = this.d.g(str, awlVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap = awlVar.j;
                    qgg.h0(obj);
                }
                for (o0g o0gVar : (List) obj) {
                    q0g q0gVar = o0gVar.a;
                    nvl nvlVar = o0gVar.b;
                    int ordinal = q0gVar.ordinal();
                    if (ordinal == 0) {
                        hashMap.put(nvlVar, j1g.a);
                    } else if (ordinal == 1) {
                        hashMap.remove(nvlVar);
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        hashMap.put(nvlVar, j1g.c);
                    }
                }
                return Unit.a;
            }
        }
        awlVar = new awl(this, cg6Var);
        Object obj3 = awlVar.k;
        Object obj22 = nm6.a;
        i2 = awlVar.m;
        if (i2 != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.a;
    }
}
