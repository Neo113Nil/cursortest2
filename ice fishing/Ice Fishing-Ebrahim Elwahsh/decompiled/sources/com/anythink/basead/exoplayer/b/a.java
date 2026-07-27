package com.anythink.basead.exoplayer.b;

import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.foundation.h.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6563a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6564b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6565c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final int f6566d = 1536;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6567e = {1, 2, 3, 6};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f6568f = {48000, 44100, 32000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f6569g = {24000, 22050, 16000};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f6570h = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, p.a.f19833a, 512, 576, 640};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f6571j = {69, 87, 104, 121, 139, 174, BaseATView.a.f9928G, 243, com.anythink.expressad.foundation.g.a.aW, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.anythink.basead.exoplayer.b.a$a, reason: collision with other inner class name */
    public static final class C0014a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6572a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6573b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6574c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6575d = 2;

        /* renamed from: e, reason: collision with root package name */
        public final String f6576e;

        /* renamed from: f, reason: collision with root package name */
        public final int f6577f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6578g;

        /* renamed from: h, reason: collision with root package name */
        public final int f6579h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f6580j;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.b.a$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0015a {
        }

        public /* synthetic */ C0014a(String str, int i, int i4, int i9, int i10, int i11, byte b9) {
            this(str, i, i4, i9, i10, i11);
        }

        private C0014a(String str, int i, int i4, int i9, int i10, int i11) {
            this.f6576e = str;
            this.f6577f = i;
            this.f6579h = i4;
            this.f6578g = i9;
            this.i = i10;
            this.f6580j = i11;
        }
    }

    private a() {
    }

    public static int a() {
        return f6566d;
    }

    public static com.anythink.basead.exoplayer.m b(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        sVar.d(2);
        int i4 = f6568f[(sVar.d() & 192) >> 6];
        int d2 = sVar.d();
        int i9 = f6570h[(d2 & 14) >> 1];
        if ((d2 & 1) != 0) {
            i9++;
        }
        if (((sVar.d() & 30) >> 1) > 0 && (2 & sVar.d()) != 0) {
            i9 += 2;
        }
        return com.anythink.basead.exoplayer.m.a(str, (sVar.a() <= 0 || (sVar.d() & 1) == 0) ? com.anythink.basead.exoplayer.k.o.f8577A : com.anythink.basead.exoplayer.k.o.f8578B, null, -1, i9, i4, null, eVar, str2);
    }

    public static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        int i4 = f6568f[(sVar.d() & 192) >> 6];
        int d2 = sVar.d();
        int i9 = f6570h[(d2 & 56) >> 3];
        if ((d2 & 4) != 0) {
            i9++;
        }
        return com.anythink.basead.exoplayer.m.a(str, com.anythink.basead.exoplayer.k.o.f8625z, null, -1, i9, i4, null, eVar, str2);
    }

    private static C0014a a(com.anythink.basead.exoplayer.k.r rVar) {
        int a9;
        int i4;
        int i9;
        String str;
        int i10;
        int c4;
        int i11;
        int i12;
        int b9 = rVar.b();
        rVar.b(40);
        boolean z8 = rVar.c(5) == 16;
        rVar.a(b9);
        int i13 = -1;
        if (z8) {
            rVar.b(16);
            int c9 = rVar.c(2);
            if (c9 == 0) {
                i13 = 0;
            } else if (c9 == 1) {
                i13 = 1;
            } else if (c9 == 2) {
                i13 = 2;
            }
            rVar.b(3);
            a9 = (rVar.c(11) + 1) * 2;
            int c10 = rVar.c(2);
            if (c10 == 3) {
                i11 = 6;
                i4 = f6569g[rVar.c(2)];
                c4 = 3;
            } else {
                c4 = rVar.c(2);
                i11 = f6567e[c4];
                i4 = f6568f[c10];
            }
            i10 = i11 * 256;
            int c11 = rVar.c(3);
            boolean d2 = rVar.d();
            i9 = f6570h[c11] + (d2 ? 1 : 0);
            rVar.b(10);
            if (rVar.d()) {
                rVar.b(8);
            }
            if (c11 == 0) {
                rVar.b(5);
                if (rVar.d()) {
                    rVar.b(8);
                }
            }
            if (i13 == 1 && rVar.d()) {
                rVar.b(16);
            }
            if (rVar.d()) {
                if (c11 > 2) {
                    rVar.b(2);
                }
                if ((c11 & 1) != 0 && c11 > 2) {
                    rVar.b(6);
                }
                if ((c11 & 4) != 0) {
                    rVar.b(6);
                }
                if (d2 && rVar.d()) {
                    rVar.b(5);
                }
                if (i13 == 0) {
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    if (c11 == 0 && rVar.d()) {
                        rVar.b(6);
                    }
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    int c12 = rVar.c(2);
                    if (c12 == 1) {
                        rVar.b(5);
                    } else if (c12 == 2) {
                        rVar.b(12);
                    } else if (c12 == 3) {
                        int c13 = rVar.c(5);
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
                        rVar.b((c13 + 2) * 8);
                        rVar.e();
                    }
                    if (c11 < 2) {
                        if (rVar.d()) {
                            rVar.b(14);
                        }
                        if (c11 == 0 && rVar.d()) {
                            rVar.b(14);
                        }
                    }
                    if (rVar.d()) {
                        if (c4 == 0) {
                            rVar.b(5);
                        } else {
                            for (int i14 = 0; i14 < i11; i14++) {
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
                if (c11 == 2) {
                    rVar.b(4);
                }
                if (c11 >= 6) {
                    rVar.b(2);
                }
                if (rVar.d()) {
                    rVar.b(8);
                }
                if (c11 == 0 && rVar.d()) {
                    rVar.b(8);
                }
                i12 = 3;
                if (c10 < 3) {
                    rVar.c();
                }
            } else {
                i12 = 3;
            }
            if (i13 == 0 && c4 != i12) {
                rVar.c();
            }
            if (i13 == 2 && (c4 == i12 || rVar.d())) {
                rVar.b(6);
            }
            if (rVar.d() && rVar.c(6) == 1 && rVar.c(8) == 1) {
                str = com.anythink.basead.exoplayer.k.o.f8578B;
            } else {
                str = com.anythink.basead.exoplayer.k.o.f8577A;
            }
        } else {
            rVar.b(32);
            int c14 = rVar.c(2);
            a9 = a(c14, rVar.c(6));
            rVar.b(8);
            int c15 = rVar.c(3);
            if ((c15 & 1) != 0 && c15 != 1) {
                rVar.b(2);
            }
            if ((c15 & 4) != 0) {
                rVar.b(2);
            }
            if (c15 == 2) {
                rVar.b(2);
            }
            i4 = f6568f[c14];
            i9 = f6570h[c15] + (rVar.d() ? 1 : 0);
            str = com.anythink.basead.exoplayer.k.o.f8625z;
            i10 = f6566d;
        }
        return new C0014a(str, i13, i9, i4, a9, i10, (byte) 0);
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
        return a((b9 & 192) >> 6, b9 & com.anythink.core.common.s.a.c.f16476c);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f6567e[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int a(ByteBuffer byteBuffer, int i4) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i4) + ((byteBuffer.get((byteBuffer.position() + i4) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i4, int i9) {
        int i10 = i9 / 2;
        if (i4 < 0) {
            return -1;
        }
        int[] iArr = f6568f;
        if (i4 >= iArr.length || i9 < 0) {
            return -1;
        }
        int[] iArr2 = f6571j;
        if (i10 >= iArr2.length) {
            return -1;
        }
        int i11 = iArr[i4];
        if (i11 == 44100) {
            return ((i9 % 2) + iArr2[i10]) * 2;
        }
        int i12 = i[i10];
        return i11 == 32000 ? i12 * 6 : i12 * 4;
    }
}
