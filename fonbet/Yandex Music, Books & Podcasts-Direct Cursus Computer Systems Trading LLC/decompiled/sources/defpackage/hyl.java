package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class hyl implements rjc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public hyl(rjc rjcVar, CoroutineContext coroutineContext) {
        this.a = 8;
        this.b = coroutineContext;
        this.c = nfs.b(coroutineContext);
        this.d = new axa(rjcVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(msp mspVar, Continuation continuation) {
        upp uppVar;
        int i;
        if (continuation instanceof upp) {
            uppVar = (upp) continuation;
            int i2 = uppVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uppVar.m = i2 - Integer.MIN_VALUE;
                Object obj = uppVar.k;
                nm6 nm6Var = nm6.a;
                i = uppVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Iterator it = ((List) this.c).iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (((z53) it.next()).a() == mspVar.a()) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        fvf fvfVar = (fvf) this.b;
                        uppVar.j = mspVar;
                        uppVar.m = 1;
                        apo apoVar = fvf.w;
                        if (fvfVar.f(i3, 0, uppVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mspVar = uppVar.j;
                qgg.h0(obj);
                eqp eqpVar = (eqp) this.d;
                eqpVar.getClass();
                mspVar.getClass();
                eqpVar.a.I.g();
                eqpVar.j.a(mspVar);
                return Unit.a;
            }
        }
        uppVar = new upp(this, continuation);
        Object obj2 = uppVar.k;
        nm6 nm6Var2 = nm6.a;
        i = uppVar.m;
        if (i != 0) {
        }
        eqp eqpVar2 = (eqp) this.d;
        eqpVar2.getClass();
        mspVar.getClass();
        eqpVar2.a.I.g();
        eqpVar2.j.a(mspVar);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Map map, Continuation continuation) {
        kvr kvrVar;
        int i;
        hyl hylVar;
        Object R;
        Object R2;
        if (continuation instanceof kvr) {
            kvrVar = (kvr) continuation;
            int i2 = kvrVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kvrVar.n = i2 - Integer.MIN_VALUE;
                Object obj = kvrVar.l;
                nm6 nm6Var = nm6.a;
                i = kvrVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        Float v = q7g.v(this.b, map);
                        if (v == null) {
                            throw new IllegalArgumentException("The target value must have an associated anchor.");
                        }
                        nvr nvrVar = (nvr) this.c;
                        float floatValue = v.floatValue();
                        tm0 tm0Var = (tm0) this.d;
                        kvrVar.j = this;
                        kvrVar.k = map;
                        kvrVar.n = 1;
                        if (nvrVar.a(floatValue, tm0Var, kvrVar) == nm6Var) {
                            return nm6Var;
                        }
                        hylVar = this;
                    } catch (Throwable th) {
                        th = th;
                        hylVar = this;
                        nvr nvrVar2 = (nvr) hylVar.c;
                        float e = nvrVar2.g.e();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (Math.abs(((Number) entry.getKey()).floatValue() - e) < 0.5f) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        R = CollectionsKt.R(linkedHashMap.values());
                        if (R == null) {
                            R = nvrVar2.c.getValue();
                        }
                        nvrVar2.d(R);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = kvrVar.k;
                    hylVar = kvrVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        nvr nvrVar22 = (nvr) hylVar.c;
                        float e2 = nvrVar22.g.e();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        while (r8.hasNext()) {
                        }
                        R = CollectionsKt.R(linkedHashMap2.values());
                        if (R == null) {
                        }
                        nvrVar22.d(R);
                        throw th;
                    }
                }
                nvr nvrVar3 = (nvr) hylVar.c;
                float e3 = nvrVar3.g.e();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - e3) < 0.5f) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                R2 = CollectionsKt.R(linkedHashMap3.values());
                if (R2 == null) {
                    R2 = nvrVar3.c.getValue();
                }
                nvrVar3.d(R2);
                return Unit.a;
            }
        }
        kvrVar = new kvr(this, continuation);
        Object obj2 = kvrVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kvrVar.n;
        if (i != 0) {
        }
        nvr nvrVar32 = (nvr) hylVar.c;
        float e32 = nvrVar32.g.e();
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        while (r8.hasNext()) {
        }
        R2 = CollectionsKt.R(linkedHashMap32.values());
        if (R2 == null) {
        }
        nvrVar32.d(R2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0072, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        if (r10 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Pair pair, Continuation continuation) {
        g9w g9wVar;
        int i;
        yjj yjjVar;
        HashSet u0;
        Object t7oVar;
        paw pawVar;
        if (continuation instanceof g9w) {
            g9wVar = (g9w) continuation;
            int i2 = g9wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = g9wVar.j;
                nm6 nm6Var = nm6.a;
                i = g9wVar.l;
                int i3 = 2;
                Unit unit = null;
                int i4 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) pair.a).booleanValue();
                    lyf lyfVar = (lyf) pair.b;
                    if (booleanValue) {
                        ((nbg) this.b).a.i(!((Boolean) ((sdr) this.c).getValue()).booleanValue());
                        if (c9g.C(lyfVar)) {
                            cx1 cx1Var = (cx1) this.d;
                            if (cx1Var != null) {
                                g9wVar.l = 1;
                                obj = cx1Var.e(false, g9wVar);
                            }
                            acg acgVar = ((nbg) this.b).a;
                            y7g.Y(false, acgVar.a);
                            boolean z = acgVar.s;
                            acgVar.s = true;
                            acgVar.a.H(acgVar.h, "play", "isWithEngine = " + acgVar.f() + " wasPlayWhenReady = " + z, new Object[0]);
                            yjjVar = acgVar.u;
                            synchronized (yjjVar.a) {
                            }
                        } else {
                            ((nbg) this.b).a.g();
                        }
                    } else {
                        cx1 cx1Var2 = (cx1) this.d;
                        if (cx1Var2 != null) {
                            g9wVar.l = 2;
                            obj = cx1Var2.a(g9wVar);
                        }
                        ((nbg) this.b).a.g();
                        acg acgVar2 = ((nbg) this.b).a;
                        y7g.Y(false, acgVar2.a);
                        acgVar2.a.H(acgVar2.h, "seekTo", "seekTo 0 isWithEngine = " + acgVar2.f(), new Object[0]);
                        pawVar = acgVar2.j;
                        if (pawVar == null) {
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    acg acgVar3 = ((nbg) this.b).a;
                    y7g.Y(false, acgVar3.a);
                    boolean z2 = acgVar3.s;
                    acgVar3.s = true;
                    acgVar3.a.H(acgVar3.h, "play", "isWithEngine = " + acgVar3.f() + " wasPlayWhenReady = " + z2, new Object[0]);
                    yjjVar = acgVar3.u;
                    synchronized (yjjVar.a) {
                        u0 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            ((p9g) next).f(acgVar3, z2);
                            t7oVar = Unit.a;
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                        }
                        Throwable a = z7o.a(t7oVar);
                        if (a != null) {
                            Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                        }
                    }
                    paw pawVar2 = acgVar3.j;
                    if (pawVar2 != null) {
                        pawVar2.d();
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        acgVar3.x.add(new sbg(acgVar3, i3));
                        acgVar3.j();
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((nbg) this.b).a.g();
                    acg acgVar22 = ((nbg) this.b).a;
                    y7g.Y(false, acgVar22.a);
                    acgVar22.a.H(acgVar22.h, "seekTo", "seekTo 0 isWithEngine = " + acgVar22.f(), new Object[0]);
                    pawVar = acgVar22.j;
                    if (pawVar == null) {
                        pawVar.s(0L);
                    } else {
                        acgVar22.x.add(new sbg(acgVar22, i4));
                    }
                }
                return Unit.a;
            }
        }
        g9wVar = new g9w(this, continuation);
        Object obj2 = g9wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = g9wVar.l;
        int i32 = 2;
        Unit unit2 = null;
        int i42 = 1;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:563:0x0c03, code lost:
    
        if (r5.emit(r2, r0) != r4) goto L536;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05ef  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        kkm kkmVar;
        int i;
        rjc rjcVar;
        boolean z;
        boolean z2;
        int i2;
        qcn qcnVar;
        int i3;
        String d;
        rcn rcnVar;
        int i4;
        String string;
        f9q f9qVar;
        int i5;
        Pair pair;
        wzs wzsVar;
        int i6;
        Object zcjVar;
        n1w n1wVar;
        int i7;
        xbw xbwVar;
        int i8;
        xkw xkwVar;
        hyl hylVar;
        int i9;
        wmw wmwVar;
        int i10;
        rjc rjcVar2;
        Object obj2;
        zzp zzpVar;
        pqw pqwVar;
        wmw wmwVar2;
        nm6 nm6Var;
        Object obj3;
        vaq m;
        jbq jbqVar;
        bbq xaqVar;
        eu7 eu7Var;
        jbq jbqVar2;
        int size;
        boolean z3;
        bbq xaqVar2;
        raq m2;
        x O;
        Object obj4;
        fpw a;
        c0 P;
        nnw nnwVar;
        wmw wmwVar3;
        nm6 nm6Var2;
        enw enwVar;
        int i11;
        fpw a2;
        zpw zpwVar;
        int i12;
        long j = 0;
        switch (this.a) {
            case 0:
                Object f = ((fvf) this.b).f(1, -((jx7) this.c).L(((eoe) this.d).d() + edo.b), continuation);
                nm6 nm6Var3 = nm6.a;
                if (f != nm6Var3) {
                    f = Unit.a;
                }
                if (f != nm6Var3) {
                    break;
                }
                break;
            case 1:
                if (continuation instanceof kkm) {
                    kkmVar = (kkm) continuation;
                    int i13 = kkmVar.k;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        kkmVar.k = i13 - Integer.MIN_VALUE;
                        Object obj5 = kkmVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i = kkmVar.k;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj5);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i2 = kkmVar.n;
                                rjcVar = kkmVar.m;
                                qgg.h0(obj5);
                                z = false;
                                z2 = true;
                            }
                        } else {
                            qgg.h0(obj5);
                            rjcVar = (rjc) this.b;
                            xjm a3 = ((lkm) this.c).a();
                            String str = (String) this.d;
                            kkmVar.m = rjcVar;
                            z = false;
                            kkmVar.n = 0;
                            z2 = true;
                            kkmVar.k = 1;
                            obj5 = a3.a(str, kkmVar);
                            if (obj5 != nm6Var4) {
                                i2 = 0;
                            }
                            break;
                        }
                        kjm kjmVar = (kjm) obj5;
                        Boolean valueOf = Boolean.valueOf((kjmVar == null && kjmVar.j == z2) ? true : z);
                        kkmVar.m = null;
                        kkmVar.n = i2;
                        kkmVar.k = 2;
                        break;
                    }
                }
                kkmVar = new kkm(this, continuation);
                Object obj52 = kkmVar.j;
                nm6 nm6Var42 = nm6.a;
                i = kkmVar.k;
                if (i == 0) {
                }
                kjm kjmVar2 = (kjm) obj52;
                Boolean valueOf2 = Boolean.valueOf((kjmVar2 == null && kjmVar2.j == z2) ? true : z);
                kkmVar.m = null;
                kkmVar.n = i2;
                kkmVar.k = 2;
            case 2:
                String str2 = (String) this.d;
                x3n x3nVar = (x3n) this.c;
                if (continuation instanceof qcn) {
                    qcnVar = (qcn) continuation;
                    int i14 = qcnVar.k;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        qcnVar.k = i14 - Integer.MIN_VALUE;
                        Object obj6 = qcnVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i3 = qcnVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj6);
                            rjc rjcVar3 = (rjc) this.b;
                            String str3 = (String) obj;
                            g8c g8cVar = (g8c) x3nVar.c;
                            if (str3 != null) {
                                str2.getClass();
                                d = ((skr) g8cVar.a).d(R.string.header_now_playing_playlist_with_filter, str2, str3);
                            } else {
                                str2.getClass();
                                d = ((skr) g8cVar.a).d(R.string.header_now_playing_playlist, str2);
                            }
                            qcnVar.k = 1;
                            if (rjcVar3.emit(d, qcnVar) == nm6Var5) {
                                break;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                qcnVar = new qcn(this, continuation);
                Object obj62 = qcnVar.j;
                nm6 nm6Var52 = nm6.a;
                i3 = qcnVar.k;
                if (i3 != 0) {
                }
            case 3:
                String str4 = (String) this.d;
                Resources resources = (Resources) ((n3m) this.c).b;
                if (continuation instanceof rcn) {
                    rcnVar = (rcn) continuation;
                    int i15 = rcnVar.k;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        rcnVar.k = i15 - Integer.MIN_VALUE;
                        Object obj7 = rcnVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i4 = rcnVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj7);
                            rjc rjcVar4 = (rjc) this.b;
                            String str5 = (String) obj;
                            if (str5 == null || (string = resources.getString(R.string.header_now_playing_playlist_with_filter, str4, str5)) == null) {
                                string = resources.getString(R.string.header_now_playing_playlist, str4);
                                string.getClass();
                            }
                            rcnVar.k = 1;
                            if (rjcVar4.emit(string, rcnVar) == nm6Var6) {
                                break;
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                        }
                        break;
                    }
                }
                rcnVar = new rcn(this, continuation);
                Object obj72 = rcnVar.j;
                nm6 nm6Var62 = nm6.a;
                i4 = rcnVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                break;
            case 5:
                xqn xqnVar = (xqn) this.d;
                h9q h9qVar = (h9q) this.c;
                if (continuation instanceof f9q) {
                    f9qVar = (f9q) continuation;
                    int i16 = f9qVar.k;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        f9qVar.k = i16 - Integer.MIN_VALUE;
                        Object obj8 = f9qVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i5 = f9qVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar5 = (rjc) this.b;
                            d6l d6lVar = (d6l) obj;
                            if (h9qVar.c().a) {
                                n7q n7qVar = d6lVar.a;
                                v0l v0lVar = d6lVar.c;
                                vuu c = h9qVar.c();
                                n7qVar.getClass();
                                c.getClass();
                                mwk mwkVar = (mwk) wdg.A(n7qVar, new ozw(c));
                                if (mwkVar != null && v0lVar == v0l.d) {
                                    xqnVar.a = mwkVar.b();
                                }
                                if (mwkVar != null) {
                                    String b = mwkVar.b();
                                    rwk rwkVar = new rwk(b);
                                    String str6 = (String) xqnVar.a;
                                    if (!(((str6 == null ? false : Intrinsics.d(b, str6)) || v0lVar == v0l.d || d6lVar.b != w0l.b) ? false : true)) {
                                        rwkVar = null;
                                    }
                                    String str7 = rwkVar != null ? rwkVar.a : null;
                                    if (str7 != null) {
                                        pair = new Pair(new rwk(str7), d6lVar.a.c());
                                        f9qVar.k = 1;
                                        if (rjcVar5.emit(pair, f9qVar) == nm6Var7) {
                                            break;
                                        }
                                    }
                                }
                            }
                            pair = null;
                            f9qVar.k = 1;
                            if (rjcVar5.emit(pair, f9qVar) == nm6Var7) {
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj8);
                        }
                        break;
                    }
                }
                f9qVar = new f9q(this, continuation);
                Object obj82 = f9qVar.j;
                nm6 nm6Var72 = nm6.a;
                i5 = f9qVar.k;
                if (i5 != 0) {
                }
                break;
            case 6:
                break;
            case 7:
                mbj mbjVar = (mbj) this.c;
                if (continuation instanceof wzs) {
                    wzsVar = (wzs) continuation;
                    int i17 = wzsVar.k;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        wzsVar.k = i17 - Integer.MIN_VALUE;
                        Object obj9 = wzsVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i6 = wzsVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar6 = (rjc) this.b;
                            mqs mqsVar = (mqs) obj;
                            if (!Intrinsics.d(mqsVar.d.a, mbjVar.b.d.a)) {
                                mqsVar = null;
                            }
                            if (mqsVar == null) {
                                mqsVar = mbjVar.b;
                            }
                            yks yksVar = (yks) this.d;
                            ArrayList arrayList = mbjVar.d;
                            yksVar.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj10 : arrayList) {
                                if (Intrinsics.d(((mqs) obj10).d.a, mqsVar.d.a)) {
                                    arrayList2.add(obj10);
                                }
                            }
                            int indexOf = arrayList2.indexOf(mqsVar);
                            Integer valueOf3 = Integer.valueOf(indexOf);
                            if (indexOf == -1) {
                                valueOf3 = null;
                            }
                            if (valueOf3 != null) {
                                int intValue = valueOf3.intValue();
                                r1l r1lVar = (r1l) yksVar.c;
                                mqsVar.getClass();
                                Long a4 = r1lVar.a(mqsVar.a);
                                long longValue = a4 != null ? a4.longValue() : 0L;
                                Iterator it = arrayList2.subList(intValue, arrayList2.size()).iterator();
                                long j2 = 0;
                                while (it.hasNext()) {
                                    j2 += ((mqs) it.next()).e;
                                }
                                long j3 = j2 - longValue;
                                if (j3 <= 2100) {
                                    zcjVar = ycj.a;
                                } else {
                                    Iterator it2 = arrayList2.subList(0, intValue).iterator();
                                    while (it2.hasNext()) {
                                        j += ((mqs) it2.next()).e;
                                    }
                                    float f2 = j / (j + j2);
                                    msa msaVar = nsa.b;
                                    long f3 = nsa.f(yd5.M(1, ssa.MINUTES));
                                    if (j3 >= f3) {
                                        f3 = j3;
                                    }
                                    zcjVar = new bdj(saf.N(f3), j3, f2);
                                }
                            } else {
                                Assertions.throwOrSkip$default(new FailedAssertionException(hrg.r("Time left calculation is failed, no track found: trackId=", mqsVar.a, " albumId=", mqsVar.d.a)), null, 2, null);
                                zcjVar = new zcj("");
                            }
                            wzsVar.k = 1;
                            if (rjcVar6.emit(zcjVar, wzsVar) == nm6Var8) {
                                break;
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                wzsVar = new wzs(this, continuation);
                Object obj92 = wzsVar.j;
                nm6 nm6Var82 = nm6.a;
                i6 = wzsVar.k;
                if (i6 != 0) {
                }
            case 8:
                Object M = q6k.M((CoroutineContext) this.b, obj, this.c, (axa) this.d, continuation);
                if (M != nm6.a) {
                    break;
                }
                break;
            case 9:
                long longValue2 = ((Number) obj).longValue();
                crt crtVar = (crt) this.d;
                tqn tqnVar = (tqn) this.c;
                ((wqn) this.b).a = longValue2;
                if (longValue2 == 0 && tqnVar.a) {
                    crtVar.e.getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(Context.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    hag.x((Context) qdcVar.C(I), R.string.clear_storage_toast, 0);
                    tqnVar.a = false;
                }
                x0q x0qVar = crtVar.h;
                Unit unit = Unit.a;
                Object emit = x0qVar.emit(unit, continuation);
                if (emit == nm6.a) {
                    break;
                }
                break;
            case 10:
                if (continuation instanceof n1w) {
                    n1wVar = (n1w) continuation;
                    int i18 = n1wVar.k;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        n1wVar.k = i18 - Integer.MIN_VALUE;
                        Object obj11 = n1wVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i7 = n1wVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar7 = (rjc) this.b;
                            s2w s2wVar = (s2w) obj;
                            t2w t2wVar = ((t1w) this.c).o;
                            Map map = (Map) this.d;
                            t2wVar.getClass();
                            s2wVar.getClass();
                            map.getClass();
                            ArrayList arrayList3 = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                String str8 = (String) entry.getKey();
                                xrv xrvVar = (xrv) entry.getValue();
                                boolean containsKey = s2wVar.b.containsKey(str8);
                                String id = xrvVar.getId();
                                String name = xrvVar.getName();
                                CoverPath a5 = xrvVar.a();
                                String w = a5 != null ? vz1.w(a5) : null;
                                arrayList3.add(new bxv(id, name, w == null ? "" : w, xrvVar, containsKey));
                            }
                            kxv kxvVar = new kxv(CollectionsKt.j0(arrayList3));
                            n1wVar.k = 1;
                            if (rjcVar7.emit(kxvVar, n1wVar) == nm6Var9) {
                                break;
                            }
                        } else if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj11);
                        }
                        break;
                    }
                }
                n1wVar = new n1w(this, continuation);
                Object obj112 = n1wVar.j;
                nm6 nm6Var92 = nm6.a;
                i7 = n1wVar.k;
                if (i7 != 0) {
                }
            case 11:
                break;
            case 12:
                ccw ccwVar = (ccw) this.c;
                if (continuation instanceof xbw) {
                    xbwVar = (xbw) continuation;
                    int i19 = xbwVar.k;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        xbwVar.k = i19 - Integer.MIN_VALUE;
                        Object obj12 = xbwVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i8 = xbwVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar8 = (rjc) this.b;
                            e0 e0Var = (e0) obj;
                            ccwVar.j.l(e0Var);
                            orw orwVar = new orw(e0Var, ((AtomicBoolean) this.d).getAndSet(false) ? nrw.a : ccwVar.h.remove(e0Var.o()) ? nrw.b : nrw.c);
                            xbwVar.k = 1;
                            if (rjcVar8.emit(orwVar, xbwVar) == nm6Var10) {
                                break;
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                xbwVar = new xbw(this, continuation);
                Object obj122 = xbwVar.j;
                nm6 nm6Var102 = nm6.a;
                i8 = xbwVar.k;
                if (i8 != 0) {
                }
            case 13:
                if (continuation instanceof xkw) {
                    xkwVar = (xkw) continuation;
                    int i20 = xkwVar.k;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        xkwVar.k = i20 - Integer.MIN_VALUE;
                        hylVar = this;
                        Object obj13 = xkwVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i9 = xkwVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj13);
                            rjc rjcVar9 = (rjc) hylVar.b;
                            iqw iqwVar = (iqw) obj;
                            boolean andSet = ((AtomicBoolean) hylVar.c).getAndSet(false);
                            vkw a6 = ykw.a(iqwVar, (pqw) ((sqw) hylVar.d), andSet);
                            String E = a6 != null ? v5g.E(a6) : null;
                            StringBuilder sb = new StringBuilder("transition event ");
                            sb.append(iqwVar);
                            sb.append(", first=");
                            sb.append(andSet);
                            sb.append(", result=");
                            v3w.m(sb, E, 3, ykw.d, null);
                            if (a6 != null) {
                                xkwVar.k = 1;
                                if (rjcVar9.emit(a6, xkwVar) == nm6Var11) {
                                    break;
                                }
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj13);
                        }
                        break;
                    }
                }
                hylVar = this;
                xkwVar = new xkw(hylVar, continuation);
                Object obj132 = xkwVar.j;
                nm6 nm6Var112 = nm6.a;
                i9 = xkwVar.k;
                if (i9 != 0) {
                }
            case 14:
                Object obj14 = llw.a;
                anw anwVar = (anw) this.c;
                zzp zzpVar2 = anwVar.a;
                pqw pqwVar2 = (pqw) this.d;
                if (continuation instanceof wmw) {
                    wmwVar = (wmw) continuation;
                    int i21 = wmwVar.k;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        wmwVar.k = i21 - Integer.MIN_VALUE;
                        Object obj15 = wmwVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i10 = wmwVar.k;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                qgg.h0(obj15);
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qgg.h0(obj15);
                            rjc rjcVar10 = (rjc) this.b;
                            spw spwVar = (spw) obj;
                            s0 a7 = anwVar.d.a(spwVar.a());
                            pqwVar2.getClass();
                            maq maqVar = pqwVar2.b;
                            if (!(maqVar instanceof eaq)) {
                                if (maqVar instanceof raq) {
                                    raq raqVar = (raq) maqVar;
                                    if (spwVar instanceof npw) {
                                        m2 = raq.m(raqVar, ((npw) spwVar).a);
                                    } else if (spwVar instanceof opw) {
                                        m2 = raq.m(raqVar, ((opw) spwVar).a);
                                    } else if (spwVar instanceof qpw) {
                                        m2 = raq.m(raqVar, ((qpw) spwVar).a);
                                    } else if (!(spwVar instanceof ppw) && !(spwVar instanceof rpw) && !(spwVar instanceof mpw)) {
                                        b6e.s();
                                        break;
                                    }
                                    obj3 = new klw(m2);
                                    rjcVar2 = rjcVar10;
                                    obj2 = obj14;
                                    zzpVar = zzpVar2;
                                    pqwVar = pqwVar2;
                                    wmwVar2 = wmwVar;
                                    nm6Var = nm6Var12;
                                    if (!(obj3 instanceof llw)) {
                                        O = zdg.O(maqVar, swf.o0(maqVar.l()));
                                    } else if (!(obj3 instanceof klw)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        O = zdg.O((maq) ((klw) obj3).a, a7);
                                    }
                                    zzp zzpVar3 = zzpVar;
                                    pqw pqwVar3 = pqwVar;
                                    fpw c2 = pqwVar3.c(zzpVar3);
                                    if (!(spwVar instanceof opw)) {
                                        opw opwVar = (opw) spwVar;
                                        a = fpw.a(c2, false, opwVar.b, opwVar.c, null, 25);
                                    } else if (spwVar instanceof qpw) {
                                        qpw qpwVar = (qpw) spwVar;
                                        a = fpw.a(c2, false, qpwVar.b, qpwVar.c, null, 25);
                                    } else if (spwVar instanceof npw) {
                                        npw npwVar = (npw) spwVar;
                                        a = fpw.a(c2, false, npwVar.b, npwVar.c, null, 25);
                                    } else if (!(spwVar instanceof ppw) && !(spwVar instanceof rpw) && !(spwVar instanceof mpw)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        obj4 = obj2;
                                        if (obj4 instanceof llw) {
                                            fpw c3 = pqwVar3.c(zzpVar3);
                                            P = ivf.P(c3, swf.o0(c3.e));
                                        } else if (!(obj4 instanceof klw)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            P = ivf.P((fpw) ((klw) obj4).a, a7);
                                        }
                                        pnl n = a0.n();
                                        n.j(P);
                                        n.i(O);
                                        nnwVar = new nnw((a0) n.b(), String.valueOf(spwVar), qqw.b);
                                        wmwVar3 = wmwVar2;
                                        wmwVar3.k = 1;
                                        nm6Var2 = nm6Var;
                                        if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                            break;
                                        }
                                    }
                                    obj4 = new klw(a);
                                    if (obj4 instanceof llw) {
                                    }
                                    pnl n2 = a0.n();
                                    n2.j(P);
                                    n2.i(O);
                                    nnwVar = new nnw((a0) n2.b(), String.valueOf(spwVar), qqw.b);
                                    wmwVar3 = wmwVar2;
                                    wmwVar3.k = 1;
                                    nm6Var2 = nm6Var;
                                    if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                    }
                                } else if (!(maqVar instanceof jbq)) {
                                    rjcVar2 = rjcVar10;
                                    obj2 = obj14;
                                    zzpVar = zzpVar2;
                                    pqwVar = pqwVar2;
                                    wmwVar2 = wmwVar;
                                    nm6Var = nm6Var12;
                                    if (!(maqVar instanceof vaq)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        vaq vaqVar = (vaq) maqVar;
                                        List list = vaqVar.c;
                                        if (spwVar instanceof npw) {
                                            m = vaq.m(vaqVar, list, ((npw) spwVar).a);
                                        } else if (spwVar instanceof opw) {
                                            m = vaq.m(vaqVar, list, ((opw) spwVar).a);
                                        } else if (spwVar instanceof qpw) {
                                            m = vaq.m(vaqVar, list, ((qpw) spwVar).a);
                                        } else if (!(spwVar instanceof ppw) && !(spwVar instanceof rpw) && !(spwVar instanceof mpw)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            obj3 = obj2;
                                            if (!(obj3 instanceof llw)) {
                                            }
                                            zzp zzpVar32 = zzpVar;
                                            pqw pqwVar32 = pqwVar;
                                            fpw c22 = pqwVar32.c(zzpVar32);
                                            if (!(spwVar instanceof opw)) {
                                            }
                                            obj4 = new klw(a);
                                            if (obj4 instanceof llw) {
                                            }
                                            pnl n22 = a0.n();
                                            n22.j(P);
                                            n22.i(O);
                                            nnwVar = new nnw((a0) n22.b(), String.valueOf(spwVar), qqw.b);
                                            wmwVar3 = wmwVar2;
                                            wmwVar3.k = 1;
                                            nm6Var2 = nm6Var;
                                            if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                            }
                                        }
                                        obj3 = new klw(m);
                                        if (!(obj3 instanceof llw)) {
                                        }
                                        zzp zzpVar322 = zzpVar;
                                        pqw pqwVar322 = pqwVar;
                                        fpw c222 = pqwVar322.c(zzpVar322);
                                        if (!(spwVar instanceof opw)) {
                                        }
                                        obj4 = new klw(a);
                                        if (obj4 instanceof llw) {
                                        }
                                        pnl n222 = a0.n();
                                        n222.j(P);
                                        n222.i(O);
                                        nnwVar = new nnw((a0) n222.b(), String.valueOf(spwVar), qqw.b);
                                        wmwVar3 = wmwVar2;
                                        wmwVar3.k = 1;
                                        nm6Var2 = nm6Var;
                                        if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                        }
                                    }
                                } else {
                                    jbq jbqVar3 = (jbq) maqVar;
                                    nyn nynVar = jbqVar3.e;
                                    gxc gxcVar = jbqVar3.c;
                                    bbq bbqVar = jbqVar3.b;
                                    eu7 eu7Var2 = jbqVar3.d;
                                    obj2 = obj14;
                                    if (spwVar instanceof npw) {
                                        jbqVar2 = jbq.m(jbqVar3, n7w.A(eu7Var2, eu7Var2.a.b(((npw) spwVar).a)), null, 59);
                                    } else if (spwVar instanceof opw) {
                                        jbqVar2 = jbq.m(jbqVar3, n7w.A(eu7Var2, eu7Var2.a.b(((opw) spwVar).a)), null, 59);
                                    } else if (spwVar instanceof qpw) {
                                        jbqVar2 = jbq.m(jbqVar3, n7w.A(eu7Var2, eu7Var2.a.b(((qpw) spwVar).a)), null, 59);
                                    } else if (spwVar instanceof ppw) {
                                        jbqVar2 = jbq.m(jbqVar3, null, ((ppw) spwVar).a, 55);
                                    } else if (spwVar instanceof rpw) {
                                        List list2 = ((rpw) spwVar).a;
                                        jbqVar2 = jbq.m(jbqVar3, ksw.M(eu7Var2, list2 != null, null, list2, false, 10), null, 59);
                                    } else if (!(spwVar instanceof mpw)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        mpw mpwVar = (mpw) spwVar;
                                        a3l a3lVar = a3l.a;
                                        if (mpwVar instanceof ipw) {
                                            ipw ipwVar = (ipw) mpwVar;
                                            List q0 = CollectionsKt.q0(ipwVar.b(), 200);
                                            if (q0.isEmpty()) {
                                                rjcVar2 = rjcVar10;
                                                zzpVar = zzpVar2;
                                                pqwVar = pqwVar2;
                                                wmwVar2 = wmwVar;
                                                nm6Var = nm6Var12;
                                                jbqVar2 = jbqVar3;
                                                obj3 = new klw(jbqVar2);
                                                if (!(obj3 instanceof llw)) {
                                                }
                                                zzp zzpVar3222 = zzpVar;
                                                pqw pqwVar3222 = pqwVar;
                                                fpw c2222 = pqwVar3222.c(zzpVar3222);
                                                if (!(spwVar instanceof opw)) {
                                                }
                                                obj4 = new klw(a);
                                                if (obj4 instanceof llw) {
                                                }
                                                pnl n2222 = a0.n();
                                                n2222.j(P);
                                                n2222.i(O);
                                                nnwVar = new nnw((a0) n2222.b(), String.valueOf(spwVar), qqw.b);
                                                wmwVar3 = wmwVar2;
                                                wmwVar3.k = 1;
                                                nm6Var2 = nm6Var;
                                                if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                                }
                                            } else {
                                                if (ipwVar instanceof hpw) {
                                                    size = yhn.d(jbqVar3.j + 1, 0, jbqVar3.n().size());
                                                } else if (!(ipwVar instanceof gpw)) {
                                                    b6e.s();
                                                    break;
                                                } else {
                                                    size = jbqVar3.n().size();
                                                }
                                                asw U = y7g.U(q0, bbqVar.f());
                                                List list3 = q0;
                                                nm6Var = nm6Var12;
                                                ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                                                Iterator it3 = list3.iterator();
                                                while (it3.hasNext()) {
                                                    jzs jzsVar = (jzs) it3.next();
                                                    jzsVar.getClass();
                                                    Iterator it4 = it3;
                                                    mqs mqsVar2 = jzsVar.a;
                                                    rjc rjcVar11 = rjcVar10;
                                                    izs izsVar = jzsVar.g;
                                                    arrayList4.add(new naq(ngg.q(mqsVar2), qgg.i0(o2g.q0(jzsVar, U.b(izsVar)), izsVar, null, 14), mqsVar2));
                                                    it3 = it4;
                                                    U = U;
                                                    rjcVar10 = rjcVar11;
                                                    wmwVar = wmwVar;
                                                    zzpVar2 = zzpVar2;
                                                    pqwVar2 = pqwVar2;
                                                }
                                                asw aswVar = U;
                                                rjcVar2 = rjcVar10;
                                                zzpVar = zzpVar2;
                                                pqwVar = pqwVar2;
                                                wmwVar2 = wmwVar;
                                                int b2 = eu7Var2.a.b(size);
                                                int ordinal = avf.J(bbqVar).ordinal();
                                                if (ordinal == 0) {
                                                    z3 = true;
                                                } else if (ordinal != 1) {
                                                    b6e.s();
                                                    break;
                                                } else {
                                                    z3 = false;
                                                }
                                                eu7 d0 = leu.d0(eu7Var2, arrayList4, size, b2, z3);
                                                cu7 cu7Var = d0.a;
                                                if (bbqVar instanceof abq) {
                                                    abq abqVar = (abq) bbqVar;
                                                    xaqVar2 = new abq(abqVar.a, vq2.t(cu7Var), abqVar.c, abqVar.d, abqVar.e, aswVar);
                                                } else if (!(bbqVar instanceof xaq)) {
                                                    b6e.s();
                                                    break;
                                                } else {
                                                    xaqVar2 = new xaq(new cbq(qwp.y(cu7Var.e())), aswVar, gxcVar);
                                                }
                                                jbqVar = new jbq(xaqVar2, jbqVar3.c, d0, nynVar, a3lVar, jbqVar3.g);
                                                jbqVar3 = jbqVar;
                                                jbqVar2 = jbqVar3;
                                                obj3 = new klw(jbqVar2);
                                                if (!(obj3 instanceof llw)) {
                                                }
                                                zzp zzpVar32222 = zzpVar;
                                                pqw pqwVar32222 = pqwVar;
                                                fpw c22222 = pqwVar32222.c(zzpVar32222);
                                                if (!(spwVar instanceof opw)) {
                                                }
                                                obj4 = new klw(a);
                                                if (obj4 instanceof llw) {
                                                }
                                                pnl n22222 = a0.n();
                                                n22222.j(P);
                                                n22222.i(O);
                                                nnwVar = new nnw((a0) n22222.b(), String.valueOf(spwVar), qqw.b);
                                                wmwVar3 = wmwVar2;
                                                wmwVar3.k = 1;
                                                nm6Var2 = nm6Var;
                                                if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                                }
                                            }
                                        } else {
                                            rjcVar2 = rjcVar10;
                                            zzpVar = zzpVar2;
                                            pqwVar = pqwVar2;
                                            wmwVar2 = wmwVar;
                                            nm6Var = nm6Var12;
                                            if (mpwVar instanceof kpw) {
                                                eu7 e0 = leu.e0(eu7Var2, eu7Var2.a.b(((kpw) mpwVar).a));
                                                cu7 cu7Var2 = e0.a;
                                                List e = cu7Var2.e();
                                                asw f4 = bbqVar.f();
                                                hzs hzsVar = hzs.a;
                                                e.getClass();
                                                f4.getClass();
                                                HashMap hashMap = new HashMap(f4.a);
                                                HashMap hashMap2 = new HashMap((Map) f4.e.getValue());
                                                List list4 = e;
                                                Iterator it5 = list4.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        izs I2 = q7g.I(((naq) ((mwk) it5.next())).d);
                                                        if (!(I2 instanceof e6v)) {
                                                            eu7Var = e0;
                                                            if (!I2.equals(hzsVar)) {
                                                                b6e.s();
                                                                break;
                                                            } else {
                                                                su4.s(2, null, "This should not happen. Wave track source should be always filled in wave queue", null);
                                                                e0 = eu7Var;
                                                            }
                                                        } else {
                                                            e6v e6vVar = (e6v) I2;
                                                            if (!(e6vVar instanceof d6v)) {
                                                                eu7Var = e0;
                                                                if (!(e6vVar instanceof b6v)) {
                                                                    b6e.s();
                                                                    break;
                                                                }
                                                            } else {
                                                                c6v c6vVar = ((d6v) e6vVar).b;
                                                                Integer num = (Integer) hashMap2.get(c6vVar);
                                                                int intValue2 = num != null ? num.intValue() : hashMap.size();
                                                                eu7Var = e0;
                                                                hashMap.put(Integer.valueOf(intValue2), e6vVar);
                                                                hashMap2.put(c6vVar, Integer.valueOf(intValue2));
                                                            }
                                                            e0 = eu7Var;
                                                        }
                                                    } else {
                                                        eu7 eu7Var3 = e0;
                                                        int size2 = hashMap.size();
                                                        HashMap hashMap3 = new HashMap(f4.b);
                                                        HashMap hashMap4 = new HashMap(f4.a());
                                                        Iterator it6 = list4.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                izs I3 = q7g.I(((naq) ((mwk) it6.next())).d);
                                                                if (I3 instanceof e6v) {
                                                                    e6v e6vVar2 = (e6v) I3;
                                                                    if (e6vVar2 instanceof d6v) {
                                                                        continue;
                                                                    } else if (!(e6vVar2 instanceof b6v)) {
                                                                        b6e.s();
                                                                        break;
                                                                    } else {
                                                                        Integer num2 = (Integer) hashMap4.get(e6vVar2);
                                                                        int intValue3 = num2 != null ? num2.intValue() : hashMap3.size() + size2;
                                                                        hashMap3.put(Integer.valueOf(intValue3), e6vVar2);
                                                                        hashMap4.put(e6vVar2, Integer.valueOf(intValue3));
                                                                    }
                                                                } else if (!I3.equals(hzsVar)) {
                                                                    b6e.s();
                                                                    break;
                                                                } else {
                                                                    su4.s(2, null, "This should not happen. Track source should be always filled in wave queue", null);
                                                                }
                                                            } else {
                                                                asw aswVar2 = new asw(hashMap, hashMap3);
                                                                if (bbqVar instanceof abq) {
                                                                    abq abqVar2 = (abq) bbqVar;
                                                                    xaqVar = new abq(abqVar2.a, vq2.t(cu7Var2), abqVar2.c, abqVar2.d, abqVar2.e, aswVar2);
                                                                } else if (!(bbqVar instanceof xaq)) {
                                                                    b6e.s();
                                                                    break;
                                                                } else {
                                                                    xaqVar = new xaq(new cbq(qwp.y(cu7Var2.e())), aswVar2, gxcVar);
                                                                }
                                                                jbqVar = new jbq(xaqVar, jbqVar3.c, eu7Var3, nynVar, a3lVar, jbqVar3.g);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!(mpwVar instanceof lpw)) {
                                                if (!(mpwVar instanceof jpw)) {
                                                    b6e.s();
                                                    break;
                                                } else {
                                                    jpw jpwVar = (jpw) mpwVar;
                                                    jbqVar = new jbq(bbqVar, jbqVar3.c, leu.c0(eu7Var2, jpwVar.a, jpwVar.b), nynVar, a3lVar, jbqVar3.g);
                                                    jbqVar3 = jbqVar;
                                                }
                                            }
                                            jbqVar2 = jbqVar3;
                                            obj3 = new klw(jbqVar2);
                                            if (!(obj3 instanceof llw)) {
                                            }
                                            zzp zzpVar322222 = zzpVar;
                                            pqw pqwVar322222 = pqwVar;
                                            fpw c222222 = pqwVar322222.c(zzpVar322222);
                                            if (!(spwVar instanceof opw)) {
                                            }
                                            obj4 = new klw(a);
                                            if (obj4 instanceof llw) {
                                            }
                                            pnl n222222 = a0.n();
                                            n222222.j(P);
                                            n222222.i(O);
                                            nnwVar = new nnw((a0) n222222.b(), String.valueOf(spwVar), qqw.b);
                                            wmwVar3 = wmwVar2;
                                            wmwVar3.k = 1;
                                            nm6Var2 = nm6Var;
                                            if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                            }
                                        }
                                    }
                                    rjcVar2 = rjcVar10;
                                    zzpVar = zzpVar2;
                                    pqwVar = pqwVar2;
                                    wmwVar2 = wmwVar;
                                    nm6Var = nm6Var12;
                                    obj3 = new klw(jbqVar2);
                                    if (!(obj3 instanceof llw)) {
                                    }
                                    zzp zzpVar3222222 = zzpVar;
                                    pqw pqwVar3222222 = pqwVar;
                                    fpw c2222222 = pqwVar3222222.c(zzpVar3222222);
                                    if (!(spwVar instanceof opw)) {
                                    }
                                    obj4 = new klw(a);
                                    if (obj4 instanceof llw) {
                                    }
                                    pnl n2222222 = a0.n();
                                    n2222222.j(P);
                                    n2222222.i(O);
                                    nnwVar = new nnw((a0) n2222222.b(), String.valueOf(spwVar), qqw.b);
                                    wmwVar3 = wmwVar2;
                                    wmwVar3.k = 1;
                                    nm6Var2 = nm6Var;
                                    if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                                    }
                                }
                            }
                            rjcVar2 = rjcVar10;
                            obj3 = obj14;
                            obj2 = obj3;
                            zzpVar = zzpVar2;
                            pqwVar = pqwVar2;
                            wmwVar2 = wmwVar;
                            nm6Var = nm6Var12;
                            if (!(obj3 instanceof llw)) {
                            }
                            zzp zzpVar32222222 = zzpVar;
                            pqw pqwVar32222222 = pqwVar;
                            fpw c22222222 = pqwVar32222222.c(zzpVar32222222);
                            if (!(spwVar instanceof opw)) {
                            }
                            obj4 = new klw(a);
                            if (obj4 instanceof llw) {
                            }
                            pnl n22222222 = a0.n();
                            n22222222.j(P);
                            n22222222.i(O);
                            nnwVar = new nnw((a0) n22222222.b(), String.valueOf(spwVar), qqw.b);
                            wmwVar3 = wmwVar2;
                            wmwVar3.k = 1;
                            nm6Var2 = nm6Var;
                            if (rjcVar2.emit(nnwVar, wmwVar3) == nm6Var2) {
                            }
                        }
                    }
                }
                wmwVar = new wmw(this, continuation);
                Object obj152 = wmwVar.j;
                nm6 nm6Var122 = nm6.a;
                i10 = wmwVar.k;
                if (i10 == 0) {
                }
                break;
            case 15:
                hnw hnwVar = (hnw) this.c;
                if (continuation instanceof enw) {
                    enwVar = (enw) continuation;
                    int i22 = enwVar.k;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        enwVar.k = i22 - Integer.MIN_VALUE;
                        Object obj16 = enwVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i11 = enwVar.k;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                qgg.h0(obj16);
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qgg.h0(obj16);
                            rjc rjcVar12 = (rjc) this.b;
                            zow zowVar = (zow) obj;
                            s0 a8 = hnwVar.c.a(zowVar.a());
                            fpw c4 = ((pqw) this.d).c(hnwVar.a);
                            if (zowVar instanceof xow) {
                                a2 = fpw.a(c4, false, ((xow) zowVar).a.a, 0L, null, 29);
                            } else if (zowVar instanceof wow) {
                                a2 = fpw.a(c4, ((wow) zowVar).a, 0L, 0L, null, 30);
                            } else if (!(zowVar instanceof yow)) {
                                b6e.s();
                                break;
                            } else {
                                a2 = fpw.a(c4, false, 0L, 0L, ((yow) zowVar).a, 23);
                            }
                            nnw nnwVar2 = new nnw(ivf.P(a2, a8), String.valueOf(zowVar), qqw.b);
                            enwVar.k = 1;
                            if (rjcVar12.emit(nnwVar2, enwVar) == nm6Var13) {
                                break;
                            }
                        }
                    }
                }
                enwVar = new enw(this, continuation);
                Object obj162 = enwVar.j;
                nm6 nm6Var132 = nm6.a;
                i11 = enwVar.k;
                if (i11 == 0) {
                }
            default:
                if (continuation instanceof zpw) {
                    zpwVar = (zpw) continuation;
                    int i23 = zpwVar.k;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        zpwVar.k = i23 - Integer.MIN_VALUE;
                        Object obj17 = zpwVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i12 = zpwVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj17);
                            rjc rjcVar13 = (rjc) this.b;
                            vat vatVar = new vat((j1g) obj, (daq) this.c, (StationId) this.d);
                            zpwVar.k = 1;
                            if (rjcVar13.emit(vatVar, zpwVar) == nm6Var14) {
                                break;
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                zpwVar = new zpw(this, continuation);
                Object obj172 = zpwVar.j;
                nm6 nm6Var142 = nm6.a;
                i12 = zpwVar.k;
                if (i12 != 0) {
                }
        }
        return Unit.a;
    }

    public hyl(rjc rjcVar, AtomicBoolean atomicBoolean, ykw ykwVar, sqw sqwVar) {
        this.a = 13;
        this.b = rjcVar;
        this.c = atomicBoolean;
        this.d = sqwVar;
    }

    public hyl(fvf fvfVar, jx7 jx7Var, eoe eoeVar) {
        this.a = 0;
        float f = edo.a;
        this.b = fvfVar;
        this.c = jx7Var;
        this.d = eoeVar;
    }

    public hyl(List list, fvf fvfVar, eqp eqpVar) {
        this.a = 4;
        this.c = list;
        this.b = fvfVar;
        this.d = eqpVar;
    }

    public /* synthetic */ hyl(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
