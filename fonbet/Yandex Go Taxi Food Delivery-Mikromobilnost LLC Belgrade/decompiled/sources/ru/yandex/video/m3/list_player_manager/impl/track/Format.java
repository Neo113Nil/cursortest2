package ru.yandex.video.m3.list_player_manager.impl.track;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001'BG\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "", "", "width", "height", "bitrate", "", "frameRate", "", "label", "language", "iso3Language", "<init>", "(IIIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/impl/track/Format$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getWidth", "getHeight", "getBitrate", "F", "getFrameRate", "()F", "Ljava/lang/String;", "getLabel", "getLanguage", "getIso3Language", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Format {
    public static final int $stable = 0;
    private final int bitrate;
    private final float frameRate;
    private final int height;
    private final String iso3Language;
    private final String label;
    private final String language;
    private final int width;

    private Format(int i, int i2, int i3, float f, String str, String str2, String str3) {
        this.width = i;
        this.height = i2;
        this.bitrate = i3;
        this.frameRate = f;
        this.label = str;
        this.language = str2;
        this.iso3Language = str3;
    }

    public final Format copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Format.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Format format = (Format) other;
        return this.width == format.width && this.height == format.height && this.bitrate == format.bitrate && this.frameRate == format.frameRate && jl40.l(this.label, format.label) && jl40.l(this.language, format.language) && jl40.l(this.iso3Language, format.iso3Language);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getIso3Language() {
        return this.iso3Language;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int c = g8e.c(this.frameRate, ((((this.width * 31) + this.height) * 31) + this.bitrate) * 31, 31);
        String str = this.label;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.language;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.iso3Language;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(bitrate=");
        sb.append(this.bitrate);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", iso3Language=");
        return b64.p(sb, this.iso3Language, ')');
    }

    public /* synthetic */ Format(int i, int i2, int i3, float f, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, str, str2, str3);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000f¨\u0006%"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/Format$Builder;", "", "format", "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "(Lru/yandex/video/m3/list_player_manager/impl/track/Format;)V", "width", "", "height", "bitrate", "frameRate", "", "(IIIF)V", "getBitrate", "()I", "setBitrate", "(I)V", "getFrameRate", "()F", "setFrameRate", "(F)V", "getHeight", "setHeight", "iso3Language", "", "getIso3Language", "()Ljava/lang/String;", "setIso3Language", "(Ljava/lang/String;)V", "label", "getLabel", "setLabel", "language", "getLanguage", "setLanguage", "getWidth", "setWidth", "build", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private int bitrate;
        private float frameRate;
        private int height;
        private String iso3Language;
        private String label;
        private String language;
        private int width;

        public Builder(Format format) {
            this(format.getWidth(), format.getHeight(), format.getBitrate(), format.getFrameRate());
            this.label = format.getLabel();
            this.language = format.getLanguage();
            this.iso3Language = format.getIso3Language();
        }

        public final Format build() {
            return new Format(this.width, this.height, this.bitrate, this.frameRate, this.label, this.language, this.iso3Language, null);
        }

        public final int getBitrate() {
            return this.bitrate;
        }

        public final float getFrameRate() {
            return this.frameRate;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getIso3Language() {
            return this.iso3Language;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setBitrate(int i) {
            this.bitrate = i;
        }

        public final void setFrameRate(float f) {
            this.frameRate = f;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setIso3Language(String str) {
            this.iso3Language = str;
        }

        public final void setLabel(String str) {
            this.label = str;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setWidth(int i) {
            this.width = i;
        }

        public Builder(int i, int i2, int i3, float f) {
            this.width = i;
            this.height = i2;
            this.bitrate = i3;
            this.frameRate = f;
        }
    }
}
