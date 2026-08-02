package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.a6o0;
import defpackage.ban0;
import defpackage.can0;
import defpackage.dpb;
import defpackage.f9n0;
import defpackage.fva0;
import defpackage.k9n0;
import defpackage.ny61;
import defpackage.o9n0;
import defpackage.q150;
import defpackage.r7p0;
import defpackage.rbo0;
import defpackage.s6k0;
import defpackage.sbo0;
import defpackage.t9h0;
import defpackage.tso0;
import defpackage.w030;
import defpackage.xva0;
import defpackage.xvf0;
import defpackage.yuf0;
import defpackage.yvf0;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes6.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final fva0 G;
    public final yvf0 H;
    public final MapNotificationsMuteRepository I;
    public final yvf0 J;
    public final can0 K;
    public final sbo0 L;
    public final ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a M;

    public a(w030 w030Var, fva0 fva0Var, yvf0 yvf0Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, yvf0 yvf0Var2, can0 can0Var, sbo0 sbo0Var, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a aVar) {
        super(null);
        this.F = w030Var;
        this.G = fva0Var;
        this.H = yvf0Var;
        this.I = mapNotificationsMuteRepository;
        this.J = yvf0Var2;
        this.K = can0Var;
        this.L = sbo0Var;
        this.M = aVar;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        super.G((k9n0) obj);
        this.I.a();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((k9n0) obj);
        j(dpb.a);
        this.I.b();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.ScootersCompletionPhotoRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(k9n0 k9n0Var, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoRouter$provideModalView$1 scootersCompletionPhotoRouter$provideModalView$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        a6o0 a6o0Var;
        ScootersErrorCode scootersErrorCode;
        String m;
        CharSequence charSequence;
        boolean z;
        ScootersVehicleType scootersVehicleType;
        rbo0 rbo0Var;
        r7p0 r7p0Var;
        k9n0 k9n0Var2;
        boolean z2;
        ScootersVehicleType scootersVehicleType2;
        r7p0 r7p0Var2;
        a6o0 a6o0Var2;
        Object a;
        final String str;
        o9n0 o9n0Var;
        ScootersErrorCode scootersErrorCode2;
        tso0 tso0Var;
        can0 can0Var;
        if (continuationImpl instanceof ScootersCompletionPhotoRouter$provideModalView$1) {
            scootersCompletionPhotoRouter$provideModalView$1 = (ScootersCompletionPhotoRouter$provideModalView$1) continuationImpl;
            int i2 = scootersCompletionPhotoRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionPhotoRouter$provideModalView$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoRouter$provideModalView$1.label;
                if (i != 0) {
                    b.b(obj);
                    a6o0Var = k9n0Var.a;
                    scootersErrorCode = k9n0Var.e;
                    m = a6o0Var.a().m();
                    charSequence = k9n0Var.b;
                    boolean z3 = k9n0Var.c;
                    ScootersVehicleType q = a6o0Var.a().q();
                    r7p0 number = a6o0Var.a().getNumber();
                    zzs zzsVar = k9n0Var.d;
                    if (zzsVar != null) {
                        scootersCompletionPhotoRouter$provideModalView$1.L$0 = k9n0Var;
                        scootersCompletionPhotoRouter$provideModalView$1.L$1 = a6o0Var;
                        scootersCompletionPhotoRouter$provideModalView$1.L$2 = scootersErrorCode;
                        scootersCompletionPhotoRouter$provideModalView$1.L$3 = null;
                        scootersCompletionPhotoRouter$provideModalView$1.L$4 = m;
                        scootersCompletionPhotoRouter$provideModalView$1.L$5 = charSequence;
                        scootersCompletionPhotoRouter$provideModalView$1.L$6 = q;
                        scootersCompletionPhotoRouter$provideModalView$1.L$7 = number;
                        scootersCompletionPhotoRouter$provideModalView$1.Z$0 = z3;
                        scootersCompletionPhotoRouter$provideModalView$1.label = 1;
                        Object a2 = ((com.yandex.go.scooters.parking.data.a) this.L).a(zzsVar, scootersCompletionPhotoRouter$provideModalView$1);
                        if (a2 != coroutineSingletons) {
                            k9n0Var2 = k9n0Var;
                            z2 = z3;
                            obj = a2;
                            scootersVehicleType2 = q;
                            r7p0Var2 = number;
                        }
                        return coroutineSingletons;
                    }
                    z = z3;
                    scootersVehicleType = q;
                    rbo0Var = null;
                    r7p0Var = number;
                    k9n0Var2 = k9n0Var;
                    a6o0Var2 = a6o0Var;
                    tso0 tso0Var2 = new tso0(m, charSequence, z, scootersVehicleType, r7p0Var, rbo0Var);
                    o9n0 o9n0Var2 = new o9n0(this, k9n0Var2);
                    fva0.f(this.G, "ScootersCompletionPhotoView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                    scootersCompletionPhotoRouter$provideModalView$1.L$0 = null;
                    scootersCompletionPhotoRouter$provideModalView$1.L$1 = null;
                    scootersCompletionPhotoRouter$provideModalView$1.L$2 = null;
                    scootersCompletionPhotoRouter$provideModalView$1.L$3 = null;
                    scootersCompletionPhotoRouter$provideModalView$1.L$4 = o9n0Var2;
                    scootersCompletionPhotoRouter$provideModalView$1.L$5 = null;
                    scootersCompletionPhotoRouter$provideModalView$1.L$6 = "ScootersCompletionPhotoView";
                    scootersCompletionPhotoRouter$provideModalView$1.L$7 = tso0Var2;
                    scootersCompletionPhotoRouter$provideModalView$1.L$8 = scootersErrorCode;
                    scootersCompletionPhotoRouter$provideModalView$1.L$9 = a6o0Var2;
                    can0 can0Var2 = this.K;
                    scootersCompletionPhotoRouter$provideModalView$1.L$10 = can0Var2;
                    scootersCompletionPhotoRouter$provideModalView$1.label = 2;
                    a = this.M.a(scootersCompletionPhotoRouter$provideModalView$1);
                    if (a != coroutineSingletons) {
                        str = "ScootersCompletionPhotoView";
                        o9n0Var = o9n0Var2;
                        scootersErrorCode2 = scootersErrorCode;
                        tso0Var = tso0Var2;
                        obj = a;
                        can0Var = can0Var2;
                        a6o0 a6o0Var3 = a6o0Var2;
                        s6k0 s6k0Var = can0Var.a;
                        final ScootersCompletionPhotoView scootersCompletionPhotoView = new ScootersCompletionPhotoView((Context) ((xvf0) s6k0Var.a).get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.a) ((q150) s6k0Var.b).get(), (ban0) ((xvf0) s6k0Var.c).get(), a6o0Var3, scootersErrorCode2, tso0Var, (f9n0) obj, o9n0Var);
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? r2 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.ScootersCompletionPhotoRouter$provideModalView$$inlined$wrapJankStats$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                                View rootView = scootersCompletionPhotoView.getRootView();
                                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                                if (tag == null) {
                                    tag = new xva0();
                                    rootView.setTag(t9h0.metricsStateHolder, tag);
                                }
                                yuf0 yuf0Var = ((xva0) tag).a;
                                if (yuf0Var != null) {
                                    yuf0Var.I(str);
                                }
                                View view = scootersCompletionPhotoView;
                                T t = ref$ObjectRef.element;
                                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                            }
                        };
                        ref$ObjectRef.element = r2;
                        scootersCompletionPhotoView.addOnAttachStateChangeListener(r2);
                        return scootersCompletionPhotoView;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    can0Var = (can0) scootersCompletionPhotoRouter$provideModalView$1.L$10;
                    a6o0Var2 = (a6o0) scootersCompletionPhotoRouter$provideModalView$1.L$9;
                    ScootersErrorCode scootersErrorCode3 = (ScootersErrorCode) scootersCompletionPhotoRouter$provideModalView$1.L$8;
                    tso0 tso0Var3 = (tso0) scootersCompletionPhotoRouter$provideModalView$1.L$7;
                    String str2 = (String) scootersCompletionPhotoRouter$provideModalView$1.L$6;
                    o9n0 o9n0Var3 = (o9n0) scootersCompletionPhotoRouter$provideModalView$1.L$4;
                    b.b(obj);
                    str = str2;
                    o9n0Var = o9n0Var3;
                    scootersErrorCode2 = scootersErrorCode3;
                    tso0Var = tso0Var3;
                    a6o0 a6o0Var32 = a6o0Var2;
                    s6k0 s6k0Var2 = can0Var.a;
                    final View scootersCompletionPhotoView2 = new ScootersCompletionPhotoView((Context) ((xvf0) s6k0Var2.a).get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.a) ((q150) s6k0Var2.b).get(), (ban0) ((xvf0) s6k0Var2.c).get(), a6o0Var32, scootersErrorCode2, tso0Var, (f9n0) obj, o9n0Var);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ?? r22 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.ScootersCompletionPhotoRouter$provideModalView$$inlined$wrapJankStats$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            View rootView = scootersCompletionPhotoView2.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            yuf0 yuf0Var = ((xva0) tag).a;
                            if (yuf0Var != null) {
                                yuf0Var.I(str);
                            }
                            View view = scootersCompletionPhotoView2;
                            T t = ref$ObjectRef2.element;
                            view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    ref$ObjectRef2.element = r22;
                    scootersCompletionPhotoView2.addOnAttachStateChangeListener(r22);
                    return scootersCompletionPhotoView2;
                }
                z2 = scootersCompletionPhotoRouter$provideModalView$1.Z$0;
                r7p0Var2 = (r7p0) scootersCompletionPhotoRouter$provideModalView$1.L$7;
                scootersVehicleType2 = (ScootersVehicleType) scootersCompletionPhotoRouter$provideModalView$1.L$6;
                charSequence = (CharSequence) scootersCompletionPhotoRouter$provideModalView$1.L$5;
                m = (String) scootersCompletionPhotoRouter$provideModalView$1.L$4;
                scootersErrorCode = (ScootersErrorCode) scootersCompletionPhotoRouter$provideModalView$1.L$2;
                a6o0Var = (a6o0) scootersCompletionPhotoRouter$provideModalView$1.L$1;
                k9n0Var2 = (k9n0) scootersCompletionPhotoRouter$provideModalView$1.L$0;
                b.b(obj);
                z = z2;
                rbo0Var = (rbo0) obj;
                r7p0Var = r7p0Var2;
                scootersVehicleType = scootersVehicleType2;
                a6o0Var2 = a6o0Var;
                tso0 tso0Var22 = new tso0(m, charSequence, z, scootersVehicleType, r7p0Var, rbo0Var);
                o9n0 o9n0Var22 = new o9n0(this, k9n0Var2);
                fva0.f(this.G, "ScootersCompletionPhotoView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                scootersCompletionPhotoRouter$provideModalView$1.L$0 = null;
                scootersCompletionPhotoRouter$provideModalView$1.L$1 = null;
                scootersCompletionPhotoRouter$provideModalView$1.L$2 = null;
                scootersCompletionPhotoRouter$provideModalView$1.L$3 = null;
                scootersCompletionPhotoRouter$provideModalView$1.L$4 = o9n0Var22;
                scootersCompletionPhotoRouter$provideModalView$1.L$5 = null;
                scootersCompletionPhotoRouter$provideModalView$1.L$6 = "ScootersCompletionPhotoView";
                scootersCompletionPhotoRouter$provideModalView$1.L$7 = tso0Var22;
                scootersCompletionPhotoRouter$provideModalView$1.L$8 = scootersErrorCode;
                scootersCompletionPhotoRouter$provideModalView$1.L$9 = a6o0Var2;
                can0 can0Var22 = this.K;
                scootersCompletionPhotoRouter$provideModalView$1.L$10 = can0Var22;
                scootersCompletionPhotoRouter$provideModalView$1.label = 2;
                a = this.M.a(scootersCompletionPhotoRouter$provideModalView$1);
                if (a != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        scootersCompletionPhotoRouter$provideModalView$1 = new ScootersCompletionPhotoRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoRouter$provideModalView$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoRouter$provideModalView$1.label;
        if (i != 0) {
        }
        z = z2;
        rbo0Var = (rbo0) obj2;
        r7p0Var = r7p0Var2;
        scootersVehicleType = scootersVehicleType2;
        a6o0Var2 = a6o0Var;
        tso0 tso0Var222 = new tso0(m, charSequence, z, scootersVehicleType, r7p0Var, rbo0Var);
        o9n0 o9n0Var222 = new o9n0(this, k9n0Var2);
        fva0.f(this.G, "ScootersCompletionPhotoView", PerformanceAnalytics$Type.Inflate, 0L, 4);
        scootersCompletionPhotoRouter$provideModalView$1.L$0 = null;
        scootersCompletionPhotoRouter$provideModalView$1.L$1 = null;
        scootersCompletionPhotoRouter$provideModalView$1.L$2 = null;
        scootersCompletionPhotoRouter$provideModalView$1.L$3 = null;
        scootersCompletionPhotoRouter$provideModalView$1.L$4 = o9n0Var222;
        scootersCompletionPhotoRouter$provideModalView$1.L$5 = null;
        scootersCompletionPhotoRouter$provideModalView$1.L$6 = "ScootersCompletionPhotoView";
        scootersCompletionPhotoRouter$provideModalView$1.L$7 = tso0Var222;
        scootersCompletionPhotoRouter$provideModalView$1.L$8 = scootersErrorCode;
        scootersCompletionPhotoRouter$provideModalView$1.L$9 = a6o0Var2;
        can0 can0Var222 = this.K;
        scootersCompletionPhotoRouter$provideModalView$1.L$10 = can0Var222;
        scootersCompletionPhotoRouter$provideModalView$1.label = 2;
        a = this.M.a(scootersCompletionPhotoRouter$provideModalView$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
