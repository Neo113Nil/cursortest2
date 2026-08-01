package androidx.window.layout;

import Z.C0072u;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class b implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f2215a;

    /* renamed from: c, reason: collision with root package name */
    public z f2217c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f2216b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2218d = new LinkedHashSet();

    public b(Activity activity) {
        this.f2215a = activity;
    }

    public final void a(C0072u c0072u) {
        ReentrantLock reentrantLock = this.f2216b;
        reentrantLock.lock();
        try {
            z zVar = this.f2217c;
            if (zVar != null) {
                c0072u.accept(zVar);
            }
            this.f2218d.add(c0072u);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        D1.i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f2216b;
        reentrantLock.lock();
        try {
            this.f2217c = d.b(this.f2215a, windowLayoutInfo);
            Iterator it = this.f2218d.iterator();
            while (it.hasNext()) {
                ((N.a) it.next()).accept(this.f2217c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b() {
        return this.f2218d.isEmpty();
    }

    public final void c(N.a aVar) {
        D1.i.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f2216b;
        reentrantLock.lock();
        try {
            this.f2218d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
