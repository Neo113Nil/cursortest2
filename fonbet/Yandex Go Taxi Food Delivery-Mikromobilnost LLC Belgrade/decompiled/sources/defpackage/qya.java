package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.chargers.data.model.ChargersSupportedHostsExperiment;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class qya {
    public final dy6 a;
    public final pw2 b;

    public qya(dy6 dy6Var, pw2 pw2Var) {
        this.a = dy6Var;
        this.b = pw2Var;
    }

    public static tsa a(tq9 tq9Var) {
        String b = tq9Var.b();
        if (b == null) {
            return null;
        }
        String upperCase = b.toUpperCase(Locale.US);
        String c = tq9Var.c();
        if (c == null) {
            c = "";
        }
        return new tsa(upperCase, c, tq9Var.a().toString());
    }

    public static boolean b(Uri uri) {
        if (!jl40.l(uri.getScheme(), Constants.SCHEME) || !jl40.l(uri.getAuthority(), "go.yandex")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            pathSegments = EmptyList.a;
        }
        return cvu0.t((String) a.R(pathSegments), "chargers", true);
    }

    public static boolean c(Uri uri) {
        if (!jl40.l(uri.getScheme(), Constants.SCHEME) || !jl40.l(uri.getAuthority(), "hw.qwatt.uz")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        return jl40.l(pathSegments != null ? (String) a.R(pathSegments) : null, "scan");
    }

    public final boolean d(Uri uri) {
        ChargersSupportedHostsExperiment chargersSupportedHostsExperiment = (ChargersSupportedHostsExperiment) this.a.b.b();
        return a.G(chargersSupportedHostsExperiment.b ? chargersSupportedHostsExperiment.c : EmptySet.a, uri.getAuthority()) || b(uri) || c(uri);
    }

    public final tq9 e(Uri uri) {
        ui uiVar = ui.s;
        tq9 e = uiVar.e(uri);
        if (e != null) {
            return e;
        }
        if (!b(uri)) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> list = EmptyList.a;
        if (pathSegments == null) {
            pathSegments = list;
        }
        if (!cvu0.t((String) a.R(pathSegments), "chargers", true)) {
            pathSegments = null;
        }
        List<String> J = pathSegments != null ? a.J(pathSegments, 1) : null;
        if (J != null) {
            list = J;
        }
        Uri.Builder builder = new Uri.Builder();
        ((pux0) this.b).getClass();
        Uri.Builder authority = builder.scheme(pux0.c).authority("chargers");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            authority.appendPath((String) it.next());
        }
        for (String str : uri.getQueryParameterNames()) {
            Iterator<T> it2 = uri.getQueryParameters(str).iterator();
            while (it2.hasNext()) {
                authority.appendQueryParameter(str, (String) it2.next());
            }
        }
        return uiVar.e(authority.build());
    }
}
