package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n6r {
    public final int a;
    public final Intent b;

    public n6r(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6r)) {
            return false;
        }
        n6r n6rVar = (n6r) obj;
        return this.a == n6rVar.a && Intrinsics.d(this.b, n6rVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "SplashResult(resultCode=" + this.a + ", intent=" + this.b + ")";
    }
}
