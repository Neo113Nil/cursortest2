package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.smw0;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.AdConfig;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/data/AdConfig;", "", "", "pageId", "categoryId", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/AdConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/AdConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getPageId", "getCategoryId", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdConfig {
    public static final int $stable = 8;
    private final String categoryId;
    private final String pageId;
    private final Map<String, String> parameters;

    private AdConfig(String str, String str2, Map<String, String> map) {
        this.pageId = str;
        this.categoryId = str2;
        this.parameters = map;
    }

    public static /* synthetic */ AdConfig copy$default(AdConfig adConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.AdConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AdConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AdConfig.Builder builder) {
                }
            };
        }
        return adConfig.copy(tlsVar);
    }

    public final AdConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AdConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AdConfig adConfig = (AdConfig) other;
        return jl40.l(this.pageId, adConfig.pageId) && jl40.l(this.categoryId, adConfig.categoryId) && jl40.l(this.parameters, adConfig.parameters);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        int hashCode = this.pageId.hashCode() * 31;
        String str = this.categoryId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.parameters;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdConfig(pageId='");
        sb.append(this.pageId);
        sb.append("', categoryId=");
        sb.append(this.categoryId);
        sb.append(", parameters=");
        return smw0.n(sb, this.parameters, ')');
    }

    public /* synthetic */ AdConfig(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B1\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t¢\u0006\u0002\u0010\nJ\r\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/data/AdConfig$Builder;", "", "adConfig", "Lru/yandex/video/m3/data/AdConfig;", "(Lru/yandex/video/m3/data/AdConfig;)V", "pageId", "", "categoryId", "parameters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "getPageId", "setPageId", "getParameters", "()Ljava/util/Map;", "setParameters", "(Ljava/util/Map;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String categoryId;
        private String pageId;
        private Map<String, String> parameters;

        public Builder(AdConfig adConfig) {
            this(adConfig.getPageId(), adConfig.getCategoryId(), adConfig.getParameters());
        }

        public final AdConfig build$video_player_internalRelease() {
            return new AdConfig(this.pageId, this.categoryId, this.parameters, null);
        }

        public final String getCategoryId() {
            return this.categoryId;
        }

        public final String getPageId() {
            return this.pageId;
        }

        public final Map<String, String> getParameters() {
            return this.parameters;
        }

        public final void setCategoryId(String str) {
            this.categoryId = str;
        }

        public final void setPageId(String str) {
            this.pageId = str;
        }

        public final void setParameters(Map<String, String> map) {
            this.parameters = map;
        }

        public Builder(String str, String str2, Map<String, String> map) {
            this.pageId = str;
            this.categoryId = str2;
            this.parameters = map;
        }
    }
}
