package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import defpackage.fx10;
import defpackage.slf;
import defpackage.tlf;
import defpackage.tx10;
import defpackage.ux10;
import defpackage.yn10;
import io.flutter.plugins.urllauncher.Messages;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements tx10 {
    public final Context a;
    public final yn10 b;
    public Activity c;

    public a(Context context) {
        yn10 yn10Var = new yn10(context);
        this.a = context;
        this.b = yn10Var;
    }

    public static Bundle c(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public final Boolean b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.b.a.getPackageManager());
        return (resolveActivity == null ? null : resolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r2));
    }

    public final Boolean d(Map map, String str, Boolean bool) {
        if (this.c == null) {
            throw new Messages.FlutterError();
        }
        Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", c(map));
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 30) {
            putExtra.addFlags(1024);
        }
        try {
            this.c.startActivity(putExtra);
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public final Boolean e(String str, Boolean bool, ux10 ux10Var, fx10 fx10Var) {
        if (this.c == null) {
            throw new Messages.FlutterError();
        }
        Bundle c = c(ux10Var.c);
        if (bool.booleanValue()) {
            Iterator it = ux10Var.c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    Activity activity = this.c;
                    slf slfVar = new slf();
                    slfVar.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", fx10Var.a.booleanValue() ? 1 : 0);
                    tlf a = slfVar.a();
                    a.a.putExtra("com.android.browser.headers", c);
                    try {
                        a.a(activity, parse);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        try {
            this.c.startActivity(WebViewActivity.createIntent(this.c, str, ux10Var.a.booleanValue(), ux10Var.b.booleanValue(), c));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }
}
