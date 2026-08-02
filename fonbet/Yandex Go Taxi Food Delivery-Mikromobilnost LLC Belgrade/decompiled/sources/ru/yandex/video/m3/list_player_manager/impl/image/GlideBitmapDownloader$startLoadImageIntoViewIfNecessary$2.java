package ru.yandex.video.m3.list_player_manager.impl.image;

import defpackage.iax0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5j0;
import defpackage.ph91;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$FirstFrameDrawableTarget;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$FirstFrameDrawableTarget;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2", f = "GlideBitmapDownloader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2 extends SuspendLambda implements wls {
    final /* synthetic */ p5j0 $req;
    final /* synthetic */ ListYandexPlayerView $view;
    int label;
    final /* synthetic */ GlideBitmapDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2(p5j0 p5j0Var, GlideBitmapDownloader glideBitmapDownloader, ListYandexPlayerView listYandexPlayerView, Continuation<? super GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2> continuation) {
        super(2, continuation);
        this.$req = p5j0Var;
        this.this$0 = glideBitmapDownloader;
        this.$view = listYandexPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2(this.$req, this.this$0, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super GlideBitmapDownloader.FirstFrameDrawableTarget> continuation) {
        return ((GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlayerLogger playerLogger;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        p5j0 p5j0Var = this.$req;
        playerLogger = this.this$0.playerLogger;
        iax0 firstFrameDrawableTarget = new GlideBitmapDownloader.FirstFrameDrawableTarget(playerLogger, this.$view);
        p5j0Var.F(firstFrameDrawableTarget, null, p5j0Var, ph91.a);
        return firstFrameDrawableTarget;
    }
}
