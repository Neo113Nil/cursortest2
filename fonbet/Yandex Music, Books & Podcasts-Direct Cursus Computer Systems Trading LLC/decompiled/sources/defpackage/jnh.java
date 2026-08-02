package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jnh {
    public static final jnh d = new jnh(new t1f(8, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        int i = dvt.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public jnh(t1f t1fVar) {
        this.a = (Uri) t1fVar.b;
        this.b = (String) t1fVar.c;
        this.c = (Bundle) t1fVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnh)) {
            return false;
        }
        jnh jnhVar = (jnh) obj;
        if (Objects.equals(this.a, jnhVar.a) && Objects.equals(this.b, jnhVar.b)) {
            if ((this.c == null) == (jnhVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
