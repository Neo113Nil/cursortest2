package defpackage;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class duo {
    public final Pattern a;
    public final String b;
    public final v5g c;

    public duo(Pattern pattern, String str, v5g v5gVar) {
        pattern.getClass();
        v5gVar.getClass();
        this.a = pattern;
        this.b = str;
        this.c = v5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duo)) {
            return false;
        }
        duo duoVar = (duo) obj;
        return Intrinsics.d(this.a, duoVar.a) && this.b.equals(duoVar.b) && Intrinsics.d(this.c, duoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SchemeRedirectRule(from=" + this.a + ", to=" + this.b + ", paramMode=" + this.c + ")";
    }
}
