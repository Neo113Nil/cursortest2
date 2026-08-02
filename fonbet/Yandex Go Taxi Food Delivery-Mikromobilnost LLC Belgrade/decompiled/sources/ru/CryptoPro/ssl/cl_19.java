package ru.CryptoPro.ssl;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class cl_19 extends MessageDigest implements Cloneable {
    public final MessageDigest[] a;

    public cl_19(MessageDigest messageDigest, int i, String str) {
        super(str);
        MessageDigest[] messageDigestArr = new MessageDigest[i];
        this.a = messageDigestArr;
        messageDigestArr[0] = messageDigest;
        for (int i2 = 1; i2 < i; i2++) {
            this.a[i2] = cl_73.i(str);
        }
    }

    public static MessageDigest a(int i, String str) {
        MessageDigest i2 = cl_73.i(str);
        try {
            i2.clone();
            return i2;
        } catch (CloneNotSupportedException unused) {
            return new cl_19(i2, i, str);
        }
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        MessageDigest[] messageDigestArr = this.a;
        for (int length = messageDigestArr.length - 1; length >= 0; length--) {
            MessageDigest messageDigest = messageDigestArr[length];
            if (messageDigest != null) {
                messageDigestArr[length] = null;
                return messageDigest;
            }
        }
        throw new InternalError();
    }

    @Override // java.security.MessageDigestSpi
    public final int engineDigest(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest;
        MessageDigest[] messageDigestArr = this.a;
        int digest = messageDigestArr[0].digest(bArr, i, i2);
        for (int i3 = 1; i3 < messageDigestArr.length && (messageDigest = messageDigestArr[i3]) != null; i3++) {
            messageDigest.reset();
        }
        return digest;
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return this.a[0].getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            MessageDigest[] messageDigestArr = this.a;
            if (i >= messageDigestArr.length || (messageDigest = messageDigestArr[i]) == null) {
                return;
            }
            messageDigest.reset();
            i++;
        }
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            MessageDigest[] messageDigestArr = this.a;
            if (i >= messageDigestArr.length || (messageDigest = messageDigestArr[i]) == null) {
                return;
            }
            messageDigest.update(b);
            i++;
        }
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest;
        int i3 = 0;
        while (true) {
            MessageDigest[] messageDigestArr = this.a;
            if (i3 >= messageDigestArr.length || (messageDigest = messageDigestArr[i3]) == null) {
                return;
            }
            messageDigest.update(bArr, i, i2);
            i3++;
        }
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        MessageDigest messageDigest;
        MessageDigest[] messageDigestArr = this.a;
        byte[] digest = messageDigestArr[0].digest();
        for (int i = 1; i < messageDigestArr.length && (messageDigest = messageDigestArr[i]) != null; i++) {
            messageDigest.reset();
        }
        return digest;
    }
}
