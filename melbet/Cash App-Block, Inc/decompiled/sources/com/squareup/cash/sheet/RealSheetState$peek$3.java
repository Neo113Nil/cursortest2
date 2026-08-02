package com.squareup.cash.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.MotionDurationScale;
import app.cash.redwood.treehouse.Content$State;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.protos.franklin.ui.PersonalInfoCTABanner;
import com.withpersona.sdk2.camera.CameraState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealSheetState$peek$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealSheetState this$0;

    /* renamed from: com.squareup.cash.sheet.RealSheetState$peek$3$2, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation, 0);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                case 1:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(2, continuation, 1);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
                case 2:
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2(2, continuation, 2);
                    anonymousClass23.L$0 = obj;
                    return anonymousClass23;
                case 3:
                    AnonymousClass2 anonymousClass24 = new AnonymousClass2(2, continuation, 3);
                    anonymousClass24.L$0 = obj;
                    return anonymousClass24;
                case 4:
                    AnonymousClass2 anonymousClass25 = new AnonymousClass2(2, continuation, 4);
                    anonymousClass25.L$0 = obj;
                    return anonymousClass25;
                case 5:
                    AnonymousClass2 anonymousClass26 = new AnonymousClass2(2, continuation, 5);
                    anonymousClass26.L$0 = obj;
                    return anonymousClass26;
                case 6:
                    AnonymousClass2 anonymousClass27 = new AnonymousClass2(2, continuation, 6);
                    anonymousClass27.L$0 = obj;
                    return anonymousClass27;
                case 7:
                    AnonymousClass2 anonymousClass28 = new AnonymousClass2(2, continuation, 7);
                    anonymousClass28.L$0 = obj;
                    return anonymousClass28;
                case 8:
                    AnonymousClass2 anonymousClass29 = new AnonymousClass2(2, continuation, 8);
                    anonymousClass29.L$0 = obj;
                    return anonymousClass29;
                case 9:
                    AnonymousClass2 anonymousClass210 = new AnonymousClass2(2, continuation, 9);
                    anonymousClass210.L$0 = obj;
                    return anonymousClass210;
                case 10:
                    AnonymousClass2 anonymousClass211 = new AnonymousClass2(2, continuation, 10);
                    anonymousClass211.L$0 = obj;
                    return anonymousClass211;
                case 11:
                    AnonymousClass2 anonymousClass212 = new AnonymousClass2(2, continuation, 11);
                    anonymousClass212.L$0 = obj;
                    return anonymousClass212;
                case 12:
                    AnonymousClass2 anonymousClass213 = new AnonymousClass2(2, continuation, 12);
                    anonymousClass213.L$0 = obj;
                    return anonymousClass213;
                case 13:
                    AnonymousClass2 anonymousClass214 = new AnonymousClass2(2, continuation, 13);
                    anonymousClass214.L$0 = obj;
                    return anonymousClass214;
                case 14:
                    AnonymousClass2 anonymousClass215 = new AnonymousClass2(2, continuation, 14);
                    anonymousClass215.L$0 = obj;
                    return anonymousClass215;
                case 15:
                    AnonymousClass2 anonymousClass216 = new AnonymousClass2(2, continuation, 15);
                    anonymousClass216.L$0 = obj;
                    return anonymousClass216;
                case 16:
                    AnonymousClass2 anonymousClass217 = new AnonymousClass2(2, continuation, 16);
                    anonymousClass217.L$0 = obj;
                    return anonymousClass217;
                default:
                    AnonymousClass2 anonymousClass218 = new AnonymousClass2(2, continuation, 17);
                    anonymousClass218.L$0 = obj;
                    return anonymousClass218;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create((CameraState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    Float f = (Float) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 1:
                    ProfilePrivacyPresenter.CashMeSettingActiveState cashMeSettingActiveState = (ProfilePrivacyPresenter.CashMeSettingActiveState) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 2:
                    PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) this.L$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 3:
                    DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) this.L$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 4:
                    ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) this.L$0;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 5:
                    ActivityEmbeddedViewModel activityEmbeddedViewModel2 = (ActivityEmbeddedViewModel) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 6:
                    ActivityEmbeddedViewModel activityEmbeddedViewModel3 = (ActivityEmbeddedViewModel) this.L$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 7:
                    Content$State content$State = (Content$State) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 8:
                    MerchantIdentifier merchantIdentifier = (MerchantIdentifier) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Selected merchant: ", merchantIdentifier != null ? merchantIdentifier.token : null), new Object[0]);
                    break;
                case 9:
                    PersonIdentifier personIdentifier = (PersonIdentifier) this.L$0;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("User: ", personIdentifier != null ? personIdentifier.token : null), new Object[0]);
                    break;
                case 10:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineScope.getCoroutineContext().get(Alignment.Companion.$$INSTANCE);
                    break;
                case 11:
                    Throwable th = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 12:
                    Throwable th2 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 13:
                    Throwable th3 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 14:
                    Throwable th4 = (Throwable) this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
                default:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    break;
            }
            return Boolean.valueOf(!Intrinsics.areEqual((CameraState) this.L$0, CameraState.Error.INSTANCE$3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSheetState$peek$3(RealSheetState realSheetState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealSheetState realSheetState = this.this$0;
        switch (i) {
            case 0:
                return new RealSheetState$peek$3(realSheetState, continuation, 0);
            case 1:
                return new RealSheetState$peek$3(realSheetState, continuation, 1);
            case 2:
                return new RealSheetState$peek$3(realSheetState, continuation, 2);
            case 3:
                return new RealSheetState$peek$3(realSheetState, continuation, 3);
            case 4:
                return new RealSheetState$peek$3(realSheetState, continuation, 4);
            case 5:
                return new RealSheetState$peek$3(realSheetState, continuation, 5);
            case 6:
                return new RealSheetState$peek$3(realSheetState, continuation, 6);
            case 7:
                return new RealSheetState$peek$3(realSheetState, continuation, 7);
            case 8:
                return new RealSheetState$peek$3(realSheetState, continuation, 8);
            case 9:
                return new RealSheetState$peek$3(realSheetState, continuation, 9);
            case 10:
                return new RealSheetState$peek$3(realSheetState, continuation, 10);
            case 11:
                return new RealSheetState$peek$3(realSheetState, continuation, 11);
            case 12:
                return new RealSheetState$peek$3(realSheetState, continuation, 12);
            case 13:
                return new RealSheetState$peek$3(realSheetState, continuation, 13);
            case 14:
                return new RealSheetState$peek$3(realSheetState, continuation, 14);
            case 15:
                return new RealSheetState$peek$3(realSheetState, continuation, 15);
            case 16:
                return new RealSheetState$peek$3(realSheetState, continuation, 16);
            default:
                return new RealSheetState$peek$3(realSheetState, continuation, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealSheetState$peek$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x029d, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r10, r4, r9) == r0) goto L189;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 18;
        int i3 = 0;
        RealSheetState realSheetState = this.this$0;
        int i4 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                int i6 = 2;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, 17));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(i6, continuation, i3);
                    this.label = 1;
                    break;
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                SafeFlow snapshotFlow2 = Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, i2));
                AnonymousClass2 anonymousClass22 = new AnonymousClass2(i6, continuation, 3);
                this.label = 2;
                Object first = FlowKt.first(snapshotFlow2, anonymousClass22, this);
                if (first != coroutineSingletons) {
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, i4));
                    RealSheetState$awaitDismissal$2 realSheetState$awaitDismissal$2 = new RealSheetState$awaitDismissal$2(realSheetState, continuation, i4);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, realSheetState$awaitDismissal$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.peek(this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.dismiss(this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.dismiss(this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.dismiss(this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.peek(this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.expand(this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.expand(this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.expand(this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.expand(this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.expand(this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel Channel$default = PapaEvent.Channel$default(0, null, null, 7);
                    realSheetState.settleWithVelocity = new RealSheetState$ProcessQueuedNestedFlingsEffect$1$1$$ExternalSyntheticLambda0(Channel$default, i3);
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow(Channel$default);
                    RingtoneView.AnonymousClass1.C00651 c00651 = new RingtoneView.AnonymousClass1.C00651(realSheetState, i2);
                    this.label = 1;
                    if (consumeAsFlow.collect(c00651, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    int i20 = RealSheetState.$r8$clinit;
                    realSheetState.getClass();
                    Object first2 = FlowKt.first(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, 6)), 20), this);
                    if (first2 != obj2) {
                        first2 = Unit.INSTANCE;
                    }
                    if (first2 == obj2) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealSheetState.access$awaitDismissalDragEnabled(realSheetState, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.peek(this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.expand(this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (realSheetState.peek(this) == coroutineSingletons17) {
                        break;
                    }
                } else if (i24 != 1) {
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
