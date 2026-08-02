package androidx.compose.material3;

import androidx.compose.material3.internal.Icons$Filled;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DatePickerFormatterImpl {
    public final LinkedHashMap formatterCache = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return obj instanceof DatePickerFormatterImpl;
    }

    public final String formatDate(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return Icons$Filled.formatWithSkeleton(l.longValue(), z ? "yMMMMEEEEd" : "yMMMd", locale, this.formatterCache);
    }

    public final int hashCode() {
        return 436998964;
    }
}
