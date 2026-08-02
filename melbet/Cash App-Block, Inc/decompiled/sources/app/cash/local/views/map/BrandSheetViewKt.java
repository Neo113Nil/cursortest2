package app.cash.local.views.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import coil3.size.DimensionKt;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class BrandSheetViewKt {
    static {
        new BrandSpot("preview-brand-token", "preview-location-token");
    }

    public static final void BrandSheetContent(Modifier modifier, BrandCollectionModel.Location location, Function1 function1, Composer composer, int i) {
        boolean z;
        Modifier.Companion companion;
        BrandCollectionModel.Location location2 = location;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(112411464);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(location2) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion2, 32.0f), RoundedCornerShapeKt.CircleShape);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Trace.m1191Iconww6aTOc(Icons.NavigationClose, (String) null, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), Strings.getColors(gapComposer).semantic.background.standard, ColorKt.RectangleShape), 8.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 0);
            BrandFollowViewModel brandFollowViewModel = location.addRemoveState;
            boolean areEqual = Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.None.INSTANCE);
            BrandFollowViewModel.Add add = BrandFollowViewModel.Add.INSTANCE;
            if (areEqual || brandFollowViewModel == null) {
                gapComposer.startReplaceGroup(-997043812);
                Modifier alpha = AlphaKt.alpha(companion2, RecyclerView.DECELERATION_RATE);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Yoga$$ExternalSyntheticLambda0(9);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                z = false;
                companion = companion2;
                LocalBrandLocationRowKt.MoreOptionsDropdownMenu(alpha, (Function1) rememberedValue2, new LocalBrandProfileViewModel.MoreOptionsMenuModel(add, false), gapComposer, 54, 8);
                gapComposer.end(false);
            } else {
                if (!brandFollowViewModel.equals(add) && !brandFollowViewModel.equals(BrandFollowViewModel.Adding.INSTANCE) && !brandFollowViewModel.equals(BrandFollowViewModel.Remove.INSTANCE) && !brandFollowViewModel.equals(BrandFollowViewModel.Removing.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1768950639, false);
                }
                gapComposer.startReplaceGroup(-996633434);
                boolean changedInstance = (i3 == 256) | gapComposer.changedInstance(location);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CombinedModifier$$ExternalSyntheticLambda0(1, function1, location);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                z = false;
                LocalBrandLocationRowKt.MoreOptionsDropdownMenu(companion2, (Function1) rememberedValue3, new LocalBrandProfileViewModel.MoreOptionsMenuModel(brandFollowViewModel, false), gapComposer, 6, 8);
                gapComposer.end(false);
                companion = companion2;
            }
            gapComposer.end(true);
            if (1.0f <= 0.0d) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                return;
            }
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(new AdaptiveStackLayoutWeightElement(1.0f), RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer, 6);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
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
            Modifier.Companion companion3 = companion;
            location2 = location;
            boolean z3 = z;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion3, Strings.getTypography(gapComposer).pageTitle, (TextLineBalancing) null, location.name, (Map) null, (Function1) null, false);
            GapComposer gapComposer2 = gapComposer;
            LocationStatus locationStatus = location2.status;
            if (locationStatus == null) {
                gapComposer2.startReplaceGroup(794754668);
                gapComposer2.end(z3);
            } else {
                gapComposer2.startReplaceGroup(794754669);
                LocalBrandLocationRowKt.m1314LocalBrandLocationStatusRowet4HrQ(null, locationStatus, Strings.getTypography(gapComposer2).bodySmall, gapComposer2, 0, 21);
                gapComposer2.end(z3);
            }
            String str = location2.address;
            if (str == null) {
                gapComposer2.startReplaceGroup(794899469);
                gapComposer2.end(z3);
            } else {
                gapComposer2.startReplaceGroup(794899470);
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) companion3, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer2;
                gapComposer2.end(z3);
            }
            gapComposer2.end(true);
            gapComposer2.startReplaceGroup(-277483134);
            gapComposer2.end(z3);
            GapComposer gapComposer3 = gapComposer2;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1909492432, new BrandSheetViewKt$$ExternalSyntheticLambda6(z3 ? 1 : 0, function1), gapComposer2), gapComposer3, 24960, 11);
            gapComposer = gapComposer3;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier, (Object) location2, function1, i, 9);
        }
    }

    public static final void BrandSheetView(Modifier modifier, BrandCollectionModel.Location location, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1555270256);
        int i2 = i | 6 | (gapComposer.changedInstance(location) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1870328345, new BrandSheetViewKt$$ExternalSyntheticLambda1(location, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 10, modifier2, location, function1);
        }
    }
}
