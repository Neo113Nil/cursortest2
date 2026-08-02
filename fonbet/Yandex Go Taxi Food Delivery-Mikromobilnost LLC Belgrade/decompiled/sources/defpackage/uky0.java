package defpackage;

import android.view.textclassifier.TextClassification;

/* loaded from: classes10.dex */
public final class uky0 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public uky0(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uky0)) {
            return false;
        }
        uky0 uky0Var = (uky0) obj;
        return jl40.l(this.a, uky0Var.a) && asy0.b(this.b, uky0Var.b) && jl40.l(this.c, uky0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = asy0.c;
        return this.c.hashCode() + qv10.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) asy0.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
