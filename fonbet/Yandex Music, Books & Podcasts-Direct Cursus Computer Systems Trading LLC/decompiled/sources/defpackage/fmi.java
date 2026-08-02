package defpackage;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.DeviceService;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.g;
import com.yandex.passport.api.v2;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class fmi implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fmi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (com.yandex.music.core.ui.compose.draggable.a.i(r9, r10, r1) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (com.yandex.music.core.ui.compose.draggable.a.i(r9, r10, r1) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (com.yandex.music.core.ui.compose.draggable.a.i(r9, r10, r1) == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(hte hteVar, Continuation continuation) {
        xcl xclVar;
        int i;
        na0 na0Var = (na0) this.b;
        if (continuation instanceof xcl) {
            xclVar = (xcl) continuation;
            int i2 = xclVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xclVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xclVar.j;
                nm6 nm6Var = nm6.a;
                i = xclVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(hteVar, ete.a)) {
                        ja0 ja0Var = na0Var.e;
                        lf3 lf3Var = lf3.a;
                        xclVar.l = 1;
                    } else if (Intrinsics.d(hteVar, fte.a)) {
                        ja0 ja0Var2 = na0Var.e;
                        lf3 lf3Var2 = lf3.b;
                        xclVar.l = 2;
                    } else {
                        if (!Intrinsics.d(hteVar, gte.a)) {
                            b6e.s();
                            return null;
                        }
                        na0Var.b(true);
                        ja0 ja0Var3 = na0Var.e;
                        lf3 lf3Var3 = lf3.c;
                        xclVar.l = 3;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    na0Var.b(false);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    na0Var.b(false);
                }
                return Unit.a;
            }
        }
        xclVar = new xcl(this, continuation);
        Object obj2 = xclVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xclVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(g1k g1kVar, Continuation continuation) {
        r1k r1kVar;
        int i;
        if (continuation instanceof r1k) {
            r1kVar = (r1k) continuation;
            int i2 = r1kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = r1kVar.j;
                nm6 nm6Var = nm6.a;
                i = r1kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjq pjqVar = (pjq) this.b;
                    r1kVar.l = 1;
                    if (pjqVar.a.m(g1kVar, r1kVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        r1kVar = new r1k(this, continuation);
        Object obj2 = r1kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = r1kVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r1.s(r9, r2) == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r1.t(r9, r2) == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(e1l e1lVar, Continuation continuation) {
        b1l b1lVar;
        int i;
        k1l k1lVar = (k1l) this.b;
        anx anxVar = k1lVar.h;
        if (continuation instanceof b1l) {
            b1lVar = (b1l) continuation;
            int i2 = b1lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1lVar.m = i2 - Integer.MIN_VALUE;
                Object obj = b1lVar.k;
                nm6 nm6Var = nm6.a;
                i = b1lVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (e1lVar instanceof d1l) {
                        dyk dykVar = ((d1l) e1lVar).a;
                        b1lVar.j = e1lVar;
                        b1lVar.m = 1;
                    } else {
                        if (!(e1lVar instanceof c1l)) {
                            b6e.s();
                            return null;
                        }
                        gyk gykVar = ((c1l) e1lVar).a;
                        b1lVar.j = e1lVar;
                        b1lVar.m = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e1lVar = b1lVar.j;
                    qgg.h0(obj);
                }
                q8b q8bVar = k1lVar.c;
                c3t a = e1lVar.a();
                a.getClass();
                q8bVar.a.a(a);
                return Unit.a;
            }
        }
        b1lVar = new b1l(this, continuation);
        Object obj2 = b1lVar.k;
        nm6 nm6Var2 = nm6.a;
        i = b1lVar.m;
        if (i != 0) {
        }
        q8b q8bVar2 = k1lVar.c;
        c3t a2 = e1lVar.a();
        a2.getClass();
        q8bVar2.a.a(a2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r10.emit(r11, r0) != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r10 == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(yel yelVar, Continuation continuation) {
        dfl dflVar;
        int i;
        Object V;
        efl eflVar = (efl) this.b;
        if (continuation instanceof dfl) {
            dflVar = (dfl) continuation;
            int i2 = dflVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dflVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dflVar.j;
                Object obj2 = nm6.a;
                i = dflVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    zel zelVar = yelVar.a;
                    vbn vbnVar = yelVar.b;
                    dflVar.l = 1;
                    Continuation continuation2 = null;
                    if (zelVar.b) {
                        V = x97.V(dm6.b, new ckg(zelVar, vbnVar, eflVar, continuation2, 12), dflVar);
                        if (V != obj2) {
                            V = Unit.a;
                        }
                    } else {
                        ssg.a(3, "PlayerInformersCenter", "skip: app in background", null);
                        V = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x0q x0qVar = eflVar.j;
                Unit unit = Unit.a;
                dflVar.l = 2;
            }
        }
        dflVar = new dfl(this, continuation);
        Object obj3 = dflVar.j;
        Object obj22 = nm6.a;
        i = dflVar.l;
        if (i != 0) {
        }
        x0q x0qVar2 = eflVar.j;
        Unit unit2 = Unit.a;
        dflVar.l = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object emit;
        boolean z;
        a7l a7lVar;
        int i;
        int i2 = 0;
        Continuation continuation2 = null;
        switch (this.a) {
            case 0:
                Object emit2 = ((gmi) this.b).y.emit((v3k) obj, continuation);
                return emit2 == nm6.a ? emit2 : Unit.a;
            case 1:
                Object emit3 = ((lni) this.b).h.emit(new Float(((Number) obj).floatValue()), continuation);
                return emit3 == nm6.a ? emit3 : Unit.a;
            case 2:
                ((rvi) this.b).k.l((jvi) obj);
                return Unit.a;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = ((azi) this.b).d;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 4:
                Pair pair = (Pair) obj;
                ime imeVar = (ime) this.b;
                x0q x0qVar = (x0q) imeVar.b;
                zzi zziVar = (zzi) pair.a;
                zzi zziVar2 = (zzi) pair.b;
                yzi yziVar = zziVar.b;
                yzi yziVar2 = zziVar2.b;
                if (yziVar == yziVar2) {
                    int ordinal = yziVar2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            mj mjVar = (mj) imeVar.c;
                            int i3 = zziVar2.c;
                            int i4 = zziVar.c;
                            mjVar.getClass();
                            mzi.b.getClass();
                            if (rre.V(i3).compareTo(rre.V(i4)) != 0) {
                                Unit unit = Unit.a;
                                emit = x0qVar.emit(unit, continuation);
                                if (emit != nm6.a) {
                                    return unit;
                                }
                            }
                        } else if (ordinal != 2 && ordinal != 3) {
                            b6e.s();
                            return null;
                        }
                    }
                    return Unit.a;
                }
                Unit unit2 = Unit.a;
                emit = x0qVar.emit(unit2, continuation);
                if (emit != nm6.a) {
                    return unit2;
                }
                return emit;
            case 5:
                xxq xxqVar = (xxq) obj;
                a1j a1jVar = (a1j) this.b;
                synchronized (a1jVar) {
                    a1jVar.c = new z0j(a1jVar.a, xxqVar, a1jVar.b);
                    xdr xdrVar2 = a1jVar.d;
                    v0j a = a1jVar.a();
                    xdrVar2.getClass();
                    xdrVar2.m(null, a);
                }
                return Unit.a;
            case 6:
                pui puiVar = ((s3j) this.b).b;
                rrl rrlVar = ((w3j) obj).a;
                puiVar.getClass();
                t tVar = puiVar.a;
                tVar.startActivity(ixf.E(tVar, rrlVar.a, puiVar.b));
                tVar.finish();
                return Unit.a;
            case 7:
                return i(((Boolean) obj).booleanValue(), continuation);
            case 8:
                if (((yxc) obj).a.d) {
                    ((o6j) this.b).B();
                }
                return Unit.a;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                xdr xdrVar3 = ((i7j) this.b).b;
                xdrVar3.getClass();
                xdrVar3.m(null, bool2);
                return Unit.a;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lmj lmjVar = (lmj) this.b;
                qkb qkbVar = booleanValue ? qkb.OfflineMode : qkb.NoInternet;
                lmjVar.g = qkbVar;
                lmjVar.h = lmj.h(qkbVar);
                rmb g = lmjVar.g(lmjVar.g);
                lmjVar.i = g;
                if (g != null) {
                    rmb.h(g, 0, 3);
                }
                return Unit.a;
            case 11:
                ((Number) obj).intValue();
                ((Function0) this.b).invoke();
                return Unit.a;
            case 12:
                xuo xuoVar = (xuo) obj;
                rvj rvjVar = (rvj) this.b;
                wbc wbcVar = rvjVar.b;
                if (Intrinsics.d(xuoVar, nuo.a)) {
                    wbcVar.a.finish();
                } else if (Intrinsics.d(xuoVar, puo.a)) {
                    wbcVar.a.finish();
                } else if (xuoVar instanceof uuo) {
                    String str = ((uuo) xuoVar).a;
                    y supportFragmentManager = wbcVar.a.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    x2i.a0(supportFragmentManager, jf0.C(pd.t(new qzm[0]), ru0.DARK), new teb(str));
                } else if (xuoVar instanceof ruo) {
                    t tVar2 = wbcVar.a;
                    String str2 = ((ruo) xuoVar).a;
                    tVar2.finish();
                    w1g.y(tVar2, str2, true);
                } else {
                    if (!(xuoVar instanceof vuo)) {
                        b6e.s();
                        return null;
                    }
                    t tVar3 = wbcVar.a;
                    ad6 ad6Var = rvjVar.c;
                    boolean z2 = ((vuo) xuoVar).a;
                    if (!ad6Var.equals(wc6.a)) {
                        tVar3.finish();
                    } else if (z2) {
                        lhs lhsVar = MainScreenActivity.Q0;
                        tVar3.startActivity(imp.J(tVar3, rf3.k, null, null, 12));
                    } else {
                        tVar3.finish();
                    }
                }
                return Unit.a;
            case 13:
                float f = ((cma) obj).a;
                xkg xkgVar = (xkg) this.b;
                View view = xkgVar.c;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), eeh.b(TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics())) + xkgVar.b);
                return Unit.a;
            case 14:
                return c((g1k) obj, continuation);
            case 15:
                ((zi3) this.b).c((Unit) obj);
                return Unit.a;
            case 16:
                l5k l5kVar = (l5k) obj;
                g5k g5kVar = (g5k) this.b;
                m5k m5kVar = m5k.a;
                xdr xdrVar4 = g5kVar.g;
                if (!Intrinsics.d(l5kVar, i5k.a) && !Intrinsics.d(l5kVar, j5k.a)) {
                    if (l5kVar instanceof k5k) {
                        if (((k5k) l5kVar).a) {
                            o5k o5kVar = o5k.a;
                            xdrVar4.getClass();
                            xdrVar4.m(null, o5kVar);
                        } else {
                            xdrVar4.getClass();
                            xdrVar4.m(null, m5kVar);
                        }
                    } else {
                        if (!Intrinsics.d(l5kVar, h5k.a)) {
                            b6e.s();
                            return null;
                        }
                        xdrVar4.getClass();
                        xdrVar4.m(null, m5kVar);
                    }
                }
                return Unit.a;
            case 17:
                return h(continuation);
            case 18:
                ((ns8) ((qxp) ((t1f) this.b).c).a).requireActivity().finish();
                return Unit.a;
            case 19:
                jyr jyrVar = ((jik) this.b).m;
                int ordinal2 = ((cik) obj).ordinal();
                if (ordinal2 == 0) {
                    ((eik) jyrVar.getValue()).a.invoke();
                } else if (ordinal2 == 1) {
                    ((eik) jyrVar.getValue()).b.a.finish();
                } else {
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                    t36 t36Var = ((eik) jyrVar.getValue()).b;
                    Activity activity = t36Var.a;
                    if (!activity.isFinishing()) {
                        activity.finish();
                        Activity activity2 = t36Var.a;
                        lhs lhsVar2 = MainScreenActivity.Q0;
                        activity2.startActivity(imp.J(activity2, null, null, null, 14));
                    }
                }
                return Unit.a;
            case 20:
                return f((xxq) obj, continuation);
            case 21:
                j1g j1gVar = (j1g) obj;
                zwk zwkVar = (zwk) this.b;
                xdr xdrVar5 = zwkVar.e;
                mwk mwkVar = zwkVar.b;
                mwkVar.getClass();
                j1gVar.getClass();
                xdrVar5.l((eml) dag.p(mwkVar, new knn(j1gVar)));
                return Unit.a;
            case 22:
                ((e0l) this.b).invoke((a8l) obj);
                return Unit.a;
            case 23:
                return d((e1l) obj, continuation);
            case 24:
                kjn kjnVar = kjn.f;
                nvm nvmVar = (nvm) obj;
                r1l r1lVar = (r1l) this.b;
                mwk mwkVar2 = nvmVar.a;
                long j = nvmVar.b;
                long longValue = nvmVar.c.longValue();
                if (!r1l.c(j, longValue)) {
                    mwkVar2.getClass();
                    Boolean d = r1lVar.d((String) dag.p(mwkVar2, kjnVar));
                    if (!(d != null ? d.booleanValue() : false) || j >= 2100) {
                        z = false;
                        d5l d5lVar = r1lVar.a;
                        mwkVar2.getClass();
                        String str3 = (String) dag.p(mwkVar2, kjnVar);
                        if (z) {
                            j = 0;
                        }
                        d5lVar.a(new l1l(str3, j, z, ((zzp) r1lVar.b.getValue()).b(), longValue));
                        return Unit.a;
                    }
                }
                z = true;
                d5l d5lVar2 = r1lVar.a;
                mwkVar2.getClass();
                String str32 = (String) dag.p(mwkVar2, kjnVar);
                if (z) {
                }
                d5lVar2.a(new l1l(str32, j, z, ((zzp) r1lVar.b.getValue()).b(), longValue));
                return Unit.a;
            case 25:
                String str4 = (String) obj;
                d5l d5lVar3 = (d5l) this.b;
                if (!Intrinsics.d(d5lVar3.g, str4)) {
                    ReentrantLock reentrantLock = d5lVar3.i;
                    reentrantLock.lock();
                    try {
                        rar rarVar = d5lVar3.j;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        d5lVar3.j = null;
                        reentrantLock.unlock();
                        ReentrantLock reentrantLock2 = d5lVar3.e;
                        reentrantLock2.lock();
                        try {
                            d5lVar3.g = str4;
                            if (d5lVar3.f.getCount() != 1) {
                                d5lVar3.f = new CountDownLatch(1);
                            }
                            d5lVar3.d.clear();
                            d5lVar3.h.clear();
                            reentrantLock2.unlock();
                            x97.y(d5lVar3.b, null, null, new b5l(str4, d5lVar3, continuation2, i2), 3);
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                return Unit.a;
            case 26:
                try {
                    if (continuation instanceof a7l) {
                        a7lVar = (a7l) continuation;
                        int i5 = a7lVar.k;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            a7lVar.k = i5 - Integer.MIN_VALUE;
                            Object obj2 = a7lVar.j;
                            nm6 nm6Var = nm6.a;
                            i = a7lVar.k;
                            if (i != 0) {
                                qgg.h0(obj2);
                                x6l x6lVar = (x6l) this.b;
                                a7lVar.k = 1;
                                if (x6lVar.h((gzk) obj, a7lVar) == nm6Var) {
                                    return nm6Var;
                                }
                            } else {
                                if (i != 1) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    if (i != 0) {
                    }
                    return Unit.a;
                } catch (CancellationException e) {
                    CancellationException c = n7w.c("Unexpected cancellation exception in flow collector", e);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c));
                    throw c;
                }
                a7lVar = new a7l(this, continuation);
                Object obj22 = a7lVar.j;
                nm6 nm6Var2 = nm6.a;
                i = a7lVar.k;
            case 27:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                nwh nwhVar = (nwh) this.b;
                p2b p2bVar = (p2b) nwhVar.j;
                p9l p9lVar = (p9l) nwhVar.i;
                if (booleanValue2) {
                    p9lVar.a();
                    p2bVar.a();
                } else {
                    p9lVar.b();
                    p2bVar.b();
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return b((hte) obj, continuation);
            default:
                return e((yel) obj, continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(xxq xxqVar, Continuation continuation) {
        krk krkVar;
        int i;
        xdr xdrVar;
        fs7 fs7Var;
        ork orkVar = (ork) this.b;
        rjq rjqVar = orkVar.c;
        if (continuation instanceof krk) {
            krkVar = (krk) continuation;
            int i2 = krkVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                krkVar.n = i2 - Integer.MIN_VALUE;
                Object obj = krkVar.l;
                nm6 nm6Var = nm6.a;
                i = krkVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    rjqVar.V();
                    xdr xdrVar2 = orkVar.m;
                    fs7 fs7Var2 = fs7.g;
                    yqk p = bfg.p(orkVar.b, xxqVar.a);
                    krkVar.j = xdrVar2;
                    krkVar.k = fs7Var2;
                    krkVar.n = 1;
                    Object c = p.c(krkVar);
                    if (c == nm6Var) {
                        return nm6Var;
                    }
                    xdrVar = xdrVar2;
                    obj = c;
                    fs7Var = fs7Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fs7Var = krkVar.k;
                    xdrVar = krkVar.j;
                    qgg.h0(obj);
                }
                erk erkVar = new erk(fs7Var, (Long) obj);
                xdrVar.getClass();
                xdrVar.m(null, erkVar);
                rjqVar.g();
                return Unit.a;
            }
        }
        krkVar = new krk(this, continuation);
        Object obj2 = krkVar.l;
        nm6 nm6Var2 = nm6.a;
        i = krkVar.n;
        if (i != 0) {
        }
        erk erkVar2 = new erk(fs7Var, (Long) obj2);
        xdrVar.getClass();
        xdrVar.m(null, erkVar2);
        rjqVar.g();
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Continuation continuation) {
        l9k l9kVar;
        int i;
        Object o;
        Throwable a;
        if (continuation instanceof l9k) {
            l9kVar = (l9k) continuation;
            int i2 = l9kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l9kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = l9kVar.j;
                nm6 nm6Var = nm6.a;
                i = l9kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(4, "PassportNotificationApiImpl", "call passport.onNewPushToken", null);
                    g gVar = ((n9k) this.b).a;
                    v2 v2Var = v2.a;
                    l9kVar.l = 1;
                    o = gVar.o(v2Var, l9kVar);
                    if (o == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    o = ((z7o) obj).a;
                }
                a = z7o.a(o);
                if (a != null) {
                    ssg.a(6, "PassportNotificationApiImpl", "Passport error during notification token refresh", a);
                }
                return Unit.a;
            }
        }
        l9kVar = new l9k(this, continuation);
        Object obj2 = l9kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = l9kVar.l;
        if (i != 0) {
        }
        a = z7o.a(o);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(boolean z, Continuation continuation) {
        z5j z5jVar;
        int i;
        fmi fmiVar;
        NfcAdapter nfcAdapter;
        if (continuation instanceof z5j) {
            z5jVar = (z5j) continuation;
            int i2 = z5jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z5jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = z5jVar.l;
                nm6 nm6Var = nm6.a;
                i = z5jVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr xdrVar = ((b6j) this.b).b;
                    f6j f6jVar = z ? f6j.b : f6j.a;
                    z5jVar.j = this;
                    z5jVar.k = z;
                    z5jVar.n = 1;
                    xdrVar.getClass();
                    xdrVar.m(null, f6jVar);
                    if (Unit.a == nm6Var) {
                        return nm6Var;
                    }
                    fmiVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = z5jVar.k;
                    fmiVar = z5jVar.j;
                    qgg.h0(obj);
                }
                if (z) {
                    g0c eventReporter = ((b6j) fmiVar.b).a.getEventReporter();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    vtm k = su4.k("NFC выключен", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = up6.z(1) + ci0Var.a;
                    k.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j = su4.j(k, "event_name", "nfc_turned_off", "nfc_turned_off", k);
                    x60 x60Var = (x60) eventReporter;
                    x60Var.getClass();
                    x60Var.a(j);
                    g0c eventReporter2 = ((b6j) fmiVar.b).a.getEventReporter();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    vtm k2 = su4.k("NFC невидимый", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
                    ci0Var.a = up6.z(1) + ci0Var.a;
                    k2.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j2 = su4.j(k2, "event_name", "nfc_invisible", "nfc_invisible", k2);
                    x60 x60Var2 = (x60) eventReporter2;
                    x60Var2.getClass();
                    x60Var2.a(j2);
                } else {
                    g0c eventReporter3 = ((b6j) fmiVar.b).a.getEventReporter();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    r1f r1fVar2 = r1f.a;
                    vtm k3 = su4.k("NFC включен", linkedHashMap3, DeviceService.KEY_DESC, linkedHashMap3);
                    ci0 ci0Var2 = qjb.a;
                    ci0Var2.a = up6.z(1) + ci0Var2.a;
                    k3.u(qee.n() + ci0Var2.a, "eventus_id");
                    qne j3 = su4.j(k3, "event_name", "nfc_turned_on", "nfc_turned_on", k3);
                    x60 x60Var3 = (x60) eventReporter3;
                    x60Var3.getClass();
                    x60Var3.a(j3);
                    g0c eventReporter4 = ((b6j) fmiVar.b).a.getEventReporter();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    vtm k4 = su4.k("NFC видимый", linkedHashMap4, DeviceService.KEY_DESC, linkedHashMap4);
                    ci0Var2.a = up6.z(1) + ci0Var2.a;
                    k4.u(qee.n() + ci0Var2.a, "eventus_id");
                    qne j4 = su4.j(k4, "event_name", "nfc_visible", "nfc_visible", k4);
                    x60 x60Var4 = (x60) eventReporter4;
                    x60Var4.getClass();
                    x60Var4.a(j4);
                }
                if (z) {
                    b6j b6jVar = (b6j) fmiVar.b;
                    if (b6jVar.e && (nfcAdapter = b6jVar.f) != null) {
                        nfcAdapter.enableReaderMode(b6jVar.d, b6jVar.k, 131, cxb.J());
                    }
                }
                return Unit.a;
            }
        }
        z5jVar = new z5j(this, continuation);
        Object obj2 = z5jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = z5jVar.n;
        if (i != 0) {
        }
        if (z) {
        }
        if (z) {
        }
        return Unit.a;
    }
}
