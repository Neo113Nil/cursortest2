package W;

import E0.q;
import U.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import t0.C0252g;
import u0.l;

/* loaded from: classes.dex */
public final class c implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1047a;

    /* renamed from: b, reason: collision with root package name */
    public final Q.a f1048b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1049c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1050d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1051e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1052f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, Q.a aVar) {
        this.f1047a = windowLayoutComponent;
        this.f1048b = aVar;
    }

    @Override // V.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1049c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1051e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1050d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f1060d.isEmpty()) {
                linkedHashMap2.remove(context);
                R.d dVar = (R.d) this.f1052f.remove(fVar);
                if (dVar != null) {
                    dVar.f929a.invoke(dVar.f930b, dVar.f931c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, i iVar) {
        C0252g c0252g;
        ReentrantLock reentrantLock = this.f1049c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1050d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1051e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                c0252g = C0252g.f2994a;
            } else {
                c0252g = null;
            }
            if (c0252g == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f3006e));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1052f.put(fVar2, this.f1048b.a(this.f1047a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
