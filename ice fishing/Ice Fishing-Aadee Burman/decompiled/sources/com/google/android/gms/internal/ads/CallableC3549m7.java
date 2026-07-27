package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.ext.SdkExtensions;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4900p;
import u2.C5069B;
import u2.C5070a;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3549m7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31907b;

    public /* synthetic */ CallableC3549m7(int i, Object obj) {
        this.f31906a = i;
        this.f31907b = obj;
    }

    private final Object a() {
        q2.r rVar;
        String str;
        boolean z3;
        C2749Qo c2749Qo = (C2749Qo) ((C3157es) this.f31907b).f29991c;
        synchronized (c2749Qo) {
            C3301ha c3301ha = AbstractC3569ma.ka;
            rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && c2749Qo.f()) {
                long j6 = c2749Qo.f27095q;
                C4835j.f39730C.f39742k.getClass();
                if (j6 < System.currentTimeMillis() / 1000) {
                    c2749Qo.f27093o = "{}";
                    c2749Qo.f27095q = Long.MAX_VALUE;
                    str = "";
                } else if (!c2749Qo.f27093o.equals("{}")) {
                    str = c2749Qo.f27093o;
                }
            }
            str = "";
        }
        synchronized (c2749Qo) {
            z3 = c2749Qo.f27097s;
        }
        return new C4288zs(str, z3, C4835j.f39730C.f39746o.g(), c2749Qo.f27094p != null, c2749Qo.f27101w < ((Long) rVar.f40207c.a(AbstractC3569ma.Fa)).longValue());
    }

    private final Object b() {
        HashMap hashMap;
        C3691oo c3691oo = (C3691oo) ((C3157es) this.f31907b).f29991c;
        synchronized (c3691oo) {
            hashMap = new HashMap();
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.H8)).booleanValue()) {
                c3691oo.b();
                for (Map.Entry entry : c3691oo.f32945a.entrySet()) {
                    hashMap.put((C3637no) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new Ds(hashMap, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.U3)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r9 = com.google.android.gms.internal.ads.Sx.f(r0);
        r11 = ((java.lang.Long) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32245f4)).longValue();
        r14 = p2.C4835j.f39730C.f39740h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Sx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        r5 = r9.a(null, r11, null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Sx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        if (((java.lang.Boolean) r6.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32153V3)).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r9 = com.google.android.gms.internal.ads.Tx.f(r0);
        r0 = com.google.android.gms.internal.ads.Qx.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0107, code lost:
    
        if (((v2.C5110a) r1.f26667e).f41390v < ((java.lang.Integer) r6.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32207b4)).intValue()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
    
        r11 = ((java.lang.Long) r6.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.g4)).longValue();
        r14 = p2.C4835j.f39730C.f39740h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Tx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        r5 = r9.f27380g;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        r5 = ((android.content.SharedPreferences) ((S0.e) r5.f27139u).f2782v).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
    
        if (r5 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        r5 = new com.google.android.gms.internal.ads.C3381j1(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Tx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015b, code lost:
    
        r6 = ((android.content.SharedPreferences) ((S0.e) r0.f27139u).f2782v).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0169, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0174, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0179, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017a, code lost:
    
        r4 = ((android.content.SharedPreferences) ((S0.e) r0.f27139u).f2782v).getBoolean("paidv2_user_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        r5 = r3;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r5 = r9.a(null, r11, null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Tx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        if (((java.lang.Boolean) r6.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32171X3)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0064, code lost:
    
        if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32162W3)).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Or or = (Or) this.f31907b;
        or.getClass();
        try {
            Context context = (Context) or.f26665c;
            boolean a9 = ((C3052cu) or.f26664b).a();
            C3381j1 c3381j1 = new C3381j1(5);
            C3381j1 c3381j12 = new C3381j1(5);
            if (a9) {
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32179Y3)).booleanValue()) {
                    return new Gs(true);
                }
            }
            if (!a9) {
            }
            if (a9) {
            }
            C3301ha c3301ha = AbstractC3569ma.f32217c4;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                if (((C5110a) or.f26667e).f41390v < ((Integer) rVar.f40207c.a(AbstractC3569ma.f32207b4)).intValue()) {
                    Tx.f(context).g();
                }
            }
            if (!a9) {
            }
            if (a9) {
            }
            C3381j1 c3381j13 = c3381j12;
            boolean z3 = true;
            boolean z6 = true;
            return new Gs(c3381j1, c3381j13, z3, z6, a9);
        } catch (IOException e9) {
            C4835j.f39730C.f39740h.d("PerAppIdSignal", e9);
            return new Gs(((C3052cu) or.f26664b).a());
        }
    }

    private final Object d() {
        Or or = (Or) this.f31907b;
        Context context = (Context) or.f26665c;
        boolean d2 = V2.c.a(context).d();
        u2.D d9 = C4835j.f39730C.f39735c;
        boolean f3 = u2.D.f(context);
        String str = ((C5110a) or.f26664b).f41388n;
        int myUid = Process.myUid();
        boolean z3 = myUid == 0 || myUid == 1000;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new Ms(d2, f3, str, z3, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, X2.c.d(context, false), X2.c.a(context), (String) or.f26667e);
    }

    private final Object e() {
        C3050cs c3050cs = (C3050cs) this.f31907b;
        c3050cs.getClass();
        return new C2943as(3, t8.g.M(c3050cs.f29614c, (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32190Z6)));
    }

    private final Object f() {
        Context context = ((C3050cs) this.f31907b).f29614c;
        return new Qs(AbstractC2639Kg.B(context, "init_without_write"), AbstractC2639Kg.B(context, "crash_without_write"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:3|(2:6|4)|7|8|(3:71|72|(24:74|75|76|77|78|12|13|(20:15|16|17|18|19|20|(1:22)(3:59|(1:61)|62)|23|(3:26|(3:29|(11:32|33|34|(1:56)(1:38)|39|(2:41|(1:43)(1:54))(1:55)|44|(1:46)(1:53)|(1:48)(1:52)|49|50)(1:31)|27)|57)|58|34|(1:36)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50)|67|20|(0)(0)|23|(3:26|(1:27)|57)|58|34|(0)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50))|10|11|12|13|(0)|67|20|(0)(0)|23|(0)|58|34|(0)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5 A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #9 {Exception -> 0x0117, blocks: (B:13:0x00d7, B:15:0x00e5), top: B:12:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0684 -> B:273:0x0690). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        long j6;
        String str;
        byte[] bArr;
        AbstractC3825rE abstractC3825rE;
        Bundle bundle;
        InterfaceC3680od interfaceC3680od;
        int i;
        int i6;
        int extensionVersion;
        int extensionVersion2;
        boolean z3;
        int i9;
        int i10;
        boolean z6;
        int intExtra;
        boolean z9;
        int intExtra2;
        JSONObject jSONObject;
        String str2;
        String str3;
        Bundle bundle2;
        Boolean bool;
        FrameLayout frameLayout;
        ActivityInfo activityInfo;
        int i11;
        int i12;
        PackageInfo c9;
        String sb;
        String str4;
        C3301ha c3301ha;
        q2.r rVar;
        String str5;
        String str6;
        List<ResolveInfo> queryIntentActivities;
        boolean z10;
        int i13;
        PackageInfo c10;
        int i14 = 2;
        int i15 = 3;
        int i16 = 0;
        switch (this.f31906a) {
            case 0:
                Context context = (Context) this.f31907b;
                try {
                    return AbstractC2772Sd.f(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                Context context2 = ((C3038cg) this.f31907b).f29521e;
                int i17 = AbstractC2837We.f28362a;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo c11 = V2.c.a(context2).c(4096, context2.getApplicationInfo().packageName);
                    if (c11.requestedPermissions != null && c11.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = c11.requestedPermissions;
                            if (i16 < strArr.length) {
                                if ((c11.requestedPermissionsFlags[i16] & 2) != 0) {
                                    arrayList.add(strArr[i16]);
                                }
                                i16++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                return arrayList;
            case 2:
                C2707Og c2707Og = (C2707Og) this.f31907b;
                return Boolean.valueOf(c2707Og.f26629w.f(c2707Og.f26630x, c2707Og.f26631y, c2707Og));
            case 3:
                C3200fh c3200fh = (C3200fh) this.f31907b;
                c3200fh.getClass();
                T8 t82 = C4835j.f39730C.f39741j;
                X8 x82 = c3200fh.f30293G;
                synchronized (t82.f27697v) {
                    try {
                        j6 = -2;
                        if (((Y8) t82.f27700y) != null) {
                            if (((W8) t82.f27698w).A()) {
                                try {
                                    Y8 y82 = (Y8) t82.f27700y;
                                    Parcel H02 = y82.H0();
                                    AbstractC3388j8.c(H02, x82);
                                    Parcel M02 = y82.M0(H02, 3);
                                    long readLong = M02.readLong();
                                    M02.recycle();
                                    j6 = readLong;
                                } catch (RemoteException e9) {
                                    int i18 = u2.z.f41319b;
                                    v2.i.d("Unable to call into cache service.", e9);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Long.valueOf(j6);
            case 4:
                CookieManager cookieManager = (CookieManager) this.f31907b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32389v1));
            case 5:
                return ((C2665Lp) this.f31907b).getWritableDatabase();
            case 6:
                return ((C2800Tp) this.f31907b).getWritableDatabase();
            case 7:
                Or or = (Or) this.f31907b;
                or.getClass();
                ArrayList arrayList2 = new ArrayList();
                View view = (ViewGroup) or.f26667e;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("type", parent.getClass().getName());
                        bundle3.putInt("index_of_child", indexOfChild);
                        arrayList2.add(bundle3);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new Pr(i16, (Context) or.f26665c, ((C3052cu) or.f26664b).f29625f, arrayList2);
                }
                return new Pr(i16, (Context) or.f26665c, ((C3052cu) or.f26664b).f29625f, arrayList2);
            case 8:
                Sr sr = (Sr) this.f31907b;
                sr.getClass();
                C3301ha c3301ha2 = AbstractC3569ma.f32157V7;
                q2.r rVar2 = q2.r.f40204e;
                if (((Boolean) rVar2.f40207c.a(c3301ha2)).booleanValue()) {
                    if ((((Boolean) rVar2.f40207c.a(AbstractC3569ma.f32175X7)).booleanValue() ? Arrays.asList(((String) rVar2.f40207c.a(AbstractC3569ma.Y7)).split(",")) : Arrays.asList(((String) rVar2.f40207c.a(AbstractC3569ma.f32166W7)).split(","))).contains(com.bumptech.glide.d.m(com.bumptech.glide.d.n(sr.f27567c.f29623d)))) {
                        try {
                            C3182fG c3182fG = C3182fG.f30239b;
                            synchronized (c3182fG) {
                                HashMap hashMap = c3182fG.f30240a;
                                if (!hashMap.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                abstractC3825rE = (AbstractC3825rE) hashMap.get("AES128_GCM");
                            }
                            if (abstractC3825rE == null) {
                                try {
                                    abstractC3825rE = AbstractC4094wD.f(((C4151xG) C3290hG.f30754b.h(null)).f34969b.b());
                                } catch (GeneralSecurityException e10) {
                                    throw new B0.c("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
                                }
                            }
                            S0.l P8 = S0.l.P(abstractC3825rE);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    P8.M().c(byteArrayOutputStream);
                                    byteArrayOutputStream.close();
                                    bArr = byteArrayOutputStream.toByteArray();
                                } catch (Throwable th) {
                                    byteArrayOutputStream.close();
                                    throw th;
                                }
                            } catch (IOException unused3) {
                                throw new GeneralSecurityException("Serialize keyset failed");
                            }
                        } catch (GeneralSecurityException e11) {
                            u2.z.k("Failed to generate key".concat(e11.toString()));
                            C4835j.f39730C.f39740h.d("CryptoUtils.generateKey", e11);
                            bArr = new byte[0];
                        }
                        str = Base64.encodeToString(bArr, 11);
                        return new Tr(str, i16);
                    }
                }
                str = null;
                return new Tr(str, i16);
            case 9:
                Or or2 = (Or) this.f31907b;
                or2.getClass();
                List<String> asList = Arrays.asList(((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32177Y1)).split(";"));
                Bundle bundle4 = new Bundle();
                for (String str7 : asList) {
                    try {
                        C3535lu a9 = ((C2748Qn) or2.f26665c).a(str7, new JSONObject());
                        a9.a();
                        boolean z11 = ((C2494Bo) or2.f26664b).f23954b;
                        bundle = new Bundle();
                        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.cd)).booleanValue();
                        interfaceC3680od = a9.f31864a;
                        if (!booleanValue || z11) {
                            try {
                                C2804Ud k02 = interfaceC3680od.k0();
                                if (k02 != null) {
                                    try {
                                        bundle.putString(com.anythink.expressad.foundation.g.a.bs, k02.toString());
                                    } catch (C3267gu unused4) {
                                    }
                                }
                            } catch (Throwable th2) {
                                throw new C3267gu(th2);
                                break;
                            }
                        }
                    } catch (C3267gu unused5) {
                    }
                    try {
                        C2804Ud i02 = interfaceC3680od.i0();
                        if (i02 != null) {
                            try {
                                bundle.putString("adapter_version", i02.toString());
                            } catch (C3267gu unused6) {
                            }
                        }
                        bundle4.putBundle(str7, bundle);
                    } catch (Throwable th3) {
                        throw new C3267gu(th3);
                        break;
                    }
                }
                C2943as c2943as = new C2943as(0, bundle4);
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.cd)).booleanValue()) {
                    ((C2997bs) or2.f26667e).f29340b = c2943as;
                }
                return c2943as;
            case 10:
                ContentResolver contentResolver = (ContentResolver) this.f31907b;
                return new C3103ds(i16, Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 11:
                Ur ur = (Ur) this.f31907b;
                return new C3103ds(i14, ((C3052cu) ur.f27999c).f29629k, ((C3199fg) ur.f28000d).f30286z);
            case 12:
                C5110a c5110a = (C5110a) ((C3157es) this.f31907b).f29991c;
                C3301ha c3301ha3 = AbstractC3569ma.vb;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = q2.r.f40204e.f40207c;
                if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).booleanValue()) {
                    return new C3425js(0, null);
                }
                u2.D d2 = C4835j.f39730C.f39735c;
                try {
                    i6 = Build.VERSION.SDK_INT;
                } catch (Exception e12) {
                    C4835j.f39730C.f39740h.d("AdUtil.getAdServicesExtensionVersion", e12);
                }
                if (i6 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i = SdkExtensions.getExtensionVersion(1000000);
                        return new C3425js(0, Integer.valueOf(i));
                    }
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.yb)).booleanValue() && c5110a.f41390v >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.xb)).intValue() && i6 >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                        return new C3425js(0, Integer.valueOf(i));
                    }
                }
                i = 0;
                return new C3425js(0, Integer.valueOf(i));
            case 13:
                AudioManager audioManager = (AudioManager) ((C3050cs) this.f31907b).f29614c.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
                C4835j c4835j = C4835j.f39730C;
                float a10 = c4835j.i.a();
                C5070a c5070a = c4835j.i;
                synchronized (c5070a) {
                    z3 = c5070a.f41249a;
                }
                if (audioManager == null) {
                    return new C3479ks(-1, false, false, -1, -1, -1, -1, -1, a10, z3, true);
                }
                int mode = audioManager.getMode();
                boolean isMusicActive = audioManager.isMusicActive();
                boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.sc)).booleanValue()) {
                    i9 = c4835j.f39738f.w(audioManager);
                    i10 = audioManager.getStreamMaxVolume(3);
                } else {
                    i9 = -1;
                    i10 = -1;
                }
                return new C3479ks(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i9, i10, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a10, z3, false);
            case 14:
                C3050cs c3050cs = (C3050cs) this.f31907b;
                c3050cs.getClass();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.wd)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) c3050cs.f29614c.getSystemService("batterymanager");
                    r9 = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        z9 = batteryManager.isCharging();
                        return new C3533ls(z9, r9);
                    }
                    Intent a11 = c3050cs.a();
                    z6 = a11 != null && ((intExtra2 = a11.getIntExtra("status", -1)) == 2 || intExtra2 == 5);
                } else {
                    Intent a12 = c3050cs.a();
                    z6 = a12 != null && ((intExtra = a12.getIntExtra("status", -1)) == 2 || intExtra == 5);
                    if (a12 != null) {
                        r9 = a12.getIntExtra("level", -1) / a12.getIntExtra("scale", -1);
                    }
                }
                z9 = z6;
                return new C3533ls(z9, r9);
            case 15:
                Or or3 = (Or) this.f31907b;
                C3052cu c3052cu = (C3052cu) or3.f26664b;
                C2782Sn c2782Sn = (C2782Sn) or3.f26665c;
                c2782Sn.getClass();
                C3301ha c3301ha4 = AbstractC3569ma.f32145U4;
                q2.r rVar3 = q2.r.f40204e;
                boolean booleanValue2 = ((Boolean) rVar3.f40207c.a(c3301ha4)).booleanValue();
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar3.f40207c;
                if (booleanValue2 && (str2 = c3052cu.f29626g) != null && (str3 = (String) or3.f26667e) != null) {
                    if (!c2782Sn.f27552d) {
                        c2782Sn.a();
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32154V4)).booleanValue() && !c2782Sn.f27554f.getAndSet(true)) {
                            C4835j.f39730C.f39740h.g().f41208c.add(new RunnableC2765Rn(c2782Sn, 0));
                        }
                    }
                    Map map = (Map) c2782Sn.f27549a.get(str3);
                    if (map != null) {
                        JSONObject jSONObject2 = (JSONObject) map.get(str2);
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2;
                        } else {
                            String g4 = AbstractC2639Kg.g(c2782Sn.f27553e, str2, str3);
                            if (g4 != null) {
                                jSONObject = (JSONObject) map.get(g4);
                            }
                        }
                        return new C3910ss(i16, jSONObject, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32163W4)).booleanValue() ? null : c2782Sn.f27550b);
                    }
                }
                jSONObject = null;
                return new C3910ss(i16, jSONObject, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32163W4)).booleanValue() ? null : c2782Sn.f27550b);
            case 16:
                C3050cs c3050cs2 = (C3050cs) this.f31907b;
                c3050cs2.getClass();
                u2.D d9 = C4835j.f39730C.f39735c;
                C3301ha c3301ha5 = AbstractC3569ma.f32165W6;
                q2.r rVar4 = q2.r.f40204e;
                boolean booleanValue3 = ((Boolean) rVar4.f40207c.a(c3301ha5)).booleanValue();
                Context context3 = c3050cs2.f29614c;
                String string = !booleanValue3 ? "" : context3.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                C3301ha c3301ha6 = AbstractC3569ma.f32182Y6;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3 = rVar4.f40207c;
                String string2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(c3301ha6)).booleanValue() ? context3.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(AbstractC3569ma.f32174X6)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                    bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    while (i16 < 4) {
                        String str8 = strArr2[i16];
                        if (defaultSharedPreferences.contains(str8)) {
                            bundle2.putString(str8, defaultSharedPreferences.getString(str8, null));
                        }
                        i16++;
                    }
                } else {
                    bundle2 = null;
                }
                return new C4126ws(string, string2, bundle2);
            case 17:
                C3050cs c3050cs3 = (C3050cs) this.f31907b;
                c3050cs3.getClass();
                u2.D d10 = C4835j.f39730C.f39735c;
                Object systemService = c3050cs3.f29614c.getSystemService("display");
                return new C3425js(1, systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
            case 18:
                return new Mr(2, "requester_type_2".equals(com.bumptech.glide.d.n(((Sr) this.f31907b).f27567c.f29623d)));
            case 19:
                Or or4 = (Or) this.f31907b;
                or4.getClass();
                C3301ha c3301ha7 = AbstractC3569ma.f32095O6;
                q2.r rVar5 = q2.r.f40204e;
                boolean booleanValue4 = ((Boolean) rVar5.f40207c.a(c3301ha7)).booleanValue();
                Set set = (Set) or4.f26667e;
                if (booleanValue4 && (frameLayout = (FrameLayout) or4.f26664b) != null && set.contains(com.anythink.expressad.foundation.g.a.f.f19123e)) {
                    return new C4234ys(Boolean.valueOf(frameLayout.isHardwareAccelerated()), 0);
                }
                if (((Boolean) rVar5.f40207c.a(AbstractC3569ma.f32103P6)).booleanValue() && set.contains(com.anythink.expressad.foundation.g.a.f.f19119a)) {
                    Context context4 = (Context) or4.f26665c;
                    if (context4 instanceof Activity) {
                        Activity activity = (Activity) context4;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & com.anythink.basead.exoplayer.b.bc) == 0) {
                            try {
                                bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                            } catch (PackageManager.NameNotFoundException unused7) {
                                bool = null;
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                        return new C4234ys(bool, 0);
                    }
                }
                return new C4234ys(null, 0);
            case 20:
                return a();
            case 21:
                Or or5 = (Or) this.f31907b;
                return new Pr(1, (C3052cu) or5.f26664b, (PackageInfo) or5.f26665c, (C5069B) or5.f26667e);
            case 22:
                ((C3749ps) this.f31907b).getClass();
                C3301ha c3301ha8 = AbstractC3569ma.f32266h6;
                q2.r rVar6 = q2.r.f40204e;
                if (!((Boolean) rVar6.f40207c.a(c3301ha8)).booleanValue()) {
                    return new Tr(null, i15);
                }
                if (!((Boolean) rVar6.f40207c.a(AbstractC3569ma.f32348q6)).booleanValue()) {
                    C4835j.f39730C.f39755x.getClass();
                    return new Tr(C3472kl.f(), i15);
                }
                if (C3749ps.f33149c == null) {
                    C4835j.f39730C.f39755x.getClass();
                    C3749ps.f33149c = C3472kl.f();
                }
                return new Tr(C3749ps.f33149c, i15);
            case 23:
                return b();
            case 24:
                return c();
            case 25:
                Ur ur2 = (Ur) this.f31907b;
                C2621Jf c2621Jf = (C2621Jf) ur2.f27998b;
                Context context5 = (Context) ur2.f28000d;
                if (!c2621Jf.a(context5)) {
                    return new Ls(null, null, null, null, null);
                }
                String b9 = c2621Jf.b(context5);
                String str9 = b9 == null ? "" : b9;
                String c12 = c2621Jf.c(context5);
                String str10 = c12 == null ? "" : c12;
                String d11 = c2621Jf.d(context5);
                String str11 = d11 == null ? "" : d11;
                String str12 = true != c2621Jf.a(context5) ? null : "fa";
                return new Ls(str9, str10, str11, str12 == null ? "" : str12, "TIME_OUT".equals(str10) ? (Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32115R0) : null);
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                Or or6 = (Or) this.f31907b;
                Context context6 = (Context) or6.f26665c;
                PackageManager packageManager = context6.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), com.anythink.basead.exoplayer.b.aX);
                ResolveInfo resolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), com.anythink.basead.exoplayer.b.aX);
                String country = locale.getCountry();
                u2.D d12 = C4835j.f39730C.f39735c;
                v2.d dVar = C4900p.f40196g.f40197a;
                boolean s9 = v2.d.s();
                boolean h9 = T2.b.h(context6);
                boolean k9 = T2.b.k(context6);
                String language = locale.getLanguage();
                ArrayList arrayList3 = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i19 = 0; i19 < localeList.size(); i19++) {
                    arrayList3.add(localeList.get(i19).getLanguage());
                }
                ResolveInfo resolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), com.anythink.basead.exoplayer.b.aX);
                if (resolveActivity3 != null && (activityInfo = resolveActivity3.activityInfo) != null) {
                    try {
                        c9 = V2.c.a(context6).c(0, activityInfo.packageName);
                    } catch (PackageManager.NameNotFoundException unused8) {
                        i11 = 1;
                    }
                    if (c9 != null) {
                        int i20 = c9.versionCode;
                        String str13 = activityInfo.packageName;
                        i11 = 1;
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 1 + String.valueOf(str13).length());
                            sb2.append(i20);
                            sb2.append(com.anythink.core.common.d.j.f12378z);
                            sb2.append(str13);
                            sb = sb2.toString();
                            i12 = 1;
                        } catch (PackageManager.NameNotFoundException unused9) {
                            i12 = i11;
                            sb = null;
                            c10 = V2.c.a(context6).c(128, "com.android.vending");
                            if (c10 != null) {
                            }
                            str4 = null;
                            String str14 = Build.FINGERPRINT;
                            String language2 = Locale.getDefault().getLanguage();
                            c3301ha = AbstractC3569ma.af;
                            rVar = q2.r.f40204e;
                            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity4 = packageManager.resolveActivity(intent, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent, com.anythink.basead.exoplayer.b.aX);
                            if (queryIntentActivities != null) {
                            }
                            z10 = false;
                            u2.D d13 = C4835j.f39730C.f39735c;
                            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            C3301ha c3301ha9 = AbstractC3569ma.Lc;
                            q2.r rVar7 = q2.r.f40204e;
                            if (((Boolean) rVar7.f40207c.a(c3301ha9)).booleanValue()) {
                            }
                            C3301ha c3301ha10 = AbstractC3569ma.Pc;
                            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4 = rVar7.f40207c;
                            String j9 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4.a(c3301ha10)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4.a(AbstractC3569ma.Rc)).booleanValue() ? (String) or6.f26667e : v2.d.j(context6) : "";
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str15 = Build.MODEL;
                            return new Rs(r13, r14, country, s9, h9, k9, language, arrayList3, sb, str4, z10, availableBytes, r26, j9, Build.VERSION.SDK_INT, str5, str6, ((C3100dp) or6.f26664b).a());
                        }
                        c10 = V2.c.a(context6).c(128, "com.android.vending");
                        if (c10 != null) {
                            int i21 = c10.versionCode;
                            String str16 = c10.packageName;
                            int i22 = i12;
                            try {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i21).length() + i12 + String.valueOf(str16).length());
                                sb3.append(i21);
                                sb3.append(com.anythink.core.common.d.j.f12378z);
                                sb3.append(str16);
                                str4 = sb3.toString();
                                i12 = i22;
                            } catch (Exception unused10) {
                                i12 = i22;
                                str4 = null;
                                String str142 = Build.FINGERPRINT;
                                String language22 = Locale.getDefault().getLanguage();
                                c3301ha = AbstractC3569ma.af;
                                rVar = q2.r.f40204e;
                                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                                }
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                                ResolveInfo resolveActivity42 = packageManager.resolveActivity(intent2, 0);
                                queryIntentActivities = packageManager.queryIntentActivities(intent2, com.anythink.basead.exoplayer.b.aX);
                                if (queryIntentActivities != null) {
                                }
                                z10 = false;
                                u2.D d132 = C4835j.f39730C.f39735c;
                                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                C3301ha c3301ha92 = AbstractC3569ma.Lc;
                                q2.r rVar72 = q2.r.f40204e;
                                if (((Boolean) rVar72.f40207c.a(c3301ha92)).booleanValue()) {
                                }
                                C3301ha c3301ha102 = AbstractC3569ma.Pc;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka42 = rVar72.f40207c;
                                String j92 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka42.a(c3301ha102)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka42.a(AbstractC3569ma.Rc)).booleanValue() ? (String) or6.f26667e : v2.d.j(context6) : "";
                                if (resolveActivity2 == null) {
                                }
                                if (resolveActivity == null) {
                                }
                                String str152 = Build.MODEL;
                                return new Rs(r13, r14, country, s9, h9, k9, language, arrayList3, sb, str4, z10, availableBytes2, r26, j92, Build.VERSION.SDK_INT, str5, str6, ((C3100dp) or6.f26664b).a());
                            }
                            String str1422 = Build.FINGERPRINT;
                            String language222 = Locale.getDefault().getLanguage();
                            c3301ha = AbstractC3569ma.af;
                            rVar = q2.r.f40204e;
                            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                                k8.b I8 = u2.D.I(context6);
                                String str17 = (String) I8.f38706n;
                                str6 = (String) I8.f38707u;
                                str5 = str17;
                            } else {
                                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Ze)).booleanValue()) {
                                    language222 = (String) u2.D.I(context6).f38706n;
                                }
                                str5 = language222;
                                str6 = null;
                            }
                            Intent intent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity422 = packageManager.resolveActivity(intent22, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent22, com.anythink.basead.exoplayer.b.aX);
                            if (queryIntentActivities != null && resolveActivity422 != null) {
                                for (i13 = 0; i13 < queryIntentActivities.size(); i13 += i12) {
                                    if (resolveActivity422.activityInfo.name.equals(queryIntentActivities.get(i13).activityInfo.name)) {
                                        z10 = resolveActivity422.activityInfo.packageName.equals(AbstractC4094wD.a(context6));
                                        u2.D d1322 = C4835j.f39730C.f39735c;
                                        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                        C3301ha c3301ha922 = AbstractC3569ma.Lc;
                                        q2.r rVar722 = q2.r.f40204e;
                                        boolean z12 = (((Boolean) rVar722.f40207c.a(c3301ha922)).booleanValue() || !u2.D.d(context6)) ? 0 : i12;
                                        C3301ha c3301ha1022 = AbstractC3569ma.Pc;
                                        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka422 = rVar722.f40207c;
                                        String j922 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka422.a(c3301ha1022)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka422.a(AbstractC3569ma.Rc)).booleanValue() ? (String) or6.f26667e : v2.d.j(context6) : "";
                                        boolean z13 = resolveActivity2 == null ? i12 : 0;
                                        boolean z14 = resolveActivity == null ? i12 : 0;
                                        String str1522 = Build.MODEL;
                                        return new Rs(z14, z13, country, s9, h9, k9, language, arrayList3, sb, str4, z10, availableBytes22, z12, j922, Build.VERSION.SDK_INT, str5, str6, ((C3100dp) or6.f26664b).a());
                                    }
                                }
                            }
                            z10 = false;
                            u2.D d13222 = C4835j.f39730C.f39735c;
                            long availableBytes222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            C3301ha c3301ha9222 = AbstractC3569ma.Lc;
                            q2.r rVar7222 = q2.r.f40204e;
                            if (((Boolean) rVar7222.f40207c.a(c3301ha9222)).booleanValue()) {
                            }
                            C3301ha c3301ha10222 = AbstractC3569ma.Pc;
                            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4222 = rVar7222.f40207c;
                            String j9222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4222.a(c3301ha10222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4222.a(AbstractC3569ma.Rc)).booleanValue() ? (String) or6.f26667e : v2.d.j(context6) : "";
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str15222 = Build.MODEL;
                            return new Rs(z14, z13, country, s9, h9, k9, language, arrayList3, sb, str4, z10, availableBytes222, z12, j9222, Build.VERSION.SDK_INT, str5, str6, ((C3100dp) or6.f26664b).a());
                        }
                        str4 = null;
                        String str14222 = Build.FINGERPRINT;
                        String language2222 = Locale.getDefault().getLanguage();
                        c3301ha = AbstractC3569ma.af;
                        rVar = q2.r.f40204e;
                        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                        }
                        Intent intent222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity4222 = packageManager.resolveActivity(intent222, 0);
                        queryIntentActivities = packageManager.queryIntentActivities(intent222, com.anythink.basead.exoplayer.b.aX);
                        if (queryIntentActivities != null) {
                            while (i13 < queryIntentActivities.size()) {
                            }
                        }
                        z10 = false;
                        u2.D d132222 = C4835j.f39730C.f39735c;
                        long availableBytes2222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                        C3301ha c3301ha92222 = AbstractC3569ma.Lc;
                        q2.r rVar72222 = q2.r.f40204e;
                        if (((Boolean) rVar72222.f40207c.a(c3301ha92222)).booleanValue()) {
                        }
                        C3301ha c3301ha102222 = AbstractC3569ma.Pc;
                        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka42222 = rVar72222.f40207c;
                        String j92222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka42222.a(c3301ha102222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka42222.a(AbstractC3569ma.Rc)).booleanValue() ? (String) or6.f26667e : v2.d.j(context6) : "";
                        if (resolveActivity2 == null) {
                        }
                        if (resolveActivity == null) {
                        }
                        String str152222 = Build.MODEL;
                        return new Rs(z14, z13, country, s9, h9, k9, language, arrayList3, sb, str4, z10, availableBytes2222, z12, j92222, Build.VERSION.SDK_INT, str5, str6, ((C3100dp) or6.f26664b).a());
                    }
                }
                i12 = 1;
                sb = null;
                c10 = V2.c.a(context6).c(128, "com.android.vending");
                if (c10 != null) {
                }
                str4 = null;
                String str142222 = Build.FINGERPRINT;
                String language22222 = Locale.getDefault().getLanguage();
                c3301ha = AbstractC3569ma.af;
                rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                }
                Intent intent2222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity42222 = packageManager.resolveActivity(intent2222, 0);
                queryIntentActivities = packageManager.queryIntentActivities(intent2222, com.anythink.basead.exoplayer.b.aX);
                if (queryIntentActivities != null) {
                }
                z10 = false;
                u2.D d1322222 = C4835j.f39730C.f39735c;
                long availableBytes22222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                C3301ha c3301ha922222 = AbstractC3569ma.Lc;
                q2.r rVar722222 = q2.r.f40204e;
                if (((Boolean) rVar722222.f40207c.a(c3301ha922222)).booleanValue()) {
                }
                C3301ha c3301ha1022222 = AbstractC3569ma.Pc;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka422222 = rVar722222.f40207c;
                String j922222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka422222.a(c3301ha1022222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka422222.a(AbstractC3569ma.Rc)).booleanValue() ? (String) or6.f26667e : v2.d.j(context6) : "";
                if (resolveActivity2 == null) {
                }
                if (resolveActivity == null) {
                }
                String str1522222 = Build.MODEL;
                return new Rs(z14, z13, country, s9, h9, k9, language, arrayList3, sb, str4, z10, availableBytes22222, z12, j922222, Build.VERSION.SDK_INT, str5, str6, ((C3100dp) or6.f26664b).a());
        }
    }
}
