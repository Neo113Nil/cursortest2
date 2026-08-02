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
import o2.AbstractC4801a;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4933h;
import s2.C4945n;
import s2.C4949p;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class C3 implements InterfaceC3891s3 {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f24780A = {0, 7, 8, 15};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f24781B = {0, 119, -120, -1};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f24782C = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: n, reason: collision with root package name */
    public Object f24783n;

    /* renamed from: u, reason: collision with root package name */
    public Object f24784u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24785v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24786w;

    /* renamed from: x, reason: collision with root package name */
    public Object f24787x;

    /* renamed from: y, reason: collision with root package name */
    public Object f24788y;

    /* renamed from: z, reason: collision with root package name */
    public Object f24789z;

    public C3(Context context, C3219fd c3219fd, C5189a c5189a, RD rd) {
        this.f24783n = new Object();
        this.f24788y = new AtomicBoolean(false);
        this.f24784u = context.getApplicationContext();
        this.f24787x = c5189a;
        this.f24786w = c3219fd;
        this.f24789z = rd;
    }

    public static C4053v3 c(C4256yr c4256yr, int i) {
        int h3;
        int h9;
        int i4;
        int i6;
        int i9 = 8;
        int h10 = c4256yr.h(8);
        c4256yr.f(8);
        int i10 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] f2 = f();
        int[] i11 = i();
        int i12 = i - 2;
        while (i12 > 0) {
            int h11 = c4256yr.h(i9);
            int h12 = c4256yr.h(i9);
            int[] iArr2 = (h12 & 128) != 0 ? iArr : (h12 & 64) != 0 ? f2 : i11;
            if ((h12 & 1) != 0) {
                i4 = c4256yr.h(i9);
                i6 = c4256yr.h(i9);
                h3 = c4256yr.h(i9);
                h9 = c4256yr.h(i9);
                i12 -= 6;
            } else {
                int h13 = c4256yr.h(6) << 2;
                int h14 = c4256yr.h(4) << 4;
                i12 -= 4;
                h3 = c4256yr.h(4) << 4;
                h9 = c4256yr.h(2) << 6;
                i4 = h13;
                i6 = h14;
            }
            if (i4 == 0) {
                h9 = 255;
            }
            if (i4 == 0) {
                h3 = i10;
            }
            if (i4 == 0) {
                i6 = i10;
            }
            int i13 = 255 - (h9 & com.anythink.basead.exoplayer.k.p.f9259b);
            double d9 = i4;
            String str = AbstractC3182eu.f30782a;
            double d10 = i6 - 128;
            double d11 = h3 - 128;
            iArr2[h11] = j((byte) i13, Math.max(0, Math.min((int) ((1.402d * d10) + d9), com.anythink.basead.exoplayer.k.p.f9259b)), Math.max(0, Math.min((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), com.anythink.basead.exoplayer.k.p.f9259b)), Math.max(0, Math.min((int) ((d11 * 1.772d) + d9), com.anythink.basead.exoplayer.k.p.f9259b)));
            i10 = 0;
            h10 = h10;
            i11 = i11;
            i9 = 8;
        }
        return new C4053v3(h10, iArr, f2, i11);
    }

    public static C4161x3 d(C4256yr c4256yr) {
        byte[] bArr;
        int h3 = c4256yr.h(16);
        c4256yr.f(4);
        int h9 = c4256yr.h(2);
        boolean g9 = c4256yr.g();
        c4256yr.f(1);
        byte[] bArr2 = AbstractC3182eu.f30783b;
        if (h9 == 1) {
            c4256yr.f(c4256yr.h(8) * 16);
        } else if (h9 == 0) {
            int h10 = c4256yr.h(16);
            int h11 = c4256yr.h(16);
            if (h10 > 0) {
                bArr2 = new byte[h10];
                AbstractC2792Sd.H(c4256yr.f36018c == 0);
                System.arraycopy(c4256yr.f36016a, c4256yr.f36017b, bArr2, 0, h10);
                c4256yr.f36017b += h10;
                c4256yr.m();
            }
            if (h11 > 0) {
                bArr = new byte[h11];
                AbstractC2792Sd.H(c4256yr.f36018c == 0);
                System.arraycopy(c4256yr.f36016a, c4256yr.f36017b, bArr, 0, h11);
                c4256yr.f36017b += h11;
                c4256yr.m();
                return new C4161x3(h3, g9, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C4161x3(h3, g9, bArr2, bArr);
    }

    public static JSONObject e(Context context, C5189a c5189a) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC2738Pa.f27615f.r()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", c5189a.f41845n);
            jSONObject.put("mf", AbstractC2738Pa.f27616g.r());
            jSONObject.put("cl", "919173219");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", Z2.b.d(context, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i4 = i & 4;
            int i6 = i & 2;
            int i9 = i & 1;
            if (i < 8) {
                iArr[i] = j(com.anythink.basead.exoplayer.k.p.f9259b, 1 != i9 ? 0 : 255, i6 != 0 ? 255 : 0, i4 != 0 ? 255 : 0);
            } else {
                int i10 = com.anythink.expressad.video.module.a.a.f22515R;
                int i11 = 1 != i9 ? 0 : 127;
                int i12 = i6 != 0 ? 127 : 0;
                if (i4 == 0) {
                    i10 = 0;
                }
                iArr[i] = j(com.anythink.basead.exoplayer.k.p.f9259b, i11, i12, i10);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i4 = com.anythink.basead.exoplayer.k.p.f9259b;
            if (i < 8) {
                int i6 = i & 2;
                int i9 = i & 4;
                int i10 = 1 != (i & 1) ? 0 : 255;
                int i11 = i6 != 0 ? 255 : 0;
                if (i9 == 0) {
                    i4 = 0;
                }
                iArr[i] = j(63, i10, i11, i4);
            } else {
                int i12 = i & 136;
                if (i12 == 0) {
                    iArr[i] = j(com.anythink.basead.exoplayer.k.p.f9259b, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i12 == 8) {
                    iArr[i] = j(com.anythink.expressad.video.module.a.a.f22515R, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i12 == 128) {
                    iArr[i] = j(com.anythink.basead.exoplayer.k.p.f9259b, (1 != (i & 1) ? 0 : 43) + com.anythink.expressad.video.module.a.a.f22515R + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + com.anythink.expressad.video.module.a.a.f22515R + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + com.anythink.expressad.video.module.a.a.f22515R + ((i & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i] = j(com.anythink.basead.exoplayer.k.p.f9259b, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int j(int i, int i4, int i6, int i9) {
        return (i << 24) | (i4 << 16) | (i6 << 8) | i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff A[LOOP:3: B:82:0x0164->B:94:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(byte[] bArr, int[] iArr, int i, int i4, int i6, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z6;
        int h3;
        char c9;
        boolean z9;
        int i9;
        int i10;
        int h9;
        int i11;
        boolean z10;
        int i12;
        int h10;
        int h11;
        int i13;
        int i14;
        boolean z11;
        int h12;
        Paint paint2 = paint;
        C4256yr c4256yr = new C4256yr(bArr, bArr.length);
        int i15 = i4;
        int i16 = i6;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (c4256yr.b() != 0) {
            int h13 = c4256yr.h(8);
            if (h13 != 240) {
                int i17 = 3;
                int i18 = 4;
                switch (h13) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = f24780A;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            z6 = false;
                            while (true) {
                                h3 = c4256yr.h(2);
                                if (h3 != 0) {
                                }
                                c9 = 4;
                                if (i10 != 0) {
                                }
                                i11 = i15;
                                i15 = i11 + i10;
                                if (!z9) {
                                }
                                paint2 = paint;
                                z6 = z9;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = f24781B;
                            bArr2 = bArr3;
                            z6 = false;
                            while (true) {
                                h3 = c4256yr.h(2);
                                if (h3 != 0) {
                                    z9 = z6;
                                    i9 = h3;
                                    i10 = 1;
                                } else {
                                    if (c4256yr.g()) {
                                        h9 = c4256yr.h(3) + 3;
                                        i9 = c4256yr.h(2);
                                    } else if (c4256yr.g()) {
                                        z9 = z6;
                                        i10 = 1;
                                        i9 = 0;
                                    } else {
                                        int h14 = c4256yr.h(2);
                                        if (h14 == 0) {
                                            c9 = 4;
                                            z9 = true;
                                            i9 = 0;
                                            i10 = 0;
                                        } else if (h14 == 1) {
                                            c9 = 4;
                                            z9 = z6;
                                            i10 = 2;
                                            i9 = 0;
                                        } else if (h14 == 2) {
                                            c9 = 4;
                                            z9 = z6;
                                            i10 = c4256yr.h(4) + 12;
                                            i9 = c4256yr.h(2);
                                        } else if (h14 != 3) {
                                            z9 = z6;
                                            i9 = 0;
                                            i10 = 0;
                                        } else {
                                            h9 = c4256yr.h(8) + 29;
                                            i9 = c4256yr.h(2);
                                        }
                                        if (i10 != 0 || paint2 == null) {
                                            i11 = i15;
                                        } else {
                                            int i19 = i16 + 1;
                                            float f2 = i16;
                                            if (bArr2 != 0) {
                                                i9 = bArr2[i9];
                                            }
                                            paint2.setColor(iArr[i9]);
                                            i11 = i15;
                                            canvas.drawRect(i15, f2, i15 + i10, i19, paint2);
                                        }
                                        i15 = i11 + i10;
                                        if (!z9) {
                                            c4256yr.k();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z6 = z9;
                                        }
                                    }
                                    z9 = z6;
                                    i10 = h9;
                                }
                                c9 = 4;
                                if (i10 != 0) {
                                }
                                i11 = i15;
                                i15 = i11 + i10;
                                if (!z9) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            z6 = false;
                            while (true) {
                                h3 = c4256yr.h(2);
                                if (h3 != 0) {
                                }
                                c9 = 4;
                                if (i10 != 0) {
                                }
                                i11 = i15;
                                i15 = i11 + i10;
                                if (!z9) {
                                }
                                paint2 = paint;
                                z6 = z9;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? f24782C : bArr5 : null;
                        boolean z12 = false;
                        while (true) {
                            int h15 = c4256yr.h(i18);
                            if (h15 != 0) {
                                z10 = z12;
                                i12 = 1;
                            } else if (c4256yr.g()) {
                                if (c4256yr.g()) {
                                    int h16 = c4256yr.h(2);
                                    if (h16 == 0) {
                                        z10 = z12;
                                        i12 = 1;
                                    } else if (h16 == 1) {
                                        z10 = z12;
                                        i12 = 2;
                                    } else if (h16 == 2) {
                                        h10 = c4256yr.h(i18) + 9;
                                        h11 = c4256yr.h(i18);
                                    } else if (h16 != i17) {
                                        z10 = z12;
                                        h15 = 0;
                                        i12 = 0;
                                    } else {
                                        h10 = c4256yr.h(8) + 25;
                                        h11 = c4256yr.h(i18);
                                    }
                                    h15 = 0;
                                } else {
                                    h10 = c4256yr.h(2) + i18;
                                    h11 = c4256yr.h(i18);
                                }
                                i12 = h10;
                                h15 = h11;
                                z10 = z12;
                            } else {
                                int h17 = c4256yr.h(i17);
                                if (h17 != 0) {
                                    z10 = z12;
                                    i12 = h17 + 2;
                                    h15 = 0;
                                } else {
                                    z10 = true;
                                    h15 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i12 == 0 || paint2 == null) {
                                i13 = i15;
                                i14 = i17;
                            } else {
                                int i20 = i16 + 1;
                                int i21 = i17;
                                float f9 = i16;
                                if (bArr7 != 0) {
                                    h15 = bArr7[h15];
                                }
                                paint2.setColor(iArr[h15]);
                                i14 = i21;
                                i13 = i15;
                                canvas.drawRect(i15, f9, i15 + i12, i20, paint2);
                            }
                            i15 = i13 + i12;
                            if (z10) {
                                c4256yr.k();
                                continue;
                            } else {
                                i17 = i14;
                                z12 = z10;
                                i18 = 4;
                            }
                        }
                    case 18:
                        int i22 = i15;
                        boolean z13 = false;
                        while (true) {
                            int h18 = c4256yr.h(8);
                            if (h18 != 0) {
                                z11 = z13;
                                h12 = 1;
                            } else if (c4256yr.g()) {
                                z11 = z13;
                                h12 = c4256yr.h(7);
                                h18 = c4256yr.h(8);
                            } else {
                                int h19 = c4256yr.h(7);
                                if (h19 != 0) {
                                    z11 = z13;
                                    h12 = h19;
                                    h18 = 0;
                                } else {
                                    z11 = true;
                                    h18 = 0;
                                    h12 = 0;
                                }
                            }
                            if (h12 != 0 && paint2 != null) {
                                paint2.setColor(iArr[h18]);
                                canvas.drawRect(i22, i16, i22 + h12, i16 + 1, paint2);
                            }
                            i22 += h12;
                            if (z11) {
                                i15 = i22;
                                continue;
                            } else {
                                z13 = z11;
                            }
                        }
                    default:
                        switch (h13) {
                            case 32:
                                bArr6 = l(4, 4, c4256yr);
                                break;
                            case 33:
                                bArr4 = l(4, 8, c4256yr);
                                break;
                            case 34:
                                bArr5 = l(16, 8, c4256yr);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i16 += 2;
                i15 = i4;
            }
            paint2 = paint;
        }
    }

    public static byte[] l(int i, int i4, C4256yr c4256yr) {
        byte[] bArr = new byte[i];
        for (int i6 = 0; i6 < i; i6++) {
            bArr[i6] = (byte) c4256yr.h(i4);
        }
        return bArr;
    }

    public P3.a a() {
        synchronized (this.f24783n) {
            try {
                if (((SharedPreferences) this.f24785v) == null) {
                    this.f24785v = ((Context) this.f24784u).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f24785v;
        long j6 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        C4906k.f40186C.f40198k.getClass();
        if (System.currentTimeMillis() - j6 < ((Long) AbstractC2738Pa.f27617h.r()).longValue()) {
            return ND.f27257u;
        }
        return QC.u(((C3219fd) this.f24786w).b(e((Context) this.f24784u, (C5189a) this.f24787x)), new C2742Pe(0, this), ((Boolean) AbstractC2738Pa.f27621m.r()).booleanValue() ? (RD) this.f24789z : AbstractC3436jg.f32062h);
    }

    public void b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            s2.f1 b9 = s2.f1.b();
            C4945n c4945n = C4949p.f40498g.f40500b;
            Context context = (Context) this.f24784u;
            String str = (String) this.f24785v;
            BinderC3487kd binderC3487kd = (BinderC3487kd) this.f24788y;
            c4945n.getClass();
            s2.K k9 = (s2.K) new C4933h(c4945n, context, b9, str, binderC3487kd).d(context, false);
            this.f24783n = k9;
            if (k9 != null) {
                s2.F0 f02 = (s2.F0) this.f24786w;
                f02.f40335n = currentTimeMillis;
                k9.P3(new J8((AbstractC4801a) this.f24787x, str));
                s2.K k10 = (s2.K) this.f24783n;
                ((s2.e1) this.f24789z).getClass();
                k10.D3(s2.e1.a(context, f02));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public C3746pJ g() {
        C3557lt c3557lt;
        C3557lt c3557lt2;
        C3800qJ c3800qJ = (C3800qJ) this.f24783n;
        if (c3800qJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        C3557lt c3557lt3 = (C3557lt) this.f24785v;
        if (c3557lt3 == null || (c3557lt = (C3557lt) this.f24786w) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        C3557lt c3557lt4 = (C3557lt) this.f24784u;
        if (c3557lt4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        C3557lt c3557lt5 = (C3557lt) this.f24787x;
        if (c3557lt5 == null || (c3557lt2 = (C3557lt) this.f24788y) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        C3557lt c3557lt6 = (C3557lt) this.f24789z;
        if (c3557lt6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c3800qJ.f34014b.f33679b;
        BigInteger bigInteger2 = (BigInteger) c3557lt3.f32643u;
        if (!bigInteger2.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger3 = (BigInteger) c3557lt.f32643u;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger2.multiply(bigInteger3).equals(c3800qJ.f34015c)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger subtract = bigInteger2.subtract(bigInteger4);
        BigInteger subtract2 = bigInteger3.subtract(bigInteger4);
        if (!bigInteger.multiply((BigInteger) c3557lt4.f32643u).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger4)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3557lt5.f32643u).mod(subtract).equals(bigInteger4)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3557lt2.f32643u).mod(subtract2).equals(bigInteger4)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger3.multiply((BigInteger) c3557lt6.f32643u).mod(bigInteger2).equals(bigInteger4)) {
            return new C3746pJ((C3800qJ) this.f24783n, (C3557lt) this.f24785v, (C3557lt) this.f24786w, (C3557lt) this.f24784u, (C3557lt) this.f24787x, (C3557lt) this.f24788y, (C3557lt) this.f24789z);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public C4069vJ h() {
        C3557lt c3557lt;
        C3557lt c3557lt2;
        C4123wJ c4123wJ = (C4123wJ) this.f24783n;
        if (c4123wJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        C3557lt c3557lt3 = (C3557lt) this.f24785v;
        if (c3557lt3 == null || (c3557lt = (C3557lt) this.f24786w) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        C3557lt c3557lt4 = (C3557lt) this.f24784u;
        if (c3557lt4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        C3557lt c3557lt5 = (C3557lt) this.f24787x;
        if (c3557lt5 == null || (c3557lt2 = (C3557lt) this.f24788y) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        C3557lt c3557lt6 = (C3557lt) this.f24789z;
        if (c3557lt6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c4123wJ.f35593b.f35286b;
        BigInteger bigInteger2 = (BigInteger) c3557lt3.f32643u;
        if (!bigInteger2.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger3 = (BigInteger) c3557lt.f32643u;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger2.multiply(bigInteger3).equals(c4123wJ.f35594c)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger subtract = bigInteger2.subtract(bigInteger4);
        BigInteger subtract2 = bigInteger3.subtract(bigInteger4);
        if (!bigInteger.multiply((BigInteger) c3557lt4.f32643u).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger4)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3557lt5.f32643u).mod(subtract).equals(bigInteger4)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) c3557lt2.f32643u).mod(subtract2).equals(bigInteger4)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger3.multiply((BigInteger) c3557lt6.f32643u).mod(bigInteger2).equals(bigInteger4)) {
            return new C4069vJ((C4123wJ) this.f24783n, (C3557lt) this.f24785v, (C3557lt) this.f24786w, (C3557lt) this.f24784u, (C3557lt) this.f24787x, (C3557lt) this.f24788y, (C3557lt) this.f24789z);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    public void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        B3 b32;
        C3676o3 c3676o3;
        char c9;
        char c10;
        char c11;
        int i6;
        C4107w3 c4107w3;
        ArrayList arrayList;
        B3 b33;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C4269z3 c4269z3;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z6 = true;
        C4256yr c4256yr = new C4256yr(bArr, i + i4);
        c4256yr.d(i);
        while (true) {
            int b9 = c4256yr.b();
            b32 = (B3) this.f24788y;
            if (b9 >= 48 && c4256yr.h(8) == 15) {
                int h3 = c4256yr.h(8);
                int h9 = c4256yr.h(16);
                int h10 = c4256yr.h(16);
                int c12 = c4256yr.c() + h10;
                if (h10 * 8 > c4256yr.b()) {
                    AbstractC2991bG.y("DvbParser", "Data field length exceeds limit");
                    c4256yr.f(c4256yr.b());
                } else {
                    switch (h3) {
                        case 16:
                            if (h9 == b32.f24578a) {
                                C3944t2 c3944t2 = b32.i;
                                c4256yr.h(8);
                                int h11 = c4256yr.h(4);
                                int h12 = c4256yr.h(2);
                                c4256yr.f(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i18 = h10 - 2; i18 > 0; i18 -= 6) {
                                    int h13 = c4256yr.h(8);
                                    c4256yr.f(8);
                                    sparseArray.put(h13, new C4215y3(c4256yr.h(16), c4256yr.h(16)));
                                }
                                C3944t2 c3944t22 = new C3944t2(h11, h12, sparseArray);
                                if (h12 != 0) {
                                    b32.i = c3944t22;
                                    b32.f24580c.clear();
                                    b32.f24581d.clear();
                                    b32.f24582e.clear();
                                    break;
                                } else if (c3944t2 != null && c3944t2.f34977n != h11) {
                                    b32.i = c3944t22;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C3944t2 c3944t23 = b32.i;
                            if (h9 == b32.f24578a && c3944t23 != null) {
                                int h14 = c4256yr.h(8);
                                c4256yr.f(4);
                                boolean g9 = c4256yr.g();
                                c4256yr.f(3);
                                int h15 = c4256yr.h(16);
                                int h16 = c4256yr.h(16);
                                c4256yr.h(3);
                                int h17 = c4256yr.h(3);
                                c4256yr.f(2);
                                int h18 = c4256yr.h(8);
                                int h19 = c4256yr.h(8);
                                int h20 = c4256yr.h(4);
                                int h21 = c4256yr.h(2);
                                c4256yr.f(2);
                                int i19 = h10 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i19 > 0) {
                                    int h22 = c4256yr.h(16);
                                    int h23 = c4256yr.h(2);
                                    c4256yr.h(2);
                                    int h24 = c4256yr.h(12);
                                    c4256yr.f(4);
                                    int h25 = c4256yr.h(12);
                                    int i20 = i19 - 6;
                                    if (h23 == 1 || h23 == 2) {
                                        c4256yr.h(8);
                                        c4256yr.h(8);
                                        i19 -= 8;
                                    } else {
                                        i19 = i20;
                                    }
                                    sparseArray2.put(h22, new A3(h24, h25));
                                }
                                C4269z3 c4269z32 = new C4269z3(h14, g9, h15, h16, h17, h18, h19, h20, h21, sparseArray2);
                                SparseArray sparseArray3 = b32.f24580c;
                                if (c3944t23.f34978u == 0 && (c4269z3 = (C4269z3) sparseArray3.get(h14)) != null) {
                                    int i21 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c4269z3.f36060j;
                                        if (i21 < sparseArray4.size()) {
                                            c4269z32.f36060j.put(sparseArray4.keyAt(i21), (A3) sparseArray4.valueAt(i21));
                                            i21++;
                                        }
                                    }
                                }
                                sparseArray3.put(c4269z32.f36052a, c4269z32);
                                break;
                            }
                            break;
                        case 18:
                            if (h9 == b32.f24578a) {
                                C4053v3 c13 = c(c4256yr, h10);
                                b32.f24581d.put(c13.f35404a, c13);
                                break;
                            } else if (h9 == b32.f24579b) {
                                C4053v3 c14 = c(c4256yr, h10);
                                b32.f24583f.put(c14.f35404a, c14);
                                break;
                            }
                            break;
                        case 19:
                            if (h9 == b32.f24578a) {
                                C4161x3 d9 = d(c4256yr);
                                b32.f24582e.put(d9.f35717a, d9);
                                break;
                            } else if (h9 == b32.f24579b) {
                                C4161x3 d10 = d(c4256yr);
                                b32.f24584g.put(d10.f35717a, d10);
                                break;
                            }
                            break;
                        case 20:
                            if (h9 == b32.f24578a) {
                                c4256yr.f(4);
                                boolean g10 = c4256yr.g();
                                c4256yr.f(3);
                                int h26 = c4256yr.h(16);
                                int h27 = c4256yr.h(16);
                                if (g10) {
                                    int h28 = c4256yr.h(16);
                                    int h29 = c4256yr.h(16);
                                    int h30 = c4256yr.h(16);
                                    i14 = h29;
                                    i15 = c4256yr.h(16);
                                    i17 = h30;
                                    i16 = h28;
                                } else {
                                    i14 = h26;
                                    i15 = h27;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                b32.f24585h = new C4107w3(h26, h27, i16, i14, i17, i15);
                                break;
                            }
                            break;
                    }
                    c4256yr.l(c12 - c4256yr.c());
                }
            }
        }
        C3944t2 c3944t24 = b32.i;
        if (c3944t24 == null) {
            PB pb = RB.f27933u;
            c3676o3 = new C3676o3(C3523lC.f32525x, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b);
        } else {
            C4107w3 c4107w32 = b32.f24585h;
            if (c4107w32 == null) {
                c4107w32 = (C4107w3) this.f24786w;
            }
            Bitmap bitmap = (Bitmap) this.f24789z;
            Canvas canvas = (Canvas) this.f24785v;
            if (bitmap == null || c4107w32.f35557a + 1 != bitmap.getWidth() || c4107w32.f35558b + 1 != ((Bitmap) this.f24789z).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c4107w32.f35557a + 1, c4107w32.f35558b + 1, Bitmap.Config.ARGB_8888);
                this.f24789z = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i22 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c3944t24.f34979v;
                if (i22 < sparseArray5.size()) {
                    canvas.save();
                    C4215y3 c4215y3 = (C4215y3) sparseArray5.valueAt(i22);
                    C4269z3 c4269z33 = (C4269z3) b32.f24580c.get(sparseArray5.keyAt(i22));
                    int i23 = c4215y3.f35870a + c4107w32.f35559c;
                    int i24 = c4215y3.f35871b + c4107w32.f35561e;
                    int i25 = c4269z33.f36054c;
                    int i26 = i23 + i25;
                    int min = Math.min(i26, c4107w32.f35560d);
                    boolean z9 = z6;
                    int i27 = c4269z33.f36055d;
                    int i28 = i24 + i27;
                    canvas.clipRect(i23, i24, min, Math.min(i28, c4107w32.f35562f));
                    SparseArray sparseArray6 = b32.f24581d;
                    int i29 = c4269z33.f36057f;
                    C4053v3 c4053v3 = (C4053v3) sparseArray6.get(i29);
                    if (c4053v3 == null && (c4053v3 = (C4053v3) b32.f24583f.get(i29)) == null) {
                        c4053v3 = (C4053v3) this.f24787x;
                    }
                    C3944t2 c3944t25 = c3944t24;
                    int i30 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c4269z33.f36060j;
                        int i31 = i22;
                        if (i30 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i30);
                            A3 a32 = (A3) sparseArray7.valueAt(i30);
                            Canvas canvas2 = canvas;
                            C4161x3 c4161x3 = (C4161x3) b32.f24582e.get(keyAt);
                            if (c4161x3 == null) {
                                c4161x3 = (C4161x3) b32.f24584g.get(keyAt);
                            }
                            C4161x3 c4161x32 = c4161x3;
                            if (c4161x32 != null) {
                                Paint paint = c4161x32.f35718b ? null : (Paint) this.f24783n;
                                b33 = b32;
                                int i32 = a32.f24402a + i23;
                                int i33 = a32.f24403b + i24;
                                int i34 = i23;
                                int i35 = c4269z33.f36056e;
                                i13 = i30;
                                Paint paint2 = paint;
                                int i36 = i24;
                                int[] iArr = i35 == 3 ? c4053v3.f35407d : i35 == 2 ? c4053v3.f35406c : c4053v3.f35405b;
                                i10 = i34;
                                arrayList = arrayList2;
                                i11 = i25;
                                i9 = i36;
                                c4107w3 = c4107w32;
                                i12 = i26;
                                k(c4161x32.f35719c, iArr, i35, i32, i33, paint2, canvas2);
                                k(c4161x32.f35720d, iArr, i35, i32, i33 + 1, paint2, canvas2);
                            } else {
                                c4107w3 = c4107w32;
                                arrayList = arrayList2;
                                b33 = b32;
                                i9 = i24;
                                i10 = i23;
                                i11 = i25;
                                i12 = i26;
                                i13 = i30;
                            }
                            i30 = i13 + 1;
                            i23 = i10;
                            i26 = i12;
                            i25 = i11;
                            i24 = i9;
                            canvas = canvas2;
                            i22 = i31;
                            b32 = b33;
                            arrayList2 = arrayList;
                            c4107w32 = c4107w3;
                        } else {
                            C4107w3 c4107w33 = c4107w32;
                            ArrayList arrayList3 = arrayList2;
                            B3 b34 = b32;
                            Canvas canvas3 = canvas;
                            int i37 = i24;
                            int i38 = i23;
                            int i39 = i25;
                            int i40 = i26;
                            float f2 = i37;
                            float f9 = i38;
                            if (c4269z33.f36053b) {
                                int i41 = c4269z33.f36056e;
                                if (i41 == 3) {
                                    i6 = c4053v3.f35407d[c4269z33.f36058g];
                                    c11 = 2;
                                } else {
                                    c11 = 2;
                                    i6 = i41 == 2 ? c4053v3.f35406c[c4269z33.f36059h] : c4053v3.f35405b[c4269z33.i];
                                }
                                Paint paint3 = (Paint) this.f24784u;
                                paint3.setColor(i6);
                                float f10 = i40;
                                c10 = c11;
                                c9 = 3;
                                canvas = canvas3;
                                canvas.drawRect(f9, f2, f10, i28, paint3);
                            } else {
                                canvas = canvas3;
                                c9 = 3;
                                c10 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.f24789z, i38, i37, i39, i27);
                            float f11 = c4107w33.f35557a;
                            float f12 = c4107w33.f35558b;
                            arrayList3.add(new C4302zj(null, null, null, createBitmap2, f2 / f12, 0, 0, f9 / f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i39 / f11, i27 / f12, Integer.MIN_VALUE, 0.0f, 0));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            arrayList2 = arrayList3;
                            b32 = b34;
                            c4107w32 = c4107w33;
                            i22 = i31 + 1;
                            z6 = z9;
                            c3944t24 = c3944t25;
                        }
                    }
                } else {
                    c3676o3 = new C3676o3(arrayList2, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b);
                }
            }
        }
        bVar.mo9a(c3676o3);
    }

    public /* synthetic */ C3(boolean z6) {
        this.f24783n = null;
        this.f24784u = null;
        this.f24785v = null;
        this.f24786w = null;
        this.f24787x = null;
        this.f24788y = null;
        this.f24789z = null;
    }

    public C3() {
        this.f24788y = new s.k();
        this.f24789z = new s.k();
    }

    public C3(Context context, String str, s2.F0 f02, AbstractC4801a abstractC4801a) {
        this.f24788y = new BinderC3487kd();
        this.f24784u = context;
        this.f24785v = str;
        this.f24786w = f02;
        this.f24787x = abstractC4801a;
        this.f24789z = s2.e1.f40429a;
    }

    public C3(C3754pa c3754pa, WebView webView, String str, String str2, Tv tv) {
        this.f24785v = new ArrayList();
        this.f24786w = new HashMap();
        this.f24783n = c3754pa;
        this.f24784u = webView;
        this.f24789z = tv;
        this.f24788y = str;
        this.f24787x = str2;
    }
}
