package W;

import E0.q;
import U.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import t0.g;
import u0.l;

/* loaded from: classes.dex */
public final class c implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1039a;

    /* renamed from: b, reason: collision with root package name */
    public final Q.a f1040b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1041c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1042d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1043e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1044f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, Q.a aVar) {
        this.f1039a = windowLayoutComponent;
        this.f1040b = aVar;
    }

    @Override // V.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1041c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1043e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1042d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f1052d.isEmpty()) {
                linkedHashMap2.remove(context);
                R.d dVar = (R.d) this.f1044f.remove(fVar);
                if (dVar != null) {
                    dVar.f921a.invoke(dVar.f922b, dVar.f923c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, i iVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1041c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1042d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1043e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                gVar = g.f2989a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f3001f));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1044f.put(fVar2, this.f1040b.a(this.f1039a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
