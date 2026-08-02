package io.flutter.embedding.engine.loader;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import defpackage.ytj0;
import defpackage.ztj0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
class ResourceExtractor$ExtractTask extends AsyncTask<Void, Void, Void> {
    private final AssetManager mAssetManager;
    private final String mDataDirPath;
    private final PackageManager mPackageManager;
    private final String mPackageName;
    private final HashSet<String> mResources;

    public ResourceExtractor$ExtractTask(String str, HashSet<String> hashSet, String str2, PackageManager packageManager, AssetManager assetManager) {
        this.mDataDirPath = str;
        this.mResources = hashSet;
        this.mAssetManager = assetManager;
        this.mPackageName = str2;
        this.mPackageManager = packageManager;
    }

    private boolean extractAPK(File file) {
        Iterator<String> it = this.mResources.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                File file2 = new File(file, next);
                if (!file2.exists()) {
                    if (file2.getParentFile() != null) {
                        file2.getParentFile().mkdirs();
                    }
                    InputStream open = this.mAssetManager.open(next);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            int i = ztj0.a;
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int read = open.read(bArr);
                                if (read < 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                            open.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            } catch (FileNotFoundException unused) {
            } catch (IOException unused2) {
                ztj0.a(this.mDataDirPath, this.mResources);
                return false;
            }
        }
        return true;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) {
        File file = new File(this.mDataDirPath);
        PackageManager packageManager = this.mPackageManager;
        String str = this.mPackageName;
        int i = ztj0.a;
        String str2 = "res_timestamp-";
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                str2 = "res_timestamp-" + packageInfo.getLongVersionCode() + "-" + packageInfo.lastUpdateTime;
                String[] list = file.list(new ytj0());
                if (list != null && list.length == 1 && str2.equals(list[0])) {
                    str2 = null;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str2 != null) {
            ztj0.a(this.mDataDirPath, this.mResources);
            if (extractAPK(file)) {
                try {
                    new File(file, str2).createNewFile();
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }
}
