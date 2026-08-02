package defpackage;

import kotlinx.datetime.format.i;
import kotlinx.datetime.internal.format.d;

/* loaded from: classes9.dex */
public final class wmi0 extends d {
    public final int b;

    public wmi0() {
        super(i.a);
        this.b = 1970;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wmi0) {
            return this.b == ((wmi0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.b) * 31);
    }
}
