package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.AwaitQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionCommand;
import com.yandex.music.shared.player.storage.StorageUnavailableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class rs extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(rjp rjpVar, int i, Long l, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.m = rjpVar;
        this.l = i;
        this.n = l;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new rs((ss) this.m, (String) this.n, this.l, continuation, 0);
            case 1:
                return new rs((um0) this.m, (fk0) this.n, this.l, continuation, 1);
            case 2:
                return new rs((pkd) this.m, (Context) this.n, this.l, continuation, 2);
            case 3:
                return new rs((fk0) this.m, (hje) this.n, this.l, continuation, 3);
            case 4:
                return new rs((krf) this.m, (fvf) this.n, this.l, continuation, 4);
            case 5:
                return new rs((ltm) this.m, (Drawable) this.n, this.l, continuation, 5);
            case 6:
                return new rs((ArrayList) this.n, continuation, 6);
            case 7:
                return new rs((x3n) this.m, (kjm) this.n, this.l, continuation, 7);
            case 8:
                return new rs((rjp) this.m, this.l, (Long) this.n, continuation);
            case 9:
                return new rs((pvs) this.n, continuation, 9);
            case 10:
                return new rs((fk0) this.m, (d24) this.n, this.l, continuation, 10);
            default:
                rs rsVar = new rs((ghw) this.n, continuation, 11);
                rsVar.l = ((Number) obj).intValue();
                return rsVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((rs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((rs) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0464, code lost:
    
        if (((defpackage.oc4) r1).d.m(r2, r21) == r0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0447, code lost:
    
        if (defpackage.y2x.o(1000, r21) == r0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05a2, code lost:
    
        if (defpackage.fk0.c(r0, r2, r2, null, r21, 12) == r7) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0557, code lost:
    
        if (r0.f(r2, r21) == r7) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x056c, code lost:
    
        if (r0.f(r2, r21) == r7) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05b3, code lost:
    
        if (r0.f(r2, r21) == r7) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (r2 == r11) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02be, code lost:
    
        if (defpackage.x97.V(r1, r3, r21) == r11) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        Object a;
        Object value;
        List list;
        Object value2;
        List list2;
        n7q n7qVar;
        int F;
        char c;
        boolean z;
        Integer valueOf;
        Object valueOf2;
        Integer num;
        int i2;
        String str;
        List list3;
        int ordinal;
        boolean booleanValue;
        boolean z2;
        Continuation continuation;
        Object b;
        o5g o5gVar;
        int i3 = 2;
        boolean z3 = false;
        boolean z4 = true;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ss ssVar = (ss) this.m;
                    String str2 = (String) this.n;
                    int i5 = this.l;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str3 = ((frt) qdcVar.C(I)).c().a;
                    str3.getClass();
                    et etVar = ssVar.a;
                    this.k = 1;
                    if (etVar.k(str3, str2, i5, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                fk0 fk0Var = (fk0) this.n;
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    int ordinal2 = ((um0) this.m).ordinal();
                    if (ordinal2 == 0) {
                        cma cmaVar = new cma(0);
                        this.k = 1;
                        break;
                    } else if (ordinal2 == 1) {
                        cma cmaVar2 = new cma(fn0.b);
                        this.k = 3;
                        break;
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        cma cmaVar3 = new cma(fn0.b);
                        this.k = 2;
                        break;
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        if (i6 == 3) {
                            qgg.h0(obj);
                            fk0 fk0Var2 = (fk0) this.n;
                            cma cmaVar4 = new cma(0);
                            act actVar = new act(700, ((Number) fn0.a.invoke(new Integer(this.l))).intValue(), nya.a);
                            this.k = 4;
                            break;
                        } else if (i6 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                return nm6Var2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    pv0 b2 = ((pkd) this.m).b();
                    Context context = (Context) this.n;
                    int i8 = this.l;
                    this.k = 1;
                    if (pv0.i(b2, context, i8, this) == nm6Var3) {
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
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var3 = (fk0) this.m;
                    Float f = new Float(((hje) this.n).a(this.l));
                    this.k = 1;
                    if (fk0.c(fk0Var3, f, null, null, this, 14) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    pjc j = ((krf) this.m).j();
                    ya5 ya5Var = new ya5((fvf) this.n, this.l, 1);
                    this.k = 1;
                    if (j.collect(ya5Var, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                mm6 mm6Var = (ltm) this.m;
                tnh tnhVar = new tnh((Drawable) this.n, this.l);
                this.k = 2;
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i12 = this.l;
                if (i12 == 0) {
                    qgg.h0(obj);
                    it = ((ArrayList) this.n).iterator();
                    i = 0;
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i13 = this.k;
                    it = (Iterator) this.m;
                    qgg.h0(obj);
                    i = i13;
                }
                while (it.hasNext()) {
                    mu7 mu7Var = (mu7) ((Pair) it.next()).b;
                    this.m = it;
                    this.k = i;
                    this.l = 1;
                    if (mu7Var.H(this) == nm6Var7) {
                        return nm6Var7;
                    }
                }
                return Unit.a;
            case 7:
                int i14 = this.l;
                kjm kjmVar = (kjm) this.n;
                x3n x3nVar = (x3n) this.m;
                jtc jtcVar = (jtc) x3nVar.c;
                lkm lkmVar = (lkm) x3nVar.a;
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                int i16 = 1;
                if (i15 == 0) {
                    qgg.h0(obj);
                    String str4 = kjmVar.b;
                    this.k = 1;
                    a = lkmVar.a().a(str4, this);
                    if (a == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                kjm kjmVar2 = (kjm) a;
                if (kjmVar2 == null || !kjmVar2.j) {
                    jtcVar.D(kjmVar, i14, true);
                    lkmVar.getClass();
                    xjm a2 = lkmVar.a();
                    a2.getClass();
                    x97.y(a2.a, null, null, new wjm(p1g.O(kjmVar), a2, null, 0), 3);
                } else {
                    jtcVar.D(kjmVar, i14, false);
                    lkmVar.getClass();
                    xjm a3 = lkmVar.a();
                    a3.getClass();
                    x97.y(a3.a, null, null, new wjm(p1g.O(kjmVar), a3, null, i16), 3);
                }
                return Unit.a;
            case 8:
                int i17 = this.l;
                xdr xdrVar = (xdr) ((rjp) this.m).a;
                nm6 nm6Var9 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    do {
                        value = xdrVar.getValue();
                        List list4 = (List) value;
                        list = list4;
                        if (i17 >= 0) {
                            List list5 = list4;
                            list = list4;
                            if (i17 < list5.size()) {
                                ArrayList y0 = CollectionsKt.y0(list5);
                                y0.set(i17, nb6.a((nb6) y0.get(i17), 15));
                                list = y0;
                            }
                        }
                    } while (!xdrVar.k(value, list));
                    Long l = (Long) this.n;
                    if (l != null) {
                        long longValue = l.longValue();
                        this.k = 1;
                        if (y2x.o(longValue, this) == nm6Var9) {
                            return nm6Var9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                do {
                    value2 = xdrVar.getValue();
                    List list6 = (List) value2;
                    list2 = list6;
                    if (i17 >= 0) {
                        List list7 = list6;
                        list2 = list6;
                        if (i17 < list7.size()) {
                            ArrayList y02 = CollectionsKt.y0(list7);
                            y02.set(i17, nb6.a((nb6) y02.get(i17), 23));
                            list2 = y02;
                        }
                    }
                } while (!xdrVar.k(value2, list2));
                return Unit.a;
            case 9:
                a3t a3tVar = a3t.a;
                pvs pvsVar = (pvs) this.n;
                nm6 nm6Var10 = nm6.a;
                int i19 = this.l;
                if (i19 == 0) {
                    qgg.h0(obj);
                    d6l x = p6g.x((e6l) pvsVar.d.c.getValue());
                    if (x != null && (n7qVar = x.a) != null) {
                        List B = y7g.B(n7qVar);
                        F = f8g.F(n7qVar);
                        IntRange m = yhn.m(F + 1, B.size());
                        int i20 = m.a;
                        c = 3;
                        int i21 = m.b;
                        if (i20 <= i21) {
                            while (true) {
                                mqs a4 = ((mwk) B.get(i20)).a();
                                if (a4 == null || (str = a4.a) == null) {
                                    z = z3;
                                } else {
                                    q3t q3tVar = pvsVar.g;
                                    z = z3;
                                    zvs zvsVar = new zvs(str);
                                    q3tVar.getClass();
                                    String a5 = q3tVar.n.a();
                                    a5.getClass();
                                    ArrayList d = q3tVar.a.d(zvsVar, a5);
                                    if (!d.isEmpty()) {
                                        List a6 = q3tVar.d.a();
                                        Iterator it2 = d.iterator();
                                        while (it2.hasNext()) {
                                            iss issVar = (iss) it2.next();
                                            thr thrVar = issVar.c;
                                            String str5 = issVar.e;
                                            if (a6.contains(thrVar)) {
                                                try {
                                                    ordinal = issVar.d.ordinal();
                                                } catch (StorageUnavailableException e) {
                                                    e = e;
                                                    list3 = a6;
                                                }
                                                if (ordinal != 0) {
                                                    list3 = a6;
                                                    if (ordinal != 1) {
                                                        if (ordinal != 2) {
                                                            throw new x7j();
                                                            break;
                                                        } else {
                                                            try {
                                                                booleanValue = q3tVar.l.a(zvsVar, str5, thrVar).booleanValue();
                                                            } catch (StorageUnavailableException e2) {
                                                                e = e2;
                                                            }
                                                        }
                                                        e = e2;
                                                        ssg.a(7, "TracksCacheRepositoryImpl", "Couldn't check if track is cached", e);
                                                    } else {
                                                        booleanValue = q3tVar.k.a(issVar.a, str5, thrVar).booleanValue();
                                                    }
                                                } else {
                                                    list3 = a6;
                                                    booleanValue = q3tVar.j.a(zvsVar, str5, thrVar).booleanValue();
                                                }
                                                if (booleanValue) {
                                                    z2 = true;
                                                    valueOf = z2 ? Integer.valueOf(i20) : null;
                                                }
                                            } else {
                                                list3 = a6;
                                            }
                                            a6 = list3;
                                        }
                                    }
                                    z2 = z;
                                    if (z2) {
                                    }
                                }
                                if (i20 != i21) {
                                    i20++;
                                    z3 = z;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (valueOf != null) {
                            hjp hjpVar = pvsVar.e;
                            this.m = valueOf;
                            this.k = F;
                            this.l = 1;
                            Object obj2 = hjpVar.b;
                            valueOf2 = Boolean.valueOf(z);
                            if (valueOf2 != nm6Var10) {
                                num = valueOf;
                                i2 = F;
                            }
                            return nm6Var10;
                        }
                        continuation = null;
                        ssg.a(6, "TrackErrorHandler", "No cached track available, pausing playback", null);
                        k1l k1lVar = (k1l) pvsVar.b;
                        k1lVar.getClass();
                        k1lVar.a(PauseCommand.INSTANCE, a3tVar);
                        i2 = F;
                        bsd b3 = dm6.b();
                        d7i d7iVar = new d7i(pvsVar, continuation, 29);
                        this.m = continuation;
                        this.k = i2;
                        this.l = 2;
                        break;
                    } else {
                        return Unit.a;
                    }
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.k;
                    num = (Integer) this.m;
                    qgg.h0(obj);
                    valueOf2 = obj;
                    c = 3;
                    z = false;
                }
                if (((Boolean) valueOf2).booleanValue()) {
                    F = i2;
                    continuation = null;
                    ssg.a(6, "TrackErrorHandler", "No cached track available, pausing playback", null);
                    k1l k1lVar2 = (k1l) pvsVar.b;
                    k1lVar2.getClass();
                    k1lVar2.a(PauseCommand.INSTANCE, a3tVar);
                    i2 = F;
                    bsd b32 = dm6.b();
                    d7i d7iVar2 = new d7i(pvsVar, continuation, 29);
                    this.m = continuation;
                    this.k = i2;
                    this.l = 2;
                } else {
                    ssg.a(6, "TrackErrorHandler", "Found next cached track at position: " + num, null);
                    k1l k1lVar3 = pvsVar.h;
                    int intValue = num.intValue();
                    SetQueuePositionCommand setQueuePositionCommand = new SetQueuePositionCommand(intValue);
                    AwaitQueuePositionCommand awaitQueuePositionCommand = new AwaitQueuePositionCommand(intValue);
                    boolean z5 = z;
                    AwaitPlayerConvergedCommand awaitPlayerConvergedCommand = new AwaitPlayerConvergedCommand(z5);
                    PlayCommand playCommand = new PlayCommand(z5);
                    PlaybackCommand$QueueBound[] playbackCommand$QueueBoundArr = new PlaybackCommand$QueueBound[4];
                    playbackCommand$QueueBoundArr[z5 ? 1 : 0] = setQueuePositionCommand;
                    playbackCommand$QueueBoundArr[1] = awaitQueuePositionCommand;
                    playbackCommand$QueueBoundArr[2] = awaitPlayerConvergedCommand;
                    playbackCommand$QueueBoundArr[c] = playCommand;
                    k1lVar3.b(new eyk(u75.h(playbackCommand$QueueBoundArr)), a3tVar);
                    continuation = null;
                    bsd b322 = dm6.b();
                    d7i d7iVar22 = new d7i(pvsVar, continuation, 29);
                    this.m = continuation;
                    this.k = i2;
                    this.l = 2;
                }
                break;
            case 10:
                d24 d24Var = (d24) this.n;
                fk0 fk0Var4 = (fk0) this.m;
                nm6 nm6Var11 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    Float f2 = new Float((eeh.b(((Number) fk0Var4.e()).floatValue() / d24Var.e) + this.l) * d24Var.e);
                    this.k = 1;
                    if (fk0Var4.f(f2, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                ghw ghwVar = (ghw) this.n;
                AtomicBoolean atomicBoolean = ghwVar.l;
                int i23 = this.l;
                nm6 nm6Var12 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        Boolean bool = Boolean.TRUE;
                        ssg.a(4, ghw.w, "cancel retry loop, since facade not started", null);
                        return bool;
                    }
                    v3w.k("loop connection: ", i23, 3, ghw.w, null);
                    this.l = i23;
                    this.k = 1;
                    b = ghw.b(ghwVar, this);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o5gVar = (o5g) this.m;
                        qgg.h0(obj);
                        z4 = o5gVar instanceof lgw;
                        return Boolean.valueOf(z4);
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                vgw vgwVar = (vgw) b;
                if (vgwVar instanceof ugw) {
                    ssg.a(4, ghw.w, dfi.c(i23, "start success from ", " attempt"), null);
                    return Boolean.valueOf(z4);
                }
                if (!(vgwVar instanceof tgw)) {
                    b6e.s();
                    return null;
                }
                tgw tgwVar = (tgw) vgwVar;
                ssg.a(4, ghw.w, hrg.p("start on ", i23, " attempt failed: ", tgwVar.b), null);
                atomicBoolean.set(false);
                if (i23 > 1) {
                    ghwVar.h.invoke();
                }
                o5g b4 = ghwVar.o.b(tgwVar.a);
                mnw mnwVar = ghwVar.p;
                sgw sgwVar = new sgw(ghwVar, i3);
                this.m = b4;
                this.l = i23;
                this.k = 2;
                if (mnwVar.a(b4, sgwVar, this) != nm6Var12) {
                    o5gVar = b4;
                    z4 = o5gVar instanceof lgw;
                    return Boolean.valueOf(z4);
                }
                return nm6Var12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs(Object obj, Object obj2, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = obj;
        this.n = obj2;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }
}
