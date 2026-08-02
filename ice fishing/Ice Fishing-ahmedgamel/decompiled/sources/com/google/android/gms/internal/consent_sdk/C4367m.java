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
import s2.C4945n;

/* renamed from: com.google.android.gms.internal.consent_sdk.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4367m implements O3.h, a3 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f36485n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f36486u;

    public /* synthetic */ C4367m(Object obj, Object obj2) {
        this.f36485n = obj;
        this.f36486u = obj2;
    }

    @Override // O3.h
    public void a(C4359k c4359k) {
        c4359k.a((Activity) this.f36485n, (O3.b) this.f36486u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public C4323b b(Activity activity, n4.c cVar) {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        List<Rect> boundingRects;
        O3.a aVar = (O3.a) cVar.f39658u;
        Application application = (Application) this.f36485n;
        if (aVar == null) {
            aVar = new F.d(application).b();
        }
        C4323b c4323b = new C4323b();
        c4323b.f36421e = Collections.EMPTY_MAP;
        c4323b.i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new C4364l0(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        c4323b.f36417a = string;
        if (aVar.f2292n) {
            ArrayList arrayList = new ArrayList();
            int i = aVar.f2293u;
            if (i == 1) {
                arrayList.add(EnumC4394t.f36515n);
            } else if (i == 2) {
                arrayList.add(EnumC4394t.f36518w);
            } else if (i == 3) {
                arrayList.add(EnumC4394t.f36516u);
            } else if (i == 4) {
                arrayList.add(EnumC4394t.f36517v);
            }
            arrayList.add(EnumC4394t.f36519x);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        c4323b.i = list;
        c4323b.f36421e = ((C4343g) this.f36486u).a();
        c4323b.f36420d = Boolean.FALSE;
        c4323b.f36419c = Locale.getDefault().toLanguageTag();
        F.d dVar = new F.d((byte) 0, 3);
        dVar.f917b = 1;
        int i4 = Build.VERSION.SDK_INT;
        dVar.f919d = Integer.valueOf(i4);
        dVar.f918c = Build.MODEL;
        dVar.f917b = 2;
        c4323b.f36418b = dVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        l4.q qVar = new l4.q();
        Object obj = Collections.EMPTY_LIST;
        qVar.f38948w = obj;
        qVar.f38945n = Integer.valueOf(configuration.screenWidthDp);
        qVar.f38946u = Integer.valueOf(configuration.screenHeightDp);
        qVar.f38947v = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i4 >= 28) {
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
                        C4398u c4398u = new C4398u();
                        c4398u.f36534b = Integer.valueOf(rect.left);
                        c4398u.f36535c = Integer.valueOf(rect.right);
                        c4398u.f36533a = Integer.valueOf(rect.top);
                        c4398u.f36536d = Integer.valueOf(rect.bottom);
                        obj.add(c4398u);
                    }
                }
            }
        }
        qVar.f38948w = obj;
        c4323b.f36422f = qVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        b3.e eVar = new b3.e(26, false);
        eVar.f5557u = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f5558v = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f5559w = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        c4323b.f36423g = eVar;
        c4323b.f36424h = new J1(23);
        return c4323b;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object f() {
        r rVar = (r) ((Z2) this.f36485n).f();
        Handler handler = C.f36261a;
        E.c(handler);
        return new C4383q(rVar, handler, ((C4945n) this.f36486u).f());
    }
}
