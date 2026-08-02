package androidx.compose.material3.internal;

import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class DateInputFormat {
    public final char delimiter;
    public final String patternWithDelimiters;
    public final String patternWithoutDelimiters;

    public DateInputFormat(String str, char c) {
        this.patternWithDelimiters = str;
        this.delimiter = c;
        this.patternWithoutDelimiters = StringsKt__StringsJVMKt.replace$default(str, String.valueOf(c), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return this.patternWithDelimiters.equals(dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final int hashCode() {
        return Character.hashCode(this.delimiter) + (this.patternWithDelimiters.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }
}
