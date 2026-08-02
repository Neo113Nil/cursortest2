package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class t40 {
    public final qez a;
    public final Intent b;

    public t40(qez qezVar, Intent intent) {
        this.a = qezVar;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40)) {
            return false;
        }
        t40 t40Var = (t40) obj;
        return this.a.equals(t40Var.a) && jl40.l(this.b, t40Var.b);
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
