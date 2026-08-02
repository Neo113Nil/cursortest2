package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w8e0 {
    public final String a;
    public final a b;
    public final String c;

    public w8e0(String str, a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w8e0) {
            w8e0 w8e0Var = (w8e0) obj;
            if (jl40.l(this.a, w8e0Var.a) && this.b == w8e0Var.b && jl40.l(this.c, w8e0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupItem(text=");
        sb.append(this.a);
        sb.append(", buttonIcon=");
        sb.append(this.b);
        sb.append(", notificationText=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
