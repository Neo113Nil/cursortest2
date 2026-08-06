package androidx.profileinstaller;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
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
            defpackage.vx1.OVwOqzUGHcCU(context, new defpackage.f7(1), new defpackage.k0(21, this), true);
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
                defpackage.k0 k0Var = new defpackage.k0(21, this);
                try {
                    defpackage.vx1.oCu53ZX2v4Ju(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    k0Var.JhCgjQRTAOCT(10, null);
                    return;
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    k0Var.JhCgjQRTAOCT(7, e);
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
            defpackage.k0 k0Var2 = new defpackage.k0(21, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                k0Var2.JhCgjQRTAOCT(16, null);
                return;
            }
            if (defpackage.ok0.oCu53ZX2v4Ju(android.os.Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                k0Var2.JhCgjQRTAOCT(14, null);
            } else {
                k0Var2.JhCgjQRTAOCT(15, null);
            }
        }
    }
}
