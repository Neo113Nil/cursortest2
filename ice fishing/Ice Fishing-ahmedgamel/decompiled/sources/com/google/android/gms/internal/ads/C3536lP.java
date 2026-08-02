package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.lP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3536lP extends AbstractC3654ni {
    public RC i;

    /* renamed from: j, reason: collision with root package name */
    public RC f32543j;

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void a(ByteBuffer byteBuffer) {
        RC rc = this.f32543j;
        rc.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer g9 = g(((limit - position) / this.f33540b.f33539d) * this.f33541c.f33539d);
        while (position < limit) {
            for (int i = 0; i < rc.f27936u; i++) {
                int f2 = (AbstractC3182eu.f(this.f33540b.f33538c) * rc.a(i)) + position;
                int i4 = this.f33540b.f33538c;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 21) {
                                if (i4 != 22) {
                                    if (i4 != 268435456) {
                                        if (i4 != 1342177280) {
                                            if (i4 != 1610612736) {
                                                if (i4 != 1879048192) {
                                                    if (i4 != 1895825408) {
                                                        if (i4 != 1912602624) {
                                                            throw new IllegalStateException(D.x.k(i4, "Unexpected encoding: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                                                        }
                                                    }
                                                }
                                                g9.putDouble(byteBuffer.getDouble(f2));
                                            }
                                        }
                                    }
                                }
                                g9.putInt(byteBuffer.getInt(f2));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b9 = byteBuffer.get(order == byteOrder ? f2 : f2 + 2);
                            byte b10 = byteBuffer.get(f2 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                f2 += 2;
                            }
                            int i6 = ((b9 << 24) & (-16777216)) | ((b10 << 16) & 16711680) | ((byteBuffer.get(f2) << 8) & 65280);
                            int i9 = i6 >> 8;
                            AbstractC2792Sd.C((i9 & (-16777216)) == 0 || (i9 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i9));
                            AbstractC2792Sd.i(g9.remaining() >= 3);
                            g9.put((byte) (g9.order() == byteOrder ? (i6 >> 24) & com.anythink.basead.exoplayer.k.p.f9259b : i9 & com.anythink.basead.exoplayer.k.p.f9259b)).put((byte) ((i6 >> 16) & com.anythink.basead.exoplayer.k.p.f9259b)).put((byte) (g9.order() == byteOrder ? i9 & com.anythink.basead.exoplayer.k.p.f9259b : (i6 >> 24) & com.anythink.basead.exoplayer.k.p.f9259b));
                        }
                        g9.putFloat(byteBuffer.getFloat(f2));
                    } else {
                        g9.put(byteBuffer.get(f2));
                    }
                }
                g9.putShort(byteBuffer.getShort(f2));
            }
            position += this.f33540b.f33539d;
        }
        byteBuffer.position(limit);
        g9.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final C3653nh k(C3653nh c3653nh) {
        RC rc = this.i;
        if (rc == null) {
            return C3653nh.f33535e;
        }
        int i = c3653nh.f33538c;
        if (!AbstractC3182eu.d(i)) {
            throw new C2863Wh("Unhandled input format:", c3653nh);
        }
        int i4 = rc.f27936u;
        int i6 = c3653nh.f33537b;
        boolean z6 = i6 != i4;
        int i9 = 0;
        while (i9 < i4) {
            int a9 = rc.a(i9);
            if (a9 >= i6) {
                String rc2 = rc.toString();
                throw new C2863Wh(D.x.p(new StringBuilder(rc2.length() + 59), "Channel map (", rc2, ") trying to access non-existent input channel."), c3653nh);
            }
            z6 |= a9 != i9;
            i9++;
        }
        return z6 ? new C3653nh(c3653nh.f33536a, i4, i) : C3653nh.f33535e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void m() {
        this.f32543j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final void n() {
        this.f32543j = null;
        this.i = null;
    }
}
