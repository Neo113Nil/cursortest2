package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ph {
    public final ceg a;
    public final Intent b;

    public ph(ceg cegVar, Intent intent) {
        this.a = cegVar;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return this.a.equals(phVar.a) && Intrinsics.d(this.b, phVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResult(code=" + this.a + ", intent=" + this.b + ')';
    }
}
