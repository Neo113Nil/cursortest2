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
    public static final a f8093a = new a() { // from class: com.anythink.basead.exoplayer.g.b.g.1
        @Override // com.anythink.basead.exoplayer.g.b.g.a
        public final boolean a(int i4, int i6, int i9, int i10, int i11) {
            return false;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final int f8094b = af.f("ID3");

    /* renamed from: c, reason: collision with root package name */
    public static final int f8095c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8096d = "Id3Decoder";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8097e = 128;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8098f = 64;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8099g = 32;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8100h = 8;
    private static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8101j = 64;

    /* renamed from: k, reason: collision with root package name */
    private static final int f8102k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f8103l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f8104m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f8105n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f8106o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f8107p = 3;

    /* renamed from: q, reason: collision with root package name */
    private final a f8108q;

    public interface a {
        boolean a(int i, int i4, int i6, int i9, int i10);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f8109a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8110b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8111c;

        public b(int i, boolean z6, int i4) {
            this.f8109a = i;
            this.f8110b = z6;
            this.f8111c = i4;
        }
    }

    public g() {
        this(null);
    }

    private static int b(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    private static j c(s sVar, int i4) {
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        int b9 = b(bArr, 0);
        return new j(new String(bArr, 0, b9, "ISO-8859-1"), b(bArr, b9 + 1, i4));
    }

    private static f d(s sVar, int i4) {
        int d9 = sVar.d();
        String a9 = a(d9);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        int b9 = b(bArr, 0);
        String str = new String(bArr, 0, b9, "ISO-8859-1");
        int i9 = b9 + 1;
        int a10 = a(bArr, i9, d9);
        String a11 = a(bArr, i9, a10, a9);
        int b10 = a10 + b(d9);
        int a12 = a(bArr, b10, d9);
        return new f(str, a11, a(bArr, b10, a12, a9), b(bArr, a12 + b(d9), i6));
    }

    private static e e(s sVar, int i4) {
        if (i4 < 4) {
            return null;
        }
        int d9 = sVar.d();
        String a9 = a(d9);
        byte[] bArr = new byte[3];
        sVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i6 = i4 - 4;
        byte[] bArr2 = new byte[i6];
        sVar.a(bArr2, 0, i6);
        int a10 = a(bArr2, 0, d9);
        String str2 = new String(bArr2, 0, a10, a9);
        int b9 = a10 + b(d9);
        return new e(str, str2, a(bArr2, b9, a(bArr2, b9, d9), a9));
    }

    private static int f(s sVar, int i4) {
        byte[] bArr = sVar.f9288a;
        int c9 = sVar.c();
        while (true) {
            int i6 = c9 + 1;
            if (i6 >= i4) {
                return i4;
            }
            if ((bArr[c9] & 255) == 255 && bArr[i6] == 0) {
                System.arraycopy(bArr, c9 + 2, bArr, i6, (i4 - c9) - 2);
                i4--;
            }
            c9 = i6;
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
        ByteBuffer byteBuffer = eVar.f7528e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ArrayList arrayList = new ArrayList();
        s sVar = new s(array, limit);
        boolean z6 = false;
        if (sVar.a() < 10) {
            Log.w(f8096d, "Data too short to be an ID3 tag");
        } else {
            int g9 = sVar.g();
            if (g9 == f8094b) {
                int d9 = sVar.d();
                sVar.d(1);
                int d10 = sVar.d();
                int l9 = sVar.l();
                if (d9 == 2) {
                    if ((d10 & 64) != 0) {
                        Log.w(f8096d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(d9, d9 >= 4 && (d10 & 128) != 0, l9);
                } else {
                    if (d9 == 3) {
                        if ((d10 & 64) != 0) {
                            int i4 = sVar.i();
                            sVar.d(i4);
                            l9 -= i4 + 4;
                        }
                    } else if (d9 == 4) {
                        if ((d10 & 64) != 0) {
                            int l10 = sVar.l();
                            sVar.d(l10 - 4);
                            l9 -= l10;
                        }
                        if ((d10 & 16) != 0) {
                            l9 -= 10;
                        }
                    } else {
                        Log.w(f8096d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d9)));
                    }
                    bVar = new b(d9, d9 >= 4 && (d10 & 128) != 0, l9);
                }
                if (bVar != null) {
                    return null;
                }
                int c9 = sVar.c();
                int i6 = bVar.f8109a == 2 ? 6 : 10;
                int i9 = bVar.f8111c;
                if (bVar.f8110b) {
                    i9 = f(sVar, bVar.f8111c);
                }
                sVar.b(c9 + i9);
                if (!a(sVar, bVar.f8109a, i6, false)) {
                    if (bVar.f8109a != 4 || !a(sVar, 4, i6, true)) {
                        Log.w(f8096d, "Failed to validate ID3 tag with majorVersion=" + bVar.f8109a);
                        return null;
                    }
                    z6 = true;
                }
                while (sVar.a() >= i6) {
                    h a9 = a(bVar.f8109a, sVar, z6, i6, this.f8108q);
                    if (a9 != null) {
                        arrayList.add(a9);
                    }
                }
                return new com.anythink.basead.exoplayer.g.a(arrayList);
            }
            Log.w(f8096d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g9)));
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    private g(a aVar) {
        this.f8108q = aVar;
    }

    private static l b(s sVar, int i4) {
        if (i4 <= 0) {
            return null;
        }
        int d9 = sVar.d();
        String a9 = a(d9);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        int a10 = a(bArr, 0, d9);
        String str = new String(bArr, 0, a10, a9);
        int b9 = a10 + b(d9);
        return new l("WXXX", str, a(bArr, b9, b(bArr, b9), "ISO-8859-1"));
    }

    private static com.anythink.basead.exoplayer.g.b.b c(s sVar, int i4, String str) {
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        return new com.anythink.basead.exoplayer.g.b.b(str, bArr);
    }

    private static l b(s sVar, int i4, String str) {
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        return new l(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static d b(s sVar, int i4, int i6, boolean z6, int i9, a aVar) {
        int c9 = sVar.c();
        int b9 = b(sVar.f9288a, c9);
        String str = new String(sVar.f9288a, c9, b9 - c9, "ISO-8859-1");
        sVar.c(b9 + 1);
        int d9 = sVar.d();
        boolean z9 = (d9 & 2) != 0;
        boolean z10 = (d9 & 1) != 0;
        int d10 = sVar.d();
        String[] strArr = new String[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            int c10 = sVar.c();
            int b10 = b(sVar.f9288a, c10);
            strArr[i10] = new String(sVar.f9288a, c10, b10 - c10, "ISO-8859-1");
            sVar.c(b10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = c9 + i4;
        while (sVar.c() < i11) {
            h a9 = a(i6, sVar, z6, i9, aVar);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z9, z10, strArr, hVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.anythink.basead.exoplayer.g.a a(byte[] bArr, int i4) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        s sVar = new s(bArr, i4);
        boolean z6 = false;
        if (sVar.a() < 10) {
            Log.w(f8096d, "Data too short to be an ID3 tag");
        } else {
            int g9 = sVar.g();
            if (g9 != f8094b) {
                Log.w(f8096d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g9)));
            } else {
                int d9 = sVar.d();
                sVar.d(1);
                int d10 = sVar.d();
                int l9 = sVar.l();
                if (d9 == 2) {
                    if ((d10 & 64) != 0) {
                        Log.w(f8096d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(d9, d9 >= 4 && (d10 & 128) != 0, l9);
                } else {
                    if (d9 == 3) {
                        if ((d10 & 64) != 0) {
                            int i6 = sVar.i();
                            sVar.d(i6);
                            l9 -= i6 + 4;
                        }
                    } else if (d9 == 4) {
                        if ((d10 & 64) != 0) {
                            int l10 = sVar.l();
                            sVar.d(l10 - 4);
                            l9 -= l10;
                        }
                        if ((d10 & 16) != 0) {
                            l9 -= 10;
                        }
                    } else {
                        Log.w(f8096d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d9)));
                    }
                    bVar = new b(d9, d9 >= 4 && (d10 & 128) != 0, l9);
                }
                if (bVar != null) {
                    return null;
                }
                int c9 = sVar.c();
                int i9 = bVar.f8109a == 2 ? 6 : 10;
                int i10 = bVar.f8111c;
                if (bVar.f8110b) {
                    i10 = f(sVar, bVar.f8111c);
                }
                sVar.b(c9 + i10);
                if (!a(sVar, bVar.f8109a, i9, false)) {
                    if (bVar.f8109a != 4 || !a(sVar, 4, i9, true)) {
                        Log.w(f8096d, "Failed to validate ID3 tag with majorVersion=" + bVar.f8109a);
                        return null;
                    }
                    z6 = true;
                }
                while (sVar.a() >= i9) {
                    h a9 = a(bVar.f8109a, sVar, z6, i9, this.f8108q);
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

    private static int b(byte[] bArr, int i4) {
        while (i4 < bArr.length) {
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i4, int i6) {
        if (i6 <= i4) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i4, i6);
    }

    private static b a(s sVar) {
        if (sVar.a() < 10) {
            Log.w(f8096d, "Data too short to be an ID3 tag");
            return null;
        }
        int g9 = sVar.g();
        if (g9 != f8094b) {
            Log.w(f8096d, "Unexpected first three bytes of ID3 tag header: ".concat(String.valueOf(g9)));
            return null;
        }
        int d9 = sVar.d();
        sVar.d(1);
        int d10 = sVar.d();
        int l9 = sVar.l();
        if (d9 == 2) {
            if ((d10 & 64) != 0) {
                Log.w(f8096d, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (d9 == 3) {
            if ((d10 & 64) != 0) {
                int i4 = sVar.i();
                sVar.d(i4);
                l9 -= i4 + 4;
            }
        } else {
            if (d9 != 4) {
                Log.w(f8096d, "Skipped ID3 tag with unsupported majorVersion=".concat(String.valueOf(d9)));
                return null;
            }
            if ((d10 & 64) != 0) {
                int l10 = sVar.l();
                sVar.d(l10 - 4);
                l9 -= l10;
            }
            if ((d10 & 16) != 0) {
                l9 -= 10;
            }
        }
        return new b(d9, d9 < 4 && (d10 & 128) != 0, l9);
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
    private static boolean a(s sVar, int i4, int i6, boolean z6) {
        int g9;
        long g10;
        int i9;
        int i10;
        int c9 = sVar.c();
        while (true) {
            try {
                boolean z9 = true;
                if (sVar.a() < i6) {
                    sVar.c(c9);
                    return true;
                }
                if (i4 >= 3) {
                    g9 = sVar.i();
                    g10 = sVar.h();
                    i9 = sVar.e();
                } else {
                    g9 = sVar.g();
                    g10 = sVar.g();
                    i9 = 0;
                }
                if (g9 == 0 && g10 == 0 && i9 == 0) {
                    sVar.c(c9);
                    return true;
                }
                if (i4 == 4 && !z6) {
                    if ((8421504 & g10) != 0) {
                        sVar.c(c9);
                        return false;
                    }
                    g10 = (((g10 >> 24) & 255) << 21) | (g10 & 255) | (((g10 >> 8) & 255) << 7) | (((g10 >> 16) & 255) << 14);
                }
                if (i4 == 4) {
                    i10 = (i9 & 64) != 0 ? 1 : 0;
                } else {
                    if (i4 == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                    } else {
                        i10 = 0;
                        z9 = false;
                    }
                    if (z9) {
                        i10 += 4;
                    }
                    if (g10 < i10) {
                        sVar.c(c9);
                        return false;
                    }
                    if (sVar.a() < g10) {
                        sVar.c(c9);
                        return false;
                    }
                    sVar.d((int) g10);
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
    private static h a(int i4, s sVar, boolean z6, int i6, a aVar) {
        int g9;
        ?? r1;
        int i9;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        s sVar2;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        h bVar;
        int b9;
        String d9;
        int i18 = i4;
        int d10 = sVar.d();
        int d11 = sVar.d();
        int d12 = sVar.d();
        int d13 = i18 >= 3 ? sVar.d() : 0;
        if (i18 == 4) {
            g9 = sVar.m();
            if (!z6) {
                g9 = (((g9 >> 24) & p.f9259b) << 21) | (g9 & p.f9259b) | (((g9 >> 8) & p.f9259b) << 7) | (((g9 >> 16) & p.f9259b) << 14);
            }
        } else if (i18 == 3) {
            g9 = sVar.m();
        } else {
            g9 = sVar.g();
        }
        int i19 = g9;
        int e9 = i18 >= 3 ? sVar.e() : 0;
        if (d10 == 0 && d11 == 0 && d12 == 0 && d13 == 0 && i19 == 0 && e9 == 0) {
            sVar.c(sVar.b());
            return null;
        }
        int c9 = sVar.c() + i19;
        if (c9 > sVar.b()) {
            Log.w(f8096d, "Frame size exceeds remaining tag data");
            sVar.c(sVar.b());
            return null;
        }
        if (aVar != null) {
            boolean a9 = aVar.a(i18, d10, d11, d12, d13);
            i18 = i18;
            r1 = d11;
            i9 = d10;
            i10 = d12;
            i11 = d13;
            if (!a9) {
                sVar.c(c9);
                return null;
            }
        } else {
            r1 = d11;
            i9 = d10;
            i10 = d12;
            i11 = d13;
        }
        if (i18 == 3) {
            z10 = (e9 & 128) != 0;
            boolean z14 = (e9 & 64) != 0;
            z9 = (e9 & 32) != 0;
            z13 = false;
            z12 = z14;
            z11 = z10;
        } else if (i18 == 4) {
            boolean z15 = (e9 & 64) != 0;
            z11 = (e9 & 8) != 0;
            z12 = (e9 & 4) != 0;
            z13 = (e9 & 2) != 0;
            if ((e9 & 1) != 0) {
                z9 = z15;
                z10 = true;
            } else {
                z9 = z15;
                z10 = false;
            }
        } else {
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (!z11 && !z12) {
            if (z9) {
                i19--;
                sVar.d(1);
            }
            if (z10) {
                i19 -= 4;
                sVar.d(4);
            }
            if (z13) {
                i19 = f(sVar, i19);
            }
            try {
                try {
                    try {
                        if (i9 == 84 && r1 == 88 && i10 == 88 && (i18 == 2 || i11 == 88)) {
                            if (i19 > 0) {
                                int d14 = sVar.d();
                                String a10 = a(d14);
                                int i20 = i19 - 1;
                                byte[] bArr = new byte[i20];
                                sVar.a(bArr, 0, i20);
                                int a11 = a(bArr, 0, d14);
                                String str3 = new String(bArr, 0, a11, a10);
                                int b10 = a11 + b(d14);
                                bVar = new k("TXXX", str3, a(bArr, b10, a(bArr, b10, d14), a10));
                                int i21 = i19;
                                i14 = i10;
                                i15 = i21;
                                i16 = r1;
                                i17 = i11;
                                r1 = sVar;
                                i13 = c9;
                                str2 = f8096d;
                            }
                            bVar = null;
                            int i212 = i19;
                            i14 = i10;
                            i15 = i212;
                            i16 = r1;
                            i17 = i11;
                            r1 = sVar;
                            i13 = c9;
                            str2 = f8096d;
                        } else if (i9 == 84) {
                            String a12 = a(i18, i9, (int) r1, i10, i11);
                            if (i19 <= 0) {
                                bVar = null;
                                int i2122 = i19;
                                i14 = i10;
                                i15 = i2122;
                                i16 = r1;
                                i17 = i11;
                                r1 = sVar;
                                i13 = c9;
                                str2 = f8096d;
                            } else {
                                int d15 = sVar.d();
                                String a13 = a(d15);
                                int i22 = i19 - 1;
                                byte[] bArr2 = new byte[i22];
                                sVar.a(bArr2, 0, i22);
                                bVar = new k(a12, null, new String(bArr2, 0, a(bArr2, 0, d15), a13));
                                int i21222 = i19;
                                i14 = i10;
                                i15 = i21222;
                                i16 = r1;
                                i17 = i11;
                                r1 = sVar;
                                i13 = c9;
                                str2 = f8096d;
                            }
                        } else {
                            if (i9 == 87 && r1 == 88 && i10 == 88 && (i18 == 2 || i11 == 88)) {
                                if (i19 > 0) {
                                    int d16 = sVar.d();
                                    String a14 = a(d16);
                                    int i23 = i19 - 1;
                                    byte[] bArr3 = new byte[i23];
                                    sVar.a(bArr3, 0, i23);
                                    int a15 = a(bArr3, 0, d16);
                                    String str4 = new String(bArr3, 0, a15, a14);
                                    int b11 = a15 + b(d16);
                                    bVar = new l("WXXX", str4, a(bArr3, b11, b(bArr3, b11), "ISO-8859-1"));
                                }
                                bVar = null;
                            } else if (i9 == 87) {
                                String a16 = a(i18, i9, (int) r1, i10, i11);
                                byte[] bArr4 = new byte[i19];
                                sVar.a(bArr4, 0, i19);
                                bVar = new l(a16, null, new String(bArr4, 0, b(bArr4, 0), "ISO-8859-1"));
                            } else if (i9 == 80 && r1 == 82 && i10 == 73 && i11 == 86) {
                                byte[] bArr5 = new byte[i19];
                                sVar.a(bArr5, 0, i19);
                                int b12 = b(bArr5, 0);
                                bVar = new j(new String(bArr5, 0, b12, "ISO-8859-1"), b(bArr5, b12 + 1, i19));
                            } else {
                                try {
                                    try {
                                        if (i9 == 71 && r1 == 69 && i10 == 79 && (i11 == 66 || i18 == 2)) {
                                            try {
                                                int d17 = sVar.d();
                                                String a17 = a(d17);
                                                int i24 = i19 - 1;
                                                byte[] bArr6 = new byte[i24];
                                                sVar.a(bArr6, 0, i24);
                                                int b13 = b(bArr6, 0);
                                                i13 = c9;
                                                String str5 = new String(bArr6, 0, b13, "ISO-8859-1");
                                                int i25 = b13 + 1;
                                                int a18 = a(bArr6, i25, d17);
                                                String a19 = a(bArr6, i25, a18, a17);
                                                int b14 = a18 + b(d17);
                                                int a20 = a(bArr6, b14, d17);
                                                f fVar = new f(str5, a19, a(bArr6, b14, a20, a17), b(bArr6, a20 + b(d17), i24));
                                                int i26 = i19;
                                                i14 = i10;
                                                i15 = i26;
                                                i16 = r1;
                                                i17 = i11;
                                                r1 = sVar;
                                                bVar = fVar;
                                                str2 = f8096d;
                                            } catch (Throwable th) {
                                                th = th;
                                                i13 = c9;
                                                sVar2 = sVar;
                                                i12 = i13;
                                                sVar2.c(i12);
                                                throw th;
                                            }
                                        } else {
                                            i13 = c9;
                                            try {
                                                if (i18 == 2) {
                                                    if (i9 == 80 && r1 == 73 && i10 == 67) {
                                                        int d18 = sVar.d();
                                                        String a21 = a(d18);
                                                        int i27 = i19 - 1;
                                                        byte[] bArr7 = new byte[i27];
                                                        sVar.a(bArr7, 0, i27);
                                                        if (i18 == 2) {
                                                            StringBuilder sb = new StringBuilder("image/");
                                                            str2 = f8096d;
                                                            sb.append(af.d(new String(bArr7, 0, 3, "ISO-8859-1")));
                                                            String sb2 = sb.toString();
                                                            if ("image/jpg".equals(sb2)) {
                                                                sb2 = "image/jpeg";
                                                            }
                                                            d9 = sb2;
                                                            b9 = 2;
                                                        } else {
                                                            str2 = f8096d;
                                                            b9 = b(bArr7, 0);
                                                            d9 = af.d(new String(bArr7, 0, b9, "ISO-8859-1"));
                                                            if (d9.indexOf(47) == -1) {
                                                                d9 = "image/".concat(d9);
                                                            }
                                                        }
                                                        int i28 = bArr7[b9 + 1] & 255;
                                                        int i29 = b9 + 2;
                                                        int a22 = a(bArr7, i29, d18);
                                                        com.anythink.basead.exoplayer.g.b.a aVar2 = new com.anythink.basead.exoplayer.g.b.a(d9, new String(bArr7, i29, a22 - i29, a21), i28, b(bArr7, a22 + b(d18), i27));
                                                        int i30 = i19;
                                                        i14 = i10;
                                                        i15 = i30;
                                                        i16 = r1;
                                                        i17 = i11;
                                                        r1 = sVar;
                                                        bVar = aVar2;
                                                    }
                                                    str2 = f8096d;
                                                    if (i9 != 67 && r1 == 79 && i10 == 77 && (i11 == 77 || i18 == 2)) {
                                                        if (i19 < 4) {
                                                            bVar = null;
                                                        } else {
                                                            int d19 = sVar.d();
                                                            String a23 = a(d19);
                                                            byte[] bArr8 = new byte[3];
                                                            sVar.a(bArr8, 0, 3);
                                                            String str6 = new String(bArr8, 0, 3);
                                                            int i31 = i19 - 4;
                                                            byte[] bArr9 = new byte[i31];
                                                            sVar.a(bArr9, 0, i31);
                                                            int a24 = a(bArr9, 0, d19);
                                                            String str7 = new String(bArr9, 0, a24, a23);
                                                            int b15 = a24 + b(d19);
                                                            bVar = new e(str6, str7, a(bArr9, b15, a(bArr9, b15, d19), a23));
                                                        }
                                                        int i32 = i19;
                                                        i14 = i10;
                                                        i15 = i32;
                                                        i16 = r1;
                                                        i17 = i11;
                                                        r1 = sVar;
                                                    } else if (i9 != 67 && r1 == 72 && i10 == 65 && i11 == 80) {
                                                        int i33 = i19;
                                                        i14 = i10;
                                                        i15 = i33;
                                                        i16 = r1;
                                                        i17 = i11;
                                                        try {
                                                            bVar = a(sVar, i15, i18, z6, i6, aVar);
                                                            i18 = i4;
                                                            r1 = sVar;
                                                        } catch (UnsupportedEncodingException unused) {
                                                            r1 = sVar;
                                                            i12 = i13;
                                                            str = str2;
                                                            sVar2 = r1;
                                                            Log.w(str, "Unsupported character encoding");
                                                            sVar2.c(i12);
                                                            return null;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            sVar2 = sVar;
                                                            i12 = i13;
                                                            sVar2.c(i12);
                                                            throw th;
                                                        }
                                                    } else {
                                                        int i34 = i19;
                                                        i14 = i10;
                                                        i15 = i34;
                                                        i16 = r1;
                                                        i17 = i11;
                                                        try {
                                                            if (i9 != 67 && i16 == 84 && i14 == 79 && i17 == 67) {
                                                                i18 = i4;
                                                                s sVar3 = sVar;
                                                                bVar = b(sVar3, i15, i18, z6, i6, aVar);
                                                                r1 = sVar3;
                                                            } else {
                                                                i18 = i4;
                                                                s sVar4 = sVar;
                                                                String a25 = a(i18, i9, i16, i14, i17);
                                                                byte[] bArr10 = new byte[i15];
                                                                sVar4.a(bArr10, 0, i15);
                                                                bVar = new com.anythink.basead.exoplayer.g.b.b(a25, bArr10);
                                                                r1 = sVar4;
                                                            }
                                                        } catch (UnsupportedEncodingException unused2) {
                                                            i12 = i13;
                                                            str = str2;
                                                            sVar2 = r1;
                                                            try {
                                                                Log.w(str, "Unsupported character encoding");
                                                                sVar2.c(i12);
                                                                return null;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                sVar2.c(i12);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (i9 == 65) {
                                                        if (r1 == 80) {
                                                            if (i10 == 73) {
                                                            }
                                                        }
                                                    }
                                                    str2 = f8096d;
                                                    if (i9 != 67) {
                                                    }
                                                    if (i9 != 67) {
                                                    }
                                                    int i342 = i19;
                                                    i14 = i10;
                                                    i15 = i342;
                                                    i16 = r1;
                                                    i17 = i11;
                                                    if (i9 != 67) {
                                                    }
                                                    i18 = i4;
                                                    s sVar42 = sVar;
                                                    String a252 = a(i18, i9, i16, i14, i17);
                                                    byte[] bArr102 = new byte[i15];
                                                    sVar42.a(bArr102, 0, i15);
                                                    bVar = new com.anythink.basead.exoplayer.g.b.b(a252, bArr102);
                                                    r1 = sVar42;
                                                }
                                            } catch (UnsupportedEncodingException unused3) {
                                                r1 = sVar;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (UnsupportedEncodingException unused4) {
                                    r1 = sVar;
                                    str = f8096d;
                                    i12 = i13;
                                    sVar2 = r1;
                                    Log.w(str, "Unsupported character encoding");
                                    sVar2.c(i12);
                                    return null;
                                }
                            }
                            int i212222 = i19;
                            i14 = i10;
                            i15 = i212222;
                            i16 = r1;
                            i17 = i11;
                            r1 = sVar;
                            i13 = c9;
                            str2 = f8096d;
                        }
                        if (bVar == null) {
                            try {
                                str = str2;
                            } catch (UnsupportedEncodingException unused5) {
                                str = str2;
                            }
                            try {
                                Log.w(str, "Failed to decode frame: id=" + a(i18, i9, i16, i14, i17) + ", frameSize=" + i15);
                            } catch (UnsupportedEncodingException unused6) {
                                i12 = i13;
                                sVar2 = r1;
                                Log.w(str, "Unsupported character encoding");
                                sVar2.c(i12);
                                return null;
                            }
                        }
                        r1.c(i13);
                        return bVar;
                    } catch (UnsupportedEncodingException unused7) {
                        sVar2 = sVar;
                        i12 = c9;
                        str = f8096d;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sVar2 = sVar;
                    i12 = c9;
                    sVar2.c(i12);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                sVar2 = r1;
            }
        } else {
            Log.w(f8096d, "Skipping unsupported compressed or encrypted frame");
            sVar.c(c9);
            return null;
        }
    }

    private static k a(s sVar, int i4) {
        if (i4 <= 0) {
            return null;
        }
        int d9 = sVar.d();
        String a9 = a(d9);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        int a10 = a(bArr, 0, d9);
        String str = new String(bArr, 0, a10, a9);
        int b9 = a10 + b(d9);
        return new k("TXXX", str, a(bArr, b9, a(bArr, b9, d9), a9));
    }

    private static k a(s sVar, int i4, String str) {
        if (i4 <= 0) {
            return null;
        }
        int d9 = sVar.d();
        String a9 = a(d9);
        int i6 = i4 - 1;
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        return new k(str, null, new String(bArr, 0, a(bArr, 0, d9), a9));
    }

    private static com.anythink.basead.exoplayer.g.b.a a(s sVar, int i4, int i6) {
        int b9;
        String d9;
        int d10 = sVar.d();
        String a9 = a(d10);
        int i9 = i4 - 1;
        byte[] bArr = new byte[i9];
        sVar.a(bArr, 0, i9);
        if (i6 == 2) {
            d9 = "image/" + af.d(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(d9)) {
                d9 = "image/jpeg";
            }
            b9 = 2;
        } else {
            b9 = b(bArr, 0);
            d9 = af.d(new String(bArr, 0, b9, "ISO-8859-1"));
            if (d9.indexOf(47) == -1) {
                d9 = "image/".concat(d9);
            }
        }
        int i10 = bArr[b9 + 1] & 255;
        int i11 = b9 + 2;
        int a10 = a(bArr, i11, d10);
        return new com.anythink.basead.exoplayer.g.b.a(d9, new String(bArr, i11, a10 - i11, a9), i10, b(bArr, a10 + b(d10), i9));
    }

    private static c a(s sVar, int i4, int i6, boolean z6, int i9, a aVar) {
        int c9 = sVar.c();
        int b9 = b(sVar.f9288a, c9);
        String str = new String(sVar.f9288a, c9, b9 - c9, "ISO-8859-1");
        sVar.c(b9 + 1);
        int i10 = sVar.i();
        int i11 = sVar.i();
        long h3 = sVar.h();
        if (h3 == 4294967295L) {
            h3 = -1;
        }
        long h9 = sVar.h();
        long j6 = h9 == 4294967295L ? -1L : h9;
        ArrayList arrayList = new ArrayList();
        int i12 = c9 + i4;
        while (sVar.c() < i12) {
            h a9 = a(i6, sVar, z6, i9, aVar);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, i10, i11, h3, j6, hVarArr);
    }

    private static String a(int i4) {
        if (i4 == 1) {
            return com.anythink.basead.exoplayer.b.f7176k;
        }
        if (i4 == 2) {
            return "UTF-16BE";
        }
        if (i4 != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }

    private static String a(int i4, int i6, int i9, int i10, int i11) {
        if (i4 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static int a(byte[] bArr, int i4, int i6) {
        int b9 = b(bArr, i4);
        if (i6 == 0 || i6 == 3) {
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

    private static String a(byte[] bArr, int i4, int i6, String str) {
        if (i6 > i4 && i6 <= bArr.length) {
            return new String(bArr, i4, i6 - i4, str);
        }
        return "";
    }
}
