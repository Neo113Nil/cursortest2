package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda1;
import coil3.memory.MemoryCacheService;
import java.io.File;

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
            ProfileInstaller.writeProfile(context, new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new MemoryCacheService(this, 18), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string2)) {
                    if ("DELETE_SKIP_FILE".equals(string2)) {
                        MemoryCacheService memoryCacheService = new MemoryCacheService(this, 18);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new ListenerSet$$ExternalSyntheticLambda1(memoryCacheService, 11, (Object) null, 5).run();
                        return;
                    }
                    return;
                }
                MemoryCacheService memoryCacheService2 = new MemoryCacheService(this, 18);
                try {
                    ProfileInstaller.noteProfileWrittenFor(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new ListenerSet$$ExternalSyntheticLambda1(memoryCacheService2, 10, (Object) null, 5).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new ListenerSet$$ExternalSyntheticLambda1(memoryCacheService2, 7, e, 5).run();
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
            String string3 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            MemoryCacheService memoryCacheService3 = new MemoryCacheService(this, 18);
            if ("DROP_SHADER_CACHE".equals(string3)) {
                Encoding.dropShaderCache(context, memoryCacheService3);
            } else if (!"SAVE_PROFILE".equals(string3)) {
                memoryCacheService3.onResultReceived(16, null);
            } else {
                Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                memoryCacheService3.onResultReceived(12, null);
            }
        }
    }
}
