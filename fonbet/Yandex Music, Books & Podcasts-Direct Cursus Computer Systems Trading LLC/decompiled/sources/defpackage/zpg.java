package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zpg {
    public final Locale a;

    public zpg(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zpg)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.d(this.a.toLanguageTag(), ((zpg) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
