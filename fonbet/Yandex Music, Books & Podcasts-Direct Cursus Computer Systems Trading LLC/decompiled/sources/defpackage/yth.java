package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class yth {
    public cuh a;

    public yth(String str, int i, int i2) {
        if (str == null) {
            jj4.j("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            xq0.x("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new cuh(str, i, i2);
            return;
        }
        buh buhVar = new buh(str, i, i2);
        auh.a(i, i2, str);
        this.a = buhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yth) {
            return this.a.equals(((yth) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
