package y4;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8749a = o4.o.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        String str = f8749a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            o4.o d10 = o4.o.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z10 ? "enabled" : "disabled");
            d10.a(str, sb.toString());
        } catch (Exception e10) {
            o4.o d11 = o4.o.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z10 ? "enabled" : "disabled");
            String sb3 = sb2.toString();
            if (d11.f5218a <= 3) {
                Log.d(str, sb3, e10);
            }
        }
    }
}
