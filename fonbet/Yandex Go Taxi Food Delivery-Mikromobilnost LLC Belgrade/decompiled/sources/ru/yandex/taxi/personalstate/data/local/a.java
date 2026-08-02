package ru.yandex.taxi.personalstate.data.local;

import defpackage.h4z;
import defpackage.j7b0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final tt2 a;
    public final h4z b;
    public final ru.yandex.taxi.personalstate.data.remote.a c;

    public a(tt2 tt2Var, h4z h4zVar, ru.yandex.taxi.personalstate.data.remote.a aVar) {
        this.a = tt2Var;
        this.b = h4zVar;
        this.c = aVar;
    }

    public final Object a(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new LocalPersonalStateRepository$clean$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object b(ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LocalPersonalStateRepository$load$2(this, null), continuationImpl);
    }

    public final Object c(j7b0 j7b0Var, ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LocalPersonalStateRepository$save$2(this, j7b0Var, null), continuationImpl);
    }
}
