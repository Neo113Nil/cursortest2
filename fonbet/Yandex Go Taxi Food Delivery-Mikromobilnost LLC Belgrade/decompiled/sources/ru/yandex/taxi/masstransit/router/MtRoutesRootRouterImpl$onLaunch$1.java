package ru.yandex.taxi.masstransit.router;

import defpackage.iy30;
import defpackage.mvg;
import defpackage.nq30;
import defpackage.ny61;
import defpackage.oq30;
import defpackage.pq30;
import defpackage.qq30;
import defpackage.rq30;
import defpackage.sq30;
import defpackage.tje;
import defpackage.tse;
import defpackage.w411;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtRoutesRootRouterImpl$onLaunch$1", f = "MtRoutesRootRouterImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesRootRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ iy30 $payload;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.router.MtRoutesRootRouterImpl$onLaunch$1$2", f = "MtRoutesRootRouterImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.router.MtRoutesRootRouterImpl$onLaunch$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(i iVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.masstransit.address.interactor.i iVar = this.this$0.F;
                this.label = 1;
                if (iVar.f(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesRootRouterImpl$onLaunch$1(iy30 iy30Var, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = iy30Var;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRoutesRootRouterImpl$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesRootRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sq30 sq30Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w411 w411Var = this.$payload.a;
            if (w411Var != null) {
                ru.yandex.taxi.masstransit.deeplink.g gVar = this.this$0.H;
                this.L$0 = null;
                this.label = 1;
                obj = gVar.a(w411Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            sq30Var = this.this$0.P().b;
            if (!(sq30Var instanceof nq30) || (sq30Var instanceof qq30) || sq30Var == null) {
                i iVar = this.this$0;
                tje.N(iVar.J, null, null, new AnonymousClass2(iVar, null), 3);
            } else if (!sq30Var.equals(oq30.a) && !sq30Var.equals(rq30.a) && !(sq30Var instanceof pq30)) {
                w511.b();
                return null;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        sq30Var = this.this$0.P().b;
        if (sq30Var instanceof nq30) {
        }
        i iVar2 = this.this$0;
        tje.N(iVar2.J, null, null, new AnonymousClass2(iVar2, null), 3);
        return zy11.a;
    }
}
