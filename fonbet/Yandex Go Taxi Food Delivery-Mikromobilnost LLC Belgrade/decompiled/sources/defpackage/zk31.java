package defpackage;

import android.os.SystemClock;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class zk31 extends uo7 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ b c;
    public final /* synthetic */ dyq0 d;

    public zk31(AtomicBoolean atomicBoolean, b bVar, dyq0 dyq0Var) {
        this.b = atomicBoolean;
        this.c = bVar;
        this.d = dyq0Var;
    }

    @Override // defpackage.uo7
    public final void b(int i, ap7 ap7Var) {
        Object obj;
        if (this.a) {
            this.a = false;
            ap7Var.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
            sgb1.g(3, "VideoCapture");
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = ap7Var.b().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int intValue = ((Integer) obj).intValue();
        b bVar = this.c;
        if (intValue == bVar.hashCode() && bVar.b(null) && !atomicBoolean.getAndSet(true)) {
            geb1.f().execute(new t601(23, this, this.d));
        }
    }
}
