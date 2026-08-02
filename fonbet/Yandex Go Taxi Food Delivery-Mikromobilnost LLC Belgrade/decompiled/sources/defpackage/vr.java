package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.yandex.go.design.widget.HumanFaceTargetView;
import com.yandex.go.design.widget.PassportTargetView;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.messaging.ui.migration.MigrationEnvironmentActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public final class vr implements j0b0, pj21 {
    public Context a;

    public vr(Context context, int i) {
        switch (i) {
            case 17:
                this.a = context.getApplicationContext();
                break;
            case 18:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static boolean a(String str) {
        boolean z = false;
        for (String str2 : t791.f()) {
            if (new File(str2, str).exists()) {
                zba1.c();
                z = true;
            }
        }
        return z;
    }

    public static vr d(Context context) {
        vr vrVar = new vr();
        vrVar.a = context;
        return vrVar;
    }

    public ljo0 b(ScootersExamType scootersExamType) {
        ljo0 ljo0Var;
        int i = mjo0.a[scootersExamType.ordinal()];
        if (i == 1) {
            ljo0Var = new ljo0(new HumanFaceTargetView(this.a, null, 0, 0, 14, null), kyh0.scooters_photocontrol_title, kyh0.scooters_photocontrol_status_ok, kyh0.scooters_photocontrol_status_not_ok, u3h0.ic_scooters_it_is_okay, u3h0.ic_scooters_it_is_not_okay);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            ljo0Var = new ljo0(new PassportTargetView(this.a, null, 0, 0, 14, null), kyh0.scooters_photocontrol_passport_hint, kyh0.scooters_photocontrol_passport_status_ok, kyh0.scooters_photocontrol_passport_status_not_ok, u3h0.ic_scooters_it_is_okay, u3h0.ic_scooters_it_is_not_okay);
        }
        ljo0Var.a.setShowDebugPoints(false);
        return ljo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ywl c(String str) {
        String str2;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                str2 = cvu0.v(str, "bgMinor", bgu.d(qje.t(xng0.bgMinor, this.a)).toUpperCase(Locale.ROOT), false);
                if (str2 == null) {
                    str2 = "";
                }
                return new ywl(new aks0(str2, null), null, cnr0.b, null, null, null);
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        return new ywl(new aks0(str2, null), null, cnr0.b, null, null, null);
    }

    public int e() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int f() {
        Context context = this.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, n4i0.ActionBar, iog0.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(n4i0.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(rog0.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(rwg0.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public Uri g() {
        Context context = this.a;
        if (!new File(context.getCacheDir(), "logistics").exists()) {
            new File(context.getCacheDir(), "logistics").mkdirs();
        }
        return FileProvider.getUriForFile(context, g8e.o("ru.yandex.taxi.utils.fileprovider.", context.getPackageName()), new File(new File(context.getCacheDir(), "logistics"), "photo_storage.jpg"));
    }

    public boolean h(ArrayList arrayList) {
        PackageManager packageManager = this.a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                zba1.b(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    @Override // defpackage.pj21
    public void m() {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) MigrationEnvironmentActivity.class);
        intent.addFlags(SelfTester_JCP.IMITA);
        context.startActivity(intent.addFlags(536870912).addFlags(SelfTester_JCP.DECRYPT_CBC).addFlags(131072));
    }

    public /* synthetic */ vr(Context context, char c) {
        this.a = context;
    }
}
