package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1mSDK implements AFj1oSDK {
    @Override // com.appsflyer.internal.AFj1oSDK
    @NotNull
    public final String getMonetizationNetwork() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            t7oVar = (String) obj;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = "";
        }
        return (String) t7oVar;
    }
}
