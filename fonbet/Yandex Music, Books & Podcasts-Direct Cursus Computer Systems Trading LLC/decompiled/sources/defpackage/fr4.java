package defpackage;

import com.yandex.music.shared.play.audio2.db.PlayAudioDatabase;
import com.yandex.plus.core.analytics.logging.a;
import com.yandex.plus.core.analytics.logging.b;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.home.feature.webviews.internal.treasury.e;
import com.yandex.plus.home.graphql.configuration.j;
import com.yandex.plus.treasury.api.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class fr4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr4(Serializable serializable, int i, Object obj, Object obj2, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = serializable;
        this.l = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Serializable, pjc[]] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fr4((hr4) this.m, (c80) this.n, (onh) this.o, this.l, continuation, 0);
            case 1:
                return new fr4((Serializable) this.m, this.l, this.n, this.o, continuation, 1);
            case 2:
                fr4 fr4Var = new fr4(continuation, (chd) this.n, 2);
                fr4Var.m = obj;
                return fr4Var;
            case 3:
                return new fr4((klg) this.m, (cvl) this.n, (ArrayList) this.o, this.l, continuation, 3);
            case 4:
                return new fr4((klg) this.m, (cvl) this.n, (mqs) this.o, continuation, 4);
            case 5:
                return new fr4((xlg) this.m, (cvl) this.n, (ArrayList) this.o, this.l, continuation, 5);
            case 6:
                return new fr4((xlg) this.m, (cvl) this.n, (mqs) this.o, continuation, 6);
            case 7:
                fr4 fr4Var2 = new fr4((wnh) this.n, (co6) this.o, this.l, continuation);
                fr4Var2.m = obj;
                return fr4Var2;
            case 8:
                return new fr4((f7l) this.o, continuation, 8);
            case 9:
                fr4 fr4Var3 = new fr4(continuation, (zll) this.n, 9);
                fr4Var3.m = obj;
                return fr4Var3;
            case 10:
                fr4 fr4Var4 = new fr4(continuation, (x3n) this.n, 10);
                fr4Var4.m = obj;
                return fr4Var4;
            case 11:
                return new fr4((a3h) this.m, this.l, (List) this.n, (fvf) this.o, continuation, 11);
            case 12:
                fr4 fr4Var5 = new fr4((wot) this.o, continuation, 12);
                fr4Var5.n = obj;
                return fr4Var5;
            case 13:
                return new fr4((h) this.o, continuation, 13);
            case 14:
                return new fr4((e) this.o, continuation, 14);
            default:
                return new fr4((j) this.o, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((fr4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c4, code lost:
    
        if (r3 == r2) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0362, code lost:
    
        if (defpackage.neg.g(r2, r0, r4, r25) == r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036b, code lost:
    
        if (r2.f(r4, 0, r25) == r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d4, code lost:
    
        if (r2.r(r0, r8, r25) == r11) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03eb, code lost:
    
        if (r2.f(r8, r25) == r11) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0402, code lost:
    
        if (r2.p(r0, r8, r25) == r11) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b7, code lost:
    
        if (r0 == r11) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x045a, code lost:
    
        if (r0.emit(r2, r25) == r4) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r0.d(r25) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044b, code lost:
    
        if (defpackage.zsd.h0(r5, r8, r25) == r4) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04be, code lost:
    
        if (r0.b(r3, r25) == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04ad, code lost:
    
        if (r4.d(true, r25) == r2) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x055c, code lost:
    
        if (r4.a(r2, true, r25) == r6) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x054b, code lost:
    
        if (r3 == r6) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05b6, code lost:
    
        if (r2.a(r0, true, r25) == r3) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05ab, code lost:
    
        if (defpackage.xlg.a(r2, r0, r4, r5, r25) == r3) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x062e, code lost:
    
        if (r0 == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0672, code lost:
    
        if (r4.a(r13, true, r25) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x070c, code lost:
    
        if (r0 == r11) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0809, code lost:
    
        if (r2.a(r0, true, r25) == r11) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x088a, code lost:
    
        if (r3.a(r25) == r2) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        if (r3.a(r25) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        if (r0.g(r25) == r2) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v68, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v72, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x02c4 -> B:105:0x02c8). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        qqi qqiVar;
        int i2;
        int intValue;
        Object V;
        int i3;
        Object d;
        int intValue2;
        int i4;
        g4q g4qVar;
        hte hteVar;
        jhn jhnVar;
        Object f;
        int i5;
        Object obj2;
        String str;
        List list;
        List list2;
        oqi oqiVar;
        h hVar;
        oqi oqiVar2;
        e eVar;
        oqi oqiVar3;
        oqi oqiVar4;
        Object a;
        e eVar2;
        Object obj3;
        j jVar;
        int i6 = 10;
        ?? r4 = 4;
        int i7 = 0;
        int i8 = 2;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    hr4 hr4Var = (hr4) this.m;
                    dr4 dr4Var = new dr4(hr4Var, (c80) this.n, (onh) this.o, this.l);
                    this.k = 1;
                    if (hr4.b(hr4Var, dr4Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                AtomicInteger atomicInteger = (AtomicInteger) this.n;
                zi3 zi3Var = (zi3) this.o;
                nm6 nm6Var2 = nm6.a;
                int i10 = this.k;
                try {
                    if (i10 == 0) {
                        qgg.h0(obj);
                        pjc[] pjcVarArr = (pjc[]) this.m;
                        int i11 = this.l;
                        pjc pjcVar = pjcVarArr[i11];
                        ya5 ya5Var = new ya5(zi3Var, i11, 0);
                        this.k = 1;
                        if (pjcVar.collect(ya5Var, this) == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        zi3Var.n(null);
                    }
                    return Unit.a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        zi3Var.n(null);
                    }
                }
            case 2:
                Object obj4 = this.m;
                nm6 nm6Var3 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    zgd zgdVar = (zgd) obj4;
                    v3w.k("Emitted ", zgdVar.a, 4, "GlagolVolume", null);
                    chd chdVar = (chd) this.n;
                    chdVar.e.set(((zzp) chdVar.b.getValue()).a());
                    fzb fzbVar = ((chd) this.n).a;
                    this.m = null;
                    this.l = 0;
                    z = true;
                    this.k = 1;
                    if (fzbVar.invoke(zgdVar, this) != nm6Var3) {
                        i = 0;
                    }
                    return nm6Var3;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qqi qqiVar2 = (qqi) this.o;
                    qgg.h0(obj);
                    qqiVar = qqiVar2;
                    try {
                        rar rarVar = ((chd) this.n).k;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        chd chdVar2 = (chd) this.n;
                        chdVar2.k = x97.y(chdVar2.g, null, null, new g68(chdVar2, null, 26), 3);
                        qqiVar.b(null);
                        return Unit.a;
                    } catch (Throwable th) {
                        qqiVar.b(null);
                        throw th;
                    }
                }
                int i13 = this.l;
                qgg.h0(obj);
                i = i13;
                z = true;
                ((chd) this.n).i = z;
                qqiVar = ((chd) this.n).h;
                this.m = null;
                this.o = qqiVar;
                this.l = i;
                this.k = 2;
                break;
            case 3:
                cvl cvlVar = (cvl) this.n;
                l18 l18Var = l18.b;
                klg klgVar = (klg) this.m;
                Object obj5 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i14 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                jyr jyrVar = i2q.e;
                if (!lsq.v()) {
                    btl btlVar = klgVar.c;
                    ArrayList arrayList = (ArrayList) this.o;
                    int i15 = this.l;
                    btlVar.getClass();
                    cvlVar.getClass();
                    if (i15 < 0 || i15 > cvlVar.g) {
                        i2 = 2;
                        su4.s(2, null, k5r.i(i15, "addTracksToPlaylist(): incorrect position "), null);
                    } else {
                        long j = cvlVar.k;
                        if (j < 0) {
                            su4.s(2, null, "getBaseTrackTuplesFromPlaylist(): negative nativePlaylistId", null);
                            i2 = 2;
                        } else {
                            Date date = new Date(System.currentTimeMillis());
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new t2m((rr5) it.next(), date));
                            }
                            bdt I = hag.I(frt.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            String str2 = ((frt) qdcVar.C(I)).c().a;
                            str2.getClass();
                            long j2 = j;
                            x97.D(g.a, new qsl(btlVar, str2, j2, arrayList2, i15, null));
                            if (!Intrinsics.d(cvlVar.l, yxr.b)) {
                                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                int i16 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    rr5 rr5Var = ((t2m) next).a;
                                    long j3 = j2;
                                    j2 = j3;
                                    arrayList3.add(new hys(j3, 1, i15 + i16, rr5Var.a, rr5Var.b, null));
                                    i16 = i17;
                                }
                                btlVar.b.getClass();
                                p2m.a(str2, arrayList3);
                            }
                            i2 = 2;
                        }
                    }
                    pi4 pi4Var = (pi4) klgVar.d.getValue();
                    this.k = i2;
                    break;
                } else {
                    cvl cvlVar2 = (cvl) this.n;
                    ArrayList arrayList4 = (ArrayList) this.o;
                    int i18 = this.l;
                    bdt I2 = hag.I(frt.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    ((frt) qdcVar2.C(I2)).c().a.getClass();
                    xlg a2 = klgVar.a();
                    this.k = 1;
                    a2.getClass();
                    Object V2 = x97.V(dm6.a, new fr4(a2, cvlVar2, arrayList4, i18, (Continuation) null, 5), this);
                    if (V2 != obj5) {
                        V2 = Unit.a;
                        break;
                    }
                }
                return obj5;
            case 4:
                mqs mqsVar = (mqs) this.o;
                klg klgVar2 = (klg) this.m;
                cvl cvlVar3 = (cvl) this.n;
                nm6 nm6Var4 = nm6.a;
                int i19 = this.l;
                if (i19 != 0) {
                    if (i19 == 1) {
                        qgg.h0(obj);
                        V = obj;
                        return new Integer(((Number) V).intValue());
                    }
                    if (i19 != 2) {
                        if (i19 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = this.k;
                        qgg.h0(obj);
                        return new Integer(i3);
                    }
                    intValue = this.k;
                    qgg.h0(obj);
                    pi4 pi4Var2 = (pi4) klgVar2.d.getValue();
                    List c = t75.c(mqsVar.a);
                    nvl g = cvlVar3.g();
                    this.k = intValue;
                    this.l = 3;
                    if (pi4Var2.b(c, g, this) != nm6Var4) {
                        i3 = intValue;
                        return new Integer(i3);
                    }
                    return nm6Var4;
                }
                qgg.h0(obj);
                jyr jyrVar2 = i2q.e;
                if (!lsq.v()) {
                    btl btlVar2 = klgVar2.c;
                    long j4 = cvlVar3.k;
                    String str3 = mqsVar.a;
                    btlVar2.getClass();
                    str3.getClass();
                    intValue = ((Number) x97.D(g.a, new wsl(btlVar2, j4, str3, null))).intValue();
                    pi4 pi4Var3 = (pi4) klgVar2.d.getValue();
                    this.k = intValue;
                    this.l = 2;
                    break;
                } else {
                    l18 l18Var2 = l18.b;
                    bdt I3 = hag.I(frt.class);
                    qdc qdcVar3 = l18Var2.a;
                    qdcVar3.getClass();
                    ((frt) qdcVar3.C(I3)).c().a.getClass();
                    xlg a3 = klgVar2.a();
                    this.k = 0;
                    this.l = 1;
                    a3.getClass();
                    V = x97.V(dm6.a, new fr4(a3, cvlVar3, mqsVar, null, 6), this);
                    break;
                }
                return nm6Var4;
            case 5:
                cvl cvlVar4 = (cvl) this.n;
                xlg xlgVar = (xlg) this.m;
                nm6 nm6Var5 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    ArrayList arrayList5 = (ArrayList) this.o;
                    int i21 = this.l;
                    this.k = 1;
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pi4 pi4Var4 = xlgVar.d;
                this.k = 2;
                break;
            case 6:
                mqs mqsVar2 = (mqs) this.o;
                cvl cvlVar5 = (cvl) this.n;
                xlg xlgVar2 = (xlg) this.m;
                pi4 pi4Var5 = xlgVar2.d;
                nm6 nm6Var6 = nm6.a;
                int i22 = this.l;
                if (i22 == 0) {
                    qgg.h0(obj);
                    long j5 = cvlVar5.k;
                    String str4 = mqsVar2.a;
                    this.l = 1;
                    d = xlg.d(xlgVar2, j5, str4, this);
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = this.k;
                            qgg.h0(obj);
                            return new Integer(i4);
                        }
                        intValue2 = this.k;
                        qgg.h0(obj);
                        List c2 = t75.c(mqsVar2.a);
                        nvl g2 = cvlVar5.g();
                        this.k = intValue2;
                        this.l = 3;
                        if (pi4Var5.b(c2, g2, this) != nm6Var6) {
                            i4 = intValue2;
                            return new Integer(i4);
                        }
                        return nm6Var6;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                intValue2 = ((Number) d).intValue();
                this.k = intValue2;
                this.l = 2;
                break;
            case 7:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var7 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    wnh wnhVar = (wnh) this.n;
                    tc4 K = zsd.K(new e05(wnhVar, (co6) this.o, ((Number) wnhVar.e.getValue()).intValue(), this.l, null));
                    this.m = null;
                    this.k = 1;
                    if (K.collect(rjcVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                f7l f7lVar = (f7l) this.o;
                nm6 nm6Var8 = nm6.a;
                int i24 = this.l;
                if (i24 == 0) {
                    qgg.h0(obj);
                    g4qVar = (g4q) f7lVar.a.d.getValue();
                    if (g4qVar != null) {
                        uol uolVar = f7lVar.b;
                        this.m = f7lVar;
                        this.n = g4qVar;
                        this.k = 0;
                        this.l = 1;
                        break;
                    }
                    return Unit.a;
                }
                if (i24 == 1) {
                    i7 = this.k;
                    g4q g4qVar2 = (g4q) this.n;
                    f7l f7lVar2 = (f7l) this.m;
                    qgg.h0(obj);
                    g4qVar = g4qVar2;
                    f7lVar = f7lVar2;
                    g4l g4lVar = f7lVar.a;
                    this.m = null;
                    this.n = null;
                    this.k = i7;
                    this.l = 2;
                    break;
                } else {
                    if (i24 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
            case 9:
                x0q x0qVar = ((zll) this.n).k;
                Object obj6 = this.m;
                nm6 nm6Var9 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    hteVar = (hte) obj6;
                    wor i26 = x0qVar.i();
                    dt0 dt0Var = new dt0(i8, i6, continuation);
                    this.m = null;
                    this.o = hteVar;
                    this.l = 0;
                    this.k = 1;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = this.l;
                    hteVar = (hte) this.o;
                    qgg.h0(obj);
                }
                this.m = null;
                this.o = null;
                this.l = i7;
                this.k = 2;
                break;
            case 10:
                x3n x3nVar = (x3n) this.n;
                bgn bgnVar = (bgn) x3nVar.a;
                Object obj7 = this.m;
                nm6 nm6Var10 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    jhnVar = (jhn) obj7;
                    uol uolVar2 = (uol) x3nVar.b;
                    this.m = null;
                    this.o = jhnVar;
                    this.l = 0;
                    this.k = 1;
                    f = uolVar2.f(this);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2 || i27 == 3 || i27 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = this.l;
                    jhn jhnVar2 = (jhn) this.o;
                    qgg.h0(obj);
                    jhnVar = jhnVar2;
                    f = obj;
                }
                long longValue = ((Number) f).longValue();
                if (jhnVar instanceof khn) {
                    w5j w5jVar = ((khn) jhnVar).a;
                    this.m = null;
                    this.o = null;
                    this.l = i7;
                    this.k = 2;
                    break;
                } else if (Intrinsics.d(jhnVar, lhn.a)) {
                    this.m = null;
                    this.o = null;
                    this.l = i7;
                    this.k = 3;
                    break;
                } else {
                    if (!(jhnVar instanceof mhn)) {
                        b6e.s();
                        return null;
                    }
                    int i28 = ((mhn) jhnVar).a;
                    this.m = null;
                    this.o = null;
                    this.l = i7;
                    this.k = 4;
                    break;
                }
            case 11:
                int i29 = this.l;
                fvf fvfVar = (fvf) this.o;
                nm6 nm6Var11 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    if (((a3h) this.m) == a3h.b && (r4 = i29 + 1) >= 0) {
                        Float f2 = (Float) CollectionsKt.S((List) this.n, fvfVar.h());
                        if (fvfVar.h() != i29 || fvfVar.i() != 0 || f2 == null) {
                            this.k = 2;
                            break;
                        } else {
                            float floatValue = f2.floatValue();
                            act S = weo.S(800, 0, null, 6);
                            this.k = 1;
                            break;
                        }
                    }
                } else {
                    if (i30 != 1 && i30 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                mm6 mm6Var = (mm6) this.n;
                nm6 nm6Var12 = nm6.a;
                int i31 = this.l;
                int i32 = 25;
                if (i31 == 0) {
                    qgg.h0(obj);
                    ssg.a(4, ((wot) this.o).a, "upload2 start", null);
                    if (gld.T(mm6Var)) {
                        ivk ivkVar = (ivk) ((wot) this.o).c.getValue();
                        this.n = mm6Var;
                        this.m = null;
                        this.k = 25;
                        this.l = 1;
                        obj2 = ivkVar.b(25, this);
                        if (obj2 != nm6Var12) {
                        }
                        return nm6Var12;
                    }
                    ssg.a(4, ((wot) this.o).a, "upload2 complete", null);
                    return Unit.a;
                }
                if (i31 == 1) {
                    int i33 = this.k;
                    qgg.h0(obj);
                    i5 = i33;
                    obj2 = obj;
                    wot wotVar = (wot) this.o;
                    Pair pair = (Pair) obj2;
                    str = ((yuk) ((zuk) wotVar.b.getValue())).g.q;
                    if (str != null) {
                    }
                    list = (List) pair.a;
                    list2 = (List) pair.b;
                    if (!list2.isEmpty()) {
                    }
                    ssg.a(4, ((wot) this.o).a, "upload2 complete", null);
                    return Unit.a;
                }
                if (i31 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = (List) this.m;
                qgg.h0(obj);
                list = list3;
                Object a4 = obj;
                int ordinal = ((uot) a4).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(4, ((wot) this.o).a, "upload2 complete", null);
                    return Unit.a;
                }
                ivk ivkVar2 = (ivk) ((wot) this.o).c.getValue();
                ivkVar2.getClass();
                list.getClass();
                PlayAudioDatabase playAudioDatabase = ivkVar2.b;
                zvh zvhVar = new zvh(13, list, ivkVar2);
                playAudioDatabase.getClass();
                playAudioDatabase.s(new b6n(i32, zvhVar));
                if (gld.T(mm6Var) && ((uuk) ((wot) this.o).e.getValue()).a.a().c) {
                    ivk ivkVar3 = (ivk) ((wot) this.o).c.getValue();
                    this.n = mm6Var;
                    this.m = null;
                    this.k = 25;
                    this.l = 1;
                    obj2 = ivkVar3.b(25, this);
                    if (obj2 != nm6Var12) {
                        i5 = 25;
                        wot wotVar2 = (wot) this.o;
                        Pair pair2 = (Pair) obj2;
                        str = ((yuk) ((zuk) wotVar2.b.getValue())).g.q;
                        if (str != null) {
                            int size = ((List) pair2.a).size();
                            ArrayList C0 = CollectionsKt.C0((Iterable) pair2.a, (Iterable) pair2.b);
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it3 = C0.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (!Intrinsics.d(((ruk) ((Pair) next2).b).f, str)) {
                                    arrayList6.add(next2);
                                }
                            }
                            pair2 = v75.q(arrayList6);
                            int size2 = ((List) pair2.a).size();
                            if (size != size2) {
                                ssg.a(4, wotVar2.a, dfi.c(size - size2, "filtered2 out ", " items"), null);
                            }
                        }
                        list = (List) pair2.a;
                        list2 = (List) pair2.b;
                        if (!list2.isEmpty()) {
                            ssg.a(4, ((wot) this.o).a, dfi.c(list2.size(), "uploading2 ", " bundles"), null);
                            wot wotVar3 = (wot) this.o;
                            this.n = mm6Var;
                            this.m = list;
                            this.k = i5;
                            this.l = 2;
                            a4 = wot.a(wotVar3, list2, this);
                            break;
                        }
                    }
                    return nm6Var12;
                }
                ssg.a(4, ((wot) this.o).a, "upload2 complete", null);
                return Unit.a;
            case 13:
                h hVar2 = (h) this.o;
                nm6 nm6Var13 = nm6.a;
                int i34 = this.l;
                try {
                    if (i34 == 0) {
                        qgg.h0(obj);
                        qqi qqiVar3 = hVar2.j;
                        this.m = qqiVar3;
                        this.n = hVar2;
                        this.k = 0;
                        this.l = 1;
                        if (qqiVar3.a(this) != nm6Var13) {
                            oqiVar = qqiVar3;
                            hVar = hVar2;
                        }
                        return nm6Var13;
                    }
                    if (i34 != 1) {
                        if (i34 != 2) {
                            if (i34 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = (oqi) this.m;
                        try {
                            qgg.h0(obj);
                            oqiVar2.b(null);
                            if (((Number) hVar2.k.i().getValue()).intValue() > 0) {
                                this.m = null;
                                this.l = 3;
                                break;
                            }
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    i7 = this.k;
                    hVar = (h) this.n;
                    oqiVar = (oqi) this.m;
                    qgg.h0(obj);
                    this.m = oqiVar;
                    this.n = null;
                    this.k = i7;
                    this.l = 2;
                    if (h.c(hVar, this) != nm6Var13) {
                        oqiVar2 = oqiVar;
                        oqiVar2.b(null);
                        if (((Number) hVar2.k.i().getValue()).intValue() > 0) {
                        }
                        return Unit.a;
                    }
                    return nm6Var13;
                } catch (Throwable th3) {
                    th = th3;
                    oqiVar2 = oqiVar;
                    throw th;
                }
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i35 = this.l;
                try {
                    if (i35 == 0) {
                        qgg.h0(obj);
                        eVar = (e) this.o;
                        oqiVar3 = eVar.e;
                        this.m = oqiVar3;
                        this.n = eVar;
                        this.k = 0;
                        this.l = 1;
                        break;
                    } else {
                        if (i35 != 1) {
                            if (i35 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eVar2 = (e) this.n;
                            oqiVar4 = (oqi) this.m;
                            try {
                                qgg.h0(obj);
                                a = obj;
                                eVar2.c = (c) a;
                                b bVar = b.g;
                                jyr jyrVar3 = com.yandex.plus.core.analytics.logging.e.a;
                                com.yandex.plus.core.analytics.logging.e.e(a.a, bVar, "preload() preloaded", null);
                                oqiVar3 = oqiVar4;
                                oqiVar3.b(null);
                                return Unit.a;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        }
                        i7 = this.k;
                        eVar = (e) this.n;
                        oqiVar3 = (oqi) this.m;
                        qgg.h0(obj);
                    }
                    if (eVar.c == null) {
                        this.m = oqiVar3;
                        this.n = eVar;
                        this.k = i7;
                        this.l = 2;
                        a = e.a(eVar, this);
                        if (a != nm6Var14) {
                            eVar2 = eVar;
                            oqiVar4 = oqiVar3;
                            eVar2.c = (c) a;
                            b bVar2 = b.g;
                            jyr jyrVar32 = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(a.a, bVar2, "preload() preloaded", null);
                            oqiVar3 = oqiVar4;
                        }
                        return nm6Var14;
                    }
                    oqiVar3.b(null);
                    return Unit.a;
                } catch (Throwable th5) {
                    th = th5;
                    oqiVar4 = oqiVar3;
                    throw th;
                }
            default:
                j jVar2 = (j) this.o;
                nm6 nm6Var15 = nm6.a;
                int i36 = this.l;
                try {
                    if (i36 == 0) {
                        qgg.h0(obj);
                        qqi qqiVar4 = jVar2.k;
                        this.m = qqiVar4;
                        this.n = jVar2;
                        this.k = 0;
                        this.l = 1;
                        if (qqiVar4.a(this) != nm6Var15) {
                            obj3 = qqiVar4;
                            jVar = jVar2;
                        }
                        return nm6Var15;
                    }
                    if (i36 != 1) {
                        if (i36 != 2) {
                            if (i36 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jVar = (j) this.n;
                        oqi oqiVar5 = (oqi) this.m;
                        qgg.h0(obj);
                        r4 = oqiVar5;
                        jVar.m = null;
                        jVar.l.l(null);
                        r4.b(null);
                        if (((Number) jVar2.l.i().getValue()).intValue() > 0) {
                            this.m = null;
                            this.n = null;
                            this.l = 3;
                            break;
                        }
                        return Unit.a;
                    }
                    i7 = this.k;
                    jVar = (j) this.n;
                    Object obj8 = (oqi) this.m;
                    qgg.h0(obj);
                    obj3 = obj8;
                    d dVar = jVar.g;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (dVar.b(aVar)) {
                        dVar.a(aVar, "SdkConfigurationRepositoryImpl", "clearCache()", null);
                    }
                    ou7 ou7Var = jVar.m;
                    r4 = obj3;
                    if (ou7Var != null) {
                        this.m = obj3;
                        this.n = jVar;
                        this.k = i7;
                        this.l = 2;
                        r4 = obj3;
                        if (saf.C(ou7Var, this) == nm6Var15) {
                            return nm6Var15;
                        }
                    }
                    jVar.m = null;
                    jVar.l.l(null);
                    r4.b(null);
                    if (((Number) jVar2.l.i().getValue()).intValue() > 0) {
                    }
                    return Unit.a;
                } finally {
                    r4.b(null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr4(wnh wnhVar, co6 co6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.n = wnhVar;
        this.o = co6Var;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr4(Object obj, cvl cvlVar, mqs mqsVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = cvlVar;
        this.o = mqsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr4(Object obj, Object obj2, Object obj3, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr4(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr4(Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }
}
