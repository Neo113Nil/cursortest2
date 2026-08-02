package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class zzo {
    public final a0p a;
    public final o3h b;
    public final t61 c;

    public zzo(a0p a0pVar, o3h o3hVar, t61 t61Var) {
        this.a = a0pVar;
        this.b = o3hVar;
        this.c = t61Var;
    }

    public final Uri a(Uri uri) {
        Object obj;
        String str;
        if (og21.b(uri)) {
            this.a.getClass();
            Collection values = a0p.a().values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (a.G((List) it.next(), uri.getHost())) {
                        Iterator it2 = a0p.a().entrySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (a.G((List) ((Map.Entry) obj).getValue(), uri.getHost())) {
                                break;
                            }
                        }
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry != null && (str = (String) entry.getKey()) != null) {
                            String uri2 = uri.toString();
                            t61 t61Var = this.c;
                            t61Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("url", uri2);
                            t61Var.a.a("Deeplink.AppLinkOpened", hashMap, 1, new HashMap());
                            Uri.Builder builder = new Uri.Builder();
                            ((pux0) this.b).getClass();
                            builder.scheme(pux0.c);
                            builder.authority("external");
                            if (jl40.l(uri.getPath(), "/external")) {
                                builder.encodedQuery(uri.getEncodedQuery());
                                builder.encodedFragment(uri.getEncodedFragment());
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("service=".concat(str));
                                StringBuilder sb2 = new StringBuilder();
                                String path = uri.getPath();
                                if (path != null) {
                                    if (path.length() <= 0) {
                                        path = null;
                                    }
                                    if (path != null) {
                                        sb2.append(evu0.Q("/", path));
                                    }
                                }
                                String query = uri.getQuery();
                                if (query != null) {
                                    sb2.append("?".concat(query));
                                }
                                String fragment = uri.getFragment();
                                if (fragment != null) {
                                    sb2.append(ShimmerDivHandler.NUMBER_SING.concat(fragment));
                                }
                                String sb3 = sb2.toString();
                                if (sb3.length() <= 0) {
                                    sb3 = null;
                                }
                                String encode = sb3 != null ? URLEncoder.encode(sb3, uza.a.name()) : null;
                                if (encode != null) {
                                    sb.append("&href=".concat(encode));
                                }
                                builder.encodedQuery(sb.toString());
                            }
                            return builder.build();
                        }
                    }
                }
            }
        }
        return null;
    }
}
