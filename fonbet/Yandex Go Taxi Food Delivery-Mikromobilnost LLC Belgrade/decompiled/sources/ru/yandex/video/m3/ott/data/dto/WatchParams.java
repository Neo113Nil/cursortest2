package ru.yandex.video.m3.ott.data.dto;

import defpackage.b64;
import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/WatchParams;", "", "contentId", "", "audioLanguage", "subtitleLanguage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioLanguage", "()Ljava/lang/String;", "getContentId", "getSubtitleLanguage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class WatchParams {
    public static final int $stable = 0;
    private final String audioLanguage;

    @ysq0("uuid")
    private final String contentId;
    private final String subtitleLanguage;

    public WatchParams(String str, String str2, String str3) {
        this.contentId = str;
        this.audioLanguage = str2;
        this.subtitleLanguage = str3;
    }

    public static /* synthetic */ WatchParams copy$default(WatchParams watchParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchParams.contentId;
        }
        if ((i & 2) != 0) {
            str2 = watchParams.audioLanguage;
        }
        if ((i & 4) != 0) {
            str3 = watchParams.subtitleLanguage;
        }
        return watchParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudioLanguage() {
        return this.audioLanguage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public final WatchParams copy(String contentId, String audioLanguage, String subtitleLanguage) {
        return new WatchParams(contentId, audioLanguage, subtitleLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchParams)) {
            return false;
        }
        WatchParams watchParams = (WatchParams) other;
        return jl40.l(this.contentId, watchParams.contentId) && jl40.l(this.audioLanguage, watchParams.audioLanguage) && jl40.l(this.subtitleLanguage, watchParams.subtitleLanguage);
    }

    public final String getAudioLanguage() {
        return this.audioLanguage;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public int hashCode() {
        String str = this.contentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.audioLanguage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleLanguage;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WatchParams(contentId=");
        sb.append(this.contentId);
        sb.append(", audioLanguage=");
        sb.append(this.audioLanguage);
        sb.append(", subtitleLanguage=");
        return b64.p(sb, this.subtitleLanguage, ')');
    }
}
