package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.yandex.go.app.icon.api.AppIcon;
import com.yandex.go.app.icon.api.RestoreSource;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;

/* loaded from: classes.dex */
public class q5h implements eu2 {
    public final Context a;
    public final kl40 b;
    public AppIcon c;
    public AppIcon d;

    public q5h(Context context, kl40 kl40Var) {
        this.a = context;
        this.b = kl40Var;
    }

    public final void a() {
        AppIcon appIcon;
        String str;
        p5h b = b();
        if (b == null || (appIcon = this.d) == null) {
            return;
        }
        kl40 kl40Var = this.b;
        Context context = this.a;
        try {
            int i = o5h.a[appIcon.ordinal()];
            if (i == 1) {
                str = "com.yandex.go.activity.alias.DefaultMainActivityAlias";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (str == null) {
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            packageManager.setComponentEnabledSetting(new ComponentName(context, str), 1, 1);
            for (String str2 : (List) b.a.getValue()) {
                if (!jl40.l(str2, str)) {
                    packageManager.setComponentEnabledSetting(new ComponentName(context, str2), 2, 1);
                }
            }
            kl40Var.getClass();
            this.d = null;
            this.c = appIcon;
        } catch (Exception e) {
            kl40Var.getClass();
            jst.e.k(e, "Error while trying to change activity aliases");
        }
    }

    public p5h b() {
        return null;
    }

    public final String c(p5h p5hVar) {
        Object obj;
        Context context = this.a;
        try {
            Iterator it = ((List) p5hVar.a.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) obj;
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
                if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && jl40.l(str, "com.yandex.go.activity.alias.DefaultMainActivityAlias"))) {
                    break;
                }
            }
            return (String) obj;
        } catch (Exception e) {
            jst.e.k(e, "Error while trying to get current alias");
            return null;
        }
    }

    public final boolean d(AppIcon appIcon) {
        AppIcon appIcon2;
        p5h b = b();
        if (b != null) {
            AppIcon appIcon3 = this.c;
            String str = "com.yandex.go.activity.alias.DefaultMainActivityAlias";
            if (appIcon3 == null) {
                String c = c(b);
                if (jl40.l(c, "com.yandex.go.activity.alias.DefaultMainActivityAlias")) {
                    appIcon2 = AppIcon.DEFAULT;
                } else if (jl40.l(c, null)) {
                    appIcon2 = AppIcon.CUSTOM;
                } else {
                    appIcon3 = null;
                    this.c = appIcon3;
                }
                appIcon3 = appIcon2;
                this.c = appIcon3;
            }
            if (appIcon != appIcon3) {
                int i = o5h.a[appIcon.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        w511.b();
                        return false;
                    }
                    str = null;
                }
                if (str != null) {
                    this.d = appIcon;
                    this.b.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(RestoreSource restoreSource) {
        p5h b = b();
        if (b == null) {
            return;
        }
        String c = c(b);
        if (c != null) {
            jst.e.n("[AppIconDelegate] Nothing to restore, current active alias: ".concat(c));
            return;
        }
        if (!d(AppIcon.DEFAULT)) {
            jst.e.n("[AppIconDelegate] Alias is not planned to restore. Available aliases: ".concat(a.X((List) b.a.getValue(), ",", null, null, null, 62)));
        }
        a();
        xby.l(jst.e, "RESTORE_ACTIVITY_ALIAS", null, null, g8e.o("Message return to default icon because no one active, source = ", restoreSource.getId()), 6);
    }
}
