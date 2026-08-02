package ru.yandex.video.m3.player.ui.debug.manager;

import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.ui.debug.internal.model.OtherData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.Size;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u008a@"}, d2 = {"<anonymous>", "Lru/yandex/video/m3/player/ui/debug/internal/model/OtherData;", "viewportSize", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "drmMode", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "droppedFrames", "", "lastError", "", "networkType"}, k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1", f = "YandexPlayerDebugDataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    public YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1(Continuation<? super YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1> continuation) {
        super(6, continuation);
    }

    public final Object invoke(Size size, DrmMode drmMode, int i, String str, String str2, Continuation<? super OtherData> continuation) {
        YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1 yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1 = new YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1(continuation);
        yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1.L$0 = size;
        yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1.L$1 = drmMode;
        yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1.I$0 = i;
        yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1.L$2 = str;
        yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1.L$3 = str2;
        return yandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return new OtherData((Size) this.L$0, (DrmMode) this.L$1, this.I$0, (String) this.L$3, (String) this.L$2);
    }

    @Override // defpackage.ems
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((Size) obj, (DrmMode) obj2, ((Number) obj3).intValue(), (String) obj4, (String) obj5, (Continuation<? super OtherData>) obj6);
    }
}
