package N1;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.C3836rP;
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
    public long f1924n;

    /* renamed from: u, reason: collision with root package name */
    public long f1925u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1926v;

    public l() {
        this.f1924n = com.anythink.basead.exoplayer.b.f6382b;
        this.f1925u = com.anythink.basead.exoplayer.b.f6382b;
    }

    public synchronized Object a(Object obj) {
        k kVar;
        kVar = (k) ((LinkedHashMap) this.f1926v).get(obj);
        return kVar != null ? kVar.f1922a : null;
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public void b(MessageDigest[] messageDigestArr, long j6, int i) {
        MappedByteBuffer map = ((FileChannel) this.f1926v).map(FileChannel.MapMode.READ_ONLY, this.f1924n + j6, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q4
    public long c() {
        return this.f1925u;
    }

    public int d(Object obj) {
        return 1;
    }

    public synchronized Object f(Object obj, Object obj2) {
        int d2 = d(obj2);
        long j6 = d2;
        if (j6 >= this.f1924n) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f1925u += j6;
        }
        k kVar = (k) ((LinkedHashMap) this.f1926v).put(obj, obj2 == null ? null : new k(d2, obj2));
        if (kVar != null) {
            this.f1925u -= kVar.f1923b;
            if (!kVar.f1922a.equals(obj2)) {
                e(obj, kVar.f1922a);
            }
        }
        g(this.f1924n);
        return kVar != null ? kVar.f1922a : null;
    }

    public synchronized void g(long j6) {
        while (this.f1925u > j6) {
            Iterator it = ((LinkedHashMap) this.f1926v).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            k kVar = (k) entry.getValue();
            this.f1925u -= kVar.f1923b;
            Object key = entry.getKey();
            it.remove();
            e(key, kVar.f1922a);
        }
    }

    public void h(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f1926v) == null) {
            this.f1926v = exc;
        }
        if (this.f1924n == com.anythink.basead.exoplayer.b.f6382b && C3836rP.Y.get() <= 0) {
            this.f1924n = 200 + elapsedRealtime;
        }
        long j6 = this.f1924n;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b || elapsedRealtime < j6) {
            this.f1925u = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f1926v;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f1926v;
        this.f1926v = null;
        this.f1924n = com.anythink.basead.exoplayer.b.f6382b;
        this.f1925u = com.anythink.basead.exoplayer.b.f6382b;
        throw exc3;
    }

    public l(FileChannel fileChannel, long j6, long j9) {
        this.f1926v = fileChannel;
        this.f1924n = j6;
        this.f1925u = j9;
    }

    public l(long j6, int i) {
        switch (i) {
            case 3:
                this.f1925u = Long.MIN_VALUE;
                this.f1926v = new Object();
                this.f1924n = j6;
                break;
            default:
                this.f1926v = new LinkedHashMap(100, 0.75f, true);
                this.f1924n = j6;
                break;
        }
    }

    public void e(Object obj, Object obj2) {
    }
}
