package defpackage;

import com.yandex.music.shared.offline.recommender.proto.a;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class llj {
    public final ck7 a;
    public final jyr b;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public volatile aqd j;
    public boolean k;
    public final tf6 c = gld.e(dm6.b);
    public final xdr h = ydr.a(null);
    public final xdr i = ydr.a(null);

    public llj(ck7 ck7Var, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5) {
        this.a = ck7Var;
        this.b = jyrVar4;
        this.d = jyrVar;
        this.e = jyrVar2;
        this.f = jyrVar3;
        this.g = btf.b(new c76(jyrVar5, 18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01f9, code lost:
    
        if (r4.e(r12, r3, r0, r5) != r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0196, code lost:
    
        if (r22.e(r12, r3, r0, r5) != r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a8, code lost:
    
        if (r7 == r6) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(llj lljVar, String str, kvu kvuVar, boolean z, cg6 cg6Var) {
        klj kljVar;
        nm6 nm6Var;
        int i;
        boolean z2;
        Object d;
        ?? r12;
        String str2;
        boolean z3;
        int i2;
        kvu kvuVar2;
        boolean z4;
        int i3;
        int i4;
        String str3;
        int i5;
        llj lljVar2;
        String str4;
        kvu kvuVar3;
        boolean z5;
        int i6;
        String str5;
        int i7;
        ?? r8;
        String str6 = str;
        kvu kvuVar4 = kvuVar;
        ck7 ck7Var = lljVar.a;
        if (cg6Var instanceof klj) {
            kljVar = (klj) cg6Var;
            int i8 = kljVar.r;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kljVar.r = i8 - Integer.MIN_VALUE;
                Object obj = kljVar.p;
                nm6Var = nm6.a;
                i = kljVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    lljVar.i.l((List) kvuVar4.c.getValue());
                    lljVar.k = true;
                    kljVar.j = str6;
                    kljVar.k = kvuVar4;
                    z2 = z;
                    kljVar.l = z2;
                    kljVar.r = 1;
                    d = lljVar.d(str6, kljVar);
                } else if (i == 1) {
                    boolean z6 = kljVar.l;
                    kvuVar4 = kljVar.k;
                    String str7 = kljVar.j;
                    qgg.h0(obj);
                    z2 = z6;
                    str6 = str7;
                    d = obj;
                } else if (i == 2) {
                    i5 = kljVar.o;
                    i4 = kljVar.n;
                    i3 = kljVar.m;
                    z4 = kljVar.l;
                    kvuVar2 = kljVar.k;
                    str3 = kljVar.j;
                    qgg.h0(obj);
                    str2 = ", trackCount=";
                    flj fljVar = i3 == 0 ? flj.a : flj.b;
                    ssg.a(3, "OfflineRecommenderCenter", "Launch TinyMl program update: reason=" + fljVar + str2 + kvuVar2.a.size(), null);
                    lvu a = kvuVar2.a();
                    kljVar.j = null;
                    kljVar.k = null;
                    kljVar.l = z4;
                    kljVar.m = i3;
                    kljVar.n = i4;
                    kljVar.o = i5;
                    kljVar.r = 3;
                } else {
                    if (i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = kljVar.o;
                    i6 = kljVar.n;
                    int i9 = kljVar.m;
                    z5 = kljVar.l;
                    kvuVar3 = kljVar.k;
                    str5 = kljVar.j;
                    qgg.h0(obj);
                    str4 = ", trackCount=";
                    r8 = i9;
                    lljVar2 = lljVar;
                    flj fljVar2 = flj.c;
                    ssg.a(3, "OfflineRecommenderCenter", "Launch TinyMl program update: reason=" + fljVar2 + str4 + kvuVar3.a.size(), null);
                    lvu a2 = kvuVar3.a();
                    kljVar.j = null;
                    kljVar.k = null;
                    kljVar.l = z5;
                    kljVar.m = r8;
                    kljVar.n = i6;
                    kljVar.o = i7;
                    kljVar.r = 5;
                }
                a aVar = (a) d;
                boolean z7 = Intrinsics.d(aVar.a, str6) || aVar.c.isEmpty() || System.currentTimeMillis() - aVar.d >= ck7Var.a;
                r12 = (z2 || Math.abs(kvuVar4.a.size() - aVar.b) < 3) ? 0 : 1;
                String b = iks.b(aVar);
                long j = aVar.d;
                int size = kvuVar4.a.size();
                str2 = ", trackCount=";
                z3 = z7;
                StringBuilder h = v3w.h("Try TinyMl program update: version=", b, " isProgramExpired=", " areDownloadsExpired=", z3);
                dfi.t(h, r12, " isFirstUpdate=", z2, " timestamp=");
                h.append(j);
                h.append(" tracks=");
                h.append(size);
                ssg.a(3, "OfflineRecommenderCenter", h.toString(), null);
                i2 = kvuVar4.a.size() < 3 ? 1 : 0;
                if ((z3 && r12 == 0) || i2 == 0) {
                    lljVar2 = lljVar;
                    if (z2 || i2 == 0) {
                        return Unit.a;
                    }
                    str4 = str2;
                    long j2 = ck7Var.b;
                    kljVar.j = str6;
                    kljVar.k = kvuVar4;
                    kljVar.l = z2;
                    kljVar.m = z3 ? 1 : 0;
                    kljVar.n = r12;
                    kljVar.o = i2;
                    kljVar.r = 4;
                    if (y2x.o(j2, kljVar) != nm6Var) {
                        kvuVar3 = kvuVar4;
                        z5 = z2;
                        i6 = r12;
                        str5 = str6;
                        i7 = i2;
                        r8 = z3;
                        flj fljVar22 = flj.c;
                        ssg.a(3, "OfflineRecommenderCenter", "Launch TinyMl program update: reason=" + fljVar22 + str4 + kvuVar3.a.size(), null);
                        lvu a22 = kvuVar3.a();
                        kljVar.j = null;
                        kljVar.k = null;
                        kljVar.l = z5;
                        kljVar.m = r8;
                        kljVar.n = i6;
                        kljVar.o = i7;
                        kljVar.r = 5;
                    }
                } else {
                    kljVar.j = str6;
                    kljVar.k = kvuVar4;
                    kljVar.l = z2;
                    kljVar.m = z3 ? 1 : 0;
                    kljVar.n = r12;
                    kljVar.o = i2;
                    kljVar.r = 2;
                    if (y2x.o(5000L, kljVar) != nm6Var) {
                        kvuVar2 = kvuVar4;
                        z4 = z2;
                        i3 = z3 ? 1 : 0;
                        i4 = r12;
                        str3 = str6;
                        i5 = i2;
                        if (i3 == 0) {
                        }
                        ssg.a(3, "OfflineRecommenderCenter", "Launch TinyMl program update: reason=" + fljVar + str2 + kvuVar2.a.size(), null);
                        lvu a3 = kvuVar2.a();
                        kljVar.j = null;
                        kljVar.k = null;
                        kljVar.l = z4;
                        kljVar.m = i3;
                        kljVar.n = i4;
                        kljVar.o = i5;
                        kljVar.r = 3;
                    }
                }
                return nm6Var;
            }
        }
        kljVar = new klj(lljVar, cg6Var);
        Object obj2 = kljVar.p;
        nm6Var = nm6.a;
        i = kljVar.r;
        if (i != 0) {
        }
        a aVar2 = (a) d;
        if (Intrinsics.d(aVar2.a, str6)) {
        }
        if (z2) {
        }
        String b2 = iks.b(aVar2);
        long j3 = aVar2.d;
        int size2 = kvuVar4.a.size();
        str2 = ", trackCount=";
        z3 = z7;
        StringBuilder h2 = v3w.h("Try TinyMl program update: version=", b2, " isProgramExpired=", " areDownloadsExpired=", z3);
        dfi.t(h2, r12, " isFirstUpdate=", z2, " timestamp=");
        h2.append(j3);
        h2.append(" tracks=");
        h2.append(size2);
        ssg.a(3, "OfflineRecommenderCenter", h2.toString(), null);
        if (kvuVar4.a.size() < 3) {
        }
        if (z3) {
        }
        kljVar.j = str6;
        kljVar.k = kvuVar4;
        kljVar.l = z2;
        kljVar.m = z3 ? 1 : 0;
        kljVar.n = r12;
        kljVar.o = i2;
        kljVar.r = 2;
        if (y2x.o(5000L, kljVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        glj gljVar;
        int i;
        mse mseVar;
        int[] v0;
        a aVar;
        Throwable th;
        yiu e;
        int[] iArr;
        o6c o6cVar;
        try {
            if (cg6Var instanceof glj) {
                gljVar = (glj) cg6Var;
                int i2 = gljVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gljVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = gljVar.m;
                    nm6 nm6Var = nm6.a;
                    i = gljVar.o;
                    jyr jyrVar = this.g;
                    if (i != 0) {
                        qgg.h0(obj);
                        bca bcaVar = new bca(this.h, 18);
                        gljVar.o = 1;
                        obj = zsd.g0(bcaVar, gljVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            iArr = gljVar.l;
                            o6cVar = gljVar.k;
                            aVar = gljVar.j;
                            try {
                                qgg.h0(obj);
                                irg irgVar = irg.d;
                                o6cVar.getClass();
                                return o6c.B(iArr, (int[]) obj, irgVar);
                            } catch (yiu e2) {
                                e = e2;
                                Assertions.throwOrSkip("OfflineRecommenderCenter", new FailedAssertionException(f1d.g("TinyMl initialization error, cause: ", e.getMessage()), e));
                                ((elj) jyrVar.getValue()).a(aVar, "createInstance", e.getMessage());
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                Assertions.throwOrSkip("OfflineRecommenderCenter", new FailedAssertionException("TinyMl unknown initialization error!", th));
                                ((elj) jyrVar.getValue()).a(aVar, "unknown", th.getMessage());
                                return null;
                            }
                        }
                        qgg.h0(obj);
                    }
                    a aVar2 = (a) obj;
                    s9f[] s9fVarArr = iks.a;
                    aVar2.getClass();
                    mseVar = aVar2.c;
                    mseVar.getClass();
                    if (mseVar.isEmpty()) {
                        mseVar = null;
                    }
                    v0 = mseVar == null ? CollectionsKt.v0(mseVar) : null;
                    if (v0 != null) {
                        ssg.a(6, "OfflineRecommenderCenter", "createTinyMlRecommender: TinyML program can't be null!", null);
                        return null;
                    }
                    try {
                        o6c o6cVar2 = o6c.s;
                        hks hksVar = (hks) this.b.getValue();
                        gljVar.j = aVar2;
                        gljVar.k = o6cVar2;
                        gljVar.l = v0;
                        gljVar.o = 2;
                        Object b = hksVar.b(gljVar);
                        if (b != nm6Var) {
                            aVar = aVar2;
                            obj = b;
                            iArr = v0;
                            o6cVar = o6cVar2;
                            irg irgVar2 = irg.d;
                            o6cVar.getClass();
                            return o6c.B(iArr, (int[]) obj, irgVar2);
                        }
                        return nm6Var;
                    } catch (yiu e3) {
                        aVar = aVar2;
                        e = e3;
                        Assertions.throwOrSkip("OfflineRecommenderCenter", new FailedAssertionException(f1d.g("TinyMl initialization error, cause: ", e.getMessage()), e));
                        ((elj) jyrVar.getValue()).a(aVar, "createInstance", e.getMessage());
                        return null;
                    } catch (Throwable th3) {
                        aVar = aVar2;
                        th = th3;
                        Assertions.throwOrSkip("OfflineRecommenderCenter", new FailedAssertionException("TinyMl unknown initialization error!", th));
                        ((elj) jyrVar.getValue()).a(aVar, "unknown", th.getMessage());
                        return null;
                    }
                }
            }
            if (i != 0) {
            }
            a aVar22 = (a) obj;
            s9f[] s9fVarArr2 = iks.a;
            aVar22.getClass();
            mseVar = aVar22.c;
            mseVar.getClass();
            if (mseVar.isEmpty()) {
            }
            if (mseVar == null) {
            }
            if (v0 != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        gljVar = new glj(this, cg6Var);
        Object obj2 = gljVar.m;
        nm6 nm6Var2 = nm6.a;
        i = gljVar.o;
        jyr jyrVar2 = this.g;
    }

    public final List c() {
        Object value = this.i.getValue();
        if (value == null) {
            su4.s(2, null, "allTracks is not initialized", null);
        }
        List list = (List) value;
        return list == null ? c5b.a : list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        ilj iljVar;
        int i;
        a aVar;
        if (cg6Var instanceof ilj) {
            iljVar = (ilj) cg6Var;
            int i2 = iljVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iljVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iljVar.k;
                nm6 nm6Var = nm6.a;
                i = iljVar.m;
                jyr jyrVar = this.b;
                xdr xdrVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar = (a) xdrVar.getValue();
                    if (aVar == null) {
                        hks hksVar = (hks) jyrVar.getValue();
                        iljVar.j = str;
                        iljVar.m = 1;
                        obj = hksVar.c(iljVar);
                    }
                    if (!Intrinsics.d(str, aVar.a) && !aVar.c.isEmpty()) {
                        return aVar;
                    }
                    hks hksVar2 = (hks) jyrVar.getValue();
                    iljVar.j = null;
                    iljVar.m = 2;
                    obj = hksVar2.a(iljVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a aVar2 = (a) obj;
                        xdrVar.l(aVar2);
                        return aVar2;
                    }
                    str = iljVar.j;
                    qgg.h0(obj);
                }
                aVar = (a) obj;
                xdrVar.l(aVar);
                if (!Intrinsics.d(str, aVar.a)) {
                }
                hks hksVar22 = (hks) jyrVar.getValue();
                iljVar.j = null;
                iljVar.m = 2;
                obj = hksVar22.a(iljVar);
            }
        }
        iljVar = new ilj(this, cg6Var);
        Object obj2 = iljVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iljVar.m;
        jyr jyrVar2 = this.b;
        xdr xdrVar2 = this.h;
        if (i != 0) {
        }
        aVar = (a) obj2;
        xdrVar2.l(aVar);
        if (!Intrinsics.d(str, aVar.a)) {
        }
        hks hksVar222 = (hks) jyrVar2.getValue();
        iljVar.j = null;
        iljVar.m = 2;
        obj2 = hksVar222.a(iljVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, lvu lvuVar, flj fljVar, cg6 cg6Var) {
        jlj jljVar;
        int i;
        rj6 rj6Var;
        int[] iArr;
        lvu lvuVar2;
        flj fljVar2;
        if (cg6Var instanceof jlj) {
            jljVar = (jlj) cg6Var;
            int i2 = jljVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jljVar.p = i2 - Integer.MIN_VALUE;
                Object obj = jljVar.n;
                nm6 nm6Var = nm6.a;
                i = jljVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    rlj rljVar = (rlj) this.e.getValue();
                    List list = lvuVar.a;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((jja) it.next()).a.a);
                    }
                    List list2 = lvuVar.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((jja) it2.next()).a.a);
                    }
                    List list3 = lvuVar.c;
                    ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((jja) it3.next()).a.a);
                    }
                    jljVar.j = str;
                    jljVar.k = lvuVar;
                    jljVar.l = fljVar;
                    jljVar.p = 1;
                    obj = rljVar.a(arrayList, arrayList2, arrayList3, jljVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iArr = jljVar.m;
                        fljVar2 = jljVar.l;
                        lvuVar2 = jljVar.k;
                        qgg.h0(obj);
                        a aVar = (a) obj;
                        this.h.l(aVar);
                        ssg.a(3, "OfflineRecommenderCenter", "TinyMl program update success: version=" + iks.b(aVar) + " reason=" + fljVar2 + ", trackCount=" + lvuVar2.d + " size=" + iArr.length, null);
                        elj eljVar = (elj) this.g.getValue();
                        String name = fljVar2.name();
                        eljVar.getClass();
                        name.getClass();
                        t70 t70Var = eljVar.a;
                        f9h f9hVar = new f9h();
                        f9hVar.put("reason", name);
                        f9hVar.put("programVersion", iks.b(aVar));
                        f9hVar.put("programUpdateDate", iks.a(aVar));
                        f9hVar.put("programSize", Integer.valueOf(aVar.c.size()));
                        f9hVar.put("totalTrackCount", Integer.valueOf(aVar.b));
                        ot0.A(t70Var.e(), "OFFLINERECOMMENDER_PROGRAMUPDATE", f9hVar.b());
                        return Unit.a;
                    }
                    fljVar = jljVar.l;
                    lvuVar = jljVar.k;
                    str = jljVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    return Unit.a;
                }
                int[] iArr2 = (int[]) ((qj6) rj6Var).a;
                hks hksVar = (hks) this.b.getValue();
                int i3 = lvuVar.d;
                jljVar.j = null;
                jljVar.k = lvuVar;
                jljVar.l = fljVar;
                jljVar.m = iArr2;
                jljVar.p = 2;
                Object a = ((wb7) iks.b.getValue(hksVar.a, iks.a[0])).a(new fpq(str, i3, iArr2, (Continuation) null), jljVar);
                if (a != nm6Var) {
                    obj = a;
                    iArr = iArr2;
                    flj fljVar3 = fljVar;
                    lvuVar2 = lvuVar;
                    fljVar2 = fljVar3;
                    a aVar2 = (a) obj;
                    this.h.l(aVar2);
                    ssg.a(3, "OfflineRecommenderCenter", "TinyMl program update success: version=" + iks.b(aVar2) + " reason=" + fljVar2 + ", trackCount=" + lvuVar2.d + " size=" + iArr.length, null);
                    elj eljVar2 = (elj) this.g.getValue();
                    String name2 = fljVar2.name();
                    eljVar2.getClass();
                    name2.getClass();
                    t70 t70Var2 = eljVar2.a;
                    f9h f9hVar2 = new f9h();
                    f9hVar2.put("reason", name2);
                    f9hVar2.put("programVersion", iks.b(aVar2));
                    f9hVar2.put("programUpdateDate", iks.a(aVar2));
                    f9hVar2.put("programSize", Integer.valueOf(aVar2.c.size()));
                    f9hVar2.put("totalTrackCount", Integer.valueOf(aVar2.b));
                    ot0.A(t70Var2.e(), "OFFLINERECOMMENDER_PROGRAMUPDATE", f9hVar2.b());
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        jljVar = new jlj(this, cg6Var);
        Object obj2 = jljVar.n;
        nm6 nm6Var2 = nm6.a;
        i = jljVar.p;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
