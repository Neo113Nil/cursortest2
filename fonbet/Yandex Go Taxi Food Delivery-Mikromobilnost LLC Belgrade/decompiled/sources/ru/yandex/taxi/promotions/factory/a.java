package ru.yandex.taxi.promotions.factory;

import com.yandex.go.payments.domain.j0;
import defpackage.bjm0;
import defpackage.bvf0;
import defpackage.dab1;
import defpackage.dqe0;
import defpackage.fl8;
import defpackage.h3y;
import defpackage.lea0;
import defpackage.nmx;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.po21;
import defpackage.qea0;
import defpackage.tt2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.h;

/* loaded from: classes9.dex */
public final class a {
    public final po21 a;
    public final dqe0 b;
    public final h3y c;
    public final h3y d;
    public final nmx e;
    public final h f;
    public final tt2 g;
    public final qea0 h;

    public a(po21 po21Var, dqe0 dqe0Var, h3y h3yVar, h3y h3yVar2, nmx nmxVar, h hVar, tt2 tt2Var, qea0 qea0Var) {
        this.a = po21Var;
        this.b = dqe0Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = nmxVar;
        this.f = hVar;
        this.g = tt2Var;
        this.h = qea0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(a aVar, ContinuationImpl continuationImpl) {
        ApplicationStateFactory$availableVerifiedPaymentTypes$1 applicationStateFactory$availableVerifiedPaymentTypes$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ApplicationStateFactory$availableVerifiedPaymentTypes$1) {
            applicationStateFactory$availableVerifiedPaymentTypes$1 = (ApplicationStateFactory$availableVerifiedPaymentTypes$1) continuationImpl;
            int i2 = applicationStateFactory$availableVerifiedPaymentTypes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationStateFactory$availableVerifiedPaymentTypes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationStateFactory$availableVerifiedPaymentTypes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationStateFactory$availableVerifiedPaymentTypes$1.label;
                if (i != 0) {
                    b.b(obj);
                    m0 a = ((j0) aVar.h).a(dab1.L);
                    applicationStateFactory$availableVerifiedPaymentTypes$1.label = 1;
                    obj = e.y(a, applicationStateFactory$availableVerifiedPaymentTypes$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                List<lea0> list = ((oea0) obj).a;
                ArrayList arrayList = new ArrayList();
                for (lea0 lea0Var : list) {
                    String code = ((!(lea0Var instanceof fl8) || ((fl8) lea0Var).c) && (!(lea0Var instanceof bjm0) || ((bjm0) lea0Var).a())) ? lea0Var.c().getCode() : null;
                    if (code != null) {
                        arrayList.add(code);
                    }
                }
                return arrayList;
            }
        }
        applicationStateFactory$availableVerifiedPaymentTypes$1 = new ApplicationStateFactory$availableVerifiedPaymentTypes$1(aVar, continuationImpl);
        Object obj2 = applicationStateFactory$availableVerifiedPaymentTypes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationStateFactory$availableVerifiedPaymentTypes$1.label;
        if (i != 0) {
        }
        List<lea0> list2 = ((oea0) obj2).a;
        ArrayList arrayList2 = new ArrayList();
        while (r5.hasNext()) {
        }
        return arrayList2;
    }

    public final Object b(ContinuationImpl continuationImpl) {
        return bvf0.n(new ApplicationStateFactory$create$2(this, null), continuationImpl);
    }
}
