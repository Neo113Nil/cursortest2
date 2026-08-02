package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.Toast;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$Button;

/* loaded from: classes11.dex */
public abstract class vqb1 {
    public static final void a(fao faoVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1069350330);
        int i2 = (btsVar.k(faoVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(1881072616, true, new u5(tlsVar, 7, faoVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(faoVar, tlsVar, i, 17);
        }
    }

    public static final ArrayList b(HashSet hashSet) {
        ArrayList arrayList = new ArrayList(tcc.n(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((TollRoadDialogAnalytics$Button) it.next()).getValue());
        }
        return arrayList;
    }

    public static final AnimatedVectorDrawableCompat c(int i, Context context) {
        AnimatedVectorDrawableCompat create = AnimatedVectorDrawableCompat.create(context, i);
        if (create != null) {
            return create;
        }
        ny61.g(oyr.i(i, "Can not create drawable "));
        return null;
    }

    public static final String d(Context context) {
        PackageInfo f = f(context);
        if (f != null) {
            return f.versionName;
        }
        return null;
    }

    public static final Drawable e(int i, Context context) {
        Drawable t = vng.t(i, context);
        if (t != null) {
            return t;
        }
        ny61.g(oyr.i(i, "Can not create drawable "));
        return null;
    }

    public static final PackageInfo f(Context context) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final void g(int i, Context context) {
        if (Build.VERSION.SDK_INT <= 32) {
            Toast.makeText(context, i, 0).show();
        }
    }
}
