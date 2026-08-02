package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wh3 implements qdi {
    public final uif a;
    public Throwable c;
    public final Object b = new Object();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final du1 f = new du1(0);

    /* JADX WARN: Multi-variable type inference failed */
    public wh3(Function0 function0) {
        this.a = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.qdi
    public final Object P(Function1 function1, Continuation continuation) {
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        vh3 vh3Var = new vh3(function1, zt3Var);
        synchronized (this.b) {
            Throwable th = this.c;
            if (th != null) {
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(new t7o(th));
            } else {
                boolean isEmpty = this.d.isEmpty();
                this.d.add(vh3Var);
                if (isEmpty) {
                    this.f.set(1);
                }
                zt3Var.u(new al(27, this, vh3Var));
                if (isEmpty) {
                    try {
                        this.a.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.b) {
                            try {
                                if (this.c == null) {
                                    this.c = th2;
                                    ArrayList arrayList = this.d;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        zt3 zt3Var2 = ((vh3) arrayList.get(i)).b;
                                        r7o r7oVar2 = z7o.b;
                                        zt3Var2.resumeWith(new t7o(th2));
                                    }
                                    this.d.clear();
                                    this.f.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public final void c(long j) {
        Object t7oVar;
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.d;
                this.d = this.e;
                this.e = arrayList;
                this.f.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    vh3 vh3Var = (vh3) arrayList.get(i);
                    zt3 zt3Var = vh3Var.b;
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = vh3Var.a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    zt3Var.resumeWith(t7oVar);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
