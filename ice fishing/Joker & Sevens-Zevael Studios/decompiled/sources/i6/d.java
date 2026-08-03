package i6;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import g7.i;
import g7.o;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import n6.e;
import p6.h;
import p6.k;
import p6.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile d f3211c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f3212d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f3213e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    public final r6.b f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f3215b = new AtomicLong(-1);

    public d(Context context) {
        this.f3214a = new r6.b(context, r6.b.f6085i, new l("ads_identifier:api"), e.f5075b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r3 - r17.f3215b.get()) > i6.d.f3213e.toMillis()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(int i10, int i11, long j3, long j6) {
        AtomicLong atomicLong = this.f3215b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.f3215b.get() != -1) {
        }
        r6.b bVar = this.f3214a;
        if (bVar == null) {
            return;
        }
        o b2 = bVar.b(new k(0, Arrays.asList(new h(35401, i10, 0, j3, j6, null, null, 0, i11))));
        c cVar = new c(this, elapsedRealtime);
        b2.getClass();
        b2.b(i.f2538a, cVar);
    }
}
