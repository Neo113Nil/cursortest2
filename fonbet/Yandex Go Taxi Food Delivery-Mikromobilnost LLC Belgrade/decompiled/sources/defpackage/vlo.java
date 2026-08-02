package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public final class vlo extends FilterInputStream {
    public static final byte[] c = {-1, -31, 0, DerValue.tag_UniversalString, 69, Alerts.alert_no_application_protocol, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int w = 31;
    public final byte a;
    public int b;

    public vlo(int i, InputStream inputStream) {
        super(inputStream);
        if (i < -1 || i > 8) {
            ny61.g(oyr.i(i, "Cannot add invalid orientation: "));
            throw null;
        }
        this.a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.b;
        int i5 = w;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(c, this.b - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.b += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.b = (int) (this.b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i;
        int i2 = this.b;
        if (i2 < 2 || i2 > (i = w)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.a;
        } else {
            read = c[i2 - 2] & 255;
        }
        if (read != -1) {
            this.b++;
        }
        return read;
    }
}
