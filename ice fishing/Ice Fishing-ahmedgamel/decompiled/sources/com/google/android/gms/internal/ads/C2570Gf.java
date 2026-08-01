package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import l.C4648e;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4816f;
import p2.C4835j;
import q2.C4900p;
import q2.C4920z0;
import q2.InterfaceC4870a;
import r2.InterfaceC4950c;
import t2.C5037e;
import t2.InterfaceC5033a;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Gf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2570Gf implements InterfaceC3433k, InterfaceC3868s3, KD, InterfaceC3575mg, InterfaceC3014c9, InterfaceC2844Wl {

    /* renamed from: y, reason: collision with root package name */
    public static C2570Gf f25040y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25041n;

    /* renamed from: u, reason: collision with root package name */
    public Object f25042u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25043v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25044w;

    /* renamed from: x, reason: collision with root package name */
    public Object f25045x;

    public C2570Gf(Context context, T2.a aVar, C5069B c5069b, C2621Jf c2621Jf) {
        this.f25041n = 0;
        this.f25042u = aVar;
        C3351iN a9 = C3351iN.a(context);
        C3351iN a10 = C3351iN.a(c5069b);
        this.f25043v = C3243gN.a(new C2502Cf(a9, a10, 0));
        C3351iN a11 = C3351iN.a(aVar);
        C3243gN a12 = C3243gN.a(new C2536Ef(a11, a10, C3351iN.a(c2621Jf), 0));
        this.f25044w = a12;
        this.f25045x = C3243gN.a(new C2689Nf(a9, new C2553Ff(a11, a12, 0), 0));
    }

    public static final boolean C(Context context) {
        if (((Boolean) AbstractC2817Va.f28200c.r()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        k8.b I8 = u2.D.I(context);
        return ((String) I8.f38707u).toLowerCase(Locale.ROOT).equals(com.anythink.expressad.video.dynview.a.a.Y);
    }

    public static C2570Gf d(Reader reader, Bundle bundle) {
        try {
            try {
                return new C2570Gf(new JsonReader(reader), bundle);
            } finally {
                T2.b.c(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e9) {
            throw new Vt("unable to parse ServerResponse", e9);
        }
    }

    public static synchronized C2570Gf o(Context context) {
        synchronized (C2570Gf.class) {
            try {
                C2570Gf c2570Gf = f25040y;
                if (c2570Gf != null) {
                    return c2570Gf;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC3569ma.a(applicationContext);
                C4835j c4835j = C4835j.f39733C;
                C5069B g4 = c4835j.f39743h.g();
                g4.k(applicationContext);
                applicationContext.getClass();
                T2.a aVar = c4835j.f39745k;
                aVar.getClass();
                C2621Jf c2621Jf = c4835j.f39759y;
                AbstractC3341iD.l(C2621Jf.class, c2621Jf);
                C2570Gf c2570Gf2 = new C2570Gf(applicationContext, aVar, g4, c2621Jf);
                f25040y = c2570Gf2;
                SharedPreferencesOnSharedPreferenceChangeListenerC2485Bf sharedPreferencesOnSharedPreferenceChangeListenerC2485Bf = (SharedPreferencesOnSharedPreferenceChangeListenerC2485Bf) ((C3243gN) c2570Gf2.f25043v).f();
                SharedPreferences sharedPreferences = sharedPreferencesOnSharedPreferenceChangeListenerC2485Bf.f23915b;
                sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2485Bf);
                sharedPreferencesOnSharedPreferenceChangeListenerC2485Bf.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
                C3301ha c3301ha = AbstractC3569ma.f32261h1;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC2485Bf.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC2485Bf.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
                }
                C2672Mf c2672Mf = (C2672Mf) ((C3243gN) f25040y.f25045x).f();
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32204b1)).booleanValue()) {
                    HashMap P8 = u2.D.P((String) rVar.f40210c.a(AbstractC3569ma.f32214c1));
                    Iterator it = P8.keySet().iterator();
                    while (it.hasNext()) {
                        c2672Mf.a((String) it.next());
                    }
                    C2655Lf c2655Lf = new C2655Lf(c2672Mf, P8);
                    synchronized (c2672Mf) {
                        c2672Mf.f26301b.add(c2655Lf);
                    }
                }
                return f25040y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String A() {
        int i = ((EnumC2960b8) this.f25045x).f29227n;
        return D.y.m(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public void B(int i, N3.a aVar) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
            aVar.a(new LD(0, aVar, new G1.a(this, i)), (C3360ig) this.f25042u);
        }
    }

    public String D() {
        int i = ((EnumC2960b8) this.f25045x).f29227n;
        return D.y.m(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a */
    public void mo7a(Object obj) {
        InterfaceC2867Yc interfaceC2867Yc = (InterfaceC2867Yc) obj;
        u2.z.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f25043v;
        C3467kg c3467kg = (C3467kg) this.f25044w;
        C2835Wc c2835Wc = (C2835Wc) this.f25042u;
        C3196fd c3196fd = (C3196fd) this.f25045x;
        c3196fd.getClass();
        try {
            u2.D d2 = C4835j.f39733C.f39738c;
            String uuid = UUID.randomUUID().toString();
            AbstractC3195fc.f30260j.a(uuid, new C3142ed(c2835Wc, c3196fd, c3467kg));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", ((InterfaceC2982bd) c3196fd.f30278d).n(obj2));
            String str = (String) c3196fd.f30276b;
            InterfaceC2669Mc interfaceC2669Mc = (InterfaceC2669Mc) interfaceC2867Yc;
            interfaceC2669Mc.getClass();
            interfaceC2669Mc.c(str, jSONObject.toString());
        } catch (Exception e9) {
            try {
                c3467kg.c(e9);
                int i = u2.z.f41322b;
                v2.i.d("Unable to invokeJavascript", e9);
            } finally {
                c2835Wc.s();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014c9
    public void b(Z9 z9) {
        C3175f9 c3175f9 = (C3175f9) ((C2925aa) z9.f27721u).C().s();
        c3175f9.h();
        ((C3229g9) c3175f9.f27721u).B((EnumC3121e9) this.f25042u);
        z9.h();
        ((C2925aa) z9.f27721u).H((C3229g9) c3175f9.j());
        W9 w9 = (W9) ((C2925aa) z9.f27721u).A().s();
        w9.h();
        ((X9) w9.f27721u).B((String) this.f25043v);
        C4036v9 c4036v9 = (C4036v9) this.f25044w;
        w9.h();
        ((X9) w9.f27721u).C(c4036v9);
        z9.h();
        ((C2925aa) z9.f27721u).G((X9) w9.j());
        z9.h();
        ((C2925aa) z9.f27721u).B((String) this.f25045x);
    }

    public C3089dd c(Context context, C5110a c5110a, Wu wu) {
        C3089dd c3089dd;
        String str;
        synchronized (this.f25043v) {
            try {
                if (((C3089dd) this.f25045x) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (C(context)) {
                        str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32212c);
                    } else {
                        str = (String) AbstractC2772Sd.f27507y.r();
                    }
                    this.f25045x = new C3089dd(applicationContext, c5110a, str, wu);
                }
                c3089dd = (C3089dd) this.f25045x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3089dd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        boolean j22;
        try {
            int ordinal = ((k2.b) this.f25044w).ordinal();
            InterfaceC2721Pd interfaceC2721Pd = (InterfaceC2721Pd) this.f25043v;
            if (ordinal == 1) {
                j22 = interfaceC2721Pd.j2(new W2.b(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        j22 = interfaceC2721Pd.Q0(new W2.b(context));
                    }
                    throw new C2828Vl("Adapter failed to show.");
                }
                j22 = interfaceC2721Pd.f3(new W2.b(context));
            }
            if (j22) {
                C2507Ck c2507Ck = (C2507Ck) this.f25045x;
                if (c2507Ck == null) {
                    return;
                }
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.d2)).booleanValue() || ((St) this.f25042u).Y != 2) {
                    return;
                }
                c2507Ck.t();
                return;
            }
            throw new C2828Vl("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C2828Vl(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f25042u;
    }

    public FD g(Object obj, Bundle bundle) {
        Su g4 = Su.g((Context) this.f25042u, 8);
        g4.c();
        Set<Ps> set = (Set) this.f25043v;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        C3301ha c3301ha = AbstractC3569ma.hd;
        q2.r rVar = q2.r.f40207e;
        boolean isEmpty = ((String) rVar.f40210c.a(c3301ha)).isEmpty();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (!isEmpty) {
            arrayList2 = Arrays.asList(((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).split(","));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.J2)).booleanValue() && bundle != null) {
            C4835j.f39733C.f39745k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", currentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", currentTimeMillis);
            }
        }
        for (Ps ps : set) {
            if (!arrayList2.contains(String.valueOf(ps.f()))) {
                C4835j.f39733C.f39745k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                N3.a c9 = ps.c();
                c9.a(new RunnableC2807Ug(this, elapsedRealtime, ps, bundle2), AbstractC3413jg.f31275h);
                arrayList.add(c9);
            }
        }
        RB n9 = RB.n(arrayList);
        CallableC2861Xm callableC2861Xm = new CallableC2861Xm(arrayList, obj, bundle, bundle2, 2);
        FD fd = new FD(n9, true, false);
        fd.f24757I = new ED(fd, callableC2861Xm, (RD) this.f25044w);
        fd.w();
        if (Wu.a()) {
            AbstractC2772Sd.G(fd, (Vu) this.f25045x, g4, false);
        }
        return fd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    public void h(byte[] bArr, int i, int i6, X1.b bVar) {
        int i9;
        C4279zj c4279zj;
        int i10;
        int i11;
        Cr cr;
        int O8;
        int i12 = 128;
        Cr cr2 = (Cr) this.f25042u;
        cr2.z(i + i6, bArr);
        cr2.E(i);
        if (((Inflater) this.f25045x) == null) {
            this.f25045x = new Inflater();
        }
        Inflater inflater = (Inflater) this.f25045x;
        Cr cr3 = (Cr) this.f25043v;
        if (AbstractC3159eu.i(cr2, cr3, inflater)) {
            cr2.z(cr3.f24254c, cr3.f24252a);
        }
        D3 d32 = (D3) this.f25044w;
        int i13 = 0;
        d32.f24323d = 0;
        d32.f24324e = 0;
        d32.f24325f = 0;
        d32.f24326g = 0;
        d32.f24327h = 0;
        d32.i = 0;
        Cr cr4 = d32.f24320a;
        cr4.y(0);
        d32.f24322c = false;
        ArrayList arrayList = new ArrayList();
        while (cr2.B() >= 3) {
            int i14 = cr2.f24254c;
            int K7 = cr2.K();
            int L6 = cr2.L();
            int i15 = cr2.f24253b + L6;
            if (i15 > i14) {
                cr2.E(i14);
                i9 = i12;
                i10 = i13;
                c4279zj = null;
            } else {
                int[] iArr = d32.f24321b;
                if (K7 != i12) {
                    switch (K7) {
                        case 20:
                            if (L6 % 5 != 2) {
                                cr = cr2;
                            } else {
                                cr2.G(2);
                                Arrays.fill(iArr, i13);
                                int i16 = L6 / 5;
                                int i17 = i13;
                                while (i17 < i16) {
                                    int K8 = cr2.K();
                                    int K9 = cr2.K();
                                    int K10 = cr2.K();
                                    double d2 = K9;
                                    int K11 = cr2.K() - 128;
                                    int K12 = cr2.K() << 24;
                                    String str = AbstractC3159eu.f29993a;
                                    double d9 = K10 - 128;
                                    double d10 = K11;
                                    iArr[K8] = (Math.max(0, Math.min((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), com.anythink.basead.exoplayer.k.p.f8473b)) << 8) | K12 | (Math.max(0, Math.min((int) ((1.402d * d9) + d2), com.anythink.basead.exoplayer.k.p.f8473b)) << 16) | Math.max(0, Math.min((int) ((d10 * 1.772d) + d2), com.anythink.basead.exoplayer.k.p.f8473b));
                                    i17++;
                                    cr2 = cr2;
                                }
                                cr = cr2;
                                d32.f24322c = true;
                            }
                            cr2 = cr;
                            i9 = 128;
                            c4279zj = null;
                            i10 = 0;
                            break;
                        case 21:
                            if (L6 >= 4) {
                                cr2.G(3);
                                int i18 = L6 - 4;
                                if ((cr2.K() & i12) != 0) {
                                    if (i18 >= 7 && (O8 = cr2.O()) >= 4) {
                                        d32.f24327h = cr2.L();
                                        d32.i = cr2.L();
                                        cr4.y(O8 - 4);
                                        i18 = L6 - 11;
                                    }
                                }
                                int i19 = cr4.f24253b;
                                int i20 = cr4.f24254c;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    cr2.H(cr4.f24252a, i19, min);
                                    cr4.E(i19 + min);
                                }
                            }
                            i9 = i12;
                            i10 = i13;
                            c4279zj = null;
                            break;
                        case 22:
                            if (L6 >= 19) {
                                d32.f24323d = cr2.L();
                                d32.f24324e = cr2.L();
                                cr2.G(11);
                                d32.f24325f = cr2.L();
                                d32.f24326g = cr2.L();
                            }
                            i9 = i12;
                            i10 = i13;
                            c4279zj = null;
                            break;
                        default:
                            i9 = i12;
                            i10 = i13;
                            c4279zj = null;
                            break;
                    }
                } else {
                    Cr cr5 = cr2;
                    if (d32.f24323d == 0 || d32.f24324e == 0 || d32.f24327h == 0 || d32.i == 0 || (i11 = cr4.f24254c) == 0 || cr4.f24253b != i11 || !d32.f24322c) {
                        i9 = 128;
                        c4279zj = null;
                    } else {
                        cr4.E(0);
                        int i21 = d32.f24327h * d32.i;
                        int[] iArr2 = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int K13 = cr4.K();
                            if (K13 != 0) {
                                iArr2[i22] = iArr[K13];
                                i22++;
                            } else {
                                int K14 = cr4.K();
                                if (K14 != 0) {
                                    int i23 = K14 & 63;
                                    if ((K14 & 64) != 0) {
                                        i23 = (i23 << 8) | cr4.K();
                                    }
                                    int i24 = (K14 & 128) == 0 ? iArr[0] : iArr[cr4.K()];
                                    int i25 = i22 + i23;
                                    Arrays.fill(iArr2, i22, i25, i24);
                                    i22 = i25;
                                }
                            }
                        }
                        i9 = 128;
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, d32.f24327h, d32.i, Bitmap.Config.ARGB_8888);
                        float f3 = d32.f24325f;
                        float f9 = d32.f24323d;
                        float f10 = f3 / f9;
                        float f11 = d32.f24326g;
                        float f12 = d32.f24324e;
                        c4279zj = new C4279zj(null, null, null, createBitmap, f11 / f12, 0, 0, f10, 0, Integer.MIN_VALUE, -3.4028235E38f, d32.f24327h / f9, d32.i / f12, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i10 = 0;
                    d32.f24323d = 0;
                    d32.f24324e = 0;
                    d32.f24325f = 0;
                    d32.f24326g = 0;
                    d32.f24327h = 0;
                    d32.i = 0;
                    cr4.y(0);
                    d32.f24322c = false;
                    cr2 = cr5;
                }
                cr2.E(i15);
            }
            if (c4279zj != null) {
                arrayList.add(c4279zj);
            }
            i12 = i9;
            i13 = i10;
        }
        bVar.mo10a(new C3653o3(arrayList, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b));
    }

    public void i(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f25042u = Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r10 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(C3013c8 c3013c8, V2 v22) {
        boolean z3;
        C3228g8 r9;
        C3228g8 r10;
        boolean z6;
        String A9 = c3013c8.A().A();
        byte[] a9 = c3013c8.B().a();
        byte[] a10 = c3013c8.C().a();
        if (!TextUtils.isEmpty(A9) && a10.length != 0) {
            File file = (File) this.f25043v;
            MA.N(file);
            file.mkdirs();
            MA.y(A9, file).mkdirs();
            File c9 = MA.c(A9, "pcam.jar", file);
            if ((a9.length <= 0 || MA.u(c9, a9)) && MA.u(MA.c(A9, "pcbc", file), a10)) {
                File c10 = MA.c(c3013c8.A().A(), "pcam.jar", file);
                if (c10.exists() && v22 != null) {
                    try {
                        z6 = Bw.a(c10);
                    } catch (GeneralSecurityException unused) {
                        z6 = false;
                    }
                }
                String A10 = c3013c8.A().A();
                if (!TextUtils.isEmpty(A10)) {
                    File c11 = MA.c(A10, "pcam.jar", file);
                    File c12 = MA.c(A10, "pcbc", file);
                    File c13 = MA.c(A10, "pcam.jar", v());
                    File c14 = MA.c(A10, "pcbc", v());
                    if ((!c11.exists() || c11.renameTo(c13)) && c12.exists() && c12.renameTo(c14)) {
                        C3174f8 H8 = C3228g8.H();
                        String A11 = c3013c8.A().A();
                        H8.h();
                        ((C3228g8) H8.f27721u).J(A11);
                        String B9 = c3013c8.A().B();
                        H8.h();
                        ((C3228g8) H8.f27721u).K(B9);
                        long D8 = c3013c8.A().D();
                        H8.h();
                        ((C3228g8) H8.f27721u).M(D8);
                        long E8 = c3013c8.A().E();
                        H8.h();
                        ((C3228g8) H8.f27721u).N(E8);
                        long C8 = c3013c8.A().C();
                        H8.h();
                        ((C3228g8) H8.f27721u).L(C8);
                        C3228g8 c3228g8 = (C3228g8) H8.j();
                        C3228g8 r11 = r(1);
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f25044w).edit();
                        if (r11 != null && !c3228g8.A().equals(r11.A())) {
                            edit.putString(A(), T2.b.b(r11.b()));
                        }
                        edit.putString(D(), T2.b.b(c3228g8.b()));
                        if (edit.commit()) {
                            z3 = true;
                            HashSet hashSet = new HashSet();
                            r9 = r(1);
                            if (r9 != null) {
                                hashSet.add(r9.A());
                            }
                            r10 = r(2);
                            if (r10 != null) {
                                hashSet.add(r10.A());
                            }
                            for (File file2 : v().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    MA.N(MA.y(name, v()));
                                }
                            }
                            return z3;
                        }
                    }
                }
                z3 = false;
                HashSet hashSet2 = new HashSet();
                r9 = r(1);
                if (r9 != null) {
                }
                r10 = r(2);
                if (r10 != null) {
                }
                while (r4 < r1) {
                }
                return z3;
            }
        }
        return false;
    }

    public C3089dd m(Context context, C5110a c5110a, Wu wu) {
        C3089dd c3089dd;
        String str;
        synchronized (this.f25042u) {
            try {
                if (((C3089dd) this.f25044w) == null) {
                    if (C(context)) {
                        str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32212c);
                    } else if (((Boolean) AbstractC2817Va.f28205h.r()).booleanValue()) {
                        str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32192a);
                    } else {
                        str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32202b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f25044w = new C3089dd(context, c5110a, str, wu);
                }
                c3089dd = (C3089dd) this.f25044w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3089dd;
    }

    /* JADX WARN: Removed duplicated region for block: B:295:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0806 A[Catch: all -> 0x07d3, TryCatch #3 {all -> 0x07d3, blocks: (B:334:0x0790, B:338:0x07c1, B:347:0x07c7, B:341:0x07f2, B:343:0x0806, B:351:0x07d6, B:353:0x07e2, B:354:0x07e7, B:355:0x0814), top: B:333:0x0790, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b A[Catch: JSONException -> 0x00ae, TryCatch #7 {JSONException -> 0x00ae, blocks: (B:18:0x004c, B:34:0x00b5, B:48:0x00f3, B:52:0x010b, B:54:0x0111, B:59:0x011a, B:75:0x00ab), top: B:17:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b3  */
    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo11n(Object obj) {
        boolean z3;
        Intent parseUri;
        q2.r rVar;
        boolean z6;
        boolean z9;
        String str;
        boolean z10;
        String str2;
        String str3;
        Bundle O8;
        InterfaceC4950c a9;
        C3525lk c3525lk;
        Uri data;
        Vu vu;
        C2692Ni c2692Ni;
        char c9;
        int i;
        int hashCode;
        q2.g1 g1Var;
        int i6 = 0;
        int i9 = 1;
        switch (this.f25041n) {
            case 6:
                boolean z11 = false;
                String str4 = (String) obj;
                C3301ha c3301ha = AbstractC3569ma.wb;
                q2.r rVar2 = q2.r.f40207e;
                if (((Boolean) rVar2.f40210c.a(c3301ha)).booleanValue()) {
                    ((Map) this.f25042u).put("u", str4);
                }
                C3625nc c3625nc = (C3625nc) this.f25045x;
                InterfaceC4870a interfaceC4870a = (InterfaceC4870a) this.f25043v;
                Map map = (Map) this.f25042u;
                String str5 = (String) this.f25044w;
                c3625nc.getClass();
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) interfaceC4870a;
                St K7 = interfaceC4061vh.K();
                Ut A02 = interfaceC4061vh.A0();
                String str6 = "";
                if (K7 == null || A02 == null) {
                    z3 = false;
                } else {
                    str6 = A02.f28004b;
                    z3 = K7.b();
                }
                boolean z12 = (((Boolean) rVar2.f40210c.a(AbstractC3569ma.ec)).booleanValue() && map.containsKey(com.anythink.expressad.f.a.b.bI) && ((String) map.get(com.anythink.expressad.f.a.b.bI)).equals("0")) ? false : true;
                boolean z13 = ((Boolean) rVar2.f40210c.a(AbstractC3569ma.je)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
                if ("expand".equalsIgnoreCase(str5)) {
                    if (interfaceC4061vh.H0()) {
                        int i10 = u2.z.f41322b;
                        v2.i.f("Cannot expand WebView that is already expanded.");
                        return;
                    } else {
                        c3625nc.i(false);
                        interfaceC4061vh.I0(C3625nc.a(map), "1".equals(map.get("custom_close")), z12);
                        return;
                    }
                }
                if ("webapp".equalsIgnoreCase(str5)) {
                    c3625nc.i(false);
                    boolean z14 = ((Boolean) rVar2.f40210c.a(AbstractC3569ma.rd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
                    if (str4 != null) {
                        interfaceC4061vh.O0("1".equals(map.get("custom_close")), C3625nc.a(map), str4, z12, z14);
                        return;
                    } else {
                        interfaceC4061vh.h0("1".equals(map.get("custom_close")), C3625nc.a(map), (String) map.get(com.onesignal.inAppMessages.internal.d.HTML), (String) map.get("baseurl"), z12);
                        return;
                    }
                }
                boolean z15 = z12;
                if ("chrome_custom_tab".equalsIgnoreCase(str5)) {
                    Context context = interfaceC4061vh.getContext();
                    if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32028G5)).booleanValue()) {
                        u2.z.k("User opt out chrome custom tab.");
                        c3625nc.j(10);
                    } else {
                        if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32430z5)).booleanValue()) {
                            String b9 = AbstractC4816f.b(context);
                            if (b9 != null && !context.getPackageName().equals(b9)) {
                                z11 = true;
                            }
                        } else {
                            z11 = C4108wa.a(context);
                        }
                        if (z11) {
                            boolean z16 = z13;
                            boolean z17 = z3;
                            String str7 = str6;
                            c3625nc.i(true);
                            if (TextUtils.isEmpty(str4)) {
                                int i11 = u2.z.f41322b;
                                v2.i.f("Cannot open browser with null or empty url");
                                c3625nc.j(7);
                                return;
                            }
                            Uri c10 = C3625nc.c(C3625nc.b(interfaceC4061vh.getContext(), interfaceC4061vh.R0(), Uri.parse(str4), interfaceC4061vh.V(), interfaceC4061vh.j(), interfaceC4061vh.f0()));
                            if (z17 && c3625nc.f32744x != null && c3625nc.f(interfaceC4870a, interfaceC4061vh.getContext(), c10.toString(), str7)) {
                                return;
                            }
                            c3625nc.f32738B = new C3463kc(c3625nc);
                            String uri = c10.toString();
                            InterfaceC5033a interfaceC5033a = c3625nc.f32738B;
                            Bundle bundle = new Bundle();
                            if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32019F5)).booleanValue()) {
                                if (map.containsKey("cct_init_h")) {
                                    try {
                                        bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                                    } catch (NumberFormatException e9) {
                                        u2.z.l("Invalid cct initial height parameter.", e9);
                                        C4835j.f39733C.f39743h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e9);
                                    }
                                }
                                if (map.containsKey("cct_bp")) {
                                    try {
                                        bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                                    } catch (NumberFormatException e10) {
                                        u2.z.l("Invalid cct close button position parameter.", e10);
                                        C4835j.f39733C.f39743h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e10);
                                    }
                                }
                            }
                            interfaceC4061vh.g1(new C5037e(null, uri, null, null, null, null, null, null, new W2.b(interfaceC5033a), true, bundle), z15, z16, str7);
                            return;
                        }
                        c3625nc.j(4);
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    c3625nc.h(interfaceC4870a, map, z3, str6, z15, z13);
                    return;
                }
                boolean z18 = z13;
                boolean z19 = z3;
                String str8 = str6;
                if ("app".equalsIgnoreCase(str5) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    c3625nc.h(interfaceC4870a, map, z19, str8, z15, z18);
                    return;
                }
                if ("open_app".equalsIgnoreCase(str5)) {
                    if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.t9)).booleanValue()) {
                        c3625nc.i(true);
                        String str9 = (String) map.get("p");
                        if (str9 == null) {
                            int i12 = u2.z.f41322b;
                            v2.i.f("Package name missing from open app action.");
                            return;
                        }
                        if (z19 && c3625nc.f32744x != null && c3625nc.f(interfaceC4870a, interfaceC4061vh.getContext(), str9, str8)) {
                            return;
                        }
                        PackageManager packageManager = interfaceC4061vh.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i13 = u2.z.f41322b;
                            v2.i.f("Cannot get package manager from open app action.");
                            return;
                        } else {
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str9);
                            if (launchIntentForPackage != null) {
                                interfaceC4061vh.g1(new C5037e(launchIntentForPackage, c3625nc.f32738B), z15, z18, str8);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                c3625nc.i(true);
                String str10 = (String) map.get("intent_url");
                if (!TextUtils.isEmpty(str10)) {
                    try {
                        parseUri = Intent.parseUri(str10, 0);
                    } catch (URISyntaxException e11) {
                        String valueOf = String.valueOf(str10);
                        int i14 = u2.z.f41322b;
                        v2.i.d("Error parsing the url: ".concat(valueOf), e11);
                    }
                    if (parseUri != null && parseUri.getData() != null) {
                        data = parseUri.getData();
                        if (!Uri.EMPTY.equals(data)) {
                            Uri c11 = C3625nc.c(C3625nc.b(interfaceC4061vh.getContext(), interfaceC4061vh.R0(), data, interfaceC4061vh.V(), interfaceC4061vh.j(), interfaceC4061vh.f0()));
                            if (!TextUtils.isEmpty(parseUri.getType())) {
                                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.u9)).booleanValue()) {
                                    parseUri.setDataAndType(c11, parseUri.getType());
                                }
                            }
                            parseUri.setData(c11);
                        }
                    }
                    C3301ha c3301ha2 = AbstractC3569ma.P9;
                    rVar = q2.r.f40207e;
                    z6 = !((Boolean) rVar.f40210c.a(c3301ha2)).booleanValue() && "intent_async".equalsIgnoreCase(str5) && map.containsKey("event_id");
                    if (((Boolean) rVar.f40210c.a(AbstractC3569ma.oe)).booleanValue() || (c3525lk = c3625nc.f32746z) == null) {
                        z9 = z19;
                        str = str4;
                    } else {
                        synchronized (c3525lk.f31838n) {
                            int i15 = c3525lk.f31840v.f27582E0;
                            if (i15 <= 0 || c3525lk.f31836A) {
                                z9 = z19;
                                str = str4;
                            } else {
                                C3536lv c3536lv = c3525lk.f31844z;
                                z9 = z19;
                                c3525lk.f31841w.getClass();
                                str = str4;
                                long currentTimeMillis = System.currentTimeMillis();
                                c3536lv.h();
                                ((C3590mv) c3536lv.f27721u).C(currentTimeMillis);
                                c3525lk.f31836A = true;
                                c3525lk.f31843y.schedule(new RunnableC3470kj(4, c3525lk), i15, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                    if (((Boolean) rVar.f40210c.a(AbstractC3569ma.qe)).booleanValue() && c3625nc.f32737A != null && map.get("hf") != null && ((String) map.get("hf")).equals("2") && map.get("hstp") != null) {
                        try {
                            String str11 = (String) map.get("hstp");
                            str2 = (String) map.get("hsr");
                            str3 = (String) map.get("hseqp");
                            boolean equals = ((String) map.getOrDefault("hsat", "false")).equals("true");
                            if (str2 != null && str3 != null) {
                                if (!TextUtils.isEmpty(str3)) {
                                    try {
                                        O8 = A8.b.O(new JSONObject(str3));
                                    } catch (JSONException e12) {
                                        int i16 = u2.z.f41322b;
                                        if (v2.i.j(4)) {
                                            Log.i("Ads", "Failed to parse extra query params", e12);
                                        }
                                        C4835j.f39733C.f39743h.d("OpenGmsgHandler.parseHsdpExtraQueryParams", e12);
                                    }
                                    C3311hk c3311hk = c3625nc.f32737A;
                                    Context context2 = ((InterfaceC4061vh) interfaceC4870a).getContext();
                                    BinderC3517lc binderC3517lc = new BinderC3517lc(c3625nc, str8);
                                    a9 = c3311hk.a(context2);
                                    if (a9 != null) {
                                        a9.open(new W2.b(context2), str11, str2, O8, equals, binderC3517lc);
                                        return;
                                    }
                                    return;
                                }
                                O8 = null;
                                C3311hk c3311hk2 = c3625nc.f32737A;
                                Context context22 = ((InterfaceC4061vh) interfaceC4870a).getContext();
                                BinderC3517lc binderC3517lc2 = new BinderC3517lc(c3625nc, str8);
                                a9 = c3311hk2.a(context22);
                                if (a9 != null) {
                                }
                            }
                            u2.z.k("HSDP service parameters missing.");
                        } catch (Throwable th) {
                            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.te)).booleanValue()) {
                                C2501Ce.c(interfaceC4061vh.getContext()).e("HsdpServiceUnsampled.invokeOpen", th);
                            } else {
                                C2501Ce.a(interfaceC4061vh.getContext()).e("HsdpService.invokeOpen", th);
                            }
                        }
                    }
                    HashMap hashMap = new HashMap();
                    if (z6) {
                        z10 = z15;
                    } else {
                        C3571mc c3571mc = new C3571mc(c3625nc, z15, interfaceC4870a, hashMap, map);
                        c3625nc = c3625nc;
                        interfaceC4870a = interfaceC4870a;
                        map = map;
                        c3625nc.f32738B = c3571mc;
                        z10 = false;
                    }
                    if (parseUri == null) {
                        if (!z9 || c3625nc.f32744x == null || !c3625nc.f(interfaceC4870a, interfaceC4061vh.getContext(), parseUri.getData().toString(), str8)) {
                            interfaceC4061vh.g1(new C5037e(parseUri, c3625nc.f32738B), z10, z18, str8);
                            return;
                        } else {
                            if (z6) {
                                hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                                ((InterfaceC2652Lc) interfaceC4870a).d("openIntentAsync", hashMap);
                                return;
                            }
                            return;
                        }
                    }
                    String uri2 = !TextUtils.isEmpty(str) ? C3625nc.c(C3625nc.b(interfaceC4061vh.getContext(), interfaceC4061vh.R0(), Uri.parse(str), interfaceC4061vh.V(), interfaceC4061vh.j(), interfaceC4061vh.f0())).toString() : str;
                    if (!z9 || c3625nc.f32744x == null || !c3625nc.f(interfaceC4870a, interfaceC4061vh.getContext(), uri2, str8)) {
                        interfaceC4061vh.g1(new C5037e((String) map.get("i"), uri2, (String) map.get(com.anythink.expressad.f.a.b.dI), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), c3625nc.f32738B), z10, z18, str8);
                        return;
                    } else {
                        if (z6) {
                            hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                            ((InterfaceC2652Lc) interfaceC4870a).d("openIntentAsync", hashMap);
                            return;
                        }
                        return;
                    }
                }
                parseUri = null;
                if (parseUri != null) {
                    data = parseUri.getData();
                    if (!Uri.EMPTY.equals(data)) {
                    }
                }
                C3301ha c3301ha22 = AbstractC3569ma.P9;
                rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha22)).booleanValue()) {
                }
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.oe)).booleanValue()) {
                }
                z9 = z19;
                str = str4;
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.qe)).booleanValue()) {
                    String str112 = (String) map.get("hstp");
                    str2 = (String) map.get("hsr");
                    str3 = (String) map.get("hseqp");
                    boolean equals2 = ((String) map.getOrDefault("hsat", "false")).equals("true");
                    if (str2 != null) {
                        if (!TextUtils.isEmpty(str3)) {
                        }
                        O8 = null;
                        C3311hk c3311hk22 = c3625nc.f32737A;
                        Context context222 = ((InterfaceC4061vh) interfaceC4870a).getContext();
                        BinderC3517lc binderC3517lc22 = new BinderC3517lc(c3625nc, str8);
                        a9 = c3311hk22.a(context222);
                        if (a9 != null) {
                        }
                    }
                    u2.z.k("HSDP service parameters missing.");
                }
                HashMap hashMap2 = new HashMap();
                if (z6) {
                }
                if (parseUri == null) {
                }
                break;
            case 9:
                ((C2657Lh) this.f25045x).t((Map) obj, (List) this.f25042u, (String) this.f25043v);
                return;
            case 10:
                ((C2692Ni) this.f25045x).f26515e.a(new RunnableC3865s0(6, (C4237yv) this.f25042u, (String) obj, (C4648e) this.f25044w));
                return;
            case 14:
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) obj;
                St st = (St) this.f25042u;
                interfaceC4061vh2.Z0(st, (Ut) this.f25043v);
                C2657Lh g02 = interfaceC4061vh2.g0();
                C3301ha c3301ha3 = AbstractC3569ma.zb;
                q2.r rVar3 = q2.r.f40207e;
                if (((Boolean) rVar3.f40210c.a(c3301ha3)).booleanValue() && g02 != null) {
                    C3959tn c3959tn = (C3959tn) this.f25045x;
                    C2800Tp c2800Tp = c3959tn.i;
                    C4237yv c4237yv = c3959tn.f34394j;
                    C2692Ni c2692Ni2 = (C2692Ni) this.f25044w;
                    g02.x(c2692Ni2, c2800Tp, c4237yv);
                    g02.y(c2692Ni2, c3959tn.i, c3959tn.f34389d);
                }
                if (!((Boolean) rVar3.f40210c.a(AbstractC3569ma.Ee)).booleanValue() || g02 == null) {
                    return;
                }
                C2621Jf c2621Jf = C4835j.f39733C.f39759y;
                C2555Fh c2555Fh = g02.f26152n;
                if (c2621Jf.a(c2555Fh.getContext())) {
                    g02.c("/logScionEvent");
                    new HashMap();
                    g02.b("/logScionEvent", new C3088dc(i9, c2555Fh.getContext(), st.f27649w0));
                    return;
                }
                return;
            case 20:
                C3696ot c3696ot = (C3696ot) this.f25045x;
                C3524lj c3524lj = (C3524lj) obj;
                synchronized (c3696ot) {
                    if (c3524lj != null) {
                        try {
                            c3524lj.b();
                        } finally {
                        }
                    }
                    if (c3696ot.f32973m) {
                        c3696ot.c();
                    }
                    if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu = (Vu) this.f25042u) == null) {
                        Wu wu = c3696ot.i;
                        Su su = (Su) this.f25043v;
                        su.j(c3524lj.f24833a.f28754b);
                        su.m(c3524lj.f24838f.f33698n);
                        su.a(true);
                        wu.b(su.q());
                    } else {
                        vu.e(c3524lj.f24833a.f28754b);
                        vu.g(c3524lj.f24838f.f33698n);
                        Su su2 = (Su) this.f25043v;
                        su2.a(true);
                        vu.a(su2);
                        vu.h();
                    }
                }
                return;
            case 22:
                String str12 = (String) obj;
                InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) this.f25042u;
                St K8 = interfaceC4061vh3.K();
                if (K8 != null && !K8.f27622i0) {
                    C4648e c4648e = K8.f27651x0;
                    if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.vb)).booleanValue() || (c2692Ni = (C2692Ni) this.f25043v) == null || !C2692Ni.b(str12)) {
                        ((C4237yv) this.f25044w).b(str12, c4648e, null, null);
                        return;
                    }
                    C4237yv c4237yv2 = (C4237yv) this.f25044w;
                    Random random = C4900p.f40199g.f40204e;
                    if (TextUtils.isEmpty(str12)) {
                        return;
                    }
                    N3.a s9 = QC.s(c2692Ni.c(str12, c2692Ni.f26514d.f26171a, random), ((Integer) r5.f40210c.a(AbstractC3569ma.Ib)).intValue(), TimeUnit.MILLISECONDS, c2692Ni.f26517g);
                    s9.a(new LD(i6, s9, new C2570Gf(c2692Ni, c4237yv2, str12, c4648e)), c2692Ni.f26515e);
                    return;
                }
                Ut A03 = interfaceC4061vh3.A0();
                if (A03 == null) {
                    C4835j.f39733C.f39743h.d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                boolean z20 = false;
                C4835j c4835j = C4835j.f39733C;
                c4835j.f39745k.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                boolean i17 = c4835j.f39743h.i(interfaceC4061vh3.getContext());
                boolean z21 = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32257g7)).booleanValue() && K8 != null && K8.f27599S;
                if (K8 != null && K8.f27613d0 != null) {
                    z20 = true;
                }
                C3709p5 c3709p5 = new C3709p5(A03.f28004b, str12, (i17 || z21 || z20) ? 2 : 1, currentTimeMillis2);
                C2800Tp c2800Tp2 = (C2800Tp) this.f25045x;
                c2800Tp2.getClass();
                c2800Tp2.a(new S0.l(14, c2800Tp2, c3709p5));
                return;
            default:
                v2.k kVar = (v2.k) obj;
                C4237yv c4237yv3 = (C4237yv) this.f25045x;
                Su su3 = (Su) this.f25042u;
                if (su3 != null) {
                    su3.a(kVar == v2.k.f41418n);
                    Vu vu2 = (Vu) this.f25043v;
                    if (vu2 == null) {
                        c4237yv3.f35245f.b(su3.q());
                    } else {
                        vu2.a(su3);
                        vu2.h();
                    }
                }
                C2779Sk c2779Sk = (C2779Sk) this.f25044w;
                if (c2779Sk == null) {
                    return;
                }
                String str13 = c4237yv3.f35243d.f41425v;
                if (TextUtils.isEmpty(str13)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str13);
                    String optString = jSONObject.optString("type");
                    String optString2 = jSONObject.optString(com.anythink.core.common.k.f14296T);
                    String optString3 = jSONObject.optString("currency");
                    long optLong = jSONObject.optLong("value", 0L);
                    int hashCode2 = optString.hashCode();
                    char c12 = 65535;
                    if (hashCode2 == 66934) {
                        if (optString.equals("CPC")) {
                            c9 = 1;
                            if (c9 != 0) {
                            }
                            long j6 = optLong;
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            g1Var = new q2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j6);
                            if (com.bumptech.glide.d.q((C3052cu) c2779Sk.f27543x.f28753a.f31863u) == 1) {
                            }
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                        }
                        long j62 = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        g1Var = new q2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j62);
                        if (com.bumptech.glide.d.q((C3052cu) c2779Sk.f27543x.f28753a.f31863u) == 1) {
                        }
                    } else {
                        if (hashCode2 != 66944) {
                            if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                                c9 = 2;
                                if (c9 != 0) {
                                    i = 1;
                                } else if (c9 == 1) {
                                    i = 2;
                                } else if (c9 != 2) {
                                    i = 0;
                                } else {
                                    optLong /= 1000;
                                    i = 3;
                                }
                                long j622 = optLong;
                                hashCode = optString2.hashCode();
                                if (hashCode == -2131980260) {
                                    if (hashCode != 399232571) {
                                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                            c12 = 1;
                                        }
                                    } else if (optString2.equals("PRECISE")) {
                                        c12 = 2;
                                    }
                                } else if (optString2.equals("ESTIMATED")) {
                                    c12 = 0;
                                }
                                g1Var = new q2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j622);
                                if ((com.bumptech.glide.d.q((C3052cu) c2779Sk.f27543x.f28753a.f31863u) == 1) && c2779Sk.f27541v.f27577B0 && c2779Sk.f27542w.compareAndSet(false, true)) {
                                    c2779Sk.M1(new C3694or(18, g1Var));
                                    return;
                                }
                                return;
                            }
                            c9 = 65535;
                            if (c9 != 0) {
                            }
                            long j6222 = optLong;
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            g1Var = new q2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j6222);
                            if (com.bumptech.glide.d.q((C3052cu) c2779Sk.f27543x.f28753a.f31863u) == 1) {
                                c2779Sk.M1(new C3694or(18, g1Var));
                                return;
                            }
                            return;
                        }
                        if (optString.equals("CPM")) {
                            c9 = 0;
                            if (c9 != 0) {
                            }
                            long j62222 = optLong;
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            g1Var = new q2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j62222);
                            if (com.bumptech.glide.d.q((C3052cu) c2779Sk.f27543x.f28753a.f31863u) == 1) {
                            }
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                        }
                        long j622222 = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        g1Var = new q2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j622222);
                        if (com.bumptech.glide.d.q((C3052cu) c2779Sk.f27543x.f28753a.f31863u) == 1) {
                        }
                    }
                } catch (JSONException e13) {
                    C4835j.f39733C.f39743h.d("UrlPinger.pingUrl", e13);
                    return;
                }
                break;
        }
    }

    public void p(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f25043v = Integer.valueOf(i);
    }

    public synchronized void q(AbstractC3171f5 abstractC3171f5) {
        try {
            HashMap hashMap = (HashMap) this.f25042u;
            String d2 = abstractC3171f5.d();
            List list = (List) hashMap.remove(d2);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (AbstractC3439k5.f31377a) {
                AbstractC3439k5.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), d2);
            }
            AbstractC3171f5 abstractC3171f52 = (AbstractC3171f5) list.remove(0);
            hashMap.put(d2, list);
            synchronized (abstractC3171f52.f30046x) {
                abstractC3171f52.f30040D = this;
            }
            try {
                ((PriorityBlockingQueue) this.f25044w).put(abstractC3171f52);
            } catch (InterruptedException e9) {
                AbstractC3439k5.c("Couldn't add request to queue. %s", e9.toString());
                Thread.currentThread().interrupt();
                X4 x42 = (X4) this.f25043v;
                x42.f28482w = true;
                x42.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3228g8 r(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f25044w;
        String string = i == 1 ? sharedPreferences.getString(D(), null) : sharedPreferences.getString(A(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] j6 = T2.b.j(string);
                C3228g8 F8 = C3228g8.F(JK.s(j6, 0, j6.length));
                String A9 = F8.A();
                File c9 = MA.c(A9, "pcam.jar", v());
                if (!c9.exists()) {
                    c9 = MA.c(A9, "pcam", v());
                }
                File c10 = MA.c(A9, "pcbc", v());
                if (c9.exists()) {
                    if (c10.exists()) {
                        return F8;
                    }
                }
            } catch (C3295hL unused) {
            }
        }
        return null;
    }

    public void s() {
        this.f25044w = 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3433k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3500lC t(int i, A8 a82, int[] iArr) {
        boolean z3;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        Point point;
        int i13;
        A8 a83 = a82;
        int i14 = ((int[]) this.f25044w)[i];
        Point point2 = (Point) this.f25045x;
        C3327i c3327i = (C3327i) this.f25042u;
        int i15 = point2 != null ? point2.x : c3327i.f25689e;
        int i16 = point2 != null ? point2.y : c3327i.f25690f;
        boolean z6 = c3327i.f25692h;
        if (i15 == Integer.MAX_VALUE) {
            z3 = true;
            i6 = Integer.MAX_VALUE;
        } else if (i16 == Integer.MAX_VALUE) {
            i6 = Integer.MAX_VALUE;
            z3 = true;
        } else {
            int i17 = Integer.MAX_VALUE;
            for (int i18 = 0; i18 < a83.f23635a; i18++) {
                DP dp = a83.f23638d[i18];
                int i19 = dp.f24438v;
                if (i19 > 0 && (i10 = dp.f24439w) > 0) {
                    if (z6) {
                        if ((i19 > i10) != (i15 > i16)) {
                            i12 = i16;
                            i11 = i15;
                            if (i19 * i11 < i10 * i12) {
                                String str = AbstractC3159eu.f29993a;
                                point = new Point(i12, ((r12 + i19) - 1) / i19);
                            } else {
                                String str2 = AbstractC3159eu.f29993a;
                                point = new Point(((r9 + i10) - 1) / i10, i11);
                            }
                            i13 = i19 * i10;
                            if (i19 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i13 < i17) {
                                i17 = i13;
                            }
                        }
                    }
                    i11 = i16;
                    i12 = i15;
                    if (i19 * i11 < i10 * i12) {
                    }
                    i13 = i19 * i10;
                    if (i19 >= ((int) (point.x * 0.98f))) {
                        i17 = i13;
                    }
                }
            }
            z3 = true;
            i6 = i17;
        }
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i20 = 0;
        int i21 = 0;
        while (i20 < a83.f23635a) {
            DP dp2 = a83.f23638d[i20];
            int i22 = dp2.f24438v;
            int i23 = (i22 == -1 || (i9 = dp2.f24439w) == -1) ? -1 : i22 * i9;
            C3595n c3595n = new C3595n(i, a83, i20, c3327i, iArr[i20], (String) this.f25043v, (i6 == Integer.MAX_VALUE || (i23 != -1 && i23 <= i6)) ? z3 : false);
            int length = objArr.length;
            int i24 = i21 + 1;
            int d2 = MB.d(length, i24);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i21] = c3595n;
            i20++;
            i21 = i24;
            a83 = a82;
        }
        return RB.p(objArr, i21);
    }

    public synchronized boolean u(AbstractC3171f5 abstractC3171f5) {
        try {
            HashMap hashMap = (HashMap) this.f25042u;
            String d2 = abstractC3171f5.d();
            if (!hashMap.containsKey(d2)) {
                hashMap.put(d2, null);
                synchronized (abstractC3171f5.f30046x) {
                    abstractC3171f5.f30040D = this;
                }
                if (AbstractC3439k5.f31377a) {
                    AbstractC3439k5.b("new request, sending to network %s", d2);
                }
                return false;
            }
            List list = (List) hashMap.get(d2);
            if (list == null) {
                list = new ArrayList();
            }
            abstractC3171f5.a("waiting-for-response");
            list.add(abstractC3171f5);
            hashMap.put(d2, list);
            if (AbstractC3439k5.f31377a) {
                AbstractC3439k5.b("Request for cacheKey=%s is in flight, putting on hold.", d2);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File v() {
        File file = new File((File) this.f25042u, Integer.toString(((EnumC2960b8) this.f25045x).f29227n));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Vu vu;
        int i;
        switch (this.f25041n) {
            case 6:
                C4835j.f39733C.f39743h.d("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 9:
                String valueOf = String.valueOf((Uri) this.f25044w);
                int i6 = u2.z.f41322b;
                v2.i.f("Failed to parse gmsg params for: ".concat(valueOf));
                return;
            case 10:
                ((C2692Ni) this.f25045x).f26515e.a(new RunnableC2823Vg(this, th, (C4237yv) this.f25042u, (String) this.f25043v, (C4648e) this.f25044w));
                return;
            case 14:
                return;
            case 20:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32045I6)).booleanValue()) {
                    u2.z.l("Banner ad failed to load", th);
                }
                C3696ot c3696ot = (C3696ot) this.f25045x;
                synchronized (c3696ot) {
                    C3577mi c3577mi = (C3577mi) this.f25044w;
                    C4920z0 t6 = SK.t(th, ((C2710Oj) c3577mi.f32456I0.f()).f26649l);
                    c3696ot.f32974n = t6;
                    ((C4118wk) c3577mi.f32558y0.f()).v(t6);
                    AbstractC2968bG.h(t6.f40213n, "BannerAdLoader.onFailure", th);
                    if (c3696ot.f32973m) {
                        c3696ot.e();
                        C2875Yk c2875Yk = c3696ot.f32969h;
                        C3418jl c3418jl = c3696ot.f32970j;
                        synchronized (c3418jl) {
                            i = c3418jl.f31310n;
                        }
                        c2875Yk.Q1(i);
                    }
                    if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu = (Vu) this.f25042u) == null) {
                        Wu wu = c3696ot.i;
                        Su su = (Su) this.f25043v;
                        su.h(t6);
                        su.d(th);
                        su.a(false);
                        wu.b(su.q());
                    } else {
                        vu.f(t6);
                        Su su2 = (Su) this.f25043v;
                        su2.d(th);
                        su2.a(false);
                        vu.a(su2);
                        vu.h();
                    }
                }
                return;
            case 22:
                return;
            default:
                Su su3 = (Su) this.f25042u;
                if (su3 == null) {
                    return;
                }
                su3.a(false);
                Vu vu2 = (Vu) this.f25043v;
                if (vu2 == null) {
                    ((C4237yv) this.f25045x).f35245f.b(su3.q());
                    return;
                } else {
                    vu2.a(su3);
                    vu2.h();
                    return;
                }
        }
    }

    public C2626Jk x(Set set) {
        return new C2626Jk(set);
    }

    public BE y() {
        C3105du c3105du;
        C3240gK b9;
        GE ge = (GE) this.f25042u;
        if (ge == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        C3105du c3105du2 = (C3105du) this.f25043v;
        if (c3105du2 == null || (c3105du = (C3105du) this.f25044w) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (ge.f24954a != ((C3240gK) c3105du2.f29859u).f30559a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ge.f24955b != ((C3240gK) c3105du.f29859u).f30559a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ge.a() && ((Integer) this.f25045x) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((GE) this.f25042u).a() && ((Integer) this.f25045x) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3556mE c3556mE = ((GE) this.f25042u).f24958e;
        if (c3556mE == C3556mE.f31913A) {
            b9 = AbstractC3344iG.f31018a;
        } else if (c3556mE == C3556mE.f31929z) {
            b9 = AbstractC3344iG.a(((Integer) this.f25045x).intValue());
        } else {
            if (c3556mE != C3556mE.f31928y) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((GE) this.f25042u).f24958e)));
            }
            b9 = AbstractC3344iG.b(((Integer) this.f25045x).intValue());
        }
        return new BE((GE) this.f25042u, (C3105du) this.f25043v, (C3105du) this.f25044w, b9, (Integer) this.f25045x);
    }

    public JE z() {
        Integer num = (Integer) this.f25042u;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f25043v) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f25044w) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = ((Integer) this.f25043v).intValue();
        ((Integer) this.f25044w).getClass();
        return new JE(intValue, intValue2, (C3879sE) this.f25045x);
    }

    public C2570Gf(Context context, RD rd, Set set, Vu vu) {
        this.f25041n = 19;
        this.f25042u = context;
        this.f25044w = rd;
        this.f25043v = set;
        this.f25045x = vu;
    }

    public C2570Gf(Context context, ExecutorService executorService, Cw cw, Hw hw) {
        this.f25041n = 24;
        this.f25042u = context;
        this.f25043v = executorService;
        this.f25044w = cw;
    }

    public C2570Gf(View view, InterfaceC4061vh interfaceC4061vh, InterfaceC2540Ej interfaceC2540Ej, Tt tt) {
        this.f25041n = 11;
        this.f25043v = view;
        this.f25045x = interfaceC4061vh;
        this.f25042u = interfaceC2540Ej;
        this.f25044w = tt;
    }

    public C2570Gf(St st, InterfaceC2721Pd interfaceC2721Pd, k2.b bVar) {
        this.f25041n = 17;
        this.f25045x = null;
        this.f25042u = st;
        this.f25043v = interfaceC2721Pd;
        this.f25044w = bVar;
    }

    public /* synthetic */ C2570Gf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f25041n = i;
        this.f25042u = obj;
        this.f25043v = obj2;
        this.f25044w = obj3;
        this.f25045x = obj4;
    }

    public C2570Gf(int i) {
        this.f25041n = i;
        switch (i) {
            case 7:
                this.f25042u = new Object();
                this.f25043v = new Object();
                break;
            case 28:
                this.f25042u = null;
                this.f25043v = null;
                this.f25044w = null;
                this.f25045x = null;
                break;
            case 29:
                this.f25042u = null;
                this.f25043v = null;
                this.f25044w = null;
                this.f25045x = C3879sE.f33915j;
                break;
            default:
                this.f25042u = new Cr();
                this.f25043v = new Cr();
                this.f25044w = new D3();
                break;
        }
    }

    public C2570Gf(Context context, EnumC2960b8 enumC2960b8) {
        this.f25041n = 25;
        this.f25044w = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        MA.G(dir, false);
        this.f25042u = dir;
        File dir2 = context.getDir("tmppccache", 0);
        MA.G(dir2, true);
        this.f25043v = dir2;
        this.f25045x = enumC2960b8;
    }

    public C2570Gf(Context context, String str) {
        String packageName;
        this.f25041n = 5;
        this.f25044w = context;
        this.f25045x = str;
        this.f25042u = (String) AbstractC2968bG.f29254C.r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25043v = linkedHashMap;
        linkedHashMap.put(com.anythink.core.common.s.f16249a, "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C4835j c4835j = C4835j.f39733C;
        u2.D d2 = c4835j.f39738c;
        linkedHashMap.put("device", u2.D.O());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != u2.D.f(context) ? "0" : "1");
        Qx qx = c4835j.f39750p;
        qx.getClass();
        N3.a b9 = AbstractC3413jg.f31268a.b(new C2.x(context, qx));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C2789Te) b9.get()).f27754j));
            linkedHashMap.put("network_fine", Integer.toString(((C2789Te) b9.get()).f27755k));
        } catch (Exception e9) {
            C4835j.f39733C.f39743h.d("CsiConfiguration.CsiConfiguration", e9);
        }
        C3301ha c3301ha = AbstractC3569ma.Kc;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f25043v;
            u2.D d9 = C4835j.f39733C.f39738c;
            linkedHashMap2.put("is_bstar", true != u2.D.d(context) ? "0" : "1");
        }
        C3301ha c3301ha2 = AbstractC3569ma.La;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32216c3)).booleanValue()) {
            C4835j c4835j2 = C4835j.f39733C;
            if (SK.n(c4835j2.f39743h.f29523g)) {
                return;
            }
            ((LinkedHashMap) this.f25043v).put("plugin", c4835j2.f39743h.f29523g);
        }
    }

    private final void k(Throwable th) {
    }

    private final void l(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C2570Gf(JsonReader jsonReader, Bundle bundle) {
        this.f25041n = 21;
        this.f25045x = bundle;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.J2)).booleanValue() && bundle != null) {
            C4835j.f39733C.f39745k.getClass();
            bundle.putLong("server-response-parse-start", System.currentTimeMillis());
        }
        ?? r02 = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        Ut ut = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        r02 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            r02.add(new St(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals(com.anythink.core.common.m.e.Y)) {
                        ut = new Ut(jsonReader);
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32057K2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", ut.f28020s);
                            bundle.putLong("normalize-ad-response-end", ut.f28021t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = A8.b.J(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new Xt(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f25044w = arrayList;
        this.f25042u = r02;
        this.f25043v = ut == null ? new Ut(new JsonReader(new StringReader("{}"))) : ut;
    }

    public C2570Gf(X4 x42, PriorityBlockingQueue priorityBlockingQueue, Ux ux) {
        this.f25041n = 4;
        this.f25042u = new HashMap();
        this.f25045x = ux;
        this.f25043v = x42;
        this.f25044w = priorityBlockingQueue;
    }

    public C2570Gf(C3625nc c3625nc, Map map, InterfaceC4870a interfaceC4870a, String str) {
        this.f25041n = 6;
        this.f25042u = map;
        this.f25043v = interfaceC4870a;
        this.f25044w = str;
        Objects.requireNonNull(c3625nc);
        this.f25045x = c3625nc;
    }

    public C2570Gf(C3196fd c3196fd, C2835Wc c2835Wc, Object obj, C3467kg c3467kg) {
        this.f25041n = 8;
        this.f25042u = c2835Wc;
        this.f25043v = obj;
        this.f25044w = c3467kg;
        Objects.requireNonNull(c3196fd);
        this.f25045x = c3196fd;
    }

    public C2570Gf(C2657Lh c2657Lh, List list, String str, Uri uri) {
        this.f25041n = 9;
        this.f25042u = list;
        this.f25043v = str;
        this.f25044w = uri;
        Objects.requireNonNull(c2657Lh);
        this.f25045x = c2657Lh;
    }

    public C2570Gf(C2692Ni c2692Ni, C4237yv c4237yv, String str, C4648e c4648e) {
        this.f25041n = 10;
        this.f25042u = c4237yv;
        this.f25043v = str;
        this.f25044w = c4648e;
        Objects.requireNonNull(c2692Ni);
        this.f25045x = c2692Ni;
    }

    public C2570Gf(C3796ql c3796ql) {
        this.f25041n = 26;
        this.f25045x = this;
        this.f25042u = c3796ql;
        C3243gN a9 = C3243gN.a(new C3750pt((C3351iN) c3796ql.f33379b, (C3351iN) c3796ql.f33381d, (C3243gN) c3796ql.f33388l, C3243gN.a(AbstractC2772Sd.f27499H), (C3243gN) c3796ql.f33390n, (C3243gN) c3796ql.i, (C3351iN) c3796ql.f33382e));
        this.f25043v = a9;
        this.f25044w = C3243gN.a(new C3096dk((C3351iN) c3796ql.f33381d, a9, (C3243gN) c3796ql.f33388l, (C3243gN) c3796ql.f33387k, C3243gN.a(AbstractC2639Kg.f25946I), new C3056cy(this), (C3351iN) c3796ql.f33382e, 7));
    }

    public C2570Gf(C3959tn c3959tn, St st, Ut ut, C2692Ni c2692Ni) {
        this.f25041n = 14;
        this.f25042u = st;
        this.f25043v = ut;
        this.f25044w = c2692Ni;
        this.f25045x = c3959tn;
    }

    public C2570Gf(C2996br c2996br, Yt yt, St st, C3477kq c3477kq) {
        this.f25041n = 18;
        this.f25042u = yt;
        this.f25043v = st;
        this.f25044w = c3477kq;
        Objects.requireNonNull(c2996br);
        this.f25045x = c2996br;
    }

    public C2570Gf(C3696ot c3696ot, Vu vu, Su su, C3577mi c3577mi) {
        this.f25041n = 20;
        this.f25042u = vu;
        this.f25043v = su;
        this.f25044w = c3577mi;
        Objects.requireNonNull(c3696ot);
        this.f25045x = c3696ot;
    }

    public C2570Gf(C4237yv c4237yv, Su su, Vu vu, C2779Sk c2779Sk) {
        this.f25041n = 23;
        this.f25042u = su;
        this.f25043v = vu;
        this.f25044w = c2779Sk;
        Objects.requireNonNull(c4237yv);
        this.f25045x = c4237yv;
    }

    public C2570Gf(C3500lC c3500lC, S0.l lVar, S0.s sVar, C2991bm c2991bm) {
        Object obj;
        this.f25041n = 27;
        if (c3500lC != null) {
            obj = RB.n(c3500lC);
        } else {
            PB pb = RB.f27177u;
            obj = C3500lC.f31745x;
        }
        this.f25042u = obj;
        this.f25043v = lVar;
        this.f25044w = sVar;
        this.f25045x = c2991bm;
    }
}
