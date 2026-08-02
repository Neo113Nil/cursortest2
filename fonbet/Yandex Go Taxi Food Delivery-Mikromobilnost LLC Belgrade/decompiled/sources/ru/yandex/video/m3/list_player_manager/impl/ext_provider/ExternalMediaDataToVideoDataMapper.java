package ru.yandex.video.m3.list_player_manager.impl.ext_provider;

import defpackage.g8e;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.MediaDataKt;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoDataKt;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataToVideoDataMapper;", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "externalMediaDataProvider", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "(Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;)V", "getVideoData", "Lkotlin/Result;", "contentId", "", "getVideoData-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contentIds", "", "loadVideoData", "Ljava/util/concurrent/Future;", "toVhVideoData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "toVhVideoData-bjn95JY", "(Ljava/lang/Object;)Ljava/lang/Object;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalMediaDataToVideoDataMapper implements VideoDataRepository<VhVideoData> {
    public static final int $stable = 8;
    private final ExternalMediaDataProvider externalMediaDataProvider;

    public ExternalMediaDataToVideoDataMapper(ExternalMediaDataProvider externalMediaDataProvider) {
        this.externalMediaDataProvider = externalMediaDataProvider;
    }

    /* renamed from: toVhVideoData-bjn95JY, reason: not valid java name */
    private final Object m742toVhVideoDatabjn95JY(Object obj) {
        boolean z = obj instanceof Result.Failure;
        if (z) {
            Throwable a = Result.a(obj);
            if (a == null) {
                a = new IllegalArgumentException("Unknown external error");
            }
            return new Result.Failure(a);
        }
        if (z) {
            obj = null;
        }
        final MediaData mediaData = (MediaData) obj;
        if (mediaData == null) {
            return new Result.Failure(new IllegalArgumentException("externalMediaData is null"));
        }
        String streamFromMediaData = UtilKt.streamFromMediaData(MediaDataKt.MediaData$default(mediaData.getStreams(), null, 2, null));
        if (streamFromMediaData != null && mediaData.getVideoContentId() != null) {
            return VhVideoDataKt.VhVideoData(streamFromMediaData, mediaData.getVideoContentId(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ext_provider.ExternalMediaDataToVideoDataMapper$toVhVideoData$1
                {
                    super(1);
                }

                public final void invoke(VhVideoData.Builder builder) {
                    builder.setFirstFrameUrl(MediaData.this.getFirstFrameUrl());
                    builder.setFirstFrameHash(MediaData.this.getFirstFrameHash());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VhVideoData.Builder) obj2);
                    return zy11.a;
                }
            });
        }
        return new Result.Failure(new IllegalArgumentException("ExternalMediaData does not have necessary fields. " + mediaData));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository
    public Map<String, Result<VhVideoData>> getVideoData(final Iterable<String> contentIds) {
        Result result;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.externalMediaDataProvider.resolve(new BatchRequest(contentIds) { // from class: ru.yandex.video.m3.list_player_manager.impl.ext_provider.ExternalMediaDataToVideoDataMapper$getVideoData$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ru.yandex.video.m3.list_player_manager.impl.ext_provider.BatchRequest
            public void complete(Map<String, Result<MediaData>> result2) {
                ref$ObjectRef.element = result2;
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : contentIds) {
            Map map = (Map) ref$ObjectRef.element;
            linkedHashMap.put(str, new Result((map == null || (result = (Result) map.get(str)) == null) ? new Result.Failure(new RuntimeException(g8e.o("Did not received data from externalMediaDataProvider for ", str))) : m742toVhVideoDatabjn95JY(result.getValue())));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository
    /* renamed from: getVideoData-IoAF18A */
    public Object mo741getVideoDataIoAF18A(final String contentId) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.externalMediaDataProvider.resolve(new SingleRequest(contentId) { // from class: ru.yandex.video.m3.list_player_manager.impl.ext_provider.ExternalMediaDataToVideoDataMapper$getVideoData$1
            /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.Result] */
            @Override // ru.yandex.video.m3.list_player_manager.impl.ext_provider.SingleRequest
            public void complete(Object result) {
                ref$ObjectRef.element = new Result(result);
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        Result result = (Result) ref$ObjectRef.element;
        return result != null ? m742toVhVideoDatabjn95JY(result.getValue()) : new Result.Failure(new RuntimeException("Did not received data from externalMediaDataProvider for ".concat(contentId)));
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<VhVideoData> loadVideoData(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ext_provider.ExternalMediaDataToVideoDataMapper$loadVideoData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VhVideoData invoke() {
                Object mo741getVideoDataIoAF18A = ExternalMediaDataToVideoDataMapper.this.mo741getVideoDataIoAF18A(contentId);
                b.b(mo741getVideoDataIoAF18A);
                return (VhVideoData) mo741getVideoDataIoAF18A;
            }
        });
    }
}
