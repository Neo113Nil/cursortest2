package com.yandex.plus.home.core.navigation;

import android.content.Context;
import android.content.Intent;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
    }

    public final boolean a(String str, String str2, String str3) {
        Object t7oVar;
        str2.getClass();
        str3.getClass();
        try {
            r7o r7oVar = z7o.b;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            Intent createChooser = Intent.createChooser(intent, null);
            createChooser.addFlags(268435456);
            this.a.startActivity(createChooser);
            t7oVar = Boolean.TRUE;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object obj = Boolean.FALSE;
        if (t7oVar instanceof t7o) {
            t7oVar = obj;
        }
        return ((Boolean) t7oVar).booleanValue();
    }
}
