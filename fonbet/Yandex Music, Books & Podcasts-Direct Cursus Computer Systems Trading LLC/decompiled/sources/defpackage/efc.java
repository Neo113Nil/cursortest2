package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;

/* loaded from: classes5.dex */
public final /* synthetic */ class efc implements Choreographer.FrameCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ nkk b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ efc(ffc ffcVar, nkk nkkVar, String str) {
        this.c = ffcVar;
        this.b = nkkVar;
        this.d = str;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                ffc ffcVar = (ffc) this.c;
                String str = (String) this.d;
                ffcVar.g.postDelayed(new r8(ffcVar, this.b, new nkk(SystemClock.uptimeMillis()), str, 5), ffcVar.b);
                break;
            default:
                ResponsivenessTracker responsivenessTracker = (ResponsivenessTracker) this.c;
                z3o z3oVar = (z3o) this.d;
                responsivenessTracker.a(z3oVar.b, this.b, new nkk(SystemClock.uptimeMillis()));
                break;
        }
    }

    public /* synthetic */ efc(ResponsivenessTracker responsivenessTracker, z3o z3oVar, nkk nkkVar) {
        this.c = responsivenessTracker;
        this.d = z3oVar;
        this.b = nkkVar;
    }
}
