package defpackage;

import java.security.Key;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes4.dex */
public final class zi10 {
    public final char[] a;
    public final Key b;
    public final Certificate c;
    public final Certificate[] d;
    public final Date e;

    public zi10(char[] cArr, Key key, Certificate certificate, Certificate[] certificateArr) {
        Certificate[] certificateArr2 = null;
        this.a = cArr == null ? null : (char[]) cArr.clone();
        this.b = key;
        this.c = certificate;
        if (certificateArr != null && certificateArr.length != 0) {
            certificateArr2 = (Certificate[]) certificateArr.clone();
        }
        this.d = certificateArr2;
        this.e = new Date();
    }

    public final void finalize() {
        char[] cArr = this.a;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        super.finalize();
    }
}
