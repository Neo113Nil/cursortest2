package b0;

import P0.q;
import a0.InterfaceC0084a;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import h1.C0239i;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements InterfaceC0084a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f2608a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f2609b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2610c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2611d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f2608a = windowLayoutComponent;
    }

    @Override // a0.InterfaceC0084a
    public final void a(q qVar) {
        ReentrantLock reentrantLock = this.f2609b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2611d;
        try {
            Context context = (Context) linkedHashMap.get(qVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f2610c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(qVar);
            linkedHashMap.remove(qVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f2608a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a0.InterfaceC0084a
    public final void b(Context context, N.c cVar, q qVar) {
        C0239i c0239i;
        ReentrantLock reentrantLock = this.f2609b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2610c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f2611d;
            if (fVar != null) {
                fVar.b(qVar);
                linkedHashMap2.put(qVar, context);
                c0239i = C0239i.f3393a;
            } else {
                c0239i = null;
            }
            if (c0239i == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(qVar, context);
                fVar2.b(qVar);
                this.f2608a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
