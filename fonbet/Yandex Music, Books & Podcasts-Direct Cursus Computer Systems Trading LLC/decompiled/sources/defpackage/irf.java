package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.Layout;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class irf {
    public static final wn5 a = new wn5(new h3(10), -1330960509, false);
    public static final wn5 b = new wn5(new h3(11), 1088349818, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final aaw g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;

    static {
        int i2 = 21;
        new wn5(new t83(i2), 263886368, false);
        c = new wn5(new jo5(1), -2135197536, false);
        new wn5(new io5(6), 313782401, false);
        d = new wn5(new ro5(7), 567529889, false);
        e = new wn5(new ap5(i2), 914308342, false);
        int i3 = 22;
        f = new wn5(new ap5(i3), -1747656137, false);
        g = new aaw(i3);
        h = new byte[]{48, 49, 53, 0};
        i = new byte[]{48, 49, 48, 0};
        j = new byte[]{48, 48, 57, 0};
        k = new byte[]{48, 48, 53, 0};
        l = new byte[]{48, 48, 49, 0};
        m = new byte[]{48, 48, 49, 0};
        n = new byte[]{48, 48, 50, 0};
    }

    public static final void A(fvf fvfVar, List list, Function1 function1, Function1 function12, hq5 hq5Var, int i2) {
        fvfVar.getClass();
        list.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1372822918);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.h(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024);
        if (!oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.S();
        } else if (list.isEmpty()) {
            oq5Var.Z(-1088550067);
            o(0, oq5Var);
            oq5Var.p(false);
        } else {
            oq5Var.Z(-1088759627);
            z(fvfVar, list, function1, function12, oq5Var, i3 & 8190);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g98(fvfVar, list, function1, function12, i2, 1);
        }
    }

    public static final float B(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject C(q27 q27Var) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str;
        BigDecimal bigDecimal;
        JSONArray jSONArray2 = new JSONArray();
        List list = q27Var.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p27 p27Var = (p27) it.next();
            JSONObject jSONObject2 = new JSONObject();
            String str2 = p27Var.a;
            bm2 bm2Var = p27Var.f;
            JSONObject put = jSONObject2.put("methodType", str2).put("methodBank", p27Var.b).put("title", p27Var.c).put("subtitle", bm2Var != null ? "" : p27Var.d).putOpt("currency", bm2Var != null ? bm2Var.b : null).put("balanceValue", (bm2Var == null || (bigDecimal = bm2Var.a) == null) ? null : Integer.valueOf(bigDecimal.intValue())).put("logoUrl", p27Var.e).put("titleTrailingIconUrl", p27Var.i);
            List list2 = p27Var.j;
            if (list2 != null) {
                List list3 = list2;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                List list4 = list3;
                if (list4 != null) {
                    jSONArray = new JSONArray();
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put((String) it2.next());
                    }
                    JSONObject put2 = put.put("restrictions", jSONArray).put("errorRespCode", p27Var.k);
                    str = p27Var.l;
                    if (str == null) {
                        r6 = new JSONObject(str);
                    }
                    put2.putOpt("payload", r6);
                    arrayList.add(put2);
                }
            }
            jSONArray = null;
            JSONObject put22 = put.put("restrictions", jSONArray).put("errorRespCode", p27Var.k);
            str = p27Var.l;
            if (str == null) {
            }
            put22.putOpt("payload", r6);
            arrayList.add(put22);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            jSONArray2.put((JSONObject) it3.next());
        }
        Map map = q27Var.g;
        if (map != null) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            jSONObject = null;
        }
        JSONObject put3 = new JSONObject().put("template", "SelectMethodScreen").put("lang", Locale.getDefault().getLanguage());
        JSONObject putOpt = new JSONObject().put("paymentMethods", jSONArray2).put("selectedPosition", q27Var.b).put("canShowPromo", q27Var.c).putOpt("orderAmount", q27Var.d).putOpt("metaJson", q27Var.f);
        String str3 = q27Var.e;
        if (str3 == null) {
            str3 = "RUB";
        }
        JSONObject putOpt2 = putOpt.put("currency", str3).putOpt("legalUrlsMap", jSONObject);
        String str4 = q27Var.h;
        putOpt2.putOpt("payload", str4 != null ? new JSONArray(str4) : null);
        JSONObject put4 = put3.put("data", putOpt2);
        put4.getClass();
        return put4;
    }

    public static final sjb D(laa laaVar) {
        laaVar.getClass();
        if (Intrinsics.d(laaVar, haa.a)) {
            return sjb.DeleteDownload;
        }
        if (laaVar instanceof iaa) {
            return sjb.DeleteDownload;
        }
        if (Intrinsics.d(laaVar, jaa.a)) {
            return null;
        }
        if (laaVar instanceof kaa) {
            return sjb.Download;
        }
        b6e.s();
        return null;
    }

    public static final thj E(bjv bjvVar, spd spdVar) {
        spdVar.getClass();
        int i2 = spdVar.b;
        int i3 = spdVar.a;
        if (bjvVar instanceof xiv) {
            return c3x.w(((xiv) bjvVar).d, i3, i2);
        }
        if (bjvVar instanceof yiv) {
            return y7g.I(i3, i2, ((yiv) bjvVar).e);
        }
        if (bjvVar instanceof ziv) {
            return new thj(pkb.Link, ((ziv) bjvVar).b, spdVar.a, spdVar.b, "");
        }
        if (bjvVar instanceof ajv) {
            return new thj(pkb.Wave, CollectionsKt.X(o8g.R(((ajv) bjvVar).d.a.b), null, null, null, null, 63), i3 + 1, i2 + 1, "");
        }
        b6e.s();
        return null;
    }

    public static final void G(JSONObject jSONObject, String str, String str2) {
        jSONObject.getClass();
        str.getClass();
        str2.getClass();
        jSONObject.put(str, str2);
    }

    public static final String H(double d2) {
        return ((int) (((double) 100) * d2)) % 100 == 0 ? String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
    }

    public static final String I(Context context, double d2, String str, g0c g0cVar) {
        context.getClass();
        str.getClass();
        String string = context.getString(R.string.paymentsdk_prebuilt_pay_sum_format, H(d2), K(str, g0cVar));
        string.getClass();
        return string;
    }

    public static final String J(Context context, wgk wgkVar, g0c g0cVar) {
        String str;
        context.getClass();
        wgkVar.getClass();
        eck eckVar = wgkVar.g;
        if (eckVar == null || (str = eckVar.a) == null) {
            str = wgkVar.a;
        }
        String str2 = wgkVar.b;
        str.getClass();
        str2.getClass();
        Double h2 = b.h(str);
        if (h2 != null) {
            return I(context, h2.doubleValue(), str2, g0cVar);
        }
        String string = context.getString(R.string.paymentsdk_prebuilt_pay_sum_format, str, K(str2, g0cVar));
        string.getClass();
        return string;
    }

    public static final String K(String str, g0c g0cVar) {
        Currency currency;
        str.getClass();
        if (str.equals("RUB")) {
            return "₽";
        }
        try {
            currency = Currency.getInstance(str);
        } catch (IllegalArgumentException unused) {
            if (g0cVar != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k2 = su4.k("Ошибка при парсинге валюты", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k2.u(qee.n() + ci0Var.a, "eventus_id");
                ((x60) g0cVar).a(su4.j(k2, "event_name", "currency_parse_error", "currency_parse_error", k2));
            }
            currency = null;
        }
        String symbol = currency != null ? currency.getSymbol() : null;
        return symbol == null ? str : symbol;
    }

    public static final int L(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static String M() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String N() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }

    public static String O(Context context, int i2) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return k5r.i(i2, "?");
        }
    }

    public static String P(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static final tgo Q(qo6 qo6Var, hq5 hq5Var) {
        qo6Var.getClass();
        switch (qo6Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
                oq5 oq5Var = (oq5) hq5Var;
                oq5Var.Z(595264614);
                tgo F = o5g.F(oq5Var);
                oq5Var.p(false);
                return F;
            case 3:
            case 13:
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(595266910);
                oq5Var2.p(false);
                return ugo.a;
            default:
                throw vz1.i((oq5) hq5Var, 595252687, false);
        }
    }

    public static final tgo R(qo6 qo6Var, hq5 hq5Var) {
        qo6Var.getClass();
        switch (qo6Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
                oq5 oq5Var = (oq5) hq5Var;
                oq5Var.Z(-1138692424);
                tgo E = o5g.E(oq5Var);
                oq5Var.p(false);
                return E;
            case 3:
            case 13:
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(-1138690096);
                oq5Var2.p(false);
                return ugo.a;
            default:
                throw vz1.i((oq5) hq5Var, -1138704350, false);
        }
    }

    public static final Function0 S(Function0 function0, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1062294308);
        if (function0 == null) {
            oq5Var.p(false);
            return null;
        }
        msd msdVar = (msd) oq5Var.j(es5.l);
        boolean h2 = ((((i2 & 14) ^ 6) > 4 && oq5Var.f(function0)) || (i2 & 6) == 4) | oq5Var.h(msdVar);
        Object K = oq5Var.K();
        if (h2 || K == gq5.a) {
            K = new acc(function0, msdVar, 1);
            oq5Var.k0(K);
        }
        Function0 function02 = (Function0) K;
        oq5Var.p(false);
        return function02;
    }

    public static final void T(Uri.Builder builder, String str) {
        builder.getClass();
        Map b2 = tah.b(new Pair("wl", str));
        b2.getClass();
        Uri build = builder.build();
        builder.clearQuery();
        Set<String> queryParameterNames = build.getQueryParameterNames();
        queryParameterNames.getClass();
        for (String str2 : queryParameterNames) {
            if (!b2.keySet().contains(str2)) {
                builder.appendQueryParameter(str2, build.getQueryParameter(str2));
            }
        }
        for (Map.Entry entry : b2.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static vx6 U(int i2, q3c q3cVar) {
        boolean z = false;
        return new vx6(new ehm(i2), q3cVar, g, z, 19);
    }

    public static final void V(r7f r7fVar, Object obj) {
        r7fVar.getClass();
        if (obj == null) {
            r7fVar.B0();
            return;
        }
        if (obj instanceof Map) {
            r7fVar.j();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                r7fVar.Z(String.valueOf(key));
                V(r7fVar, value);
            }
            r7fVar.p();
            return;
        }
        if (obj instanceof List) {
            r7fVar.m();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                V(r7fVar, it.next());
            }
            r7fVar.l();
            return;
        }
        if (obj instanceof Boolean) {
            r7fVar.J(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            r7fVar.u(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            r7fVar.t(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            r7fVar.y(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof o5f) {
            r7fVar.i0((o5f) obj);
        } else if (obj instanceof String) {
            r7fVar.m0((String) obj);
        } else {
            rj7.i(obj, " to Json", "Cannot write ");
        }
    }

    public static final void a(int i2, int i3, hq5 hq5Var, rab rabVar, yci yciVar, Function0 function0, Function0 function02, boolean z) {
        int i4;
        rab rabVar2;
        yci yciVar2;
        Function0 function03;
        Function0 function04;
        boolean z2;
        function0.getClass();
        rabVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-490932703);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var.f(rabVar) : oq5Var.h(rabVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z3 = i5 != 0 ? false : z;
            int i6 = (i4 & 14) | 384 | (i4 & 112);
            int i7 = i4 << 3;
            function03 = function0;
            b(function03, rabVar, zpd.f, yciVar, function02, z3, oq5Var, i6 | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
            rabVar2 = rabVar;
            yciVar2 = yciVar;
            function04 = function02;
            z2 = z3;
        } else {
            rabVar2 = rabVar;
            yciVar2 = yciVar;
            function03 = function0;
            function04 = function02;
            oq5Var.S();
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pt(function03, rabVar2, yciVar2, function04, z2, i2, i3);
        }
    }

    public static final void b(Function0 function0, rab rabVar, zpd zpdVar, yci yciVar, Function0 function02, boolean z, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        function0.getClass();
        rabVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2094047886);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(rabVar) : oq5Var2.h(rabVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(zpdVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var = oq5Var2;
            j66.p(rabVar.d, o5g.F(oq5Var2), a.a(yciVar, "album_grid_item"), function0, qo6.b, function02, null, ild.C(-1105517376, new qt(z, zpdVar, rabVar, 0), oq5Var2), oq5Var, ((i3 << 9) & 7168) | 12607488 | ((i3 << 3) & 458752), 64);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(function0, rabVar, zpdVar, yciVar, function02, z, i2);
        }
    }

    public static final void c(Function0 function0, rab rabVar, yci yciVar, Function0 function02, hq5 hq5Var, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1229717404);
        int i3 = i2 | (oq5Var.h(function0) ? 4 : 2) | (oq5Var.f(rabVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | 24576;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = (i3 & 14) | 384 | (i3 & 112);
            int i5 = i3 << 3;
            b(function0, rabVar, zpd.g, yciVar, function02, false, oq5Var, (i5 & 57344) | i4 | (i5 & 7168) | 196608);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 4, function0, rabVar, yciVar, function02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, yci yciVar, yci yciVar2, Function1 function1, hq5 hq5Var, int i2, int i3) {
        Function1 function12;
        oq5 oq5Var;
        yci yciVar3;
        Function1 function13;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1545769870);
        int i4 = (oq5Var2.f(str) ? 4 : 2) | i2 | (oq5Var2.f(yciVar) ? 32 : 16);
        int i5 = i4 | 384;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            function12 = function1;
            i5 |= oq5Var2.h(function12) ? 2048 : 1024;
            if ((i5 & 1171) == 1170 || !oq5Var2.z()) {
                if (i6 != 0) {
                    function12 = null;
                }
                Function1 function14 = function12;
                int i7 = (i5 & 14) | 1769520;
                int i8 = i5 << 3;
                oq5Var = oq5Var2;
                w1g.j(str, null, yciVar, null, function14, b2c.f, hd6.a, 0.0f, null, 0, ild.C(-2065320046, new h3(2), oq5Var2), oq5Var, i7 | (i8 & 896) | (i8 & 57344), 904);
                yciVar3 = vci.a;
                function13 = function14;
            } else {
                oq5Var2.S();
                yciVar3 = yciVar2;
                oq5Var = oq5Var2;
                function13 = function12;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq((Object) str, yciVar, (Object) yciVar3, (Object) function13, i2, i3, 2);
                return;
            }
            return;
        }
        function12 = function1;
        if ((i5 & 1171) == 1170) {
        }
        if (i6 != 0) {
        }
        Function1 function142 = function12;
        int i72 = (i5 & 14) | 1769520;
        int i82 = i5 << 3;
        oq5Var = oq5Var2;
        w1g.j(str, null, yciVar, null, function142, b2c.f, hd6.a, 0.0f, null, 0, ild.C(-2065320046, new h3(2), oq5Var2), oq5Var, i72 | (i82 & 896) | (i82 & 57344), 904);
        yciVar3 = vci.a;
        function13 = function142;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void e(fvf fvfVar, List list, Function1 function1, Function1 function12, hq5 hq5Var, int i2) {
        fvfVar.getClass();
        list.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1012064142);
        int i3 = i2 | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.h(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            yci a2 = a.a(d.c(vci.a, 1.0f), "column_artists");
            vm C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 12, 0.0f, 0.0f, 13), zs4.g(oq5Var)), ogp.A(oq5Var));
            boolean h2 = ((i3 & 896) == 256) | oq5Var.h(list) | ((i3 & 7168) == 2048);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new g3(22, list, function1, function12);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 << 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g98(fvfVar, list, function1, function12, i2, 3);
        }
    }

    public static final void f(fvf fvfVar, List list, Function1 function1, Function1 function12, hq5 hq5Var, int i2) {
        fvfVar.getClass();
        list.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1782495390);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.h(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024);
        if (!oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.S();
        } else if (list.isEmpty()) {
            oq5Var.Z(655890821);
            o(0, oq5Var);
            oq5Var.p(false);
        } else {
            oq5Var.Z(655686066);
            e(fvfVar, list, function1, function12, oq5Var, i3 & 8190);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g98(fvfVar, list, function1, function12, i2, 0);
        }
    }

    public static final void g(z43 z43Var, yci yciVar, o0k o0kVar, boolean z, hq5 hq5Var, int i2) {
        o0k c2;
        boolean z2;
        o0k o0kVar2;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1323791855);
        if (((i2 | (oq5Var.f(z43Var) ? 4 : 2) | 11392) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            o0kVar2 = o0kVar;
            z3 = z;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                c2 = r43.c(null, null, 15);
                z2 = false;
            } else {
                oq5Var.S();
                c2 = o0kVar;
                z2 = z;
            }
            oq5Var.q();
            if (z43Var.a != null) {
                oq5Var.Z(-693119395);
                h(z43Var.a, yciVar, null, c2, null, z2, ild.C(2046306538, new j3(29, z43Var), oq5Var), false, null, oq5Var, 1597488, 384);
            } else {
                oq5Var.Z(-696227951);
            }
            oq5Var.p(false);
            o0kVar2 = c2;
            z3 = z2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(z43Var, yciVar, o0kVar2, z3, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(String str, yci yciVar, String str2, o0k o0kVar, Function0 function0, boolean z, Function2 function2, boolean z2, String str3, hq5 hq5Var, int i2, int i3) {
        int i4;
        int i5;
        String str4;
        o0k o0kVar2;
        int i6;
        Function0 function02;
        boolean z3;
        int i7;
        Function2 function22;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        o0k o0kVar3;
        boolean z4;
        String str5;
        yci yciVar2;
        o0k o0kVar4;
        String str6;
        boolean z5;
        boolean z6;
        Function0 function03;
        Function2 function23;
        oq5 oq5Var;
        yci yciVar3;
        String str7;
        o0k o0kVar5;
        Function0 function04;
        boolean z7;
        Function2 function24;
        boolean z8;
        String str8;
        xmn r;
        int i13;
        int i14;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1750755707);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                str4 = str2;
                i4 |= oq5Var2.f(str4) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        o0kVar2 = o0kVar;
                        if (oq5Var2.f(o0kVar2)) {
                            i14 = 2048;
                            i4 |= i14;
                        }
                    } else {
                        o0kVar2 = o0kVar;
                    }
                    i14 = 1024;
                    i4 |= i14;
                } else {
                    o0kVar2 = o0kVar;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i4 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            z3 = z;
                            if (oq5Var2.g(z3)) {
                                i13 = SQLiteDatabase.OPEN_SHAREDCACHE;
                                i4 |= i13;
                            }
                        } else {
                            z3 = z;
                        }
                        i13 = SQLiteDatabase.OPEN_FULLMUTEX;
                        i4 |= i13;
                    } else {
                        z3 = z;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i2) == 0) {
                        function22 = function2;
                        i4 |= oq5Var2.h(function22) ? 1048576 : 524288;
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i9 = i4 | 12582912;
                        } else {
                            int i16 = i4;
                            if ((i2 & 12582912) == 0) {
                                i9 = i16 | (oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
                            } else {
                                i9 = i16;
                            }
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i9 |= 100663296;
                            i11 = i10;
                        } else if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i9 |= oq5Var2.f(str3) ? 67108864 : 33554432;
                        } else {
                            i11 = i10;
                        }
                        i12 = i9;
                        if ((i12 & 38347923) == 38347922 || !oq5Var2.z()) {
                            oq5Var2.U();
                            if ((i2 & 1) != 0 || oq5Var2.y()) {
                                yci yciVar4 = i15 != 0 ? vci.a : yciVar;
                                if (i5 != 0) {
                                    str4 = null;
                                }
                                if ((i3 & 8) != 0) {
                                    o0kVar3 = r43.c(null, null, 15);
                                    i12 &= -7169;
                                } else {
                                    o0kVar3 = o0kVar2;
                                }
                                if (i6 != 0) {
                                    function02 = null;
                                }
                                if ((i3 & 32) != 0) {
                                    z4 = function02 != null;
                                    i12 &= -458753;
                                } else {
                                    z4 = z3;
                                }
                                Function2 C = i7 != 0 ? ild.C(-1672903794, new da1(str4, 1), oq5Var2) : function22;
                                boolean z9 = i8 == 0 ? z2 : false;
                                if (i11 != 0) {
                                    yciVar2 = yciVar4;
                                    str5 = null;
                                } else {
                                    str5 = str3;
                                    yciVar2 = yciVar4;
                                }
                                o0kVar4 = o0kVar3;
                                str6 = str4;
                                z5 = z4;
                                z6 = z9;
                                function03 = function02;
                                function23 = C;
                            } else {
                                oq5Var2.S();
                                if ((i3 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                if ((i3 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                yciVar2 = yciVar;
                                z6 = z2;
                                str5 = str3;
                                o0kVar4 = o0kVar2;
                                function03 = function02;
                                z5 = z3;
                                function23 = function22;
                                str6 = str4;
                            }
                            oq5Var2.q();
                            oq5Var = oq5Var2;
                            i(str, yciVar2, str6, o0kVar4, function03, z5, function23, z6, str5, oq5Var, i12 & 268435454);
                            yciVar3 = yciVar2;
                            str7 = str6;
                            o0kVar5 = o0kVar4;
                            function04 = function03;
                            z7 = z5;
                            function24 = function23;
                            z8 = z6;
                            str8 = str5;
                        } else {
                            oq5Var2.S();
                            yciVar3 = yciVar;
                            oq5Var = oq5Var2;
                            str7 = str4;
                            o0kVar5 = o0kVar2;
                            function04 = function02;
                            z7 = z3;
                            function24 = function22;
                            z8 = z2;
                            str8 = str3;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new t43(str, yciVar3, str7, o0kVar5, function04, z7, function24, z8, str8, i2, i3);
                            return;
                        }
                        return;
                    }
                    function22 = function2;
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i12 = i9;
                    if ((i12 & 38347923) == 38347922) {
                    }
                    oq5Var2.U();
                    if ((i2 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    o0kVar4 = o0kVar3;
                    str6 = str4;
                    z5 = z4;
                    z6 = z9;
                    function03 = function02;
                    function23 = C;
                    oq5Var2.q();
                    oq5Var = oq5Var2;
                    i(str, yciVar2, str6, o0kVar4, function03, z5, function23, z6, str5, oq5Var, i12 & 268435454);
                    yciVar3 = yciVar2;
                    str7 = str6;
                    o0kVar5 = o0kVar4;
                    function04 = function03;
                    z7 = z5;
                    function24 = function23;
                    z8 = z6;
                    str8 = str5;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                function02 = function0;
                if ((196608 & i2) != 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                function22 = function2;
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i12 = i9;
                if ((i12 & 38347923) == 38347922) {
                }
                oq5Var2.U();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i11 != 0) {
                }
                o0kVar4 = o0kVar3;
                str6 = str4;
                z5 = z4;
                z6 = z9;
                function03 = function02;
                function23 = C;
                oq5Var2.q();
                oq5Var = oq5Var2;
                i(str, yciVar2, str6, o0kVar4, function03, z5, function23, z6, str5, oq5Var, i12 & 268435454);
                yciVar3 = yciVar2;
                str7 = str6;
                o0kVar5 = o0kVar4;
                function04 = function03;
                z7 = z5;
                function24 = function23;
                z8 = z6;
                str8 = str5;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            str4 = str2;
            if ((i2 & 3072) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((196608 & i2) != 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            function22 = function2;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i12 = i9;
            if ((i12 & 38347923) == 38347922) {
            }
            oq5Var2.U();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i11 != 0) {
            }
            o0kVar4 = o0kVar3;
            str6 = str4;
            z5 = z4;
            z6 = z9;
            function03 = function02;
            function23 = C;
            oq5Var2.q();
            oq5Var = oq5Var2;
            i(str, yciVar2, str6, o0kVar4, function03, z5, function23, z6, str5, oq5Var, i12 & 268435454);
            yciVar3 = yciVar2;
            str7 = str6;
            o0kVar5 = o0kVar4;
            function04 = function03;
            z7 = z5;
            function24 = function23;
            z8 = z6;
            str8 = str5;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str4 = str2;
        if ((i2 & 3072) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        function22 = function2;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i12 = i9;
        if ((i12 & 38347923) == 38347922) {
        }
        oq5Var2.U();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i11 != 0) {
        }
        o0kVar4 = o0kVar3;
        str6 = str4;
        z5 = z4;
        z6 = z9;
        function03 = function02;
        function23 = C;
        oq5Var2.q();
        oq5Var = oq5Var2;
        i(str, yciVar2, str6, o0kVar4, function03, z5, function23, z6, str5, oq5Var, i12 & 268435454);
        yciVar3 = yciVar2;
        str7 = str6;
        o0kVar5 = o0kVar4;
        function04 = function03;
        z7 = z5;
        function24 = function23;
        z8 = z6;
        str8 = str5;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void i(String str, yci yciVar, String str2, o0k o0kVar, Function0 function0, boolean z, Function2 function2, boolean z2, String str3, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2141184584);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.h(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i3 |= oq5Var2.f(str3) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if ((i4 & 38347923) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            yci l2 = androidx.compose.foundation.layout.a.l(d.d(yciVar, 1.0f), o0kVar);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new mz2(1);
                oq5Var2.k0(K);
            }
            yci b2 = nfp.b(l2, true, (Function1) K);
            vci vciVar = vci.a;
            if (function0 == null || !z) {
                yciVar2 = b2;
                yciVar3 = vciVar;
            } else {
                yciVar2 = b2;
                yciVar3 = androidx.compose.foundation.a.e(vciVar, false, null, null, function0, 7);
            }
            yci f2 = yciVar2.f(yciVar3);
            ta5 a2 = sa5.a(qx0.c, z2 ? b2c.o : b2c.n, oq5Var2, 0);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, f2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l3, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            bg3.a(null, null, false, ild.C(-579091692, new qt(str3, str, z, 3), oq5Var2), oq5Var2, 3072, 7);
            oq5Var = oq5Var2;
            if (str2 == null || StringsKt.U(str2)) {
                oq5Var.Z(-7316988);
            } else {
                oq5Var.Z(-1017664);
                u1g.l(oq5Var, d.e(vciVar, r43.b));
                function2.invoke(oq5Var, Integer.valueOf((i4 >> 18) & 14));
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u43(str, yciVar, str2, o0kVar, function0, z, function2, z2, str3, i2);
        }
    }

    public static final void j(yci yciVar, boolean z, o0k o0kVar, hq5 hq5Var, int i2) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1572039574);
        if (((i2 | 128) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                o0kVar = r43.c(null, null, 15);
            } else {
                oq5Var.S();
            }
            oq5Var.q();
            yci l2 = androidx.compose.foundation.layout.a.l(d.d(yciVar, 1.0f), o0kVar);
            nho a2 = lho.a(qx0.g, b2c.k, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H = vnj.H(oq5Var, l2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l3, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, 1.0f);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l4 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float f2 = r43.a;
            h6g h6gVar = h6g.c;
            ges b2 = r43.b();
            vci vciVar = vci.a;
            z2 = z;
            ivf.l(z2, d.r(vciVar, 180), b2, oq5Var, 54, 0);
            u1g.l(oq5Var, d.e(vciVar, r43.b));
            ivf.l(z2, d.r(vciVar, 100), r43.a(), oq5Var, 54, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(yciVar, z2, o0kVar, i2);
        }
    }

    public static final void k(List list, tv4 tv4Var, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        fvf fvfVar2;
        o0k o0kVar2;
        list.getClass();
        tv4Var.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1001076439);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(tv4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            fvfVar2 = fvfVar;
            i3 |= oq5Var.f(fvfVar2) ? 256 : 128;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i2 & 3072) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
        } else {
            o0kVar2 = o0kVar;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) gld.M(tv4Var.b.m, oq5Var).getValue()).booleanValue();
            boolean h2 = oq5Var.h(tv4Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new r93(23, tv4Var);
                oq5Var.k0(K);
            }
            bfg.f(booleanValue, (Function0) K, null, null, false, ild.C(-1853422167, new wl(fvfVar2, list, o0kVar2, tv4Var, 26), oq5Var), oq5Var, 196608, 28);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(i2, 20, list, tv4Var, fvfVar, o0kVar);
        }
    }

    public static final void l(String str, hq5 hq5Var, int i2) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(214582581);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2);
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (str == null || StringsKt.U(str)) {
                z = false;
                oq5Var.Z(1711908941);
            } else {
                oq5Var.Z(1718433635);
                yci a2 = a.a(vci.a, "content_heading_subtitle");
                float f2 = r43.a;
                h6g h6gVar = h6g.c;
                xcs.b(str, a2, ((dq0) oq5Var.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, r43.a(), oq5Var, (i3 & 14) | 48, 3120, 55288);
                oq5Var = oq5Var;
                z = false;
            }
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i2, 2);
        }
    }

    public static final void m(Function0 function0, Function0 function02, hq5 hq5Var, int i2) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-827009982);
        int i3 = 1;
        if ((((oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.h(function02) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.artist_info_donate_title, oq5Var);
            wn5 C = ild.C(-684675414, new w7a(function0, function02), oq5Var);
            String M2 = rvf.M(R.string.artist_button_donate, oq5Var);
            boolean f2 = oq5Var.f(M);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new wq(M, 22);
                oq5Var.k0(K);
            }
            g0g.m(C, M2, nfp.b(vci.a, true, (Function1) K), null, 0L, 0, oq5Var, 6, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new w7a(function0, function02, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(wya wyaVar, yci yciVar, hq5 hq5Var, int i2) {
        wya wyaVar2;
        oq5 oq5Var;
        yci yciVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object ddaVar;
        ih4 ih4Var;
        String str;
        float f2;
        kjn kjnVar;
        float f3;
        vci vciVar;
        boolean z;
        boolean z2;
        String n2;
        int i7;
        boolean z3;
        ges gesVar;
        boolean z4;
        vci vciVar2;
        int i8;
        kjn kjnVar2;
        ih4 ih4Var2;
        h9f h9fVar;
        vci vciVar3;
        boolean z5;
        boolean z6;
        Object K;
        vci vciVar4;
        kjn kjnVar3;
        ih4 ih4Var3;
        wyaVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-603925312);
        int i9 = (oq5Var2.f(wyaVar) ? 4 : 2) | i2 | 48;
        if (oq5Var2.P(i9 & 1, (i9 & 19) != 18)) {
            vci vciVar5 = vci.a;
            yci d2 = d.d(vciVar5, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i10 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var2, i10, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            float f4 = 16;
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar5, 1.0f), f4, 0.0f, f4, 0.0f, 10);
            Object K2 = oq5Var2.K();
            kjn kjnVar4 = gq5.a;
            if (K2 == kjnVar4) {
                K2 = new rua(17);
                oq5Var2.k0(K2);
            }
            yci b2 = nfp.b(q, false, (Function1) K2);
            ih4 ih4Var4 = wyaVar.a;
            if (ih4Var4 instanceof oza) {
                i3 = -546556052;
                i4 = R.string.easy_login_bottom_sheet_title;
            } else if (ih4Var4 instanceof pza) {
                i3 = -546552847;
                i4 = R.string.easy_login_bottom_sheet_main_title;
            } else {
                if (!(ih4Var4 instanceof nza)) {
                    throw vz1.i(oq5Var2, -546557963, false);
                }
                i3 = -546549289;
                i4 = R.string.easy_login_bottom_sheet_chromecast_title;
            }
            String n3 = vz1.n(oq5Var2, i3, i4, oq5Var2, false);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            xcs.b(n3, b2, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var2, 0, 0, 65016);
            float f5 = 8;
            yci q2 = androidx.compose.foundation.layout.a.q(d.d(vciVar5, 1.0f), f4, f5, f4, 0.0f, 8);
            boolean z7 = ih4Var4 instanceof oza;
            if (z7) {
                i5 = 1028359822;
                i6 = R.string.easy_login_bottom_sheet_description;
            } else if (ih4Var4 instanceof pza) {
                i5 = 1028363219;
                i6 = R.string.easy_login_bottom_sheet_main_description;
            } else {
                if (!(ih4Var4 instanceof nza)) {
                    throw vz1.i(oq5Var2, 1028357923, false);
                }
                i5 = 1028366969;
                i6 = R.string.easy_login_bottom_sheet_chromecast_description;
            }
            xcs.b(vz1.n(oq5Var2, i5, i6, oq5Var2, false), q2, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 0, 0, 65016);
            oq5Var = oq5Var2;
            float f6 = 24;
            u1g.l(oq5Var, d.e(vciVar5, f6));
            yci q3 = androidx.compose.foundation.layout.a.q(d.d(vciVar5, 1.0f), f6, 0.0f, f6, 0.0f, 10);
            String M = rvf.M(R.string.easy_login_bottom_sheet_button_set, oq5Var);
            int i11 = i9 & 14;
            boolean z8 = i11 == 4;
            Object K3 = oq5Var.K();
            if (z8 || K3 == kjnVar4) {
                ih4Var = ih4Var4;
                str = M;
                f2 = 1.0f;
                kjnVar = kjnVar4;
                f3 = f5;
                vciVar = vciVar5;
                z = true;
                ddaVar = new dda(0, wyaVar, wya.class, "onSetTvClicked", "onSetTvClicked()V", 0, 21);
                oq5Var.k0(ddaVar);
            } else {
                ih4Var = ih4Var4;
                str = M;
                ddaVar = K3;
                kjnVar = kjnVar4;
                z = true;
                f3 = f5;
                vciVar = vciVar5;
                f2 = 1.0f;
            }
            hdg.o(str, (Function0) ((h9f) ddaVar), q3, 0.0f, oq5Var, 384, 8);
            u1g.l(oq5Var, d.e(vciVar, f3));
            vci vciVar6 = vciVar;
            ih4 ih4Var5 = ih4Var;
            kjn kjnVar5 = kjnVar;
            yci q4 = androidx.compose.foundation.layout.a.q(d.d(vciVar, f2), f6, 0.0f, f6, 0.0f, 10);
            if (z7) {
                i7 = -76312887;
                z2 = false;
            } else {
                z2 = false;
                if (ih4Var5 instanceof pza) {
                    i7 = -76309463;
                } else {
                    if (!(ih4Var5 instanceof nza)) {
                        throw vz1.i(oq5Var, -76314791, false);
                    }
                    n2 = vz1.n(oq5Var, -76305838, R.string.easy_login_bottom_sheet_button_use_chromecast, oq5Var, false);
                    String str2 = n2;
                    ges j2 = nu0.j();
                    z3 = ih4Var5 instanceof nza;
                    if (z3) {
                        gesVar = j2;
                        z4 = z3;
                        vciVar2 = vciVar6;
                        i8 = i11;
                        if (!z7 && !(ih4Var5 instanceof pza)) {
                            throw vz1.i(oq5Var, 1935748237, z2);
                        }
                        oq5Var.Z(-121134848);
                        boolean z9 = i8 != 4 ? z2 : true;
                        Object K4 = oq5Var.K();
                        if (z9 || K4 == kjnVar5) {
                            kjnVar2 = kjnVar5;
                            ih4Var2 = ih4Var5;
                            dda ddaVar2 = new dda(0, wyaVar, wya.class, "onNoTvClicked", "onNoTvClicked()V", 0, 23);
                            oq5Var.k0(ddaVar2);
                            K4 = ddaVar2;
                        } else {
                            ih4Var2 = ih4Var5;
                            kjnVar2 = kjnVar5;
                        }
                        h9fVar = (h9f) K4;
                        oq5Var.p(z2);
                    } else {
                        oq5Var.Z(-121260615);
                        boolean z10 = i11 != 4 ? z2 : z;
                        Object K5 = oq5Var.K();
                        if (z10 || K5 == kjnVar5) {
                            kjnVar3 = kjnVar5;
                            gesVar = j2;
                            z4 = z3;
                            ih4Var3 = ih4Var5;
                            vciVar2 = vciVar6;
                            i8 = i11;
                            dda ddaVar3 = new dda(0, wyaVar, wya.class, "useChromecastClicked", "useChromecastClicked()V", 0, 22);
                            oq5Var.k0(ddaVar3);
                            K5 = ddaVar3;
                        } else {
                            ih4Var3 = ih4Var5;
                            kjnVar3 = kjnVar5;
                            gesVar = j2;
                            z4 = z3;
                            vciVar2 = vciVar6;
                            i8 = i11;
                        }
                        h9fVar = (h9f) K5;
                        oq5Var.p(z2);
                        ih4Var2 = ih4Var3;
                        kjnVar2 = kjnVar3;
                    }
                    hdg.t(str2, (Function0) h9fVar, q4, gesVar, oq5Var, 384, 0);
                    if (z7 || (ih4Var2 instanceof pza)) {
                        oq5Var.Z(-121007004);
                        vciVar3 = vciVar2;
                        u1g.l(oq5Var, d.e(vciVar3, 12));
                        int i12 = i8;
                        z5 = z2;
                        yci q5 = androidx.compose.foundation.layout.a.q(d.e(d.d(vciVar3, 1.0f), 48), f6, 0.0f, f6, 0.0f, 10);
                        z6 = i12 == 4 ? z5 : true;
                        K = oq5Var.K();
                        if (!z6 || K == kjnVar2) {
                            vciVar4 = vciVar3;
                            z2 = z5;
                            K = new dda(0, wyaVar, wya.class, "onLaterClicked", "onLaterClicked()V", 0, 24);
                            wyaVar2 = wyaVar;
                            oq5Var.k0(K);
                        } else {
                            wyaVar2 = wyaVar;
                            vciVar4 = vciVar3;
                            z2 = z5;
                        }
                        bcx.d((Function0) ((h9f) K), q5, false, c, oq5Var, 3120, 4);
                    } else {
                        wyaVar2 = wyaVar;
                        vciVar4 = vciVar2;
                        if (z4) {
                            b6e.s();
                            return;
                        }
                        oq5Var.Z(-124283208);
                    }
                    oq5Var.p(z2);
                    oq5Var.p(true);
                    yciVar2 = vciVar4;
                }
            }
            n2 = vz1.n(oq5Var, i7, R.string.easy_login_bottom_sheet_button_no_tv, oq5Var, z2);
            String str22 = n2;
            ges j22 = nu0.j();
            z3 = ih4Var5 instanceof nza;
            if (z3) {
            }
            hdg.t(str22, (Function0) h9fVar, q4, gesVar, oq5Var, 384, 0);
            if (z7) {
                wyaVar2 = wyaVar;
                vciVar4 = vciVar2;
                if (z4) {
                }
            }
            oq5Var.Z(-121007004);
            vciVar3 = vciVar2;
            u1g.l(oq5Var, d.e(vciVar3, 12));
            int i122 = i8;
            z5 = z2;
            yci q52 = androidx.compose.foundation.layout.a.q(d.e(d.d(vciVar3, 1.0f), 48), f6, 0.0f, f6, 0.0f, 10);
            if (i122 == 4) {
            }
            K = oq5Var.K();
            if (z6) {
            }
            vciVar4 = vciVar3;
            z2 = z5;
            K = new dda(0, wyaVar, wya.class, "onLaterClicked", "onLaterClicked()V", 0, 24);
            wyaVar2 = wyaVar;
            oq5Var.k0(K);
            bcx.d((Function0) ((h9f) K), q52, false, c, oq5Var, 3120, 4);
            oq5Var.p(z2);
            oq5Var.p(true);
            yciVar2 = vciVar4;
        } else {
            wyaVar2 = wyaVar;
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(wyaVar2, yciVar2, i2, 29);
        }
    }

    public static final void o(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(384921612);
        if (oq5Var.P(i2 & 1, i2 != 0)) {
            yci c2 = d.c(vci.a, 1.0f);
            gz2 gz2Var = b2c.o;
            lx0 lx0Var = qx0.e;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new c68(8);
                oq5Var.k0(K);
            }
            weo.f(c2, null, null, lx0Var, gz2Var, null, false, null, (Function1) K, oq5Var, 805527558, 462);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fp5(i2, 25);
        }
    }

    public static final void p(float f2, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(710765433);
        if ((((oq5Var.c(f2) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u1g.l(oq5Var, d.m(vci.a, f2));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yp5(i2, f2);
        }
    }

    public static final void q(Function0 function0, tmb tmbVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        function0.getClass();
        tmbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1003109630);
        int i3 = i2 | (oq5Var.h(function0) ? 4 : 2) | (oq5Var.h(tmbVar) ? 32 : 16) | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            gz2 gz2Var = b2c.o;
            float e2 = zs4.e(oq5Var);
            vci vciVar = vci.a;
            yci a2 = a.a(androidx.compose.foundation.layout.a.m(d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, e2, 7), 1.0f), bfg.C(oq5Var), false, 14), new iz2(0.0f, -0.5f), 2), 16), "error_state");
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            hmj hmjVar = hmj.c;
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new ex(10, function0);
                oq5Var.k0(K);
            }
            rvf.j((Function1) K, tmbVar, null, 0, true, hmjVar, oq5Var, 221248 | (i3 & 112), 12);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i2, 9, yciVar2, function0, tmbVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(w4k w4kVar, String str, yci yciVar, g40 g40Var, jd6 jd6Var, float f2, m85 m85Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        g40 g40Var2;
        int i6;
        int i7;
        int i8;
        m85 m85Var2;
        float f3;
        yci yciVar3;
        g40 g40Var3;
        jd6 jd6Var2;
        m85 m85Var3;
        xmn r;
        int i9;
        jd6 jd6Var3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1142754848);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(w4kVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(str) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                g40Var2 = g40Var;
                i4 |= oq5Var.f(g40Var2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= oq5Var.f(jd6Var) ? 16384 : RemoteCameraConfig.Notification.ID;
                    i7 = 196608 | i4;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i7 = 1769472 | i4;
                    } else if ((1572864 & i2) == 0) {
                        m85Var2 = m85Var;
                        i7 |= oq5Var.f(m85Var2) ? 1048576 : 524288;
                        if (oq5Var.P(i7 & 1, (599187 & i7) != 599186)) {
                            yci yciVar4 = vci.a;
                            if (i10 != 0) {
                                yciVar2 = yciVar4;
                            }
                            g40 g40Var4 = i5 != 0 ? b2c.f : g40Var2;
                            if (i6 != 0) {
                                int i11 = i7;
                                jd6Var3 = hd6.b;
                                i9 = i11;
                            } else {
                                i9 = i7;
                                jd6Var3 = jd6Var;
                            }
                            if (i8 != 0) {
                                m85Var2 = null;
                            }
                            if (str != null) {
                                oq5Var.Z(1040425059);
                                boolean z = (i9 & 112) == 32;
                                Object K = oq5Var.K();
                                if (z || K == gq5.a) {
                                    K = new r23(str, 5);
                                    oq5Var.k0(K);
                                }
                                yciVar4 = nfp.b(yciVar4, false, (Function1) K);
                                oq5Var.p(false);
                            } else {
                                oq5Var.Z(1040583841);
                                oq5Var.p(false);
                            }
                            yci v = xp3.v(yciVar2.f(yciVar4));
                            m85 m85Var4 = m85Var2;
                            yci d2 = androidx.compose.ui.draw.a.d(v, w4kVar, g40Var4, jd6Var3, 1.0f, m85Var4, 2);
                            r30 r30Var = r30.j;
                            int i12 = oq5Var.P;
                            yci H = vnj.H(oq5Var, d2);
                            androidx.compose.runtime.internal.a l2 = oq5Var.l();
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar);
                            } else {
                                oq5Var.n0();
                            }
                            g0g.U(oq5Var, r30Var, wp5.f);
                            g0g.U(oq5Var, l2, wp5.e);
                            g0g.U(oq5Var, H, wp5.d);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i12))) {
                                ouj.x(i12, oq5Var, i12, kb5Var);
                            }
                            oq5Var.p(true);
                            yciVar3 = yciVar2;
                            g40Var3 = g40Var4;
                            jd6Var2 = jd6Var3;
                            f3 = 1.0f;
                            m85Var3 = m85Var4;
                        } else {
                            oq5Var.S();
                            f3 = f2;
                            yciVar3 = yciVar2;
                            g40Var3 = g40Var2;
                            jd6Var2 = jd6Var;
                            m85Var3 = m85Var2;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new ube(w4kVar, str, yciVar3, g40Var3, jd6Var2, f3, m85Var3, i2, i3);
                            return;
                        }
                        return;
                    }
                    m85Var2 = m85Var;
                    if (oq5Var.P(i7 & 1, (599187 & i7) != 599186)) {
                    }
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                i7 = 196608 | i4;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                m85Var2 = m85Var;
                if (oq5Var.P(i7 & 1, (599187 & i7) != 599186)) {
                }
                r = oq5Var.r();
                if (r != null) {
                }
            }
            g40Var2 = g40Var;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = 196608 | i4;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            m85Var2 = m85Var;
            if (oq5Var.P(i7 & 1, (599187 & i7) != 599186)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        g40Var2 = g40Var;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = 196608 | i4;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        m85Var2 = m85Var;
        if (oq5Var.P(i7 & 1, (599187 & i7) != 599186)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void s(androidx.compose.foundation.lazy.a aVar, av4 av4Var, int i2, tv4 tv4Var, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2102624697);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.f(av4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(tv4Var) ? 2048 : 1024;
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            e9g e9gVar = e9g.a;
            jd1 jd1Var = av4Var.a.b;
            yci b2 = com.yandex.music.core.ui.compose.b.b(a.a(androidx.compose.foundation.lazy.a.a(aVar, vci.a), "artist_item"), i2);
            boolean h2 = oq5Var.h(tv4Var) | ((i4 & 112) == 32);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new ap1(18, tv4Var, av4Var);
                oq5Var.k0(K);
            }
            jf0.b((Function0) K, jd1Var, b2, null, e9gVar, null, oq5Var, 24576, 40);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(aVar, av4Var, i2, tv4Var, i3, 5);
        }
    }

    public static final void t(androidx.compose.foundation.lazy.a aVar, bv4 bv4Var, int i2, tv4 tv4Var, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(234631179);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.f(bv4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(tv4Var) ? 2048 : 1024;
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            to1 to1Var = bv4Var.a;
            tv4Var.getClass();
            to1Var.getClass();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                bp1 bp1Var = new bp1(to1Var, tv4Var.g, tv4Var.h, new v5(24, tv4Var));
                oq5Var.k0(bp1Var);
                K = bp1Var;
            }
            vci vciVar = vci.a;
            zo1.b((bp1) K, com.yandex.music.core.ui.compose.b.b(a.a(androidx.compose.foundation.lazy.a.a(aVar, vciVar), "collection_artists_top_block"), i2), oq5Var, 0);
            u1g.l(oq5Var, d.e(vciVar, 40));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(aVar, bv4Var, i2, tv4Var, i3, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(final List list, final krf krfVar, final yci yciVar, Function2 function2, Function1 function1, final fvf fvfVar, jic jicVar, int i2, Function0 function0, final o0k o0kVar, float f2, int i3, hq5 hq5Var, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        Function1 function12;
        jic jicVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj;
        Function2 function22;
        jic jicVar3;
        int i16;
        final Function0 function02;
        int i17;
        int i18;
        Function1 function13;
        final float f3;
        jic jicVar4;
        Unit unit;
        int i19;
        int i20;
        boolean z;
        Object K;
        Unit unit2;
        Function2 function23;
        Function1 function14;
        int i21;
        int i22;
        int i23;
        fvf fvfVar2;
        int i24;
        boolean z2;
        Object K2;
        Object K3;
        boolean h2;
        Object K4;
        boolean z3;
        Object K5;
        boolean z4;
        int i25;
        int i26;
        Function2 function24;
        Function1 function15;
        Function0 function03;
        float f4;
        oq5 oq5Var;
        boolean z5;
        Object K6;
        final jic jicVar5;
        final Function1 function16;
        final Function0 function04;
        final int i27;
        final float f5;
        final int i28;
        xmn r;
        list.getClass();
        krfVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(937156161);
        if ((i4 & 6) == 0) {
            i7 = (oq5Var2.f(list) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= oq5Var2.f(krfVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i29 = i6 & 8;
        if (i29 != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i7 |= oq5Var2.h(function2) ? 2048 : 1024;
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                function12 = function1;
                i7 |= oq5Var2.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((i4 & 196608) == 0) {
                    i7 |= oq5Var2.f(fvfVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                    jicVar2 = jicVar;
                    i7 |= ((i6 & 64) == 0 && oq5Var2.f(jicVar2)) ? 1048576 : 524288;
                } else {
                    jicVar2 = jicVar;
                }
                i9 = i6 & 128;
                if (i9 != 0) {
                    i7 |= 12582912;
                    i10 = i2;
                } else {
                    i10 = i2;
                    if ((i4 & 12582912) == 0) {
                        i7 |= oq5Var2.d(i10) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    }
                }
                i11 = i6 & 256;
                if (i11 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= oq5Var2.h(function0) ? 67108864 : 33554432;
                }
                if ((i4 & 805306368) == 0) {
                    i7 |= oq5Var2.f(o0kVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                int i30 = i5 | 6;
                i12 = i6 & 2048;
                if (i12 != 0) {
                    i13 = i12;
                    i14 = 54;
                } else {
                    if ((i5 & 48) == 0) {
                        i13 = i12;
                        i30 |= oq5Var2.d(i3) ? 32 : 16;
                    } else {
                        i13 = i12;
                    }
                    i14 = i30;
                }
                int i31 = i7;
                if ((i7 & 306783379) != 306783378 && (i14 & 19) == 18 && oq5Var2.z()) {
                    oq5Var2.S();
                    function24 = function2;
                    function04 = function0;
                    f5 = f2;
                    i28 = i3;
                    i27 = i10;
                    function16 = function12;
                    jicVar5 = jicVar2;
                    oq5Var = oq5Var2;
                } else {
                    oq5Var2.U();
                    i15 = i4 & 1;
                    obj = gq5.a;
                    if (i15 != 0 || oq5Var2.y()) {
                        function22 = i29 != 0 ? null : function2;
                        if (i8 != 0) {
                            function12 = null;
                        }
                        if ((i6 & 64) != 0) {
                            uf7 a2 = m8r.a(oq5Var2);
                            boolean f6 = oq5Var2.f(a2);
                            Object K7 = oq5Var2.K();
                            if (f6 || K7 == obj) {
                                K7 = new om7(a2);
                                oq5Var2.k0(K7);
                            }
                            jicVar3 = (om7) K7;
                            i16 = i31 & (-3670017);
                        } else {
                            jicVar3 = jicVar2;
                            i16 = i31;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if (i11 != 0) {
                            Object K8 = oq5Var2.K();
                            if (K8 == obj) {
                                K8 = new s2(28);
                                oq5Var2.k0(K8);
                            }
                            function02 = (Function0) K8;
                        } else {
                            function02 = function0;
                        }
                        float f7 = 40;
                        if (i13 != 0) {
                            i18 = i10;
                            function13 = function12;
                            f3 = f7;
                            jicVar4 = jicVar3;
                            i17 = 2;
                        } else {
                            i17 = i3;
                            i18 = i10;
                            function13 = function12;
                            f3 = f7;
                            jicVar4 = jicVar3;
                        }
                    } else {
                        oq5Var2.S();
                        if ((i6 & 64) != 0) {
                            i16 = i31 & (-3670017);
                            function22 = function2;
                            function02 = function0;
                            f3 = f2;
                            i17 = i3;
                            jicVar4 = jicVar2;
                        } else {
                            function22 = function2;
                            function02 = function0;
                            f3 = f2;
                            i17 = i3;
                            jicVar4 = jicVar2;
                            i16 = i31;
                        }
                        i18 = i10;
                        function13 = function12;
                    }
                    oq5Var2.q();
                    unit = Unit.a;
                    i19 = i16 & 112;
                    i20 = (i16 & 458752) ^ 196608;
                    z = ((i20 <= 131072 && oq5Var2.f(fvfVar)) || (i16 & 196608) == 131072) | (i19 == 32) | ((29360128 & i16) == 8388608);
                    K = oq5Var2.K();
                    if (!z || K == obj) {
                        unit2 = unit;
                        function23 = function22;
                        function14 = function13;
                        i21 = i19;
                        i22 = i20;
                        i23 = 32;
                        Object rsVar = new rs(krfVar, fvfVar, i18, null, 4);
                        fvfVar2 = fvfVar;
                        i24 = i18;
                        oq5Var2.k0(rsVar);
                        K = rsVar;
                    } else {
                        function23 = function22;
                        function14 = function13;
                        unit2 = unit;
                        i21 = i19;
                        i24 = i18;
                        i22 = i20;
                        i23 = 32;
                        fvfVar2 = fvfVar;
                    }
                    gld.w(oq5Var2, unit2, (Function2) K);
                    z2 = i21 == i23;
                    K2 = oq5Var2.K();
                    if (!z2 || K2 == obj) {
                        K2 = new kef(1, krfVar, krf.class, "onLifecycleEvent", "onLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V", 0, 5);
                        oq5Var2.k0(K2);
                    }
                    wyf.e((Function1) ((h9f) K2), oq5Var2, 0);
                    K3 = oq5Var2.K();
                    if (K3 == obj) {
                        K3 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
                    }
                    Object obj2 = ((fs5) K3).a;
                    yci a3 = a.a(yciVar, "landing_screen_content");
                    h2 = oq5Var2.h(obj2) | ((i22 <= 131072 && oq5Var2.f(fvfVar2)) || (i16 & 196608) == 131072);
                    K4 = oq5Var2.K();
                    if (!h2 || K4 == obj) {
                        K4 = new dae(10, obj2, fvfVar2);
                        oq5Var2.k0(K4);
                    }
                    yci b2 = nfp.b(a3, false, (Function1) K4);
                    z3 = ((i16 & 14) == 4) | ((i16 & 7168) == 2048) | ((234881024 & i16) == 67108864) | ((57344 & i16) == 16384);
                    K5 = oq5Var2.K();
                    if (!z3 || K5 == obj) {
                        z4 = false;
                        i25 = i16;
                        i26 = i23;
                        final Function2 function25 = function23;
                        final Function1 function17 = function14;
                        Object obj3 = new Function1() { // from class: frf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                vuf vufVar = (vuf) obj4;
                                vufVar.getClass();
                                Function2 function26 = Function2.this;
                                if (function26 != null) {
                                    vuf.Y(vufVar, null, new wn5(new h80(function26, 1), 241209915, true), 3);
                                }
                                hrf hrfVar = hrf.a;
                                List list2 = list;
                                vufVar.Z(list2.size(), new zcf(list2), new zcf(list2, 2), new wn5(new fqd(list2, function02, list2, f3), -1091073711, true));
                                Function1 function18 = function17;
                                if (function18 != null) {
                                    function18.invoke(vufVar);
                                }
                                return Unit.a;
                            }
                        };
                        function24 = function25;
                        function15 = function17;
                        function03 = function02;
                        f4 = f3;
                        oq5Var2.k0(obj3);
                        K5 = obj3;
                    } else {
                        function24 = function23;
                        function15 = function14;
                        z4 = false;
                        i25 = i16;
                        i26 = i23;
                        function03 = function02;
                        f4 = f3;
                    }
                    int i32 = i21;
                    int i33 = i26;
                    jic jicVar6 = jicVar4;
                    weo.g(b2, fvfVar2, o0kVar, null, null, jicVar6, false, (Function1) K5, oq5Var2, ((i25 >> 12) & 112) | ((i25 >> 21) & 896) | (i25 & 3670016), 184);
                    oq5Var = oq5Var2;
                    aqi o0 = szf.o0(list, oq5Var);
                    z5 = i32 == i33 ? true : z4;
                    K6 = oq5Var.K();
                    if (!z5 || K6 == obj) {
                        K6 = new kef(1, krfVar, krf.class, "onPrefetchUpdate", "onPrefetchUpdate(Lcom/yandex/music/shared/skeleton/ui/api/list/LazyBlockPrefetchRange;)V", 0, 6);
                        oq5Var.k0(K6);
                    }
                    int i34 = i17;
                    y2x.i(fvfVar, o0, i34, (Function1) ((h9f) K6), oq5Var, ((i25 >> 15) & 14) | ((i14 << 3) & 896));
                    jicVar5 = jicVar6;
                    function16 = function15;
                    function04 = function03;
                    i27 = i24;
                    f5 = f4;
                    i28 = i34;
                }
                r = oq5Var.r();
                if (r != null) {
                    final Function2 function26 = function24;
                    r.d = new Function2() { // from class: grf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            int R = rvf.R(i4 | 1);
                            int R2 = rvf.R(i5);
                            irf.u(list, krfVar, yciVar, function26, function16, fvfVar, jicVar5, i27, function04, o0kVar, f5, i28, (hq5) obj4, R, R2, i6);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i4 & 196608) == 0) {
            }
            if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            }
            i9 = i6 & 128;
            if (i9 != 0) {
            }
            i11 = i6 & 256;
            if (i11 != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            int i302 = i5 | 6;
            i12 = i6 & 2048;
            if (i12 != 0) {
            }
            int i312 = i7;
            if ((i7 & 306783379) != 306783378) {
            }
            oq5Var2.U();
            i15 = i4 & 1;
            obj = gq5.a;
            if (i15 != 0) {
            }
            if (i29 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i6 & 64) != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            float f72 = 40;
            if (i13 != 0) {
            }
            oq5Var2.q();
            unit = Unit.a;
            i19 = i16 & 112;
            if (i19 == 32) {
            }
            i20 = (i16 & 458752) ^ 196608;
            z = ((i20 <= 131072 && oq5Var2.f(fvfVar)) || (i16 & 196608) == 131072) | (i19 == 32) | ((29360128 & i16) == 8388608);
            K = oq5Var2.K();
            if (z) {
            }
            unit2 = unit;
            function23 = function22;
            function14 = function13;
            i21 = i19;
            i22 = i20;
            i23 = 32;
            Object rsVar2 = new rs(krfVar, fvfVar, i18, null, 4);
            fvfVar2 = fvfVar;
            i24 = i18;
            oq5Var2.k0(rsVar2);
            K = rsVar2;
            gld.w(oq5Var2, unit2, (Function2) K);
            if (i21 == i23) {
            }
            K2 = oq5Var2.K();
            if (!z2) {
            }
            K2 = new kef(1, krfVar, krf.class, "onLifecycleEvent", "onLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V", 0, 5);
            oq5Var2.k0(K2);
            wyf.e((Function1) ((h9f) K2), oq5Var2, 0);
            K3 = oq5Var2.K();
            if (K3 == obj) {
            }
            Object obj22 = ((fs5) K3).a;
            yci a32 = a.a(yciVar, "landing_screen_content");
            h2 = oq5Var2.h(obj22) | ((i22 <= 131072 && oq5Var2.f(fvfVar2)) || (i16 & 196608) == 131072);
            K4 = oq5Var2.K();
            if (!h2) {
            }
            K4 = new dae(10, obj22, fvfVar2);
            oq5Var2.k0(K4);
            yci b22 = nfp.b(a32, false, (Function1) K4);
            if ((i16 & 7168) == 2048) {
            }
            z3 = ((i16 & 14) == 4) | ((i16 & 7168) == 2048) | ((234881024 & i16) == 67108864) | ((57344 & i16) == 16384);
            K5 = oq5Var2.K();
            if (z3) {
            }
            z4 = false;
            i25 = i16;
            i26 = i23;
            final Function2 function252 = function23;
            final Function1 function172 = function14;
            Object obj32 = new Function1() { // from class: frf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    vuf vufVar = (vuf) obj4;
                    vufVar.getClass();
                    Function2 function262 = Function2.this;
                    if (function262 != null) {
                        vuf.Y(vufVar, null, new wn5(new h80(function262, 1), 241209915, true), 3);
                    }
                    hrf hrfVar = hrf.a;
                    List list2 = list;
                    vufVar.Z(list2.size(), new zcf(list2), new zcf(list2, 2), new wn5(new fqd(list2, function02, list2, f3), -1091073711, true));
                    Function1 function18 = function172;
                    if (function18 != null) {
                        function18.invoke(vufVar);
                    }
                    return Unit.a;
                }
            };
            function24 = function252;
            function15 = function172;
            function03 = function02;
            f4 = f3;
            oq5Var2.k0(obj32);
            K5 = obj32;
            int i322 = i21;
            int i332 = i26;
            jic jicVar62 = jicVar4;
            weo.g(b22, fvfVar2, o0kVar, null, null, jicVar62, false, (Function1) K5, oq5Var2, ((i25 >> 12) & 112) | ((i25 >> 21) & 896) | (i25 & 3670016), 184);
            oq5Var = oq5Var2;
            aqi o02 = szf.o0(list, oq5Var);
            if (i322 == i332) {
            }
            K6 = oq5Var.K();
            if (!z5) {
            }
            K6 = new kef(1, krfVar, krf.class, "onPrefetchUpdate", "onPrefetchUpdate(Lcom/yandex/music/shared/skeleton/ui/api/list/LazyBlockPrefetchRange;)V", 0, 6);
            oq5Var.k0(K6);
            int i342 = i17;
            y2x.i(fvfVar, o02, i342, (Function1) ((h9f) K6), oq5Var, ((i25 >> 15) & 14) | ((i14 << 3) & 896));
            jicVar5 = jicVar62;
            function16 = function15;
            function04 = function03;
            i27 = i24;
            f5 = f4;
            i28 = i342;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        function12 = function1;
        if ((i4 & 196608) == 0) {
        }
        if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        i9 = i6 & 128;
        if (i9 != 0) {
        }
        i11 = i6 & 256;
        if (i11 != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        int i3022 = i5 | 6;
        i12 = i6 & 2048;
        if (i12 != 0) {
        }
        int i3122 = i7;
        if ((i7 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        i15 = i4 & 1;
        obj = gq5.a;
        if (i15 != 0) {
        }
        if (i29 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i6 & 64) != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        float f722 = 40;
        if (i13 != 0) {
        }
        oq5Var2.q();
        unit = Unit.a;
        i19 = i16 & 112;
        if (i19 == 32) {
        }
        i20 = (i16 & 458752) ^ 196608;
        z = ((i20 <= 131072 && oq5Var2.f(fvfVar)) || (i16 & 196608) == 131072) | (i19 == 32) | ((29360128 & i16) == 8388608);
        K = oq5Var2.K();
        if (z) {
        }
        unit2 = unit;
        function23 = function22;
        function14 = function13;
        i21 = i19;
        i22 = i20;
        i23 = 32;
        Object rsVar22 = new rs(krfVar, fvfVar, i18, null, 4);
        fvfVar2 = fvfVar;
        i24 = i18;
        oq5Var2.k0(rsVar22);
        K = rsVar22;
        gld.w(oq5Var2, unit2, (Function2) K);
        if (i21 == i23) {
        }
        K2 = oq5Var2.K();
        if (!z2) {
        }
        K2 = new kef(1, krfVar, krf.class, "onLifecycleEvent", "onLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V", 0, 5);
        oq5Var2.k0(K2);
        wyf.e((Function1) ((h9f) K2), oq5Var2, 0);
        K3 = oq5Var2.K();
        if (K3 == obj) {
        }
        Object obj222 = ((fs5) K3).a;
        yci a322 = a.a(yciVar, "landing_screen_content");
        h2 = oq5Var2.h(obj222) | ((i22 <= 131072 && oq5Var2.f(fvfVar2)) || (i16 & 196608) == 131072);
        K4 = oq5Var2.K();
        if (!h2) {
        }
        K4 = new dae(10, obj222, fvfVar2);
        oq5Var2.k0(K4);
        yci b222 = nfp.b(a322, false, (Function1) K4);
        if ((i16 & 7168) == 2048) {
        }
        z3 = ((i16 & 14) == 4) | ((i16 & 7168) == 2048) | ((234881024 & i16) == 67108864) | ((57344 & i16) == 16384);
        K5 = oq5Var2.K();
        if (z3) {
        }
        z4 = false;
        i25 = i16;
        i26 = i23;
        final Function2 function2522 = function23;
        final Function1 function1722 = function14;
        Object obj322 = new Function1() { // from class: frf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                vuf vufVar = (vuf) obj4;
                vufVar.getClass();
                Function2 function262 = Function2.this;
                if (function262 != null) {
                    vuf.Y(vufVar, null, new wn5(new h80(function262, 1), 241209915, true), 3);
                }
                hrf hrfVar = hrf.a;
                List list2 = list;
                vufVar.Z(list2.size(), new zcf(list2), new zcf(list2, 2), new wn5(new fqd(list2, function02, list2, f3), -1091073711, true));
                Function1 function18 = function1722;
                if (function18 != null) {
                    function18.invoke(vufVar);
                }
                return Unit.a;
            }
        };
        function24 = function2522;
        function15 = function1722;
        function03 = function02;
        f4 = f3;
        oq5Var2.k0(obj322);
        K5 = obj322;
        int i3222 = i21;
        int i3322 = i26;
        jic jicVar622 = jicVar4;
        weo.g(b222, fvfVar2, o0kVar, null, null, jicVar622, false, (Function1) K5, oq5Var2, ((i25 >> 12) & 112) | ((i25 >> 21) & 896) | (i25 & 3670016), 184);
        oq5Var = oq5Var2;
        aqi o022 = szf.o0(list, oq5Var);
        if (i3222 == i3322) {
        }
        K6 = oq5Var.K();
        if (!z5) {
        }
        K6 = new kef(1, krfVar, krf.class, "onPrefetchUpdate", "onPrefetchUpdate(Lcom/yandex/music/shared/skeleton/ui/api/list/LazyBlockPrefetchRange;)V", 0, 6);
        oq5Var.k0(K6);
        int i3422 = i17;
        y2x.i(fvfVar, o022, i3422, (Function1) ((h9f) K6), oq5Var, ((i25 >> 15) & 14) | ((i14 << 3) & 896));
        jicVar5 = jicVar622;
        function16 = function15;
        function04 = function03;
        i27 = i24;
        f5 = f4;
        i28 = i3422;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void v(androidx.compose.foundation.lazy.a aVar, ev4 ev4Var, int i2, tv4 tv4Var, hq5 hq5Var, int i3) {
        int i4;
        int i5 = i2;
        tv4 tv4Var2 = tv4Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(366984938);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.f(ev4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.d(i5) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(tv4Var2) ? 2048 : 1024;
        }
        if (!oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            oq5Var.S();
        } else if (ev4Var instanceof cv4) {
            oq5Var.Z(485214667);
            h(((cv4) ev4Var).a, null, null, null, null, false, null, false, null, oq5Var, 0, 510);
            oq5Var.p(false);
            oq5Var = oq5Var;
        } else if (ev4Var instanceof bv4) {
            oq5Var.Z(485218887);
            oq5Var = oq5Var;
            t(aVar, (bv4) ev4Var, i5, tv4Var2, oq5Var, i4 & 8190);
            oq5Var.p(false);
            i5 = i2;
            tv4Var2 = tv4Var;
        } else {
            oq5Var = oq5Var;
            if (ev4Var instanceof av4) {
                oq5Var.Z(485224835);
                i5 = i2;
                tv4Var2 = tv4Var;
                s(aVar, (av4) ev4Var, i5, tv4Var2, oq5Var, i4 & 8190);
                oq5Var.p(false);
            } else {
                i5 = i2;
                tv4Var2 = tv4Var;
                if (!(ev4Var instanceof dv4)) {
                    throw vz1.i(oq5Var, 485212810, false);
                }
                oq5Var.Z(485230660);
                int i6 = i4 & 14;
                int i7 = i4 >> 3;
                w(aVar, i5, tv4Var2, oq5Var, (i7 & 896) | i6 | (i7 & 112));
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(aVar, ev4Var, i5, tv4Var2, i3, 4);
        }
    }

    public static final void w(androidx.compose.foundation.lazy.a aVar, int i2, tv4 tv4Var, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(419131700);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(tv4Var) ? 256 : 128;
        }
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            tv4Var.getClass();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                dvv dvvVar = tv4Var.f;
                cvv cvvVar = new cvv(tv4Var.e, dvvVar, dvvVar.G());
                oq5Var.k0(cvvVar);
                K = cvvVar;
            }
            gdg.p((cvv) K, androidx.compose.foundation.layout.a.o(d.d(androidx.compose.foundation.lazy.a.a(aVar, com.yandex.music.core.ui.compose.b.b(a.a(vci.a, "collection_artists_wizard_block"), i2)), 1.0f), 0.0f, 16, 1), false, oq5Var, 384, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uf4(aVar, i2, tv4Var, i3, 1);
        }
    }

    public static final void x(fp7 fp7Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2010933546);
        int i3 = i2 | (oq5Var.f(fp7Var) ? 4 : 2) | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            vci vciVar = vci.a;
            rvf.a(fp7Var, androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) oq5Var.j(eq0.a)).c.a, vnj.i), null, null, 1, 0.0f, null, null, false, null, null, null, null, ild.C(1772298953, new gp5(1), oq5Var), oq5Var, (i3 & 14) | 24576, 24576, 16364);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(fp7Var, yciVar2, i2, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(final String str, final qo6 qo6Var, final yci yciVar, boolean z, boolean z2, m85 m85Var, d85 d85Var, dup dupVar, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        final boolean z4;
        int i6;
        m85 m85Var2;
        int i7;
        d85 d85Var2;
        dup dupVar2;
        int i8;
        int i9;
        boolean z5;
        dup R;
        m85 m85Var3;
        d85 d85Var3;
        qo6 qo6Var2;
        final m85 m85Var4;
        final boolean z6;
        final d85 d85Var4;
        final dup dupVar3;
        xmn r;
        Function2 function2;
        int i10;
        str.getClass();
        qo6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(267086915);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.d(qo6Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            z3 = z;
            i4 |= oq5Var.g(z3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z4 = z2;
                i4 |= oq5Var.g(z4) ? 16384 : RemoteCameraConfig.Notification.ID;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    m85Var2 = m85Var;
                    i4 |= oq5Var.f(m85Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i2) == 0) {
                        d85Var2 = d85Var;
                        i4 |= oq5Var.f(d85Var2) ? 1048576 : 524288;
                        if ((12582912 & i2) == 0) {
                            if ((i3 & 128) == 0) {
                                dupVar2 = dupVar;
                                if (oq5Var.f(dupVar2)) {
                                    i10 = 8388608;
                                    i4 |= i10;
                                }
                            } else {
                                dupVar2 = dupVar;
                            }
                            i10 = RemoteCameraConfig.Camera.BITRATE;
                            i4 |= i10;
                        } else {
                            dupVar2 = dupVar;
                        }
                        i8 = i4;
                        if ((i8 & 4793491) == 4793490 || !oq5Var.z()) {
                            oq5Var.U();
                            if ((i2 & 1) != 0 || oq5Var.y()) {
                                boolean z7 = i11 != 0 ? false : z;
                                if (i5 != 0) {
                                    z4 = false;
                                }
                                if (i6 != 0) {
                                    m85Var2 = null;
                                }
                                if (i7 != 0) {
                                    d85Var2 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    i9 = i8 & (-29360129);
                                    z5 = z7;
                                    R = R(qo6Var, oq5Var);
                                    m85Var3 = m85Var2;
                                    d85Var3 = d85Var2;
                                    oq5Var.q();
                                    yci yciVar2 = vci.a;
                                    kjn kjnVar = gq5.a;
                                    if (z5) {
                                        oq5Var.Z(-1787570361);
                                        oq5Var.p(false);
                                    } else {
                                        oq5Var.Z(-1787777906);
                                        long j2 = ((dq0) oq5Var.j(eq0.a)).c.d;
                                        boolean e2 = oq5Var.e(j2);
                                        Object K = oq5Var.K();
                                        if (e2 || K == kjnVar) {
                                            K = new fn1(j2, 2);
                                            oq5Var.k0(K);
                                        }
                                        yciVar2 = androidx.compose.ui.draw.a.b(yciVar2, (Function1) K);
                                        oq5Var.p(false);
                                    }
                                    yci f2 = xp3.u(a.a(yciVar, "cover_image"), R).f(yciVar2);
                                    if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                                        oq5Var.Z(-1787384485);
                                        int i12 = i9;
                                        gce gceVar = gce.d;
                                        Object K2 = oq5Var.K();
                                        if (K2 == kjnVar) {
                                            K2 = new rn6(0);
                                            oq5Var.k0(K2);
                                        }
                                        final boolean z8 = z4;
                                        final dup dupVar4 = R;
                                        swf.d(qo6Var, gceVar, androidx.compose.ui.draw.a.c(f2, (Function1) K2), null, 0L, 0L, z8, oq5Var, ((i12 >> 3) & 14) | 48 | ((i12 << 6) & 3670016), 56);
                                        oq5Var.p(false);
                                        r = oq5Var.r();
                                        if (r != null) {
                                            final int i13 = 0;
                                            final boolean z9 = z5;
                                            final m85 m85Var5 = m85Var3;
                                            final d85 d85Var5 = d85Var3;
                                            function2 = new Function2() { // from class: sn6
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    switch (i13) {
                                                        case 0:
                                                            ((Integer) obj2).getClass();
                                                            irf.y(str, qo6Var, yciVar, z9, z8, m85Var5, d85Var5, dupVar4, (hq5) obj, rvf.R(i2 | 1), i3);
                                                            break;
                                                        default:
                                                            ((Integer) obj2).getClass();
                                                            irf.y(str, qo6Var, yciVar, z9, z8, m85Var5, d85Var5, dupVar4, (hq5) obj, rvf.R(i2 | 1), i3);
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            r.d = function2;
                                            return;
                                        }
                                        return;
                                    }
                                    dup dupVar5 = R;
                                    int i14 = i9;
                                    qo6Var2 = qo6Var;
                                    boolean z10 = z4;
                                    m85 m85Var6 = m85Var3;
                                    d85 d85Var6 = d85Var3;
                                    oq5Var.Z(-1789502529);
                                    oq5Var.p(false);
                                    w1g.j(str, null, f2, null, null, b2c.f, hd6.a, 0.0f, m85Var6, 0, ild.C(2062589219, new qt(d85Var6, qo6Var2, z10, 7), oq5Var), oq5Var, (i14 & 14) | 1769520 | ((i14 << 9) & 234881024), 664);
                                    m85Var4 = m85Var6;
                                    oq5Var = oq5Var;
                                    z6 = z5;
                                    z4 = z10;
                                    d85Var4 = d85Var6;
                                    dupVar3 = dupVar5;
                                } else {
                                    i9 = i8;
                                    z5 = z7;
                                }
                            } else {
                                oq5Var.S();
                                if ((i3 & 128) != 0) {
                                    z5 = z;
                                    i9 = i8 & (-29360129);
                                } else {
                                    z5 = z;
                                    i9 = i8;
                                }
                            }
                            m85Var3 = m85Var2;
                            d85Var3 = d85Var2;
                            R = dupVar2;
                            oq5Var.q();
                            yci yciVar22 = vci.a;
                            kjn kjnVar2 = gq5.a;
                            if (z5) {
                            }
                            yci f22 = xp3.u(a.a(yciVar, "cover_image"), R).f(yciVar22);
                            if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                            }
                        } else {
                            oq5Var.S();
                            qo6Var2 = qo6Var;
                            z6 = z3;
                            m85Var4 = m85Var2;
                            d85Var4 = d85Var2;
                            dupVar3 = dupVar2;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            final int i15 = 1;
                            final qo6 qo6Var3 = qo6Var2;
                            function2 = new Function2() { // from class: sn6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i15) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            irf.y(str, qo6Var3, yciVar, z6, z4, m85Var4, d85Var4, dupVar3, (hq5) obj, rvf.R(i2 | 1), i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            irf.y(str, qo6Var3, yciVar, z6, z4, m85Var4, d85Var4, dupVar3, (hq5) obj, rvf.R(i2 | 1), i3);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            r.d = function2;
                            return;
                        }
                        return;
                    }
                    d85Var2 = d85Var;
                    if ((12582912 & i2) == 0) {
                    }
                    i8 = i4;
                    if ((i8 & 4793491) == 4793490) {
                    }
                    oq5Var.U();
                    if ((i2 & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                }
                m85Var2 = m85Var;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                d85Var2 = d85Var;
                if ((12582912 & i2) == 0) {
                }
                i8 = i4;
                if ((i8 & 4793491) == 4793490) {
                }
                oq5Var.U();
                if ((i2 & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 128) != 0) {
                }
            }
            z4 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            m85Var2 = m85Var;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            d85Var2 = d85Var;
            if ((12582912 & i2) == 0) {
            }
            i8 = i4;
            if ((i8 & 4793491) == 4793490) {
            }
            oq5Var.U();
            if ((i2 & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
        }
        z3 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        m85Var2 = m85Var;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        d85Var2 = d85Var;
        if ((12582912 & i2) == 0) {
        }
        i8 = i4;
        if ((i8 & 4793491) == 4793490) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
    }

    public static final void z(fvf fvfVar, List list, Function1 function1, Function1 function12, hq5 hq5Var, int i2) {
        fvfVar.getClass();
        list.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-994062246);
        int i3 = i2 | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.h(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            w50 w50Var = new w50(2, function1, function12);
            yci a2 = a.a(d.c(vci.a, 1.0f), "column_tracks");
            vm C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 12, 0.0f, 0.0f, 13), zs4.g(oq5Var)), ogp.A(oq5Var));
            boolean h2 = oq5Var.h(list) | oq5Var.f(w50Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new ny2(13, list, w50Var);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 << 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g98(fvfVar, list, function1, function12, i2, 2);
        }
    }

    public abstract List F(List list, String str);
}
