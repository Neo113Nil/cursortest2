package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l3.AbstractC4661a;
import org.json.JSONObject;
import p2.C4835j;
import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.Eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2545Eo implements InterfaceC3613nH {

    /* renamed from: n, reason: collision with root package name */
    public int f24649n;

    /* renamed from: u, reason: collision with root package name */
    public int f24650u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24651v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24652w;

    /* renamed from: x, reason: collision with root package name */
    public Serializable f24653x;

    public C2545Eo(Context context, int i) {
        switch (i) {
            case 2:
                this.f24650u = 0;
                this.f24651v = context;
                break;
            default:
                this.f24653x = "";
                this.f24651v = context;
                this.f24652w = context.getApplicationInfo();
                C3301ha c3301ha = AbstractC3569ma.xa;
                q2.r rVar = q2.r.f40207e;
                this.f24649n = ((Integer) rVar.f40210c.a(c3301ha)).intValue();
                this.f24650u = ((Integer) rVar.f40210c.a(AbstractC3569ma.ya)).intValue();
                break;
        }
    }

    public static String b(O3.g gVar) {
        gVar.a();
        O3.i iVar = gVar.f2347c;
        String str = iVar.f2362e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f2359b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f24653x) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f24653x;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.f24651v).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e9) {
            Log.w("FirebaseMessaging", "Failed to find package " + e9);
            return null;
        }
    }

    public boolean d() {
        int i;
        synchronized (this) {
            i = this.f24650u;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f24651v).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!T2.b.f()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f24650u = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (T2.b.f()) {
                            this.f24650u = 2;
                        } else {
                            this.f24650u = 1;
                        }
                        i = this.f24650u;
                    } else {
                        this.f24650u = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public void e(O.A0 a02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((O.n0) it.next()).f2114a.c() & 8) != 0) {
                ((View) this.f24652w).setTranslationY(AbstractC4661a.c(this.f24650u, 0, r3.f2114a.b()));
                return;
            }
        }
    }

    public synchronized void f() {
        PackageInfo c9 = c(((Context) this.f24651v).getPackageName());
        if (c9 != null) {
            this.f24653x = Integer.toString(c9.versionCode);
            this.f24652w = c9.versionName;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public long g(C2971bJ c2971bJ) {
        throw new UnsupportedOperationException();
    }

    public JSONObject h() {
        String str;
        String encodeToString;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f24652w;
        Context context = (Context) this.f24651v;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            HandlerC5068A handlerC5068A = u2.D.f41237l;
            Context context2 = V2.c.a(context).f3273u;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        u2.D d2 = C4835j.f39733C.f39738c;
        Drawable drawable = null;
        try {
            str = u2.D.M(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        boolean isEmpty = ((String) this.f24653x).isEmpty();
        int i = this.f24650u;
        int i6 = this.f24649n;
        if (isEmpty) {
            try {
                V2.b a9 = V2.c.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a9.f3273u;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i6, i);
                Bitmap createBitmap = Bitmap.createBitmap(i6, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f24653x = encodeToString;
        }
        if (!((String) this.f24653x).isEmpty()) {
            jSONObject.put("icon", (String) this.f24653x);
            jSONObject.put("iconWidthPx", i6);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public Uri i() {
        return ((InterfaceC3613nH) this.f24651v).i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public Map j() {
        return ((InterfaceC3613nH) this.f24651v).j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public void k(InterfaceC3727pN interfaceC3727pN) {
        interfaceC3727pN.getClass();
        ((InterfaceC3613nH) this.f24651v).k(interfaceC3727pN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public int m(byte[] bArr, int i, int i6) {
        int i9 = this.f24650u;
        InterfaceC3613nH interfaceC3613nH = (InterfaceC3613nH) this.f24651v;
        if (i9 == 0) {
            byte[] bArr2 = (byte[]) this.f24653x;
            int i10 = 0;
            if (interfaceC3613nH.m(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & com.anythink.basead.exoplayer.k.p.f8473b) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int m4 = interfaceC3613nH.m(bArr3, i10, i12);
                        if (m4 != -1) {
                            i10 += m4;
                            i12 -= m4;
                        }
                    }
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        if (bArr3[i13] != 0) {
                            break;
                        }
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        Cr cr = new Cr(bArr3, i11);
                        C4269zQ c4269zQ = (C4269zQ) this.f24652w;
                        long max = !c4269zQ.f35342l ? c4269zQ.i : Math.max(c4269zQ.f35343m.u(true), c4269zQ.i);
                        int B9 = cr.B();
                        InterfaceC3543m1 interfaceC3543m1 = c4269zQ.f35341k;
                        interfaceC3543m1.getClass();
                        interfaceC3543m1.a(B9, cr);
                        interfaceC3543m1.c(max, 1, B9, 0, null);
                        c4269zQ.f35342l = true;
                    }
                }
                i9 = this.f24649n;
                this.f24650u = i9;
            }
            return -1;
        }
        int m9 = interfaceC3613nH.m(bArr, i, Math.min(i9, i6));
        if (m9 != -1) {
            this.f24650u -= m9;
        }
        return m9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public void o() {
        throw new UnsupportedOperationException();
    }
}
