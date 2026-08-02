package com.squareup.cash.maps.engine.googlemaps;

import android.graphics.Point;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.brand.checkout.CheckoutTipStateKt$rememberCheckoutTipState$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbu;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.squareup.cash.amountslider.presenters.AmountSelectorPresenter;
import com.squareup.cash.amountslider.presenters.RealAmountSelectorPresenter;
import com.squareup.cash.amountslider.presenters.TradeType;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.cash.CashDepositEnterAmount;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.instruments.backend.api.InstrumentManagerKt;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.maps.views.CashClusterItem;
import com.squareup.cash.maps.views.SelectedLocationCameraReframe;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GoogleMapEngine$Map$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $cameraState;
    public final /* synthetic */ Object $density;
    public Object $googleMap$delegate;
    public final /* synthetic */ Object $isMapLoading$delegate;
    public final /* synthetic */ boolean $isMapVisible;
    public final /* synthetic */ Object $mapSize$delegate;
    public final /* synthetic */ int $r8$classId = 2;
    public Object $selectedItem;
    public Object $selectedLocationCameraReframe;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMapEngine$Map$3$1(CashClusterItem cashClusterItem, SelectedLocationCameraReframe selectedLocationCameraReframe, boolean z, Density density, CameraPositionState cameraPositionState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$selectedItem = cashClusterItem;
        this.$selectedLocationCameraReframe = selectedLocationCameraReframe;
        this.$isMapVisible = z;
        this.$density = density;
        this.$cameraState = cameraPositionState;
        this.$googleMap$delegate = mutableState;
        this.$isMapLoading$delegate = mutableState2;
        this.$mapSize$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$isMapLoading$delegate;
        Object obj3 = this.$mapSize$delegate;
        Object obj4 = this.$cameraState;
        Object obj5 = this.$density;
        switch (i) {
            case 0:
                return new GoogleMapEngine$Map$3$1((CashClusterItem) this.$selectedItem, (SelectedLocationCameraReframe) this.$selectedLocationCameraReframe, this.$isMapVisible, (Density) obj5, (CameraPositionState) obj4, (MutableState) this.$googleMap$delegate, (MutableState) obj2, (MutableState) obj3, continuation);
            case 1:
                return new GoogleMapEngine$Map$3$1(this.$isMapVisible, (BitcoinTransferPresenter) obj5, (CurrencyCode) obj4, (Money) this.$googleMap$delegate, (BigDecimal) obj2, (Money) obj3, continuation);
            case 2:
                return new GoogleMapEngine$Map$3$1((InputFieldText) this.$selectedItem, (CoroutineContext) this.$selectedLocationCameraReframe, (CashAccountDatabaseImpl) obj5, (Set) obj4, this.$isMapVisible, (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections) obj3, (MutableState) obj2, continuation);
            default:
                GoogleMapEngine$Map$3$1 googleMapEngine$Map$3$1 = new GoogleMapEngine$Map$3$1((Money) this.$selectedLocationCameraReframe, continuation, (AddMoneyPresenter) obj5, (ArrayList) obj4, this.$isMapVisible, (MutableState) this.$googleMap$delegate, (State) obj3, (MutableState) obj2);
                googleMapEngine$Map$3$1.$selectedItem = obj;
                return googleMapEngine$Map$3$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GoogleMapEngine$Map$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l;
        Long l2;
        Long l3;
        Object amounts;
        Long l4;
        List amounts$default;
        MutableState mutableState;
        Object obj2;
        Object withContext;
        int i = this.$r8$classId;
        boolean z = this.$isMapVisible;
        Object obj3 = this.$isMapLoading$delegate;
        Object obj4 = this.$mapSize$delegate;
        Object obj5 = this.$cameraState;
        Object obj6 = this.$density;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GoogleMap googleMap = (GoogleMap) ((MutableState) this.$googleMap$delegate).getValue();
                    CashClusterItem cashClusterItem = (CashClusterItem) this.$selectedItem;
                    SelectedLocationCameraReframe selectedLocationCameraReframe = (SelectedLocationCameraReframe) this.$selectedLocationCameraReframe;
                    if (!z || ((Boolean) ((MutableState) obj3).getValue()).booleanValue() || googleMap == null || cashClusterItem == null || selectedLocationCameraReframe == null || IntSize.m1055equalsimpl0(((IntSize) mutableState2.getValue()).packedValue, 0L)) {
                        break;
                    } else {
                        int mo230roundToPx0680j_4 = ((int) (((IntSize) mutableState2.getValue()).packedValue & BodyPartID.bodyIdMax)) - ((Density) obj6).mo230roundToPx0680j_4(selectedLocationCameraReframe.bottomObscuredHeight);
                        if (mo230roundToPx0680j_4 <= 0) {
                            break;
                        } else {
                            LatLng latLng = new LatLng(cashClusterItem.getLatitude(), cashClusterItem.getLongitude());
                            try {
                                zzbu zzbuVar = (zzbu) googleMap.getProjection().a;
                                Parcel zza = zzbuVar.zza();
                                zzc.zze(zza, latLng);
                                Parcel zzJ = zzbuVar.zzJ(zza, 2);
                                IObjectWrapper asInterface = ObjectWrapper.asInterface(zzJ.readStrongBinder());
                                zzJ.recycle();
                                Point point = (Point) ObjectWrapper.unwrap(asInterface);
                                point.getClass();
                                if (point.y < mo230roundToPx0680j_4) {
                                    break;
                                } else {
                                    Point point2 = new Point(point.x, MathKt__MathJVMKt.roundToInt((point.y + (((int) (((IntSize) mutableState2.getValue()).packedValue & BodyPartID.bodyIdMax)) / 2.0f)) - (RangesKt___RangesKt.coerceIn(0.6f, RecyclerView.DECELERATION_RATE, 1.0f) * mo230roundToPx0680j_4)));
                                    try {
                                        zzbu zzbuVar2 = (zzbu) googleMap.getProjection().a;
                                        ObjectWrapper objectWrapper = new ObjectWrapper(point2);
                                        Parcel zza2 = zzbuVar2.zza();
                                        zzc.zzg(zza2, objectWrapper);
                                        Parcel zzJ2 = zzbuVar2.zzJ(zza2, 1);
                                        LatLng latLng2 = (LatLng) zzc.zza(zzJ2, LatLng.CREATOR);
                                        zzJ2.recycle();
                                        latLng2.getClass();
                                        CameraPositionState cameraPositionState = (CameraPositionState) obj5;
                                        OneShotDisposable newCameraPosition = CameraUpdateFactory.newCameraPosition(new CameraPosition(latLng2, ((CameraPosition) cameraPositionState.rawPosition$delegate.getValue()).zoom, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                                        this.label = 1;
                                        if (cameraPositionState.animate(newCameraPosition, Integer.MAX_VALUE, this) == coroutineSingletons) {
                                            break;
                                        }
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                }
                            } catch (RemoteException e2) {
                                TransportImpl$$ExternalSyntheticLambda0.m(e2);
                            }
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CurrencyCode currencyCode = (CurrencyCode) obj5;
                BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) obj6;
                AmountSelectorPresenter amountSelectorPresenter = bitcoinTransferPresenter.amountSelectorPresenter;
                BitcoinTransferScreen bitcoinTransferScreen = bitcoinTransferPresenter.args;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        BitcoinTransferScreen.SavedState savedState = bitcoinTransferScreen.savedState;
                        AmountSheetSavedState amountSheetSavedState = savedState != null ? savedState.uiState : null;
                        if (amountSheetSavedState instanceof AmountSheetSavedState.AmountSelectorState) {
                            l = ((AmountSheetSavedState.AmountSelectorState) amountSheetSavedState).selectedAmountUsd;
                        } else if (amountSheetSavedState instanceof AmountSheetSavedState.AmountKeypadState) {
                            l = Moneys.parseMoneyFromString$default(((AmountSheetSavedState.AmountKeypadState) amountSheetSavedState).rawAmount, currencyCode).amount;
                        }
                        l2 = l;
                        Money money = (Money) this.$googleMap$delegate;
                        l3 = money != null ? money.amount : null;
                        if (!bitcoinTransferScreen.isBuy) {
                            amounts$default = AmountSelectorPresenter.toAmounts$default(amountSelectorPresenter, TradeType.BUY_BITCOIN, null, null, currencyCode, 6);
                            List<Object> list = amounts$default;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (Object obj7 : list) {
                                if (l3 != null && (obj7 instanceof AmountSelection.TradeSome)) {
                                    AmountSelection.TradeSome tradeSome = (AmountSelection.TradeSome) obj7;
                                    if (tradeSome.amount < l3.longValue()) {
                                        obj7 = AmountSelection.TradeSome.copy$default(tradeSome, 7);
                                        arrayList.add(obj7);
                                    }
                                }
                                if (obj7 instanceof AmountSelection.HasAmount) {
                                    AmountSelection.HasAmount hasAmount = (AmountSelection.HasAmount) obj7;
                                    long amount = hasAmount.getAmount();
                                    if (l2 != null && amount == l2.longValue()) {
                                        obj7 = hasAmount.copyAsSelected();
                                    }
                                }
                                arrayList.add(obj7);
                            }
                            break;
                        } else {
                            BigDecimal bigDecimal = (BigDecimal) obj3;
                            Money money2 = (Money) obj4;
                            this.$selectedItem = l2;
                            this.$selectedLocationCameraReframe = l3;
                            this.label = 1;
                            if (bigDecimal == null) {
                                amounts = EmptyList.INSTANCE;
                            } else {
                                BitcoinTransferScreen.OrderType orderType = bitcoinTransferScreen.orderType;
                                amounts = orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder ? ((RealAmountSelectorPresenter) amountSelectorPresenter).toAmounts(TradeType.SELL_BITCOIN, bigDecimal.toString(), new Long(((BitcoinTransferScreen.OrderType.CustomOrder) orderType).targetUsdPerBtc), currencyCode) : money2 == null ? EmptyList.INSTANCE : bigDecimal.equals(BigDecimal.ZERO) ? EmptyList.INSTANCE : ((RealAmountSelectorPresenter) amountSelectorPresenter).toAmounts(TradeType.SELL_BITCOIN, bigDecimal.toString(), money2.amount, currencyCode);
                            }
                            if (amounts == coroutineSingletons2) {
                                break;
                            } else {
                                l4 = l3;
                            }
                        }
                    }
                    l2 = null;
                    Money money3 = (Money) this.$googleMap$delegate;
                    if (money3 != null) {
                    }
                    if (!bitcoinTransferScreen.isBuy) {
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    l4 = (Long) this.$selectedLocationCameraReframe;
                    Long l5 = (Long) this.$selectedItem;
                    SafeTrace.throwOnFailure(obj);
                    l2 = l5;
                    amounts = obj;
                }
                amounts$default = (List) amounts;
                l3 = l4;
                List<Object> list2 = amounts$default;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                while (r0.hasNext()) {
                }
                break;
            case 2:
                InputFieldText inputFieldText = (InputFieldText) this.$selectedItem;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj3;
                    if (StringsKt.isBlank(inputFieldText.getValue())) {
                        obj2 = (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections) obj4;
                        mutableState.setValue(obj2);
                        break;
                    } else {
                        this.$googleMap$delegate = mutableState;
                        this.label = 1;
                        withContext = JobKt.withContext((CoroutineContext) this.$selectedLocationCameraReframe, new CheckoutTipStateKt$rememberCheckoutTipState$1$1((CashAccountDatabaseImpl) obj6, inputFieldText.getValue().toString(), (Set) obj5, this.$isMapVisible, (Continuation) null, 5), this);
                        if (withContext == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    MutableState mutableState3 = (MutableState) this.$googleMap$delegate;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState3;
                    withContext = obj;
                }
                obj2 = (InvestingStockSelectionViewModel.SearchResultModel) withContext;
                mutableState.setValue(obj2);
            default:
                AddMoneyPresenter addMoneyPresenter = (AddMoneyPresenter) obj6;
                AddMoneyScreen addMoneyScreen = addMoneyPresenter.args;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Money money4 = (Money) this.$selectedLocationCameraReframe;
                    Analytics analytics = addMoneyPresenter.analytics;
                    ArrayList arrayList3 = (ArrayList) obj5;
                    Long l6 = money4.amount;
                    Integer valueOf = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
                    CurrencyCode currencyCode2 = money4.currency_code;
                    com.squareup.cash.cdf.CurrencyCode asCdfCurrencyCode = currencyCode2 != null ? UtilsKt.getAsCdfCurrencyCode(currencyCode2) : null;
                    CashDepositEnterAmount.EntryMethod entryMethod = CashDepositEnterAmount.EntryMethod.SELECTED;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Long l7 = ((Money) it.next()).amount;
                        if (l7 != null) {
                            arrayList4.add(l7);
                        }
                    }
                    analytics.track(new CashDepositEnterAmount(valueOf, asCdfCurrencyCode, addMoneyScreen.blockersData.flowToken, CollectionsKt.joinToString$default(arrayList4, ",", null, null, 0, null, null, 62)), null);
                    Instrument instrument = ((Boolean) ((MutableState) this.$googleMap$delegate).getValue()).booleanValue() ? new Instrument("GOOGLE_PAY", CashInstrumentType.GOOGLE_PAY, (InstrumentType) null, (String) null, (String) null, (String) null, (String) null, (String) null, "Google Pay", (Boolean) null, (String) null, (String) null, (String) null, true, (String) null, (Long) null, 65536) : (Instrument) ((State) obj4).getValue();
                    if (z || instrument != null) {
                        this.$selectedItem = null;
                        this.label = 1;
                        Object processTransfer = ((RealTransferManager) addMoneyPresenter.transferManager).processTransfer(BlockersData.copy$default(addMoneyScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(addMoneyPresenter.transferData, money4, null, null, null, null, null, null, instrument != null ? InstrumentManagerKt.toProto(instrument) : null, 16382), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531), this);
                        if (processTransfer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            processTransfer = Unit.INSTANCE;
                        }
                        if (processTransfer == coroutineSingletons4) {
                            break;
                        }
                    } else {
                        Money money5 = (Money) ((MutableState) obj3).getValue();
                        addMoneyPresenter.navigator.goTo(new InstrumentNotLinkedScreen(BlockersData.copy$default(addMoneyScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(addMoneyPresenter.transferData, money5, null, null, null, null, null, null, null, TiffTagConstants.COMPRESSION_VALUE_NEXT), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531), TransferType.ADD_CASH, null, AddMoneyScreen.copy$default(addMoneyScreen, null, money5, null, 57)));
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMapEngine$Map$3$1(InputFieldText inputFieldText, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, Set set, boolean z, InvestingStockSelectionViewModel.SearchResultModel.LabeledSections labeledSections, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$selectedItem = inputFieldText;
        this.$selectedLocationCameraReframe = coroutineContext;
        this.$density = cashAccountDatabaseImpl;
        this.$cameraState = set;
        this.$isMapVisible = z;
        this.$mapSize$delegate = labeledSections;
        this.$isMapLoading$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMapEngine$Map$3$1(Money money, Continuation continuation, AddMoneyPresenter addMoneyPresenter, ArrayList arrayList, boolean z, MutableState mutableState, State state, MutableState mutableState2) {
        super(2, continuation);
        this.$selectedLocationCameraReframe = money;
        this.$density = addMoneyPresenter;
        this.$cameraState = arrayList;
        this.$isMapVisible = z;
        this.$googleMap$delegate = mutableState;
        this.$mapSize$delegate = state;
        this.$isMapLoading$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMapEngine$Map$3$1(boolean z, BitcoinTransferPresenter bitcoinTransferPresenter, CurrencyCode currencyCode, Money money, BigDecimal bigDecimal, Money money2, Continuation continuation) {
        super(2, continuation);
        this.$isMapVisible = z;
        this.$density = bitcoinTransferPresenter;
        this.$cameraState = currencyCode;
        this.$googleMap$delegate = money;
        this.$isMapLoading$delegate = bigDecimal;
        this.$mapSize$delegate = money2;
    }
}
