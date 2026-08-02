package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gkk extends gin {
    public static final String c;
    public final float b;

    static {
        int i = dvt.a;
        c = Integer.toString(1, 36);
    }

    public gkk(float f) {
        vq1.u("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // defpackage.gin
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.gin
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(gin.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gkk) {
            return this.b == ((gkk) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public gkk() {
        this.b = -1.0f;
    }
}
