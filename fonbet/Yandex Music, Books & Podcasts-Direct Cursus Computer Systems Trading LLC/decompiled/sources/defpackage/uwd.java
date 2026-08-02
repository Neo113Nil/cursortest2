package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uwd extends gin {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        int i = dvt.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public uwd() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.gin
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.gin
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(gin.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uwd)) {
            return false;
        }
        uwd uwdVar = (uwd) obj;
        return this.c == uwdVar.c && this.b == uwdVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public uwd(boolean z) {
        this.b = true;
        this.c = z;
    }
}
