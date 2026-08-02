package com.anythink.core.common.v;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f17442a;

    public enum a {
        ENABLED,
        DISABLED,
        NOT_INSTALLED;

        private static /* synthetic */ a[] a() {
            return new a[]{ENABLED, DISABLED, NOT_INSTALLED};
        }
    }

    public ad(Context context) {
        this.f17442a = context.getPackageManager();
    }

    private int c(String str) {
        try {
            PackageInfo packageInfo = this.f17442a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    private String d(String str) {
        try {
            PackageInfo packageInfo = this.f17442a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    private byte[] e(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f17442a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new byte[0];
    }

    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a.NOT_INSTALLED;
        }
        try {
            return this.f17442a.getApplicationInfo(str, 0).enabled ? a.ENABLED : a.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return a.NOT_INSTALLED;
        }
    }

    public final String b(String str) {
        byte[] e9 = e(str);
        if (e9 == null || e9.length == 0) {
            return null;
        }
        return x.a(a(e9));
    }

    private static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
