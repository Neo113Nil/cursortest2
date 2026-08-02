package p6;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* renamed from: p6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4847h extends q6.g {

    /* renamed from: w, reason: collision with root package name */
    public final ConcurrentHashMap f39831w;

    public C4847h(ConcurrentHashMap concurrentHashMap) {
        super(false, concurrentHashMap);
        this.f39831w = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        thread.start();
    }

    @Override // q6.AbstractRunnableC4880d, java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference remove = remove();
                C4846g c4846g = remove != null ? (C4846g) this.f39831w.remove(remove) : null;
                if (c4846g != null && !c4846g.f39830w) {
                    C4849j.f39835u.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) C4849j.a(c4846g));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
