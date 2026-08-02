package com.squareup.cash.maps.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaer;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.card.onboarding.CardPillThemesKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.exchange.InvestingExchangeKeypadAmountPickerKt;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$Informational;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.viewmodels.LegalTextViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeListingViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHeaderViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.views.home.collectionCluster.ThreeOfferClusterSize;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.payments.views.composer.SelectRecipientKt;
import com.squareup.cash.payments.views.coreflowsheet.AnimatedCornerShape;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPeekPosition$FixedHeight;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda16;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$Companion$FillType;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewModel;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda4;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.wallet.views.WalletHomeViewKt;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import net.oneformapp.DLog;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(int i, Modifier modifier, String str, String str2, Function0 function0, Function0 function02) {
        this.$r8$classId = 24;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$4 = function0;
        this.f$3 = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object invoke$com$squareup$cash$shopping$presenters$ShoppingWebPresenter$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        MutableSnapshot takeNestedMutableSnapshot;
        ShippingAddress shippingAddress;
        CoroutineScope coroutineScope = (CoroutineScope) this.f$0;
        ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        MutableState mutableState2 = (MutableState) this.f$3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$4;
        AutofillQuestion autofillQuestion = (AutofillQuestion) obj;
        AutofillQuestion.Result result = (AutofillQuestion.Result) obj2;
        autofillQuestion.getClass();
        AutofillQuestion.AutofillType autofillType = autofillQuestion.autofillType;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (Intrinsics.areEqual(result, AutofillQuestion.Result.AutofillConfirmed.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new ShoppingWebPresenter.AnonymousClass1(shoppingWebPresenter, objArr3 == true ? 1 : 0, i3), 3);
            int ordinal = autofillType.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) mutableState.getValue();
                if (retrieveDefaultShippingAddressResponse != null && (shippingAddress = retrieveDefaultShippingAddressResponse.shipping_address) != null) {
                    Phone phone = shippingAddress.phone;
                    String str = phone != null ? phone.number : null;
                    String str2 = shippingAddress.email;
                    FullName fullName = shippingAddress.full_name;
                    String str3 = fullName != null ? fullName.given_name : null;
                    String str4 = fullName != null ? fullName.family_name : null;
                    GlobalAddress globalAddress = shippingAddress.global_address;
                    AutofillWebInfo autofillWebInfo = new AutofillWebInfo(null, null, null, null, null, str2, null, str3, str4, str, globalAddress != null ? globalAddress.address_line_1 : null, globalAddress != null ? globalAddress.address_line_2 : null, globalAddress != null ? globalAddress.postal_code : null, globalAddress != null ? globalAddress.locality : null, globalAddress != null ? globalAddress.administrative_district_level_1 : null, 95);
                    if (autofillType == AutofillQuestion.AutofillType.OFFER_WITH_CARD) {
                        autofillWebInfo = AutofillWebInfo.copy$default(autofillWebInfo, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.fullNumber, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryMonth, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryYear, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.cvv);
                    }
                    shoppingWebPresenter.performAutofill(autofillWebInfo, ShoppingWebPresenter$Companion$FillType.ADDRESS);
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, true, null, 503316479));
                }
            }
        } else if (result instanceof AutofillQuestion.Result.EditAutofillConfirmed) {
            JobKt.launch$default(coroutineScope, null, null, new ShoppingWebPresenter.AnonymousClass1(shoppingWebPresenter, objArr2 == true ? 1 : 0, i2), 3);
            int ordinal2 = autofillType.ordinal();
            if (ordinal2 != 0 && ordinal2 != 1) {
                if (ordinal2 != 2 && ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse2 = (RetrieveDefaultShippingAddressResponse) mutableState.getValue();
                retrieveDefaultShippingAddressResponse2.getClass();
                ShippingAddress shippingAddress2 = ((AutofillQuestion.Result.EditAutofillConfirmed) result).shippingAddress;
                ResponseMetadata responseMetadata = retrieveDefaultShippingAddressResponse2.metadata;
                ResponseContext responseContext = retrieveDefaultShippingAddressResponse2.response_context;
                ByteString unknownFields = retrieveDefaultShippingAddressResponse2.unknownFields();
                unknownFields.getClass();
                RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse3 = new RetrieveDefaultShippingAddressResponse(responseMetadata, shippingAddress2, responseContext, unknownFields);
                ShippingAddress shippingAddress3 = retrieveDefaultShippingAddressResponse3.shipping_address;
                if (shippingAddress3 != null) {
                    Phone phone2 = shippingAddress3.phone;
                    String str5 = phone2 != null ? phone2.number : null;
                    String str6 = shippingAddress3.email;
                    FullName fullName2 = shippingAddress3.full_name;
                    String str7 = fullName2 != null ? fullName2.given_name : null;
                    String str8 = fullName2 != null ? fullName2.family_name : null;
                    GlobalAddress globalAddress2 = shippingAddress3.global_address;
                    AutofillWebInfo autofillWebInfo2 = new AutofillWebInfo(null, null, null, null, null, str6, null, str7, str8, str5, globalAddress2 != null ? globalAddress2.address_line_1 : null, globalAddress2 != null ? globalAddress2.address_line_2 : null, globalAddress2 != null ? globalAddress2.postal_code : null, globalAddress2 != null ? globalAddress2.locality : null, globalAddress2 != null ? globalAddress2.administrative_district_level_1 : null, 95);
                    if (autofillType == AutofillQuestion.AutofillType.OFFER_WITH_CARD) {
                        autofillWebInfo2 = AutofillWebInfo.copy$default(autofillWebInfo2, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.fullNumber, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryMonth, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryYear, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.cvv);
                    }
                    shoppingWebPresenter.performAutofill(autofillWebInfo2, ShoppingWebPresenter$Companion$FillType.ADDRESS);
                    Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                    MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
                    if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(null, null)) == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
                        return null;
                    }
                    try {
                        Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                        try {
                            mutableState.setValue(retrieveDefaultShippingAddressResponse3);
                            mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, true, null, 503316479));
                            takeNestedMutableSnapshot.apply().check();
                        } finally {
                            Snapshot.restoreCurrent(makeCurrent);
                        }
                    } finally {
                    }
                }
            }
        } else if (Intrinsics.areEqual(result, AutofillQuestion.Result.EditAutofillDismissed.INSTANCE)) {
            NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
        } else if (Intrinsics.areEqual(result, AutofillQuestion.Result.AutofillDismissed.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new ShoppingWebPresenter.AnonymousClass1(shoppingWebPresenter, objArr == true ? 1 : 0, i), 3);
        } else if (result != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273  */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invoke$com$squareup$cash$taptopay$views$TapToPayInitiatorNotesKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        TextFieldState textFieldState;
        FocusRequester focusRequester;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        ?? r12;
        GapComposer gapComposer;
        boolean changed;
        Object rememberedValue;
        FocusRequester focusRequester2 = (FocusRequester) this.f$0;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        TapToPayInitiatorNotesViewModel tapToPayInitiatorNotesViewModel = (TapToPayInitiatorNotesViewModel) this.f$3;
        TextFieldState textFieldState2 = (TextFieldState) this.f$4;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer2 = (GapComposer) composer;
        boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer2.applier;
        if (shouldExecute) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion2), 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            ComposableLambdaImpl composableLambdaImpl = TapToPayKt.f724lambda$1552185730;
            NavigationType navigationType = NavigationType.BACK;
            boolean changed2 = gapComposer2.changed(focusRequester2) | gapComposer2.changed(delegatingSoftwareKeyboardController) | gapComposer2.changed(function1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                textFieldState = textFieldState2;
                rememberedValue2 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2(function1, focusRequester2, delegatingSoftwareKeyboardController, 0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                textFieldState = textFieldState2;
            }
            DBUtil.TitleBarSub(composableLambdaImpl, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            Strings.getSizes(gapComposer2).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Countries.PageHeader(Room.stringResource(gapComposer2, R.string.tap_to_pay_initiator_notes_header), (Modifier) null, (Function2) null, Room.stringResource(gapComposer2, R.string.tap_to_pay_initiator_notes_description), gapComposer2, 0, 6);
            Strings.getSizes(gapComposer2).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            boolean z = tapToPayInitiatorNotesViewModel.isDemoMode;
            List list = tapToPayInitiatorNotesViewModel.suggestions;
            if (z) {
                focusRequester = focusRequester2;
                companion = companion2;
            } else {
                focusRequester = focusRequester2;
                companion = FocusTraversalKt.focusRequester(companion2, focusRequester);
            }
            String stringResource = Room.stringResource(gapComposer2, R.string.tap_to_pay_initiator_notes_hint);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 1, 7, (Boolean) null, 115);
            boolean changed3 = gapComposer2.changed(focusRequester) | gapComposer2.changed(delegatingSoftwareKeyboardController) | gapComposer2.changed(function1);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                if (rememberedValue3 != neverEqualPolicy) {
                    r12 = 0;
                    TextFieldState textFieldState3 = textFieldState;
                    boolean z2 = r12;
                    FocusRequester focusRequester3 = focusRequester;
                    InputFieldKt.InputField(textFieldState3, companion, false, false, false, null, null, null, null, stringResource, keyboardOptions, (KeyboardActionHandler) rememberedValue3, null, null, null, null, gapComposer2, 0, 0, 61948);
                    gapComposer = gapComposer2;
                    if (list.isEmpty()) {
                        gapComposer.startReplaceGroup(-988605249);
                        DBUtil.SpacerWithinSectionMedium(z2 ? 1 : 0, 1, gapComposer, null);
                        boolean changed4 = gapComposer.changed(textFieldState3);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda4(z2 ? 1 : 0, textFieldState3);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        TapToPayButtonKt.DescriptionSuggestions(z2 ? 1 : 0, gapComposer, null, list, (Function1) rememberedValue4);
                        gapComposer.end(z2);
                    } else {
                        gapComposer.startReplaceGroup(-988367882);
                        gapComposer.end(z2);
                    }
                    SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
                    if (tapToPayInitiatorNotesViewModel.isDemoMode) {
                        gapComposer.startReplaceGroup(-987873866);
                        gapComposer.end(z2);
                    } else {
                        gapComposer.startReplaceGroup(-988271720);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.tap_to_pay_initiator_notes_demo_mode_disclaimer), (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        TextFieldStateKt.setTextAndPlaceCursorAtEnd(textFieldState3, Room.stringResource(gapComposer, R.string.tap_to_pay_initiator_notes_demo_mode_prefill));
                        gapComposer.end(z2);
                    }
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier imePadding = SpacerKt.imePadding(SizeKt.fillMaxWidth(companion2, 1.0f));
                    boolean z3 = tapToPayInitiatorNotesViewModel.canGoToNext;
                    changed = gapComposer.changed(focusRequester3) | gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2(function1, focusRequester3, delegatingSoftwareKeyboardController, 3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    GapComposer gapComposer3 = gapComposer;
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, imePadding, buttonProminence, false, z3, null, TapToPayKt.f718lambda$104665017, gapComposer3, 1573248, 40);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer3, true, true, true);
                }
            }
            r12 = 0;
            rememberedValue3 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3(function1, focusRequester, delegatingSoftwareKeyboardController, r12);
            gapComposer2.updateRememberedValue(rememberedValue3);
            TextFieldState textFieldState32 = textFieldState;
            boolean z22 = r12;
            FocusRequester focusRequester32 = focusRequester;
            InputFieldKt.InputField(textFieldState32, companion, false, false, false, null, null, null, null, stringResource, keyboardOptions, (KeyboardActionHandler) rememberedValue3, null, null, null, null, gapComposer2, 0, 0, 61948);
            gapComposer = gapComposer2;
            if (list.isEmpty()) {
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            if (tapToPayInitiatorNotesViewModel.isDemoMode) {
            }
            ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
            Modifier imePadding2 = SpacerKt.imePadding(SizeKt.fillMaxWidth(companion2, 1.0f));
            boolean z32 = tapToPayInitiatorNotesViewModel.canGoToNext;
            changed = gapComposer.changed(focusRequester32) | gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda2(function1, focusRequester32, delegatingSoftwareKeyboardController, 3);
            gapComposer.updateRememberedValue(rememberedValue);
            GapComposer gapComposer32 = gapComposer;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, imePadding2, buttonProminence2, false, z32, null, TapToPayKt.f718lambda$104665017, gapComposer32, 1573248, 40);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer32, true, true, true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$wallet$views$RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$touchInput$1$1$1$1$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f$0;
        PointerInputScope pointerInputScope = (PointerInputScope) this.f$1;
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        WithdrawViewKt$WithdrawAmountView$1$1.access$invokeSuspend$handleTouch(pointerInputScope, (MutableState) this.f$3, (MutableState) this.f$4, Float.intBitsToFloat((int) (pointerInputChange.position >> 32)), Float.intBitsToFloat((int) (pointerInputChange.position & BodyPartID.bodyIdMax)));
        JobKt.launch$default(coroutineScope, null, null, new CardAppletWorker$setup$1$2$1((MutableSharedFlow) this.f$2, (Offset) obj2, pointerInputScope, null, 20), 3);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 18;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 2;
        r11 = 0;
        int roundToInt = 0;
        int i4 = 7;
        int i5 = 1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CashMapViewKt.MarkerLocationSelectorSheetContent((Modifier) obj7, (List) obj6, (Function1) obj3, (Function1) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(24577));
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj7;
                String str2 = (String) obj6;
                Function1 function12 = (Function1) obj3;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(-1703809620, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str, 26), gapComposer), Expect_jvmKt.rememberComposableLambda(1917090891, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 27), gapComposer), Expect_jvmKt.rememberComposableLambda(171823863, new TabContentViewKt$$ExternalSyntheticLambda11(function12, str3, 19), gapComposer), Expect_jvmKt.rememberComposableLambda(-502242922, new TabContentViewKt$$ExternalSyntheticLambda11(str4, function12, 20), gapComposer), (Function3) null, gapComposer, 28080, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                InstrumentAvatarUtilsKt.InstrumentSelection((InstrumentSelectionViewModel) obj6, (Function1) obj3, (Function0) obj4, (Function0) obj5, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                InvestingCustomOrderContentModel investingCustomOrderContentModel = (InvestingCustomOrderContentModel) obj7;
                Function1 function13 = (Function1) obj3;
                MutableState mutableState = (MutableState) obj6;
                State state = (State) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    InvestingCustomOrderContentModel.Content content = (InvestingCustomOrderContentModel.Content) investingCustomOrderContentModel;
                    String str5 = content.title;
                    boolean changed = gapComposer2.changed(function13);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(9, function13);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed2 = gapComposer2.changed(function13);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new InvestingNewsKt$$ExternalSyntheticLambda0(10, function13);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    CustomOrderKt.CustomOrderToolbar(str5, function0, (Function0) rememberedValue2, gapComposer2, 0);
                    InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel = content.headerViewModel;
                    boolean changed3 = gapComposer2.changed(function13) | gapComposer2.changed(mutableState);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CashtagViewKt$$ExternalSyntheticLambda13(function13, mutableState, 11);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    CustomOrderKt.CustomOrderHeader(investingStockDetailsHeaderViewModel, (Function0) rememberedValue3, null, gapComposer2, 0);
                    CustomOrderGraphKt.CustomOrderGraph((GraphState) mutableState.getValue(), content.graphContentModel, ((Number) state.getValue()).floatValue(), content.upperLimit, content.lowerLimit, new LayoutWeightElement(1.0f, true), gapComposer2, 0, 0);
                    HistoricalRange historicalRange = content.selectedRange;
                    boolean changed4 = gapComposer2.changed(function13);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(i4, function13);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    CustomOrderKt.CustomOrderTimeRange(historicalRange, (Function1) rememberedValue4, gapComposer2, 0);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                    boolean z = content.tooltip instanceof CustomOrderTooltipViewModel$Informational;
                    boolean changed5 = gapComposer2.changed(function13);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new InvestingNewsKt$$ExternalSyntheticLambda0(11, function13);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    CustomOrderKt.DimmableBackground(3072, gapComposer2, Expect_jvmKt.rememberComposableLambda(1785207692, new SwipeToDismissKt$$ExternalSyntheticLambda2(investingCustomOrderContentModel, function13, mutableState, mutableState2, state, 9), gapComposer2), null, (Function0) rememberedValue5, z);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                InvestingExchangeKeypadAmountPickerKt.InvestingExchangeKeypadAmountPicker((InvestingExchangeViewModel.Content.FullScreenContent) obj6, (AmountDisplayState) obj5, (Shaker) obj4, (Function1) obj3, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(24577));
                return Unit.INSTANCE;
            case 5:
                FocusRequester focusRequester = (FocusRequester) obj7;
                Function1 function14 = (Function1) obj3;
                String str6 = (String) obj6;
                Function1 function15 = (Function1) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer3, R.string.investing_components_search_search_hint);
                    Modifier focusRequester2 = FocusTraversalKt.focusRequester(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 24.0f, 8.0f, 1), focusRequester);
                    boolean changed6 = gapComposer3.changed(function14);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(16, function14);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    Modifier onFocusChanged = FocusOwnerImplKt.onFocusChanged(focusRequester2, (Function1) rememberedValue6);
                    boolean changed7 = gapComposer3.changed(function15);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(8, function15);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    KeypadKt.m3644MooncakeSearchTextFieldj30j4ZQ(str6, function15, onFocusChanged, function16, (Function0) rememberedValue7, null, 0L, false, stringResource, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                DLog.EntityComponent((InvestmentEntityContentModel) obj7, (Function1) obj3, (InvestmentEntityContentModel.Component) obj6, (RealImageLoader) obj5, (InvestingScreens) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Context context = (Context) obj7;
                Function1 function17 = (Function1) obj3;
                LanguageDisclosureViewModel.Content.Copy copy = (LanguageDisclosureViewModel.Content.Copy) obj6;
                LanguageDisclosureViewModel.Content content2 = (LanguageDisclosureViewModel.Content) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
                    context.getClass();
                    Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(context), Expect_jvmKt.rememberComposableLambda(1763778419, new MoneyUiFactory$$ExternalSyntheticLambda1(function17, copy, content2, mutableState3), gapComposer4), gapComposer4, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                CardUpsellKt.SmallUpsellCardContent((ComposableLambdaImpl) obj6, (ComposableLambdaImpl) obj3, (CardUpsellIllustration) obj5, (Modifier) obj7, (Function2) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                CardUpsellKt.CardUpsellLarge((ComposableLambdaImpl) obj6, (ComposableLambdaImpl) obj3, (Function0) obj4, (Modifier) obj7, (Function2) obj5, (Composer) obj, Updater.updateChangedFlags(55));
                return Unit.INSTANCE;
            case 10:
                Function1 function18 = (Function1) obj3;
                SquareLoyaltyDetailsView squareLoyaltyDetailsView = (SquareLoyaltyDetailsView) obj7;
                SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel = (SquareLoyaltyDetailsViewModel) obj6;
                ScrollState scrollState = (ScrollState) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors2 = (Colors) gapComposer5.consume(staticProvidableCompositionLocal2);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier imePadding = SpacerKt.imePadding(SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1))));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, imePadding);
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
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType = NavigationType.BACK;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1836290952, new HeroTagViewKt$$ExternalSyntheticLambda12(18, mutableState4), gapComposer5);
                    boolean changed8 = gapComposer5.changed(function18);
                    Object rememberedValue8 = gapComposer5.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new CashMapViewKt$$ExternalSyntheticLambda4(19, function18);
                        gapComposer5.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, MerchantProfileViewKt.lambda$147008659, gapComposer5, 1572918, 44);
                    GenericTreeElementsViewModel genericTreeElementsViewModel = squareLoyaltyDetailsViewModel.genericTreeElements;
                    RealImageLoader realImageLoader = (RealImageLoader) squareLoyaltyDetailsView.imageLoader;
                    Colors colors3 = (Colors) gapComposer5.consume(staticProvidableCompositionLocal2);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    squareLoyaltyDetailsView.m3603GenericTreeElementsSectionV9fs2A(null, genericTreeElementsViewModel, realImageLoader, scrollState, function18, colors3.semantic.background.f1047app, gapComposer5, 0);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Icons icons = (Icons) obj6;
                String str7 = (String) obj3;
                Function0 function02 = (Function0) obj4;
                Modifier modifier = (Modifier) obj7;
                Alignment alignment = (Alignment) obj5;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    StorageUtil.ButtonIcon(icons, str7, function02, modifier, false, alignment, gapComposer6, 0, 16);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                OffersHeroTileKt.HeroOffersTile((Modifier) obj7, (OffersHomeListItemViewModel.HeroOffersTileViewModel) obj6, (Function4) obj5, (PaddingValues) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                OffersHomeListingViewModel offersHomeListingViewModel = (OffersHomeListingViewModel) obj7;
                ScrollState scrollState2 = (ScrollState) obj6;
                Function1 function19 = (Function1) obj3;
                ThreeOfferClusterSize threeOfferClusterSize = (ThreeOfferClusterSize) obj4;
                Function1 function110 = (Function1) obj5;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                GapComposer gapComposer7 = (GapComposer) composer7;
                boolean shouldExecute2 = gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2);
                Applier applier2 = gapComposer7.applier;
                if (!shouldExecute2) {
                    gapComposer7.skipToGroupEnd();
                } else if (offersHomeListingViewModel instanceof OffersHomeListingViewModel.Loaded) {
                    gapComposer7.startReplaceGroup(-2002100194);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, scrollState2, false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer7, 0);
                    int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, verticalScroll$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    OffersHomeListingViewModel.Loaded loaded = (OffersHomeListingViewModel.Loaded) offersHomeListingViewModel;
                    AbstractPersistentList abstractPersistentList = loaded.items;
                    if (CollectionsKt.firstOrNull((List) abstractPersistentList) instanceof OffersHomeListItemViewModel.CategoryPillsSectionViewModel) {
                        gapComposer7.startReplaceGroup(-1787562112);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-1787613045);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                        gapComposer7.end(false);
                    }
                    gapComposer7.startReplaceGroup(-57659994);
                    ListIterator listIterator = abstractPersistentList.listIterator(0);
                    while (listIterator.hasNext()) {
                        OffersHomeListItemViewModel offersHomeListItemViewModel = (OffersHomeListItemViewModel) listIterator.next();
                        if (offersHomeListItemViewModel instanceof OffersHomeListItemViewModel.CategoryPillsSectionViewModel) {
                            gapComposer7.startReplaceGroup(-1195323084);
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer7, null);
                            boolean changedInstance = gapComposer7.changedInstance(offersHomeListItemViewModel);
                            Object rememberedValue9 = gapComposer7.rememberedValue();
                            if (changedInstance || rememberedValue9 == neverEqualPolicy) {
                                rememberedValue9 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i5, function110, (OffersHomeListItemViewModel.CategoryPillsSectionViewModel) offersHomeListItemViewModel);
                                gapComposer7.updateRememberedValue(rememberedValue9);
                            }
                            Modifier onVisible$default = VisibleKt.onVisible$default(companion, (Function0) rememberedValue9);
                            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                            boolean changedInstance2 = gapComposer7.changedInstance(offersHomeListItemViewModel) | gapComposer7.changed(function19);
                            Object rememberedValue10 = gapComposer7.rememberedValue();
                            if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
                                rememberedValue10 = new MusicViewKt$$ExternalSyntheticLambda6(21, (OffersHomeListItemViewModel.CategoryPillsSectionViewModel) offersHomeListItemViewModel, function19);
                                gapComposer7.updateRememberedValue(rememberedValue10);
                            }
                            FilterBarKt.FilterBar(onVisible$default, null, m295PaddingValuesYgX7TsA$default, (Function1) rememberedValue10, gapComposer7, 0, 2);
                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                            gapComposer7.end(false);
                            function1 = function19;
                        } else if (offersHomeListItemViewModel instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel) {
                            gapComposer7.startReplaceGroup(-1194307803);
                            boolean changedInstance3 = gapComposer7.changedInstance(offersHomeListItemViewModel);
                            Object rememberedValue11 = gapComposer7.rememberedValue();
                            if (changedInstance3 || rememberedValue11 == neverEqualPolicy) {
                                rememberedValue11 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i3, function110, (OffersHomeListItemViewModel.HeroOffersTileViewModel) offersHomeListItemViewModel);
                                gapComposer7.updateRememberedValue(rememberedValue11);
                            }
                            Function1 function111 = function19;
                            OffersHeroTileKt.HeroOffersTile(SpacerKt.m300paddingVpY3zN4$default(VisibleKt.onVisible$default(companion, (Function0) rememberedValue11), 16.0f, RecyclerView.DECELERATION_RATE, 2), (OffersHomeListItemViewModel.HeroOffersTileViewModel) offersHomeListItemViewModel, null, null, function111, gapComposer7, 0);
                            function1 = function111;
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                            gapComposer7.end(false);
                        } else {
                            function1 = function19;
                            if (offersHomeListItemViewModel instanceof OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) {
                                gapComposer7.startReplaceGroup(-1193922194);
                                OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel cLOClusterSectionViewModel = (OffersHomeListItemViewModel.ClusterSection.CLOClusterSectionViewModel) offersHomeListItemViewModel;
                                boolean changedInstance4 = gapComposer7.changedInstance(offersHomeListItemViewModel);
                                Object rememberedValue12 = gapComposer7.rememberedValue();
                                if (changedInstance4 || rememberedValue12 == neverEqualPolicy) {
                                    rememberedValue12 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(3, function110, cLOClusterSectionViewModel);
                                    gapComposer7.updateRememberedValue(rememberedValue12);
                                }
                                zzaer.ThreeOffersCluster(cLOClusterSectionViewModel, VisibleKt.onVisible$default(companion, (Function0) rememberedValue12), function1, threeOfferClusterSize, gapComposer7, 0);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                                gapComposer7.end(false);
                            } else {
                                ThreeOfferClusterSize threeOfferClusterSize2 = threeOfferClusterSize;
                                if (offersHomeListItemViewModel instanceof OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) {
                                    gapComposer7.startReplaceGroup(-1193578962);
                                    OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel clusterSectionViewModel = (OffersHomeListItemViewModel.ClusterSection.ClusterSectionViewModel) offersHomeListItemViewModel;
                                    boolean changedInstance5 = gapComposer7.changedInstance(offersHomeListItemViewModel);
                                    Object rememberedValue13 = gapComposer7.rememberedValue();
                                    if (changedInstance5 || rememberedValue13 == neverEqualPolicy) {
                                        rememberedValue13 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(4, function110, clusterSectionViewModel);
                                        gapComposer7.updateRememberedValue(rememberedValue13);
                                    }
                                    zzaer.ThreeOffersCluster(clusterSectionViewModel, VisibleKt.onVisible$default(companion, (Function0) rememberedValue13), function1, threeOfferClusterSize2, gapComposer7, 0);
                                    threeOfferClusterSize = threeOfferClusterSize2;
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                                    gapComposer7.end(false);
                                } else {
                                    threeOfferClusterSize = threeOfferClusterSize2;
                                    if (offersHomeListItemViewModel instanceof OffersHeaderViewModel) {
                                        gapComposer7.startReplaceGroup(-1193243077);
                                        String str8 = ((OffersHeaderViewModel) offersHomeListItemViewModel).title.text;
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        ViewfinderDefaults.SectionHeader(str8, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer7, 0, 30);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                                        gapComposer7.end(false);
                                    } else {
                                        if (!(offersHomeListItemViewModel instanceof OffersHomeListItemViewModel.CategoryTilesSectionViewModel)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, -869843231, false);
                                        }
                                        gapComposer7.startReplaceGroup(-1193061169);
                                        OffersHomeListItemViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel = (OffersHomeListItemViewModel.CategoryTilesSectionViewModel) offersHomeListItemViewModel;
                                        boolean changedInstance6 = gapComposer7.changedInstance(offersHomeListItemViewModel);
                                        Object rememberedValue14 = gapComposer7.rememberedValue();
                                        if (changedInstance6 || rememberedValue14 == neverEqualPolicy) {
                                            rememberedValue14 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(5, function110, categoryTilesSectionViewModel);
                                            gapComposer7.updateRememberedValue(rememberedValue14);
                                        }
                                        ShaderKt.OffersCategoriesSection(VisibleKt.onVisible$default(companion, (Function0) rememberedValue14), categoryTilesSectionViewModel, null, function1, gapComposer7, 0);
                                        function1 = function1;
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                                        gapComposer7.end(false);
                                    }
                                }
                                function19 = function1;
                            }
                        }
                        function19 = function1;
                    }
                    Function1 function112 = function19;
                    gapComposer7.end(false);
                    LegalTextViewModel legalTextViewModel = loaded.legalText;
                    if (legalTextViewModel == null) {
                        gapComposer7.startReplaceGroup(-1784829866);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-1784829865);
                        OfferTileKt.OffersLegalText(null, legalTextViewModel, SpacerKt.m297PaddingValuesa9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(gapComposer7, R.dimen.offers_legal_text_horizontal_padding), PrimitiveResources_androidKt.dimensionResource(gapComposer7, R.dimen.offers_legal_text_top_padding), PrimitiveResources_androidKt.dimensionResource(gapComposer7, R.dimen.offers_legal_text_horizontal_padding), RecyclerView.DECELERATION_RATE, 8), function112, gapComposer7, 0);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(true);
                    gapComposer7.end(false);
                } else if (offersHomeListingViewModel instanceof OffersHomeListingViewModel.Error) {
                    gapComposer7.startReplaceGroup(-1998733253);
                    Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer7), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer7, 0);
                    int hashCode5 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer7, verticalScroll$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 48.0f, 56.0f, 48.0f, RecyclerView.DECELERATION_RATE, 8);
                    OffersMessageViewModel offersMessageViewModel = ((OffersHomeListingViewModel.Error) offersHomeListingViewModel).errorModel;
                    boolean changed9 = gapComposer7.changed(function19);
                    Object rememberedValue15 = gapComposer7.rememberedValue();
                    if (changed9 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new MusicViewKt$$ExternalSyntheticLambda0(28, function19);
                        gapComposer7.updateRememberedValue(rememberedValue15);
                    }
                    UtilsKt.OffersMessageView(offersMessageViewModel, (Function0) rememberedValue15, m302paddingqDBjuR0$default, gapComposer7, 0, 0);
                    gapComposer7.end(true);
                    gapComposer7.end(false);
                } else {
                    if (!Intrinsics.areEqual(offersHomeListingViewModel, OffersHomeListingViewModel.Loading.INSTANCE) && !Intrinsics.areEqual(offersHomeListingViewModel, OffersHomeListingViewModel.Initial.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 1320888990, false);
                    }
                    gapComposer7.startReplaceGroup(-1998367515);
                    Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxSize(companion, 1.0f), "OffersTabLoadingProgress");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode6 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer7, testTag);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer7, null);
                    gapComposer7.end(true);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                MainPaymentPadViewKt.PoolRequestPayButtons((String) obj6, (String) obj3, (String) obj5, (Function2) obj4, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                SelectRecipientKt.SearchTextField((TextFieldState) obj6, (FocusRequester) obj5, (Function1) obj3, (Function0) obj4, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                AnimatedCornerShape animatedCornerShape = (AnimatedCornerShape) obj4;
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                subcomposeMeasureScope.getClass();
                Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose("handle", new ComposableLambdaImpl(new OverlaysKt$$ExternalSyntheticLambda1((ComposableLambdaImpl) obj3, 29), true, -1603283067)))).mo833measureBRTryo0(constraints.value);
                int top = ((WindowInsets) obj7).getTop(subcomposeMeasureScope);
                long j = constraints.value;
                int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                CoreFlowRealSheetState coreFlowRealSheetState = ((CoreFlowBasicShieetScope) obj6).state;
                Integer num = (Integer) coreFlowRealSheetState.contentHeightPx$delegate.getValue();
                if (num == null ? ((CoreFlowSheetPeekPosition$FixedHeight) coreFlowRealSheetState.peekPosition$delegate.getValue()) != null : num.intValue() >= m1024getMaxHeightimpl - top) {
                    roundToInt = MathKt__MathJVMKt.roundToInt(((Number) coreFlowRealSheetState.expandProgress$delegate.getValue()).floatValue() * top);
                }
                int i6 = mo833measureBRTryo0.height;
                if (i6 >= roundToInt) {
                    roundToInt = i6;
                }
                Placeable mo833measureBRTryo02 = ((Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose("content", new ComposableLambdaImpl(new BasicShieetScope$$ExternalSyntheticLambda16(composableLambdaImpl, SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, subcomposeMeasureScope.mo233toDpu2uoSUM(roundToInt), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), i5), true, -1307122218)))).mo833measureBRTryo0(j);
                long m1025getMaxWidthimpl = (Constraints.m1025getMaxWidthimpl(j) << 32) | ((Constraints.m1022getHasFixedHeightimpl(j) ? Constraints.m1024getMaxHeightimpl(j) : Math.max(mo833measureBRTryo02.height, mo833measureBRTryo0.height)) & BodyPartID.bodyIdMax);
                if (!subcomposeMeasureScope.isLookingAhead()) {
                    if (!Constraints.m1020getHasBoundedHeightimpl(j)) {
                        a$$ExternalSyntheticBUOutline0.m$1("SheetContainer() can't have an infinite max height");
                        return null;
                    }
                    int i7 = mo833measureBRTryo02.height;
                    if (i7 > m1024getMaxHeightimpl) {
                        i7 = m1024getMaxHeightimpl;
                    }
                    coreFlowRealSheetState.contentHeightPx$delegate.setValue(Integer.valueOf(i7));
                    coreFlowRealSheetState.viewportHeightPx$delegate.setValue(Integer.valueOf(m1024getMaxHeightimpl));
                }
                return MeasureScope.layout$default(subcomposeMeasureScope, (int) (m1025getMaxWidthimpl >> 32), (int) (m1025getMaxWidthimpl & BodyPartID.bodyIdMax), new BankingConfigQueries$$ExternalSyntheticLambda0(mo833measureBRTryo02, mo833measureBRTryo0, animatedCornerShape, subcomposeMeasureScope, 29));
            case 17:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolListSections((Modifier) obj7, (Function1) obj3, (List) obj6, (PoolCategory) obj5, (PoolListNuxAssets) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                LocaleToggleKt.PrepurchaseCashCardFaqView((PrepurchaseCardFAQViewModel) obj6, (Function1) obj3, (Modifier) obj7, (RealImageLoader) obj5, (ScrollState) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                SavingsScreenHeaderKt.GoalHeader((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) obj6, (Modifier) obj7, (Shaker) obj4, (Function1) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj6;
                Modifier modifier2 = (Modifier) obj7;
                ScreenScaffoldContentScope screenScaffoldContentScope = (ScreenScaffoldContentScope) obj5;
                Shaker shaker = (Shaker) obj4;
                Function1 function113 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) savingsScreenElement;
                    if (savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader.balance.sectionTitleText != null) {
                        gapComposer8.startReplaceGroup(1657847379);
                        modifier2 = ScreenScaffoldKt.markAsScaffoldTitle(modifier2, screenScaffoldContentScope, gapComposer8, 0);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1657849203);
                        gapComposer8.end(false);
                    }
                    SavingsScreenHeaderKt.NoGoalHeader(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader, modifier2, shaker, function113, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                return invoke$com$squareup$cash$shopping$presenters$ShoppingWebPresenter$$ExternalSyntheticLambda2(obj, obj2);
            case 22:
                Function0 function03 = (Function0) obj4;
                RealSheetState realSheetState = (RealSheetState) obj7;
                ChatExitPromptSheetViewModel chatExitPromptSheetViewModel = (ChatExitPromptSheetViewModel) obj6;
                Function1 function114 = (Function1) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int i8 = ChatExitPromptSheetView.$r8$clinit;
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    SheetKt.Sheet(function03, null, realSheetState, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-134050020, new SheetKt$$ExternalSyntheticLambda5(i2, chatExitPromptSheetViewModel, function114, parcelableSnapshotMutableIntState), gapComposer9), gapComposer9, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$taptopay$views$TapToPayInitiatorNotesKt$$ExternalSyntheticLambda0(obj, obj2);
            case 24:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.InstrumentDetailsActions(Updater.updateChangedFlags(1), (Composer) obj, (Modifier) obj7, (String) obj6, (String) obj3, (Function0) obj4, (Function0) obj5);
                return Unit.INSTANCE;
            case 25:
                State state2 = (State) obj7;
                State state3 = (State) obj6;
                HazeState hazeState = (HazeState) obj3;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj5;
                CardAppletTileViewModel.CardPillViewModel cardPillViewModel = (CardAppletTileViewModel.CardPillViewModel) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, 0.90670556f), 0.8657408f), Alignment.Companion.TopStart, 2);
                    boolean changed10 = gapComposer10.changed(state2) | gapComposer10.changed(state3);
                    Object rememberedValue16 = gapComposer10.rememberedValue();
                    if (changed10 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new CheckboxKt$$ExternalSyntheticLambda6(state2, state3, 4);
                        gapComposer10.updateRememberedValue(rememberedValue16);
                    }
                    CardAppletTileKt.PillUi(ColorKt.graphicsLayer(wrapContentSize$default, (Function1) rememberedValue16), hazeState, CardPillThemesKt.toCardPillTheme(heroCardDetails.cardTheme.id), cardPillViewModel, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                com.squareup.cash.wallet.views.UtilsKt.CardLockHalfSheet((String) obj6, (String) obj3, (ArrayList) obj5, (Function2) obj4, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                return invoke$com$squareup$cash$wallet$views$RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$touchInput$1$1$1$1$$ExternalSyntheticLambda2(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                com.squareup.cash.wallet.views.UtilsKt.WalletScheme((Modifier) obj7, (List) obj6, (Function1) obj3, (RealImageLoader) obj5, (Function2) obj4, (Composer) obj, Updater.updateChangedFlags(24577));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                WalletHomeViewKt.WalletHome((RealImageLoader) obj7, (RealImageLoader) obj6, (ElementBoundsRegistry) obj5, (WalletHomeViewModel$WalletScheme) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(int i, Object obj, Object obj2, Object obj3, Object obj4, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(TextFieldState textFieldState, FocusRequester focusRequester, Function1 function1, Function0 function0, Modifier modifier, int i) {
        this.$r8$classId = 15;
        this.f$1 = textFieldState;
        this.f$3 = focusRequester;
        this.f$2 = function1;
        this.f$4 = function0;
        this.f$0 = modifier;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, CardUpsellIllustration cardUpsellIllustration, Modifier modifier, Function2 function2, int i) {
        this.$r8$classId = 8;
        this.f$1 = composableLambdaImpl;
        this.f$2 = composableLambdaImpl2;
        this.f$3 = cardUpsellIllustration;
        this.f$0 = modifier;
        this.f$4 = function2;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function0 function0, Modifier modifier, Function2 function2, int i) {
        this.$r8$classId = 9;
        this.f$1 = composableLambdaImpl;
        this.f$2 = composableLambdaImpl2;
        this.f$4 = function0;
        this.f$0 = modifier;
        this.f$3 = function2;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Modifier modifier, List list, Function1 function1, Object obj, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$3 = obj;
        this.f$4 = function;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Icons icons, String str, Function0 function0, Modifier modifier, Alignment alignment) {
        this.$r8$classId = 11;
        this.f$1 = icons;
        this.f$2 = str;
        this.f$4 = function0;
        this.f$0 = modifier;
        this.f$3 = alignment;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(InstrumentSelectionViewModel instrumentSelectionViewModel, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i) {
        this.$r8$classId = 2;
        this.f$1 = instrumentSelectionViewModel;
        this.f$2 = function1;
        this.f$4 = function0;
        this.f$3 = function02;
        this.f$0 = modifier;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(InvestingExchangeViewModel.Content.FullScreenContent fullScreenContent, AmountDisplayState amountDisplayState, Shaker shaker, Function1 function1, Modifier modifier, int i) {
        this.$r8$classId = 4;
        this.f$1 = fullScreenContent;
        this.f$3 = amountDisplayState;
        this.f$4 = shaker;
        this.f$2 = function1;
        this.f$0 = modifier;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(OffersHomeListingViewModel offersHomeListingViewModel, ScrollState scrollState, Function1 function1, ThreeOfferClusterSize threeOfferClusterSize, Function1 function12) {
        this.$r8$classId = 13;
        this.f$0 = offersHomeListingViewModel;
        this.f$1 = scrollState;
        this.f$2 = function1;
        this.f$4 = threeOfferClusterSize;
        this.f$3 = function12;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel, Function1 function1, Modifier modifier, RealImageLoader realImageLoader, ScrollState scrollState, int i) {
        this.$r8$classId = 18;
        this.f$1 = prepurchaseCardFAQViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = realImageLoader;
        this.f$4 = scrollState;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader, Modifier modifier, Shaker shaker, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = 19;
        this.f$1 = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
        this.f$0 = modifier;
        this.f$4 = shaker;
        this.f$2 = function1;
        this.f$3 = function12;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement, Modifier modifier, ScrollingScaffoldContentScope scrollingScaffoldContentScope, Shaker shaker, Function1 function1) {
        this.$r8$classId = 20;
        this.f$1 = savingsScreenElement;
        this.f$0 = modifier;
        this.f$3 = scrollingScaffoldContentScope;
        this.f$4 = shaker;
        this.f$2 = function1;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$2 = function1;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Object obj, Function1 function1, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(String str, String str2, Serializable serializable, Function2 function2, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = serializable;
        this.f$4 = function2;
        this.f$0 = modifier;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Function0 function0, RealSheetState realSheetState, ChatExitPromptSheetViewModel chatExitPromptSheetViewModel, Function1 function1, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 22;
        this.f$4 = function0;
        this.f$0 = realSheetState;
        this.f$1 = chatExitPromptSheetViewModel;
        this.f$2 = function1;
        this.f$3 = parcelableSnapshotMutableIntState;
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda15(Function1 function1, SquareLoyaltyDetailsView squareLoyaltyDetailsView, SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel, ScrollState scrollState, MutableState mutableState) {
        this.$r8$classId = 10;
        this.f$2 = function1;
        this.f$0 = squareLoyaltyDetailsView;
        this.f$1 = squareLoyaltyDetailsViewModel;
        this.f$3 = scrollState;
        this.f$4 = mutableState;
    }
}
