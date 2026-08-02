package pl.droidsonroids.gif;

import B8.g;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends f {
    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f40017n;
        long l9 = cVar.f40015z.l(cVar.f40014y);
        if (l9 >= 0) {
            this.f40017n.f40011v = SystemClock.uptimeMillis() + l9;
            if (this.f40017n.isVisible() && this.f40017n.f40010u) {
                c cVar2 = this.f40017n;
                if (!cVar2.f40003E) {
                    cVar2.f40009n.remove(this);
                    c cVar3 = this.f40017n;
                    cVar3.f40007I = cVar3.f40009n.schedule(this, l9, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f40017n.f39999A.isEmpty() && this.f40017n.f40015z.a() == this.f40017n.f40015z.h() - 1) {
                c cVar4 = this.f40017n;
                g gVar = cVar4.f40004F;
                GifInfoHandle gifInfoHandle = cVar4.f40015z;
                int b9 = gifInfoHandle.b();
                if (b9 != 0 && b9 >= gifInfoHandle.f()) {
                    b9--;
                }
                gVar.sendEmptyMessageAtTime(b9, this.f40017n.f40011v);
            }
        } else {
            c cVar5 = this.f40017n;
            cVar5.f40011v = Long.MIN_VALUE;
            cVar5.f40010u = false;
        }
        if (!this.f40017n.isVisible() || this.f40017n.f40004F.hasMessages(-1)) {
            return;
        }
        this.f40017n.f40004F.sendEmptyMessageAtTime(-1, 0L);
    }
}
