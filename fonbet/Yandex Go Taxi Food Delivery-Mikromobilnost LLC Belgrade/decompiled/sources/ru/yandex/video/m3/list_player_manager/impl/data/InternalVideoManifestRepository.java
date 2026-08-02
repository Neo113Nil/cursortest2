package ru.yandex.video.m3.list_player_manager.impl.data;

import defpackage.evu0;
import defpackage.gw00;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ?\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0018\u00010\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestRepository;", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "manifestApi", "Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApi;", "vpuid", "", "(Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApi;Ljava/lang/String;)V", "findVideoData", "Lkotlin/Result;", "contentId", "videoDataMap", "", "findVideoData-gIAlu-s", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;", "getVideoData", "getVideoData-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "contentIds", "", "loadVideoData", "Ljava/util/concurrent/Future;", "parseLoadError", "", "throwable", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVideoManifestRepository implements VideoDataRepository<VhVideoData>, ManifestRepository<VhVideoData> {
    public static final int $stable = 8;
    private final InternalVideoManifestApi manifestApi;
    private final String vpuid;

    public InternalVideoManifestRepository(InternalVideoManifestApi internalVideoManifestApi, String str) {
        this.manifestApi = internalVideoManifestApi;
        this.vpuid = str;
    }

    /* renamed from: findVideoData-gIAlu-s, reason: not valid java name */
    private final Object m740findVideoDatagIAlus(final String contentId, Map<String, Result<VhVideoData>> videoDataMap) {
        Result result;
        if (videoDataMap != null) {
            Iterator<Map.Entry<String, Result<VhVideoData>>> it = videoDataMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    result = null;
                    break;
                }
                Map.Entry<String, Result<VhVideoData>> next = it.next();
                String key = next.getKey();
                Object value = next.getValue().getValue();
                if (evu0.y(key, contentId, false)) {
                    if (!(value instanceof Result.Failure)) {
                        value = ((VhVideoData) value).copy(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestRepository$findVideoData$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((VhVideoData.Builder) obj);
                                return zy11.a;
                            }

                            public final void invoke(VhVideoData.Builder builder) {
                                builder.setContentId(contentId);
                            }
                        });
                    }
                    result = new Result(value);
                } else {
                    result = null;
                }
                if (result != null) {
                    break;
                }
            }
            if (result != null) {
                return result.getValue();
            }
        }
        return new Result.Failure(new ManifestLoadingException.NotFound(null, null, 3, null));
    }

    private final Throwable parseLoadError(Throwable throwable) {
        return throwable instanceof IOException ? new ManifestLoadingException.ConnectionError(throwable, null, 2, null) : ((throwable instanceof ExecutionException) && (throwable.getCause() instanceof IOException)) ? new ManifestLoadingException.ConnectionError(throwable.getCause(), null, 2, null) : throwable;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository
    public Map<String, Result<VhVideoData>> getVideoData(Iterable<String> contentIds) {
        Object failure;
        try {
            failure = InternalVideoManifestResponseParser.INSTANCE.parseManifestResponse(this.manifestApi.loadManifests(this.vpuid, contentIds).get());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            int d = gw00.d(tcc.n(contentIds, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(d >= 16 ? d : 16);
            Iterator<String> it = contentIds.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), new Result(new Result.Failure(parseLoadError(a))));
            }
            return linkedHashMap;
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Map<String, Result<VhVideoData>> map = (Map) failure;
        int d2 = gw00.d(tcc.n(contentIds, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (String str : contentIds) {
            linkedHashMap2.put(str, new Result(m740findVideoDatagIAlus(str, map)));
        }
        return linkedHashMap2;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository
    /* renamed from: getVideoData-IoAF18A, reason: not valid java name */
    public Object mo741getVideoDataIoAF18A(String contentId) {
        Result<VhVideoData> result = getVideoData(Collections.singletonList(contentId)).get(contentId);
        return result != null ? result.getValue() : new Result.Failure(new ManifestLoadingException.NotFound(null, null, 3, null));
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<VhVideoData> loadVideoData(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestRepository$loadVideoData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VhVideoData invoke() {
                Object mo741getVideoDataIoAF18A = InternalVideoManifestRepository.this.mo741getVideoDataIoAF18A(contentId);
                b.b(mo741getVideoDataIoAF18A);
                return (VhVideoData) mo741getVideoDataIoAF18A;
            }
        });
    }
}
