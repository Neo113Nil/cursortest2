package com.squareup.address.typeahead.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.network.NetworkFetcher$doFetch$2;
import com.squareup.address.typeahead.backend.api.AddressResult$Address;
import com.squareup.address.typeahead.backend.api.AddressResult$LocationResult;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.api.States;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.views.AddressRegex;
import com.squareup.cash.R;
import com.squareup.cash.scrubbing.PostalCodeValidator;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.Coordinates;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AddressTypeaheadState {
    public final Regex addressRegex;
    public final boolean autofill;
    public final ParcelableSnapshotMutableState city$delegate;
    public final ParcelableSnapshotMutableState cityAddress$delegate;
    public final String country;
    public final Country countryCode;
    public Function1 getString;
    public final ParcelableSnapshotMutableState hasSelectedLocation$delegate;
    public final int invalidAddressMessageResId;
    public final int invalidPostalMessageResId;
    public final ParcelableSnapshotMutableState lastSearchFailed$delegate;
    public final ParcelableSnapshotMutableState latitude$delegate;
    public final LocationType locationType;
    public final ParcelableSnapshotMutableState longitude$delegate;
    public final ParcelableSnapshotMutableState manuallyEdited$delegate;
    public final ParcelableSnapshotMutableState placeId$delegate;
    public final ParcelableSnapshotMutableState postalCode$delegate;
    public final int postalCodeHintOrLabelResId;
    public final PostalCodeValidator postalCodeValidator;
    public List resultSuggestions = EmptyList.INSTANCE;
    public final ParcelableSnapshotMutableState searchInput$delegate;
    public StandaloneCoroutine searchJob;
    public final ParcelableSnapshotMutableState searchResults$delegate;
    public final ParcelableSnapshotMutableState searcherState$delegate;
    public final ParcelableSnapshotMutableState searching$delegate;
    public final ParcelableSnapshotMutableState state$delegate;
    public final ParcelableSnapshotMutableState streetAddressLine1$delegate;
    public final ParcelableSnapshotMutableState streetAddressLine2$delegate;

    public final class Saver implements androidx.compose.runtime.saveable.Saver {
        public static final Saver INSTANCE = new Saver();

        @Override // androidx.compose.runtime.saveable.Saver
        /* renamed from: restore */
        public final Object mo380restore(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            LocationType locationType = (LocationType) obj2;
            Object obj3 = list.get(1);
            obj3.getClass();
            Country country = (Country) obj3;
            Object obj4 = list.get(2);
            obj4.getClass();
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            Object obj5 = list.get(3);
            obj5.getClass();
            String str = (String) obj5;
            Object obj6 = list.get(4);
            obj6.getClass();
            String str2 = (String) obj6;
            Object obj7 = list.get(5);
            obj7.getClass();
            String str3 = (String) obj7;
            Object obj8 = list.get(6);
            obj8.getClass();
            String str4 = (String) obj8;
            Object obj9 = list.get(7);
            obj9.getClass();
            String str5 = (String) obj9;
            Object obj10 = list.get(8);
            obj10.getClass();
            String str6 = (String) obj10;
            Object obj11 = list.get(9);
            obj11.getClass();
            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
            ByteString byteString = (ByteString) list.get(10);
            GlobalAddress globalAddress = byteString != null ? (GlobalAddress) GlobalAddress.ADAPTER.decode(byteString) : null;
            Object obj12 = list.get(11);
            obj12.getClass();
            boolean booleanValue3 = ((Boolean) obj12).booleanValue();
            Double d = (Double) list.get(12);
            Double d2 = (Double) list.get(13);
            String str7 = (String) list.get(14);
            Object obj13 = list.get(15);
            obj13.getClass();
            return new AddressTypeaheadState(locationType, country, booleanValue, str, str2, str3, str4, str5, d, d2, str7, str6, booleanValue2, globalAddress, booleanValue3, ((Boolean) obj13).booleanValue());
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object save(SaveableHolder saveableHolder, Object obj) {
            AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) obj;
            saveableHolder.getClass();
            addressTypeaheadState.getClass();
            LocationType locationType = addressTypeaheadState.locationType;
            Country country = addressTypeaheadState.countryCode;
            Boolean bool = (Boolean) addressTypeaheadState.hasSelectedLocation$delegate.getValue();
            bool.booleanValue();
            String str = (String) addressTypeaheadState.searchInput$delegate.getValue();
            String streetAddressLine1 = addressTypeaheadState.getStreetAddressLine1();
            String str2 = (String) addressTypeaheadState.streetAddressLine2$delegate.getValue();
            String str3 = (String) addressTypeaheadState.city$delegate.getValue();
            String state = addressTypeaheadState.getState();
            String postalCode = addressTypeaheadState.getPostalCode();
            Boolean bool2 = (Boolean) addressTypeaheadState.manuallyEdited$delegate.getValue();
            bool2.booleanValue();
            GlobalAddress globalAddress = (GlobalAddress) addressTypeaheadState.cityAddress$delegate.getValue();
            ByteString encodeByteString = globalAddress != null ? globalAddress.encodeByteString() : null;
            Boolean valueOf = Boolean.valueOf(addressTypeaheadState.autofill);
            Double d = (Double) addressTypeaheadState.latitude$delegate.getValue();
            Double d2 = (Double) addressTypeaheadState.longitude$delegate.getValue();
            String str4 = (String) addressTypeaheadState.placeId$delegate.getValue();
            Boolean bool3 = (Boolean) addressTypeaheadState.lastSearchFailed$delegate.getValue();
            bool3.booleanValue();
            return CollectionsKt__CollectionsKt.listOf(locationType, country, bool, str, streetAddressLine1, str2, str3, state, postalCode, bool2, encodeByteString, valueOf, d, d2, str4, bool3);
        }
    }

    public interface SearcherState {

        public final class Available implements SearcherState {
            public final PlacesAddressSearcher searcher;

            public Available(PlacesAddressSearcher placesAddressSearcher) {
                placesAddressSearcher.getClass();
                this.searcher = placesAddressSearcher;
            }
        }

        public final class Initializing implements SearcherState {
            public static final Initializing INSTANCE = new Initializing();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Initializing);
            }

            public final int hashCode() {
                return 1729825721;
            }

            public final String toString() {
                return "Initializing";
            }
        }

        public final class Unavailable implements SearcherState {
            public static final Unavailable INSTANCE = new Unavailable();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unavailable);
            }

            public final int hashCode() {
                return 2035643236;
            }

            public final String toString() {
                return "Unavailable";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Country.values().length];
            try {
                iArr[Country.AU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Country.CA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Country.GB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Country.IE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Country.MX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Country.US.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PostalCodeValidator.State.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PostalCodeValidator.State state = PostalCodeValidator.State.Invalid;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                PostalCodeValidator.State state2 = PostalCodeValidator.State.Invalid;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[LocationType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                LocationType locationType = LocationType.Address;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                LocationType locationType2 = LocationType.Address;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                LocationType locationType3 = LocationType.Address;
                iArr3[1] = 4;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public AddressTypeaheadState(LocationType locationType, Country country, boolean z, String str, String str2, String str3, String str4, String str5, Double d, Double d2, String str6, String str7, boolean z2, GlobalAddress globalAddress, boolean z3, boolean z4) {
        this.locationType = locationType;
        this.countryCode = country;
        this.autofill = z3;
        this.postalCodeValidator = new PostalCodeValidator(country);
        this.country = Countries.displayName(country);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[country.ordinal()];
        this.addressRegex = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? AddressRegex.ADDRESS_REGEX_US : AddressRegex.ADDRESS_REGEX_MX : AddressRegex.ADDRESS_REGEX_IE : AddressRegex.ADDRESS_REGEX_GB : AddressRegex.ADDRESS_REGEX_CA : AddressRegex.ADDRESS_REGEX_AU;
        int i2 = iArr[country.ordinal()];
        this.postalCodeHintOrLabelResId = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.string.at_code_hint_us : R.string.at_code_hint_mx : R.string.at_code_hint_ie : R.string.at_code_hint_gb : R.string.at_code_hint_ca : R.string.at_code_hint_au;
        int i3 = iArr[country.ordinal()];
        this.invalidAddressMessageResId = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? R.string.at_city_invalid_us : R.string.at_city_invalid_mx : R.string.at_city_invalid_ie : R.string.at_city_invalid_gb : R.string.at_city_invalid_ca : R.string.at_city_invalid_au;
        int i4 = iArr[country.ordinal()];
        this.invalidPostalMessageResId = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? R.string.at_postal_invalid_us : R.string.at_postal_invalid_mx : R.string.at_postal_invalid_ie : R.string.at_postal_invalid_gb : R.string.at_postal_invalid_ca : R.string.at_postal_invalid_au;
        this.searcherState$delegate = Updater.mutableStateOf$default(SearcherState.Initializing.INSTANCE);
        this.hasSelectedLocation$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
        this.searchInput$delegate = Updater.mutableStateOf$default(str);
        this.searchResults$delegate = Updater.mutableStateOf$default(null);
        this.manuallyEdited$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z2));
        this.streetAddressLine1$delegate = Updater.mutableStateOf$default(str2);
        this.streetAddressLine2$delegate = Updater.mutableStateOf$default(str3);
        this.city$delegate = Updater.mutableStateOf$default(str4);
        this.state$delegate = Updater.mutableStateOf$default(str5);
        this.postalCode$delegate = Updater.mutableStateOf$default(str7);
        this.latitude$delegate = Updater.mutableStateOf$default(d);
        this.longitude$delegate = Updater.mutableStateOf$default(d2);
        this.placeId$delegate = Updater.mutableStateOf$default(str6);
        this.cityAddress$delegate = Updater.mutableStateOf$default(globalAddress);
        this.searching$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.lastSearchFailed$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0122, code lost:
    
        return com.squareup.address.typeahead.backend.api.AddressState.Empty.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AddressState getAddress() {
        MatcherMatchResult matchEntire;
        Integer valueOf = Integer.valueOf(R.string.at_street_address_invalid);
        if (((Boolean) this.searching$delegate.getValue()).booleanValue() || ((List) this.searchResults$delegate.getValue()) != null) {
            return AddressState.Searching.INSTANCE;
        }
        LocationType locationType = this.locationType;
        int ordinal = locationType.ordinal();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.manuallyEdited$delegate;
        Coordinates coordinates = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                GlobalAddress globalAddress = (GlobalAddress) this.cityAddress$delegate.getValue();
                if (globalAddress == null) {
                    return new AddressState.Valid(new GlobalAddress(null, null, "", "", null, null, null, null, 4194263), true, null);
                }
                return new AddressState.Valid(globalAddress, ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), null);
            }
            if (ordinal != 2 && ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (AddressTypeaheadStateKt.access$getUsesAddressLine1Field(locationType) && StringsKt.isBlank(getStreetAddressLine1())) {
                return new AddressState.Error((String) getGetString$views().invoke(valueOf));
            }
            int ordinal2 = this.postalCodeValidator.validate(getPostalCode()).ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                return new AddressState.Error((String) getGetString$views().invoke(Integer.valueOf(this.invalidPostalMessageResId)));
            }
            if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String streetAddressLine1 = getStreetAddressLine1();
            if (!AddressTypeaheadStateKt.access$getUsesAddressLine1Field(locationType)) {
                streetAddressLine1 = null;
            }
            return new AddressState.Valid(new GlobalAddress(streetAddressLine1 != null ? StringsKt.trim(streetAddressLine1).toString() : null, null, null, null, StringsKt.trim(getPostalCode()).toString(), null, null, null, 4194238), ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), null);
        }
        if (showingExpandedModel()) {
            if (this.countryCode == Country.IE && !StringsKt.contains((CharSequence) getStreetAddressLine1(), ' ', false)) {
                return new AddressState.Error((String) getGetString$views().invoke(valueOf));
            }
            matchEntire = this.addressRegex.matchEntire(Boxes$$ExternalSyntheticOutline1.m$1((String) this.city$delegate.getValue(), ", ", getState(), " ", getPostalCode()));
            if (matchEntire != null) {
                return new AddressState.Error((String) getGetString$views().invoke(Integer.valueOf(this.invalidAddressMessageResId)));
            }
            String str = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(2);
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            String str2 = (String) States.STATES.get(upperCase);
            if (str2 != null) {
                upperCase = str2;
            }
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.latitude$delegate;
            if (((Double) parcelableSnapshotMutableState2.getValue()) != null) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.longitude$delegate;
                if (((Double) parcelableSnapshotMutableState3.getValue()) != null) {
                    coordinates = new Coordinates((Double) parcelableSnapshotMutableState2.getValue(), (Double) parcelableSnapshotMutableState3.getValue());
                }
            }
            return new AddressState.Valid(new GlobalAddress(StringsKt.trim(getStreetAddressLine1()).toString(), StringsKt.trim((String) this.streetAddressLine2$delegate.getValue()).toString(), StringsKt.trim((String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(1)).toString(), StringsKt.trim(upperCase).toString(), StringsKt.trim((String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(3)).toString(), null, coordinates, null, 3669908), ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), (String) this.placeId$delegate.getValue());
        }
        if (this.countryCode == Country.IE) {
        }
        matchEntire = this.addressRegex.matchEntire(Boxes$$ExternalSyntheticOutline1.m$1((String) this.city$delegate.getValue(), ", ", getState(), " ", getPostalCode()));
        if (matchEntire != null) {
        }
    }

    public final Function1 getGetString$views() {
        Function1 function1 = this.getString;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getString");
        throw null;
    }

    public final String getPostalCode() {
        return (String) this.postalCode$delegate.getValue();
    }

    public final String getState() {
        return (String) this.state$delegate.getValue();
    }

    public final String getStreetAddressLine1() {
        return (String) this.streetAddressLine1$delegate.getValue();
    }

    public final void searchIn(String str, CoroutineScope coroutineScope) {
        StandaloneCoroutine standaloneCoroutine = this.searchJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        String obj = StringsKt.trim(str).toString();
        int length = obj.length();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.searching$delegate;
        if (length == 0) {
            parcelableSnapshotMutableState.setValue(Boolean.FALSE);
            setSearchResults(null);
            return;
        }
        if (AddressTypeaheadStateKt.access$getUsesAddressLine1Field(this.locationType)) {
            Regex regex = AddressRegex.ADDRESS_REGEX_AU;
            Country country = this.countryCode;
            country.getClass();
            int i = AddressRegex.WhenMappings.$EnumSwitchMapping$0[country.ordinal()];
            if (!((i == 1 || i == 2) ? AddressRegex.STREET_ADDRESS_PATTERN_GB_IE : AddressRegex.STREET_ADDRESS_PATTERN).containsMatchIn(obj)) {
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                setSearchResults(null);
                return;
            }
        }
        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
        this.searchJob = JobKt.launch$default(coroutineScope, null, null, new NetworkFetcher$doFetch$2(this, obj, continuation, 10), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object select$views(AddressSearchResult addressSearchResult, ContinuationImpl continuationImpl) {
        AddressTypeaheadState$select$1 addressTypeaheadState$select$1;
        int i;
        AddressSearchResult.ComputedAddressResult computedAddressResult;
        JsonLogicResult jsonLogicResult;
        boolean z;
        AddressSearchResult addressSearchResult2 = addressSearchResult;
        if (continuationImpl instanceof AddressTypeaheadState$select$1) {
            addressTypeaheadState$select$1 = (AddressTypeaheadState$select$1) continuationImpl;
            int i2 = addressTypeaheadState$select$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                addressTypeaheadState$select$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = addressTypeaheadState$select$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressTypeaheadState$select$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    addressTypeaheadState$select$1.L$0 = addressSearchResult2;
                    addressTypeaheadState$select$1.label = 1;
                    obj = addressSearchResult2.computeAddress(addressTypeaheadState$select$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    addressSearchResult2 = addressTypeaheadState$select$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                computedAddressResult = (AddressSearchResult.ComputedAddressResult) obj;
                if (!(computedAddressResult instanceof AddressSearchResult.ComputedAddressResult.Success)) {
                    jsonLogicResult = ((AddressSearchResult.ComputedAddressResult.Success) computedAddressResult).address;
                } else {
                    if (!Intrinsics.areEqual(computedAddressResult, AddressSearchResult.ComputedAddressResult.Failure.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    jsonLogicResult = null;
                }
                z = jsonLogicResult instanceof AddressResult$Address;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.state$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.postalCode$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.city$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = this.streetAddressLine2$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = this.streetAddressLine1$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = this.hasSelectedLocation$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState7 = this.placeId$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState8 = this.longitude$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState9 = this.latitude$delegate;
                if (!z) {
                    AddressResult$Address addressResult$Address = (AddressResult$Address) jsonLogicResult;
                    parcelableSnapshotMutableState5.setValue(addressResult$Address.streetAddressLine1);
                    String str = addressResult$Address.streetAddressLine2;
                    if (str == null) {
                        str = "";
                    }
                    parcelableSnapshotMutableState4.setValue(str);
                    parcelableSnapshotMutableState3.setValue(addressResult$Address.city);
                    parcelableSnapshotMutableState2.setValue(addressResult$Address.zip);
                    parcelableSnapshotMutableState.setValue(this.countryCode != Country.GB ? addressResult$Address.state : "");
                    parcelableSnapshotMutableState9.setValue(addressResult$Address.latitude);
                    parcelableSnapshotMutableState8.setValue(addressResult$Address.longitude);
                    parcelableSnapshotMutableState7.setValue(addressResult$Address.placeId);
                    setManuallyEdited(false);
                    setSearchResults(null);
                    parcelableSnapshotMutableState6.setValue(Boolean.TRUE);
                } else if (jsonLogicResult instanceof AddressResult$LocationResult) {
                    AddressResult$LocationResult addressResult$LocationResult = (AddressResult$LocationResult) jsonLogicResult;
                    GlobalAddress globalAddress = new GlobalAddress(null, null, addressResult$LocationResult.city, addressResult$LocationResult.state, null, addressResult$LocationResult.country, null, addressResult$LocationResult.neighborhood, 3145559);
                    this.cityAddress$delegate.setValue(globalAddress);
                    this.searchInput$delegate.setValue(Recorder$$ExternalSyntheticOutline2.m(globalAddress.locality, ", ", globalAddress.administrative_district_level_1));
                    parcelableSnapshotMutableState9.setValue(null);
                    parcelableSnapshotMutableState8.setValue(null);
                    parcelableSnapshotMutableState7.setValue(null);
                    setManuallyEdited(false);
                    setSearchResults(null);
                    parcelableSnapshotMutableState6.setValue(Boolean.TRUE);
                } else {
                    if (jsonLogicResult != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    parcelableSnapshotMutableState5.setValue(addressSearchResult2.getPrimaryText().toString());
                    parcelableSnapshotMutableState4.setValue("");
                    parcelableSnapshotMutableState3.setValue("");
                    parcelableSnapshotMutableState2.setValue("");
                    parcelableSnapshotMutableState.setValue("");
                    parcelableSnapshotMutableState9.setValue(null);
                    parcelableSnapshotMutableState8.setValue(null);
                    parcelableSnapshotMutableState7.setValue(null);
                    setManuallyEdited(true);
                    setSearchResults(null);
                    parcelableSnapshotMutableState6.setValue(Boolean.TRUE);
                }
                return Boolean.TRUE;
            }
        }
        addressTypeaheadState$select$1 = new AddressTypeaheadState$select$1(this, continuationImpl);
        Object obj2 = addressTypeaheadState$select$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressTypeaheadState$select$1.label;
        if (i != 0) {
        }
        computedAddressResult = (AddressSearchResult.ComputedAddressResult) obj2;
        if (!(computedAddressResult instanceof AddressSearchResult.ComputedAddressResult.Success)) {
        }
        z = jsonLogicResult instanceof AddressResult$Address;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState10 = this.state$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState22 = this.postalCode$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState32 = this.city$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState42 = this.streetAddressLine2$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState52 = this.streetAddressLine1$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState62 = this.hasSelectedLocation$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState72 = this.placeId$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState82 = this.longitude$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState92 = this.latitude$delegate;
        if (!z) {
        }
        return Boolean.TRUE;
    }

    public final void setManuallyEdited(boolean z) {
        this.manuallyEdited$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setSearchResults(List list) {
        this.searchResults$delegate.setValue(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setSearcher$views(PlacesAddressSearcher placesAddressSearcher, ContinuationImpl continuationImpl) {
        AddressTypeaheadState$setSearcher$1 addressTypeaheadState$setSearcher$1;
        Object obj;
        int i;
        if (continuationImpl instanceof AddressTypeaheadState$setSearcher$1) {
            addressTypeaheadState$setSearcher$1 = (AddressTypeaheadState$setSearcher$1) continuationImpl;
            int i2 = addressTypeaheadState$setSearcher$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                addressTypeaheadState$setSearcher$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = addressTypeaheadState$setSearcher$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressTypeaheadState$setSearcher$1.label;
                Continuation continuation = null;
                Object obj2 = SearcherState.Unavailable.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.searcherState$delegate;
                    if (placesAddressSearcher == null) {
                        parcelableSnapshotMutableState.setValue(obj2);
                        return Unit.INSTANCE;
                    }
                    parcelableSnapshotMutableState.setValue(SearcherState.Initializing.INSTANCE);
                    addressTypeaheadState$setSearcher$1.L$0 = placesAddressSearcher;
                    addressTypeaheadState$setSearcher$1.L$1 = this;
                    addressTypeaheadState$setSearcher$1.label = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new DiskLruCache$launchCleanup$1(placesAddressSearcher, continuation, 27), addressTypeaheadState$setSearcher$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = addressTypeaheadState$setSearcher$1.L$1;
                    placesAddressSearcher = addressTypeaheadState$setSearcher$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    obj2 = new SearcherState.Available(placesAddressSearcher);
                }
                this.searcherState$delegate.setValue(obj2);
                return Unit.INSTANCE;
            }
        }
        addressTypeaheadState$setSearcher$1 = new AddressTypeaheadState$setSearcher$1(this, continuationImpl);
        obj = addressTypeaheadState$setSearcher$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressTypeaheadState$setSearcher$1.label;
        Continuation continuation2 = null;
        Object obj22 = SearcherState.Unavailable.INSTANCE;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        this.searcherState$delegate.setValue(obj22);
        return Unit.INSTANCE;
    }

    public final boolean showingExpandedModel() {
        SearcherState searcherState = (SearcherState) this.searcherState$delegate.getValue();
        if (!Intrinsics.areEqual(searcherState, SearcherState.Initializing.INSTANCE)) {
            boolean areEqual = Intrinsics.areEqual(searcherState, SearcherState.Unavailable.INSTANCE);
            LocationType locationType = this.locationType;
            if (areEqual) {
                if (locationType != LocationType.City) {
                    return true;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return false;
            }
            if (!(searcherState instanceof SearcherState.Available)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
            if (locationType != LocationType.City && (((Boolean) this.hasSelectedLocation$delegate.getValue()).booleanValue() || ((Boolean) this.lastSearchFailed$delegate.getValue()).booleanValue())) {
                return true;
            }
        }
        return false;
    }
}
