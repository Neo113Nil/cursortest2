package ru.yandex.video.m3.player.ui.debug.manager;

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
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.ui.debug.internal.model.TimerData;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider;
import ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/video/m3/player/ui/debug/internal/model/TimerData;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1", f = "YandexPlayerDebugDataManager.kt", l = {HProv.ALG_SID_SHA_224, 286}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ YandexPlayerDebugDataManager.DebugObserver this$0;
    final /* synthetic */ YandexPlayerDebugDataManager this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1(YandexPlayerDebugDataManager.DebugObserver debugObserver, YandexPlayerDebugDataManager yandexPlayerDebugDataManager, Continuation<? super YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = debugObserver;
        this.this$1 = yandexPlayerDebugDataManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1 yandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1 = new YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1(this.this$0, this.this$1, continuation);
        yandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1.L$0 = obj;
        return yandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (kotlinx.coroutines.a.i(50, r9) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0072 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        TimerData timerData;
        LatencyData latency;
        String dateTime;
        long targetBuffer;
        SessionColorProvider sessionColorProvider;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vprVar = (vpr) this.L$0;
            this.this$0.extractDataFromPlayer();
            latency = this.this$0.getLatency();
            dateTime = this.this$0.getDateTime();
            targetBuffer = this.this$0.getTargetBuffer();
            Long l = new Long(targetBuffer);
            sessionColorProvider = this.this$1.sessionColorProvider;
            if (sessionColorProvider != null) {
            }
            SessionColor sessionColor = SessionColor.NONE;
            timerData = new TimerData(latency, dateTime, l, sessionColor);
            this.L$0 = vprVar;
            this.label = 1;
            if (vprVar.emit(timerData, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar2 = (vpr) this.L$0;
            b.b(obj);
            vprVar = vprVar2;
            this.this$0.extractDataFromPlayer();
            latency = this.this$0.getLatency();
            dateTime = this.this$0.getDateTime();
            targetBuffer = this.this$0.getTargetBuffer();
            Long l2 = new Long(targetBuffer);
            sessionColorProvider = this.this$1.sessionColorProvider;
            if (sessionColorProvider != null || (sessionColor = sessionColorProvider.getCurrentSessionColor()) == null) {
                SessionColor sessionColor2 = SessionColor.NONE;
            }
            timerData = new TimerData(latency, dateTime, l2, sessionColor2);
            this.L$0 = vprVar;
            this.label = 1;
            if (vprVar.emit(timerData, this) != coroutineSingletons) {
                vprVar2 = vprVar;
                this.L$0 = vprVar2;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        vprVar2 = (vpr) this.L$0;
        b.b(obj);
        this.L$0 = vprVar2;
        this.label = 2;
    }
}
