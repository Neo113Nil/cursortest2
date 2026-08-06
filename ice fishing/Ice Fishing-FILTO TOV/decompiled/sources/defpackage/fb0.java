package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fb0 {
    public final Locale GWasM1elztuh;

    public fb0(Locale locale) {
        this.GWasM1elztuh = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fb0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o30.rQPn8YBR(this.GWasM1elztuh.toLanguageTag(), ((fb0) obj).GWasM1elztuh.toLanguageTag());
    }

    public final int hashCode() {
        return this.GWasM1elztuh.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.GWasM1elztuh.toLanguageTag();
    }
}
