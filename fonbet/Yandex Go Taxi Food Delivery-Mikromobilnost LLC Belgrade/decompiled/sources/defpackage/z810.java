package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class z810 implements s820 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int w;

    public z810(int i, int i2, String str, byte[] bArr) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                d6z.l(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                d6z.l(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                d6z.l(z);
                break;
            case "auxiliary.tracks.map":
                d6z.l(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.w = i2;
    }

    public final ArrayList a() {
        d6z.w("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z810.class == obj.getClass()) {
            z810 z810Var = (z810) obj;
            if (this.a.equals(z810Var.a) && Arrays.equals(this.b, z810Var.b) && this.c == z810Var.c && this.w == z810Var.w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + unr0.b(527, 31, this.a)) * 31) + this.c) * 31) + this.w;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.w;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList a = a();
                StringBuilder t = qv10.t("track types = ");
                new mf1(String.valueOf(HexString.CHAR_COMMA)).e(t, a.iterator());
                sb = t.toString();
            }
            sb = tw21.j0(bArr);
        } else if (i == 1) {
            sb = tw21.p(bArr);
        } else if (i == 23) {
            boolean z = bArr.length >= 4;
            int length = bArr.length;
            if (!z) {
                ny61.g(shb1.c("array too small: %s < %s", Integer.valueOf(length), 4));
                return null;
            }
            byte b = bArr[0];
            sb = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (b << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
        } else if (i == 67) {
            boolean z2 = bArr.length >= 4;
            int length2 = bArr.length;
            if (!z2) {
                ny61.g(shb1.c("array too small: %s < %s", Integer.valueOf(length2), 4));
                return null;
            }
            byte b2 = bArr[0];
            sb = String.valueOf(((bArr[1] & 255) << 16) | (b2 << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new ef90(bArr).D());
            }
            sb = tw21.j0(bArr);
        } else {
            sb = String.valueOf(Byte.toUnsignedInt(bArr[0]));
        }
        return b64.l("mdta: key=", str, ", value=", sb);
    }
}
