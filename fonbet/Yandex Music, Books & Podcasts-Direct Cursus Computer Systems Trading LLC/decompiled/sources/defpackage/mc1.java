package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class mc1 implements dc1 {
    public static final /* synthetic */ s9f[] i;
    public final tf6 a;
    public final frt b;
    public final p51 c;
    public final e1g d;
    public final wt5 e;
    public final rhp f;
    public final xdr g;
    public final x0q h;

    static {
        opi opiVar = new opi(mc1.class, "updateLikesJob", "getUpdateLikesJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar};
    }

    public mc1(tf6 tf6Var, frt frtVar, p51 p51Var, e1g e1gVar, ehv ehvVar, wt5 wt5Var) {
        p51Var.getClass();
        e1gVar.getClass();
        this.a = tf6Var;
        this.b = frtVar;
        this.c = p51Var;
        this.d = e1gVar;
        this.e = wt5Var;
        this.f = new rhp();
        this.g = ydr.a(null);
        this.h = y0q.b(0, 0, null, 7);
        ox6.B(q6k.m(frtVar.g(), new zs0(20), q6k.g), tf6Var, new ri(12, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[LOOP:0: B:21:0x006c->B:23:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[LOOP:1: B:26:0x0086->B:28:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mc1 mc1Var, String str, Continuation continuation) {
        ec1 ec1Var;
        Object obj;
        int i2;
        String str2;
        HashMap hashMap;
        Iterator it;
        Iterator it2;
        HashMap hashMap2;
        xdr xdrVar = mc1Var.g;
        if (continuation instanceof ec1) {
            ec1Var = (ec1) continuation;
            int i3 = ec1Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ec1Var.n = i3 - Integer.MIN_VALUE;
                Object obj2 = ec1Var.l;
                obj = nm6.a;
                i2 = ec1Var.n;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    ssg.a(4, "ArtistLikesCenter", "Initializing artist likes from DB", null);
                    HashMap hashMap3 = new HashMap();
                    p51 p51Var = mc1Var.c;
                    ec1Var.j = str;
                    ec1Var.k = hashMap3;
                    ec1Var.n = 1;
                    Object g = p51Var.g(str, ec1Var);
                    if (g != obj) {
                        str2 = str;
                        hashMap = hashMap3;
                        obj2 = g;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap2 = ec1Var.k;
                    qgg.h0(obj2);
                    if (xdrVar.getValue() == null) {
                        xdrVar.l(hashMap2);
                    }
                    return Unit.a;
                }
                hashMap = ec1Var.k;
                str2 = ec1Var.j;
                qgg.h0(obj2);
                bc1 bc1Var = (bc1) obj2;
                it = bc1Var.a.iterator();
                while (it.hasNext()) {
                    hashMap.put(((ac1) it.next()).a, j1g.a);
                }
                it2 = bc1Var.b.iterator();
                while (it2.hasNext()) {
                    hashMap.put(((ac1) it2.next()).a, j1g.c);
                }
                ec1Var.j = null;
                ec1Var.k = hashMap;
                ec1Var.n = 2;
                if (mc1Var.j(str2, hashMap, ec1Var) != obj) {
                    hashMap2 = hashMap;
                    if (xdrVar.getValue() == null) {
                    }
                    return Unit.a;
                }
                return obj;
            }
        }
        ec1Var = new ec1(mc1Var, continuation);
        Object obj22 = ec1Var.l;
        obj = nm6.a;
        i2 = ec1Var.n;
        if (i2 != 0) {
        }
        bc1 bc1Var2 = (bc1) obj22;
        it = bc1Var2.a.iterator();
        while (it.hasNext()) {
        }
        it2 = bc1Var2.b.iterator();
        while (it2.hasNext()) {
        }
        ec1Var.j = null;
        ec1Var.k = hashMap;
        ec1Var.n = 2;
        if (mc1Var.j(str2, hashMap, ec1Var) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public static c01 i(u51 u51Var, long j) {
        CoverPath none;
        List list;
        List list2;
        String str;
        String str2 = u51Var.a;
        String str3 = u51Var.b;
        u9b u9bVar = u51Var.c;
        if (u9bVar == null || (str = u9bVar.a) == null) {
            none = CoverPath.none();
            none.getClass();
        } else {
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            webPath$Storage.getClass();
            none = etn.B(str, webPath$Storage);
        }
        CoverPath coverPath = none;
        gd6 gd6Var = u51Var.e;
        if (gd6Var == null || (list2 = gd6Var.a) == null) {
            list = c5b.a;
        } else {
            List list3 = list2;
            list = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                list.add(((hs5) it.next()).d());
            }
        }
        c01 c01Var = new c01(str2, str3, false, false, null, 0, null, coverPath, null, list, null, false, 56316);
        c01Var.r = new Date(j);
        return c01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(String str, cg6 cg6Var) {
        fc1 fc1Var;
        int i2;
        if (cg6Var instanceof fc1) {
            fc1Var = (fc1) cg6Var;
            int i3 = fc1Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fc1Var.m = i3 - Integer.MIN_VALUE;
                Object obj = fc1Var.k;
                nm6 nm6Var = nm6.a;
                i2 = fc1Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(this.g, 18);
                    fc1Var.j = str;
                    fc1Var.m = 1;
                    obj = zsd.g0(bcaVar, fc1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = fc1Var.j;
                    qgg.h0(obj);
                }
                j1g j1gVar = (j1g) ((Map) obj).get(str);
                return j1gVar != null ? j1g.b : j1gVar;
            }
        }
        fc1Var = new fc1(this, cg6Var);
        Object obj2 = fc1Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = fc1Var.m;
        if (i2 != 0) {
        }
        j1g j1gVar2 = (j1g) ((Map) obj2).get(str);
        if (j1gVar2 != null) {
        }
    }

    public final pjc d(String str) {
        str.getClass();
        return zsd.b0(new gu(new bca(this.g, 18), str, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x013d, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0199, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01f4, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c01 c01Var, j1g j1gVar, long j, cg6 cg6Var) {
        jc1 jc1Var;
        int i2;
        long j2;
        c01 c01Var2;
        int i3;
        c01 c01Var3;
        long j3;
        int ordinal;
        c01 c01Var4;
        long j4;
        int i4;
        String str;
        int i5;
        c01 c01Var5;
        long j5;
        int i6;
        String str2;
        int i7;
        c01 c01Var6;
        long j6;
        int i8;
        String str3;
        int i9;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof jc1) {
            jc1Var = (jc1) cg6Var;
            int i10 = jc1Var.s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jc1Var.s = i10 - Integer.MIN_VALUE;
                Object obj = jc1Var.q;
                Object obj2 = nm6.a;
                i2 = jc1Var.s;
                e1g e1gVar = this.d;
                int i11 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        String str4 = c01Var.a;
                        jc1Var.j = c01Var;
                        jc1Var.k = j1gVar2;
                        jc1Var.m = j;
                        jc1Var.s = 1;
                        obj = h(str4, j1gVar2, jc1Var);
                        if (obj != obj2) {
                            j2 = j;
                            c01Var2 = c01Var;
                            if (!((Boolean) obj).booleanValue()) {
                                jc1Var.j = c01Var2;
                                jc1Var.k = j1gVar2;
                                jc1Var.m = j2;
                                jc1Var.n = 0;
                                jc1Var.s = 2;
                                obj = this.b.f(jc1Var);
                                if (obj != obj2) {
                                    i3 = 0;
                                    c01Var3 = c01Var2;
                                    j3 = j2;
                                    String str5 = ((xxq) obj).a;
                                    str5.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    p51 p51Var = this.c;
                                    if (ordinal != 0) {
                                        c01Var3.r = new Date(j3);
                                        List c = t75.c(c01Var3);
                                        Map b = tah.b(new Pair(c01Var3.a, j1g.a));
                                        jc1Var.j = c01Var3;
                                        jc1Var.k = null;
                                        jc1Var.l = str5;
                                        jc1Var.m = j3;
                                        jc1Var.n = i3;
                                        jc1Var.o = 0;
                                        jc1Var.p = 0;
                                        jc1Var.s = 3;
                                        if (p51Var.a(str5, c, b, jc1Var) != obj2) {
                                            long j7 = j3;
                                            c01Var4 = c01Var3;
                                            j4 = j7;
                                            i4 = i3;
                                            str = str5;
                                            i5 = 0;
                                            n0g n0gVar = new n0g(q0g.a, c01Var4.a);
                                            jc1Var.j = null;
                                            jc1Var.k = null;
                                            jc1Var.l = null;
                                            jc1Var.m = j4;
                                            jc1Var.n = i4;
                                            jc1Var.o = i11;
                                            jc1Var.p = i5;
                                            jc1Var.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new ac1(c01Var3.a, j1g.b, new Date(j3)));
                                        jc1Var.j = c01Var3;
                                        jc1Var.k = null;
                                        jc1Var.l = str5;
                                        jc1Var.m = j3;
                                        jc1Var.n = i3;
                                        jc1Var.o = 0;
                                        jc1Var.p = 0;
                                        jc1Var.s = 5;
                                        if (p51Var.h(str5, c2, jc1Var) != obj2) {
                                            long j8 = j3;
                                            c01Var5 = c01Var3;
                                            j5 = j8;
                                            i6 = i3;
                                            str2 = str5;
                                            i7 = 0;
                                            n0g n0gVar2 = new n0g(q0g.b, c01Var5.a);
                                            jc1Var.j = null;
                                            jc1Var.k = null;
                                            jc1Var.l = null;
                                            jc1Var.m = j5;
                                            jc1Var.n = i6;
                                            jc1Var.o = i11;
                                            jc1Var.p = i7;
                                            jc1Var.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        c01Var3.r = new Date(j3);
                                        List c3 = t75.c(c01Var3);
                                        Map b2 = tah.b(new Pair(c01Var3.a, j1g.c));
                                        jc1Var.j = c01Var3;
                                        jc1Var.k = null;
                                        jc1Var.l = str5;
                                        jc1Var.m = j3;
                                        jc1Var.n = i3;
                                        jc1Var.o = 0;
                                        jc1Var.p = 0;
                                        jc1Var.s = 7;
                                        if (p51Var.a(str5, c3, b2, jc1Var) != obj2) {
                                            long j9 = j3;
                                            c01Var6 = c01Var3;
                                            j6 = j9;
                                            i8 = i3;
                                            str3 = str5;
                                            i9 = 0;
                                            n0g n0gVar3 = new n0g(q0g.c, c01Var6.a);
                                            jc1Var.j = null;
                                            jc1Var.k = null;
                                            jc1Var.l = null;
                                            jc1Var.m = j6;
                                            jc1Var.n = i8;
                                            jc1Var.o = i11;
                                            jc1Var.p = i9;
                                            jc1Var.s = 8;
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
                        long j10 = jc1Var.m;
                        j1g j1gVar3 = jc1Var.k;
                        c01Var2 = jc1Var.j;
                        qgg.h0(obj);
                        j2 = j10;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = jc1Var.n;
                        j3 = jc1Var.m;
                        j1gVar2 = jc1Var.k;
                        c01Var3 = jc1Var.j;
                        qgg.h0(obj);
                        String str52 = ((xxq) obj).a;
                        str52.getClass();
                        ordinal = j1gVar2.ordinal();
                        p51 p51Var2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i12 = jc1Var.p;
                        int i13 = jc1Var.o;
                        i4 = jc1Var.n;
                        j4 = jc1Var.m;
                        str = jc1Var.l;
                        c01Var4 = jc1Var.j;
                        qgg.h0(obj);
                        i11 = i13;
                        i5 = i12;
                        n0g n0gVar4 = new n0g(q0g.a, c01Var4.a);
                        jc1Var.j = null;
                        jc1Var.k = null;
                        jc1Var.l = null;
                        jc1Var.m = j4;
                        jc1Var.n = i4;
                        jc1Var.o = i11;
                        jc1Var.p = i5;
                        jc1Var.s = 4;
                        break;
                    case 4:
                    case 6:
                    case 8:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i14 = jc1Var.p;
                        int i15 = jc1Var.o;
                        i6 = jc1Var.n;
                        j5 = jc1Var.m;
                        str2 = jc1Var.l;
                        c01Var5 = jc1Var.j;
                        qgg.h0(obj);
                        i11 = i15;
                        i7 = i14;
                        n0g n0gVar22 = new n0g(q0g.b, c01Var5.a);
                        jc1Var.j = null;
                        jc1Var.k = null;
                        jc1Var.l = null;
                        jc1Var.m = j5;
                        jc1Var.n = i6;
                        jc1Var.o = i11;
                        jc1Var.p = i7;
                        jc1Var.s = 6;
                        break;
                    case 7:
                        int i16 = jc1Var.p;
                        int i17 = jc1Var.o;
                        i8 = jc1Var.n;
                        j6 = jc1Var.m;
                        str3 = jc1Var.l;
                        c01Var6 = jc1Var.j;
                        qgg.h0(obj);
                        i11 = i17;
                        i9 = i16;
                        n0g n0gVar32 = new n0g(q0g.c, c01Var6.a);
                        jc1Var.j = null;
                        jc1Var.k = null;
                        jc1Var.l = null;
                        jc1Var.m = j6;
                        jc1Var.n = i8;
                        jc1Var.o = i11;
                        jc1Var.p = i9;
                        jc1Var.s = 8;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        jc1Var = new jc1(this, cg6Var);
        Object obj3 = jc1Var.q;
        Object obj22 = nm6.a;
        i2 = jc1Var.s;
        e1g e1gVar2 = this.d;
        int i112 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x013a, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0196, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ee, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u51 u51Var, j1g j1gVar, long j, cg6 cg6Var) {
        ic1 ic1Var;
        int i2;
        long j2;
        u51 u51Var2;
        int i3;
        u51 u51Var3;
        long j3;
        int ordinal;
        u51 u51Var4;
        long j4;
        int i4;
        String str;
        int i5;
        u51 u51Var5;
        long j5;
        int i6;
        String str2;
        int i7;
        u51 u51Var6;
        long j6;
        int i8;
        String str3;
        int i9;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof ic1) {
            ic1Var = (ic1) cg6Var;
            int i10 = ic1Var.s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ic1Var.s = i10 - Integer.MIN_VALUE;
                Object obj = ic1Var.q;
                Object obj2 = nm6.a;
                i2 = ic1Var.s;
                e1g e1gVar = this.d;
                int i11 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        String str4 = u51Var.a;
                        ic1Var.j = u51Var;
                        ic1Var.k = j1gVar2;
                        ic1Var.m = j;
                        ic1Var.s = 1;
                        obj = h(str4, j1gVar2, ic1Var);
                        if (obj != obj2) {
                            j2 = j;
                            u51Var2 = u51Var;
                            if (!((Boolean) obj).booleanValue()) {
                                ic1Var.j = u51Var2;
                                ic1Var.k = j1gVar2;
                                ic1Var.m = j2;
                                ic1Var.n = 0;
                                ic1Var.s = 2;
                                obj = this.b.f(ic1Var);
                                if (obj != obj2) {
                                    i3 = 0;
                                    u51Var3 = u51Var2;
                                    j3 = j2;
                                    String str5 = ((xxq) obj).a;
                                    str5.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    p51 p51Var = this.c;
                                    if (ordinal != 0) {
                                        List c = t75.c(i(u51Var3, j3));
                                        Map b = tah.b(new Pair(u51Var3.a, j1g.a));
                                        ic1Var.j = u51Var3;
                                        ic1Var.k = null;
                                        ic1Var.l = str5;
                                        ic1Var.m = j3;
                                        ic1Var.n = i3;
                                        ic1Var.o = 0;
                                        ic1Var.p = 0;
                                        ic1Var.s = 3;
                                        if (p51Var.a(str5, c, b, ic1Var) != obj2) {
                                            long j7 = j3;
                                            u51Var4 = u51Var3;
                                            j4 = j7;
                                            i4 = i3;
                                            str = str5;
                                            i5 = 0;
                                            n0g n0gVar = new n0g(q0g.a, u51Var4.a);
                                            ic1Var.j = null;
                                            ic1Var.k = null;
                                            ic1Var.l = null;
                                            ic1Var.m = j4;
                                            ic1Var.n = i4;
                                            ic1Var.o = i11;
                                            ic1Var.p = i5;
                                            ic1Var.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new ac1(u51Var3.a, j1g.b, new Date(j3)));
                                        ic1Var.j = u51Var3;
                                        ic1Var.k = null;
                                        ic1Var.l = str5;
                                        ic1Var.m = j3;
                                        ic1Var.n = i3;
                                        ic1Var.o = 0;
                                        ic1Var.p = 0;
                                        ic1Var.s = 5;
                                        if (p51Var.h(str5, c2, ic1Var) != obj2) {
                                            long j8 = j3;
                                            u51Var5 = u51Var3;
                                            j5 = j8;
                                            i6 = i3;
                                            str2 = str5;
                                            i7 = 0;
                                            n0g n0gVar2 = new n0g(q0g.b, u51Var5.a);
                                            ic1Var.j = null;
                                            ic1Var.k = null;
                                            ic1Var.l = null;
                                            ic1Var.m = j5;
                                            ic1Var.n = i6;
                                            ic1Var.o = i11;
                                            ic1Var.p = i7;
                                            ic1Var.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        List c3 = t75.c(i(u51Var3, j3));
                                        Map b2 = tah.b(new Pair(u51Var3.a, j1g.c));
                                        ic1Var.j = u51Var3;
                                        ic1Var.k = null;
                                        ic1Var.l = str5;
                                        ic1Var.m = j3;
                                        ic1Var.n = i3;
                                        ic1Var.o = 0;
                                        ic1Var.p = 0;
                                        ic1Var.s = 7;
                                        if (p51Var.a(str5, c3, b2, ic1Var) != obj2) {
                                            long j9 = j3;
                                            u51Var6 = u51Var3;
                                            j6 = j9;
                                            i8 = i3;
                                            str3 = str5;
                                            i9 = 0;
                                            n0g n0gVar3 = new n0g(q0g.c, u51Var6.a);
                                            ic1Var.j = null;
                                            ic1Var.k = null;
                                            ic1Var.l = null;
                                            ic1Var.m = j6;
                                            ic1Var.n = i8;
                                            ic1Var.o = i11;
                                            ic1Var.p = i9;
                                            ic1Var.s = 8;
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
                        long j10 = ic1Var.m;
                        j1g j1gVar3 = ic1Var.k;
                        u51Var2 = ic1Var.j;
                        qgg.h0(obj);
                        j2 = j10;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = ic1Var.n;
                        j3 = ic1Var.m;
                        j1gVar2 = ic1Var.k;
                        u51Var3 = ic1Var.j;
                        qgg.h0(obj);
                        String str52 = ((xxq) obj).a;
                        str52.getClass();
                        ordinal = j1gVar2.ordinal();
                        p51 p51Var2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i12 = ic1Var.p;
                        int i13 = ic1Var.o;
                        i4 = ic1Var.n;
                        j4 = ic1Var.m;
                        str = ic1Var.l;
                        u51Var4 = ic1Var.j;
                        qgg.h0(obj);
                        i11 = i13;
                        i5 = i12;
                        n0g n0gVar4 = new n0g(q0g.a, u51Var4.a);
                        ic1Var.j = null;
                        ic1Var.k = null;
                        ic1Var.l = null;
                        ic1Var.m = j4;
                        ic1Var.n = i4;
                        ic1Var.o = i11;
                        ic1Var.p = i5;
                        ic1Var.s = 4;
                        break;
                    case 4:
                    case 6:
                    case 8:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i14 = ic1Var.p;
                        int i15 = ic1Var.o;
                        i6 = ic1Var.n;
                        j5 = ic1Var.m;
                        str2 = ic1Var.l;
                        u51Var5 = ic1Var.j;
                        qgg.h0(obj);
                        i11 = i15;
                        i7 = i14;
                        n0g n0gVar22 = new n0g(q0g.b, u51Var5.a);
                        ic1Var.j = null;
                        ic1Var.k = null;
                        ic1Var.l = null;
                        ic1Var.m = j5;
                        ic1Var.n = i6;
                        ic1Var.o = i11;
                        ic1Var.p = i7;
                        ic1Var.s = 6;
                        break;
                    case 7:
                        int i16 = ic1Var.p;
                        int i17 = ic1Var.o;
                        i8 = ic1Var.n;
                        j6 = ic1Var.m;
                        str3 = ic1Var.l;
                        u51Var6 = ic1Var.j;
                        qgg.h0(obj);
                        i11 = i17;
                        i9 = i16;
                        n0g n0gVar32 = new n0g(q0g.c, u51Var6.a);
                        ic1Var.j = null;
                        ic1Var.k = null;
                        ic1Var.l = null;
                        ic1Var.m = j6;
                        ic1Var.n = i8;
                        ic1Var.o = i11;
                        ic1Var.p = i9;
                        ic1Var.s = 8;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ic1Var = new ic1(this, cg6Var);
        Object obj3 = ic1Var.q;
        Object obj22 = nm6.a;
        i2 = ic1Var.s;
        e1g e1gVar2 = this.d;
        int i112 = 0;
        switch (i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0129, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017f, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ce, code lost:
    
        if (r9.j(r8, r3, r4) != r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, j1g j1gVar, long j, cg6 cg6Var) {
        hc1 hc1Var;
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
        if (cg6Var instanceof hc1) {
            hc1Var = (hc1) cg6Var;
            int i10 = hc1Var.s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hc1Var.s = i10 - Integer.MIN_VALUE;
                Object obj = hc1Var.q;
                Object obj2 = nm6.a;
                i2 = hc1Var.s;
                e1g e1gVar = this.d;
                int i11 = 0;
                switch (i2) {
                    case 0:
                        qgg.h0(obj);
                        hc1Var.j = str;
                        hc1Var.k = j1gVar2;
                        hc1Var.m = j;
                        hc1Var.s = 1;
                        obj = h(str, j1gVar2, hc1Var);
                        if (obj != obj2) {
                            j2 = j;
                            str2 = str;
                            if (!((Boolean) obj).booleanValue()) {
                                hc1Var.j = str2;
                                hc1Var.k = j1gVar2;
                                hc1Var.m = j2;
                                hc1Var.n = 0;
                                hc1Var.s = 2;
                                obj = this.b.f(hc1Var);
                                if (obj != obj2) {
                                    i3 = 0;
                                    str3 = str2;
                                    j3 = j2;
                                    String str10 = ((xxq) obj).a;
                                    str10.getClass();
                                    ordinal = j1gVar2.ordinal();
                                    p51 p51Var = this.c;
                                    if (ordinal != 0) {
                                        List c = t75.c(new ac1(str3, j1g.a, new Date(j3)));
                                        hc1Var.j = str3;
                                        hc1Var.k = null;
                                        hc1Var.l = str10;
                                        hc1Var.m = j3;
                                        hc1Var.n = i3;
                                        hc1Var.o = 0;
                                        hc1Var.p = 0;
                                        hc1Var.s = 3;
                                        if (p51Var.h(str10, c, hc1Var) != obj2) {
                                            long j7 = j3;
                                            str4 = str3;
                                            j4 = j7;
                                            i4 = i3;
                                            str5 = str10;
                                            i5 = 0;
                                            n0g n0gVar = new n0g(q0g.a, str4);
                                            hc1Var.j = null;
                                            hc1Var.k = null;
                                            hc1Var.l = null;
                                            hc1Var.m = j4;
                                            hc1Var.n = i4;
                                            hc1Var.o = i11;
                                            hc1Var.p = i5;
                                            hc1Var.s = 4;
                                            break;
                                        }
                                    } else if (ordinal == 1) {
                                        List c2 = t75.c(new ac1(str3, j1g.b, new Date(j3)));
                                        hc1Var.j = str3;
                                        hc1Var.k = null;
                                        hc1Var.l = str10;
                                        hc1Var.m = j3;
                                        hc1Var.n = i3;
                                        hc1Var.o = 0;
                                        hc1Var.p = 0;
                                        hc1Var.s = 5;
                                        if (p51Var.h(str10, c2, hc1Var) != obj2) {
                                            long j8 = j3;
                                            str6 = str3;
                                            j5 = j8;
                                            i6 = i3;
                                            str7 = str10;
                                            i7 = 0;
                                            n0g n0gVar2 = new n0g(q0g.b, str6);
                                            hc1Var.j = null;
                                            hc1Var.k = null;
                                            hc1Var.l = null;
                                            hc1Var.m = j5;
                                            hc1Var.n = i6;
                                            hc1Var.o = i11;
                                            hc1Var.p = i7;
                                            hc1Var.s = 6;
                                            break;
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            b6e.s();
                                            return null;
                                        }
                                        List c3 = t75.c(new ac1(str3, j1g.c, new Date(j3)));
                                        hc1Var.j = str3;
                                        hc1Var.k = null;
                                        hc1Var.l = str10;
                                        hc1Var.m = j3;
                                        hc1Var.n = i3;
                                        hc1Var.o = 0;
                                        hc1Var.p = 0;
                                        hc1Var.s = 7;
                                        if (p51Var.h(str10, c3, hc1Var) != obj2) {
                                            long j9 = j3;
                                            str8 = str3;
                                            j6 = j9;
                                            i8 = i3;
                                            str9 = str10;
                                            i9 = 0;
                                            n0g n0gVar3 = new n0g(q0g.c, str8);
                                            hc1Var.j = null;
                                            hc1Var.k = null;
                                            hc1Var.l = null;
                                            hc1Var.m = j6;
                                            hc1Var.n = i8;
                                            hc1Var.o = i11;
                                            hc1Var.p = i9;
                                            hc1Var.s = 8;
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
                        long j10 = hc1Var.m;
                        j1g j1gVar3 = hc1Var.k;
                        str2 = hc1Var.j;
                        qgg.h0(obj);
                        j2 = j10;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        i3 = hc1Var.n;
                        j3 = hc1Var.m;
                        j1gVar2 = hc1Var.k;
                        str3 = hc1Var.j;
                        qgg.h0(obj);
                        String str102 = ((xxq) obj).a;
                        str102.getClass();
                        ordinal = j1gVar2.ordinal();
                        p51 p51Var2 = this.c;
                        if (ordinal != 0) {
                        }
                        return obj2;
                    case 3:
                        int i12 = hc1Var.p;
                        int i13 = hc1Var.o;
                        i4 = hc1Var.n;
                        j4 = hc1Var.m;
                        str5 = hc1Var.l;
                        str4 = hc1Var.j;
                        qgg.h0(obj);
                        i11 = i13;
                        i5 = i12;
                        n0g n0gVar4 = new n0g(q0g.a, str4);
                        hc1Var.j = null;
                        hc1Var.k = null;
                        hc1Var.l = null;
                        hc1Var.m = j4;
                        hc1Var.n = i4;
                        hc1Var.o = i11;
                        hc1Var.p = i5;
                        hc1Var.s = 4;
                        break;
                    case 4:
                    case 6:
                    case 8:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 5:
                        int i14 = hc1Var.p;
                        int i15 = hc1Var.o;
                        i6 = hc1Var.n;
                        j5 = hc1Var.m;
                        str7 = hc1Var.l;
                        str6 = hc1Var.j;
                        qgg.h0(obj);
                        i11 = i15;
                        i7 = i14;
                        n0g n0gVar22 = new n0g(q0g.b, str6);
                        hc1Var.j = null;
                        hc1Var.k = null;
                        hc1Var.l = null;
                        hc1Var.m = j5;
                        hc1Var.n = i6;
                        hc1Var.o = i11;
                        hc1Var.p = i7;
                        hc1Var.s = 6;
                        break;
                    case 7:
                        int i16 = hc1Var.p;
                        int i17 = hc1Var.o;
                        i8 = hc1Var.n;
                        j6 = hc1Var.m;
                        str9 = hc1Var.l;
                        str8 = hc1Var.j;
                        qgg.h0(obj);
                        i11 = i17;
                        i9 = i16;
                        n0g n0gVar32 = new n0g(q0g.c, str8);
                        hc1Var.j = null;
                        hc1Var.k = null;
                        hc1Var.l = null;
                        hc1Var.m = j6;
                        hc1Var.n = i8;
                        hc1Var.o = i11;
                        hc1Var.p = i9;
                        hc1Var.s = 8;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        hc1Var = new hc1(this, cg6Var);
        Object obj3 = hc1Var.q;
        Object obj22 = nm6.a;
        i2 = hc1Var.s;
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
    public final Object h(String str, j1g j1gVar, cg6 cg6Var) {
        kc1 kc1Var;
        Object obj;
        int i2;
        String str2;
        j1g j1gVar2;
        if (cg6Var instanceof kc1) {
            kc1Var = (kc1) cg6Var;
            int i3 = kc1Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kc1Var.n = i3 - Integer.MIN_VALUE;
                obj = kc1Var.l;
                Object obj2 = nm6.a;
                i2 = kc1Var.n;
                xdr xdrVar = this.g;
                if (i2 != 0) {
                    qgg.h0(obj);
                    kc1Var.j = str;
                    kc1Var.k = j1gVar;
                    kc1Var.n = 1;
                    obj = c(str, kc1Var);
                } else if (i2 == 1) {
                    j1gVar = kc1Var.k;
                    str = kc1Var.j;
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
                    j1gVar2 = kc1Var.k;
                    str2 = kc1Var.j;
                    qgg.h0(obj);
                    Map map = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(str2, map) : uah.j(map, new Pair(str2, j1gVar2)));
                    str2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, str2);
                    cc1 cc1Var = new cc1(j1gVar2, str2);
                    kc1Var.j = null;
                    kc1Var.k = null;
                    kc1Var.n = 3;
                }
                if (obj != j1gVar) {
                    ssg.a(4, "ArtistLikesCenter", "Change artist " + str + " like state to " + j1gVar + " skipped", null);
                    return Boolean.FALSE;
                }
                ssg.a(4, "ArtistLikesCenter", "Change artist " + str + " like state to " + j1gVar, null);
                bca bcaVar = new bca(xdrVar, 18);
                kc1Var.j = str;
                kc1Var.k = j1gVar;
                kc1Var.n = 2;
                obj = zsd.g0(bcaVar, kc1Var);
                if (obj != obj2) {
                    j1g j1gVar3 = j1gVar;
                    str2 = str;
                    j1gVar2 = j1gVar3;
                    Map map2 = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(str2, map2) : uah.j(map2, new Pair(str2, j1gVar2)));
                    str2.getClass();
                    j1gVar2.getClass();
                    this.e.b(j1gVar2, str2);
                    cc1 cc1Var2 = new cc1(j1gVar2, str2);
                    kc1Var.j = null;
                    kc1Var.k = null;
                    kc1Var.n = 3;
                }
                return obj2;
            }
        }
        kc1Var = new kc1(this, cg6Var);
        obj = kc1Var.l;
        Object obj22 = nm6.a;
        i2 = kc1Var.n;
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
    public final Object j(String str, HashMap hashMap, cg6 cg6Var) {
        lc1 lc1Var;
        int i2;
        if (cg6Var instanceof lc1) {
            lc1Var = (lc1) cg6Var;
            int i3 = lc1Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lc1Var.m = i3 - Integer.MIN_VALUE;
                Object obj = lc1Var.k;
                Object obj2 = nm6.a;
                i2 = lc1Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    lc1Var.j = hashMap;
                    lc1Var.m = 1;
                    obj = this.d.f(str, lc1Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashMap = lc1Var.j;
                    qgg.h0(obj);
                }
                for (n0g n0gVar : (List) obj) {
                    q0g q0gVar = n0gVar.a;
                    String str2 = n0gVar.b;
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
        lc1Var = new lc1(this, cg6Var);
        Object obj3 = lc1Var.k;
        Object obj22 = nm6.a;
        i2 = lc1Var.m;
        if (i2 != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.a;
    }
}
