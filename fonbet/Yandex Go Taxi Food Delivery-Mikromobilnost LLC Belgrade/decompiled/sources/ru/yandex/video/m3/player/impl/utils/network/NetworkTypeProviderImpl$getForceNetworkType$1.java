package ru.yandex.video.m3.player.impl.utils.network;

import android.content.Context;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ljo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/player/utils/network/NetworkType;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$getForceNetworkType$1", f = "NetworkTypeProviderImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class NetworkTypeProviderImpl$getForceNetworkType$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkTypeProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTypeProviderImpl$getForceNetworkType$1(NetworkTypeProviderImpl networkTypeProviderImpl, Context context, Continuation<? super NetworkTypeProviderImpl$getForceNetworkType$1> continuation) {
        super(2, continuation);
        this.this$0 = networkTypeProviderImpl;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        NetworkTypeProviderImpl$getForceNetworkType$1 networkTypeProviderImpl$getForceNetworkType$1 = new NetworkTypeProviderImpl$getForceNetworkType$1(this.this$0, this.$context, continuation);
        networkTypeProviderImpl$getForceNetworkType$1.L$0 = obj;
        return networkTypeProviderImpl$getForceNetworkType$1;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super NetworkType> continuation) {
        return ((NetworkTypeProviderImpl$getForceNetworkType$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                NetworkTypeProviderImpl$getForceNetworkType$1$1$1 networkTypeProviderImpl$getForceNetworkType$1$1$1 = new NetworkTypeProviderImpl$getForceNetworkType$1$1$1(this.this$0, this.$context, null);
                this.label = 1;
                obj = a.w(50L, networkTypeProviderImpl$getForceNetworkType$1$1$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            failure = (NetworkType) obj;
            if (failure == null) {
                failure = NetworkType.NETWORK_TYPE_UNKNOWN;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            ljo.b(a);
        }
        NetworkType networkType = NetworkType.NETWORK_TYPE_UNKNOWN;
        if (failure instanceof Result.Failure) {
            failure = networkType;
        }
        this.this$0.internalNetworkType = (NetworkType) failure;
        return failure;
    }
}
