package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u1v0 extends gc5 {
    public final x1v0 c;
    public final String d;

    public u1v0(x1v0 x1v0Var) {
        super("subscription_widget_id", 2);
        this.c = x1v0Var;
        this.d = "subscription_widget_id";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1v0)) {
            return false;
        }
        u1v0 u1v0Var = (u1v0) obj;
        return this.c.equals(u1v0Var.c) && this.d.equals(u1v0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SubscriptionWidget(state=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
