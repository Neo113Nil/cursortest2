package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.adjust.sdk.Constants;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import com.yandex.go.requirements.comment.summary.ui.v3.data.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$ModalHeightType;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import com.yandex.plus.log.api.LogPriority;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;
import com.ybsdk.feature.pfm.internal.ui.mappers.SelectionState;
import com.ybsdk.feature.pfm.internal.ui.viewitems.PfmFilterViewItem$Content$Mode;
import com.ybsdk.widgets.common.rangedatepicker.SelectionMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes10.dex */
public final class v920 implements u88, fbr, p6k, ev31 {
    public Object a;
    public Object b;
    public final Object c;
    public final Object w;
    public final Object x;
    public Object y;

    public v920(ep7 ep7Var, gzj gzjVar, mm7 mm7Var) {
        Size size;
        emw0 emw0Var = new emw0();
        Size size2 = null;
        this.y = null;
        this.c = new u920();
        this.x = mm7Var;
        Size[] I = ep7Var.c().I(34);
        if (I == null) {
            sgb1.d("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (emw0Var.a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : I) {
                    if (emw0.c.compare(size3, emw0.b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                I = (Size[]) arrayList.toArray(new Size[0]);
            }
            List asList = Arrays.asList(I);
            Collections.sort(asList, new y60(20));
            Size e = gzjVar.e();
            long min = Math.min(e.getWidth() * e.getHeight(), 307200L);
            int length = I.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = I[i];
                long width = size4.getWidth() * size4.getHeight();
                if (width == min) {
                    size = size4;
                    break;
                } else if (width <= min) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) asList.get(0);
        }
        this.w = size;
        Objects.toString(size);
        sgb1.g(3, "MeteringRepeating");
        this.b = c();
    }

    public static void a(Uri.Builder builder, hz40 hz40Var) {
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        String str = (String) objArr[i4];
                        for (String str2 : (Set) objArr2[i4]) {
                            if (str2.length() > 0 || !str2.equalsIgnoreCase("null")) {
                                builder.appendQueryParameter(str, str2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void b(Uri.Builder builder, Uri uri) {
        for (String str : uri.getQueryParameterNames()) {
            Iterator<T> it = uri.getQueryParameters(str).iterator();
            while (it.hasNext()) {
                builder.appendQueryParameter(str, (String) it.next());
            }
        }
    }

    public static boolean h(Uri uri) {
        return cvu0.t(uri.getScheme(), "http", true) || cvu0.t(uri.getScheme(), Constants.SCHEME, true);
    }

    public jyq0 c() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.w;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        dyq0 e = dyq0.e((u920) this.c, size);
        int i = 1;
        e.b.c = 1;
        iiv iivVar = new iiv(surface);
        this.a = iivVar;
        ni91.a(ni91.g(iivVar.e), new ht10(surface, surfaceTexture, false, 5), geb1.b());
        e.c((iiv) this.a, q8n.d, -1);
        eyq0 eyq0Var = (eyq0) this.y;
        if (eyq0Var != null) {
            eyq0Var.b();
        }
        eyq0 eyq0Var2 = new eyq0(new p8v(i, this));
        this.y = eyq0Var2;
        e.f = eyq0Var2;
        return e.d();
    }

    public aym d() {
        ynm0 ynm0Var = (ynm0) this.b;
        pex0 m = ((k) ((wiq0) this.a)).m();
        boolean z = m != null && m.z;
        if (z && ynm0Var.a(((k) ynm0Var.a).m())) {
            return new zxm(e());
        }
        if (!z && ynm0Var.a(((k) ynm0Var.a).m())) {
            return new xxm(e());
        }
        if (!z) {
            return new yxm(e());
        }
        jst.e.w(new IllegalStateException("Unknown due selector type"));
        return new zxm(e());
    }

    public String e() {
        String str;
        String a;
        pex0 m = ((k) ((wiq0) this.a)).m();
        return (m == null || (str = m.b) == null || (a = ((d6i) this.x).a(str)) == null) ? ((avj0) ((zuj0) this.y)).h(kyh0.preorder_due_select_modal_title) : a;
    }

    @Override // defpackage.p6k
    public boolean executeAction(vhk vhkVar) {
        Map map = (Map) this.a;
        Uri parse = Uri.parse(vhkVar.b);
        String host = parse.getHost();
        if (host != null && map.containsKey(host)) {
            w6k w6kVar = (w6k) map.get(host);
            if (w6kVar == null) {
                return false;
            }
            Map map2 = vhkVar.c;
            if (map2 == null) {
                map2 = b.f();
            }
            w6kVar.a(this, new w3k(map2, host), (yzh) this.b);
            return true;
        }
        z6k z6kVar = (z6k) this.x;
        rvo rvoVar = (rvo) this.w;
        String str = (String) this.y;
        fpl fplVar = (fpl) this.c;
        if (jl40.l(parse.getHost(), "set_variable")) {
            String queryParameter = parse.getQueryParameter("name");
            String queryParameter2 = parse.getQueryParameter("value");
            if (queryParameter != null && queryParameter2 != null) {
                Object valueOf = queryParameter2.equals("true") ? Boolean.TRUE : queryParameter2.equals("false") ? Boolean.FALSE : bvu0.m(10, queryParameter2) != null ? Long.valueOf(Long.parseLong(queryParameter2)) : avu0.i(queryParameter2) != null ? Double.valueOf(Double.parseDouble(queryParameter2)) : queryParameter2;
                z6kVar.b.i(valueOf instanceof Boolean ? new u131(queryParameter, ((Boolean) valueOf).booleanValue()) : valueOf instanceof Long ? new y131(queryParameter, ((Number) valueOf).longValue()) : valueOf instanceof Double ? new x131(queryParameter, ((Number) valueOf).doubleValue()) : valueOf instanceof String ? new z131(queryParameter, (String) valueOf) : new z131(queryParameter, queryParameter2));
            }
        }
        return z6kVar.handleActionUrl(str, parse, fplVar, rvoVar);
    }

    public boolean f(Uri uri, String str) {
        return cvu0.t(uri.getScheme(), (String) this.a, true) && cvu0.t(uri.getAuthority(), "plus-home-sdk", true) && cvu0.t((String) a.R(uri.getPathSegments()), str, false);
    }

    public boolean g(Uri uri) {
        Set<String> set = (Set) this.c;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            String host = uri.getHost();
            if (host != null && evu0.y(host, str, true)) {
                return true;
            }
        }
        return false;
    }

    public ome i(lrb1 lrb1Var, boolean z, boolean z2) {
        g191 g191Var = (g191) this.a;
        yfa yfaVar = (yfa) this.b;
        if (lrb1Var instanceof i4v) {
            i4v i4vVar = (i4v) lrb1Var;
            hhg hhgVar = i4vVar.a;
            w4v w4vVar = i4vVar.b;
            if (w4vVar != null) {
                return new j4v(g191Var.P(hhgVar, null), oh4.b((oh4) this.c, w4vVar, hhgVar instanceof ugg ? ((yuj0) this.y).a(rzh0.common_close, new Object[0]) : null, null, z, 4));
            }
        } else {
            if (lrb1Var instanceof z901) {
                z901 z901Var = (z901) lrb1Var;
                String str = z901Var.a;
                ky P = g191Var.P(z901Var.b, null);
                qfc qfcVar = z901Var.c;
                ldc e = qfcVar != null ? yfaVar.e(qfcVar, z) : null;
                qfc qfcVar2 = z901Var.d;
                return new ba01(str, P, e, qfcVar2 != null ? yfaVar.e(qfcVar2, z) : null, z901Var.f, z901Var.e);
            }
            if (lrb1Var instanceof xkz0) {
                xkz0 xkz0Var = (xkz0) lrb1Var;
                String str2 = xkz0Var.a;
                ky P2 = g191Var.P(xkz0Var.b, null);
                qfc qfcVar3 = xkz0Var.d;
                ldc e2 = qfcVar3 != null ? yfaVar.e(qfcVar3, z) : null;
                qfc qfcVar4 = xkz0Var.e;
                ldc e3 = qfcVar4 != null ? yfaVar.e(qfcVar4, z) : null;
                qfc qfcVar5 = xkz0Var.f;
                return new clz0(str2, P2, e2, e3, qfcVar5 != null ? yfaVar.e(qfcVar5, z) : null, xkz0Var.c, xkz0Var.h, xkz0Var.g);
            }
            if (lrb1Var instanceof zac) {
                zac zacVar = (zac) lrb1Var;
                return new abc(z2 ? zacVar.b : zacVar.a, new ky(null, new ex0(this, lrb1Var, z2, 7), 3), lzr.D);
            }
            if (!lrb1Var.equals(t121.a)) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    public Object j(Uri uri) {
        Object failure;
        pgz pgzVar = (pgz) this.b;
        try {
            failure = o(uri);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            try {
                failure = k((Uri) failure);
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
        }
        if (Result.a(failure) != null) {
            try {
                failure = k(uri);
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
        }
        if (!(failure instanceof Result.Failure)) {
            vzg vzgVar = (vzg) failure;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "DeeplinkParserImpl", "parse(" + uri + "): " + vzgVar);
            }
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            LogPriority logPriority2 = LogPriority.ERROR;
            if (pgzVar.e(logPriority2)) {
                pgzVar.b(logPriority2, "DeeplinkParserImpl", g8e.m(uri, "parse(", "): null"), a);
            }
        }
        return failure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vzg k(Uri uri) {
        Uri uri2;
        int length;
        vzg vzgVar;
        Collection collection;
        Deeplink$WebViewFormat deeplink$WebViewFormat;
        Deeplink$ModalHeightType deeplink$ModalHeightType;
        Integer num;
        Integer num2;
        Boolean bool;
        Set set;
        Boolean bool2;
        Set set2;
        Boolean bool3;
        Set set3;
        Object obj;
        Object obj2;
        String fragment;
        String fragment2;
        long[] jArr;
        int i;
        long[] jArr2;
        Set<String> queryParameterNames;
        Object obj3;
        String str = (String) this.a;
        vzg vzgVar2 = null;
        if (!uri.isAbsolute()) {
            ny61.r("Uri is not absolute!");
            return null;
        }
        if (!uri.isHierarchical()) {
            if (cvu0.t(uri.getScheme(), "mailto", true)) {
                return new pzg(uri);
            }
            ny61.r("Opaque uri is unsupported!");
            return null;
        }
        hz40 hz40Var = new hz40((Object) null);
        hz40 hz40Var2 = new hz40((Object) null);
        for (String str2 : uri.getQueryParameterNames()) {
            Object N0 = a.N0(uri.getQueryParameters(str2));
            if (cvu0.x(str2, "get_", false)) {
                hz40Var2.o(str2, N0);
            } else {
                hz40Var.o(str2, N0);
            }
        }
        Set set4 = (Set) hz40Var.m("url");
        if (set4 == null) {
            set4 = (Set) hz40Var2.m("get_url");
        }
        if (set4 != null) {
            Iterator it = set4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                Uri parse = Uri.parse((String) obj3);
                if (parse.isHierarchical() && parse.isAbsolute() && h(parse)) {
                    break;
                }
            }
            String str3 = (String) obj3;
            if (str3 != null) {
                uri2 = Uri.parse(str3);
                EmptySet emptySet = EmptySet.a;
                if (uri2 != null && (queryParameterNames = uri2.getQueryParameterNames()) != null) {
                    for (String str4 : queryParameterNames) {
                        List<String> queryParameters = uri2.getQueryParameters(str4);
                        if (cvu0.x(str4, "get_", false)) {
                            Set set5 = (Set) hz40Var2.d(str4);
                            if (set5 == null) {
                                set5 = emptySet;
                            }
                            hz40Var2.o(str4, v4r0.h(set5, queryParameters));
                        } else {
                            Set set6 = (Set) hz40Var.d(str4);
                            if (set6 == null) {
                                set6 = emptySet;
                            }
                            hz40Var.o(str4, v4r0.h(set6, queryParameters));
                        }
                    }
                }
                Object[] objArr = hz40Var2.b;
                Object[] objArr2 = hz40Var2.c;
                long[] jArr3 = hz40Var2.a;
                length = jArr3.length - 2;
                if (length < 0) {
                    int i2 = 0;
                    collection = emptySet;
                    while (true) {
                        long j = jArr3[i2];
                        vzgVar = vzgVar2;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj4 = objArr[i5];
                                    i = i4;
                                    Object obj5 = (Set) objArr2[i5];
                                    jArr2 = jArr3;
                                    hz40Var.o(evu0.Q("get_", (String) obj4), obj5);
                                } else {
                                    i = i4;
                                    jArr2 = jArr3;
                                }
                                j >>= 8;
                                i4 = i + 1;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        vzgVar2 = vzgVar;
                        jArr3 = jArr;
                    }
                } else {
                    vzgVar = null;
                    collection = emptySet;
                }
                if (!g(uri)) {
                    return new tzg(uri);
                }
                if (uri2 != null && g(uri2)) {
                    return new tzg(uri2);
                }
                if (f(uri, "home")) {
                    return l(uri, hz40Var, false, uri2);
                }
                if (f(uri, "buyplus")) {
                    return l(uri, hz40Var, true, uri2);
                }
                if (!f(uri, "smart-webview")) {
                    Collection collection2 = (Set) hz40Var.m("plus-sdk-smart-webview-enabled");
                    Collection collection3 = collection2 == null ? collection : collection2;
                    if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                        Iterator<E> it2 = collection3.iterator();
                        while (it2.hasNext()) {
                            if (Boolean.parseBoolean((String) it2.next())) {
                            }
                        }
                    }
                    if (!f(uri, "story")) {
                        if (f(uri, "debug-panel")) {
                            return nzg.a;
                        }
                        if (!f(uri, "simple-webview")) {
                            return h(uri) ? m(new Uri.Builder().scheme(str).authority("plus-home-sdk").path("simple-webview").appendQueryParameter("url", uri.toString()).build(), hz40Var, uri) : (cvu0.t(uri.getScheme(), str, true) && cvu0.t(uri.getAuthority(), "plus-home-sdk", true)) ? l(uri, hz40Var, false, uri2) : new tzg(uri);
                        }
                        if (uri2 != null) {
                            return m(uri, hz40Var, uri2);
                        }
                        ny61.g("Can't map to simple, url is absent!");
                        return vzgVar;
                    }
                    Set set7 = (Set) hz40Var.d("shortcut-id");
                    String str5 = set7 != null ? (String) a.Q(set7) : vzgVar;
                    if (str5 == 0) {
                        ny61.g("Story deeplink has no query parameter shortcut-id!");
                        return vzgVar;
                    }
                    Set set8 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                    String str6 = set8 != null ? (String) a.Q(set8) : vzgVar;
                    Uri.Builder clearQuery = (uri2 == null ? (Uri) this.x : uri2).buildUpon().clearQuery();
                    a(clearQuery, hz40Var);
                    if (uri2 == null || (fragment2 = uri2.getFragment()) == null) {
                        fragment2 = uri.getFragment();
                    }
                    return new szg(clearQuery.fragment(fragment2).build(), str5, str6);
                }
                if (uri2 == null) {
                    ny61.g("Can't parse to smart, url is absent!");
                    return vzgVar;
                }
                Set<String> set9 = (Set) hz40Var.m("openFormat");
                if (set9 != null) {
                    for (String str7 : set9) {
                        Object obj6 = cvu0.t(str7, "full", true) ? Deeplink$WebViewFormat.FULL : cvu0.t(str7, "card", true) ? Deeplink$WebViewFormat.CARD : vzgVar;
                        if (obj6 != null) {
                            deeplink$WebViewFormat = obj6;
                            break;
                        }
                    }
                }
                deeplink$WebViewFormat = vzgVar;
                Set<String> set10 = (Set) hz40Var.m("modalHeightType");
                if (set10 != null) {
                    for (String str8 : set10) {
                        Object obj7 = cvu0.t(str8, "fixed", true) ? Deeplink$ModalHeightType.FIXED : cvu0.t(str8, "percent", true) ? Deeplink$ModalHeightType.PERCENT : vzgVar;
                        if (obj7 != null) {
                            deeplink$ModalHeightType = obj7;
                            break;
                        }
                    }
                }
                deeplink$ModalHeightType = vzgVar;
                Set set11 = (Set) hz40Var.m("modalHeightValue");
                if (set11 != null) {
                    Iterator it3 = set11.iterator();
                    while (it3.hasNext()) {
                        Integer l = bvu0.l(10, (String) it3.next());
                        if (l != null) {
                            num = l;
                            break;
                        }
                    }
                }
                num = vzgVar;
                Set set12 = (Set) hz40Var.m("plus-smart-broadcast-id");
                String str9 = set12 != null ? (String) a.Q(set12) : vzgVar;
                Set set13 = (Set) hz40Var.m("shadowAlpha");
                if (set13 != null) {
                    Iterator it4 = set13.iterator();
                    while (it4.hasNext()) {
                        Integer l2 = bvu0.l(10, (String) it4.next());
                        if (l2 != null) {
                            num2 = l2;
                            break;
                        }
                    }
                }
                num2 = vzgVar;
                Set set14 = (Set) hz40Var.m("disableClose");
                if (set14 != null) {
                    Iterator it5 = set14.iterator();
                    if (it5.hasNext()) {
                        bool = Boolean.valueOf(Boolean.parseBoolean((String) it5.next()));
                        set = (Set) hz40Var.m("showNavBar");
                        if (set != null) {
                            Iterator it6 = set.iterator();
                            if (it6.hasNext()) {
                                bool2 = Boolean.valueOf(Boolean.parseBoolean((String) it6.next()));
                                set2 = (Set) hz40Var.m("showDash");
                                if (set2 != null) {
                                    Iterator it7 = set2.iterator();
                                    if (it7.hasNext()) {
                                        bool3 = Boolean.valueOf(Boolean.parseBoolean((String) it7.next()));
                                        set3 = (Set) hz40Var.m("navBarType");
                                        if (set3 != null) {
                                            Iterator it8 = set3.iterator();
                                            if (it8.hasNext()) {
                                                obj = Boolean.valueOf(cvu0.t((String) it8.next(), "CROSS_AND_ARROW", true));
                                                if (set3 != null) {
                                                    Iterator it9 = set3.iterator();
                                                    if (it9.hasNext()) {
                                                        String str10 = (String) it9.next();
                                                        obj2 = Boolean.valueOf(cvu0.t(str10, "CROSS_AND_ARROW", true) || cvu0.t(str10, "ONLY_ARROW", true));
                                                        Pair pair = new Pair(obj, obj2);
                                                        Boolean bool4 = (Boolean) pair.getFirst();
                                                        Boolean bool5 = (Boolean) pair.getSecond();
                                                        Set set15 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                                                        String str11 = set15 == null ? (String) a.Q(set15) : vzgVar;
                                                        Uri.Builder clearQuery2 = uri2.buildUpon().clearQuery();
                                                        a(clearQuery2, hz40Var);
                                                        fragment = uri2.getFragment();
                                                        if (fragment == null) {
                                                            fragment = uri.getFragment();
                                                        }
                                                        return new rzg(clearQuery2.fragment(fragment).build(), deeplink$WebViewFormat, deeplink$ModalHeightType, num, str9, num2, bool, bool2, bool3, bool4, bool5, str11);
                                                    }
                                                }
                                                obj2 = vzgVar;
                                                Pair pair2 = new Pair(obj, obj2);
                                                Boolean bool42 = (Boolean) pair2.getFirst();
                                                Boolean bool52 = (Boolean) pair2.getSecond();
                                                Set set152 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                                                if (set152 == null) {
                                                }
                                                Uri.Builder clearQuery22 = uri2.buildUpon().clearQuery();
                                                a(clearQuery22, hz40Var);
                                                fragment = uri2.getFragment();
                                                if (fragment == null) {
                                                }
                                                return new rzg(clearQuery22.fragment(fragment).build(), deeplink$WebViewFormat, deeplink$ModalHeightType, num, str9, num2, bool, bool2, bool3, bool42, bool52, str11);
                                            }
                                        }
                                        obj = vzgVar;
                                        if (set3 != null) {
                                        }
                                        obj2 = vzgVar;
                                        Pair pair22 = new Pair(obj, obj2);
                                        Boolean bool422 = (Boolean) pair22.getFirst();
                                        Boolean bool522 = (Boolean) pair22.getSecond();
                                        Set set1522 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                                        if (set1522 == null) {
                                        }
                                        Uri.Builder clearQuery222 = uri2.buildUpon().clearQuery();
                                        a(clearQuery222, hz40Var);
                                        fragment = uri2.getFragment();
                                        if (fragment == null) {
                                        }
                                        return new rzg(clearQuery222.fragment(fragment).build(), deeplink$WebViewFormat, deeplink$ModalHeightType, num, str9, num2, bool, bool2, bool3, bool422, bool522, str11);
                                    }
                                }
                                bool3 = vzgVar;
                                set3 = (Set) hz40Var.m("navBarType");
                                if (set3 != null) {
                                }
                                obj = vzgVar;
                                if (set3 != null) {
                                }
                                obj2 = vzgVar;
                                Pair pair222 = new Pair(obj, obj2);
                                Boolean bool4222 = (Boolean) pair222.getFirst();
                                Boolean bool5222 = (Boolean) pair222.getSecond();
                                Set set15222 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                                if (set15222 == null) {
                                }
                                Uri.Builder clearQuery2222 = uri2.buildUpon().clearQuery();
                                a(clearQuery2222, hz40Var);
                                fragment = uri2.getFragment();
                                if (fragment == null) {
                                }
                                return new rzg(clearQuery2222.fragment(fragment).build(), deeplink$WebViewFormat, deeplink$ModalHeightType, num, str9, num2, bool, bool2, bool3, bool4222, bool5222, str11);
                            }
                        }
                        bool2 = vzgVar;
                        set2 = (Set) hz40Var.m("showDash");
                        if (set2 != null) {
                        }
                        bool3 = vzgVar;
                        set3 = (Set) hz40Var.m("navBarType");
                        if (set3 != null) {
                        }
                        obj = vzgVar;
                        if (set3 != null) {
                        }
                        obj2 = vzgVar;
                        Pair pair2222 = new Pair(obj, obj2);
                        Boolean bool42222 = (Boolean) pair2222.getFirst();
                        Boolean bool52222 = (Boolean) pair2222.getSecond();
                        Set set152222 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                        if (set152222 == null) {
                        }
                        Uri.Builder clearQuery22222 = uri2.buildUpon().clearQuery();
                        a(clearQuery22222, hz40Var);
                        fragment = uri2.getFragment();
                        if (fragment == null) {
                        }
                        return new rzg(clearQuery22222.fragment(fragment).build(), deeplink$WebViewFormat, deeplink$ModalHeightType, num, str9, num2, bool, bool2, bool3, bool42222, bool52222, str11);
                    }
                }
                bool = vzgVar;
                set = (Set) hz40Var.m("showNavBar");
                if (set != null) {
                }
                bool2 = vzgVar;
                set2 = (Set) hz40Var.m("showDash");
                if (set2 != null) {
                }
                bool3 = vzgVar;
                set3 = (Set) hz40Var.m("navBarType");
                if (set3 != null) {
                }
                obj = vzgVar;
                if (set3 != null) {
                }
                obj2 = vzgVar;
                Pair pair22222 = new Pair(obj, obj2);
                Boolean bool422222 = (Boolean) pair22222.getFirst();
                Boolean bool522222 = (Boolean) pair22222.getSecond();
                Set set1522222 = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                if (set1522222 == null) {
                }
                Uri.Builder clearQuery222222 = uri2.buildUpon().clearQuery();
                a(clearQuery222222, hz40Var);
                fragment = uri2.getFragment();
                if (fragment == null) {
                }
                return new rzg(clearQuery222222.fragment(fragment).build(), deeplink$WebViewFormat, deeplink$ModalHeightType, num, str9, num2, bool, bool2, bool3, bool422222, bool522222, str11);
            }
        }
        uri2 = null;
        EmptySet emptySet2 = EmptySet.a;
        if (uri2 != null) {
            while (r12.hasNext()) {
            }
        }
        Object[] objArr3 = hz40Var2.b;
        Object[] objArr22 = hz40Var2.c;
        long[] jArr32 = hz40Var2.a;
        length = jArr32.length - 2;
        if (length < 0) {
        }
        if (!g(uri)) {
        }
    }

    public ozg l(Uri uri, hz40 hz40Var, boolean z, Uri uri2) {
        Uri.Builder buildUpon;
        Uri.Builder clearQuery;
        Set set = (Set) hz40Var.m(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
        String str = null;
        String str2 = set != null ? (String) a.Q(set) : null;
        Uri.Builder scheme = ((Uri) this.w).buildUpon().scheme(Constants.SCHEME);
        if (uri2 != null && (buildUpon = uri2.buildUpon()) != null && (clearQuery = buildUpon.clearQuery()) != null) {
            str = clearQuery.toString();
        }
        if (str != null) {
            scheme.appendQueryParameter("url", str);
        }
        a(scheme, hz40Var);
        return new ozg(scheme.fragment(uri.getFragment()).build(), z, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qzg m(Uri uri, hz40 hz40Var, Uri uri2) {
        Deeplink$WebViewFormat deeplink$WebViewFormat;
        Boolean bool;
        Set set;
        Boolean bool2;
        Set set2;
        Boolean bool3;
        Boolean bool4;
        Set set3;
        boolean z;
        Iterable iterable;
        Iterable iterable2;
        Iterator it;
        Uri uri3;
        boolean z2;
        String fragment;
        Set<String> set4 = (Set) hz40Var.m("openFormat");
        if (set4 != null) {
            for (String str : set4) {
                Deeplink$WebViewFormat deeplink$WebViewFormat2 = cvu0.t(str, "full", true) ? Deeplink$WebViewFormat.FULL : cvu0.t(str, "card", true) ? Deeplink$WebViewFormat.CARD : null;
                if (deeplink$WebViewFormat2 != null) {
                    deeplink$WebViewFormat = deeplink$WebViewFormat2;
                    break;
                }
            }
        }
        deeplink$WebViewFormat = null;
        Set set5 = (Set) hz40Var.m("showNavBar");
        if (set5 != null) {
            Iterator it2 = set5.iterator();
            if (it2.hasNext()) {
                bool = Boolean.valueOf(Boolean.parseBoolean((String) it2.next()));
                set = (Set) hz40Var.m("showDash");
                if (set != null) {
                    Iterator it3 = set.iterator();
                    if (it3.hasNext()) {
                        bool2 = Boolean.valueOf(Boolean.parseBoolean((String) it3.next()));
                        set2 = (Set) hz40Var.m("navBarType");
                        if (set2 != null) {
                            Iterator it4 = set2.iterator();
                            if (it4.hasNext()) {
                                bool3 = Boolean.valueOf(cvu0.t((String) it4.next(), "CROSS_AND_ARROW", true));
                                if (set2 != null) {
                                    Iterator it5 = set2.iterator();
                                    if (it5.hasNext()) {
                                        String str2 = (String) it5.next();
                                        bool4 = Boolean.valueOf(cvu0.t(str2, "CROSS_AND_ARROW", true) || cvu0.t(str2, "ONLY_ARROW", true));
                                        Pair pair = new Pair(bool3, bool4);
                                        Boolean bool5 = (Boolean) pair.getFirst();
                                        Boolean bool6 = (Boolean) pair.getSecond();
                                        set3 = (Set) hz40Var.d("plusSdkNeedAuth");
                                        if (set3 != null) {
                                            Iterator it6 = set3.iterator();
                                            Boolean valueOf = it6.hasNext() ? Boolean.valueOf(Boolean.parseBoolean((String) it6.next())) : null;
                                            if (valueOf != null) {
                                                z = valueOf.booleanValue();
                                                iterable = (Set) hz40Var.m("plusSdkOpenType");
                                                if (iterable == null) {
                                                    iterable = EmptySet.a;
                                                }
                                                iterable2 = iterable;
                                                if ((iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                                    it = iterable2.iterator();
                                                    while (it.hasNext()) {
                                                        if (cvu0.t((String) it.next(), "out", true)) {
                                                            uri3 = uri2;
                                                            break;
                                                        }
                                                    }
                                                }
                                                uri3 = uri2;
                                                if (!g(uri3)) {
                                                    z2 = false;
                                                    Uri.Builder clearQuery = uri3.buildUpon().clearQuery();
                                                    a(clearQuery, hz40Var);
                                                    fragment = uri3.getFragment();
                                                    if (fragment == null) {
                                                        fragment = uri.getFragment();
                                                    }
                                                    return new qzg(clearQuery.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool5, bool6, z);
                                                }
                                                z2 = true;
                                                Uri.Builder clearQuery2 = uri3.buildUpon().clearQuery();
                                                a(clearQuery2, hz40Var);
                                                fragment = uri3.getFragment();
                                                if (fragment == null) {
                                                }
                                                return new qzg(clearQuery2.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool5, bool6, z);
                                            }
                                        }
                                        z = true;
                                        iterable = (Set) hz40Var.m("plusSdkOpenType");
                                        if (iterable == null) {
                                        }
                                        iterable2 = iterable;
                                        if (iterable2 instanceof Collection) {
                                        }
                                        it = iterable2.iterator();
                                        while (it.hasNext()) {
                                        }
                                        uri3 = uri2;
                                        if (!g(uri3)) {
                                        }
                                        z2 = true;
                                        Uri.Builder clearQuery22 = uri3.buildUpon().clearQuery();
                                        a(clearQuery22, hz40Var);
                                        fragment = uri3.getFragment();
                                        if (fragment == null) {
                                        }
                                        return new qzg(clearQuery22.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool5, bool6, z);
                                    }
                                }
                                bool4 = null;
                                Pair pair2 = new Pair(bool3, bool4);
                                Boolean bool52 = (Boolean) pair2.getFirst();
                                Boolean bool62 = (Boolean) pair2.getSecond();
                                set3 = (Set) hz40Var.d("plusSdkNeedAuth");
                                if (set3 != null) {
                                }
                                z = true;
                                iterable = (Set) hz40Var.m("plusSdkOpenType");
                                if (iterable == null) {
                                }
                                iterable2 = iterable;
                                if (iterable2 instanceof Collection) {
                                }
                                it = iterable2.iterator();
                                while (it.hasNext()) {
                                }
                                uri3 = uri2;
                                if (!g(uri3)) {
                                }
                                z2 = true;
                                Uri.Builder clearQuery222 = uri3.buildUpon().clearQuery();
                                a(clearQuery222, hz40Var);
                                fragment = uri3.getFragment();
                                if (fragment == null) {
                                }
                                return new qzg(clearQuery222.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool52, bool62, z);
                            }
                        }
                        bool3 = null;
                        if (set2 != null) {
                        }
                        bool4 = null;
                        Pair pair22 = new Pair(bool3, bool4);
                        Boolean bool522 = (Boolean) pair22.getFirst();
                        Boolean bool622 = (Boolean) pair22.getSecond();
                        set3 = (Set) hz40Var.d("plusSdkNeedAuth");
                        if (set3 != null) {
                        }
                        z = true;
                        iterable = (Set) hz40Var.m("plusSdkOpenType");
                        if (iterable == null) {
                        }
                        iterable2 = iterable;
                        if (iterable2 instanceof Collection) {
                        }
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                        }
                        uri3 = uri2;
                        if (!g(uri3)) {
                        }
                        z2 = true;
                        Uri.Builder clearQuery2222 = uri3.buildUpon().clearQuery();
                        a(clearQuery2222, hz40Var);
                        fragment = uri3.getFragment();
                        if (fragment == null) {
                        }
                        return new qzg(clearQuery2222.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool522, bool622, z);
                    }
                }
                bool2 = null;
                set2 = (Set) hz40Var.m("navBarType");
                if (set2 != null) {
                }
                bool3 = null;
                if (set2 != null) {
                }
                bool4 = null;
                Pair pair222 = new Pair(bool3, bool4);
                Boolean bool5222 = (Boolean) pair222.getFirst();
                Boolean bool6222 = (Boolean) pair222.getSecond();
                set3 = (Set) hz40Var.d("plusSdkNeedAuth");
                if (set3 != null) {
                }
                z = true;
                iterable = (Set) hz40Var.m("plusSdkOpenType");
                if (iterable == null) {
                }
                iterable2 = iterable;
                if (iterable2 instanceof Collection) {
                }
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                uri3 = uri2;
                if (!g(uri3)) {
                }
                z2 = true;
                Uri.Builder clearQuery22222 = uri3.buildUpon().clearQuery();
                a(clearQuery22222, hz40Var);
                fragment = uri3.getFragment();
                if (fragment == null) {
                }
                return new qzg(clearQuery22222.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool5222, bool6222, z);
            }
        }
        bool = null;
        set = (Set) hz40Var.m("showDash");
        if (set != null) {
        }
        bool2 = null;
        set2 = (Set) hz40Var.m("navBarType");
        if (set2 != null) {
        }
        bool3 = null;
        if (set2 != null) {
        }
        bool4 = null;
        Pair pair2222 = new Pair(bool3, bool4);
        Boolean bool52222 = (Boolean) pair2222.getFirst();
        Boolean bool62222 = (Boolean) pair2222.getSecond();
        set3 = (Set) hz40Var.d("plusSdkNeedAuth");
        if (set3 != null) {
        }
        z = true;
        iterable = (Set) hz40Var.m("plusSdkOpenType");
        if (iterable == null) {
        }
        iterable2 = iterable;
        if (iterable2 instanceof Collection) {
        }
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        uri3 = uri2;
        if (!g(uri3)) {
        }
        z2 = true;
        Uri.Builder clearQuery222222 = uri3.buildUpon().clearQuery();
        a(clearQuery222222, hz40Var);
        fragment = uri3.getFragment();
        if (fragment == null) {
        }
        return new qzg(clearQuery222222.fragment(fragment).build(), z2, deeplink$WebViewFormat, bool, bool2, bool52222, bool62222, z);
    }

    public void n(s sVar, boolean z) {
        ((amc) this.w).f(new bl21(((com.yandex.go.requirements.comment.summary.ui.v3.data.b) ((h) this.b).a.getValue()).c, z));
        sVar.a.r(new qu(9));
    }

    public Uri o(Uri uri) {
        if (!h(uri)) {
            ny61.g("Weblink is already deeplink!");
            return null;
        }
        String str = (String) a.R(uri.getPathSegments());
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme((String) this.a).authority("plus-home-sdk").appendQueryParameter("url", uri.buildUpon().build().toString());
        if (cvu0.t(str, "story", true)) {
            return appendQueryParameter.path("story").build();
        }
        if (cvu0.t(str, "smart-webview", true) || uri.getBooleanQueryParameter("plus-sdk-smart-webview-enabled", false)) {
            return appendQueryParameter.path("smart-webview").build();
        }
        if (cvu0.t(str, "simple-webview", true)) {
            return appendQueryParameter.path("simple-webview").build();
        }
        if (cvu0.t(str, "debug-panel", true)) {
            return appendQueryParameter.path("debug-panel").build();
        }
        ny61.r("Can't wrap weblink into deeplink!");
        return null;
    }

    public Uri p(vzg vzgVar) {
        Uri uri;
        String str;
        String str2 = (String) this.a;
        if (vzgVar instanceof ozg) {
            ozg ozgVar = (ozg) vzgVar;
            Uri.Builder authority = new Uri.Builder().scheme(str2).authority("plus-home-sdk");
            boolean z = ozgVar.b;
            Uri uri2 = ozgVar.a;
            Uri.Builder path = authority.path(z ? "buyplus" : "home");
            b(path, uri2);
            String str3 = ozgVar.c;
            if (str3 != null) {
                path.appendQueryParameter(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, str3);
            }
            uri = path.fragment(uri2.getFragment()).build();
        } else {
            String str4 = "ONLY_ARROW";
            String str5 = "card";
            if (vzgVar instanceof rzg) {
                rzg rzgVar = (rzg) vzgVar;
                Uri.Builder l = vfc.l(str2, "plus-home-sdk", "smart-webview");
                Uri uri3 = rzgVar.a;
                Boolean bool = rzgVar.k;
                String uri4 = uri3.toString();
                if (uri4 != null) {
                    l.appendQueryParameter("url", uri4);
                }
                Deeplink$WebViewFormat deeplink$WebViewFormat = rzgVar.b;
                int i = deeplink$WebViewFormat == null ? -1 : b3h.a[deeplink$WebViewFormat.ordinal()];
                if (i == -1) {
                    str5 = null;
                } else if (i != 1) {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    str5 = "full";
                }
                if (str5 != null) {
                    l.appendQueryParameter("openFormat", str5);
                }
                Deeplink$ModalHeightType deeplink$ModalHeightType = rzgVar.c;
                int i2 = deeplink$ModalHeightType == null ? -1 : b3h.b[deeplink$ModalHeightType.ordinal()];
                if (i2 == -1) {
                    str = null;
                } else if (i2 == 1) {
                    str = "fixed";
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    str = "percent";
                }
                if (str != null) {
                    l.appendQueryParameter("modalHeightType", str);
                }
                Integer num = rzgVar.d;
                String num2 = num != null ? num.toString() : null;
                if (num2 != null) {
                    l.appendQueryParameter("modalHeightValue", num2);
                }
                String str6 = rzgVar.e;
                if (str6 != null) {
                    l.appendQueryParameter("plus-smart-broadcast-id", str6);
                }
                Integer num3 = rzgVar.f;
                String num4 = num3 != null ? num3.toString() : null;
                if (num4 != null) {
                    l.appendQueryParameter("shadowAlpha", num4);
                }
                Boolean bool2 = rzgVar.g;
                String bool3 = bool2 != null ? bool2.toString() : null;
                if (bool3 != null) {
                    l.appendQueryParameter("disableClose", bool3);
                }
                Boolean bool4 = rzgVar.h;
                String bool5 = bool4 != null ? bool4.toString() : null;
                if (bool5 != null) {
                    l.appendQueryParameter("showNavBar", bool5);
                }
                Boolean bool6 = rzgVar.i;
                String bool7 = bool6 != null ? bool6.toString() : null;
                if (bool7 != null) {
                    l.appendQueryParameter("showDash", bool7);
                }
                Boolean bool8 = rzgVar.j;
                Boolean bool9 = Boolean.TRUE;
                if (jl40.l(bool8, bool9) && jl40.l(bool, bool9)) {
                    str4 = "CROSS_AND_ARROW";
                } else if (!jl40.l(bool, bool9)) {
                    str4 = null;
                }
                if (str4 != null) {
                    l.appendQueryParameter("navBarType", str4);
                }
                String str7 = rzgVar.l;
                if (str7 != null) {
                    l.appendQueryParameter(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, str7);
                }
                uri = l.build();
            } else if (vzgVar instanceof szg) {
                szg szgVar = (szg) vzgVar;
                Uri.Builder l2 = vfc.l(str2, "plus-home-sdk", "story");
                String str8 = szgVar.c;
                Uri uri5 = szgVar.a;
                if (str8 != null) {
                    l2.appendQueryParameter(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, str8);
                }
                b(l2, uri5);
                uri = l2.fragment(uri5.getFragment()).build();
            } else if (vzgVar instanceof qzg) {
                qzg qzgVar = (qzg) vzgVar;
                Uri.Builder l3 = vfc.l(str2, "plus-home-sdk", "simple-webview");
                Uri uri6 = qzgVar.a;
                Boolean bool10 = qzgVar.g;
                String uri7 = uri6.toString();
                if (uri7 != null) {
                    l3.appendQueryParameter("url", uri7);
                }
                l3.appendQueryParameter("plusSdkOpenType", qzgVar.b ? "out" : "in");
                Deeplink$WebViewFormat deeplink$WebViewFormat2 = qzgVar.c;
                int i3 = deeplink$WebViewFormat2 == null ? -1 : b3h.a[deeplink$WebViewFormat2.ordinal()];
                if (i3 == -1) {
                    str5 = null;
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    str5 = "full";
                }
                if (str5 != null) {
                    l3.appendQueryParameter("openFormat", str5);
                }
                Boolean bool11 = qzgVar.d;
                String bool12 = bool11 != null ? bool11.toString() : null;
                if (bool12 != null) {
                    l3.appendQueryParameter("showNavBar", bool12);
                }
                Boolean bool13 = qzgVar.e;
                String bool14 = bool13 != null ? bool13.toString() : null;
                if (bool14 != null) {
                    l3.appendQueryParameter("showDash", bool14);
                }
                Boolean bool15 = qzgVar.f;
                Boolean bool16 = Boolean.TRUE;
                if (jl40.l(bool15, bool16) && jl40.l(bool10, bool16)) {
                    str4 = "CROSS_AND_ARROW";
                } else if (!jl40.l(bool10, bool16)) {
                    str4 = null;
                }
                if (str4 != null) {
                    l3.appendQueryParameter("navBarType", str4);
                }
                uri = l3.appendQueryParameter("plusSdkNeedAuth", String.valueOf(qzgVar.h)).build();
            } else if (vzgVar instanceof nzg) {
                uri = vfc.m(str2, "plus-home-sdk", "debug-panel");
            } else if (vzgVar instanceof pzg) {
                uri = ((pzg) vzgVar).a;
            } else {
                if (!(vzgVar instanceof tzg)) {
                    w511.b();
                    return null;
                }
                uri = ((tzg) vzgVar).a;
            }
        }
        pgz pgzVar = (pgz) this.b;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "DeeplinkParserImpl", "unparse(" + vzgVar + "): " + uri);
        }
        return uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:471:0x077b, code lost:
    
        if (r4 != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0040, code lost:
    
        if (r4 == false) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b2  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [ubb0] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [x9b0] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [s8b0] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [cdb0] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [mls] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [e9b0] */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1, types: [k9b0] */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [android.graphics.ColorMatrixColorFilter] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Object obj) {
        boolean z;
        u8j0 u8j0Var;
        kdb0 kdb0Var;
        Set set;
        ?? r15;
        boolean z2;
        ?? r8;
        ?? r20;
        ?? r2;
        Object obj2;
        s4r s4rVar;
        gbb0 gbb0Var;
        ?? r25;
        odb0 ldb0Var;
        s8b0 r8b0Var;
        ?? r29;
        cdb0 a;
        SelectionMode selectionMode;
        g9b0 b;
        List K;
        g9b0 b2;
        Object obj3;
        he60 fe60Var;
        boolean z3;
        c9b0 c9b0Var;
        int i;
        ?? k9b0Var;
        int i2;
        ?? r41;
        Object obj4;
        boolean z4;
        String str;
        u8j0 u8j0Var2;
        PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType;
        rbv k;
        m4r m4rVar;
        int i3;
        PfmFilterViewItem$Content$Mode pfmFilterViewItem$Content$Mode;
        w9b0 w9b0Var;
        Set set2;
        Object obj5;
        Text text;
        kb61 a2;
        int i4;
        u8j0 u8j0Var3;
        Object f990Var;
        wcb0 wcb0Var = (wcb0) obj;
        yfq0 yfq0Var = wcb0Var.i;
        List list = yfq0Var.a;
        if (!list.isEmpty()) {
            if (list.size() < 2) {
                g9b0 b3 = wcb0Var.b(list);
                boolean z5 = b3 != null && b3.a();
                if (wcb0Var.d() != null) {
                    if (wcb0Var.c().equals(wcb0Var.d())) {
                    }
                }
            }
            z = false;
            u8j0Var = wcb0Var.b;
            if (u8j0Var instanceof s8j0) {
                boolean z6 = u8j0Var instanceof t8j0;
                w9b0 w9b0Var2 = w9b0.a;
                if (z6) {
                    jdb0 jdb0Var = jdb0.a;
                    gbb0 gbb0Var2 = new gbb0(Collections.singletonList(cbb0.c));
                    b9b0 b9b0Var = new b9b0(Collections.singletonList(m9b0.c), z);
                    if (z) {
                        w9b0Var2 = null;
                    }
                    ldb0Var = new ndb0(gbb0Var2, b9b0Var, w9b0Var2);
                } else {
                    if (!(u8j0Var instanceof r8j0)) {
                        w511.b();
                        return null;
                    }
                    PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType2 = wcb0Var.d;
                    List list2 = wcb0Var.c;
                    int i5 = zdb0.a[pfmTransactionsDataSkeletonType2.ordinal()];
                    EmptyList emptyList = EmptyList.a;
                    if (i5 == 1 || i5 == 2) {
                        kdb0Var = jdb0.a;
                    } else {
                        if (i5 != 3) {
                            w511.b();
                            return null;
                        }
                        r9b0 r9b0Var = (r9b0) u8j0Var.a();
                        Collection collection = r9b0Var != null ? r9b0Var.b : null;
                        ListBuilder a3 = rcc.a();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            r9b0 r9b0Var2 = (r9b0) ((u8j0) it.next()).a();
                            ppl pplVar = r9b0Var2 != null ? r9b0Var2.b : null;
                            if (pplVar != null) {
                                for (Object obj6 : pplVar.a) {
                                    if (obj6 != null) {
                                        a3.add(obj6);
                                    }
                                }
                            }
                        }
                        ListBuilder j = a3.j();
                        if (collection == null) {
                            collection = emptyList;
                        }
                        ArrayList m0 = a.m0(j, collection);
                        if (((r8j0) u8j0Var).b || (u8j0Var3 = (u8j0) a.b0(list2)) == null || (u8j0Var3 instanceof r8j0)) {
                            f990Var = null;
                        } else if (u8j0Var3 instanceof t8j0) {
                            f990Var = new hyk(new eal(als0.b, false, null, 6));
                        } else {
                            if (!(u8j0Var3 instanceof s8j0)) {
                                w511.b();
                                return null;
                            }
                            f990Var = new f990(2, "PFM_PAGING_ERROR_VIEW_ITEM_ID", ((s8j0) u8j0Var3).a, false);
                        }
                        ListBuilder a4 = rcc.a();
                        a4.addAll(m0);
                        if (f990Var != null) {
                            a4.add(f990Var);
                        }
                        kdb0Var = new idb0(a4.j());
                    }
                    kdb0 kdb0Var2 = kdb0Var;
                    Set e = wcb0Var.e();
                    if (e != null) {
                        Set set3 = wcb0Var.g;
                        String str2 = wcb0Var.f;
                        if (str2 == null) {
                            str2 = wcb0Var.e;
                        }
                        Set set4 = e;
                        set = null;
                        r15 = new ArrayList(tcc.n(set4, 10));
                        Iterator it2 = set4.iterator();
                        while (it2.hasNext()) {
                            j4r j4rVar = (j4r) it2.next();
                            Iterator it3 = set3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it3.next();
                                if (jl40.l(((vcb0) obj4).a(), j4rVar.a)) {
                                    break;
                                }
                            }
                            vcb0 vcb0Var = (vcb0) obj4;
                            boolean z7 = vcb0Var != null;
                            String str3 = j4rVar.a;
                            yfq0 yfq0Var2 = yfq0Var;
                            s4r s4rVar2 = j4rVar.e;
                            Iterator it4 = it2;
                            ThemedImageUrlEntity themedImageUrlEntity = j4rVar.c;
                            boolean z8 = s4rVar2 instanceof l4r;
                            if (!z8) {
                                z4 = z8;
                                if (!(s4rVar2 instanceof r4r)) {
                                    w511.b();
                                    return null;
                                }
                                r4r r4rVar = (r4r) s4rVar2;
                                if (vcb0Var != null) {
                                    q4r q4rVar = r4rVar.c;
                                    str = str3;
                                    if (q4rVar instanceof n4r) {
                                        Iterator it5 = ((n4r) q4rVar).b.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                m4rVar = null;
                                                break;
                                            }
                                            ?? next = it5.next();
                                            Iterator it6 = it5;
                                            String str4 = ((m4r) next).d;
                                            tcb0 tcb0Var = vcb0Var instanceof tcb0 ? (tcb0) vcb0Var : null;
                                            String str5 = tcb0Var != null ? tcb0Var.b : null;
                                            if (str5 == null ? false : str4.equals(str5)) {
                                                m4rVar = next;
                                                break;
                                            }
                                            it5 = it6;
                                        }
                                        m4r m4rVar2 = m4rVar;
                                        if (m4rVar2 != null) {
                                            u8j0Var2 = u8j0Var;
                                            pfmTransactionsDataSkeletonType = pfmTransactionsDataSkeletonType2;
                                            k = job1.f(m4rVar2.b, new i4b0(2, h2b1.G));
                                        }
                                        u8j0Var2 = u8j0Var;
                                        pfmTransactionsDataSkeletonType = pfmTransactionsDataSkeletonType2;
                                    } else {
                                        u8j0Var2 = u8j0Var;
                                        pfmTransactionsDataSkeletonType = pfmTransactionsDataSkeletonType2;
                                        if (!(q4rVar instanceof p4r)) {
                                            w511.b();
                                            return null;
                                        }
                                        if (themedImageUrlEntity != null) {
                                            k = mi91.k(themedImageUrlEntity);
                                        }
                                    }
                                } else {
                                    str = str3;
                                    u8j0Var2 = u8j0Var;
                                    pfmTransactionsDataSkeletonType = pfmTransactionsDataSkeletonType2;
                                    if (themedImageUrlEntity != null) {
                                        k = mi91.k(themedImageUrlEntity);
                                    }
                                }
                                i3 = zdb0.b[j4rVar.d.ordinal()];
                                if (i3 == 1) {
                                }
                                PfmFilterViewItem$Content$Mode pfmFilterViewItem$Content$Mode2 = pfmFilterViewItem$Content$Mode;
                                Locale locale = (Locale) this.y;
                                Context context = (Context) this.a;
                                Map map = aeb0.a;
                                ycb0 ycb0Var = j4rVar.b;
                                if (!z4) {
                                }
                                if (!d.c(text)) {
                                }
                                if (text == null) {
                                }
                                r15.add(new bbb0(z7, str, k, new bdb0(ycb0Var != null ? ycb0Var.b : null, text), pfmFilterViewItem$Content$Mode2));
                                yfq0Var = yfq0Var2;
                                it2 = it4;
                                u8j0Var = u8j0Var2;
                                pfmTransactionsDataSkeletonType2 = pfmTransactionsDataSkeletonType;
                                w9b0Var2 = w9b0Var;
                                set3 = set2;
                            } else if (themedImageUrlEntity != null) {
                                k = mi91.k(themedImageUrlEntity);
                                z4 = z8;
                                str = str3;
                                u8j0Var2 = u8j0Var;
                                pfmTransactionsDataSkeletonType = pfmTransactionsDataSkeletonType2;
                                i3 = zdb0.b[j4rVar.d.ordinal()];
                                if (i3 == 1) {
                                    pfmFilterViewItem$Content$Mode = PfmFilterViewItem$Content$Mode.IDLE;
                                } else if (i3 == 2) {
                                    pfmFilterViewItem$Content$Mode = PfmFilterViewItem$Content$Mode.SELECTABLE;
                                } else {
                                    if (i3 != 3) {
                                        w511.b();
                                        return null;
                                    }
                                    pfmFilterViewItem$Content$Mode = !z7 ? PfmFilterViewItem$Content$Mode.SELECTABLE : PfmFilterViewItem$Content$Mode.RESETTABLE;
                                }
                                PfmFilterViewItem$Content$Mode pfmFilterViewItem$Content$Mode22 = pfmFilterViewItem$Content$Mode;
                                Locale locale2 = (Locale) this.y;
                                Context context2 = (Context) this.a;
                                Map map2 = aeb0.a;
                                ycb0 ycb0Var2 = j4rVar.b;
                                if (!z4) {
                                    w9b0Var = w9b0Var2;
                                    set2 = set3;
                                    if (!(s4rVar2 instanceof r4r)) {
                                        w511.b();
                                        return null;
                                    }
                                    q4r q4rVar2 = ((r4r) s4rVar2).c;
                                    if (vcb0Var != null) {
                                        if (q4rVar2 instanceof n4r) {
                                            Iterator it7 = ((n4r) q4rVar2).b.iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    obj5 = null;
                                                    break;
                                                }
                                                obj5 = it7.next();
                                                String str6 = ((m4r) obj5).d;
                                                tcb0 tcb0Var2 = vcb0Var instanceof tcb0 ? (tcb0) vcb0Var : null;
                                                String str7 = tcb0Var2 != null ? tcb0Var2.b : null;
                                                if (str7 == null ? false : str6.equals(str7)) {
                                                    break;
                                                }
                                            }
                                            m4r m4rVar3 = (m4r) obj5;
                                            if (m4rVar3 != null) {
                                                text = m4rVar3.a.a;
                                            }
                                        } else if (!(q4rVar2 instanceof p4r)) {
                                            w511.b();
                                            return null;
                                        }
                                    }
                                    text = null;
                                } else if (vcb0Var != null) {
                                    scb0 scb0Var = vcb0Var instanceof scb0 ? (scb0) vcb0Var : null;
                                    if (scb0Var != null) {
                                        Calendar calendar = scb0Var.c;
                                        Calendar calendar2 = scb0Var.b;
                                        if (calendar == null || calendar2 == null) {
                                            w9b0Var = w9b0Var2;
                                            set2 = set3;
                                            text = Text.Empty.INSTANCE;
                                        } else {
                                            Calendar calendar3 = scb0Var.d;
                                            w9b0Var = w9b0Var2;
                                            set2 = set3;
                                            if (calendar2.get(1) == calendar.get(1)) {
                                                if (calendar2.get(2) == calendar.get(2)) {
                                                    int actualMaximum = calendar2.getActualMaximum(5);
                                                    boolean z9 = calendar2.get(5) == 1;
                                                    boolean j2 = kdb1.j(calendar2, calendar3);
                                                    boolean z10 = calendar.get(5) == actualMaximum;
                                                    boolean j3 = kdb1.j(calendar, kdb1.e());
                                                    if ((z9 || j2) && (z10 || j3)) {
                                                        text = aeb0.b(calendar2.get(1), calendar2.get(2), locale2);
                                                    }
                                                }
                                                i4 = 1;
                                            } else {
                                                i4 = 1;
                                            }
                                            if (kdb1.j(calendar, calendar2)) {
                                                text = d.f(new SimpleDateFormat((calendar2.get(i4) != Calendar.getInstance().get(i4) ? YbDateFormat.SHORT_USER_DATE_ONLY : YbDateFormat.SHORT_USER_DAY_AND_MONTH_ONLY).getPattern(), Locale.getDefault()).format(calendar2.getTime()));
                                            } else if (calendar.equals(calendar2)) {
                                                text = Text.Empty.INSTANCE;
                                            } else {
                                                int i6 = Calendar.getInstance().get(1);
                                                int i7 = calendar2.get(1);
                                                int i8 = calendar.get(1);
                                                boolean z11 = i7 != i8;
                                                boolean z12 = (i7 == i6 || i8 == i6) ? false : true;
                                                Text f = d.f(new SimpleDateFormat(((z11 || z12) ? YbDateFormat.SHORT_USER_DATE_ONLY : YbDateFormat.SHORT_USER_DAY_AND_MONTH_ONLY).getPattern(), Locale.getDefault()).format(calendar2.getTime()));
                                                Text f2 = d.f(new SimpleDateFormat(((z11 || z12) ? YbDateFormat.SHORT_USER_DATE_ONLY : YbDateFormat.SHORT_USER_DAY_AND_MONTH_ONLY).getPattern(), Locale.getDefault()).format(calendar.getTime()));
                                                text = d.e(((Object) d.a(context2, f)) + " - " + ((Object) d.a(context2, f2)));
                                            }
                                        }
                                    } else {
                                        w9b0Var = w9b0Var2;
                                        set2 = set3;
                                        text = null;
                                    }
                                } else {
                                    w9b0Var = w9b0Var2;
                                    set2 = set3;
                                    if (str2 != null && (a2 = aeb0.a(str2)) != null) {
                                        text = aeb0.b(a2.a, a2.b, locale2);
                                    }
                                    text = null;
                                }
                                if (!d.c(text)) {
                                    text = null;
                                }
                                if (text == null) {
                                    text = ycb0Var2 != null ? ycb0Var2.a : null;
                                }
                                r15.add(new bbb0(z7, str, k, new bdb0(ycb0Var2 != null ? ycb0Var2.b : null, text), pfmFilterViewItem$Content$Mode22));
                                yfq0Var = yfq0Var2;
                                it2 = it4;
                                u8j0Var = u8j0Var2;
                                pfmTransactionsDataSkeletonType2 = pfmTransactionsDataSkeletonType;
                                w9b0Var2 = w9b0Var;
                                set3 = set2;
                            } else {
                                z4 = z8;
                                str = str3;
                                u8j0Var2 = u8j0Var;
                                pfmTransactionsDataSkeletonType = pfmTransactionsDataSkeletonType2;
                            }
                            k = null;
                            i3 = zdb0.b[j4rVar.d.ordinal()];
                            if (i3 == 1) {
                            }
                            PfmFilterViewItem$Content$Mode pfmFilterViewItem$Content$Mode222 = pfmFilterViewItem$Content$Mode;
                            Locale locale22 = (Locale) this.y;
                            Context context22 = (Context) this.a;
                            Map map22 = aeb0.a;
                            ycb0 ycb0Var22 = j4rVar.b;
                            if (!z4) {
                            }
                            if (!d.c(text)) {
                            }
                            if (text == null) {
                            }
                            r15.add(new bbb0(z7, str, k, new bdb0(ycb0Var22 != null ? ycb0Var22.b : null, text), pfmFilterViewItem$Content$Mode222));
                            yfq0Var = yfq0Var2;
                            it2 = it4;
                            u8j0Var = u8j0Var2;
                            pfmTransactionsDataSkeletonType2 = pfmTransactionsDataSkeletonType;
                            w9b0Var2 = w9b0Var;
                            set3 = set2;
                        }
                    } else {
                        set = null;
                        r15 = emptyList;
                    }
                    yfq0 yfq0Var3 = yfq0Var;
                    u8j0 u8j0Var4 = u8j0Var;
                    PfmTransactionsDataSkeletonType pfmTransactionsDataSkeletonType3 = pfmTransactionsDataSkeletonType2;
                    w9b0 w9b0Var3 = w9b0Var2;
                    int i9 = zdb0.a[pfmTransactionsDataSkeletonType3.ordinal()];
                    if (i9 == 1) {
                        z2 = true;
                    } else {
                        if (i9 != 2 && i9 != 3) {
                            w511.b();
                            return set;
                        }
                        z2 = false;
                    }
                    Set c = wcb0Var.c();
                    if (c.isEmpty()) {
                        c = set;
                    }
                    if (c != null) {
                        String a5 = yfq0Var3.a();
                        Set set5 = c;
                        ArrayList arrayList = new ArrayList(tcc.n(set5, 10));
                        Iterator it8 = set5.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new h9b0(((g9b0) it8.next()).b));
                        }
                        boolean G = a.G(arrayList, a5 != null ? new h9b0(a5) : set);
                        r8 = new ArrayList(tcc.n(set5, 10));
                        Iterator it9 = set5.iterator();
                        while (it9.hasNext()) {
                            g9b0 g9b0Var = (g9b0) it9.next();
                            SelectionState selectionState = !G ? SelectionState.IDLE : a5 == null ? SelectionState.IDLE : a5.equals(g9b0Var.b) ? SelectionState.SELECTED : SelectionState.DISABLED;
                            if (g9b0Var == null) {
                                w511.b();
                                return set;
                            }
                            yj70 yj70Var = (yj70) this.c;
                            yj70Var.getClass();
                            f9b0 f9b0Var = g9b0Var.g;
                            d9b0 d9b0Var = g9b0Var.e;
                            Iterator it10 = it9;
                            ccb0 ccb0Var = d9b0Var.c;
                            String str8 = a5;
                            c9b0 c9b0Var2 = d9b0Var.b;
                            if (ccb0Var instanceof bcb0) {
                                fe60Var = new ge60(yj70Var.l(((bcb0) ccb0Var).a, z2));
                                z3 = G;
                            } else {
                                if (!(ccb0Var instanceof acb0)) {
                                    w511.b();
                                    return set;
                                }
                                acb0 acb0Var = (acb0) ccb0Var;
                                z3 = G;
                                fe60Var = new fe60(yj70Var.l(acb0Var.a, z2), yj70Var.l(acb0Var.b, z2));
                            }
                            int[] iArr = xbb0.a;
                            int i10 = iArr[selectionState.ordinal()];
                            if (i10 != 1 && i10 != 2) {
                                if (i10 != 3) {
                                    w511.b();
                                    return set;
                                }
                                if (fe60Var instanceof ge60) {
                                    fe60Var = new ge60(wbb0.a(((ge60) fe60Var).a));
                                } else {
                                    if (!(fe60Var instanceof fe60)) {
                                        w511.b();
                                        return set;
                                    }
                                    fe60 fe60Var2 = (fe60) fe60Var;
                                    fe60Var = new fe60(wbb0.a(fe60Var2.a), wbb0.a(fe60Var2.b));
                                }
                            }
                            he60 he60Var = fe60Var;
                            int i11 = iArr[selectionState.ordinal()];
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    c9b0 c9b0Var3 = f9b0Var.b;
                                    if (c9b0Var3 != null) {
                                        c9b0Var = c9b0Var3;
                                        boolean z13 = z2;
                                        j9b0 j9b0Var = new j9b0(job1.f(c9b0Var.b, new dia0(23)), c9b0Var.a);
                                        String str9 = g9b0Var.a;
                                        String str10 = g9b0Var.b;
                                        String str11 = g9b0Var.c;
                                        rbv k2 = mi91.k(d9b0Var.a);
                                        int[] iArr2 = vbb0.a;
                                        i = iArr2[selectionState.ordinal()];
                                        if (i != 1) {
                                            k9b0Var = new k9b0(f9b0Var.a);
                                        } else {
                                            if (i != 2 && i != 3) {
                                                w511.b();
                                                return set;
                                            }
                                            k9b0Var = set;
                                        }
                                        i2 = iArr2[selectionState.ordinal()];
                                        if (i2 != 1 || i2 == 2) {
                                            r41 = set;
                                        } else {
                                            if (i2 != 3) {
                                                w511.b();
                                                return set;
                                            }
                                            r41 = l9b0.n;
                                        }
                                        r8.add(new l9b0(str10, str11, str9, he60Var, k2, j9b0Var, k9b0Var, r41));
                                        it9 = it10;
                                        a5 = str8;
                                        z2 = z13;
                                        G = z3;
                                    }
                                } else if (i11 != 3) {
                                    w511.b();
                                    return set;
                                }
                            }
                            c9b0Var = c9b0Var2;
                            boolean z132 = z2;
                            j9b0 j9b0Var2 = new j9b0(job1.f(c9b0Var.b, new dia0(23)), c9b0Var.a);
                            String str92 = g9b0Var.a;
                            String str102 = g9b0Var.b;
                            String str112 = g9b0Var.c;
                            rbv k22 = mi91.k(d9b0Var.a);
                            int[] iArr22 = vbb0.a;
                            i = iArr22[selectionState.ordinal()];
                            if (i != 1) {
                            }
                            i2 = iArr22[selectionState.ordinal()];
                            if (i2 != 1) {
                            }
                            r41 = set;
                            r8.add(new l9b0(str102, str112, str92, he60Var, k22, j9b0Var2, k9b0Var, r41));
                            it9 = it10;
                            a5 = str8;
                            z2 = z132;
                            G = z3;
                        }
                    } else {
                        r8 = set;
                    }
                    boolean z14 = z2;
                    if (r8 != 0) {
                        emptyList = r8;
                    }
                    if (z) {
                        r9b0 r9b0Var3 = (r9b0) u8j0Var4.a();
                        ?? r22 = r9b0Var3 != null ? r9b0Var3.a : set;
                        if (r22 != 0) {
                            ecb0 ecb0Var = (ecb0) this.b;
                            rr51 rr51Var = r22.c;
                            if (rr51Var != null) {
                                bab0 bab0Var = (bab0) ecb0Var;
                                obj3 = new ubb0(r22.a, r22.b, rr51Var, bab0Var.a().a, bab0Var.a().b, bab0Var.a().c);
                            } else {
                                obj3 = set;
                            }
                            r20 = obj3;
                            if (wcb0Var.d() != null && !list.isEmpty()) {
                                b = wcb0Var.b(list);
                                if (b == null && b.a()) {
                                    r2 = b.f;
                                } else {
                                    K = a.K(list);
                                    if (K.isEmpty()) {
                                        K = set;
                                    }
                                    b2 = K == null ? wcb0Var.b(K) : set;
                                    if (b2 == null) {
                                        r2 = b2.f;
                                    } else if (b2 != null) {
                                        w511.b();
                                        return set;
                                    }
                                }
                                if (r2 != 0) {
                                    aq80 aq80Var = (aq80) this.x;
                                    gdb0 gdb0Var = (gdb0) aq80Var.a;
                                    gdb0 gdb0Var2 = (gdb0) aq80Var.a;
                                    ycb0 ycb0Var3 = r2.a;
                                    ColorModel colorModel = ycb0Var3.b;
                                    Text.Constant constant = ycb0Var3.a;
                                    zcb0 zcb0Var = r2.b;
                                    if (zcb0Var instanceof xcb0) {
                                        if (!z14) {
                                            adb0 a6 = gdb0Var.a((xcb0) zcb0Var);
                                            gdb0Var2.getClass();
                                            obj2 = new v9b0(new bdb0(colorModel, constant), a6);
                                        }
                                        obj2 = w9b0Var3;
                                    } else {
                                        if (!(zcb0Var instanceof ycb0)) {
                                            w511.b();
                                            return set;
                                        }
                                        ycb0 ycb0Var4 = (ycb0) zcb0Var;
                                        gdb0Var.getClass();
                                        bdb0 bdb0Var = new bdb0(ycb0Var4.b, ycb0Var4.a);
                                        gdb0Var2.getClass();
                                        obj2 = new v9b0(new bdb0(colorModel, constant), bdb0Var);
                                    }
                                    gbb0 gbb0Var3 = new gbb0(r15);
                                    b9b0 b9b0Var2 = new b9b0(emptyList, z);
                                    s4rVar = wcb0Var.h;
                                    if (s4rVar == null) {
                                        uab0 uab0Var = (uab0) this.w;
                                        uab0Var.getClass();
                                        if (s4rVar instanceof l4r) {
                                            l4r l4rVar = (l4r) s4rVar;
                                            String str12 = l4rVar.b;
                                            com.ybsdk.widgets.common.bottomsheet.h a7 = uab0.a(l4rVar.a);
                                            Text.Resource resource = y390.d;
                                            Text.Resource resource2 = y390.e;
                                            Calendar calendar4 = l4rVar.c;
                                            Calendar calendar5 = l4rVar.f;
                                            Calendar calendar6 = l4rVar.g;
                                            int i12 = o9b0.a[l4rVar.d.ordinal()];
                                            if (i12 == 1) {
                                                selectionMode = SelectionMode.START_DATE;
                                            } else {
                                                if (i12 != 2) {
                                                    w511.b();
                                                    return set;
                                                }
                                                selectionMode = SelectionMode.END_DATE;
                                            }
                                            r25 = new p8b0(str12, a7, new y390(resource, resource2, new q6i0(calendar4, selectionMode, calendar5, calendar6)));
                                            gbb0Var = gbb0Var3;
                                        } else {
                                            if (!(s4rVar instanceof r4r)) {
                                                w511.b();
                                                return set;
                                            }
                                            r4r r4rVar2 = (r4r) s4rVar;
                                            ycb0 ycb0Var5 = r4rVar2.a;
                                            String str13 = r4rVar2.b;
                                            q4r q4rVar3 = r4rVar2.c;
                                            if (q4rVar3 instanceof n4r) {
                                                com.ybsdk.widgets.common.bottomsheet.h a8 = uab0.a(ycb0Var5);
                                                n4r n4rVar = (n4r) q4rVar3;
                                                List<m4r> list3 = n4rVar.b;
                                                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                                                for (m4r m4rVar4 : list3) {
                                                    String str14 = n4rVar.a;
                                                    String str15 = m4rVar4.d;
                                                    ycb0 ycb0Var6 = m4rVar4.a;
                                                    Text.Constant constant2 = ycb0Var6.a;
                                                    ColorModel colorModel2 = ycb0Var6.b;
                                                    if (colorModel2 == null) {
                                                        colorModel2 = y390.f;
                                                    }
                                                    ColorModel colorModel3 = colorModel2;
                                                    gbb0 gbb0Var4 = gbb0Var3;
                                                    rbv d = j5a0.d(m4rVar4.b, 0, 3);
                                                    zcb0 zcb0Var2 = m4rVar4.c;
                                                    if (zcb0Var2 != null) {
                                                        gdb0 gdb0Var3 = uab0Var.a;
                                                        if (zcb0Var2 instanceof ycb0) {
                                                            ycb0 ycb0Var7 = (ycb0) zcb0Var2;
                                                            gdb0Var3.getClass();
                                                            a = new bdb0(ycb0Var7.b, ycb0Var7.a);
                                                        } else {
                                                            if (!(zcb0Var2 instanceof xcb0)) {
                                                                w511.b();
                                                                return set;
                                                            }
                                                            a = gdb0Var3.a((xcb0) zcb0Var2);
                                                        }
                                                        r29 = a;
                                                    } else {
                                                        r29 = set;
                                                    }
                                                    arrayList2.add(new dab0(str15, d, constant2, colorModel3, r29, str14 == null ? false : str14.equals(m4rVar4.d)));
                                                    gbb0Var3 = gbb0Var4;
                                                }
                                                gbb0Var = gbb0Var3;
                                                r8b0Var = new q8b0(str13, a8, new gab0(arrayList2));
                                            } else {
                                                gbb0Var = gbb0Var3;
                                                if (!(q4rVar3 instanceof p4r)) {
                                                    w511.b();
                                                    return set;
                                                }
                                                com.ybsdk.widgets.common.bottomsheet.h a9 = uab0.a(ycb0Var5);
                                                Set<o4r> set6 = ((p4r) q4rVar3).a;
                                                ArrayList arrayList3 = new ArrayList(tcc.n(set6, 10));
                                                for (o4r o4rVar : set6) {
                                                    String str16 = o4rVar.b;
                                                    ycb0 ycb0Var8 = o4rVar.a;
                                                    Text.Constant constant3 = ycb0Var8.a;
                                                    ColorModel colorModel4 = ycb0Var8.b;
                                                    if (colorModel4 == null) {
                                                        colorModel4 = y390.f;
                                                    }
                                                    arrayList3.add(new nab0(str16, constant3, colorModel4, o4rVar.c));
                                                }
                                                r8b0Var = new r8b0(str13, a9, new gab0(arrayList3));
                                            }
                                            r25 = r8b0Var;
                                        }
                                    } else {
                                        gbb0Var = gbb0Var3;
                                        r25 = set;
                                    }
                                    ldb0Var = new ldb0(r20, kdb0Var2, gbb0Var, obj2, b9b0Var2, r25);
                                } else {
                                    int i13 = zdb0.a[pfmTransactionsDataSkeletonType3.ordinal()];
                                    if (i13 != 1 && i13 != 2) {
                                        if (i13 != 3) {
                                            w511.b();
                                            return set;
                                        }
                                    }
                                    obj2 = set;
                                    gbb0 gbb0Var32 = new gbb0(r15);
                                    b9b0 b9b0Var22 = new b9b0(emptyList, z);
                                    s4rVar = wcb0Var.h;
                                    if (s4rVar == null) {
                                    }
                                    ldb0Var = new ldb0(r20, kdb0Var2, gbb0Var, obj2, b9b0Var22, r25);
                                }
                            }
                            r2 = set;
                            if (r2 != 0) {
                            }
                        }
                    }
                    r20 = set;
                    if (wcb0Var.d() != null) {
                        b = wcb0Var.b(list);
                        if (b == null) {
                        }
                        K = a.K(list);
                        if (K.isEmpty()) {
                        }
                        if (K == null) {
                        }
                        if (b2 == null) {
                        }
                    }
                    r2 = set;
                    if (r2 != 0) {
                    }
                }
            } else {
                ldb0Var = new mdb0(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            }
            return new ydb0(fab1.c(wcb0Var.a, BottomBarItemId.HISTORY), ldb0Var);
        }
        z = true;
        u8j0Var = wcb0Var.b;
        if (u8j0Var instanceof s8j0) {
        }
        return new ydb0(fab1.c(wcb0Var.a, BottomBarItemId.HISTORY), ldb0Var);
    }

    public v920(s8s s8sVar, sy4 sy4Var) {
        this.a = s8sVar;
        this.b = sy4Var;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: t8s
            public final /* synthetic */ v920 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                v920 v920Var = this.b;
                switch (i2) {
                    case 0:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).c.getValue());
                    case 1:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).d.getValue());
                    case 2:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).e.getValue());
                    default:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).f.getValue());
                }
            }
        });
        final int i2 = 1;
        this.w = kotlin.a.a(new sls(this) { // from class: t8s
            public final /* synthetic */ v920 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                v920 v920Var = this.b;
                switch (i22) {
                    case 0:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).c.getValue());
                    case 1:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).d.getValue());
                    case 2:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).e.getValue());
                    default:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).f.getValue());
                }
            }
        });
        final int i3 = 2;
        this.x = kotlin.a.a(new sls(this) { // from class: t8s
            public final /* synthetic */ v920 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                v920 v920Var = this.b;
                switch (i22) {
                    case 0:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).c.getValue());
                    case 1:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).d.getValue());
                    case 2:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).e.getValue());
                    default:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).f.getValue());
                }
            }
        });
        final int i4 = 3;
        this.y = kotlin.a.a(new sls(this) { // from class: t8s
            public final /* synthetic */ v920 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                v920 v920Var = this.b;
                switch (i22) {
                    case 0:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).c.getValue());
                    case 1:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).d.getValue());
                    case 2:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).e.getValue());
                    default:
                        return ((s8s) v920Var.a).a((my4) ((sy4) v920Var.b).f.getValue());
                }
            }
        });
    }

    public v920(String str, String str2, String str3, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, tls tlsVar3, tls tlsVar4) {
        this.a = tlsVar;
        this.b = tlsVar2;
        this.c = slsVar;
        this.w = slsVar2;
        this.x = tlsVar3;
        this.y = tlsVar4;
    }

    public v920(String str, rkd0 rkd0Var, Set set, Uri uri, Uri uri2) {
        this.a = str;
        this.b = rkd0Var;
        this.c = set;
        this.w = uri;
        this.x = uri2;
        this.y = kotlin.a.a(new ybf(18, this));
    }

    public v920(rqo rqoVar, ycq0 ycq0Var, g8a0 g8a0Var, lw90 lw90Var, dqe0 dqe0Var, chh chhVar) {
        this.a = ycq0Var;
        this.b = g8a0Var;
        this.c = lw90Var;
        this.w = dqe0Var;
        this.x = chhVar;
        this.y = ((jbh) rqoVar).a(SimpleBooleanExperiment.PRESELECT_CASH);
    }

    public v920(wop0 wop0Var, Context context, ecb0 ecb0Var, yj70 yj70Var, uab0 uab0Var, aq80 aq80Var) {
        this.a = context;
        this.b = ecb0Var;
        this.c = yj70Var;
        this.w = uab0Var;
        this.x = aq80Var;
        this.y = new Locale(wop0Var.a());
    }

    public v920(cke ckeVar, wxk wxkVar) {
        this.a = wxkVar;
        i5m.b(new b55(12, ckeVar));
        this.b = i5m.b(mul.a);
        this.c = new ywf(4, wxkVar);
        n3w a = n3w.a(wxkVar);
        this.w = a;
        this.x = i5m.b(new fwc((ywf) this.c, i5m.b(new kk(a, 26)), 24));
        this.y = i5m.b(new faj((n3w) this.w, 21));
    }

    public /* synthetic */ v920(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
        this.y = obj6;
    }

    public v920(tu5 tu5Var, m2v m2vVar, xqw xqwVar, y931 y931Var, PaymentMethodVerificationSession paymentMethodVerificationSession) {
        this.b = tu5Var;
        this.c = m2vVar;
        this.w = xqwVar;
        this.x = y931Var;
        this.y = paymentMethodVerificationSession;
        this.a = tu5Var;
    }
}
