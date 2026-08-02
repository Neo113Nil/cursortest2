package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class icx extends wcx {
    public final obx a;

    public icx(obx obxVar) {
        this.a = obxVar;
    }

    @Override // defpackage.wcx
    public final int a() {
        return wcx.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wcx wcxVar = (wcx) obj;
        int a = wcxVar.a();
        int d = wcx.d((byte) 64);
        if (d != a) {
            return d - wcxVar.a();
        }
        obx obxVar = ((icx) wcxVar).a;
        obx obxVar2 = this.a;
        byte[] bArr = obxVar2.b;
        int length = bArr.length;
        byte[] bArr2 = obxVar.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return ibx.a.compare(obxVar2.u(), obxVar.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && icx.class == obj.getClass()) {
            return this.a.equals(((icx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(wcx.d((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        abx abxVar;
        int i;
        boolean z;
        bbx bbxVar = dbx.d;
        dbx dbxVar = bbxVar.c;
        if (dbxVar == null) {
            abx abxVar2 = bbxVar.a;
            char[] cArr = abxVar2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    abxVar = abxVar2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        xq0.q("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (c3 >= 97 && c3 <= 122) {
                            c3 ^= 32;
                        }
                        cArr2[i4] = (char) c3;
                    }
                    abxVar = new abx(abxVar2.a.concat(".upperCase()"), cArr2);
                    byte[] bArr = abxVar.g;
                    if (abxVar2.h && !abxVar.h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    xq0.q(hdg.n0("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                copyOf[i5] = b;
                            }
                        }
                        abxVar = new abx(abxVar.a.concat(".ignoreCase()"), abxVar.b, copyOf, true);
                    }
                }
            }
            dbxVar = abxVar == abxVar2 ? bbxVar : new bbx(abxVar);
            bbxVar.c = dbxVar;
        }
        byte[] u = this.a.u();
        return hrg.q("h'", dbxVar.c(u.length, u), "'");
    }
}
