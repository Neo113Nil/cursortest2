package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes5.dex */
public final class jfr implements ifr {
    public final Context a;
    public final cpr b;

    public jfr(Context context, cpr cprVar) {
        this.a = context;
        this.b = cprVar;
    }

    public final boolean a(ad6 ad6Var) {
        return v3g.E(this.b.a).i.contains(ad6Var.R());
    }

    public final boolean b(String str) {
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            if (i >= 33) {
                context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
