package androidx.profileinstaller;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            defpackage.ci0.RmCzwkUxICV(context, new defpackage.c6(1), new defpackage.c1NqjJifC7(24, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                java.lang.String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new java.io.File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        android.util.Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                defpackage.c1NqjJifC7 c1nqjjifc7 = new defpackage.c1NqjJifC7(24, this);
                try {
                    defpackage.ci0.lpprD5VAS(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c1nqjjifc7.xiZrDbcSW0(10, null);
                    return;
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    c1nqjjifc7.xiZrDbcSW0(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            android.os.Process.sendSignal(android.os.Process.myPid(), 10);
            android.util.Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            java.lang.String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            defpackage.c1NqjJifC7 c1nqjjifc72 = new defpackage.c1NqjJifC7(24, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                c1nqjjifc72.xiZrDbcSW0(16, null);
                return;
            }
            if (defpackage.w70.EgCjBq0SZwJ(android.os.Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                c1nqjjifc72.xiZrDbcSW0(14, null);
            } else {
                c1nqjjifc72.xiZrDbcSW0(15, null);
            }
        }
    }
}
