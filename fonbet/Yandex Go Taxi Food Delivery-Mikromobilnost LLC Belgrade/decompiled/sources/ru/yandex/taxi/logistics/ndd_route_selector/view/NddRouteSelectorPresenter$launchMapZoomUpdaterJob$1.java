package ru.yandex.taxi.logistics.ndd_route_selector.view;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.gh00;
import defpackage.ha2;
import defpackage.hj50;
import defpackage.m810;
import defpackage.mvg;
import defpackage.ndi;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tyx;
import defpackage.uc4;
import defpackage.wls;
import defpackage.xi50;
import defpackage.yi50;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.ndd_route_selector.domain.NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$start$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1", f = "NddRouteSelectorPresenter.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ yi50 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxi50;", "mapAutoZoomState", "Lzy11;", "<anonymous>", "(Lxi50;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1$1", f = "NddRouteSelectorPresenter.kt", l = {187}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int I$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        boolean Z$1;
        int label;
        final /* synthetic */ yi50 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(yi50 yi50Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = yi50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((xi50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            uc4 uc4Var;
            xi50 xi50Var = (xi50) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                uc4 uc4Var2 = xi50Var.a;
                boolean z = xi50Var.b;
                boolean z2 = xi50Var.c;
                ndi ndiVar = xi50Var.d;
                Double d = ndiVar.c;
                Long valueOf = d != null ? Long.valueOf(m810.c(d.doubleValue() * 1000.0d)) : null;
                int i2 = (uc4Var2 == null || z || z2 || !ndiVar.b || valueOf == null || valueOf.longValue() <= 0) ? 0 : 1;
                if (i2 != 0) {
                    long longValue = valueOf.longValue();
                    this.L$0 = null;
                    this.L$1 = uc4Var2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = z;
                    this.Z$1 = z2;
                    this.I$0 = i2;
                    this.label = 1;
                    if (kotlinx.coroutines.a.i(longValue, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uc4Var = uc4Var2;
                }
                return zy11.a;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uc4Var = (uc4) this.L$1;
            kotlin.b.b(obj);
            ah00 ah00Var = this.this$0.A;
            zzs zzsVar = uc4Var.a;
            Point point = new Point(zzsVar.a, zzsVar.b);
            zzs zzsVar2 = uc4Var.b;
            ((gh00) ah00Var).A(new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b)), null);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1(yi50 yi50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yi50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NddRouteSelectorPresenter$launchMapZoomUpdaterJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            yi50 yi50Var = this.this$0;
            ha2 m = kotlinx.coroutines.flow.e.m(new g(com.yandex.go.coroutines.b.d(new ru.yandex.taxi.logistics.ndd_route_selector.domain.b(((tyx) yi50Var.J.a).b), new NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$start$1(null, null))), kotlinx.coroutines.flow.e.t(new n(new e(new c(dib1.c(yi50Var.A))), new NddRouteSelectorPresenter$createMapTouchedFlow$flow$3(2, null))), ((hj50) yi50Var.z.w).b, yi50Var.D.b.a(), new NddRouteSelectorPresenter$createMapAutoZoomFlow$flow$1(5, null));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(m, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
