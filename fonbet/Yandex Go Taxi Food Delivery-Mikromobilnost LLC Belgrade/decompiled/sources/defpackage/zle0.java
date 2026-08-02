package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* loaded from: classes10.dex */
public final class zle0 {
    public final int a;
    public final int b;
    public final String c;

    public zle0(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.Z;
        this.b = preference.a0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zle0)) {
            return false;
        }
        zle0 zle0Var = (zle0) obj;
        return this.a == zle0Var.a && this.b == zle0Var.b && TextUtils.equals(this.c, zle0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
