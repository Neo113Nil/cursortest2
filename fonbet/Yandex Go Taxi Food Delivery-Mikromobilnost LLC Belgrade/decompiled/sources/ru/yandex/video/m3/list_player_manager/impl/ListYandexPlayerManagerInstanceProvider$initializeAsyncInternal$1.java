package ru.yandex.video.m3.list_player_manager.impl;

import android.content.Context;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1", f = "ListYandexPlayerManagerInstanceProvider.kt", l = {548}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ InitParameters $params;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1(Context context, InitParameters initParameters, Continuation<? super ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$params = initParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1(this.$context, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super ListYandexPlayerManager> continuation) {
        return ((ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        Context context;
        g050 g050Var2;
        InitParameters initParameters;
        ListYandexPlayerManager listYandexPlayerManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g050Var = ListYandexPlayerManagerInstanceProvider.mutex;
            context = this.$context;
            InitParameters initParameters2 = this.$params;
            this.L$0 = g050Var;
            this.L$1 = context;
            this.L$2 = initParameters2;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var2 = g050Var;
            initParameters = initParameters2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            initParameters = (InitParameters) this.L$2;
            context = (Context) this.L$1;
            g050Var2 = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            listYandexPlayerManager = ListYandexPlayerManagerInstanceProvider.INSTANCE;
            if (listYandexPlayerManager == null) {
                listYandexPlayerManager = ListYandexPlayerManagerInstanceProvider.INSTANCE.initializeInternal(context, initParameters);
                ListYandexPlayerManagerInstanceProvider.INSTANCE = listYandexPlayerManager;
            }
            return listYandexPlayerManager;
        } finally {
            g050Var2.d(null);
        }
    }
}
