package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class F8 extends OK {

    /* renamed from: v, reason: collision with root package name */
    public MessageDigest f24749v;

    public final byte[] Q1(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int e9 = SK.e(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(e9);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i6 = 0; i6 < split.length; i6++) {
                    int e10 = SK.e(split[i6]);
                    int i9 = (e10 >> 16) ^ ((char) e10);
                    byte b9 = (byte) i9;
                    byte b10 = (byte) (i9 >> 8);
                    int i10 = i6 + i6;
                    bArr[i10] = new byte[]{b9, b10}[0];
                    bArr[i10 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int e11 = SK.e(split[i11]);
                    bArr[i11] = (byte) ((e11 >> 24) ^ (((e11 & com.anythink.basead.exoplayer.k.p.f8473b) ^ ((e11 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b)) ^ ((e11 >> 16) & com.anythink.basead.exoplayer.k.p.f8473b)));
                }
            }
            bArr2 = bArr;
        }
        this.f24749v = X();
        synchronized (this.f26598n) {
            try {
                MessageDigest messageDigest = this.f24749v;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f24749v.update(bArr2);
                byte[] digest = this.f24749v.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(digest, 0, bArr3, 0, i);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
