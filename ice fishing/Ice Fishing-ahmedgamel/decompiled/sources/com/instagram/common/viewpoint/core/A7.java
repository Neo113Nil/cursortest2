package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2285oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC2285oQ
    public final C06083i A09(C06083i c06083i) throws C06093j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C06083i.A05;
        }
        if (c06083i.A02 == 2) {
            int i = c06083i.A01 != iArr.length ? 1 : 0;
            int i6 = 0;
            while (i6 < iArr.length) {
                int i9 = iArr[i6];
                if (i9 < c06083i.A01) {
                    i |= i9 != i6 ? 1 : 0;
                    i6++;
                } else {
                    throw new C06093j(c06083i);
                }
            }
            if (i != 0) {
                return new C06083i(c06083i.A03, iArr.length, 2);
            }
            return C06083i.A05;
        }
        throw new C06093j(c06083i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2285oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC06243y.A01(this.A00);
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
