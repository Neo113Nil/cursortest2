package ru.yandex.video.m3.player.netperf;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.netperf.NetPerfManager$special$$inlined$flatMapLatest$1", f = "NetPerfManager.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class NetPerfManager$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ NetPerfManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetPerfManager$special$$inlined$flatMapLatest$1(Continuation continuation, NetPerfManager netPerfManager) {
        super(3, continuation);
        this.this$0 = netPerfManager;
    }

    public final Object invoke(vpr vprVar, Boolean bool, Continuation<? super zy11> continuation) {
        NetPerfManager$special$$inlined$flatMapLatest$1 netPerfManager$special$$inlined$flatMapLatest$1 = new NetPerfManager$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        netPerfManager$special$$inlined$flatMapLatest$1.L$0 = vprVar;
        netPerfManager$special$$inlined$flatMapLatest$1.L$1 = bool;
        return netPerfManager$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            tpr kVar = ((Boolean) this.L$1).booleanValue() ? new k(new rol0(new NetPerfManager$job$1$1(this.this$0, null)), new NetPerfManager$job$1$2(this.this$0, null)) : pvn.a;
            this.label = 1;
            if (e.u(kVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((vpr) obj, (Boolean) obj2, (Continuation<? super zy11>) obj3);
    }
}
