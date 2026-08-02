package ru.yandex.taxi.map_common;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapLoadStatistics;
import com.yandex.mapkit.map.MapLoadedListener;
import defpackage.ah00;
import defpackage.el00;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hcs;
import defpackage.ics;
import defpackage.jst;
import defpackage.kf00;
import defpackage.lx4;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rwx0;
import defpackage.swx0;
import defpackage.t300;
import defpackage.tje;
import defpackage.tse;
import defpackage.ybs;
import defpackage.yl00;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.map_common.c;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.e;
import ru.yandex.taxi.ui.FragmentBackground;

/* loaded from: classes9.dex */
public final class c implements rwx0 {
    public final ViewStub a;
    public final h3y b;
    public final yl00 c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public final Lifecycle i;
    public final tse j;
    public final Activity k;
    public final h3y l;
    public final h3y m;
    public final lx4 n;
    public final el00 o;
    public final ru.yandex.taxi.map_common.map.experiment.b p;
    public final swx0 q = new MapLoadedListener() { // from class: swx0
        @Override // com.yandex.mapkit.map.MapLoadedListener
        public final void onMapLoaded(MapLoadStatistics mapLoadStatistics) {
            yl00 yl00Var = c.this.c;
            yl00Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            kf00 kf00Var = yl00Var.a;
            long fullyLoaded = mapLoadStatistics.getFullyLoaded();
            HashMap A = oyr.A(kf00Var);
            A.put(RemoteBioParameters.TIME, Long.valueOf(elapsedRealtime));
            A.put("mapkit_loaded", Long.valueOf(fullyLoaded));
            kf00Var.a.a("Map.LoadingFinished", A, 1, new HashMap());
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [swx0] */
    public c(ViewStub viewStub, h3y h3yVar, yl00 yl00Var, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, Lifecycle lifecycle, tse tseVar, Activity activity, h3y h3yVar7, h3y h3yVar8, lx4 lx4Var, el00 el00Var, ru.yandex.taxi.map_common.map.experiment.b bVar) {
        this.a = viewStub;
        this.b = h3yVar;
        this.c = yl00Var;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = h3yVar4;
        this.g = h3yVar5;
        this.h = h3yVar6;
        this.i = lifecycle;
        this.j = tseVar;
        this.k = activity;
        this.l = h3yVar7;
        this.m = h3yVar8;
        this.n = lx4Var;
        this.o = el00Var;
        this.p = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, TaxiMapView taxiMapView, ContinuationImpl continuationImpl) {
        TaxiMapViewInitializerListener$configureMapModelsOptimization$1 taxiMapViewInitializerListener$configureMapModelsOptimization$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof TaxiMapViewInitializerListener$configureMapModelsOptimization$1) {
            taxiMapViewInitializerListener$configureMapModelsOptimization$1 = (TaxiMapViewInitializerListener$configureMapModelsOptimization$1) continuationImpl;
            int i2 = taxiMapViewInitializerListener$configureMapModelsOptimization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiMapViewInitializerListener$configureMapModelsOptimization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiMapViewInitializerListener$configureMapModelsOptimization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiMapViewInitializerListener$configureMapModelsOptimization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.map_common.map.experiment.b bVar = cVar.p;
                    taxiMapViewInitializerListener$configureMapModelsOptimization$1.L$0 = taxiMapView;
                    taxiMapViewInitializerListener$configureMapModelsOptimization$1.label = 1;
                    obj = bVar.a(taxiMapViewInitializerListener$configureMapModelsOptimization$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    taxiMapView = (TaxiMapView) taxiMapViewInitializerListener$configureMapModelsOptimization$1.L$0;
                    kotlin.b.b(obj);
                }
                taxiMapView.getMapWindow().getMap().setModelsEnabled(((Boolean) obj).booleanValue());
                return zy11.a;
            }
        }
        taxiMapViewInitializerListener$configureMapModelsOptimization$1 = new TaxiMapViewInitializerListener$configureMapModelsOptimization$1(cVar, continuationImpl);
        Object obj2 = taxiMapViewInitializerListener$configureMapModelsOptimization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiMapViewInitializerListener$configureMapModelsOptimization$1.label;
        if (i != 0) {
        }
        taxiMapView.getMapWindow().getMap().setModelsEnabled(((Boolean) obj2).booleanValue());
        return zy11.a;
    }

    @Override // defpackage.rwx0
    public final void a(TaxiMapView taxiMapView) {
        ru.yandex.taxi.design.utils.c.w(this.a, taxiMapView);
        taxiMapView.setDebugFocusEnabled(false, false);
        h3y h3yVar = this.g;
        gh00 gh00Var = (gh00) h3yVar.get();
        gh00Var.getClass();
        taxiMapView.attachController(new e(gh00Var), this.o);
        yl00 yl00Var = this.c;
        yl00Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kf00 kf00Var = yl00Var.a;
        HashMap A = oyr.A(kf00Var);
        A.put(RemoteBioParameters.TIME, Long.valueOf(elapsedRealtime));
        kf00Var.a.a("Map.LoadingStarted", A, 1, new HashMap());
        t300 t300Var = ((gh00) h3yVar.get()).f;
        Map map = (Map) t300Var.c;
        if (map != null) {
            map.setMapLoadedListener(this.q);
        }
        if (((Map) t300Var.c) == null) {
            jst.e.q("Map is null on add MapLoadedListener");
        }
        ((ru.yandex.taxi.map_common.style.a) this.d.get()).a((ah00) h3yVar.get());
        com.yandex.go.pin.api.a aVar = (com.yandex.go.pin.api.a) this.f.get();
        View view = (View) this.b.get();
        h3y h3yVar2 = this.e;
        aVar.e(view, ((ru.yandex.taxi.viewholder.b) h3yVar2.get()).c(), (ah00) h3yVar.get());
        ru.yandex.taxi.viewholder.b bVar = (ru.yandex.taxi.viewholder.b) h3yVar2.get();
        ybs ybsVar = FragmentBackground.Companion;
        Fragment a = ((ics) ((hcs) this.h.get())).a();
        ybsVar.getClass();
        bVar.i(taxiMapView, ybs.a(a));
        TaxiMapViewInitializerListener$onInitialized$1 taxiMapViewInitializerListener$onInitialized$1 = new TaxiMapViewInitializerListener$onInitialized$1(this, taxiMapView, null);
        tse tseVar = this.j;
        tje.N(tseVar, null, null, taxiMapViewInitializerListener$onInitialized$1, 3);
        tje.N(tseVar, null, null, new TaxiMapViewInitializerListener$onInitialized$2(this, null), 3);
        tje.N(tseVar, null, null, new TaxiMapViewInitializerListener$onInitialized$3(this, null), 3);
    }
}
