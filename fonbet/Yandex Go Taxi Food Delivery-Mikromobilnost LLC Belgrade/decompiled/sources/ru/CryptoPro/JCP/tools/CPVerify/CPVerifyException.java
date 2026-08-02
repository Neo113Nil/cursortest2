package ru.CryptoPro.JCP.tools.CPVerify;

import java.util.ResourceBundle;
import ru.CryptoPro.JCP.pref.BundleChooser;

/* loaded from: classes4.dex */
public class CPVerifyException extends Exception {
    public static final String A;
    public static final int SECURITY_PROBLEM = 1;
    public static final int SOMETHING_WRONG = 0;
    public static final int STORE_CORRUPTED = 2;
    public static final int WRONG_FORMAT = 3;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    private int o;

    static {
        ResourceBundle defaultBundle = BundleChooser.getDefaultBundle(BundleChooser.EXRES_NAME);
        ResourceBundle englishBundle = BundleChooser.getEnglishBundle(BundleChooser.EXRES_NAME);
        a = defaultBundle.getString("CPVerify.error.during.work");
        b = englishBundle.getString("CPVerify.error.during.work");
        c = defaultBundle.getString("CPVerify.error.security.problem");
        w = englishBundle.getString("CPVerify.error.security.problem");
        x = defaultBundle.getString("CPVerify.error.store.corrupted");
        y = englishBundle.getString("CPVerify.error.store.corrupted");
        z = defaultBundle.getString("CPVerify.error.wrong.format");
        A = englishBundle.getString("CPVerify.error.wrong.format");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CPVerifyException(int i) {
        super(r3);
        String str = b;
        if (i != 0) {
            if (i == 1) {
                str = w;
            } else if (i == 2) {
                str = y;
            } else if (i == 3) {
                str = A;
            }
        }
        if (i == 1) {
            this.o = i;
            return;
        }
        if (i == 2) {
            this.o = i;
            return;
        }
        if (i == 3) {
            this.o = i;
        } else if (i == 0) {
            this.o = i;
        } else {
            this.o = 0;
        }
    }

    public int getExceptionCode() {
        return this.o;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        int i = this.o;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? b : z : x : c : a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i = this.o;
        if (i != 0) {
            if (i == 1) {
                return w;
            }
            if (i == 2) {
                return y;
            }
            if (i == 3) {
                return A;
            }
        }
        return b;
    }

    public CPVerifyException() {
        super(b);
        this.o = 0;
    }

    public CPVerifyException(String str) {
        super(str);
        this.o = 0;
    }
}
