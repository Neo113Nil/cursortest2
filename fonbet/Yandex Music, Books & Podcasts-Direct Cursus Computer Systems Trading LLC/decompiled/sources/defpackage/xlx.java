package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class xlx {
    public final Context a;

    public xlx(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }
}
