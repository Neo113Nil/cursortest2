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
import k2.EnumC4631b;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4846f;
import q2.C4907p;
import q2.C4927z0;
import q2.InterfaceC4877a;
import s2.C4997e;
import s2.InterfaceC4993a;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2518Df implements InterfaceC3392j, InterfaceC3774q3, LD, InterfaceC3426jg, Z8, InterfaceC2779Sl {

    /* renamed from: y, reason: collision with root package name */
    public static C2518Df f24451y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24452n;

    /* renamed from: u, reason: collision with root package name */
    public Object f24453u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24454v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24455w;

    /* renamed from: x, reason: collision with root package name */
    public Object f24456x;

    public C2518Df(Context context, S2.a aVar, t2.E e6, C2569Gf c2569Gf) {
        this.f24452n = 0;
        this.f24453u = aVar;
        C4117wN a9 = C4117wN.a(context);
        C4117wN a10 = C4117wN.a(e6);
        this.f24454v = C4009uN.a(new C4288zf(a9, a10, 0));
        C4117wN a11 = C4117wN.a(aVar);
        C4009uN a12 = C4009uN.a(new C2484Bf(a11, a10, C4117wN.a(c2569Gf), 0));
        this.f24455w = a12;
        this.f24456x = C4009uN.a(new C2637Kf(a9, new C2501Cf(a11, a12, 0), 0));
    }

    public static final boolean C(Context context) {
        if (((Boolean) AbstractC2751Ra.f27375c.r()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        S0.c I2 = t2.G.I(context);
        return ((String) I2.f2887v).toLowerCase(Locale.ROOT).equals(com.anythink.expressad.video.dynview.a.a.Y);
    }

    public static C2518Df f(Reader reader, Bundle bundle) {
        try {
            try {
                return new C2518Df(new JsonReader(reader), bundle);
            } finally {
                S2.b.c(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e6) {
            throw new Xt("unable to parse ServerResponse", e6);
        }
    }

    public static synchronized C2518Df p(Context context) {
        synchronized (C2518Df.class) {
            try {
                C2518Df c2518Df = f24451y;
                if (c2518Df != null) {
                    return c2518Df;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC3368ia.a(applicationContext);
                p2.j jVar = p2.j.f39798C;
                t2.E g9 = jVar.f39808h.g();
                g9.k(applicationContext);
                applicationContext.getClass();
                S2.a aVar = jVar.f39810k;
                aVar.getClass();
                C2569Gf c2569Gf = jVar.f39824y;
                AbstractC3137eE.j(C2569Gf.class, c2569Gf);
                C2518Df c2518Df2 = new C2518Df(applicationContext, aVar, g9, c2569Gf);
                f24451y = c2518Df2;
                SharedPreferencesOnSharedPreferenceChangeListenerC4234yf sharedPreferencesOnSharedPreferenceChangeListenerC4234yf = (SharedPreferencesOnSharedPreferenceChangeListenerC4234yf) ((C4009uN) c2518Df2.f24454v).d();
                SharedPreferences sharedPreferences = sharedPreferencesOnSharedPreferenceChangeListenerC4234yf.f35359b;
                sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC4234yf);
                sharedPreferencesOnSharedPreferenceChangeListenerC4234yf.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
                C3151ea c3151ea = AbstractC3368ia.f31680h1;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC4234yf.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC4234yf.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
                }
                C2620Jf c2620Jf = (C2620Jf) ((C4009uN) f24451y.f24456x).d();
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31625b1)).booleanValue()) {
                    HashMap P8 = t2.G.P((String) rVar.f40119c.a(AbstractC3368ia.f31635c1));
                    Iterator it = P8.keySet().iterator();
                    while (it.hasNext()) {
                        c2620Jf.a((String) it.next());
                    }
                    C2603If c2603If = new C2603If(c2620Jf, P8);
                    synchronized (c2620Jf) {
                        c2620Jf.f25782b.add(c2603If);
                    }
                }
                return f24451y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String A() {
        int i = ((X7) this.f24456x).f28615n;
        return D.y.j(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public void B(int i, J3.a aVar) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
            aVar.c(new MD(0, aVar, new G1.a(this, i)), (C3157eg) this.f24453u);
        }
    }

    public String D() {
        int i = ((X7) this.f24456x).f28615n;
        return D.y.j(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.Z8
    public void a(W9 w9) {
        C3023c9 c3023c9 = (C3023c9) ((X9) w9.f30000u).C().s();
        c3023c9.h();
        ((C3078d9) c3023c9.f30000u).B((EnumC2969b9) this.f24453u);
        w9.h();
        ((X9) w9.f30000u).H((C3078d9) c3023c9.j());
        T9 t9 = (T9) ((X9) w9.f30000u).A().s();
        t9.h();
        ((U9) t9.f30000u).B((String) this.f24454v);
        C3887s9 c3887s9 = (C3887s9) this.f24455w;
        t9.h();
        ((U9) t9.f30000u).C(c3887s9);
        w9.h();
        ((X9) w9.f30000u).G((U9) t9.j());
        w9.h();
        ((X9) w9.f30000u).B((String) this.f24456x);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b */
    public void mo5b(Object obj) {
        InterfaceC2787Tc interfaceC2787Tc = (InterfaceC2787Tc) obj;
        t2.C.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f24454v;
        C3320hg c3320hg = (C3320hg) this.f24455w;
        C2753Rc c2753Rc = (C2753Rc) this.f24453u;
        C2889Zc c2889Zc = (C2889Zc) this.f24456x;
        c2889Zc.getClass();
        try {
            t2.G g9 = p2.j.f39798C.f39803c;
            String uuid = UUID.randomUUID().toString();
            AbstractC2935ac.f29218j.a(uuid, new C2872Yc(c2753Rc, c2889Zc, c3320hg));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", ((InterfaceC2838Wc) c2889Zc.f28997d).l(obj2));
            String str = (String) c2889Zc.f28995b;
            InterfaceC2583Hc interfaceC2583Hc = (InterfaceC2583Hc) interfaceC2787Tc;
            interfaceC2583Hc.getClass();
            interfaceC2583Hc.i(str, jSONObject.toString());
        } catch (Exception e6) {
            try {
                c3320hg.b(e6);
                int i = t2.C.f40822b;
                u2.i.d("Unable to invokeJavascript", e6);
            } finally {
                c2753Rc.s();
            }
        }
    }

    public C2855Xc c(Context context, C5107a c5107a, Zu zu) {
        C2855Xc c2855Xc;
        String str;
        synchronized (this.f24454v) {
            try {
                if (((C2855Xc) this.f24456x) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (C(context)) {
                        str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31633c);
                    } else {
                        str = (String) AbstractC3035cL.f29692w.r();
                    }
                    this.f24456x = new C2855Xc(applicationContext, c5107a, str, zu);
                }
                c2855Xc = (C2855Xc) this.f24456x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2855Xc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public Ut d() {
        return (Ut) this.f24453u;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    public void e(byte[] bArr, int i, int i4, X1.b bVar) {
        int i9;
        C2522Dj c2522Dj;
        int i10;
        int i11;
        Lr lr;
        int O8;
        int i12 = 128;
        Lr lr2 = (Lr) this.f24453u;
        lr2.z(i + i4, bArr);
        lr2.E(i);
        if (((Inflater) this.f24456x) == null) {
            this.f24456x = new Inflater();
        }
        Inflater inflater = (Inflater) this.f24456x;
        Lr lr3 = (Lr) this.f24454v;
        if (AbstractC3548lu.i(lr2, lr3, inflater)) {
            lr2.z(lr3.f26235c, lr3.f26233a);
        }
        B3 b32 = (B3) this.f24455w;
        int i13 = 0;
        b32.f23965d = 0;
        b32.f23966e = 0;
        b32.f23967f = 0;
        b32.f23968g = 0;
        b32.f23969h = 0;
        b32.i = 0;
        Lr lr4 = b32.f23962a;
        lr4.y(0);
        b32.f23964c = false;
        ArrayList arrayList = new ArrayList();
        while (lr2.B() >= 3) {
            int i14 = lr2.f26235c;
            int K8 = lr2.K();
            int L8 = lr2.L();
            int i15 = lr2.f26234b + L8;
            if (i15 > i14) {
                lr2.E(i14);
                i9 = i12;
                i10 = i13;
                c2522Dj = null;
            } else {
                int[] iArr = b32.f23963b;
                if (K8 != i12) {
                    switch (K8) {
                        case 20:
                            if (L8 % 5 != 2) {
                                lr = lr2;
                            } else {
                                lr2.G(2);
                                Arrays.fill(iArr, i13);
                                int i16 = L8 / 5;
                                int i17 = i13;
                                while (i17 < i16) {
                                    int K9 = lr2.K();
                                    int K10 = lr2.K();
                                    int K11 = lr2.K();
                                    double d2 = K10;
                                    int K12 = lr2.K() - 128;
                                    int K13 = lr2.K() << 24;
                                    String str = AbstractC3548lu.f32613a;
                                    double d3 = K11 - 128;
                                    double d9 = K12;
                                    iArr[K9] = (Math.max(0, Math.min((int) ((d2 - (0.34414d * d9)) - (d3 * 0.71414d)), com.anythink.basead.exoplayer.k.p.f8630b)) << 8) | K13 | (Math.max(0, Math.min((int) ((1.402d * d3) + d2), com.anythink.basead.exoplayer.k.p.f8630b)) << 16) | Math.max(0, Math.min((int) ((d9 * 1.772d) + d2), com.anythink.basead.exoplayer.k.p.f8630b));
                                    i17++;
                                    lr2 = lr2;
                                }
                                lr = lr2;
                                b32.f23964c = true;
                            }
                            lr2 = lr;
                            i9 = 128;
                            c2522Dj = null;
                            i10 = 0;
                            break;
                        case 21:
                            if (L8 >= 4) {
                                lr2.G(3);
                                int i18 = L8 - 4;
                                if ((lr2.K() & i12) != 0) {
                                    if (i18 >= 7 && (O8 = lr2.O()) >= 4) {
                                        b32.f23969h = lr2.L();
                                        b32.i = lr2.L();
                                        lr4.y(O8 - 4);
                                        i18 = L8 - 11;
                                    }
                                }
                                int i19 = lr4.f26234b;
                                int i20 = lr4.f26235c;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    lr2.H(lr4.f26233a, i19, min);
                                    lr4.E(i19 + min);
                                }
                            }
                            i9 = i12;
                            i10 = i13;
                            c2522Dj = null;
                            break;
                        case 22:
                            if (L8 >= 19) {
                                b32.f23965d = lr2.L();
                                b32.f23966e = lr2.L();
                                lr2.G(11);
                                b32.f23967f = lr2.L();
                                b32.f23968g = lr2.L();
                            }
                            i9 = i12;
                            i10 = i13;
                            c2522Dj = null;
                            break;
                        default:
                            i9 = i12;
                            i10 = i13;
                            c2522Dj = null;
                            break;
                    }
                } else {
                    Lr lr5 = lr2;
                    if (b32.f23965d == 0 || b32.f23966e == 0 || b32.f23969h == 0 || b32.i == 0 || (i11 = lr4.f26235c) == 0 || lr4.f26234b != i11 || !b32.f23964c) {
                        i9 = 128;
                        c2522Dj = null;
                    } else {
                        lr4.E(0);
                        int i21 = b32.f23969h * b32.i;
                        int[] iArr2 = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int K14 = lr4.K();
                            if (K14 != 0) {
                                iArr2[i22] = iArr[K14];
                                i22++;
                            } else {
                                int K15 = lr4.K();
                                if (K15 != 0) {
                                    int i23 = K15 & 63;
                                    if ((K15 & 64) != 0) {
                                        i23 = (i23 << 8) | lr4.K();
                                    }
                                    int i24 = (K15 & 128) == 0 ? iArr[0] : iArr[lr4.K()];
                                    int i25 = i22 + i23;
                                    Arrays.fill(iArr2, i22, i25, i24);
                                    i22 = i25;
                                }
                            }
                        }
                        i9 = 128;
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, b32.f23969h, b32.i, Bitmap.Config.ARGB_8888);
                        float f6 = b32.f23967f;
                        float f9 = b32.f23965d;
                        float f10 = f6 / f9;
                        float f11 = b32.f23968g;
                        float f12 = b32.f23966e;
                        c2522Dj = new C2522Dj(null, null, null, createBitmap, f11 / f12, 0, 0, f10, 0, Integer.MIN_VALUE, -3.4028235E38f, b32.f23969h / f9, b32.i / f12, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i10 = 0;
                    b32.f23965d = 0;
                    b32.f23966e = 0;
                    b32.f23967f = 0;
                    b32.f23968g = 0;
                    b32.f23969h = 0;
                    b32.i = 0;
                    lr4.y(0);
                    b32.f23964c = false;
                    lr2 = lr5;
                }
                lr2.E(i15);
            }
            if (c2522Dj != null) {
                arrayList.add(c2522Dj);
            }
            i12 = i9;
            i13 = i10;
        }
        bVar.mo2b(new C3558m3(arrayList, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3392j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3675oC g(int i, B8 b82, int[] iArr) {
        boolean z8;
        int i4;
        int i9;
        int i10;
        int i11;
        int i12;
        Point point;
        int i13;
        B8 b83 = b82;
        int i14 = ((int[]) this.f24455w)[i];
        Point point2 = (Point) this.f24456x;
        C3286h c3286h = (C3286h) this.f24453u;
        int i15 = point2 != null ? point2.x : c3286h.f26551e;
        int i16 = point2 != null ? point2.y : c3286h.f26552f;
        boolean z9 = c3286h.f26554h;
        if (i15 == Integer.MAX_VALUE) {
            z8 = true;
            i4 = Integer.MAX_VALUE;
        } else if (i16 == Integer.MAX_VALUE) {
            i4 = Integer.MAX_VALUE;
            z8 = true;
        } else {
            int i17 = Integer.MAX_VALUE;
            for (int i18 = 0; i18 < b83.f23997a; i18++) {
                TP tp = b83.f24000d[i18];
                int i19 = tp.f27783v;
                if (i19 > 0 && (i10 = tp.f27784w) > 0) {
                    if (z9) {
                        if ((i19 > i10) != (i15 > i16)) {
                            i12 = i16;
                            i11 = i15;
                            if (i19 * i11 < i10 * i12) {
                                String str = AbstractC3548lu.f32613a;
                                point = new Point(i12, ((r12 + i19) - 1) / i19);
                            } else {
                                String str2 = AbstractC3548lu.f32613a;
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
            z8 = true;
            i4 = i17;
        }
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i20 = 0;
        int i21 = 0;
        while (i20 < b83.f23997a) {
            TP tp2 = b83.f24000d[i20];
            int i22 = tp2.f27783v;
            int i23 = (i22 == -1 || (i9 = tp2.f27784w) == -1) ? -1 : i22 * i9;
            C3500l c3500l = new C3500l(i, b83, i20, c3286h, iArr[i20], (String) this.f24454v, (i4 == Integer.MAX_VALUE || (i23 != -1 && i23 <= i4)) ? z8 : false);
            int length = objArr.length;
            int i24 = i21 + 1;
            int d2 = PB.d(length, i24);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i21] = c3500l;
            i20++;
            i21 = i24;
            b83 = b82;
        }
        return UB.p(objArr, i21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public void h(boolean z8, Context context, C4293zk c4293zk) {
        boolean F22;
        try {
            int ordinal = ((EnumC4631b) this.f24455w).ordinal();
            InterfaceC2669Md interfaceC2669Md = (InterfaceC2669Md) this.f24454v;
            if (ordinal == 1) {
                F22 = interfaceC2669Md.F2(new V2.b(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        F22 = interfaceC2669Md.V2(new V2.b(context));
                    }
                    throw new C2762Rl("Adapter failed to show.");
                }
                F22 = interfaceC2669Md.R1(new V2.b(context));
            }
            if (F22) {
                C2489Bk c2489Bk = (C2489Bk) this.f24456x;
                if (c2489Bk == null) {
                    return;
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.d2)).booleanValue() || ((Ut) this.f24453u).Y != 2) {
                    return;
                }
                c2489Bk.a();
                return;
            }
            throw new C2762Rl("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C2762Rl(th);
        }
    }

    public GD i(Object obj, Bundle bundle) {
        Vu f6 = Vu.f((Context) this.f24453u, 8);
        f6.a();
        Set<Rs> set = (Set) this.f24454v;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        C3151ea c3151ea = AbstractC3368ia.hd;
        q2.r rVar = q2.r.f40116e;
        boolean isEmpty = ((String) rVar.f40119c.a(c3151ea)).isEmpty();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (!isEmpty) {
            arrayList2 = Arrays.asList(((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).split(","));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31467J2)).booleanValue() && bundle != null) {
            p2.j.f39798C.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", currentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", currentTimeMillis);
            }
        }
        for (Rs rs : set) {
            if (!arrayList2.contains(String.valueOf(rs.d()))) {
                p2.j.f39798C.f39810k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                J3.a a9 = rs.a();
                a9.c(new RunnableC2757Rg(this, elapsedRealtime, rs, bundle2), AbstractC3212fg.f30745h);
                arrayList.add(a9);
            }
        }
        UB n9 = UB.n(arrayList);
        CallableC2831Vm callableC2831Vm = new CallableC2831Vm(arrayList, obj, bundle, bundle2, 2);
        GD gd = new GD(n9, true, false);
        gd.f25114I = new FD(gd, callableC2831Vm, (SD) this.f24455w);
        gd.w();
        if (Zu.a()) {
            PA.Q(gd, (Yu) this.f24456x, f6, false);
        }
        return gd;
    }

    public void j(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f24453u = Integer.valueOf(i);
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
    public boolean k(Z7 z72, T2 t22) {
        boolean z8;
        C3077d8 t9;
        C3077d8 t10;
        boolean z9;
        String A8 = z72.A().A();
        byte[] a9 = z72.B().a();
        byte[] a10 = z72.C().a();
        if (!TextUtils.isEmpty(A8) && a10.length != 0) {
            File file = (File) this.f24454v;
            AbstractC2720Pd.K(file);
            file.mkdirs();
            AbstractC2720Pd.x(A8, file).mkdirs();
            File c4 = AbstractC2720Pd.c(A8, "pcam.jar", file);
            if ((a9.length <= 0 || AbstractC2720Pd.t(c4, a9)) && AbstractC2720Pd.t(AbstractC2720Pd.c(A8, "pcbc", file), a10)) {
                File c9 = AbstractC2720Pd.c(z72.A().A(), "pcam.jar", file);
                if (c9.exists() && t22 != null) {
                    try {
                        z9 = Cw.a(c9);
                    } catch (GeneralSecurityException unused) {
                        z9 = false;
                    }
                }
                String A9 = z72.A().A();
                if (!TextUtils.isEmpty(A9)) {
                    File c10 = AbstractC2720Pd.c(A9, "pcam.jar", file);
                    File c11 = AbstractC2720Pd.c(A9, "pcbc", file);
                    File c12 = AbstractC2720Pd.c(A9, "pcam.jar", w());
                    File c13 = AbstractC2720Pd.c(A9, "pcbc", w());
                    if ((!c10.exists() || c10.renameTo(c12)) && c11.exists() && c11.renameTo(c13)) {
                        C3022c8 H6 = C3077d8.H();
                        String A10 = z72.A().A();
                        H6.h();
                        ((C3077d8) H6.f30000u).J(A10);
                        String B8 = z72.A().B();
                        H6.h();
                        ((C3077d8) H6.f30000u).K(B8);
                        long D8 = z72.A().D();
                        H6.h();
                        ((C3077d8) H6.f30000u).M(D8);
                        long E8 = z72.A().E();
                        H6.h();
                        ((C3077d8) H6.f30000u).N(E8);
                        long C7 = z72.A().C();
                        H6.h();
                        ((C3077d8) H6.f30000u).L(C7);
                        C3077d8 c3077d8 = (C3077d8) H6.j();
                        C3077d8 t11 = t(1);
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f24455w).edit();
                        if (t11 != null && !c3077d8.A().equals(t11.A())) {
                            edit.putString(A(), S2.b.b(t11.b()));
                        }
                        edit.putString(D(), S2.b.b(c3077d8.b()));
                        if (edit.commit()) {
                            z8 = true;
                            HashSet hashSet = new HashSet();
                            t9 = t(1);
                            if (t9 != null) {
                                hashSet.add(t9.A());
                            }
                            t10 = t(2);
                            if (t10 != null) {
                                hashSet.add(t10.A());
                            }
                            for (File file2 : w().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    AbstractC2720Pd.K(AbstractC2720Pd.x(name, w()));
                                }
                            }
                            return z8;
                        }
                    }
                }
                z8 = false;
                HashSet hashSet2 = new HashSet();
                t9 = t(1);
                if (t9 != null) {
                }
                t10 = t(2);
                if (t10 != null) {
                }
                while (r4 < r1) {
                }
                return z8;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:295:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b A[Catch: JSONException -> 0x00ae, TryCatch #4 {JSONException -> 0x00ae, blocks: (B:18:0x004c, B:34:0x00b5, B:48:0x00f3, B:52:0x010b, B:54:0x0111, B:59:0x011a, B:75:0x00ab), top: B:17:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b3  */
    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7l(Object obj) {
        boolean z8;
        Intent parseUri;
        q2.r rVar;
        boolean z9;
        boolean z10;
        String str;
        boolean z11;
        C3484kk c3484kk;
        Uri data;
        Yu yu;
        C2657Li c2657Li;
        char c4;
        int i;
        int hashCode;
        q2.h1 h1Var;
        int i4 = 0;
        int i9 = 1;
        switch (this.f24452n) {
            case 6:
                boolean z12 = false;
                String str2 = (String) obj;
                C3151ea c3151ea = AbstractC3368ia.wb;
                q2.r rVar2 = q2.r.f40116e;
                if (((Boolean) rVar2.f40119c.a(c3151ea)).booleanValue()) {
                    ((Map) this.f24453u).put("u", str2);
                }
                C3370ic c3370ic = (C3370ic) this.f24456x;
                InterfaceC4877a interfaceC4877a = (InterfaceC4877a) this.f24454v;
                Map map = (Map) this.f24453u;
                String str3 = (String) this.f24455w;
                c3370ic.getClass();
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) interfaceC4877a;
                Ut J = interfaceC3858rh.J();
                Wt x02 = interfaceC3858rh.x0();
                String str4 = "";
                if (J == null || x02 == null) {
                    z8 = false;
                } else {
                    str4 = x02.f28491b;
                    z8 = J.b();
                }
                boolean z13 = (((Boolean) rVar2.f40119c.a(AbstractC3368ia.ec)).booleanValue() && map.containsKey(com.anythink.expressad.f.a.b.bI) && ((String) map.get(com.anythink.expressad.f.a.b.bI)).equals("0")) ? false : true;
                boolean z14 = ((Boolean) rVar2.f40119c.a(AbstractC3368ia.je)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
                if ("expand".equalsIgnoreCase(str3)) {
                    if (interfaceC3858rh.G0()) {
                        int i10 = t2.C.f40822b;
                        u2.i.f("Cannot expand WebView that is already expanded.");
                        return;
                    } else {
                        c3370ic.h(false);
                        interfaceC3858rh.H0(C3370ic.a(map), "1".equals(map.get("custom_close")), z13);
                        return;
                    }
                }
                if ("webapp".equalsIgnoreCase(str3)) {
                    c3370ic.h(false);
                    boolean z15 = ((Boolean) rVar2.f40119c.a(AbstractC3368ia.rd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
                    if (str2 != null) {
                        interfaceC3858rh.O0("1".equals(map.get("custom_close")), C3370ic.a(map), str2, z13, z15);
                        return;
                    } else {
                        interfaceC3858rh.d0("1".equals(map.get("custom_close")), C3370ic.a(map), (String) map.get(com.onesignal.inAppMessages.internal.d.HTML), (String) map.get("baseurl"), z13);
                        return;
                    }
                }
                boolean z16 = z13;
                if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
                    Context context = interfaceC3858rh.getContext();
                    if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31448G5)).booleanValue()) {
                        t2.C.k("User opt out chrome custom tab.");
                        c3370ic.i(10);
                    } else {
                        if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31848z5)).booleanValue()) {
                            String b9 = AbstractC4846f.b(context);
                            if (b9 != null && !context.getPackageName().equals(b9)) {
                                z12 = true;
                            }
                        } else {
                            z12 = C3905sa.a(context);
                        }
                        if (z12) {
                            boolean z17 = z14;
                            boolean z18 = z8;
                            String str5 = str4;
                            c3370ic.h(true);
                            if (TextUtils.isEmpty(str2)) {
                                int i11 = t2.C.f40822b;
                                u2.i.f("Cannot open browser with null or empty url");
                                c3370ic.i(7);
                                return;
                            }
                            Uri c9 = C3370ic.c(C3370ic.b(interfaceC3858rh.getContext(), interfaceC3858rh.S0(), Uri.parse(str2), interfaceC3858rh.b0(), interfaceC3858rh.h(), interfaceC3858rh.W0()));
                            if (z18 && c3370ic.f31857x != null && c3370ic.d(interfaceC4877a, interfaceC3858rh.getContext(), c9.toString(), str5)) {
                                return;
                            }
                            c3370ic.f31851A = new C3262gc(c3370ic);
                            String uri = c9.toString();
                            InterfaceC4993a interfaceC4993a = c3370ic.f31851A;
                            Bundle bundle = new Bundle();
                            if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31439F5)).booleanValue()) {
                                if (map.containsKey("cct_init_h")) {
                                    try {
                                        bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                                    } catch (NumberFormatException e6) {
                                        t2.C.l("Invalid cct initial height parameter.", e6);
                                        p2.j.f39798C.f39808h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e6);
                                    }
                                }
                                if (map.containsKey("cct_bp")) {
                                    try {
                                        bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                                    } catch (NumberFormatException e9) {
                                        t2.C.l("Invalid cct close button position parameter.", e9);
                                        p2.j.f39798C.f39808h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e9);
                                    }
                                }
                            }
                            interfaceC3858rh.V0(new C4997e(null, uri, null, null, null, null, null, null, new V2.b(interfaceC4993a), true, bundle), z16, z17, str5);
                            return;
                        }
                        c3370ic.i(4);
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    c3370ic.f(interfaceC4877a, map, z8, str4, z16, z14);
                    return;
                }
                boolean z19 = z14;
                boolean z20 = z8;
                String str6 = str4;
                if ("app".equalsIgnoreCase(str3) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    c3370ic.f(interfaceC4877a, map, z20, str6, z16, z19);
                    return;
                }
                if ("open_app".equalsIgnoreCase(str3)) {
                    if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.t9)).booleanValue()) {
                        c3370ic.h(true);
                        String str7 = (String) map.get("p");
                        if (str7 == null) {
                            int i12 = t2.C.f40822b;
                            u2.i.f("Package name missing from open app action.");
                            return;
                        }
                        if (z20 && c3370ic.f31857x != null && c3370ic.d(interfaceC4877a, interfaceC3858rh.getContext(), str7, str6)) {
                            return;
                        }
                        PackageManager packageManager = interfaceC3858rh.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i13 = t2.C.f40822b;
                            u2.i.f("Cannot get package manager from open app action.");
                            return;
                        } else {
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str7);
                            if (launchIntentForPackage != null) {
                                interfaceC3858rh.V0(new C4997e(launchIntentForPackage, c3370ic.f31851A), z16, z19, str6);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                c3370ic.h(true);
                String str8 = (String) map.get("intent_url");
                if (!TextUtils.isEmpty(str8)) {
                    try {
                        parseUri = Intent.parseUri(str8, 0);
                    } catch (URISyntaxException e10) {
                        String valueOf = String.valueOf(str8);
                        int i14 = t2.C.f40822b;
                        u2.i.d("Error parsing the url: ".concat(valueOf), e10);
                    }
                    if (parseUri != null && parseUri.getData() != null) {
                        data = parseUri.getData();
                        if (!Uri.EMPTY.equals(data)) {
                            Uri c10 = C3370ic.c(C3370ic.b(interfaceC3858rh.getContext(), interfaceC3858rh.S0(), data, interfaceC3858rh.b0(), interfaceC3858rh.h(), interfaceC3858rh.W0()));
                            if (!TextUtils.isEmpty(parseUri.getType())) {
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.u9)).booleanValue()) {
                                    parseUri.setDataAndType(c10, parseUri.getType());
                                }
                            }
                            parseUri.setData(c10);
                        }
                    }
                    C3151ea c3151ea2 = AbstractC3368ia.P9;
                    rVar = q2.r.f40116e;
                    z9 = !((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.oe)).booleanValue() || (c3484kk = c3370ic.f31859z) == null) {
                        z10 = z20;
                        str = str2;
                    } else {
                        synchronized (c3484kk.f32450n) {
                            int i15 = c3484kk.f32452v.f28115E0;
                            if (i15 <= 0 || c3484kk.f32448A) {
                                z10 = z20;
                                str = str2;
                            } else {
                                C3657nv c3657nv = c3484kk.f32456z;
                                c3484kk.f32453w.getClass();
                                z10 = z20;
                                str = str2;
                                long currentTimeMillis = System.currentTimeMillis();
                                c3657nv.h();
                                ((C3711ov) c3657nv.f30000u).C(currentTimeMillis);
                                c3484kk.f32448A = true;
                                c3484kk.f32455y.schedule(new RunnableC3376ij(4, c3484kk), i15, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                    HashMap hashMap = new HashMap();
                    if (z9) {
                        z11 = z16;
                    } else {
                        C3316hc c3316hc = new C3316hc(c3370ic, z16, interfaceC4877a, hashMap, map);
                        c3370ic = c3370ic;
                        interfaceC4877a = interfaceC4877a;
                        map = map;
                        c3370ic.f31851A = c3316hc;
                        z11 = false;
                    }
                    if (parseUri == null) {
                        if (!z10 || c3370ic.f31857x == null || !c3370ic.d(interfaceC4877a, interfaceC3858rh.getContext(), parseUri.getData().toString(), str6)) {
                            interfaceC3858rh.V0(new C4997e(parseUri, c3370ic.f31851A), z11, z19, str6);
                            return;
                        } else {
                            if (z9) {
                                hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                                ((InterfaceC2566Gc) interfaceC4877a).a("openIntentAsync", hashMap);
                                return;
                            }
                            return;
                        }
                    }
                    String uri2 = !TextUtils.isEmpty(str) ? C3370ic.c(C3370ic.b(interfaceC3858rh.getContext(), interfaceC3858rh.S0(), Uri.parse(str), interfaceC3858rh.b0(), interfaceC3858rh.h(), interfaceC3858rh.W0())).toString() : str;
                    if (!z10 || c3370ic.f31857x == null || !c3370ic.d(interfaceC4877a, interfaceC3858rh.getContext(), uri2, str6)) {
                        interfaceC3858rh.V0(new C4997e((String) map.get("i"), uri2, (String) map.get(com.anythink.expressad.f.a.b.dI), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), c3370ic.f31851A), z11, z19, str6);
                        return;
                    } else {
                        if (z9) {
                            hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                            ((InterfaceC2566Gc) interfaceC4877a).a("openIntentAsync", hashMap);
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
                C3151ea c3151ea22 = AbstractC3368ia.P9;
                rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea22)).booleanValue()) {
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.oe)).booleanValue()) {
                }
                z10 = z20;
                str = str2;
                HashMap hashMap2 = new HashMap();
                if (z9) {
                }
                if (parseUri == null) {
                }
                break;
            case 9:
                ((C2588Hh) this.f24456x).u((Map) obj, (List) this.f24453u, (String) this.f24454v);
                return;
            case 10:
                ((C2657Li) this.f24456x).f26194e.a(new RunnableC3771q0((Av) this.f24453u, (String) obj, (t2.w) this.f24455w, 6));
                return;
            case 14:
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) obj;
                Ut ut = (Ut) this.f24453u;
                interfaceC3858rh2.Q0(ut, (Wt) this.f24454v);
                C2588Hh j02 = interfaceC3858rh2.j0();
                C3151ea c3151ea3 = AbstractC3368ia.zb;
                q2.r rVar3 = q2.r.f40116e;
                if (((Boolean) rVar3.f40119c.a(c3151ea3)).booleanValue() && j02 != null) {
                    C4026un c4026un = (C4026un) this.f24456x;
                    C2834Vp c2834Vp = c4026un.i;
                    Av av = c4026un.f34658j;
                    C2657Li c2657Li2 = (C2657Li) this.f24455w;
                    j02.y(c2657Li2, c2834Vp, av);
                    j02.z(c2657Li2, c4026un.i, c4026un.f34653d);
                }
                if (!((Boolean) rVar3.f40119c.a(AbstractC3368ia.ye)).booleanValue() || j02 == null) {
                    return;
                }
                C2569Gf c2569Gf = p2.j.f39798C.f39824y;
                C2486Bh c2486Bh = j02.f25405n;
                if (c2569Gf.a(c2486Bh.getContext())) {
                    j02.c("/logScionEvent");
                    new HashMap();
                    j02.b("/logScionEvent", new C2871Yb(i9, c2486Bh.getContext(), ut.f28182w0));
                    return;
                }
                return;
            case 20:
                C3763pt c3763pt = (C3763pt) this.f24456x;
                C3429jj c3429jj = (C3429jj) obj;
                synchronized (c3763pt) {
                    if (c3429jj != null) {
                        try {
                            c3429jj.b();
                        } finally {
                        }
                    }
                    if (c3763pt.f33538m) {
                        c3763pt.c();
                    }
                    if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu = (Yu) this.f24453u) == null) {
                        Zu zu = c3763pt.i;
                        Vu vu = (Vu) this.f24454v;
                        vu.j(c3429jj.f24803a.f29349b);
                        vu.p0(c3429jj.f24808f.f33484n);
                        vu.b(true);
                        zu.b(vu.m());
                    } else {
                        yu.e(c3429jj.f24803a.f29349b);
                        yu.g(c3429jj.f24808f.f33484n);
                        Vu vu2 = (Vu) this.f24454v;
                        vu2.b(true);
                        yu.a(vu2);
                        yu.h();
                    }
                }
                return;
            case 22:
                String str9 = (String) obj;
                InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) this.f24453u;
                Ut J8 = interfaceC3858rh3.J();
                if (J8 != null && !J8.f28155i0) {
                    t2.w wVar = J8.f28184x0;
                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.vb)).booleanValue() || (c2657Li = (C2657Li) this.f24454v) == null || !C2657Li.b(str9)) {
                        ((Av) this.f24455w).b(str9, wVar, null, null);
                        return;
                    }
                    Av av2 = (Av) this.f24455w;
                    Random random = C4907p.f40108g.f40113e;
                    if (TextUtils.isEmpty(str9)) {
                        return;
                    }
                    J3.a w9 = C3686oN.w(c2657Li.c(str9, c2657Li.f26193d.f26374a, random), ((Integer) r5.f40119c.a(AbstractC3368ia.Ib)).intValue(), TimeUnit.MILLISECONDS, c2657Li.f26196g);
                    w9.c(new MD(i4, w9, new C2518Df(c2657Li, av2, str9, wVar)), c2657Li.f26194e);
                    return;
                }
                Wt x03 = interfaceC3858rh3.x0();
                if (x03 == null) {
                    p2.j.f39798C.f39808h.d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                boolean z21 = false;
                p2.j jVar = p2.j.f39798C;
                jVar.f39810k.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                boolean i16 = jVar.f39808h.i(interfaceC3858rh3.getContext());
                boolean z22 = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31676g7)).booleanValue() && J8 != null && J8.f28132S;
                if (J8 != null && J8.f28146d0 != null) {
                    z21 = true;
                }
                C3614n5 c3614n5 = new C3614n5(x03.f28491b, str9, (i16 || z22 || z21) ? 2 : 1, currentTimeMillis2);
                C2834Vp c2834Vp2 = (C2834Vp) this.f24456x;
                c2834Vp2.getClass();
                c2834Vp2.a(new C2593Hm(9, c2834Vp2, c3614n5));
                return;
            default:
                u2.k kVar = (u2.k) obj;
                Av av3 = (Av) this.f24456x;
                Vu vu3 = (Vu) this.f24453u;
                if (vu3 != null) {
                    vu3.b(kVar == u2.k.f41244n);
                    Yu yu2 = (Yu) this.f24454v;
                    if (yu2 == null) {
                        av3.f23926f.b(vu3.m());
                    } else {
                        yu2.a(vu3);
                        yu2.h();
                    }
                }
                C2744Qk c2744Qk = (C2744Qk) this.f24455w;
                if (c2744Qk == null) {
                    return;
                }
                String str10 = av3.f23924d.f41251v;
                if (TextUtils.isEmpty(str10)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str10);
                    String optString = jSONObject.optString("type");
                    String optString2 = jSONObject.optString(com.anythink.core.common.k.f14453T);
                    String optString3 = jSONObject.optString("currency");
                    long optLong = jSONObject.optLong("value", 0L);
                    int hashCode2 = optString.hashCode();
                    char c11 = 65535;
                    if (hashCode2 == 66934) {
                        if (optString.equals("CPC")) {
                            c4 = 1;
                            if (c4 != 0) {
                            }
                            long j9 = optLong;
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            h1Var = new q2.h1(i, c11 == 0 ? c11 != 1 ? c11 != 2 ? 0 : 3 : 2 : 1, optString3, j9);
                            if (K3.b.M((C3226fu) c2744Qk.f27208x.f29348a.f26393u) == 1) {
                            }
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        long j92 = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        h1Var = new q2.h1(i, c11 == 0 ? c11 != 1 ? c11 != 2 ? 0 : 3 : 2 : 1, optString3, j92);
                        if (K3.b.M((C3226fu) c2744Qk.f27208x.f29348a.f26393u) == 1) {
                        }
                    } else {
                        if (hashCode2 != 66944) {
                            if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                                c4 = 2;
                                if (c4 != 0) {
                                    i = 1;
                                } else if (c4 == 1) {
                                    i = 2;
                                } else if (c4 != 2) {
                                    i = 0;
                                } else {
                                    optLong /= 1000;
                                    i = 3;
                                }
                                long j922 = optLong;
                                hashCode = optString2.hashCode();
                                if (hashCode == -2131980260) {
                                    if (hashCode != 399232571) {
                                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                            c11 = 1;
                                        }
                                    } else if (optString2.equals("PRECISE")) {
                                        c11 = 2;
                                    }
                                } else if (optString2.equals("ESTIMATED")) {
                                    c11 = 0;
                                }
                                h1Var = new q2.h1(i, c11 == 0 ? c11 != 1 ? c11 != 2 ? 0 : 3 : 2 : 1, optString3, j922);
                                if ((K3.b.M((C3226fu) c2744Qk.f27208x.f29348a.f26393u) == 1) && c2744Qk.f27206v.f28110B0 && c2744Qk.f27207w.compareAndSet(false, true)) {
                                    c2744Qk.u1(new C3761pr(17, h1Var));
                                    return;
                                }
                                return;
                            }
                            c4 = 65535;
                            if (c4 != 0) {
                            }
                            long j9222 = optLong;
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            h1Var = new q2.h1(i, c11 == 0 ? c11 != 1 ? c11 != 2 ? 0 : 3 : 2 : 1, optString3, j9222);
                            if (K3.b.M((C3226fu) c2744Qk.f27208x.f29348a.f26393u) == 1) {
                                c2744Qk.u1(new C3761pr(17, h1Var));
                                return;
                            }
                            return;
                        }
                        if (optString.equals("CPM")) {
                            c4 = 0;
                            if (c4 != 0) {
                            }
                            long j92222 = optLong;
                            hashCode = optString2.hashCode();
                            if (hashCode == -2131980260) {
                            }
                            h1Var = new q2.h1(i, c11 == 0 ? c11 != 1 ? c11 != 2 ? 0 : 3 : 2 : 1, optString3, j92222);
                            if (K3.b.M((C3226fu) c2744Qk.f27208x.f29348a.f26393u) == 1) {
                            }
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        long j922222 = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        h1Var = new q2.h1(i, c11 == 0 ? c11 != 1 ? c11 != 2 ? 0 : 3 : 2 : 1, optString3, j922222);
                        if (K3.b.M((C3226fu) c2744Qk.f27208x.f29348a.f26393u) == 1) {
                        }
                    }
                } catch (JSONException e11) {
                    p2.j.f39798C.f39808h.d("UrlPinger.pingUrl", e11);
                    return;
                }
                break;
        }
    }

    public C2855Xc o(Context context, C5107a c5107a, Zu zu) {
        C2855Xc c2855Xc;
        String str;
        synchronized (this.f24453u) {
            try {
                if (((C2855Xc) this.f24455w) == null) {
                    if (C(context)) {
                        str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31633c);
                    } else if (((Boolean) AbstractC2751Ra.f27380h.r()).booleanValue()) {
                        str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31613a);
                    } else {
                        str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31623b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f24455w = new C2855Xc(context, c5107a, str, zu);
                }
                c2855Xc = (C2855Xc) this.f24455w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2855Xc;
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        Yu yu;
        int i;
        switch (this.f24452n) {
            case 6:
                p2.j.f39798C.f39808h.d("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 9:
                String valueOf = String.valueOf((Uri) this.f24455w);
                int i4 = t2.C.f40822b;
                u2.i.f("Failed to parse gmsg params for: ".concat(valueOf));
                return;
            case 10:
                ((C2657Li) this.f24456x).f26194e.a(new RunnableC2774Sg(this, th, (Av) this.f24453u, (String) this.f24454v, (t2.w) this.f24455w));
                return;
            case 14:
                return;
            case 20:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31463I6)).booleanValue()) {
                    t2.C.l("Banner ad failed to load", th);
                }
                C3763pt c3763pt = (C3763pt) this.f24456x;
                synchronized (c3763pt) {
                    C3482ki c3482ki = (C3482ki) this.f24455w;
                    C4927z0 w9 = AbstractC3217fl.w(th, ((C2709Oj) c3482ki.f32333I0.d()).f26747l);
                    c3763pt.f33539n = w9;
                    ((C4077vk) c3482ki.f32435y0.d()).v(w9);
                    AbstractC2655Lg.i(w9.f40122n, "BannerAdLoader.onFailure", th);
                    if (c3763pt.f33538m) {
                        c3763pt.e();
                        C2863Xk c2863Xk = c3763pt.f33534h;
                        C3378il c3378il = c3763pt.f33535j;
                        synchronized (c3378il) {
                            i = c3378il.f31994n;
                        }
                        c2863Xk.v1(i);
                    }
                    if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu = (Yu) this.f24453u) == null) {
                        Zu zu = c3763pt.i;
                        Vu vu = (Vu) this.f24454v;
                        vu.g(w9);
                        vu.c(th);
                        vu.b(false);
                        zu.b(vu.m());
                    } else {
                        yu.f(w9);
                        Vu vu2 = (Vu) this.f24454v;
                        vu2.c(th);
                        vu2.b(false);
                        yu.a(vu2);
                        yu.h();
                    }
                }
                return;
            case 22:
                return;
            default:
                Vu vu3 = (Vu) this.f24453u;
                if (vu3 == null) {
                    return;
                }
                vu3.b(false);
                Yu yu2 = (Yu) this.f24454v;
                if (yu2 == null) {
                    ((Av) this.f24456x).f23926f.b(vu3.m());
                    return;
                } else {
                    yu2.a(vu3);
                    yu2.h();
                    return;
                }
        }
    }

    public void r(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f24454v = Integer.valueOf(i);
    }

    public synchronized void s(AbstractC3074d5 abstractC3074d5) {
        try {
            HashMap hashMap = (HashMap) this.f24453u;
            String d2 = abstractC3074d5.d();
            List list = (List) hashMap.remove(d2);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (AbstractC3346i5.f31315a) {
                AbstractC3346i5.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), d2);
            }
            AbstractC3074d5 abstractC3074d52 = (AbstractC3074d5) list.remove(0);
            hashMap.put(d2, list);
            synchronized (abstractC3074d52.f29797x) {
                abstractC3074d52.f29791D = this;
            }
            try {
                ((PriorityBlockingQueue) this.f24455w).put(abstractC3074d52);
            } catch (InterruptedException e6) {
                AbstractC3346i5.c("Couldn't add request to queue. %s", e6.toString());
                Thread.currentThread().interrupt();
                U4 u42 = (U4) this.f24454v;
                u42.f27926w = true;
                u42.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3077d8 t(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f24455w;
        String string = i == 1 ? sharedPreferences.getString(D(), null) : sharedPreferences.getString(A(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] j9 = S2.b.j(string);
                C3077d8 F8 = C3077d8.F(SK.s(j9, 0, j9.length));
                String A8 = F8.A();
                File c4 = AbstractC2720Pd.c(A8, "pcam.jar", w());
                if (!c4.exists()) {
                    c4 = AbstractC2720Pd.c(A8, "pcam", w());
                }
                File c9 = AbstractC2720Pd.c(A8, "pcbc", w());
                if (c4.exists()) {
                    if (c9.exists()) {
                        return F8;
                    }
                }
            } catch (C3845rL unused) {
            }
        }
        return null;
    }

    public void u() {
        this.f24455w = 16;
    }

    public synchronized boolean v(AbstractC3074d5 abstractC3074d5) {
        try {
            HashMap hashMap = (HashMap) this.f24453u;
            String d2 = abstractC3074d5.d();
            if (!hashMap.containsKey(d2)) {
                hashMap.put(d2, null);
                synchronized (abstractC3074d5.f29797x) {
                    abstractC3074d5.f29791D = this;
                }
                if (AbstractC3346i5.f31315a) {
                    AbstractC3346i5.b("new request, sending to network %s", d2);
                }
                return false;
            }
            List list = (List) hashMap.get(d2);
            if (list == null) {
                list = new ArrayList();
            }
            abstractC3074d5.a("waiting-for-response");
            list.add(abstractC3074d5);
            hashMap.put(d2, list);
            if (AbstractC3346i5.f31315a) {
                AbstractC3346i5.b("Request for cacheKey=%s is in flight, putting on hold.", d2);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File w() {
        File file = new File((File) this.f24453u, Integer.toString(((X7) this.f24456x).f28615n));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public C2591Hk x(Set set) {
        return new C2591Hk(set);
    }

    public CE y() {
        Mu mu;
        C3791qK b9;
        IE ie = (IE) this.f24453u;
        if (ie == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Mu mu2 = (Mu) this.f24454v;
        if (mu2 == null || (mu = (Mu) this.f24455w) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (ie.f25539a != ((C3791qK) mu2.f26395u).f33687a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ie.f25540b != ((C3791qK) mu.f26395u).f33687a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ie.a() && ((Integer) this.f24456x) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((IE) this.f24453u).a() && ((Integer) this.f24456x) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        HE he = ((IE) this.f24453u).f25543e;
        if (he == HE.f25330e) {
            b9 = AbstractC3571mG.f32676a;
        } else if (he == HE.f25329d) {
            b9 = AbstractC3571mG.a(((Integer) this.f24456x).intValue());
        } else {
            if (he != HE.f25328c) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((IE) this.f24453u).f25543e)));
            }
            b9 = AbstractC3571mG.b(((Integer) this.f24456x).intValue());
        }
        return new CE((IE) this.f24453u, (Mu) this.f24454v, (Mu) this.f24455w, b9, (Integer) this.f24456x);
    }

    public ME z() {
        Integer num = (Integer) this.f24453u;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f24454v) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f24455w) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = ((Integer) this.f24454v).intValue();
        ((Integer) this.f24455w).getClass();
        return new ME(intValue, intValue2, (LE) this.f24456x);
    }

    public C2518Df(Context context, SD sd, Set set, Yu yu) {
        this.f24452n = 19;
        this.f24453u = context;
        this.f24455w = sd;
        this.f24454v = set;
        this.f24456x = yu;
    }

    public C2518Df(Context context, ExecutorService executorService, Dw dw, Jw jw) {
        this.f24452n = 24;
        this.f24453u = context;
        this.f24454v = executorService;
        this.f24455w = dw;
    }

    public C2518Df(View view, InterfaceC3858rh interfaceC3858rh, InterfaceC2505Cj interfaceC2505Cj, Vt vt) {
        this.f24452n = 11;
        this.f24454v = view;
        this.f24456x = interfaceC3858rh;
        this.f24453u = interfaceC2505Cj;
        this.f24455w = vt;
    }

    public C2518Df(Ut ut, InterfaceC2669Md interfaceC2669Md, EnumC4631b enumC4631b) {
        this.f24452n = 17;
        this.f24456x = null;
        this.f24453u = ut;
        this.f24454v = interfaceC2669Md;
        this.f24455w = enumC4631b;
    }

    public /* synthetic */ C2518Df(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f24452n = i;
        this.f24453u = obj;
        this.f24454v = obj2;
        this.f24455w = obj3;
        this.f24456x = obj4;
    }

    public C2518Df(int i) {
        this.f24452n = i;
        switch (i) {
            case 7:
                this.f24453u = new Object();
                this.f24454v = new Object();
                break;
            case 28:
                this.f24453u = null;
                this.f24454v = null;
                this.f24455w = null;
                this.f24456x = null;
                break;
            case 29:
                this.f24453u = null;
                this.f24454v = null;
                this.f24455w = null;
                this.f24456x = LE.f26126x;
                break;
            default:
                this.f24453u = new Lr();
                this.f24454v = new Lr();
                this.f24455w = new B3();
                break;
        }
    }

    public C2518Df(Context context, X7 x72) {
        this.f24452n = 25;
        this.f24455w = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        AbstractC2720Pd.E(dir, false);
        this.f24453u = dir;
        File dir2 = context.getDir("tmppccache", 0);
        AbstractC2720Pd.E(dir2, true);
        this.f24454v = dir2;
        this.f24456x = x72;
    }

    public C2518Df(Context context, String str) {
        String packageName;
        this.f24452n = 5;
        this.f24455w = context;
        this.f24456x = str;
        this.f24453u = (String) PA.f26853D.r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f24454v = linkedHashMap;
        linkedHashMap.put(com.anythink.core.common.s.f16407a, "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        linkedHashMap.put("device", t2.G.O());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != t2.G.f(context) ? "0" : "1");
        Rx rx = jVar.f39815p;
        rx.getClass();
        J3.a b9 = AbstractC3212fg.f30738a.b(new T6(context, rx));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C2738Qe) b9.get()).f27188j));
            linkedHashMap.put("network_fine", Integer.toString(((C2738Qe) b9.get()).f27189k));
        } catch (Exception e6) {
            p2.j.f39798C.f39808h.d("CsiConfiguration.CsiConfiguration", e6);
        }
        C3151ea c3151ea = AbstractC3368ia.Kc;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f24454v;
            t2.G g10 = p2.j.f39798C.f39803c;
            linkedHashMap2.put("is_bstar", true != t2.G.d(context) ? "0" : "1");
        }
        C3151ea c3151ea2 = AbstractC3368ia.La;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31637c3)).booleanValue()) {
            p2.j jVar2 = p2.j.f39798C;
            if (AbstractC3217fl.q(jVar2.f39808h.f29018g)) {
                return;
            }
            ((LinkedHashMap) this.f24454v).put("plugin", jVar2.f39808h.f29018g);
        }
    }

    private final void m(Throwable th) {
    }

    private final void n(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C2518Df(JsonReader jsonReader, Bundle bundle) {
        this.f24452n = 21;
        this.f24456x = bundle;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() && bundle != null) {
            p2.j.f39798C.f39810k.getClass();
            bundle.putLong("server-response-parse-start", System.currentTimeMillis());
        }
        ?? r02 = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        Wt wt = null;
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
                            r02.add(new Ut(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals(com.anythink.core.common.m.e.Y)) {
                        wt = new Wt(jsonReader);
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31476K2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", wt.f28507s);
                            bundle.putLong("normalize-ad-response-end", wt.f28508t);
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
                            jSONObject = p8.g.r(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new Zt(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f24455w = arrayList;
        this.f24453u = r02;
        this.f24454v = wt == null ? new Wt(new JsonReader(new StringReader("{}"))) : wt;
    }

    public C2518Df(U4 u42, PriorityBlockingQueue priorityBlockingQueue, Vx vx) {
        this.f24452n = 4;
        this.f24453u = new HashMap();
        this.f24456x = vx;
        this.f24454v = u42;
        this.f24455w = priorityBlockingQueue;
    }

    public C2518Df(C3370ic c3370ic, Map map, InterfaceC4877a interfaceC4877a, String str) {
        this.f24452n = 6;
        this.f24453u = map;
        this.f24454v = interfaceC4877a;
        this.f24455w = str;
        Objects.requireNonNull(c3370ic);
        this.f24456x = c3370ic;
    }

    public C2518Df(C2889Zc c2889Zc, C2753Rc c2753Rc, Object obj, C3320hg c3320hg) {
        this.f24452n = 8;
        this.f24453u = c2753Rc;
        this.f24454v = obj;
        this.f24455w = c3320hg;
        Objects.requireNonNull(c2889Zc);
        this.f24456x = c2889Zc;
    }

    public C2518Df(C2588Hh c2588Hh, List list, String str, Uri uri) {
        this.f24452n = 9;
        this.f24453u = list;
        this.f24454v = str;
        this.f24455w = uri;
        Objects.requireNonNull(c2588Hh);
        this.f24456x = c2588Hh;
    }

    public C2518Df(C2657Li c2657Li, Av av, String str, t2.w wVar) {
        this.f24452n = 10;
        this.f24453u = av;
        this.f24454v = str;
        this.f24455w = wVar;
        Objects.requireNonNull(c2657Li);
        this.f24456x = c2657Li;
    }

    public C2518Df(C3755pl c3755pl) {
        this.f24452n = 26;
        this.f24456x = this;
        this.f24453u = c3755pl;
        C4009uN a9 = C4009uN.a(new C3817qt((C4117wN) c3755pl.f33492b, (C4117wN) c3755pl.f33494d, (C4009uN) c3755pl.f33501l, C4009uN.a(AbstractC3194fG.f30669q0), (C4009uN) c3755pl.f33503n, (C4009uN) c3755pl.i, (C4117wN) c3755pl.f33495e));
        this.f24454v = a9;
        this.f24455w = C4009uN.a(new C3107dk((C4117wN) c3755pl.f33494d, a9, (C4009uN) c3755pl.f33501l, (C4009uN) c3755pl.f33500k, C4009uN.a(AbstractC3035cL.f29685H), new C3120dy(this), (C4117wN) c3755pl.f33495e, 6));
    }

    public C2518Df(C4026un c4026un, Ut ut, Wt wt, C2657Li c2657Li) {
        this.f24452n = 14;
        this.f24453u = ut;
        this.f24454v = wt;
        this.f24455w = c2657Li;
        this.f24456x = c4026un;
    }

    public C2518Df(C3168er c3168er, C2953au c2953au, Ut ut, C3598mq c3598mq) {
        this.f24452n = 18;
        this.f24453u = c2953au;
        this.f24454v = ut;
        this.f24455w = c3598mq;
        Objects.requireNonNull(c3168er);
        this.f24456x = c3168er;
    }

    public C2518Df(C3763pt c3763pt, Yu yu, Vu vu, C3482ki c3482ki) {
        this.f24452n = 20;
        this.f24453u = yu;
        this.f24454v = vu;
        this.f24455w = c3482ki;
        Objects.requireNonNull(c3763pt);
        this.f24456x = c3763pt;
    }

    public C2518Df(Av av, Vu vu, Yu yu, C2744Qk c2744Qk) {
        this.f24452n = 23;
        this.f24453u = vu;
        this.f24454v = yu;
        this.f24455w = c2744Qk;
        Objects.requireNonNull(av);
        this.f24456x = av;
    }

    public C2518Df(C3675oC c3675oC, Vy vy, Vy vy2, Vy vy3) {
        Object obj;
        this.f24452n = 27;
        if (c3675oC != null) {
            obj = UB.n(c3675oC);
        } else {
            SB sb = UB.f27942u;
            obj = C3675oC.f33115x;
        }
        this.f24453u = obj;
        this.f24454v = vy;
        this.f24455w = vy2;
        this.f24456x = vy3;
    }
}
