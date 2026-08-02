package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.Density;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.common.composeui.IconAnimationViewKt$IconAnimationView$1$1;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$4$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class U13CelebrationViewKt$U13CelebrationHero$1$5$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $autoplayGeneration$delegate;
    public final /* synthetic */ Density $density;
    public final /* synthetic */ Animatable $dollarPressOffsetX;
    public final /* synthetic */ Animatable $dollarPressOffsetY;
    public final /* synthetic */ Animatable $dollarPressRotation;
    public final /* synthetic */ WalletMetrics $metrics;
    public final /* synthetic */ Animatable $pressOffsetX;
    public final /* synthetic */ Animatable $pressOffsetY;
    public final /* synthetic */ Animatable $pressRotation;
    public final /* synthetic */ Animatable $pressScale;
    public final /* synthetic */ MutableState $pressTransformOrigin$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $tapCycleGeneration$delegate;
    public /* synthetic */ long J$0;
    public /* synthetic */ PressGestureScope L$0;
    public int label;

    /* renamed from: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$U13CelebrationHero$1$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ PressGestureScope $$this$WalletLayers;
        public final /* synthetic */ ParcelableSnapshotMutableIntState $autoplayGeneration$delegate;
        public final /* synthetic */ Density $density;
        public final /* synthetic */ Animatable $dollarPressOffsetX;
        public final /* synthetic */ Animatable $dollarPressOffsetY;
        public final /* synthetic */ Animatable $dollarPressRotation;
        public final /* synthetic */ WalletMetrics $metrics;
        public final /* synthetic */ long $offset;
        public final /* synthetic */ Animatable $pressOffsetX;
        public final /* synthetic */ Animatable $pressOffsetY;
        public final /* synthetic */ Animatable $pressRotation;
        public final /* synthetic */ Animatable $pressScale;
        public final /* synthetic */ MutableState $pressTransformOrigin$delegate;
        public final /* synthetic */ ParcelableSnapshotMutableIntState $tapCycleGeneration$delegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$U13CelebrationHero$1$5$1$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends SuspendLambda implements Function2 {
            public final /* synthetic */ WalletMetrics $metrics;
            public final /* synthetic */ TweenSpec $pressInSpec;
            public final /* synthetic */ Animatable $pressOffsetX;
            public final /* synthetic */ int $r8$classId;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass3(Animatable animatable, WalletMetrics walletMetrics, TweenSpec tweenSpec, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$pressOffsetX = animatable;
                this.$metrics = walletMetrics;
                this.$pressInSpec = tweenSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                switch (this.$r8$classId) {
                    case 0:
                        return new AnonymousClass3(this.$pressOffsetX, this.$metrics, this.$pressInSpec, continuation, 0);
                    default:
                        return new AnonymousClass3(this.$pressOffsetX, this.$metrics, this.$pressInSpec, continuation, 1);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                WalletMetrics walletMetrics = this.$metrics;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Float f = new Float(AllowanceViewKt.access$randomFloat(walletMetrics.pressMinXPx, walletMetrics.pressMaxXPx));
                            this.label = 1;
                            if (Animatable.animateTo$default(this.$pressOffsetX, f, this.$pressInSpec, null, null, this, 12) == coroutineSingletons) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        break;
                    default:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Float f2 = new Float(AllowanceViewKt.access$randomFloat(walletMetrics.pressMinYPx, walletMetrics.pressMaxYPx));
                            this.label = 1;
                            if (Animatable.animateTo$default(this.$pressOffsetX, f2, this.$pressInSpec, null, null, this, 12) == coroutineSingletons2) {
                                break;
                            }
                        } else if (i3 != 1) {
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

        /* renamed from: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$U13CelebrationHero$1$5$1$1$5, reason: invalid class name */
        public final class AnonymousClass5 extends SuspendLambda implements Function2 {
            public final /* synthetic */ Density $density;
            public final /* synthetic */ Animatable $dollarPressOffsetY;
            public final /* synthetic */ TweenSpec $pressInSpec;
            public final /* synthetic */ int $r8$classId;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass5(Animatable animatable, Density density, TweenSpec tweenSpec, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$dollarPressOffsetY = animatable;
                this.$density = density;
                this.$pressInSpec = tweenSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                switch (this.$r8$classId) {
                    case 0:
                        return new AnonymousClass5(this.$dollarPressOffsetY, this.$density, this.$pressInSpec, continuation, 0);
                    default:
                        return new AnonymousClass5(this.$dollarPressOffsetY, this.$density, this.$pressInSpec, continuation, 1);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                Density density = this.$density;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Float f = new Float(density.getDensity() * AllowanceViewKt.access$randomFloat(1.0f, 2.0f));
                            this.label = 1;
                            if (Animatable.animateTo$default(this.$dollarPressOffsetY, f, this.$pressInSpec, null, null, this, 12) == coroutineSingletons) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        break;
                    default:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Float f2 = new Float(density.getDensity() * AllowanceViewKt.access$randomFloat(-1.0f, 1.0f));
                            this.label = 1;
                            if (Animatable.animateTo$default(this.$dollarPressOffsetY, f2, this.$pressInSpec, null, null, this, 12) == coroutineSingletons2) {
                                break;
                            }
                        } else if (i3 != 1) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, WalletMetrics walletMetrics, PressGestureScope pressGestureScope, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, Animatable animatable, Animatable animatable2, Animatable animatable3, Animatable animatable4, Animatable animatable5, Density density, Animatable animatable6, Animatable animatable7, Continuation continuation) {
            super(2, continuation);
            this.$offset = j;
            this.$metrics = walletMetrics;
            this.$$this$WalletLayers = pressGestureScope;
            this.$pressTransformOrigin$delegate = mutableState;
            this.$autoplayGeneration$delegate = parcelableSnapshotMutableIntState;
            this.$tapCycleGeneration$delegate = parcelableSnapshotMutableIntState2;
            this.$pressScale = animatable;
            this.$pressRotation = animatable2;
            this.$pressOffsetX = animatable3;
            this.$pressOffsetY = animatable4;
            this.$dollarPressOffsetY = animatable5;
            this.$density = density;
            this.$dollarPressOffsetX = animatable6;
            this.$dollarPressRotation = animatable7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$offset, this.$metrics, this.$$this$WalletLayers, this.$pressTransformOrigin$delegate, this.$autoplayGeneration$delegate, this.$tapCycleGeneration$delegate, this.$pressScale, this.$pressRotation, this.$pressOffsetX, this.$pressOffsetY, this.$dollarPressOffsetY, this.$density, this.$dollarPressOffsetX, this.$dollarPressRotation, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
        /* JADX WARN: Type inference failed for: r12v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            Animatable animatable;
            Animatable animatable2;
            Animatable animatable3;
            Animatable animatable4;
            Animatable animatable5;
            ?? r12;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            Animatable animatable6 = this.$dollarPressRotation;
            Animatable animatable7 = this.$dollarPressOffsetX;
            Animatable animatable8 = this.$dollarPressOffsetY;
            Animatable animatable9 = this.$pressOffsetY;
            Animatable animatable10 = this.$pressOffsetX;
            Animatable animatable11 = this.$pressRotation;
            Animatable animatable12 = this.$pressScale;
            if (i3 == 0) {
                SafeTrace.throwOnFailure(obj);
                TweenSpec tween$default = AnimatableKt.tween$default(80, 0, null, 6);
                long j = this.$offset;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                WalletMetrics walletMetrics = this.$metrics;
                this.$pressTransformOrigin$delegate.setValue(new TransformOrigin(ColorKt.TransformOrigin(RangesKt___RangesKt.coerceIn(intBitsToFloat / walletMetrics.containerWidthPx, 0.3f, 0.7f), RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) / walletMetrics.containerHeightPx, 0.3f, 0.7f))));
                NavAction$$ExternalSyntheticOutline0.m(1, this.$autoplayGeneration$delegate);
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$tapCycleGeneration$delegate;
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                Continuation continuation = null;
                i = 3;
                JobKt.launch$default(coroutineScope, null, null, new IconAnimationViewKt$IconAnimationView$1$1.AnonymousClass1(animatable12, tween$default, null, 4), 3);
                JobKt.launch$default(coroutineScope, null, null, new IconAnimationViewKt$IconAnimationView$1$1.AnonymousClass1(animatable11, tween$default, null, 5), 3);
                i2 = 1;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(animatable10, walletMetrics, tween$default, continuation, 0);
                animatable = animatable10;
                JobKt.launch$default(coroutineScope, null, null, anonymousClass3, 3);
                animatable2 = animatable12;
                animatable3 = animatable9;
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass3(animatable9, walletMetrics, tween$default, continuation, 1), 3);
                Density density = this.$density;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(animatable8, density, tween$default, continuation, 0);
                animatable4 = animatable8;
                JobKt.launch$default(coroutineScope, null, null, anonymousClass5, 3);
                animatable5 = animatable11;
                r12 = 0;
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass5(animatable7, density, tween$default, continuation, 1), 3);
                JobKt.launch$default(coroutineScope, null, null, new IconAnimationViewKt$IconAnimationView$1$1.AnonymousClass1(animatable6, tween$default, null, 6), 3);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (this.$$this$WalletLayers.tryAwaitRelease(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                animatable = animatable10;
                animatable5 = animatable11;
                animatable2 = animatable12;
                i2 = 1;
                i = 3;
                animatable4 = animatable8;
                r12 = 0;
                animatable3 = animatable9;
            }
            JobKt.launch$default(coroutineScope, r12, r12, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable2, r12, 5), i);
            JobKt.launch$default(coroutineScope, r12, r12, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable5, r12, 6), i);
            JobKt.launch$default(coroutineScope, r12, r12, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, r12, 29), i);
            JobKt.launch$default(coroutineScope, r12, r12, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable3, r12, i2), i);
            JobKt.launch$default(coroutineScope, r12, r12, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable7, r12, 2), i);
            JobKt.launch$default(coroutineScope, r12, r12, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable4, r12, i), i);
            JobKt.launch$default(coroutineScope, r12, r12, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1(animatable6, r12, 4), i);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U13CelebrationViewKt$U13CelebrationHero$1$5$1(WalletMetrics walletMetrics, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, Animatable animatable, Animatable animatable2, Animatable animatable3, Animatable animatable4, Animatable animatable5, Density density, Animatable animatable6, Animatable animatable7, Continuation continuation) {
        super(3, continuation);
        this.$metrics = walletMetrics;
        this.$pressTransformOrigin$delegate = mutableState;
        this.$autoplayGeneration$delegate = parcelableSnapshotMutableIntState;
        this.$tapCycleGeneration$delegate = parcelableSnapshotMutableIntState2;
        this.$pressScale = animatable;
        this.$pressRotation = animatable2;
        this.$pressOffsetX = animatable3;
        this.$pressOffsetY = animatable4;
        this.$dollarPressOffsetY = animatable5;
        this.$density = density;
        this.$dollarPressOffsetX = animatable6;
        this.$dollarPressRotation = animatable7;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).packedValue;
        Animatable animatable = this.$dollarPressOffsetX;
        Animatable animatable2 = this.$dollarPressRotation;
        U13CelebrationViewKt$U13CelebrationHero$1$5$1 u13CelebrationViewKt$U13CelebrationHero$1$5$1 = new U13CelebrationViewKt$U13CelebrationHero$1$5$1(this.$metrics, this.$pressTransformOrigin$delegate, this.$autoplayGeneration$delegate, this.$tapCycleGeneration$delegate, this.$pressScale, this.$pressRotation, this.$pressOffsetX, this.$pressOffsetY, this.$dollarPressOffsetY, this.$density, animatable, animatable2, (Continuation) obj3);
        u13CelebrationViewKt$U13CelebrationHero$1$5$1.L$0 = (PressGestureScope) obj;
        u13CelebrationViewKt$U13CelebrationHero$1$5$1.J$0 = j;
        return u13CelebrationViewKt$U13CelebrationHero$1$5$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PressGestureScope pressGestureScope = this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(j, this.$metrics, pressGestureScope, this.$pressTransformOrigin$delegate, this.$autoplayGeneration$delegate, this.$tapCycleGeneration$delegate, this.$pressScale, this.$pressRotation, this.$pressOffsetX, this.$pressOffsetY, this.$dollarPressOffsetY, this.$density, this.$dollarPressOffsetX, this.$dollarPressRotation, null);
            this.L$0 = null;
            this.J$0 = j;
            this.label = 1;
            if (JobKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
