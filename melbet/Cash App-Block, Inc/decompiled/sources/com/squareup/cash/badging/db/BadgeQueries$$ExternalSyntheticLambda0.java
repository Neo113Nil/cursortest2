package com.squareup.cash.badging.db;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.arcade.components.timeline.RenderedRow;
import com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding;
import com.squareup.cash.arcade.treehouse.RadioSelectionGroupBinding;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.applets.views.BalanceAppletTileKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.presenters.BankingSectionsPresenter;
import com.squareup.cash.banking.presenters.BankingSectionsPresenter$models$1$1$1;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewEvent;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.billssubscriptions.viewmodels.model.CategoryFilter;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewEvent$Next;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.views.LabelValueView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.cdf.bankingoption.BankingOptionBrowseViewItem;
import com.squareup.cash.cdf.bankingoption.EntryScreen;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractViewBlockerResponse;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.data.contacts.ContactVerifier$Result;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.instruments.backend.api.BankAccountLinker$Result;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Result;
import com.squareup.cash.mooncake.components.MooncakeOptionRow;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.PinnedKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.widget.keypad.ExtraButton;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.scannerview.OverlayType;
import com.squareup.scannerview.ScanType;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.Step;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.ViewGroups;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 25;
        int i4 = 27;
        BlockerResponse.Success success = BlockerResponse.Success.INSTANCE;
        int i5 = 3;
        int i6 = 5;
        int i7 = 2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Instant instant = (Instant) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, instant != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).encode(instant)).longValue()) : 0);
                return Unit.INSTANCE;
            case 1:
                RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = (RealAppMessageRepositoryWriter) obj3;
                LocalTabContentQueries localTabContentQueries2 = realAppMessageRepositoryWriter.inlineMessagesQueries;
                localTabContentQueries2.driver.execute(1134230339, "DELETE FROM inlineMessage", null);
                localTabContentQueries2.notifyQueries(1134230339, new CardMessageQueries$$ExternalSyntheticLambda7(i2));
                LocalTabContentQueries localTabContentQueries3 = realAppMessageRepositoryWriter.inlineMessagesV2Queries;
                localTabContentQueries3.driver.execute(79784807, "DELETE FROM inlineMessageV2", null);
                localTabContentQueries3.notifyQueries(79784807, new CardMessageQueries$$ExternalSyntheticLambda7(11));
                LocalTabContentQueries localTabContentQueries4 = realAppMessageRepositoryWriter.popupMessageQueries;
                localTabContentQueries4.driver.execute(-1960189084, "DELETE FROM popupMessage", null);
                localTabContentQueries4.notifyQueries(-1960189084, new CardMessageQueries$$ExternalSyntheticLambda7(19));
                LocalTabContentQueries localTabContentQueries5 = realAppMessageRepositoryWriter.sheetMessageQueries;
                localTabContentQueries5.driver.execute(-845776745, "DELETE FROM sheetMessage", null);
                localTabContentQueries5.notifyQueries(-845776745, new CardMessageQueries$$ExternalSyntheticLambda7(23));
                LocalTabContentQueries localTabContentQueries6 = realAppMessageRepositoryWriter.inAppNotificationMessageQueries;
                localTabContentQueries6.driver.execute(-17856897, "DELETE FROM inAppNotificationMessage", null);
                localTabContentQueries6.notifyQueries(-17856897, new CardMessageQueries$$ExternalSyntheticLambda7(i6));
                LocalTabContentQueries localTabContentQueries7 = realAppMessageRepositoryWriter.fullScreenMessageQueries;
                localTabContentQueries7.driver.execute(143724293, "DELETE FROM fullScreenMessage", null);
                localTabContentQueries7.notifyQueries(143724293, new CardMessageQueries$$ExternalSyntheticLambda7(true ? 1 : 0));
                LocalTabContentQueries localTabContentQueries8 = realAppMessageRepositoryWriter.tooltipMessageQueries;
                localTabContentQueries8.driver.execute(-57606277, "DELETE FROM tooltipMessage", null);
                localTabContentQueries8.notifyQueries(-57606277, new CardMessageQueries$$ExternalSyntheticLambda7(i4));
                LocalTabContentQueries localTabContentQueries9 = realAppMessageRepositoryWriter.cardMessageQueries;
                localTabContentQueries9.driver.execute(-594507654, "DELETE FROM cardMessage", null);
                localTabContentQueries9.notifyQueries(-594507654, new CardMessageQueries$$ExternalSyntheticLambda1(0));
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    RealAppMessageRepositoryWriter.access$insertWithoutTransaction(realAppMessageRepositoryWriter, (AppMessage) it.next());
                }
                return Unit.INSTANCE;
            case 2:
                LocalTabContentQueries localTabContentQueries10 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                Placement placement = (Placement) ((RewardQueries.ForIdsQuery) obj3).token;
                androidStatement2.bindString(0, placement != null ? (String) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries10.local_tab_contentAdapter).scope).encode(placement) : null);
                return Unit.INSTANCE;
            case 3:
                Function1 function1 = (Function1) obj3;
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    appCompatImageView.setImageBitmap(bitmap);
                    function1.invoke(Boolean.TRUE);
                } else {
                    function1.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 4:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                Placeable.PlacementScope.m856placeWithLayeraW9wM$default(placementScope, (Placeable) obj3, 0L, new PinnedKt$$ExternalSyntheticLambda0((RealSheetState) obj2, 4), 2);
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState = (MutableState) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(Boolean.valueOf(ValueInsets.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, true).bottom > ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj3)).getFloatValue()));
                return Unit.INSTANCE;
            case 6:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) obj2;
                DefaultDraggableAnchors DraggableAnchors = Draggable2DKt.DraggableAnchors(new TextFieldKt$$ExternalSyntheticLambda0((RealSegmentedControlScope) obj3, ((int) (((IntSize) obj).packedValue >> 32)) / r0.segments.size(), i7));
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.offset$delegate;
                DerivedSnapshotState derivedSnapshotState = anchoredDraggableState.targetValue$delegate;
                if (Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue())) {
                    value = derivedSnapshotState.getValue();
                } else {
                    value = DraggableAnchors.closestAnchor(anchoredDraggableState.offset$delegate.getFloatValue());
                    if (value == null) {
                        value = derivedSnapshotState.getValue();
                    }
                }
                anchoredDraggableState.updateAnchors(DraggableAnchors, value);
                return Unit.INSTANCE;
            case 7:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new RingtoneView$playRingtone$1((AnchoredDraggableState) obj2, ((Integer) obj).intValue(), (Continuation) r8, 4), 3);
                return Unit.INSTANCE;
            case 8:
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                placementScope2.getClass();
                placementScope2.placeRelative((Placeable) obj3, 0, 0, RecyclerView.DECELERATION_RATE);
                placementScope2.placeRelative((Placeable) obj2, 0, 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 9:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                ((LinkTapDetectorState) obj3).textLayoutResult$delegate.setValue(textLayoutResult);
                ((Function1) obj2).invoke(textLayoutResult);
                return Unit.INSTANCE;
            case 10:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                CollectionItemInfo collectionItemInfo = LazyListLayoutInfoKt.toCollectionItemInfo((RenderedRow.VisibleItem) obj3);
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.CollectionItemInfo;
                KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[25];
                semanticsPropertyReceiver.set(semanticsPropertyKey, collectionItemInfo);
                SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, (String) obj2);
                return Unit.INSTANCE;
            case 11:
                KeypadAmount keypadAmount = ((KeypadScaffoldBinding) obj3).keypadAmount;
                ExtraButton extraButton = (ExtraButton) obj2;
                String str = (String) obj;
                int i8 = KeypadScaffoldBinding.$r8$clinit;
                str.getClass();
                if (Character.isDigit(StringsKt___StringsKt.first(str))) {
                    char first = StringsKt___StringsKt.first(str);
                    int digit = Character.digit((int) first, 10);
                    if (digit < 0) {
                        f$$ExternalSyntheticLambda0.m("Char ", first, " is not a decimal digit");
                        return null;
                    }
                    keypadAmount.onDigit(digit);
                } else if (extraButton == ExtraButton.DECIMAL) {
                    keypadAmount.onDecimal();
                }
                return Unit.INSTANCE;
            case 12:
                int i9 = RadioSelectionGroupBinding.$r8$clinit;
                ((Context) obj).getClass();
                Context context = ((RadioSelectionGroupBinding) obj3).getContext();
                context.getClass();
                return new MooncakeOptionRow(context, (FormBlocker.Element.OptionPickerElement.Option) obj2);
            case 13:
                BadgeQueries$ClearQuery badgeQueries$ClearQuery = (BadgeQueries$ClearQuery) obj3;
                LocalTabContentQueries localTabContentQueries11 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                Instant instant2 = badgeQueries$ClearQuery.cleared_at;
                Long l = badgeQueries$ClearQuery.version;
                androidStatement3.bindLong(0, instant2 != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((GrpcMethod) localTabContentQueries11.local_tab_contentAdapter).requestAdapter).encode(instant2)).longValue()) : null);
                androidStatement3.bindLong(1, l);
                androidStatement3.bindString(2, badgeQueries$ClearQuery.token);
                androidStatement3.bindString(3, (String) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries11.local_tab_contentAdapter).path).encode(badgeQueries$ClearQuery.f1050type));
                androidStatement3.bindLong(4, l);
                return Unit.INSTANCE;
            case 14:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) obj3;
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, (String) badgeQueries$VersionQuery.external_token);
                androidStatement4.bindString(1, (String) ((EnumColumnAdapter) ((GrpcMethod) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).path).encode((ItemType) badgeQueries$VersionQuery.item_type));
                return Unit.INSTANCE;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((BalanceAppletTileViewModel.Loading) ((BalanceAppletTileViewModel) obj3)).title);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver2, null, new BalanceAppletTileKt$$ExternalSyntheticLambda4((NetworkFetcher$fetch$2) obj2, i7));
                return Unit.INSTANCE;
            case 16:
                ((NetworkFetcher$fetch$2) obj3).invoke(BalanceAppletTileViewEvent.BalanceAppletOnClickCashOut.INSTANCE);
                ((Shaker) obj2).shake();
                return Unit.INSTANCE;
            case 17:
                StableCoroutineScope stableCoroutineScope = (StableCoroutineScope) obj3;
                BankingSectionsPresenter bankingSectionsPresenter = (BankingSectionsPresenter) obj2;
                BankingSectionsViewEvent bankingSectionsViewEvent = (BankingSectionsViewEvent) obj;
                bankingSectionsViewEvent.getClass();
                if (bankingSectionsViewEvent instanceof BankingSectionsViewEvent.BankingRowClicked) {
                    JobKt.launch$default(stableCoroutineScope, null, null, new BankingSectionsPresenter$models$1$1$1(bankingSectionsPresenter, bankingSectionsViewEvent, null), 3);
                } else {
                    if (!(bankingSectionsViewEvent instanceof BankingSectionsViewEvent.RowViewed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    LinkedHashSet linkedHashSet = bankingSectionsPresenter.viewedRows;
                    String str2 = ((BankingSectionsViewEvent.RowViewed) bankingSectionsViewEvent).rowId;
                    if (linkedHashSet.add(str2)) {
                        bankingSectionsPresenter.analytics.track(new BankingOptionBrowseViewItem(str2, EntryScreen.BalanceHome), null);
                    }
                }
                return Unit.INSTANCE;
            case 18:
                BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded = (BillsSubscriptionsMerchantListViewModel$Loaded) obj3;
                Function1 function12 = (Function1) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                for (CategoryFilter categoryFilter : billsSubscriptionsMerchantListViewModel$Loaded.categoryFilters) {
                    FilterBarScope.chip$default(filterBarScope, new BankingDialogKt$$ExternalSyntheticLambda5(26, function12, categoryFilter), categoryFilter.token.equals(billsSubscriptionsMerchantListViewModel$Loaded.selectedCategoryToken), null, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(categoryFilter, i2), true, 803290575), 54);
                }
                return Unit.INSTANCE;
            case 19:
                ((FormView) obj).getClass();
                FormView formView = ((BitcoinDepositNoteScreenView) obj3).formView;
                formView.renderViewModel((FormViewModel) obj2);
                View findViewInTree = ViewGroups.findViewInTree(formView, new BenefitsHubViewKt$$ExternalSyntheticLambda2(24));
                EditText editText = findViewInTree instanceof EditText ? (EditText) findViewInTree : null;
                if (editText != null) {
                    editText.requestFocus();
                    Keyboards.showKeyboard(editText);
                }
                return Unit.INSTANCE;
            case 20:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                ArrayList arrayList = ((StablecoinDepositOptionsViewModel.Loaded) ((StablecoinDepositOptionsViewModel) obj3)).networks;
                lazyListScope.items(arrayList.size(), new Latch$await$2$2(i3, new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i6), arrayList), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(5, arrayList), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList, (Function1) obj2, i5), true, 802480018));
                return Unit.INSTANCE;
            case 21:
                InstrumentVerifier$Result instrumentVerifier$Result = (InstrumentVerifier$Result) obj3;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                ((Unit) obj).getClass();
                if (instrumentVerifier$Result instanceof InstrumentVerifier$Result.Successful) {
                    return success;
                }
                if (instrumentVerifier$Result instanceof InstrumentVerifier$Result.NotSuccessful) {
                    InstrumentVerifier$Result.NotSuccessful notSuccessful = (InstrumentVerifier$Result.NotSuccessful) instrumentVerifier$Result;
                    return new BlockerResponse.Error(notSuccessful.status.name(), notSuccessful.failureMessage, BlockerFlowInteractViewBlockerResponse.Status.LOGICAL_ERROR);
                }
                if (instrumentVerifier$Result instanceof InstrumentVerifier$Result.NetworkFailure) {
                    return PointerInputModifierNodeKt.toBlockerResponse(((InstrumentVerifier$Result.NetworkFailure) instrumentVerifier$Result).failure, androidStringManager, R.string.blockers_retrofit_error_message);
                }
                if (instrumentVerifier$Result instanceof InstrumentVerifier$Result.Loading) {
                    a$$ExternalSyntheticBUOutline0.m$1("AliasVerifier shouldn't emit Loading to a Single stream");
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return null;
            case 22:
                BankAccountLinker$Result bankAccountLinker$Result = (BankAccountLinker$Result) obj3;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj2;
                ((Unit) obj).getClass();
                if (bankAccountLinker$Result instanceof BankAccountLinker$Result.Successful) {
                    return success;
                }
                if (bankAccountLinker$Result instanceof BankAccountLinker$Result.NotSuccessful) {
                    return new BlockerResponse.Error((String) null, ((BankAccountLinker$Result.NotSuccessful) bankAccountLinker$Result).failureMessage, BlockerFlowInteractViewBlockerResponse.Status.LOGICAL_ERROR);
                }
                if (bankAccountLinker$Result instanceof BankAccountLinker$Result.NetworkFailure) {
                    return PointerInputModifierNodeKt.toBlockerResponse(((BankAccountLinker$Result.NetworkFailure) bankAccountLinker$Result).failure, androidStringManager2, R.string.blockers_retrofit_error_message);
                }
                if (bankAccountLinker$Result instanceof BankAccountLinker$Result.Loading) {
                    a$$ExternalSyntheticBUOutline0.m$1("AliasVerifier shouldn't emit Loading to a Single stream");
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return null;
            case 23:
                ContactVerifier$Result contactVerifier$Result = (ContactVerifier$Result) obj3;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj2;
                ((Unit) obj).getClass();
                if (contactVerifier$Result instanceof ContactVerifier$Result.Successful) {
                    return success;
                }
                if (contactVerifier$Result instanceof ContactVerifier$Result.NotSuccessful) {
                    return new BlockerResponse.Error((String) null, ((ContactVerifier$Result.NotSuccessful) contactVerifier$Result).failureMessage, BlockerFlowInteractViewBlockerResponse.Status.LOGICAL_ERROR);
                }
                if (contactVerifier$Result instanceof ContactVerifier$Result.NetworkFailure) {
                    return PointerInputModifierNodeKt.toBlockerResponse(((ContactVerifier$Result.NetworkFailure) contactVerifier$Result).failure, androidStringManager3, R.string.blockers_retrofit_error_message);
                }
                if (contactVerifier$Result instanceof ContactVerifier$Result.Loading) {
                    a$$ExternalSyntheticBUOutline0.m$1("ContactVerifier shouldn't emit Loading to a Single stream");
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return null;
            case 24:
                CardActivationQrViewModel cardActivationQrViewModel = (CardActivationQrViewModel) obj3;
                ScannerView scannerView = (ScannerView) obj;
                scannerView.getClass();
                if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    if (scannerView.isStarted()) {
                        scannerView.stop();
                    }
                } else if (cardActivationQrViewModel.cameraPermissions && !scannerView.isStarted()) {
                    scannerView.start(new Step(cardActivationQrViewModel.title, null, ScanType.CASH_QR, OverlayType.SQUARE, false));
                }
                return Unit.INSTANCE;
            case 25:
                ((KeyboardActionScope) obj).getClass();
                ((Function1) obj3).invoke(new ConfirmCvvViewEvent$Next(((ConfirmCvvViewModel) obj2).cvvLength));
                return Unit.INSTANCE;
            case 26:
                MutableState mutableState2 = (MutableState) obj2;
                String str3 = (String) obj;
                str3.getClass();
                if (((ConfirmCvvViewModel) obj3).cvvLength >= str3.length()) {
                    mutableState2.setValue(str3);
                }
                return Unit.INSTANCE;
            case 27:
                EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection = (EarnerEnrollmentBlockerViewModel.CategorySelection) obj3;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope, "title", null, new ComposableLambdaImpl(new BorrowHomeKt$$ExternalSyntheticLambda0(20, categorySelection, lazyScaffoldContentScope), true, 2063781619), 2);
                ArrayList arrayList2 = categorySelection.categories;
                lazyScaffoldContentScope.$$delegate_0.items(arrayList2.size(), new Latch$await$2$2(i4, new LabelValueView$$ExternalSyntheticLambda0(13), arrayList2), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(6, arrayList2), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(arrayList2, categorySelection, (Function1) obj2, i6), true, 802480018));
                return Unit.INSTANCE;
            case 28:
                MutableState mutableState3 = (MutableState) obj2;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                int i10 = ((SetNameViewModel) obj3).nameInputProperties.maxLength;
                if (i10 > 0) {
                    textFieldValue = TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue, StringsKt___StringsKt.take(i10, textFieldValue.annotatedString.text), 0L, 6);
                }
                mutableState3.setValue(textFieldValue);
                return Unit.INSTANCE;
            default:
                ((DisposableEffectScope) obj).getClass();
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(17, (BlockersScreens.WebViewBlockerScreen) obj3, (WebViewBlockerPresenter) obj2);
        }
    }
}
