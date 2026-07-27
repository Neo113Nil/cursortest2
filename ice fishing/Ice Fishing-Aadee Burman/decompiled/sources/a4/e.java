package a4;

import B1.G;
import B1.H;
import O2.InterfaceC0359i;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.media.AudioManager;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bumptech.glide.manager.l;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC2880Yp;
import com.google.android.gms.internal.ads.C2555Fh;
import com.google.android.gms.internal.ads.C2657Lh;
import com.google.android.gms.internal.ads.C3068d9;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3763q5;
import com.google.android.gms.internal.ads.InterfaceC2542El;
import i2.InterfaceC4581a;
import i8.s;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m1.C4727b;
import m1.C4729d;
import p2.C4835j;
import q2.InterfaceC4870a;
import q2.r;
import r0.InterfaceC4945c;
import t2.C5037e;
import t2.InterfaceC5033a;
import t2.InterfaceC5035c;
import u2.D;
import u2.z;
import v2.i;
import v7.AbstractC5131l;

/* loaded from: classes2.dex */
public class e implements H, O1.c, InterfaceC0359i, l, InterfaceC4581a, InterfaceC4945c {

    /* renamed from: n, reason: collision with root package name */
    public static e f4347n;

    /* renamed from: u, reason: collision with root package name */
    public static e f4348u;

