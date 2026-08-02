package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class H8 extends OK {

    /* renamed from: v, reason: collision with root package name */
    public MessageDigest f26011v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26012w;

    /* renamed from: x, reason: collision with root package name */
    public final int f26013x;

    public H8(int i) {
        super(3);
        int i4 = i >> 3;
        this.f26012w = (i & 7) > 0 ? i4 + 1 : i4;
        this.f26013x = i;
    }

    public final byte[] R1(String str) {
        synchronized (this.f27380n) {
            try {
                MessageDigest X8 = X();
                this.f26011v = X8;
                if (X8 == null) {
                    return new byte[0];
                }
                X8.reset();
                this.f26011v.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.f26011v.digest();
                int length = digest.length;
                int i = this.f26012w;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i4 = this.f26013x & 7;
                if (i4 > 0) {
                    long j6 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        if (i6 > 0) {
                            j6 <<= 8;
                        }
                        j6 += bArr[i6] & 255;
                    }
                    long j9 = j6 >>> (8 - i4);
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
