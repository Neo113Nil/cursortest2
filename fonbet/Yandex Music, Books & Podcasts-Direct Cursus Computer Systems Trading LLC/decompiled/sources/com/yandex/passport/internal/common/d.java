package com.yandex.passport.internal.common;

import android.content.Context;
import android.content.pm.PackageManager;
import com.yandex.passport.internal.properties.x;

/* loaded from: classes4.dex */
public final class d implements com.yandex.passport.common.common.a {
    public final Context a;
    public final x b;

    public d(Context context, x xVar) {
        context.getClass();
        xVar.getClass();
        this.a = context;
        this.b = xVar;
    }

    public final String a() {
        String z = com.yandex.plus.core.network.api.utils.a.z(this.b.c);
        if (z != null) {
            return z;
        }
        String packageName = this.a.getPackageName();
        packageName.getClass();
        return packageName;
    }

    public final String b() {
        String str;
        String z = com.yandex.plus.core.network.api.utils.a.z(this.b.d);
        if (z != null) {
            return z;
        }
        Context context = this.a;
        context.getClass();
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        String z2 = com.yandex.plus.core.network.api.utils.a.z(str);
        return z2 == null ? "null" : z2;
    }
}
