package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class vjh {
    public final String a;
    public final boolean b;
    public final boolean c;

    public vjh(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == vjh.class) {
            vjh vjhVar = (vjh) obj;
            if (TextUtils.equals(this.a, vjhVar.a) && this.b == vjhVar.b && this.c == vjhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((k5r.c(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
