package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.DefaultSliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.PathParserKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.core.graphics.ColorUtils;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.ImageDrawable;
import com.fillr.n;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.PatternStateListener;
import com.squareup.cardcustomizations.signature.SavedSignature;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cardcustomizations.stampview.InitialStampsData;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$3$1;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioExitDialogResult;
import com.squareup.cash.card.onboarding.CardStudioUndoResult;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioUndoDialogScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapBackConfirm;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapBackStay;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapUndo;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapUndoDialogCancel;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapUndoDialogConfirm;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda24;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.util.MathsKt;
import com.squareup.util.Strings;
import com.squareup.util.android.StringsKt;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedFloatRange;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.ast.ASTUtilKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class CardStudioViewKt {
    public static final CardTheme BLACK_CARD_THEME = new CardTheme("_black123", "#ffffffff", "#ff000000", "#ffffffff", null, CardTheme.Gradient.DIAGONAL_LIGHT, null, "#ffffffff", "#ff333333", null, null, null, null, 16750366);
    public static final CardTheme WHITE_CARD_THEME;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CardTheme.BackgroundImage.values().length];
            try {
                iArr[CardTheme.BackgroundImage.HOOD_BY_AIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.BackgroundImage.HUNDRED_THIEVES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTheme.BackgroundImage.METAL_OIL_SLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardTheme.BackgroundImage.METAL_BLACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardTheme.BackgroundImage.SHANTELL_MARTIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardTheme.BackgroundImage.DREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardTheme.BackgroundImage.MOOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardTheme.BackgroundImage.GLITTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CardTheme.BackgroundImage.TORTOISE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CardTheme.BackgroundImage.BRAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardTheme.Gradient.values().length];
            try {
                iArr2[CardTheme.Gradient.DIAGONAL_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardTheme.Gradient.DIAGONAL_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        new CardTheme("_oilslick123", "#ffd9d9d9", "#ff2e2966", "#ffffffff", null, null, CardTheme.BackgroundImage.METAL_OIL_SLICK, "#ffffffff", "#ff584184", null, new CardTheme.CardCustomizationMargin("#C4C4C4", Float.valueOf(0.3f), Float.valueOf(0.03f), null, 8, null), null, null, 16617246);
        WHITE_CARD_THEME = new CardTheme("_white123", "#ff333333", "#fff4f9fa", "#ff000000", null, CardTheme.Gradient.DIAGONAL_DARK, null, "#ff333333", "#ffd2d2d2", null, null, null, null, 16750366);
        Float valueOf = Float.valueOf(2023.0f);
        Float valueOf2 = Float.valueOf(1276.0f);
        Float valueOf3 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        TouchData.Point point = new TouchData.Point(valueOf3, valueOf3, 1L, null, 8, null);
        Float valueOf4 = Float.valueOf(505.75f);
        Float valueOf5 = Float.valueOf(319.0f);
        TouchData.Point point2 = new TouchData.Point(valueOf4, valueOf5, 2L, null, 8, null);
        Float valueOf6 = Float.valueOf(1011.5f);
        Float valueOf7 = Float.valueOf(638.0f);
        TouchData.Point point3 = new TouchData.Point(valueOf6, valueOf7, 3L, null, 8, null);
        Float valueOf8 = Float.valueOf(1517.25f);
        Float valueOf9 = Float.valueOf(957.0f);
        TouchData.Point point4 = new TouchData.Point(valueOf8, valueOf9, 4L, null, 8, null);
        TouchData.Point point5 = new TouchData.Point(valueOf, valueOf2, 5L, null, 8, null);
        Float valueOf10 = Float.valueOf(2528.75f);
        Float valueOf11 = Float.valueOf(1595.0f);
        TouchData touchData = new TouchData(valueOf, valueOf2, CollectionsKt__CollectionsKt.listOf((Object[]) new TouchData.Stroke[]{new TouchData.Stroke(CollectionsKt__CollectionsKt.listOf((Object[]) new TouchData.Point[]{point, point2, point3, point4, point5, new TouchData.Point(valueOf10, valueOf11, 6L, null, 8, null)}), null, 2, null), new TouchData.Stroke(CollectionsKt__CollectionsKt.listOf((Object[]) new TouchData.Point[]{new TouchData.Point(valueOf, valueOf3, 7L, null, 8, null), new TouchData.Point(valueOf8, valueOf5, 8L, null, 8, null), new TouchData.Point(valueOf6, valueOf7, 9L, null, 8, null), new TouchData.Point(valueOf4, valueOf9, 10L, null, 8, null), new TouchData.Point(valueOf3, valueOf2, 11L, null, 8, null), new TouchData.Point(Float.valueOf(-505.75f), valueOf11, 12L, null, 8, null)}), null, 2, null)}), (List) null, 24);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        StyledCardViewModelKt.toCustomizationDetails(touchData, emptyMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x024d, code lost:
    
        if (r5 == r3) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x067b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x056d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardStudio(Modifier modifier, final Flow flow, final CardStudioViewModel.Content content, final Function1 function1, ErrorReporter errorReporter, Composer composer, int i) {
        GapComposer gapComposer;
        MutableState mutableState;
        final int i2;
        Object obj;
        SnapshotStateList snapshotStateList;
        SignatureState signatureState;
        NeverEqualPolicy neverEqualPolicy;
        final PatternStampState patternStampState;
        SignatureState signatureState2;
        boolean z;
        MutableState mutableState2;
        MutableState mutableState3;
        int i3;
        final StampState stampState;
        boolean z2;
        CardStudioViewModel.CustomizationMode customizationMode;
        SnapshotStateList snapshotStateList2;
        SnapshotStateList snapshotStateList3;
        final Function1 function12;
        Object obj2;
        NeverEqualPolicy neverEqualPolicy2;
        Object obj3;
        Object obj4;
        final SignatureState signatureState3;
        Function1 function13;
        NeverEqualPolicy neverEqualPolicy3;
        final SnapshotStateList snapshotStateList4;
        PatternStampState patternStampState2;
        SignatureState signatureState4;
        StampState stampState2;
        MutableState mutableState4;
        n nVar;
        MutableState mutableState5;
        boolean z3;
        boolean z4;
        SnapshotStateList snapshotStateList5;
        SnapshotStateList snapshotStateList6;
        Object obj5;
        CardStudioViewModel.CustomizationMode customizationMode2;
        boolean z5;
        boolean changedInstance;
        SignatureState signatureState5;
        boolean z6;
        boolean z7;
        boolean changedInstance2;
        Object l2__externalsyntheticlambda7;
        CardStudioViewModel.CustomizationMode customizationMode3;
        StampState stampState3;
        boolean z8;
        long j;
        long j2;
        boolean changedInstance3;
        CardStudioViewModel.CustomizationMode customizationMode4;
        Object rememberedValue;
        Object rememberedValue2;
        MutableState mutableState6;
        CardStudioViewModel.CustomizationMode customizationMode5;
        boolean z9 = content.displayScaleBar;
        boolean z10 = content.isShowingCustomization;
        CardStudioViewModel.CustomizationMode customizationMode6 = content.customizationMode;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(399314636);
        Applier applier = gapComposer2.applier;
        int i4 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(flow) ? 32 : 16) | (gapComposer2.changedInstance(content) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024) | (gapComposer2.changedInstance(errorReporter) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            Object rememberedValue3 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            Object obj6 = rememberedValue3;
            if (rememberedValue3 == neverEqualPolicy4) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Float.valueOf(4.5f));
                gapComposer2.updateRememberedValue(mutableStateOf$default);
                obj6 = mutableStateOf$default;
            }
            final MutableState mutableState7 = (MutableState) obj6;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Object obj7 = rememberedValue4;
            if (rememberedValue4 == neverEqualPolicy4) {
                ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(mutableStateOf$default2);
                obj7 = mutableStateOf$default2;
            }
            MutableState mutableState8 = (MutableState) obj7;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj8 = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy4) {
                ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(mutableStateOf$default3);
                obj8 = mutableStateOf$default3;
            }
            MutableState mutableState9 = (MutableState) obj8;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            Object obj9 = rememberedValue6;
            if (rememberedValue6 == neverEqualPolicy4) {
                ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(mutableStateOf$default4);
                obj9 = mutableStateOf$default4;
            }
            final MutableState mutableState10 = (MutableState) obj9;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            Object obj10 = rememberedValue7;
            if (rememberedValue7 == neverEqualPolicy4) {
                SnapshotStateList snapshotStateList7 = new SnapshotStateList();
                gapComposer2.updateRememberedValue(snapshotStateList7);
                obj10 = snapshotStateList7;
            }
            SnapshotStateList snapshotStateList8 = (SnapshotStateList) obj10;
            Object rememberedValue8 = gapComposer2.rememberedValue();
            Object obj11 = rememberedValue8;
            if (rememberedValue8 == neverEqualPolicy4) {
                SnapshotStateList snapshotStateList9 = new SnapshotStateList();
                gapComposer2.updateRememberedValue(snapshotStateList9);
                obj11 = snapshotStateList9;
            }
            SnapshotStateList snapshotStateList10 = (SnapshotStateList) obj11;
            boolean changedInstance4 = gapComposer2.changedInstance(content);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue9 == neverEqualPolicy4) {
                mutableState = mutableState9;
                i2 = 0;
                Function0 function0 = new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        CustomizationDetails customizationDetails;
                        CustomizationDetails customizationDetails2;
                        int i5 = i2;
                        ArrayList arrayList = null;
                        CardStudioViewModel.Content content2 = content;
                        switch (i5) {
                            case 0:
                                if (!content2.isShowingCustomization || (customizationDetails = content2.customizationDetails) == null) {
                                    return null;
                                }
                                float f = customizationDetails.width;
                                float f2 = customizationDetails.height;
                                List list = customizationDetails.strokes;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    List<TouchData.Point> list2 = ((TouchData.Stroke) it.next()).points;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    for (TouchData.Point point : list2) {
                                        Float f3 = point.x_coordinate;
                                        f3.getClass();
                                        float floatValue = f3.floatValue();
                                        Float f4 = point.y_coordinate;
                                        f4.getClass();
                                        arrayList3.add(new float[]{floatValue, f4.floatValue()});
                                    }
                                    arrayList2.add((float[][]) arrayList3.toArray(new float[0][]));
                                }
                                return new SavedSignature(f, f2, (float[][][]) arrayList2.toArray(new float[0][][]));
                            default:
                                if (content2.isShowingCustomization && (customizationDetails2 = content2.customizationDetails) != null) {
                                    List<StampDetails> list3 = customizationDetails2.stamps;
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                    for (StampDetails stampDetails : list3) {
                                        float f5 = customizationDetails2.width;
                                        float f6 = customizationDetails2.height;
                                        String str = stampDetails.stamp.name;
                                        str.getClass();
                                        Stamp stamp = stampDetails.stamp;
                                        String str2 = stamp.svg;
                                        str2.getClass();
                                        com.squareup.cardcustomizations.stampview.Stamp stamp2 = new com.squareup.cardcustomizations.stampview.Stamp(str, str2);
                                        TouchData.StampCustomization stampCustomization = stampDetails.customization;
                                        Float f7 = stampCustomization.width;
                                        f7.getClass();
                                        float floatValue2 = f7.floatValue();
                                        Float f8 = stampCustomization.height;
                                        f8.getClass();
                                        float floatValue3 = f8.floatValue();
                                        TouchData.Point point2 = stampCustomization.center;
                                        point2.getClass();
                                        Float f9 = point2.x_coordinate;
                                        f9.getClass();
                                        float floatValue4 = f9.floatValue();
                                        TouchData.Point point3 = stampCustomization.center;
                                        point3.getClass();
                                        Float f10 = point3.y_coordinate;
                                        f10.getClass();
                                        PointF pointF = new PointF(floatValue4, f10.floatValue());
                                        Float f11 = stampCustomization.rotation;
                                        f11.getClass();
                                        float floatValue5 = f11.floatValue();
                                        stamp.min_scale.getClass();
                                        arrayList.add(new InitialStampsData(f5, f6, stamp2, floatValue2, floatValue3, pointF, floatValue5, r10.intValue()));
                                    }
                                }
                                return arrayList;
                        }
                    }
                };
                gapComposer2.updateRememberedValue(function0);
                obj = function0;
            } else {
                mutableState = mutableState9;
                i2 = 0;
                obj = rememberedValue9;
            }
            SignatureState rememberSignatureState = AspectRatio.rememberSignatureState((Function0) obj, gapComposer2, i2);
            final int i5 = 1;
            SignatureState rememberSignatureState2 = AspectRatio.rememberSignatureState(null, gapComposer2, 1);
            boolean changedInstance5 = gapComposer2.changedInstance(content);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            Object obj12 = rememberedValue10;
            if (changedInstance5 || rememberedValue10 == neverEqualPolicy4) {
                Function0 function02 = new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        CustomizationDetails customizationDetails;
                        CustomizationDetails customizationDetails2;
                        int i52 = i5;
                        ArrayList arrayList = null;
                        CardStudioViewModel.Content content2 = content;
                        switch (i52) {
                            case 0:
                                if (!content2.isShowingCustomization || (customizationDetails = content2.customizationDetails) == null) {
                                    return null;
                                }
                                float f = customizationDetails.width;
                                float f2 = customizationDetails.height;
                                List list = customizationDetails.strokes;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    List<TouchData.Point> list2 = ((TouchData.Stroke) it.next()).points;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    for (TouchData.Point point : list2) {
                                        Float f3 = point.x_coordinate;
                                        f3.getClass();
                                        float floatValue = f3.floatValue();
                                        Float f4 = point.y_coordinate;
                                        f4.getClass();
                                        arrayList3.add(new float[]{floatValue, f4.floatValue()});
                                    }
                                    arrayList2.add((float[][]) arrayList3.toArray(new float[0][]));
                                }
                                return new SavedSignature(f, f2, (float[][][]) arrayList2.toArray(new float[0][][]));
                            default:
                                if (content2.isShowingCustomization && (customizationDetails2 = content2.customizationDetails) != null) {
                                    List<StampDetails> list3 = customizationDetails2.stamps;
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                    for (StampDetails stampDetails : list3) {
                                        float f5 = customizationDetails2.width;
                                        float f6 = customizationDetails2.height;
                                        String str = stampDetails.stamp.name;
                                        str.getClass();
                                        Stamp stamp = stampDetails.stamp;
                                        String str2 = stamp.svg;
                                        str2.getClass();
                                        com.squareup.cardcustomizations.stampview.Stamp stamp2 = new com.squareup.cardcustomizations.stampview.Stamp(str, str2);
                                        TouchData.StampCustomization stampCustomization = stampDetails.customization;
                                        Float f7 = stampCustomization.width;
                                        f7.getClass();
                                        float floatValue2 = f7.floatValue();
                                        Float f8 = stampCustomization.height;
                                        f8.getClass();
                                        float floatValue3 = f8.floatValue();
                                        TouchData.Point point2 = stampCustomization.center;
                                        point2.getClass();
                                        Float f9 = point2.x_coordinate;
                                        f9.getClass();
                                        float floatValue4 = f9.floatValue();
                                        TouchData.Point point3 = stampCustomization.center;
                                        point3.getClass();
                                        Float f10 = point3.y_coordinate;
                                        f10.getClass();
                                        PointF pointF = new PointF(floatValue4, f10.floatValue());
                                        Float f11 = stampCustomization.rotation;
                                        f11.getClass();
                                        float floatValue5 = f11.floatValue();
                                        stamp.min_scale.getClass();
                                        arrayList.add(new InitialStampsData(f5, f6, stamp2, floatValue2, floatValue3, pointF, floatValue5, r10.intValue()));
                                    }
                                }
                                return arrayList;
                        }
                    }
                };
                gapComposer2.updateRememberedValue(function02);
                obj12 = function02;
            }
            StampState rememberStampState = PickVisualMediaRequestKt.rememberStampState((Function0) obj12, gapComposer2);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            Object obj13 = rememberedValue11;
            if (rememberedValue11 == neverEqualPolicy4) {
                PatternStampState patternStampState3 = new PatternStampState(6);
                gapComposer2.updateRememberedValue(patternStampState3);
                obj13 = patternStampState3;
            }
            PatternStampState patternStampState4 = (PatternStampState) obj13;
            if (!z10) {
                rememberSignatureState.setEnabled(false);
                rememberStampState.setEnabled(false);
                patternStampState4.setEnabled(false);
                snapshotStateList = snapshotStateList8;
            } else if (Intrinsics.areEqual(customizationMode6, CardStudioViewModel.CustomizationMode.DRAW.INSTANCE) || Intrinsics.areEqual(customizationMode6, CardStudioViewModel.CustomizationMode.Pattern.DRAW.INSTANCE)) {
                snapshotStateList = snapshotStateList8;
                rememberSignatureState.setEnabled(true);
                rememberStampState.setEnabled(false);
                patternStampState4.setEnabled(false);
            } else {
                rememberSignatureState.setEnabled(false);
                boolean z11 = customizationMode6 instanceof CardStudioViewModel.CustomizationMode.Pattern;
                snapshotStateList = snapshotStateList8;
                rememberStampState.setEnabled(!z11);
                patternStampState4.setEnabled(z11);
            }
            Object rememberedValue12 = gapComposer2.rememberedValue();
            Object obj14 = rememberedValue12;
            if (rememberedValue12 == neverEqualPolicy4) {
                ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(new PointF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                gapComposer2.updateRememberedValue(mutableStateOf$default5);
                obj14 = mutableStateOf$default5;
            }
            MutableState mutableState11 = (MutableState) obj14;
            Object rememberedValue13 = gapComposer2.rememberedValue();
            Object obj15 = rememberedValue13;
            if (rememberedValue13 == neverEqualPolicy4) {
                ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
                gapComposer2.updateRememberedValue(mutableStateOf$default6);
                obj15 = mutableStateOf$default6;
            }
            MutableState mutableState12 = (MutableState) obj15;
            boolean changedInstance6 = gapComposer2.changedInstance(rememberStampState) | gapComposer2.changedInstance(patternStampState4);
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (changedInstance6 || rememberedValue14 == neverEqualPolicy4) {
                rememberedValue14 = new ComposeDialogKt$$ExternalSyntheticLambda12(rememberStampState, patternStampState4, mutableState11, mutableState12, 25);
                gapComposer2.updateRememberedValue(rememberedValue14);
            }
            final Function3 function3 = (Function3) rememberedValue14;
            int i6 = i4 & 7168;
            boolean changedInstance7 = gapComposer2.changedInstance(content) | gapComposer2.changedInstance(patternStampState4) | gapComposer2.changedInstance(rememberStampState) | (i6 == 2048);
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (changedInstance7 || rememberedValue15 == neverEqualPolicy4) {
                signatureState = rememberSignatureState;
                neverEqualPolicy = neverEqualPolicy4;
                patternStampState = patternStampState4;
                signatureState2 = rememberSignatureState2;
                z = z9;
                mutableState2 = mutableState;
                mutableState3 = mutableState8;
                i3 = 2048;
                stampState = rememberStampState;
                z2 = z10;
                customizationMode = customizationMode6;
                snapshotStateList2 = snapshotStateList10;
                snapshotStateList3 = snapshotStateList;
                SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda3 = new SliderKt$$ExternalSyntheticLambda3(content, patternStampState, function1, stampState, mutableState11, mutableState12, 5);
                function12 = function1;
                gapComposer2.updateRememberedValue(sliderKt$$ExternalSyntheticLambda3);
                obj2 = sliderKt$$ExternalSyntheticLambda3;
            } else {
                signatureState = rememberSignatureState;
                neverEqualPolicy = neverEqualPolicy4;
                patternStampState = patternStampState4;
                signatureState2 = rememberSignatureState2;
                z = z9;
                z2 = z10;
                customizationMode = customizationMode6;
                mutableState2 = mutableState;
                mutableState3 = mutableState8;
                snapshotStateList2 = snapshotStateList10;
                snapshotStateList3 = snapshotStateList;
                i3 = 2048;
                function12 = function1;
                stampState = rememberStampState;
                obj2 = rememberedValue15;
            }
            Function1 function14 = (Function1) obj2;
            boolean changedInstance8 = gapComposer2.changedInstance(stampState) | (i6 == i3);
            Object rememberedValue16 = gapComposer2.rememberedValue();
            if (changedInstance8) {
                neverEqualPolicy2 = neverEqualPolicy;
            } else {
                neverEqualPolicy2 = neverEqualPolicy;
                obj3 = rememberedValue16;
            }
            CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(23, snapshotStateList3, function12, stampState);
            gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
            obj3 = copyCodeKt$$ExternalSyntheticLambda4;
            Function0 function03 = (Function0) obj3;
            stampState.getClass();
            function03.getClass();
            stampState.onStampsChanged = function03;
            boolean changedInstance9 = gapComposer2.changedInstance(patternStampState) | (i6 == i3);
            Object rememberedValue17 = gapComposer2.rememberedValue();
            Object obj16 = rememberedValue17;
            if (changedInstance9 || rememberedValue17 == neverEqualPolicy2) {
                CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda42 = new CopyCodeKt$$ExternalSyntheticLambda4(19, snapshotStateList2, function12, patternStampState);
                gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda42);
                obj16 = copyCodeKt$$ExternalSyntheticLambda42;
            }
            Function0 function04 = (Function0) obj16;
            patternStampState.getClass();
            function04.getClass();
            patternStampState.onStampsChanged = function04;
            boolean changedInstance10 = gapComposer2.changedInstance(signatureState2) | gapComposer2.changedInstance(patternStampState) | gapComposer2.changedInstance(signatureState) | gapComposer2.changedInstance(stampState) | (i6 == i3);
            Object rememberedValue18 = gapComposer2.rememberedValue();
            if (changedInstance10 || rememberedValue18 == neverEqualPolicy2) {
                NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy2;
                signatureState3 = signatureState2;
                function13 = function14;
                final SignatureState signatureState6 = signatureState;
                neverEqualPolicy3 = neverEqualPolicy5;
                snapshotStateList4 = snapshotStateList3;
                final SnapshotStateList snapshotStateList11 = snapshotStateList2;
                obj4 = new PatternStateListener() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda11
                    @Override // com.squareup.cardcustomizations.signature.PatternStateListener
                    public final Pair onPatternCommitted(SignatureState signatureState7, PatternStampState patternStampState5) {
                        signatureState7.getClass();
                        Signature signature$customizations = SignatureState.this.getSignature$customizations();
                        boolean z12 = false;
                        int size = signature$customizations != null ? signature$customizations.userDrawnGlyphs().size() : 0;
                        int uniqueStamps = patternStampState.uniqueStamps();
                        final SignatureState signatureState8 = signatureState6;
                        signatureState8.getClass();
                        Signature signature$customizations2 = signatureState7.getSignature$customizations();
                        if (signature$customizations2 != null) {
                            if (!signature$customizations2.userDrawnGlyphs().isEmpty()) {
                                List userDrawnGlyphs = signature$customizations2.userDrawnGlyphs();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = userDrawnGlyphs.iterator();
                                while (it.hasNext()) {
                                    Object obj17 = signature$customizations2.patternGlyphs.get((Signature.Glyph) it.next());
                                    obj17.getClass();
                                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) obj17, arrayList);
                                }
                                List list = CollectionsKt.toList(arrayList);
                                Signature.Glyph glyph = (Signature.Glyph) signature$customizations2.userDrawnGlyphs().get(0);
                                Signature signature$customizations3 = signatureState8.getSignature$customizations();
                                if (signature$customizations3 != null) {
                                    signature$customizations3.addPatternGlyphs(CollectionsKt__CollectionsJVMKt.listOf(glyph), MapsKt__MapsJVMKt.mapOf(new Pair(glyph, list)));
                                }
                                z12 = true;
                            }
                            Signature signature$customizations4 = signatureState8.getSignature$customizations();
                            if (signature$customizations4 != null) {
                                AspectRatio.clip(signature$customizations4.getBitmap(), signatureState8.getClipPath$customizations());
                            }
                            signatureState8.setInvalidate$customizations(signatureState8.getInvalidate$customizations() + 1);
                        }
                        final boolean z13 = z12;
                        final StampState stampState4 = stampState;
                        final boolean commitPatternStamp = stampState4.commitPatternStamp(patternStampState5);
                        if (z13 || commitPatternStamp) {
                            final Function1 function15 = function12;
                            Function0 function05 = new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda73
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Function1.this.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndo(Boolean.TRUE)));
                                    if (z13) {
                                        signatureState8.undo();
                                    }
                                    if (commitPatternStamp) {
                                        stampState4.undo();
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            SnapshotStateList snapshotStateList12 = snapshotStateList4;
                            snapshotStateList12.add(function05);
                            snapshotStateList12.add(new DisclosureView$$ExternalSyntheticLambda1(17, function15));
                        }
                        snapshotStateList11.clear();
                        return new Pair(Integer.valueOf(size), Integer.valueOf(uniqueStamps));
                    }
                };
                patternStampState2 = patternStampState;
                signatureState4 = signatureState6;
                stampState2 = stampState;
                gapComposer2.updateRememberedValue(obj4);
            } else {
                signatureState4 = signatureState;
                neverEqualPolicy3 = neverEqualPolicy2;
                patternStampState2 = patternStampState;
                signatureState3 = signatureState2;
                function13 = function14;
                obj4 = rememberedValue18;
                snapshotStateList4 = snapshotStateList3;
                stampState2 = stampState;
            }
            PatternStateListener patternStateListener = (PatternStateListener) obj4;
            final SignatureState signatureState7 = signatureState3;
            SnapshotStateList snapshotStateList12 = snapshotStateList2;
            final SubtreeManager subtreeManager = new SubtreeManager(function1, mutableState10, content, snapshotStateList12, snapshotStateList4, signatureState7, signatureState4);
            SignatureState signatureState8 = signatureState4;
            MutableState mutableState13 = mutableState2;
            n nVar2 = new n(function1, mutableState10, mutableState3, mutableState13);
            boolean changedInstance11 = (i6 == i3) | gapComposer2.changedInstance(signatureState8) | gapComposer2.changedInstance(stampState2);
            Object rememberedValue19 = gapComposer2.rememberedValue();
            Object obj17 = rememberedValue19;
            if (changedInstance11 || rememberedValue19 == neverEqualPolicy3) {
                CardStudioViewKt$$ExternalSyntheticLambda12 cardStudioViewKt$$ExternalSyntheticLambda12 = new CardStudioViewKt$$ExternalSyntheticLambda12(function1, signatureState8, stampState2, 0);
                gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda12);
                obj17 = cardStudioViewKt$$ExternalSyntheticLambda12;
            }
            Updater.DisposableEffect(function1, (Function1) obj17, gapComposer2);
            boolean changed = (i6 == i3) | gapComposer2.changed(function13) | gapComposer2.changedInstance(errorReporter);
            Object rememberedValue20 = gapComposer2.rememberedValue();
            if (changed || rememberedValue20 == neverEqualPolicy3) {
                SnapshotStateList snapshotStateList13 = snapshotStateList4;
                mutableState4 = mutableState13;
                Function1 function15 = function13;
                nVar = nVar2;
                BankingConfigQueries$$ExternalSyntheticLambda0 bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0(function1, function15, snapshotStateList13, errorReporter, 2);
                snapshotStateList4 = snapshotStateList13;
                gapComposer2.updateRememberedValue(bankingConfigQueries$$ExternalSyntheticLambda0);
                rememberedValue20 = bankingConfigQueries$$ExternalSyntheticLambda0;
            } else {
                nVar = nVar2;
                mutableState4 = mutableState13;
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue20, gapComposer2, 0);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            final n nVar3 = nVar;
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            SnapshotStateList snapshotStateList14 = snapshotStateList4;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MutableState mutableState14 = mutableState3;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceAround, Alignment.Companion.End, gapComposer2, 54);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            if (!((Boolean) mutableState14.getValue()).booleanValue() || z) {
                mutableState5 = mutableState14;
                z3 = false;
            } else {
                mutableState5 = mutableState14;
                z3 = true;
            }
            boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
            boolean z12 = i6 == 2048;
            Object rememberedValue21 = gapComposer2.rememberedValue();
            if (z12 || rememberedValue21 == neverEqualPolicy3) {
                z4 = false;
                CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda43 = new CopyCodeKt$$ExternalSyntheticLambda4(function1, snapshotStateList14, snapshotStateList12, false, 20);
                snapshotStateList5 = snapshotStateList14;
                snapshotStateList6 = snapshotStateList12;
                gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda43);
                obj5 = copyCodeKt$$ExternalSyntheticLambda43;
            } else {
                snapshotStateList6 = snapshotStateList12;
                snapshotStateList5 = snapshotStateList14;
                z4 = false;
                obj5 = rememberedValue21;
            }
            MutableState mutableState15 = mutableState5;
            boolean z13 = z4;
            m3430ClipStudioButtonXz6DiA(null, R.drawable.card_studio_back_enabled, R.string.accessibility_cancel, 0L, 0L, z3, booleanValue, (Function0) obj5, gapComposer2, 0, 25);
            if (((Boolean) mutableState15.getValue()).booleanValue() && z2 && !z) {
                customizationMode2 = customizationMode;
                if ((customizationMode2 instanceof CardStudioViewModel.CustomizationMode.Pattern) ? !snapshotStateList6.isEmpty() : !snapshotStateList5.isEmpty()) {
                    z5 = true;
                    boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
                    changedInstance = gapComposer2.changedInstance(content);
                    Object rememberedValue22 = gapComposer2.rememberedValue();
                    Object obj18 = rememberedValue22;
                    if (!changedInstance || rememberedValue22 == neverEqualPolicy3) {
                        CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda44 = new CopyCodeKt$$ExternalSyntheticLambda4(21, content, snapshotStateList6, snapshotStateList5);
                        gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda44);
                        obj18 = copyCodeKt$$ExternalSyntheticLambda44;
                    }
                    m3432StudioButtonXz6DiA(null, R.drawable.card_studio_undo, R.string.accessibility_undo, 0L, 0L, z5, booleanValue2, (Function0) obj18, gapComposer2, 0, 25);
                    if ((customizationMode2 instanceof CardStudioViewModel.CustomizationMode.Pattern) && ((Boolean) mutableState15.getValue()).booleanValue() && z2) {
                        signatureState8.getClass();
                        signatureState5 = signatureState8;
                        z6 = true;
                        if (((Boolean) Updater.derivedStateOf(new SignatureViewKt$$ExternalSyntheticLambda1(signatureState5, 1)).getValue()).booleanValue() || !stampState2.getStamps$customizations().isEmpty()) {
                            z7 = true;
                            boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                            changedInstance2 = gapComposer2.changedInstance(signatureState5) | gapComposer2.changedInstance(stampState2) | (i6 == 2048 ? z6 : z13 ? 1 : 0);
                            Object rememberedValue23 = gapComposer2.rememberedValue();
                            if (!changedInstance2 || rememberedValue23 == neverEqualPolicy3) {
                                SignatureState signatureState9 = signatureState5;
                                StampState stampState4 = stampState2;
                                customizationMode3 = customizationMode2;
                                l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(signatureState9, stampState4, function1, snapshotStateList5, 20);
                                signatureState5 = signatureState9;
                                stampState3 = stampState4;
                                gapComposer2.updateRememberedValue(l2__externalsyntheticlambda7);
                            } else {
                                StampState stampState5 = stampState2;
                                customizationMode3 = customizationMode2;
                                l2__externalsyntheticlambda7 = rememberedValue23;
                                stampState3 = stampState5;
                            }
                            z8 = z6;
                            m3432StudioButtonXz6DiA(null, R.drawable.card_studio_clear, R.string.accessibility_clear, 0L, 0L, z7, booleanValue3, (Function0) l2__externalsyntheticlambda7, gapComposer2, 0, 25);
                            TweenSpec tween$default = AnimatableKt.tween$default(500, z13 ? 1 : 0, null, 6);
                            if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                                gapComposer2.startReplaceGroup(-907949995);
                                j = Strings.getColors(gapComposer2).component.button.standard.background.f163default;
                                gapComposer2.end(z13);
                            } else {
                                gapComposer2.startReplaceGroup(-907847788);
                                j = Strings.getColors(gapComposer2).component.button.prominent.background.f160default;
                                gapComposer2.end(z13);
                            }
                            final SignatureState signatureState10 = signatureState5;
                            final StampState stampState6 = stampState3;
                            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, tween$default, "Control Color", gapComposer2, 432, 8);
                            if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                                gapComposer2.startReplaceGroup(-907615133);
                                j2 = Strings.getColors(gapComposer2).component.button.standard.text.f165default;
                                gapComposer2.end(z13);
                            } else {
                                gapComposer2.startReplaceGroup(-907526814);
                                j2 = Strings.getColors(gapComposer2).component.button.prominent.text.f162default;
                                gapComposer2.end(z13);
                            }
                            long j3 = j2;
                            long j4 = ((Color) m153animateColorAsStateeuL9pac.getValue()).value;
                            boolean z14 = ((customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) && ((Boolean) mutableState15.getValue()).booleanValue()) ? z8 : z13 ? 1 : 0;
                            boolean booleanValue4 = ((Boolean) mutableState4.getValue()).booleanValue();
                            changedInstance3 = gapComposer2.changedInstance(signatureState10) | (i6 == 2048 ? z8 : z13 ? 1 : 0) | gapComposer2.changedInstance(stampState6);
                            Object rememberedValue24 = gapComposer2.rememberedValue();
                            Object obj19 = rememberedValue24;
                            if (!changedInstance3 || rememberedValue24 == neverEqualPolicy3) {
                                CardStudioViewKt$$ExternalSyntheticLambda3 cardStudioViewKt$$ExternalSyntheticLambda3 = new CardStudioViewKt$$ExternalSyntheticLambda3(function1, signatureState10, stampState6);
                                gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda3);
                                obj19 = cardStudioViewKt$$ExternalSyntheticLambda3;
                            }
                            m3432StudioButtonXz6DiA(null, R.drawable.checkmark_no_circle, R.string.accessibility_done, j4, j3, z14, booleanValue4, (Function0) obj19, gapComposer2, 0, 1);
                            gapComposer2.end(z8);
                            if (!(((double) 1.0f) > 0.0d ? z8 : z13 ? 1 : 0)) {
                                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                            }
                            customizationMode4 = customizationMode3;
                            final MutableState mutableState16 = mutableState4;
                            final PatternStampState patternStampState5 = patternStampState2;
                            OffsetKt.BoxWithConstraints(OffsetKt.aspectRatio(1.5854232f, ZIndexModifierKt.zIndex(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z13), 1.0f), z13), null, false, Expect_jvmKt.rememberComposableLambda(1174482444, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj20, Object obj21, Object obj22) {
                                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj20;
                                    Composer composer2 = (Composer) obj21;
                                    int intValue = ((Integer) obj22).intValue();
                                    boxWithConstraintsScopeImpl.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                        gapComposer3.startReplaceGroup(-898768983);
                                        Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                                        float mo236toPx0680j_4 = (density.mo236toPx0680j_4(8.0f) + density.mo235toPxR2X_6o(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium.paragraphStyle.lineHeight)) / 2.0f;
                                        gapComposer3.end(false);
                                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState16.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 1.0f, AnimatableKt.tween$default(100, 0, null, 6), "Pop up Alpha", null, gapComposer3, 3120, 20);
                                        MutableState mutableState17 = mutableState7;
                                        float floatValue = ((Number) mutableState17.getValue()).floatValue();
                                        boolean booleanValue5 = ((Boolean) mutableState10.getValue()).booleanValue();
                                        CardStudioViewModel.Content content2 = CardStudioViewModel.Content.this;
                                        CardStudioViewKt.ThemedCard(content2, signatureState10, signatureState7, floatValue, stampState6, patternStampState5, function3, nVar3, subtreeManager, flow, booleanValue5, gapComposer3, 295488);
                                        boolean changed2 = gapComposer3.changed(mo236toPx0680j_4) | gapComposer3.changed(animateFloatAsState);
                                        Object rememberedValue25 = gapComposer3.rememberedValue();
                                        if (changed2 || rememberedValue25 == Composer.Companion.Empty) {
                                            rememberedValue25 = new CardTransitionKt$$ExternalSyntheticLambda24(mo236toPx0680j_4, animateFloatAsState, 1);
                                            gapComposer3.updateRememberedValue(rememberedValue25);
                                        }
                                        Room.m1165Text25TpFw(0, 1, 0, 0, 1575936, 0, 4016, Color.White, (Composer) gapComposer3, BoxScopeInstance.INSTANCE.align(SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue25), ColorKt.Color(4281545523L), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(72.0f)), 17.0f, 8.0f, 17.0f, 8.0f), Alignment.Companion.TopCenter), ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.release_to_delete_prompt), (Map) null, (Function1) null, false);
                                        AnimatedContentKt.AnimatedVisibility(content2.displayScaleBar, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), "Slider visibility animation", Expect_jvmKt.rememberComposableLambda(-350998476, new SectionKt$$ExternalSyntheticLambda2(14, content2, function1, mutableState17), gapComposer3), (Composer) gapComposer3, 1797120, 2);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2), gapComposer2, 3072, 6);
                            rememberedValue = gapComposer2.rememberedValue();
                            Object obj20 = rememberedValue;
                            if (rememberedValue == neverEqualPolicy3) {
                                ParcelableSnapshotMutableState mutableStateOf$default7 = Updater.mutableStateOf$default(null);
                                gapComposer2.updateRememberedValue(mutableStateOf$default7);
                                obj20 = mutableStateOf$default7;
                            }
                            MutableState mutableState17 = (MutableState) obj20;
                            rememberedValue2 = gapComposer2.rememberedValue();
                            Object obj21 = rememberedValue2;
                            if (rememberedValue2 == neverEqualPolicy3) {
                                ParcelableSnapshotMutableState mutableStateOf$default8 = Updater.mutableStateOf$default(Boolean.FALSE);
                                gapComposer2.updateRememberedValue(mutableStateOf$default8);
                                obj21 = mutableStateOf$default8;
                            }
                            mutableState6 = (MutableState) obj21;
                            if (((Boolean) mutableState6.getValue()).booleanValue() && (((CardStudioViewModel.CustomizationMode) mutableState17.getValue()) instanceof CardStudioViewModel.CustomizationMode.Pattern)) {
                                customizationMode5 = customizationMode4;
                                if (!(customizationMode5 instanceof CardStudioViewModel.CustomizationMode.Pattern)) {
                                    mutableState6.setValue(Boolean.TRUE);
                                }
                            } else {
                                customizationMode5 = customizationMode4;
                            }
                            mutableState17.setValue(customizationMode5);
                            if (customizationMode5 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                                gapComposer2.startReplaceGroup(-1837582402);
                                PatternCustomizationColumn(content, signatureState7, patternStampState5, patternStateListener, ((Boolean) mutableState15.getValue()).booleanValue(), ((Boolean) mutableState4.getValue()).booleanValue(), ((Number) mutableState7.getValue()).floatValue(), function1, gapComposer2, ((i4 >> 6) & 14) | 576 | ((i4 << 12) & 29360128));
                                gapComposer = gapComposer2;
                                gapComposer.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-1837323056);
                                CustomizationButtonColumn(content, ((Boolean) mutableState15.getValue()).booleanValue(), ((Boolean) mutableState4.getValue()).booleanValue(), ((Boolean) mutableState6.getValue()).booleanValue(), function1, gapComposer2, ((i4 >> 6) & 14) | ((i4 << 3) & 57344));
                                gapComposer = gapComposer2;
                                gapComposer.end(false);
                            }
                            gapComposer.end(true);
                            gapComposer.end(true);
                        }
                    } else {
                        signatureState5 = signatureState8;
                        z6 = true;
                    }
                    z7 = z13 ? 1 : 0;
                    boolean booleanValue32 = ((Boolean) mutableState4.getValue()).booleanValue();
                    changedInstance2 = gapComposer2.changedInstance(signatureState5) | gapComposer2.changedInstance(stampState2) | (i6 == 2048 ? z6 : z13 ? 1 : 0);
                    Object rememberedValue232 = gapComposer2.rememberedValue();
                    if (changedInstance2) {
                    }
                    SignatureState signatureState92 = signatureState5;
                    StampState stampState42 = stampState2;
                    customizationMode3 = customizationMode2;
                    l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(signatureState92, stampState42, function1, snapshotStateList5, 20);
                    signatureState5 = signatureState92;
                    stampState3 = stampState42;
                    gapComposer2.updateRememberedValue(l2__externalsyntheticlambda7);
                    z8 = z6;
                    m3432StudioButtonXz6DiA(null, R.drawable.card_studio_clear, R.string.accessibility_clear, 0L, 0L, z7, booleanValue32, (Function0) l2__externalsyntheticlambda7, gapComposer2, 0, 25);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(500, z13 ? 1 : 0, null, 6);
                    if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                    }
                    final SignatureState signatureState102 = signatureState5;
                    final StampState stampState62 = stampState3;
                    State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, tween$default2, "Control Color", gapComposer2, 432, 8);
                    if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                    }
                    long j32 = j2;
                    long j42 = ((Color) m153animateColorAsStateeuL9pac2.getValue()).value;
                    if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                    }
                    boolean booleanValue42 = ((Boolean) mutableState4.getValue()).booleanValue();
                    changedInstance3 = gapComposer2.changedInstance(signatureState102) | (i6 == 2048 ? z8 : z13 ? 1 : 0) | gapComposer2.changedInstance(stampState62);
                    Object rememberedValue242 = gapComposer2.rememberedValue();
                    Object obj192 = rememberedValue242;
                    if (!changedInstance3) {
                    }
                    CardStudioViewKt$$ExternalSyntheticLambda3 cardStudioViewKt$$ExternalSyntheticLambda32 = new CardStudioViewKt$$ExternalSyntheticLambda3(function1, signatureState102, stampState62);
                    gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda32);
                    obj192 = cardStudioViewKt$$ExternalSyntheticLambda32;
                    m3432StudioButtonXz6DiA(null, R.drawable.checkmark_no_circle, R.string.accessibility_done, j42, j32, z14, booleanValue42, (Function0) obj192, gapComposer2, 0, 1);
                    gapComposer2.end(z8);
                    if (!(((double) 1.0f) > 0.0d ? z8 : z13 ? 1 : 0)) {
                    }
                    customizationMode4 = customizationMode3;
                    final MutableState mutableState162 = mutableState4;
                    final PatternStampState patternStampState52 = patternStampState2;
                    OffsetKt.BoxWithConstraints(OffsetKt.aspectRatio(1.5854232f, ZIndexModifierKt.zIndex(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z13), 1.0f), z13), null, false, Expect_jvmKt.rememberComposableLambda(1174482444, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj202, Object obj212, Object obj22) {
                            BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj202;
                            Composer composer2 = (Composer) obj212;
                            int intValue = ((Integer) obj22).intValue();
                            boxWithConstraintsScopeImpl.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                gapComposer3.startReplaceGroup(-898768983);
                                Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                                float mo236toPx0680j_4 = (density.mo236toPx0680j_4(8.0f) + density.mo235toPxR2X_6o(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium.paragraphStyle.lineHeight)) / 2.0f;
                                gapComposer3.end(false);
                                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState162.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 1.0f, AnimatableKt.tween$default(100, 0, null, 6), "Pop up Alpha", null, gapComposer3, 3120, 20);
                                MutableState mutableState172 = mutableState7;
                                float floatValue = ((Number) mutableState172.getValue()).floatValue();
                                boolean booleanValue5 = ((Boolean) mutableState10.getValue()).booleanValue();
                                CardStudioViewModel.Content content2 = CardStudioViewModel.Content.this;
                                CardStudioViewKt.ThemedCard(content2, signatureState102, signatureState7, floatValue, stampState62, patternStampState52, function3, nVar3, subtreeManager, flow, booleanValue5, gapComposer3, 295488);
                                boolean changed2 = gapComposer3.changed(mo236toPx0680j_4) | gapComposer3.changed(animateFloatAsState);
                                Object rememberedValue25 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue25 == Composer.Companion.Empty) {
                                    rememberedValue25 = new CardTransitionKt$$ExternalSyntheticLambda24(mo236toPx0680j_4, animateFloatAsState, 1);
                                    gapComposer3.updateRememberedValue(rememberedValue25);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1575936, 0, 4016, Color.White, (Composer) gapComposer3, BoxScopeInstance.INSTANCE.align(SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue25), ColorKt.Color(4281545523L), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(72.0f)), 17.0f, 8.0f, 17.0f, 8.0f), Alignment.Companion.TopCenter), ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.release_to_delete_prompt), (Map) null, (Function1) null, false);
                                AnimatedContentKt.AnimatedVisibility(content2.displayScaleBar, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), "Slider visibility animation", Expect_jvmKt.rememberComposableLambda(-350998476, new SectionKt$$ExternalSyntheticLambda2(14, content2, function1, mutableState172), gapComposer3), (Composer) gapComposer3, 1797120, 2);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 3072, 6);
                    rememberedValue = gapComposer2.rememberedValue();
                    Object obj202 = rememberedValue;
                    if (rememberedValue == neverEqualPolicy3) {
                    }
                    MutableState mutableState172 = (MutableState) obj202;
                    rememberedValue2 = gapComposer2.rememberedValue();
                    Object obj212 = rememberedValue2;
                    if (rememberedValue2 == neverEqualPolicy3) {
                    }
                    mutableState6 = (MutableState) obj212;
                    if (((Boolean) mutableState6.getValue()).booleanValue()) {
                    }
                    customizationMode5 = customizationMode4;
                    mutableState172.setValue(customizationMode5);
                    if (customizationMode5 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                    }
                    gapComposer.end(true);
                    gapComposer.end(true);
                }
            } else {
                customizationMode2 = customizationMode;
            }
            z5 = z13 ? 1 : 0;
            boolean booleanValue22 = ((Boolean) mutableState4.getValue()).booleanValue();
            changedInstance = gapComposer2.changedInstance(content);
            Object rememberedValue222 = gapComposer2.rememberedValue();
            Object obj182 = rememberedValue222;
            if (!changedInstance) {
            }
            CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda442 = new CopyCodeKt$$ExternalSyntheticLambda4(21, content, snapshotStateList6, snapshotStateList5);
            gapComposer2.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda442);
            obj182 = copyCodeKt$$ExternalSyntheticLambda442;
            m3432StudioButtonXz6DiA(null, R.drawable.card_studio_undo, R.string.accessibility_undo, 0L, 0L, z5, booleanValue22, (Function0) obj182, gapComposer2, 0, 25);
            if (customizationMode2 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
            }
            signatureState5 = signatureState8;
            z6 = true;
            z7 = z13 ? 1 : 0;
            boolean booleanValue322 = ((Boolean) mutableState4.getValue()).booleanValue();
            changedInstance2 = gapComposer2.changedInstance(signatureState5) | gapComposer2.changedInstance(stampState2) | (i6 == 2048 ? z6 : z13 ? 1 : 0);
            Object rememberedValue2322 = gapComposer2.rememberedValue();
            if (changedInstance2) {
            }
            SignatureState signatureState922 = signatureState5;
            StampState stampState422 = stampState2;
            customizationMode3 = customizationMode2;
            l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(signatureState922, stampState422, function1, snapshotStateList5, 20);
            signatureState5 = signatureState922;
            stampState3 = stampState422;
            gapComposer2.updateRememberedValue(l2__externalsyntheticlambda7);
            z8 = z6;
            m3432StudioButtonXz6DiA(null, R.drawable.card_studio_clear, R.string.accessibility_clear, 0L, 0L, z7, booleanValue322, (Function0) l2__externalsyntheticlambda7, gapComposer2, 0, 25);
            TweenSpec tween$default22 = AnimatableKt.tween$default(500, z13 ? 1 : 0, null, 6);
            if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
            }
            final SignatureState signatureState1022 = signatureState5;
            final StampState stampState622 = stampState3;
            State m153animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, tween$default22, "Control Color", gapComposer2, 432, 8);
            if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
            }
            long j322 = j2;
            long j422 = ((Color) m153animateColorAsStateeuL9pac22.getValue()).value;
            if (customizationMode3 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
            }
            boolean booleanValue422 = ((Boolean) mutableState4.getValue()).booleanValue();
            changedInstance3 = gapComposer2.changedInstance(signatureState1022) | (i6 == 2048 ? z8 : z13 ? 1 : 0) | gapComposer2.changedInstance(stampState622);
            Object rememberedValue2422 = gapComposer2.rememberedValue();
            Object obj1922 = rememberedValue2422;
            if (!changedInstance3) {
            }
            CardStudioViewKt$$ExternalSyntheticLambda3 cardStudioViewKt$$ExternalSyntheticLambda322 = new CardStudioViewKt$$ExternalSyntheticLambda3(function1, signatureState1022, stampState622);
            gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda322);
            obj1922 = cardStudioViewKt$$ExternalSyntheticLambda322;
            m3432StudioButtonXz6DiA(null, R.drawable.checkmark_no_circle, R.string.accessibility_done, j422, j322, z14, booleanValue422, (Function0) obj1922, gapComposer2, 0, 1);
            gapComposer2.end(z8);
            if (!(((double) 1.0f) > 0.0d ? z8 : z13 ? 1 : 0)) {
            }
            customizationMode4 = customizationMode3;
            final MutableState mutableState1622 = mutableState4;
            final PatternStampState patternStampState522 = patternStampState2;
            OffsetKt.BoxWithConstraints(OffsetKt.aspectRatio(1.5854232f, ZIndexModifierKt.zIndex(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z13), 1.0f), z13), null, false, Expect_jvmKt.rememberComposableLambda(1174482444, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2022, Object obj2122, Object obj22) {
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj2022;
                    Composer composer2 = (Composer) obj2122;
                    int intValue = ((Integer) obj22).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        gapComposer3.startReplaceGroup(-898768983);
                        Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                        float mo236toPx0680j_4 = (density.mo236toPx0680j_4(8.0f) + density.mo235toPxR2X_6o(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium.paragraphStyle.lineHeight)) / 2.0f;
                        gapComposer3.end(false);
                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState1622.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 1.0f, AnimatableKt.tween$default(100, 0, null, 6), "Pop up Alpha", null, gapComposer3, 3120, 20);
                        MutableState mutableState1722 = mutableState7;
                        float floatValue = ((Number) mutableState1722.getValue()).floatValue();
                        boolean booleanValue5 = ((Boolean) mutableState10.getValue()).booleanValue();
                        CardStudioViewModel.Content content2 = CardStudioViewModel.Content.this;
                        CardStudioViewKt.ThemedCard(content2, signatureState1022, signatureState7, floatValue, stampState622, patternStampState522, function3, nVar3, subtreeManager, flow, booleanValue5, gapComposer3, 295488);
                        boolean changed2 = gapComposer3.changed(mo236toPx0680j_4) | gapComposer3.changed(animateFloatAsState);
                        Object rememberedValue25 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue25 == Composer.Companion.Empty) {
                            rememberedValue25 = new CardTransitionKt$$ExternalSyntheticLambda24(mo236toPx0680j_4, animateFloatAsState, 1);
                            gapComposer3.updateRememberedValue(rememberedValue25);
                        }
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1575936, 0, 4016, Color.White, (Composer) gapComposer3, BoxScopeInstance.INSTANCE.align(SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue25), ColorKt.Color(4281545523L), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(72.0f)), 17.0f, 8.0f, 17.0f, 8.0f), Alignment.Companion.TopCenter), ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.release_to_delete_prompt), (Map) null, (Function1) null, false);
                        AnimatedContentKt.AnimatedVisibility(content2.displayScaleBar, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), "Slider visibility animation", Expect_jvmKt.rememberComposableLambda(-350998476, new SectionKt$$ExternalSyntheticLambda2(14, content2, function1, mutableState1722), gapComposer3), (Composer) gapComposer3, 1797120, 2);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer2, 3072, 6);
            rememberedValue = gapComposer2.rememberedValue();
            Object obj2022 = rememberedValue;
            if (rememberedValue == neverEqualPolicy3) {
            }
            MutableState mutableState1722 = (MutableState) obj2022;
            rememberedValue2 = gapComposer2.rememberedValue();
            Object obj2122 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy3) {
            }
            mutableState6 = (MutableState) obj2122;
            if (((Boolean) mutableState6.getValue()).booleanValue()) {
            }
            customizationMode5 = customizationMode4;
            mutableState1722.setValue(customizationMode5);
            if (customizationMode5 instanceof CardStudioViewModel.CustomizationMode.Pattern) {
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(modifier, (Object) flow, (Object) content, (Object) function1, (Object) errorReporter, i, 14);
        }
    }

    /* renamed from: ClipStudioButton-X-z6DiA, reason: not valid java name */
    public static final void m3430ClipStudioButtonXz6DiA(Modifier modifier, int i, int i2, long j, long j2, boolean z, boolean z2, Function0 function0, Composer composer, int i3, int i4) {
        int i5;
        long j3;
        GapComposer gapComposer;
        Modifier modifier2;
        long j4;
        long j5;
        long j6;
        int i6;
        int i7;
        long j7;
        long j8;
        Modifier modifier3;
        long j9;
        int i8;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1025816393);
        int i9 = i4 & 1;
        if (i9 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (gapComposer2.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer2.changed(i) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0 && gapComposer2.changed(j)) {
                i8 = 2048;
                i5 |= i8;
            }
            i8 = 1024;
            i5 |= i8;
        }
        if ((i3 & 24576) == 0) {
            j3 = j2;
            i5 |= ((i4 & 16) == 0 && gapComposer2.changed(j3)) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            j3 = j2;
        }
        if ((196608 & i3) == 0) {
            i5 |= gapComposer2.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i3) == 0) {
            i5 |= gapComposer2.changedInstance(function0) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (4793491 & i5) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i3 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                if ((i4 & 8) != 0) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j6 = colors.component.button.standard.background.f163default;
                    i5 &= -7169;
                } else {
                    j6 = j;
                }
                if ((i4 & 16) != 0) {
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    i6 = -1762997026;
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j3 = colors2.component.button.standard.text.f165default;
                    i5 &= -57345;
                } else {
                    i6 = -1762997026;
                }
                i7 = i5;
                j7 = j6;
                j8 = j3;
                modifier3 = modifier4;
            } else {
                gapComposer2.skipToGroupEnd();
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
                i7 = i5;
                i6 = -1762997026;
                j8 = j3;
                modifier3 = modifier;
                j7 = j;
            }
            gapComposer2.endDefaults();
            boolean z3 = (3670016 & i7) == 1048576;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda24(z2, 7);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            long j10 = j7;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m287sizeVpY3zN4(ColorKt.graphicsLayer(modifier3, (Function1) rememberedValue), PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.pattern_card_studio_icon_width), PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.pattern_card_studio_clip_icon_height)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), j7, ColorKt.RectangleShape), z, null, null, function0, 14);
            Painter painterResource = Countries.painterResource(i, (i7 >> 3) & 14, gapComposer2);
            String stringResource = Room.stringResource(gapComposer2, i2);
            TweenSpec tween$default = AnimatableKt.tween$default(100, 0, null, 6);
            if (z) {
                gapComposer2.startReplaceGroup(2032959746);
                gapComposer2.end(false);
                j9 = j8;
            } else {
                gapComposer2.startReplaceGroup(2032962335);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, i6, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j9 = colors3.component.button.standard.text.disabled;
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            long j11 = ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j9, tween$default, "Control Color", gapComposer2, 432, 8).getValue()).value;
            ImageKt.Image(painterResource, stringResource, m183clickableoSLSa3U$default, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j11, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j11), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24576, 40);
            modifier2 = modifier3;
            j5 = j8;
            j4 = j10;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j4 = j;
            j5 = j3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda20(modifier2, i, i2, j4, j5, z, z2, function0, i3, i4, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v50, types: [androidx.compose.ui.Modifier] */
    public static final void CustomizationButtonColumn(CardStudioViewModel.Content content, boolean z, boolean z2, boolean z3, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        State state;
        Animatable animatable;
        Object passcodePresenter$models$3$1;
        MutableFloatState mutableFloatState3;
        Animatable animatable2;
        State state2;
        State state3;
        MutableFloatState mutableFloatState4;
        MutableFloatState mutableFloatState5;
        Animatable animatable3;
        MutableState mutableState;
        Modifier.Companion companion;
        Animatable animatable4;
        State state4;
        Modifier modifier;
        Animatable animatable5;
        boolean z4;
        Modifier modifier2;
        int i3;
        char c;
        Modifier.Companion companion2;
        boolean z5;
        long j;
        CardStudioViewModel.CustomizationMode.DRAW draw;
        CardStudioViewModel.CustomizationMode customizationMode;
        long j2;
        long j3;
        long j4;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        long j5;
        long j6;
        int i5;
        int i6;
        CardStudioViewModel.CustomizationMode customizationMode2 = content.customizationMode;
        boolean z9 = content.isShowingCustomization;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-380727067);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Animatable animatable6 = (Animatable) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable7 = (Animatable) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable8 = (Animatable) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableFloatState mutableFloatState6 = (MutableFloatState) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableFloatState mutableFloatState7 = (MutableFloatState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == obj) {
                rememberedValue6 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda21(mutableFloatState7, mutableFloatState6, 3));
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            State state5 = (State) rememberedValue6;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            MutableFloatState mutableFloatState8 = (MutableFloatState) rememberedValue7;
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == obj) {
                rememberedValue8 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            MutableFloatState mutableFloatState9 = (MutableFloatState) rememberedValue8;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj) {
                rememberedValue9 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda21(mutableFloatState9, mutableFloatState8, 4));
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            State state6 = (State) rememberedValue9;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (rememberedValue10 == obj) {
                rememberedValue10 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            MutableFloatState mutableFloatState10 = (MutableFloatState) rememberedValue10;
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (rememberedValue11 == obj) {
                rememberedValue11 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            MutableFloatState mutableFloatState11 = (MutableFloatState) rememberedValue11;
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (rememberedValue12 == obj) {
                mutableFloatState = mutableFloatState7;
                rememberedValue12 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda21(mutableFloatState11, mutableFloatState10, 5));
                gapComposer2.updateRememberedValue(rememberedValue12);
            } else {
                mutableFloatState = mutableFloatState7;
            }
            State state7 = (State) rememberedValue12;
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (rememberedValue13 == obj) {
                mutableFloatState2 = mutableFloatState6;
                state = state7;
                rememberedValue13 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue13);
            } else {
                mutableFloatState2 = mutableFloatState6;
                state = state7;
            }
            Animatable animatable9 = (Animatable) rememberedValue13;
            int i7 = i2 & 7168;
            boolean z10 = i7 == 2048;
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (z10 || rememberedValue14 == obj) {
                rememberedValue14 = Recorder$$ExternalSyntheticOutline1.m(!z3, gapComposer2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue14;
            int i8 = i2;
            Boolean valueOf = Boolean.valueOf(z3);
            boolean changedInstance = (i7 == 2048) | gapComposer2.changedInstance(animatable6) | gapComposer2.changedInstance(animatable7) | gapComposer2.changedInstance(animatable9) | gapComposer2.changed(mutableState2) | gapComposer2.changedInstance(animatable8);
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue15 == obj) {
                animatable = animatable6;
                mutableFloatState3 = mutableFloatState11;
                animatable2 = animatable8;
                state2 = state6;
                state3 = state;
                mutableFloatState4 = mutableFloatState10;
                mutableFloatState5 = mutableFloatState;
                passcodePresenter$models$3$1 = new PasscodePresenter$models$3$1(z3, animatable, animatable7, animatable9, mutableState2, animatable2, null);
                animatable3 = animatable9;
                mutableState = mutableState2;
                gapComposer2.updateRememberedValue(passcodePresenter$models$3$1);
            } else {
                animatable = animatable6;
                passcodePresenter$models$3$1 = rememberedValue15;
                mutableState = mutableState2;
                mutableFloatState3 = mutableFloatState11;
                animatable3 = animatable9;
                animatable2 = animatable8;
                state2 = state6;
                mutableFloatState5 = mutableFloatState;
                state3 = state;
                mutableFloatState4 = mutableFloatState10;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) passcodePresenter$models$3$1);
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight);
            ComposeUiNode.Companion.getClass();
            Animatable animatable10 = animatable;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            MutableFloatState mutableFloatState12 = mutableFloatState5;
            Modifier fillMaxHeight2 = SizeKt.fillMaxHeight(companion3, 1.0f);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceAround;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer2, 54);
            Animatable animatable11 = animatable3;
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight2);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i9 = content.isShowingCashtag ? R.drawable.card_studio_cashtag_on : R.drawable.card_studio_cashtag_off;
            if (z3) {
                gapComposer2.startReplaceGroup(-1285164274);
                animatable4 = animatable11;
                boolean changedInstance2 = gapComposer2.changedInstance(animatable4) | gapComposer2.changedInstance(animatable7);
                Object rememberedValue16 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue16 == obj) {
                    state4 = state5;
                    rememberedValue16 = new CardStudioViewKt$$ExternalSyntheticLambda23(animatable4, animatable7, state4, 3);
                    gapComposer2.updateRememberedValue(rememberedValue16);
                } else {
                    state4 = state5;
                }
                companion = companion3;
                modifier = ColorKt.graphicsLayer(companion, (Function1) rememberedValue16);
                gapComposer2.end(false);
            } else {
                companion = companion3;
                animatable4 = animatable11;
                state4 = state5;
                gapComposer2.startReplaceGroup(-1284985373);
                gapComposer2.end(false);
                modifier = companion;
            }
            if (z && content.isShowingCashtagButton) {
                animatable5 = animatable10;
                z4 = true;
            } else {
                animatable5 = animatable10;
                z4 = false;
            }
            int i10 = i8 & 57344;
            Animatable animatable12 = animatable4;
            boolean z11 = i10 == 16384;
            Object rememberedValue17 = gapComposer2.rememberedValue();
            if (z11 || rememberedValue17 == obj) {
                modifier2 = modifier;
                i3 = i10;
                rememberedValue17 = new DisclosureView$$ExternalSyntheticLambda1(15, function1);
                gapComposer2.updateRememberedValue(rememberedValue17);
            } else {
                modifier2 = modifier;
                i3 = i10;
            }
            int i11 = i8 << 12;
            int i12 = i11 & 3670016;
            Modifier.Companion companion4 = companion;
            Animatable animatable13 = animatable5;
            Animatable animatable14 = animatable2;
            int i13 = i3;
            m3430ClipStudioButtonXz6DiA(modifier2, i9, R.string.accessibility_customization_settings, 0L, 0L, z4, z2, (Function0) rememberedValue17, gapComposer2, i12, 24);
            if (z3) {
                gapComposer2.startReplaceGroup(-1284554659);
                Object rememberedValue18 = gapComposer2.rememberedValue();
                if (rememberedValue18 == obj) {
                    rememberedValue18 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState12, 13);
                    gapComposer2.updateRememberedValue(rememberedValue18);
                }
                Modifier onPlaced = RulerKt.onPlaced(companion4, (Function1) rememberedValue18);
                boolean changedInstance3 = gapComposer2.changedInstance(animatable12) | gapComposer2.changedInstance(animatable14);
                Object rememberedValue19 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue19 == obj) {
                    c = 4;
                    rememberedValue19 = new CardStudioViewKt$$ExternalSyntheticLambda23(animatable12, animatable14, state4, 4);
                    gapComposer2.updateRememberedValue(rememberedValue19);
                } else {
                    c = 4;
                }
                ?? graphicsLayer = ColorKt.graphicsLayer(onPlaced, (Function1) rememberedValue19);
                gapComposer2.end(false);
                companion2 = graphicsLayer;
            } else {
                c = 4;
                gapComposer2.startReplaceGroup(-1284297917);
                gapComposer2.end(false);
                companion2 = companion4;
            }
            boolean z12 = z && z9;
            boolean z13 = i13 == 16384;
            Object rememberedValue20 = gapComposer2.rememberedValue();
            if (z13 || rememberedValue20 == obj) {
                rememberedValue20 = new DisclosureView$$ExternalSyntheticLambda1(16, function1);
                gapComposer2.updateRememberedValue(rememberedValue20);
            }
            m3432StudioButtonXz6DiA(companion2, R.drawable.card_studio_pattern, R.string.accessibility_toggle_pattern_personalization, 0L, 0L, z12, z2, (Function0) rememberedValue20, gapComposer2, i12, 24);
            CardStudioViewModel.CustomizationMode.DRAW draw2 = CardStudioViewModel.CustomizationMode.DRAW.INSTANCE;
            if (Intrinsics.areEqual(customizationMode2, draw2) && z9) {
                gapComposer2.startReplaceGroup(-1283795438);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                z5 = false;
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.component.button.standard.text.f165default;
                gapComposer2.end(false);
            } else {
                z5 = false;
                gapComposer2.startReplaceGroup(-1283710932);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.component.button.standard.background.f163default;
                gapComposer2.end(false);
            }
            if (Intrinsics.areEqual(customizationMode2, draw2) && z9) {
                gapComposer2.startReplaceGroup(-1283515663);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                draw = draw2;
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z5);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(z5);
                }
                customizationMode = customizationMode2;
                j2 = colors3.component.button.prominent.text.f162default;
                gapComposer2.end(z5);
            } else {
                draw = draw2;
                customizationMode = customizationMode2;
                gapComposer2.startReplaceGroup(-1283430382);
                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z5);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(z5);
                }
                j2 = colors4.component.button.standard.text.f165default;
                gapComposer2.end(z5);
            }
            Modifier alpha = AlphaKt.alpha(companion4, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
            Object rememberedValue21 = gapComposer2.rememberedValue();
            if (rememberedValue21 == obj) {
                j3 = j2;
                rememberedValue21 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState9, 14);
                gapComposer2.updateRememberedValue(rememberedValue21);
            } else {
                j3 = j2;
            }
            Modifier onPlaced2 = RulerKt.onPlaced(alpha, (Function1) rememberedValue21);
            if (z && z9) {
                j4 = j3;
                z6 = true;
            } else {
                j4 = j3;
                z6 = false;
            }
            boolean changedInstance4 = gapComposer2.changedInstance(content) | (i13 == 16384);
            Object rememberedValue22 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue22 == obj) {
                rememberedValue22 = new CardStudioViewKt$$ExternalSyntheticLambda41(content, function1, 3);
                gapComposer2.updateRememberedValue(rememberedValue22);
            }
            m3432StudioButtonXz6DiA(onPlaced2, R.drawable.card_studio_draw, R.string.accessibility_draw_mode, j, j4, z6, z2, (Function0) rememberedValue22, gapComposer2, i12, 0);
            Modifier alpha2 = AlphaKt.alpha(companion4, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
            Object rememberedValue23 = gapComposer2.rememberedValue();
            if (rememberedValue23 == obj) {
                rememberedValue23 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState3, 10);
                gapComposer2.updateRememberedValue(rememberedValue23);
            }
            Modifier onPlaced3 = RulerKt.onPlaced(alpha2, (Function1) rememberedValue23);
            boolean z14 = z && z9;
            boolean changedInstance5 = (i13 == 16384) | gapComposer2.changedInstance(content);
            Object rememberedValue24 = gapComposer2.rememberedValue();
            if (changedInstance5 || rememberedValue24 == obj) {
                i4 = 2;
                rememberedValue24 = new CardStudioViewKt$$ExternalSyntheticLambda41(function1, content, 2);
                gapComposer2.updateRememberedValue(rememberedValue24);
            } else {
                i4 = 2;
            }
            m3432StudioButtonXz6DiA(onPlaced3, R.drawable.card_studio_stamp, R.string.accessibility_add_stamp, 0L, 0L, z14, z2, (Function0) rememberedValue24, gapComposer2, i12, 24);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                z7 = true;
                gapComposer.startReplaceGroup(-1585086025);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1587938273);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                Modifier fillMaxHeight3 = SizeKt.fillMaxHeight(companion4, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 54);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxHeight3);
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                boolean changed = gapComposer.changed(density);
                Object rememberedValue25 = gapComposer.rememberedValue();
                if (changed || rememberedValue25 == obj) {
                    rememberedValue25 = new CardStudioViewKt$$ExternalSyntheticLambda37(density, mutableFloatState2, 1);
                    gapComposer.updateRememberedValue(rememberedValue25);
                }
                Modifier onPlaced4 = RulerKt.onPlaced(companion4, (Function1) rememberedValue25);
                boolean changedInstance6 = gapComposer.changedInstance(animatable12) | gapComposer.changedInstance(animatable13);
                Object rememberedValue26 = gapComposer.rememberedValue();
                if (changedInstance6 || rememberedValue26 == obj) {
                    rememberedValue26 = new CardStudioViewKt$$ExternalSyntheticLambda23(animatable12, animatable13, state4, i4);
                    gapComposer.updateRememberedValue(rememberedValue26);
                }
                Modifier graphicsLayer2 = ColorKt.graphicsLayer(onPlaced4, (Function1) rememberedValue26);
                long j7 = Strings.getColors(gapComposer).component.button.prominent.background.f160default;
                long j8 = Strings.getColors(gapComposer).component.button.prominent.text.f162default;
                Object rememberedValue27 = gapComposer.rememberedValue();
                if (rememberedValue27 == obj) {
                    z8 = true;
                    rememberedValue27 = new CardScene$$ExternalSyntheticLambda1(1);
                    gapComposer.updateRememberedValue(rememberedValue27);
                } else {
                    z8 = true;
                }
                CardStudioViewModel.CustomizationMode.DRAW draw3 = draw;
                CardStudioViewModel.CustomizationMode customizationMode3 = customizationMode;
                m3430ClipStudioButtonXz6DiA(graphicsLayer2, R.drawable.card_studio_pattern_done, R.string.accessibility_customization_settings, j7, j8, z, z2, (Function0) rememberedValue27, gapComposer, (i11 & 458752) | 12582912 | i12, 0);
                if (Intrinsics.areEqual(customizationMode3, draw3) && z9) {
                    gapComposer.startReplaceGroup(-436149709);
                    j5 = Strings.getColors(gapComposer).component.button.standard.text.f165default;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-436061235);
                    j5 = Strings.getColors(gapComposer).component.button.standard.background.f163default;
                    gapComposer.end(false);
                }
                long j9 = j5;
                if (Intrinsics.areEqual(customizationMode3, draw3) && z9) {
                    gapComposer.startReplaceGroup(-435858030);
                    j6 = Strings.getColors(gapComposer).component.button.prominent.text.f162default;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-435768781);
                    j6 = Strings.getColors(gapComposer).component.button.standard.text.f165default;
                    gapComposer.end(false);
                }
                long j10 = j6;
                Object rememberedValue28 = gapComposer.rememberedValue();
                if (rememberedValue28 == obj) {
                    rememberedValue28 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState8, 11);
                    gapComposer.updateRememberedValue(rememberedValue28);
                }
                Modifier onPlaced5 = RulerKt.onPlaced(companion4, (Function1) rememberedValue28);
                boolean changedInstance7 = gapComposer.changedInstance(animatable12);
                Object rememberedValue29 = gapComposer.rememberedValue();
                if (changedInstance7 || rememberedValue29 == obj) {
                    i5 = 2;
                    rememberedValue29 = new CardStudioViewKt$$ExternalSyntheticLambda29(animatable12, state2, 2);
                    gapComposer.updateRememberedValue(rememberedValue29);
                } else {
                    i5 = 2;
                }
                Modifier graphicsLayer3 = ColorKt.graphicsLayer(onPlaced5, (Function1) rememberedValue29);
                boolean z15 = z && z9;
                Object rememberedValue30 = gapComposer.rememberedValue();
                if (rememberedValue30 == obj) {
                    rememberedValue30 = new CardScene$$ExternalSyntheticLambda1(i5);
                    gapComposer.updateRememberedValue(rememberedValue30);
                }
                int i14 = i12 | 12582912;
                gapComposer = gapComposer;
                m3432StudioButtonXz6DiA(graphicsLayer3, R.drawable.card_studio_draw, R.string.accessibility_draw_mode, j9, j10, z15, z2, (Function0) rememberedValue30, gapComposer, i14, 0);
                Object rememberedValue31 = gapComposer.rememberedValue();
                if (rememberedValue31 == obj) {
                    rememberedValue31 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState4, 12);
                    gapComposer.updateRememberedValue(rememberedValue31);
                }
                Modifier onPlaced6 = RulerKt.onPlaced(companion4, (Function1) rememberedValue31);
                boolean changedInstance8 = gapComposer.changedInstance(animatable12);
                Object rememberedValue32 = gapComposer.rememberedValue();
                if (changedInstance8 || rememberedValue32 == obj) {
                    i6 = 3;
                    rememberedValue32 = new CardStudioViewKt$$ExternalSyntheticLambda29(animatable12, state3, 3);
                    gapComposer.updateRememberedValue(rememberedValue32);
                } else {
                    i6 = 3;
                }
                Modifier graphicsLayer4 = ColorKt.graphicsLayer(onPlaced6, (Function1) rememberedValue32);
                boolean z16 = z && z9;
                Object rememberedValue33 = gapComposer.rememberedValue();
                if (rememberedValue33 == obj) {
                    rememberedValue33 = new CardScene$$ExternalSyntheticLambda1(i6);
                    gapComposer.updateRememberedValue(rememberedValue33);
                }
                m3432StudioButtonXz6DiA(graphicsLayer4, R.drawable.card_studio_stamp, R.string.accessibility_add_stamp, 0L, 0L, z16, z2, (Function0) rememberedValue33, gapComposer, i14, 24);
                Modifier alpha3 = AlphaKt.alpha(companion4, ((Number) animatable13.getValue()).floatValue());
                boolean z17 = z && z9;
                Object rememberedValue34 = gapComposer.rememberedValue();
                if (rememberedValue34 == obj) {
                    rememberedValue34 = new CardScene$$ExternalSyntheticLambda1(4);
                    gapComposer.updateRememberedValue(rememberedValue34);
                }
                m3432StudioButtonXz6DiA(alpha3, R.drawable.pattern_card_studio_slider, R.string.accessibility_toggle_pattern_personalization, 0L, 0L, z17, z2, (Function0) rememberedValue34, gapComposer, i14, 24);
                z7 = true;
                gapComposer.end(true);
                gapComposer.end(false);
            }
            gapComposer.end(z7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda60(content, z, z2, z3, function1, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x03eb, code lost:
    
        if (r14 == r13) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x045f, code lost:
    
        if (r5.changedInstance(r64) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x047a, code lost:
    
        if (r5.changedInstance(r65) != false) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x068b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0705 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0804 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0819 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0481  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PatternCustomizationColumn(CardStudioViewModel.Content content, final SignatureState signatureState, final PatternStampState patternStampState, final PatternStateListener patternStateListener, final boolean z, final boolean z2, final float f, Function1 function1, Composer composer, final int i) {
        int i2;
        CardStudioViewModel.Content content2;
        GapComposer gapComposer;
        boolean z3;
        Object obj;
        MutableFloatState mutableFloatState;
        Object obj2;
        State state;
        Object obj3;
        MutableFloatState mutableFloatState2;
        State state2;
        Object obj4;
        Animatable animatable;
        Animatable animatable2;
        long j;
        long j2;
        NeverEqualPolicy neverEqualPolicy;
        Object obj5;
        MutableFloatState mutableFloatState3;
        MutableFloatState mutableFloatState4;
        Object obj6;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        Object rememberedValue;
        MutableFloatState mutableFloatState5;
        Animatable animatable3;
        int i4;
        Density density;
        BiasAlignment.Horizontal horizontal;
        MutableFloatState mutableFloatState6;
        MutableFloatState mutableFloatState7;
        State state3;
        State state4;
        MutableFloatState mutableFloatState8;
        Applier applier;
        NeverEqualPolicy neverEqualPolicy2;
        CardStudioViewModel.CustomizationMode.Pattern.DRAW draw;
        NeverEqualPolicy neverEqualPolicy3;
        int i5;
        boolean z7;
        Colors colors;
        long j3;
        boolean z8;
        Colors colors2;
        long j4;
        Object rememberedValue2;
        NeverEqualPolicy neverEqualPolicy4;
        State state5;
        Object obj7;
        boolean changedInstance;
        Object rememberedValue3;
        CardStudioViewModel.CustomizationMode.Pattern.DRAW draw2;
        Object obj8;
        boolean changedInstance2;
        boolean z9;
        long j5;
        long j6;
        long j7;
        boolean z10;
        boolean z11;
        State state6;
        boolean z12;
        long j8;
        long j9;
        Colors colors3;
        Function1 function12 = function1;
        CardStudioViewModel.CustomizationMode customizationMode = content.customizationMode;
        boolean z13 = content.displayScaleBar;
        boolean z14 = content.isShowingCustomization;
        signatureState.getClass();
        patternStateListener.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(929270941);
        Applier applier2 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer2.changed(signatureState) : gapComposer2.changedInstance(signatureState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(patternStampState) : gapComposer2.changedInstance(patternStampState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(patternStateListener) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer2.changed(f) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 4793491) != 4793490)) {
            Object rememberedValue4 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy5 = Composer.Companion.Empty;
            Object obj9 = rememberedValue4;
            if (rememberedValue4 == neverEqualPolicy5) {
                Animatable Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(Animatable);
                obj9 = Animatable;
            }
            Animatable animatable4 = (Animatable) obj9;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj10 = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy5) {
                Animatable Animatable2 = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer2.updateRememberedValue(Animatable2);
                obj10 = Animatable2;
            }
            Animatable animatable5 = (Animatable) obj10;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            Object obj11 = rememberedValue6;
            if (rememberedValue6 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf);
                obj11 = mutableFloatStateOf;
            }
            MutableFloatState mutableFloatState9 = (MutableFloatState) obj11;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            Object obj12 = rememberedValue7;
            if (rememberedValue7 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf2 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf2);
                obj12 = mutableFloatStateOf2;
            }
            MutableFloatState mutableFloatState10 = (MutableFloatState) obj12;
            Object rememberedValue8 = gapComposer2.rememberedValue();
            Object obj13 = rememberedValue8;
            if (rememberedValue8 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf3 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf3);
                obj13 = mutableFloatStateOf3;
            }
            MutableFloatState mutableFloatState11 = (MutableFloatState) obj13;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == neverEqualPolicy5) {
                z3 = z14;
                DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda21(mutableFloatState11, mutableFloatState10, 0));
                gapComposer2.updateRememberedValue(derivedStateOf);
                obj = derivedStateOf;
            } else {
                z3 = z14;
                obj = rememberedValue9;
            }
            State state7 = (State) obj;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            Object obj14 = rememberedValue10;
            if (rememberedValue10 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf4 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf4);
                obj14 = mutableFloatStateOf4;
            }
            MutableFloatState mutableFloatState12 = (MutableFloatState) obj14;
            int i6 = i2;
            Object rememberedValue11 = gapComposer2.rememberedValue();
            Object obj15 = rememberedValue11;
            if (rememberedValue11 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf5 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf5);
                obj15 = mutableFloatStateOf5;
            }
            MutableFloatState mutableFloatState13 = (MutableFloatState) obj15;
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (rememberedValue12 == neverEqualPolicy5) {
                mutableFloatState = mutableFloatState10;
                DerivedSnapshotState derivedStateOf2 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda21(mutableFloatState13, mutableFloatState12, 1));
                gapComposer2.updateRememberedValue(derivedStateOf2);
                obj2 = derivedStateOf2;
            } else {
                mutableFloatState = mutableFloatState10;
                obj2 = rememberedValue12;
            }
            State state8 = (State) obj2;
            Object rememberedValue13 = gapComposer2.rememberedValue();
            Object obj16 = rememberedValue13;
            if (rememberedValue13 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf6 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf6);
                obj16 = mutableFloatStateOf6;
            }
            MutableFloatState mutableFloatState14 = (MutableFloatState) obj16;
            Object rememberedValue14 = gapComposer2.rememberedValue();
            Object obj17 = rememberedValue14;
            if (rememberedValue14 == neverEqualPolicy5) {
                ParcelableSnapshotMutableFloatState mutableFloatStateOf7 = Updater.mutableFloatStateOf();
                gapComposer2.updateRememberedValue(mutableFloatStateOf7);
                obj17 = mutableFloatStateOf7;
            }
            MutableFloatState mutableFloatState15 = (MutableFloatState) obj17;
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy5) {
                state = state8;
                DerivedSnapshotState derivedStateOf3 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda21(mutableFloatState15, mutableFloatState14, 2));
                gapComposer2.updateRememberedValue(derivedStateOf3);
                obj3 = derivedStateOf3;
            } else {
                state = state8;
                obj3 = rememberedValue15;
            }
            State state9 = (State) obj3;
            Object rememberedValue16 = gapComposer2.rememberedValue();
            if (rememberedValue16 == neverEqualPolicy5) {
                mutableFloatState2 = mutableFloatState15;
                state2 = state7;
                Animatable Animatable3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(Animatable3);
                obj4 = Animatable3;
            } else {
                mutableFloatState2 = mutableFloatState15;
                state2 = state7;
                obj4 = rememberedValue16;
            }
            Animatable animatable6 = (Animatable) obj4;
            Object rememberedValue17 = gapComposer2.rememberedValue();
            Object obj18 = rememberedValue17;
            if (rememberedValue17 == neverEqualPolicy5) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(mutableStateOf$default);
                obj18 = mutableStateOf$default;
            }
            MutableState mutableState = (MutableState) obj18;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance3 = gapComposer2.changedInstance(animatable4) | gapComposer2.changedInstance(animatable5) | gapComposer2.changedInstance(animatable6);
            Object rememberedValue18 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue18 == neverEqualPolicy5) {
                animatable = animatable4;
                animatable2 = animatable6;
                rememberedValue18 = new MoleculeKt$immediateClockFlow$1$1$1(animatable, animatable5, animatable2, mutableState, (Continuation) null, 9);
                gapComposer2.updateRememberedValue(rememberedValue18);
            } else {
                animatable = animatable4;
                animatable2 = animatable6;
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue18);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier2 == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Density density2 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            Modifier fillMaxHeight2 = SizeKt.fillMaxHeight(companion, 1.0f);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceAround;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal2, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight2);
            if (applier2 == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            TweenSpec tween$default = AnimatableKt.tween$default(100, 0, null, 6);
            if (z13) {
                gapComposer2.startReplaceGroup(-1583971708);
                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors4.component.button.standard.background.f163default;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1583873469);
                Colors colors5 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors5.component.button.prominent.background.f160default;
                gapComposer2.end(false);
            }
            Animatable animatable7 = animatable2;
            MutableFloatState mutableFloatState16 = mutableFloatState;
            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, tween$default, "Pattern mode done button background color", gapComposer2, 432, 8);
            TweenSpec tween$default2 = AnimatableKt.tween$default(100, 0, null, 6);
            if (z13) {
                gapComposer2.startReplaceGroup(-1583523510);
                Colors colors6 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors6.component.button.standard.text.f165default;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1583431223);
                Colors colors7 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors7 == null) {
                    colors7 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors7.component.button.prominent.text.f162default;
                gapComposer2.end(false);
            }
            State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j2, tween$default2, "Pattern mode done button filter color", gapComposer2, 432, 8);
            boolean changed = gapComposer2.changed(density2);
            Object rememberedValue19 = gapComposer2.rememberedValue();
            if (changed) {
                neverEqualPolicy = neverEqualPolicy5;
            } else {
                neverEqualPolicy = neverEqualPolicy5;
                obj5 = rememberedValue19;
            }
            CardStudioViewKt$$ExternalSyntheticLambda37 cardStudioViewKt$$ExternalSyntheticLambda37 = new CardStudioViewKt$$ExternalSyntheticLambda37(density2, mutableFloatState11, 0);
            gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda37);
            obj5 = cardStudioViewKt$$ExternalSyntheticLambda37;
            Modifier onPlaced = RulerKt.onPlaced(companion, (Function1) obj5);
            boolean changedInstance4 = gapComposer2.changedInstance(animatable7);
            Object rememberedValue20 = gapComposer2.rememberedValue();
            int i7 = 9;
            if (changedInstance4 || rememberedValue20 == neverEqualPolicy) {
                mutableFloatState3 = mutableFloatState16;
                mutableFloatState4 = mutableFloatState9;
                BorrowHomeKt$$ExternalSyntheticLambda1 borrowHomeKt$$ExternalSyntheticLambda1 = new BorrowHomeKt$$ExternalSyntheticLambda1(i7, animatable7, mutableFloatState4);
                gapComposer2.updateRememberedValue(borrowHomeKt$$ExternalSyntheticLambda1);
                obj6 = borrowHomeKt$$ExternalSyntheticLambda1;
            } else {
                mutableFloatState3 = mutableFloatState16;
                mutableFloatState4 = mutableFloatState9;
                obj6 = rememberedValue20;
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(onPlaced, (Function1) obj6);
            long j10 = ((Color) m153animateColorAsStateeuL9pac.getValue()).value;
            long j11 = ((Color) m153animateColorAsStateeuL9pac2.getValue()).value;
            boolean z15 = z && !z13;
            boolean changedInstance5 = gapComposer2.changedInstance(patternStateListener);
            if ((i6 & 112) != 32) {
                if ((i6 & 64) != 0) {
                }
                z4 = false;
                boolean z16 = changedInstance5 | z4;
                if ((i6 & 896) != 256) {
                    if ((i6 & 512) != 0) {
                    }
                    z5 = false;
                    boolean z17 = z16 | z5;
                    i3 = 29360128 & i6;
                    z6 = (i3 == 8388608) | z17 | ((i6 & 3670016) == 1048576);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!z6 || rememberedValue == neverEqualPolicy) {
                        mutableFloatState5 = mutableFloatState2;
                        animatable3 = animatable7;
                        i4 = i3;
                        density = density2;
                        horizontal = horizontal2;
                        mutableFloatState6 = mutableFloatState12;
                        mutableFloatState7 = mutableFloatState13;
                        state3 = state9;
                        state4 = state;
                        mutableFloatState8 = mutableFloatState14;
                        function12 = function1;
                        applier = applier2;
                        SliderKt$$ExternalSyntheticLambda6 sliderKt$$ExternalSyntheticLambda6 = new SliderKt$$ExternalSyntheticLambda6(patternStateListener, signatureState, patternStampState, function12, f);
                        gapComposer2.updateRememberedValue(sliderKt$$ExternalSyntheticLambda6);
                        rememberedValue = sliderKt$$ExternalSyntheticLambda6;
                    } else {
                        mutableFloatState5 = mutableFloatState2;
                        animatable3 = animatable7;
                        i4 = i3;
                        density = density2;
                        horizontal = horizontal2;
                        mutableFloatState6 = mutableFloatState12;
                        mutableFloatState7 = mutableFloatState13;
                        state3 = state9;
                        state4 = state;
                        mutableFloatState8 = mutableFloatState14;
                        function12 = function1;
                        applier = applier2;
                    }
                    int i8 = (i6 << 3) & 3670016;
                    neverEqualPolicy2 = neverEqualPolicy;
                    m3430ClipStudioButtonXz6DiA(graphicsLayer, R.drawable.card_studio_pattern_done, R.string.accessibility_customization_settings, j10, j11, z15, z2, (Function0) rememberedValue, gapComposer2, i8, 0);
                    TweenSpec tween$default3 = AnimatableKt.tween$default(100, 0, null, 6);
                    draw = CardStudioViewModel.CustomizationMode.Pattern.DRAW.INSTANCE;
                    if (Intrinsics.areEqual(customizationMode, draw) || !z3 || z13) {
                        neverEqualPolicy3 = neverEqualPolicy2;
                        i5 = -1762997739;
                        z7 = false;
                        gapComposer2.startReplaceGroup(-1582036316);
                        colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j3 = colors.component.button.standard.background.f163default;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1582128758);
                        Colors colors8 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors8 == null) {
                            z7 = false;
                            colors8 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                            i5 = -1762997739;
                        } else {
                            i5 = -1762997739;
                            z7 = false;
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        neverEqualPolicy3 = neverEqualPolicy2;
                        j3 = colors8.component.button.standard.text.f165default;
                        gapComposer2.end(z7);
                    }
                    z8 = z7;
                    long j12 = j3;
                    int i9 = i5;
                    State m153animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j12, tween$default3, "Draw mode button background color", gapComposer2, 432, 8);
                    TweenSpec tween$default4 = AnimatableKt.tween$default(100, z8 ? 1 : 0, null, 6);
                    if (Intrinsics.areEqual(customizationMode, draw) || !z3 || z13) {
                        gapComposer2.startReplaceGroup(-1581468086);
                        colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z8);
                        } else {
                            gapComposer2.startReplaceGroup(i9);
                            gapComposer2.end(z8);
                        }
                        j4 = colors2.component.button.standard.text.f165default;
                        gapComposer2.end(z8);
                    } else {
                        gapComposer2.startReplaceGroup(-1581561303);
                        Colors colors9 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors9 == null) {
                            colors9 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z8);
                        } else {
                            gapComposer2.startReplaceGroup(i9);
                            gapComposer2.end(z8);
                        }
                        j4 = colors9.component.button.prominent.text.f162default;
                        gapComposer2.end(z8);
                    }
                    State m153animateColorAsStateeuL9pac4 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j4, tween$default4, "Draw mode button filter color", gapComposer2, 432, 8);
                    Modifier alpha = AlphaKt.alpha(companion, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
                    rememberedValue2 = gapComposer2.rememberedValue();
                    neverEqualPolicy4 = neverEqualPolicy3;
                    if (rememberedValue2 == neverEqualPolicy4) {
                        state5 = m153animateColorAsStateeuL9pac4;
                        HeroCardViewKt$$ExternalSyntheticLambda33 heroCardViewKt$$ExternalSyntheticLambda33 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState7, 8);
                        gapComposer2.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda33);
                        obj7 = heroCardViewKt$$ExternalSyntheticLambda33;
                    } else {
                        state5 = m153animateColorAsStateeuL9pac4;
                        obj7 = rememberedValue2;
                    }
                    Modifier onPlaced2 = RulerKt.onPlaced(alpha, (Function1) obj7);
                    long j13 = ((Color) m153animateColorAsStateeuL9pac3.getValue()).value;
                    long j14 = ((Color) state5.getValue()).value;
                    boolean z18 = (z || !z3 || z13) ? false : true;
                    content2 = content;
                    int i10 = i4;
                    changedInstance = gapComposer2.changedInstance(content2) | (i10 == 8388608);
                    Object rememberedValue21 = gapComposer2.rememberedValue();
                    Object obj19 = rememberedValue21;
                    if (!changedInstance || rememberedValue21 == neverEqualPolicy4) {
                        CardStudioViewKt$$ExternalSyntheticLambda41 cardStudioViewKt$$ExternalSyntheticLambda41 = new CardStudioViewKt$$ExternalSyntheticLambda41(content2, function12, 0);
                        gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda41);
                        obj19 = cardStudioViewKt$$ExternalSyntheticLambda41;
                    }
                    m3432StudioButtonXz6DiA(onPlaced2, R.drawable.card_studio_draw, R.string.accessibility_draw_mode, j13, j14, z18, z2, (Function0) obj19, gapComposer2, i8, 0);
                    Modifier alpha2 = AlphaKt.alpha(companion, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
                    rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy4) {
                        draw2 = draw;
                        HeroCardViewKt$$ExternalSyntheticLambda33 heroCardViewKt$$ExternalSyntheticLambda332 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState5, 9);
                        gapComposer2.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda332);
                        obj8 = heroCardViewKt$$ExternalSyntheticLambda332;
                    } else {
                        draw2 = draw;
                        obj8 = rememberedValue3;
                    }
                    Modifier onPlaced3 = RulerKt.onPlaced(alpha2, (Function1) obj8);
                    boolean z19 = (z || !z3 || z13) ? false : true;
                    changedInstance2 = (i10 == 8388608) | gapComposer2.changedInstance(content2);
                    Object rememberedValue22 = gapComposer2.rememberedValue();
                    Object obj20 = rememberedValue22;
                    if (!changedInstance2 || rememberedValue22 == neverEqualPolicy4) {
                        CardStudioViewKt$$ExternalSyntheticLambda41 cardStudioViewKt$$ExternalSyntheticLambda412 = new CardStudioViewKt$$ExternalSyntheticLambda41(function12, content2, 1);
                        gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda412);
                        obj20 = cardStudioViewKt$$ExternalSyntheticLambda412;
                    }
                    m3432StudioButtonXz6DiA(onPlaced3, R.drawable.card_studio_stamp, R.string.accessibility_add_stamp, 0L, 0L, z19, z2, (Function0) obj20, gapComposer2, i8, 24);
                    if (z13) {
                        gapComposer2.startReplaceGroup(-1580078542);
                        Colors colors10 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors10 == null) {
                            z9 = false;
                            colors10 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            z9 = false;
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j5 = colors10.component.button.standard.text.f165default;
                        gapComposer2.end(z9);
                    } else {
                        z9 = false;
                        gapComposer2.startReplaceGroup(-1579994036);
                        Colors colors11 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors11 == null) {
                            colors11 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j5 = colors11.component.button.standard.background.f163default;
                        gapComposer2.end(false);
                    }
                    if (z13) {
                        gapComposer2.startReplaceGroup(-1579838447);
                        Colors colors12 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors12 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z9);
                        } else {
                            colors3 = colors12;
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(z9);
                        }
                        j6 = j5;
                        j7 = colors3.component.button.prominent.text.f162default;
                        gapComposer2.end(z9);
                    } else {
                        j6 = j5;
                        gapComposer2.startReplaceGroup(-1579753166);
                        Colors colors13 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors13 == null) {
                            colors13 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z9);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(z9);
                        }
                        j7 = colors13.component.button.standard.text.f165default;
                        gapComposer2.end(z9);
                    }
                    Modifier alpha3 = AlphaKt.alpha(companion, ((Number) animatable.getValue()).floatValue());
                    boolean z20 = !z && z3;
                    z10 = i10 == 8388608;
                    Object rememberedValue23 = gapComposer2.rememberedValue();
                    Object obj21 = rememberedValue23;
                    if (!z10 || rememberedValue23 == neverEqualPolicy4) {
                        DisclosureView$$ExternalSyntheticLambda1 disclosureView$$ExternalSyntheticLambda1 = new DisclosureView$$ExternalSyntheticLambda1(14, function12);
                        gapComposer2.updateRememberedValue(disclosureView$$ExternalSyntheticLambda1);
                        obj21 = disclosureView$$ExternalSyntheticLambda1;
                    }
                    m3432StudioButtonXz6DiA(alpha3, R.drawable.pattern_card_studio_slider, R.string.accessibility_toggle_pattern_personalization, j6, j7, z20, z2, (Function0) obj21, gapComposer2, i8, 0);
                    gapComposer = gapComposer2;
                    gapComposer.end(true);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        z11 = true;
                        gapComposer.startReplaceGroup(-1504897973);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1508027950);
                        Modifier fillMaxHeight3 = SizeKt.fillMaxHeight(companion, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 54);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxHeight3);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        int i11 = content2.isShowingCashtag ? R.drawable.card_studio_cashtag_on : R.drawable.card_studio_cashtag_off;
                        Animatable animatable8 = animatable3;
                        boolean changedInstance6 = gapComposer.changedInstance(animatable5) | gapComposer.changedInstance(animatable8);
                        Object rememberedValue24 = gapComposer.rememberedValue();
                        if (changedInstance6 || rememberedValue24 == neverEqualPolicy4) {
                            state6 = state2;
                            rememberedValue24 = new CardStudioViewKt$$ExternalSyntheticLambda23(animatable5, animatable8, state6, 0);
                            gapComposer.updateRememberedValue(rememberedValue24);
                        } else {
                            state6 = state2;
                        }
                        Modifier graphicsLayer2 = ColorKt.graphicsLayer(companion, (Function1) rememberedValue24);
                        boolean z21 = z && content2.isShowingCashtagButton;
                        Object rememberedValue25 = gapComposer.rememberedValue();
                        if (rememberedValue25 == neverEqualPolicy4) {
                            rememberedValue25 = new SsnViewKt$$ExternalSyntheticLambda0(26);
                            gapComposer.updateRememberedValue(rememberedValue25);
                        }
                        int i12 = i8 | 12582912;
                        m3430ClipStudioButtonXz6DiA(graphicsLayer2, i11, R.string.accessibility_customization_settings, 0L, 0L, z21, z2, (Function0) rememberedValue25, gapComposer, i12, 24);
                        Density density3 = density;
                        boolean changed2 = gapComposer.changed(density3);
                        Object rememberedValue26 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue26 == neverEqualPolicy4) {
                            rememberedValue26 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(10, density3, mutableFloatState3, mutableFloatState4);
                            gapComposer.updateRememberedValue(rememberedValue26);
                        }
                        Modifier onPlaced4 = RulerKt.onPlaced(companion, (Function1) rememberedValue26);
                        boolean changedInstance7 = gapComposer.changedInstance(animatable5) | gapComposer.changedInstance(animatable8);
                        Object rememberedValue27 = gapComposer.rememberedValue();
                        if (changedInstance7 || rememberedValue27 == neverEqualPolicy4) {
                            rememberedValue27 = new CardStudioViewKt$$ExternalSyntheticLambda23(animatable5, animatable8, state6, 1);
                            gapComposer.updateRememberedValue(rememberedValue27);
                        }
                        Modifier graphicsLayer3 = ColorKt.graphicsLayer(onPlaced4, (Function1) rememberedValue27);
                        boolean z22 = z && z3;
                        Object rememberedValue28 = gapComposer.rememberedValue();
                        if (rememberedValue28 == neverEqualPolicy4) {
                            rememberedValue28 = new SsnViewKt$$ExternalSyntheticLambda0(27);
                            gapComposer.updateRememberedValue(rememberedValue28);
                        }
                        m3432StudioButtonXz6DiA(graphicsLayer3, R.drawable.card_studio_pattern, R.string.accessibility_toggle_pattern_personalization, 0L, 0L, z22, z2, (Function0) rememberedValue28, gapComposer, i12, 24);
                        CardStudioViewModel.CustomizationMode.Pattern.DRAW draw3 = draw2;
                        if (Intrinsics.areEqual(customizationMode, draw3) && z3) {
                            gapComposer.startReplaceGroup(-938315735);
                            Colors colors14 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors14 == null) {
                                z12 = false;
                                colors14 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                z12 = false;
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j8 = colors14.component.button.standard.text.f165default;
                            gapComposer.end(z12);
                        } else {
                            z12 = false;
                            gapComposer.startReplaceGroup(-938227261);
                            Colors colors15 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors15 == null) {
                                colors15 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j8 = colors15.component.button.standard.background.f163default;
                            gapComposer.end(false);
                        }
                        if (Intrinsics.areEqual(customizationMode, draw3) && z3) {
                            gapComposer.startReplaceGroup(-938016120);
                            Colors colors16 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors16 == null) {
                                colors16 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z12);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(z12);
                            }
                            j9 = colors16.component.button.prominent.text.f162default;
                            gapComposer.end(z12);
                        } else {
                            gapComposer.startReplaceGroup(-937926871);
                            Colors colors17 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors17 == null) {
                                colors17 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z12);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(z12);
                            }
                            j9 = colors17.component.button.standard.text.f165default;
                            gapComposer.end(z12);
                        }
                        long j15 = j9;
                        Object rememberedValue29 = gapComposer.rememberedValue();
                        if (rememberedValue29 == neverEqualPolicy4) {
                            rememberedValue29 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState6, 6);
                            gapComposer.updateRememberedValue(rememberedValue29);
                        }
                        Modifier onPlaced5 = RulerKt.onPlaced(companion, (Function1) rememberedValue29);
                        boolean changedInstance8 = gapComposer.changedInstance(animatable8);
                        Object rememberedValue30 = gapComposer.rememberedValue();
                        if (changedInstance8 || rememberedValue30 == neverEqualPolicy4) {
                            rememberedValue30 = new CardStudioViewKt$$ExternalSyntheticLambda29(animatable8, state4, 0);
                            gapComposer.updateRememberedValue(rememberedValue30);
                        }
                        Modifier graphicsLayer4 = ColorKt.graphicsLayer(onPlaced5, (Function1) rememberedValue30);
                        boolean z23 = z && z3;
                        Object rememberedValue31 = gapComposer.rememberedValue();
                        if (rememberedValue31 == neverEqualPolicy4) {
                            rememberedValue31 = new SsnViewKt$$ExternalSyntheticLambda0(28);
                            gapComposer.updateRememberedValue(rememberedValue31);
                        }
                        m3432StudioButtonXz6DiA(graphicsLayer4, R.drawable.card_studio_draw, R.string.accessibility_draw_mode, j8, j15, z23, z2, (Function0) rememberedValue31, gapComposer, i12, 0);
                        Object rememberedValue32 = gapComposer.rememberedValue();
                        if (rememberedValue32 == neverEqualPolicy4) {
                            rememberedValue32 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState8, 7);
                            gapComposer.updateRememberedValue(rememberedValue32);
                        }
                        Modifier onPlaced6 = RulerKt.onPlaced(companion, (Function1) rememberedValue32);
                        boolean changedInstance9 = gapComposer.changedInstance(animatable8);
                        Object rememberedValue33 = gapComposer.rememberedValue();
                        if (changedInstance9 || rememberedValue33 == neverEqualPolicy4) {
                            rememberedValue33 = new CardStudioViewKt$$ExternalSyntheticLambda29(animatable8, state3, 1);
                            gapComposer.updateRememberedValue(rememberedValue33);
                        }
                        Modifier graphicsLayer5 = ColorKt.graphicsLayer(onPlaced6, (Function1) rememberedValue33);
                        boolean z24 = z && z3;
                        Object rememberedValue34 = gapComposer.rememberedValue();
                        if (rememberedValue34 == neverEqualPolicy4) {
                            rememberedValue34 = new SsnViewKt$$ExternalSyntheticLambda0(29);
                            gapComposer.updateRememberedValue(rememberedValue34);
                        }
                        m3432StudioButtonXz6DiA(graphicsLayer5, R.drawable.card_studio_stamp, R.string.accessibility_add_stamp, 0L, 0L, z24, z2, (Function0) rememberedValue34, gapComposer, i12, 24);
                        gapComposer = gapComposer;
                        z11 = true;
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z11);
                }
                z5 = true;
                boolean z172 = z16 | z5;
                i3 = 29360128 & i6;
                z6 = (i3 == 8388608) | z172 | ((i6 & 3670016) == 1048576);
                rememberedValue = gapComposer2.rememberedValue();
                if (z6) {
                }
                mutableFloatState5 = mutableFloatState2;
                animatable3 = animatable7;
                i4 = i3;
                density = density2;
                horizontal = horizontal2;
                mutableFloatState6 = mutableFloatState12;
                mutableFloatState7 = mutableFloatState13;
                state3 = state9;
                state4 = state;
                mutableFloatState8 = mutableFloatState14;
                function12 = function1;
                applier = applier2;
                SliderKt$$ExternalSyntheticLambda6 sliderKt$$ExternalSyntheticLambda62 = new SliderKt$$ExternalSyntheticLambda6(patternStateListener, signatureState, patternStampState, function12, f);
                gapComposer2.updateRememberedValue(sliderKt$$ExternalSyntheticLambda62);
                rememberedValue = sliderKt$$ExternalSyntheticLambda62;
                int i82 = (i6 << 3) & 3670016;
                neverEqualPolicy2 = neverEqualPolicy;
                m3430ClipStudioButtonXz6DiA(graphicsLayer, R.drawable.card_studio_pattern_done, R.string.accessibility_customization_settings, j10, j11, z15, z2, (Function0) rememberedValue, gapComposer2, i82, 0);
                TweenSpec tween$default32 = AnimatableKt.tween$default(100, 0, null, 6);
                draw = CardStudioViewModel.CustomizationMode.Pattern.DRAW.INSTANCE;
                if (Intrinsics.areEqual(customizationMode, draw)) {
                }
                neverEqualPolicy3 = neverEqualPolicy2;
                i5 = -1762997739;
                z7 = false;
                gapComposer2.startReplaceGroup(-1582036316);
                colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                }
                j3 = colors.component.button.standard.background.f163default;
                gapComposer2.end(false);
                z8 = z7;
                long j122 = j3;
                int i92 = i5;
                State m153animateColorAsStateeuL9pac32 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j122, tween$default32, "Draw mode button background color", gapComposer2, 432, 8);
                TweenSpec tween$default42 = AnimatableKt.tween$default(100, z8 ? 1 : 0, null, 6);
                if (Intrinsics.areEqual(customizationMode, draw)) {
                }
                gapComposer2.startReplaceGroup(-1581468086);
                colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                }
                j4 = colors2.component.button.standard.text.f165default;
                gapComposer2.end(z8);
                State m153animateColorAsStateeuL9pac42 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j4, tween$default42, "Draw mode button filter color", gapComposer2, 432, 8);
                Modifier alpha4 = AlphaKt.alpha(companion, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
                rememberedValue2 = gapComposer2.rememberedValue();
                neverEqualPolicy4 = neverEqualPolicy3;
                if (rememberedValue2 == neverEqualPolicy4) {
                }
                Modifier onPlaced22 = RulerKt.onPlaced(alpha4, (Function1) obj7);
                long j132 = ((Color) m153animateColorAsStateeuL9pac32.getValue()).value;
                long j142 = ((Color) state5.getValue()).value;
                if (z) {
                }
                content2 = content;
                int i102 = i4;
                changedInstance = gapComposer2.changedInstance(content2) | (i102 == 8388608);
                Object rememberedValue212 = gapComposer2.rememberedValue();
                Object obj192 = rememberedValue212;
                if (!changedInstance) {
                }
                CardStudioViewKt$$ExternalSyntheticLambda41 cardStudioViewKt$$ExternalSyntheticLambda413 = new CardStudioViewKt$$ExternalSyntheticLambda41(content2, function12, 0);
                gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda413);
                obj192 = cardStudioViewKt$$ExternalSyntheticLambda413;
                m3432StudioButtonXz6DiA(onPlaced22, R.drawable.card_studio_draw, R.string.accessibility_draw_mode, j132, j142, z18, z2, (Function0) obj192, gapComposer2, i82, 0);
                Modifier alpha22 = AlphaKt.alpha(companion, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
                rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy4) {
                }
                Modifier onPlaced32 = RulerKt.onPlaced(alpha22, (Function1) obj8);
                if (z) {
                }
                changedInstance2 = (i102 == 8388608) | gapComposer2.changedInstance(content2);
                Object rememberedValue222 = gapComposer2.rememberedValue();
                Object obj202 = rememberedValue222;
                if (!changedInstance2) {
                }
                CardStudioViewKt$$ExternalSyntheticLambda41 cardStudioViewKt$$ExternalSyntheticLambda4122 = new CardStudioViewKt$$ExternalSyntheticLambda41(function12, content2, 1);
                gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda4122);
                obj202 = cardStudioViewKt$$ExternalSyntheticLambda4122;
                m3432StudioButtonXz6DiA(onPlaced32, R.drawable.card_studio_stamp, R.string.accessibility_add_stamp, 0L, 0L, z19, z2, (Function0) obj202, gapComposer2, i82, 24);
                if (z13) {
                }
                if (z13) {
                }
                Modifier alpha32 = AlphaKt.alpha(companion, ((Number) animatable.getValue()).floatValue());
                if (z) {
                }
                if (i102 == 8388608) {
                }
                Object rememberedValue232 = gapComposer2.rememberedValue();
                Object obj212 = rememberedValue232;
                if (!z10) {
                }
                DisclosureView$$ExternalSyntheticLambda1 disclosureView$$ExternalSyntheticLambda12 = new DisclosureView$$ExternalSyntheticLambda1(14, function12);
                gapComposer2.updateRememberedValue(disclosureView$$ExternalSyntheticLambda12);
                obj212 = disclosureView$$ExternalSyntheticLambda12;
                m3432StudioButtonXz6DiA(alpha32, R.drawable.pattern_card_studio_slider, R.string.accessibility_toggle_pattern_personalization, j6, j7, z20, z2, (Function0) obj212, gapComposer2, i82, 0);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                }
                gapComposer.end(z11);
            }
            z4 = true;
            boolean z162 = changedInstance5 | z4;
            if ((i6 & 896) != 256) {
            }
            z5 = true;
            boolean z1722 = z162 | z5;
            i3 = 29360128 & i6;
            z6 = (i3 == 8388608) | z1722 | ((i6 & 3670016) == 1048576);
            rememberedValue = gapComposer2.rememberedValue();
            if (z6) {
            }
            mutableFloatState5 = mutableFloatState2;
            animatable3 = animatable7;
            i4 = i3;
            density = density2;
            horizontal = horizontal2;
            mutableFloatState6 = mutableFloatState12;
            mutableFloatState7 = mutableFloatState13;
            state3 = state9;
            state4 = state;
            mutableFloatState8 = mutableFloatState14;
            function12 = function1;
            applier = applier2;
            SliderKt$$ExternalSyntheticLambda6 sliderKt$$ExternalSyntheticLambda622 = new SliderKt$$ExternalSyntheticLambda6(patternStateListener, signatureState, patternStampState, function12, f);
            gapComposer2.updateRememberedValue(sliderKt$$ExternalSyntheticLambda622);
            rememberedValue = sliderKt$$ExternalSyntheticLambda622;
            int i822 = (i6 << 3) & 3670016;
            neverEqualPolicy2 = neverEqualPolicy;
            m3430ClipStudioButtonXz6DiA(graphicsLayer, R.drawable.card_studio_pattern_done, R.string.accessibility_customization_settings, j10, j11, z15, z2, (Function0) rememberedValue, gapComposer2, i822, 0);
            TweenSpec tween$default322 = AnimatableKt.tween$default(100, 0, null, 6);
            draw = CardStudioViewModel.CustomizationMode.Pattern.DRAW.INSTANCE;
            if (Intrinsics.areEqual(customizationMode, draw)) {
            }
            neverEqualPolicy3 = neverEqualPolicy2;
            i5 = -1762997739;
            z7 = false;
            gapComposer2.startReplaceGroup(-1582036316);
            colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
            }
            j3 = colors.component.button.standard.background.f163default;
            gapComposer2.end(false);
            z8 = z7;
            long j1222 = j3;
            int i922 = i5;
            State m153animateColorAsStateeuL9pac322 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j1222, tween$default322, "Draw mode button background color", gapComposer2, 432, 8);
            TweenSpec tween$default422 = AnimatableKt.tween$default(100, z8 ? 1 : 0, null, 6);
            if (Intrinsics.areEqual(customizationMode, draw)) {
            }
            gapComposer2.startReplaceGroup(-1581468086);
            colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
            }
            j4 = colors2.component.button.standard.text.f165default;
            gapComposer2.end(z8);
            State m153animateColorAsStateeuL9pac422 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j4, tween$default422, "Draw mode button filter color", gapComposer2, 432, 8);
            Modifier alpha42 = AlphaKt.alpha(companion, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
            rememberedValue2 = gapComposer2.rememberedValue();
            neverEqualPolicy4 = neverEqualPolicy3;
            if (rememberedValue2 == neverEqualPolicy4) {
            }
            Modifier onPlaced222 = RulerKt.onPlaced(alpha42, (Function1) obj7);
            long j1322 = ((Color) m153animateColorAsStateeuL9pac322.getValue()).value;
            long j1422 = ((Color) state5.getValue()).value;
            if (z) {
            }
            content2 = content;
            int i1022 = i4;
            changedInstance = gapComposer2.changedInstance(content2) | (i1022 == 8388608);
            Object rememberedValue2122 = gapComposer2.rememberedValue();
            Object obj1922 = rememberedValue2122;
            if (!changedInstance) {
            }
            CardStudioViewKt$$ExternalSyntheticLambda41 cardStudioViewKt$$ExternalSyntheticLambda4132 = new CardStudioViewKt$$ExternalSyntheticLambda41(content2, function12, 0);
            gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda4132);
            obj1922 = cardStudioViewKt$$ExternalSyntheticLambda4132;
            m3432StudioButtonXz6DiA(onPlaced222, R.drawable.card_studio_draw, R.string.accessibility_draw_mode, j1322, j1422, z18, z2, (Function0) obj1922, gapComposer2, i822, 0);
            Modifier alpha222 = AlphaKt.alpha(companion, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE);
            rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy4) {
            }
            Modifier onPlaced322 = RulerKt.onPlaced(alpha222, (Function1) obj8);
            if (z) {
            }
            changedInstance2 = (i1022 == 8388608) | gapComposer2.changedInstance(content2);
            Object rememberedValue2222 = gapComposer2.rememberedValue();
            Object obj2022 = rememberedValue2222;
            if (!changedInstance2) {
            }
            CardStudioViewKt$$ExternalSyntheticLambda41 cardStudioViewKt$$ExternalSyntheticLambda41222 = new CardStudioViewKt$$ExternalSyntheticLambda41(function12, content2, 1);
            gapComposer2.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda41222);
            obj2022 = cardStudioViewKt$$ExternalSyntheticLambda41222;
            m3432StudioButtonXz6DiA(onPlaced322, R.drawable.card_studio_stamp, R.string.accessibility_add_stamp, 0L, 0L, z19, z2, (Function0) obj2022, gapComposer2, i822, 24);
            if (z13) {
            }
            if (z13) {
            }
            Modifier alpha322 = AlphaKt.alpha(companion, ((Number) animatable.getValue()).floatValue());
            if (z) {
            }
            if (i1022 == 8388608) {
            }
            Object rememberedValue2322 = gapComposer2.rememberedValue();
            Object obj2122 = rememberedValue2322;
            if (!z10) {
            }
            DisclosureView$$ExternalSyntheticLambda1 disclosureView$$ExternalSyntheticLambda122 = new DisclosureView$$ExternalSyntheticLambda1(14, function12);
            gapComposer2.updateRememberedValue(disclosureView$$ExternalSyntheticLambda122);
            obj2122 = disclosureView$$ExternalSyntheticLambda122;
            m3432StudioButtonXz6DiA(alpha322, R.drawable.pattern_card_studio_slider, R.string.accessibility_toggle_pattern_personalization, j6, j7, z20, z2, (Function0) obj2122, gapComposer2, i822, 0);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
            }
            gapComposer.end(z11);
        } else {
            content2 = content;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1 function13 = function12;
            final CardStudioViewModel.Content content3 = content2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj23) {
                    ((Integer) obj23).getClass();
                    CardStudioViewKt.PatternCustomizationColumn(CardStudioViewModel.Content.this, signatureState, patternStampState, patternStateListener, z, z2, f, function13, (Composer) obj22, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: PatternGrid-jB83MbM, reason: not valid java name */
    public static final void m3431PatternGridjB83MbM(final float f, final float f2, final float f3, final long j, final long j2, final boolean z, Composer composer, final int i) {
        Modifier modifier;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1470730196);
        int i2 = 2;
        int i3 = i | (gapComposer.changed(f) ? 4 : 2) | (gapComposer.changed(f2) ? 32 : 16) | (gapComposer.changed(f3) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024) | (gapComposer.changed(j2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(1.0f, gapComposer);
            final float f4 = f3 / 1.5975351f;
            float f5 = 0.00525f * f2;
            final AndroidPathEffect androidPathEffect = new AndroidPathEffect(new DashPathEffect(new float[]{f5, f5}, RecyclerView.DECELERATION_RATE));
            ClosedFloatRange closedFloatRange = new ClosedFloatRange(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new PageFetcher$flow$1.AnonymousClass1(i2, null, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState produceState = Updater.produceState(gapComposer, closedFloatRange, (Function2) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(9);
                ArrayList arrayList = (ArrayList) workLauncherImpl.processor;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    workLauncherImpl.processor = arrayList;
                } else {
                    arrayList.clear();
                }
                workLauncherImpl.pathStringToNodes("M1.5 18.0002C2.83333 17.0002 6.7 16.1002 11.5 20.5002C17.5 26.0002 26 34.6 30.5 31C35 27.4 31.0101 17.8103 28 10.5C24.5 2 30.5 -0.832986 40 5.5001C47.5001 10.5 49.5 5.50003 49 2", arrayList);
                AndroidPath Path = AndroidPath_androidKt.Path();
                ArrayList arrayList2 = (ArrayList) workLauncherImpl.processor;
                rememberedValue2 = arrayList2 != null ? PathParserKt.toPath(arrayList2, Path) : AndroidPath_androidKt.Path();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final AndroidPath androidPath = (AndroidPath) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                AndroidPathMeasure PathMeasure = OffersAnalyticsKt.PathMeasure();
                PathMeasure.setPath(androidPath);
                rememberedValue3 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda87(PathMeasure, PathMeasure.internalPathMeasure.getLength(), produceState, 0));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            final State state = (State) rememberedValue3;
            Modifier clip = ClipKt.clip(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(0.0375f * f2));
            boolean changedInstance = ((i3 & 896) == 256) | gapComposer.changedInstance(androidPath) | gapComposer.changed(f4) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((57344 & i3) == 16384) | gapComposer.changed(m3477toPx8Feqmps) | gapComposer.changedInstance(androidPathEffect) | ((458752 & i3) == 131072) | ((i3 & 7168) == 2048);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                modifier = clip;
                Function1 function1 = new Function1() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda88
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float min;
                        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                        cacheDrawScope.getClass();
                        long m634getSizeNHjbRc = AndroidPath.this.getBounds().m634getSizeNHjbRc();
                        final float f6 = f3;
                        long floatToRawIntBits = Float.floatToRawIntBits(f6);
                        final float f7 = f4;
                        min = Math.min(Float.intBitsToFloat((int) (r4 >> 32)) / Float.intBitsToFloat((int) (m634getSizeNHjbRc >> 32)), Float.intBitsToFloat((int) (((floatToRawIntBits << 32) | (Float.floatToRawIntBits(f7) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (m634getSizeNHjbRc & BodyPartID.bodyIdMax)));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                        int i4 = ScaleFactor.$r8$clinit;
                        final float min2 = MathsKt.min(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & BodyPartID.bodyIdMax)));
                        final float f8 = f2;
                        final float f9 = f;
                        final long j3 = j2;
                        final float f10 = m3477toPx8Feqmps;
                        final AndroidPathEffect androidPathEffect2 = androidPathEffect;
                        final boolean z2 = z;
                        final long j4 = j;
                        final State state2 = state;
                        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                CanvasDrawScope canvasDrawScope;
                                LayoutNodeDrawScope layoutNodeDrawScope;
                                int i5;
                                float f11;
                                int i6;
                                long j5;
                                long j6;
                                float f12;
                                float f13;
                                GrpcMethod grpcMethod;
                                float f14;
                                long m3999getSizeNHjbRc;
                                long j7;
                                CardStudioViewKt$$ExternalSyntheticLambda90 cardStudioViewKt$$ExternalSyntheticLambda90 = this;
                                long j8 = j4;
                                State state3 = state2;
                                LayoutNodeDrawScope layoutNodeDrawScope2 = (LayoutNodeDrawScope) obj2;
                                layoutNodeDrawScope2.getClass();
                                CanvasDrawScope canvasDrawScope2 = layoutNodeDrawScope2.canvasDrawScope;
                                layoutNodeDrawScope2.drawContent();
                                float f15 = f8;
                                float f16 = f6;
                                int roundToInt = MathKt__MathJVMKt.roundToInt((float) Math.ceil(f15 / f16));
                                float f17 = f9;
                                float f18 = f7;
                                int roundToInt2 = MathKt__MathJVMKt.roundToInt((float) Math.ceil(f17 / f18));
                                int i7 = 0;
                                while (i7 < roundToInt2) {
                                    float f19 = i7 * f18;
                                    float f20 = f19 + f18;
                                    long floatToRawIntBits3 = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(f20) & BodyPartID.bodyIdMax);
                                    long j9 = j8;
                                    float f21 = f15;
                                    long floatToRawIntBits4 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f20) & BodyPartID.bodyIdMax);
                                    int i8 = i7;
                                    long j10 = j3;
                                    float f22 = f10;
                                    AndroidPathEffect androidPathEffect3 = androidPathEffect2;
                                    layoutNodeDrawScope2.mo729drawLineNGM6Ib0(j10, floatToRawIntBits3, floatToRawIntBits4, (r23 & 8) != 0 ? 0.0f : f22, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : androidPathEffect3, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                    int i9 = roundToInt + 1;
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        float f23 = ((i10 * f16) - (i8 % 2 == 0 ? 0.0f : f16 / 2.0f)) + f16;
                                        int i11 = i9;
                                        int i12 = i10;
                                        layoutNodeDrawScope2.mo729drawLineNGM6Ib0(j10, (Float.floatToRawIntBits(f23) << 32) | (Float.floatToRawIntBits(f19) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f23) << 32) | (Float.floatToRawIntBits(f20) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f22, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : androidPathEffect3, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                        if (z2) {
                                            LayoutNodeDrawScope layoutNodeDrawScope3 = layoutNodeDrawScope2;
                                            canvasDrawScope = canvasDrawScope2;
                                            layoutNodeDrawScope = layoutNodeDrawScope3;
                                            i5 = i11;
                                            f11 = f21;
                                            i6 = roundToInt2;
                                            j5 = j10;
                                            j6 = j9;
                                            f12 = f16;
                                            f13 = f18;
                                        } else {
                                            float f24 = f23 - (0.75f * f16);
                                            float f25 = (0.25f * f18) + f19;
                                            ((Extras.Key) canvasDrawScope2.drawContext.path).translate(f24, f25);
                                            float f26 = min2 / 2.0f;
                                            try {
                                                grpcMethod = canvasDrawScope2.drawContext;
                                                f14 = f16;
                                                i6 = roundToInt2;
                                                m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                                                grpcMethod.getCanvas().save();
                                            } catch (Throwable th) {
                                                th = th;
                                                canvasDrawScope = canvasDrawScope2;
                                            }
                                            try {
                                                f11 = f21;
                                                ((Extras.Key) grpcMethod.path).m1437scale0AR0LA0(f26, f26, 0L);
                                                AndroidPath androidPath2 = (AndroidPath) state3.getValue();
                                                Stroke stroke = new Stroke(f22, RecyclerView.DECELERATION_RATE, 1, 0, null, 26);
                                                long j11 = j9;
                                                f12 = f14;
                                                j5 = j10;
                                                j7 = m3999getSizeNHjbRc;
                                                j6 = j11;
                                                LayoutNodeDrawScope layoutNodeDrawScope4 = layoutNodeDrawScope2;
                                                canvasDrawScope = canvasDrawScope2;
                                                layoutNodeDrawScope = layoutNodeDrawScope4;
                                                f13 = f18;
                                                i5 = i11;
                                                try {
                                                    DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, androidPath2, j6, RecyclerView.DECELERATION_RATE, stroke, 52);
                                                    try {
                                                        grpcMethod.getCanvas().restore();
                                                        grpcMethod.m4000setSizeuvyYCjk(j7);
                                                        ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f24, -f25);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f24, -f25);
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    grpcMethod.getCanvas().restore();
                                                    grpcMethod.m4000setSizeuvyYCjk(j7);
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                canvasDrawScope = canvasDrawScope2;
                                                j7 = m3999getSizeNHjbRc;
                                            }
                                        }
                                        CanvasDrawScope canvasDrawScope3 = canvasDrawScope;
                                        layoutNodeDrawScope2 = layoutNodeDrawScope;
                                        canvasDrawScope2 = canvasDrawScope3;
                                        roundToInt2 = i6;
                                        j10 = j5;
                                        f16 = f12;
                                        f18 = f13;
                                        j9 = j6;
                                        f21 = f11;
                                        i10 = i12 + 1;
                                        i9 = i5;
                                        cardStudioViewKt$$ExternalSyntheticLambda90 = this;
                                    }
                                    j8 = j9;
                                    i7 = i8 + 1;
                                    layoutNodeDrawScope2 = layoutNodeDrawScope2;
                                    canvasDrawScope2 = canvasDrawScope2;
                                    cardStudioViewKt$$ExternalSyntheticLambda90 = this;
                                    f15 = f21;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue4 = function1;
            } else {
                modifier = clip;
            }
            BoxKt.Box(ClipKt.drawWithCache(modifier, (Function1) rememberedValue4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(f, f2, f3, j, j2, z, i) { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda89
                public final /* synthetic */ float f$0;
                public final /* synthetic */ float f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ long f$4;
                public final /* synthetic */ boolean f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    CardStudioViewKt.m3431PatternGridjB83MbM(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ScalingSlider(float f, int i, Function1 function1, Function1 function12, Composer composer, int i2) {
        Function1 function13;
        MutableState mutableState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1916902063);
        Applier applier = gapComposer.applier;
        int i3 = i2 | (gapComposer.changed(f) ? 4 : 2) | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean z = (i3 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DisclosureView$$ExternalSyntheticLambda1(18, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxSize, false, null, null, (Function0) rememberedValue, 15);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            int alphaComponent = ColorUtils.setAlphaComponent(i, 34);
            int contrastAdjustedColor = ThemablesKt.contrastAdjustedColor(ColorKt.m694toArgb8_81llA(Color.White), i, ColorKt.m694toArgb8_81llA(Color.Black));
            Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), 1.0f), ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(((Boolean) mutableState2.getValue()).booleanValue() ? ColorKt.Color(alphaComponent) : ColorKt.Color(i), AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), "Density slider background color", gapComposer, 432, 8).getValue()).value, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f)), 20.0f, 10.0f), Alignment.Companion.BottomCenter);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, align);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(vertical);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
            Drawable drawableCompat = PlatformKt.getDrawableCompat((Context) gapComposer.consume(staticProvidableCompositionLocal), R.drawable.pattern_slider_few, null);
            drawableCompat.getClass();
            drawableCompat.setTint(contrastAdjustedColor);
            ImageKt.Image(new DrawablePainter(drawableCompat), null, verticalAlignElement, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, 56, 120);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ClosedFloatRange closedFloatRange = new ClosedFloatRange(3.0f, 6.0f);
            DefaultSliderColors m477colorsq0g_0yA = CardKt.m477colorsq0g_0yA(ColorKt.Color(contrastAdjustedColor), ColorKt.Color(contrastAdjustedColor), Color.Gray, gapComposer, 3072, IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR);
            gapComposer = gapComposer;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                function13 = function1;
                mutableState = mutableState2;
                rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda3(function13, mutableState, 9);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                function13 = function1;
                mutableState = mutableState2;
            }
            Function1 function14 = (Function1) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new TabContentViewKt$$ExternalSyntheticLambda1(29, mutableState);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            SliderKt.Slider(f, function14, layoutWeightElement, false, closedFloatRange, (Function0) rememberedValue4, m477colorsq0g_0yA, gapComposer, (i3 & 14) | 1572864);
            VerticalAlignElement verticalAlignElement2 = new VerticalAlignElement(vertical);
            Drawable drawableCompat2 = PlatformKt.getDrawableCompat((Context) gapComposer.consume(staticProvidableCompositionLocal), R.drawable.pattern_slider_many, null);
            drawableCompat2.getClass();
            drawableCompat2.setTint(contrastAdjustedColor);
            ImageKt.Image(new DrawablePainter(drawableCompat2), null, verticalAlignElement2, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, 56, 120);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function13 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda80(f, i, function13, function12, i2);
        }
    }

    /* renamed from: StudioButton-X-z6DiA, reason: not valid java name */
    public static final void m3432StudioButtonXz6DiA(Modifier modifier, int i, int i2, long j, long j2, boolean z, boolean z2, Function0 function0, Composer composer, int i3, int i4) {
        int i5;
        long j3;
        GapComposer gapComposer;
        Modifier modifier2;
        long j4;
        long j5;
        long j6;
        int i6;
        int i7;
        long j7;
        long j8;
        Modifier modifier3;
        long j9;
        int i8;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1046371545);
        int i9 = i4 & 1;
        if (i9 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (gapComposer2.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer2.changed(i) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0 && gapComposer2.changed(j)) {
                i8 = 2048;
                i5 |= i8;
            }
            i8 = 1024;
            i5 |= i8;
        }
        if ((i3 & 24576) == 0) {
            j3 = j2;
            i5 |= ((i4 & 16) == 0 && gapComposer2.changed(j3)) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            j3 = j2;
        }
        if ((196608 & i3) == 0) {
            i5 |= gapComposer2.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i3) == 0) {
            i5 |= gapComposer2.changedInstance(function0) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (4793491 & i5) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i3 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                if ((i4 & 8) != 0) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j6 = colors.component.button.standard.background.f163default;
                    i5 &= -7169;
                } else {
                    j6 = j;
                }
                if ((i4 & 16) != 0) {
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    i6 = -1762997026;
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j3 = colors2.component.button.standard.text.f165default;
                    i5 &= -57345;
                } else {
                    i6 = -1762997026;
                }
                i7 = i5;
                j7 = j6;
                j8 = j3;
                modifier3 = modifier4;
            } else {
                gapComposer2.skipToGroupEnd();
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
                i7 = i5;
                i6 = -1762997026;
                j8 = j3;
                modifier3 = modifier;
                j7 = j;
            }
            gapComposer2.endDefaults();
            boolean z3 = (3670016 & i7) == 1048576;
            Object rememberedValue = gapComposer2.rememberedValue();
            int i10 = 6;
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda24(z2, i10);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            long j10 = j7;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(ColorKt.graphicsLayer(modifier3, (Function1) rememberedValue), PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.pattern_card_studio_icon_width)), RoundedCornerShapeKt.CircleShape), j7, ColorKt.RectangleShape), z, null, null, function0, 14);
            Painter painterResource = Countries.painterResource(i, (i7 >> 3) & 14, gapComposer2);
            String stringResource = Room.stringResource(gapComposer2, i2);
            TweenSpec tween$default = AnimatableKt.tween$default(500, 0, null, 6);
            if (z) {
                gapComposer2.startReplaceGroup(-540675630);
                gapComposer2.end(false);
                j9 = j8;
            } else {
                gapComposer2.startReplaceGroup(-540673041);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, i6, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j9 = colors3.component.button.standard.text.disabled;
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            long j11 = ((Color) SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j9, tween$default, "Control Color", gapComposer2, 432, 8).getValue()).value;
            ImageKt.Image(painterResource, stringResource, m183clickableoSLSa3U$default, null, ContentScale.Companion.Inside, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j11, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j11), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24576, 40);
            modifier2 = modifier3;
            j5 = j8;
            j4 = j10;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j4 = j;
            j5 = j3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda20(modifier2, i, i2, j4, j5, z, z2, function0, i3, i4, 0);
        }
    }

    public static final void ThemedCard(final CardStudioViewModel.Content content, final SignatureState signatureState, final SignatureState signatureState2, final float f, final StampState stampState, final PatternStampState patternStampState, final Function3 function3, final StampMovingListener stampMovingListener, final SignatureStateListener signatureStateListener, final Flow flow, final boolean z, Composer composer, final int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1977201827);
        int i2 = i | (gapComposer2.changedInstance(content) ? 4 : 2) | (gapComposer2.changedInstance(signatureState) ? 32 : 16) | (gapComposer2.changedInstance(signatureState2) ? 256 : 128) | (gapComposer2.changed(f) ? 2048 : 1024) | (gapComposer2.changedInstance(stampState) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(patternStampState) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(stampMovingListener) ? 8388608 : 4194304) | (gapComposer2.changedInstance(signatureStateListener) ? 67108864 : 33554432) | (gapComposer2.changedInstance(flow) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i2 & 1, ((306783379 & i2) == 306783378 && ((gapComposer2.changed(z) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            final CardTheme cardTheme = content.cardTheme;
            boolean z2 = content.isShowingCashtag;
            String str = cardTheme.ink_color;
            Timber.Forest forest = Timber.Forest;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 13);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Integer safeParseColor = StringsKt.safeParseColor(str, (Function1) ((KFunction) rememberedValue));
            safeParseColor.getClass();
            final int intValue = safeParseColor.intValue();
            boolean changed = gapComposer2.changed(cardTheme);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DrawablePainter(new ChipDrawable(context, cardTheme.id == CardTheme.Identifier.TORTOISE_ID, false));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final DrawablePainter drawablePainter = (DrawablePainter) rememberedValue2;
            boolean changed2 = gapComposer2.changed(z2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                CashtagDrawable cashtagDrawable = new CashtagDrawable(context, content.cashtag, false);
                cashtagDrawable.textPaint.setTypeface(CardsKt.typeface(cardTheme.font, context));
                rememberedValue3 = z2 ? cashtagDrawable : null;
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final CashtagDrawable cashtagDrawable2 = (CashtagDrawable) rememberedValue3;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(KeypadKt.m3658mooncakeShadowWMci_g0$default(Modifier.Companion.$$INSTANCE, 0.7f, RecyclerView.DECELERATION_RATE, 0.2f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(10.0f), 2), null, false, Expect_jvmKt.rememberComposableLambda(498515251, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f2;
                    boolean z3;
                    boolean z4;
                    Float valueOf;
                    float f3;
                    float f4;
                    NeverEqualPolicy neverEqualPolicy2;
                    CardStudioViewKt$$ExternalSyntheticLambda75 cardStudioViewKt$$ExternalSyntheticLambda75;
                    Modifier.Companion companion;
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1;
                    GapComposer gapComposer3;
                    DrawablePainter drawablePainter2;
                    Float f5;
                    MutableState mutableState;
                    Drawable drawableCompat;
                    final CardStudioViewModel.Content content2 = content;
                    CardStudioViewModel.CustomizationMode customizationMode = content2.customizationMode;
                    final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                        Density density = (Density) gapComposer4.consume(staticProvidableCompositionLocal);
                        float mo236toPx0680j_4 = density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() * 0.3f);
                        function3.invoke(new PointF(density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()) - mo236toPx0680j_4, density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM()) - mo236toPx0680j_4), Float.valueOf(mo236toPx0680j_4), Float.valueOf(density.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()) * 0.00525f));
                        Object rememberedValue4 = gapComposer4.rememberedValue();
                        CardTheme cardTheme2 = CardTheme.this;
                        Context context2 = context;
                        NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                        if (rememberedValue4 == neverEqualPolicy3) {
                            CardTheme.BackgroundImage backgroundImage = cardTheme2.background_image;
                            switch (backgroundImage == null ? -1 : CardStudioViewKt.WhenMappings.$EnumSwitchMapping$0[backgroundImage.ordinal()]) {
                                case 1:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_hood_by_air, null);
                                    break;
                                case 2:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_hundred_thieves, null);
                                    break;
                                case 3:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_oil_slick, null);
                                    break;
                                case 4:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_metal_black, null);
                                    break;
                                case 5:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_shantell_front_rounded, null);
                                    break;
                                case 6:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_dream, null);
                                    break;
                                case 7:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_mood, null);
                                    break;
                                case 8:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = new GlitterDrawable(context2, true);
                                    break;
                                case 9:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, R.drawable.card_tortoise_background, null);
                                    drawableCompat2.getClass();
                                    drawableCompat = new LayerDrawable(new Drawable[]{new ImageDrawable(drawableCompat2, 2), new ColorDrawable(CardsKt.TORTOISE_OVERLAY)});
                                    break;
                                case 10:
                                    f2 = 0.00525f;
                                    z3 = false;
                                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_brat, null);
                                    break;
                                default:
                                    f2 = 0.00525f;
                                    if (cardTheme2.id != CardTheme.Identifier.HOLO_ID) {
                                        drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.styled_card_background, null);
                                        drawableCompat.getClass();
                                        z3 = false;
                                        Integer safeParseColor2 = StringsKt.safeParseColor(cardTheme2.card_color, new CardStudioViewKt$ThemedCard$1$4$1(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 12));
                                        safeParseColor2.getClass();
                                        drawableCompat.setTint(safeParseColor2.intValue());
                                        break;
                                    } else {
                                        drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.card_holo, null);
                                        z3 = false;
                                        break;
                                    }
                            }
                            drawableCompat.getClass();
                            DrawablePainter drawablePainter3 = new DrawablePainter(drawableCompat);
                            gapComposer4.updateRememberedValue(drawablePainter3);
                            rememberedValue4 = drawablePainter3;
                        } else {
                            f2 = 0.00525f;
                            z3 = false;
                        }
                        DrawablePainter drawablePainter4 = (DrawablePainter) rememberedValue4;
                        Object rememberedValue5 = gapComposer4.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy3) {
                            rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer4.updateRememberedValue(rememberedValue5);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue5;
                        CardTheme.BackgroundImage backgroundImage2 = cardTheme2.background_image;
                        CardTheme.BackgroundImage backgroundImage3 = CardTheme.BackgroundImage.MOOD;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        if (backgroundImage2 != backgroundImage3 || ((Boolean) mutableState2.getValue()).booleanValue()) {
                            CardTheme.BackgroundImage backgroundImage4 = cardTheme2.background_image;
                            if (backgroundImage4 == CardTheme.BackgroundImage.GLITTER) {
                                gapComposer4.startReplaceGroup(-726340358);
                                GlitterCardEffectKt.GlitterCardEffect(ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * 0.0375f)), null, true, gapComposer4, MLKEMEngine.KyberPolyBytes, 2);
                                z4 = false;
                                gapComposer4.end(false);
                            } else if (backgroundImage4 == CardTheme.BackgroundImage.TORTOISE) {
                                gapComposer4.startReplaceGroup(-726115949);
                                z4 = false;
                                TortoiseCardEffectKt.TortoiseBackground(0, 0, gapComposer4, ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * 0.0375f)));
                                gapComposer4.end(false);
                            } else if (cardTheme2.id == CardTheme.Identifier.HOLO_ID) {
                                gapComposer4.startReplaceGroup(-725909737);
                                FlowsKt.HoloBackground(ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * 0.0375f)), gapComposer4, 0);
                                gapComposer4.end(false);
                                z4 = false;
                            } else {
                                gapComposer4.startReplaceGroup(-725742988);
                                ImageKt.Image(drawablePainter4, "Cash App Card Preview", ClipKt.clip(SizeKt.fillMaxSize(companion2, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * 0.0375f)), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, 56, 120);
                                z4 = false;
                                gapComposer4.end(false);
                            }
                        } else {
                            gapComposer4.startReplaceGroup(-727142111);
                            Object rememberedValue6 = gapComposer4.rememberedValue();
                            if (rememberedValue6 == neverEqualPolicy3) {
                                rememberedValue6 = new HeatRenderer(context2, Integer.valueOf(R.drawable.card_mood_hand_heat_map), new CashCardKt$$ExternalSyntheticLambda0(17, mutableState2));
                                gapComposer4.updateRememberedValue(rememberedValue6);
                            }
                            HeatRenderer heatRenderer = (HeatRenderer) rememberedValue6;
                            Object rememberedValue7 = gapComposer4.rememberedValue();
                            if (rememberedValue7 == neverEqualPolicy3) {
                                rememberedValue7 = Updater.mutableStateOf$default(new Offset(0L));
                                gapComposer4.updateRememberedValue(rememberedValue7);
                            }
                            MutableState mutableState3 = (MutableState) rememberedValue7;
                            Flow flow2 = flow;
                            boolean changedInstance = gapComposer4.changedInstance(flow2) | gapComposer4.changedInstance(heatRenderer);
                            Object rememberedValue8 = gapComposer4.rememberedValue();
                            if (changedInstance || rememberedValue8 == neverEqualPolicy3) {
                                rememberedValue8 = new CardStudioPresenter$models$1$1(7, mutableState3, flow2, heatRenderer, null);
                                mutableState = mutableState3;
                                gapComposer4.updateRememberedValue(rememberedValue8);
                            } else {
                                mutableState = mutableState3;
                            }
                            Updater.LaunchedEffect(gapComposer4, heatRenderer, (Function2) rememberedValue8);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                            Object rememberedValue9 = gapComposer4.rememberedValue();
                            if (rememberedValue9 == neverEqualPolicy3) {
                                rememberedValue9 = new CashCardKt$$ExternalSyntheticLambda0(18, mutableState);
                                gapComposer4.updateRememberedValue(rememberedValue9);
                            }
                            Modifier clip = ClipKt.clip(ValueInsets.onGloballyPositioned(fillMaxSize, (Function1) rememberedValue9), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * 0.0375f));
                            String str2 = cardTheme2.card_color;
                            Timber.Forest forest2 = Timber.Forest;
                            Object rememberedValue10 = gapComposer4.rememberedValue();
                            if (rememberedValue10 == neverEqualPolicy3) {
                                CardStudioViewKt$ThemedCard$1$4$1 cardStudioViewKt$ThemedCard$1$4$1 = new CardStudioViewKt$ThemedCard$1$4$1(1, forest2, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 0);
                                gapComposer4.updateRememberedValue(cardStudioViewKt$ThemedCard$1$4$1);
                                rememberedValue10 = cardStudioViewKt$ThemedCard$1$4$1;
                            }
                            Integer safeParseColor3 = StringsKt.safeParseColor(str2, (Function1) ((KFunction) rememberedValue10));
                            safeParseColor3.getClass();
                            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, ColorKt.Color(safeParseColor3.intValue()), ColorKt.RectangleShape);
                            z4 = z3;
                            CanvasKt.MoodHeatEffect(m177backgroundbw27NRU, heatRenderer, gapComposer4, z4 ? 1 : 0);
                            gapComposer4.end(z4);
                        }
                        CardTheme.CardCustomizationMargin cardCustomizationMargin = cardTheme2.card_customization_margin;
                        if (cardCustomizationMargin == null) {
                            gapComposer4.startReplaceGroup(-725461292);
                            gapComposer4.end(z4);
                            valueOf = null;
                        } else {
                            gapComposer4.startReplaceGroup(-725461291);
                            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4);
                            Float f6 = cardCustomizationMargin.size;
                            f6.getClass();
                            float floatValue = (m3477toPx8Feqmps - f6.floatValue()) * 0.016304348f;
                            gapComposer4.end(false);
                            valueOf = Float.valueOf(floatValue);
                        }
                        float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * 0.0375f;
                        float floatValue2 = valueOf != null ? valueOf.floatValue() : m3477toPx8Feqmps2;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer4.consume(staticProvidableCompositionLocal2);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(-1762997739);
                            gapComposer4.end(false);
                        }
                        Float f7 = valueOf;
                        final int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.background.standard);
                        CardTheme.CardCustomizationMargin cardCustomizationMargin2 = cardTheme2.card_customization_margin;
                        final float m3477toPx8Feqmps3 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * ((cardCustomizationMargin2 == null || (f5 = cardCustomizationMargin2.size) == null) ? RecyclerView.DECELERATION_RATE : f5.floatValue());
                        if (customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                            Float f8 = content2.cardTheme.pattern_grid_alpha;
                            f8.getClass();
                            f3 = f8.floatValue();
                        } else {
                            f3 = 1.25f;
                        }
                        float f9 = f3;
                        TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6);
                        final SignatureState signatureState3 = signatureState2;
                        boolean changedInstance2 = gapComposer4.changedInstance(signatureState3);
                        final PatternStampState patternStampState2 = patternStampState;
                        boolean changedInstance3 = changedInstance2 | gapComposer4.changedInstance(patternStampState2);
                        Object rememberedValue11 = gapComposer4.rememberedValue();
                        if (changedInstance3 || rememberedValue11 == neverEqualPolicy3) {
                            rememberedValue11 = new BorrowHomeKt$$ExternalSyntheticLambda1(10, signatureState3, patternStampState2);
                            gapComposer4.updateRememberedValue(rememberedValue11);
                        }
                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f9, tween$default, "Customization enablement animation", (Function1) rememberedValue11, gapComposer4, 3120, 4);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                        final CashtagDrawable cashtagDrawable3 = cashtagDrawable2;
                        Modifier clipCashtag = CanvasKt.clipCashtag(fillMaxSize2, cashtagDrawable3);
                        boolean changed3 = gapComposer4.changed(animateFloatAsState);
                        Object rememberedValue12 = gapComposer4.rememberedValue();
                        if (changed3 || rememberedValue12 == neverEqualPolicy3) {
                            f4 = floatValue2;
                            rememberedValue12 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 4);
                            gapComposer4.updateRememberedValue(rememberedValue12);
                        } else {
                            f4 = floatValue2;
                        }
                        Modifier graphicsLayer = ColorKt.graphicsLayer(clipCashtag, (Function1) rememberedValue12);
                        float m3477toPx8Feqmps4 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer4) * f2;
                        RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(f4);
                        final int i3 = intValue;
                        final SignatureStateListener signatureStateListener2 = signatureStateListener;
                        AspectRatio.Signature(graphicsLayer, true, i3, m694toArgb8_81llA, RoundedCornerShape, m3477toPx8Feqmps3, m3477toPx8Feqmps4, signatureStateListener2, signatureState, gapComposer4, 134217776, 0);
                        long Color = ColorKt.Color(m694toArgb8_81llA);
                        StampState stampState2 = stampState;
                        stampState2.offClipStrokeColor$delegate.setValue(new Color(Color));
                        stampState2.clip$delegate.setValue(RoundedCornerShapeKt.RoundedCornerShape(f4));
                        stampState2.margin$delegate.setValue(Float.valueOf(m3477toPx8Feqmps3));
                        stampState2.strokeColor$delegate.setValue(new Color(ColorKt.Color(i3)));
                        Modifier clipCashtag2 = CanvasKt.clipCashtag(SizeKt.fillMaxSize(companion2, 1.0f), cashtagDrawable3);
                        boolean changed4 = gapComposer4.changed(animateFloatAsState);
                        Object rememberedValue13 = gapComposer4.rememberedValue();
                        if (changed4 || rememberedValue13 == neverEqualPolicy3) {
                            rememberedValue13 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 5);
                            gapComposer4.updateRememberedValue(rememberedValue13);
                        }
                        Modifier graphicsLayer2 = ColorKt.graphicsLayer(clipCashtag2, (Function1) rememberedValue13);
                        final StampMovingListener stampMovingListener2 = stampMovingListener;
                        PickVisualMediaRequestKt.Stamp(graphicsLayer2, stampState2, stampMovingListener2, gapComposer4, 64);
                        EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 3);
                        ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 3);
                        final float f10 = f;
                        final float f11 = f4;
                        AnimatedContentKt.AnimatedVisibility(customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern, (Modifier) null, fadeIn$default, fadeOut$default, "Pattern grid & sig/stamp animation", (Function3) Expect_jvmKt.rememberComposableLambda(453246987, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda86
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                ((Integer) obj6).getClass();
                                ((AnimatedVisibilityScope) obj4).getClass();
                                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = BoxWithConstraintsScopeImpl.this;
                                float m3477toPx8Feqmps5 = DensityUtilsKt.m3477toPx8Feqmps(2.0f, composer3) + DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl2.m259getMaxWidthD9Ej5fM() / f10, composer3);
                                long Color2 = ColorKt.Color(m694toArgb8_81llA);
                                PatternStampState patternStampState3 = patternStampState2;
                                patternStampState3.offClipStrokeColor$delegate.setValue(new Color(Color2));
                                float f12 = f11;
                                patternStampState3.clip$delegate.setValue(RoundedCornerShapeKt.RoundedCornerShape(f12));
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = patternStampState3.margin$delegate;
                                float f13 = m3477toPx8Feqmps3;
                                parcelableSnapshotMutableState.setValue(Float.valueOf(f13));
                                int i4 = i3;
                                patternStampState3.strokeColor$delegate.setValue(new Color(ColorKt.Color(i4)));
                                CardStudioViewModel.Content content3 = content2;
                                Float f14 = content3.cardTheme.pattern_grid_alpha;
                                CardStudioViewKt.m3431PatternGridjB83MbM(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl2.m258getMaxHeightD9Ej5fM(), composer3), DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl2.m259getMaxWidthD9Ej5fM(), composer3), m3477toPx8Feqmps5, ColorKt.Color(i4), f14 != null ? ColorKt.Color(ColorUtils.setAlphaComponent(i4, (int) (f14.floatValue() * 255.0f))) : Color.LightGray, content3.shownSquiggleBefore, composer3, 0);
                                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion3, 1.0f);
                                CashtagDrawable cashtagDrawable4 = cashtagDrawable3;
                                int i5 = (int) m3477toPx8Feqmps5;
                                int i6 = (int) (m3477toPx8Feqmps5 / 1.5975351f);
                                AspectRatio.PatternSignature(CanvasKt.clipCashtag(fillMaxSize3, cashtagDrawable4), i5, i6, i4, DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl2.m259getMaxWidthD9Ej5fM(), composer3) * 0.00525f, f13, RoundedCornerShapeKt.RoundedCornerShape(f12), signatureStateListener2, signatureState3, composer3, 134217728);
                                ASTUtilKt.PatternStamps(CanvasKt.clipCashtag(SizeKt.fillMaxSize(companion3, 1.0f), cashtagDrawable4), i5, i6, patternStampState3, stampMovingListener2, composer3, 4096);
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), (Composer) gapComposer4, 224640, 2);
                        GapComposer gapComposer5 = gapComposer4;
                        CardTheme.CardCustomizationMargin cardCustomizationMargin3 = cardTheme2.card_customization_margin;
                        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$12 = ContentScale.Companion.FillBounds;
                        if (cardCustomizationMargin3 == null) {
                            gapComposer5.startReplaceGroup(-721648385);
                            gapComposer5.end(false);
                            cardStudioViewKt$$ExternalSyntheticLambda75 = this;
                            contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                            companion = companion2;
                            neverEqualPolicy2 = neverEqualPolicy3;
                            gapComposer3 = gapComposer5;
                        } else {
                            gapComposer5.startReplaceGroup(-721648384);
                            Density density2 = (Density) gapComposer5.consume(staticProvidableCompositionLocal);
                            Object rememberedValue14 = gapComposer5.rememberedValue();
                            neverEqualPolicy2 = neverEqualPolicy3;
                            if (rememberedValue14 == neverEqualPolicy2) {
                                Float f12 = cardCustomizationMargin3.size;
                                f12.getClass();
                                float mo236toPx0680j_42 = density2.mo236toPx0680j_4(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()) * f12.floatValue();
                                f7.getClass();
                                float floatValue3 = f7.floatValue();
                                Integer safeParseColor4 = StringsKt.safeParseColor(cardCustomizationMargin3.color, new CardStudioViewKt$ThemedCard$1$4$1(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 11));
                                safeParseColor4.getClass();
                                rememberedValue14 = new DrawablePainter(new CardMarginDrawable(mo236toPx0680j_42, m3477toPx8Feqmps2, floatValue3, safeParseColor4.intValue()));
                                gapComposer5.updateRememberedValue(rememberedValue14);
                            }
                            DrawablePainter drawablePainter5 = (DrawablePainter) rememberedValue14;
                            cardStudioViewKt$$ExternalSyntheticLambda75 = this;
                            State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(500, 0, null, 6), "marginAlpha", null, gapComposer5, 3120, 20);
                            companion = companion2;
                            Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                            float floatValue4 = ((Number) animateFloatAsState2.getValue()).floatValue();
                            Float f13 = cardCustomizationMargin3.alpha;
                            f13.getClass();
                            contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                            ImageKt.Image(drawablePainter5, null, fillMaxSize3, null, contentScale$Companion$Fit$1, f13.floatValue() * floatValue4, null, gapComposer5, 25016, 72);
                            GapComposer gapComposer6 = gapComposer5;
                            gapComposer6.end(false);
                            gapComposer3 = gapComposer6;
                        }
                        if (content2.isShowingCashtag) {
                            gapComposer3.startReplaceGroup(-720815538);
                            Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                            Painter rememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(cashtagDrawable3, gapComposer3);
                            long Color2 = ColorKt.Color(i3);
                            ImageKt.Image(rememberDrawablePainter, null, fillMaxSize4, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 25008, 40);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-720562609);
                            gapComposer3.end(false);
                        }
                        ImageKt.Image(drawablePainter, null, SizeKt.fillMaxSize(companion, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer3, 25016, 104);
                        Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal2);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        boolean z5 = colors2.isLight;
                        Object rememberedValue15 = gapComposer3.rememberedValue();
                        if (rememberedValue15 == neverEqualPolicy2) {
                            CardTheme.Gradient gradient = cardTheme2.gradient_style;
                            int i4 = gradient != null ? CardStudioViewKt.WhenMappings.$EnumSwitchMapping$1[gradient.ordinal()] : -1;
                            if (i4 == 1) {
                                Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context2, R.drawable.gradient_diagonal_dark, null);
                                drawableCompat3.getClass();
                                drawablePainter2 = new DrawablePainter(drawableCompat3);
                            } else if (i4 != 2) {
                                drawablePainter2 = null;
                            } else {
                                Drawable drawableCompat4 = PlatformKt.getDrawableCompat(context2, !z5 ? R.drawable.gradient_diagonal_light_dark_mode : R.drawable.gradient_diagonal_light, null);
                                drawableCompat4.getClass();
                                drawablePainter2 = new DrawablePainter(drawableCompat4);
                            }
                            gapComposer3.updateRememberedValue(drawablePainter2);
                            rememberedValue15 = drawablePainter2;
                        }
                        DrawablePainter drawablePainter6 = (DrawablePainter) rememberedValue15;
                        if (drawablePainter6 == null) {
                            gapComposer3.startReplaceGroup(-719785254);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-719785253);
                            ImageKt.Image(drawablePainter6, null, SizeKt.fillMaxSize(companion, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer3, 25016, 104);
                            gapComposer3.end(false);
                        }
                    } else {
                        gapComposer4.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(signatureState, signatureState2, f, stampState, patternStampState, function3, stampMovingListener, signatureStateListener, flow, z, i) { // from class: com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda76
                public final /* synthetic */ SignatureState f$1;
                public final /* synthetic */ boolean f$10;
                public final /* synthetic */ SignatureState f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ StampState f$4;
                public final /* synthetic */ PatternStampState f$5;
                public final /* synthetic */ Function3 f$6;
                public final /* synthetic */ StampMovingListener f$7;
                public final /* synthetic */ SignatureStateListener f$8;
                public final /* synthetic */ Flow f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(295489);
                    CardStudioViewKt.ThemedCard(CardStudioViewModel.Content.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void handleDialogEvents(DialogListenerEvent dialogListenerEvent, Function1 function1, Function1 function12, SnapshotStateList snapshotStateList) {
        dialogListenerEvent.getClass();
        function1.getClass();
        function12.getClass();
        snapshotStateList.getClass();
        if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
            if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                if (((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent).screen instanceof CardStudioUndoDialogScreen) {
                    snapshotStateList.add(new DisclosureView$$ExternalSyntheticLambda1(13, function1));
                    return;
                }
                return;
            }
        }
        DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
        Object obj = onDialogResult.result;
        Screen screen = onDialogResult.screen;
        if (screen instanceof PatternSignatureStamps) {
            obj.getClass();
            function12.invoke((StampResult) obj);
            return;
        }
        if (screen instanceof CardStudioUndoDialogScreen) {
            obj.getClass();
            CardStudioUndoResult cardStudioUndoResult = (CardStudioUndoResult) obj;
            if (cardStudioUndoResult.equals(CardStudioUndoResult.Undo.INSTANCE)) {
                function1.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndoDialogConfirm()));
                ((Function0) snapshotStateList.remove(snapshotStateList.size() - 1)).invoke();
                return;
            } else if (!cardStudioUndoResult.equals(CardStudioUndoResult.Cancel.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                function1.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapUndoDialogCancel()));
                snapshotStateList.add(new DisclosureView$$ExternalSyntheticLambda1(12, function1));
                return;
            }
        }
        if (screen instanceof CardStudioExitDialogScreen) {
            obj.getClass();
            CardStudioExitDialogResult cardStudioExitDialogResult = (CardStudioExitDialogResult) obj;
            if (cardStudioExitDialogResult.equals(CardStudioExitDialogResult.Exit.INSTANCE)) {
                function1.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapBackConfirm()));
                function1.invoke(CardStudioViewEvent.Exit.INSTANCE);
            } else if (cardStudioExitDialogResult.equals(CardStudioExitDialogResult.Stay.INSTANCE)) {
                function1.invoke(new CardStudioViewEvent.LogViewOnlyEvent(new CashCardCustomizeTapBackStay()));
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }
    }
}
