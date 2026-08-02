package ru.yandex.taxi.persuggest.fingerprint;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sm21;
import defpackage.tm21;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.xm21;
import defpackage.zm21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.fingerprint.UserFingerprintZoneInteractor$applySensorRecognition$2", f = "UserFingerprintZoneInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class UserFingerprintZoneInteractor$applySensorRecognition$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $gnssSampling;
    final /* synthetic */ boolean $motionSampling;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFingerprintZoneInteractor$applySensorRecognition$2(Continuation continuation, c cVar, boolean z, boolean z2) {
        super(2, continuation);
        this.$motionSampling = z;
        this.this$0 = cVar;
        this.$gnssSampling = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserFingerprintZoneInteractor$applySensorRecognition$2 userFingerprintZoneInteractor$applySensorRecognition$2 = new UserFingerprintZoneInteractor$applySensorRecognition$2(continuation, this.this$0, this.$motionSampling, this.$gnssSampling);
        userFingerprintZoneInteractor$applySensorRecognition$2.L$0 = obj;
        return userFingerprintZoneInteractor$applySensorRecognition$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserFingerprintZoneInteractor$applySensorRecognition$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object failure2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = this.$motionSampling;
        c cVar = this.this$0;
        try {
            if (z) {
                cVar.c.a();
            } else {
                zm21 zm21Var = cVar.c;
                synchronized (zm21Var) {
                    try {
                        if (zm21Var.c) {
                            zm21Var.c = false;
                            UserFingerprintSensorSession$createMotionSensorListener$1 userFingerprintSensorSession$createMotionSensorListener$1 = zm21Var.d;
                            if (userFingerprintSensorSession$createMotionSensorListener$1 != null) {
                                zm21Var.a.unregisterListener(userFingerprintSensorSession$createMotionSensorListener$1);
                            }
                            zm21Var.d = null;
                            zm21Var.b.set(xm21.f);
                        }
                    } finally {
                    }
                }
            }
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.l(jst.e, "UserFingerprintSensor", null, a, "sensorSession start/stop failed", 2);
        }
        boolean z2 = this.$gnssSampling;
        c cVar2 = this.this$0;
        try {
            if (z2) {
                cVar2.d.a();
            } else {
                tm21 tm21Var = cVar2.d;
                if (tm21Var.e) {
                    tm21Var.e = false;
                    UserFingerprintGnssSession$start$measCallback$1 userFingerprintGnssSession$start$measCallback$1 = tm21Var.f;
                    if (userFingerprintGnssSession$start$measCallback$1 != null) {
                        try {
                            tm21Var.b.unregisterGnssMeasurementsCallback(userFingerprintGnssSession$start$measCallback$1);
                        } catch (Throwable unused) {
                        }
                    }
                    UserFingerprintGnssSession$start$statusCallback$1 userFingerprintGnssSession$start$statusCallback$1 = tm21Var.g;
                    if (userFingerprintGnssSession$start$statusCallback$1 != null) {
                        try {
                            tm21Var.b.unregisterGnssStatusCallback(userFingerprintGnssSession$start$statusCallback$1);
                        } catch (Throwable unused2) {
                        }
                    }
                    tm21Var.f = null;
                    tm21Var.g = null;
                    tm21Var.d.set(sm21.c);
                }
            }
            failure2 = zy11.a;
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a2 = Result.a(failure2);
        if (a2 != null) {
            xby.l(jst.e, "UserFingerprintGnss", null, a2, "gnssSession start/stop failed", 2);
        }
        return new Result(failure2);
    }
}
