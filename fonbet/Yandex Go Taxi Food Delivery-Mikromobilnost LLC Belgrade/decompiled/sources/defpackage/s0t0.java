package defpackage;

import androidx.compose.material3.SnackbarDuration;

/* loaded from: classes10.dex */
public final class s0t0 {
    public final SnackbarDuration a;

    public s0t0(SnackbarDuration snackbarDuration) {
        this.a = snackbarDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s0t0.class == obj.getClass() && this.a == ((s0t0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + unr0.e(((-1990710403) - 1532807697) * 31, 31, false);
    }
}
