package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public abstract class z extends s0 implements y0, a0 {
    public static final y b = new y(0, z.class);
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public z(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                jj4.j("'contents' cannot be null");
                throw null;
            }
            if (bArr.length < 1) {
                xq0.x("'contents' cannot be empty");
                throw null;
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    xq0.x("zero length data with non-zero pad bits");
                    throw null;
                }
                if (i > 7) {
                    xq0.x("pad bits cannot be greater than 7 or less than 0");
                    throw null;
                }
            }
        }
        this.a = bArr;
    }

    public static z B(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            xq0.x("truncated BIT STRING detected");
            return null;
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                xq0.x("invalid pad bits detected");
                return null;
            }
            byte b2 = bArr[length - 1];
            if (b2 != ((byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i) & b2))) {
                return new b67(bArr, false);
            }
        }
        return new sz6(bArr, false);
    }

    @Override // defpackage.s0
    public s0 A() {
        return new b67(this.a, false);
    }

    @Override // defpackage.a0
    public final int g() {
        return this.a[0] & 255;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        byte[] bArr = this.a;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b2 = (byte) ((KotlinVersion.MAX_COMPONENT_VALUE << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b2;
    }

    @Override // defpackage.y0
    public final String o() {
        try {
            byte[] r = r();
            StringBuffer stringBuffer = new StringBuffer((r.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != r.length; i++) {
                byte b2 = r[i];
                char[] cArr = c;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr[b2 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            wb8.k("Internal error encoding BitString: ", e.getMessage(), e);
            return null;
        }
    }

    @Override // defpackage.a0
    public final InputStream q() {
        byte[] bArr = this.a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (!(s0Var instanceof z)) {
            return false;
        }
        byte[] bArr = ((z) s0Var).a;
        byte[] bArr2 = this.a;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = bArr2[0] & 255;
        byte b2 = bArr2[i];
        int i4 = KotlinVersion.MAX_COMPONENT_VALUE << i3;
        return ((byte) (b2 & i4)) == ((byte) (bArr[i] & i4));
    }

    public final String toString() {
        return o();
    }

    @Override // defpackage.s0
    public s0 z() {
        return new sz6(this.a, false);
    }

    @Override // defpackage.xge
    public final s0 m() {
        return this;
    }

    public z(byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length == 0 && i != 0) {
                xq0.x("zero length data with non-zero pad bits");
                throw null;
            }
            if (i <= 7 && i >= 0) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 1];
                System.arraycopy(bArr, 0, bArr2, 1, length);
                bArr2[0] = (byte) i;
                this.a = bArr2;
                return;
            }
            xq0.x("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        jj4.j("'data' cannot be null");
        throw null;
    }
}
