package com.anythink.basead.exoplayer.g.b;

import android.util.Log;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements com.anythink.basead.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7307a = new a() { // from class: com.anythink.basead.exoplayer.g.b.g.1
        @Override // com.anythink.basead.exoplayer.g.b.g.a
        public final boolean a(int i6, int i9, int i10, int i11, int i12) {
            return false;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final int f7308b = af.f("ID3");

    /* renamed from: c, reason: collision with root package name */
    public static final int f7309c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static final String f7310d = "Id3Decoder";

    /* renamed from: e, reason: collision with root package name */
    private static final int f7311e = 128;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7312f = 64;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7313g = 32;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7314h = 8;
    private static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f7315j = 64;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7316k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f7317l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f7318m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f7319n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7320o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7321p = 3;

    /* renamed from: q, reason: collision with root package name */
    private final a f7322q;

    public interface a {
        boolean a(int i, int i6, int i9, int i10, int i11);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f7323a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f7324b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7325c;

        public b(int i, boolean z3, int i6) {
            this.f7323a = i;
            this.f7324b = z3;
            this.f7325c = i6;
        }
    }

    public g() {
        this(null);
    }

    private static int b(int i6) {
        return (i6 == 0 || i6 == 3) ? 1 : 2;
    }

    private static j c(s sVar, int i6) {
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        int b9 = b(bArr, 0);
        return new j(new String(bArr, 0, b9, "ISO-8859-1"), b(bArr, b9 + 1, i6));
    }

    private static f d(s sVar, int i6) {
        int d2 = sVar.d();
        String a9 = a(d2);
        int i9 = i6 - 1;
        byte[] bArr = new byte[i9];
        sVar.a(bArr, 0, i9);
        int b9 = b(bArr, 0);
        String str = new String(bArr, 0, b9, "ISO-8859-1");
        int i10 = b9 + 1;
        int a10 = a(bArr, i10, d2);
        String a11 = a(bArr, i10, a10, a9);
        int b10 = a10 + b(d2);
        int a12 = a(bArr, b10, d2);
        return new f(str, a11, a(bArr, b10, a12, a9), b(bArr, a12 + b(d2), i9));
    }

    private static e e(s sVar, int i6) {
        if (i6 < 4) {
            return null;
        }
        int d2 = sVar.d();
        String a9 = a(d2);
        byte[] bArr = new byte[3];
        sVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i9 = i6 - 4;
        byte[] bArr2 = new byte[i9];
        sVar.a(bArr2, 0, i9);
        int a10 = a(bArr2, 0, d2);
        String str2 = new String(bArr2, 0, a10, a9);
        int b9 = a10 + b(d2);
        return new e(str, str2, a(bArr2, b9, a(bArr2, b9, d2), a9));
    }

    private static int f(s sVar, int i6) {
        byte[] bArr = sVar.f8502a;
        int c9 = sVar.c();
        while (true) {
            int i9 = c9 + 1;
            if (i9 >= i6) {
                return i6;
            }
            if ((bArr[c9] & 255) == 255 && bArr[i9] == 0) {
                System.arraycopy(bArr, c9 + 2, bArr, i9, (i6 - c9) - 2);
                i6--;
            }
            c9 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    @Override // com.anythink.basead.exoplayer.g.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.anythink.basead.exoplayer.g.a a(com.anythink.basead.exoplayer.g.e eVar) {
        b bVar;
        ByteBuffer byteBuffer = eVar.f6742e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ArrayList arrayList = new ArrayList();
        s sVar = new s(array, limit);
        boolean z3 = false;
        if (sVar.a() < 10) {
            Log.w(f7310d, "Data too short to be an ID3 tag");
        } else {
            int g4 = sVar.g();
            if (g4 == f7308b) {
                int d2 = sVar.d();
                sVar.d(1);
                int d9 = sVar.d();
                int l9 = sVar.l();
                if (d2 == 2) {
                    if ((d9 & 64) != 0) {
                        Log.w(f7310d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(d2, d2 >= 4 && (d9 & 128) != 0, l9);
                } else {
                    if (d2 == 3) {
                        if ((d9 & 64) != 0) {
                            int i6 = sVar.i();
                            sVar.d(i6);
                            l9 -= i6 + 4;
                        }
                    } else if (d2 == 4) {
                        if ((d9 & 64) != 0) {
                            int l10 = sVar.l();
                            sVar.d(l10 - 4);
                            l9 -= l10;
                        }
                        if ((d9 & 16) != 0) {
                            l9 -= 10;
                        }
                    } else {
                        Log.w(f7310d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d2)));
                    }
                    bVar = new b(d2, d2 >= 4 && (d9 & 128) != 0, l9);
                }
                if (bVar != null) {
                    return null;
                }
                int c9 = sVar.c();
                int i9 = bVar.f7323a == 2 ? 6 : 10;
                int i10 = bVar.f7325c;
                if (bVar.f7324b) {
                    i10 = f(sVar, bVar.f7325c);
                }
                sVar.b(c9 + i10);
                if (!a(sVar, bVar.f7323a, i9, false)) {
                    if (bVar.f7323a != 4 || !a(sVar, 4, i9, true)) {
                        Log.w(f7310d, "Failed to validate ID3 tag with majorVersion=" + bVar.f7323a);
                        return null;
                    }
                    z3 = true;
                }
                while (sVar.a() >= i9) {
                    h a9 = a(bVar.f7323a, sVar, z3, i9, this.f7322q);
                    if (a9 != null) {
                        arrayList.add(a9);
                    }
                }
                return new com.anythink.basead.exoplayer.g.a(arrayList);
            }
            Log.w(f7310d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g4)));
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    private g(a aVar) {
        this.f7322q = aVar;
    }

    private static l b(s sVar, int i6) {
        if (i6 <= 0) {
            return null;
        }
        int d2 = sVar.d();
        String a9 = a(d2);
        int i9 = i6 - 1;
        byte[] bArr = new byte[i9];
        sVar.a(bArr, 0, i9);
        int a10 = a(bArr, 0, d2);
        String str = new String(bArr, 0, a10, a9);
        int b9 = a10 + b(d2);
        return new l("WXXX", str, a(bArr, b9, b(bArr, b9), "ISO-8859-1"));
    }

    private static com.anythink.basead.exoplayer.g.b.b c(s sVar, int i6, String str) {
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        return new com.anythink.basead.exoplayer.g.b.b(str, bArr);
    }

    private static l b(s sVar, int i6, String str) {
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        return new l(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static d b(s sVar, int i6, int i9, boolean z3, int i10, a aVar) {
        int c9 = sVar.c();
        int b9 = b(sVar.f8502a, c9);
        String str = new String(sVar.f8502a, c9, b9 - c9, "ISO-8859-1");
        sVar.c(b9 + 1);
        int d2 = sVar.d();
        boolean z6 = (d2 & 2) != 0;
        boolean z9 = (d2 & 1) != 0;
        int d9 = sVar.d();
        String[] strArr = new String[d9];
        for (int i11 = 0; i11 < d9; i11++) {
            int c10 = sVar.c();
            int b10 = b(sVar.f8502a, c10);
            strArr[i11] = new String(sVar.f8502a, c10, b10 - c10, "ISO-8859-1");
            sVar.c(b10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = c9 + i6;
        while (sVar.c() < i12) {
            h a9 = a(i9, sVar, z3, i10, aVar);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z6, z9, strArr, hVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.anythink.basead.exoplayer.g.a a(byte[] bArr, int i6) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        s sVar = new s(bArr, i6);
        boolean z3 = false;
        if (sVar.a() < 10) {
            Log.w(f7310d, "Data too short to be an ID3 tag");
        } else {
            int g4 = sVar.g();
            if (g4 != f7308b) {
                Log.w(f7310d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g4)));
            } else {
                int d2 = sVar.d();
                sVar.d(1);
                int d9 = sVar.d();
                int l9 = sVar.l();
                if (d2 == 2) {
                    if ((d9 & 64) != 0) {
                        Log.w(f7310d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(d2, d2 >= 4 && (d9 & 128) != 0, l9);
                } else {
                    if (d2 == 3) {
                        if ((d9 & 64) != 0) {
                            int i9 = sVar.i();
                            sVar.d(i9);
                            l9 -= i9 + 4;
                        }
                    } else if (d2 == 4) {
                        if ((d9 & 64) != 0) {
                            int l10 = sVar.l();
                            sVar.d(l10 - 4);
                            l9 -= l10;
                        }
                        if ((d9 & 16) != 0) {
                            l9 -= 10;
                        }
                    } else {
                        Log.w(f7310d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d2)));
                    }
                    bVar = new b(d2, d2 >= 4 && (d9 & 128) != 0, l9);
                }
                if (bVar != null) {
                    return null;
                }
                int c9 = sVar.c();
                int i10 = bVar.f7323a == 2 ? 6 : 10;
                int i11 = bVar.f7325c;
                if (bVar.f7324b) {
                    i11 = f(sVar, bVar.f7325c);
                }
                sVar.b(c9 + i11);
                if (!a(sVar, bVar.f7323a, i10, false)) {
                    if (bVar.f7323a != 4 || !a(sVar, 4, i10, true)) {
                        Log.w(f7310d, "Failed to validate ID3 tag with majorVersion=" + bVar.f7323a);
                        return null;
                    }
                    z3 = true;
                }
                while (sVar.a() >= i10) {
                    h a9 = a(bVar.f7323a, sVar, z3, i10, this.f7322q);
                    if (a9 != null) {
                        arrayList.add(a9);
                    }
                }
                return new com.anythink.basead.exoplayer.g.a(arrayList);
            }
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    private static int b(byte[] bArr, int i6) {
        while (i6 < bArr.length) {
            if (bArr[i6] == 0) {
                return i6;
            }
            i6++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i6, int i9) {
        if (i9 <= i6) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i6, i9);
    }

    private static b a(s sVar) {
        if (sVar.a() < 10) {
            Log.w(f7310d, "Data too short to be an ID3 tag");
            return null;
        }
        int g4 = sVar.g();
        if (g4 != f7308b) {
            Log.w(f7310d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g4)));
            return null;
        }
        int d2 = sVar.d();
        sVar.d(1);
        int d9 = sVar.d();
        int l9 = sVar.l();
        if (d2 == 2) {
            if ((d9 & 64) != 0) {
                Log.w(f7310d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (d2 == 3) {
            if ((d9 & 64) != 0) {
                int i6 = sVar.i();
                sVar.d(i6);
                l9 -= i6 + 4;
            }
        } else {
            if (d2 != 4) {
                Log.w(f7310d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d2)));
                return null;
            }
            if ((d9 & 64) != 0) {
                int l10 = sVar.l();
                sVar.d(l10 - 4);
                l9 -= l10;
            }
            if ((d9 & 16) != 0) {
                l9 -= 10;
            }
        }
        return new b(d2, d2 < 4 && (d9 & 128) != 0, l9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(s sVar, int i6, int i9, boolean z3) {
        int g4;
        long g9;
        int i10;
        int i11;
        int c9 = sVar.c();
        while (true) {
            try {
                boolean z6 = true;
                if (sVar.a() < i9) {
                    sVar.c(c9);
                    return true;
                }
                if (i6 >= 3) {
                    g4 = sVar.i();
                    g9 = sVar.h();
                    i10 = sVar.e();
                } else {
                    g4 = sVar.g();
                    g9 = sVar.g();
                    i10 = 0;
                }
                if (g4 == 0 && g9 == 0 && i10 == 0) {
                    sVar.c(c9);
                    return true;
                }
                if (i6 == 4 && !z3) {
                    if ((8421504 & g9) != 0) {
                        sVar.c(c9);
                        return false;
                    }
                    g9 = (((g9 >> 24) & 255) << 21) | (g9 & 255) | (((g9 >> 8) & 255) << 7) | (((g9 >> 16) & 255) << 14);
                }
                if (i6 == 4) {
                    i11 = (i10 & 64) != 0 ? 1 : 0;
                } else {
                    if (i6 == 3) {
                        i11 = (i10 & 32) != 0 ? 1 : 0;
                    } else {
                        i11 = 0;
                        z6 = false;
                    }
                    if (z6) {
                        i11 += 4;
                    }
                    if (g9 < i11) {
                        sVar.c(c9);
                        return false;
                    }
                    if (sVar.a() < g9) {
                        sVar.c(c9);
                        return false;
                    }
                    sVar.d((int) g9);
                }
            } catch (Throwable th) {
                sVar.c(c9);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x029b, code lost:
    
        if (r4 == 67) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.anythink.basead.exoplayer.k.s] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static h a(int i6, s sVar, boolean z3, int i9, a aVar) {
        int g4;
        ?? r12;
        int i10;
        int i11;
        int i12;
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        s sVar2;
        int i13;
        String str;
        int i14;
        String str2;
        int i15;
        int i16;
        int i17;
        int i18;
        h bVar;
        int b9;
        String d2;
        int i19 = i6;
        int d9 = sVar.d();
        int d10 = sVar.d();
        int d11 = sVar.d();
        int d12 = i19 >= 3 ? sVar.d() : 0;
        if (i19 == 4) {
            g4 = sVar.m();
            if (!z3) {
                g4 = (((g4 >> 24) & p.f8473b) << 21) | (g4 & p.f8473b) | (((g4 >> 8) & p.f8473b) << 7) | (((g4 >> 16) & p.f8473b) << 14);
            }
        } else if (i19 == 3) {
            g4 = sVar.m();
        } else {
            g4 = sVar.g();
        }
        int i20 = g4;
        int e9 = i19 >= 3 ? sVar.e() : 0;
        if (d9 == 0 && d10 == 0 && d11 == 0 && d12 == 0 && i20 == 0 && e9 == 0) {
            sVar.c(sVar.b());
            return null;
        }
        int c9 = sVar.c() + i20;
        if (c9 > sVar.b()) {
            Log.w(f7310d, "Frame size exceeds remaining tag data");
            sVar.c(sVar.b());
            return null;
        }
        if (aVar != null) {
            boolean a9 = aVar.a(i19, d9, d10, d11, d12);
            i19 = i19;
            r12 = d10;
            i10 = d9;
            i11 = d11;
            i12 = d12;
            if (!a9) {
                sVar.c(c9);
                return null;
            }
        } else {
            r12 = d10;
            i10 = d9;
            i11 = d11;
            i12 = d12;
        }
        if (i19 == 3) {
            z9 = (e9 & 128) != 0;
            boolean z13 = (e9 & 64) != 0;
            z6 = (e9 & 32) != 0;
            z12 = false;
            z11 = z13;
            z10 = z9;
        } else if (i19 == 4) {
            boolean z14 = (e9 & 64) != 0;
            z10 = (e9 & 8) != 0;
            z11 = (e9 & 4) != 0;
            z12 = (e9 & 2) != 0;
            if ((e9 & 1) != 0) {
                z6 = z14;
                z9 = true;
            } else {
                z6 = z14;
                z9 = false;
            }
        } else {
            z6 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (!z10 && !z11) {
            if (z6) {
                i20--;
                sVar.d(1);
            }
            if (z9) {
                i20 -= 4;
                sVar.d(4);
            }
            if (z12) {
                i20 = f(sVar, i20);
            }
            try {
                try {
                    try {
                        if (i10 == 84 && r12 == 88 && i11 == 88 && (i19 == 2 || i12 == 88)) {
                            if (i20 > 0) {
                                int d13 = sVar.d();
                                String a10 = a(d13);
                                int i21 = i20 - 1;
                                byte[] bArr = new byte[i21];
                                sVar.a(bArr, 0, i21);
                                int a11 = a(bArr, 0, d13);
                                String str3 = new String(bArr, 0, a11, a10);
                                int b10 = a11 + b(d13);
                                bVar = new k("TXXX", str3, a(bArr, b10, a(bArr, b10, d13), a10));
                                int i22 = i20;
                                i15 = i11;
                                i16 = i22;
                                i17 = r12;
                                i18 = i12;
                                r12 = sVar;
                                i14 = c9;
                                str2 = f7310d;
                            }
                            bVar = null;
                            int i222 = i20;
                            i15 = i11;
                            i16 = i222;
                            i17 = r12;
                            i18 = i12;
                            r12 = sVar;
                            i14 = c9;
                            str2 = f7310d;
                        } else if (i10 == 84) {
                            String a12 = a(i19, i10, (int) r12, i11, i12);
                            if (i20 <= 0) {
                                bVar = null;
                                int i2222 = i20;
                                i15 = i11;
                                i16 = i2222;
                                i17 = r12;
                                i18 = i12;
                                r12 = sVar;
                                i14 = c9;
                                str2 = f7310d;
                            } else {
                                int d14 = sVar.d();
                                String a13 = a(d14);
                                int i23 = i20 - 1;
                                byte[] bArr2 = new byte[i23];
                                sVar.a(bArr2, 0, i23);
                                bVar = new k(a12, null, new String(bArr2, 0, a(bArr2, 0, d14), a13));
                                int i22222 = i20;
                                i15 = i11;
                                i16 = i22222;
                                i17 = r12;
                                i18 = i12;
                                r12 = sVar;
                                i14 = c9;
                                str2 = f7310d;
                            }
                        } else {
                            if (i10 == 87 && r12 == 88 && i11 == 88 && (i19 == 2 || i12 == 88)) {
                                if (i20 > 0) {
                                    int d15 = sVar.d();
                                    String a14 = a(d15);
                                    int i24 = i20 - 1;
                                    byte[] bArr3 = new byte[i24];
                                    sVar.a(bArr3, 0, i24);
                                    int a15 = a(bArr3, 0, d15);
                                    String str4 = new String(bArr3, 0, a15, a14);
                                    int b11 = a15 + b(d15);
                                    bVar = new l("WXXX", str4, a(bArr3, b11, b(bArr3, b11), "ISO-8859-1"));
                                }
                                bVar = null;
                            } else if (i10 == 87) {
                                String a16 = a(i19, i10, (int) r12, i11, i12);
                                byte[] bArr4 = new byte[i20];
                                sVar.a(bArr4, 0, i20);
                                bVar = new l(a16, null, new String(bArr4, 0, b(bArr4, 0), "ISO-8859-1"));
                            } else if (i10 == 80 && r12 == 82 && i11 == 73 && i12 == 86) {
                                byte[] bArr5 = new byte[i20];
                                sVar.a(bArr5, 0, i20);
                                int b12 = b(bArr5, 0);
                                bVar = new j(new String(bArr5, 0, b12, "ISO-8859-1"), b(bArr5, b12 + 1, i20));
                            } else {
                                try {
                                    try {
                                        if (i10 == 71 && r12 == 69 && i11 == 79 && (i12 == 66 || i19 == 2)) {
                                            try {
                                                int d16 = sVar.d();
                                                String a17 = a(d16);
                                                int i25 = i20 - 1;
                                                byte[] bArr6 = new byte[i25];
                                                sVar.a(bArr6, 0, i25);
                                                int b13 = b(bArr6, 0);
                                                i14 = c9;
                                                String str5 = new String(bArr6, 0, b13, "ISO-8859-1");
                                                int i26 = b13 + 1;
                                                int a18 = a(bArr6, i26, d16);
                                                String a19 = a(bArr6, i26, a18, a17);
                                                int b14 = a18 + b(d16);
                                                int a20 = a(bArr6, b14, d16);
                                                f fVar = new f(str5, a19, a(bArr6, b14, a20, a17), b(bArr6, a20 + b(d16), i25));
                                                int i27 = i20;
                                                i15 = i11;
                                                i16 = i27;
                                                i17 = r12;
                                                i18 = i12;
                                                r12 = sVar;
                                                bVar = fVar;
                                                str2 = f7310d;
                                            } catch (Throwable th) {
                                                th = th;
                                                i14 = c9;
                                                sVar2 = sVar;
                                                i13 = i14;
                                                sVar2.c(i13);
                                                throw th;
                                            }
                                        } else {
                                            i14 = c9;
                                            try {
                                                if (i19 == 2) {
                                                    if (i10 == 80 && r12 == 73 && i11 == 67) {
                                                        int d17 = sVar.d();
                                                        String a21 = a(d17);
                                                        int i28 = i20 - 1;
                                                        byte[] bArr7 = new byte[i28];
                                                        sVar.a(bArr7, 0, i28);
                                                        if (i19 == 2) {
                                                            StringBuilder sb = new StringBuilder("image/");
                                                            str2 = f7310d;
                                                            sb.append(af.d(new String(bArr7, 0, 3, "ISO-8859-1")));
                                                            String sb2 = sb.toString();
                                                            if ("image/jpg".equals(sb2)) {
                                                                sb2 = "image/jpeg";
                                                            }
                                                            d2 = sb2;
                                                            b9 = 2;
                                                        } else {
                                                            str2 = f7310d;
                                                            b9 = b(bArr7, 0);
                                                            d2 = af.d(new String(bArr7, 0, b9, "ISO-8859-1"));
                                                            if (d2.indexOf(47) == -1) {
                                                                d2 = "image/".concat(d2);
                                                            }
                                                        }
                                                        int i29 = bArr7[b9 + 1] & 255;
                                                        int i30 = b9 + 2;
                                                        int a22 = a(bArr7, i30, d17);
                                                        com.anythink.basead.exoplayer.g.b.a aVar2 = new com.anythink.basead.exoplayer.g.b.a(d2, new String(bArr7, i30, a22 - i30, a21), i29, b(bArr7, a22 + b(d17), i28));
                                                        int i31 = i20;
                                                        i15 = i11;
                                                        i16 = i31;
                                                        i17 = r12;
                                                        i18 = i12;
                                                        r12 = sVar;
                                                        bVar = aVar2;
                                                    }
                                                    str2 = f7310d;
                                                    if (i10 != 67 && r12 == 79 && i11 == 77 && (i12 == 77 || i19 == 2)) {
                                                        if (i20 < 4) {
                                                            bVar = null;
                                                        } else {
                                                            int d18 = sVar.d();
                                                            String a23 = a(d18);
                                                            byte[] bArr8 = new byte[3];
                                                            sVar.a(bArr8, 0, 3);
                                                            String str6 = new String(bArr8, 0, 3);
                                                            int i32 = i20 - 4;
                                                            byte[] bArr9 = new byte[i32];
                                                            sVar.a(bArr9, 0, i32);
                                                            int a24 = a(bArr9, 0, d18);
                                                            String str7 = new String(bArr9, 0, a24, a23);
                                                            int b15 = a24 + b(d18);
                                                            bVar = new e(str6, str7, a(bArr9, b15, a(bArr9, b15, d18), a23));
                                                        }
                                                        int i33 = i20;
                                                        i15 = i11;
                                                        i16 = i33;
                                                        i17 = r12;
                                                        i18 = i12;
                                                        r12 = sVar;
                                                    } else if (i10 != 67 && r12 == 72 && i11 == 65 && i12 == 80) {
                                                        int i34 = i20;
                                                        i15 = i11;
                                                        i16 = i34;
                                                        i17 = r12;
                                                        i18 = i12;
                                                        try {
                                                            bVar = a(sVar, i16, i19, z3, i9, aVar);
                                                            i19 = i6;
                                                            r12 = sVar;
                                                        } catch (UnsupportedEncodingException unused) {
                                                            r12 = sVar;
                                                            i13 = i14;
                                                            str = str2;
                                                            sVar2 = r12;
                                                            Log.w(str, "Unsupported character encoding");
                                                            sVar2.c(i13);
                                                            return null;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            sVar2 = sVar;
                                                            i13 = i14;
                                                            sVar2.c(i13);
                                                            throw th;
                                                        }
                                                    } else {
                                                        int i35 = i20;
                                                        i15 = i11;
                                                        i16 = i35;
                                                        i17 = r12;
                                                        i18 = i12;
                                                        try {
                                                            if (i10 != 67 && i17 == 84 && i15 == 79 && i18 == 67) {
                                                                i19 = i6;
                                                                s sVar3 = sVar;
                                                                bVar = b(sVar3, i16, i19, z3, i9, aVar);
                                                                r12 = sVar3;
                                                            } else {
                                                                i19 = i6;
                                                                s sVar4 = sVar;
                                                                String a25 = a(i19, i10, i17, i15, i18);
                                                                byte[] bArr10 = new byte[i16];
                                                                sVar4.a(bArr10, 0, i16);
                                                                bVar = new com.anythink.basead.exoplayer.g.b.b(a25, bArr10);
                                                                r12 = sVar4;
                                                            }
                                                        } catch (UnsupportedEncodingException unused2) {
                                                            i13 = i14;
                                                            str = str2;
                                                            sVar2 = r12;
                                                            try {
                                                                Log.w(str, "Unsupported character encoding");
                                                                sVar2.c(i13);
                                                                return null;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                sVar2.c(i13);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (i10 == 65) {
                                                        if (r12 == 80) {
                                                            if (i11 == 73) {
                                                            }
                                                        }
                                                    }
                                                    str2 = f7310d;
                                                    if (i10 != 67) {
                                                    }
                                                    if (i10 != 67) {
                                                    }
                                                    int i352 = i20;
                                                    i15 = i11;
                                                    i16 = i352;
                                                    i17 = r12;
                                                    i18 = i12;
                                                    if (i10 != 67) {
                                                    }
                                                    i19 = i6;
                                                    s sVar42 = sVar;
                                                    String a252 = a(i19, i10, i17, i15, i18);
                                                    byte[] bArr102 = new byte[i16];
                                                    sVar42.a(bArr102, 0, i16);
                                                    bVar = new com.anythink.basead.exoplayer.g.b.b(a252, bArr102);
                                                    r12 = sVar42;
                                                }
                                            } catch (UnsupportedEncodingException unused3) {
                                                r12 = sVar;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (UnsupportedEncodingException unused4) {
                                    r12 = sVar;
                                    str = f7310d;
                                    i13 = i14;
                                    sVar2 = r12;
                                    Log.w(str, "Unsupported character encoding");
                                    sVar2.c(i13);
                                    return null;
                                }
                            }
                            int i222222 = i20;
                            i15 = i11;
                            i16 = i222222;
                            i17 = r12;
                            i18 = i12;
                            r12 = sVar;
                            i14 = c9;
                            str2 = f7310d;
                        }
                        if (bVar == null) {
                            try {
                                str = str2;
                            } catch (UnsupportedEncodingException unused5) {
                                str = str2;
                            }
                            try {
                                Log.w(str, "Failed to decode frame: id=" + a(i19, i10, i17, i15, i18) + ", frameSize=" + i16);
                            } catch (UnsupportedEncodingException unused6) {
                                i13 = i14;
                                sVar2 = r12;
                                Log.w(str, "Unsupported character encoding");
                                sVar2.c(i13);
                                return null;
                            }
                        }
                        r12.c(i14);
                        return bVar;
                    } catch (UnsupportedEncodingException unused7) {
                        sVar2 = sVar;
                        i13 = c9;
                        str = f7310d;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sVar2 = sVar;
                    i13 = c9;
                    sVar2.c(i13);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                sVar2 = r12;
            }
        } else {
            Log.w(f7310d, "Skipping unsupported compressed or encrypted frame");
            sVar.c(c9);
            return null;
        }
    }

    private static k a(s sVar, int i6) {
        if (i6 <= 0) {
            return null;
        }
        int d2 = sVar.d();
        String a9 = a(d2);
        int i9 = i6 - 1;
        byte[] bArr = new byte[i9];
        sVar.a(bArr, 0, i9);
        int a10 = a(bArr, 0, d2);
        String str = new String(bArr, 0, a10, a9);
        int b9 = a10 + b(d2);
        return new k("TXXX", str, a(bArr, b9, a(bArr, b9, d2), a9));
    }

    private static k a(s sVar, int i6, String str) {
        if (i6 <= 0) {
            return null;
        }
        int d2 = sVar.d();
        String a9 = a(d2);
        int i9 = i6 - 1;
        byte[] bArr = new byte[i9];
        sVar.a(bArr, 0, i9);
        return new k(str, null, new String(bArr, 0, a(bArr, 0, d2), a9));
    }

    private static com.anythink.basead.exoplayer.g.b.a a(s sVar, int i6, int i9) {
        int b9;
        String d2;
        int d9 = sVar.d();
        String a9 = a(d9);
        int i10 = i6 - 1;
        byte[] bArr = new byte[i10];
        sVar.a(bArr, 0, i10);
        if (i9 == 2) {
            d2 = "image/" + af.d(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(d2)) {
                d2 = "image/jpeg";
            }
            b9 = 2;
        } else {
            b9 = b(bArr, 0);
            d2 = af.d(new String(bArr, 0, b9, "ISO-8859-1"));
            if (d2.indexOf(47) == -1) {
                d2 = "image/".concat(d2);
            }
        }
        int i11 = bArr[b9 + 1] & 255;
        int i12 = b9 + 2;
        int a10 = a(bArr, i12, d9);
        return new com.anythink.basead.exoplayer.g.b.a(d2, new String(bArr, i12, a10 - i12, a9), i11, b(bArr, a10 + b(d9), i10));
    }

    private static c a(s sVar, int i6, int i9, boolean z3, int i10, a aVar) {
        int c9 = sVar.c();
        int b9 = b(sVar.f8502a, c9);
        String str = new String(sVar.f8502a, c9, b9 - c9, "ISO-8859-1");
        sVar.c(b9 + 1);
        int i11 = sVar.i();
        int i12 = sVar.i();
        long h9 = sVar.h();
        if (h9 == 4294967295L) {
            h9 = -1;
        }
        long h10 = sVar.h();
        long j6 = h10 == 4294967295L ? -1L : h10;
        ArrayList arrayList = new ArrayList();
        int i13 = c9 + i6;
        while (sVar.c() < i13) {
            h a9 = a(i9, sVar, z3, i10, aVar);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, i11, i12, h9, j6, hVarArr);
    }

    private static String a(int i6) {
        if (i6 == 1) {
            return com.anythink.basead.exoplayer.b.f6390k;
        }
        if (i6 == 2) {
            return "UTF-16BE";
        }
        if (i6 != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }

    private static String a(int i6, int i9, int i10, int i11, int i12) {
        if (i6 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private static int a(byte[] bArr, int i6, int i9) {
        int b9 = b(bArr, i6);
        if (i9 == 0 || i9 == 3) {
            return b9;
        }
        while (b9 < bArr.length - 1) {
            if (b9 % 2 == 0 && bArr[b9 + 1] == 0) {
                return b9;
            }
            b9 = b(bArr, b9 + 1);
        }
        return bArr.length;
    }

    private static String a(byte[] bArr, int i6, int i9, String str) {
        if (i9 > i6 && i9 <= bArr.length) {
            return new String(bArr, i6, i9 - i6, str);
        }
        return "";
    }
}
