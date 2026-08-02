package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.PlusHomeSdkImpl$exportMetricaSessionListener$1;
import com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector;
import com.yandex.plus.home.plaque.feature.internal.b;
import com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultLifecycleVisibilityDetector;
import com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultPlaqueViewAttachDetector;
import com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultVisibleWhenAttachedVisibilityDetector;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.plaque.PlaqueView;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.pse;
import defpackage.tje;
import defpackage.zrd0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.plus.sdk.badge.widget.a;

/* loaded from: classes9.dex */
public final class zrd0 {
    public final c0 a;
    public final n5c b;
    public final alc0 c;
    public final q2c d;
    public final u2d0 e;
    public final a f;
    public final lb7 g;
    public final tt2 h;
    public final x1f0 i;
    public final slq0 j;
    public ike k;
    public final exf0 l;
    public final va90 m;
    public final PlaqueView n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, yrd0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, wrd0] */
    public zrd0(ViewGroup viewGroup, z3d0 z3d0Var, c0 c0Var, n5c n5cVar, alc0 alc0Var, q2c q2cVar, u2d0 u2d0Var, a aVar, lb7 lb7Var, tt2 tt2Var, x1f0 x1f0Var, slq0 slq0Var) {
        exf0 plugin;
        this.a = c0Var;
        this.b = n5cVar;
        this.c = alc0Var;
        this.d = q2cVar;
        this.e = u2d0Var;
        this.f = aVar;
        this.g = lb7Var;
        this.h = tt2Var;
        this.i = x1f0Var;
        this.j = slq0Var;
        t3d0 t3d0Var = (t3d0) z3d0Var;
        synchronized (t3d0Var) {
            plugin = t3d0Var.getPlugin();
        }
        if (plugin == null) {
            xfo.g(qv10.m(exf0.class, "Plugin ", " is absent! You must install plugin before using it!"));
            throw null;
        }
        this.l = plugin;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        b bVar = (b) plugin.a.getValue();
        PlaqueViewVisibilityDetector defaultLifecycleVisibilityDetector = ref$BooleanRef.element ? new DefaultLifecycleVisibilityDetector(null, 0.0f, null, 7, null) : new DefaultVisibleWhenAttachedVisibilityDetector();
        DefaultPlaqueViewAttachDetector defaultPlaqueViewAttachDetector = new DefaultPlaqueViewAttachDetector();
        xyj xyjVar = bVar.h;
        lqc0 lqc0Var = bVar.b;
        pgz pgzVar = bVar.f;
        LogPriority logPriority = LogPriority.INFO;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueFeatureImpl", "createPlaqueComponent()");
        }
        bVar.b(false);
        PlusHomeSdkImpl$exportMetricaSessionListener$1 plusHomeSdkImpl$exportMetricaSessionListener$1 = bVar.a;
        com.yandex.plus.home.plaque.feature.internal.domain.observable.a aVar2 = bVar.j;
        kjz kjzVar = new kjz(22, bVar.c, pgzVar);
        ((wyj) xyjVar).getClass();
        sjh sjhVar = wyj.f;
        com.yandex.plus.home.plaque.feature.internal.domain.interactors.a aVar3 = new com.yandex.plus.home.plaque.feature.internal.domain.interactors.a(lqc0Var, sjhVar);
        gkc0 gkc0Var = new gkc0(pgzVar);
        com.yandex.plus.home.plaque.feature.internal.domain.interactors.b bVar2 = new com.yandex.plus.home.plaque.feature.internal.domain.interactors.b(lqc0Var, sjhVar);
        yo40 yo40Var = bVar.d;
        o370 o370Var = bVar.e;
        oo2 oo2Var = bVar.i;
        pgz pgzVar2 = bVar.f;
        ike ikeVar = bVar.g;
        xyj xyjVar2 = bVar.h;
        bkc0 bkc0Var = new bkc0(plusHomeSdkImpl$exportMetricaSessionListener$1, aVar2, kjzVar, aVar3, gkc0Var, bVar2, yo40Var, o370Var, defaultLifecycleVisibilityDetector, defaultPlaqueViewAttachDetector, oo2Var, pgzVar2, ikeVar, xyjVar2);
        this.m = new va90(bkc0Var);
        Context context = viewGroup.getContext();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = new yrd0(this);
        ?? wrd0Var = new wrd0(xw31.e(viewGroup, new md3(14, viewGroup)), qmc0.h);
        ref$ObjectRef.element = wrd0Var;
        cxf0 cxf0Var = new cxf0((rhd0) wrd0Var);
        yrd0 yrd0Var = (yrd0) ref$ObjectRef2.element;
        dxf0 dxf0Var = yrd0Var != null ? new dxf0(yrd0Var) : null;
        s59 s59Var = new s59(cxf0Var);
        fy31 s59Var2 = dxf0Var != null ? new s59(dxf0Var) : null;
        i3y i3yVar = bkc0Var.n;
        s59Var2 = s59Var2 == null ? fy31.B4 : s59Var2;
        ((wyj) xyjVar2).getClass();
        com.yandex.plus.home.plaque.feature.internal.presentation.a aVar4 = new com.yandex.plus.home.plaque.feature.internal.presentation.a(context, i3yVar, s59Var, s59Var2, oo2Var, pgzVar2, wyj.d);
        PlaqueView plaqueView = aVar4.f;
        plaqueView.addOnAttachStateChangeListener(plusHomeSdkImpl$exportMetricaSessionListener$1);
        plaqueView.addOnAttachStateChangeListener(defaultLifecycleVisibilityDetector);
        plaqueView.addOnAttachStateChangeListener(defaultPlaqueViewAttachDetector);
        PlaqueView plaqueView2 = aVar4.f;
        this.n = plaqueView2;
        plaqueView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.plus.sdk.micro_widget.websdk.PlusWebSdkPlaqueViewAdapterImpl$onStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                zrd0.this.k = bvf0.M(bvf0.b(), new pse("PlusWebSdkPlaqueViewAdapterImpl"));
                zrd0 zrd0Var = zrd0.this;
                ike ikeVar2 = zrd0Var.k;
                if (ikeVar2 != null) {
                    tje.N(ikeVar2, null, null, new PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1(zrd0Var, null), 3);
                }
                zrd0 zrd0Var2 = zrd0.this;
                ike ikeVar3 = zrd0Var2.k;
                if (ikeVar3 != null) {
                    tje.N(ikeVar3, null, null, new PlusWebSdkPlaqueViewAdapterImpl$subscribeOnContextChanges$1(zrd0Var2, null), 3);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                ike ikeVar2 = zrd0.this.k;
                if (ikeVar2 != null) {
                    bvf0.j(ikeVar2, null);
                }
                zrd0.this.k = null;
            }
        });
    }
}
