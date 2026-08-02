package kotlinx.coroutines;

import defpackage.em6;
import defpackage.ff7;
import defpackage.kz5;
import defpackage.p5g;
import defpackage.q5g;
import defpackage.w98;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public abstract class a extends kotlin.coroutines.a implements kotlin.coroutines.d {
    public static final em6 c = new em6(kotlin.coroutines.d.t0, new kz5(25));

    public a() {
        super(kotlin.coroutines.d.t0);
    }

    public abstract void F0(CoroutineContext coroutineContext, Runnable runnable);

    public void G0(CoroutineContext coroutineContext, Runnable runnable) {
        w98.b(runnable, coroutineContext, this);
    }

    public boolean H0(CoroutineContext coroutineContext) {
        return !(this instanceof e);
    }

    public a I0(int i) {
        q5g.B(i);
        return new p5g(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            f key = getKey();
            key.getClass();
            if ((key == bVar || bVar.b == key) && (element = (CoroutineContext.Element) bVar.a.invoke(this)) != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.t0 == fVar) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            f key = getKey();
            key.getClass();
            if (key != bVar && bVar.b != key) {
                return this;
            }
            if (((CoroutineContext.Element) bVar.a.invoke(this)) != null) {
                return g.a;
            }
        } else if (kotlin.coroutines.d.t0 == fVar) {
            return g.a;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ff7.B(this);
    }
}
