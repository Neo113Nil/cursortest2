package com.squareup.cash.p2pblocking.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.primitives.LocalBrandBanner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSkipDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapAvatarEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$1$1;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.AllowlistSearchRequest;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse$Results$AllowlistSearchResults;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse$Results$AllowlistSuggestions;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.cash.Cashtags;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class BaseAllowlistSelectionPresenter implements MoleculePresenter {
    public final BlocklyService blocklyService;
    public final String firstName;
    public final String forCustomerToken;
    public final AllowlistSelectionViewModel.HeaderStyle headerStyle;
    public final RealInputFieldTextSaver inputFieldTextSaver;
    public final Integer limit;
    public final BetterNavigator.ScreenNavigator navigator;
    public final LinkedHashMap pendingChanges;
    public final RealProfileManager profileManager;
    public final boolean showContinueButton;
    public final AndroidStringManager stringManager;
    public final LinkedHashSet syncedCustomers;
    public final boolean useBackNavigation;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/cash/p2pblocking/presenters/BaseAllowlistSelectionPresenter$ExceededAllowlistLimitException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ExceededAllowlistLimitException extends Exception {
        public final int limit;

        public ExceededAllowlistLimitException(int i) {
            super("Exceeded allowlist limit.");
            this.limit = i;
        }
    }

    public interface RowTapResult {

        public final class Failure implements RowTapResult {
            public static final Failure INSTANCE = new Failure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return -708405980;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public final class NoChange implements RowTapResult {
            public static final NoChange INSTANCE = new NoChange();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoChange);
            }

            public final int hashCode() {
                return -980219785;
            }

            public final String toString() {
                return "NoChange";
            }
        }

        public final class Success implements RowTapResult {
            public final String customerToken;
            public final boolean requiresUpdateSearchResults;
            public final boolean toAdd;
            public final Set updatedSyncedCustomers;

            public Success(String str, boolean z, boolean z2, Set set) {
                str.getClass();
                set.getClass();
                this.customerToken = str;
                this.toAdd = z;
                this.requiresUpdateSearchResults = z2;
                this.updatedSyncedCustomers = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.customerToken, success.customerToken) && this.toAdd == success.toAdd && this.requiresUpdateSearchResults == success.requiresUpdateSearchResults && Intrinsics.areEqual(this.updatedSyncedCustomers, success.updatedSyncedCustomers);
            }

            public final int hashCode() {
                return this.updatedSyncedCustomers.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerToken.hashCode() * 31, 31, this.toAdd), 31, this.requiresUpdateSearchResults);
            }

            public final String toString() {
                StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Success(customerToken=", this.customerToken, ", toAdd=", ", requiresUpdateSearchResults=", this.toAdd);
                m1540m.append(this.requiresUpdateSearchResults);
                m1540m.append(", updatedSyncedCustomers=");
                m1540m.append(this.updatedSyncedCustomers);
                m1540m.append(")");
                return m1540m.toString();
            }
        }
    }

    public BaseAllowlistSelectionPresenter(AndroidStringManager androidStringManager, BlocklyService blocklyService, RealInputFieldTextSaver realInputFieldTextSaver, RealProfileManager realProfileManager, BetterNavigator.ScreenNavigator screenNavigator, AllowlistSelectionViewModel.HeaderStyle headerStyle, String str, String str2, Integer num, boolean z, boolean z2, Set set) {
        set.getClass();
        this.stringManager = androidStringManager;
        this.blocklyService = blocklyService;
        this.inputFieldTextSaver = realInputFieldTextSaver;
        this.profileManager = realProfileManager;
        this.navigator = screenNavigator;
        this.headerStyle = headerStyle;
        this.forCustomerToken = str;
        this.firstName = str2;
        this.limit = num;
        this.showContinueButton = z;
        this.useBackNavigation = z2;
        this.pendingChanges = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        this.syncedCustomers = linkedHashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r4 != null ? r4.booleanValue() : false) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static P2PListRowModel toRowModelWithPendingChanges(AllowlistCustomer allowlistCustomer, AndroidStringManager androidStringManager, LinkedHashMap linkedHashMap, boolean z) {
        String str;
        boolean z2;
        allowlistCustomer.getClass();
        linkedHashMap.getClass();
        BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
        if (blocklyCustomerMetadata == null || (str = blocklyCustomerMetadata.customer_token) == null) {
            return null;
        }
        if (!linkedHashMap.containsKey(str)) {
            Boolean bool = allowlistCustomer.is_in_allowlist;
            z2 = false;
        }
        z2 = true;
        Pair pair = z2 ? new Pair(Boolean.FALSE, androidStringManager.get(R.string.remove_button_title)) : new Pair(Boolean.TRUE, androidStringManager.get(R.string.add_button_title));
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        String str2 = (String) pair.second;
        blocklyCustomerMetadata.getClass();
        String str3 = blocklyCustomerMetadata.full_name;
        String str4 = blocklyCustomerMetadata.customer_token;
        str4.getClass();
        StackedAvatarViewModel.Avatar avatar = zzage.toAvatar(allowlistCustomer);
        str3.getClass();
        Icons icons = z2 ? Icons.SecurityCheckFill16 : null;
        Cashtag cashtag = blocklyCustomerMetadata.cashtag;
        String m$1 = cashtag != null ? Recorder$$ExternalSyntheticOutline2.m$1(cashtag.prefix, cashtag.name) : "";
        str3.getClass();
        return new P2PListRowModel(str4, avatar, str3, str2, booleanValue, m$1, icons, new P2PListRowTapButtonEvent.TapAddOrRemove(LayoutUpdate.firstName(str3), !z2, str, z, allowlistCustomer), new P2PListRowTapAvatarEvent(str), 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SearchState updateSearchResults(String str, boolean z, SearchState searchState) {
        AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions;
        LocalBrandBanner.Action action;
        str.getClass();
        searchState.getClass();
        P2PSearchData p2PSearchData = searchState.data;
        p2PSearchData.getClass();
        AllowlistSearchResponse allowlistSearchResponse = ((P2PSearchData.AllowSearchData) p2PSearchData).response;
        LocalBrandBanner.Action action2 = allowlistSearchResponse.results;
        AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults = null;
        if (action2 != null) {
            AllowlistSearchResponse$Results$AllowlistSuggestions allowlistSearchResponse$Results$AllowlistSuggestions = action2 instanceof AllowlistSearchResponse$Results$AllowlistSuggestions ? (AllowlistSearchResponse$Results$AllowlistSuggestions) action2 : null;
            AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions2 = allowlistSearchResponse$Results$AllowlistSuggestions != null ? allowlistSearchResponse$Results$AllowlistSuggestions.value : null;
            if (allowlistSuggestions2 != null) {
                ArrayList updateSearchResults$updateList = updateSearchResults$updateList(str, allowlistSuggestions2.customers, z);
                ByteString unknownFields = allowlistSuggestions2.unknownFields();
                unknownFields.getClass();
                allowlistSuggestions = new AllowlistSearchResponse.AllowlistSuggestions(updateSearchResults$updateList, unknownFields);
                action = allowlistSearchResponse.results;
                if (action != null) {
                    AllowlistSearchResponse$Results$AllowlistSearchResults allowlistSearchResponse$Results$AllowlistSearchResults = action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults ? (AllowlistSearchResponse$Results$AllowlistSearchResults) action : null;
                    AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults2 = allowlistSearchResponse$Results$AllowlistSearchResults != null ? allowlistSearchResponse$Results$AllowlistSearchResults.value : null;
                    if (allowlistSearchResults2 != null) {
                        ArrayList updateSearchResults$updateList2 = updateSearchResults$updateList(str, allowlistSearchResults2.customers, z);
                        ByteString unknownFields2 = allowlistSearchResults2.unknownFields();
                        unknownFields2.getClass();
                        allowlistSearchResults = new AllowlistSearchResponse.AllowlistSearchResults(updateSearchResults$updateList2, unknownFields2);
                    }
                }
                return SearchState.copy$default(searchState, new P2PSearchData.AllowSearchData(zzagj.withUpdatedResults(allowlistSearchResponse, allowlistSuggestions, allowlistSearchResults)), false, 6);
            }
        }
        allowlistSuggestions = null;
        action = allowlistSearchResponse.results;
        if (action != null) {
        }
        return SearchState.copy$default(searchState, new P2PSearchData.AllowSearchData(zzagj.withUpdatedResults(allowlistSearchResponse, allowlistSuggestions, allowlistSearchResults)), false, 6);
    }

    public static final ArrayList updateSearchResults$updateList(String str, List list, boolean z) {
        List<AllowlistCustomer> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AllowlistCustomer allowlistCustomer : list2) {
            BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
            if (Intrinsics.areEqual(blocklyCustomerMetadata != null ? blocklyCustomerMetadata.customer_token : null, str)) {
                allowlistCustomer = AllowlistCustomer.copy$default(allowlistCustomer, null, Boolean.valueOf(z), null, 125);
            }
            arrayList.add(allowlistCustomer);
        }
        return arrayList;
    }

    public boolean getConfirmsBack() {
        return false;
    }

    public abstract Object handleBack(Continuation continuation);

    public Object handleConfirmBack(BaseAllowlistSelectionPresenter$models$3$1 baseAllowlistSelectionPresenter$models$3$1) {
        return Unit.INSTANCE;
    }

    public abstract Object handleContinue$1(BaseAllowlistSelectionPresenter$models$3$1 baseAllowlistSelectionPresenter$models$3$1);

    public abstract Object handleRowTap(P2PListRowTapButtonEvent p2PListRowTapButtonEvent, MutableState mutableState, Continuation continuation);

    public abstract Unit handleSafetyResources();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        boolean z;
        boolean changed;
        Object rememberedValue;
        P2PSearchData p2PSearchData;
        ?? r9;
        LocalBrandBanner.Action action;
        ?? r4;
        List list;
        List list2;
        SearchResultsData searchResultsData;
        Iterator it;
        ?? r2;
        List list3;
        String str2;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        ?? r7 = (GapComposer) composer;
        r7.startReplaceGroup(1200974269);
        Object[] objArr = new Object[0];
        Object rememberedValue2 = r7.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue2 == obj) {
            rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda2(12);
            r7.updateRememberedValue(rememberedValue2);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) this.inputFieldTextSaver, (Function0) rememberedValue2, (Composer) r7, MLKEMEngine.KyberPolyBytes);
        Object rememberedValue3 = r7.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r7);
            r7.updateRememberedValue(rememberedValue3);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
        Object rememberedValue4 = r7.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(new SearchState((P2PSearchData.AllowSearchData) null, 7));
            r7.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        Object rememberedValue5 = r7.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            r7.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState2 = (MutableState) rememberedValue5;
        Object rememberedValue6 = r7.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            r7.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState3 = (MutableState) rememberedValue6;
        Object rememberedValue7 = r7.rememberedValue();
        if (rememberedValue7 == obj) {
            RealDisclosureProvider$special$$inlined$map$1 realDisclosureProvider$special$$inlined$map$1 = new RealDisclosureProvider$special$$inlined$map$1(this.profileManager.region(), 15);
            r7.updateRememberedValue(realDisclosureProvider$special$$inlined$map$1);
            rememberedValue7 = realDisclosureProvider$special$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue7, null, null, r7, 48, 2);
        Object rememberedValue8 = r7.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Boxes$$ExternalSyntheticOutline1.m(0, (GapComposer) r7);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue8;
        Object rememberedValue9 = r7.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = Boxes$$ExternalSyntheticOutline1.m(this.syncedCustomers.size(), (GapComposer) r7);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue9;
        CharSequence value = ((InputFieldText) rememberSaveable.getValue()).getValue();
        boolean changedInstance = r7.changedInstance(this) | r7.changed(rememberSaveable);
        Object rememberedValue10 = r7.rememberedValue();
        if (changedInstance || rememberedValue10 == obj) {
            rememberedValue10 = new MoneybotChatPresenter$models$6$1(this, mutableState, rememberSaveable, (Continuation) null);
            r7.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect((Composer) r7, value, (Function2) rememberedValue10);
        boolean changedInstance2 = r7.changedInstance(flow) | r7.changed(rememberSaveable);
        Object rememberedValue11 = r7.rememberedValue();
        if (changedInstance2 || rememberedValue11 == obj) {
            rememberedValue11 = new CardSchemePresenter$toHeroModule$1$1(4, rememberSaveable, continuation, flow);
            r7.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect((Composer) r7, flow, (Function2) rememberedValue11);
        Updater.LaunchedEffect((Composer) r7, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, this, coroutineScope, mutableState2, mutableState3, mutableState, parcelableSnapshotMutableIntState2, parcelableSnapshotMutableIntState));
        Integer num = this.limit;
        if (num == null || (str2 = this.firstName) == null) {
            str = null;
        } else {
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.allow_list_limit_description)).format(new Object[]{num, str2});
            format2.getClass();
            str = format2;
        }
        if (num != null) {
            if (num.intValue() <= parcelableSnapshotMutableIntState.getIntValue() + parcelableSnapshotMutableIntState2.getIntValue()) {
                z = true;
                changed = r7.changed(((SearchState) mutableState.getValue()).data) | r7.changed(parcelableSnapshotMutableIntState.getIntValue()) | r7.changed(z);
                rememberedValue = r7.rememberedValue();
                LinkedHashMap linkedHashMap = this.pendingChanges;
                if (!changed || rememberedValue == obj) {
                    p2PSearchData = ((SearchState) mutableState.getValue()).data;
                    if (p2PSearchData == null) {
                        linkedHashMap.getClass();
                        AllowlistSearchResponse allowlistSearchResponse = ((P2PSearchData.AllowSearchData) p2PSearchData).response;
                        LocalBrandBanner.Action action2 = allowlistSearchResponse.results;
                        if (action2 != null) {
                            AllowlistSearchResponse$Results$AllowlistSuggestions allowlistSearchResponse$Results$AllowlistSuggestions = action2 instanceof AllowlistSearchResponse$Results$AllowlistSuggestions ? (AllowlistSearchResponse$Results$AllowlistSuggestions) action2 : null;
                            AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions = allowlistSearchResponse$Results$AllowlistSuggestions != null ? allowlistSearchResponse$Results$AllowlistSuggestions.value : null;
                            if (allowlistSuggestions != null && (list2 = allowlistSuggestions.customers) != null) {
                                r9 = new ArrayList();
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    P2PListRowModel rowModelWithPendingChanges = toRowModelWithPendingChanges((AllowlistCustomer) it2.next(), androidStringManager, linkedHashMap, z);
                                    if (rowModelWithPendingChanges != null) {
                                        r9.add(rowModelWithPendingChanges);
                                    }
                                }
                                action = allowlistSearchResponse.results;
                                if (action != null) {
                                    AllowlistSearchResponse$Results$AllowlistSearchResults allowlistSearchResponse$Results$AllowlistSearchResults = action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults ? (AllowlistSearchResponse$Results$AllowlistSearchResults) action : null;
                                    AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults = allowlistSearchResponse$Results$AllowlistSearchResults != null ? allowlistSearchResponse$Results$AllowlistSearchResults.value : null;
                                    if (allowlistSearchResults != null && (list = allowlistSearchResults.customers) != null) {
                                        r4 = new ArrayList();
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            P2PListRowModel rowModelWithPendingChanges2 = toRowModelWithPendingChanges((AllowlistCustomer) it3.next(), androidStringManager, linkedHashMap, z);
                                            if (rowModelWithPendingChanges2 != null) {
                                                r4.add(rowModelWithPendingChanges2);
                                            }
                                        }
                                        rememberedValue = new SearchResultsData(r9, r4);
                                    }
                                }
                                r4 = EmptyList.INSTANCE;
                                rememberedValue = new SearchResultsData(r9, r4);
                            }
                        }
                        r9 = EmptyList.INSTANCE;
                        action = allowlistSearchResponse.results;
                        if (action != null) {
                        }
                        r4 = EmptyList.INSTANCE;
                        rememberedValue = new SearchResultsData(r9, r4);
                    } else {
                        rememberedValue = null;
                    }
                    r7.updateRememberedValue(rememberedValue);
                }
                searchResultsData = (SearchResultsData) rememberedValue;
                String str3 = androidStringManager.get(R.string.select_customer_to_search_section_title_allowlist);
                String str4 = androidStringManager.get(R.string.select_customer_multiselect_selected_title);
                Collection values = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                it = values.iterator();
                while (it.hasNext()) {
                    P2PListRowModel rowModelWithPendingChanges3 = toRowModelWithPendingChanges((AllowlistCustomer) it.next(), androidStringManager, linkedHashMap, z);
                    if (rowModelWithPendingChanges3 != null) {
                        arrayList.add(rowModelWithPendingChanges3);
                    }
                }
                String str5 = androidStringManager.get(R.string.allow_list_safety_resources);
                AllowlistSkipDialogModel allowlistSkipDialogModel = (AllowlistSkipDialogModel) mutableState3.getValue();
                InputFieldText inputFieldText = (InputFieldText) rememberSaveable.getValue();
                String str6 = androidStringManager.get(R.string.select_customer_to_block_search_bar_hint);
                String str7 = androidStringManager.get(R.string.select_customer_to_block_suggestion_section_title);
                if (searchResultsData != null || (list3 = searchResultsData.suggestionResults) == null) {
                    r2 = EmptyList.INSTANCE;
                } else {
                    r2 = new ArrayList();
                    for (Object obj2 : list3) {
                        if (!linkedHashMap.containsKey(((P2PListRowModel) obj2).customerToken)) {
                            r2.add(obj2);
                        }
                    }
                }
                List list4 = r2;
                String str8 = androidStringManager.get(R.string.select_customer_to_block_search_result_section_title);
                if (searchResultsData != null || (r0 = searchResultsData.searchResults) == null) {
                    List list5 = EmptyList.INSTANCE;
                }
                List list6 = list5;
                Region region = (Region) collectAsState.getValue();
                boolean z2 = ((SearchState) mutableState.getValue()).isLoading;
                P2PFailureDialogModel p2PFailureDialogModel = (P2PFailureDialogModel) mutableState2.getValue();
                String str9 = !this.showContinueButton ? androidStringManager.get(R.string.allow_list_continue_button) : null;
                String str10 = androidStringManager.get(R.string.allow_list_prompt_search_title);
                String symbol = Moneys.symbol(Cashtags.guessCashtagCurrency(null));
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("cashtag_symbol", symbol);
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.allow_list_prompt_search_message)).format(arrayMap);
                format3.getClass();
                AllowlistSelectionViewModel allowlistSelectionViewModel = new AllowlistSelectionViewModel(this.headerStyle, str3, str4, arrayList, str, str5, new SelectCustomerViewModel(inputFieldText, str6, list4, str7, null, null, list6, str8, region, z2, p2PFailureDialogModel, this.useBackNavigation, this.showContinueButton, str9, str10, format3), allowlistSkipDialogModel);
                r7.end(false);
                return allowlistSelectionViewModel;
            }
        }
        z = false;
        changed = r7.changed(((SearchState) mutableState.getValue()).data) | r7.changed(parcelableSnapshotMutableIntState.getIntValue()) | r7.changed(z);
        rememberedValue = r7.rememberedValue();
        LinkedHashMap linkedHashMap2 = this.pendingChanges;
        if (!changed) {
        }
        p2PSearchData = ((SearchState) mutableState.getValue()).data;
        if (p2PSearchData == null) {
        }
        r7.updateRememberedValue(rememberedValue);
        searchResultsData = (SearchResultsData) rememberedValue;
        String str32 = androidStringManager.get(R.string.select_customer_to_search_section_title_allowlist);
        String str42 = androidStringManager.get(R.string.select_customer_multiselect_selected_title);
        Collection values2 = linkedHashMap2.values();
        ArrayList arrayList2 = new ArrayList();
        it = values2.iterator();
        while (it.hasNext()) {
        }
        String str52 = androidStringManager.get(R.string.allow_list_safety_resources);
        AllowlistSkipDialogModel allowlistSkipDialogModel2 = (AllowlistSkipDialogModel) mutableState3.getValue();
        InputFieldText inputFieldText2 = (InputFieldText) rememberSaveable.getValue();
        String str62 = androidStringManager.get(R.string.select_customer_to_block_search_bar_hint);
        String str72 = androidStringManager.get(R.string.select_customer_to_block_suggestion_section_title);
        if (searchResultsData != null) {
        }
        r2 = EmptyList.INSTANCE;
        List list42 = r2;
        String str82 = androidStringManager.get(R.string.select_customer_to_block_search_result_section_title);
        if (searchResultsData != null) {
        }
        List list52 = EmptyList.INSTANCE;
        List list62 = list52;
        Region region2 = (Region) collectAsState.getValue();
        boolean z22 = ((SearchState) mutableState.getValue()).isLoading;
        P2PFailureDialogModel p2PFailureDialogModel2 = (P2PFailureDialogModel) mutableState2.getValue();
        if (!this.showContinueButton) {
        }
        String str102 = androidStringManager.get(R.string.allow_list_prompt_search_title);
        String symbol2 = Moneys.symbol(Cashtags.guessCashtagCurrency(null));
        ArrayMap arrayMap2 = new ArrayMap(1);
        arrayMap2.put("cashtag_symbol", symbol2);
        resources.getClass();
        String format32 = new MessageFormat(resources.getString(R.string.allow_list_prompt_search_message)).format(arrayMap2);
        format32.getClass();
        AllowlistSelectionViewModel allowlistSelectionViewModel2 = new AllowlistSelectionViewModel(this.headerStyle, str32, str42, arrayList2, str, str52, new SelectCustomerViewModel(inputFieldText2, str62, list42, str72, null, null, list62, str82, region2, z22, p2PFailureDialogModel2, this.useBackNavigation, this.showContinueButton, str9, str102, format32), allowlistSkipDialogModel2);
        r7.end(false);
        return allowlistSelectionViewModel2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performSearch(String str, String str2, ContinuationImpl continuationImpl) {
        BaseAllowlistSelectionPresenter$performSearch$1 baseAllowlistSelectionPresenter$performSearch$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof BaseAllowlistSelectionPresenter$performSearch$1) {
            baseAllowlistSelectionPresenter$performSearch$1 = (BaseAllowlistSelectionPresenter$performSearch$1) continuationImpl;
            int i2 = baseAllowlistSelectionPresenter$performSearch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                baseAllowlistSelectionPresenter$performSearch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = baseAllowlistSelectionPresenter$performSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseAllowlistSelectionPresenter$performSearch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AllowlistSearchRequest allowlistSearchRequest = new AllowlistSearchRequest(str, str2);
                    baseAllowlistSelectionPresenter$performSearch$1.label = 1;
                    obj = this.blocklyService.allowlistSearch(allowlistSearchRequest, baseAllowlistSelectionPresenter$performSearch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return new SearchState(new P2PSearchData.AllowSearchData((AllowlistSearchResponse) ((ApiResult.Success) apiResult).response), 6);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return new SearchState((P2PSearchData.AllowSearchData) null, 5);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        baseAllowlistSelectionPresenter$performSearch$1 = new BaseAllowlistSelectionPresenter$performSearch$1(this, continuationImpl);
        Object obj2 = baseAllowlistSelectionPresenter$performSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseAllowlistSelectionPresenter$performSearch$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
