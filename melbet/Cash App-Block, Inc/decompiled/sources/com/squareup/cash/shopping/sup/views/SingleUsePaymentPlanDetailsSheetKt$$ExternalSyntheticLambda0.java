package com.squareup.cash.shopping.sup.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewModel;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;

/* loaded from: classes7.dex */
public final /* synthetic */ class SingleUsePaymentPlanDetailsSheetKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SingleUsePaymentPlanDetailsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SingleUsePaymentPlanDetailsSheetKt$$ExternalSyntheticLambda0(SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$0 = singleUsePaymentPlanDetailsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b;
        int i = this.$r8$classId;
        int i2 = 2;
        Function1 function1 = this.f$1;
        SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        b = 0;
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        b = 0;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    SurfaceKt.m554SurfaceT9BRK9s(null, null, colors.semantic.background.f1047app, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1399476289, new SingleUsePaymentPlanDetailsSheetKt$$ExternalSyntheticLambda0(singleUsePaymentPlanDetailsViewModel, function1, i2, b), gapComposer), gapComposer, 12582912, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                SingleUsePaymentAddCardSheetKt.PlanDetails(singleUsePaymentPlanDetailsViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 27.0f));
                    TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer2).semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.LogoUsd32, 0L, 6), null, new AvatarOverlay.LocalIcon(14, 0L, 0L, Icons.PayInFour16), null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, gapComposer2, 390, 24);
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 12.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer2).header, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.sup_plan_details_header), (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 4.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.sup_plan_details_description), (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    ListUnorderedKt.ListUnordered(Tags.toImmutableList(CollectionsKt__CollectionsKt.listOf((Object[]) new ListUnorderedItem[]{new ListUnorderedItem(Room.stringResource(gapComposer2, R.string.sup_plan_details_first_payment), null, singleUsePaymentPlanDetailsViewModel.firstPayment, null, 10), new ListUnorderedItem(Room.stringResource(gapComposer2, R.string.sup_plan_details_order_total), null, singleUsePaymentPlanDetailsViewModel.orderTotal, null, 10)})), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer2, 3072, 54);
                    gapComposer2.end(true);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1022240457, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(18, function1), gapComposer2), gapComposer2, 24576, 15);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SingleUsePaymentPlanDetailsSheetKt$$ExternalSyntheticLambda0(SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = singleUsePaymentPlanDetailsViewModel;
        this.f$1 = function1;
    }
}
