package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.jg$$ExternalSyntheticLambda1;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g {
    public static final g a = new g();

    public static final boolean a(Context context) {
        context.getClass();
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(5), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(isGooglePlayServicesAvailable, 19), 7, (Object) null);
        return false;
    }

    public static final boolean b(Context context) {
        context.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda2(4), 4, (Object) null);
            return false;
        }
    }

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final String a(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Google Play Services is unavailable. Connection result: ");
    }

    public static final String b() {
        return "Google Play Services is available.";
    }
}