    public static final String b(y8.h hVar, y8.h[] hVarArr, int i) {
        int i6;
        boolean z3;
        int i9;
        int i10;
        int i11 = -1;
        y8.h hVar2 = v8.a.f41444b;
        int a9 = hVar.a();
        int i12 = 0;
        while (i12 < a9) {
            int i13 = (i12 + a9) / 2;
            while (i13 > i11 && hVar.e(i13) != 10) {
                i13 += i11;
            }
            int i14 = i13 + 1;
            int i15 = 1;
            while (true) {
                i6 = i14 + i15;
                if (hVar.e(i6) == 10) {
                    break;
                }
                i15++;
            }
            int i16 = i6 - i14;
            int i17 = i;
            boolean z6 = false;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (z6) {
                    i9 = 46;
                    z3 = false;
                } else {
                    byte e9 = hVarArr[i17].e(i18);
                    byte[] bArr = j8.c.f38482a;
                    int i20 = e9 & 255;
                    z3 = z6;
                    i9 = i20;
                }
                byte e10 = hVar.e(i14 + i19);
                byte[] bArr2 = j8.c.f38482a;
                i10 = i9 - (e10 & 255);
                if (i10 != 0) {
                    break;
                }
                i19++;
                i18++;
                if (i19 == i16) {
                    break;
                }
                if (hVarArr[i17].a() != i18) {
                    z6 = z3;
                } else {
                    if (i17 == hVarArr.length - 1) {
                        break;
                    }
                    i17++;
                    z6 = true;
                    i18 = -1;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i21 = i16 - i19;
                    int a10 = hVarArr[i17].a() - i18;
                    int length = hVarArr.length;
                    for (int i22 = i17 + 1; i22 < length; i22++) {
                        a10 += hVarArr[i22].a();
                    }
                    if (a10 >= i21) {
                        if (a10 <= i21) {
                            return hVar.i(i14, i16 + i14).h(Q7.a.f2664a);
                        }
                    }
                }
                i12 = i6 + 1;
                i11 = -1;
            }
            a9 = i13;
            i11 = -1;
        }
        return null;
    }

    public static ArrayList c(List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((s) obj) != s.f38224v) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5131l.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f38229n);
        }
        return arrayList2;
    }

    public static byte[] d(List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        y8.e eVar = new y8.e();
        Iterator it = c(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            eVar.X(str.length());
            eVar.d0(str);
        }
        return eVar.A(eVar.f41950u);
    }

    public static ArrayList e(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new l1.d((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static Path h(float f3, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f3, f9);
        path.lineTo(f10, f11);
        return path;
    }

    public static CookieManager l() {
        C4835j c4835j = C4835j.f39730C;
        D d2 = c4835j.f39735c;
        int myUid = Process.myUid();
        if (myUid == 0 || myUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = z.f41319b;
            i.d("Failed to obtain CookieManager.", th);
            c4835j.f39740h.e("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    public static final void n(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z3, C3153eo c3153eo) {
        if (adOverlayInfoParcel.f23565D == 4 && adOverlayInfoParcel.f23580v == null) {
            InterfaceC4870a interfaceC4870a = adOverlayInfoParcel.f23579u;
            if (interfaceC4870a != null) {
                interfaceC4870a.onAdClicked();
            }
            InterfaceC2542El interfaceC2542El = adOverlayInfoParcel.f23574N;
            if (interfaceC2542El != null) {
                interfaceC2542El.J();
            }
            Activity j6 = adOverlayInfoParcel.f23581w.j();
            C5037e c5037e = adOverlayInfoParcel.f23578n;
            Context context2 = (c5037e == null || !c5037e.f40831C || j6 == null) ? context : j6;
            e eVar = C4835j.f39730C.f39733a;
            q(context2, c5037e, adOverlayInfoParcel.f23563B, c5037e != null ? c5037e.f40830B : null, c3153eo, adOverlayInfoParcel.J);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f23567F.f41391w);
        intent.putExtra("shouldCallOnOverlayOpened", z3);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Ie)).booleanValue()) {
            D d2 = C4835j.f39730C.f39735c;
            D.v(context, intent, c3153eo, adOverlayInfoParcel.J);
        } else {
            D d9 = C4835j.f39730C.f39735c;
            D.s(context, intent);
        }
    }

    public static final boolean o(Context context, Intent intent, InterfaceC5035c interfaceC5035c, InterfaceC5033a interfaceC5033a, boolean z3, C3153eo c3153eo, String str, Bundle bundle) {
        int i;
        if (z3) {
            try {
                i = C4835j.f39730C.f39735c.J(context, intent.getData(), bundle);
                if (interfaceC5035c != null) {
                    interfaceC5035c.l();
                }
            } catch (ActivityNotFoundException e9) {
                String message = e9.getMessage();
                int i6 = z.f41319b;
                i.f(message);
                i = 6;
            }
            if (interfaceC5033a != null) {
                interfaceC5033a.x(i);
            }
            return i == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            z.k(sb.toString());
            if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.Ie)).booleanValue()) {
                D d2 = C4835j.f39730C.f39735c;
                D.v(context, intent, c3153eo, str);
            } else {
                D d9 = C4835j.f39730C.f39735c;
                D.s(context, intent);
            }
            if (interfaceC5035c != null) {
                interfaceC5035c.l();
            }
            if (interfaceC5033a != null) {
                interfaceC5033a.e0(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            String message2 = e10.getMessage();
            int i9 = z.f41319b;
            i.f(message2);
            if (interfaceC5033a != null) {
                interfaceC5033a.e0(false);
            }
            return false;
        }
    }

    public static final boolean q(Context context, C5037e c5037e, InterfaceC5035c interfaceC5035c, InterfaceC5033a interfaceC5033a, C3153eo c3153eo, String str) {
        int i = 0;
        if (c5037e == null) {
            int i6 = z.f41319b;
            i.f("No intent data for launcher overlay.");
            return false;
        }
        AbstractC3569ma.a(context);
        Intent intent = c5037e.f40829A;
        if (intent != null) {
            return o(context, intent, interfaceC5035c, interfaceC5033a, c5037e.f40831C, c3153eo, str, c5037e.f40832D);
        }
        Intent intent2 = new Intent();
        String str2 = c5037e.f40834u;
        if (TextUtils.isEmpty(str2)) {
            int i9 = z.f41319b;
            i.f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = c5037e.f40835v;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = c5037e.f40836w;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = c5037e.f40837x;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                int i10 = z.f41319b;
                i.f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = c5037e.f40838y;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i11 = z.f41319b;
                i.f("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        C3301ha c3301ha = AbstractC3569ma.f32403w5;
        r rVar = r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32393v5)).booleanValue()) {
                D d2 = C4835j.f39730C.f39735c;
                D.L(context, intent2);
            }
        }
        return o(context, intent2, interfaceC5035c, interfaceC5033a, c5037e.f40831C, c3153eo, str, c5037e.f40832D);
    }

    @Override // O2.InterfaceC0359i
    public void accept(Object obj, Object obj2) {
        Z2.c cVar = (Z2.c) ((Z2.b) obj).u();
        Z2.f fVar = new Z2.f((j3.h) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = Z2.a.f4165a;
        obtain.writeInt(1);
        A8.b.I(obtain, A8.b.G(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f4166n.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public C4727b f(C4729d c4729d, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(Collections.EMPTY_MAP);
        URL url = new URL(c4729d.f39295u);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = c4729d.f39289C.f2133a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z3 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                C4727b c4727b = new C4727b(responseCode, e(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return c4727b;
            }
            try {
                try {
                    return new C4727b(responseCode, e(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3763q5(httpURLConnection, 1));
                } catch (Throwable th) {
                    th = th;
                    z3 = true;
                    if (!z3) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // i2.InterfaceC4581a
    public long g() {
        return SystemClock.elapsedRealtime();
    }

    @Override // B1.H
    public void i(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new G((ByteBuffer) obj));
    }

    @Override // B1.H
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new G((ByteBuffer) obj));
    }

    public C2657Lh p(C2555Fh c2555Fh, C3068d9 c3068d9, boolean z3, BinderC2880Yp binderC2880Yp) {
        return new C2657Lh(c2555Fh, c3068d9, z3, binderC2880Yp);
    }

    public int r(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean t(Context context) {
        return false;
    }

    public Intent u(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int w(AudioManager audioManager) {
        return 0;
    }

    public int x(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // r0.InterfaceC4945c
    public void j() {
    }

    @Override // O1.c
    public void k(Object obj) {
    }

    public void s(Context context) {
    }

    public void v(Activity activity) {
    }

    @Override // r0.InterfaceC4945c
    public void a(int i, Serializable serializable) {
    }
}
