package ru.yandex.taxi.scooters.presentation.route;

import android.graphics.Color;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.bg30;
import defpackage.cg30;
import defpackage.cyn0;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.pr40;
import defpackage.q6s0;
import defpackage.sy60;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w4e0;
import defpackage.wls;
import defpackage.xm00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route.ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1", f = "ScootersMtRouteOverlayRouter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.route.ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1$1", f = "ScootersMtRouteOverlayRouter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.route.ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, a aVar) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
        
            if (r0 == false) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b1 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Route route;
            boolean z;
            boolean z2;
            cg30 cg30Var;
            a aVar;
            Route route2;
            xm00 xm00Var;
            boolean z3;
            boolean z4;
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            Triple triple = (Triple) obj2;
            pr40 pr40Var = (pr40) triple.getFirst();
            String str = (String) triple.getSecond();
            boolean booleanValue = ((Boolean) triple.getThird()).booleanValue();
            a aVar2 = this.this$0;
            if (pr40Var != null) {
                aVar2.getClass();
                pr40 pr40Var2 = pr40Var.b.size() >= 2 ? pr40Var : null;
                if (pr40Var2 != null) {
                    route = pr40Var2.a;
                    z = true;
                    if (route != null) {
                        nyn0 nyn0Var = aVar2.E.a;
                        if (str != null) {
                            z4 = nyn0Var.a(str);
                        } else {
                            cyn0 b = nyn0Var.b.b();
                            z4 = b != null && b.e == null;
                        }
                        if (z4) {
                            z2 = true;
                            if (z2 == aVar2.L || (z2 && route != aVar2.J)) {
                                aVar2.L = z2;
                                cg30Var = aVar2.H;
                                if (cg30Var != null) {
                                    cg30Var.i();
                                }
                                aVar2.H = null;
                                if (z2 || route == null || pr40Var == null) {
                                    aVar2.J = null;
                                } else {
                                    aVar2.J = route;
                                    cg30 cg30Var2 = (cg30) aVar2.G.get();
                                    aVar2.H = cg30Var2;
                                    aVar2.A(cg30Var2, new bg30(route, null, pr40Var.b, new q6s0(false, true), null, 32), sy60.Q2);
                                }
                            }
                            aVar = this.this$0;
                            route2 = pr40Var != null ? pr40Var.c : null;
                            aVar.getClass();
                            if (route2 != null && booleanValue) {
                                nyn0 nyn0Var2 = aVar.E.a;
                                if (str == null) {
                                    z3 = nyn0Var2.a(str);
                                } else {
                                    cyn0 b2 = nyn0Var2.b.b();
                                    z3 = b2 != null && b2.e == null;
                                }
                            }
                            z = false;
                            if (z == aVar.M || (z && route2 != aVar.K)) {
                                aVar.M = z;
                                xm00Var = aVar.I;
                                if (xm00Var != null) {
                                    xm00Var.d();
                                }
                                aVar.I = null;
                                if (z || route2 == null) {
                                    aVar.K = null;
                                } else {
                                    aVar.K = route2;
                                    xm00 p = ((gh00) aVar.D).i.p();
                                    aVar.I = p;
                                    w4e0 s = p.s(route2.getGeometry());
                                    s.C(Integer.valueOf(Color.parseColor("#02CB52")));
                                    s.p(4.5f);
                                    s.v(false);
                                }
                            }
                            return zy11.a;
                        }
                    }
                    z2 = false;
                    if (z2 == aVar2.L) {
                    }
                    aVar2.L = z2;
                    cg30Var = aVar2.H;
                    if (cg30Var != null) {
                    }
                    aVar2.H = null;
                    if (z2) {
                    }
                    aVar2.J = null;
                    aVar = this.this$0;
                    if (pr40Var != null) {
                    }
                    aVar.getClass();
                    if (route2 != null) {
                        nyn0 nyn0Var22 = aVar.E.a;
                        if (str == null) {
                        }
                    }
                    z = false;
                    if (z == aVar.M) {
                    }
                    aVar.M = z;
                    xm00Var = aVar.I;
                    if (xm00Var != null) {
                    }
                    aVar.I = null;
                    if (z) {
                    }
                    aVar.K = null;
                    return zy11.a;
                }
            }
            route = null;
            z = true;
            if (route != null) {
            }
            z2 = false;
            if (z2 == aVar2.L) {
            }
            aVar2.L = z2;
            cg30Var = aVar2.H;
            if (cg30Var != null) {
            }
            aVar2.H = null;
            if (z2) {
            }
            aVar2.J = null;
            aVar = this.this$0;
            if (pr40Var != null) {
            }
            aVar.getClass();
            if (route2 != null) {
            }
            z = false;
            if (z == aVar.M) {
            }
            aVar.M = z;
            xm00Var = aVar.I;
            if (xm00Var != null) {
            }
            aVar.I = null;
            if (z) {
            }
            aVar.K = null;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, a aVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
