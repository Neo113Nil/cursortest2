package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p8q {
    public final Context a;
    public final xdr b;
    public final xdr c;
    public final by7 d;

    public p8q(Context context) {
        String str;
        this.a = context;
        if (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime <= 1647810000000L || Build.VERSION.SDK_INT < 29) {
            ffs ffsVar = ffs.LIGHT;
            str = "DARK";
        } else {
            ffs ffsVar2 = ffs.LIGHT;
            str = "SYSTEM_DEFAULT";
        }
        String string = context.getSharedPreferences("Yandex_Music", 0).getString("theme", str);
        ffs ffsVar3 = ffs.DARK;
        if (!Intrinsics.d(string, "DARK")) {
            ffsVar3 = ffs.LIGHT;
            if (!Intrinsics.d(string, "LIGHT")) {
                ffsVar3 = ffs.SYSTEM_DEFAULT;
                if (!Intrinsics.d(string, "SYSTEM_DEFAULT")) {
                    su4.s(2, null, hrg.q("Unknown theme = ", string, ", fallback to system_default"), null);
                }
            }
        }
        xdr a = ydr.a(ffsVar3);
        this.b = a;
        this.c = a;
        this.d = asq.K(a, new kzp(8, this));
    }
}
