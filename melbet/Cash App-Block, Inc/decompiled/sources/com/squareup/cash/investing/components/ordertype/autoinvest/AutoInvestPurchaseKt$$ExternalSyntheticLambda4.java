package com.squareup.cash.investing.components.ordertype.autoinvest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import okhttp3.internal.Tags;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final /* synthetic */ class AutoInvestPurchaseKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ InvestingRecurringPurchaseReceiptViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AutoInvestPurchaseKt$$ExternalSyntheticLambda4(InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel, Function1 function1) {
        this.f$1 = investingRecurringPurchaseReceiptViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = this.f$1;
        Function1 function1 = this.f$2;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, paddingValues.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    InvestingRecurringPurchaseReceiptViewModel.Content content = (InvestingRecurringPurchaseReceiptViewModel.Content) investingRecurringPurchaseReceiptViewModel;
                    LinkScanner linkScanner = content.titleIcon;
                    if (linkScanner == null) {
                        gapComposer.startReplaceGroup(-1289248208);
                        gapComposer.end(false);
                        modifier = null;
                    } else {
                        gapComposer.startReplaceGroup(-1289248207);
                        modifier = null;
                        ArcadeBordersKt.InvestingAvatar(linkScanner, content.accentColor, new AvatarOverlay.LocalIcon(12, Strings.getColors(gapComposer).semantic.background.subtle, 0L, Icons.RecurringAutomatic16), null, gapComposer, 0, 8);
                        gapComposer.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, content.title, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier);
                    ListUnorderedKt.ListUnordered(Tags.persistentListOf(new ListUnorderedItem(Room.stringResource(gapComposer, R.string.investing_components_auto_invest_purchase_amount), null, content.purchaseAmount, null, 10), new ListUnorderedItem(Room.stringResource(gapComposer, R.string.investing_components_auto_invest_frequency), null, content.recurringFrequency, null, 10), new ListUnorderedItem(Room.stringResource(gapComposer, R.string.investing_components_auto_invest_next_purchase_time), null, content.nextPurchaseTime, null, 10), new ListUnorderedItem(Room.stringResource(gapComposer, R.string.investing_components_auto_invest_next_purchase_date), null, content.nextPurchaseDate, null, 10)), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 54);
                    GapComposer gapComposer2 = gapComposer;
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, modifier);
                    if (content.showCancelButtonLabel) {
                        gapComposer2.startReplaceGroup(-722677019);
                        DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-435017895, new AutoInvestPurchaseKt$$ExternalSyntheticLambda4(function1, investingRecurringPurchaseReceiptViewModel), gapComposer2), gapComposer2, 24576, 15);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-722430042);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    int i2 = 3;
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(3, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1770331692, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(investingRecurringPurchaseReceiptViewModel, i2), gapComposer3), gapComposer3, 1572912, 60);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AutoInvestPurchaseKt$$ExternalSyntheticLambda4(Function1 function1, InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel) {
        this.f$2 = function1;
        this.f$1 = investingRecurringPurchaseReceiptViewModel;
    }
}
