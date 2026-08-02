package yads;

import defpackage.tea1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes7.dex */
public class c01 extends h30 {
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c01(int i, int i2, IOException iOException) {
        super(i, iOException);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.d = i2;
    }

    public static c01 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !tea1.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new b01(2007, iOException, "Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted") : new c01(i2, i, iOException);
    }

    public c01() {
        this.d = 1;
    }

    public c01(int i, IOException iOException, String str) {
        super(i == 2000 ? 2001 : i, iOException, str);
        this.d = 1;
    }
}
