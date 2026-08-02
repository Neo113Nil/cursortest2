package com.squareup.cash.marketing.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageImage$Animated$Asset$Url;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda15;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$ImageHeader$1$1;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$ImageHeader$lottieComposition$2$1;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public abstract class MarketingCompactCardKt {
    public static final void AppMessageImageView(AppMessageImage appMessageImage, String str, Function1 function1, Modifier modifier, ContentScale contentScale, Composer composer, int i) {
        int i2;
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1842246006);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(appMessageImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(contentScale) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            boolean z3 = appMessageImage instanceof AppMessageImage.Animated;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            int i3 = 6;
            if (z3) {
                gapComposer.startReplaceGroup(-1258271777);
                AppMessageImage$Animated$Asset$Url image = ((AppMessageImage.Animated) appMessageImage).getImage();
                if (!(image instanceof AppMessageImage$Animated$Asset$Url)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -871873133, false);
                }
                gapComposer.startReplaceGroup(-1258043586);
                String urlForTheme = ThemablesKt.urlForTheme(image.asset, gapComposer);
                boolean changed = gapComposer.changed(urlForTheme);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = LottieCompositionSpec.Url.m1531boximpl(LottieCompositionSpec.Url.m1532constructorimpl(urlForTheme));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                String m1537unboximpl = ((LottieCompositionSpec.Url) rememberedValue).m1537unboximpl();
                gapComposer.end(false);
                LottieCompositionSpec.Url m1531boximpl = LottieCompositionSpec.Url.m1531boximpl(m1537unboximpl);
                int i4 = i2 & 896;
                boolean z4 = i4 == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new InlineAppMessageKt$ImageHeader$lottieComposition$2$1(function1, null, 1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(m1531boximpl, null, null, null, null, (Function3) rememberedValue2, gapComposer, 0, 30);
                if (((LottieComposition) rememberLottieComposition.getValue()) != null) {
                    gapComposer.startReplaceGroup(-1257656117);
                    LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
                    boolean z5 = ((i2 & 112) == 32) | (i4 == 256);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new InlineAppMessageKt$ImageHeader$1$1(function1, str, null, 1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer, lottieComposition, (Function2) rememberedValue3);
                    z2 = false;
                    gapComposer.end(false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1257551368);
                    gapComposer.end(false);
                }
                LottieAnimationKt.LottieAnimation((LottieComposition) rememberLottieComposition.getValue(), clip, false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, contentScale, false, false, null, false, null, gapComposer, 1572864, (i2 << 6) & 3670016, 0, 4128700);
                gapComposer = gapComposer;
                gapComposer.end(z2);
            } else {
                if (!(appMessageImage instanceof AppMessageImage.Static)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -871874135, false);
                }
                gapComposer.startReplaceGroup(-1257306871);
                String urlForTheme2 = ThemablesKt.urlForTheme(((AppMessageImage.Static) appMessageImage).getImage(), gapComposer);
                int i5 = i2 & 896;
                boolean z6 = ((i2 & 112) == 32) | (i5 == 256);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z6 || rememberedValue4 == neverEqualPolicy) {
                    z = true;
                    rememberedValue4 = new InlineAppMessageKt$$ExternalSyntheticLambda15(function1, str, 1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    z = true;
                }
                Function1 function12 = (Function1) rememberedValue4;
                boolean z7 = i5 == 256 ? z : false;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z7 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(i3, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                ImageKt.Image(AsyncImageKt.m1450rememberAsyncImagePainterMqRF_0(urlForTheme2, null, function12, (Function1) rememberedValue5, gapComposer, 0, 414), null, clip, null, contentScale, RecyclerView.DECELERATION_RATE, null, gapComposer, (i2 & 57344) | 48, 104);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(appMessageImage, str, function1, modifier, contentScale, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: MarketingCompactCard-_trzp-w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3599MarketingCompactCard_trzpw(Modifier modifier, final CardAppMessageViewModel.Ready ready, Function1 function1, Color color, ContentScale contentScale, Function1 function12, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        GapComposer gapComposer;
        Color color2;
        ContentScale contentScale2;
        Function1 function13;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Function1 function14;
        Modifier modifier4;
        boolean z;
        boolean z2;
        boolean z3;
        ContentScale contentScale3;
        Color color3;
        boolean z4;
        GapComposer gapComposer2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        RowScopeInstance rowScopeInstance;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Color color4;
        ContentScale contentScale4;
        int i6;
        boolean z5;
        float f;
        int i7;
        CardAppMessageViewModel.Ready ready2;
        int i8;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function15;
        GapComposer gapComposer3;
        BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
        AppMessageImage appMessageImage = ready.image;
        String str = ready.subtitle;
        BiasAlignment.Vertical vertical2 = Alignment.Companion.Top;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-32013590);
        Applier applier = gapComposer4.applier;
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer4.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer4.changedInstance(ready) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer4.changedInstance(function1) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer4.changed(color) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= gapComposer4.changed(contentScale) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= gapComposer4.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer4.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i9 != 0) {
                        modifier2 = companion;
                    }
                    Unit unit = null;
                    Color color5 = i10 != 0 ? null : color;
                    ContentScale contentScale5 = i4 != 0 ? ContentScale.Companion.FillBounds : contentScale;
                    Function1 function16 = i5 != 0 ? null : function12;
                    StringUtilsKt stringUtilsKt = ready.actions;
                    Actions$One actions$One = stringUtilsKt instanceof Actions$One ? (Actions$One) stringUtilsKt : null;
                    Action action = actions$One != null ? actions$One.action : null;
                    Color color6 = color5;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
                    Strings.getSizes(gapComposer4).getClass();
                    KeysetHandle keysetHandle = DefaultSizes.border;
                    Function1 function17 = function16;
                    Object obj = keysetHandle.annotationsMap;
                    Modifier modifier5 = modifier2;
                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer4).semantic.border.subtle);
                    Strings.getSizes(gapComposer4).getClass();
                    Object obj2 = keysetHandle.entries;
                    Modifier m179borderziNgDLE = ImageKt.m179borderziNgDLE(fillMaxWidth, 1.0f, solidColor, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    Strings.getSizes(gapComposer4).getClass();
                    Object obj3 = keysetHandle.entries;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m179borderziNgDLE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer4).semantic.background.f1047app, ColorKt.RectangleShape);
                    boolean changedInstance = gapComposer4.changedInstance(action) | ((i3 & 896) == 256);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(24, action, function1);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m177backgroundbw27NRU, false, null, null, (Function0) rememberedValue, 15);
                    Strings.getSizes(gapComposer4).getClass();
                    zzc zzcVar = DefaultSizes.spacing;
                    zzcVar.getClass();
                    Strings.getSizes(gapComposer4).getClass();
                    zzcVar.getClass();
                    Strings.getSizes(gapComposer4).getClass();
                    zzcVar.getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m183clickableoSLSa3U$default, 20.0f, 16.0f, 16.0f, 16.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m301paddingqDBjuR0);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$15);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$16);
                    if (function17 != null) {
                        gapComposer4.startReplaceGroup(-1092672509);
                        int i11 = i3;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                        final Action action2 = action;
                        int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, companion);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$16);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical2, gapComposer4, 48);
                        int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, rowMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$16);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        Modifier weight = rowScopeInstance2.weight(1.0f, companion, true);
                        Strings.getSizes(gapComposer4).getClass();
                        zzcVar.getClass();
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(weight, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                        int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$16);
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                        final int i12 = 0;
                        Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer4).labelMedium), Expect_jvmKt.rememberComposableLambda(2125834203, new Function2() { // from class: com.squareup.cash.marketing.components.MarketingCompactCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i13 = i12;
                                CardAppMessageViewModel.Ready ready3 = ready;
                                switch (i13) {
                                    case 0:
                                        Composer composer2 = (Composer) obj4;
                                        int intValue = ((Integer) obj5).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ready3.title, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue2 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer3;
                                        if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ready3.title, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), gapComposer4, 56);
                        if (str == null) {
                            gapComposer4.startReplaceGroup(1606621524);
                            gapComposer4.end(false);
                            z4 = false;
                        } else {
                            gapComposer4.startReplaceGroup(1606621525);
                            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer4).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer4).semantic.text.subtle, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(40718685, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 9), gapComposer4), gapComposer4, 56);
                            z4 = false;
                            gapComposer4.end(false);
                        }
                        gapComposer4.end(true);
                        if (appMessageImage == null) {
                            gapComposer4.startReplaceGroup(-1504409174);
                            gapComposer4.end(z4);
                            contentScale4 = contentScale5;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                            gapComposer2 = gapComposer4;
                            rowScopeInstance = rowScopeInstance2;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                            color4 = color6;
                        } else {
                            gapComposer4.startReplaceGroup(-1504409173);
                            gapComposer2 = gapComposer4;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                            rowScopeInstance = rowScopeInstance2;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                            m3600MarketingCompactCardImagexqIIw2o(appMessageImage, ready.messageToken, function1, color6, contentScale5, gapComposer2, i11 & 65408);
                            color4 = color6;
                            contentScale4 = contentScale5;
                            gapComposer2.end(z4);
                        }
                        gapComposer2.end(true);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        Strings.getSizes(gapComposer2).getClass();
                        zzcVar.getClass();
                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth3, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.CenterVertically, gapComposer2, 54);
                        int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default2);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$16);
                        if (action2 == null) {
                            gapComposer2.startReplaceGroup(-235078965);
                            gapComposer2.end(false);
                            ready2 = ready;
                            function15 = function17;
                            gapComposer3 = gapComposer2;
                            z5 = false;
                            neverEqualPolicy = neverEqualPolicy2;
                            modifier4 = modifier5;
                            i6 = i11;
                            f = 1.0f;
                            i8 = PKIFailureInfo.unsupportedVersion;
                            i7 = 2;
                            z2 = true;
                        } else {
                            gapComposer2.startReplaceGroup(-235078964);
                            Strings.getSizes(gapComposer2).getClass();
                            zzcVar.getClass();
                            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 48);
                            int hashCode6 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer2, companion);
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer2.useNode();
                            }
                            Updater.m576setimpl(gapComposer2, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer2, materializeModifier6, composeUiNode$Companion$SetModifier$16);
                            final int i13 = 0;
                            Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).labelMedium), Expect_jvmKt.rememberComposableLambda(-1322648734, new Function2() { // from class: com.squareup.cash.marketing.components.MarketingCompactCardKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i14 = i13;
                                    Action action3 = action2;
                                    switch (i14) {
                                        case 0:
                                            Composer composer2 = (Composer) obj4;
                                            int intValue = ((Integer) obj5).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer2;
                                            if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action3.text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer3 = (Composer) obj4;
                                            int intValue2 = ((Integer) obj5).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer3;
                                            if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action3.text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2), gapComposer2, 56);
                            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Strings.getTypography(gapComposer2).labelMedium.spanStyle.fontSize, null, null, 0, 16646143);
                            modifier4 = modifier5;
                            i6 = i11;
                            z5 = false;
                            GapComposer gapComposer5 = gapComposer2;
                            z2 = true;
                            f = 1.0f;
                            i7 = 2;
                            ready2 = ready;
                            i8 = 131072;
                            neverEqualPolicy = neverEqualPolicy2;
                            function15 = function17;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4090, 0L, (Composer) gapComposer5, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, "→", (Map) null, (Function1) null, false);
                            gapComposer3 = gapComposer5;
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            gapComposer3.startReplaceGroup(-1670132350);
                            SpacerKt.Spacer(gapComposer3, rowScopeInstance.weight(f, companion, z2));
                        } else {
                            gapComposer3.startReplaceGroup(-1670151384);
                        }
                        gapComposer3.end(z5);
                        ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                        boolean changedInstance2 = ((i6 & 458752) == i8 ? z2 : z5) | gapComposer3.changedInstance(ready2);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ActivityTabViewKt$$ExternalSyntheticLambda14(function15, ready2, i7);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        GapComposer gapComposer6 = gapComposer3;
                        coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, buttonProminence, false, false, null, CardUpsellKt.f464lambda$1022748396, gapComposer6, 1573248, 58);
                        Boxes$$ExternalSyntheticOutline1.m(gapComposer6, z2, z2, z5);
                        gapComposer = gapComposer6;
                        function14 = function15;
                        color3 = color4;
                        contentScale3 = contentScale4;
                    } else {
                        function14 = function17;
                        modifier4 = modifier5;
                        int i14 = i3;
                        gapComposer4.startReplaceGroup(-1090193873);
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        Strings.getSizes(gapComposer4).getClass();
                        zzcVar.getClass();
                        final Action action3 = action;
                        RowMeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical2, gapComposer4, 0);
                        int hashCode7 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth4);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, rowMeasurePolicy4, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer4, materializeModifier7, composeUiNode$Companion$SetModifier$16, 1.0f, true);
                        Strings.getSizes(gapComposer4).getClass();
                        zzcVar.getClass();
                        Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(m, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 104.0f, RecyclerView.DECELERATION_RATE, 2);
                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer4, 6);
                        int hashCode8 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer4, m279heightInVpY3zN4$default);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope8, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode8, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer4, materializeModifier8, composeUiNode$Companion$SetModifier$16);
                        ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
                        int hashCode9 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer4, companion);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope9, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode9, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer4, materializeModifier9, composeUiNode$Companion$SetModifier$16);
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextStyle;
                        final int i15 = 1;
                        Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Strings.getTypography(gapComposer4).labelMedium), Expect_jvmKt.rememberComposableLambda(-176544476, new Function2() { // from class: com.squareup.cash.marketing.components.MarketingCompactCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i132 = i15;
                                CardAppMessageViewModel.Ready ready3 = ready;
                                switch (i132) {
                                    case 0:
                                        Composer composer2 = (Composer) obj4;
                                        int intValue = ((Integer) obj5).intValue();
                                        GapComposer gapComposer52 = (GapComposer) composer2;
                                        if (gapComposer52.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ready3.title, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer52.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue2 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer62 = (GapComposer) composer3;
                                        if (gapComposer62.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer62, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ready3.title, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer62.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), gapComposer4, 56);
                        if (str == null) {
                            gapComposer4.startReplaceGroup(-1091118229);
                            z = false;
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-1091118228);
                            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Strings.getTypography(gapComposer4).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer4).semantic.text.subtle, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-424523994, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 10), gapComposer4), gapComposer4, 56);
                            z = false;
                            gapComposer4.end(false);
                        }
                        gapComposer4.end(true);
                        if (action3 == null) {
                            gapComposer4.startReplaceGroup(394244710);
                            gapComposer4.end(z);
                            gapComposer = gapComposer4;
                            z3 = z;
                            z2 = true;
                        } else {
                            gapComposer4.startReplaceGroup(394244711);
                            Strings.getSizes(gapComposer4).getClass();
                            zzcVar.getClass();
                            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                            Strings.getSizes(gapComposer4).getClass();
                            zzcVar.getClass();
                            RowMeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer4, 48);
                            int hashCode10 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope10 = gapComposer4.currentCompositionLocalScope();
                            Modifier materializeModifier10 = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default3);
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer4.startReusableNode();
                            if (gapComposer4.inserting) {
                                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer4.useNode();
                            }
                            Updater.m576setimpl(gapComposer4, rowMeasurePolicy5, composeUiNode$Companion$SetModifier$13);
                            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope10, composeUiNode$Companion$SetModifier$14);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode10, gapComposer4, composeUiNode$Companion$SetModifier$15, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer4, materializeModifier10, composeUiNode$Companion$SetModifier$16);
                            final int i16 = 1;
                            Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Strings.getTypography(gapComposer4).labelMedium), Expect_jvmKt.rememberComposableLambda(-1022608335, new Function2() { // from class: com.squareup.cash.marketing.components.MarketingCompactCardKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i142 = i16;
                                    Action action32 = action3;
                                    switch (i142) {
                                        case 0:
                                            Composer composer2 = (Composer) obj4;
                                            int intValue = ((Integer) obj5).intValue();
                                            GapComposer gapComposer52 = (GapComposer) composer2;
                                            if (gapComposer52.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer52, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action32.text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer52.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer3 = (Composer) obj4;
                                            int intValue2 = ((Integer) obj5).intValue();
                                            GapComposer gapComposer62 = (GapComposer) composer3;
                                            if (gapComposer62.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer62, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action32.text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer62.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4), gapComposer4, 56);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer4).labelMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Strings.getTypography(gapComposer4).labelMedium.spanStyle.fontSize, null, null, 0, 16646143), (TextLineBalancing) null, "→", (Map) null, (Function1) null, false);
                            gapComposer = gapComposer4;
                            z2 = true;
                            gapComposer.end(true);
                            z3 = false;
                            gapComposer.end(false);
                        }
                        gapComposer.end(z2);
                        if (appMessageImage == null) {
                            gapComposer.startReplaceGroup(1288028647);
                            gapComposer.end(z3);
                            contentScale3 = contentScale5;
                            color3 = color6;
                        } else {
                            gapComposer.startReplaceGroup(1288028648);
                            contentScale3 = contentScale5;
                            color3 = color6;
                            m3600MarketingCompactCardImagexqIIw2o(appMessageImage, ready.messageToken, function1, color3, contentScale3, gapComposer, i14 & 65408);
                            gapComposer.end(z3);
                        }
                        gapComposer.end(z2);
                        gapComposer.end(z3);
                    }
                    gapComposer.end(z2);
                    color2 = color3;
                    contentScale2 = contentScale3;
                    modifier3 = modifier4;
                    function13 = function14;
                } else {
                    gapComposer = gapComposer4;
                    gapComposer.skipToGroupEnd();
                    color2 = color;
                    contentScale2 = contentScale;
                    function13 = function12;
                    modifier3 = modifier2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier3, ready, function1, color2, contentScale2, function13, i, i2, 21);
                    return;
                }
                return;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if (gapComposer4.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if (gapComposer4.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: MarketingCompactCardImage-xqIIw2o, reason: not valid java name */
    public static final void m3600MarketingCompactCardImagexqIIw2o(final AppMessageImage appMessageImage, final String str, final Function1 function1, final Color color, final ContentScale contentScale, Composer composer, final int i) {
        int i2;
        Color color2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1691350068);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(appMessageImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(color) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(contentScale) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (color == null) {
                gapComposer.startReplaceGroup(1546675928);
                AppMessageImageView(appMessageImage, str, function1, SizeKt.m285size3ABfNKs(companion, 104.0f), contentScale, gapComposer, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896) | (i2 & 57344));
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.marketing.components.MarketingCompactCardKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    MarketingCompactCardKt.m3600MarketingCompactCardImagexqIIw2o(appMessageImage, str, function1, color, contentScale, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    MarketingCompactCardKt.m3600MarketingCompactCardImagexqIIw2o(appMessageImage, str, function1, color, contentScale, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            color2 = color;
            gapComposer.startReplaceGroup(1546889270);
            gapComposer.end(false);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 104.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), color2.value, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            AppMessageImageView(appMessageImage, str, function1, SizeKt.m285size3ABfNKs(companion, 104.0f), contentScale, gapComposer, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896) | (i2 & 57344));
            gapComposer.end(true);
        } else {
            color2 = color;
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            final Color color3 = color2;
            function2 = new Function2() { // from class: com.squareup.cash.marketing.components.MarketingCompactCardKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = i4;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj22).getClass();
                            MarketingCompactCardKt.m3600MarketingCompactCardImagexqIIw2o(appMessageImage, str, function1, color3, contentScale, (Composer) obj2, Updater.updateChangedFlags(i5 | 1));
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            MarketingCompactCardKt.m3600MarketingCompactCardImagexqIIw2o(appMessageImage, str, function1, color3, contentScale, (Composer) obj2, Updater.updateChangedFlags(i5 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }
}
