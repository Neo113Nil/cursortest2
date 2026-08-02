package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pdk {
    public final int a;
    public final Intent b;

    public pdk(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdk)) {
            return false;
        }
        pdk pdkVar = (pdk) obj;
        return this.a == pdkVar.a && Intrinsics.d(this.b, pdkVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "PaymentActivityResult(resultCode=" + this.a + ", intent=" + this.b + ")";
    }
}
