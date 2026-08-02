package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.b580;
import defpackage.bvf0;
import defpackage.cp01;
import defpackage.dp01;
import defpackage.dqe0;
import defpackage.ejj0;
import defpackage.g580;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.ha2;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.lmw0;
import defpackage.ny61;
import defpackage.roj0;
import defpackage.vfx0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes6.dex */
public final class u0 {
    public final vfx0 a;
    public final ru.yandex.taxi.orderforanother.repository.a b;
    public final roj0 c;
    public final dqe0 d;
    public final g580 e;
    public final RequirementsChangedNotifier f;
    public final h3y g;

    public u0(vfx0 vfx0Var, ru.yandex.taxi.orderforanother.repository.a aVar, roj0 roj0Var, dqe0 dqe0Var, g580 g580Var, RequirementsChangedNotifier requirementsChangedNotifier, h3y h3yVar) {
        this.a = vfx0Var;
        this.b = aVar;
        this.c = roj0Var;
        this.d = dqe0Var;
        this.e = g580Var;
        this.f = requirementsChangedNotifier;
        this.g = h3yVar;
    }

    public static final boolean a(u0 u0Var, String str) {
        List list = u0Var.d.a.x;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((b580) it.next()).a, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons b(u0 u0Var, String str, String str2, ContinuationImpl continuationImpl) {
        TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$1 transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1;
        int i;
        u0Var.getClass();
        if (continuationImpl instanceof TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$1) {
            transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1 = (TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$1) continuationImpl;
            int i2 = transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gci0 gci0Var = ((dp01) u0Var.d()).b().g;
                    TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 = new TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2(u0Var, str, str2, null);
                    transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.L$0 = null;
                    transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.L$1 = null;
                    transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.L$2 = null;
                    transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.L$3 = null;
                    transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.label = 1;
                    if (kotlinx.coroutines.flow.e.k(gci0Var, transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2, transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.r("SharedFlow never completes, this call should never return.");
                return null;
            }
        }
        transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1 = new TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$1(u0Var, continuationImpl);
        Object obj2 = transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementStateInteractor$subscribeTransferFeatureUpdates$1.label;
        if (i != 0) {
        }
        ny61.r("SharedFlow never completes, this call should never return.");
        return null;
    }

    public static final boolean c(u0 u0Var, List list, String str, String str2) {
        Object obj;
        Object obj2;
        u0Var.getClass();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((lmw0) obj2).getName(), str)) {
                break;
            }
        }
        jmw0 jmw0Var = obj2 instanceof jmw0 ? (jmw0) obj2 : null;
        if (jmw0Var == null) {
            return false;
        }
        Iterator it2 = jmw0Var.s().c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (jl40.l(((ejj0) next).a, str2)) {
                obj = next;
                break;
            }
        }
        return ((ejj0) obj) != null;
    }

    public final cp01 d() {
        return (cp01) this.g.get();
    }

    public final Object e(SuspendLambda suspendLambda) {
        Object n = bvf0.n(new TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2(this, null), suspendLambda);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public final ha2 f() {
        return kotlinx.coroutines.flow.e.m(this.c.e(), ((dp01) d()).b().g, ((dp01) d()).b().d, ((dp01) d()).b().e, new TransferRequirementStateInteractor$transferRequirementStateFlow$1(this, null));
    }
}
