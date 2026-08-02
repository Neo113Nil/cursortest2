package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class F8 extends OK {

    /* renamed from: v, reason: collision with root package name */
    public MessageDigest f25505v;

    public final byte[] R1(String str) {
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
                for (int i4 = 0; i4 < split.length; i4++) {
                    int e10 = SK.e(split[i4]);
                    int i6 = (e10 >> 16) ^ ((char) e10);
                    byte b9 = (byte) i6;
                    byte b10 = (byte) (i6 >> 8);
                    int i9 = i4 + i4;
                    bArr[i9] = new byte[]{b9, b10}[0];
                    bArr[i9 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    int e11 = SK.e(split[i10]);
                    bArr[i10] = (byte) ((e11 >> 24) ^ (((e11 & com.anythink.basead.exoplayer.k.p.f9259b) ^ ((e11 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b)) ^ ((e11 >> 16) & com.anythink.basead.exoplayer.k.p.f9259b)));
                }
            }
            bArr2 = bArr;
        }
        this.f25505v = X();
        synchronized (this.f27380n) {
            try {
                MessageDigest messageDigest = this.f25505v;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f25505v.update(bArr2);
                byte[] digest = this.f25505v.digest();
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
