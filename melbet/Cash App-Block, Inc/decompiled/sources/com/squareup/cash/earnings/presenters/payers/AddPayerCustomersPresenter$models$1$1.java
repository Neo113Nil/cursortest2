package com.squareup.cash.earnings.presenters.payers;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$models$$inlined$CollectEffect$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.earnings.backend.api.PayerCustomersResult;
import com.squareup.cash.earnings.backend.api.PayerResult;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.backend.real.RealPayerRepository$tagPayer$2;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.viewmodels.payers.LoadedData;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AddPayerCustomersPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $allContacts$delegate;
    public final /* synthetic */ boolean $isOverlay;
    public final /* synthetic */ Object $isSearching$delegate;
    public final /* synthetic */ Object $isToggleSaving$delegate;
    public final /* synthetic */ Object $knownCustomers;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MutableState $searchQuery$delegate;
    public final /* synthetic */ Object $searchResults$delegate;
    public final /* synthetic */ Object $selectedTokens;
    public final /* synthetic */ MutableState $state$delegate;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPayerCustomersPresenter$models$1$1(Flow flow, Continuation continuation, ShareSheetPresenter shareSheetPresenter, String str, boolean z, PaymentScheduleFrequency paymentScheduleFrequency, LocalDate localDate, LocalDate localDate2, ImmutableList immutableList, MutableState mutableState, MutableState mutableState2) {
        super(2, continuation);
        this.this$0 = flow;
        this.$selectedTokens = shareSheetPresenter;
        this.$knownCustomers = str;
        this.$isOverlay = z;
        this.$searchResults$delegate = paymentScheduleFrequency;
        this.$isSearching$delegate = localDate;
        this.$isToggleSaving$delegate = localDate2;
        this.$allContacts$delegate = immutableList;
        this.$state$delegate = mutableState;
        this.$searchQuery$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$allContacts$delegate;
        Object obj3 = this.$isToggleSaving$delegate;
        Object obj4 = this.$isSearching$delegate;
        Object obj5 = this.$searchResults$delegate;
        Object obj6 = this.$knownCustomers;
        Object obj7 = this.$selectedTokens;
        Object obj8 = this.this$0;
        switch (i) {
            case 0:
                return new AddPayerCustomersPresenter$models$1$1(this.$isOverlay, (CardStudioPresenter) obj8, (SnapshotStateSet) obj7, (Map) obj6, this.$state$delegate, this.$searchQuery$delegate, (State) obj2, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, continuation);
            default:
                ImmutableList immutableList = (ImmutableList) obj2;
                MutableState mutableState = this.$state$delegate;
                MutableState mutableState2 = this.$searchQuery$delegate;
                AddPayerCustomersPresenter$models$1$1 addPayerCustomersPresenter$models$1$1 = new AddPayerCustomersPresenter$models$1$1((Flow) obj8, continuation, (ShareSheetPresenter) obj7, (String) obj6, this.$isOverlay, (PaymentScheduleFrequency) obj5, (LocalDate) obj4, (LocalDate) obj3, immutableList, mutableState, mutableState2);
                addPayerCustomersPresenter$models$1$1.L$1 = obj;
                return addPayerCustomersPresenter$models$1$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AddPayerCustomersPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        if (r2 == r14) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d3, code lost:
    
        if (r2 == r14) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016f A[LOOP:0: B:29:0x0169->B:31:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0195 A[LOOP:1: B:34:0x018f->B:36:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object withContext;
        LoadedData loadedData;
        Object withContext2;
        LoadedData loadedData2;
        Object withContext3;
        int i = this.$r8$classId;
        Object obj3 = this.$allContacts$delegate;
        Object obj4 = this.$isToggleSaving$delegate;
        Object obj5 = this.$isSearching$delegate;
        Object obj6 = this.$searchResults$delegate;
        Object obj7 = this.this$0;
        Object obj8 = this.$knownCustomers;
        Object obj9 = this.$selectedTokens;
        switch (i) {
            case 0:
                Map map = (Map) obj8;
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj9;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj7;
                RealPayerRepository realPayerRepository = (RealPayerRepository) cardStudioPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                boolean z = this.$isOverlay;
                MutableState mutableState = this.$state$delegate;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(new AddPayerCustomersViewModel.Loading(z));
                    this.label = 1;
                    obj2 = obj4;
                    withContext = JobKt.withContext(realPayerRepository.ioDispatcher, new GooglePayPresenter$models$1$1(realPayerRepository, null, 15), this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            LoadedData loadedData3 = (LoadedData) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            obj2 = obj4;
                            loadedData2 = loadedData3;
                            withContext2 = obj;
                            if (((PayerResult) withContext2) instanceof PayerResult.Success) {
                                this.L$1 = loadedData2;
                                this.label = 3;
                                withContext3 = JobKt.withContext(realPayerRepository.ioDispatcher, new GooglePayPresenter$models$1$1(realPayerRepository, null, 15), this);
                                break;
                            }
                            loadedData = loadedData2;
                            while (r2.hasNext()) {
                            }
                            while (r2.hasNext()) {
                            }
                            boolean booleanValue = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                            mutableState.setValue(cardStudioPresenter.buildLoadedViewModel(loadedData, (SnapshotStateSet) obj9, (String) this.$searchQuery$delegate.getValue(), (List) ((State) obj3).getValue(), this.$isOverlay, (List) ((MutableState) obj6).getValue(), ((Boolean) ((MutableState) obj5).getValue()).booleanValue(), (Map) obj8, booleanValue));
                            return Unit.INSTANCE;
                        }
                        if (i2 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        LoadedData loadedData4 = (LoadedData) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj4;
                        loadedData2 = loadedData4;
                        withContext3 = obj;
                        PayerResult payerResult = (PayerResult) withContext3;
                        if (payerResult instanceof PayerResult.Success) {
                            LoadedData access$toLoadedData = CardStudioPresenter.access$toLoadedData(cardStudioPresenter, (PayerCustomersResult) ((PayerResult.Success) payerResult).data);
                            snapshotStateSet.clear();
                            snapshotStateSet.addAll(access$toLoadedData.taggedPayers.keySet());
                            loadedData = access$toLoadedData;
                            for (Map.Entry entry : loadedData.taggedPayers.entrySet()) {
                                map.put((String) entry.getKey(), (PayerCustomerRowModel) entry.getValue());
                            }
                            for (Map.Entry entry2 : loadedData.recentSenders.entrySet()) {
                                map.put((String) entry2.getKey(), (PayerCustomerRowModel) entry2.getValue());
                            }
                            boolean booleanValue2 = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                            mutableState.setValue(cardStudioPresenter.buildLoadedViewModel(loadedData, (SnapshotStateSet) obj9, (String) this.$searchQuery$delegate.getValue(), (List) ((State) obj3).getValue(), this.$isOverlay, (List) ((MutableState) obj6).getValue(), ((Boolean) ((MutableState) obj5).getValue()).booleanValue(), (Map) obj8, booleanValue2));
                            return Unit.INSTANCE;
                        }
                        loadedData = loadedData2;
                        while (r2.hasNext()) {
                        }
                        while (r2.hasNext()) {
                        }
                        boolean booleanValue22 = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                        mutableState.setValue(cardStudioPresenter.buildLoadedViewModel(loadedData, (SnapshotStateSet) obj9, (String) this.$searchQuery$delegate.getValue(), (List) ((State) obj3).getValue(), this.$isOverlay, (List) ((MutableState) obj6).getValue(), ((Boolean) ((MutableState) obj5).getValue()).booleanValue(), (Map) obj8, booleanValue22));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                    obj2 = obj4;
                }
                PayerResult payerResult2 = (PayerResult) withContext;
                if (!(payerResult2 instanceof PayerResult.Success)) {
                    if (payerResult2 instanceof PayerResult.Failure) {
                        mutableState.setValue(new AddPayerCustomersViewModel.LoadError(cardStudioPresenter.title(), ((AndroidStringManager) cardStudioPresenter.appConfig).get(R.string.add_payer_customers_subtitle), z));
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LoadedData access$toLoadedData2 = CardStudioPresenter.access$toLoadedData(cardStudioPresenter, (PayerCustomersResult) ((PayerResult.Success) payerResult2).data);
                snapshotStateSet.clear();
                snapshotStateSet.addAll(access$toLoadedData2.taggedPayers.keySet());
                String str = ((AddPayerCustomersScreen) cardStudioPresenter.cardStudioQueries).taggedCustomerToken;
                if (str == null || snapshotStateSet.contains(str)) {
                    loadedData = access$toLoadedData2;
                    while (r2.hasNext()) {
                    }
                    while (r2.hasNext()) {
                    }
                    boolean booleanValue222 = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                    mutableState.setValue(cardStudioPresenter.buildLoadedViewModel(loadedData, (SnapshotStateSet) obj9, (String) this.$searchQuery$delegate.getValue(), (List) ((State) obj3).getValue(), this.$isOverlay, (List) ((MutableState) obj6).getValue(), ((Boolean) ((MutableState) obj5).getValue()).booleanValue(), (Map) obj8, booleanValue222));
                    return Unit.INSTANCE;
                }
                this.L$1 = access$toLoadedData2;
                this.label = 2;
                withContext2 = JobKt.withContext(realPayerRepository.ioDispatcher, new RealPayerRepository$tagPayer$2(realPayerRepository, str, null, 0), this);
                if (withContext2 != coroutineSingletons) {
                    loadedData2 = access$toLoadedData2;
                    if (((PayerResult) withContext2) instanceof PayerResult.Success) {
                    }
                    loadedData = loadedData2;
                    while (r2.hasNext()) {
                    }
                    while (r2.hasNext()) {
                    }
                    boolean booleanValue2222 = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                    mutableState.setValue(cardStudioPresenter.buildLoadedViewModel(loadedData, (SnapshotStateSet) obj9, (String) this.$searchQuery$delegate.getValue(), (List) ((State) obj3).getValue(), this.$isOverlay, (List) ((MutableState) obj6).getValue(), ((Boolean) ((MutableState) obj5).getValue()).booleanValue(), (Map) obj8, booleanValue2222));
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalDate localDate = (LocalDate) obj5;
                    LocalDate localDate2 = (LocalDate) obj4;
                    ImmutableList immutableList = (ImmutableList) obj3;
                    MutableState mutableState2 = this.$state$delegate;
                    MutableState mutableState3 = this.$searchQuery$delegate;
                    ActivityTabPresenter$models$$inlined$CollectEffect$2.AnonymousClass1 anonymousClass1 = new ActivityTabPresenter$models$$inlined$CollectEffect$2.AnonymousClass1(coroutineScope, (ShareSheetPresenter) obj9, (String) obj8, this.$isOverlay, (PaymentScheduleFrequency) obj6, localDate, localDate2, immutableList, mutableState2, mutableState3);
                    this.L$1 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(anonymousClass1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPayerCustomersPresenter$models$1$1(boolean z, CardStudioPresenter cardStudioPresenter, SnapshotStateSet snapshotStateSet, Map map, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.$isOverlay = z;
        this.this$0 = cardStudioPresenter;
        this.$selectedTokens = snapshotStateSet;
        this.$knownCustomers = map;
        this.$state$delegate = mutableState;
        this.$searchQuery$delegate = mutableState2;
        this.$allContacts$delegate = state;
        this.$searchResults$delegate = mutableState3;
        this.$isSearching$delegate = mutableState4;
        this.$isToggleSaving$delegate = mutableState5;
    }
}
