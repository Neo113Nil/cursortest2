package ru.yandex.video.m3.player.netperf;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lzy11;", "", "it", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.netperf.NetPerfManager$job$1$2", f = "NetPerfManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class NetPerfManager$job$1$2 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ NetPerfManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetPerfManager$job$1$2(NetPerfManager netPerfManager, Continuation<? super NetPerfManager$job$1$2> continuation) {
        super(3, continuation);
        this.this$0 = netPerfManager;
    }

    @Override // defpackage.zls
    public final Object invoke(vpr vprVar, Throwable th, Continuation<? super zy11> continuation) {
        return new NetPerfManager$job$1$2(this.this$0, continuation).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.sendEventsIfExist();
        return zy11.a;
    }
}
