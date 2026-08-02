package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import java.util.ArrayList;
import java.util.Iterator;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final /* synthetic */ class f3a implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f3a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                o3a o3aVar = (o3a) this.b;
                l6a l6aVar = (l6a) this.c;
                ano anoVar = o3aVar.x;
                r7b r7bVar = o3aVar.s;
                t5a t5aVar = l6aVar.c;
                m4a m4aVar = l6aVar.b;
                ArrayList m = o3aVar.a.m();
                Iterator it = anoVar.a.iterator();
                while (it.hasNext()) {
                    try {
                        ((ano) ((o6a) it.next())).i(r7bVar, t5aVar, m4aVar, j, m);
                    } catch (Throwable th) {
                        Timber.INSTANCE.e(th);
                    }
                }
                o3aVar.y.D(new c4a(l6aVar.b));
                break;
            case 1:
                o3a o3aVar2 = (o3a) this.b;
                l6a l6aVar2 = (l6a) this.c;
                ano anoVar2 = o3aVar2.x;
                r7b r7bVar2 = o3aVar2.s;
                t5a t5aVar2 = l6aVar2.c;
                q2a q2aVar = l6aVar2.b.a;
                ArrayList m2 = o3aVar2.a.m();
                Iterator it2 = anoVar2.a.iterator();
                while (it2.hasNext()) {
                    try {
                        ((ano) ((o6a) it2.next())).j(r7bVar2, t5aVar2, q2aVar, j, m2);
                    } catch (Throwable th2) {
                        Timber.INSTANCE.e(th2);
                    }
                }
                break;
            default:
                ((ResponsivenessTracker) this.b).a(null, (nkk) this.c, new nkk(SystemClock.uptimeMillis()));
                break;
        }
    }
}
