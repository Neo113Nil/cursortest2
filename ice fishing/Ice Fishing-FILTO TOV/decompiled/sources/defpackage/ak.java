package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ak extends k61 {
    @Override // defpackage.k61
    public final Signature[] JFJ3QoxA(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
