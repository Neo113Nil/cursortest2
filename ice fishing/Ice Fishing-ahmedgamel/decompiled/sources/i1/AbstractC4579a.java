package i1;

import B0.c;
import B1.z;
import S0.l;
import java.io.Closeable;
import java.util.Arrays;
import u.AbstractC5049e;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4579a implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f38029x = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public int f38030n;

    /* renamed from: u, reason: collision with root package name */
    public int[] f38031u;

    /* renamed from: v, reason: collision with root package name */
    public String[] f38032v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f38033w;

    static {
        for (int i = 0; i <= 31; i++) {
            f38029x[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f38029x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void B();

    public final String C() {
        int i = this.f38030n;
        int[] iArr = this.f38031u;
        String[] strArr = this.f38032v;
        int[] iArr2 = this.f38033w;
        StringBuilder sb = new StringBuilder("$");
        for (int i6 = 0; i6 < i; i6++) {
            int i9 = iArr[i6];
            if (i9 == 1 || i9 == 2) {
                sb.append('[');
                sb.append(iArr2[i6]);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = strArr[i6];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean D();

    public abstract boolean E();

    public abstract double F();

    public abstract int G();

    public abstract String H();

    public abstract int I();

    public final void J(int i) {
        int i6 = this.f38030n;
        int[] iArr = this.f38031u;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new c("Nesting too deep at " + C());
            }
            this.f38031u = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f38032v;
            this.f38032v = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f38033w;
            this.f38033w = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f38031u;
        int i9 = this.f38030n;
        this.f38030n = i9 + 1;
        iArr3[i9] = i;
    }

    public abstract int K(l lVar);

    public abstract void V();

    public abstract void W();

    public final void X(String str) {
        StringBuilder c9 = AbstractC5049e.c(str, " at path ");
        c9.append(C());
        throw new z(c9.toString());
    }

    public abstract void b();

    public abstract void j();

    public abstract void z();
}
