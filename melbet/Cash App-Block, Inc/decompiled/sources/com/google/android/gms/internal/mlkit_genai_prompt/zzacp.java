package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.AnimationResult;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.request.ImageRequest;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class zzacp {
    public static final void ImageMessageUi(Modifier modifier, MessageViewModel.ImageMessageViewModel imageMessageViewModel, Composer composer, int i) {
        Modifier modifier2;
        imageMessageViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(731762371);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(imageMessageViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.subtle;
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("pending", gapComposer, 0), 1.0f, 0.4f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(800, 0, EasingKt.LinearEasing, 2), RepeatMode.Reverse, 4), "alpha", gapComposer, 29112, 0);
            String str = imageMessageViewModel.imageUrl;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (!((Boolean) mutableState.getValue()).booleanValue() || str == null) {
                gapComposer.startReplaceGroup(-1320358817);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1320447229);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda2(26, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                zzaco.FullscreenImageViewer(48, gapComposer, str, (Function0) rememberedValue2);
                gapComposer.end(false);
            }
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            if (str == null) {
                gapComposer.startReplaceGroup(-1798072441);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m287sizeVpY3zN4(modifier2, 272.0f, 160.0f), m340RoundedCornerShape0680j_4), j, ColorKt.RectangleShape), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1797666093);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
                builder.data = str;
                ImageRequest build = builder.build();
                ColorPainter colorPainter = new ColorPainter(j);
                ColorPainter colorPainter2 = new ColorPainter(j);
                Modifier alpha = AlphaKt.alpha(ClipKt.clip(SizeKt.m278heightInVpY3zN4(SizeKt.m292widthInVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, 272.0f, 1), 160.0f, 320.0f), m340RoundedCornerShape0680j_4), imageMessageViewModel.isPending ? ((Number) animateFloat.value$delegate.getValue()).floatValue() : 1.0f);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda2(27, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                AsyncImageKt.m1442AsyncImagex1rPTaM(build, ImageKt.m183clickableoSLSa3U$default(alpha, false, null, null, (Function0) rememberedValue3, 15), colorPainter, colorPainter2, null, null, ContentScale.Companion.FillWidth, gapComposer, 36912, 6, 31712);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(modifier2, imageMessageViewModel, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: InlineIconText-QqsJerU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2014InlineIconTextQqsJerU(final CharSequence charSequence, final Painter painter, Modifier modifier, long j, InlineIconPosition inlineIconPosition, TextStyle textStyle, long j2, Function1 function1, int i, int i2, int i3, int i4, boolean z, float f, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        long j3;
        int i10;
        TextStyle textStyle2;
        int i11;
        final long j4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final int i17;
        final boolean z2;
        final float f2;
        final TextStyle textStyle3;
        final Modifier modifier3;
        final long j5;
        GapComposer gapComposer;
        final InlineIconPosition inlineIconPosition2;
        final Function1 function12;
        final int i18;
        final int i19;
        final int i20;
        RecomposeScopeImpl endRestartGroup;
        InlineIconPosition inlineIconPosition3;
        int i21;
        int i22;
        Modifier modifier4;
        Function1 function13;
        TextStyle textStyle4;
        int i23;
        int i24;
        int i25;
        boolean z3;
        float f3;
        int i26;
        int i27;
        boolean z4;
        int i28;
        int i29;
        charSequence.getClass();
        painter.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1667626653);
        if ((i5 & 6) == 0) {
            i8 = (gapComposer2.changedInstance(charSequence) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= (i5 & 64) == 0 ? gapComposer2.changed(painter) : gapComposer2.changedInstance(painter) ? 32 : 16;
        }
        int i30 = i7 & 4;
        if (i30 != 0) {
            i8 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i8 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                j3 = j;
                i8 |= gapComposer2.changed(j3) ? 2048 : 1024;
                i10 = i7 & 16;
                int i31 = PKIFailureInfo.certRevoked;
                if (i10 != 0) {
                    i8 |= 24576;
                } else if ((i5 & 24576) == 0) {
                    i8 |= gapComposer2.changed(inlineIconPosition == null ? -1 : inlineIconPosition.ordinal()) ? 16384 : 8192;
                }
                if ((196608 & i5) == 0) {
                    if ((i7 & 32) == 0) {
                        textStyle2 = textStyle;
                        if (gapComposer2.changed(textStyle2)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                            i8 |= i29;
                        }
                    } else {
                        textStyle2 = textStyle;
                    }
                    i29 = 65536;
                    i8 |= i29;
                } else {
                    textStyle2 = textStyle;
                }
                i11 = i7 & 64;
                if (i11 != 0) {
                    i8 |= 1572864;
                    j4 = j2;
                } else {
                    j4 = j2;
                    if ((i5 & 1572864) == 0) {
                        i8 |= gapComposer2.changed(j4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                i12 = i8 | 113246208;
                i13 = i7 & 512;
                if (i13 != 0) {
                    i12 = i8 | 918552576;
                } else if ((i5 & 805306368) == 0) {
                    i12 |= gapComposer2.changed(i2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    int i32 = i6 | 6;
                    if ((i7 & 2048) == 0 && gapComposer2.changed(i4)) {
                        i14 = 32;
                        int i33 = i32 | i14;
                        int i34 = i33 | 3456;
                        i15 = i7 & 16384;
                        if (i15 == 0) {
                            i16 = i33 | 28032;
                        } else if ((i6 & 24576) == 0) {
                            if (gapComposer2.changed(f)) {
                                i31 = 16384;
                            }
                            i16 = i34 | i31;
                        } else {
                            i16 = i34;
                        }
                        if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                            gapComposer2.skipToGroupEnd();
                            i17 = i;
                            z2 = z;
                            f2 = f;
                            textStyle3 = textStyle2;
                            modifier3 = modifier2;
                            j5 = j3;
                            gapComposer = gapComposer2;
                            inlineIconPosition2 = inlineIconPosition;
                            function12 = function1;
                            i18 = i2;
                            i19 = i3;
                            i20 = i4;
                        } else {
                            gapComposer2.startDefaults();
                            if ((i5 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                Modifier modifier5 = i30 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                if (i9 != 0) {
                                    j3 = Color.Unspecified;
                                }
                                inlineIconPosition3 = i10 != 0 ? InlineIconPosition.END : inlineIconPosition;
                                if ((i7 & 32) != 0) {
                                    textStyle2 = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                                    if (textStyle2 == null) {
                                        gapComposer2.startReplaceGroup(-1100573765);
                                        textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        z4 = 0;
                                    } else {
                                        z4 = 0;
                                        gapComposer2.startReplaceGroup(-1100574912);
                                    }
                                    gapComposer2.end(z4);
                                    i12 &= -458753;
                                    i21 = z4;
                                } else {
                                    i21 = 0;
                                }
                                if (i11 != 0) {
                                    j4 = Color.Unspecified;
                                }
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(13);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Function1 function14 = (Function1) rememberedValue;
                                int i35 = i13 != 0 ? Integer.MAX_VALUE : i2;
                                if ((i7 & 2048) != 0) {
                                    i16 &= -113;
                                    i22 = i21;
                                } else {
                                    i22 = i4;
                                }
                                if (i15 != 0) {
                                    function13 = function14;
                                    textStyle4 = textStyle2;
                                    i23 = i35;
                                    f3 = 4.0f;
                                    i24 = i12;
                                    z3 = true;
                                    i26 = i16;
                                    modifier4 = modifier5;
                                    i27 = 2;
                                    i25 = 1;
                                    i28 = i22;
                                } else {
                                    modifier4 = modifier5;
                                    function13 = function14;
                                    textStyle4 = textStyle2;
                                    i23 = i35;
                                    i24 = i12;
                                    i25 = 1;
                                    z3 = true;
                                    f3 = f;
                                    i26 = i16;
                                    i27 = 2;
                                    i28 = i22;
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                                if ((i7 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i7 & 2048) != 0) {
                                    i16 &= -113;
                                }
                                inlineIconPosition3 = inlineIconPosition;
                                function13 = function1;
                                i25 = i3;
                                f3 = f;
                                i26 = i16;
                                textStyle4 = textStyle2;
                                modifier4 = modifier2;
                                i24 = i12;
                                i27 = i;
                                i23 = i2;
                                i28 = i4;
                                z3 = z;
                            }
                            gapComposer2.endDefaults();
                            ProvidableCompositionLocal providableCompositionLocal = CompositionLocalsKt.LocalDensity;
                            int i36 = i27;
                            int i37 = i25;
                            final float f4 = f3;
                            long pack = Room.pack(4294967296L, (16.0f + f3) / ((Density) gapComposer2.consume(providableCompositionLocal)).getFontScale());
                            long pack2 = Room.pack(4294967296L, 16.0f / ((Density) gapComposer2.consume(providableCompositionLocal)).getFontScale());
                            AnnotatedString.Builder builder = new AnnotatedString.Builder();
                            int ordinal = inlineIconPosition3.ordinal();
                            if (ordinal == 0) {
                                KeyMappingKt.appendInlineContent(builder, "icon", "�");
                                builder.append(charSequence);
                            } else if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            } else {
                                builder.append(charSequence);
                                KeyMappingKt.appendInlineContent(builder, "icon", "�");
                            }
                            final InlineIconPosition inlineIconPosition4 = inlineIconPosition3;
                            final long j6 = j3;
                            int i38 = i24 >> 9;
                            long j7 = j4;
                            int i39 = i28;
                            Room.m1164Text25TpFw(i36, i23, i37, i39, ((i24 >> 3) & 112) | (i38 & 896) | (i38 & 7168) | (57344 & i38) | (458752 & i38) | (i38 & 3670016) | 12582912 | ((i26 << 21) & 234881024) | 805306368, 6, 0, j7, gapComposer2, modifier4, builder.toAnnotatedString(), textStyle4, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("icon", new InlineTextContent(new Placeholder(4, pack, pack2), Expect_jvmKt.rememberComposableLambda(168535615, new Function3() { // from class: com.squareup.cash.arcade.components.text.InlineIconTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Modifier m302paddingqDBjuR0$default;
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((String) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        int ordinal2 = InlineIconPosition.this.ordinal();
                                        float f5 = f4;
                                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                        if (ordinal2 == 0) {
                                            m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f5, RecyclerView.DECELERATION_RATE, 11);
                                        } else {
                                            if (ordinal2 != 1) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, f5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                                        }
                                        Trace.m1190Iconww6aTOc(painter, (String) null, SizeKt.m285size3ABfNKs(m302paddingqDBjuR0$default, 16.0f), j6, gapComposer3, Painter.$stable | 48, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2)))), function13, z3);
                            i17 = i36;
                            gapComposer = gapComposer2;
                            modifier3 = modifier4;
                            function12 = function13;
                            z2 = z3;
                            f2 = f4;
                            j5 = j6;
                            i20 = i39;
                            j4 = j7;
                            i18 = i23;
                            i19 = i37;
                            textStyle3 = textStyle4;
                            inlineIconPosition2 = inlineIconPosition4;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.text.InlineIconTextKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i5 | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i6);
                                    zzacp.m2014InlineIconTextQqsJerU(charSequence, painter, modifier3, j5, inlineIconPosition2, textStyle3, j4, function12, i17, i18, i19, i20, z2, f2, (Composer) obj, updateChangedFlags, updateChangedFlags2, i7);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i14 = 16;
                    int i332 = i32 | i14;
                    int i342 = i332 | 3456;
                    i15 = i7 & 16384;
                    if (i15 == 0) {
                    }
                    if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                int i322 = i6 | 6;
                if ((i7 & 2048) == 0) {
                    i14 = 32;
                    int i3322 = i322 | i14;
                    int i3422 = i3322 | 3456;
                    i15 = i7 & 16384;
                    if (i15 == 0) {
                    }
                    if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i14 = 16;
                int i33222 = i322 | i14;
                int i34222 = i33222 | 3456;
                i15 = i7 & 16384;
                if (i15 == 0) {
                }
                if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j3 = j;
            i10 = i7 & 16;
            int i312 = PKIFailureInfo.certRevoked;
            if (i10 != 0) {
            }
            if ((196608 & i5) == 0) {
            }
            i11 = i7 & 64;
            if (i11 != 0) {
            }
            i12 = i8 | 113246208;
            i13 = i7 & 512;
            if (i13 != 0) {
            }
            int i3222 = i6 | 6;
            if ((i7 & 2048) == 0) {
            }
            i14 = 16;
            int i332222 = i3222 | i14;
            int i342222 = i332222 | 3456;
            i15 = i7 & 16384;
            if (i15 == 0) {
            }
            if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        j3 = j;
        i10 = i7 & 16;
        int i3122 = PKIFailureInfo.certRevoked;
        if (i10 != 0) {
        }
        if ((196608 & i5) == 0) {
        }
        i11 = i7 & 64;
        if (i11 != 0) {
        }
        i12 = i8 | 113246208;
        i13 = i7 & 512;
        if (i13 != 0) {
        }
        int i32222 = i6 | 6;
        if ((i7 & 2048) == 0) {
        }
        i14 = 16;
        int i3322222 = i32222 | i14;
        int i3422222 = i3322222 | 3456;
        i15 = i7 & 16384;
        if (i15 == 0) {
        }
        if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$animateDecay(ScrollScope scrollScope, float f, AnimationState animationState, DecayAnimationSpecImpl decayAnimationSpecImpl, Function1 function1, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        int i;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) continuationImpl;
            int i2 = snapFlingBehaviorKt$animateDecay$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = snapFlingBehaviorKt$animateDecay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehaviorKt$animateDecay$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    boolean z = ((Number) animationState.getVelocity()).floatValue() == RecyclerView.DECELERATION_RATE;
                    SnapFlingBehaviorKt$$ExternalSyntheticLambda0 snapFlingBehaviorKt$$ExternalSyntheticLambda0 = new SnapFlingBehaviorKt$$ExternalSyntheticLambda0(f, ref$FloatRef2, scrollScope, function1, 0);
                    snapFlingBehaviorKt$animateDecay$1.L$0 = animationState;
                    snapFlingBehaviorKt$animateDecay$1.L$1 = ref$FloatRef2;
                    snapFlingBehaviorKt$animateDecay$1.F$0 = f;
                    snapFlingBehaviorKt$animateDecay$1.label = 1;
                    if (AnimatableKt.animateDecay(animationState, decayAnimationSpecImpl, !z, snapFlingBehaviorKt$$ExternalSyntheticLambda0, snapFlingBehaviorKt$animateDecay$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f2 = f;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = snapFlingBehaviorKt$animateDecay$1.F$0;
                    ref$FloatRef = snapFlingBehaviorKt$animateDecay$1.L$1;
                    animationState = snapFlingBehaviorKt$animateDecay$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new AnimationResult(new Float(f2 - ref$FloatRef.element), animationState);
            }
        }
        snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuationImpl);
        Object obj2 = snapFlingBehaviorKt$animateDecay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehaviorKt$animateDecay$1.label;
        if (i != 0) {
        }
        return new AnimationResult(new Float(f2 - ref$FloatRef.element), animationState);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$animateWithTarget(ScrollScope scrollScope, float f, float f2, AnimationState animationState, AnimationSpec animationSpec, Function1 function1, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        int i;
        float floatValue;
        AnimationState animationState2;
        Ref$FloatRef ref$FloatRef;
        float f3 = f;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) continuationImpl;
            int i2 = snapFlingBehaviorKt$animateWithTarget$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.label = i2 - PKIFailureInfo.systemUnavail;
                SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$12 = snapFlingBehaviorKt$animateWithTarget$1;
                Object obj = snapFlingBehaviorKt$animateWithTarget$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehaviorKt$animateWithTarget$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    floatValue = ((Number) animationState.getVelocity()).floatValue();
                    Float f4 = new Float(f3);
                    boolean z = ((Number) animationState.getVelocity()).floatValue() == RecyclerView.DECELERATION_RATE;
                    SnapFlingBehaviorKt$$ExternalSyntheticLambda0 snapFlingBehaviorKt$$ExternalSyntheticLambda0 = new SnapFlingBehaviorKt$$ExternalSyntheticLambda0(f2, ref$FloatRef2, scrollScope, function1, 1);
                    snapFlingBehaviorKt$animateWithTarget$12.L$0 = animationState;
                    snapFlingBehaviorKt$animateWithTarget$12.L$1 = ref$FloatRef2;
                    snapFlingBehaviorKt$animateWithTarget$12.F$0 = f3;
                    snapFlingBehaviorKt$animateWithTarget$12.F$1 = floatValue;
                    snapFlingBehaviorKt$animateWithTarget$12.label = 1;
                    if (AnimatableKt.animateTo(animationState, f4, animationSpec, !z, snapFlingBehaviorKt$$ExternalSyntheticLambda0, snapFlingBehaviorKt$animateWithTarget$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    animationState2 = animationState;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = snapFlingBehaviorKt$animateWithTarget$12.F$1;
                    float f6 = snapFlingBehaviorKt$animateWithTarget$12.F$0;
                    ref$FloatRef = snapFlingBehaviorKt$animateWithTarget$12.L$1;
                    animationState2 = snapFlingBehaviorKt$animateWithTarget$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    floatValue = f5;
                    f3 = f6;
                }
                return new AnimationResult(new Float(f3 - ref$FloatRef.element), AnimatableKt.copy$default(animationState2, RecyclerView.DECELERATION_RATE, coerceToTarget(((Number) animationState2.getVelocity()).floatValue(), floatValue), 29));
            }
        }
        snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuationImpl);
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$122 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj2 = snapFlingBehaviorKt$animateWithTarget$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehaviorKt$animateWithTarget$122.label;
        if (i != 0) {
        }
        return new AnimationResult(new Float(f3 - ref$FloatRef.element), AnimatableKt.copy$default(animationState2, RecyclerView.DECELERATION_RATE, coerceToTarget(((Number) animationState2.getVelocity()).floatValue(), floatValue), 29));
    }

    public static final void animateDecay$consumeDelta(AnimationScope animationScope, ScrollScope scrollScope, Function1 function1, float f) {
        float f2;
        try {
            f2 = scrollScope.scrollBy(f);
        } catch (CancellationException unused) {
            animationScope.cancelAnimation();
            f2 = RecyclerView.DECELERATION_RATE;
        }
        function1.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    public static final float coerceToTarget(float f, float f2) {
        return f2 == RecyclerView.DECELERATION_RATE ? RecyclerView.DECELERATION_RATE : (f2 <= RecyclerView.DECELERATION_RATE ? f >= f2 : f <= f2) ? f : f2;
    }
}
