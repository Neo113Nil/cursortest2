package i1;

import B0.c;
import B1.y;
import S0.s;
import java.io.Closeable;
import java.util.Arrays;
import u.AbstractC5088e;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4574a implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f38276x = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public int f38277n;

    /* renamed from: u, reason: collision with root package name */
    public int[] f38278u;

    /* renamed from: v, reason: collision with root package name */
    public String[] f38279v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f38280w;

    static {
        for (int i = 0; i <= 31; i++) {
            f38276x[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f38276x;
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
        int i = this.f38277n;
        int[] iArr = this.f38278u;
        String[] strArr = this.f38279v;
        int[] iArr2 = this.f38280w;
        StringBuilder sb = new StringBuilder("$");
        for (int i4 = 0; i4 < i; i4++) {
            int i9 = iArr[i4];
            if (i9 == 1 || i9 == 2) {
                sb.append('[');
                sb.append(iArr2[i4]);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
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
        int i4 = this.f38277n;
        int[] iArr = this.f38278u;
        if (i4 == iArr.length) {
            if (i4 == 256) {
                throw new c("Nesting too deep at " + C());
            }
            this.f38278u = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f38279v;
            this.f38279v = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f38280w;
            this.f38280w = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f38278u;
        int i9 = this.f38277n;
        this.f38277n = i9 + 1;
        iArr3[i9] = i;
    }

    public abstract int K(s sVar);

    public abstract void V();

    public abstract void W();

    public final void X(String str) {
        StringBuilder c4 = AbstractC5088e.c(str, " at path ");
        c4.append(C());
        throw new y(c4.toString());
    }

    public abstract void b();

    public abstract void j();

    public abstract void z();
}
