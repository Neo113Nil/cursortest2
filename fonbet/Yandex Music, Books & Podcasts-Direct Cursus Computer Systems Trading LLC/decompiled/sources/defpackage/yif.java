package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;

/* loaded from: classes3.dex */
public final class yif extends GestureDetector.SimpleOnGestureListener {
    public final int a = 200;
    public final int b = 700;
    public final int c = 300;
    public long d;
    public final /* synthetic */ pv9 e;

    public yif(pv9 pv9Var) {
        this.e = pv9Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        h4b h4bVar = ((s2e) this.e.b).x;
        if (h4bVar != null) {
            u1e u1eVar = (u1e) h4bVar.a;
            u1e.a(u1eVar);
            u1eVar.x.c();
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.d = System.currentTimeMillis();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        if (motionEvent != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > Math.abs(motionEvent2.getY() - motionEvent.getY()) && Math.abs(x) > this.a && Math.abs(f) > this.b && System.currentTimeMillis() - this.d < this.c) {
                boolean z = x < 0.0f;
                h4b h4bVar = ((s2e) this.e.b).x;
                if (h4bVar != null) {
                    u1e u1eVar = (u1e) h4bVar.a;
                    u1e.a(u1eVar);
                    g4q g4qVar = (g4q) ((oq7) u1eVar.q.getValue()).b.c.getValue();
                    if (g4qVar != null) {
                        PlaybackCommand$QueueBound playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(g4qVar, z ? new irq() : new xqm());
                        if (playbackCommand$QueueBound != null) {
                            ((k1l) u1eVar.r.getValue()).a(playbackCommand$QueueBound, z ? new b3t("queue_skip") : new b3t("queue_prev"));
                        }
                    }
                    x97.y(u1eVar.w, dm6.b, null, new s1e(u1eVar, z, null, 0), 2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
        s2e s2eVar = (s2e) this.e.b;
        s2eVar.i().performHapticFeedback(0);
        h4b h4bVar = s2eVar.x;
        if (h4bVar != null) {
            u1e u1eVar = (u1e) h4bVar.a;
            u1e.a(u1eVar);
            u1eVar.d();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        this.e.A(motionEvent2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        motionEvent.getClass();
        h4b h4bVar = ((s2e) this.e.b).x;
        if (h4bVar == null) {
            return true;
        }
        u1e u1eVar = (u1e) h4bVar.a;
        u1e.a(u1eVar);
        u1eVar.x.e();
        return true;
    }
}
