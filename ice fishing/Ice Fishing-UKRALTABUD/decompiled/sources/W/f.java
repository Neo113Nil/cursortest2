package W;

import E0.i;
import U.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import v.InterfaceC0262a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0262a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1049a;

    /* renamed from: c, reason: collision with root package name */
    public k f1051c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1050b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1052d = new LinkedHashSet();

    public f(Context context) {
        this.f1049a = context;
    }

    @Override // v.InterfaceC0262a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1050b;
        reentrantLock.lock();
        try {
            this.f1051c = e.c(this.f1049a, windowLayoutInfo);
            Iterator it = this.f1052d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0262a) it.next()).accept(this.f1051c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(U.i iVar) {
        ReentrantLock reentrantLock = this.f1050b;
        reentrantLock.lock();
        try {
            k kVar = this.f1051c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f1052d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1052d.isEmpty();
    }

    public final void d(U.i iVar) {
        ReentrantLock reentrantLock = this.f1050b;
        reentrantLock.lock();
        try {
            this.f1052d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
