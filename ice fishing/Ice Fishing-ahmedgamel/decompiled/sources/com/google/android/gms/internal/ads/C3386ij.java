package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3386ij extends AbstractC3654ni {
    public final /* synthetic */ int i;

    public /* synthetic */ C3386ij(int i) {
        this.i = i;
    }

    public static void o(int i, ByteBuffer byteBuffer) {
        float f2 = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f2) ? 0 : Float.floatToIntBits(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7 A[ADDED_TO_REGION, LOOP:19: B:119:0x02c7->B:120:0x02c9, LOOP_START, PHI: r9
      0x02c7: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:76:0x0183, B:120:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i;
        ByteBuffer g9;
        switch (this.i) {
            case 0:
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i4 = limit - position;
                int i6 = this.f33540b.f33538c;
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
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            }
                                            i4 /= 4;
                                        }
                                    }
                                }
                                ByteBuffer g10 = g(i4);
                                i = this.f33540b.f33538c;
                                if (i == 3) {
                                    while (position < limit) {
                                        g10.put((byte) 0);
                                        g10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                        position++;
                                    }
                                } else if (i == 4) {
                                    while (position < limit) {
                                        float f2 = byteBuffer.getFloat(position);
                                        String str = AbstractC3182eu.f30782a;
                                        short max = (short) (Math.max(-1.0f, Math.min(f2, 1.0f)) * 32767.0f);
                                        g10.put((byte) (max & 255));
                                        g10.put((byte) ((max >> 8) & com.anythink.basead.exoplayer.k.p.f9259b));
                                        position += 4;
                                    }
                                } else if (i == 21) {
                                    while (position < limit) {
                                        g10.put(byteBuffer.get(position + 1));
                                        g10.put(byteBuffer.get(position + 2));
                                        position += 3;
                                    }
                                } else if (i == 22) {
                                    while (position < limit) {
                                        g10.put(byteBuffer.get(position + 2));
                                        g10.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                } else if (i == 268435456) {
                                    while (position < limit) {
                                        g10.put(byteBuffer.get(position + 1));
                                        g10.put(byteBuffer.get(position));
                                        position += 2;
                                    }
                                } else if (i == 1342177280) {
                                    while (position < limit) {
                                        g10.put(byteBuffer.get(position + 1));
                                        g10.put(byteBuffer.get(position));
                                        position += 3;
                                    }
                                } else if (i == 1610612736) {
                                    while (position < limit) {
                                        g10.put(byteBuffer.get(position + 1));
                                        g10.put(byteBuffer.get(position));
                                        position += 4;
                                    }
                                } else if (i == 1879048192) {
                                    while (position < limit) {
                                        short max2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                        g10.put((byte) (max2 & 255));
                                        g10.put((byte) ((max2 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b));
                                        position += 8;
                                    }
                                } else if (i == 1895825408) {
                                    while (position < limit) {
                                        float intBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position)));
                                        String str2 = AbstractC3182eu.f30782a;
                                        short max3 = (short) (Math.max(-1.0f, Math.min(intBitsToFloat, 1.0f)) * 32767.0f);
                                        g10.put((byte) (max3 & 255));
                                        g10.put((byte) ((max3 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b));
                                        position += 4;
                                    }
                                } else {
                                    if (i != 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    while (position < limit) {
                                        short max4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))), 1.0d)) * 32767.0d);
                                        g10.put((byte) (max4 & 255));
                                        g10.put((byte) ((max4 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b));
                                        position += 8;
                                    }
                                }
                                byteBuffer.position(byteBuffer.limit());
                                g10.flip();
                                return;
                            }
                        }
                        i4 /= 3;
                    }
                    i4 /= 2;
                    ByteBuffer g102 = g(i4);
                    i = this.f33540b.f33538c;
                    if (i == 3) {
                    }
                    byteBuffer.position(byteBuffer.limit());
                    g102.flip();
                    return;
                }
                i4 += i4;
                ByteBuffer g1022 = g(i4);
                i = this.f33540b.f33538c;
                if (i == 3) {
                }
                byteBuffer.position(byteBuffer.limit());
                g1022.flip();
                return;
            default:
                int position2 = byteBuffer.position();
                int limit2 = byteBuffer.limit();
                int i9 = limit2 - position2;
                int i10 = this.f33540b.f33538c;
                if (i10 == 2) {
                    g9 = g(i9 + i9);
                    while (position2 < limit2) {
                        o(byteBuffer.getShort(position2) << 16, g9);
                        position2 += 2;
                    }
                } else if (i10 == 3) {
                    g9 = g(i9 * 4);
                    while (position2 < limit2) {
                        o(((byteBuffer.get(position2) & 255) - 128) << 24, g9);
                        position2++;
                    }
                } else if (i10 == 21) {
                    g9 = g((i9 / 3) * 4);
                    while (position2 < limit2) {
                        o(UC.m(byteBuffer.get(position2 + 2), byteBuffer.get(position2 + 1), byteBuffer.get(position2), (byte) 0), g9);
                        position2 += 3;
                    }
                } else if (i10 == 22) {
                    g9 = g(i9);
                    while (position2 < limit2) {
                        o(byteBuffer.getInt(position2), g9);
                        position2 += 4;
                    }
                } else if (i10 == 268435456) {
                    g9 = g(i9 + i9);
                    while (position2 < limit2) {
                        o(Short.reverseBytes(byteBuffer.getShort(position2)) << 16, g9);
                        position2 += 2;
                    }
                } else if (i10 == 1342177280) {
                    g9 = g((i9 / 3) * 4);
                    while (position2 < limit2) {
                        o(UC.m(byteBuffer.get(position2), byteBuffer.get(position2 + 1), byteBuffer.get(position2 + 2), (byte) 0), g9);
                        position2 += 3;
                    }
                } else if (i10 == 1610612736) {
                    g9 = g(i9);
                    while (position2 < limit2) {
                        o(Integer.reverseBytes(byteBuffer.getInt(position2)), g9);
                        position2 += 4;
                    }
                } else if (i10 == 1879048192) {
                    g9 = g(i9 / 2);
                    while (position2 < limit2) {
                        g9.putFloat((float) byteBuffer.getDouble(position2));
                        position2 += 8;
                    }
                } else if (i10 == 1895825408) {
                    g9 = g(i9);
                    while (position2 < limit2) {
                        g9.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position2))));
                        position2 += 4;
                    }
                } else {
                    if (i10 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    g9 = g(i9 / 2);
                    while (position2 < limit2) {
                        g9.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position2))));
                        position2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                g9.flip();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3654ni
    public final C3653nh k(C3653nh c3653nh) {
        switch (this.i) {
            case 0:
                int i = c3653nh.f33538c;
                if (AbstractC3182eu.d(i)) {
                    return i != 2 ? new C3653nh(c3653nh.f33536a, c3653nh.f33537b, 2) : C3653nh.f33535e;
                }
                throw new C2863Wh("Unhandled input format:", c3653nh);
            default:
                int i4 = c3653nh.f33538c;
                if (AbstractC3182eu.d(i4)) {
                    return i4 != 4 ? new C3653nh(c3653nh.f33536a, c3653nh.f33537b, 4) : C3653nh.f33535e;
                }
                throw new C2863Wh("Unhandled input format:", c3653nh);
        }
    }
}
