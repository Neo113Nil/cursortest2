package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Context.FrostHunterAnimatorQuantumFusionMaster8565;
import android.content.Context.FrostHunterBindingAdapterSpeedNeo6677;
import android.content.Context.FrostHunterRemoteConfigDeltaTitanMaster1902;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
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
            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRemoteConfigThunderShadow4435(context, new FrostHunterRemoteConfigDeltaTitanMaster1902(1), new FrostHunterAnimatorQuantumFusionMaster8565(2, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    try {
                        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterViewPhantomNeo1634(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        setResultCode(10);
                        return;
                    } catch (PackageManager.NameNotFoundException unused) {
                        setResultCode(7);
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    setResultCode(11);
                    return;
                }
                return;
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            setResultCode(12);
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = new FrostHunterAnimatorQuantumFusionMaster8565(2, this);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            if (FrostHunterBindingAdapterSpeedNeo6677.FrostHunterLightSensorForceFusion4241(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                frostHunterAnimatorQuantumFusionMaster8565.FrostHunterLintTitanVortexQuantum9911(14, null);
                return;
            } else {
                frostHunterAnimatorQuantumFusionMaster8565.FrostHunterLintTitanVortexQuantum9911(15, null);
                return;
            }
        }
        if (!"SAVE_PROFILE".equals(string2)) {
            frostHunterAnimatorQuantumFusionMaster8565.FrostHunterLintTitanVortexQuantum9911(16, null);
        } else {
            Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
            frostHunterAnimatorQuantumFusionMaster8565.FrostHunterLintTitanVortexQuantum9911(12, null);
        }
    }
}
