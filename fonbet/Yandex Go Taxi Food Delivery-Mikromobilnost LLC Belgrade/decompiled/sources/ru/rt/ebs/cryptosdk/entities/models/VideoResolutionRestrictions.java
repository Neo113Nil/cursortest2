package ru.rt.ebs.cryptosdk.entities.models;

import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;", "", "minResolution", "Lru/rt/ebs/cryptosdk/entities/models/VideoResolution;", "maxResolution", "<init>", "(Lru/rt/ebs/cryptosdk/entities/models/VideoResolution;Lru/rt/ebs/cryptosdk/entities/models/VideoResolution;)V", "getMinResolution", "()Lru/rt/ebs/cryptosdk/entities/models/VideoResolution;", "getMaxResolution", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoResolutionRestrictions {
    private final VideoResolution maxResolution;
    private final VideoResolution minResolution;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions$Builder;", "", "<init>", "()V", "buildDefault", "Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;", "build", "minResolutionWidth", "", "minResolutionHeight", "maxResolutionWidth", "maxResolutionHeight", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        public final VideoResolutionRestrictions build(int minResolutionWidth, int minResolutionHeight, int maxResolutionWidth, int maxResolutionHeight) {
            return new VideoResolutionRestrictions(new VideoResolution(minResolutionWidth, minResolutionHeight), new VideoResolution(maxResolutionWidth, maxResolutionHeight));
        }

        public final VideoResolutionRestrictions buildDefault() {
            return new VideoResolutionRestrictions(new VideoResolution(720, 1280), new VideoResolution(2160, 3840));
        }
    }

    public VideoResolutionRestrictions(VideoResolution videoResolution, VideoResolution videoResolution2) {
        this.minResolution = videoResolution;
        this.maxResolution = videoResolution2;
    }

    public static /* synthetic */ VideoResolutionRestrictions copy$default(VideoResolutionRestrictions videoResolutionRestrictions, VideoResolution videoResolution, VideoResolution videoResolution2, int i, Object obj) {
        if ((i & 1) != 0) {
            videoResolution = videoResolutionRestrictions.minResolution;
        }
        if ((i & 2) != 0) {
            videoResolution2 = videoResolutionRestrictions.maxResolution;
        }
        return videoResolutionRestrictions.copy(videoResolution, videoResolution2);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoResolution getMinResolution() {
        return this.minResolution;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoResolution getMaxResolution() {
        return this.maxResolution;
    }

    public final VideoResolutionRestrictions copy(VideoResolution minResolution, VideoResolution maxResolution) {
        return new VideoResolutionRestrictions(minResolution, maxResolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoResolutionRestrictions)) {
            return false;
        }
        VideoResolutionRestrictions videoResolutionRestrictions = (VideoResolutionRestrictions) other;
        return jl40.l(this.minResolution, videoResolutionRestrictions.minResolution) && jl40.l(this.maxResolution, videoResolutionRestrictions.maxResolution);
    }

    public final VideoResolution getMaxResolution() {
        return this.maxResolution;
    }

    public final VideoResolution getMinResolution() {
        return this.minResolution;
    }

    public int hashCode() {
        return this.maxResolution.hashCode() + (this.minResolution.hashCode() * 31);
    }

    public String toString() {
        return "VideoResolutionRestrictions(minResolution=" + this.minResolution + ", maxResolution=" + this.maxResolution + Extension.C_BRAKE;
    }
}
