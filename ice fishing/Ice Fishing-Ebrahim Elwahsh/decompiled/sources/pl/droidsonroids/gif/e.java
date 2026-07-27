package pl.droidsonroids.gif;

import android.os.SystemClock;
import h.HandlerC4547f;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends f {
    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39877n;
        long l9 = cVar.f39875z.l(cVar.f39874y);
        if (l9 >= 0) {
            this.f39877n.f39871v = SystemClock.uptimeMillis() + l9;
            if (this.f39877n.isVisible() && this.f39877n.f39870u) {
                c cVar2 = this.f39877n;
                if (!cVar2.f39863E) {
                    cVar2.f39869n.remove(this);
                    c cVar3 = this.f39877n;
                    cVar3.f39867I = cVar3.f39869n.schedule(this, l9, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f39877n.f39859A.isEmpty() && this.f39877n.f39875z.a() == this.f39877n.f39875z.h() - 1) {
                c cVar4 = this.f39877n;
                HandlerC4547f handlerC4547f = cVar4.f39864F;
                GifInfoHandle gifInfoHandle = cVar4.f39875z;
                int b9 = gifInfoHandle.b();
                if (b9 != 0 && b9 >= gifInfoHandle.f()) {
                    b9--;
                }
                handlerC4547f.sendEmptyMessageAtTime(b9, this.f39877n.f39871v);
            }
        } else {
            c cVar5 = this.f39877n;
            cVar5.f39871v = Long.MIN_VALUE;
            cVar5.f39870u = false;
        }
        if (!this.f39877n.isVisible() || this.f39877n.f39864F.hasMessages(-1)) {
            return;
        }
        this.f39877n.f39864F.sendEmptyMessageAtTime(-1, 0L);
    }
}
