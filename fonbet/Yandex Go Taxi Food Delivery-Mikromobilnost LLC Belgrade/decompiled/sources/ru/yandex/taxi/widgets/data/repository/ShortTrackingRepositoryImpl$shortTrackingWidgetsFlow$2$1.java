package ru.yandex.taxi.widgets.data.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pw40;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lx251;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.data.repository.ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1", f = "ShortTrackingRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ pw40 $multiorderShortTrackingProvider;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1(pw40 pw40Var, Continuation continuation) {
        super(2, continuation);
        this.$multiorderShortTrackingProvider = pw40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1 shortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1 = new ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1(this.$multiorderShortTrackingProvider, continuation);
        shortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1.L$0 = obj;
        return shortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1 shortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1 = (ShortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        shortTrackingRepositoryImpl$shortTrackingWidgetsFlow$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$multiorderShortTrackingProvider.a = !list.isEmpty();
        return zy11.a;
    }
}
