package com.squareup.cash.money.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardNestedScrollExpander implements NestedScrollConnection {
    public Float animationTarget;
    public final ParcelableSnapshotMutableState cardHeight$delegate;
    public final DerivedSnapshotState cardOffset$delegate;
    public final ParcelableSnapshotMutableFloatState cardRevealDistance$delegate;
    public final Function0 invokeTransition;
    public boolean isFlinging;
    public final boolean isRestored;
    public final ParcelableSnapshotMutableFloatState maxRevealScale$delegate;
    public final Function0 onRevealFinished;
    public float restingPosition;
    public final ParcelableSnapshotMutableState transitioningCardOffset$delegate;

    public CardNestedScrollExpander(Function0 function0, float f, boolean z, ComposeDialogKt$$ExternalSyntheticLambda10 composeDialogKt$$ExternalSyntheticLambda10) {
        function0.getClass();
        this.invokeTransition = function0;
        this.restingPosition = f;
        this.isRestored = z;
        this.onRevealFinished = composeDialogKt$$ExternalSyntheticLambda10;
        this.cardHeight$delegate = Updater.mutableStateOf$default(null);
        this.maxRevealScale$delegate = new ParcelableSnapshotMutableFloatState(2.0f);
        this.cardRevealDistance$delegate = new ParcelableSnapshotMutableFloatState(this.restingPosition);
        this.cardOffset$delegate = Updater.derivedStateOf(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 3));
        this.transitioningCardOffset$delegate = Updater.mutableStateOf$default(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: animateRevealDistanceTo-LuvzFrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3610animateRevealDistanceToLuvzFrg(float f, long j, ContinuationImpl continuationImpl) {
        CardNestedScrollExpander$animateRevealDistanceTo$1 cardNestedScrollExpander$animateRevealDistanceTo$1;
        int i;
        Function0 function0;
        if (continuationImpl instanceof CardNestedScrollExpander$animateRevealDistanceTo$1) {
            cardNestedScrollExpander$animateRevealDistanceTo$1 = (CardNestedScrollExpander$animateRevealDistanceTo$1) continuationImpl;
            int i2 = cardNestedScrollExpander$animateRevealDistanceTo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardNestedScrollExpander$animateRevealDistanceTo$1.label = i2 - PKIFailureInfo.systemUnavail;
                CardNestedScrollExpander$animateRevealDistanceTo$1 cardNestedScrollExpander$animateRevealDistanceTo$12 = cardNestedScrollExpander$animateRevealDistanceTo$1;
                Object obj = cardNestedScrollExpander$animateRevealDistanceTo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardNestedScrollExpander$animateRevealDistanceTo$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(this.animationTarget, f)) {
                        return Unit.INSTANCE;
                    }
                    this.animationTarget = new Float(f);
                    Animatable Animatable = AnimatableKt.Animatable(this.cardRevealDistance$delegate.getFloatValue(), 0.01f);
                    Float f2 = new Float(f);
                    TweenSpec tween$default = AnimatableKt.tween$default(500, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2);
                    Float f3 = new Float(Velocity.m1068getYimpl(j));
                    CardNestedScrollExpander$$ExternalSyntheticLambda1 cardNestedScrollExpander$$ExternalSyntheticLambda1 = new CardNestedScrollExpander$$ExternalSyntheticLambda1(this, 0);
                    cardNestedScrollExpander$animateRevealDistanceTo$12.label = 1;
                    if (Animatable.animateTo(f2, tween$default, f3, cardNestedScrollExpander$$ExternalSyntheticLambda1, cardNestedScrollExpander$animateRevealDistanceTo$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.animationTarget = null;
                function0 = this.onRevealFinished;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        cardNestedScrollExpander$animateRevealDistanceTo$1 = new CardNestedScrollExpander$animateRevealDistanceTo$1(this, continuationImpl);
        CardNestedScrollExpander$animateRevealDistanceTo$1 cardNestedScrollExpander$animateRevealDistanceTo$122 = cardNestedScrollExpander$animateRevealDistanceTo$1;
        Object obj2 = cardNestedScrollExpander$animateRevealDistanceTo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardNestedScrollExpander$animateRevealDistanceTo$122.label;
        if (i != 0) {
        }
        this.animationTarget = null;
        function0 = this.onRevealFinished;
        if (function0 != null) {
        }
        return Unit.INSTANCE;
    }

    public final float consumeScroll(float f) {
        float f2;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.cardRevealDistance$delegate;
        float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
        float floatValue2 = (f / 2.0f) + parcelableSnapshotMutableFloatState.getFloatValue();
        if (this.isFlinging) {
            f2 = this.restingPosition;
        } else {
            Float f3 = (Float) this.cardHeight$delegate.getValue();
            if (f3 != null) {
                f2 = this.maxRevealScale$delegate.getFloatValue() * f3.floatValue();
            } else {
                f2 = 0.0f;
            }
        }
        if (floatValue2 < RecyclerView.DECELERATION_RATE) {
            floatValue2 = 0.0f;
        }
        if (floatValue2 <= f2) {
            f2 = floatValue2;
        }
        parcelableSnapshotMutableFloatState.setFloatValue(f2);
        return (parcelableSnapshotMutableFloatState.getFloatValue() - floatValue) * 2.0f;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        this.isFlinging = false;
        return new Velocity(0L);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) <= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        float consumeScroll = consumeScroll(Float.intBitsToFloat(i2));
        return (Float.floatToRawIntBits(consumeScroll) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (m3610animateRevealDistanceToLuvzFrg(r13, r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (m3610animateRevealDistanceToLuvzFrg(r8, 0, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
        CardNestedScrollExpander$onPreFling$1 cardNestedScrollExpander$onPreFling$1;
        int i;
        long j2;
        if (continuation instanceof CardNestedScrollExpander$onPreFling$1) {
            cardNestedScrollExpander$onPreFling$1 = (CardNestedScrollExpander$onPreFling$1) continuation;
            int i2 = cardNestedScrollExpander$onPreFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardNestedScrollExpander$onPreFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cardNestedScrollExpander$onPreFling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardNestedScrollExpander$onPreFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.cardRevealDistance$delegate;
                    j2 = 0;
                    if (parcelableSnapshotMutableFloatState.getFloatValue() < this.restingPosition) {
                        this.isFlinging = true;
                        return new Velocity(j2);
                    }
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.cardHeight$delegate;
                    Float f = (Float) parcelableSnapshotMutableState.getValue();
                    float f2 = RecyclerView.DECELERATION_RATE;
                    if (parcelableSnapshotMutableFloatState.getFloatValue() > (f != null ? f.floatValue() : 0.0f) / 2.0f || Velocity.m1068getYimpl(j) >= 10000.0f) {
                        this.invokeTransition.invoke();
                        this.transitioningCardOffset$delegate.setValue(new Float(((Number) this.cardOffset$delegate.getValue()).floatValue()));
                        Float f3 = (Float) parcelableSnapshotMutableState.getValue();
                        if (f3 != null) {
                            f2 = this.maxRevealScale$delegate.getFloatValue() * f3.floatValue();
                        }
                        cardNestedScrollExpander$onPreFling$1.J$0 = j;
                        cardNestedScrollExpander$onPreFling$1.label = 1;
                    } else {
                        float f4 = this.restingPosition;
                        cardNestedScrollExpander$onPreFling$1.J$0 = j;
                        cardNestedScrollExpander$onPreFling$1.label = 2;
                    }
                    return new Velocity(j2);
                }
                if (i != 1 && i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = cardNestedScrollExpander$onPreFling$1.J$0;
                SafeTrace.throwOnFailure(obj);
                j2 = j;
                return new Velocity(j2);
            }
        }
        cardNestedScrollExpander$onPreFling$1 = new CardNestedScrollExpander$onPreFling$1(this, (ContinuationImpl) continuation);
        Object obj3 = cardNestedScrollExpander$onPreFling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardNestedScrollExpander$onPreFling$1.label;
        if (i != 0) {
        }
        j2 = j;
        return new Velocity(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) >= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        float consumeScroll = consumeScroll(Float.intBitsToFloat(i2));
        return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(consumeScroll) & BodyPartID.bodyIdMax);
    }
}
