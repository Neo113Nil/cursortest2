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
import q2.C4903n;

/* renamed from: com.google.android.gms.internal.consent_sdk.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4357m implements I3.h, a3 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35879n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35880u;

    public /* synthetic */ C4357m(Object obj, Object obj2) {
        this.f35879n = obj;
        this.f35880u = obj2;
    }

    @Override // I3.h
    public void a(C4349k c4349k) {
        c4349k.a((Activity) this.f35879n, (I3.b) this.f35880u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public C4313b b(Activity activity, I0.j jVar) {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        List<Rect> boundingRects;
        I3.a aVar = (I3.a) jVar.f1233u;
        Application application = (Application) this.f35879n;
        if (aVar == null) {
            aVar = new F.d(application).b();
        }
        C4313b c4313b = new C4313b();
        c4313b.f35815e = Collections.EMPTY_MAP;
        c4313b.i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new C4354l0(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        c4313b.f35811a = string;
        if (aVar.f1256n) {
            ArrayList arrayList = new ArrayList();
            int i = aVar.f1257u;
            if (i == 1) {
                arrayList.add(EnumC4384t.f35909n);
            } else if (i == 2) {
                arrayList.add(EnumC4384t.f35912w);
            } else if (i == 3) {
                arrayList.add(EnumC4384t.f35910u);
            } else if (i == 4) {
                arrayList.add(EnumC4384t.f35911v);
            }
            arrayList.add(EnumC4384t.f35913x);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        c4313b.i = list;
        c4313b.f35815e = ((C4333g) this.f35880u).a();
        c4313b.f35814d = Boolean.FALSE;
        c4313b.f35813c = Locale.getDefault().toLanguageTag();
        F.d dVar = new F.d((byte) 0, 6);
        dVar.f908b = 1;
        int i4 = Build.VERSION.SDK_INT;
        dVar.f910d = Integer.valueOf(i4);
        dVar.f909c = Build.MODEL;
        dVar.f908b = 2;
        c4313b.f35812b = dVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        S0.n nVar = new S0.n();
        Object obj = Collections.EMPTY_LIST;
        nVar.f2917w = obj;
        nVar.f2914n = Integer.valueOf(configuration.screenWidthDp);
        nVar.f2915u = Integer.valueOf(configuration.screenHeightDp);
        nVar.f2916v = Double.valueOf(application.getResources().getDisplayMetrics().density);
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
                        C4388u c4388u = new C4388u();
                        c4388u.f35928b = Integer.valueOf(rect.left);
                        c4388u.f35929c = Integer.valueOf(rect.right);
                        c4388u.f35927a = Integer.valueOf(rect.top);
                        c4388u.f35930d = Integer.valueOf(rect.bottom);
                        obj.add(c4388u);
                    }
                }
            }
        }
        nVar.f2917w = obj;
        c4313b.f35816f = nVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        Y2.e eVar = new Y2.e(24, false);
        eVar.f3963u = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f3964v = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f3965w = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        c4313b.f35817g = eVar;
        c4313b.f35818h = new J1(23);
        return c4313b;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object d() {
        r rVar = (r) ((Z2) this.f35879n).d();
        Handler handler = C.f35655a;
        E.c(handler);
        return new C4373q(rVar, handler, ((C4903n) this.f35880u).d());
    }
}
