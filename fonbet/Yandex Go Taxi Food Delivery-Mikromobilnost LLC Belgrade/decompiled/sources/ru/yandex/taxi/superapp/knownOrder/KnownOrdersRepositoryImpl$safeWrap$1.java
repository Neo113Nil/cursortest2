package ru.yandex.taxi.superapp.knownOrder;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Lkx70;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.knownOrder.KnownOrdersRepositoryImpl$safeWrap$1", f = "KnownOrdersRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class KnownOrdersRepositoryImpl$safeWrap$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $orderType;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnownOrdersRepositoryImpl$safeWrap$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$orderType = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KnownOrdersRepositoryImpl$safeWrap$1 knownOrdersRepositoryImpl$safeWrap$1 = new KnownOrdersRepositoryImpl$safeWrap$1(this.$orderType, (Continuation) obj3);
        knownOrdersRepositoryImpl$safeWrap$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        knownOrdersRepositoryImpl$safeWrap$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jst.e.k(th, String.format("Error getting orders: %s", Arrays.copyOf(new Object[]{this.$orderType}, 1)));
        return zy11.a;
    }
}
