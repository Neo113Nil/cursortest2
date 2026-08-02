package defpackage;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class tzy0 {
    public final int a;
    public final tls b;
    public volatile long c;

    public tzy0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    public final void a(Object obj) {
        if (SystemClock.uptimeMillis() - this.c >= this.a) {
            this.c = SystemClock.uptimeMillis();
            this.b.invoke(obj);
        }
    }
}
