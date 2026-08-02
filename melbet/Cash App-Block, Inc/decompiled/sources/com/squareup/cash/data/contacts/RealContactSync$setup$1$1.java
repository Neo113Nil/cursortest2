package com.squareup.cash.data.contacts;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.contacts.ContactSync$ResetReason;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactSync$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealContactSync this$0;

    /* renamed from: com.squareup.cash.data.contacts.RealContactSync$setup$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function4 {
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public /* synthetic */ boolean Z$2;

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            boolean booleanValue3 = ((Boolean) obj3).booleanValue();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(4, (Continuation) obj4);
            anonymousClass3.Z$0 = booleanValue;
            anonymousClass3.Z$1 = booleanValue2;
            anonymousClass3.Z$2 = booleanValue3;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            boolean z3 = this.Z$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            return Boolean.valueOf(z && z2 && z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealContactSync$setup$1$1(RealContactSync realContactSync, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realContactSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealContactSync realContactSync = this.this$0;
        switch (i) {
            case 0:
                return new RealContactSync$setup$1$1(realContactSync, continuation, 0);
            case 1:
                return new RealContactSync$setup$1$1(realContactSync, continuation, 1);
            default:
                return new RealContactSync$setup$1$1(realContactSync, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealContactSync$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final RealContactSync realContactSync = this.this$0;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new AppLockMonitor$special$$inlined$map$2(FlowKt.combine(realContactSync.readContactsPermission.granted(), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realContactSync.contactsSyncState.asFlow(), 9), new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2(PlatformKt.getOnAuthenticated(realContactSync.sessionManager), i3), new AnonymousClass3(4, null)), 8), 1);
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.data.contacts.RealContactSync$setup$1$1.5
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i5 = i3;
                            RealContactSync realContactSync2 = realContactSync;
                            switch (i5) {
                                case 0:
                                    ((Boolean) obj2).getClass();
                                    ChannelResult.m4192getOrThrowimpl(realContactSync2.eventsAndRoutines.mo1159trySendJP2dKIU(new ContactSyncEvent.RequestSync()));
                                    break;
                                default:
                                    ((Boolean) obj2).getClass();
                                    Object reset = realContactSync2.reset(ContactSync$ResetReason.PermissionDenied.INSTANCE, continuation);
                                    if (reset != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (take.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                try {
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        int i6 = RealContactSync.$r8$clinit;
                        Object coroutineScope = JobKt.coroutineScope(new RealContactSync$processEventsAndRoutines$2(realContactSync, null), this);
                        if (coroutineScope != obj2) {
                            coroutineScope = Unit.INSTANCE;
                        }
                        if (coroutineScope == obj2) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    realContactSync.eventsAndRoutines.closeOrCancelImpl(th, false);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealContactSync$setup$1$2$invokeSuspend$$inlined$filter$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realContactSync.readContactsPermission.granted(), new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2(PlatformKt.getOnAuthenticated(realContactSync.sessionManager), i2), new RealContactSync$setup$1$2$2(3, null, 0), 0), i3));
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.data.contacts.RealContactSync$setup$1$1.5
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj22, Continuation continuation) {
                            int i52 = i2;
                            RealContactSync realContactSync2 = realContactSync;
                            switch (i52) {
                                case 0:
                                    ((Boolean) obj22).getClass();
                                    ChannelResult.m4192getOrThrowimpl(realContactSync2.eventsAndRoutines.mo1159trySendJP2dKIU(new ContactSyncEvent.RequestSync()));
                                    break;
                                default:
                                    ((Boolean) obj22).getClass();
                                    Object reset = realContactSync2.reset(ContactSync$ResetReason.PermissionDenied.INSTANCE, continuation);
                                    if (reset != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (distinctUntilChanged.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i7 != 1) {
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
