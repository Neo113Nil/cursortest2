package ru.CryptoPro.JCP.tools;

import defpackage.cu61;
import defpackage.hr61;
import defpackage.oyr;
import defpackage.puu0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes4.dex */
public class LocalMutex extends cu61 {
    public static final String DEFAULT_CSP36_UNIX_DIR;
    public static final String DEFAULT_WIN_DIR = "${java.io.tmpdir}\\${user.name}";
    public static final String USAGE = "USAGE:  java ru.CryptoPro.JCP.tools.LocalMutex -set <path>";
    public static final String[] f;
    public static final String g;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(HDImageStore.KEY_UNIX_BASE_PATH);
        String t = oyr.t(sb, File.separator, CSPDirectoryConstants.SUBDIRECTORY_TMP);
        DEFAULT_CSP36_UNIX_DIR = t;
        f = new String[]{DEFAULT_WIN_DIR, t};
        g = (String) AccessController.doPrivileged(new puu0(7));
    }

    public LocalMutex(String str) throws IOException {
        try {
            super((String) AccessController.doPrivileged(new hr61(3, str)));
        } catch (PrivilegedActionException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(e.getMessage());
            try {
                fileNotFoundException.initCause(e);
                throw fileNotFoundException;
            } catch (Throwable unused) {
                throw fileNotFoundException;
            }
        }
    }

    public static String getDefDirStr() {
        return f[!Platform.isWindows() ? 1 : 0];
    }

    public static String getDefault() {
        return cu61.getDefault(LocalMutex.class, f);
    }

    public static boolean ifWrite() {
        return cu61.ifWrite(LocalMutex.class);
    }

    public static void main(String[] strArr) throws Exception {
        Platform.isWindows();
        System.out.getClass();
        if (!Platform.isWindows()) {
            System.out.getClass();
        }
        if (strArr != null && strArr.length == 2 && "-set".equals(strArr[0])) {
            PrintStream printStream = System.out;
            String str = strArr[1];
            printStream.getClass();
            setDefault(strArr[1]);
        } else {
            System.out.getClass();
        }
        PrintStream printStream2 = System.out;
        try {
            printStream2.getClass();
        } catch (PrivilegedActionException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(e.getMessage());
            try {
                fileNotFoundException.initCause(e);
                throw fileNotFoundException;
            } catch (Throwable unused) {
                throw fileNotFoundException;
            }
        }
    }

    public static void setDefault(String str) {
        cu61.setDefault(LocalMutex.class, str);
    }
}
