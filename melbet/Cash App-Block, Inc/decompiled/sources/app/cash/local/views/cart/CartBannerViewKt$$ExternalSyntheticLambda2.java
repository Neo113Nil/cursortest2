package app.cash.local.views.cart;

import android.icu.text.MessageFormat;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandLocationAddressContentModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.profile.LocalBrandProfileViewKt$$ExternalSyntheticLambda15;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.squareup.address.typeahead.views.AddressModel;
import com.squareup.cash.R;
import com.squareup.cash.account.components.PreviewTrustIndicator;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.protos.cash.local.client.v1.LocalNumberedListItem;
import com.squareup.protos.franklin.ui.ReceiptSection;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CartBannerViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CartBannerViewKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        Unit lambda$reducer$1;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                CartBannerStyle cartBannerStyle = (CartBannerStyle) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.NavClose16, Room.stringResource(gapComposer, R.string.local_views_banner_dismiss), (Modifier) null, cartBannerStyle.textAndIconColor, gapComposer, 6, 4);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                LocalBrandLocationAddressContentModel localBrandLocationAddressContentModel = (LocalBrandLocationAddressContentModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = localBrandLocationAddressContentModel.address;
                    TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) Modifier.Companion.$$INSTANCE, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                LocalBrandProfileViewModel localBrandProfileViewModel = (LocalBrandProfileViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    LocalMapKt.LocalExpandedHeader(Expect_jvmKt.rememberComposableLambda(-1763443910, new LocalBrandProfileViewKt$$ExternalSyntheticLambda15(localBrandProfileViewModel, r9 ? 1 : 0), gapComposer3), gapComposer3, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.OpenTabBannerTrailingIcon((LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 4:
                LocalCashBalanceViewModel localCashBalanceViewModel = (LocalCashBalanceViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    LocalMapKt.LocalExpandedHeader(Expect_jvmKt.rememberComposableLambda(1612684338, new SliderDefaults$$ExternalSyntheticLambda3(localCashBalanceViewModel, 19), gapComposer4), gapComposer4, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                ToastData toastData = (ToastData) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toastData.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 6:
                LocalBottomModalViewModel localBottomModalViewModel = (LocalBottomModalViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 48.0f).then(new VerticalAlignElement(Alignment.Companion.CenterVertically)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    localBottomModalViewModel.getClass();
                    gapComposer6.startReplaceGroup(1982999154);
                    Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    long j3 = colors2.semantic.icon.inverse;
                    gapComposer6.end(false);
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer6, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, j3, ColorKt.RectangleShape), 14.0f));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                LocalMapKt.QuantityAndAmount((LocalBottomModalViewModel.Payload.ItemInfo) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalNumberedListItem((LocalNumberedListItem) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 9:
                LocalDropdownItemModel.IconState iconState = (LocalDropdownItemModel.IconState) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    LocalDropdownItemModel.IconState.WithIcon withIcon = (LocalDropdownItemModel.IconState.WithIcon) iconState;
                    Icons icons = withIcon.icon;
                    Color color = withIcon.iconColorOverride;
                    if (color == null) {
                        gapComposer7.startReplaceGroup(88467297);
                        Colors colors3 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                        } else {
                            gapComposer7.startReplaceGroup(-1762997739);
                            gapComposer7.end(false);
                        }
                        j = colors3.semantic.icon.standard;
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(88465313);
                        gapComposer7.end(false);
                        j = color.value;
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m285size3ABfNKs, j, gapComposer7, 432, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 10:
                LocalDropdownItemModel localDropdownItemModel = (LocalDropdownItemModel) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    String str2 = localDropdownItemModel.text;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, Room.getSp(17), new FontWeight(400), null, 0L, null, 0L, null, null, null, 0, Room.getSp(22), null, null, 0, 16646137);
                    Color color2 = localDropdownItemModel.textColorOverride;
                    if (color2 == null) {
                        gapComposer8.startReplaceGroup(953724563);
                        Colors colors4 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        j2 = colors4.semantic.text.standard;
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(953722703);
                        gapComposer8.end(false);
                        j2 = color2.value;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, (Composer) gapComposer8, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 11:
                BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    String str3 = brandCollectionMapViewModel.title;
                    if (str3 == null) {
                        gapComposer9.startReplaceGroup(1021256888);
                    } else {
                        gapComposer9.startReplaceGroup(1021256889);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    }
                    gapComposer9.end(false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 12:
                LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder = (LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String format2 = new MessageFormat(Room.stringResource(gapComposer10, R.string.local_views_items_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(activeOrder.itemCount), "count"));
                    format2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer10).semantic.text.standard, (Composer) gapComposer10, (Modifier) null, Strings.getTypography(gapComposer10).bodySmall, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                    String str4 = activeOrder.orderingStationLabel;
                    if (str4 == null) {
                        gapComposer10.startReplaceGroup(1825358547);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(1825358548);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer10).semantic.text.subtle, (Composer) gapComposer10, (Modifier) null, Strings.getTypography(gapComposer10).bodySmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        gapComposer10.end(false);
                    }
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 13:
                break;
            case 14:
                lambda$reducer$1 = ((ServiceDeliveryClient) obj3).lambda$reducer$1((Map) obj, (byte[]) obj2);
                break;
            case 15:
                String str5 = (String) obj;
                str5.getClass();
                ((SnapshotStateMap) obj3).put(str5, (Size) obj2);
                break;
            case 16:
                AddressModel.Expanded expanded = (AddressModel.Expanded) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    String str6 = ((AddressModel.Expanded.Field.Shown) expanded.state).label;
                    str6.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 17:
                AccountDocumentsViewModel.DocumentModel.SectionModel sectionModel = (AccountDocumentsViewModel.DocumentModel.SectionModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sectionModel.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 18:
                AccountDocumentsViewModel.DocumentModel.RecordModel recordModel = (AccountDocumentsViewModel.DocumentModel.RecordModel) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recordModel.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 19:
                AccountSettingsViewModel.Content content = (AccountSettingsViewModel.Content) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.header, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 20:
                PreviewTrustIndicator previewTrustIndicator = (PreviewTrustIndicator) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, previewTrustIndicator.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 21:
                InvitationConfig invitationConfig = (InvitationConfig) obj3;
                ((Integer) obj2).getClass();
                GapComposer gapComposer16 = (GapComposer) ((Composer) obj);
                gapComposer16.startReplaceGroup(125032734);
                String str7 = invitationConfig.profile_row_title;
                if (str7 == null) {
                    str7 = invitationConfig.preview_message;
                }
                ActivityFeedEntry.InviteFriendsItem inviteFriendsItem = new ActivityFeedEntry.InviteFriendsItem(str7, invitationConfig.profile_row_subtitle);
                gapComposer16.end(false);
                break;
            case 22:
                ((Integer) obj2).getClass();
                GapComposer gapComposer17 = (GapComposer) ((Composer) obj);
                gapComposer17.startReplaceGroup(-1866697161);
                ActivityFeedEntry.EmptyItem emptyItem = new ActivityFeedEntry.EmptyItem(((ActivityTabPresenter) obj3).strings.get(R.string.activity_search_no_results));
                gapComposer17.end(false);
                break;
            case 23:
                ((Integer) obj2).getClass();
                GapComposer gapComposer18 = (GapComposer) ((Composer) obj);
                gapComposer18.startReplaceGroup(103345814);
                ActivityFeedEntry.QuickAccessBar quickAccessBar = new ActivityFeedEntry.QuickAccessBar((ContactHeaderViewModel) obj3);
                gapComposer18.end(false);
                break;
            case 24:
                RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = (RealActivityEmbeddedPresenter) obj3;
                ((Integer) obj2).getClass();
                GapComposer gapComposer19 = (GapComposer) ((Composer) obj);
                gapComposer19.startReplaceGroup(-1667885892);
                String str8 = realActivityEmbeddedPresenter.configuration.customEmptyMessage;
                if (str8 == null) {
                    str8 = realActivityEmbeddedPresenter.strings.get(R.string.activity_embedded_empty);
                }
                ActivityFeedEntry.EmptyItem emptyItem2 = new ActivityFeedEntry.EmptyItem(str8);
                gapComposer19.end(false);
                break;
            case 25:
                ((Integer) obj2).getClass();
                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 26:
                ReceiptSection.LocationRow locationRow = (ReceiptSection.LocationRow) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer16;
                if (gapComposer20.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    String str9 = locationRow.location;
                    if (str9 == null) {
                        gapComposer20.startReplaceGroup(-1779791467);
                    } else {
                        gapComposer20.startReplaceGroup(-1779791466);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                    }
                    gapComposer20.end(false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 27:
                ReceiptSection.ActionRow actionRow = (ReceiptSection.ActionRow) obj3;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer17;
                if (gapComposer21.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    String str10 = actionRow.label;
                    if (str10 == null) {
                        gapComposer21.startReplaceGroup(-1148254867);
                    } else {
                        gapComposer21.startReplaceGroup(-1148254866);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str10, (Map) null, (Function1) null, false);
                    }
                    gapComposer21.end(false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                ReceiptUiKt.ProgressRow((ReceiptSection.ProgressRow) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ReceiptSection.Upsell upsell = (ReceiptSection.Upsell) obj3;
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer18;
                if (gapComposer22.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    String str11 = upsell.header;
                    if (str11 == null) {
                        gapComposer22.startReplaceGroup(2037427813);
                    } else {
                        gapComposer22.startReplaceGroup(2037427814);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str11, (Map) null, (Function1) null, false);
                    }
                    gapComposer22.end(false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CartBannerViewKt$$ExternalSyntheticLambda2(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
