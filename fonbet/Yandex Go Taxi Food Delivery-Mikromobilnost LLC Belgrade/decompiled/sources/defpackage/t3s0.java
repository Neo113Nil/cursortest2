package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class t3s0 implements e6v {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;

    public t3s0(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = "section_separator";
    }

    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3s0)) {
            return false;
        }
        t3s0 t3s0Var = (t3s0) obj;
        return this.a == t3s0Var.a && this.b == t3s0Var.b && this.c == t3s0Var.c && this.d == t3s0Var.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + unr0.e(unr0.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final boolean m() {
        return this.b;
    }

    public final boolean n() {
        return this.c;
    }

    public final String toString() {
        return "ShortcutsSeparatorModel(fullHeight=" + this.a + ", hasSeparator=" + this.b + ", isTransparent=" + this.c + ", color=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ t3s0(int i, int i2, int i3, boolean z) {
        this(i, (i3 & 8) != 0 ? 0 : i2, z, false);
    }
}
