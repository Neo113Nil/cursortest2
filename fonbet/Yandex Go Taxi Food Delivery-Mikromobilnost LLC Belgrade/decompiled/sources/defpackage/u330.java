package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes10.dex */
public final class u330 {
    public final SecureFlagPolicy a = SecureFlagPolicy.Inherit;
    public final boolean b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u330) {
            return this.a == ((u330) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
