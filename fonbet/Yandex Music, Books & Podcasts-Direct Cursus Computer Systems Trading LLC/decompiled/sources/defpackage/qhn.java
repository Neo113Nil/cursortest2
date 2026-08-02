package defpackage;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public abstract class qhn {
    public static final mo a = new mo(11);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
