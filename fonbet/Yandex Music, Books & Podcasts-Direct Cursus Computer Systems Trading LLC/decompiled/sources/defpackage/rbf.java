package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rbf {
    public static final rbf f = new rbf(127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;

    public /* synthetic */ rbf(int i) {
        this((i & 1) != 0 ? -1 : 3, null, 0, (i & 8) == 0 ? 7 : -1, null);
    }

    public final ide a(boolean z) {
        int i = this.a;
        qbf qbfVar = new qbf(i);
        if (i == -1) {
            qbfVar = null;
        }
        int i2 = qbfVar != null ? qbfVar.a : 0;
        Boolean bool = this.b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        sbf sbfVar = new sbf(i3);
        if (i3 == 0) {
            sbfVar = null;
        }
        int i4 = sbfVar != null ? sbfVar.a : 1;
        int i5 = this.d;
        hde hdeVar = i5 != -1 ? new hde(i5) : null;
        return new ide(z, i2, booleanValue, i4, hdeVar != null ? hdeVar.a : 1, bqg.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbf)) {
            return false;
        }
        rbf rbfVar = (rbf) obj;
        return this.a == rbfVar.a && Intrinsics.d(this.b, rbfVar.b) && this.c == rbfVar.c && this.d == rbfVar.d && Intrinsics.d(this.e, rbfVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int a = f1d.a(this.d, f1d.a(this.c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        return (a + (bool2 != null ? bool2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) qbf.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) sbf.a(this.c)) + ", imeAction=" + ((Object) hde.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.e + ", hintLocales=null)";
    }

    public rbf(int i, Boolean bool, int i2, int i3, Boolean bool2) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
    }
}
