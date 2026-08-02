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
import h.C4543G;
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
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4820f;
import r2.C4906k;
import s2.C4949p;
import s2.C4969z0;
import s2.InterfaceC4919a;
import t2.InterfaceC5034c;
import v2.C5101e;
import v2.InterfaceC5097a;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Gf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2590Gf implements InterfaceC3456k, InterfaceC3891s3, KD, InterfaceC3598mg, InterfaceC3037c9, InterfaceC2883Xl {

    /* renamed from: y, reason: collision with root package name */
    public static C2590Gf f25828y;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25829n;

    /* renamed from: u, reason: collision with root package name */
    public Object f25830u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25831v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25832w;

    /* renamed from: x, reason: collision with root package name */
    public Object f25833x;

    public C2590Gf(Context context, V2.a aVar, C5140B c5140b, C2641Jf c2641Jf) {
        this.f25829n = 0;
        this.f25830u = aVar;
        C3374iN a9 = C3374iN.a(context);
        C3374iN a10 = C3374iN.a(c5140b);
        this.f25831v = C3266gN.a(new C2522Cf(a9, a10, 0));
        C3374iN a11 = C3374iN.a(aVar);
        C3266gN a12 = C3266gN.a(new C2556Ef(a11, a10, C3374iN.a(c2641Jf), 0));
        this.f25832w = a12;
        this.f25833x = C3266gN.a(new C2709Nf(a9, new C2573Ff(a11, a12, 0), 0));
    }

    public static final boolean C(Context context) {
        if (((Boolean) AbstractC2840Va.f28997c.r()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        C3980tl I8 = w2.D.I(context);
        return I8.f35163u.toLowerCase(Locale.ROOT).equals(com.anythink.expressad.video.dynview.a.a.Y);
    }

    public static C2590Gf d(Reader reader, Bundle bundle) {
        try {
            try {
                return new C2590Gf(new JsonReader(reader), bundle);
            } finally {
                V2.b.c(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e9) {
            throw new Vt("unable to parse ServerResponse", e9);
        }
    }

    public static synchronized C2590Gf m(Context context) {
        synchronized (C2590Gf.class) {
            try {
                C2590Gf c2590Gf = f25828y;
                if (c2590Gf != null) {
                    return c2590Gf;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC3592ma.a(applicationContext);
                C4906k c4906k = C4906k.f40186C;
                C5140B g9 = c4906k.f40196h.g();
                g9.k(applicationContext);
                applicationContext.getClass();
                V2.a aVar = c4906k.f40198k;
                aVar.getClass();
                C2641Jf c2641Jf = c4906k.f40212y;
                AbstractC3364iD.l(C2641Jf.class, c2641Jf);
                C2590Gf c2590Gf2 = new C2590Gf(applicationContext, aVar, g9, c2641Jf);
                f25828y = c2590Gf2;
                SharedPreferencesOnSharedPreferenceChangeListenerC2505Bf sharedPreferencesOnSharedPreferenceChangeListenerC2505Bf = (SharedPreferencesOnSharedPreferenceChangeListenerC2505Bf) ((C3266gN) c2590Gf2.f25831v).f();
                SharedPreferences sharedPreferences = sharedPreferencesOnSharedPreferenceChangeListenerC2505Bf.f24688b;
                sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2505Bf);
                sharedPreferencesOnSharedPreferenceChangeListenerC2505Bf.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
                C3324ha c3324ha = AbstractC3592ma.f33042h1;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC2505Bf.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC2505Bf.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
                }
                C2692Mf c2692Mf = (C2692Mf) ((C3266gN) f25828y.f25833x).f();
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32983b1)).booleanValue()) {
                    HashMap P8 = w2.D.P((String) rVar.f40509c.a(AbstractC3592ma.f32993c1));
                    Iterator it = P8.keySet().iterator();
                    while (it.hasNext()) {
                        c2692Mf.a((String) it.next());
                    }
                    C2675Lf c2675Lf = new C2675Lf(c2692Mf, P8);
                    synchronized (c2692Mf) {
                        c2692Mf.f27090b.add(c2675Lf);
                    }
                }
                return f25828y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String A() {
        int i = ((EnumC2983b8) this.f25833x).f30015n;
        return D.x.k(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public void B(int i, P3.a aVar) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
            aVar.a(new LD(0, aVar, new I1.a(this, i)), (C3383ig) this.f25830u);
        }
    }

    public String D() {
        int i = ((EnumC2983b8) this.f25833x).f30015n;
        return D.x.k(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a */
    public void mo6a(Object obj) {
        InterfaceC2890Yc interfaceC2890Yc = (InterfaceC2890Yc) obj;
        w2.z.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f25831v;
        C3490kg c3490kg = (C3490kg) this.f25832w;
        C2858Wc c2858Wc = (C2858Wc) this.f25830u;
        C3219fd c3219fd = (C3219fd) this.f25833x;
        c3219fd.getClass();
        try {
            w2.D d9 = C4906k.f40186C.f40191c;
            String uuid = UUID.randomUUID().toString();
            AbstractC3218fc.f31048j.a(uuid, new C3165ed(c2858Wc, c3219fd, c3490kg));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", ((InterfaceC3005bd) c3219fd.f31066d).n(obj2));
            String str = (String) c3219fd.f31064b;
            InterfaceC2689Mc interfaceC2689Mc = (InterfaceC2689Mc) interfaceC2890Yc;
            interfaceC2689Mc.getClass();
            interfaceC2689Mc.c(str, jSONObject.toString());
        } catch (Exception e9) {
            try {
                c3490kg.c(e9);
                int i = w2.z.f41712b;
                x2.i.d("Unable to invokeJavascript", e9);
            } finally {
                c2858Wc.s();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3037c9
    public void b(Z9 z9) {
        C3198f9 c3198f9 = (C3198f9) ((C2948aa) z9.f28504u).C().s();
        c3198f9.h();
        ((C3252g9) c3198f9.f28504u).B((EnumC3144e9) this.f25830u);
        z9.h();
        ((C2948aa) z9.f28504u).H((C3252g9) c3198f9.j());
        W9 w9 = (W9) ((C2948aa) z9.f28504u).A().s();
        w9.h();
        ((X9) w9.f28504u).B((String) this.f25831v);
        C4059v9 c4059v9 = (C4059v9) this.f25832w;
        w9.h();
        ((X9) w9.f28504u).C(c4059v9);
        z9.h();
        ((C2948aa) z9.f28504u).G((X9) w9.j());
        z9.h();
        ((C2948aa) z9.f28504u).B((String) this.f25833x);
    }

    public C3112dd c(Context context, C5189a c5189a, Wu wu) {
        C3112dd c3112dd;
        String str;
        synchronized (this.f25831v) {
            try {
                if (((C3112dd) this.f25833x) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (C(context)) {
                        str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32991c);
                    } else {
                        str = (String) AbstractC2792Sd.f28299y.r();
                    }
                    this.f25833x = new C3112dd(applicationContext, c5189a, str, wu);
                }
                c3112dd = (C3112dd) this.f25833x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3112dd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        boolean u32;
        try {
            int ordinal = ((m2.b) this.f25832w).ordinal();
            InterfaceC2741Pd interfaceC2741Pd = (InterfaceC2741Pd) this.f25831v;
            if (ordinal == 1) {
                u32 = interfaceC2741Pd.u3(new Y2.b(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        u32 = interfaceC2741Pd.Q0(new Y2.b(context));
                    }
                    throw new C2867Wl("Adapter failed to show.");
                }
                u32 = interfaceC2741Pd.L2(new Y2.b(context));
            }
            if (u32) {
                C2527Ck c2527Ck = (C2527Ck) this.f25833x;
                if (c2527Ck == null) {
                    return;
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33004d2)).booleanValue() || ((St) this.f25830u).Y != 2) {
                    return;
                }
                c2527Ck.t();
                return;
            }
            throw new C2867Wl("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C2867Wl(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f25830u;
    }

    public FD g(Object obj, Bundle bundle) {
        Su e9 = Su.e((Context) this.f25830u, 8);
        e9.c();
        Set<Ps> set = (Set) this.f25831v;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        C3324ha c3324ha = AbstractC3592ma.hd;
        s2.r rVar = s2.r.f40506e;
        boolean isEmpty = ((String) rVar.f40509c.a(c3324ha)).isEmpty();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (!isEmpty) {
            arrayList2 = Arrays.asList(((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).split(","));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32828J2)).booleanValue() && bundle != null) {
            C4906k.f40186C.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", currentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", currentTimeMillis);
            }
        }
        for (Ps ps : set) {
            if (!arrayList2.contains(String.valueOf(ps.f()))) {
                C4906k.f40186C.f40198k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                P3.a c9 = ps.c();
                c9.a(new RunnableC2829Ug(this, elapsedRealtime, ps, bundle2), AbstractC3436jg.f32062h);
                arrayList.add(c9);
            }
        }
        RB n9 = RB.n(arrayList);
        CallableC2900Ym callableC2900Ym = new CallableC2900Ym(arrayList, obj, bundle, bundle2, 2);
        FD fd = new FD(n9, true, false);
        fd.f25513I = new ED(fd, callableC2900Ym, (RD) this.f25832w);
        fd.w();
        if (Wu.a()) {
            AbstractC2792Sd.G(fd, (Vu) this.f25833x, e9, false);
        }
        return fd;
    }

    public void h(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f25830u = Integer.valueOf(i);
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
    public boolean i(C3036c8 c3036c8, V2 v22) {
        boolean z6;
        C3251g8 q8;
        C3251g8 q9;
        boolean z9;
        String A9 = c3036c8.A().A();
        byte[] a9 = c3036c8.B().a();
        byte[] a10 = c3036c8.C().a();
        if (!TextUtils.isEmpty(A9) && a10.length != 0) {
            File file = (File) this.f25831v;
            MA.N(file);
            file.mkdirs();
            MA.y(A9, file).mkdirs();
            File c9 = MA.c(A9, "pcam.jar", file);
            if ((a9.length <= 0 || MA.u(c9, a9)) && MA.u(MA.c(A9, "pcbc", file), a10)) {
                File c10 = MA.c(c3036c8.A().A(), "pcam.jar", file);
                if (c10.exists() && v22 != null) {
                    try {
                        z9 = Bw.a(c10);
                    } catch (GeneralSecurityException unused) {
                        z9 = false;
                    }
                }
                String A10 = c3036c8.A().A();
                if (!TextUtils.isEmpty(A10)) {
                    File c11 = MA.c(A10, "pcam.jar", file);
                    File c12 = MA.c(A10, "pcbc", file);
                    File c13 = MA.c(A10, "pcam.jar", u());
                    File c14 = MA.c(A10, "pcbc", u());
                    if ((!c11.exists() || c11.renameTo(c13)) && c12.exists() && c12.renameTo(c14)) {
                        C3197f8 H8 = C3251g8.H();
                        String A11 = c3036c8.A().A();
                        H8.h();
                        ((C3251g8) H8.f28504u).J(A11);
                        String B3 = c3036c8.A().B();
                        H8.h();
                        ((C3251g8) H8.f28504u).K(B3);
                        long D8 = c3036c8.A().D();
                        H8.h();
                        ((C3251g8) H8.f28504u).M(D8);
                        long E8 = c3036c8.A().E();
                        H8.h();
                        ((C3251g8) H8.f28504u).N(E8);
                        long C8 = c3036c8.A().C();
                        H8.h();
                        ((C3251g8) H8.f28504u).L(C8);
                        C3251g8 c3251g8 = (C3251g8) H8.j();
                        C3251g8 q10 = q(1);
                        SharedPreferences.Editor edit = ((SharedPreferences) this.f25832w).edit();
                        if (q10 != null && !c3251g8.A().equals(q10.A())) {
                            edit.putString(A(), V2.b.b(q10.b()));
                        }
                        edit.putString(D(), V2.b.b(c3251g8.b()));
                        if (edit.commit()) {
                            z6 = true;
                            HashSet hashSet = new HashSet();
                            q8 = q(1);
                            if (q8 != null) {
                                hashSet.add(q8.A());
                            }
                            q9 = q(2);
                            if (q9 != null) {
                                hashSet.add(q9.A());
                            }
                            for (File file2 : u().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    MA.N(MA.y(name, u()));
                                }
                            }
                            return z6;
                        }
                    }
                }
                z6 = false;
                HashSet hashSet2 = new HashSet();
                q8 = q(1);
                if (q8 != null) {
                }
                q9 = q(2);
                if (q9 != null) {
                }
                while (r4 < r1) {
                }
                return z6;
            }
        }
        return false;
    }

    public C3112dd l(Context context, C5189a c5189a, Wu wu) {
        C3112dd c3112dd;
        String str;
        synchronized (this.f25830u) {
            try {
                if (((C3112dd) this.f25832w) == null) {
                    if (C(context)) {
                        str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32991c);
                    } else if (((Boolean) AbstractC2840Va.f29002h.r()).booleanValue()) {
                        str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32971a);
                    } else {
                        str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32981b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f25832w = new C3112dd(context, c5189a, str, wu);
                }
                c3112dd = (C3112dd) this.f25832w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3112dd;
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
    public void mo10n(Object obj) {
        boolean z6;
        Intent parseUri;
        s2.r rVar;
        boolean z9;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        Bundle w3;
        InterfaceC5034c a9;
        C3548lk c3548lk;
        Uri data;
        Vu vu;
        C2712Ni c2712Ni;
        char c9;
        int i;
        int hashCode;
        s2.g1 g1Var;
        int i4 = 0;
        int i6 = 1;
        switch (this.f25829n) {
            case 6:
                boolean z12 = false;
                String str4 = (String) obj;
                C3324ha c3324ha = AbstractC3592ma.wb;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha)).booleanValue()) {
                    ((Map) this.f25830u).put("u", str4);
                }
                C3648nc c3648nc = (C3648nc) this.f25833x;
                InterfaceC4919a interfaceC4919a = (InterfaceC4919a) this.f25831v;
                Map map = (Map) this.f25830u;
                String str5 = (String) this.f25832w;
                c3648nc.getClass();
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) interfaceC4919a;
                St J = interfaceC4084vh.J();
                Ut z02 = interfaceC4084vh.z0();
                String str6 = "";
                if (J == null || z02 == null) {
                    z6 = false;
                } else {
                    str6 = z02.f28801b;
                    z6 = J.b();
                }
                boolean z13 = (((Boolean) rVar2.f40509c.a(AbstractC3592ma.ec)).booleanValue() && map.containsKey(com.anythink.expressad.f.a.b.bI) && ((String) map.get(com.anythink.expressad.f.a.b.bI)).equals("0")) ? false : true;
                boolean z14 = ((Boolean) rVar2.f40509c.a(AbstractC3592ma.je)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
                if ("expand".equalsIgnoreCase(str5)) {
                    if (interfaceC4084vh.G0()) {
                        int i9 = w2.z.f41712b;
                        x2.i.f("Cannot expand WebView that is already expanded.");
                        return;
                    } else {
                        c3648nc.i(false);
                        interfaceC4084vh.H0(C3648nc.a(map), "1".equals(map.get("custom_close")), z13);
                        return;
                    }
                }
                if ("webapp".equalsIgnoreCase(str5)) {
                    c3648nc.i(false);
                    boolean z15 = ((Boolean) rVar2.f40509c.a(AbstractC3592ma.rd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
                    if (str4 != null) {
                        interfaceC4084vh.N0("1".equals(map.get("custom_close")), C3648nc.a(map), str4, z13, z15);
                        return;
                    } else {
                        interfaceC4084vh.i0("1".equals(map.get("custom_close")), C3648nc.a(map), (String) map.get(com.onesignal.inAppMessages.internal.d.HTML), (String) map.get("baseurl"), z13);
                        return;
                    }
                }
                boolean z16 = z13;
                if ("chrome_custom_tab".equalsIgnoreCase(str5)) {
                    Context context = interfaceC4084vh.getContext();
                    if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32807G5)).booleanValue()) {
                        w2.z.k("User opt out chrome custom tab.");
                        c3648nc.j(10);
                    } else {
                        if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.f33210z5)).booleanValue()) {
                            String b9 = AbstractC4820f.b(context);
                            if (b9 != null && !context.getPackageName().equals(b9)) {
                                z12 = true;
                            }
                        } else {
                            z12 = C4131wa.a(context);
                        }
                        if (z12) {
                            boolean z17 = z14;
                            boolean z18 = z6;
                            String str7 = str6;
                            c3648nc.i(true);
                            if (TextUtils.isEmpty(str4)) {
                                int i10 = w2.z.f41712b;
                                x2.i.f("Cannot open browser with null or empty url");
                                c3648nc.j(7);
                                return;
                            }
                            Uri c10 = C3648nc.c(C3648nc.b(interfaceC4084vh.getContext(), interfaceC4084vh.Q0(), Uri.parse(str4), interfaceC4084vh.V(), interfaceC4084vh.j(), interfaceC4084vh.g0()));
                            if (z18 && c3648nc.f33531x != null && c3648nc.f(interfaceC4919a, interfaceC4084vh.getContext(), c10.toString(), str7)) {
                                return;
                            }
                            c3648nc.f33525B = new C3486kc(c3648nc);
                            String uri = c10.toString();
                            InterfaceC5097a interfaceC5097a = c3648nc.f33525B;
                            Bundle bundle = new Bundle();
                            if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32800F5)).booleanValue()) {
                                if (map.containsKey("cct_init_h")) {
                                    try {
                                        bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                                    } catch (NumberFormatException e9) {
                                        w2.z.l("Invalid cct initial height parameter.", e9);
                                        C4906k.f40186C.f40196h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e9);
                                    }
                                }
                                if (map.containsKey("cct_bp")) {
                                    try {
                                        bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                                    } catch (NumberFormatException e10) {
                                        w2.z.l("Invalid cct close button position parameter.", e10);
                                        C4906k.f40186C.f40196h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e10);
                                    }
                                }
                            }
                            interfaceC4084vh.v0(new C5101e(null, uri, null, null, null, null, null, null, new Y2.b(interfaceC5097a), true, bundle), z16, z17, str7);
                            return;
                        }
                        c3648nc.j(4);
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    c3648nc.h(interfaceC4919a, map, z6, str6, z16, z14);
                    return;
                }
                boolean z19 = z14;
                boolean z20 = z6;
                String str8 = str6;
                if ("app".equalsIgnoreCase(str5) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    c3648nc.h(interfaceC4919a, map, z20, str8, z16, z19);
                    return;
                }
                if ("open_app".equalsIgnoreCase(str5)) {
                    if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.t9)).booleanValue()) {
                        c3648nc.i(true);
                        String str9 = (String) map.get("p");
                        if (str9 == null) {
                            int i11 = w2.z.f41712b;
                            x2.i.f("Package name missing from open app action.");
                            return;
                        }
                        if (z20 && c3648nc.f33531x != null && c3648nc.f(interfaceC4919a, interfaceC4084vh.getContext(), str9, str8)) {
                            return;
                        }
                        PackageManager packageManager = interfaceC4084vh.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i12 = w2.z.f41712b;
                            x2.i.f("Cannot get package manager from open app action.");
                            return;
                        } else {
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str9);
                            if (launchIntentForPackage != null) {
                                interfaceC4084vh.v0(new C5101e(launchIntentForPackage, c3648nc.f33525B), z16, z19, str8);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                c3648nc.i(true);
                String str10 = (String) map.get("intent_url");
                if (!TextUtils.isEmpty(str10)) {
                    try {
                        parseUri = Intent.parseUri(str10, 0);
                    } catch (URISyntaxException e11) {
                        String valueOf = String.valueOf(str10);
                        int i13 = w2.z.f41712b;
                        x2.i.d("Error parsing the url: ".concat(valueOf), e11);
                    }
                    if (parseUri != null && parseUri.getData() != null) {
                        data = parseUri.getData();
                        if (!Uri.EMPTY.equals(data)) {
                            Uri c11 = C3648nc.c(C3648nc.b(interfaceC4084vh.getContext(), interfaceC4084vh.Q0(), data, interfaceC4084vh.V(), interfaceC4084vh.j(), interfaceC4084vh.g0()));
                            if (!TextUtils.isEmpty(parseUri.getType())) {
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.u9)).booleanValue()) {
                                    parseUri.setDataAndType(c11, parseUri.getType());
                                }
                            }
                            parseUri.setData(c11);
                        }
                    }
                    C3324ha c3324ha2 = AbstractC3592ma.P9;
                    rVar = s2.r.f40506e;
                    z9 = !((Boolean) rVar.f40509c.a(c3324ha2)).booleanValue() && "intent_async".equalsIgnoreCase(str5) && map.containsKey("event_id");
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.oe)).booleanValue() || (c3548lk = c3648nc.f33533z) == null) {
                        z10 = z20;
                        str = str4;
                    } else {
                        synchronized (c3548lk.f32616n) {
                            int i14 = c3548lk.f32618v.f28365E0;
                            if (i14 <= 0 || c3548lk.f32614A) {
                                z10 = z20;
                                str = str4;
                            } else {
                                C3559lv c3559lv = c3548lk.f32622z;
                                z10 = z20;
                                c3548lk.f32619w.getClass();
                                str = str4;
                                long currentTimeMillis = System.currentTimeMillis();
                                c3559lv.h();
                                ((C3613mv) c3559lv.f28504u).C(currentTimeMillis);
                                c3548lk.f32614A = true;
                                c3548lk.f32621y.schedule(new RunnableC3493kj(4, c3548lk), i14, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.qe)).booleanValue() && c3648nc.f33524A != null && map.get("hf") != null && ((String) map.get("hf")).equals("2") && map.get("hstp") != null) {
                        try {
                            String str11 = (String) map.get("hstp");
                            str2 = (String) map.get("hsr");
                            str3 = (String) map.get("hseqp");
                            boolean equals = ((String) map.getOrDefault("hsat", "false")).equals("true");
                            if (str2 != null && str3 != null) {
                                if (!TextUtils.isEmpty(str3)) {
                                    try {
                                        w3 = d6.c.w(new JSONObject(str3));
                                    } catch (JSONException e12) {
                                        int i15 = w2.z.f41712b;
                                        if (x2.i.j(4)) {
                                            Log.i("Ads", "Failed to parse extra query params", e12);
                                        }
                                        C4906k.f40186C.f40196h.d("OpenGmsgHandler.parseHsdpExtraQueryParams", e12);
                                    }
                                    C3334hk c3334hk = c3648nc.f33524A;
                                    Context context2 = ((InterfaceC4084vh) interfaceC4919a).getContext();
                                    BinderC3540lc binderC3540lc = new BinderC3540lc(c3648nc, str8);
                                    a9 = c3334hk.a(context2);
                                    if (a9 != null) {
                                        a9.open(new Y2.b(context2), str11, str2, w3, equals, binderC3540lc);
                                        return;
                                    }
                                    return;
                                }
                                w3 = null;
                                C3334hk c3334hk2 = c3648nc.f33524A;
                                Context context22 = ((InterfaceC4084vh) interfaceC4919a).getContext();
                                BinderC3540lc binderC3540lc2 = new BinderC3540lc(c3648nc, str8);
                                a9 = c3334hk2.a(context22);
                                if (a9 != null) {
                                }
                            }
                            w2.z.k("HSDP service parameters missing.");
                        } catch (Throwable th) {
                            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.te)).booleanValue()) {
                                C2521Ce.c(interfaceC4084vh.getContext()).e("HsdpServiceUnsampled.invokeOpen", th);
                            } else {
                                C2521Ce.a(interfaceC4084vh.getContext()).e("HsdpService.invokeOpen", th);
                            }
                        }
                    }
                    HashMap hashMap = new HashMap();
                    if (z9) {
                        z11 = z16;
                    } else {
                        C3594mc c3594mc = new C3594mc(c3648nc, z16, interfaceC4919a, hashMap, map);
                        c3648nc = c3648nc;
                        interfaceC4919a = interfaceC4919a;
                        map = map;
                        c3648nc.f33525B = c3594mc;
                        z11 = false;
                    }
                    if (parseUri == null) {
                        if (!z10 || c3648nc.f33531x == null || !c3648nc.f(interfaceC4919a, interfaceC4084vh.getContext(), parseUri.getData().toString(), str8)) {
                            interfaceC4084vh.v0(new C5101e(parseUri, c3648nc.f33525B), z11, z19, str8);
                            return;
                        } else {
                            if (z9) {
                                hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                                ((InterfaceC2672Lc) interfaceC4919a).d("openIntentAsync", hashMap);
                                return;
                            }
                            return;
                        }
                    }
                    String uri2 = !TextUtils.isEmpty(str) ? C3648nc.c(C3648nc.b(interfaceC4084vh.getContext(), interfaceC4084vh.Q0(), Uri.parse(str), interfaceC4084vh.V(), interfaceC4084vh.j(), interfaceC4084vh.g0())).toString() : str;
                    if (!z10 || c3648nc.f33531x == null || !c3648nc.f(interfaceC4919a, interfaceC4084vh.getContext(), uri2, str8)) {
                        interfaceC4084vh.v0(new C5101e((String) map.get("i"), uri2, (String) map.get(com.anythink.expressad.f.a.b.dI), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), c3648nc.f33525B), z11, z19, str8);
                        return;
                    } else {
                        if (z9) {
                            hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                            ((InterfaceC2672Lc) interfaceC4919a).d("openIntentAsync", hashMap);
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
                C3324ha c3324ha22 = AbstractC3592ma.P9;
                rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha22)).booleanValue()) {
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.oe)).booleanValue()) {
                }
                z10 = z20;
                str = str4;
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.qe)).booleanValue()) {
                    String str112 = (String) map.get("hstp");
                    str2 = (String) map.get("hsr");
                    str3 = (String) map.get("hseqp");
                    boolean equals2 = ((String) map.getOrDefault("hsat", "false")).equals("true");
                    if (str2 != null) {
                        if (!TextUtils.isEmpty(str3)) {
                        }
                        w3 = null;
                        C3334hk c3334hk22 = c3648nc.f33524A;
                        Context context222 = ((InterfaceC4084vh) interfaceC4919a).getContext();
                        BinderC3540lc binderC3540lc22 = new BinderC3540lc(c3648nc, str8);
                        a9 = c3334hk22.a(context222);
                        if (a9 != null) {
                        }
                    }
                    w2.z.k("HSDP service parameters missing.");
                }
                HashMap hashMap2 = new HashMap();
                if (z9) {
                }
                if (parseUri == null) {
                }
                break;
            case 9:
                ((C2677Lh) this.f25833x).t((Map) obj, (List) this.f25830u, (String) this.f25831v);
                return;
            case 10:
                ((C2712Ni) this.f25833x).f27298e.a(new RunnableC3888s0(6, (C4260yv) this.f25830u, (String) obj, (C4543G) this.f25832w));
                return;
            case 14:
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) obj;
                St st = (St) this.f25830u;
                interfaceC4084vh2.Y0(st, (Ut) this.f25831v);
                C2677Lh h02 = interfaceC4084vh2.h0();
                C3324ha c3324ha3 = AbstractC3592ma.zb;
                s2.r rVar3 = s2.r.f40506e;
                if (((Boolean) rVar3.f40509c.a(c3324ha3)).booleanValue() && h02 != null) {
                    C4036un c4036un = (C4036un) this.f25833x;
                    C2821Tp c2821Tp = c4036un.i;
                    C4260yv c4260yv = c4036un.f35347j;
                    C2712Ni c2712Ni2 = (C2712Ni) this.f25832w;
                    h02.x(c2712Ni2, c2821Tp, c4260yv);
                    h02.y(c2712Ni2, c4036un.i, c4036un.f35342d);
                }
                if (!((Boolean) rVar3.f40509c.a(AbstractC3592ma.Ee)).booleanValue() || h02 == null) {
                    return;
                }
                C2641Jf c2641Jf = C4906k.f40186C.f40212y;
                C2575Fh c2575Fh = h02.f26950n;
                if (c2641Jf.a(c2575Fh.getContext())) {
                    h02.c("/logScionEvent");
                    new HashMap();
                    h02.b("/logScionEvent", new C3111dc(i6, c2575Fh.getContext(), st.f28432w0));
                    return;
                }
                return;
            case 20:
                C3719ot c3719ot = (C3719ot) this.f25833x;
                C3547lj c3547lj = (C3547lj) obj;
                synchronized (c3719ot) {
                    if (c3547lj != null) {
                        try {
                            c3547lj.b();
                        } finally {
                        }
                    }
                    if (c3719ot.f33759m) {
                        c3719ot.c();
                    }
                    if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu = (Vu) this.f25830u) == null) {
                        Wu wu = c3719ot.i;
                        Su su = (Su) this.f25831v;
                        su.g(c3547lj.f25622a.f29533b);
                        su.m(c3547lj.f25627f.f34470n);
                        su.a(true);
                        wu.b(su.q());
                    } else {
                        vu.e(c3547lj.f25622a.f29533b);
                        vu.g(c3547lj.f25627f.f34470n);
                        Su su2 = (Su) this.f25831v;
                        su2.a(true);
                        vu.a(su2);
                        vu.h();
                    }
                }
                return;
            case 22:
                String str12 = (String) obj;
                InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) this.f25830u;
                St J8 = interfaceC4084vh3.J();
                if (J8 != null && !J8.f28405i0) {
                    C4543G c4543g = J8.f28434x0;
                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vb)).booleanValue() || (c2712Ni = (C2712Ni) this.f25831v) == null || !C2712Ni.b(str12)) {
                        ((C4260yv) this.f25832w).b(str12, c4543g, null, null);
                        return;
                    }
                    C4260yv c4260yv2 = (C4260yv) this.f25832w;
                    Random random = C4949p.f40498g.f40503e;
                    if (TextUtils.isEmpty(str12)) {
                        return;
                    }
                    P3.a s9 = QC.s(c2712Ni.c(str12, c2712Ni.f27297d.f27117a, random), ((Integer) r5.f40509c.a(AbstractC3592ma.Ib)).intValue(), TimeUnit.MILLISECONDS, c2712Ni.f27300g);
                    s9.a(new LD(i4, s9, new C2590Gf(c2712Ni, c4260yv2, str12, c4543g)), c2712Ni.f27298e);
                    return;
                }
                Ut z03 = interfaceC4084vh3.z0();
                if (z03 == null) {
                    C4906k.f40186C.f40196h.d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                boolean z21 = false;
                C4906k c4906k = C4906k.f40186C;
                c4906k.f40198k.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                boolean i16 = c4906k.f40196h.i(interfaceC4084vh3.getContext());
                boolean z22 = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33038g7)).booleanValue() && J8 != null && J8.f28382S;
                if (J8 != null && J8.f28396d0 != null) {
                    z21 = true;
                }
                C3732p5 c3732p5 = new C3732p5(z03.f28801b, str12, (i16 || z22 || z21) ? 2 : 1, currentTimeMillis2);
                C2821Tp c2821Tp2 = (C2821Tp) this.f25833x;
                c2821Tp2.getClass();
                c2821Tp2.a(new S0.l(17, c2821Tp2, c3732p5));
                return;
            default:
                x2.k kVar = (x2.k) obj;
                C4260yv c4260yv3 = (C4260yv) this.f25833x;
                Su su3 = (Su) this.f25830u;
                if (su3 != null) {
                    su3.a(kVar == x2.k.f41872n);
                    Vu vu2 = (Vu) this.f25831v;
                    if (vu2 == null) {
                        c4260yv3.f36029f.b(su3.q());
                    } else {
                        vu2.a(su3);
                        vu2.h();
                    }
                }
                C2799Sk c2799Sk = (C2799Sk) this.f25832w;
                if (c2799Sk == null) {
                    return;
                }
                String str13 = c4260yv3.f36027d.f41879v;
                if (TextUtils.isEmpty(str13)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str13);
                    String optString = jSONObject.optString("type");
                    String optString2 = jSONObject.optString(com.anythink.core.common.k.f15082T);
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
                            g1Var = new s2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j6);
                            if (t8.g.B((C3075cu) c2799Sk.f28335x.f29532a.f32643u) == 1) {
                            }
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                        }
                        long j62 = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        g1Var = new s2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j62);
                        if (t8.g.B((C3075cu) c2799Sk.f28335x.f29532a.f32643u) == 1) {
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
                                g1Var = new s2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j622);
                                if ((t8.g.B((C3075cu) c2799Sk.f28335x.f29532a.f32643u) == 1) && c2799Sk.f28333v.f28360B0 && c2799Sk.f28334w.compareAndSet(false, true)) {
                                    c2799Sk.M1(new C3717or(18, g1Var));
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
                            g1Var = new s2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j6222);
                            if (t8.g.B((C3075cu) c2799Sk.f28335x.f29532a.f32643u) == 1) {
                                c2799Sk.M1(new C3717or(18, g1Var));
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
                            g1Var = new s2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j62222);
                            if (t8.g.B((C3075cu) c2799Sk.f28335x.f29532a.f32643u) == 1) {
                            }
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                        }
                        long j622222 = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        g1Var = new s2.g1(i, c12 == 0 ? c12 != 1 ? c12 != 2 ? 0 : 3 : 2 : 1, optString3, j622222);
                        if (t8.g.B((C3075cu) c2799Sk.f28335x.f29532a.f32643u) == 1) {
                        }
                    }
                } catch (JSONException e13) {
                    C4906k.f40186C.f40196h.d("UrlPinger.pingUrl", e13);
                    return;
                }
                break;
        }
    }

    public void o(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f25831v = Integer.valueOf(i);
    }

    public synchronized void p(AbstractC3194f5 abstractC3194f5) {
        try {
            HashMap hashMap = (HashMap) this.f25830u;
            String d9 = abstractC3194f5.d();
            List list = (List) hashMap.remove(d9);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (AbstractC3462k5.f32156a) {
                AbstractC3462k5.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), d9);
            }
            AbstractC3194f5 abstractC3194f52 = (AbstractC3194f5) list.remove(0);
            hashMap.put(d9, list);
            synchronized (abstractC3194f52.f30833x) {
                abstractC3194f52.f30827D = this;
            }
            try {
                ((PriorityBlockingQueue) this.f25832w).put(abstractC3194f52);
            } catch (InterruptedException e9) {
                AbstractC3462k5.c("Couldn't add request to queue. %s", e9.toString());
                Thread.currentThread().interrupt();
                X4 x42 = (X4) this.f25831v;
                x42.f29262w = true;
                x42.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3251g8 q(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f25832w;
        String string = i == 1 ? sharedPreferences.getString(D(), null) : sharedPreferences.getString(A(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] j6 = V2.b.j(string);
                C3251g8 F8 = C3251g8.F(JK.s(j6, 0, j6.length));
                String A9 = F8.A();
                File c9 = MA.c(A9, "pcam.jar", u());
                if (!c9.exists()) {
                    c9 = MA.c(A9, "pcam", u());
                }
                File c10 = MA.c(A9, "pcbc", u());
                if (c9.exists()) {
                    if (c10.exists()) {
                        return F8;
                    }
                }
            } catch (C3318hL unused) {
            }
        }
        return null;
    }

    public void r() {
        this.f25832w = 16;
    }

    public synchronized boolean s(AbstractC3194f5 abstractC3194f5) {
        try {
            HashMap hashMap = (HashMap) this.f25830u;
            String d9 = abstractC3194f5.d();
            if (!hashMap.containsKey(d9)) {
                hashMap.put(d9, null);
                synchronized (abstractC3194f5.f30833x) {
                    abstractC3194f5.f30827D = this;
                }
                if (AbstractC3462k5.f32156a) {
                    AbstractC3462k5.b("new request, sending to network %s", d9);
                }
                return false;
            }
            List list = (List) hashMap.get(d9);
            if (list == null) {
                list = new ArrayList();
            }
            abstractC3194f5.a("waiting-for-response");
            list.add(abstractC3194f5);
            hashMap.put(d9, list);
            if (AbstractC3462k5.f32156a) {
                AbstractC3462k5.b("Request for cacheKey=%s is in flight, putting on hold.", d9);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3456k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3523lC t(int i, A8 a82, int[] iArr) {
        boolean z6;
        int i4;
        int i6;
        int i9;
        int i10;
        int i11;
        Point point;
        int i12;
        A8 a83 = a82;
        int i13 = ((int[]) this.f25832w)[i];
        Point point2 = (Point) this.f25833x;
        C3350i c3350i = (C3350i) this.f25830u;
        int i14 = point2 != null ? point2.x : c3350i.f26443e;
        int i15 = point2 != null ? point2.y : c3350i.f26444f;
        boolean z9 = c3350i.f26446h;
        if (i14 == Integer.MAX_VALUE) {
            z6 = true;
            i4 = Integer.MAX_VALUE;
        } else if (i15 == Integer.MAX_VALUE) {
            i4 = Integer.MAX_VALUE;
            z6 = true;
        } else {
            int i16 = Integer.MAX_VALUE;
            for (int i17 = 0; i17 < a83.f24415a; i17++) {
                DP dp = a83.f24418d[i17];
                int i18 = dp.f25183v;
                if (i18 > 0 && (i9 = dp.f25184w) > 0) {
                    if (z9) {
                        if ((i18 > i9) != (i14 > i15)) {
                            i11 = i15;
                            i10 = i14;
                            if (i18 * i10 < i9 * i11) {
                                String str = AbstractC3182eu.f30782a;
                                point = new Point(i11, ((r12 + i18) - 1) / i18);
                            } else {
                                String str2 = AbstractC3182eu.f30782a;
                                point = new Point(((r9 + i9) - 1) / i9, i10);
                            }
                            i12 = i18 * i9;
                            if (i18 >= ((int) (point.x * 0.98f)) && i9 >= ((int) (point.y * 0.98f)) && i12 < i16) {
                                i16 = i12;
                            }
                        }
                    }
                    i10 = i15;
                    i11 = i14;
                    if (i18 * i10 < i9 * i11) {
                    }
                    i12 = i18 * i9;
                    if (i18 >= ((int) (point.x * 0.98f))) {
                        i16 = i12;
                    }
                }
            }
            z6 = true;
            i4 = i16;
        }
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i19 = 0;
        int i20 = 0;
        while (i19 < a83.f24415a) {
            DP dp2 = a83.f24418d[i19];
            int i21 = dp2.f25183v;
            int i22 = (i21 == -1 || (i6 = dp2.f25184w) == -1) ? -1 : i21 * i6;
            C3618n c3618n = new C3618n(i, a83, i19, c3350i, iArr[i19], (String) this.f25831v, (i4 == Integer.MAX_VALUE || (i22 != -1 && i22 <= i4)) ? z6 : false);
            int length = objArr.length;
            int i23 = i20 + 1;
            int d9 = MB.d(length, i23);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i20] = c3618n;
            i19++;
            i20 = i23;
            a83 = a82;
        }
        return RB.p(objArr, i20);
    }

    public File u() {
        File file = new File((File) this.f25830u, Integer.toString(((EnumC2983b8) this.f25833x).f30015n));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public C2646Jk v(Set set) {
        return new C2646Jk(set);
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Vu vu;
        int i;
        switch (this.f25829n) {
            case 6:
                C4906k.f40186C.f40196h.d("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 9:
                String valueOf = String.valueOf((Uri) this.f25832w);
                int i4 = w2.z.f41712b;
                x2.i.f("Failed to parse gmsg params for: ".concat(valueOf));
                return;
            case 10:
                ((C2712Ni) this.f25833x).f27298e.a(new RunnableC2846Vg(this, th, (C4260yv) this.f25830u, (String) this.f25831v, (C4543G) this.f25832w));
                return;
            case 14:
                return;
            case 20:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32825I6)).booleanValue()) {
                    w2.z.l("Banner ad failed to load", th);
                }
                C3719ot c3719ot = (C3719ot) this.f25833x;
                synchronized (c3719ot) {
                    C3600mi c3600mi = (C3600mi) this.f25832w;
                    C4969z0 t6 = SK.t(th, ((C2730Oj) c3600mi.f33236I0.f()).f27425l);
                    c3719ot.f33760n = t6;
                    ((C4141wk) c3600mi.f33338y0.f()).I(t6);
                    AbstractC2991bG.h(t6.f40512n, "BannerAdLoader.onFailure", th);
                    if (c3719ot.f33759m) {
                        c3719ot.e();
                        C2898Yk c2898Yk = c3719ot.f33755h;
                        C3441jl c3441jl = c3719ot.f33756j;
                        synchronized (c3441jl) {
                            i = c3441jl.f32097n;
                        }
                        c2898Yk.R1(i);
                    }
                    if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu = (Vu) this.f25830u) == null) {
                        Wu wu = c3719ot.i;
                        Su su = (Su) this.f25831v;
                        su.h(t6);
                        su.d(th);
                        su.a(false);
                        wu.b(su.q());
                    } else {
                        vu.f(t6);
                        Su su2 = (Su) this.f25831v;
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
                Su su3 = (Su) this.f25830u;
                if (su3 == null) {
                    return;
                }
                su3.a(false);
                Vu vu2 = (Vu) this.f25831v;
                if (vu2 == null) {
                    ((C4260yv) this.f25833x).f36029f.b(su3.q());
                    return;
                } else {
                    vu2.a(su3);
                    vu2.h();
                    return;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    public void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        int i6;
        C4302zj c4302zj;
        int i9;
        int i10;
        Cr cr;
        int O8;
        int i11 = 128;
        Cr cr2 = (Cr) this.f25830u;
        cr2.z(i + i4, bArr);
        cr2.E(i);
        if (((Inflater) this.f25833x) == null) {
            this.f25833x = new Inflater();
        }
        Inflater inflater = (Inflater) this.f25833x;
        Cr cr3 = (Cr) this.f25831v;
        if (AbstractC3182eu.i(cr2, cr3, inflater)) {
            cr2.z(cr3.f24999c, cr3.f24997a);
        }
        D3 d32 = (D3) this.f25832w;
        int i12 = 0;
        d32.f25068d = 0;
        d32.f25069e = 0;
        d32.f25070f = 0;
        d32.f25071g = 0;
        d32.f25072h = 0;
        d32.i = 0;
        Cr cr4 = d32.f25065a;
        cr4.y(0);
        d32.f25067c = false;
        ArrayList arrayList = new ArrayList();
        while (cr2.B() >= 3) {
            int i13 = cr2.f24999c;
            int K7 = cr2.K();
            int L2 = cr2.L();
            int i14 = cr2.f24998b + L2;
            if (i14 > i13) {
                cr2.E(i13);
                i6 = i11;
                i9 = i12;
                c4302zj = null;
            } else {
                int[] iArr = d32.f25066b;
                if (K7 != i11) {
                    switch (K7) {
                        case 20:
                            if (L2 % 5 != 2) {
                                cr = cr2;
                            } else {
                                cr2.G(2);
                                Arrays.fill(iArr, i12);
                                int i15 = L2 / 5;
                                int i16 = i12;
                                while (i16 < i15) {
                                    int K8 = cr2.K();
                                    int K9 = cr2.K();
                                    int K10 = cr2.K();
                                    double d9 = K9;
                                    int K11 = cr2.K() - 128;
                                    int K12 = cr2.K() << 24;
                                    String str = AbstractC3182eu.f30782a;
                                    double d10 = K10 - 128;
                                    double d11 = K11;
                                    iArr[K8] = (Math.max(0, Math.min((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), com.anythink.basead.exoplayer.k.p.f9259b)) << 8) | K12 | (Math.max(0, Math.min((int) ((1.402d * d10) + d9), com.anythink.basead.exoplayer.k.p.f9259b)) << 16) | Math.max(0, Math.min((int) ((d11 * 1.772d) + d9), com.anythink.basead.exoplayer.k.p.f9259b));
                                    i16++;
                                    cr2 = cr2;
                                }
                                cr = cr2;
                                d32.f25067c = true;
                            }
                            cr2 = cr;
                            i6 = 128;
                            c4302zj = null;
                            i9 = 0;
                            break;
                        case 21:
                            if (L2 >= 4) {
                                cr2.G(3);
                                int i17 = L2 - 4;
                                if ((cr2.K() & i11) != 0) {
                                    if (i17 >= 7 && (O8 = cr2.O()) >= 4) {
                                        d32.f25072h = cr2.L();
                                        d32.i = cr2.L();
                                        cr4.y(O8 - 4);
                                        i17 = L2 - 11;
                                    }
                                }
                                int i18 = cr4.f24998b;
                                int i19 = cr4.f24999c;
                                if (i18 < i19 && i17 > 0) {
                                    int min = Math.min(i17, i19 - i18);
                                    cr2.H(cr4.f24997a, i18, min);
                                    cr4.E(i18 + min);
                                }
                            }
                            i6 = i11;
                            i9 = i12;
                            c4302zj = null;
                            break;
                        case 22:
                            if (L2 >= 19) {
                                d32.f25068d = cr2.L();
                                d32.f25069e = cr2.L();
                                cr2.G(11);
                                d32.f25070f = cr2.L();
                                d32.f25071g = cr2.L();
                            }
                            i6 = i11;
                            i9 = i12;
                            c4302zj = null;
                            break;
                        default:
                            i6 = i11;
                            i9 = i12;
                            c4302zj = null;
                            break;
                    }
                } else {
                    Cr cr5 = cr2;
                    if (d32.f25068d == 0 || d32.f25069e == 0 || d32.f25072h == 0 || d32.i == 0 || (i10 = cr4.f24999c) == 0 || cr4.f24998b != i10 || !d32.f25067c) {
                        i6 = 128;
                        c4302zj = null;
                    } else {
                        cr4.E(0);
                        int i20 = d32.f25072h * d32.i;
                        int[] iArr2 = new int[i20];
                        int i21 = 0;
                        while (i21 < i20) {
                            int K13 = cr4.K();
                            if (K13 != 0) {
                                iArr2[i21] = iArr[K13];
                                i21++;
                            } else {
                                int K14 = cr4.K();
                                if (K14 != 0) {
                                    int i22 = K14 & 63;
                                    if ((K14 & 64) != 0) {
                                        i22 = (i22 << 8) | cr4.K();
                                    }
                                    int i23 = (K14 & 128) == 0 ? iArr[0] : iArr[cr4.K()];
                                    int i24 = i21 + i22;
                                    Arrays.fill(iArr2, i21, i24, i23);
                                    i21 = i24;
                                }
                            }
                        }
                        i6 = 128;
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, d32.f25072h, d32.i, Bitmap.Config.ARGB_8888);
                        float f2 = d32.f25070f;
                        float f9 = d32.f25068d;
                        float f10 = f2 / f9;
                        float f11 = d32.f25071g;
                        float f12 = d32.f25069e;
                        c4302zj = new C4302zj(null, null, null, createBitmap, f11 / f12, 0, 0, f10, 0, Integer.MIN_VALUE, -3.4028235E38f, d32.f25072h / f9, d32.i / f12, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i9 = 0;
                    d32.f25068d = 0;
                    d32.f25069e = 0;
                    d32.f25070f = 0;
                    d32.f25071g = 0;
                    d32.f25072h = 0;
                    d32.i = 0;
                    cr4.y(0);
                    d32.f25067c = false;
                    cr2 = cr5;
                }
                cr2.E(i14);
            }
            if (c4302zj != null) {
                arrayList.add(c4302zj);
            }
            i11 = i6;
            i12 = i9;
        }
        bVar.mo9a(new C3676o3(arrayList, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b));
    }

    public BE y() {
        C3128du c3128du;
        C3263gK b9;
        GE ge = (GE) this.f25830u;
        if (ge == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        C3128du c3128du2 = (C3128du) this.f25831v;
        if (c3128du2 == null || (c3128du = (C3128du) this.f25832w) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (ge.f25744a != ((C3263gK) c3128du2.f30647u).f31325a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ge.f25745b != ((C3263gK) c3128du.f30647u).f31325a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ge.a() && ((Integer) this.f25833x) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((GE) this.f25830u).a() && ((Integer) this.f25833x) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3579mE c3579mE = ((GE) this.f25830u).f25748e;
        if (c3579mE == C3579mE.f32693A) {
            b9 = AbstractC3367iG.f31791a;
        } else if (c3579mE == C3579mE.f32709z) {
            b9 = AbstractC3367iG.a(((Integer) this.f25833x).intValue());
        } else {
            if (c3579mE != C3579mE.f32708y) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((GE) this.f25830u).f25748e)));
            }
            b9 = AbstractC3367iG.b(((Integer) this.f25833x).intValue());
        }
        return new BE((GE) this.f25830u, (C3128du) this.f25831v, (C3128du) this.f25832w, b9, (Integer) this.f25833x);
    }

    public JE z() {
        Integer num = (Integer) this.f25830u;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f25831v) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f25832w) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = ((Integer) this.f25831v).intValue();
        ((Integer) this.f25832w).getClass();
        return new JE(intValue, intValue2, (C3902sE) this.f25833x);
    }

    public C2590Gf(Context context, RD rd, Set set, Vu vu) {
        this.f25829n = 19;
        this.f25830u = context;
        this.f25832w = rd;
        this.f25831v = set;
        this.f25833x = vu;
    }

    public C2590Gf(Context context, ExecutorService executorService, Cw cw, Hw hw) {
        this.f25829n = 24;
        this.f25830u = context;
        this.f25831v = executorService;
        this.f25832w = cw;
    }

    public C2590Gf(View view, InterfaceC4084vh interfaceC4084vh, InterfaceC2560Ej interfaceC2560Ej, Tt tt) {
        this.f25829n = 11;
        this.f25831v = view;
        this.f25833x = interfaceC4084vh;
        this.f25830u = interfaceC2560Ej;
        this.f25832w = tt;
    }

    public C2590Gf(St st, InterfaceC2741Pd interfaceC2741Pd, m2.b bVar) {
        this.f25829n = 17;
        this.f25833x = null;
        this.f25830u = st;
        this.f25831v = interfaceC2741Pd;
        this.f25832w = bVar;
    }

    public /* synthetic */ C2590Gf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f25829n = i;
        this.f25830u = obj;
        this.f25831v = obj2;
        this.f25832w = obj3;
        this.f25833x = obj4;
    }

    public C2590Gf(int i) {
        this.f25829n = i;
        switch (i) {
            case 7:
                this.f25830u = new Object();
                this.f25831v = new Object();
                break;
            case 28:
                this.f25830u = null;
                this.f25831v = null;
                this.f25832w = null;
                this.f25833x = null;
                break;
            case 29:
                this.f25830u = null;
                this.f25831v = null;
                this.f25832w = null;
                this.f25833x = C3902sE.f34683j;
                break;
            default:
                this.f25830u = new Cr();
                this.f25831v = new Cr();
                this.f25832w = new D3();
                break;
        }
    }

    public C2590Gf(Context context, EnumC2983b8 enumC2983b8) {
        this.f25829n = 25;
        this.f25832w = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        MA.G(dir, false);
        this.f25830u = dir;
        File dir2 = context.getDir("tmppccache", 0);
        MA.G(dir2, true);
        this.f25831v = dir2;
        this.f25833x = enumC2983b8;
    }

    public C2590Gf(Context context, String str) {
        String packageName;
        this.f25829n = 5;
        this.f25832w = context;
        this.f25833x = str;
        this.f25830u = (String) AbstractC2991bG.f30042C.r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25831v = linkedHashMap;
        linkedHashMap.put(com.anythink.core.common.s.f17036a, "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        linkedHashMap.put("device", w2.D.O());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != w2.D.f(context) ? "0" : "1");
        Qx qx = c4906k.f40203p;
        qx.getClass();
        P3.a b9 = AbstractC3436jg.f32055a.b(new E2.w(context, qx));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C2810Te) b9.get()).f28541j));
            linkedHashMap.put("network_fine", Integer.toString(((C2810Te) b9.get()).f28542k));
        } catch (Exception e9) {
            C4906k.f40186C.f40196h.d("CsiConfiguration.CsiConfiguration", e9);
        }
        C3324ha c3324ha = AbstractC3592ma.Kc;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f25831v;
            w2.D d10 = C4906k.f40186C.f40191c;
            linkedHashMap2.put("is_bstar", true != w2.D.d(context) ? "0" : "1");
        }
        C3324ha c3324ha2 = AbstractC3592ma.La;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32995c3)).booleanValue()) {
            C4906k c4906k2 = C4906k.f40186C;
            if (SK.n(c4906k2.f40196h.f30308g)) {
                return;
            }
            ((LinkedHashMap) this.f25831v).put("plugin", c4906k2.f40196h.f30308g);
        }
    }

    private final void j(Throwable th) {
    }

    private final void k(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C2590Gf(JsonReader jsonReader, Bundle bundle) {
        this.f25829n = 21;
        this.f25833x = bundle;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() && bundle != null) {
            C4906k.f40186C.f40198k.getClass();
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
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32837K2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", ut.f28817s);
                            bundle.putLong("normalize-ad-response-end", ut.f28818t);
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
                            jSONObject = d6.c.r(jsonReader);
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
        this.f25832w = arrayList;
        this.f25830u = r02;
        this.f25831v = ut == null ? new Ut(new JsonReader(new StringReader("{}"))) : ut;
    }

    public C2590Gf(X4 x42, PriorityBlockingQueue priorityBlockingQueue, Ux ux) {
        this.f25829n = 4;
        this.f25830u = new HashMap();
        this.f25833x = ux;
        this.f25831v = x42;
        this.f25832w = priorityBlockingQueue;
    }

    public C2590Gf(C3648nc c3648nc, Map map, InterfaceC4919a interfaceC4919a, String str) {
        this.f25829n = 6;
        this.f25830u = map;
        this.f25831v = interfaceC4919a;
        this.f25832w = str;
        Objects.requireNonNull(c3648nc);
        this.f25833x = c3648nc;
    }

    public C2590Gf(C3219fd c3219fd, C2858Wc c2858Wc, Object obj, C3490kg c3490kg) {
        this.f25829n = 8;
        this.f25830u = c2858Wc;
        this.f25831v = obj;
        this.f25832w = c3490kg;
        Objects.requireNonNull(c3219fd);
        this.f25833x = c3219fd;
    }

    public C2590Gf(C2677Lh c2677Lh, List list, String str, Uri uri) {
        this.f25829n = 9;
        this.f25830u = list;
        this.f25831v = str;
        this.f25832w = uri;
        Objects.requireNonNull(c2677Lh);
        this.f25833x = c2677Lh;
    }

    public C2590Gf(C2712Ni c2712Ni, C4260yv c4260yv, String str, C4543G c4543g) {
        this.f25829n = 10;
        this.f25830u = c4260yv;
        this.f25831v = str;
        this.f25832w = c4543g;
        Objects.requireNonNull(c2712Ni);
        this.f25833x = c2712Ni;
    }

    public C2590Gf(C3819ql c3819ql) {
        this.f25829n = 26;
        this.f25833x = this;
        this.f25830u = c3819ql;
        C3266gN a9 = C3266gN.a(new C3773pt((C3374iN) c3819ql.f34161b, (C3374iN) c3819ql.f34163d, (C3266gN) c3819ql.f34170l, C3266gN.a(AbstractC2792Sd.f28291H), (C3266gN) c3819ql.f34172n, (C3266gN) c3819ql.i, (C3374iN) c3819ql.f34164e));
        this.f25831v = a9;
        this.f25832w = C3266gN.a(new C3119dk((C3374iN) c3819ql.f34163d, a9, (C3266gN) c3819ql.f34170l, (C3266gN) c3819ql.f34169k, C3266gN.a(AbstractC2659Kg.f26724I), new C3079cy(this), (C3374iN) c3819ql.f34164e, 7));
    }

    public C2590Gf(C4036un c4036un, St st, Ut ut, C2712Ni c2712Ni) {
        this.f25829n = 14;
        this.f25830u = st;
        this.f25831v = ut;
        this.f25832w = c2712Ni;
        this.f25833x = c4036un;
    }

    public C2590Gf(C3019br c3019br, Yt yt, St st, C3500kq c3500kq) {
        this.f25829n = 18;
        this.f25830u = yt;
        this.f25831v = st;
        this.f25832w = c3500kq;
        Objects.requireNonNull(c3019br);
        this.f25833x = c3019br;
    }

    public C2590Gf(C3719ot c3719ot, Vu vu, Su su, C3600mi c3600mi) {
        this.f25829n = 20;
        this.f25830u = vu;
        this.f25831v = su;
        this.f25832w = c3600mi;
        Objects.requireNonNull(c3719ot);
        this.f25833x = c3719ot;
    }

    public C2590Gf(C4260yv c4260yv, Su su, Vu vu, C2799Sk c2799Sk) {
        this.f25829n = 23;
        this.f25830u = su;
        this.f25831v = vu;
        this.f25832w = c2799Sk;
        Objects.requireNonNull(c4260yv);
        this.f25833x = c4260yv;
    }

    public C2590Gf(C3523lC c3523lC, S0.l lVar, S0.s sVar, C3067cm c3067cm) {
        Object obj;
        this.f25829n = 27;
        if (c3523lC != null) {
            obj = RB.n(c3523lC);
        } else {
            PB pb = RB.f27933u;
            obj = C3523lC.f32525x;
        }
        this.f25830u = obj;
        this.f25831v = lVar;
        this.f25832w = sVar;
        this.f25833x = c3067cm;
    }
}
