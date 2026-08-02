package com.anythink.basead.exoplayer.b;

import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.foundation.h.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7192a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7193b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7194c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7195d = 1536;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f7196e = {1, 2, 3, 6};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f7197f = {48000, 44100, 32000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f7198g = {24000, 22050, 16000};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f7199h = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, p.a.f20462a, 512, 576, 640};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f7200j = {69, 87, 104, 121, 139, 174, BaseATView.a.f10557G, 243, com.anythink.expressad.foundation.g.a.aW, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.anythink.basead.exoplayer.b.a$a, reason: collision with other inner class name */
    public static final class C0015a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7201a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7202b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7203c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7204d = 2;

        /* renamed from: e, reason: collision with root package name */
        public final String f7205e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7206f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7207g;

        /* renamed from: h, reason: collision with root package name */
        public final int f7208h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f7209j;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.b.a$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0016a {
        }

        public /* synthetic */ C0015a(String str, int i, int i4, int i6, int i9, int i10, byte b9) {
            this(str, i, i4, i6, i9, i10);
        }

        private C0015a(String str, int i, int i4, int i6, int i9, int i10) {
            this.f7205e = str;
            this.f7206f = i;
            this.f7208h = i4;
            this.f7207g = i6;
            this.i = i9;
            this.f7209j = i10;
        }
    }

    private a() {
    }

    public static int a() {
        return f7195d;
    }

    public static com.anythink.basead.exoplayer.m b(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        sVar.d(2);
        int i4 = f7197f[(sVar.d() & 192) >> 6];
        int d9 = sVar.d();
        int i6 = f7199h[(d9 & 14) >> 1];
        if ((d9 & 1) != 0) {
            i6++;
        }
        if (((sVar.d() & 30) >> 1) > 0 && (2 & sVar.d()) != 0) {
            i6 += 2;
        }
        return com.anythink.basead.exoplayer.m.a(str, (sVar.a() <= 0 || (sVar.d() & 1) == 0) ? com.anythink.basead.exoplayer.k.o.f9206A : com.anythink.basead.exoplayer.k.o.f9207B, null, -1, i6, i4, null, eVar, str2);
    }

    public static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        int i4 = f7197f[(sVar.d() & 192) >> 6];
        int d9 = sVar.d();
        int i6 = f7199h[(d9 & 56) >> 3];
        if ((d9 & 4) != 0) {
            i6++;
        }
        return com.anythink.basead.exoplayer.m.a(str, com.anythink.basead.exoplayer.k.o.f9254z, null, -1, i6, i4, null, eVar, str2);
    }

    private static C0015a a(com.anythink.basead.exoplayer.k.r rVar) {
        int a9;
        int i4;
        int i6;
        String str;
        int i9;
        int c9;
        int i10;
        int i11;
        int b9 = rVar.b();
        rVar.b(40);
        boolean z6 = rVar.c(5) == 16;
        rVar.a(b9);
        int i12 = -1;
        if (z6) {
            rVar.b(16);
            int c10 = rVar.c(2);
            if (c10 == 0) {
                i12 = 0;
            } else if (c10 == 1) {
                i12 = 1;
            } else if (c10 == 2) {
                i12 = 2;
            }
            rVar.b(3);
            a9 = (rVar.c(11) + 1) * 2;
            int c11 = rVar.c(2);
            if (c11 == 3) {
                i10 = 6;
                i4 = f7198g[rVar.c(2)];
                c9 = 3;
            } else {
                c9 = rVar.c(2);
                i10 = f7196e[c9];
                i4 = f7197f[c11];
            }
            i9 = i10 * 256;
            int c12 = rVar.c(3);
            boolean d9 = rVar.d();
            i6 = f7199h[c12] + (d9 ? 1 : 0);
            rVar.b(10);
            if (rVar.d()) {
                rVar.b(8);
            }
            if (c12 == 0) {
                rVar.b(5);
                if (rVar.d()) {
                    rVar.b(8);
                }
            }
            if (i12 == 1 && rVar.d()) {
                rVar.b(16);
            }
            if (rVar.d()) {
                if (c12 > 2) {
                    rVar.b(2);
                }
                if ((c12 & 1) != 0 && c12 > 2) {
                    rVar.b(6);
                }
                if ((c12 & 4) != 0) {
                    rVar.b(6);
                }
                if (d9 && rVar.d()) {
                    rVar.b(5);
                }
                if (i12 == 0) {
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    if (c12 == 0 && rVar.d()) {
                        rVar.b(6);
                    }
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    int c13 = rVar.c(2);
                    if (c13 == 1) {
                        rVar.b(5);
                    } else if (c13 == 2) {
                        rVar.b(12);
                    } else if (c13 == 3) {
                        int c14 = rVar.c(5);
                        if (rVar.d()) {
                            rVar.b(5);
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                if (rVar.d()) {
                                    rVar.b(4);
                                }
                                if (rVar.d()) {
                                    rVar.b(4);
                                }
                            }
                        }
                        if (rVar.d()) {
                            rVar.b(5);
                            if (rVar.d()) {
                                rVar.b(7);
                                if (rVar.d()) {
                                    rVar.b(8);
                                }
                            }
                        }
                        rVar.b((c14 + 2) * 8);
                        rVar.e();
                    }
                    if (c12 < 2) {
                        if (rVar.d()) {
                            rVar.b(14);
                        }
                        if (c12 == 0 && rVar.d()) {
                            rVar.b(14);
                        }
                    }
                    if (rVar.d()) {
                        if (c9 == 0) {
                            rVar.b(5);
                        } else {
                            for (int i13 = 0; i13 < i10; i13++) {
                                if (rVar.d()) {
                                    rVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (rVar.d()) {
                rVar.b(5);
                if (c12 == 2) {
                    rVar.b(4);
                }
                if (c12 >= 6) {
                    rVar.b(2);
                }
                if (rVar.d()) {
                    rVar.b(8);
                }
                if (c12 == 0 && rVar.d()) {
                    rVar.b(8);
                }
                i11 = 3;
                if (c11 < 3) {
                    rVar.c();
                }
            } else {
                i11 = 3;
            }
            if (i12 == 0 && c9 != i11) {
                rVar.c();
            }
            if (i12 == 2 && (c9 == i11 || rVar.d())) {
                rVar.b(6);
            }
            if (rVar.d() && rVar.c(6) == 1 && rVar.c(8) == 1) {
                str = com.anythink.basead.exoplayer.k.o.f9207B;
            } else {
                str = com.anythink.basead.exoplayer.k.o.f9206A;
            }
        } else {
            rVar.b(32);
            int c15 = rVar.c(2);
            a9 = a(c15, rVar.c(6));
            rVar.b(8);
            int c16 = rVar.c(3);
            if ((c16 & 1) != 0 && c16 != 1) {
                rVar.b(2);
            }
            if ((c16 & 4) != 0) {
                rVar.b(2);
            }
            if (c16 == 2) {
                rVar.b(2);
            }
            i4 = f7197f[c15];
            i6 = f7199h[c16] + (rVar.d() ? 1 : 0);
            str = com.anythink.basead.exoplayer.k.o.f9254z;
            i9 = f7195d;
        }
        return new C0015a(str, i12, i6, i4, a9, i9, (byte) 0);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i4 = position; i4 <= limit; i4++) {
            if ((byteBuffer.getInt(i4 + 4) & (-16777217)) == -1167101192) {
                return i4 - position;
            }
        }
        return -1;
    }

    private static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b9 = bArr[7];
            if ((b9 & 254) == 186) {
                return 40 << ((bArr[(b9 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    private static int a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b9 = bArr[4];
        return a((b9 & 192) >> 6, b9 & com.anythink.core.common.s.a.c.f17105c);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f7196e[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int a(ByteBuffer byteBuffer, int i4) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i4) + ((byteBuffer.get((byteBuffer.position() + i4) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i4, int i6) {
        int i9 = i6 / 2;
        if (i4 < 0) {
            return -1;
        }
        int[] iArr = f7197f;
        if (i4 >= iArr.length || i6 < 0) {
            return -1;
        }
        int[] iArr2 = f7200j;
        if (i9 >= iArr2.length) {
            return -1;
        }
        int i10 = iArr[i4];
        if (i10 == 44100) {
            return ((i6 % 2) + iArr2[i9]) * 2;
        }
        int i11 = i[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }
}
