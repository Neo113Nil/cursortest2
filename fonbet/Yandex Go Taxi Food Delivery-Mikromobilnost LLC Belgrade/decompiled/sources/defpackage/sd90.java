package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.n;
import androidx.versionedparcelable.ParcelImpl;
import coil.compose.d;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes10.dex */
public abstract class sd90 {
    public static final ia3 a = new ia3();

    public static final Participant a(MapObjectComponentType mapObjectComponentType) {
        int i = k190.a[mapObjectComponentType.ordinal()];
        if (i == 1) {
            return Participant.BODIES;
        }
        if (i == 2) {
            return Participant.LABELS;
        }
        if (i == 3) {
            return Participant.BUBBLES;
        }
        if (i == 4) {
            return Participant.OVERLAYS;
        }
        if (i == 5) {
            return Participant.IMAGE_OVERLAYS;
        }
        w511.b();
        return null;
    }

    public static final lum b() {
        return new lum(new gse(13), ing.a, new mtw(26), jng.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer c(Map map, Participant participant, Map map2) {
        ArrayList arrayList;
        Object next;
        wp31 wp31Var;
        List list;
        try {
            list = (List) map.get(participant);
        } catch (Exception e) {
            jst.e.k(e, "State of intersections " + map + "; state of map objects collection " + map2);
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((lm00) b.g(((ro00) it.next()).b(), map2));
            }
            if (arrayList != null) {
                return null;
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int f = ((lm00) next).d.f();
                    do {
                        Object next2 = it2.next();
                        int f2 = ((lm00) next2).d.f();
                        if (f < f2) {
                            next = next2;
                            f = f2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            lm00 lm00Var = (lm00) next;
            if (lm00Var == null || (wp31Var = lm00Var.d) == null) {
                return null;
            }
            return Integer.valueOf(wp31Var.f());
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }

    public static final Map d(Uri uri) {
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            int d = gw00.d(tcc.n(queryParameterNames, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : queryParameterNames) {
                String queryParameter = uri.getQueryParameter((String) obj);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                linkedHashMap.put(obj, queryParameter);
            }
            return linkedHashMap;
        } catch (Exception e) {
            i5z0.a.e(e);
            return b.f();
        }
    }

    public static ma31 e(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(sd90.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).getVersionedParcel();
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final d f(Object obj, qav qavVar, tls tlsVar, tls tlsVar2, nhe nheVar, int i, fid fidVar, int i2) {
        hev hevVar;
        bts btsVar = (bts) fidVar;
        btsVar.f0(1645646697);
        btsVar.f0(952940650);
        jdi0 jdi0Var = sx21.b;
        btsVar.f0(1087186730);
        boolean z = obj instanceof hev;
        Object obj2 = did.a;
        if (z) {
            hevVar = (hev) obj;
            btsVar.t(false);
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.f0(375474364);
            boolean k = btsVar.k(context) | btsVar.k(obj);
            Object Q = btsVar.Q();
            if (k || Q == obj2) {
                bev bevVar = new bev(context);
                bevVar.c = obj;
                Q = bevVar.d();
                btsVar.o0(Q);
            }
            hevVar = (hev) Q;
            btsVar.t(false);
            btsVar.t(false);
        }
        Object obj3 = hevVar.b;
        if (obj3 instanceof bev) {
            ny61.g("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return null;
        }
        if (obj3 instanceof l8v) {
            n("ImageBitmap");
            throw null;
        }
        if (obj3 instanceof mgv) {
            n("ImageVector");
            throw null;
        }
        if (obj3 instanceof pa90) {
            n("Painter");
            throw null;
        }
        if (hevVar.c != null) {
            ny61.g("request.target must be null.");
            return null;
        }
        btsVar.f0(294038899);
        Object Q2 = btsVar.Q();
        if (Q2 == obj2) {
            Q2 = new d(hevVar, qavVar);
            btsVar.o0(Q2);
        }
        d dVar = (d) Q2;
        btsVar.t(false);
        dVar.F = tlsVar;
        dVar.G = tlsVar2;
        dVar.H = nheVar;
        dVar.I = i;
        dVar.J = ((Boolean) btsVar.m(n.a)).booleanValue();
        dVar.M.setValue(qavVar);
        dVar.L.setValue(hevVar);
        dVar.b();
        btsVar.t(false);
        btsVar.t(false);
        return dVar;
    }

    public static final Uri g(Uri uri, String str) {
        Object failure;
        Uri g;
        String uri2;
        try {
            Map j = b.j(str, d(uri));
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (Map.Entry entry : j.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                String l = l(uri, str2);
                if (l != null) {
                    Object obj = null;
                    try {
                        Uri parse = Uri.parse(l);
                        boolean isHierarchical = parse.isHierarchical();
                        failure = parse;
                        if (!isHierarchical) {
                            failure = null;
                        }
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (!(failure instanceof Result.Failure)) {
                        obj = failure;
                    }
                    Uri uri3 = (Uri) obj;
                    if (uri3 != null && (g = g(uri3, str)) != null && (uri2 = g.toString()) != null) {
                        str3 = uri2;
                    }
                }
                buildUpon.appendQueryParameter(str2, str3);
            }
            return buildUpon.build();
        } catch (Exception e) {
            i5z0.a.e(e);
            return uri;
        }
    }

    public static final Uri h(Uri uri, String str, String str2) {
        return i(uri, gw00.e(new Pair(str, str2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.net.Uri] */
    public static final Uri i(Uri uri, Map map) {
        String str;
        Map d = d(uri);
        if (d.isEmpty()) {
            return uri;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(d.size()));
        for (Map.Entry entry : d.entrySet()) {
            Object key = entry.getKey();
            Object obj = (String) entry.getValue();
            Uri parse = Uri.parse(obj);
            if (parse.getScheme() == null || parse.getHost() == null || parse.getPath() == null || !parse.isHierarchical() || parse.getQuery() == null) {
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    String str3 = (String) entry2.getValue();
                    Regex regex = gtu0.a;
                    if (("{{" + str2 + "}}").equals(obj) && str3 == null) {
                        str = null;
                        break;
                    }
                    if (evu0.y(obj, "{{" + str2 + "}}", false)) {
                        String p = oyr.p("{{", str2, "}}");
                        if (str3 == null) {
                            str3 = "";
                        }
                        obj = cvu0.v(obj, p, str3, false);
                    }
                }
            } else {
                obj = i(parse, map);
            }
            str = obj.toString();
            linkedHashMap.put(key, str);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = uri;
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str4 = (String) entry3.getKey();
            String str5 = (String) entry3.getValue();
            T t = ref$ObjectRef.element;
            ref$ObjectRef.element = str5 != null ? j((Uri) t, str4, str5) : g((Uri) t, str4);
        }
        return (Uri) ref$ObjectRef.element;
    }

    public static final Uri j(Uri uri, String str, String str2) {
        try {
            Map j = b.j(str, d(uri));
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            buildUpon.appendQueryParameter(str, str2);
            for (Map.Entry entry : j.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return buildUpon.build();
        } catch (Exception e) {
            i5z0.a.e(e);
            return uri;
        }
    }

    public static final Uri k(Uri uri, String str, Object obj) {
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter(str, obj.toString());
            return buildUpon.build();
        } catch (Exception e) {
            x4c.g("Error to add query to uri", e, "uri: " + uri + ", name: " + str + ", value: " + obj, null, 8);
            return uri;
        }
    }

    public static final String l(Uri uri, String str) {
        try {
            return (String) a.R(uri.getQueryParameters(str));
        } catch (Exception e) {
            x4c.g("Error to parse uri", e, "uri: " + uri + ", parameter: " + str, null, 8);
            return null;
        }
    }

    public static final String m(Uri uri) {
        return unr0.o(uri.getScheme(), "://", uri.getHost(), uri.getPath());
    }

    public static void n(String str) {
        throw new IllegalArgumentException(b64.l("Unsupported type: ", str, ". ", oyr.p("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
