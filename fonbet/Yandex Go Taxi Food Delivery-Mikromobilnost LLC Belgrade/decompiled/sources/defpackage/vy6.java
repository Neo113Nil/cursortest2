package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vy6 extends az6 {
    public final Boolean a;

    public vy6(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy6) && this.a.equals(((vy6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoToSummaryButtonAction(changePaymentMethod=" + this.a + Extension.C_BRAKE;
    }
}
