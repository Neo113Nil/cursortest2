package defpackage;

import kotlin.text.Regex;

/* loaded from: classes11.dex */
public final class u25 extends w25 {
    public Character a = null;
    public final Regex b;
    public final char c;

    public u25(Regex regex, char c) {
        this.b = regex;
        this.c = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u25)) {
            return false;
        }
        u25 u25Var = (u25) obj;
        return jl40.l(this.a, u25Var.a) && jl40.l(this.b, u25Var.b) && this.c == u25Var.c;
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
