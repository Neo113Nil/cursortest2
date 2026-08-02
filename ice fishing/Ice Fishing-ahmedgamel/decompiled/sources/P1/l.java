package P1;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.C3859rP;
import com.google.android.gms.internal.ads.Q4;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l implements Q4 {

    /* renamed from: n, reason: collision with root package name */
    public long f2368n;

    /* renamed from: u, reason: collision with root package name */
    public long f2369u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2370v;

    public l() {
        this.f2368n = com.anythink.basead.exoplayer.b.f7168b;
        this.f2369u = com.anythink.basead.exoplayer.b.f7168b;
    }

    public synchronized Object a(Object obj) {
        k kVar;
        kVar = (k) ((LinkedHashMap) this.f2370v).get(obj);
        return kVar != null ? kVar.f2366a : null;
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public void b(MessageDigest[] messageDigestArr, long j6, int i) {
        MappedByteBuffer map = ((FileChannel) this.f2370v).map(FileChannel.MapMode.READ_ONLY, this.f2368n + j6, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public long c() {
        return this.f2369u;
    }

    public int d(Object obj) {
        return 1;
    }

    public synchronized Object f(Object obj, Object obj2) {
        int d9 = d(obj2);
        long j6 = d9;
        if (j6 >= this.f2368n) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f2369u += j6;
        }
        k kVar = (k) ((LinkedHashMap) this.f2370v).put(obj, obj2 == null ? null : new k(d9, obj2));
        if (kVar != null) {
            this.f2369u -= kVar.f2367b;
            if (!kVar.f2366a.equals(obj2)) {
                e(obj, kVar.f2366a);
            }
        }
        g(this.f2368n);
        return kVar != null ? kVar.f2366a : null;
    }

    public synchronized void g(long j6) {
        while (this.f2369u > j6) {
            Iterator it = ((LinkedHashMap) this.f2370v).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            k kVar = (k) entry.getValue();
            this.f2369u -= kVar.f2367b;
            Object key = entry.getKey();
            it.remove();
            e(key, kVar.f2366a);
        }
    }

    public void h(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2370v) == null) {
            this.f2370v = exc;
        }
        if (this.f2368n == com.anythink.basead.exoplayer.b.f7168b && C3859rP.Y.get() <= 0) {
            this.f2368n = 200 + elapsedRealtime;
        }
        long j6 = this.f2368n;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b || elapsedRealtime < j6) {
            this.f2369u = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f2370v;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f2370v;
        this.f2370v = null;
        this.f2368n = com.anythink.basead.exoplayer.b.f7168b;
        this.f2369u = com.anythink.basead.exoplayer.b.f7168b;
        throw exc3;
    }

    public l(FileChannel fileChannel, long j6, long j9) {
        this.f2370v = fileChannel;
        this.f2368n = j6;
        this.f2369u = j9;
    }

    public l(long j6, int i) {
        switch (i) {
            case 3:
                this.f2369u = Long.MIN_VALUE;
                this.f2370v = new Object();
                this.f2368n = j6;
                break;
            default:
                this.f2370v = new LinkedHashMap(100, 0.75f, true);
                this.f2368n = j6;
                break;
        }
    }

    public void e(Object obj, Object obj2) {
    }
}
