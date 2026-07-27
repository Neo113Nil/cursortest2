package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.versionedparcelable.ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531;
import androidx.versionedparcelable.BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395;
import androidx.versionedparcelable.HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345;
import androidx.versionedparcelable.WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253;
import java.io.File;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
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
            BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079(context, new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), new WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253(4, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    try {
                        BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
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
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                setResultCode(16);
                return;
            }
            if (ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                setResultCode(14);
            } else {
                setResultCode(15);
            }
        }
    }
}
