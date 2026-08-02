package ru.yandex.video.m3.list_player_manager.impl.image;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1", f = "GlideBitmapDownloader.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1 extends SuspendLambda implements tls {
    final /* synthetic */ MediaData $mediaItem;
    final /* synthetic */ ListYandexPlayerView $view;
    int label;
    final /* synthetic */ GlideBitmapDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1(MediaData mediaData, GlideBitmapDownloader glideBitmapDownloader, ListYandexPlayerView listYandexPlayerView, Continuation<? super GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1> continuation) {
        super(1, continuation);
        this.$mediaItem = mediaData;
        this.this$0 = glideBitmapDownloader;
        this.$view = listYandexPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Continuation<?> continuation) {
        return new GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1(this.$mediaItem, this.this$0, this.$view, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Continuation<? super zy11> continuation) {
        return ((GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1) create(continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startLoadImageIntoViewIfNecessary;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String firstFrameUrl = this.$mediaItem.getFirstFrameUrl();
            if (firstFrameUrl == null) {
                firstFrameUrl = this.this$0.getCachedFirstFrameUrl(this.$mediaItem.getVideoContentId());
            }
            String str = firstFrameUrl;
            String firstFrameHash = this.$mediaItem.getFirstFrameHash();
            if (firstFrameHash == null) {
                firstFrameHash = this.this$0.getCachedFirstFrameHash(this.$mediaItem.getVideoContentId());
            }
            GlideBitmapDownloader glideBitmapDownloader = this.this$0;
            String videoContentId = this.$mediaItem.getVideoContentId();
            ListYandexPlayerView listYandexPlayerView = this.$view;
            this.label = 1;
            startLoadImageIntoViewIfNecessary = glideBitmapDownloader.startLoadImageIntoViewIfNecessary(str, firstFrameHash, videoContentId, listYandexPlayerView, this);
            if (startLoadImageIntoViewIfNecessary == coroutineSingletons) {
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
}
