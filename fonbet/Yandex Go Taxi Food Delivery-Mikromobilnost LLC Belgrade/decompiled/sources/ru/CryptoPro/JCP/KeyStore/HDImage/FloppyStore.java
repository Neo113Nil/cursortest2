package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.a441;
import defpackage.g8e;
import java.io.File;
import java.io.PrintStream;
import ru.CryptoPro.JCP.KeyStore.ContainerStore;
import ru.CryptoPro.JCP.KeyStore.JCPKeyStore;
import ru.CryptoPro.JCP.KeyStore.TrustStore;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public final class FloppyStore extends JCPKeyStore {
    public static final String[] DEFAULT_OS_DIR;
    public static final String DEFAULT_UNIX_DIR;
    public static final String DEFAULT_WIN_DIR = "A:\\";
    public static final String STORE_NAME = "FloppyStore";
    public static final String USAGE = "USAGE: java ru.CryptoPro.JCP.KeyStore.HDImage.FloppyStore -set <path>";
    public static final a441 d;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(HDImageStore.KEY_UNIX_BASE_PATH);
        String str = File.separator;
        String r = g8e.r(sb, str, "mnt", str, "0");
        DEFAULT_UNIX_DIR = r;
        DEFAULT_OS_DIR = new String[]{DEFAULT_WIN_DIR, r};
        d = new a441();
    }

    public FloppyStore() {
        super(new ContainerStore(new HDImageReader("FAT12", "FloppyStore_class_default", DEFAULT_OS_DIR, d), false), new TrustStore(), "FloppyStore");
    }

    public static String getDir() {
        return HDImageReader.getDir("FloppyStore_class_default", DEFAULT_OS_DIR);
    }

    public static boolean ifWrite() {
        return HDImageReader.ifWrite();
    }

    public static void main(String[] strArr) throws Exception {
        Platform.isWindows();
        System.out.getClass();
        if (strArr == null || strArr.length != 2 || !"-set".equals(strArr[0])) {
            System.out.getClass();
            return;
        }
        setDir(strArr[1]);
        PrintStream printStream = System.out;
        String str = strArr[1];
        printStream.getClass();
    }

    public static void setDir(String str) {
        HDImageReader.setDir("FloppyStore_class_default", str);
    }
}
