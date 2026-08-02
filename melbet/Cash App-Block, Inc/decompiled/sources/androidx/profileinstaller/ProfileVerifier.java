package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.media3.extractor.text.CueEncoder;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ProfileVerifier {
    public static final ResolvableFuture sFuture = new ResolvableFuture();
    public static final Object SYNC_OBJ = new Object();
    public static CueEncoder sCompilationStatus = null;

    public abstract class Api33Impl {
        public static PackageInfo getPackageInfo(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public final class Cache {
        public final long mInstalledCurrentProfileSize;
        public final long mPackageLastUpdateTime;
        public final int mResultCode;
        public final int mSchema;

        public Cache(long j, long j2, int i, int i2) {
            this.mSchema = i;
            this.mResultCode = i2;
            this.mPackageLastUpdateTime = j;
            this.mInstalledCurrentProfileSize = j2;
        }

        public static Cache readFromFile(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
                dataInputStream.close();
                return cache;
            } finally {
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Cache)) {
                Cache cache = (Cache) obj;
                if (this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        public final void writeOnFile(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static long getPackageLastUpdateTime(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CueEncoder setCompilationStatus() {
        CueEncoder cueEncoder = new CueEncoder(14);
        sCompilationStatus = cueEncoder;
        sFuture.set(cueEncoder);
        return sCompilationStatus;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:24|(1:91)(1:28)|29|(1:90)(1:33)|34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c8, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeProfileVerification(Context context, boolean z) {
        boolean z2;
        Cache readFromFile;
        Cache cache;
        int i;
        if (z || sCompilationStatus == null) {
            synchronized (SYNC_OBJ) {
                if (!z) {
                    if (sCompilationStatus != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    setCompilationStatus();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long packageLastUpdateTime = getPackageLastUpdateTime(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            readFromFile = Cache.readFromFile(file3);
                        } catch (IOException unused2) {
                            setCompilationStatus();
                            return;
                        }
                    } else {
                        readFromFile = null;
                    }
                    if (readFromFile != null && readFromFile.mPackageLastUpdateTime == packageLastUpdateTime && (i = readFromFile.mResultCode) != 2) {
                        i2 = i;
                        if (z && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        if (readFromFile != null && readFromFile.mResultCode == 2 && i2 == 1 && length < readFromFile.mInstalledCurrentProfileSize) {
                            i2 = 3;
                        }
                        cache = new Cache(packageLastUpdateTime, length2, 1, i2);
                        if (readFromFile != null || !readFromFile.equals(cache)) {
                            cache.writeOnFile(file3);
                        }
                        setCompilationStatus();
                    }
                    if (z3) {
                        i2 = 1;
                    } else if (z4) {
                        i2 = 2;
                    }
                    if (z) {
                        i2 = 2;
                    }
                    if (readFromFile != null) {
                        i2 = 3;
                    }
                    cache = new Cache(packageLastUpdateTime, length2, 1, i2);
                    if (readFromFile != null) {
                    }
                    cache.writeOnFile(file3);
                    setCompilationStatus();
                } catch (PackageManager.NameNotFoundException unused3) {
                    setCompilationStatus();
                }
            }
        }
    }
}
