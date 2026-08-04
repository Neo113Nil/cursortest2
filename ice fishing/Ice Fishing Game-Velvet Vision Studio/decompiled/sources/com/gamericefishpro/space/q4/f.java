package com.gamericefishpro.space.q4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.u4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable, Serializable {
    public static final f i = new f(u.b);
    public static final d v;
    public int d = 0;
    public final byte[] e;

    static {
        v = c.a() ? new d(1) : new d(0);
    }

    public f(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    public static int c(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(com.gamericefishpro.space.t0.y0.f(i2, "Beginning index: ", " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static f d(byte[] bArr, int i2, int i3) {
        byte[] bArrCopyOfRange;
        c(i2, i2 + i3, bArr.length);
        switch (v.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                bArrCopyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, bArrCopyOfRange, 0, i3);
                break;
        }
        return new f(bArrCopyOfRange);
    }

    public byte b(int i2) {
        return this.e[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || size() != ((f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof f)) {
            return obj.equals(this);
        }
        f fVar = (f) obj;
        int i2 = this.d;
        int i3 = fVar.d;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > fVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > fVar.size()) {
            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(size, "Ran off end of other: 0, ", ", ");
            sbK.append(fVar.size());
            throw new IllegalArgumentException(sbK.toString());
        }
        byte[] bArr = fVar.e;
        int iH = h() + size;
        int iH2 = h();
        int iH3 = fVar.h();
        while (iH2 < iH) {
            if (this.e[iH2] != bArr[iH3]) {
                return false;
            }
            iH2++;
            iH3++;
        }
        return true;
    }

    public void f(int i2, byte[] bArr) {
        System.arraycopy(this.e, 0, bArr, 0, i2);
    }

    public int h() {
        return 0;
    }

    public final int hashCode() {
        int i2 = this.d;
        if (i2 != 0) {
            return i2;
        }
        int size = size();
        int iH = h();
        int i3 = size;
        for (int i4 = iH; i4 < iH + size; i4++) {
            i3 = (i3 * 31) + this.e[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.d = i3;
        return i3;
    }

    public byte i(int i2) {
        return this.e[i2];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u4(this);
    }

    public int size() {
        return this.e.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = com.gamericefishpro.space.u6.f.t(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iC = c(0, 47, size());
            sb.append(com.gamericefishpro.space.u6.f.t(iC == 0 ? i : new e(this.e, h(), iC)));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return com.gamericefishpro.space.t0.y0.j(sb2, string, "\">");
    }
}
