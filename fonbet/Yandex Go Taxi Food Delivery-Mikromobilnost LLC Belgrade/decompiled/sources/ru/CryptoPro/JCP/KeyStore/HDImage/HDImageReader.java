package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.a441;
import defpackage.g8e;
import defpackage.hr61;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.puu0;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.CryptoPro.JCP.KeyStore.KeyLockInterface;
import ru.CryptoPro.JCP.KeyStore.MediaInterface;
import ru.CryptoPro.JCP.KeyStore.ReaderInterface;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.ExpandException;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.PropertyExpander;

/* loaded from: classes4.dex */
public final class HDImageReader implements ReaderInterface, KeyLockInterface {
    public static String z;
    public final a441 a;
    public final String b;
    public final String c;
    public final String[] w;
    public File x = null;
    public static final String[] y = {"", "chmod a-rwx,u+rwx"};
    public static final Object A = new Object();

    static {
        z = "";
        String str = (String) AccessController.doPrivileged(new puu0(10));
        while (str.length() > 0 && str.charAt(0) == ' ') {
            str = str.substring(1, str.length());
        }
        while (str.length() > 0 && g8e.a(1, str) == ' ') {
            str = oyr.g(1, 0, str);
        }
        z = str;
    }

    public HDImageReader(String str, String str2, String[] strArr, a441 a441Var) {
        this.a = a441Var;
        this.w = null;
        this.b = str;
        this.c = str2;
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.w = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
    }

    public static String getDefaultChmodScript() {
        String str;
        synchronized (A) {
            str = z;
        }
        return str;
    }

    public static String getDir(String str, String[] strArr) {
        return new JCPPref(HDImageReader.class).get(str, strArr != null ? strArr[!Platform.isWindows() ? 1 : 0] : null);
    }

    public static String getDirExpanded(String str, String[] strArr) throws ExpandException {
        return PropertyExpander.expand(getDir(str, strArr));
    }

    public static boolean ifWrite() {
        return nzs.u(HDImageReader.class);
    }

    public static void setDefaultChmodScript(String str) {
        JCPPref jCPPref = new JCPPref(HDImageMedia.class);
        synchronized (A) {
            jCPPref.put("HDImageReader_Chmod_default", str);
            z = str;
        }
    }

    public static void setDir(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            char a = g8e.a(1, str2);
            char c = File.separatorChar;
            if (a != c) {
                str2 = str2 + c;
            }
        }
        new JCPPref(HDImageReader.class).put(str, str2);
    }

    @Override // ru.CryptoPro.JCP.KeyStore.KeyLockInterface
    public final Map getDeniedAliases() {
        return (HashMap) this.a.b;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.KeyLockInterface
    public final ReentrantReadWriteLock getLock() {
        return (ReentrantReadWriteLock) this.a.c;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ReaderInterface
    public final void load() {
        try {
            AccessController.doPrivileged(new hr61(5, this));
        } catch (PrivilegedActionException e) {
            throw ((FileNotFoundException) e.getException());
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ReaderInterface
    public final MediaInterface lock() {
        return new HDImageMedia(this.b, this.x.getAbsolutePath());
    }

    public final String toString() {
        return this.b;
    }
}
