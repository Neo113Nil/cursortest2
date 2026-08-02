package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class m8w implements k8w {
    public final frt a;
    public final Context b;

    public m8w(frt frtVar, Context context) {
        this.a = frtVar;
        this.b = context;
    }

    public final boolean a(oq oqVar) {
        oqVar.getClass();
        return c(oqVar) && !v3g.E(this.a).i.contains("bookmate");
    }

    public final boolean b(mqs mqsVar) {
        mqsVar.getClass();
        if (mqsVar.G) {
            return false;
        }
        List list = mqsVar.F;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad6 z = b2c.z((String) it.next());
            if (z != null) {
                arrayList.add(z);
            }
        }
        return arrayList.contains(zc6.a) && !v3g.E(this.a).i.contains("bookmate");
    }

    public final boolean c(oq oqVar) {
        oqVar.getClass();
        if (oqVar.z) {
            return false;
        }
        List list = oqVar.y;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ad6 z = b2c.z((String) it.next());
            if (z != null) {
                arrayList.add(z);
            }
        }
        return arrayList.contains(zc6.a);
    }

    public final boolean d() {
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.b;
            if (i >= 33) {
                context.getPackageManager().getPackageInfo("ru.plus.bookmate", PackageManager.PackageInfoFlags.of(0L));
            } else {
                context.getPackageManager().getPackageInfo("ru.plus.bookmate", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
