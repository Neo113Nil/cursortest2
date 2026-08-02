package ru.yandex.video.m3.player.baseurls;

import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/baseurls/BaseUrl;", "", "url", "", "index", "", "(Ljava/lang/String;I)V", "getIndex", "()I", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BaseUrl {
    public static final int $stable = 0;
    private final int index;
    private final String url;

    public BaseUrl(String str, int i) {
        this.url = str;
        this.index = i;
    }

    public static /* synthetic */ BaseUrl copy$default(BaseUrl baseUrl, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = baseUrl.url;
        }
        if ((i2 & 2) != 0) {
            i = baseUrl.index;
        }
        return baseUrl.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final BaseUrl copy(String url, int index) {
        return new BaseUrl(url, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseUrl)) {
            return false;
        }
        BaseUrl baseUrl = (BaseUrl) other;
        return jl40.l(this.url, baseUrl.url) && this.index == baseUrl.index;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.url.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseUrl(url=");
        sb.append(this.url);
        sb.append(", index=");
        return oyr.s(sb, this.index, ')');
    }
}
