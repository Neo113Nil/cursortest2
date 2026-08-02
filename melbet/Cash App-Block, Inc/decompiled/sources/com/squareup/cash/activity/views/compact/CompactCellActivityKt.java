package com.squareup.cash.activity.views.compact;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class CompactCellActivityKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentHistoryData.AmountTreatment.values().length];
            try {
                iArr[PaymentHistoryData.AmountTreatment.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryData.AmountTreatment.SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentHistoryData.AmountTreatment.FADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentHistoryData.AmountTreatment.STRIKETHROUGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentHistoryData.InlineButtonProminence.values().length];
            try {
                iArr2[PaymentHistoryData.InlineButtonProminence.DESTRUCTIVE_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentHistoryData.InlineButtonProminence.DEFAULT_STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentHistoryData.InlineButtonProminence.DESTRUCTIVE_PROMINENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentHistoryData.InlineButtonProminence.PROMINENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PaymentHistoryData.InlineButtonProminence.DESTRUCTIVE_SUBTLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PaymentHistoryData.InlineButtonProminence.SUBTLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        new Color(new Color.ModeVariant("#FF4A4A", null, null, null, null, 30, null), (Color.ModeVariant) null, 6);
        ActivityItemOrigin activityItemOrigin = ActivityItemOrigin.HISTORY;
        new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, "token", (String) null, 12);
        ActivityScope.MY_ACTIVITY.getClass();
    }

    public static final void CompactActivityItemView(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ActivityItemViewModel activityItemViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        modifier.getClass();
        activityItemViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1585119811);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(activityItemViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            String str = activityItemViewModel.tertiaryLabel;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1436540500, new ActivityItemViewKt$$ExternalSyntheticLambda5(activityItemViewModel, function1, 2), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-677779260, new ActivityItemViewKt$$ExternalSyntheticLambda5(activityItemViewModel, function1, 3), gapComposer);
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            composableLambdaImpl2 = composableLambdaImpl;
            CompactCellActivity(composableLambdaImpl2, modifier, str, rememberComposableLambda, rememberComposableLambda2, (Function0) rememberedValue, gapComposer, ((i2 >> 3) & 14) | 27648 | ((i2 << 3) & 112), 0);
            modifier2 = modifier;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier2, composableLambdaImpl2, activityItemViewModel, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompactCellActivity(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, String str, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier.Companion companion;
        RealCompactActivityAccessoryScope realCompactActivityAccessoryScope;
        Modifier modifier4;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ?? r0;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-481200659);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(str) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl3) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier modifier5 = i4 != 0 ? companion2 : modifier2;
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new RealCompactActivityAccessoryScope();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                RealCompactActivityAccessoryScope realCompactActivityAccessoryScope2 = (RealCompactActivityAccessoryScope) rememberedValue;
                composableLambdaImpl3.invoke(realCompactActivityAccessoryScope2, gapComposer, Integer.valueOf(((i3 >> 9) & 112) | 6));
                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier5, 1.0f), androidx.compose.ui.graphics.Color.Unspecified, ColorKt.RectangleShape), 64.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean z = function0 != null;
                boolean z2 = (458752 & i3) == 131072;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == obj) {
                    rememberedValue2 = new y0$$ExternalSyntheticLambda0(17, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m279heightInVpY3zN4$default, z, null, null, (Function0) rememberedValue2, 14);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                Modifier modifier6 = modifier5;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
                gapComposer.startReusableNode();
                int i5 = i3;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$17);
                composableLambdaImpl2.invoke(RealCompactActivityAvatarScope.INSTANCE, gapComposer, Integer.valueOf(((i5 >> 6) & 112) | 6));
                gapComposer.end(true);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$15);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$17, 1.0f, true);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$15);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$17);
                Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).labelMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.standard, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(2116708715, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 10), gapComposer), gapComposer, 56);
                if (str == null) {
                    gapComposer.startReplaceGroup(129561647);
                    gapComposer.end(false);
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    r0 = 0;
                    companion = companion2;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    realCompactActivityAccessoryScope = realCompactActivityAccessoryScope2;
                    modifier4 = modifier6;
                } else {
                    gapComposer.startReplaceGroup(129561648);
                    companion = companion2;
                    realCompactActivityAccessoryScope = realCompactActivityAccessoryScope2;
                    modifier4 = modifier6;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    r0 = 0;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                BiasAlignment biasAlignment = Alignment.Companion.CenterEnd;
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, r0);
                int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$1);
                Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$12);
                Function2 function2 = (Function2) realCompactActivityAccessoryScope.accessoryContent$delegate.getValue();
                if (function2 == null) {
                    gapComposer.startReplaceGroup(1222622590);
                } else {
                    gapComposer.startReplaceGroup(732176099);
                    function2.invoke(gapComposer, Integer.valueOf((int) r0));
                }
                gapComposer.end(r0);
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(composableLambdaImpl, modifier3, str, composableLambdaImpl2, composableLambdaImpl3, function0, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PortraitImageAccessory(RealCompactActivityAccessoryScope realCompactActivityAccessoryScope, ItemAccessory.PortraitImage portraitImage, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(759152508);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(realCompactActivityAccessoryScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(portraitImage) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, portraitImage.imageUrl);
            AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState(m1446rememberAsyncImagePainter19ie5dc.state, null, gapComposer, 1).getValue();
            CrossfadeKt.Crossfade(Boolean.valueOf(state instanceof AsyncImagePainter.State.Error), (Modifier) null, (FiniteAnimationSpec) null, "PortraitImageAccessoryCrossfade", Expect_jvmKt.rememberComposableLambda(-469782115, new SwipeToDismissKt$$ExternalSyntheticLambda2(realCompactActivityAccessoryScope, function02, portraitImage, m1446rememberAsyncImagePainter19ie5dc, state, 2), gapComposer), gapComposer, 27648, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(realCompactActivityAccessoryScope, portraitImage, function0, i, 28);
        }
    }
}
