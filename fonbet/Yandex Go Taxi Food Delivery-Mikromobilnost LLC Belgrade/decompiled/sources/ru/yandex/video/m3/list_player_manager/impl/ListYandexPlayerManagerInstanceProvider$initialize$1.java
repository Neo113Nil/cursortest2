package ru.yandex.video.m3.list_player_manager.impl;

import android.content.Context;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$initialize$1", f = "ListYandexPlayerManagerInstanceProvider.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerInstanceProvider$initialize$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ InitParameters $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListYandexPlayerManagerInstanceProvider$initialize$1(Context context, InitParameters initParameters, Continuation<? super ListYandexPlayerManagerInstanceProvider$initialize$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$params = initParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new ListYandexPlayerManagerInstanceProvider$initialize$1(this.$context, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super ListYandexPlayerManager> continuation) {
        return ((ListYandexPlayerManagerInstanceProvider$initialize$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh initializeAsyncInternal;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        initializeAsyncInternal = ListYandexPlayerManagerInstanceProvider.INSTANCE.initializeAsyncInternal(this.$context, this.$params);
        this.label = 1;
        Object k = initializeAsyncInternal.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
