package com.squareup.cash.session.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionManager$updateSessionState$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSessionManager$updateSessionState$2(RealSessionManager realSessionManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealSessionManager realSessionManager = this.this$0;
        switch (i) {
            case 0:
                RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$2 = new RealSessionManager$updateSessionState$2(realSessionManager, continuation, 0);
                realSessionManager$updateSessionState$2.L$0 = obj;
                return realSessionManager$updateSessionState$2;
            case 1:
                RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$22 = new RealSessionManager$updateSessionState$2(realSessionManager, continuation, 1);
                realSessionManager$updateSessionState$22.L$0 = obj;
                return realSessionManager$updateSessionState$22;
            case 2:
                RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$23 = new RealSessionManager$updateSessionState$2(realSessionManager, continuation, 2);
                realSessionManager$updateSessionState$23.L$0 = obj;
                return realSessionManager$updateSessionState$23;
            default:
                RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$24 = new RealSessionManager$updateSessionState$2(realSessionManager, continuation, 3);
                realSessionManager$updateSessionState$24.L$0 = obj;
                return realSessionManager$updateSessionState$24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealSessionManager$updateSessionState$2) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealSessionManager realSessionManager = this.this$0;
        switch (i) {
            case 0:
                String str = (String) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedPreferencesKeyValue sharedPreferencesKeyValue = realSessionManager.appToken;
                    this.L$0 = null;
                    this.label = 1;
                    if (sharedPreferencesKeyValue.set(str, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                Session session = (Session) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedPreferencesKeyValue sharedPreferencesKeyValue2 = realSessionManager.session;
                    this.L$0 = null;
                    this.label = 1;
                    if (sharedPreferencesKeyValue2.set(session, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                String str2 = (String) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedPreferencesKeyValue sharedPreferencesKeyValue3 = realSessionManager.activeAccountToken;
                    this.L$0 = null;
                    this.label = 1;
                    if (sharedPreferencesKeyValue3.set(str2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                String str3 = (String) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedPreferencesKeyValue sharedPreferencesKeyValue4 = realSessionManager.targetAccountToken;
                    this.L$0 = null;
                    this.label = 1;
                    if (sharedPreferencesKeyValue4.set(str3, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
