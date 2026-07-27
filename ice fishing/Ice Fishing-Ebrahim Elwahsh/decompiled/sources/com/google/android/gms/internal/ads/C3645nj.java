package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3645nj extends AbstractC3698oi {
    public final /* synthetic */ int i;

    public /* synthetic */ C3645nj(int i) {
        this.i = i;
    }

    public static void o(int i, ByteBuffer byteBuffer) {
        float f6 = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f6) ? 0 : Float.floatToIntBits(f6));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7 A[ADDED_TO_REGION, LOOP:19: B:119:0x02c7->B:120:0x02c9, LOOP_START, PHI: r9
      0x02c7: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:76:0x0183, B:120:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i;
        ByteBuffer j9;
        switch (this.i) {
            case 0:
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i4 = limit - position;
                int i9 = this.f33178b.f33433c;
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
                                            i4 /= 4;
                                        }
                                    }
                                }
                                ByteBuffer j10 = j(i4);
                                i = this.f33178b.f33433c;
                                if (i == 3) {
                                    while (position < limit) {
                                        j10.put((byte) 0);
                                        j10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                        position++;
                                    }
                                } else if (i == 4) {
                                    while (position < limit) {
                                        float f6 = byteBuffer.getFloat(position);
                                        String str = AbstractC3548lu.f32613a;
                                        short max = (short) (Math.max(-1.0f, Math.min(f6, 1.0f)) * 32767.0f);
                                        j10.put((byte) (max & 255));
                                        j10.put((byte) ((max >> 8) & com.anythink.basead.exoplayer.k.p.f8630b));
                                        position += 4;
                                    }
                                } else if (i == 21) {
                                    while (position < limit) {
                                        j10.put(byteBuffer.get(position + 1));
                                        j10.put(byteBuffer.get(position + 2));
                                        position += 3;
                                    }
                                } else if (i == 22) {
                                    while (position < limit) {
                                        j10.put(byteBuffer.get(position + 2));
                                        j10.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                } else if (i == 268435456) {
                                    while (position < limit) {
                                        j10.put(byteBuffer.get(position + 1));
                                        j10.put(byteBuffer.get(position));
                                        position += 2;
                                    }
                                } else if (i == 1342177280) {
                                    while (position < limit) {
                                        j10.put(byteBuffer.get(position + 1));
                                        j10.put(byteBuffer.get(position));
                                        position += 3;
                                    }
                                } else if (i == 1610612736) {
                                    while (position < limit) {
                                        j10.put(byteBuffer.get(position + 1));
                                        j10.put(byteBuffer.get(position));
                                        position += 4;
                                    }
                                } else if (i == 1879048192) {
                                    while (position < limit) {
                                        short max2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                        j10.put((byte) (max2 & 255));
                                        j10.put((byte) ((max2 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b));
                                        position += 8;
                                    }
                                } else if (i == 1895825408) {
                                    while (position < limit) {
                                        float intBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position)));
                                        String str2 = AbstractC3548lu.f32613a;
                                        short max3 = (short) (Math.max(-1.0f, Math.min(intBitsToFloat, 1.0f)) * 32767.0f);
                                        j10.put((byte) (max3 & 255));
                                        j10.put((byte) ((max3 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b));
                                        position += 4;
                                    }
                                } else {
                                    if (i != 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    while (position < limit) {
                                        short max4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))), 1.0d)) * 32767.0d);
                                        j10.put((byte) (max4 & 255));
                                        j10.put((byte) ((max4 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b));
                                        position += 8;
                                    }
                                }
                                byteBuffer.position(byteBuffer.limit());
                                j10.flip();
                                return;
                            }
                        }
                        i4 /= 3;
                    }
                    i4 /= 2;
                    ByteBuffer j102 = j(i4);
                    i = this.f33178b.f33433c;
                    if (i == 3) {
                    }
                    byteBuffer.position(byteBuffer.limit());
                    j102.flip();
                    return;
                }
                i4 += i4;
                ByteBuffer j1022 = j(i4);
                i = this.f33178b.f33433c;
                if (i == 3) {
                }
                byteBuffer.position(byteBuffer.limit());
                j1022.flip();
                return;
            default:
                int position2 = byteBuffer.position();
                int limit2 = byteBuffer.limit();
                int i10 = limit2 - position2;
                int i11 = this.f33178b.f33433c;
                if (i11 == 2) {
                    j9 = j(i10 + i10);
                    while (position2 < limit2) {
                        o(byteBuffer.getShort(position2) << 16, j9);
                        position2 += 2;
                    }
                } else if (i11 == 3) {
                    j9 = j(i10 * 4);
                    while (position2 < limit2) {
                        o(((byteBuffer.get(position2) & 255) - 128) << 24, j9);
                        position2++;
                    }
                } else if (i11 == 21) {
                    j9 = j((i10 / 3) * 4);
                    while (position2 < limit2) {
                        o(AbstractC3194fG.w(byteBuffer.get(position2 + 2), byteBuffer.get(position2 + 1), byteBuffer.get(position2), (byte) 0), j9);
                        position2 += 3;
                    }
                } else if (i11 == 22) {
                    j9 = j(i10);
                    while (position2 < limit2) {
                        o(byteBuffer.getInt(position2), j9);
                        position2 += 4;
                    }
                } else if (i11 == 268435456) {
                    j9 = j(i10 + i10);
                    while (position2 < limit2) {
                        o(Short.reverseBytes(byteBuffer.getShort(position2)) << 16, j9);
                        position2 += 2;
                    }
                } else if (i11 == 1342177280) {
                    j9 = j((i10 / 3) * 4);
                    while (position2 < limit2) {
                        o(AbstractC3194fG.w(byteBuffer.get(position2), byteBuffer.get(position2 + 1), byteBuffer.get(position2 + 2), (byte) 0), j9);
                        position2 += 3;
                    }
                } else if (i11 == 1610612736) {
                    j9 = j(i10);
                    while (position2 < limit2) {
                        o(Integer.reverseBytes(byteBuffer.getInt(position2)), j9);
                        position2 += 4;
                    }
                } else if (i11 == 1879048192) {
                    j9 = j(i10 / 2);
                    while (position2 < limit2) {
                        j9.putFloat((float) byteBuffer.getDouble(position2));
                        position2 += 8;
                    }
                } else if (i11 == 1895825408) {
                    j9 = j(i10);
                    while (position2 < limit2) {
                        j9.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position2))));
                        position2 += 4;
                    }
                } else {
                    if (i11 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    j9 = j(i10 / 2);
                    while (position2 < limit2) {
                        j9.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position2))));
                        position2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                j9.flip();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final C3751ph k(C3751ph c3751ph) {
        switch (this.i) {
            case 0:
                int i = c3751ph.f33433c;
                if (AbstractC3548lu.d(i)) {
                    return i != 2 ? new C3751ph(c3751ph.f33431a, c3751ph.f33432b, 2) : C3751ph.f33430e;
                }
                throw new C2894Zh("Unhandled input format:", c3751ph);
            default:
                int i4 = c3751ph.f33433c;
                if (AbstractC3548lu.d(i4)) {
                    return i4 != 4 ? new C3751ph(c3751ph.f33431a, c3751ph.f33432b, 4) : C3751ph.f33430e;
                }
                throw new C2894Zh("Unhandled input format:", c3751ph);
        }
    }
}
