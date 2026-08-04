package com.gamericefishpro.space.d4;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final DisplayCutout a;

    public k(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final com.gamericefishpro.space.u3.b a() {
        return Build.VERSION.SDK_INT >= 30 ? com.gamericefishpro.space.u3.b.c(i.c(this.a)) : com.gamericefishpro.space.u3.b.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
