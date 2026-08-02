package defpackage;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zxb {
    public final String a;
    public final vx6 b;
    public final CountDownLatch c;

    public zxb(String str, vx6 vx6Var, CountDownLatch countDownLatch) {
        str.getClass();
        this.a = str;
        this.b = vx6Var;
        this.c = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxb)) {
            return false;
        }
        zxb zxbVar = (zxb) obj;
        return Intrinsics.d(this.a, zxbVar.a) && this.b.equals(zxbVar.b) && this.c.equals(zxbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CurrentUserInfo(userId=" + this.a + ", store=" + this.b + ", loadLocalLatch=" + this.c + ")";
    }
}
