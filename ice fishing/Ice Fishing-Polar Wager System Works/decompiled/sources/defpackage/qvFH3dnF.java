package defpackage;

/* loaded from: classes.dex */
public abstract class qvFH3dnF {
    public static boolean F7NU4MC0GW(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static android.content.pm.PackageInfo IHQe1A4L2xu(android.content.pm.PackageManager packageManager, android.content.Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
    }

    public static java.util.ArrayList oh6vYeIP(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static java.lang.String r1MBDhnF(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }
}
