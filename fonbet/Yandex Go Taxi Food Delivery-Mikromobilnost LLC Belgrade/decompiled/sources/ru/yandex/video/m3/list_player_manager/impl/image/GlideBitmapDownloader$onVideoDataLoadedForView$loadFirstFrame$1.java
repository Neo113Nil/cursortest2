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
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1", f = "GlideBitmapDownloader.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1 extends SuspendLambda implements tls {
    final /* synthetic */ VhVideoData $vhVideoData;
    final /* synthetic */ ListYandexPlayerView $view;
    int label;
    final /* synthetic */ GlideBitmapDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1(VhVideoData vhVideoData, GlideBitmapDownloader glideBitmapDownloader, ListYandexPlayerView listYandexPlayerView, Continuation<? super GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1> continuation) {
        super(1, continuation);
        this.$vhVideoData = vhVideoData;
        this.this$0 = glideBitmapDownloader;
        this.$view = listYandexPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Continuation<?> continuation) {
        return new GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1(this.$vhVideoData, this.this$0, this.$view, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Continuation<? super zy11> continuation) {
        return ((GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1) create(continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String cachedFirstFrameUrl;
        String cachedFirstFrameHash;
        Object startLoadImageIntoViewIfNecessary;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            VhVideoData vhVideoData = this.$vhVideoData;
            if (vhVideoData == null || (cachedFirstFrameUrl = vhVideoData.getFirstFrameUrl()) == null) {
                GlideBitmapDownloader glideBitmapDownloader = this.this$0;
                VhVideoData vhVideoData2 = this.$vhVideoData;
                cachedFirstFrameUrl = glideBitmapDownloader.getCachedFirstFrameUrl(vhVideoData2 != null ? vhVideoData2.getContentId() : null);
            }
            String str = cachedFirstFrameUrl;
            VhVideoData vhVideoData3 = this.$vhVideoData;
            if (vhVideoData3 == null || (cachedFirstFrameHash = vhVideoData3.getFirstFrameHash()) == null) {
                GlideBitmapDownloader glideBitmapDownloader2 = this.this$0;
                VhVideoData vhVideoData4 = this.$vhVideoData;
                cachedFirstFrameHash = glideBitmapDownloader2.getCachedFirstFrameHash(vhVideoData4 != null ? vhVideoData4.getContentId() : null);
            }
            String str2 = cachedFirstFrameHash;
            GlideBitmapDownloader glideBitmapDownloader3 = this.this$0;
            VhVideoData vhVideoData5 = this.$vhVideoData;
            String contentId = vhVideoData5 != null ? vhVideoData5.getContentId() : null;
            ListYandexPlayerView listYandexPlayerView = this.$view;
            this.label = 1;
            startLoadImageIntoViewIfNecessary = glideBitmapDownloader3.startLoadImageIntoViewIfNecessary(str, str2, contentId, listYandexPlayerView, this);
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
