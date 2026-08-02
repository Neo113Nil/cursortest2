package k1;

import D1.y;
import java.io.Closeable;
import java.util.Arrays;
import u.AbstractC5050e;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4640b implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f38566x = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public int f38567n;

    /* renamed from: u, reason: collision with root package name */
    public int[] f38568u;

    /* renamed from: v, reason: collision with root package name */
    public String[] f38569v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f38570w;

    static {
        for (int i = 0; i <= 31; i++) {
            f38566x[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f38566x;
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
        int i = this.f38567n;
        int[] iArr = this.f38568u;
        String[] strArr = this.f38569v;
        int[] iArr2 = this.f38570w;
        StringBuilder sb = new StringBuilder("$");
        for (int i4 = 0; i4 < i; i4++) {
            int i6 = iArr[i4];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(iArr2[i4]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append('.');
                String str = strArr[i4];
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
        int i4 = this.f38567n;
        int[] iArr = this.f38568u;
        if (i4 == iArr.length) {
            if (i4 == 256) {
                throw new B0.c("Nesting too deep at " + C());
            }
            this.f38568u = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f38569v;
            this.f38569v = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f38570w;
            this.f38570w = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f38568u;
        int i6 = this.f38567n;
        this.f38567n = i6 + 1;
        iArr3[i6] = i;
    }

    public abstract int K(C4639a c4639a);

    public abstract void V();

    public abstract void W();

    public final void X(String str) {
        StringBuilder c9 = AbstractC5050e.c(str, " at path ");
        c9.append(C());
        throw new y(c9.toString());
    }

    public abstract void b();

    public abstract void j();

    public abstract void z();
}
