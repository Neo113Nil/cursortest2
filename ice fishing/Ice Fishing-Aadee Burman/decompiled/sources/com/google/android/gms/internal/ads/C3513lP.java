package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.lP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3513lP extends AbstractC3631ni {
    public RC i;

    /* renamed from: j, reason: collision with root package name */
    public RC f31763j;

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void a(ByteBuffer byteBuffer) {
        RC rc = this.f31763j;
        rc.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer g4 = g(((limit - position) / this.f32753b.f32752d) * this.f32754c.f32752d);
        while (position < limit) {
            for (int i = 0; i < rc.f27180u; i++) {
                int f3 = (AbstractC3159eu.f(this.f32753b.f32751c) * rc.a(i)) + position;
                int i6 = this.f32753b.f32751c;
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 21) {
                                if (i6 != 22) {
                                    if (i6 != 268435456) {
                                        if (i6 != 1342177280) {
                                            if (i6 != 1610612736) {
                                                if (i6 != 1879048192) {
                                                    if (i6 != 1895825408) {
                                                        if (i6 != 1912602624) {
                                                            throw new IllegalStateException(D.y.m(i6, "Unexpected encoding: ", new StringBuilder(String.valueOf(i6).length() + 21)));
                                                        }
                                                    }
                                                }
                                                g4.putDouble(byteBuffer.getDouble(f3));
                                            }
                                        }
                                    }
                                }
                                g4.putInt(byteBuffer.getInt(f3));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b9 = byteBuffer.get(order == byteOrder ? f3 : f3 + 2);
                            byte b10 = byteBuffer.get(f3 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                f3 += 2;
                            }
                            int i9 = ((b9 << 24) & (-16777216)) | ((b10 << 16) & 16711680) | ((byteBuffer.get(f3) << 8) & 65280);
                            int i10 = i9 >> 8;
                            AbstractC2772Sd.C((i10 & (-16777216)) == 0 || (i10 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i10));
                            AbstractC2772Sd.i(g4.remaining() >= 3);
                            g4.put((byte) (g4.order() == byteOrder ? (i9 >> 24) & com.anythink.basead.exoplayer.k.p.f8473b : i10 & com.anythink.basead.exoplayer.k.p.f8473b)).put((byte) ((i9 >> 16) & com.anythink.basead.exoplayer.k.p.f8473b)).put((byte) (g4.order() == byteOrder ? i10 & com.anythink.basead.exoplayer.k.p.f8473b : (i9 >> 24) & com.anythink.basead.exoplayer.k.p.f8473b));
                        }
                        g4.putFloat(byteBuffer.getFloat(f3));
                    } else {
                        g4.put(byteBuffer.get(f3));
                    }
                }
                g4.putShort(byteBuffer.getShort(f3));
            }
            position += this.f32753b.f32752d;
        }
        byteBuffer.position(limit);
        g4.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final C3630nh k(C3630nh c3630nh) {
        RC rc = this.i;
        if (rc == null) {
            return C3630nh.f32748e;
        }
        int i = c3630nh.f32751c;
        if (!AbstractC3159eu.d(i)) {
            throw new C2840Wh("Unhandled input format:", c3630nh);
        }
        int i6 = rc.f27180u;
        int i9 = c3630nh.f32750b;
        boolean z3 = i9 != i6;
        int i10 = 0;
        while (i10 < i6) {
            int a9 = rc.a(i10);
            if (a9 >= i9) {
                String rc2 = rc.toString();
                throw new C2840Wh(D.y.s(new StringBuilder(rc2.length() + 59), "Channel map (", rc2, ") trying to access non-existent input channel."), c3630nh);
            }
            z3 |= a9 != i10;
            i10++;
        }
        return z3 ? new C3630nh(c3630nh.f32749a, i6, i) : C3630nh.f32748e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void m() {
        this.f31763j = this.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final void n() {
        this.f31763j = null;
        this.i = null;
    }
}
