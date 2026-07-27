package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3363ij extends AbstractC3631ni {
    public final /* synthetic */ int i;

    public /* synthetic */ C3363ij(int i) {
        this.i = i;
    }

    public static void o(int i, ByteBuffer byteBuffer) {
        float f3 = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f3) ? 0 : Float.floatToIntBits(f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7 A[ADDED_TO_REGION, LOOP:19: B:119:0x02c7->B:120:0x02c9, LOOP_START, PHI: r9
      0x02c7: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:76:0x0183, B:120:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i;
        ByteBuffer g4;
        switch (this.i) {
            case 0:
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i6 = limit - position;
                int i9 = this.f32753b.f32751c;
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 21) {
                            if (i9 != 22) {
                                if (i9 != 268435456) {
                                    if (i9 != 1342177280) {
                                        if (i9 != 1610612736) {
                                            if (i9 != 1879048192) {
                                                if (i9 != 1895825408) {
                                                    if (i9 != 1912602624) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                            }
                                            i6 /= 4;
                                        }
                                    }
                                }
                                ByteBuffer g9 = g(i6);
                                i = this.f32753b.f32751c;
                                if (i == 3) {
                                    while (position < limit) {
                                        g9.put((byte) 0);
                                        g9.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                        position++;
                                    }
                                } else if (i == 4) {
                                    while (position < limit) {
                                        float f3 = byteBuffer.getFloat(position);
                                        String str = AbstractC3159eu.f29993a;
                                        short max = (short) (Math.max(-1.0f, Math.min(f3, 1.0f)) * 32767.0f);
                                        g9.put((byte) (max & 255));
                                        g9.put((byte) ((max >> 8) & com.anythink.basead.exoplayer.k.p.f8473b));
                                        position += 4;
                                    }
                                } else if (i == 21) {
                                    while (position < limit) {
                                        g9.put(byteBuffer.get(position + 1));
                                        g9.put(byteBuffer.get(position + 2));
                                        position += 3;
                                    }
                                } else if (i == 22) {
                                    while (position < limit) {
                                        g9.put(byteBuffer.get(position + 2));
                                        g9.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                } else if (i == 268435456) {
                                    while (position < limit) {
                                        g9.put(byteBuffer.get(position + 1));
                                        g9.put(byteBuffer.get(position));
                                        position += 2;
                                    }
                                } else if (i == 1342177280) {
                                    while (position < limit) {
                                        g9.put(byteBuffer.get(position + 1));
                                        g9.put(byteBuffer.get(position));
                                        position += 3;
                                    }
                                } else if (i == 1610612736) {
                                    while (position < limit) {
                                        g9.put(byteBuffer.get(position + 1));
                                        g9.put(byteBuffer.get(position));
                                        position += 4;
                                    }
                                } else if (i == 1879048192) {
                                    while (position < limit) {
                                        short max2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                        g9.put((byte) (max2 & 255));
                                        g9.put((byte) ((max2 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b));
                                        position += 8;
                                    }
                                } else if (i == 1895825408) {
                                    while (position < limit) {
                                        float intBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position)));
                                        String str2 = AbstractC3159eu.f29993a;
                                        short max3 = (short) (Math.max(-1.0f, Math.min(intBitsToFloat, 1.0f)) * 32767.0f);
                                        g9.put((byte) (max3 & 255));
                                        g9.put((byte) ((max3 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b));
                                        position += 4;
                                    }
                                } else {
                                    if (i != 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    while (position < limit) {
                                        short max4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))), 1.0d)) * 32767.0d);
                                        g9.put((byte) (max4 & 255));
                                        g9.put((byte) ((max4 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b));
                                        position += 8;
                                    }
                                }
                                byteBuffer.position(byteBuffer.limit());
                                g9.flip();
                                return;
                            }
                        }
                        i6 /= 3;
                    }
                    i6 /= 2;
                    ByteBuffer g92 = g(i6);
                    i = this.f32753b.f32751c;
                    if (i == 3) {
                    }
                    byteBuffer.position(byteBuffer.limit());
                    g92.flip();
                    return;
                }
                i6 += i6;
                ByteBuffer g922 = g(i6);
                i = this.f32753b.f32751c;
                if (i == 3) {
                }
                byteBuffer.position(byteBuffer.limit());
                g922.flip();
                return;
            default:
                int position2 = byteBuffer.position();
                int limit2 = byteBuffer.limit();
                int i10 = limit2 - position2;
                int i11 = this.f32753b.f32751c;
                if (i11 == 2) {
                    g4 = g(i10 + i10);
                    while (position2 < limit2) {
                        o(byteBuffer.getShort(position2) << 16, g4);
                        position2 += 2;
                    }
                } else if (i11 == 3) {
                    g4 = g(i10 * 4);
                    while (position2 < limit2) {
                        o(((byteBuffer.get(position2) & 255) - 128) << 24, g4);
                        position2++;
                    }
                } else if (i11 == 21) {
                    g4 = g((i10 / 3) * 4);
                    while (position2 < limit2) {
                        o(UC.m(byteBuffer.get(position2 + 2), byteBuffer.get(position2 + 1), byteBuffer.get(position2), (byte) 0), g4);
                        position2 += 3;
                    }
                } else if (i11 == 22) {
                    g4 = g(i10);
                    while (position2 < limit2) {
                        o(byteBuffer.getInt(position2), g4);
                        position2 += 4;
                    }
                } else if (i11 == 268435456) {
                    g4 = g(i10 + i10);
                    while (position2 < limit2) {
                        o(Short.reverseBytes(byteBuffer.getShort(position2)) << 16, g4);
                        position2 += 2;
                    }
                } else if (i11 == 1342177280) {
                    g4 = g((i10 / 3) * 4);
                    while (position2 < limit2) {
                        o(UC.m(byteBuffer.get(position2), byteBuffer.get(position2 + 1), byteBuffer.get(position2 + 2), (byte) 0), g4);
                        position2 += 3;
                    }
                } else if (i11 == 1610612736) {
                    g4 = g(i10);
                    while (position2 < limit2) {
                        o(Integer.reverseBytes(byteBuffer.getInt(position2)), g4);
                        position2 += 4;
                    }
                } else if (i11 == 1879048192) {
                    g4 = g(i10 / 2);
                    while (position2 < limit2) {
                        g4.putFloat((float) byteBuffer.getDouble(position2));
                        position2 += 8;
                    }
                } else if (i11 == 1895825408) {
                    g4 = g(i10);
                    while (position2 < limit2) {
                        g4.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position2))));
                        position2 += 4;
                    }
                } else {
                    if (i11 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    g4 = g(i10 / 2);
                    while (position2 < limit2) {
                        g4.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position2))));
                        position2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                g4.flip();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3631ni
    public final C3630nh k(C3630nh c3630nh) {
        switch (this.i) {
            case 0:
                int i = c3630nh.f32751c;
                if (AbstractC3159eu.d(i)) {
                    return i != 2 ? new C3630nh(c3630nh.f32749a, c3630nh.f32750b, 2) : C3630nh.f32748e;
                }
                throw new C2840Wh("Unhandled input format:", c3630nh);
            default:
                int i6 = c3630nh.f32751c;
                if (AbstractC3159eu.d(i6)) {
                    return i6 != 4 ? new C3630nh(c3630nh.f32749a, c3630nh.f32750b, 4) : C3630nh.f32748e;
                }
                throw new C2840Wh("Unhandled input format:", c3630nh);
        }
    }
}
