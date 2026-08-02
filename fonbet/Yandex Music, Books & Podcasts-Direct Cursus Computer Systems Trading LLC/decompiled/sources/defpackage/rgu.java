package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class rgu {
    public final dyc a;
    public final yjj b;
    public volatile ViewPortState c;
    public volatile boolean d;

    public rgu(dyc dycVar) {
        yjj yjjVar = new yjj();
        this.a = dycVar;
        this.b = yjjVar;
        this.c = ViewPortState.DEFAULT;
    }

    public final synchronized ViewPortState a() {
        ViewPortState viewPortState;
        FullscreenInfo fullscreenInfo;
        FullscreenInfo fullscreenInfo2;
        try {
            if (this.d) {
                viewPortState = ViewPortState.PIP;
            } else {
                dyc dycVar = this.a;
                boolean z = false;
                if (!((dycVar == null || (fullscreenInfo2 = dycVar.c) == null) ? false : Intrinsics.d(fullscreenInfo2.getIsFullscreenExternal(), Boolean.TRUE))) {
                    dyc dycVar2 = this.a;
                    if (dycVar2 != null && (fullscreenInfo = dycVar2.c) != null) {
                        z = Intrinsics.d(fullscreenInfo.getIsFullscreenInternal(), Boolean.TRUE);
                    }
                    if (!z) {
                        viewPortState = ViewPortState.DEFAULT;
                    }
                }
                viewPortState = ViewPortState.FULLSCREEN;
            }
        } catch (Throwable th) {
            throw th;
        }
        return viewPortState;
    }

    public final synchronized void b(boolean z) {
        HashSet u0;
        Object t7oVar;
        try {
            this.d = z;
            ViewPortState a = a();
            if (a != this.c) {
                yjj yjjVar = this.b;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        z2t z2tVar = (z2t) ((qgu) next);
                        z2tVar.getClass();
                        a.getClass();
                        chs chsVar = z2tVar.x;
                        chsVar.getClass();
                        chsVar.a("TrackingObserver", "onViewPortChanged", "viewPortChanged: " + a, new Object[0]);
                        z2tVar.x0();
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a2 = z7o.a(t7oVar);
                    if (a2 != null) {
                        Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                    }
                }
                this.c = a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
