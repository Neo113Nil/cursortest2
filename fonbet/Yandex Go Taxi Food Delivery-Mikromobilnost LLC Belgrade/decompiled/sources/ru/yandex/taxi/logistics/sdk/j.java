package ru.yandex.taxi.logistics.sdk;

import defpackage.bvf0;
import defpackage.eci0;
import defpackage.ky11;
import defpackage.mdh;
import defpackage.o400;
import defpackage.qr50;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class j implements qr50 {
    public final ky11 a;
    public final eci0 b;

    public j(tt2 tt2Var, ky11 ky11Var) {
        this.a = ky11Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.b = kotlinx.coroutines.flow.e.O(new i(ky11Var.d()), bvf0.a(mdh.b), wsr0.a(xsr0.a, 3), 1);
    }

    @Override // defpackage.qr50
    public final Object a(ContinuationImpl continuationImpl) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a.x, new ExternalDeliveriesSourceImpl$forceUpdate$2(this, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    @Override // defpackage.qr50
    public final tpr b() {
        return this.b;
    }
}
