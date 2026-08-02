package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes.dex */
public abstract class c0k {
    public static final String a = jsg.n("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        defpackage.jsg.j().e(r2, "Skipping component enablement for ".concat(r8.getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z) {
        String str = a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            jsg j = jsg.j();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(StringUtil.SPACE);
            sb.append(z ? "enabled" : "disabled");
            j.e(str, sb.toString());
        } catch (Exception e) {
            jsg j2 = jsg.j();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            j2.f(str, sb2.toString(), e);
        }
    }
}
