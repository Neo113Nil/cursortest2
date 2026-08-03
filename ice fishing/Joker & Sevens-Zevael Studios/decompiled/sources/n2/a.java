package n2;

import java.util.Locale;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f5040a;

    public a(Locale locale) {
        this.f5040a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(this.f5040a.toLanguageTag(), ((a) obj).f5040a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f5040a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f5040a.toLanguageTag();
    }
}
