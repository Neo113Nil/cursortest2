package W;

import U.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import t0.g;

/* loaded from: classes.dex */
public final class d implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1045a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1046b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1047c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1048d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1045a = windowLayoutComponent;
    }

    @Override // V.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1046b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1048d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1047c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f1045a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, i iVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1046b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1047c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1048d;
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
                this.f1045a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
