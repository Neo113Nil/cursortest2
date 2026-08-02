package okio;

import defpackage.b64;
import defpackage.f73;
import defpackage.j;
import defpackage.oyr;
import defpackage.qje;
import defpackage.t7q0;
import defpackage.w511;
import defpackage.yp6;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] w;
    public final transient int[] x;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.c.getData());
        this.w = bArr;
        this.x = iArr;
    }

    private final Object writeReplace() {
        return y();
    }

    @Override // okio.ByteString
    public final String a() {
        return y().a();
    }

    @Override // okio.ByteString
    public final void c(int i, int i2, int i3, byte[] bArr) {
        long j = i3;
        j.b(h(), i, j);
        j.b(bArr.length, i2, j);
        int i4 = i3 + i;
        int U = qje.U(this, i);
        while (i < i4) {
            int[] iArr = this.x;
            int i5 = U == 0 ? 0 : iArr[U - 1];
            int i6 = iArr[U] - i5;
            byte[][] bArr2 = this.w;
            int i7 = iArr[bArr2.length + U];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            f73.e(bArr2[U], i2, i8, bArr, i8 + min);
            i2 += min;
            i += min;
            U++;
        }
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.h() == h() && q(byteString, 0, h())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final ByteString f(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.w;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.x;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new ByteString(messageDigest.digest());
    }

    @Override // okio.ByteString
    public final int h() {
        return this.x[this.w.length - 1];
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.w;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.x;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    @Override // okio.ByteString
    public final String i() {
        return y().i();
    }

    @Override // okio.ByteString
    public final int j(int i, byte[] bArr) {
        return y().j(i, bArr);
    }

    @Override // okio.ByteString
    public final byte[] l() {
        return v();
    }

    @Override // okio.ByteString
    public final byte m(int i) {
        byte[][] bArr = this.w;
        int length = bArr.length - 1;
        int[] iArr = this.x;
        j.b(iArr[length], i, 1L);
        int U = qje.U(this, i);
        return bArr[U][(i - (U == 0 ? 0 : iArr[U - 1])) + iArr[bArr.length + U]];
    }

    @Override // okio.ByteString
    public final int n(int i, byte[] bArr) {
        return y().n(i, bArr);
    }

    @Override // okio.ByteString
    public final boolean p(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int U = qje.U(this, i);
        while (i < i4) {
            int[] iArr = this.x;
            int i5 = U == 0 ? 0 : iArr[U - 1];
            int i6 = iArr[U] - i5;
            byte[][] bArr2 = this.w;
            int i7 = iArr[bArr2.length + U];
            int min = Math.min(i4, i6 + i5) - i;
            if (!j.a(bArr2[U], (i - i5) + i7, i2, bArr, min)) {
                return false;
            }
            i2 += min;
            i += min;
            U++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean q(ByteString byteString, int i, int i2) {
        if (i >= 0 && i <= h() - i2) {
            int i3 = i2 + i;
            int U = qje.U(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.x;
                int i5 = U == 0 ? 0 : iArr[U - 1];
                int i6 = iArr[U] - i5;
                byte[][] bArr = this.w;
                int i7 = iArr[bArr.length + U];
                int min = Math.min(i3, i6 + i5) - i;
                if (byteString.p(i4, (i - i5) + i7, min, bArr[U])) {
                    i4 += min;
                    i += min;
                    U++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final String r(Charset charset) {
        return y().r(charset);
    }

    @Override // okio.ByteString
    public final ByteString s(int i, int i2) {
        if (i2 == j.b) {
            i2 = h();
        }
        if (i < 0) {
            w511.f(oyr.j(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > h()) {
            StringBuilder t = b64.t(i2, "endIndex=", " > length(");
            t.append(h());
            t.append(')');
            throw new IllegalArgumentException(t.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            w511.f(oyr.h(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == h()) {
            return this;
        }
        if (i == i2) {
            return ByteString.c;
        }
        int U = qje.U(this, i);
        int U2 = qje.U(this, i2 - 1);
        byte[][] bArr = this.w;
        byte[][] bArr2 = (byte[][]) f73.n(U, U2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.x;
        if (U <= U2) {
            int i4 = U;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == U2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = U != 0 ? iArr2[U - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final String toString() {
        return y().toString();
    }

    @Override // okio.ByteString
    public final ByteString u() {
        return y().u();
    }

    @Override // okio.ByteString
    public final byte[] v() {
        byte[] bArr = new byte[h()];
        byte[][] bArr2 = this.w;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.x;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            f73.e(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void x(yp6 yp6Var, int i) {
        int U = qje.U(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.x;
            int i3 = U == 0 ? 0 : iArr[U - 1];
            int i4 = iArr[U] - i3;
            byte[][] bArr = this.w;
            int i5 = iArr[bArr.length + U];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            t7q0 t7q0Var = new t7q0(bArr[U], i6, i6 + min, true, false);
            t7q0 t7q0Var2 = yp6Var.a;
            if (t7q0Var2 == null) {
                t7q0Var.g = t7q0Var;
                t7q0Var.f = t7q0Var;
                yp6Var.a = t7q0Var;
            } else {
                t7q0Var2.g.b(t7q0Var);
            }
            i2 += min;
            U++;
        }
        yp6Var.b += i;
    }

    public final ByteString y() {
        return new ByteString(v());
    }
}
