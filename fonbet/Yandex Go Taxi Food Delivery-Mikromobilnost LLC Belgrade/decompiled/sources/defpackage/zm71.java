package defpackage;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class zm71 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public zm71(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != zm71.class) {
            return false;
        }
        zm71 zm71Var = (zm71) obj;
        return TextUtils.equals(this.a, zm71Var.a) && this.b == zm71Var.b && this.c == zm71Var.c;
    }

    public final int hashCode() {
        return ((z2a1.a(31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
