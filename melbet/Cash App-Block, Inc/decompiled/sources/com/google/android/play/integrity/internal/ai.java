package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ai {
    public static final s a = new s("PhoneskyVerificationUtils");

    public static int a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean c(Signature[] signatureArr) {
        s sVar = a;
        if (signatureArr == null || (signatureArr.length) == 0) {
            sVar.e("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            String a2 = ah.a(signature.toByteArray());
            arrayList.add(a2);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a2)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a2)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        sVar.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
        return false;
    }
}
