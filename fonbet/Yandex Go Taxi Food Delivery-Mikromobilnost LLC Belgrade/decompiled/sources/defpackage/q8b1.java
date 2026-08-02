package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public final class q8b1 {
    public final e091 a;
    public final AtomicLong b;

    public q8b1(Context context, int i) {
        String str = "mlkit:vision";
        switch (i) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = vez0.v(context, new qdy0(str));
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = vez0.v(context, new qdy0(str));
                break;
        }
    }

    public static q8b1 a(Context context) {
        return new q8b1(context, 1);
    }

    public synchronized void b(int i, int i2, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b.get() != -1 && elapsedRealtime - this.b.get() <= 1800000) {
            return;
        }
        this.a.e(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).d(new qgg(this, elapsedRealtime, 11));
    }
}
