package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.URL;
import java.util.Iterator;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes10.dex */
public final class xsv0 {
    public static wsv0 a(Uri uri) {
        zzs zzsVar;
        Object obj;
        String queryParameter = uri.getQueryParameter(Constants.KEY_SERVICE);
        if (queryParameter == null) {
            wsv0 wsv0Var = wsv0.e;
            tib1.i();
            return wsv0.e;
        }
        Double d = tcb1.d(uri.getQueryParameter("delivery_lat"));
        Double d2 = tcb1.d(uri.getQueryParameter("delivery_lon"));
        String queryParameter2 = uri.getQueryParameter("href");
        if (URLUtil.isValidUrl(queryParameter2)) {
            URL url = new URL(queryParameter2);
            String url2 = url.toString();
            queryParameter2 = evu0.d0(url2, url.getHost(), url2);
        }
        String queryParameter3 = uri.getQueryParameter("service_data");
        Iterator<E> it = EatsService.f().iterator();
        while (true) {
            zzsVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((EatsService) obj).getValue(), queryParameter)) {
                break;
            }
        }
        h1p h1pVar = (EatsService) obj;
        if (h1pVar == null) {
            h1pVar = new f7n(queryParameter);
        }
        if (d != null && d2 != null) {
            zzsVar = new zzs(d.doubleValue(), d2.doubleValue(), 0, null, null, 28);
        }
        return new wsv0(h1pVar, queryParameter3, queryParameter2, zzsVar);
    }
}
