package pl.droidsonroids.gif;

import B8.g;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends f {
    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39967n;
        long l9 = cVar.f39965z.l(cVar.f39964y);
        if (l9 >= 0) {
            this.f39967n.f39961v = SystemClock.uptimeMillis() + l9;
            if (this.f39967n.isVisible() && this.f39967n.f39960u) {
                c cVar2 = this.f39967n;
                if (!cVar2.f39953E) {
                    cVar2.f39959n.remove(this);
                    c cVar3 = this.f39967n;
                    cVar3.f39957I = cVar3.f39959n.schedule(this, l9, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f39967n.f39949A.isEmpty() && this.f39967n.f39965z.a() == this.f39967n.f39965z.h() - 1) {
                c cVar4 = this.f39967n;
                g gVar = cVar4.f39954F;
                GifInfoHandle gifInfoHandle = cVar4.f39965z;
                int b9 = gifInfoHandle.b();
                if (b9 != 0 && b9 >= gifInfoHandle.f()) {
                    b9--;
                }
                gVar.sendEmptyMessageAtTime(b9, this.f39967n.f39961v);
            }
        } else {
            c cVar5 = this.f39967n;
            cVar5.f39961v = Long.MIN_VALUE;
            cVar5.f39960u = false;
        }
        if (!this.f39967n.isVisible() || this.f39967n.f39954F.hasMessages(-1)) {
            return;
        }
        this.f39967n.f39954F.sendEmptyMessageAtTime(-1, 0L);
    }
}
