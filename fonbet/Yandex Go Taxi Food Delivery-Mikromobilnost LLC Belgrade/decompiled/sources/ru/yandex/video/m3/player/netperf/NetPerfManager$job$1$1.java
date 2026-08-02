package ru.yandex.video.m3.player.netperf;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.netperf.NetPerfManager$job$1$1", f = "NetPerfManager.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class NetPerfManager$job$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ NetPerfManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetPerfManager$job$1$1(NetPerfManager netPerfManager, Continuation<? super NetPerfManager$job$1$1> continuation) {
        super(2, continuation);
        this.this$0 = netPerfManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new NetPerfManager$job$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((NetPerfManager$job$1$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (a.p(get_context())) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.this$0.sendEventsIfExist();
            if (a.p(get_context())) {
                j = this.this$0.sendingIntervalMs;
                this.label = 1;
                if (a.i(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.this$0.sendEventsIfExist();
                if (a.p(get_context())) {
                    return zy11.a;
                }
            }
        }
    }
}
