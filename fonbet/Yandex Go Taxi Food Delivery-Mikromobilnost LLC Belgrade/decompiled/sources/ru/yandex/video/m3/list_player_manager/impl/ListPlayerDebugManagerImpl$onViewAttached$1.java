package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.debug.DebugDataHandlerImpl;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "debugDataHandler", "", "isDebugViewEnabled", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/debug/DebugDataHandlerImpl;Z)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$onViewAttached$1", f = "ListPlayerDebugManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ListPlayerDebugManagerImpl$onViewAttached$1 extends SuspendLambda implements zls {
    final /* synthetic */ ListYandexPlayerView $listYandexPlayerView;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPlayerDebugManagerImpl$onViewAttached$1(ListYandexPlayerView listYandexPlayerView, Continuation<? super ListPlayerDebugManagerImpl$onViewAttached$1> continuation) {
        super(3, continuation);
        this.$listYandexPlayerView = listYandexPlayerView;
    }

    public final Object invoke(DebugDataHandlerImpl debugDataHandlerImpl, boolean z, Continuation<? super zy11> continuation) {
        ListPlayerDebugManagerImpl$onViewAttached$1 listPlayerDebugManagerImpl$onViewAttached$1 = new ListPlayerDebugManagerImpl$onViewAttached$1(this.$listYandexPlayerView, continuation);
        listPlayerDebugManagerImpl$onViewAttached$1.L$0 = debugDataHandlerImpl;
        listPlayerDebugManagerImpl$onViewAttached$1.Z$0 = z;
        return listPlayerDebugManagerImpl$onViewAttached$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DebugDataHandlerImpl debugDataHandlerImpl = (DebugDataHandlerImpl) this.L$0;
        if (!this.Z$0 || debugDataHandlerImpl == null) {
            this.$listYandexPlayerView.removeDebugView$video_player_internalRelease();
        } else {
            this.$listYandexPlayerView.addDebugView$video_player_internalRelease(debugDataHandlerImpl.getPlayerEngineDebugDataFlow(), debugDataHandlerImpl.getListPlayerManagerDebugDataFlow());
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((DebugDataHandlerImpl) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super zy11>) obj3);
    }
}
