package ru.yandex.taxi.plus.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "", "client", ClidProvider.STATE}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.plus.repository.PlusTemplatesInteractor$templates$1", f = "PlusTemplatesInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusTemplatesInteractor$templates$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusTemplatesInteractor$templates$1 plusTemplatesInteractor$templates$1 = new PlusTemplatesInteractor$templates$1(3, (Continuation) obj3);
        plusTemplatesInteractor$templates$1.L$0 = (Map) obj;
        plusTemplatesInteractor$templates$1.L$1 = (Map) obj2;
        return plusTemplatesInteractor$templates$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        Map map2 = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return kotlin.collections.b.n(map, map2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
