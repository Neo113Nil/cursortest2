package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class bnp {
    public static final String b;
    public static final String c;
    public final anp a;

    static {
        ynh.a("media3.session");
        int i = dvt.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bnp(Context context, ComponentName componentName) {
        int i;
        int i2;
        int i3;
        PackageManager packageManager = context.getPackageManager();
        try {
            i = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        int i4 = i;
        if (a(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            i3 = 2;
        } else {
            if (!a(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
                if (!a(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                    wvs.g(componentName, ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.", "Failed to resolve SessionToken for ");
                    throw null;
                }
                i2 = 101;
                if (i2 == 101) {
                    this.a = new cnp(i4, i2, 0, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
                    return;
                } else {
                    this.a = new dnp(componentName, i4);
                    return;
                }
            }
            i3 = 1;
        }
        i2 = i3;
        if (i2 == 101) {
        }
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (queryIntentServices != null) {
            for (int i = 0; i < queryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = queryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        anp anpVar = this.a;
        boolean z = anpVar instanceof cnp;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, anpVar.t());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnp) {
            return this.a.equals(((bnp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public bnp(int i, int i2, int i3, String str, c9e c9eVar, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder asBinder = c9eVar.asBinder();
        bundle.getClass();
        this.a = new cnp(i, 0, i2, i3, str, "", null, asBinder, bundle, token);
    }
}
