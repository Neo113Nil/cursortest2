package androidx.window.layout;

import Z.C0072u;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f2219a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f2220b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2221c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2222d = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent) {
        this.f2219a = windowLayoutComponent;
    }

    @Override // androidx.window.layout.v
    public final void a(Activity activity, i0.d dVar, C0072u c0072u) {
        t1.i iVar;
        ReentrantLock reentrantLock = this.f2220b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2221c;
        try {
            b bVar = (b) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f2222d;
            if (bVar == null) {
                iVar = null;
            } else {
                bVar.a(c0072u);
                linkedHashMap2.put(c0072u, activity);
                iVar = t1.i.f4388c;
            }
            if (iVar == null) {
                b bVar2 = new b(activity);
                linkedHashMap.put(activity, bVar2);
                linkedHashMap2.put(c0072u, activity);
                bVar2.a(c0072u);
                this.f2219a.addWindowLayoutInfoListener(activity, bVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.v
    public final void b(N.a aVar) {
        D1.i.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f2220b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f2222d.get(aVar);
            if (activity == null) {
                return;
            }
            b bVar = (b) this.f2221c.get(activity);
            if (bVar == null) {
                return;
            }
            bVar.c(aVar);
            if (bVar.b()) {
                this.f2219a.removeWindowLayoutInfoListener(bVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
