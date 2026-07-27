package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.SparseArray;
import android.webkit.WebView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.AbstractC4730a;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4884h;
import q2.C4896n;
import q2.C4900p;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class C3 implements InterfaceC3868s3 {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f24017A = {0, 7, 8, 15};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f24018B = {0, 119, -120, -1};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f24019C = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: n, reason: collision with root package name */
    public Object f24020n;

    /* renamed from: u, reason: collision with root package name */
    public Object f24021u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24022v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24023w;

    /* renamed from: x, reason: collision with root package name */
    public Object f24024x;

    /* renamed from: y, reason: collision with root package name */
    public Object f24025y;

    /* renamed from: z, reason: collision with root package name */
    public Object f24026z;

    public C3(Context context, C3196fd c3196fd, C5110a c5110a, RD rd) {
        this.f24020n = new Object();
        this.f24025y = new AtomicBoolean(false);
        this.f24021u = context.getApplicationContext();
        this.f24024x = c5110a;
        this.f24023w = c3196fd;
        this.f24026z = rd;
    }

    public static C4030v3 c(C4233yr c4233yr, int i) {
        int h9;
        int h10;
        int i6;
        int i9;
        int i10 = 8;
        int h11 = c4233yr.h(8);
        c4233yr.f(8);
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] f3 = f();
        int[] j6 = j();
        int i12 = i - 2;
        while (i12 > 0) {
            int h12 = c4233yr.h(i10);
            int h13 = c4233yr.h(i10);
            int[] iArr2 = (h13 & 128) != 0 ? iArr : (h13 & 64) != 0 ? f3 : j6;
            if ((h13 & 1) != 0) {
                i6 = c4233yr.h(i10);
                i9 = c4233yr.h(i10);
                h9 = c4233yr.h(i10);
                h10 = c4233yr.h(i10);
                i12 -= 6;
            } else {
                int h14 = c4233yr.h(6) << 2;
                int h15 = c4233yr.h(4) << 4;
                i12 -= 4;
                h9 = c4233yr.h(4) << 4;
                h10 = c4233yr.h(2) << 6;
                i6 = h14;
                i9 = h15;
            }
            if (i6 == 0) {
                h10 = 255;
            }
            if (i6 == 0) {
                h9 = i11;
            }
            if (i6 == 0) {
                i9 = i11;
            }
            int i13 = 255 - (h10 & com.anythink.basead.exoplayer.k.p.f8473b);
            double d2 = i6;
            String str = AbstractC3159eu.f29993a;
            double d9 = i9 - 128;
            double d10 = h9 - 128;
            iArr2[h12] = k((byte) i13, Math.max(0, Math.min((int) ((1.402d * d9) + d2), com.anythink.basead.exoplayer.k.p.f8473b)), Math.max(0, Math.min((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), com.anythink.basead.exoplayer.k.p.f8473b)), Math.max(0, Math.min((int) ((d10 * 1.772d) + d2), com.anythink.basead.exoplayer.k.p.f8473b)));
            i11 = 0;
            h11 = h11;
            j6 = j6;
            i10 = 8;
        }
        return new C4030v3(h11, iArr, f3, j6);
    }

    public static C4138x3 d(C4233yr c4233yr) {
        byte[] bArr;
        int h9 = c4233yr.h(16);
        c4233yr.f(4);
        int h10 = c4233yr.h(2);
        boolean g4 = c4233yr.g();
        c4233yr.f(1);
        byte[] bArr2 = AbstractC3159eu.f29994b;
        if (h10 == 1) {
            c4233yr.f(c4233yr.h(8) * 16);
        } else if (h10 == 0) {
            int h11 = c4233yr.h(16);
            int h12 = c4233yr.h(16);
            if (h11 > 0) {
                bArr2 = new byte[h11];
                AbstractC2772Sd.H(c4233yr.f35234c == 0);
                System.arraycopy(c4233yr.f35232a, c4233yr.f35233b, bArr2, 0, h11);
                c4233yr.f35233b += h11;
                c4233yr.m();
            }
            if (h12 > 0) {
                bArr = new byte[h12];
                AbstractC2772Sd.H(c4233yr.f35234c == 0);
                System.arraycopy(c4233yr.f35232a, c4233yr.f35233b, bArr, 0, h12);
                c4233yr.f35233b += h12;
                c4233yr.m();
                return new C4138x3(h9, g4, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C4138x3(h9, g4, bArr2, bArr);
    }

    public static JSONObject e(Context context, C5110a c5110a) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC2718Pa.f26827f.r()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", c5110a.f41388n);
            jSONObject.put("mf", AbstractC2718Pa.f26828g.r());
            jSONObject.put("cl", "919173219");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", X2.c.d(context, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i6 = i & 4;
            int i9 = i & 2;
            int i10 = i & 1;
            if (i < 8) {
                iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8473b, 1 != i10 ? 0 : 255, i9 != 0 ? 255 : 0, i6 != 0 ? 255 : 0);
            } else {
                int i11 = com.anythink.expressad.video.module.a.a.f21728R;
                int i12 = 1 != i10 ? 0 : 127;
                int i13 = i9 != 0 ? 127 : 0;
                if (i6 == 0) {
                    i11 = 0;
                }
                iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8473b, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] j() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i6 = com.anythink.basead.exoplayer.k.p.f8473b;
            if (i < 8) {
                int i9 = i & 2;
                int i10 = i & 4;
                int i11 = 1 != (i & 1) ? 0 : 255;
                int i12 = i9 != 0 ? 255 : 0;
                if (i10 == 0) {
                    i6 = 0;
                }
                iArr[i] = k(63, i11, i12, i6);
            } else {
                int i13 = i & 136;
                if (i13 == 0) {
                    iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8473b, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i13 == 8) {
                    iArr[i] = k(com.anythink.expressad.video.module.a.a.f21728R, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i13 == 128) {
                    iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8473b, (1 != (i & 1) ? 0 : 43) + com.anythink.expressad.video.module.a.a.f21728R + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + com.anythink.expressad.video.module.a.a.f21728R + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + com.anythink.expressad.video.module.a.a.f21728R + ((i & 64) == 0 ? 0 : 85));
                } else if (i13 == 136) {
                    iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8473b, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int k(int i, int i6, int i9, int i10) {
        return (i << 24) | (i6 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff A[LOOP:3: B:82:0x0164->B:94:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(byte[] bArr, int[] iArr, int i, int i6, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z3;
        int h9;
        char c9;
        boolean z6;
        int i10;
        int i11;
        int h10;
        int i12;
        boolean z9;
        int i13;
        int h11;
        int h12;
        int i14;
        int i15;
        boolean z10;
        int h13;
        Paint paint2 = paint;
        C4233yr c4233yr = new C4233yr(bArr, bArr.length);
        int i16 = i6;
        int i17 = i9;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (c4233yr.b() != 0) {
            int h14 = c4233yr.h(8);
            if (h14 != 240) {
                int i18 = 3;
                int i19 = 4;
                switch (h14) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = f24017A;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            z3 = false;
                            while (true) {
                                h9 = c4233yr.h(2);
                                if (h9 != 0) {
                                }
                                c9 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i16;
                                i16 = i12 + i11;
                                if (!z6) {
                                }
                                paint2 = paint;
                                z3 = z6;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = f24018B;
                            bArr2 = bArr3;
                            z3 = false;
                            while (true) {
                                h9 = c4233yr.h(2);
                                if (h9 != 0) {
                                    z6 = z3;
                                    i10 = h9;
                                    i11 = 1;
                                } else {
                                    if (c4233yr.g()) {
                                        h10 = c4233yr.h(3) + 3;
                                        i10 = c4233yr.h(2);
                                    } else if (c4233yr.g()) {
                                        z6 = z3;
                                        i11 = 1;
                                        i10 = 0;
                                    } else {
                                        int h15 = c4233yr.h(2);
                                        if (h15 == 0) {
                                            c9 = 4;
                                            z6 = true;
                                            i10 = 0;
                                            i11 = 0;
                                        } else if (h15 == 1) {
                                            c9 = 4;
                                            z6 = z3;
                                            i11 = 2;
                                            i10 = 0;
                                        } else if (h15 == 2) {
                                            c9 = 4;
                                            z6 = z3;
                                            i11 = c4233yr.h(4) + 12;
                                            i10 = c4233yr.h(2);
                                        } else if (h15 != 3) {
                                            z6 = z3;
                                            i10 = 0;
                                            i11 = 0;
                                        } else {
                                            h10 = c4233yr.h(8) + 29;
                                            i10 = c4233yr.h(2);
                                        }
                                        if (i11 != 0 || paint2 == null) {
                                            i12 = i16;
                                        } else {
                                            int i20 = i17 + 1;
                                            float f3 = i17;
                                            if (bArr2 != 0) {
                                                i10 = bArr2[i10];
                                            }
                                            paint2.setColor(iArr[i10]);
                                            i12 = i16;
                                            canvas.drawRect(i16, f3, i16 + i11, i20, paint2);
                                        }
                                        i16 = i12 + i11;
                                        if (!z6) {
                                            c4233yr.k();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z3 = z6;
                                        }
                                    }
                                    z6 = z3;
                                    i11 = h10;
                                }
                                c9 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i16;
                                i16 = i12 + i11;
                                if (!z6) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            z3 = false;
                            while (true) {
                                h9 = c4233yr.h(2);
                                if (h9 != 0) {
                                }
                                c9 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i16;
                                i16 = i12 + i11;
                                if (!z6) {
                                }
                                paint2 = paint;
                                z3 = z6;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? f24019C : bArr5 : null;
                        boolean z11 = false;
                        while (true) {
                            int h16 = c4233yr.h(i19);
                            if (h16 != 0) {
                                z9 = z11;
                                i13 = 1;
                            } else if (c4233yr.g()) {
                                if (c4233yr.g()) {
                                    int h17 = c4233yr.h(2);
                                    if (h17 == 0) {
                                        z9 = z11;
                                        i13 = 1;
                                    } else if (h17 == 1) {
                                        z9 = z11;
                                        i13 = 2;
                                    } else if (h17 == 2) {
                                        h11 = c4233yr.h(i19) + 9;
                                        h12 = c4233yr.h(i19);
                                    } else if (h17 != i18) {
                                        z9 = z11;
                                        h16 = 0;
                                        i13 = 0;
                                    } else {
                                        h11 = c4233yr.h(8) + 25;
                                        h12 = c4233yr.h(i19);
                                    }
                                    h16 = 0;
                                } else {
                                    h11 = c4233yr.h(2) + i19;
                                    h12 = c4233yr.h(i19);
                                }
                                i13 = h11;
                                h16 = h12;
                                z9 = z11;
                            } else {
                                int h18 = c4233yr.h(i18);
                                if (h18 != 0) {
                                    z9 = z11;
                                    i13 = h18 + 2;
                                    h16 = 0;
                                } else {
                                    z9 = true;
                                    h16 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i16;
                                i15 = i18;
                            } else {
                                int i21 = i17 + 1;
                                int i22 = i18;
                                float f9 = i17;
                                if (bArr7 != 0) {
                                    h16 = bArr7[h16];
                                }
                                paint2.setColor(iArr[h16]);
                                i15 = i22;
                                i14 = i16;
                                canvas.drawRect(i16, f9, i16 + i13, i21, paint2);
                            }
                            i16 = i14 + i13;
                            if (z9) {
                                c4233yr.k();
                                continue;
                            } else {
                                i18 = i15;
                                z11 = z9;
                                i19 = 4;
                            }
                        }
                    case 18:
                        int i23 = i16;
                        boolean z12 = false;
                        while (true) {
                            int h19 = c4233yr.h(8);
                            if (h19 != 0) {
                                z10 = z12;
                                h13 = 1;
                            } else if (c4233yr.g()) {
                                z10 = z12;
                                h13 = c4233yr.h(7);
                                h19 = c4233yr.h(8);
                            } else {
                                int h20 = c4233yr.h(7);
                                if (h20 != 0) {
                                    z10 = z12;
                                    h13 = h20;
                                    h19 = 0;
                                } else {
                                    z10 = true;
                                    h19 = 0;
                                    h13 = 0;
                                }
                            }
                            if (h13 != 0 && paint2 != null) {
                                paint2.setColor(iArr[h19]);
                                canvas.drawRect(i23, i17, i23 + h13, i17 + 1, paint2);
                            }
                            i23 += h13;
                            if (z10) {
                                i16 = i23;
                                continue;
                            } else {
                                z12 = z10;
                            }
                        }
                    default:
                        switch (h14) {
                            case 32:
                                bArr6 = m(4, 4, c4233yr);
                                break;
                            case 33:
                                bArr4 = m(4, 8, c4233yr);
                                break;
                            case 34:
                                bArr5 = m(16, 8, c4233yr);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i17 += 2;
                i16 = i6;
            }
            paint2 = paint;
        }
    }

    public static byte[] m(int i, int i6, C4233yr c4233yr) {
        byte[] bArr = new byte[i];
        for (int i9 = 0; i9 < i; i9++) {
            bArr[i9] = (byte) c4233yr.h(i6);
        }
        return bArr;
    }

    public N3.a a() {
        synchronized (this.f24020n) {
            try {
                if (((SharedPreferences) this.f24022v) == null) {
                    this.f24022v = ((Context) this.f24021u).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f24022v;
        long j6 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        C4835j.f39730C.f39742k.getClass();
        if (System.currentTimeMillis() - j6 < ((Long) AbstractC2718Pa.f26829h.r()).longValue()) {
            return ND.f26473u;
        }
        return QC.u(((C3196fd) this.f24023w).b(e((Context) this.f24021u, (C5110a) this.f24024x)), new C2722Pe(0, this), ((Boolean) AbstractC2718Pa.f26833m.r()).booleanValue() ? (RD) this.f24026z : AbstractC3413jg.f31275h);
    }

    public void b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            q2.f1 b9 = q2.f1.b();
            C4896n c4896n = C4900p.f40196g.f40198b;
            Context context = (Context) this.f24021u;
            String str = (String) this.f24022v;
            BinderC3464kd binderC3464kd = (BinderC3464kd) this.f24025y;
            c4896n.getClass();
            q2.K k9 = (q2.K) new C4884h(c4896n, context, b9, str, binderC3464kd).d(context, false);
            this.f24020n = k9;
            if (k9 != null) {
                q2.F0 f02 = (q2.F0) this.f24023w;
                f02.f40033n = currentTimeMillis;
                k9.P3(new J8((AbstractC4730a) this.f24024x, str));
                q2.K k10 = (q2.K) this.f24020n;
                ((q2.e1) this.f24026z).getClass();
                k10.d3(q2.e1.a(context, f02));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public C3723pJ g() {
        C3534lt c3534lt;
        C3534lt c3534lt2;
        C3777qJ c3777qJ = (C3777qJ) this.f24020n;
        if (c3777qJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        C3534lt c3534lt3 = (C3534lt) this.f24022v;
        if (c3534lt3 == null || (c3534lt = (C3534lt) this.f24023w) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        C3534lt c3534lt4 = (C3534lt) this.f24021u;
        if (c3534lt4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        C3534lt c3534lt5 = (C3534lt) this.f24024x;
        if (c3534lt5 == null || (c3534lt2 = (C3534lt) this.f24025y) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        C3534lt c3534lt6 = (C3534lt) this.f24026z;
        if (c3534lt6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c3777qJ.f33230b.f32892b;
        BigInteger bigInteger2 = (BigInteger) c3534lt3.f31863u;
        if (!bigInteger2.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger3 = (BigInteger) c3534lt.f31863u;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger2.multiply(bigInteger3).equals(c3777qJ.f33231c)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger subtract = bigInteger2.subtract(bigInteger4);
        BigInteger subtract2 = bigInteger3.subtract(bigInteger4);
        if (!bigInteger.multiply((BigInteger) c3534lt4.f31863u).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger4)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3534lt5.f31863u).mod(subtract).equals(bigInteger4)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3534lt2.f31863u).mod(subtract2).equals(bigInteger4)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger3.multiply((BigInteger) c3534lt6.f31863u).mod(bigInteger2).equals(bigInteger4)) {
            return new C3723pJ((C3777qJ) this.f24020n, (C3534lt) this.f24022v, (C3534lt) this.f24023w, (C3534lt) this.f24021u, (C3534lt) this.f24024x, (C3534lt) this.f24025y, (C3534lt) this.f24026z);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    public void h(byte[] bArr, int i, int i6, X1.b bVar) {
        B3 b32;
        C3653o3 c3653o3;
        char c9;
        char c10;
        char c11;
        int i9;
        C4084w3 c4084w3;
        ArrayList arrayList;
        B3 b33;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C4246z3 c4246z3;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z3 = true;
        C4233yr c4233yr = new C4233yr(bArr, i + i6);
        c4233yr.d(i);
        while (true) {
            int b9 = c4233yr.b();
            b32 = (B3) this.f24025y;
            if (b9 >= 48 && c4233yr.h(8) == 15) {
                int h9 = c4233yr.h(8);
                int h10 = c4233yr.h(16);
                int h11 = c4233yr.h(16);
                int c12 = c4233yr.c() + h11;
                if (h11 * 8 > c4233yr.b()) {
                    AbstractC2968bG.y("DvbParser", "Data field length exceeds limit");
                    c4233yr.f(c4233yr.b());
                } else {
                    switch (h9) {
                        case 16:
                            if (h10 == b32.f23806a) {
                                C3921t2 c3921t2 = b32.i;
                                c4233yr.h(8);
                                int h12 = c4233yr.h(4);
                                int h13 = c4233yr.h(2);
                                c4233yr.f(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i19 = h11 - 2; i19 > 0; i19 -= 6) {
                                    int h14 = c4233yr.h(8);
                                    c4233yr.f(8);
                                    sparseArray.put(h14, new C4192y3(c4233yr.h(16), c4233yr.h(16)));
                                }
                                C3921t2 c3921t22 = new C3921t2(h12, h13, sparseArray);
                                if (h13 != 0) {
                                    b32.i = c3921t22;
                                    b32.f23808c.clear();
                                    b32.f23809d.clear();
                                    b32.f23810e.clear();
                                    break;
                                } else if (c3921t2 != null && c3921t2.f34191n != h12) {
                                    b32.i = c3921t22;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C3921t2 c3921t23 = b32.i;
                            if (h10 == b32.f23806a && c3921t23 != null) {
                                int h15 = c4233yr.h(8);
                                c4233yr.f(4);
                                boolean g4 = c4233yr.g();
                                c4233yr.f(3);
                                int h16 = c4233yr.h(16);
                                int h17 = c4233yr.h(16);
                                c4233yr.h(3);
                                int h18 = c4233yr.h(3);
                                c4233yr.f(2);
                                int h19 = c4233yr.h(8);
                                int h20 = c4233yr.h(8);
                                int h21 = c4233yr.h(4);
                                int h22 = c4233yr.h(2);
                                c4233yr.f(2);
                                int i20 = h11 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i20 > 0) {
                                    int h23 = c4233yr.h(16);
                                    int h24 = c4233yr.h(2);
                                    c4233yr.h(2);
                                    int h25 = c4233yr.h(12);
                                    c4233yr.f(4);
                                    int h26 = c4233yr.h(12);
                                    int i21 = i20 - 6;
                                    if (h24 == 1 || h24 == 2) {
                                        c4233yr.h(8);
                                        c4233yr.h(8);
                                        i20 -= 8;
                                    } else {
                                        i20 = i21;
                                    }
                                    sparseArray2.put(h23, new A3(h25, h26));
                                }
                                C4246z3 c4246z32 = new C4246z3(h15, g4, h16, h17, h18, h19, h20, h21, h22, sparseArray2);
                                SparseArray sparseArray3 = b32.f23808c;
                                if (c3921t23.f34192u == 0 && (c4246z3 = (C4246z3) sparseArray3.get(h15)) != null) {
                                    int i22 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c4246z3.f35276j;
                                        if (i22 < sparseArray4.size()) {
                                            c4246z32.f35276j.put(sparseArray4.keyAt(i22), (A3) sparseArray4.valueAt(i22));
                                            i22++;
                                        }
                                    }
                                }
                                sparseArray3.put(c4246z32.f35268a, c4246z32);
                                break;
                            }
                            break;
                        case 18:
                            if (h10 == b32.f23806a) {
                                C4030v3 c13 = c(c4233yr, h11);
                                b32.f23809d.put(c13.f34641a, c13);
                                break;
                            } else if (h10 == b32.f23807b) {
                                C4030v3 c14 = c(c4233yr, h11);
                                b32.f23811f.put(c14.f34641a, c14);
                                break;
                            }
                            break;
                        case 19:
                            if (h10 == b32.f23806a) {
                                C4138x3 d2 = d(c4233yr);
                                b32.f23810e.put(d2.f34936a, d2);
                                break;
                            } else if (h10 == b32.f23807b) {
                                C4138x3 d9 = d(c4233yr);
                                b32.f23812g.put(d9.f34936a, d9);
                                break;
                            }
                            break;
                        case 20:
                            if (h10 == b32.f23806a) {
                                c4233yr.f(4);
                                boolean g9 = c4233yr.g();
                                c4233yr.f(3);
                                int h27 = c4233yr.h(16);
                                int h28 = c4233yr.h(16);
                                if (g9) {
                                    int h29 = c4233yr.h(16);
                                    int h30 = c4233yr.h(16);
                                    int h31 = c4233yr.h(16);
                                    i15 = h30;
                                    i16 = c4233yr.h(16);
                                    i18 = h31;
                                    i17 = h29;
                                } else {
                                    i15 = h27;
                                    i16 = h28;
                                    i17 = 0;
                                    i18 = 0;
                                }
                                b32.f23813h = new C4084w3(h27, h28, i17, i15, i18, i16);
                                break;
                            }
                            break;
                    }
                    c4233yr.l(c12 - c4233yr.c());
                }
            }
        }
        C3921t2 c3921t24 = b32.i;
        if (c3921t24 == null) {
            PB pb = RB.f27177u;
            c3653o3 = new C3653o3(C3500lC.f31745x, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b);
        } else {
            C4084w3 c4084w32 = b32.f23813h;
            if (c4084w32 == null) {
                c4084w32 = (C4084w3) this.f24023w;
            }
            Bitmap bitmap = (Bitmap) this.f24026z;
            Canvas canvas = (Canvas) this.f24022v;
            if (bitmap == null || c4084w32.f34788a + 1 != bitmap.getWidth() || c4084w32.f34789b + 1 != ((Bitmap) this.f24026z).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c4084w32.f34788a + 1, c4084w32.f34789b + 1, Bitmap.Config.ARGB_8888);
                this.f24026z = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i23 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c3921t24.f34193v;
                if (i23 < sparseArray5.size()) {
                    canvas.save();
                    C4192y3 c4192y3 = (C4192y3) sparseArray5.valueAt(i23);
                    C4246z3 c4246z33 = (C4246z3) b32.f23808c.get(sparseArray5.keyAt(i23));
                    int i24 = c4192y3.f35084a + c4084w32.f34790c;
                    int i25 = c4192y3.f35085b + c4084w32.f34792e;
                    int i26 = c4246z33.f35270c;
                    int i27 = i24 + i26;
                    int min = Math.min(i27, c4084w32.f34791d);
                    boolean z6 = z3;
                    int i28 = c4246z33.f35271d;
                    int i29 = i25 + i28;
                    canvas.clipRect(i24, i25, min, Math.min(i29, c4084w32.f34793f));
                    SparseArray sparseArray6 = b32.f23809d;
                    int i30 = c4246z33.f35273f;
                    C4030v3 c4030v3 = (C4030v3) sparseArray6.get(i30);
                    if (c4030v3 == null && (c4030v3 = (C4030v3) b32.f23811f.get(i30)) == null) {
                        c4030v3 = (C4030v3) this.f24024x;
                    }
                    C3921t2 c3921t25 = c3921t24;
                    int i31 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c4246z33.f35276j;
                        int i32 = i23;
                        if (i31 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i31);
                            A3 a32 = (A3) sparseArray7.valueAt(i31);
                            Canvas canvas2 = canvas;
                            C4138x3 c4138x3 = (C4138x3) b32.f23810e.get(keyAt);
                            if (c4138x3 == null) {
                                c4138x3 = (C4138x3) b32.f23812g.get(keyAt);
                            }
                            C4138x3 c4138x32 = c4138x3;
                            if (c4138x32 != null) {
                                Paint paint = c4138x32.f34937b ? null : (Paint) this.f24020n;
                                b33 = b32;
                                int i33 = a32.f23622a + i24;
                                int i34 = a32.f23623b + i25;
                                int i35 = i24;
                                int i36 = c4246z33.f35272e;
                                i14 = i31;
                                Paint paint2 = paint;
                                int i37 = i25;
                                int[] iArr = i36 == 3 ? c4030v3.f34644d : i36 == 2 ? c4030v3.f34643c : c4030v3.f34642b;
                                i11 = i35;
                                arrayList = arrayList2;
                                i12 = i26;
                                i10 = i37;
                                c4084w3 = c4084w32;
                                i13 = i27;
                                l(c4138x32.f34938c, iArr, i36, i33, i34, paint2, canvas2);
                                l(c4138x32.f34939d, iArr, i36, i33, i34 + 1, paint2, canvas2);
                            } else {
                                c4084w3 = c4084w32;
                                arrayList = arrayList2;
                                b33 = b32;
                                i10 = i25;
                                i11 = i24;
                                i12 = i26;
                                i13 = i27;
                                i14 = i31;
                            }
                            i31 = i14 + 1;
                            i24 = i11;
                            i27 = i13;
                            i26 = i12;
                            i25 = i10;
                            canvas = canvas2;
                            i23 = i32;
                            b32 = b33;
                            arrayList2 = arrayList;
                            c4084w32 = c4084w3;
                        } else {
                            C4084w3 c4084w33 = c4084w32;
                            ArrayList arrayList3 = arrayList2;
                            B3 b34 = b32;
                            Canvas canvas3 = canvas;
                            int i38 = i25;
                            int i39 = i24;
                            int i40 = i26;
                            int i41 = i27;
                            float f3 = i38;
                            float f9 = i39;
                            if (c4246z33.f35269b) {
                                int i42 = c4246z33.f35272e;
                                if (i42 == 3) {
                                    i9 = c4030v3.f34644d[c4246z33.f35274g];
                                    c11 = 2;
                                } else {
                                    c11 = 2;
                                    i9 = i42 == 2 ? c4030v3.f34643c[c4246z33.f35275h] : c4030v3.f34642b[c4246z33.i];
                                }
                                Paint paint3 = (Paint) this.f24021u;
                                paint3.setColor(i9);
                                float f10 = i41;
                                c10 = c11;
                                c9 = 3;
                                canvas = canvas3;
                                canvas.drawRect(f9, f3, f10, i29, paint3);
                            } else {
                                canvas = canvas3;
                                c9 = 3;
                                c10 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.f24026z, i39, i38, i40, i28);
                            float f11 = c4084w33.f34788a;
                            float f12 = c4084w33.f34789b;
                            arrayList3.add(new C4279zj(null, null, null, createBitmap2, f3 / f12, 0, 0, f9 / f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f11, i28 / f12, Integer.MIN_VALUE, 0.0f, 0));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            arrayList2 = arrayList3;
                            b32 = b34;
                            c4084w32 = c4084w33;
                            i23 = i32 + 1;
                            z3 = z6;
                            c3921t24 = c3921t25;
                        }
                    }
                } else {
                    c3653o3 = new C3653o3(arrayList2, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b);
                }
            }
        }
        bVar.mo10a(c3653o3);
    }

    public C4046vJ i() {
        C3534lt c3534lt;
        C3534lt c3534lt2;
        C4100wJ c4100wJ = (C4100wJ) this.f24020n;
        if (c4100wJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        C3534lt c3534lt3 = (C3534lt) this.f24022v;
        if (c3534lt3 == null || (c3534lt = (C3534lt) this.f24023w) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        C3534lt c3534lt4 = (C3534lt) this.f24021u;
        if (c3534lt4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        C3534lt c3534lt5 = (C3534lt) this.f24024x;
        if (c3534lt5 == null || (c3534lt2 = (C3534lt) this.f24025y) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        C3534lt c3534lt6 = (C3534lt) this.f24026z;
        if (c3534lt6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c4100wJ.f34824b.f34512b;
        BigInteger bigInteger2 = (BigInteger) c3534lt3.f31863u;
        if (!bigInteger2.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger3 = (BigInteger) c3534lt.f31863u;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger2.multiply(bigInteger3).equals(c4100wJ.f34825c)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger subtract = bigInteger2.subtract(bigInteger4);
        BigInteger subtract2 = bigInteger3.subtract(bigInteger4);
        if (!bigInteger.multiply((BigInteger) c3534lt4.f31863u).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger4)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3534lt5.f31863u).mod(subtract).equals(bigInteger4)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3534lt2.f31863u).mod(subtract2).equals(bigInteger4)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger3.multiply((BigInteger) c3534lt6.f31863u).mod(bigInteger2).equals(bigInteger4)) {
            return new C4046vJ((C4100wJ) this.f24020n, (C3534lt) this.f24022v, (C3534lt) this.f24023w, (C3534lt) this.f24021u, (C3534lt) this.f24024x, (C3534lt) this.f24025y, (C3534lt) this.f24026z);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ C3(boolean z3) {
        this.f24020n = null;
        this.f24021u = null;
        this.f24022v = null;
        this.f24023w = null;
        this.f24024x = null;
        this.f24025y = null;
        this.f24026z = null;
    }

    public C3() {
        this.f24025y = new s.k();
        this.f24026z = new s.k();
    }

    public C3(Context context, String str, q2.F0 f02, AbstractC4730a abstractC4730a) {
        this.f24025y = new BinderC3464kd();
        this.f24021u = context;
        this.f24022v = str;
        this.f24023w = f02;
        this.f24024x = abstractC4730a;
        this.f24026z = q2.e1.f40127a;
    }

    public C3(C3731pa c3731pa, WebView webView, String str, String str2, Tv tv) {
        this.f24022v = new ArrayList();
        this.f24023w = new HashMap();
        this.f24020n = c3731pa;
        this.f24021u = webView;
        this.f24026z = tv;
        this.f24025y = str;
        this.f24024x = str2;
    }
}
