package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/data/Decoder;", "", "name", "", "inits", "", "reuses", "releases", "isHardwareAccelerated", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getInits", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "getReleases", "getReuses", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Decoder {
    public static final int $stable = 0;
    private final Integer inits;
    private final Boolean isHardwareAccelerated;
    private final String name;
    private final Integer releases;
    private final Integer reuses;

    public Decoder(String str, Integer num, Integer num2, Integer num3, Boolean bool) {
        this.name = str;
        this.inits = num;
        this.reuses = num2;
        this.releases = num3;
        this.isHardwareAccelerated = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Decoder.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Decoder decoder = (Decoder) other;
        return jl40.l(this.name, decoder.name) && jl40.l(this.inits, decoder.inits) && jl40.l(this.reuses, decoder.reuses) && jl40.l(this.releases, decoder.releases) && jl40.l(this.isHardwareAccelerated, decoder.isHardwareAccelerated);
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
        int hashCode = this.name.hashCode() * 31;
        Integer num = this.inits;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.reuses;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.releases;
        int intValue3 = (intValue2 + (num3 != null ? num3.intValue() : 0)) * 31;
        Boolean bool = this.isHardwareAccelerated;
        return intValue3 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: isHardwareAccelerated, reason: from getter */
    public final Boolean getIsHardwareAccelerated() {
        return this.isHardwareAccelerated;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Decoder(name=");
        sb.append(this.name);
        sb.append(", inits=");
        sb.append(this.inits);
        sb.append(", reuses=");
        sb.append(this.reuses);
        sb.append(", releases=");
        sb.append(this.releases);
        sb.append(", isHardwareAccelerated=");
        return oo31.i(sb, this.isHardwareAccelerated, ')');
    }
}
