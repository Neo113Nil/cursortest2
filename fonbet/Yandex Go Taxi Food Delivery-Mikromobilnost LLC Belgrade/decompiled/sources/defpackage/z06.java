package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;

/* loaded from: classes11.dex */
public class z06 {
    public static final ga0 c = new ga0("StreamingFormatChecker", "");
    public final LinkedList a = new LinkedList();
    public long b = -1;

    public final void a(xzv xzvVar) {
        if (xzvVar.g != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(elapsedRealtime);
        LinkedList linkedList = this.a;
        linkedList.add(valueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            cvw.l(l);
            if (elapsedRealtime - l.longValue() < 5000) {
                long j = this.b;
                if (j == -1 || elapsedRealtime - j >= 5000) {
                    this.b = elapsedRealtime;
                    Log.isLoggable(c.a, 5);
                }
            }
        }
    }
}
