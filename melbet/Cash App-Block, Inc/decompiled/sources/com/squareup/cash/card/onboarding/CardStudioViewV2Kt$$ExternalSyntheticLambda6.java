package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.google.zxing.Result;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.PinnedKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.android.StringsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.intellij.markdown.ast.ASTUtilKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewV2Kt$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ MutableState f$10;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ MutableState f$7;
    public final /* synthetic */ MutableState f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda6(BitcoinTransferViewModel bitcoinTransferViewModel, RealSheetState realSheetState, Function1 function1, MutableState mutableState, AmountDisplayState amountDisplayState, CoroutineScope coroutineScope, Shaker shaker, MutableFloatState mutableFloatState, MutableState mutableState2, MutableState mutableState3, MutableFloatState mutableFloatState2, MutableState mutableState4) {
        this.f$0 = bitcoinTransferViewModel;
        this.f$1 = realSheetState;
        this.f$2 = function1;
        this.f$7 = mutableState;
        this.f$3 = amountDisplayState;
        this.f$11 = coroutineScope;
        this.f$4 = shaker;
        this.f$5 = mutableFloatState;
        this.f$8 = mutableState2;
        this.f$10 = mutableState3;
        this.f$6 = mutableFloatState2;
        this.f$9 = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Timber.Forest forest;
        Colors colors;
        Float valueOf;
        float f;
        float f2;
        PatternStampState patternStampState;
        Object drawablePainter;
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1;
        boolean z;
        Float f3;
        MutableState mutableState;
        GapComposer gapComposer;
        AmountDisplayState amountDisplayState;
        Modifier.Companion companion;
        Modifier wrapContentHeight;
        int i = this.$r8$classId;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$9;
        Object obj6 = this.f$6;
        MutableState mutableState2 = this.f$8;
        Object obj7 = this.f$5;
        Object obj8 = this.f$4;
        Object obj9 = this.f$11;
        Object obj10 = this.f$3;
        Object obj11 = this.f$2;
        Object obj12 = this.f$1;
        Object obj13 = this.f$0;
        switch (i) {
            case 0:
                final CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) obj13;
                PatternStampState patternStampState2 = (PatternStampState) obj12;
                StampState stampState = (StampState) obj11;
                State state = (State) obj10;
                MetadataRepo metadataRepo = (MetadataRepo) obj8;
                SignatureState signatureState = (SignatureState) obj7;
                final Result result = (Result) obj6;
                Flow flow = (Flow) obj5;
                State state2 = (State) obj9;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    float m259getMaxWidthD9Ej5fM = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM();
                    long j = boxWithConstraintsScopeImpl.constraints;
                    float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(m259getMaxWidthD9Ej5fM, gapComposer2) * 0.058f;
                    ProvidableCompositionLocal providableCompositionLocal = CompositionLocalsKt.LocalDensity;
                    Density density = (Density) gapComposer2.consume(providableCompositionLocal);
                    float mo236toPx0680j_4 = density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() * 0.3f);
                    PointF pointF = new PointF(density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()) - mo236toPx0680j_4, density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM()) - mo236toPx0680j_4);
                    float mo236toPx0680j_42 = density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM()) * 0.00525f;
                    this.f$7.setValue(pointF);
                    mutableState2.setValue(Float.valueOf(mo236toPx0680j_4));
                    stampState.strokeWidth$delegate.setValue(Float.valueOf(mo236toPx0680j_42));
                    patternStampState2.strokeWidth$delegate.setValue(Float.valueOf(mo236toPx0680j_42));
                    final int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                    final int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                    CardStudioViewModelV2.PatternDensity patternDensity = content.patternDensity;
                    boolean z2 = content.isShowingCashtag;
                    CardTheme cardTheme = content.cardTheme;
                    boolean changedInstance = gapComposer2.changedInstance(content) | gapComposer2.changedInstance(patternStampState2);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Continuation continuation = null;
                    if (changedInstance || rememberedValue == obj4) {
                        rememberedValue = new InteractiveCardView$flingTo$1.AnonymousClass2(content, patternStampState2, continuation, 27);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer2, patternDensity, (Function2) rememberedValue);
                    Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    String str = cardTheme.ink_color;
                    Timber.Forest forest2 = Timber.Forest;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj4) {
                        rememberedValue2 = new CardStudioViewKt$ThemedCard$1$4$1(1, forest2, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 15);
                        forest = forest2;
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    } else {
                        forest = forest2;
                    }
                    Integer safeParseColor = StringsKt.safeParseColor(str, (Function1) ((KFunction) rememberedValue2));
                    safeParseColor.getClass();
                    final int intValue2 = safeParseColor.intValue();
                    ProvidableCompositionLocal providableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors2 = (Colors) gapComposer2.consume(providableCompositionLocal2);
                    if (colors2 == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                        colors = colors2;
                    }
                    int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.standard);
                    CardTheme.CardCustomizationMargin cardCustomizationMargin = cardTheme.card_customization_margin;
                    float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer2) * ((cardCustomizationMargin == null || (f3 = cardCustomizationMargin.size) == null) ? 0.0f : f3.floatValue());
                    CardTheme.CardCustomizationMargin cardCustomizationMargin2 = cardTheme.card_customization_margin;
                    if (cardCustomizationMargin2 == null) {
                        gapComposer2.startReplaceGroup(1452339214);
                        gapComposer2.end(false);
                        valueOf = null;
                    } else {
                        gapComposer2.startReplaceGroup(1452339215);
                        float m3477toPx8Feqmps3 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer2);
                        Float f4 = cardCustomizationMargin2.size;
                        f4.getClass();
                        float floatValue = (m3477toPx8Feqmps3 - f4.floatValue()) * 0.02585f;
                        gapComposer2.end(false);
                        valueOf = Float.valueOf(floatValue);
                    }
                    float m3477toPx8Feqmps4 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer2) * 0.058f;
                    if (valueOf != null) {
                        f = m3477toPx8Feqmps4;
                        f2 = valueOf.floatValue();
                    } else {
                        f = m3477toPx8Feqmps4;
                        f2 = f;
                    }
                    Float f5 = valueOf;
                    stampState.offClipStrokeColor$delegate.setValue(new Color(ColorKt.Color(m694toArgb8_81llA)));
                    stampState.clip$delegate.setValue(RoundedCornerShapeKt.RoundedCornerShape(f2));
                    stampState.margin$delegate.setValue(Float.valueOf(m3477toPx8Feqmps2));
                    stampState.strokeColor$delegate.setValue(new Color(ColorKt.Color(intValue2)));
                    patternStampState2.offClipStrokeColor$delegate.setValue(new Color(ColorKt.Color(m694toArgb8_81llA)));
                    patternStampState2.clip$delegate.setValue(RoundedCornerShapeKt.RoundedCornerShape(f2));
                    patternStampState2.margin$delegate.setValue(Float.valueOf(m3477toPx8Feqmps2));
                    patternStampState2.strokeColor$delegate.setValue(new Color(ColorKt.Color(intValue2)));
                    boolean changed = gapComposer2.changed(z2);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue3 == obj4) {
                        CashtagDrawable cashtagDrawable = new CashtagDrawable(context, content.cashtag, true);
                        cashtagDrawable.textPaint.setTypeface(CardsKt.typeface(cardTheme.font, context));
                        if (!z2) {
                            cashtagDrawable = null;
                        }
                        gapComposer2.updateRememberedValue(cashtagDrawable);
                        rememberedValue3 = cashtagDrawable;
                    }
                    final CashtagDrawable cashtagDrawable2 = (CashtagDrawable) rememberedValue3;
                    if (cashtagDrawable2 != null) {
                        cashtagDrawable2.setBounds(0, 0, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j));
                    }
                    boolean changed2 = gapComposer2.changed(cardTheme);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue4 == obj4) {
                        patternStampState = patternStampState2;
                        rememberedValue4 = new DrawablePainter(new ChipDrawable(context, cardTheme.id == CardTheme.Identifier.TORTOISE_ID, true));
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    } else {
                        patternStampState = patternStampState2;
                    }
                    DrawablePainter drawablePainter2 = (DrawablePainter) rememberedValue4;
                    Colors colors3 = (Colors) gapComposer2.consume(providableCompositionLocal2);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    boolean z3 = colors3.isLight;
                    boolean z4 = !z3;
                    CardTheme.Gradient gradient = cardTheme.gradient_style;
                    boolean changed3 = gapComposer2.changed(z4) | gapComposer2.changed(gradient == null ? -1 : gradient.ordinal());
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue5 == obj4) {
                        CardTheme.Gradient gradient2 = cardTheme.gradient_style;
                        int i2 = gradient2 != null ? CardStudioViewV2Kt.WhenMappings.$EnumSwitchMapping$1[gradient2.ordinal()] : -1;
                        if (i2 == 1) {
                            Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.gradient_diagonal_dark, null);
                            drawableCompat.getClass();
                            drawablePainter = new DrawablePainter(drawableCompat);
                        } else if (i2 != 2) {
                            drawablePainter = null;
                        } else {
                            Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, !z3 ? R.drawable.gradient_diagonal_light_dark_mode : R.drawable.gradient_diagonal_light, null);
                            drawableCompat2.getClass();
                            drawablePainter = new DrawablePainter(drawableCompat2);
                        }
                        gapComposer2.updateRememberedValue(drawablePainter);
                        rememberedValue5 = drawablePainter;
                    }
                    DrawablePainter drawablePainter3 = (DrawablePainter) rememberedValue5;
                    Modifier clip = ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(m3477toPx8Feqmps));
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, clip);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    CardStudioViewV2Kt.ThemedCardV2(SizeKt.fillMaxSize(companion2, 1.0f), content, flow, gapComposer2, 6);
                    gapComposer2.end(true);
                    Modifier clipCashtag = CanvasKt.clipCashtag(SizeKt.fillMaxSize(companion2, 1.0f), cashtagDrawable2);
                    boolean changed4 = gapComposer2.changed(state);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue6 == obj4) {
                        rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, 6);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    AspectRatio.Signature(ColorKt.graphicsLayer(clipCashtag, (Function1) rememberedValue6), true, intValue2, m694toArgb8_81llA, RoundedCornerShapeKt.RoundedCornerShape(f2), m3477toPx8Feqmps2, DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM(), gapComposer2) * 0.00525f, metadataRepo, signatureState, gapComposer2, 134217776, 0);
                    Modifier clipCashtag2 = CanvasKt.clipCashtag(SizeKt.fillMaxSize(companion2, 1.0f), cashtagDrawable2);
                    boolean changed5 = gapComposer2.changed(state);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue7 == obj4) {
                        rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, 7);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    PickVisualMediaRequestKt.Stamp(ColorKt.graphicsLayer(clipCashtag2, (Function1) rememberedValue7), stampState, result, gapComposer2, 64);
                    final PatternStampState patternStampState3 = patternStampState;
                    float f6 = f;
                    GapComposer gapComposer3 = gapComposer2;
                    AnimatedContentKt.AnimatedVisibility(content.customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), "Pattern animation", (Function3) Expect_jvmKt.rememberComposableLambda(-389234948, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda38
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                            Composer composer2 = (Composer) obj15;
                            ((Integer) obj16).getClass();
                            ((AnimatedVisibilityScope) obj14).getClass();
                            CardStudioViewModelV2.PatternDensity patternDensity2 = CardStudioViewModelV2.Content.this.patternDensity;
                            float f7 = m1025getMaxWidthimpl;
                            float f8 = f7 / patternDensity2.cols;
                            float f9 = m1024getMaxHeightimpl;
                            float f10 = f9 / patternDensity2.rows;
                            long Color = ColorKt.Color(intValue2);
                            GapComposer gapComposer4 = (GapComposer) composer2;
                            Colors colors4 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                            if (colors4 == null) {
                                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                            } else {
                                gapComposer4.startReplaceGroup(-1762997739);
                                gapComposer4.end(false);
                            }
                            CardStudioViewV2Kt.m3433PatternGridnBX6wN0(f9, f7, f8, f10, Color, colors4.semantic.border.standard, composer2, 1572864);
                            ASTUtilKt.PatternStamps(CanvasKt.clipCashtag(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), cashtagDrawable2), (int) f8, (int) f10, patternStampState3, result, composer2, 4096);
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3), (Composer) gapComposer3, 224640, 2);
                    CardTheme.CardCustomizationMargin cardCustomizationMargin3 = cardTheme.card_customization_margin;
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$12 = ContentScale.Companion.FillBounds;
                    if (cardCustomizationMargin3 == null) {
                        gapComposer3.startReplaceGroup(1456905948);
                        z = false;
                        gapComposer3.end(false);
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                    } else {
                        gapComposer3.startReplaceGroup(1456905949);
                        Density density2 = (Density) gapComposer3.consume(providableCompositionLocal);
                        Object rememberedValue8 = gapComposer3.rememberedValue();
                        if (rememberedValue8 == obj4) {
                            Float f7 = cardCustomizationMargin3.size;
                            f7.getClass();
                            float mo236toPx0680j_43 = density2.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()) * f7.floatValue();
                            f5.getClass();
                            float floatValue2 = f5.floatValue();
                            Integer safeParseColor2 = StringsKt.safeParseColor(cardCustomizationMargin3.color, new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 14));
                            safeParseColor2.getClass();
                            rememberedValue8 = new DrawablePainter(new CardMarginDrawable(mo236toPx0680j_43, f6, floatValue2, safeParseColor2.intValue()));
                            gapComposer3.updateRememberedValue(rememberedValue8);
                        }
                        DrawablePainter drawablePainter4 = (DrawablePainter) rememberedValue8;
                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState((((Boolean) this.f$10.getValue()).booleanValue() || CardStudioViewV2Kt.CardStudioV2Content$lambda$18(state2)) ? 1.0f : 0.0f, AnimatableKt.tween$default(500, 0, null, 6), "marginAlpha", null, gapComposer3, 3120, 20);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                        float floatValue3 = ((Number) animateFloatAsState.getValue()).floatValue();
                        Float f8 = cardCustomizationMargin3.alpha;
                        f8.getClass();
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                        ImageKt.Image(drawablePainter4, null, fillMaxSize, null, contentScale$Companion$Fit$1, f8.floatValue() * floatValue3, null, gapComposer3, 25016, 72);
                        gapComposer3 = gapComposer3;
                        z = false;
                        gapComposer3.end(false);
                    }
                    Modifier clip2 = ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(m3477toPx8Feqmps));
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, clip2);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(function0);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (z2) {
                        gapComposer3.startReplaceGroup(1864404808);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                        Painter rememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(cashtagDrawable2, gapComposer3);
                        long Color = ColorKt.Color(intValue2);
                        ImageKt.Image(rememberDrawablePainter, null, fillMaxSize2, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 25008, 40);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1864684769);
                        gapComposer3.end(false);
                    }
                    ImageKt.Image(drawablePainter2, null, SizeKt.fillMaxSize(companion2, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer3, 25016, 104);
                    if (drawablePainter3 == null) {
                        gapComposer3.startReplaceGroup(1864905488);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1864905489);
                        ImageKt.Image(drawablePainter3, null, SizeKt.fillMaxSize(companion2, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer3, 25016, 104);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj13;
                RealSheetState realSheetState = (RealSheetState) obj12;
                Function1 function1 = (Function1) obj11;
                AmountDisplayState amountDisplayState2 = (AmountDisplayState) obj10;
                CoroutineScope coroutineScope = (CoroutineScope) obj9;
                Shaker shaker = (Shaker) obj8;
                MutableFloatState mutableFloatState = (MutableFloatState) obj7;
                MutableFloatState mutableFloatState2 = (MutableFloatState) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer2).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer2;
                boolean shouldExecute2 = gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18);
                Applier applier2 = gapComposer4.applier;
                if (shouldExecute2) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf3 = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf3, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$18, 1.0f, true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, m);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$17, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    float floatValue4 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                    MutableState mutableState4 = this.f$7;
                    if (floatValue4 <= RecyclerView.DECELERATION_RATE || ((BitcoinTransferViewModel.Content.BottomSheetContent) mutableState2.getValue()) == null) {
                        mutableState = mutableState4;
                        gapComposer = gapComposer4;
                        amountDisplayState = amountDisplayState2;
                        companion = companion2;
                        gapComposer.startReplaceGroup(-1034896980);
                        gapComposer.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1036290430);
                        BitcoinTransferViewModel.Content.BottomSheetContent bottomSheetContent = (BitcoinTransferViewModel.Content.BottomSheetContent) mutableState2.getValue();
                        bottomSheetContent.getClass();
                        amountDisplayState = amountDisplayState2;
                        boolean changed6 = gapComposer4.changed(mutableState4) | gapComposer4.changed(amountDisplayState) | gapComposer4.changed(function1) | gapComposer4.changedInstance(coroutineScope) | gapComposer4.changed(realSheetState);
                        Object rememberedValue9 = gapComposer4.rememberedValue();
                        if (changed6 || rememberedValue9 == obj4) {
                            rememberedValue9 = new BitcoinExchangeViewKt$$ExternalSyntheticLambda8(function1, this.f$10, mutableState4, amountDisplayState, coroutineScope, realSheetState);
                            mutableState = mutableState4;
                            gapComposer4.updateRememberedValue(rememberedValue9);
                        } else {
                            mutableState = mutableState4;
                        }
                        Function1 function12 = (Function1) rememberedValue9;
                        companion = companion2;
                        Modifier padding = SpacerKt.padding(companion, paddingValues);
                        Object rememberedValue10 = gapComposer4.rememberedValue();
                        if (rememberedValue10 == obj4) {
                            rememberedValue10 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, 5);
                            gapComposer4.updateRememberedValue(rememberedValue10);
                        }
                        BitcoinExchangeViewKt.BitcoinExchangeAtmPicker(bottomSheetContent, function12, ColorKt.graphicsLayer(padding, (Function1) rememberedValue10), gapComposer4, 0, 0);
                        gapComposer = gapComposer4;
                        gapComposer.end(false);
                    }
                    if (((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue() <= RecyclerView.DECELERATION_RATE || ((BitcoinTransferViewModel.Content.FullScreenContent) mutableState3.getValue()) == null) {
                        gapComposer.startReplaceGroup(-1034496212);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1034815264);
                        BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent = (BitcoinTransferViewModel.Content.FullScreenContent) mutableState3.getValue();
                        fullScreenContent.getClass();
                        Object rememberedValue11 = gapComposer.rememberedValue();
                        if (rememberedValue11 == obj4) {
                            rememberedValue11 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState2, 4);
                            gapComposer.updateRememberedValue(rememberedValue11);
                        }
                        BitcoinExchangeViewKt.BitcoinExchangeKeypadAmountPicker(fullScreenContent, amountDisplayState, shaker, function1, ColorKt.graphicsLayer(companion, (Function1) rememberedValue11), null, false, gapComposer, 24576, 96);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    if (bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content) {
                        gapComposer.startReplaceGroup(-1495864692);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(PinnedKt.pinned(SpacerKt.m301paddingqDBjuR0(wrapContentHeight, 24.0f, 24.0f, 24.0f, 48.0f), realSheetState), 1.0f);
                        boolean z5 = ((Boolean) mutableState.getValue()).booleanValue() && !((BitcoinTransferViewModel.Content) bitcoinTransferViewModel).getHasInvalidAmount();
                        boolean changed7 = gapComposer.changed(function1);
                        Object rememberedValue12 = gapComposer.rememberedValue();
                        if (changed7 || rememberedValue12 == obj4) {
                            rememberedValue12 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(18, function1);
                            gapComposer.updateRememberedValue(rememberedValue12);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue12, fillMaxWidth, buttonProminence, false, z5, null, Expect_jvmKt.rememberComposableLambda(-1547725700, new SsnViewKt$$ExternalSyntheticLambda2(bitcoinTransferViewModel, 3), gapComposer), gapComposer, 1573248, 40);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1495397274);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda6(CardStudioViewModelV2.Content content, PatternStampState patternStampState, StampState stampState, State state, MetadataRepo metadataRepo, SignatureState signatureState, Result result, MutableState mutableState, MutableState mutableState2, Flow flow, MutableState mutableState3, State state2) {
        this.f$0 = content;
        this.f$1 = patternStampState;
        this.f$2 = stampState;
        this.f$3 = state;
        this.f$4 = metadataRepo;
        this.f$5 = signatureState;
        this.f$6 = result;
        this.f$7 = mutableState;
        this.f$8 = mutableState2;
        this.f$9 = flow;
        this.f$10 = mutableState3;
        this.f$11 = state2;
    }
}
