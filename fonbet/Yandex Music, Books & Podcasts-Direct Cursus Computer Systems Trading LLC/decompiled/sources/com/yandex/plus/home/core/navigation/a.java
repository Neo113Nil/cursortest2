package com.yandex.plus.home.core.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.plus.core.analytics.logging.d;
import defpackage.l1j;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class a {
    public final d a;
    public final Context b;

    public a(Context context, d dVar) {
        this.a = dVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    public final boolean a(Uri uri) {
        Object t7oVar;
        uri.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = b(uri);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        d dVar = this.a;
        if (a != null) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
            if (dVar.b(aVar)) {
                dVar.a(aVar, "DeeplinkNavigator", "navigate(" + uri + "): error", a);
            }
            return false;
        }
        Intent intent = (Intent) t7oVar;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "DeeplinkNavigator", "navigate(" + uri + "): " + intent, null);
        }
        return true;
    }

    public final Intent b(Uri uri) {
        Intent intent;
        String scheme = uri.getScheme();
        Context context = this.b;
        if (scheme != null && scheme.hashCode() == -1183762788 && scheme.equals("intent")) {
            intent = Intent.parseUri(uri.toString(), 1);
            if (intent == null) {
                xq0.x("'intent' is null");
                return null;
            }
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            if (c.o(uri.getScheme(), "yandexmusic", true)) {
                intent2.setPackage(context.getPackageName());
            }
            intent = intent2;
        }
        if (context.getPackageManager().resolveActivity(intent, SQLiteDatabase.OPEN_FULLMUTEX) == null) {
            String stringExtra = intent.getStringExtra("browser_fallback_url");
            if (stringExtra == null) {
                xq0.x("Can not create fallback intent");
                return null;
            }
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
            if (context.getPackageManager().resolveActivity(intent3, SQLiteDatabase.OPEN_FULLMUTEX) == null) {
                l1j.p(intent3, "'fallbackIntent' can not be resolved: ");
                return null;
            }
            intent = intent3;
        }
        context.startActivity(intent.addFlags(268435456));
        return intent;
    }
}
