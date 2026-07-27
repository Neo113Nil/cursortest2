package W;

import E0.i;
import U.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import v.InterfaceC0256a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0256a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1057a;

    /* renamed from: c, reason: collision with root package name */
    public k f1059c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1058b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1060d = new LinkedHashSet();

    public f(Context context) {
        this.f1057a = context;
    }

    @Override // v.InterfaceC0256a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1058b;
        reentrantLock.lock();
        try {
            this.f1059c = e.c(this.f1057a, windowLayoutInfo);
            Iterator it = this.f1060d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0256a) it.next()).accept(this.f1059c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(U.i iVar) {
        ReentrantLock reentrantLock = this.f1058b;
        reentrantLock.lock();
        try {
            k kVar = this.f1059c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f1060d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1060d.isEmpty();
    }

    public final void d(U.i iVar) {
        ReentrantLock reentrantLock = this.f1058b;
        reentrantLock.lock();
        try {
            this.f1060d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
