package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rp {
    public final int GWasM1elztuh;

    public static String GWasM1elztuh(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rp) {
            return this.GWasM1elztuh == ((rp) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return GWasM1elztuh(this.GWasM1elztuh);
    }
}
