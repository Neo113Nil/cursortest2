package T0;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3124a = J0.r.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z6) {
        String str = f3124a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            J0.r d9 = J0.r.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z6 ? "enabled" : "disabled");
            d9.a(str, sb.toString());
        } catch (Exception e9) {
            J0.r d10 = J0.r.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z6 ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (d10.f1433a <= 3) {
                Log.d(str, sb3, e9);
            }
        }
    }
}
