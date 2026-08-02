package ru.yandex.taxi.layers.presentation.optimalview;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.domain.g;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.map.VisibleRegionUtils;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.g700;
import defpackage.gh00;
import defpackage.k200;
import defpackage.kgx;
import defpackage.kq00;
import defpackage.mq00;
import defpackage.nq00;
import defpackage.pzt0;
import defpackage.sme0;
import defpackage.t4e0;
import defpackage.tje;
import defpackage.ump;
import defpackage.w511;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.layers.domain.u;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;
import ru.yandex.taxi.layers.experiments.p;
import ru.yandex.taxi.layers.source.h;
import ru.yandex.taxi.layers.source.j;
import ru.yandex.taxi.layers.source.k;

/* loaded from: classes5.dex */
public final class c extends ad5 {
    public static final /* synthetic */ kgx[] M = {new PropertyReference1Impl("hintShownFor", 0, "getHintShownFor()Ljava/util/Set;", c.class), new PropertyReference1Impl("onboardingZoomDoneFor", 0, "getOnboardingZoomDoneFor()Ljava/util/Set;", c.class)};
    public final g A;
    public final p B;
    public final t4e0 C;
    public boolean D;
    public Mode E;
    public final cne0 F;
    public final sme0 G;
    public final sme0 H;
    public pzt0 I;
    public boolean J;
    public List K;
    public float L;
    public final ah00 x;
    public final k y;
    public final u z;

    public c(dne0 dne0Var, ah00 ah00Var, k kVar, u uVar, g gVar, p pVar, t4e0 t4e0Var) {
        super(mq00.class);
        this.x = ah00Var;
        this.y = kVar;
        this.z = uVar;
        this.A = gVar;
        this.B = pVar;
        this.C = t4e0Var;
        cne0 a = dne0Var.a("ru.yandex.taxi.LAYERS");
        this.F = a;
        this.G = new sme0(1, a, a, "FIRST_USAGE_HINT_SHOWN");
        this.H = new sme0(1, a, a, "KEY_ONBOARDING_ZOOM_DONE");
        this.K = EmptyList.a;
        this.L = 1000.0f;
    }

    public static boolean Mg(Set set, Mode mode) {
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (mode.g((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean Kg(kq00 kq00Var) {
        BoundingBox a;
        gh00 gh00Var = (gh00) this.x;
        float j = gh00Var.j();
        BoundingBox bounds = VisibleRegionUtils.getBounds(gh00Var.e.a());
        List<ump> list = kq00Var.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ump umpVar : list) {
            if (ru.yandex.taxi.layers.source.factory.a.d(umpVar.b, j) && (a = ru.yandex.taxi.map_common.map.k.a(new k200(10, umpVar))) != null && ru.yandex.taxi.map.utils.a.s(a, bounds)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Lg(mq00 mq00Var) {
        c cVar;
        Mode mode;
        Bg(mq00Var);
        Mode mode2 = this.E;
        k kVar = this.y;
        if (mode2 != null && !this.K.isEmpty()) {
            if (!Mg((Set) this.H.getValue(this, M[1]), mode2)) {
                List list = this.K;
                g700 g700Var = new g700(10, this, mode2);
                pzt0 pzt0Var = this.I;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                cVar = this;
                cVar.I = tje.N(Jg(), null, null, new MapObservationPresenter$zoomByObjectTypes$2(cVar, list, true, g700Var, null), 3);
                tje.N(cVar.Jg(), null, null, new MapObservationPresenter$attachView$$inlined$safeCollectIn$2(kVar.a, null, mq00Var, cVar), 3);
                mode = cVar.E;
                if (mode != null) {
                    return;
                }
                tje.N(cVar.Jg(), null, null, new MapObservationPresenter$waitForAnySelection$1(cVar, mode, null), 3);
                return;
            }
        }
        cVar = this;
        tje.N(cVar.Jg(), null, null, new MapObservationPresenter$attachView$$inlined$safeCollectIn$1(e.T(new b(new j(new h(kVar.a, cVar.D)), mode2), 1), null, cVar), 3);
        tje.N(cVar.Jg(), null, null, new MapObservationPresenter$attachView$$inlined$safeCollectIn$2(kVar.a, null, mq00Var, cVar), 3);
        mode = cVar.E;
        if (mode != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ng(String str) {
        List list;
        Mode mode = this.E;
        if (mode == null) {
            return;
        }
        ScreenModeMapProvidersExperiment.b a = this.B.a(str);
        ScreenModeMapProvidersExperiment.d dVar = null;
        if (a != null && (list = a.b) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ScreenModeMapProvidersExperiment.d) next).a == mode) {
                    dVar = next;
                    break;
                }
            }
            dVar = dVar;
        }
        if (dVar != null) {
            ScreenModeMapProvidersExperiment.a aVar = dVar.c;
            this.J = dVar.b == ScreenModeMapProvidersExperiment.ZoomMode.ALWAYS_ZOOM;
            if (nq00.a[aVar.a.ordinal()] != 1) {
                w511.b();
                return;
            }
            this.K = kotlin.collections.a.M(aVar.b);
            this.L = dVar.d != null ? r5.longValue() : 1000.0f;
        }
    }
}
