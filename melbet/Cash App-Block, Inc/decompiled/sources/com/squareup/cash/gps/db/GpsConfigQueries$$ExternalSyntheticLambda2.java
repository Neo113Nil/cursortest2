package com.squareup.cash.gps.db;

import android.content.ClipData;
import android.content.Context;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.autofill.AndroidContentType;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.integrity.internal.aj;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.arcade.components.CopyCodeState;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.clientsync.pipeline.InvitationSyncEntityStorageObserver;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.formview.components.ArcadeFormViewTitleBar;
import com.squareup.cash.formview.components.arcade.ArcadeFormCaptionedTile;
import com.squareup.cash.formview.components.arcade.ArcadeFormCheckBoxView;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.genericelements.components.components.arcade.ArcadeUtilKt;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellActivityViewModel$Accessory$Amount;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellActivityViewModel$Accessory$Push;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewEvent;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.PaymentPasscodeDialogView;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.categories.InvestmentCategorySyncEntityStorageObserver;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$categoryTokenFromMapNodes$$inlined$sortedByDescending$1;
import com.squareup.cash.investing.components.DisclosuresAdapter;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;
import com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar;
import com.squareup.cash.investing.components.NewsCarouselAdapter;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.exchange.MaxCentsCappedKeypadListener;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$MapForTokenQuery;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$mapForToken$2;
import com.squareup.cash.investing.db.categories.MapForToken;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.invest.ui.Section;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes6.dex */
public final /* synthetic */ class GpsConfigQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ GpsConfigQueries$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 0;
        GpsConfigQueries$selectAll$2 gpsConfigQueries$selectAll$2 = GpsConfigQueries$selectAll$2.INSTANCE;
        this.f$1 = gpsConfigQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 2;
        String str = "";
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                GpsConfigQueries$selectAll$2 gpsConfigQueries$selectAll$2 = GpsConfigQueries$selectAll$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                GpsConsentStatus gpsConsentStatus = string2 != null ? (GpsConsentStatus) ((EnumListAdapter) gpsConfigQueries.gpsConfigAdapter).enumColumnAdapter.decode(string2) : null;
                Boolean bool = androidCursor.getBoolean(1);
                Long l = androidCursor.getLong(2);
                l.getClass();
                return gpsConfigQueries$selectAll$2.invoke(gpsConsentStatus, bool, l);
            case 1:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((ArcadeFormViewTitleBar) obj2).titleVisibility$delegate;
                reusableGraphicsLayerScope.setTranslationY(reusableGraphicsLayerScope.graphicsDensity.getDensity() * TransactorKt.lerp(2.2f, RecyclerView.DECELERATION_RATE, parcelableSnapshotMutableFloatState.getFloatValue()));
                reusableGraphicsLayerScope.setAlpha(parcelableSnapshotMutableFloatState.getFloatValue());
                return Unit.INSTANCE;
            case 2:
                StyledCardPerspectiveView styledCardPerspectiveView = (StyledCardPerspectiveView) obj;
                styledCardPerspectiveView.getClass();
                styledCardPerspectiveView.render((StyledCardViewModel) obj2);
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str2 = ((ArcadeFormCaptionedTile) obj2).element.accessibility_text;
                if (str2 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                }
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).getClass();
                ((ArcadeFormCheckBoxView) obj2).isChecked$delegate.setValue(Boolean.valueOf(!r0.isChecked$1()));
                return Unit.INSTANCE;
            case 5:
                CopyCodeState copyCodeState = (CopyCodeState) obj;
                copyCodeState.getClass();
                String str3 = ((FormBlocker.Element.CopyableElementGroup.CopyableElement) obj2).value;
                str3.getClass();
                copyCodeState.clipboardManager.getClipboardManager().setPrimaryClip(ClipData.newPlainText("plain text", OverlayKt.convertToCharSequence(new AnnotatedString(str3))));
                return Unit.INSTANCE;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                String str4 = ((FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption) obj2).accessibilityText;
                if (str4 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str4);
                }
                return Unit.INSTANCE;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                String str5 = ((FormBlocker.Element.OptionPickerElement.Option) obj2).subtitle_accessibility_value;
                if (str5 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str5);
                }
                return Unit.INSTANCE;
            case 8:
                ArcadeFormOptionPickerView arcadeFormOptionPickerView = (ArcadeFormOptionPickerView) obj2;
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult) {
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                    Screen screen = onDialogResult.screen;
                    Object obj3 = onDialogResult.result;
                    if ((screen instanceof BlockersScreens.ConfirmableOptionDialog) && (obj3 instanceof BlockersScreens.OptionPickerConfirmationResult)) {
                        BlockersScreens.OptionPickerConfirmationResult optionPickerConfirmationResult = (BlockersScreens.OptionPickerConfirmationResult) obj3;
                        if (Intrinsics.areEqual(optionPickerConfirmationResult.formElementId, arcadeFormOptionPickerView.formElementId)) {
                            arcadeFormOptionPickerView.selectedOptionId$delegate.setValue(optionPickerConfirmationResult.optionId);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver4, (AndroidContentType) obj2);
                return Unit.INSTANCE;
            case 10:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                aj ajVar = ((GenericComponentViewModel.CellActivityViewModel) obj2).accessory;
                if (ajVar instanceof GenericComponentViewModel$CellActivityViewModel$Accessory$Amount) {
                    realCellActivityAccessoryScope.amount(new ComposableLambdaImpl(new ArcadeModal$$ExternalSyntheticLambda5(ajVar, 24), true, -403126041));
                } else if (Intrinsics.areEqual(ajVar, GenericComponentViewModel$CellActivityViewModel$Accessory$Push.INSTANCE)) {
                    realCellActivityAccessoryScope.type$delegate.setValue(RealCellActivityAccessoryScope.Type.PUSH);
                    realCellActivityAccessoryScope.setAccessoryContent(CellDefaultKt.lambda$95974281);
                } else {
                    realCellActivityAccessoryScope.custom(ArcadeUtilKt.f425lambda$1069643319);
                }
                return Unit.INSTANCE;
            case 11:
                ContactHeaderViewEvent contactHeaderViewEvent = (ContactHeaderViewEvent) obj;
                contactHeaderViewEvent.getClass();
                StateFlowKt.emitOrThrow((MutableSharedFlow) obj2, contactHeaderViewEvent);
                return Unit.INSTANCE;
            case 12:
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(0);
                frameLayout.setClipChildren(false);
                frameLayout.addView((TextureView) obj2);
                return frameLayout;
            case 13:
                PasscodeDialogViewEvent passcodeDialogViewEvent = (PasscodeDialogViewEvent) obj;
                passcodeDialogViewEvent.getClass();
                Ui.EventReceiver eventReceiver = ((PaymentPasscodeDialogView) obj2).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(passcodeDialogViewEvent);
                }
                return Unit.INSTANCE;
            case 14:
                VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
                versionedSavingsFolders.getClass();
                return MotionEventCompat.toSavingsFolders((PoolsListPresenter) obj2, versionedSavingsFolders);
            case 15:
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click.getClass();
                if (promotedAppletTileViewEvent$Click.equals(PromotedAppletTileViewEvent$Click.INSTANCE)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 16:
                PersistentHistoricalDataCache persistentHistoricalDataCache = (PersistentHistoricalDataCache) obj2;
                RewardSlotQueries queries = persistentHistoricalDataCache.getQueries();
                queries.driver.execute(-1181561884, "DELETE\nFROM investing_stocks_portfolio_graph_cache", null);
                queries.notifyQueries(-1181561884, new InvestmentEntityQueries$$ExternalSyntheticLambda1(20));
                RewardSlotQueries queries2 = persistentHistoricalDataCache.getQueries();
                queries2.driver.execute(-486672841, "DELETE\nFROM investing_bitcoin_portfolio_graph_cache", null);
                queries2.notifyQueries(-486672841, new InvestmentEntityQueries$$ExternalSyntheticLambda1(19));
                return Unit.INSTANCE;
            case 17:
                InvestmentCategorySyncEntityStorageObserver investmentCategorySyncEntityStorageObserver = (InvestmentCategorySyncEntityStorageObserver) obj2;
                ((TransactionWrapper) obj).getClass();
                CategoryQueries categoryQueries = investmentCategorySyncEntityStorageObserver.categoryQueries;
                categoryQueries.driver.execute(129342057, "DELETE FROM category", null);
                categoryQueries.notifyQueries(129342057, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(8));
                CategoryQueries categoryQueries2 = investmentCategorySyncEntityStorageObserver.entityInCategoryQueries;
                categoryQueries2.driver.execute(1812081633, "DELETE FROM entity_in_category", null);
                categoryQueries2.notifyQueries(1812081633, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(11));
                StoryQueries storyQueries = investmentCategorySyncEntityStorageObserver.filtersForCategoryQueries;
                storyQueries.driver.execute(1412591995, "DELETE FROM filter_for_category", null);
                storyQueries.notifyQueries(1412591995, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(17));
                return Unit.INSTANCE;
            case 18:
                InvitationSyncEntityStorageObserver invitationSyncEntityStorageObserver = (InvitationSyncEntityStorageObserver) obj2;
                ((TransactionWrapper) obj).getClass();
                StoryQueries storyQueries2 = (StoryQueries) invitationSyncEntityStorageObserver.contactQueries;
                storyQueries2.driver.execute(-87462619, "DELETE FROM category_in_filter_group", null);
                storyQueries2.notifyQueries(-87462619, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(4));
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) invitationSyncEntityStorageObserver.invitationEntityQueries;
                rewardSlotQueries.driver.execute(-58396542, "DELETE FROM filter_group", null);
                rewardSlotQueries.notifyQueries(-58396542, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(13));
                return Unit.INSTANCE;
            case 19:
                RealCategoryBackend realCategoryBackend = (RealCategoryBackend) obj2;
                FilterConfiguration filterConfiguration = (FilterConfiguration) obj;
                filterConfiguration.getClass();
                if (filterConfiguration instanceof FilterConfiguration.SubFilters) {
                    RewardSlotQueries rewardSlotQueries2 = realCategoryBackend.filterGroupQueries;
                    FilterConfiguration.SubFilters subFilters = (FilterConfiguration.SubFilters) filterConfiguration;
                    FilterToken filterToken = subFilters.filterToken;
                    rewardSlotQueries2.getClass();
                    filterToken.getClass();
                    int i3 = FilterGroupQueries$mapForToken$2.$r8$clinit;
                    List list = ((MapForToken) new FilterGroupQueries$MapForTokenQuery(rewardSlotQueries2, filterToken, new FilterGroupQueries$$ExternalSyntheticLambda0(rewardSlotQueries2, i2), (byte) 0).executeAsOne()).category_map;
                    list.getClass();
                    String str6 = filterToken.value;
                    List<String> sortedWith = CollectionsKt.sortedWith(subFilters.subFilterSelections.values(), new RealCategoryBackend$categoryTokenFromMapNodes$$inlined$sortedByDescending$1(list, 0));
                    SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = new SyncInvestmentFilterGroup.CategoryMapNode(list);
                    for (String str7 : sortedWith) {
                        Iterator it = categoryMapNode.sub_nodes.iterator();
                        Object[] objArr = false;
                        Object obj4 = null;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.CategoryMapNode) next).option_token, str7)) {
                                    if (objArr == true) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                                    } else {
                                        objArr = true;
                                        obj4 = next;
                                    }
                                }
                            } else if (objArr == true) {
                                categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj4;
                            } else {
                                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            }
                        }
                    }
                    String str8 = categoryMapNode.category_token;
                    str8.getClass();
                    return str6 + "," + str8;
                }
                if (filterConfiguration instanceof FilterConfiguration.Categories) {
                    FilterConfiguration.Categories categories = (FilterConfiguration.Categories) filterConfiguration;
                    return Recorder$$ExternalSyntheticOutline2.m(categories.filterToken.value, ",", CollectionsKt.joinToString$default(categories.categoryTokens, ",", null, null, 0, null, new ActivityItemLayout$$ExternalSyntheticLambda4(27), 30));
                }
                if (filterConfiguration instanceof FilterConfiguration.Empty) {
                    return "";
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 20:
                String str9 = (String) obj;
                str9.getClass();
                GpsConfigQueries$$ExternalSyntheticLambda2 gpsConfigQueries$$ExternalSyntheticLambda2 = ((DisclosuresAdapter) obj2).onLinkClick;
                if (gpsConfigQueries$$ExternalSyntheticLambda2 != null) {
                    gpsConfigQueries$$ExternalSyntheticLambda2.invoke(str9);
                }
                return Unit.INSTANCE;
            case 21:
                CategoryToken categoryToken = (CategoryToken) obj;
                categoryToken.getClass();
                Ui.EventReceiver eventReceiver2 = ((InvestingHomeRowAdapter) obj2).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new InvestingHomeViewEvent.SelectCategory(categoryToken));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 22:
                String str10 = (String) obj;
                str10.getClass();
                ((Ui.EventReceiver) obj2).sendEvent(new InvestingHomeViewEvent.DisclosureClicked(str10));
                return Unit.INSTANCE;
            case 23:
                Section.Row row = (Section.Row) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                String str11 = row.spoken_label;
                if (str11 == null) {
                    String str12 = row.label;
                    if (str12 != null) {
                        str = str12;
                    }
                } else {
                    str = str11;
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver5, str);
                return Unit.INSTANCE;
            case 24:
                InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel = (InvestingStockDetailsHeaderViewModel) obj2;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = (InvestingStockDetailsCollapsedToolbar) obj;
                investingStockDetailsCollapsedToolbar.getClass();
                AppCompatTextView appCompatTextView = investingStockDetailsCollapsedToolbar.subtitleDescriptionView;
                AppCompatTextView appCompatTextView2 = investingStockDetailsCollapsedToolbar.subtitleView;
                int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(investingStockDetailsCollapsedToolbar.themeInfo.arcadeColors.semantic.text.standard);
                investingStockDetailsCollapsedToolbar.titleView.setText(investingStockDetailsHeaderViewModel.title);
                InvestingStockDetailsHeaderViewModel.Subtitle subtitle = investingStockDetailsHeaderViewModel.subtitle;
                appCompatTextView2.setText(subtitle != null ? subtitle.detail : null);
                appCompatTextView2.setTextColor(m694toArgb8_81llA);
                appCompatTextView.setText(subtitle != null ? subtitle.detailDescription : null);
                appCompatTextView.setTextColor(m694toArgb8_81llA);
                investingStockDetailsCollapsedToolbar.subtitleIconView.render(subtitle != null ? subtitle.detailIcon : null, Integer.valueOf(m694toArgb8_81llA));
                return Unit.INSTANCE;
            case 25:
                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel = (InvestingStockSelectionViewModel.SearchResultItemModel) obj;
                searchResultItemModel.getClass();
                return Recorder$$ExternalSyntheticOutline2.m$1(((InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header) obj2).getTitle(), searchResultItemModel.symbol);
            case 26:
                InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = (InvestingCryptoNewsViewEvent) obj;
                investingCryptoNewsViewEvent.getClass();
                ((Ui.EventReceiver) ((NewsCarouselAdapter) obj2).eventReceiverProducer.invoke()).sendEvent(new InvestingHomeViewEvent.NewsEvent(investingCryptoNewsViewEvent));
                return Unit.INSTANCE;
            case 27:
                GraphState graphState = (GraphState) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                if (graphState.graphHeight$delegate.getIntValue() == 0) {
                    graphState.graphHeight$delegate.setIntValue((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                    Recorder$$ExternalSyntheticOutline1.m(ValueInsets.positionInParent(layoutCoordinates), graphState.graphPosition$delegate);
                }
                return Unit.INSTANCE;
            case 28:
                DividendReinvestmentSettingViewModel.Entry entry = (DividendReinvestmentSettingViewModel.Entry) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver6, entry.label + entry.subLabel);
                return Unit.INSTANCE;
            default:
                MaxCentsCappedKeypadListener maxCentsCappedKeypadListener = (MaxCentsCappedKeypadListener) obj2;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    maxCentsCappedKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    maxCentsCappedKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    maxCentsCappedKeypadListener.onDecimal();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ GpsConfigQueries$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
