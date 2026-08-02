package com.squareup.cash.arcade.components.input;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.payments.views.MainPaymentViewKt;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.model.parsers.WalletJsonParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class SelectionCardKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ SelectionCardKt$$ExternalSyntheticLambda5(boolean z, boolean z2, Modifier modifier, int i) {
        SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = modifier;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$3;
        boolean z = this.f$1;
        switch (i) {
            case 0:
                SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                ((Integer) obj2).getClass();
                InputChipKt.SelectionCardAction(z, this.f$2, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1 | this.f$4));
                return Unit.INSTANCE;
            default:
                final Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    final Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    boolean changed = gapComposer.changed(z);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue;
                    gapComposer.startReplaceGroup(75002610);
                    ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) gapComposer.consume(MainPaymentViewKt.LocalElementBoundsRegistry);
                    final boolean z2 = this.f$2;
                    Modifier provideBounds = (!z2 || elementBoundsRegistry == null) ? Modifier.Companion.$$INSTANCE : WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.PersonalizePaymentButton);
                    gapComposer.end(false);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, provideBounds);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    TweenSpec tween$default = AnimatableKt.tween$default(10, 0, EasingKt.LinearEasing, 2);
                    Boolean valueOf = Boolean.valueOf(z);
                    final int i2 = this.f$4;
                    CrossfadeKt.Crossfade(valueOf, (Modifier) null, tween$default, "", Expect_jvmKt.rememberComposableLambda(1876544926, new Function3() { // from class: com.squareup.cash.payments.views.personalization.PersonalizedPaymentButtonViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            BlendModeColorFilter blendModeColorFilter;
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer2).changed(booleanValue) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Function0 function02 = Function0.this;
                                final boolean z3 = z2;
                                Object obj7 = Composer.Companion.Empty;
                                if (booleanValue) {
                                    gapComposer2.startReplaceGroup(855663072);
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 31.0f);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (rememberedValue2 == obj7) {
                                        rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                                    }
                                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m285size3ABfNKs, (MutableInteractionSourceImpl) rememberedValue2, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false), false, null, null, function02, 28);
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    if (rememberedValue3 == obj7) {
                                        rememberedValue3 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(12);
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    Function1 function1 = (Function1) rememberedValue3;
                                    final Context context2 = context;
                                    boolean changedInstance = gapComposer2.changedInstance(context2);
                                    final int i3 = i2;
                                    boolean changed2 = changedInstance | gapComposer2.changed(i3) | gapComposer2.changed(z3);
                                    final MutableState mutableState2 = mutableState;
                                    boolean changed3 = changed2 | gapComposer2.changed(mutableState2);
                                    Object rememberedValue4 = gapComposer2.rememberedValue();
                                    if (changed3 || rememberedValue4 == obj7) {
                                        rememberedValue4 = new Function1() { // from class: com.squareup.cash.payments.views.personalization.PersonalizedPaymentButtonViewKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj8) {
                                                final CashLottieAnimationView cashLottieAnimationView = (CashLottieAnimationView) obj8;
                                                cashLottieAnimationView.getClass();
                                                LottieTask<LottieComposition> fromRawRes = LottieCompositionFactory.fromRawRes(context2, i3);
                                                final boolean z4 = z3;
                                                final MutableState mutableState3 = mutableState2;
                                                fromRawRes.addListener(new LottieListener() { // from class: com.squareup.cash.payments.views.personalization.PersonalizedPaymentButtonViewKt$$ExternalSyntheticLambda5
                                                    @Override // com.airbnb.lottie.LottieListener
                                                    public final void onResult(Object obj9) {
                                                        CashLottieAnimationView cashLottieAnimationView2 = CashLottieAnimationView.this;
                                                        cashLottieAnimationView2.setComposition((LottieComposition) obj9);
                                                        cashLottieAnimationView2.playAnimation();
                                                        cashLottieAnimationView2.addAnimatorListener(new InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(mutableState3, z4));
                                                    }
                                                });
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue4);
                                    }
                                    AndroidView_androidKt.AndroidView(function1, m182clickableO2vRcR0$default, (Function1) rememberedValue4, gapComposer2, 6, 0);
                                    gapComposer2.end(false);
                                } else {
                                    if (booleanValue) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -526587522, false);
                                    }
                                    gapComposer2.startReplaceGroup(857085662);
                                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 31.0f), Strings.getColors(gapComposer2).component.button.standard.background.disabled, RoundedCornerShapeKt.CircleShape);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                                    ComposeUiNode.Companion.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.createNode(function03);
                                    } else {
                                        gapComposer2.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 6.0f);
                                    Object rememberedValue5 = gapComposer2.rememberedValue();
                                    if (rememberedValue5 == obj7) {
                                        rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                                    }
                                    Modifier m182clickableO2vRcR0$default2 = ImageKt.m182clickableO2vRcR0$default(m298padding3ABfNKs, (MutableInteractionSourceImpl) rememberedValue5, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false), false, null, null, function02, 28);
                                    Painter painterResource = Countries.painterResource(R.drawable.sparkle_stars_green, 0, gapComposer2);
                                    if (z3) {
                                        gapComposer2.startReplaceGroup(-1494047682);
                                        long j = Strings.getColors(gapComposer2).semantic.text.standard;
                                        blendModeColorFilter = new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1493933602);
                                        long j2 = Strings.getColors(gapComposer2).semantic.text.disabled;
                                        blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                                        gapComposer2.end(false);
                                    }
                                    ImageKt.Image(painterResource, "Personalize Payment", m182clickableO2vRcR0$default2, null, null, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer2, Painter.$stable | 48, 56);
                                    gapComposer2.end(true);
                                    gapComposer2.end(false);
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 27648, 2);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SelectionCardKt$$ExternalSyntheticLambda5(boolean z, boolean z2, Function0 function0, int i) {
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = function0;
        this.f$4 = i;
    }
}
