package com.squareup.address.typeahead.backend.real;

import android.content.Context;
import android.text.SpannableString;
import androidx.emoji2.text.MetadataRepo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.ViewSizeResolver$size$3$1;
import com.fillr.e0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzcs;
import com.google.android.libraries.places.api.model.zzcu;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.model.zzfi;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.internal.zzns;
import com.google.zxing.BinaryBitmap;
import com.squareup.address.typeahead.backend.api.AddressResult$Address;
import com.squareup.address.typeahead.backend.api.AddressResult$LocationResult;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.backend.api.AddressSearcher$AddressTypeFilter;
import com.squareup.address.typeahead.backend.api.States;
import com.squareup.address.typeahead.views.AddressTypeaheadState$select$1;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.protos.common.countries.Country;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class PlacesAddressSearcher {
    public e0 apiClient;
    public final Context context;
    public final RealBrazeManager$$ExternalSyntheticLambda0 newApiEnabled;
    public zzdi sessionToken;

    /* loaded from: classes5.dex */
    public final class PlacesSearchResult implements AddressSearchResult {
        public final Country countryCode;
        public final String placeId;
        public final SpannableString primaryText;
        public final SpannableString secondaryText;
        public final /* synthetic */ PlacesAddressSearcher this$0;
        public final AddressSearcher$AddressTypeFilter typeFilter;

        public PlacesSearchResult(PlacesAddressSearcher placesAddressSearcher, SpannableString spannableString, SpannableString spannableString2, String str, Country country, AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter) {
            str.getClass();
            country.getClass();
            this.this$0 = placesAddressSearcher;
            this.primaryText = spannableString;
            this.secondaryText = spannableString2;
            this.placeId = str;
            this.countryCode = country;
            this.typeFilter = addressSearcher$AddressTypeFilter;
        }

        public static AddressResult$Address buildAddress$real$default(PlacesSearchResult placesSearchResult, zzfi zzfiVar, String str) {
            Iterable<zzcs> iterable;
            String str2;
            str.getClass();
            zzcu zzcuVar = zzfiVar.zzd;
            if (zzcuVar == null || (iterable = zzcuVar.zza) == null) {
                iterable = EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (zzcs zzcsVar : iterable) {
                List list = zzcsVar.zzc;
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual((String) obj, "political")) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new Pair((String) it.next(), zzcsVar.zza));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList);
            }
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                linkedHashMap.put((String) pair.first, (String) pair.second);
            }
            Object obj2 = linkedHashMap.get("postal_code");
            if (obj2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Postal code is required for Address.");
                return null;
            }
            String str3 = (String) obj2;
            if (str.equals(str3) && (str = (String) linkedHashMap.get("route")) == null) {
                str = "";
            }
            String str4 = (placesSearchResult.countryCode != Country.MX || (str2 = (String) linkedHashMap.get("sublocality")) == null) ? "" : str2;
            String str5 = (String) linkedHashMap.get("locality");
            if (str5 == null && (str5 = (String) linkedHashMap.get("sublocality")) == null) {
                str5 = (String) linkedHashMap.getOrDefault("postal_town", "");
            }
            String str6 = str5;
            String state = getState(linkedHashMap);
            LatLng latLng = zzfiVar.zzq;
            Double valueOf = latLng != null ? Double.valueOf(latLng.latitude) : null;
            Double valueOf2 = latLng != null ? Double.valueOf(latLng.longitude) : null;
            String str7 = zzfiVar.zzp;
            if (str7 == null) {
                str7 = placesSearchResult.placeId;
            }
            return new AddressResult$Address(str, str4, str6, state, str3, valueOf, valueOf2, str7);
        }

        public static String getState(LinkedHashMap linkedHashMap) {
            String str = (String) linkedHashMap.get("administrative_area_level_1");
            if (str == null) {
                return "";
            }
            LinkedHashMap linkedHashMap2 = States.STATES;
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            return (String) linkedHashMap2.getOrDefault(upperCase, "");
        }

        public final AddressResult$LocationResult buildLocation$real(zzfi zzfiVar) {
            Iterable<zzcs> iterable;
            zzcu zzcuVar = zzfiVar.zzd;
            if (zzcuVar == null || (iterable = zzcuVar.zza) == null) {
                iterable = EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (zzcs zzcsVar : iterable) {
                List list = zzcsVar.zzc;
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual((String) obj, "political")) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new Pair((String) it.next(), zzcsVar.zza));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList);
            }
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                linkedHashMap.put((String) pair.first, (String) pair.second);
            }
            String str = (String) linkedHashMap.get("locality");
            if (str == null && (str = (String) linkedHashMap.get("sublocality")) == null) {
                str = (String) linkedHashMap.getOrDefault("postal_town", "");
            }
            String state = getState(linkedHashMap);
            String str2 = (String) linkedHashMap.get("neighborhood");
            return new AddressResult$LocationResult(str, state, str2 != null ? str2 : "", this.countryCode);
        }

        @Override // com.squareup.address.typeahead.backend.api.AddressSearchResult
        public final Object computeAddress(AddressTypeaheadState$select$1 addressTypeaheadState$select$1) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(addressTypeaheadState$select$1));
            cancellableContinuationImpl.initCancellability();
            MetadataRepo builder = zze.builder(this.placeId, CollectionsKt__CollectionsKt.listOf((Object[]) new Place.Field[]{Place.Field.ADDRESS_COMPONENTS, Place.Field.LOCATION, Place.Field.ID}));
            PlacesAddressSearcher placesAddressSearcher = this.this$0;
            builder.mRootNode = placesAddressSearcher.sessionToken;
            zze build = builder.build();
            e0 e0Var = placesAddressSearcher.apiClient;
            if (e0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("apiClient");
                throw null;
            }
            Task zzd = e0Var.zzd(build, zzns.zza);
            zzw zzwVar = (zzw) zzd;
            zzwVar.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new SizeMap(new ViewSizeResolver$size$3$1(4, placesAddressSearcher, this, cancellableContinuationImpl), 12));
            zzwVar.addOnFailureListener(new BinaryBitmap(11, placesAddressSearcher, cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }

        @Override // com.squareup.address.typeahead.backend.api.AddressSearchResult
        public final CharSequence getPrimaryText() {
            return this.primaryText;
        }

        @Override // com.squareup.address.typeahead.backend.api.AddressSearchResult
        public final CharSequence getSecondaryText() {
            return this.secondaryText;
        }
    }

    public PlacesAddressSearcher(Context context, RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda0) {
        this.context = context;
        this.newApiEnabled = realBrazeManager$$ExternalSyntheticLambda0;
    }
}
