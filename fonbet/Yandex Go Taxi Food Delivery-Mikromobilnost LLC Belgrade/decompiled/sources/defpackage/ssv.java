package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ssv {
    public final Context a;
    public final int b;

    public ssv(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssv)) {
            return false;
        }
        ssv ssvVar = (ssv) obj;
        return jl40.l(this.a, ssvVar.a) && this.b == ssvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LayoutKey(context=" + this.a + ", resId=" + this.b + Extension.C_BRAKE;
    }
}
