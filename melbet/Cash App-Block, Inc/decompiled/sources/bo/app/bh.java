package bo.app;

import java.io.File;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class bh {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            a$$ExternalSyntheticBUOutline0.m$3(file, "not a readable directory: ");
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                a$$ExternalSyntheticBUOutline0.m$3(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
