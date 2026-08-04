package com.gamericefishpro.space.pi;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends kotlin.coroutines.a implements kotlin.coroutines.d {
    public static final s e = new s(kotlin.coroutines.d.x, new com.gamericefishpro.space.j7.c(25));

    public t() {
        super(kotlin.coroutines.d.x);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.f key2 = this.d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.e != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.d.invoke(this)) != null) {
                return kotlin.coroutines.g.d;
            }
        } else if (kotlin.coroutines.d.x == key) {
            return kotlin.coroutines.g.d;
        }
        return this;
    }

    public abstract void P(CoroutineContext coroutineContext, Runnable runnable);

    public void Q(CoroutineContext coroutineContext, Runnable runnable) {
        com.gamericefishpro.space.ui.a.h(this, coroutineContext, runnable);
    }

    public boolean R(CoroutineContext coroutineContext) {
        return !(this instanceof b2);
    }

    public t S(int i) {
        com.gamericefishpro.space.ui.a.a(i);
        return new com.gamericefishpro.space.ui.g(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element j(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.f key2 = this.d;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.e != key2) {
                return null;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            CoroutineContext.Element element = (CoroutineContext.Element) bVar.d.invoke(this);
            if (element != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.x == key) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.m(this);
    }
}
