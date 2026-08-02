package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rk80 {
    public final long a;
    public final cu11 b;
    public final Drawable c;
    public final boolean d;
    public final int e;

    public rk80(long j, cu11 cu11Var, Drawable drawable, boolean z, int i) {
        this.a = j;
        this.b = cu11Var;
        this.c = drawable;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o5b0 o5b0Var = obj instanceof o5b0 ? (o5b0) obj : null;
        return o5b0Var != null && this.a == o5b0Var.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationUiModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", isGuest=");
        sb.append(this.d);
        return b64.q(sb, ", unreadCount=", this.e, Extension.C_BRAKE);
    }
}
