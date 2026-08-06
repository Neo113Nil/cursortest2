package b0;

import P0.q;
import a0.InterfaceC0084a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import h1.C0239i;
import i1.r;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129c implements InterfaceC0084a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f2602a;

    /* renamed from: b, reason: collision with root package name */
    public final V.b f2603b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f2604c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2605d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2606e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2607f = new LinkedHashMap();

    public C0129c(WindowLayoutComponent windowLayoutComponent, V.b bVar) {
        this.f2602a = windowLayoutComponent;
        this.f2603b = bVar;
    }

    @Override // a0.InterfaceC0084a
    public final void a(q qVar) {
        ReentrantLock reentrantLock = this.f2604c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2606e;
        try {
            Context context = (Context) linkedHashMap.get(qVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f2605d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(qVar);
            linkedHashMap.remove(qVar);
            if (fVar.f2615d.isEmpty()) {
                linkedHashMap2.remove(context);
                W.d dVar = (W.d) this.f2607f.remove(fVar);
                if (dVar != null) {
                    dVar.f1839a.invoke(dVar.f1840b, dVar.f1841c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a0.InterfaceC0084a
    public final void b(Context context, N.c cVar, q qVar) {
        C0239i c0239i;
        ReentrantLock reentrantLock = this.f2604c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2605d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f2606e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(r.f3416a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f2607f.put(fVar2, this.f2603b.a(this.f2602a, kotlin.jvm.internal.q.a(WindowLayoutInfo.class), (Activity) context, new C0128b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
