package defpackage;

import java.io.File;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class wut {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            tiu.j(file, "not a readable directory: ");
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                tiu.j(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
