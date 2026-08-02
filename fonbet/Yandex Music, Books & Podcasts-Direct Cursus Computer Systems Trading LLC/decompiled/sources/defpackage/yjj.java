package defpackage;

import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class yjj {
    public final LinkedHashSet a = new LinkedHashSet();

    public final void a(Object obj) {
        synchronized (this.a) {
            this.a.add(obj);
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    public final void c(Function1 function1) {
        Object t7oVar;
        synchronized (this.a) {
            for (Object obj : this.a) {
                try {
                    r7o r7oVar = z7o.b;
                    function1.invoke(obj);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.e(a, "forEach", new Object[0]);
                }
            }
        }
    }

    public final LinkedHashSet d() {
        return this.a;
    }

    public final void e(Object obj) {
        synchronized (this.a) {
            this.a.remove(obj);
        }
    }
}
