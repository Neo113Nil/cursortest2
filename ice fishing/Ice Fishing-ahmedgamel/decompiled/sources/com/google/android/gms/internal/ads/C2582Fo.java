package com.google.android.gms.internal.ads;

import A1.C0266h;
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
import n3.AbstractC4770a;
import org.json.JSONObject;
import r2.C4906k;
import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.Fo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2582Fo implements InterfaceC3636nH {

    /* renamed from: n, reason: collision with root package name */
    public int f25634n;

    /* renamed from: u, reason: collision with root package name */
    public int f25635u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25636v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25637w;

    /* renamed from: x, reason: collision with root package name */
    public Serializable f25638x;

    public C2582Fo(Context context, int i) {
        switch (i) {
            case 2:
                this.f25635u = 0;
                this.f25636v = context;
                break;
            default:
                this.f25638x = "";
                this.f25636v = context;
                this.f25637w = context.getApplicationInfo();
                C3324ha c3324ha = AbstractC3592ma.xa;
                s2.r rVar = s2.r.f40506e;
                this.f25634n = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
                this.f25635u = ((Integer) rVar.f40509c.a(AbstractC3592ma.ya)).intValue();
                break;
        }
    }

    public static String c(Q3.g gVar) {
        gVar.a();
        Q3.i iVar = gVar.f2663c;
        String str = iVar.f2678e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f2675b;
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
            if (((String) this.f25638x) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f25638x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public long b(C2994bJ c2994bJ) {
        throw new UnsupportedOperationException();
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f25636v).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e9) {
            Log.w("FirebaseMessaging", "Failed to find package " + e9);
            return null;
        }
    }

    public boolean e() {
        int i;
        synchronized (this) {
            i = this.f25635u;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f25636v).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!V2.b.f()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f25635u = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (V2.b.f()) {
                            this.f25635u = 2;
                        } else {
                            this.f25635u = 1;
                        }
                        i = this.f25635u;
                    } else {
                        this.f25635u = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public void f(O.A0 a02, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((O.n0) it.next()).f2202a.c() & 8) != 0) {
                ((View) this.f25637w).setTranslationY(AbstractC4770a.c(this.f25635u, 0, r3.f2202a.b()));
                return;
            }
        }
    }

    public synchronized void g() {
        PackageInfo d9 = d(((Context) this.f25636v).getPackageName());
        if (d9 != null) {
            this.f25638x = Integer.toString(d9.versionCode);
            this.f25637w = d9.versionName;
        }
    }

    public JSONObject h() {
        String str;
        String encodeToString;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f25637w;
        Context context = (Context) this.f25636v;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            HandlerC5139A handlerC5139A = w2.D.f41627l;
            Context context2 = X2.b.a(context).f60u;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        w2.D d9 = C4906k.f40186C.f40191c;
        Drawable drawable = null;
        try {
            str = w2.D.M(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        boolean isEmpty = ((String) this.f25638x).isEmpty();
        int i = this.f25635u;
        int i4 = this.f25634n;
        if (isEmpty) {
            try {
                C0266h a9 = X2.b.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a9.f60u;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i4, i);
                Bitmap createBitmap = Bitmap.createBitmap(i4, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f25638x = encodeToString;
        }
        if (!((String) this.f25638x).isEmpty()) {
            jSONObject.put("icon", (String) this.f25638x);
            jSONObject.put("iconWidthPx", i4);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public Uri i() {
        return ((InterfaceC3636nH) this.f25636v).i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public Map j() {
        return ((InterfaceC3636nH) this.f25636v).j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public void m(InterfaceC3750pN interfaceC3750pN) {
        interfaceC3750pN.getClass();
        ((InterfaceC3636nH) this.f25636v).m(interfaceC3750pN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public int r(byte[] bArr, int i, int i4) {
        int i6 = this.f25635u;
        InterfaceC3636nH interfaceC3636nH = (InterfaceC3636nH) this.f25636v;
        if (i6 == 0) {
            byte[] bArr2 = (byte[]) this.f25638x;
            int i9 = 0;
            if (interfaceC3636nH.r(bArr2, 0, 1) != -1) {
                int i10 = (bArr2[0] & com.anythink.basead.exoplayer.k.p.f9259b) << 4;
                if (i10 != 0) {
                    byte[] bArr3 = new byte[i10];
                    int i11 = i10;
                    while (i11 > 0) {
                        int r9 = interfaceC3636nH.r(bArr3, i9, i11);
                        if (r9 != -1) {
                            i9 += r9;
                            i11 -= r9;
                        }
                    }
                    while (i10 > 0) {
                        int i12 = i10 - 1;
                        if (bArr3[i12] != 0) {
                            break;
                        }
                        i10 = i12;
                    }
                    if (i10 > 0) {
                        Cr cr = new Cr(bArr3, i10);
                        CQ cq = (CQ) this.f25637w;
                        long max = !cq.f24889l ? cq.i : Math.max(cq.f24890m.u(true), cq.i);
                        int B3 = cr.B();
                        InterfaceC3566m1 interfaceC3566m1 = cq.f24888k;
                        interfaceC3566m1.getClass();
                        interfaceC3566m1.a(B3, cr);
                        interfaceC3566m1.c(max, 1, B3, 0, null);
                        cq.f24889l = true;
                    }
                }
                i6 = this.f25634n;
                this.f25635u = i6;
            }
            return -1;
        }
        int r10 = interfaceC3636nH.r(bArr, i, Math.min(i6, i4));
        if (r10 != -1) {
            this.f25635u -= r10;
        }
        return r10;
    }
}
