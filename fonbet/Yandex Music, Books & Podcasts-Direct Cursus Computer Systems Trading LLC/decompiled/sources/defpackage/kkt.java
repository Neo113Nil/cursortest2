package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kkt {
    public static final kkt f = new kkt(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public kkt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static kkt b() {
        return new kkt(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int h;
        int j;
        int d;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    d = a.d(i5);
                } else if (i6 == 2) {
                    d = a.a(i5, (mn3) this.c[i3]);
                } else if (i6 == 3) {
                    h = a.h(i5) * 2;
                    j = ((kkt) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        wvs.m(aye.b());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    d = a.c(i5);
                }
                i2 = d + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                h = a.h(i5);
                j = a.j(longValue);
            }
            i2 = j + h + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            q.i();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(b bVar) {
        if (this.a == 0) {
            return;
        }
        bVar.getClass();
        a aVar = bVar.a;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                aVar.t(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                aVar.o(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                bVar.a(i3, (mn3) obj);
            } else if (i4 == 3) {
                aVar.r(i3, 3);
                ((kkt) obj).d(bVar);
                aVar.r(i3, 4);
            } else {
                if (i4 != 5) {
                    b6e.q(aye.b());
                    return;
                }
                aVar.m(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kkt)) {
            return false;
        }
        kkt kktVar = (kkt) obj;
        int i = this.a;
        if (i == kktVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = kktVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = kktVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
