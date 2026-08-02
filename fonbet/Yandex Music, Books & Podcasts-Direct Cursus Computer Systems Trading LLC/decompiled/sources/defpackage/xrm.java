package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public final class xrm extends ku2 {
    public static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
    public final wge b;

    public xrm(wge wgeVar) {
        this.b = wgeVar;
    }

    @Override // timber.log.Timber.Tree
    public final void log(int i, String str, String str2, Throwable th) {
        str2.getClass();
        wrm wrmVar = new wrm(this, i, Thread.currentThread().getId(), str, str2);
        wge wgeVar = this.b;
        wgeVar.getClass();
        wgeVar.b();
        ((LinkedBlockingQueue) wgeVar.c).offer(new juc(7, wgeVar, wrmVar));
    }
}
