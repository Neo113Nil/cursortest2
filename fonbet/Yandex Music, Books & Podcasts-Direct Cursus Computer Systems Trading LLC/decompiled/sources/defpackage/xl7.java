package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class xl7 extends e3s {
    @Override // defpackage.e3s
    public final Signature[] P(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
