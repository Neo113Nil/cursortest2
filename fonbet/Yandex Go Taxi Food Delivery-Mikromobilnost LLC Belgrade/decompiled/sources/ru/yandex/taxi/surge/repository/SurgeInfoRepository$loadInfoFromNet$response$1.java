package ru.yandex.taxi.surge.repository;

import defpackage.btw0;
import defpackage.cmt;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tls;
import defpackage.wls;
import defpackage.wsw0;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.surge.api.SurgeInfoApi;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isResumed", "Lbtw0;", "<anonymous>", "(Z)Lbtw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.repository.SurgeInfoRepository$loadInfoFromNet$response$1", f = "SurgeInfoRepository.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoRepository$loadInfoFromNet$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ wsw0 $param;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.surge.repository.SurgeInfoRepository$loadInfoFromNet$response$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            ((b) this.receiver).b.getClass();
            xby.l(jst.e, "SurgeCard loading error", null, null, s8o.u(th) ? "invalid client request" : s8o.E(th) ? "server error" : s8o.A(th) ? "network error" : "unknown error", 6);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoRepository$loadInfoFromNet$response$1(b bVar, wsw0 wsw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$param = wsw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoRepository$loadInfoFromNet$response$1 surgeInfoRepository$loadInfoFromNet$response$1 = new SurgeInfoRepository$loadInfoFromNet$response$1(this.this$0, this.$param, continuation);
        surgeInfoRepository$loadInfoFromNet$response$1.Z$0 = ((Boolean) obj).booleanValue();
        return surgeInfoRepository$loadInfoFromNet$response$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((SurgeInfoRepository$loadInfoFromNet$response$1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!z) {
                return null;
            }
            cmt<btw0> a = ((SurgeInfoApi) this.this$0.c.getValue()).a(this.$param);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.this$0, b.class, "handleNetworkError", "handleNetworkError(Ljava/lang/Throwable;)Z", 8);
            this.Z$0 = z;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.a(a, anonymousClass1, this);
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
        return (btw0) obj;
    }
}
