package ru.yandex.video.m3.player.impl.utils.network;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/player/utils/network/NetworkType;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$getForceNetworkType$1$1$1", f = "NetworkTypeProviderImpl.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class NetworkTypeProviderImpl$getForceNetworkType$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ NetworkTypeProviderImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/player/utils/network/NetworkType;"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$getForceNetworkType$1$1$1$1", f = "NetworkTypeProviderImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$getForceNetworkType$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ NetworkTypeProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NetworkTypeProviderImpl networkTypeProviderImpl, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = networkTypeProviderImpl;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$context, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super NetworkType> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NetworkType currentNetworkType;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            currentNetworkType = this.this$0.getCurrentNetworkType(this.$context);
            return currentNetworkType;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTypeProviderImpl$getForceNetworkType$1$1$1(NetworkTypeProviderImpl networkTypeProviderImpl, Context context, Continuation<? super NetworkTypeProviderImpl$getForceNetworkType$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = networkTypeProviderImpl;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new NetworkTypeProviderImpl$getForceNetworkType$1$1$1(this.this$0, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super NetworkType> continuation) {
        return ((NetworkTypeProviderImpl$getForceNetworkType$1$1$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qoh h = tje.h(this.this$0.networkInfoScope, null, null, new AnonymousClass1(this.this$0, this.$context, null), 3);
        this.label = 1;
        Object s = h.s(this);
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
