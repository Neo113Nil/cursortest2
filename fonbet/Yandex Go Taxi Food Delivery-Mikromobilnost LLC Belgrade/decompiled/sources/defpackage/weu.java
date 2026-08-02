package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.plus.home.benchmark.BenchmarkState;
import com.yandex.plus.home.plaque.feature.internal.presentation.d;
import io.appmetrica.analytics.IReporterYandex;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.sync.a;
import kotlinx.datetime.internal.format.c;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.messenger.e;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.settings.activity.MenuButtonAttachStateChangeListener;

/* loaded from: classes.dex */
public final /* synthetic */ class weu implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ weu(a aVar, h050 h050Var) {
        this.a = 13;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
    
        if (r11.a.c == com.yandex.go.payments.api.model.PaymentsScreen.TRANSPORT_SUMMARY) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f9, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f6, code lost:
    
        if (r4.d() == false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List W;
        zy11 onViewAttachedToWindow$lambda$1;
        boolean onAttachedToWindow$lambda$1;
        g4u0 g4u0Var;
        String str;
        Double i;
        int i2 = this.a;
        boolean z = false;
        int i3 = 2;
        int i4 = 1;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                xeu xeuVar = (xeu) obj3;
                ez40 ez40Var = (ez40) obj;
                kme0 kme0Var = xeu.c;
                long j = 0;
                for (Map.Entry entry : ez40Var.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        kme0 kme0Var2 = (kme0) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String b = xeuVar.b(System.currentTimeMillis());
                        if (set.contains(b)) {
                            ez40Var.g(kme0Var2, nzs.f(b));
                            j++;
                        } else {
                            ez40Var.f(kme0Var2);
                        }
                    }
                }
                if (j == 0) {
                    ez40Var.f(kme0Var);
                } else {
                    ez40Var.g(kme0Var, Long.valueOf(j));
                }
                return null;
            case 1:
                mdd0 mdd0Var = (mdd0) obj3;
                String[] strArr = {"Authorization", "X-OAuth-Token"};
                W = evu0.W((String) obj, new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : W) {
                    String str2 = (String) obj4;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 2) {
                            arrayList.add(obj4);
                        } else {
                            if (cvu0.x(str2, strArr[i5], false)) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
                mdd0.c(mdd0Var, gt90.a, kotlin.collections.a.X(arrayList, "\n", null, null, null, 62));
                return zy11.a;
            case 2:
                return Collections.singletonList(new androidx.datastore.migrations.a((Context) obj, ((com.google.firebase.datastorage.a) obj3).a, androidx.datastore.preferences.a.b(androidx.datastore.preferences.a.a), androidx.datastore.preferences.a.a()));
            case 3:
                fyc fycVar = ((com.yandex.go.sdk.a) obj3).e;
                zy11 zy11Var = zy11.a;
                fycVar.T(zy11Var);
                return zy11Var;
            case 4:
                ((w300) obj3).b.b((Intent) obj);
                return zy11.a;
            case 5:
                xw31.E(((o500) obj3).b, null, Integer.valueOf(((t1w) obj).b), null, null);
                return Boolean.FALSE;
            case 6:
                ym00 ym00Var = (ym00) obj;
                int e = (int) (ym91.e(ym00Var.g()) - ym00Var.b());
                ro00 ro00Var = ro00.d;
                return vuz.t(sd90.a(((v35) ym00Var).h()), ym00Var.g(), ym00Var.f(), ((bn00) obj3).a.getZoom(), ym00Var.e(), e, e, e, e);
            case 7:
                onViewAttachedToWindow$lambda$1 = MenuButtonAttachStateChangeListener.onViewAttachedToWindow$lambda$1((MenuButtonAttachStateChangeListener) obj3, (String) obj);
                return onViewAttachedToWindow$lambda$1;
            case 8:
                ((xqi0) ((p8g) ((v320) obj)).v.get()).f((wl3) obj3);
                return zy11.a;
            case 9:
                m420 m420Var = (m420) obj3;
                Activity activity = (Activity) obj;
                m420Var.getClass();
                return new ru.yandex.taxi.messenger.delegate.a(activity instanceof zyq ? ((zyq) activity).createDefaultFileChooserHandler() : null, m420Var);
            case 10:
                e eVar = (e) obj3;
                nfm nfmVar = new nfm(1, (tls) obj);
                ((j) eVar.e).m.n.add(nfmVar);
                return new iy2(21, eVar, nfmVar);
            case 11:
                return new wa20((IReporterYandex) obj, (k95) ((com.yandex.plus.metrica.utils.e) obj3).g.getValue());
            case 12:
                return new androidx.datastore.core.j(((tse) obj3).getCoroutineContext(), (File) obj);
            case 13:
                ((a) obj3).d(null);
                return zy11.a;
            case 14:
                ru.yandex.taxi.settings.main.j jVar = (ru.yandex.taxi.settings.main.j) obj3;
                jVar.a.removeCallbacks(jVar.p);
                return zy11.a;
            case 15:
                return (kg90) ((k2m) obj3).a(b.f(), (InputStream) obj);
            case 16:
                onAttachedToWindow$lambda$1 = NotificationStackComponent.onAttachedToWindow$lambda$1((NotificationStackComponent) obj3, (t1w) obj);
                return Boolean.valueOf(onAttachedToWindow$lambda$1);
            case 17:
                Iterator it = ((c) obj3).c.iterator();
                while (it.hasNext()) {
                    zf70 zf70Var = (zf70) it.next();
                    zf70Var.a.a(obj, zf70Var.b);
                }
                return zy11.a;
            case 18:
                return new exg(i4, (jc60) obj3);
            case 19:
                ru.yandex.taxi.design.utils.a aVar = (ru.yandex.taxi.design.utils.a) obj3;
                synchronized (aVar.d) {
                    i321 i321Var = aVar.d;
                    Object obj5 = i321Var.c;
                    if (obj5 != null) {
                        i321Var.b.invoke(obj5);
                        i321Var.c = null;
                    }
                }
                synchronized (aVar.e) {
                    i321 i321Var2 = aVar.e;
                    Object obj6 = i321Var2.c;
                    if (obj6 != null) {
                        i321Var2.b.invoke(obj6);
                        i321Var2.c = null;
                    }
                }
                return zy11.a;
            case 20:
                ((acx) obj).n = (kf5) obj3;
                return zy11.a;
            case 21:
                i iVar = (i) obj3;
                u0k u0kVar = ((nea0) obj).a;
                if (u0kVar instanceof na0) {
                    break;
                } else if (u0kVar instanceof wxc) {
                    wxc wxcVar = (wxc) u0kVar;
                    Iterator it2 = iVar.i.a().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (jl40.l(((evz) next).getId(), wxcVar.a)) {
                                obj2 = next;
                            }
                        }
                    }
                    evz evzVar = (evz) obj2;
                    if (evzVar != null) {
                        break;
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                dlw0 dlw0Var = ((p) obj3).c;
                List<clw0> list = (List) dlw0Var.c.computeIfAbsent((ExperimentSource) obj, new dxd(11, new ate0(24, dlw0Var)));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (clw0 clw0Var : list) {
                    String str3 = clw0Var.a;
                    if (!clw0Var.d) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        linkedHashSet.add(str3);
                    }
                }
                return linkedHashSet;
            case 23:
                ((com.yandex.go.pin.api.v2.c) obj3).i.updatePosition((PinV2Component.Position) obj, true);
                return zy11.a;
            case 24:
                Triple triple = (Triple) obj;
                phc0 phc0Var = (phc0) triple.getSecond();
                rhc0 rhc0Var = (rhc0) triple.getThird();
                oo2 oo2Var = ((d) obj3).f;
                roc0 b2 = phc0Var != null ? phc0Var.b() : rhc0Var.a;
                oo2Var.getClass();
                int i6 = dva0.a[b2.d.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    ReentrantLock reentrantLock = (ReentrantLock) oo2Var.x;
                    reentrantLock.lock();
                    try {
                        jb7 jb7Var = (jb7) oo2Var.w;
                        if (jb7Var != null) {
                            Map e2 = gw00.e(new Pair("plaque_source", b2.e.name()));
                            com.yandex.plus.core.benchmark.b bVar = (com.yandex.plus.core.benchmark.b) jb7Var.b;
                            AtomicReference atomicReference = (AtomicReference) jb7Var.w;
                            BenchmarkState benchmarkState = BenchmarkState.STARTED;
                            BenchmarkState benchmarkState2 = BenchmarkState.COMPLETED;
                            while (true) {
                                if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                                    bVar.c();
                                    ((wls) jb7Var.c).invoke(bVar, e2);
                                } else if (atomicReference.get() != benchmarkState) {
                                }
                            }
                        }
                        oo2Var.w = null;
                        r0 r0Var = (r0) oo2Var.c;
                        Boolean bool = Boolean.FALSE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else if (i6 != 3 && i6 != 4) {
                    w511.b();
                    return null;
                }
                return new Pair(rhc0Var.a, phc0Var != null ? phc0Var.b() : null);
            case 25:
                return new exg(i3, (icc0) obj3);
            case 26:
                ((s0k0) obj).a(new lgx(((fad0) obj3).a.a(), 2));
                return zy11.a;
            case 27:
                ru.yandex.taxi.plus.repository.c cVar = (ru.yandex.taxi.plus.repository.c) obj3;
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof GoApiHttpException) && ((GoApiHttpException) th2).getCode() == 409) {
                    ru.yandex.taxi.plus.sdk.cache.c cVar2 = cVar.a;
                    cVar2.a = null;
                    cVar2.e.l(null);
                }
                return zy11.a;
            case 28:
                ru.yandex.taxi.plus.sdk.di.b bVar2 = (ru.yandex.taxi.plus.sdk.di.b) obj3;
                c5d0 c5d0Var = (c5d0) obj;
                znp0 znp0Var = bVar2.d.a.a;
                if (Math.abs(((znp0Var == null || (g4u0Var = znp0Var.c) == null || (str = g4u0Var.f) == null || (i = avu0.i(str)) == null) ? 0.0d : i.doubleValue()) - (c5d0Var != null ? c5d0Var.a : 0.0d)) >= 0.01d) {
                    bVar2.e.b();
                }
                return zy11.a;
            default:
                final a4e0 a4e0Var = (a4e0) obj3;
                for (final nm40 nm40Var : (Collection) obj) {
                    xm00 xm00Var = a4e0Var.y;
                    float j2 = ((gh00) ((ah00) a4e0Var.b)).j();
                    d0a1.g(a4e0Var.x, nm40Var, j2);
                    final d3e0 a = nm40Var.a();
                    if (a != null) {
                        d0a1.f(xm00Var, a, j2);
                        xm00Var.g(new MapObjectTapListener() { // from class: y3e0
                            @Override // com.yandex.mapkit.map.MapObjectTapListener
                            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                                a4e0.this.Hg(nm40Var, ru.yandex.taxi.map.utils.a.E(a.a, null));
                                return true;
                            }
                        });
                    }
                }
                return zy11.a;
        }
    }

    public /* synthetic */ weu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
