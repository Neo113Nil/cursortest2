package ru.yandex.taxi;

import defpackage.bb41;
import defpackage.bgc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6f0;", "Lkotlin/Pair;", "", "Lien;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.SuperappAuthorizerImpl$authorizeWithCookies$1", f = "SuperappAuthorizerImpl.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperappAuthorizerImpl$authorizeWithCookies$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $callback;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappAuthorizerImpl$authorizeWithCookies$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$callback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappAuthorizerImpl$authorizeWithCookies$1 superappAuthorizerImpl$authorizeWithCookies$1 = new SuperappAuthorizerImpl$authorizeWithCookies$1(this.$callback, continuation);
        superappAuthorizerImpl$authorizeWithCookies$1.L$0 = obj;
        return superappAuthorizerImpl$authorizeWithCookies$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappAuthorizerImpl$authorizeWithCookies$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$callback.invoke(new bb41() { // from class: a9w0
                @Override // defpackage.bb41
                public final void a(String str, ien ienVar) {
                    ((x6f0) y6f0.this).d(new Pair(str, ienVar));
                }
            });
            bgc bgcVar = new bgc(12);
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bgcVar, this) == coroutineSingletons) {
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
