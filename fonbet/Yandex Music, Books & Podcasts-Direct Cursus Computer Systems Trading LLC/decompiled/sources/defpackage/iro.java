package defpackage;

import android.content.Intent;

/* loaded from: classes4.dex */
public final class iro {
    public final Intent a;
    public final String b;
    public final String c;

    public iro(Intent intent, String str, String str2) {
        this.a = intent;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iro)) {
            return false;
        }
        iro iroVar = (iro) obj;
        return this.a.equals(iroVar.a) && this.b.equals(iroVar.b) && this.c.equals(iroVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenBankData(intent=");
        sb.append(this.a);
        sb.append(", scheme=");
        sb.append(this.b);
        sb.append(", urlTemplate=");
        return su4.o(sb, this.c, ")");
    }
}
