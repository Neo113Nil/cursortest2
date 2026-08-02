package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel$ChartLabel$DefaultLabel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.activity.CashActivityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.activity.CashActivityQueries$ActivityQuery;
import com.squareup.cash.db2.activity.CashActivityQueries$activity$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.widget.AvatarDrawables;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderDefaults$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ SliderDefaults$$ExternalSyntheticLambda0(SegmentedBarChartViewModel.Category category, boolean z) {
        this.$r8$classId = 7;
        this.f$0 = category;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AvatarOverlay.LocalIcon localIcon;
        long j;
        AvatarImage.Remote.Icon icon;
        AvatarOverlay.LocalIcon localIcon2;
        long j2;
        long j3;
        int i = this.$r8$classId;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        Color color = null;
        int i2 = 2;
        int i3 = 3;
        boolean z = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope, ((SliderColors) obj3).m549trackColorWaAFU9c$material3(z, true), drawScope.mo236toPx0680j_4(SliderDefaults.TrackStopIndicatorSize) / 2.0f, ((Offset) obj2).packedValue, null, 0, 120);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                KeyMappingKt.SelectionToolbarAndHandles((TextFieldSelectionManager) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                return new Pair(Draggable2DKt.DraggableAnchors(new SliderKt$$ExternalSyntheticLambda5((IntSize) obj, z, i3)), (SwipeToDismissBoxValue) ((SwipeToDismissBoxState) obj3).anchoredDraggableState.targetValue$delegate.getValue());
            case 3:
                ((Integer) obj2).getClass();
                AvatarDrawables.PredictiveBackHandler(z, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                AccountCardViewModel accountCardViewModel = (AccountCardViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (z) {
                        modifier = SizeKt.fillMaxWidth(modifier, 1.0f);
                    }
                    BadgeNameKt.m3726BadgeName6ERogkM(accountCardViewModel.name, accountCardViewModel.badge, modifier, z ? 3 : 0, gapComposer, 0, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                StackedAvatarViewModel.Single single = (StackedAvatarViewModel.Single) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (z) {
                        gapComposer2.startReplaceGroup(-896840698);
                        Icons icons = Icons.Check16;
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        AvatarOverlay.LocalIcon localIcon3 = new AvatarOverlay.LocalIcon(12, colors.semantic.background.standard, 0L, icons);
                        gapComposer2.end(false);
                        localIcon = localIcon3;
                    } else {
                        gapComposer2.startReplaceGroup(-896650141);
                        gapComposer2.end(false);
                        localIcon = null;
                    }
                    ColorModel colorModel = single.avatar.backgroundColor;
                    if (colorModel == null) {
                        gapComposer2.startReplaceGroup(-896535814);
                        gapComposer2.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 1218005479, colorModel, gapComposer2, false);
                    }
                    if (color == null) {
                        gapComposer2.startReplaceGroup(1218007621);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.semantic.background.standard;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1218004428);
                        gapComposer2.end(false);
                        j = color.value;
                    }
                    TextViewKt.Avatar(AvatarSize.Size48, AvatarEntry.m3382copyDuSw1wk$default(AvatarsKt.toAvatarEntry(single.avatar, null, null, gapComposer2, 8, 3), j, null, localIcon, EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE), null, false, gapComposer2, 6, 28);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                CashAppPaySettingsRowViewModel$BusinessViewModel cashAppPaySettingsRowViewModel$BusinessViewModel = (CashAppPaySettingsRowViewModel$BusinessViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    long j4 = Strings.getColors(gapComposer3).semantic.background.subtle;
                    Image image = cashAppPaySettingsRowViewModel$BusinessViewModel.image;
                    if (image == null) {
                        gapComposer3.startReplaceGroup(255376393);
                        gapComposer3.end(false);
                        icon = null;
                    } else {
                        gapComposer3.startReplaceGroup(255376394);
                        AvatarImage.Remote.Icon icon2 = new AvatarImage.Remote.Icon(ThemablesKt.urlForTheme(image, gapComposer3), false, new AvatarImage.LocalIcon(Icons.Business32, Strings.getColors(gapComposer3).semantic.icon.standard, 4), new RealAppConfigManager$$ExternalSyntheticLambda7(4), 26);
                        gapComposer3.end(false);
                        icon = icon2;
                    }
                    if (z) {
                        gapComposer3.startReplaceGroup(255867248);
                        AvatarOverlay.LocalIcon localIcon4 = new AvatarOverlay.LocalIcon(12, Strings.getColors(gapComposer3).semantic.background.subtle, 0L, Icons.LogoAfterpay16);
                        gapComposer3.end(false);
                        localIcon2 = localIcon4;
                    } else {
                        gapComposer3.startReplaceGroup(256082078);
                        gapComposer3.end(false);
                        localIcon2 = null;
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", j4, null, icon, null, localIcon2, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                SegmentedBarChartViewModel.Category category = (SegmentedBarChartViewModel.Category) obj3;
                SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel = category.label;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer4, 48);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z2 = category.selected;
                    String str = segmentedBarChartViewModel$ChartLabel$DefaultLabel.text;
                    if (str == null) {
                        gapComposer4.startReplaceGroup(-1832478969);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1832478968);
                        TextStyle textStyle = Strings.getTypography(gapComposer4).bodyXSmall;
                        if (z && z2) {
                            gapComposer4.startReplaceGroup(754030965);
                            j2 = Strings.getColors(gapComposer4).semantic.text.standard;
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(754107287);
                            j2 = Strings.getColors(gapComposer4).semantic.text.subtle;
                            gapComposer4.end(false);
                        }
                        Room.m1165Text25TpFw(0, 1, 0, 3, 1572864, 0, 3762, j2, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer4.end(false);
                    }
                    String str2 = segmentedBarChartViewModel$ChartLabel$DefaultLabel.valueText;
                    if (str2 == null) {
                        gapComposer4.startReplaceGroup(-1832045620);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1832045619);
                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        TextStyle textStyle2 = Strings.getTypography(gapComposer4).bodyXSmall;
                        if (z && z2) {
                            gapComposer4.startReplaceGroup(-1831129908);
                            j3 = Strings.getColors(gapComposer4).semantic.text.standard;
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-1831053586);
                            j3 = Strings.getColors(gapComposer4).semantic.text.subtle;
                            gapComposer4.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, j3, (Composer) gapComposer4, m302paddingqDBjuR0$default2, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                InviteErrorDialogKt.VerticalSlideAnimation(z, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                HypeWelcomeUIKt.m3611GroupedInnerContentTDGSqEk((List) obj3, z, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 10:
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) obj2).longValue();
                PaymentQueries paymentQueries = (PaymentQueries) ((MarkwonConfiguration) obj3).spansFactory;
                EmptyList emptyList = EmptyList.INSTANCE;
                paymentQueries.getClass();
                emptyList.getClass();
                CashActivityQueries$activity$2 cashActivityQueries$activity$2 = CashActivityQueries$activity$2.INSTANCE;
                return new CashActivityQueries$ActivityQuery(paymentQueries, this.f$1, emptyList, emptyList, longValue, longValue2, new CashActivityQueries$$ExternalSyntheticLambda1(paymentQueries, i2));
            case 11:
                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption = (WithdrawViewModel.DepositPreferenceOption) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Strings.getSizes(gapComposer5).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer5, 48);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String str3 = depositPreferenceOption.feeLabel;
                    if (str3 == null) {
                        gapComposer5.startReplaceGroup(-1349011362);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-1349011361);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer5).semantic.text.subtle, (Composer) gapComposer5, (Modifier) null, Strings.getTypography(gapComposer5).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                        gapComposer5.end(false);
                    }
                    boolean z3 = depositPreferenceOption.enabled;
                    if (z3) {
                        gapComposer5.startReplaceGroup(-1567527317);
                        ModalKt.Radio(this.f$1, null, null, false, null, gapComposer5, 0, 30);
                        gapComposer5.end(false);
                    } else {
                        if (z3) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1567528642, false);
                        }
                        gapComposer5.startReplaceGroup(-1567524601);
                        Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, Strings.getColors(gapComposer5).component.cell.controls.icon.f174default, gapComposer5, 54, 4);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ShiftListViewKt.SellerCardWithOptionalCheck((SellerCardViewModel) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                CreditcardTypeValidator.PartnerAuthScreen((FinancialConnectionsSessionManifest.Pane) obj3, z, (Composer) obj, Updater.updateChangedFlags(55));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderDefaults$$ExternalSyntheticLambda0(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    public /* synthetic */ SliderDefaults$$ExternalSyntheticLambda0(Object obj, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
    }

    public /* synthetic */ SliderDefaults$$ExternalSyntheticLambda0(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
    }

    public /* synthetic */ SliderDefaults$$ExternalSyntheticLambda0(boolean z, Function2 function2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = z;
        this.f$0 = function2;
    }
}
