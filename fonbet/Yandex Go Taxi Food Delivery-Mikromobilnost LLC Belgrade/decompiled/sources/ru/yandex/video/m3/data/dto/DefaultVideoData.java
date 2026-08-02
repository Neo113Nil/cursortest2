package ru.yandex.video.m3.data.dto;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.DefaultVideoData;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/data/dto/DefaultVideoData;", "Lru/yandex/video/m3/data/dto/VideoData;", "", "manifestUrl", "audioLanguage", "subtitleLanguage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/dto/DefaultVideoData$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/dto/DefaultVideoData;", "Ljava/lang/String;", "getManifestUrl", "()Ljava/lang/String;", "getAudioLanguage", "getSubtitleLanguage", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultVideoData implements VideoData {
    public static final int $stable = 0;
    private final String audioLanguage;
    private final String manifestUrl;
    private final String subtitleLanguage;

    private DefaultVideoData(String str, String str2, String str3) {
        this.manifestUrl = str;
        this.audioLanguage = str2;
        this.subtitleLanguage = str3;
    }

    public static /* synthetic */ DefaultVideoData copy$default(DefaultVideoData defaultVideoData, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.dto.DefaultVideoData$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DefaultVideoData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DefaultVideoData.Builder builder) {
                }
            };
        }
        return defaultVideoData.copy(tlsVar);
    }

    public final DefaultVideoData copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getManifestUrl() {
        return this.manifestUrl;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public /* synthetic */ DefaultVideoData(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/data/dto/DefaultVideoData$Builder;", "", "defaultVideoData", "Lru/yandex/video/m3/data/dto/DefaultVideoData;", "(Lru/yandex/video/m3/data/dto/DefaultVideoData;)V", "manifestUrl", "", "(Ljava/lang/String;)V", "audioLanguage", "getAudioLanguage", "()Ljava/lang/String;", "setAudioLanguage", "getManifestUrl", "setManifestUrl", "subtitleLanguage", "getSubtitleLanguage", "setSubtitleLanguage", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String audioLanguage;
        private String manifestUrl;
        private String subtitleLanguage;

        public Builder(DefaultVideoData defaultVideoData) {
            this(defaultVideoData.getManifestUrl());
            this.audioLanguage = defaultVideoData.getAudioLanguage();
            this.subtitleLanguage = defaultVideoData.getSubtitleLanguage();
        }

        public final DefaultVideoData build$video_player_internalRelease() {
            return new DefaultVideoData(this.manifestUrl, this.audioLanguage, this.subtitleLanguage, null);
        }

        public final String getAudioLanguage() {
            return this.audioLanguage;
        }

        public final String getManifestUrl() {
            return this.manifestUrl;
        }

        public final String getSubtitleLanguage() {
            return this.subtitleLanguage;
        }

        public final void setAudioLanguage(String str) {
            this.audioLanguage = str;
        }

        public final void setManifestUrl(String str) {
            this.manifestUrl = str;
        }

        public final void setSubtitleLanguage(String str) {
            this.subtitleLanguage = str;
        }

        public Builder(String str) {
            this.manifestUrl = str;
        }
    }
}
