package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.views.brand.profile.CheckedInSheetAnimationStage;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOffersDetailsStateManager$states$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $footerState$delegate;
    public final /* synthetic */ boolean $isOfferUpdateConfirmed;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealOffersDetailsStateManager$states$1$1(boolean z, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isOfferUpdateConfirmed = z;
        this.$footerState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$footerState$delegate;
        boolean z = this.$isOfferUpdateConfirmed;
        switch (i) {
            case 0:
                return new RealOffersDetailsStateManager$states$1$1(z, mutableState, continuation, 0);
            case 1:
                return new RealOffersDetailsStateManager$states$1$1(z, mutableState, continuation, 1);
            case 2:
                return new RealOffersDetailsStateManager$states$1$1(z, mutableState, continuation, 2);
            default:
                return new RealOffersDetailsStateManager$states$1$1(z, mutableState, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealOffersDetailsStateManager$states$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        if (app.cash.local.views.brand.profile.LocalBrandLocationRowKt.access$delayWithMotionScale(600, r13) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (app.cash.local.views.brand.profile.LocalBrandLocationRowKt.access$delayWithMotionScale(0, r13) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (app.cash.local.views.brand.profile.LocalBrandLocationRowKt.access$delayWithMotionScale(600, r13) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        if (app.cash.local.views.brand.profile.LocalBrandLocationRowKt.access$delayWithMotionScale(300, r13) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        if (app.cash.local.views.brand.profile.LocalBrandLocationRowKt.access$delayWithMotionScale(1000, r13) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (app.cash.local.views.brand.profile.LocalBrandLocationRowKt.access$delayWithMotionScale(0, r13) == r0) goto L57;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$footerState$delegate;
        boolean z = this.$isOfferUpdateConfirmed;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z && ((OfferDetailsFooterState) mutableState.getValue()) == OfferDetailsFooterState.OFFER_UPDATE_IN_FLIGHT) {
                        mutableState.setValue(OfferDetailsFooterState.OFFER_UPDATE_CONFIRMATION_ANIMATION);
                        this.label = 1;
                        if (JobKt.delay(1000L, this) == coroutineSingletons) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(OfferDetailsFooterState.BUTTONS);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        if (!z) {
                            mutableState.setValue(CheckedInSheetAnimationStage.Ready);
                            break;
                        } else {
                            mutableState.setValue(CheckedInSheetAnimationStage.Loading);
                            this.label = 1;
                            break;
                        }
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(CheckedInSheetAnimationStage.AvatarVisible);
                        this.label = 2;
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(CheckedInSheetAnimationStage.AvatarSlid);
                        this.label = 3;
                        break;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(CheckedInSheetAnimationStage.TitleVisible);
                        this.label = 4;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(CheckedInSheetAnimationStage.SubtitleVisible);
                        this.label = 5;
                        break;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(CheckedInSheetAnimationStage.ButtonVisible);
                        this.label = 6;
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(CheckedInSheetAnimationStage.Ready);
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        this.label = 1;
                        if (JobKt.delay(200L, this) == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.valueOf(z));
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        this.label = 1;
                        if (JobKt.delay(5000L, this) == coroutineSingletons4) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.valueOf(z));
                break;
        }
        return Unit.INSTANCE;
    }
}
