package androidx.test.ext.junit.rules;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.platform.io.PlatformTestStorageRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteFilesRule implements TestRule {
    @Override // org.junit.rules.TestRule
    public Statement apply(final Statement base, Description description) {
        return new Statement() { // from class: androidx.test.ext.junit.rules.DeleteFilesRule.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                Context applicationContext = ApplicationProvider.getApplicationContext();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new File(applicationContext.getApplicationInfo().dataDir));
                arrayList.add(Environment.getExternalStorageDirectory());
                arrayList.add(Environment.getDownloadCacheDirectory());
                if (applicationContext.getExternalCacheDir() != null) {
                    arrayList.add(applicationContext.getExternalCacheDir());
                }
                arrayList.add(applicationContext.getNoBackupFilesDir());
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList.add(new File(applicationContext.getApplicationInfo().deviceProtectedDataDir));
                }
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DeleteFilesRule.findFilesRecursively(hashSet, (File) it.next());
                }
                try {
                    base.evaluate();
                } finally {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        DeleteFilesRule.deleteFilesRecursively(hashSet, (File) it2.next());
                    }
                }
            }
        };
    }

    private static boolean isConstant(File file) {
        return file.getName().endsWith(".dex");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void findFilesRecursively(Set<File> existingFiles, File directory) {
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                existingFiles.add(file);
                if (file.isDirectory()) {
                    findFilesRecursively(existingFiles, file);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFilesRecursively(Set<File> existingFiles, File directory) {
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    if (!PlatformTestStorageRegistry.getInstance().isTestStorageFilePath(file.getPath())) {
                        deleteFilesRecursively(existingFiles, file);
                        if (!existingFiles.contains(file) && file.exists()) {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 == null && !file.delete()) {
                                System.err.println("DeleteRules failed to delete (not a directory or I/O error): " + file);
                            } else if (fileArrListFiles2.length == 0 && !file.delete()) {
                                System.err.println("DeleteRules failed to delete: " + file);
                            }
                        }
                    }
                } else if (!existingFiles.contains(file) && file.exists() && !isConstant(file) && !file.delete()) {
                    System.err.println("DeleteRules failed to delete: " + file);
                }
            }
        }
    }
}
