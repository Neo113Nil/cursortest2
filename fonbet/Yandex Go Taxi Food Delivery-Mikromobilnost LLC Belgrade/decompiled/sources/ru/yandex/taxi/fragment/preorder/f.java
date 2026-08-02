package ru.yandex.taxi.fragment.preorder;

import defpackage.avj0;
import defpackage.dy0;
import defpackage.gh00;
import defpackage.kyh0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tn1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x8z;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

/* loaded from: classes5.dex */
public final class f {
    public final dy0 a;
    public final ru.yandex.taxi.location.autolocation.a b;
    public final ru.yandex.taxi.statebar.controller.a c;
    public final x8z d;
    public final zuj0 e;

    public f(dy0 dy0Var, ru.yandex.taxi.location.autolocation.a aVar, ru.yandex.taxi.statebar.controller.a aVar2, x8z x8zVar, zuj0 zuj0Var) {
        this.a = dy0Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = x8zVar;
        this.e = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tn1 tn1Var, ContinuationImpl continuationImpl) {
        AddressMapLocationInteractor$positionMapToCurrentLocation$1 addressMapLocationInteractor$positionMapToCurrentLocation$1;
        int i;
        wls wlsVar;
        if (continuationImpl instanceof AddressMapLocationInteractor$positionMapToCurrentLocation$1) {
            addressMapLocationInteractor$positionMapToCurrentLocation$1 = (AddressMapLocationInteractor$positionMapToCurrentLocation$1) continuationImpl;
            int i2 = addressMapLocationInteractor$positionMapToCurrentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapLocationInteractor$positionMapToCurrentLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapLocationInteractor$positionMapToCurrentLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapLocationInteractor$positionMapToCurrentLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addressMapLocationInteractor$positionMapToCurrentLocation$1.L$0 = tn1Var;
                    addressMapLocationInteractor$positionMapToCurrentLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b.a).h(addressMapLocationInteractor$positionMapToCurrentLocation$1);
                    wlsVar = tn1Var;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wls wlsVar2 = (wls) addressMapLocationInteractor$positionMapToCurrentLocation$1.L$0;
                    kotlin.b.b(obj);
                    wlsVar = wlsVar2;
                }
                mo21 mo21Var = (mo21) obj;
                boolean v = wwg.v(mo21Var);
                ((gh00) this.a.a).G(mo21Var.a());
                wlsVar.invoke(mo21Var, Boolean.valueOf(v));
                return zy11.a;
            }
        }
        addressMapLocationInteractor$positionMapToCurrentLocation$1 = new AddressMapLocationInteractor$positionMapToCurrentLocation$1(this, continuationImpl);
        Object obj2 = addressMapLocationInteractor$positionMapToCurrentLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapLocationInteractor$positionMapToCurrentLocation$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        boolean v2 = wwg.v(mo21Var2);
        ((gh00) this.a.a).G(mo21Var2.a());
        wlsVar.invoke(mo21Var2, Boolean.valueOf(v2));
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:23|24))(5:25|(1:27)(1:38)|(3:29|(1:33)|34)|35|(1:37))|12|13|(1:15)|16|(1:18)|19|20))|43|6|7|(0)(0)|12|13|(0)|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        r12 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, tls tlsVar, tls tlsVar2, ContinuationImpl continuationImpl) {
        AddressMapLocationInteractor$requestCurrentLocation$1 addressMapLocationInteractor$requestCurrentLocation$1;
        int i;
        Object failure;
        Throwable a;
        String str;
        if (continuationImpl instanceof AddressMapLocationInteractor$requestCurrentLocation$1) {
            addressMapLocationInteractor$requestCurrentLocation$1 = (AddressMapLocationInteractor$requestCurrentLocation$1) continuationImpl;
            int i2 = addressMapLocationInteractor$requestCurrentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapLocationInteractor$requestCurrentLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapLocationInteractor$requestCurrentLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapLocationInteractor$requestCurrentLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        str = ((avj0) this.e).h(kyh0.address_determine_current_location);
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        ru.yandex.taxi.statebar.controller.a aVar = this.c;
                        aVar.q = true;
                        if (aVar.e() && !aVar.s) {
                            aVar.k.a("improper", NotificatorReporter$MessageType.NETWORK_ERROR);
                        }
                        aVar.f();
                        this.d.c(str, "", LocationErrorReason.LOCATION_MESSAGE_REASON, null);
                    }
                    ru.yandex.taxi.location.autolocation.a aVar2 = this.b;
                    addressMapLocationInteractor$requestCurrentLocation$1.L$0 = tlsVar;
                    addressMapLocationInteractor$requestCurrentLocation$1.L$1 = tlsVar2;
                    addressMapLocationInteractor$requestCurrentLocation$1.L$2 = null;
                    addressMapLocationInteractor$requestCurrentLocation$1.Z$0 = z;
                    addressMapLocationInteractor$requestCurrentLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) aVar2.a).o(addressMapLocationInteractor$requestCurrentLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar2 = (tls) addressMapLocationInteractor$requestCurrentLocation$1.L$1;
                    tlsVar = (tls) addressMapLocationInteractor$requestCurrentLocation$1.L$0;
                    kotlin.b.b(obj);
                }
                failure = (mo21) obj;
                if (!(failure instanceof Result.Failure)) {
                    tlsVar.invoke(failure);
                }
                a = Result.a(failure);
                if (a != null) {
                    tlsVar2.invoke(a);
                }
                return zy11.a;
            }
        }
        addressMapLocationInteractor$requestCurrentLocation$1 = new AddressMapLocationInteractor$requestCurrentLocation$1(this, continuationImpl);
        Object obj2 = addressMapLocationInteractor$requestCurrentLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapLocationInteractor$requestCurrentLocation$1.label;
        if (i != 0) {
        }
        failure = (mo21) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return zy11.a;
    }
}
