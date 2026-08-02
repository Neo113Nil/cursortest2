package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "", "id", "", "name", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLang", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SubtitleTrackData {
    public static final int $stable = 0;
    private final transient String id;
    private final String lang;
    private final String name;

    public SubtitleTrackData(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.lang = str3;
    }

    public static /* synthetic */ SubtitleTrackData copy$default(SubtitleTrackData subtitleTrackData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subtitleTrackData.id;
        }
        if ((i & 2) != 0) {
            str2 = subtitleTrackData.name;
        }
        if ((i & 4) != 0) {
            str3 = subtitleTrackData.lang;
        }
        return subtitleTrackData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    public final SubtitleTrackData copy(String id, String name, String lang) {
        return new SubtitleTrackData(id, name, lang);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleTrackData)) {
            return false;
        }
        SubtitleTrackData subtitleTrackData = (SubtitleTrackData) other;
        return jl40.l(this.id, subtitleTrackData.id) && jl40.l(this.name, subtitleTrackData.name) && jl40.l(this.lang, subtitleTrackData.lang);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.lang;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubtitleTrackData(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", lang=");
        return b64.p(sb, this.lang, ')');
    }
}
