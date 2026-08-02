package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextPaint;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ImageDrawable;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.StringsKt;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class StyledCardViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CardTheme.Gradient.values().length];
            try {
                iArr[CardTheme.Gradient.DIAGONAL_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.Gradient.DIAGONAL_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardTheme.BackgroundImage.values().length];
            try {
                iArr2[CardTheme.BackgroundImage.HOOD_BY_AIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.HUNDRED_THIEVES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.METAL_BLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.METAL_OIL_SLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.SHANTELL_MARTIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.TAP_DEVICE_TRIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.SLIMEGUY.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.DREAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.MOOD.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.TORTOISE.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.BRAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x070b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0980 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* renamed from: StyledCard-nSlTg7c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3439StyledCardnSlTg7c(final StyledCardViewModel styledCardViewModel, Modifier modifier, Function1 function1, float f, float f2, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Function1 function12;
        int i4;
        float f3;
        int i5;
        final boolean z2;
        final Modifier modifier2;
        final float f4;
        final float f5;
        final Function1 function13;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        Function1 function14;
        float f6;
        int i6;
        Function1 function15;
        boolean z3;
        float f7;
        float f8;
        Object obj;
        Integer safeParseColor;
        MutableState mutableState;
        String str;
        Function1 function16;
        int i7;
        int i8;
        int i9;
        Object obj2;
        Context context;
        Resources resources;
        int i10;
        boolean z4;
        RoundedCornerShape roundedCornerShape;
        Modifier modifier4;
        StyledCardViewModel styledCardViewModel2;
        boolean z5;
        Context context2;
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1;
        Context context3;
        boolean z6;
        GapComposer gapComposer2;
        boolean changed;
        int i11;
        Object obj3;
        int i12;
        GapComposer gapComposer3;
        int i13;
        Integer valueOf;
        GapComposer gapComposer4;
        int i14;
        Resources resources2;
        int i15;
        boolean z7;
        GapComposer gapComposer5;
        boolean z8;
        Object rememberedValue;
        Function1 function17;
        int i16;
        MutableState mutableState2;
        int i17;
        boolean z9;
        boolean z10;
        GapComposer gapComposer6;
        int i18;
        int intValue;
        Object obj4;
        boolean z11;
        Colors colors;
        int i19;
        styledCardViewModel.getClass();
        boolean z12 = styledCardViewModel.showCashtag;
        String str2 = styledCardViewModel.cashtag;
        CardTheme cardTheme = styledCardViewModel.theme;
        GapComposer gapComposer7 = (GapComposer) composer;
        gapComposer7.startRestartGroup(329900395);
        Applier applier = gapComposer7.applier;
        int i20 = (i & 6) == 0 ? (gapComposer7.changedInstance(styledCardViewModel) ? 4 : 2) | i : i;
        int i21 = i2 & 2;
        if (i21 != 0) {
            i20 |= 48;
        } else if ((i & 48) == 0) {
            i20 |= gapComposer7.changed(modifier) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i20 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function12 = function1;
                i20 |= gapComposer7.changedInstance(function12) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0 && gapComposer7.changed(f)) {
                        i19 = 2048;
                        i20 |= i19;
                    }
                    i19 = 1024;
                    i20 |= i19;
                }
                i4 = i2 & 16;
                if (i4 != 0) {
                    i20 |= 24576;
                } else if ((i & 24576) == 0) {
                    f3 = f2;
                    i20 |= gapComposer7.changed(f3) ? 16384 : PKIFailureInfo.certRevoked;
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i20 |= 196608;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i & 196608) == 0) {
                            i20 |= gapComposer7.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                    }
                    if (gapComposer7.shouldExecute(i20 & 1, (i20 & 74899) == 74898)) {
                        gapComposer7.skipToGroupEnd();
                        modifier2 = modifier;
                        f4 = f;
                        f5 = f3;
                        function13 = function12;
                        gapComposer = gapComposer7;
                    } else {
                        gapComposer7.startDefaults();
                        int i22 = i & 1;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Object obj5 = Composer.Companion.Empty;
                        if (i22 == 0 || gapComposer7.getDefaultsInvalid()) {
                            modifier3 = i21 != 0 ? companion : modifier;
                            if (i3 != 0) {
                                Object rememberedValue2 = gapComposer7.rememberedValue();
                                if (rememberedValue2 == obj5) {
                                    rememberedValue2 = new CalendarRowKt$$ExternalSyntheticLambda10(23);
                                    gapComposer7.updateRememberedValue(rememberedValue2);
                                }
                                function14 = (Function1) rememberedValue2;
                            } else {
                                function14 = function12;
                            }
                            if ((i2 & 8) != 0) {
                                f6 = DpSize.m1044getWidthD9Ej5fM(((LazyWindowInfo) ((WindowInfo) gapComposer7.consume(CompositionLocalsKt.LocalWindowInfo))).m938getContainerDpSizeMYxV2XQ());
                                i20 &= -7169;
                            } else {
                                f6 = f;
                            }
                            if (i4 != 0) {
                                f3 = 10.0f;
                            }
                            if (i5 != 0) {
                                Function1 function18 = function14;
                                i6 = i20;
                                function15 = function18;
                                f7 = f6;
                                f8 = f3;
                                z3 = true;
                            } else {
                                Function1 function19 = function14;
                                i6 = i20;
                                function15 = function19;
                                z3 = z2;
                                f7 = f6;
                                f8 = f3;
                            }
                        } else {
                            gapComposer7.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i20 &= -7169;
                            }
                            modifier3 = modifier;
                            i6 = i20;
                            z3 = z2;
                            f8 = f3;
                            function15 = function12;
                            f7 = f;
                        }
                        gapComposer7.endDefaults();
                        Context context4 = (Context) gapComposer7.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        Resources resources3 = (Resources) gapComposer7.consume(AndroidCompositionLocals_androidKt.LocalResources);
                        String str3 = cardTheme.ink_color;
                        if (str3 == null) {
                            gapComposer7.startReplaceGroup(1177881853);
                            gapComposer7.end(false);
                            obj = null;
                            safeParseColor = null;
                        } else {
                            obj = null;
                            gapComposer7.startReplaceGroup(-793287804);
                            Timber.Forest forest = Timber.Forest;
                            Object rememberedValue3 = gapComposer7.rememberedValue();
                            if (rememberedValue3 == obj5) {
                                rememberedValue3 = new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 20);
                                gapComposer7.updateRememberedValue(rememberedValue3);
                            }
                            safeParseColor = StringsKt.safeParseColor(str3, (Function1) ((KFunction) rememberedValue3));
                            gapComposer7.end(false);
                        }
                        int intValue2 = safeParseColor != null ? safeParseColor.intValue() : 0;
                        Object rememberedValue4 = gapComposer7.rememberedValue();
                        if (rememberedValue4 == obj5) {
                            rememberedValue4 = Updater.mutableStateOf$default(obj);
                            gapComposer7.updateRememberedValue(rememberedValue4);
                        }
                        MutableState mutableState3 = (MutableState) rememberedValue4;
                        RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f8);
                        ProvidableCompositionLocal providableCompositionLocal = CompositionLocalsKt.LocalDensity;
                        int mo230roundToPx0680j_4 = ((Density) gapComposer7.consume(providableCompositionLocal)).mo230roundToPx0680j_4(f7);
                        float f9 = f7;
                        int i23 = (int) (mo230roundToPx0680j_4 / 1.5857725f);
                        CardContouredText cardContouredText = styledCardViewModel.contouredText;
                        if (cardContouredText != null) {
                            int i24 = i6;
                            String str4 = cardContouredText.text;
                            gapComposer7.startReplaceGroup(1178428694);
                            Density density = (Density) gapComposer7.consume(providableCompositionLocal);
                            float mo236toPx0680j_4 = density.mo236toPx0680j_4(14.0f);
                            Integer num = cardContouredText.color;
                            if (num == null) {
                                gapComposer7.startReplaceGroup(-793266893);
                                Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    i18 = intValue2;
                                    z11 = false;
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                                } else {
                                    i18 = intValue2;
                                    z11 = false;
                                    gapComposer7.startReplaceGroup(-1762997739);
                                    gapComposer7.end(false);
                                    colors = colors2;
                                }
                                function16 = function15;
                                i7 = i23;
                                intValue = ColorKt.m694toArgb8_81llA(colors.semantic.text.standard);
                                gapComposer7.end(z11);
                            } else {
                                function16 = function15;
                                i7 = i23;
                                i18 = intValue2;
                                gapComposer7.startReplaceGroup(-793268908);
                                gapComposer7.end(false);
                                intValue = num.intValue();
                            }
                            boolean changed2 = gapComposer7.changed(cardContouredText) | gapComposer7.changed(intValue);
                            Object rememberedValue5 = gapComposer7.rememberedValue();
                            if (changed2 || rememberedValue5 == obj5) {
                                TextPaint textPaint = new TextPaint();
                                textPaint.setTypeface(ResourcesCompat.getFont(context4, R.font.cashsansmono_regular));
                                textPaint.setAntiAlias(true);
                                textPaint.setTextSize(density.mo236toPx0680j_4(6.0f));
                                textPaint.setTextAlign(Paint.Align.LEFT);
                                textPaint.setColor(intValue);
                                textPaint.setAlpha((int) (cardContouredText.opacity * 255.0f));
                                gapComposer7.updateRememberedValue(textPaint);
                                obj4 = textPaint;
                            } else {
                                obj4 = rememberedValue5;
                            }
                            TextPaint textPaint2 = (TextPaint) obj4;
                            boolean changed3 = gapComposer7.changed(str4);
                            Object rememberedValue6 = gapComposer7.rememberedValue();
                            if (changed3 || rememberedValue6 == obj5) {
                                StringBuilder sb = new StringBuilder();
                                for (int i25 = 0; i25 < 40; i25++) {
                                    sb.append(str4);
                                    sb.append(" ");
                                }
                                rememberedValue6 = sb.toString();
                                gapComposer7.updateRememberedValue(rememberedValue6);
                            }
                            String str5 = (String) rememberedValue6;
                            boolean changed4 = gapComposer7.changed(str4) | gapComposer7.changed(textPaint2);
                            Object rememberedValue7 = gapComposer7.rememberedValue();
                            if (changed4 || rememberedValue7 == obj5) {
                                rememberedValue7 = Float.valueOf(textPaint2.measureText(str4 + " "));
                                gapComposer7.updateRememberedValue(rememberedValue7);
                            }
                            mutableState = mutableState3;
                            i9 = i24;
                            resources = resources3;
                            i10 = i18;
                            z4 = false;
                            str = str2;
                            i8 = mo230roundToPx0680j_4;
                            context = context4;
                            obj2 = obj5;
                            roundedCornerShape = m340RoundedCornerShape0680j_4;
                            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("contouredText", gapComposer7, 0), RecyclerView.DECELERATION_RATE, ((Number) rememberedValue7).floatValue(), AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(5000, 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), "contouredTextOffset", gapComposer7, 28728, 0);
                            boolean changed5 = gapComposer7.changed(mo236toPx0680j_4) | gapComposer7.changed(animateFloat) | gapComposer7.changed(str5) | gapComposer7.changedInstance(textPaint2);
                            Object rememberedValue8 = gapComposer7.rememberedValue();
                            if (changed5 || rememberedValue8 == obj2) {
                                rememberedValue8 = new SliderKt$$ExternalSyntheticLambda8(str5, textPaint2, mo236toPx0680j_4, animateFloat);
                                gapComposer7.updateRememberedValue(rememberedValue8);
                            }
                            modifier4 = ClipKt.drawWithContent(companion, (Function1) rememberedValue8);
                            gapComposer7.end(false);
                        } else {
                            mutableState = mutableState3;
                            str = str2;
                            function16 = function15;
                            i7 = i23;
                            i8 = mo230roundToPx0680j_4;
                            i9 = i6;
                            obj2 = obj5;
                            context = context4;
                            resources = resources3;
                            i10 = intValue2;
                            z4 = false;
                            roundedCornerShape = m340RoundedCornerShape0680j_4;
                            gapComposer7.startReplaceGroup(1181696001);
                            gapComposer7.end(false);
                            modifier4 = companion;
                        }
                        Modifier then = OffsetKt.aspectRatio(1.5857725f, modifier3, z4).then(modifier4);
                        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z4);
                        int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, then);
                        ComposeUiNode.Companion.getClass();
                        Function0 function0 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(function0);
                        } else {
                            gapComposer7.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf2 = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer7, valueOf2, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer7, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        Modifier clip = ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), roundedCornerShape);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z4);
                        int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, clip);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer7.startReusableNode();
                        Modifier modifier5 = modifier3;
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(function0);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        Object rememberedValue9 = gapComposer7.rememberedValue();
                        if (rememberedValue9 == obj2) {
                            rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer7.updateRememberedValue(rememberedValue9);
                        }
                        MutableState mutableState4 = (MutableState) rememberedValue9;
                        CardTheme.BackgroundImage backgroundImage = cardTheme.background_image;
                        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$12 = ContentScale.Companion.FillWidth;
                        if (!z3 || ((Boolean) mutableState4.getValue()).booleanValue()) {
                            styledCardViewModel2 = styledCardViewModel;
                        } else {
                            styledCardViewModel2 = styledCardViewModel;
                            if (styledCardViewModel2.isInteractive && backgroundImage == CardTheme.BackgroundImage.MOOD) {
                                gapComposer7.startReplaceGroup(1806507433);
                                Modifier clip2 = ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), roundedCornerShape);
                                String str6 = cardTheme.card_color;
                                Timber.Forest forest2 = Timber.Forest;
                                Object rememberedValue10 = gapComposer7.rememberedValue();
                                if (rememberedValue10 == obj2) {
                                    rememberedValue10 = new CardStudioViewKt$ThemedCard$1$4$1(1, forest2, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 19);
                                    gapComposer7.updateRememberedValue(rememberedValue10);
                                }
                                Integer safeParseColor2 = StringsKt.safeParseColor(str6, (Function1) ((KFunction) rememberedValue10));
                                safeParseColor2.getClass();
                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip2, ColorKt.Color(safeParseColor2.intValue()), ColorKt.RectangleShape);
                                Integer valueOf3 = Integer.valueOf(R.drawable.card_mood_hand_heat_map);
                                Object rememberedValue11 = gapComposer7.rememberedValue();
                                if (rememberedValue11 == obj2) {
                                    rememberedValue11 = new CashCardKt$$ExternalSyntheticLambda0(25, mutableState4);
                                    gapComposer7.updateRememberedValue(rememberedValue11);
                                }
                                CanvasKt.MoodHeatEffect(m177backgroundbw27NRU, valueOf3, (Function1) rememberedValue11, 0L, 0L, gapComposer7, 3072);
                                GapComposer gapComposer8 = gapComposer7;
                                z5 = false;
                                gapComposer8.end(false);
                                gapComposer6 = gapComposer8;
                                z6 = z5;
                                context3 = context;
                                contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                                gapComposer2 = gapComposer6;
                                String str7 = str;
                                changed = gapComposer2.changed(str7);
                                Object rememberedValue12 = gapComposer2.rememberedValue();
                                if (!changed || rememberedValue12 == obj2) {
                                    CashtagDrawable cashtagDrawable = new CashtagDrawable(context3, str7, z6);
                                    i11 = i10;
                                    cashtagDrawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP));
                                    cashtagDrawable.textPaint.setTypeface(CardsKt.typeface(cardTheme.font, context3));
                                    gapComposer2.updateRememberedValue(cashtagDrawable);
                                    obj3 = cashtagDrawable;
                                } else {
                                    i11 = i10;
                                    obj3 = rememberedValue12;
                                }
                                CashtagDrawable cashtagDrawable2 = (CashtagDrawable) obj3;
                                if (z12) {
                                    gapComposer2.startReplaceGroup(168562791);
                                    i12 = i11;
                                    GapComposer gapComposer9 = gapComposer2;
                                    ImageKt.Image(DrawablePainterKt.rememberDrawablePainter(cashtagDrawable2, gapComposer2), null, SizeKt.fillMaxWidth(companion, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer9, Painter.$stable | 25008, 104);
                                    GapComposer gapComposer10 = gapComposer9;
                                    gapComposer10.end(false);
                                    gapComposer3 = gapComposer10;
                                } else {
                                    i12 = i11;
                                    gapComposer2.startReplaceGroup(168781899);
                                    gapComposer2.end(false);
                                    gapComposer3 = gapComposer2;
                                }
                                CardTheme.Gradient gradient = cardTheme.gradient_style;
                                i13 = gradient == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gradient.ordinal()];
                                if (i13 == 1) {
                                    gapComposer3.startReplaceGroup(168915788);
                                    gapComposer3.end(false);
                                    Integer num2 = styledCardViewModel2.darkGradientOverride;
                                    valueOf = Integer.valueOf(num2 != null ? num2.intValue() : R.drawable.gradient_diagonal_dark);
                                } else if (i13 != 2) {
                                    gapComposer3.startReplaceGroup(169290918);
                                    gapComposer3.end(false);
                                    valueOf = null;
                                } else {
                                    gapComposer3.startReplaceGroup(169044779);
                                    Integer num3 = styledCardViewModel2.lightGradientOverride;
                                    int intValue3 = num3 != null ? num3.intValue() : ImageKt.isSystemInDarkTheme(gapComposer3) ? R.drawable.gradient_diagonal_light_dark_mode : R.drawable.gradient_diagonal_light;
                                    gapComposer3.end(false);
                                    valueOf = Integer.valueOf(intValue3);
                                }
                                if (valueOf == null) {
                                    gapComposer3.startReplaceGroup(169337542);
                                    gapComposer3.end(false);
                                    gapComposer4 = gapComposer3;
                                } else {
                                    gapComposer3.startReplaceGroup(169337543);
                                    GapComposer gapComposer11 = gapComposer3;
                                    ImageKt.Image(Countries.painterResource(valueOf.intValue(), 0, gapComposer3), null, ClipKt.clip(SizeKt.fillMaxWidth(companion, 1.0f), roundedCornerShape), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer11, Painter.$stable | 24624, 104);
                                    GapComposer gapComposer12 = gapComposer11;
                                    gapComposer12.end(false);
                                    gapComposer4 = gapComposer12;
                                }
                                if (styledCardViewModel2.showCustomization) {
                                    gapComposer4.startReplaceGroup(169621627);
                                    if (((Boolean) gapComposer4.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                                        gapComposer4.startReplaceGroup(169710938);
                                        resources2 = resources;
                                        i16 = i9;
                                        i17 = 256;
                                        boolean changedInstance = gapComposer4.changedInstance(styledCardViewModel2) | gapComposer4.changedInstance(resources2) | ((i16 & 896) == 256);
                                        Object rememberedValue13 = gapComposer4.rememberedValue();
                                        if (changedInstance || rememberedValue13 == obj2) {
                                            function17 = function16;
                                            rememberedValue13 = new StyledCardViewKt$StyledCard$2$1$4$1(styledCardViewModel2, resources2, function17, null);
                                            gapComposer4.updateRememberedValue(rememberedValue13);
                                        } else {
                                            function17 = function16;
                                        }
                                        mutableState2 = mutableState;
                                        mutableState2.setValue((AndroidImageBitmap) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, (Function2) rememberedValue13));
                                        z9 = false;
                                        gapComposer4.end(false);
                                    } else {
                                        function17 = function16;
                                        i16 = i9;
                                        resources2 = resources;
                                        mutableState2 = mutableState;
                                        i17 = 256;
                                        z9 = false;
                                        gapComposer4.startReplaceGroup(170096299);
                                        gapComposer4.end(false);
                                    }
                                    AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) mutableState2.getValue();
                                    if (androidImageBitmap == null) {
                                        gapComposer4.startReplaceGroup(170139357);
                                        gapComposer4.end(z9);
                                        function16 = function17;
                                        i14 = i16;
                                        i15 = i17;
                                        mutableState = mutableState2;
                                        z10 = z9;
                                    } else {
                                        gapComposer4.startReplaceGroup(170139358);
                                        Modifier clipCashtag = CanvasKt.clipCashtag(SizeKt.fillMaxWidth(companion, 1.0f), z12 ? cashtagDrawable2 : null);
                                        long Color = ColorKt.Color(i12);
                                        function16 = function17;
                                        mutableState = mutableState2;
                                        i14 = i16;
                                        i15 = 256;
                                        ImageKt.m176Image5hnEew(androidImageBitmap, null, clipCashtag, contentScale$Companion$Fit$1, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer4, 24624, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                        z10 = false;
                                        gapComposer4.end(false);
                                    }
                                    gapComposer4.end(z10);
                                } else {
                                    i14 = i9;
                                    resources2 = resources;
                                    i15 = 256;
                                    gapComposer4.startReplaceGroup(170498059);
                                    gapComposer4.end(false);
                                }
                                if (backgroundImage != CardTheme.BackgroundImage.TAP_DEVICE_TRIAL) {
                                    gapComposer4.startReplaceGroup(170584146);
                                    boolean changed6 = gapComposer4.changed(backgroundImage == null ? -1 : backgroundImage.ordinal());
                                    Object rememberedValue14 = gapComposer4.rememberedValue();
                                    if (changed6 || rememberedValue14 == obj2) {
                                        rememberedValue14 = new DrawablePainter(new ChipDrawable(context3, backgroundImage == CardTheme.BackgroundImage.TORTOISE, false));
                                        gapComposer4.updateRememberedValue(rememberedValue14);
                                    }
                                    GapComposer gapComposer13 = gapComposer4;
                                    ImageKt.Image((DrawablePainter) rememberedValue14, null, SizeKt.fillMaxSize(companion, 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer13, 440, 120);
                                    GapComposer gapComposer14 = gapComposer13;
                                    z7 = false;
                                    gapComposer14.end(false);
                                    gapComposer5 = gapComposer14;
                                } else {
                                    z7 = false;
                                    gapComposer4.startReplaceGroup(170977195);
                                    gapComposer4.end(false);
                                    gapComposer5 = gapComposer4;
                                }
                                gapComposer5.end(true);
                                CustomizationDetails customizationDetails = styledCardViewModel2.customizationDetails;
                                byte[] bArr = styledCardViewModel2.customizationOverrideBytes;
                                int i26 = i8;
                                int i27 = i7;
                                boolean changedInstance2 = gapComposer5.changedInstance(styledCardViewModel2) | gapComposer5.changed(i26) | gapComposer5.changed(i27) | gapComposer5.changedInstance(resources2);
                                if ((i14 & 896) == i15) {
                                    z7 = true;
                                }
                                z8 = changedInstance2 | z7;
                                rememberedValue = gapComposer5.rememberedValue();
                                if (!z8 || rememberedValue == obj2) {
                                    Object styledCardViewKt$StyledCard$2$2$1 = new StyledCardViewKt$StyledCard$2$2$1(styledCardViewModel2, i26, i27, resources2, function16, mutableState, null);
                                    gapComposer5.updateRememberedValue(styledCardViewKt$StyledCard$2$2$1);
                                    rememberedValue = styledCardViewKt$StyledCard$2$2$1;
                                }
                                Updater.LaunchedEffect(customizationDetails, bArr, (Function2) rememberedValue, gapComposer5);
                                gapComposer5.end(true);
                                f5 = f8;
                                z2 = z3;
                                f4 = f9;
                                function13 = function16;
                                modifier2 = modifier5;
                                gapComposer = gapComposer5;
                            }
                        }
                        if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
                            gapComposer7.startReplaceGroup(1806520540);
                            GlitterCardEffectKt.GlitterCardEffect(SizeKt.fillMaxSize(companion, 1.0f), null, true, gapComposer7, 390, 2);
                            z5 = false;
                            gapComposer7.end(false);
                            gapComposer6 = gapComposer7;
                        } else {
                            z5 = false;
                            if (z3 && backgroundImage == CardTheme.BackgroundImage.TORTOISE) {
                                gapComposer7.startReplaceGroup(1806524908);
                                TortoiseCardEffectKt.TortoiseBackground(6, 0, gapComposer7, SizeKt.fillMaxSize(companion, 1.0f));
                                gapComposer7.end(false);
                                gapComposer6 = gapComposer7;
                            } else if (z3 && cardTheme.id == CardTheme.Identifier.HOLO_ID) {
                                gapComposer7.startReplaceGroup(1806529384);
                                FlowsKt.HoloBackground(SizeKt.fillMaxSize(companion, 1.0f), gapComposer7, 6);
                                z5 = false;
                                gapComposer7.end(false);
                                gapComposer6 = gapComposer7;
                            } else {
                                gapComposer7.startReplaceGroup(167910396);
                                boolean changed7 = gapComposer7.changed(styledCardViewModel2);
                                Object rememberedValue15 = gapComposer7.rememberedValue();
                                if (changed7 || rememberedValue15 == obj2) {
                                    ArrayList arrayList = new ArrayList();
                                    CardTheme.BackgroundImage backgroundImage2 = cardTheme.background_image;
                                    switch (backgroundImage2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[backgroundImage2.ordinal()]) {
                                        case 1:
                                            context2 = context;
                                            Drawable drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_hood_by_air, null);
                                            drawableCompat.getClass();
                                            arrayList.add(drawableCompat);
                                            break;
                                        case 2:
                                            context2 = context;
                                            Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, R.drawable.card_hundred_thieves, null);
                                            drawableCompat2.getClass();
                                            arrayList.add(drawableCompat2);
                                            break;
                                        case 3:
                                            context2 = context;
                                            Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context2, R.drawable.card_metal_black, null);
                                            drawableCompat3.getClass();
                                            arrayList.add(drawableCompat3);
                                            break;
                                        case 4:
                                            context2 = context;
                                            Drawable drawableCompat4 = PlatformKt.getDrawableCompat(context2, R.drawable.card_oil_slick, null);
                                            drawableCompat4.getClass();
                                            arrayList.add(drawableCompat4);
                                            break;
                                        case 5:
                                            context2 = context;
                                            Drawable drawableCompat5 = PlatformKt.getDrawableCompat(context2, R.drawable.card_shantell_front_rounded, null);
                                            drawableCompat5.getClass();
                                            arrayList.add(drawableCompat5);
                                            break;
                                        case 6:
                                            context2 = context;
                                            Drawable drawableCompat6 = PlatformKt.getDrawableCompat(context2, R.drawable.tap_device, null);
                                            drawableCompat6.getClass();
                                            arrayList.add(drawableCompat6);
                                            break;
                                        case 7:
                                            context2 = context;
                                            Drawable drawableCompat7 = PlatformKt.getDrawableCompat(context2, R.drawable.styled_card_background, null);
                                            drawableCompat7.getClass();
                                            Drawable mutate = drawableCompat7.mutate();
                                            mutate.getClass();
                                            Integer safeParseColor3 = StringsKt.safeParseColor(cardTheme.card_color, new CardStudioViewKt$ThemedCard$1$4$1(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 21));
                                            safeParseColor3.getClass();
                                            mutate.setTint(safeParseColor3.intValue());
                                            arrayList.add(mutate);
                                            Drawable drawableCompat8 = PlatformKt.getDrawableCompat(context2, R.drawable.card_slimeguy_background, null);
                                            drawableCompat8.getClass();
                                            arrayList.add(drawableCompat8);
                                            break;
                                        case 8:
                                            context2 = context;
                                            Drawable drawableCompat9 = PlatformKt.getDrawableCompat(context2, R.drawable.card_dream, null);
                                            drawableCompat9.getClass();
                                            arrayList.add(drawableCompat9);
                                            break;
                                        case 9:
                                            context2 = context;
                                            Drawable drawableCompat10 = PlatformKt.getDrawableCompat(context2, R.drawable.card_mood, null);
                                            drawableCompat10.getClass();
                                            arrayList.add(drawableCompat10);
                                            break;
                                        case 10:
                                            context2 = context;
                                            Drawable drawableCompat11 = PlatformKt.getDrawableCompat(context2, R.drawable.card_tortoise_background, null);
                                            drawableCompat11.getClass();
                                            arrayList.add(new ImageDrawable(drawableCompat11, 2));
                                            arrayList.add(new ColorDrawable(CardsKt.TORTOISE_OVERLAY));
                                            break;
                                        case 11:
                                            context2 = context;
                                            Drawable drawableCompat12 = PlatformKt.getDrawableCompat(context2, R.drawable.card_brat, null);
                                            drawableCompat12.getClass();
                                            arrayList.add(drawableCompat12);
                                            break;
                                        default:
                                            if (cardTheme.id == CardTheme.Identifier.HOLO_ID) {
                                                context2 = context;
                                                Drawable drawableCompat13 = PlatformKt.getDrawableCompat(context2, R.drawable.card_holo, null);
                                                drawableCompat13.getClass();
                                                arrayList.add(drawableCompat13);
                                                break;
                                            } else {
                                                context2 = context;
                                                Drawable drawableCompat14 = PlatformKt.getDrawableCompat(context2, R.drawable.styled_card_background, null);
                                                drawableCompat14.getClass();
                                                Drawable mutate2 = drawableCompat14.mutate();
                                                mutate2.getClass();
                                                Integer safeParseColor4 = StringsKt.safeParseColor(cardTheme.card_color, new CardStudioViewKt$ThemedCard$1$4$1(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 22));
                                                safeParseColor4.getClass();
                                                int intValue4 = safeParseColor4.intValue();
                                                if (styledCardViewModel2.shouldAlterCardTint) {
                                                    CardTheme.Identifier identifier = cardTheme.id;
                                                    if (identifier == CardTheme.Identifier.WHITE) {
                                                        float[] fArr = new float[3];
                                                        Color.colorToHSV(intValue4, fArr);
                                                        float f10 = fArr[2] - 0.1f;
                                                        if (f10 >= RecyclerView.DECELERATION_RATE) {
                                                            fArr[2] = f10;
                                                            intValue4 = Color.HSVToColor(fArr);
                                                        }
                                                    } else if (identifier == CardTheme.Identifier.BLACK) {
                                                        intValue4 = ColorsKt.lighten(intValue4);
                                                    }
                                                }
                                                mutate2.setTint(intValue4);
                                                arrayList.add(mutate2);
                                                break;
                                            }
                                    }
                                    rememberedValue15 = new DrawablePainter(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
                                    gapComposer7.updateRememberedValue(rememberedValue15);
                                } else {
                                    context2 = context;
                                }
                                contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                                context3 = context2;
                                ImageKt.Image((DrawablePainter) rememberedValue15, null, ClipKt.clip(SizeKt.fillMaxWidth(companion, 1.0f), roundedCornerShape), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer7, 24632, 104);
                                GapComposer gapComposer15 = gapComposer7;
                                z6 = false;
                                gapComposer15.end(false);
                                gapComposer2 = gapComposer15;
                                String str72 = str;
                                changed = gapComposer2.changed(str72);
                                Object rememberedValue122 = gapComposer2.rememberedValue();
                                if (changed) {
                                }
                                CashtagDrawable cashtagDrawable3 = new CashtagDrawable(context3, str72, z6);
                                i11 = i10;
                                cashtagDrawable3.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP));
                                cashtagDrawable3.textPaint.setTypeface(CardsKt.typeface(cardTheme.font, context3));
                                gapComposer2.updateRememberedValue(cashtagDrawable3);
                                obj3 = cashtagDrawable3;
                                CashtagDrawable cashtagDrawable22 = (CashtagDrawable) obj3;
                                if (z12) {
                                }
                                CardTheme.Gradient gradient2 = cardTheme.gradient_style;
                                if (gradient2 == null) {
                                }
                                if (i13 == 1) {
                                }
                                if (valueOf == null) {
                                }
                                if (styledCardViewModel2.showCustomization) {
                                }
                                if (backgroundImage != CardTheme.BackgroundImage.TAP_DEVICE_TRIAL) {
                                }
                                gapComposer5.end(true);
                                CustomizationDetails customizationDetails2 = styledCardViewModel2.customizationDetails;
                                byte[] bArr2 = styledCardViewModel2.customizationOverrideBytes;
                                int i262 = i8;
                                int i272 = i7;
                                boolean changedInstance22 = gapComposer5.changedInstance(styledCardViewModel2) | gapComposer5.changed(i262) | gapComposer5.changed(i272) | gapComposer5.changedInstance(resources2);
                                if ((i14 & 896) == i15) {
                                }
                                z8 = changedInstance22 | z7;
                                rememberedValue = gapComposer5.rememberedValue();
                                if (!z8) {
                                }
                                Object styledCardViewKt$StyledCard$2$2$12 = new StyledCardViewKt$StyledCard$2$2$1(styledCardViewModel2, i262, i272, resources2, function16, mutableState, null);
                                gapComposer5.updateRememberedValue(styledCardViewKt$StyledCard$2$2$12);
                                rememberedValue = styledCardViewKt$StyledCard$2$2$12;
                                Updater.LaunchedEffect(customizationDetails2, bArr2, (Function2) rememberedValue, gapComposer5);
                                gapComposer5.end(true);
                                f5 = f8;
                                z2 = z3;
                                f4 = f9;
                                function13 = function16;
                                modifier2 = modifier5;
                                gapComposer = gapComposer5;
                            }
                        }
                        z6 = z5;
                        context3 = context;
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                        gapComposer2 = gapComposer6;
                        String str722 = str;
                        changed = gapComposer2.changed(str722);
                        Object rememberedValue1222 = gapComposer2.rememberedValue();
                        if (changed) {
                        }
                        CashtagDrawable cashtagDrawable32 = new CashtagDrawable(context3, str722, z6);
                        i11 = i10;
                        cashtagDrawable32.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP));
                        cashtagDrawable32.textPaint.setTypeface(CardsKt.typeface(cardTheme.font, context3));
                        gapComposer2.updateRememberedValue(cashtagDrawable32);
                        obj3 = cashtagDrawable32;
                        CashtagDrawable cashtagDrawable222 = (CashtagDrawable) obj3;
                        if (z12) {
                        }
                        CardTheme.Gradient gradient22 = cardTheme.gradient_style;
                        if (gradient22 == null) {
                        }
                        if (i13 == 1) {
                        }
                        if (valueOf == null) {
                        }
                        if (styledCardViewModel2.showCustomization) {
                        }
                        if (backgroundImage != CardTheme.BackgroundImage.TAP_DEVICE_TRIAL) {
                        }
                        gapComposer5.end(true);
                        CustomizationDetails customizationDetails22 = styledCardViewModel2.customizationDetails;
                        byte[] bArr22 = styledCardViewModel2.customizationOverrideBytes;
                        int i2622 = i8;
                        int i2722 = i7;
                        boolean changedInstance222 = gapComposer5.changedInstance(styledCardViewModel2) | gapComposer5.changed(i2622) | gapComposer5.changed(i2722) | gapComposer5.changedInstance(resources2);
                        if ((i14 & 896) == i15) {
                        }
                        z8 = changedInstance222 | z7;
                        rememberedValue = gapComposer5.rememberedValue();
                        if (!z8) {
                        }
                        Object styledCardViewKt$StyledCard$2$2$122 = new StyledCardViewKt$StyledCard$2$2$1(styledCardViewModel2, i2622, i2722, resources2, function16, mutableState, null);
                        gapComposer5.updateRememberedValue(styledCardViewKt$StyledCard$2$2$122);
                        rememberedValue = styledCardViewKt$StyledCard$2$2$122;
                        Updater.LaunchedEffect(customizationDetails22, bArr22, (Function2) rememberedValue, gapComposer5);
                        gapComposer5.end(true);
                        f5 = f8;
                        z2 = z3;
                        f4 = f9;
                        function13 = function16;
                        modifier2 = modifier5;
                        gapComposer = gapComposer5;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.StyledCardViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                StyledCardViewKt.m3439StyledCardnSlTg7c(StyledCardViewModel.this, modifier2, function13, f4, f5, z2, (Composer) obj6, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                f3 = f2;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                if (gapComposer7.shouldExecute(i20 & 1, (i20 & 74899) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            if ((i & 3072) == 0) {
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            f3 = f2;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            if (gapComposer7.shouldExecute(i20 & 1, (i20 & 74899) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function12 = function1;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        f3 = f2;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        if (gapComposer7.shouldExecute(i20 & 1, (i20 & 74899) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void access$clipCard(CardTheme.CardCustomizationMargin cardCustomizationMargin, Bitmap bitmap, Resources resources) {
        float width = bitmap.getWidth();
        Float f = cardCustomizationMargin.size;
        f.getClass();
        float floatValue = f.floatValue() * width;
        CanvasKt.clipCard(bitmap, floatValue, Math.max((ResourcesCompat.getFloat(resources, R.dimen.card_corner_radius_ratio) * bitmap.getWidth()) - floatValue, ResourcesCompat.getFloat(resources, R.dimen.card_corner_radius_min)));
    }
}
