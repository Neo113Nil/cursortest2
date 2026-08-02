package ru.yandex.taxi.utils.storage;

import defpackage.hk20;
import defpackage.i3y;
import defpackage.iju0;
import defpackage.jju0;
import defpackage.jse;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tb3;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements hk20 {
    public final i3y a;
    public final tse b;
    public final AtomicReference c = new AtomicReference(null);
    public final jse d;

    public a(i3y i3yVar, tse tseVar) {
        this.a = i3yVar;
        this.b = tseVar;
        sjh sjhVar = uyj.a;
        this.d = mdh.b.P(1);
    }

    @Override // defpackage.yww0
    public final Object a(Continuation continuation) {
        Object obj = this.c.get();
        if (obj != null) {
            return obj;
        }
        return tje.k0(this.d, new AtomicStorageCachedWrapperMixed$getData$2(this, null), continuation);
    }

    @Override // defpackage.yww0
    public final void b(Object obj) {
        this.c.set(obj);
        tje.N(this.b, this.d, null, new AtomicStorageCachedWrapperMixed$setDataAsync$1(this, obj, null), 2);
    }

    @Override // defpackage.hk20
    public final Object c() {
        Object obj = this.c.get();
        return obj == null ? f().a() : obj;
    }

    @Override // defpackage.yww0
    public final Object d(Object obj, Continuation continuation) {
        this.c.set(obj);
        Object k0 = tje.k0(this.d, new AtomicStorageCachedWrapperMixed$setData$2(this, obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object e(Continuation continuation) {
        Object obj = this.c.get();
        if (obj != null) {
            return new iju0(obj);
        }
        return tje.k0(this.d, new AtomicStorageCachedWrapperMixed$getResponse$3(this, null), continuation);
    }

    public final synchronized jju0 f() {
        jju0 a;
        a = ((tb3) this.a.getValue()).a();
        AtomicReference atomicReference = this.c;
        Object a2 = a.a();
        while (!atomicReference.compareAndSet(null, a2) && atomicReference.get() == null) {
        }
        return a;
    }
}
