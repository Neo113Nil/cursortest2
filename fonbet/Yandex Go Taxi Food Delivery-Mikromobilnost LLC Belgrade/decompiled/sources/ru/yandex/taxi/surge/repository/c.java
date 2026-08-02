package ru.yandex.taxi.surge.repository;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class c {
    public final tt2 a;
    public final cne0 b;

    public c(tt2 tt2Var, dne0 dne0Var) {
        this.a = tt2Var;
        this.b = dne0Var.a("SurgeShortcutModalShowPolicyRepository");
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SurgeShortcutModalShowPolicyRepository$actionTaps$2(this, str, null), continuationImpl);
    }

    public final Object b(String str, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new SurgeShortcutModalShowPolicyRepository$tapOnAction$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
