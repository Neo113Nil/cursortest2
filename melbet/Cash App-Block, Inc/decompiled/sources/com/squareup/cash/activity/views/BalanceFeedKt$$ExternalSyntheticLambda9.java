package com.squareup.cash.activity.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$DialogModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.receipts.ReceiptTimelineKt;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpayListUnorderedScope;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.PaymentManagementSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.agents.applets.viewmodels.AgentCardViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda30;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.ReceiptSection;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceFeedKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BalanceFeedKt$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$search$AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage trailingImage = (AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) this.f$0;
        BoxScope boxScope = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        boxScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(boxScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier matchParentSize = boxScope.matchParentSize();
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, matchParentSize);
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
            String urlForTheme = ThemablesKt.urlForTheme(trailingImage.image, gapComposer);
            BiasAlignment biasAlignment = Alignment.Companion.CenterEnd;
            AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxHeight(Modifier.Companion.$$INSTANCE, 1.0f), biasAlignment), biasAlignment, ContentScale.Companion.FillHeight, null, gapComposer, 1769520, 1944);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$search$AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        AfterpayAppletUpsellCardViewModel.CallToAction callToAction = (AfterpayAppletUpsellCardViewModel.CallToAction) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((AfterpayAppletUpsellCardViewModel.CallToAction.Button) callToAction).button.title, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$agents$applets$views$AgentsAppletTile$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        AvatarSize avatarSize = (AvatarSize) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            AgentsHomeViewKt.m2976AgentsAppletIconlipvc(avatarSize.size, false, null, RecyclerView.DECELERATION_RATE, gapComposer, 48, 12);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$agents$applets$views$AgentsHomeViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        AgentCardViewModel agentCardViewModel = (AgentCardViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 8.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 96.0f, RecyclerView.DECELERATION_RATE, 11);
            Strings.getSizes(gapComposer).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            AgentsHomeViewKt.m2976AgentsAppletIconlipvc(48.0f, true, null, 34.0f, gapComposer, 3126, 4);
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
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
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, agentCardViewModel.subtitle, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, agentCardViewModel.title, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomEnd), Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.agents_home_card_default_balance), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$arcade$bindings$component$ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3) {
        ButtonCompact buttonCompact = (ButtonCompact) this.f$0;
        RowScope rowScope = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        rowScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            LocalizedString localizedString = buttonCompact.text;
            String str = localizedString != null ? localizedString.translated_value : null;
            if (str == null) {
                str = "";
            }
            ArcadeComponentButtonProtoBindingKt.ButtonContent(rowScope, str, buttonCompact.icon, gapComposer, intValue & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x06c7, code lost:
    
        if (r0 == null) goto L218;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Icons icons;
        String str;
        Color m;
        long j;
        Icons icons2;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Color color = null;
        String m2 = null;
        Object obj4 = this.f$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                BalanceFeedViewModel.InfoSheet infoSheet = (BalanceFeedViewModel.InfoSheet) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    AvatarsKt.InfoSheet(SpacerKt.padding(companion, paddingValues), infoSheet, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                AccountViewModel accountViewModel = (AccountViewModel) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountViewModel.headerViewModel.cashtag, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                EditProfileViewModel$DialogModel editProfileViewModel$DialogModel = (EditProfileViewModel$DialogModel) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, editProfileViewModel$DialogModel.positiveButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ThemeSwitcherViewModel.Error error = (ThemeSwitcherViewModel.Error) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, error.retryButton, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel businessUpgradeModel = (EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, businessUpgradeModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ActivityFeedEntry.Item item = (ActivityFeedEntry.Item) obj4;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    Modifier testTag = TestTagKt.testTag(LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion), "ActivityItem");
                    UiCallbackModel uiCallbackModel = item.activityItem;
                    ActivityItemViewKt.m2972ActivityItemViewww6aTOc((ActivityItemViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, testTag, 0L, gapComposer6, 0, 8);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ActivityFeedEntry.EmptyItem emptyItem = (ActivityFeedEntry.EmptyItem) obj4;
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                lazyItemScopeImpl2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(lazyItemScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, SpacerKt.m300paddingVpY3zN4$default(LazyItemScopeImpl.fillParentMaxSize$default(lazyItemScopeImpl2), RecyclerView.DECELERATION_RATE, 32.0f, 1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer7, 54);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, animateItem$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, emptyItem.message, (Map) null, (Function1) null, false);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay = (ReceiptSection.TimelineEntry.EventDetailsOverlay) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    ReceiptTimelineKt.TimelineDetailsOverlayContent(SpacerKt.padding(companion, paddingValues2), eventDetailsOverlay, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                PaymentHistoryButton paymentHistoryButton = (PaymentHistoryButton) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Icon icon = paymentHistoryButton.arcade_icon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str);
                    }
                    if (icons == null) {
                        gapComposer9.startReplaceGroup(-2096950976);
                    } else {
                        gapComposer9.startReplaceGroup(-2096950975);
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer9, 48, 12);
                    }
                    gapComposer9.end(false);
                    String str2 = paymentHistoryButton.text;
                    if (str2 == null) {
                        gapComposer9.startReplaceGroup(-2096881691);
                    } else {
                        gapComposer9.startReplaceGroup(-2096881690);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    }
                    gapComposer9.end(false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ReceiptSection.Upsell upsell = (ReceiptSection.Upsell) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    PaymentHistoryButton paymentHistoryButton2 = upsell.button;
                    String str3 = paymentHistoryButton2 != null ? paymentHistoryButton2.text : null;
                    if (str3 == null) {
                        gapComposer10.startReplaceGroup(719975964);
                    } else {
                        gapComposer10.startReplaceGroup(719975965);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    }
                    gapComposer10.end(false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ReceiptViewModel.LoadingError loadingError = (ReceiptViewModel.LoadingError) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                boolean shouldExecute = gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16);
                Applier applier = gapComposer11.applier;
                if (shouldExecute) {
                    Strings.getSizes(gapComposer11).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer11, 0);
                    int hashCode2 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer11, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer11.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer11, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer11, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer11).semantic.background.danger, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer11, 6, 28);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer11, null);
                    Object rememberedValue = gapComposer11.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ActivityTabViewKt$$ExternalSyntheticLambda17(9);
                        gapComposer11.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer11, 0);
                    int hashCode3 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer11, semantics);
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer11, composeUiNode$Companion$SetModifier$13, gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer11, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer11, (Modifier) null, Strings.getTypography(gapComposer11).header, (TextLineBalancing) null, loadingError.title, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer11).semantic.text.subtle, (Composer) gapComposer11, (Modifier) null, Strings.getTypography(gapComposer11).bodyMedium, (TextLineBalancing) null, loadingError.message, (Map) null, (Function1) null, false);
                    gapComposer11.end(true);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                AfterpayAppletTileViewModel.Installed.CreditDetails.CreditDetail creditDetail = (AfterpayAppletTileViewModel.Installed.CreditDetails.CreditDetail) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    com.squareup.protos.cash.ui.Color color2 = creditDetail.backgroundColor;
                    if (color2 == null) {
                        gapComposer12.startReplaceGroup(1091833883);
                        gapComposer12.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer12, -1904442202, color2, gapComposer12, false);
                    }
                    if (m == null) {
                        gapComposer12.startReplaceGroup(-1904440703);
                        Colors colors = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                        } else {
                            gapComposer12.startReplaceGroup(-1762997739);
                            gapComposer12.end(false);
                        }
                        j = colors.semantic.text.brand;
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(-1904442904);
                        gapComposer12.end(false);
                        j = m.value;
                    }
                    long j2 = j;
                    String str4 = creditDetail.arcadeIcon;
                    if (str4 != null) {
                        Icons.Companion.getClass();
                        icons2 = zzd.get(str4);
                        break;
                    }
                    icons2 = Icons.LogoAfterpay16;
                    Icons icons3 = icons2;
                    com.squareup.protos.cash.ui.Color color3 = creditDetail.iconTint;
                    if (color3 == null) {
                        gapComposer12.startReplaceGroup(1092018395);
                        gapComposer12.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer12, -1904436250, color3, gapComposer12, false);
                    }
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j2, icons3, color != null ? color.value : Color.White, RecyclerView.DECELERATION_RATE, gapComposer12, 0, 8);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    String str5 = afterpayAppletHomeContentViewModel.homeScreenTitleText;
                    TextStyle textStyle = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).pageTitle;
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer13, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer13, null);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                AfterpayAppletMerchantSheetViewModel.Error error2 = (AfterpayAppletMerchantSheetViewModel.Error) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, error2.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                AfterpayAppletMerchantSheetViewModel.Loaded loaded = (AfterpayAppletMerchantSheetViewModel.Loaded) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded.button.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                AfterpayAppletUpsellSheetViewModel.CtaButton ctaButton = (AfterpayAppletUpsellSheetViewModel.CtaButton) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ctaButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                AfterpaySearchViewModel.BodyViewModel.NoContentViewModel noContentViewModel = (AfterpaySearchViewModel.BodyViewModel.NoContentViewModel) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    String str6 = noContentViewModel.buttonIconId;
                    if (str6 == null) {
                        gapComposer17.startReplaceGroup(774025064);
                        gapComposer17.end(false);
                    } else {
                        gapComposer17.startReplaceGroup(774025065);
                        Icons.Companion.getClass();
                        Icons icons4 = zzd.get(str6);
                        if (icons4 == null) {
                            gapComposer17.startReplaceGroup(1585429341);
                        } else {
                            gapComposer17.startReplaceGroup(1585429342);
                            Trace.m1191Iconww6aTOc(icons4, (String) null, (Modifier) null, 0L, gapComposer17, 48, 12);
                        }
                        gapComposer17.end(false);
                        gapComposer17.end(false);
                    }
                    String str7 = noContentViewModel.buttonText;
                    if (str7 == null) {
                        gapComposer17.startReplaceGroup(774149715);
                    } else {
                        gapComposer17.startReplaceGroup(774149716);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    }
                    gapComposer17.end(false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue18 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer18 = (GapComposer) ((Composer) obj2);
                gapComposer18.startReplaceGroup(2095745898);
                Image image = ((AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel.CarouselEntryViewModel) obj4).avatar.avatar.remoteImage;
                if (image == null) {
                    gapComposer18.startReplaceGroup(-1573450902);
                    gapComposer18.end(false);
                } else {
                    m2 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer18, -327851145, image, gapComposer18, false);
                }
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, m2, gapComposer18, intValue18 & 14, 0);
                gapComposer18.end(false);
                return rememberAsyncImagePainter;
            case 18:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement paymentManagement = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement) obj4;
                AfterpayListUnorderedScope afterpayListUnorderedScope = (AfterpayListUnorderedScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                afterpayListUnorderedScope.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer18).changed(afterpayListUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    int i3 = ((intValue19 << 15) & 458752) | 390;
                    afterpayListUnorderedScope.AfterpayListUnorderedItem(Expect_jvmKt.rememberComposableLambda(1322786078, new PaymentManagementSectionKt$$ExternalSyntheticLambda1(paymentManagement, i2), gapComposer19), Expect_jvmKt.rememberComposableLambda(131127840, new PaymentManagementSectionKt$$ExternalSyntheticLambda1(paymentManagement, r10), gapComposer19), gapComposer19, i3);
                    final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement.NextDueRow nextDueRow = paymentManagement.nextDueRow;
                    if (nextDueRow == null) {
                        gapComposer19.startReplaceGroup(-924559896);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(-924559895);
                        final int i4 = r15 ? 1 : 0;
                        afterpayListUnorderedScope.AfterpayListUnorderedItem(Expect_jvmKt.rememberComposableLambda(1131005496, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.PaymentManagementSectionKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i5 = i4;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement.NextDueRow nextDueRow2 = nextDueRow;
                                switch (i5) {
                                    case 0:
                                        Composer composer19 = (Composer) obj5;
                                        int intValue20 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer20 = (GapComposer) composer19;
                                        if (gapComposer20.shouldExecute(1 & intValue20, (intValue20 & 3) != 2)) {
                                            String str8 = nextDueRow2.prefixText;
                                            TextStyle textStyle2 = ((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                            Colors colors2 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                                            } else {
                                                gapComposer20.startReplaceGroup(-1762997739);
                                                gapComposer20.end(false);
                                            }
                                            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer20, (Modifier) null, textStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer20.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer20 = (Composer) obj5;
                                        int intValue21 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer21 = (GapComposer) composer20;
                                        if (gapComposer21.shouldExecute(1 & intValue21, (intValue21 & 3) != 2)) {
                                            String str9 = nextDueRow2.moneyText;
                                            if (str9 == null) {
                                                gapComposer21.startReplaceGroup(1937046478);
                                                gapComposer21.end(false);
                                            } else {
                                                gapComposer21.startReplaceGroup(1937046479);
                                                TextStyle textStyle3 = ((Typography) gapComposer21.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                                Colors colors3 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                                                if (colors3 == null) {
                                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                                                } else {
                                                    gapComposer21.startReplaceGroup(-1762997739);
                                                    gapComposer21.end(false);
                                                }
                                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer21, (Modifier) null, textStyle3, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                gapComposer21.end(false);
                                            }
                                        } else {
                                            gapComposer21.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer19), Expect_jvmKt.rememberComposableLambda(358471542, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.PaymentManagementSectionKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i5 = i2;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement.NextDueRow nextDueRow2 = nextDueRow;
                                switch (i5) {
                                    case 0:
                                        Composer composer19 = (Composer) obj5;
                                        int intValue20 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer20 = (GapComposer) composer19;
                                        if (gapComposer20.shouldExecute(1 & intValue20, (intValue20 & 3) != 2)) {
                                            String str8 = nextDueRow2.prefixText;
                                            TextStyle textStyle2 = ((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                            Colors colors2 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                                            } else {
                                                gapComposer20.startReplaceGroup(-1762997739);
                                                gapComposer20.end(false);
                                            }
                                            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer20, (Modifier) null, textStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer20.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer20 = (Composer) obj5;
                                        int intValue21 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer21 = (GapComposer) composer20;
                                        if (gapComposer21.shouldExecute(1 & intValue21, (intValue21 & 3) != 2)) {
                                            String str9 = nextDueRow2.moneyText;
                                            if (str9 == null) {
                                                gapComposer21.startReplaceGroup(1937046478);
                                                gapComposer21.end(false);
                                            } else {
                                                gapComposer21.startReplaceGroup(1937046479);
                                                TextStyle textStyle3 = ((Typography) gapComposer21.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                                Colors colors3 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                                                if (colors3 == null) {
                                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                                                } else {
                                                    gapComposer21.startReplaceGroup(-1762997739);
                                                    gapComposer21.end(false);
                                                }
                                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer21, (Modifier) null, textStyle3, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                gapComposer21.end(false);
                                            }
                                        } else {
                                            gapComposer21.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer19), gapComposer19, i3);
                        gapComposer19.end(false);
                    }
                    final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement.OverDueRow overDueRow = paymentManagement.overDueRow;
                    if (overDueRow == null) {
                        gapComposer19.startReplaceGroup(-923951862);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(-923951861);
                        final int i5 = r15 ? 1 : 0;
                        afterpayListUnorderedScope.AfterpayListUnorderedItem(Expect_jvmKt.rememberComposableLambda(1942264480, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.PaymentManagementSectionKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i6 = i5;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement.OverDueRow overDueRow2 = overDueRow;
                                switch (i6) {
                                    case 0:
                                        Composer composer19 = (Composer) obj5;
                                        int intValue20 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer20 = (GapComposer) composer19;
                                        if (gapComposer20.shouldExecute(1 & intValue20, (intValue20 & 3) != 2)) {
                                            String str8 = overDueRow2.prefixText;
                                            TextStyle textStyle2 = ((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                            Colors colors2 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                                            } else {
                                                gapComposer20.startReplaceGroup(-1762997739);
                                                gapComposer20.end(false);
                                            }
                                            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.danger, (Composer) gapComposer20, (Modifier) null, textStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer20.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer20 = (Composer) obj5;
                                        int intValue21 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer21 = (GapComposer) composer20;
                                        if (gapComposer21.shouldExecute(1 & intValue21, (intValue21 & 3) != 2)) {
                                            String str9 = overDueRow2.moneyText;
                                            if (str9 == null) {
                                                gapComposer21.startReplaceGroup(-1094617688);
                                                gapComposer21.end(false);
                                            } else {
                                                gapComposer21.startReplaceGroup(-1094617687);
                                                TextStyle textStyle3 = ((Typography) gapComposer21.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                                Colors colors3 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                                                if (colors3 == null) {
                                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                                                } else {
                                                    gapComposer21.startReplaceGroup(-1762997739);
                                                    gapComposer21.end(false);
                                                }
                                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.danger, (Composer) gapComposer21, (Modifier) null, textStyle3, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                gapComposer21.end(false);
                                            }
                                        } else {
                                            gapComposer21.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer19), Expect_jvmKt.rememberComposableLambda(-1728490402, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.PaymentManagementSectionKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i6 = i2;
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement.OverDueRow overDueRow2 = overDueRow;
                                switch (i6) {
                                    case 0:
                                        Composer composer19 = (Composer) obj5;
                                        int intValue20 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer20 = (GapComposer) composer19;
                                        if (gapComposer20.shouldExecute(1 & intValue20, (intValue20 & 3) != 2)) {
                                            String str8 = overDueRow2.prefixText;
                                            TextStyle textStyle2 = ((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                            Colors colors2 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                                            } else {
                                                gapComposer20.startReplaceGroup(-1762997739);
                                                gapComposer20.end(false);
                                            }
                                            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.danger, (Composer) gapComposer20, (Modifier) null, textStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer20.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer20 = (Composer) obj5;
                                        int intValue21 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer21 = (GapComposer) composer20;
                                        if (gapComposer21.shouldExecute(1 & intValue21, (intValue21 & 3) != 2)) {
                                            String str9 = overDueRow2.moneyText;
                                            if (str9 == null) {
                                                gapComposer21.startReplaceGroup(-1094617688);
                                                gapComposer21.end(false);
                                            } else {
                                                gapComposer21.startReplaceGroup(-1094617687);
                                                TextStyle textStyle3 = ((Typography) gapComposer21.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                                Colors colors3 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                                                if (colors3 == null) {
                                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                                                } else {
                                                    gapComposer21.startReplaceGroup(-1762997739);
                                                    gapComposer21.end(false);
                                                }
                                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.danger, (Composer) gapComposer21, (Modifier) null, textStyle3, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                gapComposer21.end(false);
                                            }
                                        } else {
                                            gapComposer21.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer19), gapComposer19, i3);
                        gapComposer19.end(false);
                    }
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                RetroTransaction retroTransaction = (RetroTransaction) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    StackedAvatarViewModel stackedAvatarViewModel = retroTransaction.retroAvatar;
                    if (stackedAvatarViewModel == null) {
                        gapComposer20.startReplaceGroup(243263925);
                    } else {
                        gapComposer20.startReplaceGroup(243263926);
                        LegalSectionKt.RetroAvatar(stackedAvatarViewModel, gapComposer20, 0);
                    }
                    gapComposer20.end(false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell afterpayHeroUpsell = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Strings.getSizes(gapComposer21).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer21, 48);
                    int hashCode4 = Long.hashCode(gapComposer21.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer21.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer21, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer21.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer21.startReusableNode();
                    if (gapComposer21.inserting) {
                        gapComposer21.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer21.useNode();
                    }
                    Updater.m576setimpl(gapComposer21, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer21, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer21, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer21, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer21, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Trace.m1191Iconww6aTOc(Icons.TickerDown24, (String) null, (Modifier) null, Strings.getColors(gapComposer21).semantic.icon.standard, gapComposer21, 54, 4);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer21).semantic.text.standard, (Composer) gapComposer21, (Modifier) null, Strings.getTypography(gapComposer21).buttonCompact, (TextLineBalancing) null, afterpayHeroUpsell.ctaButtonTitle, (Map) null, (Function1) null, false);
                    gapComposer21.end(true);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (!gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    gapComposer22.skipToGroupEnd();
                } else if (prepurchaseToggleSection.isToggleLoading) {
                    gapComposer22.startReplaceGroup(2026150331);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 28.0f);
                    Colors colors2 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer22, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors2.component.toggle.knob.background.f224default, RoundedCornerShapeKt.CircleShape), 6.0f));
                    gapComposer22.end(false);
                } else {
                    gapComposer22.startReplaceGroup(2026474188);
                    gapComposer22.end(false);
                }
                return Unit.INSTANCE;
            case 22:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    com.squareup.cash.arcade.util.AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size48, transactionRowViewModel.avatar, null, null, gapComposer23, 6, 28);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$afterpayapplet$views$search$AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$afterpayapplet$views$search$AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$agents$applets$views$AgentsAppletTile$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$agents$applets$views$AgentsHomeViewKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 27:
                RealSheetState realSheetState = (RealSheetState) obj4;
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, MathKt__MathJVMKt.roundToInt((1.0f - realSheetState.getExpandProgress()) * mo833measureBRTryo0.height), new BadgeQueries$$ExternalSyntheticLambda0(r11, mo833measureBRTryo0, realSheetState));
            case 28:
                return invoke$com$squareup$cash$arcade$bindings$component$ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda15(obj, obj2, obj3);
            default:
                ListUnordered listUnordered = (ListUnordered) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer23 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer23).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    for (ListUnordered.ListItem listItem : listUnordered.items) {
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2029765406, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda30(listItem, i2), gapComposer24);
                        Icons arcadeIcon = ArcadeComponentProtoBindingKt.toArcadeIcon(listItem.icon);
                        if (arcadeIcon == null) {
                            gapComposer24.startReplaceGroup(-1535057961);
                            gapComposer24.end(false);
                            function2 = null;
                        } else {
                            gapComposer24.startReplaceGroup(-1535057960);
                            Function2 rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(641793756, new InfoSectionKt$$ExternalSyntheticLambda6(arcadeIcon, r11), gapComposer24);
                            gapComposer24.end(false);
                            function2 = rememberComposableLambda2;
                        }
                        String translatedOrNull = ArcadeComponentProtoBindingKt.translatedOrNull(listItem.value);
                        if (translatedOrNull == null) {
                            gapComposer24.startReplaceGroup(-1534963938);
                            gapComposer24.end(false);
                            function22 = null;
                        } else {
                            gapComposer24.startReplaceGroup(-1534963937);
                            Function2 rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1373850154, new ToastKt$$ExternalSyntheticLambda1(translatedOrNull, 19), gapComposer24);
                            gapComposer24.end(false);
                            function22 = rememberComposableLambda3;
                        }
                        String translatedOrNull2 = ArcadeComponentProtoBindingKt.translatedOrNull(listItem.body);
                        if (translatedOrNull2 == null) {
                            gapComposer24.startReplaceGroup(-1534878688);
                            gapComposer24.end(false);
                            function23 = null;
                        } else {
                            gapComposer24.startReplaceGroup(-1534878687);
                            Function2 rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(881653655, new ToastKt$$ExternalSyntheticLambda1(translatedOrNull2, 20), gapComposer24);
                            gapComposer24.end(false);
                            function23 = rememberComposableLambda4;
                        }
                        listUnorderedScope.ListUnorderedItem(rememberComposableLambda, (Modifier) null, function2, function22, function23, gapComposer24, ((intValue24 << 15) & 458752) | 6, 2);
                    }
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
