package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class u2u0 {
    public static final HashSet d = new HashSet();
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public u2u0(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
        d.add(this);
    }

    public final boolean a(Context context) {
        boolean z;
        PackageManager.ComponentInfoFlags of;
        ServiceInfo serviceInfo;
        switch (this.c) {
            case 0:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        if (z) {
            return true;
        }
        PackageInfo b = rm41.b(context);
        Bundle bundle = null;
        if (b != null) {
            ComponentName componentName = new ComponentName(b.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.ComponentInfoFlags.of(640L);
                    serviceInfo = context.getPackageManager().getServiceInfo(componentName, of);
                    bundle = serviceInfo.metaData;
                } else {
                    bundle = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return bundle == null ? false : bundle.containsKey(this.b);
    }
}
