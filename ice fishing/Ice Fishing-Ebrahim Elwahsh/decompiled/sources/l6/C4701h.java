package l6;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* renamed from: l6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4701h extends m6.g {

    /* renamed from: w, reason: collision with root package name */
    public final ConcurrentHashMap f39064w;

    public C4701h(ConcurrentHashMap concurrentHashMap) {
        super(false, concurrentHashMap);
        this.f39064w = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        thread.start();
    }

    @Override // m6.AbstractRunnableC4786d, java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference remove = remove();
                C4700g c4700g = remove != null ? (C4700g) this.f39064w.remove(remove) : null;
                if (c4700g != null && !c4700g.f39063w) {
                    C4703j.f39068u.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) C4703j.a(c4700g));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
