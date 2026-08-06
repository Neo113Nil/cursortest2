package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.es0;
import defpackage.j6IIN2O8eOU;
import defpackage.ki1;
import defpackage.qj;
import java.io.File;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            qj.J3Xc8BaqpN8(context, new es0(), new j6IIN2O8eOU(23, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(23, this);
                try {
                    qj.HFYAaqMd6(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    j6iin2o8eou.EljAMC1QTz(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    j6iin2o8eou.EljAMC1QTz(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            j6IIN2O8eOU j6iin2o8eou2 = new j6IIN2O8eOU(23, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                j6iin2o8eou2.EljAMC1QTz(16, null);
                return;
            }
            if (ki1.arNh8D4Z5gB(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                j6iin2o8eou2.EljAMC1QTz(14, null);
            } else {
                j6iin2o8eou2.EljAMC1QTz(15, null);
            }
        }
    }
}
