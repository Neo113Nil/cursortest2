package ru.yandex.taxi.logistics.sdk.management.storage;

import defpackage.ez40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.storage.AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2", f = "AutoOpenedEditOrderDetailsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$deliveryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2 autoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2 = new AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2(this.this$0, this.$deliveryId, continuation);
        autoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2.L$0 = obj;
        return autoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2 autoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2 = (AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        autoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Set set = (Set) ez40Var.c(this.this$0.b);
        if (set == null) {
            set = EmptySet.a;
        }
        ez40Var.g(this.this$0.b, v4r0.i(set, this.$deliveryId));
        return zy11.a;
    }
}
