package ru.yandex.taxi.map_common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.a3v;
import defpackage.fh00;
import defpackage.gh00;
import defpackage.jeh0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qdx;
import defpackage.qeh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x3s;
import defpackage.xw31;
import defpackage.yof0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.main_screen_custom.presentation.PromoOverMapView;
import ru.yandex.taxi.main_screen_custom.presentation.v;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.ui.PassMoveTouchListener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.TaxiMapViewInitializerListener$onInitialized$2", f = "TaxiMapViewInitializerListener.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TaxiMapViewInitializerListener$onInitialized$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.map_common.TaxiMapViewInitializerListener$onInitialized$2$1", f = "TaxiMapViewInitializerListener.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.map_common.TaxiMapViewInitializerListener$onInitialized$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                po21 po21Var = (po21) this.this$0.l.get();
                this.label = 1;
                obj = ((e) po21Var).h(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            gh00 gh00Var = (gh00) this.this$0.g.get();
            zzs a = ((mo21) obj).a();
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            Point point = new Point(a.a, a.b);
            gh00Var.getClass();
            gh00Var.q(new fh00(gh00Var, point, 17.0f));
            yof0 yof0Var = (yof0) this.this$0.m.get();
            ViewGroup viewGroup = (ViewGroup) this.this$0.k.findViewById(qeh0.view_on_map_container);
            PassMoveTouchListener passMoveTouchListener = new PassMoveTouchListener(((ru.yandex.taxi.viewholder.b) this.this$0.e.get()).c());
            qdx qdxVar = yof0Var.a;
            int i2 = jeh0.promo_over_map_view;
            PromoOverMapView promoOverMapView = new PromoOverMapView((Context) qdxVar.c, (a3v) qdxVar.w, (v) ((x3s) qdxVar.x).get());
            promoOverMapView.setId(i2);
            promoOverMapView.setOnTouchListener(passMoveTouchListener);
            promoOverMapView.setVisibility(8);
            promoOverMapView.setElevation(-1.0f);
            promoOverMapView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            xw31.A(qdxVar.b, promoOverMapView);
            viewGroup.addView(promoOverMapView);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiMapViewInitializerListener$onInitialized$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiMapViewInitializerListener$onInitialized$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiMapViewInitializerListener$onInitialized$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            Lifecycle lifecycle = cVar.i;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
