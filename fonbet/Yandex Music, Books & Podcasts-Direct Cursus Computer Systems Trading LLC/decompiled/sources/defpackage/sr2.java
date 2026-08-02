package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class sr2 extends ur2 {
    public Character a = null;
    public final Regex b;
    public final char c;

    public sr2(Regex regex, char c) {
        this.b = regex;
        this.c = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr2)) {
            return false;
        }
        sr2 sr2Var = (sr2) obj;
        return Intrinsics.d(this.a, sr2Var.a) && Intrinsics.d(this.b, sr2Var.b) && this.c == sr2Var.c;
    }

    public final int hashCode() {
        Character ch = this.a;
        int hashCode = (ch == null ? 0 : ch.hashCode()) * 31;
        Regex regex = this.b;
        return Character.hashCode(this.c) + ((hashCode + (regex != null ? regex.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Dynamic(char=" + this.a + ", filter=" + this.b + ", placeholder=" + this.c + ')';
    }
}
