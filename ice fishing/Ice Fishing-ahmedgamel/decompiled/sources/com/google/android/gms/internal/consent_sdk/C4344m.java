package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import q2.C4896n;

/* renamed from: com.google.android.gms.internal.consent_sdk.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4344m implements M3.h, a3 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35716n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35717u;

    public /* synthetic */ C4344m(Object obj, Object obj2) {
        this.f35716n = obj;
        this.f35717u = obj2;
    }

    @Override // M3.h
    public void a(C4336k c4336k) {
        c4336k.a((Activity) this.f35716n, (M3.b) this.f35717u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public C4300b b(Activity activity, I0.j jVar) {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        List<Rect> boundingRects;
        M3.a aVar = (M3.a) jVar.f1264u;
        Application application = (Application) this.f35716n;
        if (aVar == null) {
            aVar = new F.d(application).b();
        }
        C4300b c4300b = new C4300b();
        c4300b.f35652e = Collections.EMPTY_MAP;
        c4300b.i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new C4341l0(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        c4300b.f35648a = string;
        if (aVar.f1866n) {
            ArrayList arrayList = new ArrayList();
            int i = aVar.f1867u;
            if (i == 1) {
                arrayList.add(EnumC4371t.f35746n);
            } else if (i == 2) {
                arrayList.add(EnumC4371t.f35749w);
            } else if (i == 3) {
                arrayList.add(EnumC4371t.f35747u);
            } else if (i == 4) {
                arrayList.add(EnumC4371t.f35748v);
            }
            arrayList.add(EnumC4371t.f35750x);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        c4300b.i = list;
        c4300b.f35652e = ((C4320g) this.f35717u).a();
        c4300b.f35651d = Boolean.FALSE;
        c4300b.f35650c = Locale.getDefault().toLanguageTag();
        F.d dVar = new F.d((byte) 0, 3);
        dVar.f854b = 1;
        int i6 = Build.VERSION.SDK_INT;
        dVar.f856d = Integer.valueOf(i6);
        dVar.f855c = Build.MODEL;
        dVar.f854b = 2;
        c4300b.f35649b = dVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        j4.q qVar = new j4.q();
        Object obj = Collections.EMPTY_LIST;
        qVar.f38436w = obj;
        qVar.f38433n = Integer.valueOf(configuration.screenWidthDp);
        qVar.f38434u = Integer.valueOf(configuration.screenHeightDp);
        qVar.f38435v = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i6 >= 28) {
            Window window = activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                obj = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        C4375u c4375u = new C4375u();
                        c4375u.f35765b = Integer.valueOf(rect.left);
                        c4375u.f35766c = Integer.valueOf(rect.right);
                        c4375u.f35764a = Integer.valueOf(rect.top);
                        c4375u.f35767d = Integer.valueOf(rect.bottom);
                        obj.add(c4375u);
                    }
                }
            }
        }
        qVar.f38436w = obj;
        c4300b.f35653f = qVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        Z2.e eVar = new Z2.e(26, false);
        eVar.f4170u = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f4171v = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f4172w = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        c4300b.f35654g = eVar;
        c4300b.f35655h = new J1(23);
        return c4300b;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object f() {
        r rVar = (r) ((Z2) this.f35716n).f();
        Handler handler = C.f35492a;
        E.c(handler);
        return new C4360q(rVar, handler, ((C4896n) this.f35717u).f());
    }
}
