package ru.yandex.video.m3.player.ui.debug.manager;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.ui.debug.model.ContentData;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u008a@"}, d2 = {"<anonymous>", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "contentId", "", "streamType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "videoType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1", f = "YandexPlayerDebugDataManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1(Continuation<? super YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1> continuation) {
        super(4, continuation);
    }

    @Override // defpackage.bms
    public final Object invoke(String str, CurrentStreamType currentStreamType, CurrentVideoType currentVideoType, Continuation<? super ContentData> continuation) {
        YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1 yandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1 = new YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1(continuation);
        yandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1.L$0 = str;
        yandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1.L$1 = currentStreamType;
        yandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1.L$2 = currentVideoType;
        return yandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new ContentData((String) this.L$0, (CurrentStreamType) this.L$1, (CurrentVideoType) this.L$2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
