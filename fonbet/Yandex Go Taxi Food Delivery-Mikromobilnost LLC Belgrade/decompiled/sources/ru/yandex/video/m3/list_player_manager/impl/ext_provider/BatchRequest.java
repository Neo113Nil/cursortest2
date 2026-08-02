package ru.yandex.video.m3.list_player_manager.impl.ext_provider;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u000b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ext_provider/BatchRequest;", "", "", "", "contentIds", "<init>", "(Ljava/lang/Iterable;)V", "", "Lkotlin/Result;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "complete", "(Ljava/util/Map;)V", "Ljava/lang/Iterable;", "getContentIds", "()Ljava/lang/Iterable;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BatchRequest {
    public static final int $stable = 8;
    private final Iterable<String> contentIds;

    public BatchRequest(Iterable<String> iterable) {
        this.contentIds = iterable;
    }

    public abstract void complete(Map<String, Result<MediaData>> result);

    public final Iterable<String> getContentIds() {
        return this.contentIds;
    }
}
