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
import r2.C4906k;
import s2.C4949p;
import w2.C5140B;
import w2.C5141a;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3572m7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32687b;

    public /* synthetic */ CallableC3572m7(int i, Object obj) {
        this.f32686a = i;
        this.f32687b = obj;
    }

    private final Object a() {
        s2.r rVar;
        String str;
        boolean z6;
        C2786Ro c2786Ro = (C2786Ro) ((C3180es) this.f32687b).f30780c;
        synchronized (c2786Ro) {
            C3324ha c3324ha = AbstractC3592ma.ka;
            rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && c2786Ro.f()) {
                long j6 = c2786Ro.f28039q;
                C4906k.f40186C.f40198k.getClass();
                if (j6 < System.currentTimeMillis() / 1000) {
                    c2786Ro.f28037o = "{}";
                    c2786Ro.f28039q = Long.MAX_VALUE;
                    str = "";
                } else if (!c2786Ro.f28037o.equals("{}")) {
                    str = c2786Ro.f28037o;
                }
            }
            str = "";
        }
        synchronized (c2786Ro) {
            z6 = c2786Ro.f28041s;
        }
        return new C4311zs(str, z6, C4906k.f40186C.f40202o.g(), c2786Ro.f28038p != null, c2786Ro.f28045w < ((Long) rVar.f40509c.a(AbstractC3592ma.Fa)).longValue());
    }

    private final Object b() {
        HashMap hashMap;
        C3768po c3768po = (C3768po) ((C3180es) this.f32687b).f30780c;
        synchronized (c3768po) {
            hashMap = new HashMap();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.H8)).booleanValue()) {
                c3768po.b();
                for (Map.Entry entry : c3768po.f33920a.entrySet()) {
                    hashMap.put((C3714oo) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new Ds(hashMap, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32924U3)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        r9 = com.google.android.gms.internal.ads.Sx.f(r0);
        r11 = ((java.lang.Long) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f33025f4)).longValue();
        r14 = r2.C4906k.f40186C.f40196h.g().t();
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
    
        if (((java.lang.Boolean) r6.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32933V3)).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r9 = com.google.android.gms.internal.ads.Tx.f(r0);
        r0 = com.google.android.gms.internal.ads.Qx.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0107, code lost:
    
        if (((x2.C5189a) r1.f27450e).f41847v < ((java.lang.Integer) r6.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32986b4)).intValue()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
    
        r11 = ((java.lang.Long) r6.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f33035g4)).longValue();
        r14 = r2.C4906k.f40186C.f40196h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Tx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        r5 = r9.f28094g;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        r5 = ((android.content.SharedPreferences) ((S0.e) r5.f27895u).f2909v).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.Qx.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
    
        if (r5 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        r5 = new com.google.android.gms.internal.ads.C3404j1(5);
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
    
        r6 = ((android.content.SharedPreferences) ((S0.e) r0.f27895u).f2909v).getBoolean("paidv2_publisher_option", true);
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
    
        r4 = ((android.content.SharedPreferences) ((S0.e) r0.f27895u).f2909v).getBoolean("paidv2_user_option", true);
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
    
        if (((java.lang.Boolean) r6.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32950X3)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0064, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.W3)).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Or or = (Or) this.f32687b;
        or.getClass();
        try {
            Context context = (Context) or.f27448c;
            boolean a9 = ((C3075cu) or.f27447b).a();
            C3404j1 c3404j1 = new C3404j1(5);
            C3404j1 c3404j12 = new C3404j1(5);
            if (a9) {
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32958Y3)).booleanValue()) {
                    return new Gs(true);
                }
            }
            if (!a9) {
            }
            if (a9) {
            }
            C3324ha c3324ha = AbstractC3592ma.f32996c4;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                if (((C5189a) or.f27450e).f41847v < ((Integer) rVar.f40509c.a(AbstractC3592ma.f32986b4)).intValue()) {
                    Tx.f(context).g();
                }
            }
            if (!a9) {
            }
            if (a9) {
            }
            C3404j1 c3404j13 = c3404j12;
            boolean z6 = true;
            boolean z9 = true;
            return new Gs(c3404j1, c3404j13, z6, z9, a9);
        } catch (IOException e9) {
            C4906k.f40186C.f40196h.d("PerAppIdSignal", e9);
            return new Gs(((C3075cu) or.f27447b).a());
        }
    }

    private final Object d() {
        Or or = (Or) this.f32687b;
        Context context = (Context) or.f27448c;
        boolean h3 = X2.b.a(context).h();
        w2.D d9 = C4906k.f40186C.f40191c;
        boolean f2 = w2.D.f(context);
        String str = ((C5189a) or.f27447b).f41845n;
        int myUid = Process.myUid();
        boolean z6 = myUid == 0 || myUid == 1000;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new Ms(h3, f2, str, z6, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, Z2.b.d(context, false), Z2.b.a(context), (String) or.f27450e);
    }

    private final Object e() {
        C3073cs c3073cs = (C3073cs) this.f32687b;
        c3073cs.getClass();
        return new C2966as(3, com.bumptech.glide.h.m(c3073cs.f30384c, (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32969Z6)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:3|(2:6|4)|7|8|(3:71|72|(24:74|75|76|77|78|12|13|(20:15|16|17|18|19|20|(1:22)(3:59|(1:61)|62)|23|(3:26|(3:29|(11:32|33|34|(1:56)(1:38)|39|(2:41|(1:43)(1:54))(1:55)|44|(1:46)(1:53)|(1:48)(1:52)|49|50)(1:31)|27)|57)|58|34|(1:36)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50)|67|20|(0)(0)|23|(3:26|(1:27)|57)|58|34|(0)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50))|10|11|12|13|(0)|67|20|(0)(0)|23|(0)|58|34|(0)|56|39|(0)(0)|44|(0)(0)|(0)(0)|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5 A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #4 {Exception -> 0x0117, blocks: (B:13:0x00d7, B:15:0x00e5), top: B:12:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0691 -> B:273:0x069d). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        long j6;
        String str;
        byte[] bArr;
        AbstractC3848rE abstractC3848rE;
        S0.l P8;
        int i;
        int i4;
        int extensionVersion;
        int extensionVersion2;
        boolean z6;
        int i6;
        int i9;
        boolean z9;
        int intExtra;
        boolean z10;
        int intExtra2;
        JSONObject jSONObject;
        String str2;
        String str3;
        Bundle bundle;
        Boolean bool;
        FrameLayout frameLayout;
        ActivityInfo activityInfo;
        int i10;
        int i11;
        PackageInfo g9;
        String sb;
        String str4;
        C3324ha c3324ha;
        s2.r rVar;
        String str5;
        String str6;
        List<ResolveInfo> queryIntentActivities;
        boolean z11;
        int i12;
        PackageInfo g10;
        int i13 = 2;
        int i14 = 3;
        int i15 = 0;
        switch (this.f32686a) {
            case 0:
                Context context = (Context) this.f32687b;
                try {
                    return AbstractC2792Sd.f(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                Context context2 = ((C3061cg) this.f32687b).f30306e;
                int i16 = AbstractC2860We.f29161a;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo g11 = X2.b.a(context2).g(4096, context2.getApplicationInfo().packageName);
                    if (g11.requestedPermissions != null && g11.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = g11.requestedPermissions;
                            if (i15 < strArr.length) {
                                if ((g11.requestedPermissionsFlags[i15] & 2) != 0) {
                                    arrayList.add(strArr[i15]);
                                }
                                i15++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                return arrayList;
            case 2:
                C2727Og c2727Og = (C2727Og) this.f32687b;
                return Boolean.valueOf(c2727Og.f27405w.f(c2727Og.f27406x, c2727Og.f27407y, c2727Og));
            case 3:
                C3223fh c3223fh = (C3223fh) this.f32687b;
                c3223fh.getClass();
                T8 t82 = C4906k.f40186C.f40197j;
                X8 x82 = c3223fh.f31081G;
                synchronized (t82.f28480v) {
                    try {
                        j6 = -2;
                        if (((Y8) t82.f28483y) != null) {
                            if (((W8) t82.f28481w).A()) {
                                try {
                                    Y8 y82 = (Y8) t82.f28483y;
                                    Parcel F02 = y82.F0();
                                    AbstractC3411j8.c(F02, x82);
                                    Parcel K02 = y82.K0(F02, 3);
                                    long readLong = K02.readLong();
                                    K02.recycle();
                                    j6 = readLong;
                                } catch (RemoteException e9) {
                                    int i17 = w2.z.f41712b;
                                    x2.i.d("Unable to call into cache service.", e9);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return Long.valueOf(j6);
            case 4:
                CookieManager cookieManager = (CookieManager) this.f32687b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33169v1));
            case 5:
                return ((C2685Lp) this.f32687b).getWritableDatabase();
            case 6:
                return ((C2821Tp) this.f32687b).getWritableDatabase();
            case 7:
                Or or = (Or) this.f32687b;
                or.getClass();
                ArrayList arrayList2 = new ArrayList();
                View view = (ViewGroup) or.f27450e;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("type", parent.getClass().getName());
                        bundle2.putInt("index_of_child", indexOfChild);
                        arrayList2.add(bundle2);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new Pr(i15, (Context) or.f27448c, ((C3075cu) or.f27447b).f30395f, arrayList2);
                }
                return new Pr(i15, (Context) or.f27448c, ((C3075cu) or.f27447b).f30395f, arrayList2);
            case 8:
                Sr sr = (Sr) this.f32687b;
                sr.getClass();
                C3324ha c3324ha2 = AbstractC3592ma.f32937V7;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                    if ((((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32954X7)).booleanValue() ? Arrays.asList(((String) rVar2.f40509c.a(AbstractC3592ma.Y7)).split(",")) : Arrays.asList(((String) rVar2.f40509c.a(AbstractC3592ma.f32945W7)).split(","))).contains(t8.g.s(t8.g.u(sr.f28350c.f30393d)))) {
                        try {
                            C3205fG c3205fG = C3205fG.f31026b;
                            synchronized (c3205fG) {
                                HashMap hashMap = c3205fG.f31027a;
                                if (!hashMap.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                abstractC3848rE = (AbstractC3848rE) hashMap.get("AES128_GCM");
                            }
                            if (abstractC3848rE == null) {
                                try {
                                    abstractC3848rE = AbstractC4117wD.f(((C4174xG) C3313hG.f31520b.h(null)).f35750b.b());
                                } catch (GeneralSecurityException e10) {
                                    throw new B0.c("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
                                }
                            }
                            P8 = S0.l.P(abstractC3848rE);
                        } catch (GeneralSecurityException e11) {
                            w2.z.k("Failed to generate key".concat(e11.toString()));
                            C4906k.f40186C.f40196h.d("CryptoUtils.generateKey", e11);
                            bArr = new byte[0];
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                P8.M().c(byteArrayOutputStream);
                                byteArrayOutputStream.close();
                                bArr = byteArrayOutputStream.toByteArray();
                                str = Base64.encodeToString(bArr, 11);
                                return new Tr(str, i15);
                            } catch (Throwable th) {
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (IOException unused3) {
                            throw new GeneralSecurityException("Serialize keyset failed");
                        }
                    }
                }
                str = null;
                return new Tr(str, i15);
            case 9:
                Or or2 = (Or) this.f32687b;
                or2.getClass();
                List<String> asList = Arrays.asList(((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32956Y1)).split(";"));
                Bundle bundle3 = new Bundle();
                for (String str7 : asList) {
                    try {
                        C3558lu a9 = ((C2785Rn) or2.f27448c).a(str7, new JSONObject());
                        a9.a();
                        boolean z12 = ((C2531Co) or2.f27447b).f24967b;
                        Bundle bundle4 = new Bundle();
                        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.cd)).booleanValue();
                        InterfaceC3703od interfaceC3703od = a9.f32644a;
                        if (!booleanValue || z12) {
                            try {
                                C2826Ud k02 = interfaceC3703od.k0();
                                if (k02 != null) {
                                    try {
                                        bundle4.putString(com.anythink.expressad.foundation.g.a.bs, k02.toString());
                                    } catch (C3290gu unused4) {
                                    }
                                }
                            } catch (Throwable th2) {
                                throw new C3290gu(th2);
                                break;
                            }
                        }
                        try {
                            C2826Ud i02 = interfaceC3703od.i0();
                            if (i02 != null) {
                                try {
                                    bundle4.putString("adapter_version", i02.toString());
                                } catch (C3290gu unused5) {
                                }
                            }
                            bundle3.putBundle(str7, bundle4);
                        } catch (Throwable th3) {
                            throw new C3290gu(th3);
                            break;
                        }
                    } catch (C3290gu unused6) {
                    }
                }
                C2966as c2966as = new C2966as(0, bundle3);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.cd)).booleanValue()) {
                    ((C3020bs) or2.f27450e).f30128b = c2966as;
                }
                return c2966as;
            case 10:
                ContentResolver contentResolver = (ContentResolver) this.f32687b;
                return new C3126ds(i15, Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 11:
                Ur ur = (Ur) this.f32687b;
                return new C3126ds(i13, ((C3075cu) ur.f28796c).f30399k, ((C3222fg) ur.f28797d).f31074z);
            case 12:
                C5189a c5189a = (C5189a) ((C3180es) this.f32687b).f30780c;
                C3324ha c3324ha3 = AbstractC3592ma.vb;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = s2.r.f40506e.f40509c;
                if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).booleanValue()) {
                    return new C3448js(0, null);
                }
                w2.D d9 = C4906k.f40186C.f40191c;
                try {
                    i4 = Build.VERSION.SDK_INT;
                } catch (Exception e12) {
                    C4906k.f40186C.f40196h.d("AdUtil.getAdServicesExtensionVersion", e12);
                }
                if (i4 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i = SdkExtensions.getExtensionVersion(1000000);
                        return new C3448js(0, Integer.valueOf(i));
                    }
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.yb)).booleanValue() && c5189a.f41847v >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.xb)).intValue() && i4 >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                        return new C3448js(0, Integer.valueOf(i));
                    }
                }
                i = 0;
                return new C3448js(0, Integer.valueOf(i));
            case 13:
                AudioManager audioManager = (AudioManager) ((C3073cs) this.f32687b).f30384c.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
                C4906k c4906k = C4906k.f40186C;
                float a10 = c4906k.i.a();
                C5141a c5141a = c4906k.i;
                synchronized (c5141a) {
                    z6 = c5141a.f41642a;
                }
                if (audioManager == null) {
                    return new C3502ks(-1, false, false, -1, -1, -1, -1, -1, a10, z6, true);
                }
                int mode = audioManager.getMode();
                boolean isMusicActive = audioManager.isMusicActive();
                boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.sc)).booleanValue()) {
                    i6 = c4906k.f40194f.z(audioManager);
                    i9 = audioManager.getStreamMaxVolume(3);
                } else {
                    i6 = -1;
                    i9 = -1;
                }
                return new C3502ks(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i6, i9, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a10, z6, false);
            case 14:
                C3073cs c3073cs = (C3073cs) this.f32687b;
                c3073cs.getClass();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.wd)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) c3073cs.f30384c.getSystemService("batterymanager");
                    r9 = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        z10 = batteryManager.isCharging();
                        return new C3556ls(z10, r9);
                    }
                    Intent a11 = c3073cs.a();
                    z9 = a11 != null && ((intExtra2 = a11.getIntExtra("status", -1)) == 2 || intExtra2 == 5);
                } else {
                    Intent a12 = c3073cs.a();
                    z9 = a12 != null && ((intExtra = a12.getIntExtra("status", -1)) == 2 || intExtra == 5);
                    if (a12 != null) {
                        r9 = a12.getIntExtra("level", -1) / a12.getIntExtra("scale", -1);
                    }
                }
                z10 = z9;
                return new C3556ls(z10, r9);
            case 15:
                Or or3 = (Or) this.f32687b;
                C3075cu c3075cu = (C3075cu) or3.f27447b;
                C2819Tn c2819Tn = (C2819Tn) or3.f27448c;
                c2819Tn.getClass();
                C3324ha c3324ha4 = AbstractC3592ma.f32925U4;
                s2.r rVar3 = s2.r.f40506e;
                boolean booleanValue2 = ((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue();
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar3.f40509c;
                if (booleanValue2 && (str2 = c3075cu.f30396g) != null && (str3 = (String) or3.f27450e) != null) {
                    if (!c2819Tn.f28581d) {
                        c2819Tn.a();
                        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f32934V4)).booleanValue() && !c2819Tn.f28583f.getAndSet(true)) {
                            C4906k.f40186C.f40196h.g().f41601c.add(new RunnableC2802Sn(c2819Tn, 0));
                        }
                    }
                    Map map = (Map) c2819Tn.f28578a.get(str3);
                    if (map != null) {
                        JSONObject jSONObject2 = (JSONObject) map.get(str2);
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2;
                        } else {
                            String g12 = AbstractC2659Kg.g(c2819Tn.f28582e, str2, str3);
                            if (g12 != null) {
                                jSONObject = (JSONObject) map.get(g12);
                            }
                        }
                        return new C3933ss(i15, jSONObject, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f32942W4)).booleanValue() ? null : c2819Tn.f28579b);
                    }
                }
                jSONObject = null;
                return new C3933ss(i15, jSONObject, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f32942W4)).booleanValue() ? null : c2819Tn.f28579b);
            case 16:
                C3073cs c3073cs2 = (C3073cs) this.f32687b;
                c3073cs2.getClass();
                w2.D d10 = C4906k.f40186C.f40191c;
                C3324ha c3324ha5 = AbstractC3592ma.f32944W6;
                s2.r rVar4 = s2.r.f40506e;
                boolean booleanValue3 = ((Boolean) rVar4.f40509c.a(c3324ha5)).booleanValue();
                Context context3 = c3073cs2.f30384c;
                String string = !booleanValue3 ? "" : context3.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                C3324ha c3324ha6 = AbstractC3592ma.f32961Y6;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3 = rVar4.f40509c;
                String string2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3.a(c3324ha6)).booleanValue() ? context3.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka3.a(AbstractC3592ma.f32953X6)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                    bundle = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    while (i15 < 4) {
                        String str8 = strArr2[i15];
                        if (defaultSharedPreferences.contains(str8)) {
                            bundle.putString(str8, defaultSharedPreferences.getString(str8, null));
                        }
                        i15++;
                    }
                } else {
                    bundle = null;
                }
                return new C4149ws(string, string2, bundle);
            case 17:
                C3073cs c3073cs3 = (C3073cs) this.f32687b;
                c3073cs3.getClass();
                w2.D d11 = C4906k.f40186C.f40191c;
                Object systemService = c3073cs3.f30384c.getSystemService("display");
                return new C3448js(1, systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
            case 18:
                return new Mr(2, "requester_type_2".equals(t8.g.u(((Sr) this.f32687b).f28350c.f30393d)));
            case 19:
                Or or4 = (Or) this.f32687b;
                or4.getClass();
                C3324ha c3324ha7 = AbstractC3592ma.f32874O6;
                s2.r rVar5 = s2.r.f40506e;
                boolean booleanValue4 = ((Boolean) rVar5.f40509c.a(c3324ha7)).booleanValue();
                Set set = (Set) or4.f27450e;
                if (booleanValue4 && (frameLayout = (FrameLayout) or4.f27447b) != null && set.contains(com.anythink.expressad.foundation.g.a.f.f19910e)) {
                    return new C4257ys(Boolean.valueOf(frameLayout.isHardwareAccelerated()), 0);
                }
                if (((Boolean) rVar5.f40509c.a(AbstractC3592ma.f32883P6)).booleanValue() && set.contains(com.anythink.expressad.foundation.g.a.f.f19906a)) {
                    Context context4 = (Context) or4.f27448c;
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
                        return new C4257ys(bool, 0);
                    }
                }
                return new C4257ys(null, 0);
            case 20:
                return a();
            case 21:
                Or or5 = (Or) this.f32687b;
                return new Pr(1, (C3075cu) or5.f27447b, (PackageInfo) or5.f27448c, (C5140B) or5.f27450e);
            case 22:
                ((C3772ps) this.f32687b).getClass();
                C3324ha c3324ha8 = AbstractC3592ma.f33046h6;
                s2.r rVar6 = s2.r.f40506e;
                if (!((Boolean) rVar6.f40509c.a(c3324ha8)).booleanValue()) {
                    return new Tr(null, i14);
                }
                if (!((Boolean) rVar6.f40509c.a(AbstractC3592ma.f33128q6)).booleanValue()) {
                    C4906k.f40186C.f40211x.getClass();
                    return new Tr(C3495kl.f(), i14);
                }
                if (C3772ps.f33935c == null) {
                    C4906k.f40186C.f40211x.getClass();
                    C3772ps.f33935c = C3495kl.f();
                }
                return new Tr(C3772ps.f33935c, i14);
            case 23:
                return b();
            case 24:
                return c();
            case 25:
                Ur ur2 = (Ur) this.f32687b;
                C2641Jf c2641Jf = (C2641Jf) ur2.f28795b;
                Context context5 = (Context) ur2.f28797d;
                if (!c2641Jf.a(context5)) {
                    return new Ls(null, null, null, null, null);
                }
                String b9 = c2641Jf.b(context5);
                String str9 = b9 == null ? "" : b9;
                String c9 = c2641Jf.c(context5);
                String str10 = c9 == null ? "" : c9;
                String d12 = c2641Jf.d(context5);
                String str11 = d12 == null ? "" : d12;
                String str12 = true != c2641Jf.a(context5) ? null : "fa";
                return new Ls(str9, str10, str11, str12 == null ? "" : str12, "TIME_OUT".equals(str10) ? (Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32895R0) : null);
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                Context context6 = ((C3073cs) this.f32687b).f30384c;
                return new Qs(AbstractC2659Kg.B(context6, "init_without_write"), AbstractC2659Kg.B(context6, "crash_without_write"));
            default:
                Or or6 = (Or) this.f32687b;
                Context context7 = (Context) or6.f27448c;
                PackageManager packageManager = context7.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), com.anythink.basead.exoplayer.b.aX);
                ResolveInfo resolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), com.anythink.basead.exoplayer.b.aX);
                String country = locale.getCountry();
                w2.D d13 = C4906k.f40186C.f40191c;
                x2.d dVar = C4949p.f40498g.f40499a;
                boolean s9 = x2.d.s();
                boolean h3 = V2.b.h(context7);
                boolean k9 = V2.b.k(context7);
                String language = locale.getLanguage();
                ArrayList arrayList3 = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i18 = 0; i18 < localeList.size(); i18++) {
                    arrayList3.add(localeList.get(i18).getLanguage());
                }
                ResolveInfo resolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), com.anythink.basead.exoplayer.b.aX);
                if (resolveActivity3 != null && (activityInfo = resolveActivity3.activityInfo) != null) {
                    try {
                        g9 = X2.b.a(context7).g(0, activityInfo.packageName);
                    } catch (PackageManager.NameNotFoundException unused8) {
                        i10 = 1;
                    }
                    if (g9 != null) {
                        int i19 = g9.versionCode;
                        String str13 = activityInfo.packageName;
                        i10 = 1;
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i19).length() + 1 + String.valueOf(str13).length());
                            sb2.append(i19);
                            sb2.append(com.anythink.core.common.d.j.f13164z);
                            sb2.append(str13);
                            sb = sb2.toString();
                            i11 = 1;
                        } catch (PackageManager.NameNotFoundException unused9) {
                            i11 = i10;
                            sb = null;
                            g10 = X2.b.a(context7).g(128, "com.android.vending");
                            if (g10 != null) {
                            }
                            str4 = null;
                            String str14 = Build.FINGERPRINT;
                            String language2 = Locale.getDefault().getLanguage();
                            c3324ha = AbstractC3592ma.af;
                            rVar = s2.r.f40506e;
                            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity4 = packageManager.resolveActivity(intent, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent, com.anythink.basead.exoplayer.b.aX);
                            if (queryIntentActivities != null) {
                            }
                            z11 = false;
                            w2.D d14 = C4906k.f40186C.f40191c;
                            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            C3324ha c3324ha9 = AbstractC3592ma.Lc;
                            s2.r rVar7 = s2.r.f40506e;
                            if (((Boolean) rVar7.f40509c.a(c3324ha9)).booleanValue()) {
                            }
                            C3324ha c3324ha10 = AbstractC3592ma.Pc;
                            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka4 = rVar7.f40509c;
                            String j9 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka4.a(c3324ha10)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka4.a(AbstractC3592ma.Rc)).booleanValue() ? (String) or6.f27450e : x2.d.j(context7) : "";
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str15 = Build.MODEL;
                            return new Rs(r13, r14, country, s9, h3, k9, language, arrayList3, sb, str4, z11, availableBytes, r26, j9, Build.VERSION.SDK_INT, str5, str6, ((C3123dp) or6.f27447b).a());
                        }
                        g10 = X2.b.a(context7).g(128, "com.android.vending");
                        if (g10 != null) {
                            int i20 = g10.versionCode;
                            String str16 = g10.packageName;
                            int i21 = i11;
                            try {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i20).length() + i11 + String.valueOf(str16).length());
                                sb3.append(i20);
                                sb3.append(com.anythink.core.common.d.j.f13164z);
                                sb3.append(str16);
                                str4 = sb3.toString();
                                i11 = i21;
                            } catch (Exception unused10) {
                                i11 = i21;
                                str4 = null;
                                String str142 = Build.FINGERPRINT;
                                String language22 = Locale.getDefault().getLanguage();
                                c3324ha = AbstractC3592ma.af;
                                rVar = s2.r.f40506e;
                                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                                }
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                                ResolveInfo resolveActivity42 = packageManager.resolveActivity(intent2, 0);
                                queryIntentActivities = packageManager.queryIntentActivities(intent2, com.anythink.basead.exoplayer.b.aX);
                                if (queryIntentActivities != null) {
                                }
                                z11 = false;
                                w2.D d142 = C4906k.f40186C.f40191c;
                                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                C3324ha c3324ha92 = AbstractC3592ma.Lc;
                                s2.r rVar72 = s2.r.f40506e;
                                if (((Boolean) rVar72.f40509c.a(c3324ha92)).booleanValue()) {
                                }
                                C3324ha c3324ha102 = AbstractC3592ma.Pc;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka42 = rVar72.f40509c;
                                String j92 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka42.a(c3324ha102)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka42.a(AbstractC3592ma.Rc)).booleanValue() ? (String) or6.f27450e : x2.d.j(context7) : "";
                                if (resolveActivity2 == null) {
                                }
                                if (resolveActivity == null) {
                                }
                                String str152 = Build.MODEL;
                                return new Rs(r13, r14, country, s9, h3, k9, language, arrayList3, sb, str4, z11, availableBytes2, r26, j92, Build.VERSION.SDK_INT, str5, str6, ((C3123dp) or6.f27447b).a());
                            }
                            String str1422 = Build.FINGERPRINT;
                            String language222 = Locale.getDefault().getLanguage();
                            c3324ha = AbstractC3592ma.af;
                            rVar = s2.r.f40506e;
                            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                                C3980tl I8 = w2.D.I(context7);
                                String str17 = I8.f35162n;
                                str6 = I8.f35163u;
                                str5 = str17;
                            } else {
                                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ze)).booleanValue()) {
                                    language222 = w2.D.I(context7).f35162n;
                                }
                                str5 = language222;
                                str6 = null;
                            }
                            Intent intent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                            ResolveInfo resolveActivity422 = packageManager.resolveActivity(intent22, 0);
                            queryIntentActivities = packageManager.queryIntentActivities(intent22, com.anythink.basead.exoplayer.b.aX);
                            if (queryIntentActivities != null && resolveActivity422 != null) {
                                for (i12 = 0; i12 < queryIntentActivities.size(); i12 += i11) {
                                    if (resolveActivity422.activityInfo.name.equals(queryIntentActivities.get(i12).activityInfo.name)) {
                                        z11 = resolveActivity422.activityInfo.packageName.equals(AbstractC4117wD.a(context7));
                                        w2.D d1422 = C4906k.f40186C.f40191c;
                                        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                        C3324ha c3324ha922 = AbstractC3592ma.Lc;
                                        s2.r rVar722 = s2.r.f40506e;
                                        boolean z13 = (((Boolean) rVar722.f40509c.a(c3324ha922)).booleanValue() || !w2.D.d(context7)) ? 0 : i11;
                                        C3324ha c3324ha1022 = AbstractC3592ma.Pc;
                                        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka422 = rVar722.f40509c;
                                        String j922 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka422.a(c3324ha1022)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka422.a(AbstractC3592ma.Rc)).booleanValue() ? (String) or6.f27450e : x2.d.j(context7) : "";
                                        boolean z14 = resolveActivity2 == null ? i11 : 0;
                                        boolean z15 = resolveActivity == null ? i11 : 0;
                                        String str1522 = Build.MODEL;
                                        return new Rs(z15, z14, country, s9, h3, k9, language, arrayList3, sb, str4, z11, availableBytes22, z13, j922, Build.VERSION.SDK_INT, str5, str6, ((C3123dp) or6.f27447b).a());
                                    }
                                }
                            }
                            z11 = false;
                            w2.D d14222 = C4906k.f40186C.f40191c;
                            long availableBytes222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                            C3324ha c3324ha9222 = AbstractC3592ma.Lc;
                            s2.r rVar7222 = s2.r.f40506e;
                            if (((Boolean) rVar7222.f40509c.a(c3324ha9222)).booleanValue()) {
                            }
                            C3324ha c3324ha10222 = AbstractC3592ma.Pc;
                            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka4222 = rVar7222.f40509c;
                            String j9222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka4222.a(c3324ha10222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka4222.a(AbstractC3592ma.Rc)).booleanValue() ? (String) or6.f27450e : x2.d.j(context7) : "";
                            if (resolveActivity2 == null) {
                            }
                            if (resolveActivity == null) {
                            }
                            String str15222 = Build.MODEL;
                            return new Rs(z15, z14, country, s9, h3, k9, language, arrayList3, sb, str4, z11, availableBytes222, z13, j9222, Build.VERSION.SDK_INT, str5, str6, ((C3123dp) or6.f27447b).a());
                        }
                        str4 = null;
                        String str14222 = Build.FINGERPRINT;
                        String language2222 = Locale.getDefault().getLanguage();
                        c3324ha = AbstractC3592ma.af;
                        rVar = s2.r.f40506e;
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        }
                        Intent intent222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity4222 = packageManager.resolveActivity(intent222, 0);
                        queryIntentActivities = packageManager.queryIntentActivities(intent222, com.anythink.basead.exoplayer.b.aX);
                        if (queryIntentActivities != null) {
                            while (i12 < queryIntentActivities.size()) {
                            }
                        }
                        z11 = false;
                        w2.D d142222 = C4906k.f40186C.f40191c;
                        long availableBytes2222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                        C3324ha c3324ha92222 = AbstractC3592ma.Lc;
                        s2.r rVar72222 = s2.r.f40506e;
                        if (((Boolean) rVar72222.f40509c.a(c3324ha92222)).booleanValue()) {
                        }
                        C3324ha c3324ha102222 = AbstractC3592ma.Pc;
                        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka42222 = rVar72222.f40509c;
                        String j92222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka42222.a(c3324ha102222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka42222.a(AbstractC3592ma.Rc)).booleanValue() ? (String) or6.f27450e : x2.d.j(context7) : "";
                        if (resolveActivity2 == null) {
                        }
                        if (resolveActivity == null) {
                        }
                        String str152222 = Build.MODEL;
                        return new Rs(z15, z14, country, s9, h3, k9, language, arrayList3, sb, str4, z11, availableBytes2222, z13, j92222, Build.VERSION.SDK_INT, str5, str6, ((C3123dp) or6.f27447b).a());
                    }
                }
                i11 = 1;
                sb = null;
                g10 = X2.b.a(context7).g(128, "com.android.vending");
                if (g10 != null) {
                }
                str4 = null;
                String str142222 = Build.FINGERPRINT;
                String language22222 = Locale.getDefault().getLanguage();
                c3324ha = AbstractC3592ma.af;
                rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                }
                Intent intent2222 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity42222 = packageManager.resolveActivity(intent2222, 0);
                queryIntentActivities = packageManager.queryIntentActivities(intent2222, com.anythink.basead.exoplayer.b.aX);
                if (queryIntentActivities != null) {
                }
                z11 = false;
                w2.D d1422222 = C4906k.f40186C.f40191c;
                long availableBytes22222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                C3324ha c3324ha922222 = AbstractC3592ma.Lc;
                s2.r rVar722222 = s2.r.f40506e;
                if (((Boolean) rVar722222.f40509c.a(c3324ha922222)).booleanValue()) {
                }
                C3324ha c3324ha1022222 = AbstractC3592ma.Pc;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka422222 = rVar722222.f40509c;
                String j922222 = !((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka422222.a(c3324ha1022222)).booleanValue() ? ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka422222.a(AbstractC3592ma.Rc)).booleanValue() ? (String) or6.f27450e : x2.d.j(context7) : "";
                if (resolveActivity2 == null) {
                }
                if (resolveActivity == null) {
                }
                String str1522222 = Build.MODEL;
                return new Rs(z15, z14, country, s9, h3, k9, language, arrayList3, sb, str4, z11, availableBytes22222, z13, j922222, Build.VERSION.SDK_INT, str5, str6, ((C3123dp) or6.f27447b).a());
        }
    }
}
