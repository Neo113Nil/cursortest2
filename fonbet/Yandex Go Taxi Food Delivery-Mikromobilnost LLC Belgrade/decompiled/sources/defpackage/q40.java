package defpackage;

import android.content.Intent;

/* loaded from: classes13.dex */
public final class q40 {
    public final int a;
    public final int b;
    public final Intent c;

    public q40(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return this.a == q40Var.a && this.b == q40Var.b && jl40.l(this.c, q40Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        Intent intent = this.c;
        return b + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResult(requestCode=" + this.a + ", resultCode=" + this.b + ", data=" + this.c + ')';
    }
}
