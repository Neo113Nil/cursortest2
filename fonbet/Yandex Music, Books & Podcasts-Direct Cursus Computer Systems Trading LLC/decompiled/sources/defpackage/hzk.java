package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public class hzk extends Exception {
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final long b;
    public final Bundle c;

    static {
        int i2 = dvt.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
        h = Integer.toString(4, 36);
        i = Integer.toString(5, 36);
    }

    public hzk(String str, RuntimeException runtimeException, int i2) {
        this(str, runtimeException, i2, Bundle.EMPTY, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(hzk hzkVar) {
        if (this == hzkVar) {
            return true;
        }
        if (hzkVar != null && getClass() == hzkVar.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = hzkVar.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.a == hzkVar.a && Objects.equals(getMessage(), hzkVar.getMessage()) && this.b == hzkVar.b) {
                return true;
            }
        }
        return false;
    }

    public hzk(String str, Throwable th, int i2, Bundle bundle, long j) {
        super(str, th);
        this.a = i2;
        this.c = bundle;
        this.b = j;
    }
}
