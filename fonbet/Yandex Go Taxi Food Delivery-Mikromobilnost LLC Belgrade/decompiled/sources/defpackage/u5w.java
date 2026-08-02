package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class u5w {
    public int[] a;
    public int b;

    public final int a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        xva1.d("Index must be between 0 and size");
        throw null;
    }

    public final int b() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        xva1.e("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u5w) {
            u5w u5wVar = (u5w) obj;
            int i = u5wVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = u5wVar.a;
                d6w n = y6i0.n(0, i2);
                int i3 = n.a;
                int i4 = n.b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) Extension.FIX_SPACE);
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
