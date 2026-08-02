package androidx.datastore.preferences.protobuf;

import defpackage.wzh;

/* loaded from: classes.dex */
final class p0 implements e0 {
    public final wzh a;
    public final String b;
    public final Object[] c;
    public final int d;

    public p0(wzh wzhVar, String str, Object[] objArr) {
        this.a = wzhVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
