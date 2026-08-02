package app.cash.local.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalEditorialText {
    public final Alignment alignment;
    public final LocalColor color;
    public final Font font;
    public final Integer maxLines;
    public final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Alignment {
        public static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment CENTER;
        public static final Alignment END;
        public static final Alignment START;

        static {
            Alignment alignment = new Alignment("START", 0);
            START = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            CENTER = alignment2;
            Alignment alignment3 = new Alignment("END", 2);
            END = alignment3;
            $VALUES = new Alignment[]{alignment, alignment2, alignment3};
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public final class Font {
        public final Long size;
        public final Weight weight;

        public Font(Long l, Weight weight) {
            this.size = l;
            this.weight = weight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Font)) {
                return false;
            }
            Font font = (Font) obj;
            return Intrinsics.areEqual(this.size, font.size) && this.weight == font.weight;
        }

        public final int hashCode() {
            Long l = this.size;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Weight weight = this.weight;
            return hashCode + (weight != null ? weight.hashCode() : 0);
        }

        public final String toString() {
            return "Font(size=" + this.size + ", weight=" + this.weight + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Weight {
        public static final /* synthetic */ Weight[] $VALUES;
        public static final Weight BOLD;
        public static final Weight MEDIUM;
        public static final Weight NORMAL;
        public static final Weight SEMIBOLD;

        static {
            Weight weight = new Weight("NORMAL", 0);
            NORMAL = weight;
            Weight weight2 = new Weight("MEDIUM", 1);
            MEDIUM = weight2;
            Weight weight3 = new Weight("SEMIBOLD", 2);
            SEMIBOLD = weight3;
            Weight weight4 = new Weight("BOLD", 3);
            BOLD = weight4;
            $VALUES = new Weight[]{weight, weight2, weight3, weight4};
        }

        public static Weight valueOf(String str) {
            return (Weight) Enum.valueOf(Weight.class, str);
        }

        public static Weight[] values() {
            return (Weight[]) $VALUES.clone();
        }
    }

    public LocalEditorialText(String str, Font font, LocalColor localColor, Alignment alignment, Integer num) {
        this.value = str;
        this.font = font;
        this.color = localColor;
        this.alignment = alignment;
        this.maxLines = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalEditorialText)) {
            return false;
        }
        LocalEditorialText localEditorialText = (LocalEditorialText) obj;
        return this.value.equals(localEditorialText.value) && Intrinsics.areEqual(this.font, localEditorialText.font) && Intrinsics.areEqual(this.color, localEditorialText.color) && this.alignment == localEditorialText.alignment && Intrinsics.areEqual(this.maxLines, localEditorialText.maxLines);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        Font font = this.font;
        int hashCode2 = (hashCode + (font == null ? 0 : font.hashCode())) * 31;
        LocalColor localColor = this.color;
        int hashCode3 = (hashCode2 + (localColor == null ? 0 : localColor.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int hashCode4 = (hashCode3 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        Integer num = this.maxLines;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalEditorialText(value=");
        sb.append(this.value);
        sb.append(", font=");
        sb.append(this.font);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", maxLines=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.maxLines, ")");
    }
}
