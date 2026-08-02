package ru.yandex.video.m3.list_player_manager.impl;

import androidx.appcompat.app.AppCompatActivity;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl;
import ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerImpl$release$2", f = "ListYandexPlayerManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerImpl$release$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ListYandexPlayerManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListYandexPlayerManagerImpl$release$2(ListYandexPlayerManagerImpl listYandexPlayerManagerImpl, Continuation<? super ListYandexPlayerManagerImpl$release$2> continuation) {
        super(2, continuation);
        this.this$0 = listYandexPlayerManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new ListYandexPlayerManagerImpl$release$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((ListYandexPlayerManagerImpl$release$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListPlayerManagerAudioControl listPlayerManagerAudioControl;
        EngineReuseManager engineReuseManager;
        VideoPreloadManager videoPreloadManager;
        ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView;
        l8x l8xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        listPlayerManagerAudioControl = this.this$0.listPlayerManagerAudioControl;
        listPlayerManagerAudioControl.onRelease();
        engineReuseManager = this.this$0.engineReuseManager;
        engineReuseManager.release();
        videoPreloadManager = this.this$0.videoPreloadManager;
        videoPreloadManager.release();
        this.this$0.setCurrentActivity((AppCompatActivity) null);
        this.this$0.debugObservers.clear();
        listYandexPlayerManagerDebugView = this.this$0.debugView;
        if (listYandexPlayerManagerDebugView != null) {
            listYandexPlayerManagerDebugView.destroy();
        }
        this.this$0.debugView = null;
        this.this$0.listSdkDebugDataManager.release();
        l8xVar = this.this$0.observersControllerJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        return zy11.a;
    }
}
