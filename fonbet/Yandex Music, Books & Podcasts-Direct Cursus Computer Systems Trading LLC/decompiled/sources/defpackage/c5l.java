package defpackage;

import android.content.Intent;
import com.yandex.media.ynison.service.e0;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class c5l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5l(jx7 jx7Var, fvf fvfVar, eoe eoeVar, Continuation continuation) {
        super(2, continuation);
        this.j = 13;
        float f = edo.a;
        this.l = jx7Var;
        this.m = fvfVar;
        this.n = eoeVar;
    }

    private final Object k(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return Unit.a;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        mm6 mm6Var = (mm6) this.l;
        bnn bnnVar = (bnn) this.m;
        qdi qdiVar = (qdi) this.n;
        this.k = 1;
        bnnVar.invoke(mm6Var, qdiVar, this);
        return nm6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                c5l c5lVar = new c5l((d5l) this.m, (String) obj2, continuation, 0);
                c5lVar.l = obj;
                return c5lVar;
            case 1:
                return new c5l((nyf) this.l, (eno) this.m, continuation, (a) obj2, 1);
            case 2:
                return new c5l((nyf) this.l, (pjc) this.m, continuation, (jdl) obj2, 2);
            case 3:
                return new c5l((xol) this.l, (vgl) this.m, (Integer) obj2, continuation, 3);
            case 4:
                return new c5l((cvl) this.l, (wrl) this.m, (PlaylistScreenActivity) obj2, continuation, 4);
            case 5:
                return new c5l((btl) this.l, (String) obj2, (Serializable) this.m, continuation, 5);
            case 6:
                return new c5l((btl) this.l, (String) obj2, (Serializable) this.m, continuation, 6);
            case 7:
                return new c5l((String) obj2, (xqn) this.l, (ArrayList) this.m, continuation);
            case 8:
                return new c5l((jul) this.l, (cvl) this.m, (String) obj2, continuation, 8);
            case 9:
                return new c5l((oul) this.l, (cvl) this.m, (List) obj2, continuation, 9);
            case 10:
                c5l c5lVar2 = new c5l((n0m) this.m, (Intent) obj2, continuation, 10);
                c5lVar2.l = obj;
                return c5lVar2;
            case 11:
                c5l c5lVar3 = new c5l((mmo) this.m, (lxl) obj2, continuation, 11);
                c5lVar3.l = obj;
                return c5lVar3;
            case 12:
                c5l c5lVar4 = new c5l((mmo) obj2, continuation, 12);
                c5lVar4.l = obj;
                return c5lVar4;
            case 13:
                jx7 jx7Var = (jx7) this.l;
                fvf fvfVar = (fvf) this.m;
                float f = edo.a;
                return new c5l(jx7Var, fvfVar, (eoe) obj2, continuation);
            case 14:
                c5l c5lVar5 = new c5l((efm) obj2, continuation, 14);
                c5lVar5.m = obj;
                return c5lVar5;
            case 15:
                return new c5l((xqn) this.m, (rgm) obj2, continuation, 15);
            case 16:
                return new c5l((aqi) this.l, (jap) this.m, (aqi) obj2, continuation, 16);
            case 17:
                return new c5l((v3n) this.l, (w3n) this.m, (String) obj2, continuation, 17);
            case 18:
                return new c5l((v3n) this.l, (r3n) this.m, (String) obj2, continuation, 18);
            case 19:
                c5l c5lVar6 = new c5l((sfm) this.m, (g8n) obj2, continuation, 19);
                c5lVar6.l = obj;
                return c5lVar6;
            case 20:
                return new c5l((List) this.m, (b9n) obj2, continuation, 20);
            case 21:
                return new c5l((b9n) this.m, (String) obj2, continuation, 21);
            case 22:
                c5l c5lVar7 = new c5l((se5) obj2, continuation, 22);
                c5lVar7.l = obj;
                return c5lVar7;
            case 23:
                c5l c5lVar8 = new c5l((kbn) this.m, (String) obj2, continuation, 23);
                c5lVar8.l = obj;
                return c5lVar8;
            case 24:
                return new c5l((ocn) this.l, (e0) this.m, (String) obj2, continuation, 24);
            case 25:
                return new c5l((ocn) this.l, (sqw) this.m, (String) obj2, continuation, 25);
            case 26:
                c5l c5lVar9 = new c5l((rce) this.m, (skn) obj2, continuation, 26);
                c5lVar9.l = obj;
                return c5lVar9;
            case 27:
                return new c5l((iwe) this.l, (tqn) this.m, (ltm) obj2, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                c5l c5lVar10 = new c5l((bnn) this.m, (qdi) obj2, continuation, 28);
                c5lVar10.l = obj;
                return c5lVar10;
            default:
                c5l c5lVar11 = new c5l((oq7) this.m, (skr) obj2, continuation, 29);
                c5lVar11.l = obj;
                return c5lVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((c5l) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((c5l) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((c5l) create((xwl) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((c5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((c5l) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0282, code lost:
    
        if (r0.c(r2, r36) == r3) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0273, code lost:
    
        if (defpackage.y2x.o(r4, r36) == r3) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02da, code lost:
    
        if (r2 == r10) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02c0, code lost:
    
        if (r7 == r10) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03dd, code lost:
    
        if (r2 == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03c3, code lost:
    
        if (r2 == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0462, code lost:
    
        if (r2 == r0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x05fd, code lost:
    
        if (r0 == r3) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x067e, code lost:
    
        if (r0 == r3) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x075b, code lost:
    
        if (r2.emit(r0, r36) == r3) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x074e, code lost:
    
        if (r0 == r3) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0727, code lost:
    
        if (r2.emit(null, r36) == r3) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x07ae, code lost:
    
        if (defpackage.mmo.d(r0, r2, (defpackage.rj6) r4, r36) == r3) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x07a1, code lost:
    
        if (r4 == r3) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07e6, code lost:
    
        if (r7 == r10) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x09dd, code lost:
    
        if (defpackage.tyf.N(r2, r5, r36) == r0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x09c4, code lost:
    
        if (r2 == r0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0b09, code lost:
    
        if (defpackage.x97.V(r2, r0, r36) == r4) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0ad7, code lost:
    
        if (r5.g(r6, r36) == r4) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c3c, code lost:
    
        if (r0.c(r2, r5, r36) == r3) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0bf5, code lost:
    
        if (defpackage.y2x.o(15000, r36) == r3) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d7, code lost:
    
        if (defpackage.x97.V(r6, r7, r36) == r2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015e, code lost:
    
        if (defpackage.x97.V(defpackage.dm6.b, new defpackage.akc(r11, r13, r3, r14, 28), r36) == r2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        if (defpackage.x97.V(defpackage.dm6.b, new defpackage.c5l(r11, r12, r13, r14, 24), r36) == r2) goto L78;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReentrantLock reentrantLock;
        Object s;
        Object putIfAbsent;
        Object d;
        Object b;
        Object g;
        Object g0;
        Object l;
        Object a;
        cvl cvlVar;
        Object o;
        oq oqVar;
        Object k;
        String w;
        String w2;
        Object a2;
        xqn xqnVar;
        Object a3;
        Object a4;
        Object g02;
        ArrayList arrayList;
        Object V;
        fkg fkgVar;
        Object g03;
        Object V2;
        Object m;
        List list;
        Object z;
        v80 v80Var;
        String str;
        ocn ocnVar;
        int i = 13;
        int i2 = 0;
        int i3 = 3;
        int i4 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                d5l d5lVar = (d5l) this.m;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        qgg.h0(obj);
                        this.l = mm6Var;
                        this.k = 1;
                        break;
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    ConcurrentHashMap concurrentHashMap = d5lVar.h;
                    d5lVar.h = new ConcurrentHashMap();
                    d5lVar.j = null;
                    reentrantLock.unlock();
                    if (!gld.T(mm6Var) || concurrentHashMap.size() == 0) {
                        return Unit.a;
                    }
                    String str2 = (String) this.n;
                    str2.getClass();
                    d2l d2lVar = (d2l) d5lVar.c.getValue();
                    Collection values = concurrentHashMap.values();
                    values.getClass();
                    w55 w55Var = new w55(values);
                    this.l = null;
                    this.k = 2;
                    break;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
                reentrantLock = d5lVar.i;
                reentrantLock.lock();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    nyf nyfVar = (nyf) this.l;
                    lyf lyfVar = lyf.d;
                    b5l b5lVar = new b5l((eno) this.m, continuation, (a) this.n, i3);
                    this.k = 1;
                    if (o8g.J(nyfVar, lyfVar, b5lVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    nyf nyfVar2 = (nyf) this.l;
                    lyf lyfVar2 = lyf.d;
                    b5l b5lVar2 = new b5l((pjc) this.m, continuation, (jdl) this.n, 7);
                    this.k = 1;
                    if (o8g.J(nyfVar2, lyfVar2, b5lVar2, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                vgl vglVar = (vgl) this.m;
                xol xolVar = (xol) this.l;
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ConcurrentHashMap concurrentHashMap2 = xolVar.l;
                    String str3 = vglVar.b;
                    Object obj2 = concurrentHashMap2.get(str3);
                    if (obj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(str3, (obj2 = hld.j()))) != null) {
                        obj2 = putIfAbsent;
                    }
                    this.k = 1;
                    s = ((gm5) obj2).s(this);
                    if (s == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s = obj;
                }
                xol.a(xolVar, vglVar, (Integer) this.n, (fwk) s);
                return Unit.a;
            case 4:
                wrl wrlVar = (wrl) this.m;
                cvl cvlVar2 = (cvl) this.l;
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    if (!cvlVar2.d()) {
                        klg klgVar = (klg) wrlVar.l.getValue();
                        cvl a5 = cvl.a((cvl) this.l, null, null, 0, 0, 0L, xxr.b, null, null, null, null, null, null, null, null, null, 134215679);
                        this.k = 1;
                        break;
                    }
                    return Unit.a;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                neg.A(dyr.e, cvlVar2.g().d());
                ((vxr) wrlVar.m.getValue()).getClass();
                qxr.a();
                d7i d7iVar = new d7i((PlaylistScreenActivity) this.n, continuation, i);
                bsd b2 = dm6.b();
                this.k = 2;
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    btl btlVar = (btl) this.l;
                    String str4 = (String) this.n;
                    String str5 = (String) this.m;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str6 = ((frt) qdcVar.C(I)).c().a;
                    str6.getClass();
                    rtl rtlVar = btlVar.c;
                    nvl nvlVar = new nvl(str4, str5);
                    this.k = 1;
                    d = rtlVar.d(str6, nvlVar, false, this);
                    if (d == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                return (cvl) d;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                btl btlVar2 = (btl) this.l;
                String str7 = (String) this.n;
                List c = t75.c(new Long(((i1m) this.m).a));
                this.k = 1;
                Object c2 = btl.c(btlVar2, str7, c, this);
                return c2 == nm6Var7 ? nm6Var7 : c2;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(i5h.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    i5h i5hVar = (i5h) qdcVar2.C(I2);
                    String str8 = (String) this.n;
                    this.k = 1;
                    b = i5hVar.b(str8, this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                ueo ueoVar = (ueo) b;
                jbb jbbVar = new jbb(ueoVar, (Continuation) null, (xqn) this.l, (ArrayList) this.m);
                this.k = 2;
                break;
            case 8:
                cvl cvlVar3 = (cvl) this.m;
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    ssg.a(2, null, "editPlaylist(): new name = `" + ((String) this.n) + "`, playlist: " + cvlVar3, null);
                    oul oulVar = ((jul) this.l).b;
                    String str9 = (String) this.n;
                    this.k = 1;
                    g = oulVar.b.g(cvl.a(cvlVar3, str9, null, 0, 0, 0L, !Intrinsics.d(cvlVar3.l, wxr.b) ? new zxr(19) : cvlVar3.l, null, null, null, null, null, null, null, null, null, 134215677), this);
                    if (g == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                neg.A(dyr.e, null);
                qxr.a();
                return g;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                oul oulVar2 = (oul) this.l;
                cvl cvlVar4 = (cvl) this.m;
                List list2 = (List) this.n;
                this.k = 1;
                Serializable a6 = oulVar2.a(cvlVar4, list2, false, this);
                return a6 == nm6Var10 ? nm6Var10 : a6;
            case 10:
                n0m n0mVar = (n0m) this.m;
                b56 b56Var = n0mVar.Y;
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    this.l = mm6Var2;
                    this.k = 1;
                    g0 = zsd.g0(b56Var, this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                }
                Intent intent = (Intent) this.n;
                z0m z0mVar = (z0m) g0;
                z3g z3gVar = n0mVar.r;
                z66 z66Var = n0mVar.t;
                cvl cvlVar5 = z0mVar.a;
                z3gVar.b(cvlVar5);
                kyl kylVar = n0mVar.o;
                cq4 F = ot0.F(n0mVar);
                kxi kxiVar = n0mVar.l;
                kylVar.getClass();
                cvlVar5.getClass();
                intent.getClass();
                kxiVar.getClass();
                int i16 = PlaylistScreenActivity.B0;
                yzk yzkVar = new yzk(F, dxl.a(intent, cvlVar5), kxiVar);
                ox6.B(yzkVar.d(), ot0.F(n0mVar), new c0m(n0mVar, i2));
                ox6.B(yzkVar.c(), ot0.F(n0mVar), new c0m(n0mVar, i4));
                n0mVar.L = yzkVar;
                xdr xdrVar = n0mVar.I;
                nyl nylVar = new nyl(ivf.I(cvlVar5), cvlVar5.d(), Intrinsics.d(cvlVar5.r, "public"));
                xdrVar.getClass();
                xdrVar.m(null, nylVar);
                if (z0mVar.d.isEmpty()) {
                    x97.y(mm6Var2, null, null, new d0m(n0mVar, continuation, i2), 3);
                }
                xdr xdrVar2 = n0mVar.J;
                Boolean valueOf = Boolean.valueOf(z66Var.h());
                xdrVar2.getClass();
                xdrVar2.m(null, valueOf);
                ox6.B(z66Var.c(), ot0.F(n0mVar), new c0m(n0mVar, 2));
                x97.y(ot0.F(n0mVar), null, null, new e0m(n0mVar, z0mVar, continuation, i2), 3);
                if (n0mVar.n) {
                    rar rarVar = n0mVar.v0;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    n0mVar.v0 = x97.y(ot0.F(n0mVar), null, null, new e0m(n0mVar, z0mVar, continuation, 1), 3);
                }
                c0m c0mVar = new c0m(n0mVar, i3);
                this.l = null;
                this.k = 2;
                b56Var.collect(c0mVar, this);
                return nm6Var11;
            case 11:
                mmo mmoVar = (mmo) this.m;
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    cut cutVar = (cut) ((jyr) mmoVar.c).getValue();
                    ixl ixlVar = (ixl) ((lxl) this.n);
                    String str10 = ixlVar.a;
                    String str11 = ixlVar.b;
                    this.l = rjcVar;
                    this.k = 1;
                    l = cutVar.l(str10, str11, this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    l = obj;
                }
                this.l = null;
                this.k = 2;
                break;
            case 12:
                mmo mmoVar2 = (mmo) this.n;
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    this.l = rjcVar2;
                    this.k = 1;
                    break;
                } else if (i18 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar2 = (rjc) this.m;
                    qgg.h0(obj);
                    a = obj;
                    this.l = null;
                    this.m = null;
                    this.k = 3;
                    break;
                }
                if (((z66) ((jyr) mmoVar2.f).getValue()).g()) {
                    dy6 dy6Var = (dy6) ((jyr) mmoVar2.g).getValue();
                    this.l = null;
                    this.m = rjcVar2;
                    this.k = 2;
                    a = dy6Var.a(this);
                    break;
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    jx7 jx7Var = (jx7) this.l;
                    int L = jx7Var.L(((eoe) this.n).d()) + jx7Var.L(edo.b);
                    this.k = 1;
                    if (((fvf) this.m).f(1, -L, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                efm efmVar = (efm) this.n;
                xwl xwlVar = (xwl) this.m;
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    if (!(xwlVar instanceof vwl)) {
                        if (!(xwlVar instanceof wwl)) {
                            b6e.s();
                            return null;
                        }
                        cvlVar = ((wwl) xwlVar).a;
                        u3g u3gVar = (u3g) efmVar.l.getValue();
                        nvl g2 = cvlVar.g();
                        this.m = null;
                        this.l = cvlVar;
                        this.k = 2;
                        o = ((t3g) u3gVar).o(g2, this);
                        break;
                    } else {
                        oqVar = ((vwl) xwlVar).a;
                        u3g u3gVar2 = (u3g) efmVar.l.getValue();
                        String str12 = oqVar.a;
                        this.m = null;
                        this.l = oqVar;
                        this.k = 1;
                        k = ((t3g) u3gVar2).k(str12, this);
                        break;
                    }
                    return nm6Var15;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvl cvlVar6 = (cvl) this.l;
                    qgg.h0(obj);
                    cvlVar = cvlVar6;
                    o = obj;
                    boolean booleanValue = ((Boolean) o).booleanValue();
                    int i21 = cvlVar.h;
                    return new ydm(new v1g(cvlVar.b, vz1.w(op7.c(cvlVar).a), null, qo6.e), new w3g(tt0.C(i21), dag.A(i21, booleanValue), booleanValue), cvlVar);
                }
                oq oqVar2 = (oq) this.l;
                qgg.h0(obj);
                oqVar = oqVar2;
                k = obj;
                boolean booleanValue2 = ((Boolean) k).booleanValue();
                oqVar.getClass();
                int i22 = oqVar.q;
                if (i22 >= 0) {
                    int i23 = i22 + (booleanValue2 ? 1 : 0);
                    w = y3g.a(i23);
                    w2 = dag.A(i23, booleanValue2);
                } else {
                    w = etn.w(oqVar);
                    w2 = etn.w(oqVar);
                }
                w3g w3gVar = new w3g(w, w2, booleanValue2);
                v1g v1gVar = new v1g(oqVar.b, vz1.w(oqVar.D.a), oqVar.i(), qo6.g);
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(k8w.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return new xdm(new x1g(v1gVar, ((m8w) ((k8w) qdcVar3.C(I3))).a(oqVar)), w3gVar, oqVar);
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    xqn xqnVar2 = (xqn) this.m;
                    rgm rgmVar = (rgm) this.n;
                    this.l = xqnVar2;
                    this.k = 1;
                    a2 = rgmVar.a(this);
                    if (a2 == nm6Var16) {
                        return nm6Var16;
                    }
                    xqnVar = xqnVar2;
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = (xqn) this.l;
                    qgg.h0(obj);
                    a2 = obj;
                }
                xqnVar.a = a2;
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new jc((aqi) this.l, 21));
                    tek tekVar = new tek(i, (jap) this.m, (aqi) this.n);
                    this.k = 1;
                    if (s0.collect(tekVar, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                v3n v3nVar = (v3n) this.l;
                nm6 nm6Var18 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    wb7 wb7Var = (wb7) v3nVar.c.a.getValue();
                    if (wb7Var != null) {
                        v24 v24Var = new v24(v3nVar, (w3n) this.m, (String) this.n, (Continuation) null, 9);
                        this.k = 1;
                        a3 = lmm.a(wb7Var, v24Var, this);
                        if (a3 == nm6Var18) {
                            return nm6Var18;
                        }
                    }
                    return Unit.a;
                }
                if (i26 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a3 = obj;
                return Unit.a;
            case 18:
                v3n v3nVar2 = (v3n) this.l;
                nm6 nm6Var19 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    wb7 wb7Var2 = (wb7) v3nVar2.c.a.getValue();
                    if (wb7Var2 != null) {
                        v24 v24Var2 = new v24(v3nVar2, (r3n) this.m, (String) this.n, (Continuation) null, 10);
                        this.k = 1;
                        a4 = lmm.a(wb7Var2, v24Var2, this);
                        if (a4 == nm6Var19) {
                            return nm6Var19;
                        }
                    }
                    return Unit.a;
                }
                if (i27 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a4 = obj;
                return Unit.a;
            case 19:
                sfm sfmVar = (sfm) this.m;
                g8n g8nVar = (g8n) this.n;
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var20 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    x97.y(mm6Var3, null, null, new c8n(g8nVar, sfmVar, (Continuation) null), 3);
                    x97.y(mm6Var3, null, null, new c8n(sfmVar, g8nVar, (Continuation) null), 3);
                    h0m h0mVar = (h0m) sfmVar.b;
                    d8n d8nVar = new d8n(g8nVar, i4);
                    this.l = null;
                    this.k = 1;
                    if (h0mVar.collect(d8nVar, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                b9n b9nVar = (b9n) this.n;
                nm6 nm6Var21 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    List list3 = (List) this.m;
                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((iiw) it.next()).a);
                    }
                    pjc g3 = b9nVar.c.g();
                    this.l = arrayList2;
                    this.k = 1;
                    g02 = zsd.g0(g3, this);
                    if (g02 != nm6Var21) {
                        arrayList = arrayList2;
                    }
                    return nm6Var21;
                }
                if (i29 != 1) {
                    if (i29 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                    return (List) V;
                }
                ArrayList arrayList3 = (ArrayList) this.l;
                qgg.h0(obj);
                arrayList = arrayList3;
                g02 = obj;
                String str13 = ((xxq) g02).a;
                str13.getClass();
                mn7 mn7Var = dm6.a;
                z8n z8nVar = new z8n(b9nVar, str13, arrayList, null, 0);
                this.l = null;
                this.k = 2;
                V = x97.V(mn7Var, z8nVar, this);
                break;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    b9n b9nVar2 = (b9n) this.m;
                    fkgVar = b9nVar2.d;
                    pjc g4 = b9nVar2.c.g();
                    this.l = fkgVar;
                    this.k = 1;
                    g03 = zsd.g0(g4, this);
                    break;
                } else {
                    if (i30 != 1) {
                        if (i30 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V2 = obj;
                        String str14 = (String) V2;
                        if (str14 == null) {
                            return null;
                        }
                        return new taq(str14);
                    }
                    fkg fkgVar2 = (fkg) this.l;
                    qgg.h0(obj);
                    fkgVar = fkgVar2;
                    g03 = obj;
                }
                String str15 = ((xxq) g03).a;
                this.l = null;
                this.k = 2;
                fkgVar.getClass();
                V2 = x97.V(dm6.b, new yjg(fkgVar, str15, continuation, 4), this);
                break;
            case 22:
                se5 se5Var = (se5) this.n;
                mm6 mm6Var4 = (mm6) this.l;
                nm6 nm6Var23 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    sfm sfmVar2 = se5Var.d;
                    this.l = mm6Var4;
                    this.k = 1;
                    m = sfmVar2.m(this);
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = (List) this.m;
                        qgg.h0(obj);
                        list = list4;
                        z = obj;
                        hof hofVar = (hof) z;
                        if (hofVar == null) {
                            String str16 = "Unable to create launched entity info for simple queue for " + se5Var;
                            Assertions.throwOrSkip("QueueLaunchBasicCommandsFactory", new FailedAssertionException(str16));
                            throw new PlaybackQueueStartValidator$InvalidQueueException(new IllegalArgumentException(str16), null);
                        }
                        c cVar = se5Var.a;
                        pe5 pe5Var = se5Var.j;
                        String str17 = se5Var.m;
                        Object obj3 = se5Var.k.a;
                        z1p z1pVar = obj3 instanceof z1p ? (z1p) obj3 : null;
                        b6v b6vVar = new b6v(t3q.a(cVar, str17, z1pVar != null ? u1g.R(z1pVar) : null, new zga(list, i3)));
                        List list5 = list;
                        ArrayList arrayList4 = new ArrayList(v75.o(list5, 10));
                        for (Object obj4 : list5) {
                            int i32 = i2 + 1;
                            if (i2 < 0) {
                                u75.n();
                                throw null;
                            }
                            mqs mqsVar = (mqs) obj4;
                            List list6 = pe5Var.b;
                            if (list6 == null || (v80Var = (v80) list6.get(i2)) == null) {
                                v80Var = pe5Var.a;
                            }
                            arrayList4.add(new jzs(mqsVar, v80Var, null, null, null, null, b6vVar, se5Var.l));
                            i2 = i32;
                        }
                        return new Pair(arrayList4, hofVar);
                    }
                    qgg.h0(obj);
                    m = obj;
                }
                list = (List) m;
                if (list.isEmpty()) {
                    throw new PlaybackQueueStartValidator$InvalidQueueException(new IllegalArgumentException("Simple Queue must have at least one track "), null);
                }
                mvn mvnVar = hof.g;
                this.l = mm6Var4;
                this.m = list;
                this.k = 2;
                z = mvnVar.z(se5Var, list, this);
                break;
            case 23:
                kbn kbnVar = (kbn) this.m;
                mm6 mm6Var5 = (mm6) this.l;
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    x97.y(mm6Var5, null, null, new s1n(kbnVar, (r2f) mm6Var5.getCoroutineContext().get(o6c.l), continuation, 9), 3);
                    long b3 = kbnVar.d.b();
                    this.l = null;
                    this.k = 1;
                    break;
                } else {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                String str18 = (String) this.n;
                this.l = null;
                this.k = 2;
                break;
            case 24:
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 != 0) {
                    if (i34 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                fkg fkgVar3 = ((ocn) this.l).c;
                e0 e0Var = (e0) this.m;
                String str19 = (String) this.n;
                this.k = 1;
                Object V3 = x97.V(dm6.b, new rfg(e0Var, fkgVar3, str19, "protobuf", null, 2), this);
                return V3 == nm6Var25 ? nm6Var25 : V3;
            case 25:
                String str20 = (String) this.n;
                ocn ocnVar2 = (ocn) this.l;
                sqw sqwVar = (sqw) this.m;
                nm6 nm6Var26 = nm6.a;
                int i35 = this.k;
                Continuation continuation2 = null;
                if (i35 == 0) {
                    qgg.h0(obj);
                    str = str20;
                    e0 b4 = sqwVar.b();
                    this.k = 1;
                    ocnVar2.getClass();
                    ocnVar = ocnVar2;
                    break;
                } else if (i35 == 1) {
                    qgg.h0(obj);
                    ocnVar = ocnVar2;
                    str = str20;
                } else {
                    if (i35 != 2) {
                        if (i35 == 3) {
                            qgg.h0(obj);
                            return new z7o(sqwVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ocnVar = ocnVar2;
                    HashSet hashSet = new HashSet();
                    maq maqVar = ((pqw) sqwVar).b;
                    if (maqVar instanceof jbq) {
                        Iterator it2 = ((List) ((jbq) maqVar).h.a.d.getValue()).iterator();
                        while (it2.hasNext()) {
                            hashSet.add(((naq) it2.next()).e);
                        }
                    } else if ((maqVar instanceof vaq) || (maqVar instanceof eaq)) {
                        Iterator it3 = maqVar.j().iterator();
                        while (it3.hasNext()) {
                            mqs a7 = ((faq) it3.next()).a();
                            if (a7 != null) {
                                hashSet.add(a7);
                            }
                        }
                    } else if (!(maqVar instanceof raq)) {
                        b6e.s();
                        return null;
                    }
                    mn7 mn7Var2 = dm6.a;
                    s1n s1nVar = new s1n(ocnVar, hashSet, continuation2, 11);
                    this.k = 3;
                    break;
                }
                if (!(sqwVar instanceof pqw)) {
                    if (!(sqwVar instanceof rqw)) {
                        b6e.s();
                        return null;
                    }
                    r7o r7oVar = z7o.b;
                    new IllegalArgumentException("no tracks stored for Raw state");
                    return new z7o(sqwVar);
                }
                fkg fkgVar4 = ocnVar.c;
                f5q k2 = ((pqw) sqwVar).b.k();
                this.k = 2;
                break;
            case 26:
                rce rceVar = (rce) this.m;
                nm6 nm6Var27 = nm6.a;
                int i36 = this.k;
                if (i36 != 0) {
                    if (i36 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var6 = (mm6) this.l;
                dq7 dq7Var = ca8.a;
                ou7 p = x97.p(mm6Var6, j5h.a.g, null, new qkn((skn) this.n, rceVar, continuation, i4), 2);
                i6s i6sVar = rceVar.c;
                if (i6sVar instanceof lhu) {
                    k.c(((lhu) i6sVar).getView()).d(p);
                }
                this.k = 1;
                Object s2 = p.s(this);
                return s2 == nm6Var27 ? nm6Var27 : s2;
            case 27:
                nm6 nm6Var28 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    dkn dknVar = ((lni) ((jyr) ((iwe) this.l).b).getValue()).i;
                    tek tekVar2 = new tek(20, (tqn) this.m, (ltm) this.n);
                    this.k = 1;
                    if (dknVar.a.collect(tekVar2, this) == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return k(obj);
            default:
                oq7 oq7Var = (oq7) this.m;
                ltm ltmVar = (ltm) this.l;
                nm6 nm6Var29 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    xqn i39 = hrg.i(obj);
                    pjc b0 = zsd.b0(new h0m(oq7Var.a.c, 26));
                    ckg ckgVar = new ckg(i39, ltmVar, (skr) this.n, oq7Var, (Continuation) null, 26);
                    this.l = null;
                    this.k = 1;
                    if (zsd.O(b0, ckgVar, this) == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i38 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5l(nyf nyfVar, pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = nyfVar;
        this.m = pjcVar;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5l(btl btlVar, String str, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = btlVar;
        this.n = str;
        this.m = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5l(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5l(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5l(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5l(String str, xqn xqnVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.n = str;
        this.l = xqnVar;
        this.m = arrayList;
    }
}
