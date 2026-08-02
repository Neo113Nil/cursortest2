package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ibr extends gin {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        int i = dvt.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public ibr(int i, float f) {
        boolean z = false;
        vq1.u("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        vq1.u("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.gin
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.gin
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(gin.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ibr)) {
            return false;
        }
        ibr ibrVar = (ibr) obj;
        return this.b == ibrVar.b && this.c == ibrVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public ibr(int i) {
        vq1.u("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
