package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bq0 {
    public final boolean GWasM1elztuh;
    public final int Yi7zF1RB1;

    public bq0() {
        this.GWasM1elztuh = false;
        this.Yi7zF1RB1 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq0)) {
            return false;
        }
        bq0 bq0Var = (bq0) obj;
        return this.GWasM1elztuh == bq0Var.GWasM1elztuh && this.Yi7zF1RB1 == bq0Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Yi7zF1RB1) + (Boolean.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.GWasM1elztuh + ", emojiSupportMatch=" + ((Object) rp.GWasM1elztuh(this.Yi7zF1RB1)) + ')';
    }

    public bq0(int i, boolean z) {
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = i;
    }
}
