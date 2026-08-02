package com.squareup.cash.score.views;

import android.icu.text.MessageFormat;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.DividerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.vision.text.zzb;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.card.onboarding.StyledCardViewKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda7;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.BadgeNameKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.viewmodels.ProfileAvatarViewModel;
import com.squareup.cash.score.viewmodels.ScoreHomeSheet;
import com.squareup.cash.score.viewmodels.ScoreHomeViewModel;
import com.squareup.cash.score.views.ScoreDisplayContent;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.elements.H6TextKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class CalloutKt {

    /* renamed from: lambda$-378642558, reason: not valid java name */
    public static final ComposableLambdaImpl f653lambda$378642558 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(22), false, -378642558);

    public static final void Callout(CashCreditScoreHomeData.InfoSection.Callout callout, StyledCardViewModel styledCardViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ComposableLambdaImpl rememberComposableLambda;
        callout.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1636850229);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(callout) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(styledCardViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            CashCreditScoreHomeData.Action action = callout.action;
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            CashCreditScoreHomeData.Graphic graphic = callout.graphic;
            if (graphic == null) {
                gapComposer2.startReplaceGroup(-1653151539);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(-1653151538);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(885869065, new CalloutKt$$ExternalSyntheticLambda0(0, graphic, styledCardViewModel), gapComposer2);
                gapComposer2.end(false);
            }
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            gapComposer2.startReplaceGroup(1055091698);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier clip = ClipKt.clip(SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue), m340RoundedCornerShape0680j_4);
            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            BorderStroke m173BorderStrokecXLIe8U = CanvasKt.m173BorderStrokecXLIe8U(colors.semantic.border.subtle, 1.0f);
            Modifier m179borderziNgDLE = ImageKt.m179borderziNgDLE(clip, m173BorderStrokecXLIe8U.width, m173BorderStrokecXLIe8U.brush, m340RoundedCornerShape0680j_4);
            if (action != null) {
                boolean changedInstance = gapComposer2.changedInstance(action) | ((i2 & 7168) == 2048);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue2 == obj2) {
                    rememberedValue2 = new CalloutKt$$ExternalSyntheticLambda2(function1, action, 0);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                m179borderziNgDLE = m179borderziNgDLE.then(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue2, 15));
            }
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-1435989928, new SheetKt$$ExternalSyntheticLambda6(callout, 7), gapComposer2), m179borderziNgDLE, null, null, false, true, null, null, push, 0L, null, gapComposer, 806879280, 0, 3512);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(callout, styledCardViewModel, modifier, function1, i, 0);
        }
    }

    public static final void CalloutColumn(List list, StyledCardViewModel styledCardViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(101616428);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (gapComposer.changedInstance(list) ? 4 : 2) | i : i;
        StyledCardViewModel styledCardViewModel2 = styledCardViewModel;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(styledCardViewModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            float f = 16.0f;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-203132474);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CashCreditScoreHomeData.InfoSection.Callout callout = (CashCreditScoreHomeData.InfoSection.Callout) obj;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, f, RecyclerView.DECELERATION_RATE, i2);
                int i6 = i3 & 896;
                boolean changed = (i6 == 256) | gapComposer.changed(i4) | gapComposer.changedInstance(callout);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj2 = Composer.Companion.Empty;
                if (changed || rememberedValue == obj2) {
                    rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda10(function1, i4, callout);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier onVisibilityChanged$default = RulerKt.onVisibilityChanged$default(m300paddingVpY3zN4$default, 500L, RecyclerView.DECELERATION_RATE, (Function1) rememberedValue, 6);
                boolean changed2 = (i6 == 256) | gapComposer.changed(i4) | gapComposer.changedInstance(callout);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == obj2) {
                    rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda10(i4, callout, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Callout(callout, styledCardViewModel2, onVisibilityChanged$default, (Function1) rememberedValue2, gapComposer, i3 & 112);
                styledCardViewModel2 = styledCardViewModel;
                i4 = i5;
                i2 = 2;
                f = 16.0f;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(list, i, styledCardViewModel, function1, modifier, 14);
        }
    }

    public static final void CollapsingItem(CashCreditScoreHomeData.InfoSection.CollapsingItem collapsingItem, boolean z, Function0 function0, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function02;
        Modifier modifier2;
        collapsingItem.getClass();
        function0.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1674133679);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(collapsingItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SizeKt.fillMaxWidth(companion, 1.0f), false, Room.stringResource(gapComposer, z ? R.string.score_collapsing_item_click_label_collapsed : R.string.score_collapsing_item_click_label_not_collapsed), null, function02, 13);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            LocalizedString localizedString = collapsingItem.title;
            localizedString.getClass();
            String str = localizedString.translated_value;
            str.getClass();
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
            long j = Strings.getColors(gapComposer).semantic.text.prominent;
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, layoutWeightElement.then(new WithAlignmentLineElement(horizontalAlignmentLine)), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(z ? Icons.CaretDown16 : Icons.CaretUp16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14).then(new WithAlignmentLineElement(horizontalAlignmentLine)), Strings.getColors(gapComposer).semantic.text.prominent, gapComposer, 48, 0);
            gapComposer.end(true);
            SpringSpec fast$default = TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(MotionKt.getLocalMotion())).springs.text);
            boolean z2 = !z;
            EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 3);
            BiasAlignment.Vertical vertical2 = Alignment.Companion.Top;
            EnterTransitionImpl plus = fadeIn$default.plus(EnterExitTransitionKt.expandVertically$default(fast$default, 12));
            ExitTransitionImpl plus2 = EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkVertically$default(fast$default, vertical2, 12));
            boolean z3 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda24(z, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z2, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), plus, plus2, null, Expect_jvmKt.rememberComposableLambda(477688225, new ShareSheetViewKt$$ExternalSyntheticLambda1(21, (Object) collapsingItem, (Object) function1), gapComposer), gapComposer, 1572870, 16);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(collapsingItem, z, function0, function1, modifier2, i, 17);
        }
    }

    public static final void CollapsingItemColumn(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(998612686);
        Function1 function12 = function1;
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function12) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1461102503);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CashCreditScoreHomeData.InfoSection.CollapsingItem collapsingItem = (CashCreditScoreHomeData.InfoSection.CollapsingItem) it.next();
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OverlayKt$$ExternalSyntheticLambda1(15, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CollapsingItem(collapsingItem, booleanValue, (Function0) rememberedValue2, function12, null, gapComposer, ((i2 << 6) & 7168) | MLKEMEngine.KyberPolyBytes);
                function12 = function1;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(list, function1, modifier, i, 0);
        }
    }

    public static final void DisclaimerSection(CashCreditScoreHomeData.DisclaimerSection disclaimerSection, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        disclaimerSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-960941075);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(disclaimerSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LocalizedString localizedString = disclaimerSection.text;
            localizedString.getClass();
            String str = localizedString.translated_value;
            str.getClass();
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            CashCreditScoreHomeData.TextAlignment textAlignment = disclaimerSection.text_alignment;
            int i3 = textAlignment == null ? -1 : ScoreHomeKt$WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
            int i4 = 5;
            if (i3 != -1 && i3 != 1) {
                if (i3 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i4 = 3;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, false, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m305MultiblockMarkdown1kVgcOc(str, (Function2) rememberedValue, modifier, textStyle, j, null, i4, null, gapComposer, i2 & 896, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(disclaimerSection, function1, modifier, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void InfoSection(CashCreditScoreHomeData.InfoSection infoSection, StyledCardViewModel styledCardViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer;
        int i2;
        String str;
        Modifier.Companion companion;
        ?? r1;
        int i3;
        Function1 function13;
        Modifier.Companion companion2;
        Function1 function14 = function1;
        infoSection.getClass();
        function14.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-788610314);
        int i4 = (i & 6) == 0 ? (gapComposer2.changedInstance(infoSection) ? 4 : 2) | i : i;
        StyledCardViewModel styledCardViewModel2 = styledCardViewModel;
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(styledCardViewModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function14) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion3);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Boolean bool = infoSection.show_top_divider;
            List<CashCreditScoreHomeData.InfoSection.InfoItem> list = infoSection.items;
            LocalizedString localizedString = infoSection.body;
            LocalizedString localizedString2 = infoSection.title;
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                gapComposer2.startReplaceGroup(621410237);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                ModalKt.HorizontalDivider(0, 0, gapComposer2, SpacerKt.m302paddingqDBjuR0$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 40.0f, 5));
                gapComposer2.end(false);
                i2 = 1;
            } else {
                gapComposer2.startReplaceGroup(621718253);
                i2 = 1;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            }
            if (localizedString2 == null && localizedString == null) {
                gapComposer2.startReplaceGroup(622021526);
                gapComposer2.end(false);
                r1 = 0;
                companion = companion3;
            } else {
                gapComposer2.startReplaceGroup(621816833);
                if (localizedString2 == null || (str = localizedString2.translated_value) == null) {
                    str = "";
                }
                String str2 = localizedString != null ? localizedString.translated_value : null;
                String str3 = str;
                companion = companion3;
                r1 = 0;
                ViewfinderDefaults.SectionHeader(str3, (Modifier) null, (String) null, (Function0) null, str2, gapComposer2, 0, 14);
                if (list.isEmpty()) {
                    gapComposer2.startReplaceGroup(621972329);
                    DBUtil.SpacerWithinSectionMedium(0, i2, gapComposer2, null);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(622015574);
                    gapComposer2.end(false);
                }
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(1682636768);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            for (CashCreditScoreHomeData.InfoSection.InfoItem infoItem : list) {
                Object obj = infoItem.callout;
                if (obj == null && (obj = infoItem.row) == null) {
                    obj = infoItem.collapsing_item;
                }
                if (obj != null) {
                    List list2 = (List) CollectionsKt.lastOrNull((List) createListBuilder);
                    if (list2 == null || CollectionsKt.first(list2).getClass() != obj.getClass()) {
                        createListBuilder.add(CollectionsKt__CollectionsKt.mutableListOf(obj));
                    } else {
                        list2.add(obj);
                    }
                }
            }
            ListIterator listIterator = CollectionsKt__CollectionsJVMKt.build(createListBuilder).listIterator(r1);
            GapComposer gapComposer3 = gapComposer2;
            while (true) {
                ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
                if (!itr.hasNext()) {
                    break;
                }
                List list3 = (List) itr.next();
                if (CollectionsKt.first(list3) instanceof CashCreditScoreHomeData.InfoSection.Callout) {
                    gapComposer3.startReplaceGroup(2005976679);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    i3 = i2;
                    CalloutColumn(list3, styledCardViewModel2, function14, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, i2), gapComposer3, i5 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                    function13 = function14;
                    gapComposer3.end(r1);
                    companion2 = companion;
                    gapComposer3 = gapComposer3;
                } else {
                    i3 = i2;
                    Modifier.Companion companion4 = companion;
                    function13 = function14;
                    if (CollectionsKt.first(list3) instanceof CashCreditScoreHomeData.InfoSection.Row) {
                        gapComposer3.startReplaceGroup(2006442857);
                        ListUnorderedSize listUnorderedSize = ListUnorderedSize.Large;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        companion2 = companion4;
                        ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                        ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                        Composer composer2 = gapComposer3;
                        ListUnorderedKt.ListUnordered(SpacerKt.m300paddingVpY3zN4$default(m302paddingqDBjuR0$default, RecyclerView.DECELERATION_RATE, 24.0f, i3), (ListUnorderedState) null, (ListUnorderedProminence) null, listUnorderedSize, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1181021102, new InfoSectionKt$$ExternalSyntheticLambda0(r1, function13, list3), gapComposer3), composer2, 199680, 22);
                        GapComposer gapComposer4 = composer2;
                        gapComposer4.end(r1);
                        gapComposer3 = gapComposer4;
                    } else {
                        companion2 = companion4;
                        if (CollectionsKt.first(list3) instanceof CashCreditScoreHomeData.InfoSection.CollapsingItem) {
                            gapComposer3.startReplaceGroup(2007701860);
                            int i6 = i5 & 896;
                            int i7 = i6 == 256 ? i3 : r1;
                            Object rememberedValue = gapComposer3.rememberedValue();
                            Object obj2 = Composer.Companion.Empty;
                            if (i7 != 0 || rememberedValue == obj2) {
                                rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(r1, function13);
                                gapComposer3.updateRememberedValue(rememberedValue);
                            }
                            Function1 function15 = (Function1) rememberedValue;
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 16.0f, i3);
                            int i8 = i6 == 256 ? i3 : r1;
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (i8 != 0 || rememberedValue2 == obj2) {
                                rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda1(29, function13);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            CollapsingItemColumn(r1, gapComposer3, RulerKt.onVisibilityChanged$default(m300paddingVpY3zN4$default2, 500L, 0.2f, (Function1) rememberedValue2, 4), list3, function15);
                            gapComposer3.end(r1);
                        } else {
                            gapComposer3.startReplaceGroup(2008375769);
                            gapComposer3.end(r1);
                        }
                        i2 = i3;
                        function14 = function13;
                        companion = companion2;
                        styledCardViewModel2 = styledCardViewModel;
                        gapComposer3 = gapComposer3;
                    }
                }
                i2 = i3;
                function14 = function13;
                companion = companion2;
                styledCardViewModel2 = styledCardViewModel;
                gapComposer3 = gapComposer3;
            }
            function12 = function14;
            gapComposer3.end(r1);
            gapComposer3.end(i2);
            modifier2 = companion;
            gapComposer = gapComposer3;
        } else {
            function12 = function14;
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(infoSection, i, styledCardViewModel, function12, modifier2, 15);
        }
    }

    public static final void LoadingContent(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1053193169);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 0);
        }
    }

    public static final void RecommendationGraphic(CashCreditScoreHomeData.Graphic graphic, StyledCardViewModel styledCardViewModel, Composer composer, int i) {
        int i2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1632351290);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(graphic) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(styledCardViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(OffsetKt.aspectRatio(1.0f, SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 248.0f, 1), false), 72.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            CashCreditScoreHomeData.Graphic.Card card = graphic.card;
            Image image = graphic.image;
            if (card == null || styledCardViewModel == null) {
                z = true;
                if (image != null) {
                    gapComposer.startReplaceGroup(1650117898);
                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer), null, SizeKt.fillMaxWidth(companion, 1.0f), null, ContentScale.Companion.Fit, null, gapComposer, 1573296, 1976);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1650320142);
                    gapComposer.end(false);
                }
            } else {
                gapComposer.startReplaceGroup(1649875788);
                z = true;
                StyledCardViewKt.m3439StyledCardnSlTg7c(StyledCardViewModel.copy$default(styledCardViewModel, null, null, false, null, 63487), RotateKt.rotate(SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f), -15.0f), null, RecyclerView.DECELERATION_RATE, 7.0f, false, gapComposer, 24624, 44);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(graphic, styledCardViewModel, i, 6);
        }
    }

    public static final void RecommendationSheet(CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData, StyledCardViewModel styledCardViewModel, Function0 function0, Function1 function1, Composer composer, int i) {
        recommendationOverlayData.getClass();
        function0.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1148266735);
        int i2 = i | (gapComposer.changedInstance(recommendationOverlayData) ? 4 : 2) | (gapComposer.changedInstance(styledCardViewModel) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            SheetKt.Sheet(function0, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(2049744424, new SheetKt$$ExternalSyntheticLambda5(13, recommendationOverlayData, styledCardViewModel, function1), gapComposer), gapComposer, ((i2 >> 6) & 14) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(recommendationOverlayData, i, styledCardViewModel, function0, function1, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void RecommendationSheetContent(CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData, StyledCardViewModel styledCardViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        LocalizedString localizedString;
        Modifier.Companion companion;
        LocalizedString localizedString2;
        LocalizedString localizedString3;
        ?? r5;
        LocalizedString localizedString4;
        Modifier.Companion companion2;
        float f;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1922521975);
        int i2 = i | (gapComposer3.changedInstance(recommendationOverlayData) ? 4 : 2) | (gapComposer3.changedInstance(styledCardViewModel) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 256 : 128) | (gapComposer3.changed(modifier) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer3);
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LocalizedString localizedString5 = recommendationOverlayData.title;
            LocalizedString localizedString6 = recommendationOverlayData.primary_button_text;
            LocalizedString localizedString7 = recommendationOverlayData.body;
            boolean z = (localizedString5 == null && localizedString7 == null) ? false : true;
            CashCreditScoreHomeData.Graphic graphic = recommendationOverlayData.graphic;
            if (graphic == null) {
                gapComposer3.startReplaceGroup(682813605);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(682813606);
                RecommendationGraphic(graphic, styledCardViewModel, gapComposer3, i2 & 112);
                if (z || localizedString6 != null) {
                    gapComposer3.startReplaceGroup(690819013);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(690862258);
                    gapComposer3.end(false);
                }
                gapComposer3.end(false);
            }
            String str = localizedString5 != null ? localizedString5.translated_value : null;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (str == null) {
                gapComposer3.startReplaceGroup(683051034);
                gapComposer3.end(false);
                localizedString = localizedString5;
                localizedString2 = localizedString6;
                localizedString3 = localizedString7;
                r5 = 0;
                companion = companion3;
            } else {
                gapComposer3.startReplaceGroup(683051035);
                localizedString = localizedString5;
                companion = companion3;
                localizedString2 = localizedString6;
                localizedString3 = localizedString7;
                r5 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).headlineLarge, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer3.end(false);
            }
            String str2 = localizedString3 != null ? localizedString3.translated_value : null;
            if (str2 == null) {
                gapComposer3.startReplaceGroup(683333940);
                gapComposer3.end(r5);
                localizedString4 = localizedString3;
                companion2 = companion;
                f = 16.0f;
            } else {
                gapComposer3.startReplaceGroup(683333941);
                if (localizedString != null) {
                    gapComposer3.startReplaceGroup(-1378383106);
                    DBUtil.SpacerWithinSectionMedium(r5, 1, gapComposer3, null);
                    DBUtil.SpacerWithinSectionSmall(r5, 1, gapComposer3, null);
                    gapComposer3.end(r5);
                } else {
                    gapComposer3.startReplaceGroup(-1378249527);
                    gapComposer3.end(r5);
                }
                localizedString4 = localizedString3;
                companion2 = companion;
                f = 16.0f;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer3.end(r5);
            }
            if (localizedString == null && localizedString4 == null) {
                gapComposer3.startReplaceGroup(683821199);
                gapComposer3.end(r5);
            } else {
                gapComposer3.startReplaceGroup(683781798);
                DBUtil.SpacerBetweenSectionLarge(r5, 1, gapComposer3, null);
                gapComposer3.end(r5);
            }
            LocalizedString localizedString8 = localizedString2;
            String str3 = localizedString8 != null ? localizedString8.translated_value : null;
            if (str3 == null) {
                gapComposer3.startReplaceGroup(683882764);
                gapComposer3.end(r5);
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(683882765);
                boolean changedInstance = gapComposer3.changedInstance(recommendationOverlayData) | ((i2 & 896) == 256 ? true : r5);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(16, function1, recommendationOverlayData);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                Strings.getSizes(gapComposer3).getClass();
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, SpacerKt.m299paddingVpY3zN4(fillMaxWidth, f, f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(846084125, new SheetKt$$ExternalSyntheticLambda8(str3, 25), gapComposer3), gapComposer3, 1573248, 56);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(r5);
                gapComposer2 = gapComposer4;
            }
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(recommendationOverlayData, i, styledCardViewModel, function1, modifier, 2);
        }
    }

    /* renamed from: ScoreDigit-FHprtrg, reason: not valid java name */
    public static final void m3740ScoreDigitFHprtrg(final int i, final int i2, Modifier modifier, TextStyle textStyle, long j, float f, Composer composer, final int i3) {
        int i4;
        GapComposer gapComposer;
        final Modifier modifier2;
        final TextStyle textStyle2;
        final long j2;
        final float f2;
        final TextStyle textStyle3;
        float f3;
        final long j3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-350168365);
        if ((i3 & 6) == 0) {
            i4 = (gapComposer2.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= gapComposer2.changed(i2) ? 32 : 16;
        }
        int i5 = i4 | MLKEMEngine.KyberPolyBytes;
        if ((i3 & 3072) == 0) {
            i5 = i4 | 1408;
        }
        if ((i3 & 24576) == 0) {
            i5 |= PKIFailureInfo.certRevoked;
        }
        int i6 = 196608 | i5;
        if (gapComposer2.shouldExecute(i6 & 1, (74899 & i6) != 74898)) {
            gapComposer2.startDefaults();
            if ((i3 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).numeralLarge, 0L, Room.getSp(136), null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, Room.getSp(EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE), null, null, 0, 8257501);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j4 = colors.semantic.text.standard;
                textStyle3 = m994copyp1EtxEg$default;
                modifier2 = Modifier.Companion.$$INSTANCE;
                f3 = 0.59f;
                j3 = j4;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier2 = modifier;
                textStyle3 = textStyle;
                j3 = j;
                f3 = f;
            }
            gapComposer2.endDefaults();
            final int roundToInt = MathKt__MathJVMKt.roundToInt((float) Math.pow(10.0d, i2));
            int i7 = i / roundToInt;
            float mo231toDpGaN1DYA = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(textStyle3.paragraphStyle.lineHeight);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(i7, 2, gapComposer2);
            Integer valueOf = Integer.valueOf(i7);
            boolean changed = gapComposer2.changed(rememberLazyListState) | gapComposer2.changed(i7);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new ScoreSummaryKt$ScoreDigit$1$1(rememberLazyListState, i7, (Continuation) null, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue);
            BiasAlignment.Horizontal horizontal = i2 != 0 ? i2 != 1 ? Alignment.Companion.End : Alignment.Companion.CenterHorizontally : Alignment.Companion.Start;
            Modifier aspectRatio = OffsetKt.aspectRatio(f3, SizeKt.m277height3ABfNKs(modifier2, mo231toDpGaN1DYA), false);
            boolean changed2 = gapComposer2.changed(roundToInt) | gapComposer2.changed(textStyle3) | gapComposer2.changed(j3);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = new Function1() { // from class: com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LazyListScope lazyListScope = (LazyListScope) obj2;
                        lazyListScope.getClass();
                        LazyListScope.items$default(lazyListScope, CollectionsKt.count(new IntRange(0, RoomDatabase.MAX_BIND_PARAMETER_CNT / roundToInt, 1)), null, new ComposableLambdaImpl(new ScoreSummaryKt$$ExternalSyntheticLambda18(0, j3, textStyle3), true, -163740175), 6);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            LazyDslKt.LazyColumn(aspectRatio, rememberLazyListState, null, null, horizontal, null, false, null, (Function1) rememberedValue2, gapComposer, 12582912, 348);
            textStyle2 = textStyle3;
            f2 = f3;
            j2 = j3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            textStyle2 = textStyle;
            j2 = j;
            f2 = f;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    CalloutKt.m3740ScoreDigitFHprtrg(i, i2, modifier2, textStyle2, j2, f2, (Composer) obj2, Updater.updateChangedFlags(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ScoreDigits(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-16843178);
        int i4 = ((i2 & 6) == 0 ? (gapComposer.changed(i) ? 4 : 2) | i2 : i2) | 48;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.score_digits_content_description)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i), "score"));
            format2.getClass();
            boolean changed = gapComposer.changed(format2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(format2, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CalloutKt$$ExternalSyntheticLambda1(4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(semantics, (Function1) rememberedValue2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1491089903);
            for (int i5 = 2; -1 < i5; i5--) {
                m3740ScoreDigitFHprtrg(i, i5, null, null, 0L, RecyclerView.DECELERATION_RATE, gapComposer, i4 & 14);
            }
            i3 = i;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            i3 = i;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(i3, modifier, i2, 12);
        }
    }

    public static final void ScoreHome(ScoreHomeViewModel scoreHomeViewModel, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        Modifier modifier2;
        ScrollState scrollState2;
        int i3;
        ScrollState rememberScrollState;
        Modifier modifier3;
        LocalizedString localizedString;
        ScrollState scrollState3;
        boolean z;
        scoreHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-744434097);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(scoreHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            gapComposer2.startDefaults();
            int i5 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i5 == 0 || gapComposer2.getDefaultsInvalid()) {
                i3 = i4 & (-7169);
                rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
                modifier3 = companion;
            } else {
                gapComposer2.skipToGroupEnd();
                rememberScrollState = scrollState;
                i3 = i4 & (-7169);
                modifier3 = modifier;
            }
            gapComposer2.endDefaults();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z2 = scoreHomeViewModel instanceof ScoreHomeViewModel.Loading;
            if (!z2) {
                if (!(scoreHomeViewModel instanceof ScoreHomeViewModel.Loaded)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                CashCreditScoreHomeData.TitleBar titleBar = ((ScoreHomeViewModel.Loaded) scoreHomeViewModel).data.title_bar;
                if (titleBar != null && (localizedString = titleBar.title) != null) {
                    str = localizedString.translated_value;
                }
            }
            int i6 = i3;
            NavigationType navigationType = NavigationType.BACK;
            int i7 = i6 & 112;
            boolean z3 = i7 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            String str2 = str;
            Modifier modifier4 = modifier3;
            DBUtil.TitleBarSub(str2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            if (z2) {
                gapComposer.startReplaceGroup(-1508857494);
                LoadingContent(SizeKt.fillMaxSize(companion, 1.0f), gapComposer, 6);
                gapComposer.end(false);
                function12 = function1;
                scrollState3 = rememberScrollState;
            } else {
                if (!(scoreHomeViewModel instanceof ScoreHomeViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1508859037, false);
                }
                gapComposer.startReplaceGroup(-1508854362);
                ScrollState scrollState4 = rememberScrollState;
                ScoreHomeContent((ScoreHomeViewModel.Loaded) scoreHomeViewModel, function1, null, scrollState4, gapComposer, i6 & 7294);
                function12 = function1;
                scrollState3 = scrollState4;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (scoreHomeViewModel instanceof ScoreHomeViewModel.Loaded) {
                gapComposer.startReplaceGroup(1858400587);
                ScoreHomeViewModel.Loaded loaded = (ScoreHomeViewModel.Loaded) scoreHomeViewModel;
                ScoreHomeSheet scoreHomeSheet = loaded.sheet;
                if (scoreHomeSheet == null) {
                    gapComposer.startReplaceGroup(1775843350);
                    z = false;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1775843351);
                    if (scoreHomeSheet instanceof ScoreHomeSheet.RecommendationSheet) {
                        gapComposer.startReplaceGroup(84441393);
                        CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = ((ScoreHomeSheet.RecommendationSheet) scoreHomeSheet).data;
                        StyledCardViewModel styledCardViewModel = loaded.cardModel;
                        boolean z4 = i7 == 32;
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (z4 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(2, function12);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Function0 function0 = (Function0) rememberedValue2;
                        boolean changedInstance = gapComposer.changedInstance(scoreHomeSheet) | (i7 == 32);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda3(1, function12, scoreHomeSheet);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        RecommendationSheet(recommendationOverlayData, styledCardViewModel, function0, (Function1) rememberedValue3, gapComposer, 0);
                        z = false;
                        gapComposer.end(false);
                    } else {
                        z = false;
                        if (!(scoreHomeSheet instanceof ScoreHomeSheet.ScoreSummarySheet)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 84439222, false);
                        }
                        gapComposer.startReplaceGroup(84462061);
                        ScoreSummarySheet(((ScoreHomeSheet.ScoreSummarySheet) scoreHomeSheet).data, function12, gapComposer, i7);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                }
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1776643027);
                gapComposer.end(false);
            }
            scrollState2 = scrollState3;
            modifier2 = modifier4;
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            scrollState2 = scrollState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4((Object) scoreHomeViewModel, function12, modifier2, (Object) scrollState2, i, 16);
        }
    }

    public static final void ScoreHomeContent(ScoreHomeViewModel.Loaded loaded, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier modifier3;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1738573262);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(scrollState) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer2.startDefaults();
            int i4 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 == 0 || gapComposer2.getDefaultsInvalid()) {
                modifier3 = companion;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer2.endDefaults();
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(modifier3, scrollState, false, 14));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(navigationBarsPadding, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 64.0f, 5);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CashCreditScoreHomeData cashCreditScoreHomeData = loaded.data;
            CashCreditScoreHomeData.ScoreSummary scoreSummary = cashCreditScoreHomeData.score_summary;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (scoreSummary == null) {
                gapComposer2.startReplaceGroup(1154861339);
                gapComposer2.end(false);
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                gapComposer2.startReplaceGroup(1154861340);
                ProfileAvatarViewModel profileAvatarViewModel = loaded.profileAvatarModel;
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(0, function12);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                ScoreSummary(scoreSummary, profileAvatarViewModel, (Function1) rememberedValue, null, gapComposer2, 0);
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(-1625306279);
            Iterator it = cashCreditScoreHomeData.info_sections.iterator();
            while (it.hasNext()) {
                int i5 = i3;
                Modifier modifier4 = modifier3;
                Function1 function13 = function12;
                GapComposer gapComposer3 = gapComposer2;
                InfoSection((CashCreditScoreHomeData.InfoSection) it.next(), loaded.cardModel, function13, null, gapComposer3, (i5 << 3) & 896);
                gapComposer2 = gapComposer3;
                companion = companion;
                function12 = function13;
                z = z;
                i3 = i5;
                modifier3 = modifier4;
                c = ' ';
            }
            GapComposer gapComposer4 = gapComposer2;
            Modifier.Companion companion2 = companion;
            gapComposer = gapComposer4;
            int i6 = i3;
            Modifier modifier5 = modifier3;
            boolean z3 = z;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            gapComposer.end(z3);
            CashCreditScoreHomeData.DisclaimerSection disclaimerSection = cashCreditScoreHomeData.disclaimer_section;
            if (disclaimerSection == null) {
                gapComposer.startReplaceGroup(1155271810);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(1155271811);
                DBUtil.SpacerBetweenSectionLarge(z3 ? 1 : 0, 1, gapComposer, null);
                boolean z4 = (i6 & 112) == 32 ? true : z3 ? 1 : 0;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy3) {
                    rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(1, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                DisclaimerSection(disclaimerSection, (Function1) rememberedValue2, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, z3 ? 1 : 0);
                gapComposer.end(z3);
            }
            gapComposer.end(true);
            modifier2 = modifier5;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4((Object) loaded, function12, modifier2, (Object) scrollState, i, 17);
        }
    }

    /* renamed from: ScoreLockLabel-Jy8F4Js, reason: not valid java name */
    public static final void m3741ScoreLockLabelJy8F4Js(final String str, final long j, final long j2, final long j3, Modifier modifier, Composer composer, final int i) {
        String str2;
        int i2;
        GapComposer gapComposer;
        final Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(454971952);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(j3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 1, 0, 0, (i3 & 14) | 1572864 | ((i3 << 6) & 7168), 0, 4016, j, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(companion, RoundedCornerShape), j2, ColorKt.RectangleShape), 1.0f, j3, RoundedCornerShape), 12.0f, 8.0f), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.score.views.ScoreVisualizationKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    CalloutKt.m3741ScoreLockLabelJy8F4Js(str, j, j2, j3, modifier2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ScoreLockLabeledLine(int i, Composer composer, Modifier modifier, String str, boolean z) {
        Modifier modifier2;
        long j;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1876276692);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            modifier2 = modifier;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            long j3 = Strings.getColors(gapComposer).semantic.text.placeholder;
            if (z) {
                gapComposer.startReplaceGroup(1562406169);
                j = Strings.getColors(gapComposer).semantic.text.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1562478678);
                j = Strings.getColors(gapComposer).semantic.text.placeholder;
                gapComposer.end(false);
            }
            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, null, "scoreLockTextColor", gapComposer, MLKEMEngine.KyberPolyBytes, 10);
            if (z) {
                gapComposer.startReplaceGroup(1562704854);
                j2 = Strings.getColors(gapComposer).semantic.background.brand;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1562780184);
                j2 = Strings.getColors(gapComposer).semantic.background.f1047app;
                gapComposer.end(false);
            }
            State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j2, null, "scoreLockBackgroundColor", gapComposer, MLKEMEngine.KyberPolyBytes, 10);
            State m153animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(z ? Color.Transparent : j3, null, "scoreLockBorderColor", gapComposer, MLKEMEngine.KyberPolyBytes, 10);
            float max = Math.max(1.0f, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(1.0f));
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(j3) | gapComposer.changed(max);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DividerKt$$ExternalSyntheticLambda0(j3, max, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(ClipKt.drawBehind(fillMaxWidth, (Function1) rememberedValue), gapComposer, 0);
            m3741ScoreLockLabelJy8F4Js(str, ((Color) m153animateColorAsStateeuL9pac.getValue()).value, ((Color) m153animateColorAsStateeuL9pac2.getValue()).value, ((Color) m153animateColorAsStateeuL9pac3.getValue()).value, null, gapComposer, i2 & 14);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new H6TextKt$$ExternalSyntheticLambda0(str, z, modifier2, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02b8, code lost:
    
        if (r4 == r2) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.ui.Modifier, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScoreSummary(CashCreditScoreHomeData.ScoreSummary scoreSummary, ProfileAvatarViewModel profileAvatarViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        CashCreditScoreHomeData.ScoreSummary scoreSummary2;
        GapComposer gapComposer;
        Modifier modifier2;
        CashCreditScoreHomeData.Visualization visualization;
        Object obj;
        Object obj2;
        MutableState mutableState;
        String str;
        String format2;
        Object obj3;
        Object obj4;
        boolean z;
        Object obj5;
        MutableState mutableState2;
        Integer num;
        float f;
        ?? r12;
        int i2;
        LocalizedString localizedString;
        GapComposer gapComposer2;
        int i3;
        boolean z2;
        Object obj6;
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock;
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock2;
        Function1 function12 = function1;
        scoreSummary.getClass();
        function12.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1346650022);
        Applier applier = gapComposer3.applier;
        int i4 = i | (gapComposer3.changedInstance(scoreSummary) ? 4 : 2) | (gapComposer3.changedInstance(profileAvatarViewModel) ? 32 : 16) | (gapComposer3.changedInstance(function12) ? 256 : 128) | 3072;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer3.consume(providableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer3.consume(providableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer3.consume(providableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 32.0f, 5);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Integer num2 = scoreSummary.score;
            CashCreditScoreHomeData.Visualization visualization2 = scoreSummary.visualization;
            num2.getClass();
            int intValue = num2.intValue();
            Object rememberedValue = gapComposer3.rememberedValue();
            ScoreDisplayContent.Score score = ScoreDisplayContent.Score.INSTANCE;
            Object obj7 = Composer.Companion.Empty;
            Object obj8 = rememberedValue;
            if (rememberedValue == obj7) {
                Object mutableStateOf$default = Updater.mutableStateOf$default(score);
                gapComposer3.updateRememberedValue(mutableStateOf$default);
                obj8 = mutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) obj8;
            Object rememberedValue2 = gapComposer3.rememberedValue();
            Object obj9 = rememberedValue2;
            if (rememberedValue2 == obj7) {
                Object mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                gapComposer3.updateRememberedValue(mutableStateOf$default2);
                obj9 = mutableStateOf$default2;
            }
            MutableState mutableState4 = (MutableState) obj9;
            if (visualization2 != null && (scoreLock2 = visualization2.score_lock) != null) {
                LocalizedString localizedString2 = scoreLock2.unlock_celebration_text;
                mutableState4.setValue(localizedString2 != null ? localizedString2.translated_value : null);
            }
            Object obj10 = (visualization2 == null || (scoreLock = visualization2.score_lock) == null) ? null : scoreLock.show_unlock_celebration;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            Object obj11 = rememberedValue3;
            if (rememberedValue3 == obj7) {
                Object mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.valueOf(Intrinsics.areEqual(obj10, Boolean.TRUE)));
                gapComposer3.updateRememberedValue(mutableStateOf$default3);
                obj11 = mutableStateOf$default3;
            }
            MutableState mutableState5 = (MutableState) obj11;
            ScoreDisplayContent scoreDisplayContent = (ScoreDisplayContent) mutableState3.getValue();
            boolean changed = gapComposer3.changed(obj10);
            Object obj12 = obj10;
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (changed || rememberedValue4 == obj7) {
                rememberedValue4 = new AndroidFileSaver$save$2(obj12, mutableState3, mutableState5, null, 25);
                visualization = visualization2;
                obj = obj12;
                gapComposer3.updateRememberedValue(rememberedValue4);
            } else {
                visualization = visualization2;
                obj = obj12;
            }
            Updater.LaunchedEffect(obj, scoreDisplayContent, (Function2) rememberedValue4, gapComposer3);
            if (((Boolean) mutableState5.getValue()).booleanValue() || ((String) mutableState4.getValue()) == null || !Intrinsics.areEqual((ScoreDisplayContent) mutableState3.getValue(), score)) {
                obj2 = obj7;
                mutableState = mutableState3;
                str = null;
                gapComposer3.startReplaceGroup(-1000722650);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-1000890825);
                Unit unit = Unit.INSTANCE;
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (rememberedValue5 == obj7) {
                    obj2 = obj7;
                    mutableState = mutableState3;
                    str = null;
                    z2 = false;
                    Object scoreSummaryKt$ScoreSummary$1$3$1 = new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState4, mutableState, (Continuation) (false ? 1 : 0), (int) (false ? 1 : 0));
                    gapComposer3.updateRememberedValue(scoreSummaryKt$ScoreSummary$1$3$1);
                    obj6 = scoreSummaryKt$ScoreSummary$1$3$1;
                } else {
                    obj2 = obj7;
                    mutableState = mutableState3;
                    str = null;
                    z2 = false;
                    obj6 = rememberedValue5;
                }
                Updater.LaunchedEffect(gapComposer3, unit, (Function2) obj6);
                gapComposer3.end(z2);
            }
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (visualization == null) {
                gapComposer3.startReplaceGroup(-696194331);
                gapComposer3.end(false);
                mutableState2 = mutableState;
                i3 = 0;
                gapComposer2 = gapComposer3;
                obj3 = obj2;
                num = num2;
                f = RecyclerView.DECELERATION_RATE;
                r12 = str;
                i2 = intValue;
            } else {
                gapComposer3.startReplaceGroup(-696194330);
                CashCreditScoreHomeData.Visualization visualization3 = visualization;
                Float f2 = visualization3.fill_fraction;
                Integer valueOf2 = Integer.valueOf(MathKt__MathJVMKt.roundToInt((f2 != null ? f2.floatValue() : RecyclerView.DECELERATION_RATE) * 100.0f));
                CashCreditScoreHomeData.Visualization.ScoreLock scoreLock3 = visualization3.score_lock;
                String str2 = (scoreLock3 == null || (localizedString = scoreLock3.text) == null) ? str : localizedString.translated_value;
                if (str2 == null) {
                    gapComposer3.startReplaceGroup(2108427544);
                    gapComposer3.end(false);
                    format2 = str;
                } else {
                    gapComposer3.startReplaceGroup(2108427545);
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put(AnnotatedPrivateKey.LABEL, str2);
                    format2 = new MessageFormat(Room.stringResource(gapComposer3, R.string.score_visualization_score_lock_description)).format(arrayMap);
                    format2.getClass();
                    gapComposer3.end(false);
                }
                if (format2 == null) {
                    format2 = "";
                }
                ArrayMap arrayMap2 = new ArrayMap(2);
                arrayMap2.put("scoreLockDescription", format2);
                arrayMap2.put("percent", valueOf2);
                String format3 = new MessageFormat(Room.stringResource(gapComposer3, R.string.score_visualization_fill_content_description)).format(arrayMap2);
                format3.getClass();
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changed2 = gapComposer3.changed(format3);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (changed2) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                    obj4 = rememberedValue6;
                }
                Object realSandboxer$$ExternalSyntheticLambda1 = new RealSandboxer$$ExternalSyntheticLambda1(format3, 10);
                gapComposer3.updateRememberedValue(realSandboxer$$ExternalSyntheticLambda1);
                obj4 = realSandboxer$$ExternalSyntheticLambda1;
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth2, (Function1) obj4);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == obj3) {
                    z = 0;
                    Object scoreSummaryKt$$ExternalSyntheticLambda1 = new ScoreSummaryKt$$ExternalSyntheticLambda1(mutableState, mutableState4, 0);
                    gapComposer3.updateRememberedValue(scoreSummaryKt$$ExternalSyntheticLambda1);
                    obj5 = scoreSummaryKt$$ExternalSyntheticLambda1;
                } else {
                    z = 0;
                    obj5 = rememberedValue7;
                }
                mutableState2 = mutableState;
                GapComposer gapComposer4 = gapComposer3;
                num = num2;
                f = RecyclerView.DECELERATION_RATE;
                r12 = str;
                i2 = intValue;
                m3742ScoreVisualizationTN_CM5M(visualization3, profileAvatarViewModel, clearAndSetSemantics, (Function0) obj5, gapComposer4, (i4 & 112) | 24960);
                gapComposer4.end(z);
                i3 = z;
                gapComposer2 = gapComposer4;
            }
            DBUtil.SpacerWithinSectionMedium(i3, 1, gapComposer2, r12);
            Object[] objArr = new Object[i3];
            scoreSummary2 = scoreSummary;
            boolean changedInstance = gapComposer2.changedInstance(scoreSummary2) | gapComposer2.changed(i2);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            Object obj13 = rememberedValue8;
            if (changedInstance || rememberedValue8 == obj3) {
                Object q2__externalsyntheticlambda8 = new q2$$ExternalSyntheticLambda8(scoreSummary2, i2, 14);
                gapComposer2.updateRememberedValue(q2__externalsyntheticlambda8);
                obj13 = q2__externalsyntheticlambda8;
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) SaverKt.rememberSaveable(objArr, (Function0) obj13, gapComposer2, 0);
            boolean changed3 = gapComposer2.changed(parcelableSnapshotMutableIntState) | gapComposer2.changed(i2);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            Object obj14 = rememberedValue9;
            if (changed3 || rememberedValue9 == obj3) {
                Object ringtoneView$playRingtone$1 = new RingtoneView$playRingtone$1(i2, parcelableSnapshotMutableIntState, (Continuation) r12, 12);
                gapComposer2.updateRememberedValue(ringtoneView$playRingtone$1);
                obj14 = ringtoneView$playRingtone$1;
            }
            Updater.LaunchedEffect(gapComposer2, num, (Function2) obj14);
            ScoreDisplayContent scoreDisplayContent2 = (ScoreDisplayContent) mutableState2.getValue();
            Object rememberedValue10 = gapComposer2.rememberedValue();
            Object obj15 = rememberedValue10;
            if (rememberedValue10 == obj3) {
                Object anonymousClass3 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState2, r12, 13);
                gapComposer2.updateRememberedValue(anonymousClass3);
                obj15 = anonymousClass3;
            }
            Updater.LaunchedEffect(gapComposer2, scoreDisplayContent2, (Function2) obj15);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            Object obj16 = rememberedValue11;
            if (rememberedValue11 == obj3) {
                obj16 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj16;
            float mo233toDpu2uoSUM = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState2.getIntValue());
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), mo233toDpu2uoSUM, f, 2);
            ScoreDisplayContent scoreDisplayContent3 = (ScoreDisplayContent) mutableState2.getValue();
            Object rememberedValue12 = gapComposer2.rememberedValue();
            Object obj17 = rememberedValue12;
            if (rememberedValue12 == obj3) {
                Object calloutKt$$ExternalSyntheticLambda1 = new CalloutKt$$ExternalSyntheticLambda1(5);
                gapComposer2.updateRememberedValue(calloutKt$$ExternalSyntheticLambda1);
                obj17 = calloutKt$$ExternalSyntheticLambda1;
            }
            Function1 function13 = (Function1) obj17;
            function12 = function1;
            GapComposer gapComposer5 = gapComposer2;
            AnimatedContentKt.AnimatedContent(scoreDisplayContent3, m279heightInVpY3zN4$default, function13, biasAlignment, "scoreDisplayContent", null, Expect_jvmKt.rememberComposableLambda(2021094518, new TabToolbarsKt$$ExternalSyntheticLambda16(scoreSummary2, function12, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState2), gapComposer2), gapComposer5, 1600896, 32);
            gapComposer = gapComposer5;
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            scoreSummary2 = scoreSummary;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(scoreSummary2, i, profileAvatarViewModel, function12, modifier2, 3);
        }
    }

    public static final void ScoreSummarySheet(CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData, Function1 function1, Composer composer, int i) {
        int i2;
        scoreSummaryOverlayData.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1227933981);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(scoreSummaryOverlayData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-403030662, new ShareSheetViewKt$$ExternalSyntheticLambda1(22, (Object) scoreSummaryOverlayData, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(scoreSummaryOverlayData, function1, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    public static final void ScoreSummarySheetContent(CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        String str;
        int i2;
        ?? r0;
        Modifier modifier2;
        Modifier.Companion companion;
        GapComposer gapComposer2;
        boolean z;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(889776879);
        int i3 = i | (gapComposer3.changedInstance(scoreSummaryOverlayData) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16) | (gapComposer3.changed(modifier) ? 256 : 128);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer3), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LocalizedString localizedString = scoreSummaryOverlayData.title;
            List list = scoreSummaryOverlayData.list;
            if (localizedString == null || (str = localizedString.translated_value) == null) {
                str = "";
            }
            LocalizedString localizedString2 = scoreSummaryOverlayData.subtitle;
            String str2 = localizedString2 != null ? localizedString2.translated_value : null;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Transformations.SheetHeader(str, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), (Function2) null, str2, gapComposer3, 0, 4);
            LocalizedString localizedString3 = scoreSummaryOverlayData.body;
            String str3 = localizedString3 != null ? localizedString3.translated_value : null;
            if (str3 == null) {
                gapComposer3.startReplaceGroup(-1618987002);
                gapComposer3.end(false);
                i2 = i3;
                gapComposer2 = gapComposer3;
                modifier2 = null;
                companion = companion2;
                r0 = 0;
            } else {
                gapComposer3.startReplaceGroup(-1618987001);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 8.0f);
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer3.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, false, 18);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer4 = gapComposer3;
                i2 = i3;
                r0 = 0;
                modifier2 = null;
                companion = companion2;
                LazyDslKt.m305MultiblockMarkdown1kVgcOc(str3, (Function2) rememberedValue, m299paddingVpY3zN4, textStyle, 0L, null, 0, null, gapComposer4, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            if (list.isEmpty()) {
                gapComposer2.startReplaceGroup(-1616179703);
                gapComposer2.end(r0);
            } else {
                gapComposer2.startReplaceGroup(-1618506284);
                DBUtil.SpacerWithinSectionMedium(r0, 1, gapComposer2, modifier2);
                List<CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem : list2) {
                        if (listItem.accessory_icon != null && listItem.accessory_text != null) {
                            z = true;
                            break;
                        }
                    }
                }
                z = r0;
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, z ? ListUnorderedProminence.Subtle : ListUnorderedProminence.Standard, z ? ListUnorderedSize.Large : ListUnorderedSize.Compact, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(238803620, new ButtonGroupKt$$ExternalSyntheticLambda11(scoreSummaryOverlayData, 20), gapComposer2), gapComposer2, 196608, 19);
                gapComposer2.end(r0);
            }
            boolean z3 = true;
            DBUtil.SpacerWithinSectionMedium(r0, 1, gapComposer2, modifier2);
            CashCreditScoreHomeData.DisclaimerSection disclaimerSection = scoreSummaryOverlayData.disclaimer_section;
            if (disclaimerSection == null) {
                gapComposer2.startReplaceGroup(-1616106978);
                gapComposer2.end(r0);
            } else {
                gapComposer2.startReplaceGroup(-1616106977);
                DBUtil.SpacerWithinSectionMedium(r0, 1, gapComposer2, modifier2);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                DisclaimerSection(disclaimerSection, function1, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer2, i2 & 112);
                gapComposer2.end(r0);
                z3 = true;
            }
            gapComposer2.end(z3);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(scoreSummaryOverlayData, function1, modifier, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScoreTextInfo(CashCreditScoreHomeData.ScoreSummary scoreSummary, int i, Function1 function1, Modifier modifier, Composer composer, int i2, int i3) {
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier.Companion companion;
        String str;
        Modifier modifier4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1640449318);
        Applier applier = gapComposer.applier;
        int i4 = (gapComposer.changedInstance(scoreSummary) ? 4 : 2) | i2 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier modifier5 = i5 != 0 ? companion2 : modifier2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier5, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                Icons icons = null;
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
                ScoreDigits(i, (i4 >> 3) & 14, gapComposer, null);
                LocalizedString localizedString = scoreSummary.action_text;
                String str3 = localizedString != null ? localizedString.translated_value : null;
                Icon icon = scoreSummary.action_leading_icon;
                if (icon != null && (str2 = icon.arcade_id) != null) {
                    Icons.Companion.getClass();
                    icons = zzd.get(str2);
                }
                if (icons == null && str3 == null) {
                    gapComposer.startReplaceGroup(370010418);
                    gapComposer.end(false);
                    modifier4 = modifier5;
                    z4 = true;
                } else {
                    gapComposer.startReplaceGroup(368731141);
                    Modifier modifier6 = modifier5;
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    gapComposer.startReplaceGroup(150451975);
                    gapComposer.startReplaceGroup(150447686);
                    Modifier clip = ClipKt.clip(companion2, RoundedCornerShapeKt.RoundedCornerShape(50));
                    CashCreditScoreHomeData.Action action = scoreSummary.action;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Icons icons2 = icons;
                    if (action != null) {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        Role role = new Role(0);
                        boolean changedInstance = ((i4 & 896) == 256) | gapComposer.changedInstance(action);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new CalloutKt$$ExternalSyntheticLambda2(function1, action, 2);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        companion = companion2;
                        clip = clip.then(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, role, (Function0) rememberedValue, 11));
                    } else {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        companion = companion2;
                    }
                    gapComposer.end(false);
                    LocalizedString localizedString2 = scoreSummary.action_accessibility_description;
                    if (localizedString2 == null || (str = localizedString2.translated_value) == null) {
                        str = str3;
                    }
                    if (str != null) {
                        boolean changed = gapComposer.changed(str);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new RealSandboxer$$ExternalSyntheticLambda1(str, 11);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        clip = clip.then(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2));
                    }
                    gapComposer.end(false);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(clip, 16.0f, 8.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                    if (icons2 != null) {
                        gapComposer.startReplaceGroup(-1463154976);
                        modifier4 = modifier6;
                        z2 = true;
                        Trace.m1191Iconww6aTOc(icons2, (String) null, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).semantic.text.standard, RoundedCornerShapeKt.CircleShape), 2.0f), Strings.getColors(gapComposer).semantic.text.inverse, gapComposer, 48, 0);
                        z = false;
                        gapComposer.end(false);
                    } else {
                        modifier4 = modifier6;
                        z = false;
                        z2 = true;
                        gapComposer.startReplaceGroup(-1462819277);
                        gapComposer.end(false);
                    }
                    if (str3 != null) {
                        gapComposer.startReplaceGroup(-1462779690);
                        z4 = z2;
                        z3 = z;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(z3);
                    } else {
                        z3 = z;
                        z4 = z2;
                        gapComposer.startReplaceGroup(-1462598061);
                        gapComposer.end(z3);
                    }
                    gapComposer.end(z4);
                    gapComposer.end(z3);
                }
                gapComposer.end(z4);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BadgeNameKt$$ExternalSyntheticLambda1(scoreSummary, i, function1, modifier3, i2, i3);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0343  */
    /* renamed from: ScoreVisualization-TN_CM5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3742ScoreVisualizationTN_CM5M(CashCreditScoreHomeData.Visualization visualization, ProfileAvatarViewModel profileAvatarViewModel, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        Animatable animatable;
        MutableState mutableState;
        MutableState mutableState2;
        CashCreditScoreHomeData.Visualization.ScoreLock scoreLock;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        Object rememberedValue;
        MutableState mutableState3;
        boolean z4;
        Float f;
        LocalizedString localizedString;
        visualization.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1749279375);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(visualization) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(profileAvatarViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(339.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(modifier, 339.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Float f2 = visualization.previous_fill_fraction;
            CashCreditScoreHomeData.Visualization.ScoreLock scoreLock2 = visualization.score_lock;
            final float floatValue = f2 != null ? f2.floatValue() : RecyclerView.DECELERATION_RATE;
            Float f3 = visualization.fill_fraction;
            float floatValue2 = f3 != null ? f3.floatValue() : RecyclerView.DECELERATION_RATE;
            boolean z5 = !(floatValue == floatValue2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            Object[] objArr = new Object[0];
            boolean changed = gapComposer.changed(z5);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                rememberedValue3 = new Braze$$ExternalSyntheticLambda34(z5, 11);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer, 0);
            Motion motion = (Motion) gapComposer.consume(MotionKt.LocalMotion);
            boolean z6 = Dp.m1036compareTo0680j_4(80.0f, 339.0f) > 0;
            Object[] objArr2 = new Object[0];
            int i4 = i2;
            WorkCookieJar workCookieJar = new WorkCookieJar(9);
            boolean changed2 = gapComposer.changed(floatValue);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == obj) {
                rememberedValue4 = new Function0() { // from class: com.squareup.cash.score.views.ScoreVisualizationKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnimatableKt.Animatable(floatValue, 0.001f);
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Animatable animatable2 = (Animatable) SaverKt.m581rememberSaveable(objArr2, (Saver) workCookieJar, (Function0) rememberedValue4, (Composer) gapComposer, 0);
            Object[] objArr3 = new Object[0];
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = new DateScrubber$$ExternalSyntheticLambda0(26);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue5, gapComposer, 48);
            Float valueOf = Float.valueOf(floatValue2);
            boolean changedInstance = gapComposer.changedInstance(animatable2) | gapComposer.changed(floatValue2) | gapComposer.changed(mutableState5) | gapComposer.changed(motion);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue6 == obj) {
                animatable = animatable2;
                mutableState = mutableState5;
                rememberedValue6 = new DefaultFlingBehavior$performFling$2(animatable, floatValue2, motion, mutableState4, mutableState, null);
                gapComposer.updateRememberedValue(rememberedValue6);
            } else {
                animatable = animatable2;
                mutableState = mutableState5;
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue6);
            if (z6) {
                mutableState2 = mutableState6;
                scoreLock = scoreLock2;
                z = false;
                i3 = 16384;
                gapComposer.startReplaceGroup(-731518867);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-733036286);
                String str = (scoreLock2 == null || (localizedString = scoreLock2.text) == null) ? null : localizedString.translated_value;
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == obj) {
                    rememberedValue7 = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState7 = (MutableState) rememberedValue7;
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == obj) {
                    rememberedValue8 = Updater.mutableStateOf$default("");
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState8 = (MutableState) rememberedValue8;
                if (scoreLock2 != null) {
                    Float f4 = scoreLock2.threshold;
                    f4.getClass();
                    mutableState7.setValue(new Dp(f4.floatValue() * 259.0f));
                }
                if (str != null) {
                    mutableState8.setValue(str);
                }
                Object[] objArr4 = new Object[0];
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (rememberedValue9 == obj) {
                    rememberedValue9 = new DateScrubber$$ExternalSyntheticLambda0(27);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue9, gapComposer, 48);
                if (scoreLock2 != null ? Intrinsics.areEqual(scoreLock2.show_unlock_celebration, Boolean.TRUE) : false) {
                    if (((Number) animatable.getValue()).floatValue() >= ((scoreLock2 == null || (f = scoreLock2.threshold) == null) ? Float.MAX_VALUE : f.floatValue())) {
                        mutableState9.setValue(Boolean.TRUE);
                    }
                }
                if (str == null || ((Boolean) mutableState6.getValue()).booleanValue()) {
                    mutableState3 = mutableState6;
                    z4 = false;
                } else {
                    mutableState3 = mutableState6;
                    z4 = true;
                }
                Result result = motion.springs;
                EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(TargetUtils.soft$default((zzb) result.text), 2);
                zzb zzbVar = (zzb) result.text;
                zzb zzbVar2 = (zzb) result.text;
                EnterTransitionImpl plus = fadeIn$default.plus(EnterExitTransitionKt.expandHorizontally$default(TargetUtils.soft$default(zzbVar), null, 14));
                ExitTransitionImpl plus2 = EnterExitTransitionKt.fadeOut$default(TargetUtils.soft$default(zzbVar2), 2).plus(EnterExitTransitionKt.shrinkHorizontally$default(TargetUtils.soft$default(zzbVar2), Alignment.Companion.CenterHorizontally, 12));
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.BottomCenter), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ((Dp) mutableState7.getValue()).value, 7);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1359395528, new ShareSheetViewKt$$ExternalSyntheticLambda1(23, mutableState8, mutableState9), gapComposer);
                mutableState2 = mutableState3;
                i3 = 16384;
                scoreLock = scoreLock2;
                z = false;
                AnimatedContentKt.AnimatedVisibility(z4, m302paddingqDBjuR0$default, plus, plus2, (String) null, (Function3) rememberComposableLambda, (Composer) gapComposer, 196608, 16);
                gapComposer.end(false);
            }
            CashCreditScoreHomeData.Visualization.ScoreLock scoreLock3 = visualization.score_lock;
            List list = visualization.dot_fraction;
            float floatValue3 = ((Number) animatable.getValue()).floatValue();
            if (((Boolean) mutableState.getValue()).booleanValue() && !((Boolean) mutableState4.getValue()).booleanValue()) {
                if (scoreLock != null ? Intrinsics.areEqual(scoreLock.show_unlock_celebration, Boolean.TRUE) : z) {
                    z2 = true;
                    boolean changed3 = gapComposer.changed(mutableState2);
                    if ((i4 & 57344) == i3) {
                        z = true;
                    }
                    z3 = z | changed3;
                    rememberedValue = gapComposer.rememberedValue();
                    if (!z3 || rememberedValue == obj) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda7(function0, mutableState2, 6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    m3743ScoreVisualizationBarKlbNRUg(profileAvatarViewModel, floatValue3, null, scoreLock3, list, z2, (Function0) rememberedValue, gapComposer, ((i4 >> 3) & 14) | MLKEMEngine.KyberPolyBytes | ((i4 << 3) & 7168));
                    gapComposer = gapComposer;
                    gapComposer.end(true);
                }
            }
            z2 = z;
            boolean changed32 = gapComposer.changed(mutableState2);
            if ((i4 & 57344) == i3) {
            }
            z3 = z | changed32;
            rememberedValue = gapComposer.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda7(function0, mutableState2, 6);
            gapComposer.updateRememberedValue(rememberedValue);
            m3743ScoreVisualizationBarKlbNRUg(profileAvatarViewModel, floatValue3, null, scoreLock3, list, z2, (Function0) rememberedValue, gapComposer, ((i4 >> 3) & 14) | MLKEMEngine.KyberPolyBytes | ((i4 << 3) & 7168));
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(visualization, profileAvatarViewModel, modifier, function0, i, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ScoreVisualizationBar-KlbNRUg, reason: not valid java name */
    public static final void m3743ScoreVisualizationBarKlbNRUg(final ProfileAvatarViewModel profileAvatarViewModel, final float f, Modifier modifier, final CashCreditScoreHomeData.Visualization.ScoreLock scoreLock, final List list, final boolean z, final Function0 function0, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        GapComposer gapComposer;
        float f2;
        boolean z2;
        String m;
        boolean z3;
        Modifier.Companion companion;
        RoundedCornerShape roundedCornerShape;
        boolean z4;
        GapComposer gapComposer2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Function0 function02;
        Animatable animatable;
        Animatable animatable2;
        Modifier.Companion companion2;
        AvatarSize avatarSize;
        AvatarImage localIcon;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1228835733);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer3.changedInstance(profileAvatarViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changed(80.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer3.changed(339.0f) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= gapComposer3.changedInstance(scoreLock) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer3.changedInstance(list) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer3.changed(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer3.changedInstance(function0) ? 67108864 : 33554432;
        }
        if (gapComposer3.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            boolean z5 = Dp.m1036compareTo0680j_4(80.0f, 339.0f) > 0;
            BiasAlignment biasAlignment = z5 ? Alignment.Companion.CenterStart : Alignment.Companion.BottomCenter;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion3, 80.0f, 339.0f);
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            int i4 = i3;
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors.semantic.background.subtle, RoundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            Function0 function03 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function03);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            float min = Math.min(80.0f, 339.0f);
            float max = Math.max(80.0f, 339.0f);
            float f3 = 2.0f;
            if (list.isEmpty()) {
                f2 = 2.0f;
                z2 = false;
                gapComposer3.startReplaceGroup(665826941);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(665392569);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(ScoreVisualizationBar_KlbNRUg$lambda$1$fractionalPlacementPadding(SpacerKt.m298padding3ABfNKs(companion3, (min - f3) / f3), z5, min, ((Number) it.next()).floatValue()), f3);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    float f4 = f3;
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors2.semantic.background.inverse, RoundedCornerShapeKt.CircleShape), gapComposer3, 0);
                    f3 = f4;
                }
                f2 = f3;
                z2 = false;
                gapComposer3.end(false);
            }
            Image image = scoreLock != null ? scoreLock.image : null;
            if (image == null) {
                gapComposer3.startReplaceGroup(665851151);
                gapComposer3.end(z2);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 714215730, image, gapComposer3, z2);
            }
            if (m == null) {
                gapComposer3.startReplaceGroup(665875982);
                gapComposer3.end(z2);
                z4 = z2;
                companion = companion3;
                roundedCornerShape = RoundedCornerShape;
                z3 = z5;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(665875983);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, (min - 56.0f) / f2, 1);
                Float f5 = scoreLock.threshold;
                f5.getClass();
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(ScoreVisualizationBar_KlbNRUg$lambda$1$fractionalPlacementPadding(m300paddingVpY3zN4$default, z5, min, f5.floatValue()), 56.0f);
                z3 = z5;
                String str = m;
                companion = companion3;
                roundedCornerShape = RoundedCornerShape;
                z4 = 0;
                AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, m285size3ABfNKs2, null, null, null, gapComposer3, 48, 2040);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            float m2 = CameraState$Type$EnumUnboxingLocalUtility.m(max, min, f, min);
            Modifier fillMaxHeight = z3 ? SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(companion, m2), 1.0f) : SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), m2);
            BiasAlignment biasAlignment2 = Alignment.Companion.TopEnd;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(9);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxHeight, (Function1) rememberedValue);
            Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z4);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(z4);
            }
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(graphicsLayer, colors3.semantic.background.brand, roundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, z4);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU2);
            ComposeUiNode.Companion.getClass();
            Function0 function04 = ComposeUiNode.Companion.Constructor;
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function04);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode2);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            int i5 = z4;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new Animatable(Integer.valueOf(i5), AnimatableKt.IntToVector, (Object) null, 12);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable3 = (Animatable) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable4 = (Animatable) rememberedValue3;
            Object[] objArr = new Object[i5];
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new DateScrubber$$ExternalSyntheticLambda0(28);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue4, gapComposer2, 48);
            Motion motion = (Motion) gapComposer2.consume(MotionKt.LocalMotion);
            Boolean valueOf2 = Boolean.valueOf(z);
            boolean changed = ((i4 & 234881024) == 67108864) | ((i4 & 29360128) == 8388608) | gapComposer2.changed(mutableState) | gapComposer2.changedInstance(animatable4) | gapComposer2.changed(motion) | gapComposer2.changedInstance(animatable3);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                function02 = function04;
                rememberedValue5 = new RealContactSync$syncRequest$2(z, animatable4, motion, animatable3, function0, mutableState, (Continuation) null);
                animatable = animatable4;
                animatable2 = animatable3;
                gapComposer2.updateRememberedValue(rememberedValue5);
            } else {
                animatable = animatable4;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                function02 = function04;
                animatable2 = animatable3;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf2, (Function2) rememberedValue5);
            BiasAlignment biasAlignment3 = Alignment.Companion.Center;
            Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, min);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == obj) {
                companion2 = companion;
                rememberedValue6 = new CalloutKt$$ExternalSyntheticLambda1(10);
                gapComposer2.updateRememberedValue(rememberedValue6);
            } else {
                companion2 = companion;
            }
            Modifier graphicsLayer2 = ColorKt.graphicsLayer(m285size3ABfNKs3, (Function1) rememberedValue6);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, graphicsLayer2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function02);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$14, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$15);
            AvatarSize avatarSize2 = AvatarSize.Size16;
            Iterator it2 = AvatarSize.$ENTRIES.iterator();
            do {
                avatarSize = avatarSize2;
                if (!it2.hasNext()) {
                    break;
                } else {
                    avatarSize2 = (AvatarSize) it2.next();
                }
            } while (Dp.m1036compareTo0680j_4(min, avatarSize2.size) >= 0);
            Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors4.semantic.background.inverse;
            PaymentPlanSummaryKt$$ExternalSyntheticLambda11 paymentPlanSummaryKt$$ExternalSyntheticLambda11 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(22);
            String str2 = profileAvatarViewModel.photoUrl;
            String str3 = profileAvatarViewModel.monogram;
            if (str2 != null) {
                localIcon = new AvatarImage.Remote.Image(str2, false, null, 0L, paymentPlanSummaryKt$$ExternalSyntheticLambda11, 62);
            } else {
                localIcon = str3 == null ? new AvatarImage.LocalIcon(Icons.Avatar32, 0L, 6) : null;
            }
            if (str3 == null) {
                str3 = "";
            }
            AvatarEntry avatarEntry = new AvatarEntry(str3, j, null, localIcon, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            boolean changedInstance = gapComposer2.changedInstance(animatable2) | gapComposer2.changedInstance(animatable);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue7 == obj) {
                rememberedValue7 = new ScoreVisualizationKt$$ExternalSyntheticLambda10(animatable2, animatable, 0);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Modifier.Companion companion4 = companion2;
            TextViewKt.Avatar(avatarSize, avatarEntry, ColorKt.graphicsLayer(companion4, (Function1) rememberedValue7), false, gapComposer2, 0, 24);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer2, true, true, true);
            modifier2 = companion4;
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.score.views.ScoreVisualizationKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    CalloutKt.m3743ScoreVisualizationBarKlbNRUg(ProfileAvatarViewModel.this, f, modifier2, scoreLock, list, z, function0, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Modifier ScoreVisualizationBar_KlbNRUg$lambda$1$fractionalPlacementPadding(Modifier modifier, boolean z, float f, float f2) {
        float f3 = RecyclerView.DECELERATION_RATE;
        float f4 = z ? (80.0f - f) * f2 : 0.0f;
        if (!z) {
            f3 = (339.0f - f) * f2;
        }
        return SpacerKt.m302paddingqDBjuR0$default(modifier, f4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f3, 6);
    }
}
