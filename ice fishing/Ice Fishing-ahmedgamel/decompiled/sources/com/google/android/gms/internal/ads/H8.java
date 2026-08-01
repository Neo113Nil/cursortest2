package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class H8 extends OK {

    /* renamed from: v, reason: collision with root package name */
    public MessageDigest f25239v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25240w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25241x;

    public H8(int i) {
        super(3);
        int i6 = i >> 3;
        this.f25240w = (i & 7) > 0 ? i6 + 1 : i6;
        this.f25241x = i;
    }

    public final byte[] Q1(String str) {
        synchronized (this.f26598n) {
            try {
                MessageDigest X8 = X();
                this.f25239v = X8;
                if (X8 == null) {
                    return new byte[0];
                }
                X8.reset();
                this.f25239v.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.f25239v.digest();
                int length = digest.length;
                int i = this.f25240w;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i6 = this.f25241x & 7;
                if (i6 > 0) {
                    long j6 = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 > 0) {
                            j6 <<= 8;
                        }
                        j6 += bArr[i9] & 255;
                    }
                    long j9 = j6 >>> (8 - i6);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j9);
                        j9 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
