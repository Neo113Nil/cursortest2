package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "", "name", "", "inits", "", "reuses", "releases", "hardwareAccelerated", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getHardwareAccelerated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInits", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getReleases", "getReuses", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DecoderData {
    public static final int $stable = 0;
    private final Boolean hardwareAccelerated;
    private final Integer inits;
    private final String name;
    private final Integer releases;
    private final Integer reuses;

    public /* synthetic */ DecoderData(String str, Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? 0 : num3, (i & 16) != 0 ? null : bool);
    }

    public static /* synthetic */ DecoderData copy$default(DecoderData decoderData, String str, Integer num, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = decoderData.name;
        }
        if ((i & 2) != 0) {
            num = decoderData.inits;
        }
        if ((i & 4) != 0) {
            num2 = decoderData.reuses;
        }
        if ((i & 8) != 0) {
            num3 = decoderData.releases;
        }
        if ((i & 16) != 0) {
            bool = decoderData.hardwareAccelerated;
        }
        Boolean bool2 = bool;
        Integer num4 = num2;
        return decoderData.copy(str, num, num4, num3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getInits() {
        return this.inits;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getReuses() {
        return this.reuses;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getReleases() {
        return this.releases;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final DecoderData copy(String name, Integer inits, Integer reuses, Integer releases, Boolean hardwareAccelerated) {
        return new DecoderData(name, inits, reuses, releases, hardwareAccelerated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecoderData)) {
            return false;
        }
        DecoderData decoderData = (DecoderData) other;
        return jl40.l(this.name, decoderData.name) && jl40.l(this.inits, decoderData.inits) && jl40.l(this.reuses, decoderData.reuses) && jl40.l(this.releases, decoderData.releases) && jl40.l(this.hardwareAccelerated, decoderData.hardwareAccelerated);
    }

    public final Boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final Integer getInits() {
        return this.inits;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getReleases() {
        return this.releases;
    }

    public final Integer getReuses() {
        return this.reuses;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.inits;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reuses;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.releases;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.hardwareAccelerated;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderData(name=");
        sb.append(this.name);
        sb.append(", inits=");
        sb.append(this.inits);
        sb.append(", reuses=");
        sb.append(this.reuses);
        sb.append(", releases=");
        sb.append(this.releases);
        sb.append(", hardwareAccelerated=");
        return oo31.i(sb, this.hardwareAccelerated, ')');
    }

    public DecoderData(String str, Integer num, Integer num2, Integer num3, Boolean bool) {
        this.name = str;
        this.inits = num;
        this.reuses = num2;
        this.releases = num3;
        this.hardwareAccelerated = bool;
    }

    public DecoderData() {
        this(null, null, null, null, null, 31, null);
    }
}
