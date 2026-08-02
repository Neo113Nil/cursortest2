package com.squareup.cash.card.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.GlitterCardEffectKt;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.android.StringsKt;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public abstract class CashCardKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CardTheme.BackgroundImage.values().length];
            try {
                iArr[CardTheme.BackgroundImage.METAL_BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.BackgroundImage.METAL_OIL_SLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTheme.BackgroundImage.TORTOISE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardTheme.Identifier.values().length];
            try {
                iArr2[CardTheme.Identifier.HOLO_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CardTheme.Gradient.values().length];
            try {
                iArr3[CardTheme.Gradient.DIAGONAL_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CardTheme.Gradient.DIAGONAL_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x013c, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BaseCashCard(Modifier modifier, CardTheme cardTheme, Function3 function3, Composer composer, int i) {
        Function3 function32;
        Integer num;
        Drawable drawable;
        Drawable drawable2;
        Integer valueOf;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1748514591);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(cardTheme) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, modifier, false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, aspectRatio);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier matchParentSize = boxScopeInstance.matchParentSize();
            boolean changed = gapComposer.changed(cardTheme);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                CardTheme.Gradient gradient = cardTheme != null ? cardTheme.gradient_style : null;
                int i3 = gradient == null ? -1 : WhenMappings.$EnumSwitchMapping$2[gradient.ordinal()];
                if (i3 == -1) {
                    num = null;
                } else if (i3 == 1) {
                    num = Integer.valueOf(R.drawable.card_gradient_diagonal_dark);
                } else {
                    if (i3 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    num = Integer.valueOf(R.drawable.card_gradient_diagonal_light);
                }
                if (num != null) {
                    drawable = PlatformKt.getDrawableCompat(context, num.intValue(), null);
                    drawable.getClass();
                } else {
                    drawable = null;
                }
                Integer safeParseColor = StringsKt.safeParseColor(cardTheme != null ? cardTheme.card_color : null, null);
                int intValue = safeParseColor != null ? safeParseColor.intValue() : ColorKt.m694toArgb8_81llA(Color.Black);
                Integer safeParseColor2 = StringsKt.safeParseColor(cardTheme != null ? cardTheme.border_color : null, null);
                int intValue2 = safeParseColor2 != null ? safeParseColor2.intValue() : intValue;
                Integer safeParseColor3 = StringsKt.safeParseColor(cardTheme != null ? cardTheme.card_highlight_color : null, null);
                int intValue3 = safeParseColor3 != null ? safeParseColor3.intValue() : ColorKt.m694toArgb8_81llA(Color.White);
                if (cardTheme != null) {
                    CardTheme.Identifier identifier = cardTheme.id;
                    if (identifier != null) {
                        valueOf = WhenMappings.$EnumSwitchMapping$1[identifier.ordinal()] == 1 ? Integer.valueOf(R.drawable.card_holo_plain) : null;
                    }
                    CardTheme.BackgroundImage backgroundImage = cardTheme.background_image;
                    int i4 = backgroundImage == null ? -1 : WhenMappings.$EnumSwitchMapping$0[backgroundImage.ordinal()];
                    valueOf = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Integer.valueOf(R.drawable.card_tortoise_background) : Integer.valueOf(R.drawable.card_metallic_oil_background) : Integer.valueOf(R.drawable.card_metallic_black_background);
                    if (valueOf != null) {
                        drawable2 = PlatformKt.getDrawableCompat(context, valueOf.intValue(), null);
                        drawable2.getClass();
                        if (drawable2 == null) {
                            Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_background, null);
                            drawableCompat.getClass();
                            Drawable mutate = drawableCompat.mutate();
                            mutate.getClass();
                            final GradientDrawable gradientDrawable = (GradientDrawable) mutate;
                            gradientDrawable.setColor(intValue);
                            gradientDrawable.setStroke(Views.dip(context, 2), intValue2);
                            drawable2 = new DrawableWrapper(gradientDrawable) { // from class: com.squareup.cash.card.ui.CashCardKt$createCardDrawable$1
                                public final /* synthetic */ GradientDrawable $background;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(gradientDrawable);
                                    this.$background = gradientDrawable;
                                }

                                @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
                                public final void onBoundsChange(Rect rect) {
                                    rect.getClass();
                                    super.onBoundsChange(rect);
                                    this.$background.setCornerRadius(rect.width() * 0.04f);
                                }
                            };
                        }
                        if (drawable != null) {
                            drawable2 = new LayerDrawable(new Drawable[]{drawable2, drawable});
                        }
                        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(intValue3), drawable2, null);
                        gapComposer.updateRememberedValue(rippleDrawable);
                        rememberedValue = rippleDrawable;
                    }
                }
                drawable2 = null;
                if (drawable2 == null) {
                }
                if (drawable != null) {
                }
                RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(intValue3), drawable2, null);
                gapComposer.updateRememberedValue(rippleDrawable2);
                rememberedValue = rippleDrawable2;
            }
            ImageKt.Image(DrawablePainterKt.rememberDrawablePainter((Drawable) rememberedValue, gapComposer), null, matchParentSize, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            if ((cardTheme != null ? cardTheme.background_image : null) == CardTheme.BackgroundImage.GLITTER) {
                gapComposer.startReplaceGroup(-1920960809);
                GlitterCardEffectKt.GlitterCardEffect(boxScopeInstance.matchParentSize(), null, false, gapComposer, 0, 6);
                gapComposer.end(false);
            } else {
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    if ((cardTheme != null ? cardTheme.background_image : null) == CardTheme.BackgroundImage.MOOD) {
                        gapComposer.startReplaceGroup(-1920825525);
                        Modifier matchParentSize2 = boxScopeInstance.matchParentSize();
                        Integer valueOf2 = Integer.valueOf(R.drawable.card_mood_hand_heat_map);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new CashCardKt$$ExternalSyntheticLambda0(0, mutableState);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        CanvasKt.MoodHeatEffect(matchParentSize2, valueOf2, (Function1) rememberedValue3, 0L, 0L, gapComposer, 3072);
                        gapComposer.end(false);
                    }
                }
                if ((cardTheme != null ? cardTheme.background_image : null) == CardTheme.BackgroundImage.TORTOISE) {
                    gapComposer.startReplaceGroup(-1920540170);
                    TortoiseCardEffectKt.TortoiseBackground(0, 0, gapComposer, boxScopeInstance.matchParentSize());
                    gapComposer.end(false);
                } else {
                    if ((cardTheme != null ? cardTheme.id : null) == CardTheme.Identifier.HOLO_ID) {
                        gapComposer.startReplaceGroup(-1920413318);
                        FlowsKt.HoloBackground(boxScopeInstance.matchParentSize(), gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1920348931);
                        gapComposer.end(false);
                    }
                }
            }
            function32 = function3;
            function32.invoke(boxScopeInstance, gapComposer, 54);
            gapComposer.end(true);
        } else {
            function32 = function3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(modifier, cardTheme, function32, i, 0);
        }
    }
}
