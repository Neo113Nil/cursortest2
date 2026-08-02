package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hgs extends gin {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        int i = dvt.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public hgs() {
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
        bundle.putInt(gin.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hgs)) {
            return false;
        }
        hgs hgsVar = (hgs) obj;
        return this.c == hgsVar.c && this.b == hgsVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public hgs(boolean z) {
        this.b = true;
        this.c = z;
    }
}
