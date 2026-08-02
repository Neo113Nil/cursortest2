package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z2b {
    public static final z2b a = new z2b();
    public static File b;

    public static void a(Context context, File file, File file2) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            b(context, file, file2);
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                File file4 = b;
                if (file4 == null) {
                    file4 = new File(context.getCacheDir(), "lock");
                    b = file4;
                }
                if (!file4.equals(file3) && !Intrinsics.d(file2, file3)) {
                    b(context, file3, file2);
                }
            }
        }
    }

    public static void b(Context context, File file, File file2) {
        if (file.isDirectory()) {
            a(context, file, file2);
            return;
        }
        if (file.canWrite()) {
            boolean exists = file.exists();
            if (file.delete() || !exists) {
                return;
            }
            Log.d("Emergency", "File does not exist: " + file);
            tiu.j(file, "Unable to delete file: ");
        }
    }
}
