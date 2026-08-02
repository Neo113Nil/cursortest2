package ru.yandex.video.m3.list_player_manager.impl.ext_provider;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ext_provider/SingleRequest;", "", "", "contentId", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Result;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "complete", "(Ljava/lang/Object;)V", "Ljava/lang/String;", "getContentId", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SingleRequest {
    public static final int $stable = 0;
    private final String contentId;

    public SingleRequest(String str) {
        this.contentId = str;
    }

    public abstract void complete(Object result);

    public final String getContentId() {
        return this.contentId;
    }
}
