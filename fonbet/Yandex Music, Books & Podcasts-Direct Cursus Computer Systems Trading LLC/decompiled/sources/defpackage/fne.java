package defpackage;

/* loaded from: classes4.dex */
public final class fne extends lne {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fne)) {
            return false;
        }
        kl3 kl3Var = kl3.SCANNER_BUTTON;
        return true;
    }

    public final int hashCode() {
        return kl3.SCANNER_BUTTON.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "ButtonAvailable(isAvailable=false, input=" + kl3.SCANNER_BUTTON + ")";
    }
}
