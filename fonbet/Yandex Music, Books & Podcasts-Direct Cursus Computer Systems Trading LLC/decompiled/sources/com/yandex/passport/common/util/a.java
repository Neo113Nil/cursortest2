package com.yandex.passport.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import defpackage.pmd;
import defpackage.qmd;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Long a(Context context) {
        context.getClass();
        try {
            return Long.valueOf(Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 128).getLongVersionCode() : context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final boolean b(Context context) {
        context.getClass();
        return pmd.e.b(context, qmd.a) == 0;
    }

    public static final Signature[] c(PackageInfo packageInfo) {
        SigningInfo signingInfo;
        packageInfo.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.signatures;
        }
        signingInfo = packageInfo.signingInfo;
        if (signingInfo != null) {
            return signingInfo.getApkContentsSigners();
        }
        return null;
    }

    public static final boolean d(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
