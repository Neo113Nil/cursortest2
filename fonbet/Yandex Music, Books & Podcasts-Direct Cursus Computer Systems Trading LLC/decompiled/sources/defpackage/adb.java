package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class adb implements cdb {
    public final yxc a;

    public adb(yxc yxcVar) {
        yxcVar.getClass();
        this.a = yxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adb) && Intrinsics.d(this.a, ((adb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Synced(userInfo=" + this.a + ")";
    }
}
