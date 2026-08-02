package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.t;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.passport.internal.impl.q0;
import com.yandex.pulse.metrics.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final class lot implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lot(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(j1g j1gVar, Continuation continuation) {
        fqw fqwVar;
        Object obj;
        int i;
        gqw gqwVar = (gqw) this.b;
        if (continuation instanceof fqw) {
            fqwVar = (fqw) continuation;
            int i2 = fqwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fqwVar.l = i2 - Integer.MIN_VALUE;
                obj = fqwVar.j;
                nm6 nm6Var = nm6.a;
                i = fqwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = j1gVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        ecw ecwVar = (ecw) gqwVar.e.getValue();
                        bbq bbqVar = gqwVar.f.b;
                        fqwVar.l = 1;
                        obj = ecwVar.a.invoke(bbqVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    gqwVar.g();
                }
                return Unit.a;
            }
        }
        fqwVar = new fqw(this, continuation);
        obj = fqwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fqwVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d9, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.Throwable] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        q0 q0Var;
        ?? r16;
        Object obj2;
        int i = this.a;
        int i2 = 0;
        Continuation continuation2 = null;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Object a = uzc.a((uzc) obj3, continuation);
                return a == nm6.a ? a : Unit.a;
            case 1:
                ((m5) ((lum) obj3).a).invoke((yxc) obj);
                return Unit.a;
            case 2:
                ((nst) obj3).b.a();
                return Unit.a;
            case 3:
                xxq xxqVar = (xxq) obj;
                bjt bjtVar = (bjt) obj3;
                v3w.l("switch db to user with id=", xxqVar.a, 4, null, null);
                cst cstVar = (cst) bjtVar.a;
                String str = xxqVar.a;
                str.getClass();
                x97.y(cmd.a, dm6.a, null, new n6p(cstVar, str, continuation2, 19), 2);
                Object V = x97.V(dm6.b, new n6p(xxqVar, bjtVar, continuation2, 20), continuation);
                nm6 nm6Var = nm6.a;
                if (V != nm6Var) {
                    V = Unit.a;
                }
                return V == nm6Var ? V : Unit.a;
            case 4:
                if (Intrinsics.d((u6m) obj, r6m.a)) {
                    ssg.a(4, "VideoClipActivity", "Device status is not registered", null);
                    ((VideoClipActivity) obj3).finish();
                }
                return Unit.a;
            case 5:
                ((k3u) obj3).G();
                return Unit.a;
            case 6:
                c5u c5uVar = (c5u) obj3;
                c5uVar.g.l(null);
                String str2 = ((xxq) obj).a;
                str2.getClass();
                Object b = c5u.b(c5uVar, str2, continuation);
                return b == nm6.a ? b : Unit.a;
            case 7:
                t requireActivity = ((l8u) obj3).requireActivity();
                requireActivity.getClass();
                ((Function1) obj).invoke(requireActivity);
                return Unit.a;
            case 8:
                qju qjuVar = (qju) obj3;
                hn5 hn5Var = qjuVar.e;
                if (hn5Var == null) {
                    return Unit.a;
                }
                WeakReference weakReference = (WeakReference) qjuVar.f.get(qju.a(hn5Var));
                if (weakReference == null || (q0Var = (q0) weakReference.get()) == null) {
                    return Unit.a;
                }
                ssg.a(3, "VpnGateActivityCallbacks", "onNetworkModeChanged try call showVpnBlockerIfNeeded", null);
                x97.y(wyf.F(hn5Var.getLifecycle()), null, null, new nju(q0Var, null, 0), 3);
                return Unit.a;
            case 9:
                ((Boolean) obj).getClass();
                ssg.a(3, "VpnGateWatcher", "VpnChallengeActivity shown", null);
                bku bkuVar = (bku) obj3;
                bkuVar.d.invoke();
                if (((Boolean) bkuVar.a.invoke()).booleanValue()) {
                    ssg.a(3, "VpnGateWatcher", "VpnChallengeActivity shown, pause playback", null);
                    bkuVar.c.a(PauseCommand.INSTANCE, a3t.a);
                }
                return Unit.a;
            case 10:
                if (((tre) obj) instanceof sqm) {
                    ((View) obj3).performHapticFeedback(6);
                }
                return Unit.a;
            case 11:
                wjb wjbVar = (wjb) obj;
                if (wjbVar != null) {
                    atn atnVar = ((fqu) obj3).p;
                    atnVar.getClass();
                    atnVar.S(wjbVar).b().e();
                }
                return Unit.a;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = ((suu) obj3).d;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                xdr xdrVar2 = ((ivu) obj3).b;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                return Unit.a;
            case 14:
                ((cyu) obj3).d.l((xxu) obj);
                return Unit.a;
            case 15:
                m2v m2vVar = (m2v) obj;
                ((w6g) obj3).a(m2vVar.a, m2vVar.c, m2vVar.b, m2vVar.d);
                return Unit.a;
            case 16:
                gdv gdvVar = (gdv) obj;
                WebView webView = (WebView) obj3;
                if (gdvVar instanceof fdv) {
                    webView.reload();
                } else {
                    if (!(gdvVar instanceof edv)) {
                        b6e.s();
                        return null;
                    }
                    edv edvVar = (edv) gdvVar;
                    webView.loadUrl(edvVar.a, edvVar.b);
                }
                return Unit.a;
            case 17:
                if (bfv.a[((vev) obj).ordinal()] != 1) {
                    b6e.s();
                    return null;
                }
                t l = ((dfv) obj3).l();
                if (l != null) {
                    l.finish();
                }
                return Unit.a;
            case 18:
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(Boolean.FALSE);
                }
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                for (Object obj4 : vnv.q) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ?? r162 = continuation2;
                        u75.n();
                        throw r162;
                    }
                    f9f f9fVar = (f9f) obj4;
                    if (i4 < 5) {
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        int i6 = i2;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    ?? r163 = continuation2;
                                    u75.n();
                                    throw r163;
                                }
                                wnv wnvVar = (wnv) next;
                                if (((Boolean) arrayList.get(i6)).booleanValue()) {
                                    r16 = continuation2;
                                } else {
                                    r16 = continuation2;
                                    if (ern.a(wnvVar.b.getClass()).equals(f9fVar)) {
                                        arrayList2.add(wnvVar);
                                        arrayList.set(i6, Boolean.TRUE);
                                    }
                                }
                                arrayList3.add(Unit.a);
                                continuation2 = r16;
                                i6 = i7;
                            } else {
                                r16 = continuation2;
                                f9f f9fVar2 = (f9f) vnv.r.get(i4);
                                ArrayList arrayList4 = new ArrayList(v75.o(list2, 10));
                                Iterator it2 = list2.iterator();
                                int i8 = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        int i9 = i8 + 1;
                                        if (i8 < 0) {
                                            u75.n();
                                            throw r16;
                                        }
                                        wnv wnvVar2 = (wnv) next2;
                                        if (((Boolean) arrayList.get(i8)).booleanValue() || !ern.a(wnvVar2.b.getClass()).equals(f9fVar2)) {
                                            arrayList4.add(Unit.a);
                                            i8 = i9;
                                        } else {
                                            arrayList2.add(wnvVar2);
                                            arrayList.set(i8, Boolean.TRUE);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        r16 = continuation2;
                    }
                    i4 = i5;
                    continuation2 = r16;
                    i2 = 0;
                }
                xdr xdrVar3 = ((vnv) obj3).p;
                xnv xnvVar = new xnv(arrayList2);
                xdrVar3.getClass();
                xdrVar3.m(continuation2, xnvVar);
                return Unit.a;
            case 19:
                ((iei) obj3).a.h(((Number) obj).floatValue());
                return Unit.a;
            case 20:
                v0w v0wVar = (v0w) obj3;
                int ordinal = ((q0w) obj).ordinal();
                if (ordinal == 0) {
                    v0wVar.D(R.string.wizard_saved_preferences);
                    ((l1w) v0wVar.m.getValue()).Y();
                } else if (ordinal == 1) {
                    cvo cvoVar = cvo.i;
                    fxf.O(v0wVar, o6m.b(wjb.WizardSkipScreen, null, 6), null, jf0.C(pd.t(new qzm[0]), ru0.DARK), null, new wn5(new t31(27, v0wVar), 984945605, true), 22);
                } else if (ordinal == 2) {
                    t l2 = v0wVar.l();
                    if (l2 != null) {
                        l2.finish();
                    }
                } else if (ordinal == 3) {
                    v0wVar.D(R.string.check_internet_connection);
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    v0wVar.D(R.string.error_unknown);
                }
                return Unit.a;
            case 21:
                List a2 = ((s2w) obj).a();
                boolean isEmpty = a2.isEmpty();
                xdr xdrVar4 = ((y1w) obj3).e;
                if (isEmpty) {
                    xdrVar4.getClass();
                    xdrVar4.m(null, d2w.a);
                } else if (xdrVar4.getValue() instanceof d2w) {
                    LinkedHashSet<Pair> linkedHashSet = new LinkedHashSet();
                    int i10 = 1;
                    int i11 = 0;
                    int i12 = 0;
                    while (linkedHashSet.size() <= 25) {
                        for (int i13 = 0; i13 < i10; i13++) {
                            linkedHashSet.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i12)));
                            int i14 = i10 % 2;
                            i12 = i14 + ((((i14 ^ 2) & ((-i14) | i14)) >> 31) & 2) == 1 ? i12 - 1 : i12 + 1;
                        }
                        for (int i15 = 0; i15 < i10; i15++) {
                            linkedHashSet.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i12)));
                            int i16 = i10 % 2;
                            i11 = i16 + ((((i16 ^ 2) & ((-i16) | i16)) >> 31) & 2) == 1 ? i11 + 1 : i11 - 1;
                        }
                        i10++;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Pair pair : linkedHashSet) {
                        int intValue = ((Number) pair.a).intValue();
                        int intValue2 = ((Number) pair.b).intValue();
                        Iterator it3 = a2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                wrv wrvVar = ((yrv) obj2).b;
                                if (wrvVar.a != intValue || wrvVar.b != intValue2) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        yrv yrvVar = (yrv) obj2;
                        if (yrvVar != null) {
                            arrayList5.add(yrvVar);
                        }
                    }
                    List q0 = CollectionsKt.q0(arrayList5, 25);
                    q0.getClass();
                    List<yrv> list3 = q0;
                    ArrayList arrayList6 = new ArrayList(v75.o(list3, 10));
                    for (yrv yrvVar2 : list3) {
                        String str3 = yrvVar2.a;
                        String str4 = yrvVar2.c;
                        CoverPath coverPath = yrvVar2.d;
                        String w = coverPath != null ? vz1.w(coverPath) : null;
                        if (w == null) {
                            w = "";
                        }
                        arrayList6.add(new x1w(str3, str4, w, yrvVar2, false));
                    }
                    ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(new u1w((x1w) it4.next()));
                    }
                    c2w c2wVar = new c2w(arrayList7);
                    xdrVar4.getClass();
                    xdrVar4.m(null, c2wVar);
                }
                return Unit.a;
            case 22:
                boolean z = !((Boolean) obj).booleanValue();
                acg acgVar = ((nbg) obj3).a;
                if (acgVar.z.c != z) {
                    acgVar.i(z);
                }
                return Unit.a;
            case 23:
                if (((d1) obj) != null) {
                    Iterator it5 = ((CopyOnWriteArraySet) ((rdk) obj3).f).iterator();
                    if (it5.hasNext()) {
                        throw hrg.j(it5);
                    }
                }
                return Unit.a;
            case 24:
                ((AtomicBoolean) obj3).set(false);
                return Unit.a;
            case 25:
                fgw fgwVar = (fgw) obj;
                Object a3 = hgw.a((hgw) obj3, fgwVar.a, fgwVar.c, fgwVar.b, continuation);
                return a3 == nm6.a ? a3 : Unit.a;
            case 26:
                long longValue = ((Number) obj).longValue();
                xdr xdrVar5 = ((rmw) obj3).e;
                qmw qmwVar = (qmw) xdrVar5.getValue();
                xdrVar5.m(null, qmw.b(qmwVar, Long.valueOf(qmwVar.a + ((long) (longValue * qmwVar.c.a))), null, 6));
                return Unit.a;
            case 27:
                hqw hqwVar = (hqw) obj;
                wpw wpwVar = (wpw) obj3;
                hqw b2 = wpwVar.b();
                if (b2 != null) {
                    b2.d();
                }
                wpwVar.j.setValue(wpwVar, wpw.l[0], hqwVar);
                hqw b3 = wpwVar.b();
                if (b3 != null) {
                    b3.c(new vpw(wpwVar.f, i2));
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                vat vatVar = (vat) obj;
                aqw aqwVar = (aqw) obj3;
                um6 um6Var = aqwVar.i;
                j1g j1gVar = (j1g) vatVar.a;
                daq daqVar = (daq) vatVar.b;
                StationId stationId = (StationId) vatVar.c;
                int ordinal2 = j1gVar.ordinal();
                if (ordinal2 == 0) {
                    x97.y(um6Var, null, null, new ocu(aqwVar, stationId, e4d.LIKE, daqVar.e.a, (Continuation) null, 15), 3);
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                    x97.y(um6Var, null, null, new ocu(aqwVar, stationId, e4d.DISLIKE, daqVar.e.a, (Continuation) null, 15), 3);
                }
                return Unit.a;
            default:
                return b((j1g) obj, continuation);
        }
    }
}
