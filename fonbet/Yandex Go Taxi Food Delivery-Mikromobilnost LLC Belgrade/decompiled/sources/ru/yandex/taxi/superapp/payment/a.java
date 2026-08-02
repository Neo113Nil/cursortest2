package ru.yandex.taxi.superapp.payment;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.superapp.payment.b;
import defpackage.b6w0;
import defpackage.cda0;
import defpackage.h0a0;
import defpackage.h1p;
import defpackage.lzu0;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.yrv0;
import defpackage.yu0;
import defpackage.zzs;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes6.dex */
public final class a {
    public final tse a;
    public final tt2 b;
    public final cda0 c;
    public final b d;
    public final yrv0 e;
    public pzt0 g;
    public final ConcurrentHashMap f = new ConcurrentHashMap(EatsService.f().size());
    public final n2v0 h = new n2v0(3, this);

    public a(tse tseVar, tt2 tt2Var, cda0 cda0Var, b bVar, yrv0 yrv0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = cda0Var;
        this.d = bVar;
        this.e = yrv0Var;
    }

    public final l0 a(h1p h1pVar) {
        l0 l0Var;
        b6w0 b = b(h1pVar);
        synchronized (b) {
            try {
                if (b.c == null) {
                    l0 b2 = b.b.a.b();
                    b2.f = b.a;
                    b.c = b2;
                }
                l0Var = b.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public final b6w0 b(h1p h1pVar) {
        return (b6w0) this.f.computeIfAbsent(h1pVar, new yu0(23, new lzu0(8, h1pVar, this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(h1p h1pVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        SuperAppPaymentMethodsInteractor$paymentModels$1 superAppPaymentMethodsInteractor$paymentModels$1;
        int i;
        if (continuationImpl instanceof SuperAppPaymentMethodsInteractor$paymentModels$1) {
            superAppPaymentMethodsInteractor$paymentModels$1 = (SuperAppPaymentMethodsInteractor$paymentModels$1) continuationImpl;
            int i2 = superAppPaymentMethodsInteractor$paymentModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppPaymentMethodsInteractor$paymentModels$1.label = i2 - Integer.MIN_VALUE;
                SuperAppPaymentMethodsInteractor$paymentModels$1 superAppPaymentMethodsInteractor$paymentModels$12 = superAppPaymentMethodsInteractor$paymentModels$1;
                Object obj = superAppPaymentMethodsInteractor$paymentModels$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppPaymentMethodsInteractor$paymentModels$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h0a0 h0a0Var = new h0a0(zzsVar, null);
                    l0 a = a(h1pVar);
                    superAppPaymentMethodsInteractor$paymentModels$12.L$0 = null;
                    superAppPaymentMethodsInteractor$paymentModels$12.L$1 = null;
                    superAppPaymentMethodsInteractor$paymentModels$12.L$2 = null;
                    superAppPaymentMethodsInteractor$paymentModels$12.label = 1;
                    obj = l0.d(a, h0a0Var, null, false, superAppPaymentMethodsInteractor$paymentModels$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (oea0) obj;
            }
        }
        superAppPaymentMethodsInteractor$paymentModels$1 = new SuperAppPaymentMethodsInteractor$paymentModels$1(this, continuationImpl);
        SuperAppPaymentMethodsInteractor$paymentModels$1 superAppPaymentMethodsInteractor$paymentModels$122 = superAppPaymentMethodsInteractor$paymentModels$1;
        Object obj2 = superAppPaymentMethodsInteractor$paymentModels$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppPaymentMethodsInteractor$paymentModels$122.label;
        if (i != 0) {
        }
        return (oea0) obj2;
    }
}
