package com.squareup.cash.advertising.views;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import coil3.RealImageLoader;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.booklet.CollapsibleDetailsSection;
import com.squareup.cash.money.booklet.CollapsibleDetailsSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class FullscreenAdViewKt {
    public static final void CollapsibleDetail(CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail, boolean z, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1220360237);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(collapsibleDetail) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String stringResource = Room.stringResource(gapComposer, z ? R.string.money_booklet_collapsible_expanded_state : R.string.money_booklet_collapsible_collapsed_state);
            String stringResource2 = Room.stringResource(gapComposer, z ? R.string.money_booklet_collapsible_collapse_accessibility_action : R.string.money_booklet_collapsible_expand_accessibility_action);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, 11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue), false, stringResource2, new Role(0), function0, 9);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m183clickableoSLSa3U$default, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(m, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, collapsibleDetail.title, (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(Icons.SubtleExpand16, (String) null, ScaleKt.scale(companion, 1.0f, z ? -1.0f : 1.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 0);
            gapComposer.end(true);
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z, null, EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.expandVertically$default(null, 13)), EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkVertically$default(null, Alignment.Companion.Top, 13)), null, Expect_jvmKt.rememberComposableLambda(1878161605, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(collapsibleDetail, 15), gapComposer), gapComposer, 1600518 | (i2 & 112), 18);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(collapsibleDetail, z, function0, i, 23);
        }
    }

    public static final void CollapsibleDetailsSection(CollapsibleDetailsSection collapsibleDetailsSection, Set set, Composer composer, int i) {
        Set set2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-201990271);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(collapsibleDetailsSection) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            set2 = EmptySet.INSTANCE;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                Integer[] numArr = (Integer[]) set2.toArray(new Integer[0]);
                Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
                SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
                snapshotStateSet.addAll(ArraysKt___ArraysKt.toSet(copyOf));
                gapComposer.updateRememberedValue(snapshotStateSet);
                rememberedValue = snapshotStateSet;
            }
            SnapshotStateSet snapshotStateSet2 = (SnapshotStateSet) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1217004289);
            int i4 = 0;
            for (Object obj : collapsibleDetailsSection.collapsibleDetails) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail = (CollapsibleDetailsSection.CollapsibleDetail) obj;
                if (i4 != 0) {
                    gapComposer.startReplaceGroup(-1547050656);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, i2));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1546924765);
                    gapComposer.end(false);
                }
                boolean contains = snapshotStateSet2.contains(Integer.valueOf(i4));
                boolean changed = gapComposer.changed(contains) | gapComposer.changed(i4);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CollapsibleDetailsSectionKt$$ExternalSyntheticLambda0(contains, snapshotStateSet2, i4, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CollapsibleDetail(collapsibleDetail, contains, (Function0) rememberedValue2, gapComposer, 0);
                i4 = i5;
                i2 = 2;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            set2 = set;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(collapsibleDetailsSection, set2, i, 21);
        }
    }

    public static final void FullscreenAd(FullscreenAdViewModel fullscreenAdViewModel, Function1 function1, RealImageLoader realImageLoader, Flow flow, Composer composer, int i) {
        int i2;
        fullscreenAdViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(115648100);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(fullscreenAdViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(flow) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ChromeConfigKt.ChromeConfig(((Boolean) mutableState.getValue()).booleanValue(), (Boolean) null, gapComposer, 0, 14);
            boolean changedInstance = gapComposer.changedInstance(realImageLoader) | gapComposer.changedInstance(flow);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(17, realImageLoader, flow, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            boolean changedInstance2 = gapComposer.changedInstance(fullscreenAdViewModel) | ((i2 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CombinedModifier$$ExternalSyntheticLambda0(24, fullscreenAdViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function12, null, (Function1) rememberedValue3, gapComposer, 0, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(fullscreenAdViewModel, i, function1, realImageLoader, flow, 24);
        }
    }

    public static boolean isHuaweiP20Lite$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        return "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean isNokia7Plus$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str3) || "B2N_sprout".equalsIgnoreCase(str3);
    }

    public static boolean isOnePlus6$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean isOnePlus6T$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean isRedmiNote9Pro$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        return "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.equalsIgnoreCase("Samsung") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isSamsungA05s$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
        }
        if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
            String str3 = Build.MODEL;
            str3.getClass();
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (StringsKt.contains((CharSequence) upperCase, (CharSequence) "SM-A057", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSamsungJ7Api27Above$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "J7XELTE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean isSamsungJ7PrimeApi27Above$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "ON7XELTE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean isSamsungZFold4$camera_camera2() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str3) || "SCG16".equalsIgnoreCase(str3) || "SC-55C".equalsIgnoreCase(str3);
    }
}
