package ru.yandex.taxi.masstransit.domain;

import defpackage.ck31;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pb31;
import defpackage.t24;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tu30;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class h0 {
    public final ck31 a;
    public final tu30 b;
    public final pb31 c;
    public final com.yandex.go.taxi.experiments.q d;
    public final long e;

    public h0(ck31 ck31Var, tu30 tu30Var, pb31 pb31Var, com.yandex.go.taxi.experiments.q qVar) {
        this.a = ck31Var;
        this.b = tu30Var;
        this.c = pb31Var;
        this.d = qVar;
        o430 o430Var = e3n.b;
        this.e = e3n.e(kp50.U(5, DurationUnit.SECONDS));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (kotlinx.coroutines.a.u(r7.e, r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tls tlsVar, ContinuationImpl continuationImpl) {
        MtVerticalsInteractor$observeTransportVertical$1 mtVerticalsInteractor$observeTransportVertical$1;
        int i;
        if (continuationImpl instanceof MtVerticalsInteractor$observeTransportVertical$1) {
            mtVerticalsInteractor$observeTransportVertical$1 = (MtVerticalsInteractor$observeTransportVertical$1) continuationImpl;
            int i2 = mtVerticalsInteractor$observeTransportVertical$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtVerticalsInteractor$observeTransportVertical$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtVerticalsInteractor$observeTransportVertical$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtVerticalsInteractor$observeTransportVertical$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MtVerticalsInteractor$observeTransportVertical$2 mtVerticalsInteractor$observeTransportVertical$2 = new MtVerticalsInteractor$observeTransportVertical$2(this, null);
                    mtVerticalsInteractor$observeTransportVertical$1.L$0 = tlsVar;
                    mtVerticalsInteractor$observeTransportVertical$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tlsVar = (tls) mtVerticalsInteractor$observeTransportVertical$1.L$0;
                    kotlin.b.b(obj);
                }
                com.yandex.go.taxi.tariffs.internal.repository.h i3 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).i();
                t24 t24Var = new t24(9, tlsVar);
                mtVerticalsInteractor$observeTransportVertical$1.L$0 = null;
                mtVerticalsInteractor$observeTransportVertical$1.label = 2;
                Object collect = i3.collect(t24Var, mtVerticalsInteractor$observeTransportVertical$1);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        mtVerticalsInteractor$observeTransportVertical$1 = new MtVerticalsInteractor$observeTransportVertical$1(this, continuationImpl);
        Object obj2 = mtVerticalsInteractor$observeTransportVertical$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtVerticalsInteractor$observeTransportVertical$1.label;
        if (i != 0) {
        }
        com.yandex.go.taxi.tariffs.internal.repository.h i32 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).i();
        t24 t24Var2 = new t24(9, tlsVar);
        mtVerticalsInteractor$observeTransportVertical$1.L$0 = null;
        mtVerticalsInteractor$observeTransportVertical$1.label = 2;
        Object collect2 = i32.collect(t24Var2, mtVerticalsInteractor$observeTransportVertical$1);
        if (collect2 != coroutineSingletons2) {
        }
    }

    public final tpr b() {
        return kotlinx.coroutines.flow.e.t(new m0(((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).i(), this.d.a(), new MtVerticalsInteractor$stateFlow$1(this, null)));
    }
}
