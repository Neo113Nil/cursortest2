package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class imu extends jmu {
    public final long a;
    public final String b;

    public imu(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imu)) {
            return false;
        }
        imu imuVar = (imu) obj;
        return d85.c(this.a, imuVar.a) && Intrinsics.d(this.b, imuVar.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("Simple(backgroundColor=", d85.i(this.a), ", backgroundImage=", this.b, ")");
    }
}
