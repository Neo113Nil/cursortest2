package b0;

import P0.q;
import Z.j;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import x.InterfaceC1063a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1063a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2612a;

    /* renamed from: c, reason: collision with root package name */
    public j f2614c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f2613b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2615d = new LinkedHashSet();

    public f(Context context) {
        this.f2612a = context;
    }

    @Override // x.InterfaceC1063a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        i.e(value, "value");
        ReentrantLock reentrantLock = this.f2613b;
        reentrantLock.lock();
        try {
            this.f2614c = e.c(this.f2612a, value);
            Iterator it = this.f2615d.iterator();
            while (it.hasNext()) {
                ((InterfaceC1063a) it.next()).accept(this.f2614c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(q qVar) {
        ReentrantLock reentrantLock = this.f2613b;
        reentrantLock.lock();
        try {
            j jVar = this.f2614c;
            if (jVar != null) {
                qVar.accept(jVar);
            }
            this.f2615d.add(qVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f2615d.isEmpty();
    }

    public final void d(q qVar) {
        ReentrantLock reentrantLock = this.f2613b;
        reentrantLock.lock();
        try {
            this.f2615d.remove(qVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
