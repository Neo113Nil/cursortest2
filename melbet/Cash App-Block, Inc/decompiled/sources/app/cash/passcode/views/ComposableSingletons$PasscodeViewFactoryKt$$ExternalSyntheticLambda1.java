package app.cash.passcode.views;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.FixedScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.node.HitTestResultKt;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.views.map.LocalMapPinKt;
import app.cash.local.views.map.LocationClusterItem;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.ProfileUpsellViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.appupdate.viewmodels.AppUpdateDialogViewModel;
import com.squareup.cash.appupdate.views.AppUpdateDialogKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewModel;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.benefits.views.BenefitDetailsViewKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewModel;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.roundups.BitcoinRoundUpsCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewModel;
import com.squareup.cash.bitcoin.viewmodels.unavailable.BitcoinFeatureUnavailableViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.bitcoin.views.autowithdraw.BitcoinAutoWithdrawUpsellViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.bitcoin.views.roundups.BitcoinRoundUpsCardUpsellViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0724  */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Icons icons;
        int ordinal;
        Colors colors;
        long j;
        boolean changedInstance;
        Object rememberedValue;
        long j2;
        TextStyle textStyle;
        int i = this.$r8$classId;
        int i2 = 3;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    TransactorKt.LoadingPlaceholder(null, null, gapComposer, 0, 3);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LocationClusterItem locationClusterItem = (LocationClusterItem) obj;
                int intValue = ((Integer) obj4).intValue();
                locationClusterItem.getClass();
                BrandCollectionMapViewModel.Location location = locationClusterItem.location;
                LocalMapPinKt.LocalBrandLocationMarker(location.title, ((Boolean) obj2).booleanValue(), location.artworkUrl, location.backgroundColor, null, (Composer) obj3, intValue & 112, 16);
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, composer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(composer2, R.string.local_views_messages_filter_all), (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, composer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(composer3, R.string.local_views_messages_filter_coupons), (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 4:
                Function0 function0 = (Function0) obj2;
                Composer composer4 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((BoxScope) obj).getClass();
                function0.getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((GapComposer) composer4).changedInstance(function0) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer4;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 60.0f), 32.0f), Strings.getColors(gapComposer2).semantic.background.standard, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(100.0f));
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.Empty) {
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue2, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13), false, null, null, function0, 28), 8.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Painter painter = Icons.LocationFill16.painter(gapComposer2);
                    String stringResource = Room.stringResource(gapComposer2, R.string.local_views_fulfillment_options);
                    long j3 = Strings.getColors(gapComposer2).semantic.icon.standard;
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    int i3 = Painter.$stable;
                    FixedScale fixedScale = ContentScale.Companion.None;
                    ImageKt.Image(painter, stringResource, m285size3ABfNKs, null, fixedScale, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer2, i3 | 24960, 40);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 1.0f), 16.0f), Strings.getColors(gapComposer2).semantic.border.standard, ColorKt.RectangleShape), gapComposer2, 0);
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Painter painter2 = Icons.CaretDown16.painter(gapComposer2);
                    long j4 = Strings.getColors(gapComposer2).semantic.icon.extraSubtle;
                    ImageKt.Image(painter2, null, m285size3ABfNKs2, null, fixedScale, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j4, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j4), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, i3 | 25008, 40);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ProfileUpsellViewModel profileUpsellViewModel = (ProfileUpsellViewModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                profileUpsellViewModel.getClass();
                function1.getClass();
                for (ProfileUpsellViewModel.ProfileUpsellRow profileUpsellRow : profileUpsellViewModel.upsells) {
                    int ordinal2 = profileUpsellRow.icon.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            icons = Icons.SecurityAlertFill24;
                        } else if (ordinal2 == 2) {
                            icons = Icons.Alert24;
                        } else if (ordinal2 == 3) {
                            icons = Icons.Failed24;
                        } else if (ordinal2 == r9) {
                            icons = Icons.SecurityCheckOutline24;
                        } else if (ordinal2 != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Icons icons2 = icons;
                        ordinal = profileUpsellRow.icon.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                                GapComposer gapComposer3 = (GapComposer) composer5;
                                gapComposer3.startReplaceGroup(1779027576);
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                j = colors2.semantic.background.danger;
                                gapComposer3.end(false);
                                long j5 = j;
                                String str = profileUpsellRow.title;
                                String str2 = profileUpsellRow.subtitle;
                                GapComposer gapComposer4 = (GapComposer) composer5;
                                changedInstance = ((((intValue3 & 112) ^ 48) <= 32 && ((GapComposer) composer5).changed(function1)) || (intValue3 & 48) == 32) | gapComposer4.changedInstance(profileUpsellRow);
                                rememberedValue = gapComposer4.rememberedValue();
                                if (!changedInstance || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(i2, function1, profileUpsellRow);
                                    gapComposer4.updateRememberedValue(rememberedValue);
                                }
                                AccountToDoKt.m2970ToDoWMdw5o4(0, 48, 0L, j5, gapComposer4, null, icons2, str, str2, (Function0) rememberedValue);
                                r9 = 4;
                            } else if (ordinal != r9 && ordinal != 5) {
                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer5, 1779019557, false);
                            }
                        }
                        GapComposer gapComposer5 = (GapComposer) composer5;
                        gapComposer5.startReplaceGroup(1779023639);
                        colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors != null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j = colors.semantic.background.brand;
                        gapComposer5.end(false);
                        long j52 = j;
                        String str3 = profileUpsellRow.title;
                        String str22 = profileUpsellRow.subtitle;
                        GapComposer gapComposer42 = (GapComposer) composer5;
                        changedInstance = ((((intValue3 & 112) ^ 48) <= 32 && ((GapComposer) composer5).changed(function1)) || (intValue3 & 48) == 32) | gapComposer42.changedInstance(profileUpsellRow);
                        rememberedValue = gapComposer42.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(i2, function1, profileUpsellRow);
                        gapComposer42.updateRememberedValue(rememberedValue);
                        AccountToDoKt.m2970ToDoWMdw5o4(0, 48, 0L, j52, gapComposer42, null, icons2, str3, str22, (Function0) rememberedValue);
                        r9 = 4;
                    }
                    icons = Icons.SecurityLockFill24;
                    Icons icons22 = icons;
                    ordinal = profileUpsellRow.icon.ordinal();
                    if (ordinal != 0) {
                    }
                    GapComposer gapComposer52 = (GapComposer) composer5;
                    gapComposer52.startReplaceGroup(1779023639);
                    colors = (Colors) gapComposer52.consume(ArcadeThemeKt.LocalColors);
                    if (colors != null) {
                    }
                    j = colors.semantic.background.brand;
                    gapComposer52.end(false);
                    long j522 = j;
                    String str32 = profileUpsellRow.title;
                    String str222 = profileUpsellRow.subtitle;
                    GapComposer gapComposer422 = (GapComposer) composer5;
                    changedInstance = ((((intValue3 & 112) ^ 48) <= 32 && ((GapComposer) composer5).changed(function1)) || (intValue3 & 48) == 32) | gapComposer422.changedInstance(profileUpsellRow);
                    rememberedValue = gapComposer422.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(i2, function1, profileUpsellRow);
                    gapComposer422.updateRememberedValue(rememberedValue);
                    AccountToDoKt.m2970ToDoWMdw5o4(0, 48, 0L, j522, gapComposer422, null, icons22, str32, str222, (Function0) rememberedValue);
                    r9 = 4;
                }
                return Unit.INSTANCE;
            case 6:
                Bitmap bitmap = (Bitmap) obj2;
                Composer composer6 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (bitmap == null) {
                    GapComposer gapComposer6 = (GapComposer) composer6;
                    gapComposer6.startReplaceGroup(973866458);
                    gapComposer6.end(false);
                } else {
                    GapComposer gapComposer7 = (GapComposer) composer6;
                    gapComposer7.startReplaceGroup(973866459);
                    ImageKt.m176Image5hnEew(new AndroidImageBitmap(bitmap), null, SizeKt.fillMaxSize(companion, 1.0f), null, null, gapComposer7, 432, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function12 = (Function1) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                function12.getClass();
                AgentsHomeViewKt.AgentsHomeView((AgentsHomeViewModel) obj, function12, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 8:
                Pair pair = (Pair) obj2;
                Composer composer7 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                pair.getClass();
                String str4 = (String) pair.first;
                String str5 = str4 == null ? (String) pair.second : str4;
                if (str5 != null) {
                    GapComposer gapComposer8 = (GapComposer) composer7;
                    gapComposer8.startReplaceGroup(1826608866);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer8).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    if (str4 != null) {
                        gapComposer8.startReplaceGroup(1582951654);
                        j2 = Strings.getColors(gapComposer8).semantic.text.danger;
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1582953638);
                        j2 = Strings.getColors(gapComposer8).semantic.text.subtle;
                        gapComposer8.end(false);
                    }
                    long j6 = j2;
                    if (str4 != null) {
                        gapComposer8.startReplaceGroup(1582957265);
                        textStyle = Strings.getTypography(gapComposer8).titleBarPageTitle;
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1582959274);
                        textStyle = Strings.getTypography(gapComposer8).bodyMedium;
                        gapComposer8.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j6, (Composer) gapComposer8, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    gapComposer8.end(false);
                } else {
                    GapComposer gapComposer9 = (GapComposer) composer7;
                    gapComposer9.startReplaceGroup(1827139586);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                AppUpdateDialogViewModel appUpdateDialogViewModel = (AppUpdateDialogViewModel) obj;
                Function1 function13 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                appUpdateDialogViewModel.getClass();
                function13.getClass();
                AppUpdateDialogKt.AppUpdateDialog(appUpdateDialogViewModel, function13, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 10:
                BankingSectionsViewModel bankingSectionsViewModel = (BankingSectionsViewModel) obj;
                Function1 function14 = (Function1) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                bankingSectionsViewModel.getClass();
                function14.getClass();
                if (bankingSectionsViewModel instanceof BankingSectionsViewModel.Loaded) {
                    GapComposer gapComposer10 = (GapComposer) composer8;
                    gapComposer10.startReplaceGroup(71750184);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer10, null);
                    BalanceHomeViewKt.BankingSections((BankingSectionsViewModel.Loaded) bankingSectionsViewModel, function14, gapComposer10, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer10.end(false);
                } else {
                    GapComposer gapComposer11 = (GapComposer) composer8;
                    gapComposer11.startReplaceGroup(71864543);
                    gapComposer11.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                BetterOverdraftViewModel betterOverdraftViewModel = (BetterOverdraftViewModel) obj;
                Function1 function15 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                betterOverdraftViewModel.getClass();
                function15.getClass();
                BankingDialogKt.BetterOverdraftView(betterOverdraftViewModel, function15, (Composer) obj3, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 12:
                PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded = (PdsaBenefitsExplainerViewModel$Loaded) obj;
                Function1 function16 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                pdsaBenefitsExplainerViewModel$Loaded.getClass();
                function16.getClass();
                BenefitsHomeViewKt.PdsaBenefitsExplainerView(pdsaBenefitsExplainerViewModel$Loaded, function16, (Composer) obj3, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 13:
                BenefitDetailsViewModel benefitDetailsViewModel = (BenefitDetailsViewModel) obj;
                Function1 function17 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                benefitDetailsViewModel.getClass();
                function17.getClass();
                BenefitDetailsViewKt.BenefitDetailsView(benefitDetailsViewModel, function17, (Composer) obj3, intValue9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 14:
                BenefitsExplanationViewModel benefitsExplanationViewModel = (BenefitsExplanationViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                benefitsExplanationViewModel.getClass();
                function18.getClass();
                BenefitsHomeViewKt.BenefitsExplanationView(benefitsExplanationViewModel, function18, (Composer) obj3, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 15:
                BenefitsHubViewModel benefitsHubViewModel = (BenefitsHubViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                benefitsHubViewModel.getClass();
                function19.getClass();
                BenefitsHubViewKt.BenefitsHubView(benefitsHubViewModel, function19, (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 16:
                BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded = (BillsSubscriptionsMerchantListViewModel$Loaded) obj;
                Function1 function110 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                billsSubscriptionsMerchantListViewModel$Loaded.getClass();
                function110.getClass();
                BillsSubscriptionsMerchantListViewKt.BillsSubscriptionsMerchantListView(billsSubscriptionsMerchantListViewModel$Loaded, function110, null, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 17:
                Function1 function111 = (Function1) obj2;
                Composer composer9 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                ((BitcoinRoundUpsCardUpsellViewModel) obj).getClass();
                function111.getClass();
                if ((intValue13 & 48) == 0) {
                    intValue13 |= ((GapComposer) composer9).changedInstance(function111) ? 32 : 16;
                }
                GapComposer gapComposer12 = (GapComposer) composer9;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    BitcoinRoundUpsCardUpsellViewKt.BitcoinRoundUpsCardUpsellView(function111, gapComposer12, (intValue13 >> 3) & 14);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                BitcoinAutoWithdrawUpsellViewModel bitcoinAutoWithdrawUpsellViewModel = (BitcoinAutoWithdrawUpsellViewModel) obj;
                Function1 function112 = (Function1) obj2;
                Composer composer10 = (Composer) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                bitcoinAutoWithdrawUpsellViewModel.getClass();
                function112.getClass();
                int i4 = (intValue14 & 6) == 0 ? intValue14 | (((GapComposer) composer10).changed(bitcoinAutoWithdrawUpsellViewModel) ? 4 : 2) : intValue14;
                if ((intValue14 & 48) == 0) {
                    i4 |= ((GapComposer) composer10).changedInstance(function112) ? 32 : 16;
                }
                GapComposer gapComposer13 = (GapComposer) composer10;
                if (gapComposer13.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    BitcoinAutoWithdrawUpsellViewKt.BitcoinAutoWithdrawUpsellView(bitcoinAutoWithdrawUpsellViewModel, function112, gapComposer13, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                BitcoinFeatureUnavailableViewModel bitcoinFeatureUnavailableViewModel = (BitcoinFeatureUnavailableViewModel) obj;
                Function1 function113 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                bitcoinFeatureUnavailableViewModel.getClass();
                function113.getClass();
                HitTestResultKt.BitcoinFeatureUnavailableView(bitcoinFeatureUnavailableViewModel, function113, null, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 20:
                StablecoinOnboardingViewModel stablecoinOnboardingViewModel = (StablecoinOnboardingViewModel) obj;
                Function1 function114 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                stablecoinOnboardingViewModel.getClass();
                function114.getClass();
                SendStablecoinViewKt.StablecoinOnboardingView(stablecoinOnboardingViewModel, function114, null, (Composer) obj3, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 21:
                PeriodSelectionViewModel periodSelectionViewModel = (PeriodSelectionViewModel) obj;
                Function1 function115 = (Function1) obj2;
                Composer composer11 = (Composer) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                periodSelectionViewModel.getClass();
                function115.getClass();
                int i5 = (intValue17 & 6) == 0 ? intValue17 | ((intValue17 & 8) == 0 ? ((GapComposer) composer11).changed(periodSelectionViewModel) : ((GapComposer) composer11).changedInstance(periodSelectionViewModel) ? 4 : 2) : intValue17;
                if ((intValue17 & 48) == 0) {
                    i5 |= ((GapComposer) composer11).changedInstance(function115) ? 32 : 16;
                }
                GapComposer gapComposer14 = (GapComposer) composer11;
                if (gapComposer14.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    CustomOrderPeriodSelectorKt.CustomOrderPeriodSelector(periodSelectionViewModel, function115, gapComposer14, i5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                BitcoinMapErrorViewModel bitcoinMapErrorViewModel = (BitcoinMapErrorViewModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                bitcoinMapErrorViewModel.getClass();
                function116.getClass();
                BitcoinMapViewKt.BitcoinMapErrorDialog(bitcoinMapErrorViewModel, function116, null, (Composer) obj3, intValue18 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 23:
                BitcoinMapOnboardingViewModel bitcoinMapOnboardingViewModel = (BitcoinMapOnboardingViewModel) obj;
                Function1 function117 = (Function1) obj2;
                int intValue19 = ((Integer) obj4).intValue();
                bitcoinMapOnboardingViewModel.getClass();
                function117.getClass();
                BitcoinMapViewKt.BitcoinMapOnboardingView(bitcoinMapOnboardingViewModel, function117, (Composer) obj3, intValue19 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 24:
                BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel = (BitcoinPayInUsdSettingsViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue20 = ((Integer) obj4).intValue();
                bitcoinPayInUsdSettingsViewModel.getClass();
                function118.getClass();
                BitcoinInvoiceEntryViewKt.BitcoinPayInUsdSettings(bitcoinPayInUsdSettingsViewModel, function118, (Composer) obj3, intValue20 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 25:
                BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel = (BitcoinInstrumentRecommendationViewModel) obj;
                Function1 function119 = (Function1) obj2;
                int intValue21 = ((Integer) obj4).intValue();
                bitcoinInstrumentRecommendationViewModel.getClass();
                function119.getClass();
                DistanceAndFlags.BitcoinInstrumentRecommendationView(bitcoinInstrumentRecommendationViewModel, function119, (Composer) obj3, intValue21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 26:
                BitcoinSendRestrictionViewModel bitcoinSendRestrictionViewModel = (BitcoinSendRestrictionViewModel) obj;
                Function1 function120 = (Function1) obj2;
                Composer composer12 = (Composer) obj3;
                int intValue22 = ((Integer) obj4).intValue();
                bitcoinSendRestrictionViewModel.getClass();
                function120.getClass();
                int i6 = (intValue22 & 6) == 0 ? intValue22 | (((GapComposer) composer12).changed(bitcoinSendRestrictionViewModel) ? 4 : 2) : intValue22;
                if ((intValue22 & 48) == 0) {
                    i6 |= ((GapComposer) composer12).changedInstance(function120) ? 32 : 16;
                }
                GapComposer gapComposer15 = (GapComposer) composer12;
                if (gapComposer15.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                    BitcoinSendRestrictionViewKt.BitcoinSendRestrictionView(bitcoinSendRestrictionViewModel, function120, gapComposer15, i6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer13 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 8.0f, 4.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                GapComposer gapComposer16 = (GapComposer) composer13;
                int hashCode2 = Long.hashCode(gapComposer16.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer16.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer13, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer17 = (GapComposer) composer13;
                if (gapComposer17.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer17.startReusableNode();
                if (gapComposer17.inserting) {
                    gapComposer17.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer17.useNode();
                }
                Updater.m576setimpl(composer13, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer13, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer13, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer13, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, composer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "25%", (Map) null, (Function1) null, false);
                gapComposer17.end(true);
                return Unit.INSTANCE;
            case 28:
                Composer composer14 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(companion, 8.0f, 4.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                GapComposer gapComposer18 = (GapComposer) composer14;
                int hashCode3 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer18.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer14, m299paddingVpY3zN42);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer19 = (GapComposer) composer14;
                if (gapComposer19.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer19.startReusableNode();
                if (gapComposer19.inserting) {
                    gapComposer19.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer19.useNode();
                }
                Updater.m576setimpl(composer14, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer14, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer14, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer14, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, composer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "50%", (Map) null, (Function1) null, false);
                gapComposer19.end(true);
                return Unit.INSTANCE;
            default:
                Composer composer15 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Modifier m299paddingVpY3zN43 = SpacerKt.m299paddingVpY3zN4(companion, 8.0f, 4.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                GapComposer gapComposer20 = (GapComposer) composer15;
                int hashCode4 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer20.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer15, m299paddingVpY3zN43);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer21 = (GapComposer) composer15;
                if (gapComposer21.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer21.startReusableNode();
                if (gapComposer21.inserting) {
                    gapComposer21.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer21.useNode();
                }
                Updater.m576setimpl(composer15, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer15, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer15, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer15, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, composer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Max", (Map) null, (Function1) null, false);
                gapComposer21.end(true);
                return Unit.INSTANCE;
        }
    }
}
