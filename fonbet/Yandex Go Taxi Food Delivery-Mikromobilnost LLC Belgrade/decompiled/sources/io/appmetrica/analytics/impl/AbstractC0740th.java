package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0740th {
    public static final C0625ph a;
    public static final C0654qh b;
    public static final C0682rh c;

    static {
        NetworkType networkType = NetworkType.UNDEFINED;
        a = new C0625ph(networkType);
        b = new C0654qh(networkType);
        c = new C0682rh(2);
    }

    public static NetworkType a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        NetworkType networkType = NetworkType.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected()) : activeNetwork != null) {
            return NetworkType.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            for (Integer num : b.a.keySet()) {
                if (networkCapabilities.hasTransport(num.intValue())) {
                    return (NetworkType) b.a(num);
                }
            }
        }
        return networkType;
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!StringUtils.isNullOrEmpty(script)) {
            sb.append(LicenseUtility.SEPARATOR);
            sb.append(script);
        }
        if (!StringUtils.isNullOrEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }
}
