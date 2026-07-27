package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;

/* renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0948Hf {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C0948Hf(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        AbstractC06233y.A08(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i, 8 - this.A00);
        int i4 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & p.f8630b) >> this.A00) & (p.f8630b >> (8 - tempByteOffset));
        while (tempByteOffset < i) {
            int returnValue = this.A03[i4];
            tempByteOffset3 |= (returnValue & p.f8630b) << tempByteOffset;
            tempByteOffset += 8;
            i4++;
        }
        int returnValue2 = (-1) >>> (32 - i);
        int tempByteOffset4 = tempByteOffset3 & returnValue2;
        A03(i);
        return tempByteOffset4;
    }

    public final void A03(int i) {
        int i4 = i / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i4;
        int numBytes2 = i4 * 8;
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
