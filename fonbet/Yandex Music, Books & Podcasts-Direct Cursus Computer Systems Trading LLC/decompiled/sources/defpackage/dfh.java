package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dfh implements n2i {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public dfh(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                vq1.v(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                vq1.v(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                vq1.v(z);
                break;
            case "auxiliary.tracks.map":
                vq1.v(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList a() {
        vq1.z("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
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
        if (obj != null && dfh.class == obj.getClass()) {
            dfh dfhVar = (dfh) obj;
            if (this.a.equals(dfhVar.a) && Arrays.equals(this.b, dfhVar.b) && this.c == dfhVar.c && this.d == dfhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + k5r.c(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList a = a();
                StringBuilder k = dfi.k("track types = ");
                new jpc(String.valueOf(','), 2).a(k, a.iterator());
                sb = k.toString();
            }
            sb = dvt.k0(bArr);
        } else if (i == 1) {
            sb = dvt.r(bArr);
        } else if (i == 23) {
            o2g.K("array too small: %s < %s", bArr.length >= 4, bArr.length, 4);
            sb = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)));
        } else if (i == 67) {
            o2g.K("array too small: %s < %s", bArr.length >= 4, bArr.length, 4);
            sb = String.valueOf((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new d7k(bArr).A());
            }
            sb = dvt.k0(bArr);
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return hrg.r("mdta: key=", str, ", value=", sb);
    }
}
