package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2305oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC2305oQ
    public final C06283i A09(C06283i c06283i) throws C06293j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C06283i.A05;
        }
        if (c06283i.A02 == 2) {
            int i = c06283i.A01 != iArr.length ? 1 : 0;
            int i4 = 0;
            while (i4 < iArr.length) {
                int i6 = iArr[i4];
                if (i6 < c06283i.A01) {
                    i |= i6 != i4 ? 1 : 0;
                    i4++;
                } else {
                    throw new C06293j(c06283i);
                }
            }
            if (i != 0) {
                return new C06283i(c06283i.A03, iArr.length, 2);
            }
            return C06283i.A05;
        }
        throw new C06293j(c06283i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2305oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06303k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC06443y.A01(this.A00);
        int position = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position2 = outputSize - position;
        ByteBuffer A00 = A00(this.A06.A00 * (position2 / this.A05.A00));
        while (position < outputSize) {
            for (int i : iArr) {
                A00.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        A00.flip();
    }
}
