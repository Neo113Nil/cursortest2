package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f736g;

    public z(b0 b0Var) {
        this.f736g = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f736g.f652a) {
            obj = this.f736g.f655d;
            this.f736g.f655d = b0.f651i;
        }
        b0 b0Var = this.f736g;
        n.a.a0().f4973d.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a4.d.j("Cannot invoke ", "setValue", " on a background thread"));
        }
        b0Var.f656e++;
        b0Var.f654c = obj;
        if (b0Var.f657f) {
            b0Var.f658g = true;
            return;
        }
        b0Var.f657f = true;
        do {
            b0Var.f658g = false;
            o.f fVar = b0Var.f653b;
            fVar.getClass();
            o.d dVar = new o.d(fVar);
            fVar.f5125i.put(dVar, Boolean.FALSE);
            while (dVar.hasNext()) {
                b0Var.a((a0) ((Map.Entry) dVar.next()).getValue());
                if (b0Var.f658g) {
                    break;
                }
            }
        } while (b0Var.f658g);
        b0Var.f657f = false;
    }
}
