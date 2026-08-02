package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class t66 implements xjo, oqi {
    public final xjo a;
    public final oqi b;
    public CoroutineContext c;
    public Throwable d;
    public final s66 e;

    public t66(xjo xjoVar) {
        qqi a = rqi.a();
        xjoVar.getClass();
        this.a = xjoVar;
        this.b = a;
        this.e = new s66(this);
    }

    @Override // defpackage.xjo
    public final cko D0(String str) {
        str.getClass();
        s66 s66Var = this.e;
        if (s66Var == null) {
            return this.a.D0(str);
        }
        Object obj = s66Var.get(str);
        obj.getClass();
        return new g13((cko) obj, 1);
    }

    @Override // defpackage.oqi
    public final Object a(Continuation continuation) {
        return this.b.a(continuation);
    }

    @Override // defpackage.oqi
    public final void b(Object obj) {
        this.b.b(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        s66 s66Var = this.e;
        if (s66Var != null) {
            s66Var.evictAll();
        }
        this.a.close();
    }

    public final void g(StringBuilder sb) {
        Iterable iterable;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            CoroutineContext coroutineContext = this.c;
            if (coroutineContext != null) {
                sb.append("\t\tCoroutine: " + coroutineContext);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                String b = fob.b(th);
                b.getClass();
                k7g k7gVar = new k7g(b);
                if (k7gVar.hasNext()) {
                    Object next = k7gVar.next();
                    if (k7gVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (k7gVar.hasNext()) {
                            arrayList.add(k7gVar.next());
                        }
                        iterable = arrayList;
                    } else {
                        iterable = t75.c(next);
                    }
                } else {
                    iterable = c5b.a;
                }
                Iterator it = CollectionsKt.L(iterable, 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        s66 s66Var = this.e;
        if (s66Var != null) {
            sb.append("\t\tPrepared Statement Cache Size: " + s66Var.size());
            sb.append('\n');
        }
    }

    @Override // defpackage.xjo
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }

    public final String toString() {
        return this.a.toString();
    }
}
