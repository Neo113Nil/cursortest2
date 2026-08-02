package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.a441;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.unr0;
import java.io.File;
import java.io.PrintStream;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.KeyStore.ContainerStore;
import ru.CryptoPro.JCP.KeyStore.JCPKeyStore;
import ru.CryptoPro.JCP.KeyStore.TrustStore;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.PropertyExpander;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes4.dex */
public final class HDImageStore extends JCPKeyStore {
    public static final String[] DEFAULT_OS_DIR;
    public static final String DEFAULT_UNIX_DIR;
    public static final String DEFAULT_WIN_DIR;
    public static final String KEY_UNIX_BASE_PATH;
    public static final String NEW_UNIX_BASE_PATH;
    public static final String STORE_NAME = "HDImageStore";
    public static final String USAGE = "USAGE: java ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore -set <path>\n       java ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore -get";
    public static final a441 d;

    static {
        StringBuilder sb = new StringBuilder("${user.home}");
        String str = File.separator;
        g8e.D(sb, str, "Local Settings", str, "Application Data");
        String t = oyr.t(sb, str, "Crypto Pro");
        DEFAULT_WIN_DIR = t;
        String r = unr0.r(new StringBuilder(), Platform.isAndroid ? JCP.getAndroidApplicationDirectory() : unr0.o(str, "var", str, "opt"), str, CSPDirectoryConstants.DIRECTORY_CPROCSP);
        NEW_UNIX_BASE_PATH = r;
        KEY_UNIX_BASE_PATH = r;
        String q = oyr.q(r, str, CSPDirectoryConstants.SUBDIRECTORY_KEYS, str, "${user.name}");
        DEFAULT_UNIX_DIR = q;
        DEFAULT_OS_DIR = new String[]{t, q};
        d = new a441();
    }

    public HDImageStore() {
        super(new ContainerStore(new HDImageReader("hdimage", "HDImageStore_class_default", DEFAULT_OS_DIR, d), false), new TrustStore(), "HDImageStore");
    }

    public static String getDir() {
        return HDImageReader.getDir("HDImageStore_class_default", DEFAULT_OS_DIR);
    }

    public static boolean ifWrite() {
        return HDImageReader.ifWrite();
    }

    public static void main(String[] strArr) throws Exception {
        Platform.isWindows();
        System.out.getClass();
        if (!Platform.isWindows()) {
            System.out.getClass();
        }
        if (strArr == null || !((strArr.length == 2 && strArr[0].equals("-set")) || (strArr.length == 1 && strArr[0].equals("-get")))) {
            System.out.getClass();
            return;
        }
        if (!strArr[0].equals("-set")) {
            PropertyExpander.expand(getDir());
            System.out.getClass();
        } else {
            setDir(strArr[1]);
            PrintStream printStream = System.out;
            String str = strArr[1];
            printStream.getClass();
        }
    }

    public static void setDir(String str) {
        HDImageReader.setDir("HDImageStore_class_default", str);
    }
}
