package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class g6e extends hb7 {
    public final nb7 b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g6e(nb7 nb7Var, int i, int i2) {
        super(i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = nb7Var;
        this.c = i2;
    }

    public static g6e a(IOException iOException, nb7 nb7Var, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !ltg.M(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new e6e("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, nb7Var, 2007) : new g6e(iOException, nb7Var, i2, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g6e(String str, nb7 nb7Var, int i, int i2) {
        super(str, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = nb7Var;
        this.c = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g6e(IOException iOException, nb7 nb7Var, int i, int i2) {
        super(i, iOException);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = nb7Var;
        this.c = i2;
    }

    public g6e(String str, IOException iOException, nb7 nb7Var, int i) {
        super(i == 2000 ? 2001 : i, iOException, str);
        this.b = nb7Var;
        this.c = 1;
    }
}
