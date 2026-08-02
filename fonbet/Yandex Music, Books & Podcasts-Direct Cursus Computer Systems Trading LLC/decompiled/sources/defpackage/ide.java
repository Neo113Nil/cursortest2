package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ide {
    public static final ide g = new ide(false, 0, true, 1, 1, bqg.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final bqg f;

    public ide(boolean z, int i, boolean z2, int i2, int i3, bqg bqgVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = bqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ide)) {
            return false;
        }
        ide ideVar = (ide) obj;
        return this.a == ideVar.a && this.b == ideVar.b && this.c == ideVar.c && this.d == ideVar.d && this.e == ideVar.e && Intrinsics.d(this.f, ideVar.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + f1d.a(this.e, f1d.a(this.d, k5r.e(f1d.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) qbf.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) sbf.a(this.d)) + ", imeAction=" + ((Object) hde.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
