package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.a;
import java.util.List;

/* loaded from: classes.dex */
public final class u820 {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public u820(Context context) {
        this.a = context;
    }

    public static String b(a aVar) {
        aVar.a();
        lcr lcrVar = aVar.c;
        String str = lcrVar.e;
        if (str != null) {
            return str;
        }
        aVar.a();
        String str2 = lcrVar.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.b == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final boolean c() {
        int i;
        synchronized (this) {
            i = this.e;
            if (i == 0) {
                PackageManager packageManager = this.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        this.e = 2;
                    } else {
                        this.e = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public final synchronized void d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.b = Integer.toString(packageInfo.versionCode);
            this.c = packageInfo.versionName;
        }
    }
}
