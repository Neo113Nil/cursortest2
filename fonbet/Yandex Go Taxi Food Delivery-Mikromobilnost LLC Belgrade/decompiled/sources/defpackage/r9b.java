package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.room.util.a;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;

/* loaded from: classes15.dex */
public final class r9b implements vff0 {
    public final w3c a;
    public final Handler b;
    public long c;
    public long w = -1;
    public long x;
    public final /* synthetic */ s9b y;

    public r9b(s9b s9bVar, w3c w3cVar, wff0 wff0Var) {
        this.y = s9bVar;
        this.a = w3cVar;
        this.b = new Handler(s9bVar.a);
        wff0Var.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r4 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r3.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r11 > r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, abz0 abz0Var) {
        s9b s9bVar = this.y;
        k020 k020Var = s9bVar.c;
        m5b0 m5b0Var = s9bVar.x;
        z83.g(null, s9bVar.a, Looper.myLooper());
        meb mebVar = s9bVar.D;
        o1b0 o1b0Var = s9bVar.b;
        q2b e = mebVar.e(o1b0Var.a);
        long j2 = abz0Var.a;
        l7q0 l7q0Var = s9bVar.A;
        l7q0Var.getClass();
        Long l = e.a;
        if (l != null) {
            long longValue = l.longValue();
            long j3 = e.b;
            if (l7q0Var.a.a(tz10.G)) {
                boolean z = j > j3;
                boolean z2 = j == j3 && j2 > longValue;
                if (!z) {
                }
            }
        }
        Long l2 = (Long) a.b(s9bVar.E.a, true, false, new j2b(9, o1b0Var.a, j2));
        if (l2 == null) {
            return;
        }
        l020 C = k020Var.C();
        try {
            C.O0(o1b0Var.a, abz0Var.a, l2.longValue());
            m5b0Var.c(j2);
            if (k020Var.k(o1b0Var.a).L) {
                nta0 nta0Var = s9bVar.w;
                String str = o1b0Var.b;
                SeenMarkerEntity seenMarkerEntity = new SeenMarkerEntity(str, l2.longValue(), abz0Var.a, j);
                z83.g(null, nta0Var.d, Looper.myLooper());
                if (nta0Var.g) {
                    nta0Var.a(str, seenMarkerEntity);
                }
                p370 p370Var = nta0Var.f;
                ((v2b0) p370Var.w).f((String) p370Var.b, str, ((atq0) p370Var.c).b(seenMarkerEntity));
                s9b.b(s9bVar, j2);
            }
            C.s();
            C.close();
        } finally {
        }
    }

    @Override // defpackage.vff0
    public final void b() {
        this.b.removeCallbacksAndMessages(null);
        this.c = 0L;
        this.w = -1L;
        this.x = 0L;
    }

    public final void c(abz0 abz0Var, boolean z) {
        long j = abz0Var.a;
        s9b s9bVar = this.y;
        o1b0 o1b0Var = s9bVar.b;
        k020 k020Var = s9bVar.c;
        Looper looper = s9bVar.a;
        z83.g(null, looper, Looper.myLooper());
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.x >= 350 && j > this.w) {
            Handler handler = this.b;
            handler.removeCallbacksAndMessages(null);
            if (z) {
                z83.g(null, looper, Looper.myLooper());
                this.w = -1L;
                a(((Number) a.b(k020Var.b.Y().a, true, false, new hcb(o1b0Var.a, 7))).longValue(), abz0Var);
            } else {
                z83.g(null, looper, Looper.myLooper());
                long j2 = elapsedRealtime - this.c;
                long j3 = j2 < 600 ? 600 - j2 : 600L;
                this.c = elapsedRealtime;
                this.w = j;
                handler.postDelayed(new kx6(this, abz0Var, ((Number) a.b(k020Var.b.Y().a, true, false, new hcb(o1b0Var.a, 7))).longValue(), 1), j3);
            }
        }
    }
}
