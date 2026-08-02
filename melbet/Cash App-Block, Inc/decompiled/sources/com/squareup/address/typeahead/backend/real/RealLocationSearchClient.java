package com.squareup.address.typeahead.backend.real;

import androidx.emoji2.text.MetadataRepo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AdRevenueScheme;
import com.fillr.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzcs;
import com.google.android.libraries.places.api.model.zzcu;
import com.google.android.libraries.places.api.model.zzde;
import com.google.android.libraries.places.api.model.zzfi;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzf;
import com.google.android.libraries.places.api.net.zzj;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.api.net.zzl;
import com.google.mlkit.vision.text.zzd;
import com.squareup.address.typeahead.backend.api.AddressComponents$Country;
import com.squareup.address.typeahead.backend.api.Coordinates;
import com.squareup.address.typeahead.backend.api.Location;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationDetailsResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationSearchResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationTypeFilter;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class RealLocationSearchClient {
    public final RealGooglePlacesClient googlePlacesClient;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressComponents$Country.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocationSearchClient$LocationTypeFilter.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LocationSearchClient$LocationTypeFilter[] locationSearchClient$LocationTypeFilterArr = LocationSearchClient$LocationTypeFilter.$VALUES;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LocationSearchClient$LocationTypeFilter[] locationSearchClient$LocationTypeFilterArr2 = LocationSearchClient$LocationTypeFilter.$VALUES;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LocationSearchClient$LocationTypeFilter[] locationSearchClient$LocationTypeFilterArr3 = LocationSearchClient$LocationTypeFilter.$VALUES;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LocationSearchClient$LocationTypeFilter[] locationSearchClient$LocationTypeFilterArr4 = LocationSearchClient$LocationTypeFilter.$VALUES;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public RealLocationSearchClient(RealGooglePlacesClient realGooglePlacesClient) {
        this.googlePlacesClient = realGooglePlacesClient;
    }

    public static LocationSearchClient$LocationDetailsResult getLocationDetailsResult(zzfi zzfiVar, SearchLocation searchLocation) {
        Map map;
        String str;
        AddressComponents$Country addressComponents$Country;
        List<zzcs> list;
        LatLng latLng = zzfiVar.zzq;
        if (latLng == null) {
            Timber.Forest.e("Lat Lng is required for " + ((Object) searchLocation.primaryText), new Object[0]);
            return LocationSearchClient$LocationDetailsResult.Failure.INSTANCE;
        }
        zzcu zzcuVar = zzfiVar.zzd;
        if (zzcuVar == null || (list = zzcuVar.zza) == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        } else {
            ArrayList arrayList = new ArrayList();
            for (zzcs zzcsVar : list) {
                List list2 = zzcsVar.zzc;
                list2.getClass();
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair((String) it.next(), zzcsVar));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!Intrinsics.areEqual((String) ((Pair) next).first, "political")) {
                    arrayList3.add(next);
                }
            }
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            map = new LinkedHashMap(mapCapacity);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Pair pair = (Pair) it3.next();
                Object obj = pair.first;
                obj.getClass();
                map.put((String) obj, (zzcs) pair.second);
            }
        }
        CharSequence charSequence = searchLocation.primaryText;
        zzcs zzcsVar2 = (zzcs) map.get(AdRevenueScheme.COUNTRY);
        e eVar = null;
        if (zzcsVar2 != null && (str = zzcsVar2.zzb) != null) {
            AddressComponents$Country.Companion.getClass();
            AddressComponents$Country[] values = AddressComponents$Country.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    addressComponents$Country = null;
                    break;
                }
                addressComponents$Country = values[i];
                addressComponents$Country.getClass();
                if ("US".equalsIgnoreCase(str)) {
                    break;
                }
                i++;
            }
            if ((addressComponents$Country == null ? -1 : WhenMappings.$EnumSwitchMapping$0[addressComponents$Country.ordinal()]) == 1) {
                zzcsVar2.zza.getClass();
                charSequence.getClass();
                zzd zzdVar = AddressComponents$Country.Companion;
                eVar = new e();
            } else {
                Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Country code not supported: ", str, "."), new Object[0]);
            }
        }
        return new LocationSearchClient$LocationDetailsResult.Success(new Location(searchLocation.identifier, new Coordinates(latLng.latitude, latLng.longitude), zzfiVar.zza, eVar));
    }

    public static LocationSearchClient$LocationSearchResult.Success getLocationSearchResults(List list) {
        List<zzde> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (zzde zzdeVar : list2) {
            String str = zzdeVar.zza;
            str.getClass();
            arrayList.add(new SearchLocation(str, zzde.zzg(zzdeVar.zze, zzdeVar.zzh, null), zzde.zzg(zzdeVar.zzf, zzdeVar.zzi, null), zzde.zzg(zzdeVar.zzd, zzdeVar.zzg, null)));
        }
        return new LocationSearchClient$LocationSearchResult.Success(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDetails(LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId, SearchLocation searchLocation, ContinuationImpl continuationImpl) {
        RealLocationSearchClient$getDetails$1 realLocationSearchClient$getDetails$1;
        int i;
        try {
            if (continuationImpl instanceof RealLocationSearchClient$getDetails$1) {
                realLocationSearchClient$getDetails$1 = (RealLocationSearchClient$getDetails$1) continuationImpl;
                int i2 = realLocationSearchClient$getDetails$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realLocationSearchClient$getDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realLocationSearchClient$getDetails$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realLocationSearchClient$getDetails$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        MetadataRepo builder = zze.builder(searchLocation.identifier, CollectionsKt__CollectionsKt.listOf((Object[]) new Place.Field[]{Place.Field.FORMATTED_ADDRESS, Place.Field.ADDRESS_COMPONENTS, Place.Field.LOCATION}));
                        locationSearchClient$SessionId$GoogleSessionId.getClass();
                        builder.mRootNode = locationSearchClient$SessionId$GoogleSessionId.token;
                        zze build = builder.build();
                        RealGooglePlacesClient realGooglePlacesClient = this.googlePlacesClient;
                        realLocationSearchClient$getDetails$1.L$1 = searchLocation;
                        realLocationSearchClient$getDetails$1.label = 1;
                        obj = realGooglePlacesClient.fetchPlace(build, realLocationSearchClient$getDetails$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        searchLocation = realLocationSearchClient$getDetails$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return getLocationDetailsResult(((zzf) obj).zza, searchLocation);
                }
            }
            if (i != 0) {
            }
            return getLocationDetailsResult(((zzf) obj).zza, searchLocation);
        } catch (Throwable unused) {
            return LocationSearchClient$LocationDetailsResult.Failure.INSTANCE;
        }
        realLocationSearchClient$getDetails$1 = new RealLocationSearchClient$getDetails$1(this, continuationImpl);
        Object obj2 = realLocationSearchClient$getDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocationSearchClient$getDetails$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialize(ContinuationImpl continuationImpl) {
        RealLocationSearchClient$initialize$1 realLocationSearchClient$initialize$1;
        int i;
        try {
            if (continuationImpl instanceof RealLocationSearchClient$initialize$1) {
                realLocationSearchClient$initialize$1 = (RealLocationSearchClient$initialize$1) continuationImpl;
                int i2 = realLocationSearchClient$initialize$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realLocationSearchClient$initialize$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realLocationSearchClient$initialize$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realLocationSearchClient$initialize$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealGooglePlacesClient realGooglePlacesClient = this.googlePlacesClient;
                        realLocationSearchClient$initialize$1.label = 1;
                        if (realGooglePlacesClient.initialize(realLocationSearchClient$initialize$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Boolean.TRUE;
                }
            }
            if (i != 0) {
            }
            return Boolean.TRUE;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
        realLocationSearchClient$initialize$1 = new RealLocationSearchClient$initialize$1(this, continuationImpl);
        Object obj2 = realLocationSearchClient$initialize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocationSearchClient$initialize$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object search(LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId, String str, AddressComponents$Country addressComponents$Country, ContinuationImpl continuationImpl) {
        RealLocationSearchClient$search$1 realLocationSearchClient$search$1;
        int i;
        try {
            if (continuationImpl instanceof RealLocationSearchClient$search$1) {
                realLocationSearchClient$search$1 = (RealLocationSearchClient$search$1) continuationImpl;
                int i2 = realLocationSearchClient$search$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realLocationSearchClient$search$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realLocationSearchClient$search$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realLocationSearchClient$search$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        zzj builder = zzk.builder();
                        addressComponents$Country.getClass();
                        builder.setCountries(CollectionsKt__CollectionsJVMKt.listOf("US"));
                        builder.zza = str;
                        locationSearchClient$SessionId$GoogleSessionId.getClass();
                        builder.zzf = locationSearchClient$SessionId$GoogleSessionId.token;
                        zzk build = builder.build();
                        RealGooglePlacesClient realGooglePlacesClient = this.googlePlacesClient;
                        realLocationSearchClient$search$1.label = 1;
                        obj = realGooglePlacesClient.findAutocompletePredictions(build, realLocationSearchClient$search$1);
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
                    List list = ((zzl) obj).zza;
                    list.getClass();
                    return getLocationSearchResults(list);
                }
            }
            if (i != 0) {
            }
            List list2 = ((zzl) obj).zza;
            list2.getClass();
            return getLocationSearchResults(list2);
        } catch (Throwable unused) {
            return LocationSearchClient$LocationSearchResult.Failure.INSTANCE;
        }
        realLocationSearchClient$search$1 = new RealLocationSearchClient$search$1(this, continuationImpl);
        Object obj2 = realLocationSearchClient$search$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocationSearchClient$search$1.label;
    }
}
