package ru.yandex.video.m3.debug;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.debug.DebugDataHandlerImpl$attachEngine$2", f = "DebugDataHandlerImpl.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class DebugDataHandlerImpl$attachEngine$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebugDataHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugDataHandlerImpl$attachEngine$2(DebugDataHandlerImpl debugDataHandlerImpl, Continuation<? super DebugDataHandlerImpl$attachEngine$2> continuation) {
        super(2, continuation);
        this.this$0 = debugDataHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        DebugDataHandlerImpl$attachEngine$2 debugDataHandlerImpl$attachEngine$2 = new DebugDataHandlerImpl$attachEngine$2(this.this$0, continuation);
        debugDataHandlerImpl$attachEngine$2.L$0 = obj;
        return debugDataHandlerImpl$attachEngine$2;
    }

    @Override // defpackage.wls
    public final Object invoke(DebugData debugData, Continuation<? super zy11> continuation) {
        return ((DebugDataHandlerImpl$attachEngine$2) create(debugData, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        DebugData debugData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            DebugData debugData2 = (DebugData) this.L$0;
            if (DebugViewToggleManagerImpl.INSTANCE.isNotEnabled$video_player_internalRelease(this.this$0.debugViewToggleManager)) {
                return zy11Var;
            }
            pz40Var = this.this$0._playerEngineDebugDataFlow;
            this.L$0 = debugData2;
            this.label = 1;
            ((r0) pz40Var).emit(debugData2, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            debugData = debugData2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            debugData = (DebugData) this.L$0;
            b.b(obj);
        }
        this.this$0.listSdkDebugDataManager.onPlayerDebugDataUpdate(debugData, this.this$0.currentMediaData);
        return zy11Var;
    }
}
