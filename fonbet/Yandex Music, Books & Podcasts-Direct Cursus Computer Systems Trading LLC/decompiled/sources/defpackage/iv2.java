package defpackage;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class iv2 implements Cloneable {
    public final String a;
    public final String b;

    public iv2(String str, String str2) {
        if (str == null) {
            xq0.x("Name may not be null");
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof iv2) {
            iv2 iv2Var = (iv2) obj;
            if (this.a.equals(iv2Var.a) && TextUtils.equals(this.b, iv2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
