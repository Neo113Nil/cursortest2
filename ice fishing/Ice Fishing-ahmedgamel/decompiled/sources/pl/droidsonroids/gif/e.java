package pl.droidsonroids.gif;

import B8.g;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends f {
    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39970n;
        long l9 = cVar.f39968z.l(cVar.f39967y);
        if (l9 >= 0) {
            this.f39970n.f39964v = SystemClock.uptimeMillis() + l9;
            if (this.f39970n.isVisible() && this.f39970n.f39963u) {
                c cVar2 = this.f39970n;
                if (!cVar2.f39956E) {
                    cVar2.f39962n.remove(this);
                    c cVar3 = this.f39970n;
                    cVar3.f39960I = cVar3.f39962n.schedule(this, l9, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f39970n.f39952A.isEmpty() && this.f39970n.f39968z.a() == this.f39970n.f39968z.h() - 1) {
                c cVar4 = this.f39970n;
                g gVar = cVar4.f39957F;
                GifInfoHandle gifInfoHandle = cVar4.f39968z;
                int b9 = gifInfoHandle.b();
                if (b9 != 0 && b9 >= gifInfoHandle.f()) {
                    b9--;
                }
                gVar.sendEmptyMessageAtTime(b9, this.f39970n.f39964v);
            }
        } else {
            c cVar5 = this.f39970n;
            cVar5.f39964v = Long.MIN_VALUE;
            cVar5.f39963u = false;
        }
        if (!this.f39970n.isVisible() || this.f39970n.f39957F.hasMessages(-1)) {
            return;
        }
        this.f39970n.f39957F.sendEmptyMessageAtTime(-1, 0L);
    }
}
