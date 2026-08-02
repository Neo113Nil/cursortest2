package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.collection.internal.Lock;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ProfileInstaller {
    public static final Lock EMPTY_DIAGNOSTICS = new Lock(6);

    /* loaded from: classes3.dex */
    public interface DiagnosticsCallback {
        void onDiagnosticReceived();

        void onResultReceived(int i, Object obj);
    }

    public static void noteProfileWrittenFor(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeProfile(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback, boolean z) {
        boolean write;
        boolean z2;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z2 = readLong == packageInfo.lastUpdateTime;
                            if (z2) {
                                diagnosticsCallback.onResultReceived(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z2) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        ProfileVerifier.writeProfileVerification(context, false);
                        return;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            DeviceProfileWriter deviceProfileWriter = new DeviceProfileWriter(assets, executor, diagnosticsCallback, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (deviceProfileWriter.deviceAllowsProfileInstallerAotWrites()) {
                DeviceProfileWriter read = deviceProfileWriter.read();
                read.transcodeIfNeeded();
                write = read.write();
                if (write) {
                    noteProfileWrittenFor(packageInfo, filesDir);
                }
            } else {
                write = false;
            }
            if (write && z) {
                z3 = true;
            }
            ProfileVerifier.writeProfileVerification(context, z3);
        } catch (PackageManager.NameNotFoundException e) {
            diagnosticsCallback.onResultReceived(7, e);
            ProfileVerifier.writeProfileVerification(context, false);
        }
    }
}
