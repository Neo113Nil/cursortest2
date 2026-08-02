package ru.yandex.tankerapp.geocoding.domain;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.os.Build;
import defpackage.ba20;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.da20;
import defpackage.evu0;
import defpackage.fse;
import defpackage.ike;
import defpackage.jl40;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w91;
import defpackage.zko;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.tankerapp.geocoding.domain.errors.GeocodingError;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final w91 b;
    public final tse c;
    public final fse d;
    public volatile Geocoder e;
    public Locale f;

    public a(Context context) {
        w91 w91Var = w91.a;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        ike a2 = bvf0.a(cvw.U(a, o400.a));
        zko zkoVar = new zko(Executors.newCachedThreadPool());
        this.a = context;
        this.b = w91Var;
        this.c = a2;
        this.d = zkoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a aVar, List list, da20 da20Var) {
        String str;
        aVar.getClass();
        List list2 = !list.isEmpty() ? list : null;
        if (list2 == null) {
            GeocodingError.NotFound notFound = GeocodingError.NotFound.a;
            da20Var.error(notFound.getErrorCode(), notFound.getErrorMessage(), null);
            return;
        }
        aVar.b.getClass();
        ArrayList arrayList = new ArrayList();
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
            Address address = (Address) it.next();
            String addressLine = address.getAddressLine(0);
            if (addressLine != null) {
                if ((!evu0.J(addressLine) ? addressLine : null) != null) {
                    StringTokenizer stringTokenizer = new StringTokenizer(addressLine, ",", false);
                    if (!stringTokenizer.hasMoreTokens()) {
                        stringTokenizer = null;
                    }
                    if (stringTokenizer != null) {
                        str = stringTokenizer.nextToken();
                        Pair pair = new Pair("name", address.getFeatureName());
                        if (str != null) {
                            str = "";
                        }
                        arrayList2.add(b.l(pair, new Pair("street", str), new Pair("isoCountryCode", address.getCountryCode()), new Pair("country", address.getCountryName()), new Pair("thoroughfare", address.getThoroughfare()), new Pair("subThoroughfare", address.getSubThoroughfare()), new Pair("postalCode", address.getPostalCode()), new Pair("administrativeArea", address.getAdminArea()), new Pair("subAdministrativeArea", address.getSubAdminArea()), new Pair("locality", address.getLocality()), new Pair("subLocality", address.getSubLocality())));
                    }
                }
            }
            str = null;
            Pair pair2 = new Pair("name", address.getFeatureName());
            if (str != null) {
            }
            arrayList2.add(b.l(pair2, new Pair("street", str), new Pair("isoCountryCode", address.getCountryCode()), new Pair("country", address.getCountryName()), new Pair("thoroughfare", address.getThoroughfare()), new Pair("subThoroughfare", address.getSubThoroughfare()), new Pair("postalCode", address.getPostalCode()), new Pair("administrativeArea", address.getAdminArea()), new Pair("subAdministrativeArea", address.getSubAdminArea()), new Pair("locality", address.getLocality()), new Pair("subLocality", address.getSubLocality())));
        }
        arrayList.addAll(arrayList2);
        da20Var.success(arrayList);
    }

    public static final void b(a aVar, List list, da20 da20Var) {
        aVar.getClass();
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            GeocodingError.NotFound notFound = GeocodingError.NotFound.a;
            da20Var.error(notFound.getErrorCode(), notFound.getErrorMessage(), null);
            return;
        }
        aVar.b.getClass();
        ArrayList arrayList = new ArrayList();
        List<Address> list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (Address address : list2) {
            arrayList2.add(b.l(new Pair("latitude", Double.valueOf(address.getLatitude())), new Pair("longitude", Double.valueOf(address.getLongitude())), new Pair(ClidProvider.TIMESTAMP, Long.valueOf(w91.b.getTimeInMillis()))));
        }
        arrayList.addAll(arrayList2);
        da20Var.success(arrayList);
    }

    public final Geocoder c() {
        Geocoder geocoder = this.e;
        if (geocoder != null) {
            return geocoder;
        }
        Locale locale = this.f;
        this.e = locale != null ? new Geocoder(this.a, locale) : new Geocoder(this.a);
        return this.e;
    }

    public final void d(String str, final ba20 ba20Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            c().getFromLocationName(str, 5, new Geocoder$GeocodeListener() { // from class: ru.yandex.tankerapp.geocoding.domain.GeocodingManager$placeMarkFromAddress$1
                public void onError(String errorMessage) {
                    GeocodingError.SearchRequestError searchRequestError = new GeocodingError.SearchRequestError(errorMessage);
                    ba20Var.error(searchRequestError.getErrorCode(), searchRequestError.getErrorMessage(), null);
                }

                public void onGeocode(List<? extends Address> addresses) {
                    a.b(a.this, addresses, ba20Var);
                }
            });
        } else {
            tje.N(this.c, null, null, new GeocodingManager$placeMarkFromAddress$2(this, ba20Var, str, null), 3);
        }
    }

    public final void e(double d, double d2, final ba20 ba20Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            c().getFromLocation(d, d2, 5, new Geocoder$GeocodeListener() { // from class: ru.yandex.tankerapp.geocoding.domain.GeocodingManager$placeMarkFromCoordinates$1
                public void onError(String errorMessage) {
                    GeocodingError.SearchRequestError searchRequestError = new GeocodingError.SearchRequestError(errorMessage);
                    ba20Var.error(searchRequestError.getErrorCode(), searchRequestError.getErrorMessage(), null);
                }

                public void onGeocode(List<Address> addresses) {
                    a.a(a.this, addresses, ba20Var);
                }
            });
        } else {
            tje.N(this.c, null, null, new GeocodingManager$placeMarkFromCoordinates$2(this, ba20Var, d, d2, null), 3);
        }
    }
}
