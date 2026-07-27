package com.anythink.basead.exoplayer.b;

import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.foundation.h.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6406a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6407b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6408c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final int f6409d = 1536;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6410e = {1, 2, 3, 6};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f6411f = {48000, 44100, 32000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f6412g = {24000, 22050, 16000};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f6413h = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, p.a.f19675a, 512, 576, 640};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f6414j = {69, 87, 104, 121, 139, 174, BaseATView.a.f9771G, 243, com.anythink.expressad.foundation.g.a.aW, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.anythink.basead.exoplayer.b.a$a, reason: collision with other inner class name */
    public static final class C0015a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6415a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6416b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6417c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6418d = 2;

        /* renamed from: e, reason: collision with root package name */
        public final String f6419e;

        /* renamed from: f, reason: collision with root package name */
        public final int f6420f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6421g;

        /* renamed from: h, reason: collision with root package name */
        public final int f6422h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f6423j;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.b.a$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0016a {
        }

        public /* synthetic */ C0015a(String str, int i, int i6, int i9, int i10, int i11, byte b9) {
            this(str, i, i6, i9, i10, i11);
        }

        private C0015a(String str, int i, int i6, int i9, int i10, int i11) {
            this.f6419e = str;
            this.f6420f = i;
            this.f6422h = i6;
            this.f6421g = i9;
            this.i = i10;
            this.f6423j = i11;
        }
    }

    private a() {
    }

    public static int a() {
        return f6409d;
    }

    public static com.anythink.basead.exoplayer.m b(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        sVar.d(2);
        int i6 = f6411f[(sVar.d() & 192) >> 6];
        int d2 = sVar.d();
        int i9 = f6413h[(d2 & 14) >> 1];
        if ((d2 & 1) != 0) {
            i9++;
        }
        if (((sVar.d() & 30) >> 1) > 0 && (2 & sVar.d()) != 0) {
            i9 += 2;
        }
        return com.anythink.basead.exoplayer.m.a(str, (sVar.a() <= 0 || (sVar.d() & 1) == 0) ? com.anythink.basead.exoplayer.k.o.f8420A : com.anythink.basead.exoplayer.k.o.f8421B, null, -1, i9, i6, null, eVar, str2);
    }

    public static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        int i6 = f6411f[(sVar.d() & 192) >> 6];
        int d2 = sVar.d();
        int i9 = f6413h[(d2 & 56) >> 3];
        if ((d2 & 4) != 0) {
            i9++;
        }
        return com.anythink.basead.exoplayer.m.a(str, com.anythink.basead.exoplayer.k.o.f8468z, null, -1, i9, i6, null, eVar, str2);
    }

    private static C0015a a(com.anythink.basead.exoplayer.k.r rVar) {
        int a9;
        int i6;
        int i9;
        String str;
        int i10;
        int c9;
        int i11;
        int i12;
        int b9 = rVar.b();
        rVar.b(40);
        boolean z3 = rVar.c(5) == 16;
        rVar.a(b9);
        int i13 = -1;
        if (z3) {
            rVar.b(16);
            int c10 = rVar.c(2);
            if (c10 == 0) {
                i13 = 0;
            } else if (c10 == 1) {
                i13 = 1;
            } else if (c10 == 2) {
                i13 = 2;
            }
            rVar.b(3);
            a9 = (rVar.c(11) + 1) * 2;
            int c11 = rVar.c(2);
            if (c11 == 3) {
                i11 = 6;
                i6 = f6412g[rVar.c(2)];
                c9 = 3;
            } else {
                c9 = rVar.c(2);
                i11 = f6410e[c9];
                i6 = f6411f[c11];
            }
            i10 = i11 * 256;
            int c12 = rVar.c(3);
            boolean d2 = rVar.d();
            i9 = f6413h[c12] + (d2 ? 1 : 0);
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
            if (i13 == 1 && rVar.d()) {
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
                if (d2 && rVar.d()) {
                    rVar.b(5);
                }
                if (i13 == 0) {
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
                i12 = 3;
                if (c11 < 3) {
                    rVar.c();
                }
            } else {
                i12 = 3;
            }
            if (i13 == 0 && c9 != i12) {
                rVar.c();
            }
            if (i13 == 2 && (c9 == i12 || rVar.d())) {
                rVar.b(6);
            }
            if (rVar.d() && rVar.c(6) == 1 && rVar.c(8) == 1) {
                str = com.anythink.basead.exoplayer.k.o.f8421B;
            } else {
                str = com.anythink.basead.exoplayer.k.o.f8420A;
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
            i6 = f6411f[c15];
            i9 = f6413h[c16] + (rVar.d() ? 1 : 0);
            str = com.anythink.basead.exoplayer.k.o.f8468z;
            i10 = f6409d;
        }
        return new C0015a(str, i13, i9, i6, a9, i10, (byte) 0);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i6 = position; i6 <= limit; i6++) {
            if ((byteBuffer.getInt(i6 + 4) & (-16777217)) == -1167101192) {
                return i6 - position;
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
        return a((b9 & 192) >> 6, b9 & com.anythink.core.common.s.a.c.f16318c);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f6410e[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int a(ByteBuffer byteBuffer, int i6) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i6, int i9) {
        int i10 = i9 / 2;
        if (i6 < 0) {
            return -1;
        }
        int[] iArr = f6411f;
        if (i6 >= iArr.length || i9 < 0) {
            return -1;
        }
        int[] iArr2 = f6414j;
        if (i10 >= iArr2.length) {
            return -1;
        }
        int i11 = iArr[i6];
        if (i11 == 44100) {
            return ((i9 % 2) + iArr2[i10]) * 2;
        }
        int i12 = i[i10];
        return i11 == 32000 ? i12 * 6 : i12 * 4;
    }
}
