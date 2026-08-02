package ru.yandex.taxi.masstransit.detailedroute.ui;

import defpackage.bf30;
import defpackage.g92;
import defpackage.jqr;
import defpackage.lg30;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rw30;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yw30;
import defpackage.zf30;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRoutePresenter$attachView$3", f = "MtDetailedRoutePresenter.kt", l = {317}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRoutePresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ zf30 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrw30;", "tickets", "Lzy11;", "<anonymous>", "(Lrw30;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRoutePresenter$attachView$3$1", f = "MtDetailedRoutePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRoutePresenter$attachView$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, c cVar) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((rw30) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
            int i;
            TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
            rw30 rw30Var = (rw30) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = rw30Var.h;
            if ((aVar.a() || aVar.b()) && !this.this$0.L) {
                ArrayList arrayList = new ArrayList();
                if (aVar.a()) {
                    arrayList.add(TransportRouteAnalytics$VehicleType.Aeroexpress.getEventValue());
                }
                if (aVar.b()) {
                    arrayList.add(TransportRouteAnalytics$VehicleType.Suburban.getEventValue());
                }
                c cVar = this.this$0;
                yw30 yw30Var = cVar.C;
                MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = cVar.z;
                int i2 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = this.this$0.A;
                        i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                        if (i != -1) {
                            if (i == 1) {
                                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                                yw30Var.d(arrayList, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                                this.this$0.L = true;
                            } else if (i != 2) {
                                w511.b();
                                return null;
                            }
                        }
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                        yw30Var.d(arrayList, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                        this.this$0.L = true;
                    } else if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                }
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = this.this$0.A;
                if (mtDetailedRouteAnalyticType2 != null) {
                }
                if (i != -1) {
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                yw30Var.d(arrayList, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                this.this$0.L = true;
            }
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRoutePresenter$attachView$3$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return c.Kg((c) this.receiver, (Pair) obj, (Continuation) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRoutePresenter$attachView$3(c cVar, zf30 zf30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$mvpView = zf30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtDetailedRoutePresenter$attachView$3(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRoutePresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.X(new mth(new j0(null, new jqr(cVar.F.a(new g92(2, cVar.x), cVar.G.a()), new AnonymousClass1(null, this.this$0), 3), new MtDetailedRoutePresenter$updateLocalState$$inlined$withPreviousEmit$1(3, null)), 6), new MtDetailedRoutePresenter$updateLocalState$$inlined$flatMapLatest$1(null, cVar)), new AnonymousClass2(2, this.this$0, c.class, "mapUiState", "mapUiState(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)));
            zf30 zf30Var = this.$mvpView;
            o oVar = new o(t, new MtDetailedRoutePresenter$attachView$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            lg30 lg30Var = new lg30(zf30Var, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(lg30Var, this) == coroutineSingletons) {
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
