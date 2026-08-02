package ru.rt.ebs.cryptosdk.entities.models;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.oyr;
import defpackage.t1i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/ThemeDesignOptions;", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", "<init>", "(I)V", "getTheme", "()I", "Builder", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeDesignOptions extends DesignOptions {
    private final int theme;

    private ThemeDesignOptions(int i) {
        super(null);
        this.theme = i;
    }

    public final int getTheme() {
        return this.theme;
    }

    public /* synthetic */ ThemeDesignOptions(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/ThemeDesignOptions$Builder;", "", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", "<init>", "(I)V", "build", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Builder {
        private int theme;

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? t1i0.EbsTheme : i);
        }

        /* renamed from: component1, reason: from getter */
        private final int getTheme() {
            return this.theme;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = builder.theme;
            }
            return builder.copy(i);
        }

        public final DesignOptions build() {
            return new ThemeDesignOptions(this.theme, null);
        }

        public final Builder copy(int theme) {
            return new Builder(theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Builder) && this.theme == ((Builder) other).theme;
        }

        public int hashCode() {
            return Integer.hashCode(this.theme);
        }

        public final Builder theme(int theme) {
            this.theme = theme;
            return this;
        }

        public String toString() {
            return oyr.j(this.theme, "Builder(theme=", Extension.C_BRAKE);
        }

        public Builder(int i) {
            this.theme = i;
        }

        public Builder() {
            this(0, 1, null);
        }
    }
}
