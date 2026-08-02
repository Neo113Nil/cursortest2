package ru.yandex.video.m3.list_player_manager.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/FirstFrameData;", "", "url", "", "hash", "(Ljava/lang/String;Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "getUrl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirstFrameData {
    public static final int $stable = 0;
    private final String hash;
    private final String url;

    public /* synthetic */ FirstFrameData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getUrl() {
        return this.url;
    }

    public FirstFrameData(String str, String str2) {
        this.url = str;
        this.hash = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FirstFrameData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
