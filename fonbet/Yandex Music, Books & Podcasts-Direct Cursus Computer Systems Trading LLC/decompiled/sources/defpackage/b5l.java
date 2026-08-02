package defpackage;

import android.widget.FrameLayout;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class b5l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5l(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b5l((String) this.l, (d5l) this.m, continuation, 0);
            case 1:
                return new b5l((pjc) this.l, continuation, (j9l) this.m, 1);
            case 2:
                return new b5l((Function0) this.l, (j9l) this.m, continuation, 2);
            case 3:
                return new b5l((eno) this.l, continuation, (a) this.m, 3);
            case 4:
                return new b5l((u21) this.l, continuation, (FrameLayout) this.m, 4);
            case 5:
                return new b5l((adl) this.l, (ja0) this.m, continuation, 5);
            case 6:
                return new b5l((adl) this.l, (na0) this.m, continuation, 6);
            case 7:
                return new b5l((pjc) this.l, continuation, (jdl) this.m, 7);
            case 8:
                return new b5l((uel) this.l, (vbn) this.m, continuation, 8);
            case 9:
                return new b5l((efl) this.l, (wdl) this.m, continuation, 9);
            case 10:
                return new b5l((yc4) this.l, (tll) this.m, continuation, 10);
            case 11:
                return new b5l((tll) this.l, (g1h) this.m, continuation, 11);
            case 12:
                return new b5l((pjc) this.l, continuation, (zll) this.m, 12);
            case 13:
                return new b5l((pjc) this.l, continuation, (jnl) this.m, 13);
            case 14:
                return new b5l((grl) this.l, (p5n) this.m, continuation, 14);
            case 15:
                return new b5l((grl) this.l, (nyn) this.m, continuation, 15);
            case 16:
                return new b5l((btl) this.l, (Collection) this.m, continuation, 16);
            case 17:
                return new b5l((btl) this.l, (cvl) this.m, continuation, 17);
            case 18:
                return new b5l(this.m, (String) this.l, continuation, 18);
            case 19:
                return new b5l((qzl) this.l, (fvf) this.m, continuation, 19);
            case 20:
                return new b5l((m3m) this.l, (cvl) this.m, continuation, 20);
            case 21:
                b5l b5lVar = new b5l((m4m) this.m, continuation, 21);
                b5lVar.l = obj;
                return b5lVar;
            case 22:
                return new b5l((gcm) this.m, continuation, 22);
            case 23:
                return new b5l((gcm) this.l, (mq) this.m, continuation, 23);
            case 24:
                return new b5l((gcm) this.l, (oq) this.m, continuation, 24);
            case 25:
                return new b5l((frt) this.l, (zcm) this.m, continuation, 25);
            case 26:
                return new b5l((uem) this.m, continuation, 26);
            case 27:
                return new b5l((uem) this.l, (vbc) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new b5l((qnq) this.l, (nwm) this.m, continuation, 28);
            default:
                return new b5l(this.m, (String) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 20:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((b5l) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((b5l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (r0 == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026f, code lost:
    
        if (defpackage.qgg.X(r3, r4, r6, r41) == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x072c, code lost:
    
        if (r0.b(r10, r41) == r2) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x068c, code lost:
    
        if (r3 == r2) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x08a4, code lost:
    
        if (r0 == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x088c, code lost:
    
        if (defpackage.x97.V(r4, r3, r41) == r2) goto L377;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object M;
        Object c;
        eel belVar;
        Pair pair;
        Pair pair2;
        Object j;
        Object g;
        Object V;
        xdr xdrVar;
        Object G;
        Object o;
        uem uemVar;
        Object a;
        Object value;
        Object obj2;
        int i = 18;
        int i2 = 5;
        int i3 = 0;
        int i4 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    String str = (String) this.l;
                    d5l d5lVar = (d5l) this.m;
                    str.getClass();
                    d2l d2lVar = (d2l) d5lVar.c.getValue();
                    this.k = 1;
                    b = d2lVar.b(str, this);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                List w0 = CollectionsKt.w0((Iterable) b);
                d5l d5lVar2 = (d5l) this.m;
                ReentrantLock reentrantLock = d5lVar2.e;
                String str2 = (String) this.l;
                reentrantLock.lock();
                try {
                    if (Intrinsics.d(d5lVar2.g, str2)) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : w0) {
                            if (!d5lVar2.d.keySet().contains(((l1l) obj3).a)) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            l1l l1lVar = (l1l) it.next();
                            d5lVar2.d.put(l1lVar.a, l1lVar);
                        }
                        d5lVar2.f.countDown();
                    }
                    reentrantLock.unlock();
                    return Unit.a;
                } finally {
                    reentrantLock.unlock();
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    seg segVar = new seg(continuation, (j9l) this.m, 17);
                    this.k = 1;
                    if (zsd.O(pjcVar, segVar, this) == nm6Var2) {
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
                j9l j9lVar = (j9l) this.m;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    h9l h9lVar = new h9l(j9lVar, continuation, i3);
                    bsd b2 = dm6.b();
                    this.k = 1;
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        M = obj;
                        if (M != null) {
                            ((Function0) this.l).invoke();
                        } else {
                            dfi.r("setPlayWhenReady queue restore is not successful", "SessionPlayerAdapter");
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                msa msaVar = nsa.b;
                long M2 = yd5.M(45, ssa.SECONDS);
                h9l h9lVar2 = new h9l(j9lVar, continuation, i4);
                this.k = 2;
                M = tyf.M(M2, h9lVar2, this);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    eno enoVar = (eno) this.l;
                    pal palVar = new pal((a) this.m, i3);
                    this.k = 1;
                    if (enoVar.collect(palVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    u21 u21Var = (u21) this.l;
                    seg segVar2 = new seg(continuation, (FrameLayout) this.m, i);
                    this.k = 1;
                    if (zsd.O(u21Var, segVar2, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                Object obj4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    adl adlVar = (adl) this.l;
                    ja0 ja0Var = (ja0) this.m;
                    this.k = 1;
                    Object O = zsd.O(szf.s0(new q90(ja0Var, i2)), new ycl(ja0Var, adlVar, ja0Var.c().d(lf3.b), ja0Var.c().d(lf3.a), null), this);
                    if (O != obj4) {
                        O = Unit.a;
                    }
                    if (O == obj4) {
                        return obj4;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                adl adlVar2 = (adl) this.l;
                na0 na0Var = (na0) this.m;
                this.k = 1;
                adl.A(adlVar2, na0Var, this);
                return nm6Var6;
            case 7:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    edl edlVar = new edl((jdl) this.m, i3);
                    this.k = 1;
                    if (pjcVar2.collect(edlVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    uel uelVar = (uel) this.l;
                    ArrayList arrayList2 = ((vbn) this.m).c;
                    this.k = 1;
                    if (uelVar.b(arrayList2, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                efl eflVar = (efl) this.l;
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    kel kelVar = eflVar.c;
                    this.k = 1;
                    c = kelVar.c(true, this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                List list = (List) c;
                wdl wdlVar = (wdl) this.m;
                long currentTimeMillis = System.currentTimeMillis();
                eflVar.getClass();
                if (wdlVar instanceof tdl) {
                    tdl tdlVar = (tdl) wdlVar;
                    belVar = new cel(currentTimeMillis, tdlVar.c.a.a, tdlVar.b);
                } else if (wdlVar instanceof udl) {
                    udl udlVar = (udl) wdlVar;
                    belVar = new del(currentTimeMillis, udlVar.c.a.a, udlVar.b);
                } else {
                    if (!(wdlVar instanceof sdl)) {
                        b6e.s();
                        return null;
                    }
                    belVar = new bel(((sdl) wdlVar).b.a.a, currentTimeMillis);
                }
                List<eel> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (eel eelVar : list2) {
                        if (Intrinsics.d(eelVar.u(), belVar.u()) && eelVar.getClass() == belVar.getClass()) {
                            ssg.a(2, "PlayerInformersCenter", "skip registering informer impression for " + belVar, null);
                            return Unit.a;
                        }
                    }
                }
                kel kelVar2 = eflVar.c;
                this.k = 2;
                break;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    yc4 yc4Var = (yc4) this.l;
                    mll mllVar = new mll((tll) this.m, 1);
                    this.k = 1;
                    if (yc4Var.collect(mllVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    n3h n3hVar = ((tll) this.l).a;
                    g1h g1hVar = (g1h) this.m;
                    g1hVar.getClass();
                    i3h i3hVar = new i3h(new h3h(g1hVar.a, new f3h(g1hVar.b, g1hVar.c, g1hVar.d.a, g1hVar.f)));
                    this.k = 1;
                    if (n3hVar.c(i3hVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar3 = (pjc) this.l;
                    fr4 fr4Var = new fr4(continuation, (zll) this.m, 9);
                    this.k = 1;
                    if (zsd.O(pjcVar3, fr4Var, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar4 = (pjc) this.l;
                    gnl gnlVar = new gnl((Continuation) null, (jnl) this.m);
                    this.k = 1;
                    if (zsd.O(pjcVar4, gnlVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    yks yksVar = ((grl) this.l).u;
                    p5n p5nVar = (p5n) this.m;
                    this.k = 1;
                    yksVar.getClass();
                    int ordinal = p5nVar.ordinal();
                    if (ordinal == 0) {
                        pair = new Pair(new Integer(R.string.quality_settings_list_element_low), "LOW_QUALITY_MESSAGE");
                    } else if (ordinal == 1) {
                        pair = new Pair(new Integer(R.string.quality_settings_list_element_high), "HIGH_QUALITY_MESSAGE");
                    } else if (ordinal == 2) {
                        pair = new Pair(new Integer(R.string.quality_settings_list_element_lossless), "LOSSLESS_QUALITY_MESSAGE");
                    } else {
                        if (ordinal != 3) {
                            b6e.s();
                            return null;
                        }
                        pair = new Pair(new Integer(R.string.quality_settings_list_element_auto), "AUTO_QUALITY_MESSAGE");
                    }
                    Object o2 = yksVar.o(((Number) pair.a).intValue(), (String) pair.b, this);
                    if (o2 != nm6Var14) {
                        o2 = Unit.a;
                    }
                    if (o2 == nm6Var14) {
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
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    yks yksVar2 = ((grl) this.l).u;
                    nyn nynVar = (nyn) this.m;
                    this.k = 1;
                    yksVar2.getClass();
                    int ordinal2 = nynVar.ordinal();
                    if (ordinal2 == 0) {
                        pair2 = new Pair(new Integer(R.string.repeat_off), "DO_NOT_REPEAT_MESSAGE");
                    } else if (ordinal2 == 1) {
                        pair2 = new Pair(new Integer(R.string.repeat_track), "REPEAT_ONE_MESSAGE");
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        pair2 = new Pair(new Integer(R.string.repeat_playlist), "REPEAT_ALL_MESSAGE");
                    }
                    Object o3 = yksVar2.o(((Number) pair2.a).intValue(), (String) pair2.b, this);
                    if (o3 != nm6Var15) {
                        o3 = Unit.a;
                    }
                    if (o3 == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    btl btlVar = (btl) this.l;
                    Collection collection = (Collection) this.m;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str3 = ((frt) qdcVar.C(I)).c().a;
                    str3.getClass();
                    this.k = 1;
                    j = btlVar.c.j(str3, collection, this);
                    if (j == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j = obj;
                }
                return (List) j;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 != 0) {
                    if (i22 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                btl btlVar2 = (btl) this.l;
                cvl cvlVar = (cvl) this.m;
                this.k = 1;
                Serializable k = btlVar2.k(cvlVar, this);
                return k == nm6Var17 ? nm6Var17 : k;
            case 18:
                jul julVar = (jul) this.m;
                nm6 nm6Var18 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    julVar.a.a.a(Unit.a);
                    ssg.a(5, null, hrg.q("createPlaylist(): playlist name = `", (String) this.l, "`"), null);
                    oul oulVar = julVar.b;
                    String str4 = (String) this.l;
                    this.k = 1;
                    g = oulVar.b.g(new cvl("FAKE_ID_" + System.currentTimeMillis() + UUID.randomUUID(), str4, v3g.E(oulVar.c).a, 0, 0, false, 0, 0, 0, 0L, 0L, wxr.b, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134215672), this);
                    if (g == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                qxr.a();
                return g;
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j0q j0qVar = ((qzl) this.l).t;
                o50 o50Var = new o50((fvf) this.m, i2);
                this.k = 1;
                j0qVar.collect(o50Var, this);
                return nm6Var19;
            case 20:
                cvl cvlVar2 = (cvl) this.m;
                m3m m3mVar = (m3m) this.l;
                xdr xdrVar2 = m3mVar.n;
                nm6 nm6Var20 = nm6.a;
                int i25 = this.k;
                try {
                    if (i25 == 0) {
                        qgg.h0(obj);
                        z2m z2mVar = m3mVar.l;
                        this.k = 1;
                        jul julVar2 = (jul) z2mVar.c.getValue();
                        julVar2.getClass();
                        dq7 dq7Var = ca8.a;
                        V = x97.V(mn7.d, new hul(julVar2, cvlVar2, continuation, i3), this);
                        if (V == nm6Var20) {
                            return nm6Var20;
                        }
                    } else {
                        if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        V = obj;
                    }
                    List list3 = (List) V;
                    m3mVar.m = list3;
                    String str5 = cvlVar2.b;
                    List<mqs> list4 = list3;
                    ArrayList arrayList3 = new ArrayList(v75.o(list4, 10));
                    for (mqs mqsVar : list4) {
                        arrayList3.add(new j1b(System.identityHashCode(mqsVar), mqsVar, m3mVar.v.a(mqsVar)));
                    }
                    j3m j3mVar = new j3m(str5, arrayList3, false);
                    xdrVar2.getClass();
                    xdrVar2.m(null, j3mVar);
                } catch (IOException unused) {
                    h3m h3mVar = new h3m(cvlVar2.b);
                    xdrVar2.getClass();
                    xdrVar2.m(null, h3mVar);
                }
                return Unit.a;
            case 21:
                m4m m4mVar = (m4m) this.m;
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var21 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    if (m4mVar.h.getValue() instanceof ngt) {
                        d73 d73Var = new d73(m4mVar.g);
                        this.l = null;
                        this.k = 1;
                        if (rjcVar.emit(d73Var, this) == nm6Var21) {
                            return nm6Var21;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                gcm gcmVar = (gcm) this.m;
                nm6 nm6Var22 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    ubj ubjVar = gcmVar.k.h;
                    if (!Intrinsics.d(ubjVar, tbj.a)) {
                        if (!Intrinsics.d(ubjVar, sbj.a)) {
                            b6e.s();
                            return null;
                        }
                        ccm ccmVar = new ccm(gcmVar, continuation, i3);
                        ccm ccmVar2 = new ccm(gcmVar, continuation, i4);
                        ykf ykfVar = new ykf(26, gcmVar);
                        this.k = 2;
                        break;
                    } else {
                        xdrVar = gcmVar.B;
                        this.l = xdrVar;
                        this.k = 1;
                        G = gcm.G(gcmVar, this);
                        break;
                    }
                    return nm6Var22;
                }
                if (i27 == 1) {
                    xdr xdrVar3 = (xdr) this.l;
                    qgg.h0(obj);
                    xdrVar = xdrVar3;
                    G = obj;
                    xdrVar.l(G);
                } else {
                    if (i27 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                Object obj5 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    gcm gcmVar2 = (gcm) this.l;
                    jtc jtcVar = gcmVar2.q;
                    oq oqVar = gcmVar2.A;
                    mq mqVar = (mq) this.m;
                    this.k = 1;
                    jtcVar.getClass();
                    Object V2 = x97.V(dm6.b, new rlg(jtcVar, oqVar, mqVar, null, 14), this);
                    if (V2 != obj5) {
                        V2 = Unit.a;
                    }
                    if (V2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var23 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    gcm gcmVar3 = (gcm) this.l;
                    oq oqVar2 = (oq) this.m;
                    this.k = 1;
                    if (gcm.H(gcmVar3, oqVar2, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var24 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    h7a d0 = zsd.d0(q6k.m(((frt) this.l).g(), new fam(7), q6k.g), 1);
                    gfl gflVar = new gfl(14, (zcm) this.m);
                    this.k = 1;
                    if (d0.collect(gflVar, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                uem uemVar2 = (uem) this.m;
                jyr jyrVar = uemVar2.n;
                nm6 nm6Var25 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    rem remVar = (rem) jyrVar.getValue();
                    this.l = uemVar2;
                    this.k = 1;
                    o = ((v55) remVar.b.getValue()).o(this);
                    if (o == nm6Var25) {
                        return nm6Var25;
                    }
                    uemVar = uemVar2;
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uemVar = (uem) this.l;
                    qgg.h0(obj);
                    o = obj;
                }
                uem.G(uemVar, (lha) o);
                ox6.B(new u21(10, uemVar2.l, ((yx4) ((rem) jyrVar.getValue()).a.getValue()).B(null), new w40(3, uemVar2, uem.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8)), ot0.F(uemVar2), new gfl(15, uemVar2));
                return Unit.a;
            case 27:
                uem uemVar3 = (uem) this.l;
                Object obj6 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    vem vemVar = (vem) uemVar3.o.getValue();
                    vbc vbcVar = (vbc) this.m;
                    vemVar.getClass();
                    lha a2 = vem.a(vbcVar);
                    uem.G(uemVar3, a2);
                    rem remVar2 = (rem) uemVar3.n.getValue();
                    this.k = 1;
                    Object a3 = lmm.a(((v55) remVar2.b.getValue()).r(), new m55(a2, null), this);
                    if (a3 != obj6) {
                        a3 = Unit.a;
                    }
                    if (a3 != obj6) {
                        a3 = Unit.a;
                    }
                    if (a3 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var26 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    dkn dknVar = (dkn) ((qnq) this.l).e.c;
                    gfl gflVar2 = new gfl(i, (nwm) this.m);
                    this.k = 1;
                    if (dknVar.a.collect(gflVar2, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            default:
                String str6 = (String) this.l;
                com.yandex.music.payment.screen.promocode.viewmodel.a aVar = (com.yandex.music.payment.screen.promocode.viewmodel.a) this.m;
                nm6 nm6Var27 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    uz1 uz1Var = aVar.k;
                    this.k = 1;
                    a = uz1.a(uz1Var, str6, this);
                    if (a == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                String str7 = (String) a;
                xdr xdrVar4 = aVar.p;
                do {
                    value = xdrVar4.getValue();
                    obj2 = (uwm) value;
                    if (!(obj2 instanceof qwm)) {
                        obj2 = new swm(str6, str7);
                    }
                } while (!xdrVar4.k(value, obj2));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5l(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5l(Object obj, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5l(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
