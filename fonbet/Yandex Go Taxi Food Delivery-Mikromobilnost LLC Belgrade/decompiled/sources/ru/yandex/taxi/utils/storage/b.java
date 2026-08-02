package ru.yandex.taxi.utils.storage;

import defpackage.i3y;
import defpackage.jse;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.yww0;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class b implements yww0 {
    public final i3y a;
    public final tse b;
    public final AtomicReference c = new AtomicReference(null);
    public final jse d;

    public b(i3y i3yVar, tse tseVar) {
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
        return tje.k0(this.d, new AtomicStorageCachedWrapperSuspend$getData$2(this, null), continuation);
    }

    @Override // defpackage.yww0
    public final void b(Object obj) {
        this.c.set(obj);
        tje.N(this.b, null, null, new AtomicStorageCachedWrapperSuspend$setDataAsync$1(this, obj, null), 3);
    }

    @Override // defpackage.yww0
    public final Object d(Object obj, Continuation continuation) {
        this.c.set(obj);
        Object k0 = tje.k0(this.d, new AtomicStorageCachedWrapperSuspend$setData$2(this, obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
