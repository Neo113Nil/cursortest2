package W;

import U.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import t0.C0252g;

/* loaded from: classes.dex */
public final class d implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1053a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1054b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1055c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1056d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1053a = windowLayoutComponent;
    }

    @Override // V.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1054b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1056d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1055c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f1053a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, i iVar) {
        C0252g c0252g;
        ReentrantLock reentrantLock = this.f1054b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1055c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1056d;
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
                this.f1053a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
