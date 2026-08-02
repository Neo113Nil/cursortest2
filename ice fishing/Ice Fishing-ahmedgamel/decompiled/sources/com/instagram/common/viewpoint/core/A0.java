package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A0 extends AbstractC2305oQ {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(int i, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A00) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2305oQ
    public final C06283i A09(C06283i c06283i) throws C06293j {
        int i = c06283i.A02;
        if (C5C.A14(i)) {
            if (i != 4) {
                return new C06283i(c06283i.A03, c06283i.A01, 4);
            }
            return C06283i.A05;
        }
        throw new C06293j(c06283i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06303k
    public final void AHH(ByteBuffer byteBuffer) {
        ByteBuffer A002;
        int i = byteBuffer.position();
        int limit = byteBuffer.limit();
        int limit2 = limit - i;
        int position = this.A05.A02;
        switch (position) {
            case 536870912:
                int position2 = limit2 / 3;
                A002 = A00(position2 * 4);
                while (i < limit) {
                    int position3 = byteBuffer.get(i);
                    int limit3 = (position3 & p.f9259b) << 8;
                    int position4 = i + 1;
                    int limit4 = limit3 | ((byteBuffer.get(position4) & p.f9259b) << 16);
                    int position5 = i + 2;
                    A00(limit4 | ((byteBuffer.get(position5) & p.f9259b) << 24), A002);
                    i += 3;
                }
                break;
            case 805306368:
                A002 = A00(limit2);
                while (i < limit) {
                    int position6 = byteBuffer.get(i);
                    int limit5 = position6 & p.f9259b;
                    int position7 = i + 1;
                    int limit6 = limit5 | ((byteBuffer.get(position7) & p.f9259b) << 8);
                    int position8 = i + 2;
                    int limit7 = limit6 | ((byteBuffer.get(position8) & p.f9259b) << 16);
                    int position9 = i + 3;
                    A00(limit7 | ((byteBuffer.get(position9) & p.f9259b) << 24), A002);
                    i += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        A002.flip();
    }
}
