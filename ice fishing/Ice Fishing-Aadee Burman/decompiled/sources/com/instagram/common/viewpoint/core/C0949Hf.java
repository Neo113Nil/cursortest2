package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;

/* renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0949Hf {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C0949Hf(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        AbstractC06243y.A08(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i, 8 - this.A00);
        int i6 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & p.f8473b) >> this.A00) & (p.f8473b >> (8 - tempByteOffset));
        while (tempByteOffset < i) {
            int returnValue = this.A03[i6];
            tempByteOffset3 |= (returnValue & p.f8473b) << tempByteOffset;
            tempByteOffset += 8;
            i6++;
        }
        int returnValue2 = (-1) >>> (32 - i);
        int tempByteOffset4 = tempByteOffset3 & returnValue2;
        A03(i);
        return tempByteOffset4;
    }

    public final void A03(int i) {
        int i6 = i / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i6;
        int numBytes2 = i6 * 8;
        this.A00 += i - numBytes2;
        if (this.A00 > 7) {
            int numBytes3 = this.A01;
            this.A01 = numBytes3 + 1;
            int numBytes4 = this.A00;
            this.A00 = numBytes4 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
