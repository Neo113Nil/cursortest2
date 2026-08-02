package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class Label {
    public final String language;
    public final String value;

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
    }

    public Label(String str, String str2) {
        this.language = Util.normalizeLanguageCode(str);
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Label.class == obj.getClass()) {
            Label label = (Label) obj;
            if (Objects.equals(this.language, label.language) && Objects.equals(this.value, label.value)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.language;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
