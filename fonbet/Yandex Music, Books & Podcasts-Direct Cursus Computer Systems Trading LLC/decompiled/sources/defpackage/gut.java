package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.k0;
import com.yandex.music.shared.skeleton.data.api.model.SkeletonDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideDisclaimerDto;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.landing.skeleton.SkeletonScreenActivity;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;

/* loaded from: classes3.dex */
public final class gut {
    public final /* synthetic */ int a;

    public /* synthetic */ gut(int i) {
        this.a = i;
    }

    public static qne A(String str) {
        str.getClass();
        String concat = "Ошибка при парсинге DivKit: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("reason", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "divkit_parsing_error", "divkit_parsing_error", vtmVar);
    }

    public static qne A0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Показ шторки пополнения Карты Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_top_up_sheet_shown", "plus_card_top_up_sheet_shown", k);
    }

    public static yci B(oxn oxnVar, yci yciVar, Function1 function1) {
        xuj xujVar = xuj.G;
        bs4 bs4Var = bs4.e;
        oxnVar.getClass();
        yciVar.getClass();
        function1.getClass();
        return vnj.q(yciVar, new zk0(oxnVar, bs4Var, function1, xujVar, 1));
    }

    public static qne B0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("reason", new jkr("Not in host"));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Карта Пэй недоступна по причине: Not in host"));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "plus_card_unavailable", "plus_card_unavailable", vtmVar);
    }

    public static qne C0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("reason", new jkr("Not in host"));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Карта Пэй присутствует в списке платежных методов, но при этом недоступна по причине: Not in host"));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "plus_card_unexpected_unavailable", "plus_card_unexpected_unavailable", vtmVar);
    }

    public static qne D(String str) {
        String A = hrg.A(str, "Пользователь ввел текст длиной ", str, " в поле ввода CVV");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("bank_list", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(A));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "entering_cvv_in_input_field", "entering_cvv_in_input_field", vtmVar);
    }

    public static qne D0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Проверка баланса Карты Пэй завершилось с ошибкой", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_verify_balance_fail", "plus_card_verify_balance_fail", k);
    }

    public static qne E(boolean z) {
        String concat = "Флаги загрузились, тестовые флаги ".concat(z ? "включены" : "выключены");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put(Constants.KEY_VALUE, new mc3(z));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "xflags_testBooleanFlagEnabled", "xflags_testBooleanFlagEnabled", vtmVar);
    }

    public static qne E0(int i) {
        String i2 = k5r.i(i, "Проверка баланса Карты Пэй завершилось успешно, пополнение не требуется; количество попыток: ");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("attempts", new oqe(i, false));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(i2));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "plus_card_verify_balance_success", "plus_card_verify_balance_success", vtmVar);
    }

    public static final String F(f fVar) {
        fVar.getClass();
        k0 x = fVar.B() ? fVar.x() : null;
        if (x != null) {
            dlr h = x.k() ? x.h() : null;
            if (h != null) {
                return h.g();
            }
        }
        return null;
    }

    public static String F0(los losVar, boolean z) {
        int i = losVar.b;
        while (losVar.a() != 0 && !U(losVar.a(), losVar) && (!z || !O(losVar.a(), losVar))) {
            losVar.b(1);
        }
        String Q = mvn.Q(c.l(losVar.a, i, losVar.b));
        if (Q.length() > 0) {
            return Q;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean G() {
        boolean z;
        boolean booleanValue;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        g7r g7rVar = (g7r) ((byb) qdcVar.C(I)).b(g7r.class);
        if (!g7rVar.h()) {
            Boolean a = g7rVar.a().a("enabled");
            if (a != null) {
                if (!a.booleanValue()) {
                    a = null;
                }
                if (a != null) {
                    JsonObject d = g7rVar.a().d("restrictions");
                    if (d != null) {
                        jxb jxbVar = new jxb(d);
                        g5r g5rVar = new g5r(1);
                        JsonObject d2 = jxbVar.d("by_device");
                        if (d2 != null) {
                            jxb jxbVar2 = new jxb(d2);
                            String str = Build.MANUFACTURER;
                            str.getClass();
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            JsonArray c = jxbVar2.c(lowerCase);
                            if (c != null) {
                                booleanValue = ((Boolean) g5rVar.invoke(c)).booleanValue();
                                z = !booleanValue;
                            }
                        }
                        JsonArray c2 = jxbVar.c("by_api");
                        booleanValue = c2 != null ? ((Boolean) g5rVar.invoke(c2)).booleanValue() : false;
                        z = !booleanValue;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026d A[LOOP:6: B:162:0x0249->B:171:0x026d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G0(los losVar, List list, boolean z) {
        int i;
        int i2;
        int i3;
        lns lnsVar;
        lns lnsVar2;
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        wls wlsVar;
        char c2;
        xls xlsVar;
        char[] cArr = losVar.a;
        int i4 = 1;
        if (z) {
            losVar.b(1);
        }
        ArrayList arrayList = new ArrayList();
        String F0 = F0(losVar, z);
        Throwable th = null;
        if (losVar.a() == 0) {
            if (z) {
                throw new mos("''' expected at end of string literal at " + losVar.b, null);
            }
            if (F0 != null) {
                list.add(new zls(F0));
                return;
            }
            return;
        }
        if (O(losVar.a(), losVar)) {
            if (F0 == null) {
                F0 = "";
            }
            list.add(new zls(F0));
            losVar.b(1);
            return;
        }
        jns jnsVar = jns.a;
        if (F0 != null && U(losVar.a(), losVar)) {
            arrayList.add(jnsVar);
            arrayList.add(new zls(F0));
        }
        while (U(losVar.a(), losVar)) {
            ArrayList arrayList2 = new ArrayList();
            if (U(losVar.a(), losVar)) {
                int i5 = 2;
                losVar.b(2);
                while (losVar.a() != 0 && losVar.a() != '}') {
                    char a = losVar.a();
                    if (a != '!') {
                        if (a == '/') {
                            i3 = i4;
                            arrayList2.add(lms.a);
                            losVar.b(i3);
                        } else if (a != ':') {
                            if (a != '|') {
                                switch (a) {
                                    case '%':
                                        arrayList2.add(mms.a);
                                        i3 = 1;
                                        losVar.b(1);
                                        break;
                                    case '&':
                                        if (los.c(losVar) != '&') {
                                            throw N(losVar);
                                        }
                                        arrayList2.add(pms.a);
                                        i = 2;
                                        losVar.b(2);
                                        break;
                                    case '\'':
                                        G0(losVar, arrayList2, i4);
                                        th = null;
                                        i5 = 2;
                                    case '(':
                                        i3 = i4;
                                        arrayList2.add(tls.a);
                                        losVar.b(i3);
                                        break;
                                    case ')':
                                        i3 = i4;
                                        arrayList2.add(uls.a);
                                        losVar.b(i3);
                                        break;
                                    case '*':
                                        i3 = i4;
                                        arrayList2.add(nms.a);
                                        losVar.b(i3);
                                        break;
                                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                                        i3 = i4;
                                        if (V(arrayList2)) {
                                            lnsVar = ens.a;
                                        } else {
                                            if (!T(arrayList2)) {
                                                throw N(losVar);
                                            }
                                            lnsVar = ums.a;
                                        }
                                        arrayList2.add(lnsVar);
                                        losVar.b(i3);
                                        break;
                                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                        i3 = i4;
                                        arrayList2.add(vls.a);
                                        losVar.b(i3);
                                        break;
                                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                        i3 = i4;
                                        if (V(arrayList2)) {
                                            lnsVar2 = cns.a;
                                        } else {
                                            if (!T(arrayList2)) {
                                                throw N(losVar);
                                            }
                                            lnsVar2 = tms.a;
                                        }
                                        arrayList2.add(lnsVar2);
                                        losVar.b(i3);
                                        break;
                                    default:
                                        switch (a) {
                                            case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                                                i = i5;
                                                if (los.c(losVar) != '=') {
                                                    arrayList2.add(fms.a);
                                                    i3 = 1;
                                                    losVar.b(1);
                                                    break;
                                                } else {
                                                    arrayList2.add(gms.a);
                                                    losVar.b(i);
                                                    break;
                                                }
                                            case '=':
                                                i = i5;
                                                if (los.c(losVar) != '=') {
                                                    throw N(losVar);
                                                }
                                                arrayList2.add(ims.a);
                                                losVar.b(i);
                                                break;
                                            case '>':
                                                i2 = i4;
                                                if (los.c(losVar) == '=') {
                                                    arrayList2.add(ems.a);
                                                    i = 2;
                                                    losVar.b(2);
                                                } else {
                                                    i = 2;
                                                    arrayList2.add(dms.a);
                                                    losVar.b(i2);
                                                }
                                                int i6 = i2;
                                                i5 = i;
                                                i4 = i6;
                                                break;
                                            case '?':
                                                i3 = i4;
                                                arrayList2.add(zms.a);
                                                losVar.b(i3);
                                                break;
                                            default:
                                                char a2 = losVar.a();
                                                if (a2 == ' ' || a2 == '\t' || a2 == '\r' || a2 == '\n') {
                                                    i3 = i4;
                                                    losVar.b(i3);
                                                    break;
                                                } else if (P(losVar.a(), los.d(losVar), los.c(losVar))) {
                                                    int i7 = losVar.b;
                                                    boolean z5 = CollectionsKt.Z(arrayList2) instanceof cns;
                                                    if (z5) {
                                                        z75.B(arrayList2);
                                                    }
                                                    do {
                                                        losVar.b(i4);
                                                    } while (Character.isDigit(losVar.a()));
                                                    if (((i7 < 0 || i7 >= cArr.length) ? (char) 0 : cArr[i7]) == '.' || P(losVar.a(), los.d(losVar), los.c(losVar))) {
                                                        while (P(losVar.a(), los.d(losVar), los.c(losVar))) {
                                                            losVar.b(1);
                                                        }
                                                        int i8 = losVar.b;
                                                        String concat = z5 ? "-".concat(c.l(cArr, i7, i8)) : c.l(cArr, i7, i8);
                                                        try {
                                                            arrayList2.add(new yls(Double.valueOf(Double.parseDouble(concat))));
                                                        } catch (Exception unused) {
                                                            kac.h(hrg.q("Value ", concat, " can't be converted to Number type."), th);
                                                            return;
                                                        }
                                                    } else {
                                                        int i9 = losVar.b;
                                                        String concat2 = z5 ? "-".concat(c.l(cArr, i7, i9)) : c.l(cArr, i7, i9);
                                                        try {
                                                            arrayList2.add(new yls(Long.valueOf(Long.parseLong(concat2))));
                                                        } catch (Exception unused2) {
                                                            kac.h(hrg.q("Value ", concat2, " can't be converted to Integer type."), th);
                                                            return;
                                                        }
                                                    }
                                                    i4 = 1;
                                                    i5 = 2;
                                                } else {
                                                    char a3 = losVar.a();
                                                    char c3 = 'A';
                                                    char c4 = '{';
                                                    char c5 = 'a';
                                                    boolean z6 = ('a' <= a3 && a3 < '{') || ('A' <= a3 && a3 < '[') || a3 == '_';
                                                    xms xmsVar = xms.a;
                                                    if (z6) {
                                                        int i10 = losVar.b;
                                                        Integer num = null;
                                                        while (true) {
                                                            int i11 = losVar.b;
                                                            while (true) {
                                                                char a4 = losVar.a();
                                                                if ((c5 <= a4 && a4 < c4) || (c3 <= a4 && a4 < '[') || a4 == '_' || ('0' <= a4 && a4 < ':')) {
                                                                    losVar.b(1);
                                                                    c3 = 'A';
                                                                } else {
                                                                    if (losVar.a() == '.') {
                                                                        int i12 = losVar.b + 1;
                                                                        num = Integer.valueOf(i12);
                                                                        losVar.b(1);
                                                                        if (i12 - i11 <= 1) {
                                                                            kac.h("Unexpected token: .", null);
                                                                            return;
                                                                        }
                                                                    }
                                                                    char a5 = losVar.a();
                                                                    if (c5 > a5 || a5 >= c4) {
                                                                        c = 'A';
                                                                        if (('A' > a5 || a5 >= '[') && a5 != '_' && ('0' > a5 || a5 >= ':')) {
                                                                            z2 = false;
                                                                            if (!z2) {
                                                                                if (!(losVar.a() == '.')) {
                                                                                    int i13 = losVar.b;
                                                                                    while (true) {
                                                                                        char a6 = losVar.a();
                                                                                        if (a6 != ' ' && a6 != '\t') {
                                                                                            if (a6 != '\r' && a6 != '\n') {
                                                                                                z3 = false;
                                                                                                if (z3) {
                                                                                                    losVar.b(1);
                                                                                                } else {
                                                                                                    if (losVar.a() == '(') {
                                                                                                        wlsVar = new wls(c.l(cArr, num != null ? num.intValue() : i10, i13));
                                                                                                        if (num == null) {
                                                                                                            arrayList2.add(wlsVar);
                                                                                                            i4 = 1;
                                                                                                            break;
                                                                                                        } else {
                                                                                                            z4 = true;
                                                                                                            i13 = num.intValue() - 1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        z4 = true;
                                                                                                        wlsVar = null;
                                                                                                    }
                                                                                                    String l = c.l(cArr, i10, i13);
                                                                                                    if (l.equals(PListParser.TAG_TRUE)) {
                                                                                                        xlsVar = new xls(z4);
                                                                                                        c2 = 0;
                                                                                                    } else if (l.equals(PListParser.TAG_FALSE)) {
                                                                                                        c2 = 0;
                                                                                                        xlsVar = new xls(false);
                                                                                                    } else {
                                                                                                        c2 = 0;
                                                                                                        xlsVar = null;
                                                                                                    }
                                                                                                    if (xlsVar == null) {
                                                                                                        int i14 = i13 - 1;
                                                                                                        if ((((i14 < 0 || i14 >= cArr.length) ? c2 : cArr[i14]) == '.' ? (char) 1 : c2) != 0) {
                                                                                                            kac.h("Unexpected token: .", null);
                                                                                                            return;
                                                                                                        }
                                                                                                        arrayList2.add(new bms(l));
                                                                                                    } else {
                                                                                                        arrayList2.add(xlsVar);
                                                                                                    }
                                                                                                    if (wlsVar != null) {
                                                                                                        arrayList2.add(xmsVar);
                                                                                                        arrayList2.add(wlsVar);
                                                                                                    }
                                                                                                    i4 = 1;
                                                                                                }
                                                                                            }
                                                                                            z3 = true;
                                                                                            if (z3) {
                                                                                            }
                                                                                        }
                                                                                        z3 = true;
                                                                                        if (z3) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            c4 = c4;
                                                                            c3 = c;
                                                                            c5 = 'a';
                                                                        }
                                                                    } else {
                                                                        c = 'A';
                                                                    }
                                                                    z2 = true;
                                                                    if (!z2) {
                                                                    }
                                                                    c4 = c4;
                                                                    c3 = c;
                                                                    c5 = 'a';
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (!(losVar.a() == '.')) {
                                                            throw N(losVar);
                                                        }
                                                        i3 = 1;
                                                        losVar.b(1);
                                                        arrayList2.add(xmsVar);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                }
                            } else {
                                if (los.c(losVar) != '|') {
                                    throw N(losVar);
                                }
                                arrayList2.add(qms.a);
                                i = 2;
                                losVar.b(2);
                            }
                            i5 = i;
                            i4 = 1;
                        } else {
                            arrayList2.add(yms.a);
                            i3 = 1;
                            losVar.b(1);
                        }
                        i4 = i3;
                        th = null;
                        i5 = 2;
                    } else {
                        if (los.c(losVar) == '=') {
                            arrayList2.add(jms.a);
                            i = 2;
                            losVar.b(2);
                        } else {
                            i = 2;
                            if (los.c(losVar) == ':') {
                                arrayList2.add(bns.a);
                                losVar.b(2);
                            } else {
                                if (!V(arrayList2)) {
                                    throw N(losVar);
                                }
                                arrayList2.add(dns.a);
                                i2 = 1;
                                losVar.b(1);
                                int i62 = i2;
                                i5 = i;
                                i4 = i62;
                            }
                        }
                        i5 = i;
                        i4 = 1;
                    }
                    th = null;
                }
                int i15 = i4;
                if (losVar.a() != '}') {
                    throw new mos("'}' expected at end of expression at " + losVar.b, null);
                }
                losVar.b(i15);
            }
            String F02 = F0(losVar, z);
            if (!z && arrayList.isEmpty() && F02 == null && !U(losVar.a(), losVar)) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(jnsVar);
            }
            arrayList.add(kns.a);
            arrayList.addAll(arrayList2);
            arrayList.add(ins.a);
            if (F02 != null) {
                arrayList.add(new zls(F02));
            }
            i4 = 1;
            th = null;
        }
        if (z && !O(losVar.a(), losVar)) {
            throw new mos("''' expected at end of string literal at " + losVar.b, null);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(hns.a);
        }
        if (z) {
            losVar.b(1);
        }
    }

    public static qne H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Получение фичефлагов", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "get_feature_flags", "get_feature_flags", k);
    }

    public static qne H0(String str) {
        String concat = "Получен redirect Челлендж, метод: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("method", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "received_redirect_challenge", "received_redirect_challenge", vtmVar);
    }

    public static String I(fbs fbsVar) {
        int ordinal = fbsVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "" : "scanner" : "email" : "CVN" : "срока действия карты" : "номера карты";
    }

    public static qne I0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Получен 3DS Челлендж", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "received_3ds_challenge", "received_3ds_challenge", k);
    }

    public static String J(yfk yfkVar) {
        switch (yfkVar.ordinal()) {
            case 0:
                return "Оплата привязанной картой";
            case 1:
                return "Оплата новой картой";
            case 2:
                return "Оплата через счёт в Яндекс-Банке";
            case 3:
                return "Оплата через Систему Быстрых Платежей";
            case 4:
                return "Оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
            case 5:
                return "Оплата привязанным СБП токеном";
            case 6:
                return "Оплата наличными";
            case 7:
                return "Оплата через ApplePay";
            case 8:
                return "Оплата через GooglePay";
            default:
                return "Неизвестный метод оплаты";
        }
    }

    public static qne J0(String str) {
        str.getClass();
        String concat = "Статус, с которым завершился процесс 3DS: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("status_3ds", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "3ds_status", "3ds_status", vtmVar);
    }

    public static String K(zso zsoVar) {
        int ordinal = zsoVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? "" : "привязки карты" : "оплаты новой картой";
    }

    public static qne K0(String str, String str2, String str3) {
        StringBuilder m = f1d.m("Старт ", str.equals("sms_challenge") ? "СМС челленджа" : str.equals("random_amt") ? "челленджа на сумму" : "неизвестного челленджа", ": challenge_method = ", str, ", verification_id = ");
        m.append(str2);
        String sb = m.toString();
        if (str3 != null) {
            sb = ouj.o(sb, ", format = ", str3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("challenge_method", new jkr(str));
        linkedHashMap.put("verification_id", new jkr(str2));
        if (str3 != null) {
            linkedHashMap.put("format", new jkr(str3));
        }
        vtm k = su4.k(sb, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "received_challenge_info", "received_challenge_info", k);
    }

    public static final int L(xjo xjoVar) {
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT changes()");
        try {
            D0.q();
            int i = (int) D0.getLong(0);
            i4w.w(D0, null);
            return i;
        } finally {
        }
    }

    public static qne L0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Получен CVV Челлендж", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "received_cvv_challenge", "received_cvv_challenge", k);
    }

    public static qne M(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        if (str == null) {
            str = "default";
        }
        linkedHashMap.put("diehard_instance_id", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Интеграционный профиль получен от бэка"));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "integration_profile_from_back", "integration_profile_from_back", vtmVar);
    }

    public static qne M0(String str) {
        String concat = "Получена нетерминальная ошибка: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("reason", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "received_non_terminal_error", "received_non_terminal_error", vtmVar);
    }

    public static khb N(los losVar) {
        return new khb("Invalid token '" + losVar.a() + "' at position " + losVar.b, (Throwable) null);
    }

    public static qne N0(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        String str4 = "Получен Челлендж на сумму, verification_id = " + str + ", валюта: " + str2;
        if (str3 != null) {
            str4 = ouj.o(str4, ", authorize_amount_format = ", str3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(str));
        linkedHashMap.put("authorize_currency", new jkr(str2));
        if (str3 != null) {
            linkedHashMap.put("authorize_amount_format", new jkr(str3));
        }
        vtm k = su4.k(str4, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "received_random_amt_challenge", "received_random_amt_challenge", k);
    }

    public static boolean O(char c, los losVar) {
        if (c == '\'') {
            int i = losVar.b;
            char[] cArr = losVar.a;
            if (i < cArr.length) {
                int i2 = 0;
                for (int i3 = i - 1; i3 > 0 && cArr[i3] == '\\'; i3--) {
                    i2++;
                }
                if (i2 % 2 == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public static qne O0(String str) {
        str.getClass();
        String concat = "Получен СБП Челлендж, qrc_id = ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("qrc_id", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "received_sbp_challenge", "received_sbp_challenge", vtmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r8 == '-') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        if (r7 != 'E') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (java.lang.Character.isDigit(r8) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean P(char c, char c2, char c3) {
        boolean z;
        if (!Character.isDigit(c)) {
            if (c != '+') {
                if (c == 'E' || c == 'e') {
                    if (Character.isDigit(c2)) {
                        if (!Character.isDigit(c3)) {
                            if (c3 != '+') {
                            }
                        }
                        z = true;
                        if (!z) {
                            return false;
                        }
                    }
                } else if (c != '-') {
                    if (c == '.') {
                        z = Character.isDigit(c3);
                        if (!z) {
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
            if (c2 != 'e') {
            }
        }
        return true;
    }

    public static qne P0(String str) {
        str.getClass();
        String concat = "Получен СМС Челлендж, verification_id = ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "received_sms_challenge", "received_sms_challenge", vtmVar);
    }

    public static final boolean Q(f4h f4hVar) {
        f4hVar.getClass();
        if (f4hVar instanceof e4h) {
            return ((e4h) f4hVar).a();
        }
        if (f4hVar instanceof a4h) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static qne Q0(String str) {
        String concat = "Получен неизвестный Челлендж, метод: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("method", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "received_undefined_challenge", "received_undefined_challenge", vtmVar);
    }

    public static final boolean R(u3q u3qVar) {
        u3qVar.getClass();
        p4q p4qVar = (p4q) ocg.k(u3qVar, klx.j);
        if (p4qVar == null) {
            return false;
        }
        int ordinal = p4qVar.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1 || ordinal == 2) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static qne R0(String str) {
        String concat = "Получен web Челлендж, метод: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("method", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "received_web_challenge", "received_web_challenge", vtmVar);
    }

    public static final boolean S(f4h f4hVar) {
        f4hVar.getClass();
        if (Intrinsics.d(f4hVar, a4h.a)) {
            return false;
        }
        if (f4hVar instanceof e4h) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static qne S0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Повторная инициализация платежа", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "reinit_payment", "reinit_payment", k);
    }

    public static boolean T(ArrayList arrayList) {
        if (arrayList.isEmpty() || (CollectionsKt.Y(arrayList) instanceof fns)) {
            return false;
        }
        return (CollectionsKt.Y(arrayList) instanceof cms) || (CollectionsKt.Y(arrayList) instanceof uls);
    }

    public static final t6k T0(float f, long j, float f2, boolean z, Object obj, hq5 hq5Var, int i, int i2) {
        a7g a7gVar;
        aqi aqiVar;
        aqi aqiVar2;
        aqi aqiVar3;
        a7g a7gVar2;
        aqi aqiVar4;
        aqi aqiVar5;
        aqi aqiVar6;
        Object ovVar;
        a7g a7gVar3;
        float f3 = (i2 & 4) != 0 ? 1.0f : f2;
        boolean z2 = (i2 & 8) != 0 ? true : z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.W(-184777647, (i2 & 16) != 0 ? null : obj);
        aqi o0 = szf.o0(Float.valueOf(yhn.c(f, 0.0f, 1.0f)), oq5Var);
        aqi o02 = szf.o0(Long.valueOf(j), oq5Var);
        aqi o03 = szf.o0(Boolean.valueOf(z2), oq5Var);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        aqi o04 = szf.o0(Float.valueOf(f3), oq5Var);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new a7g(((Number) o0.getValue()).floatValue());
            oq5Var.k0(K);
        }
        a7g a7gVar4 = (a7g) K;
        Float valueOf = Float.valueOf(((Number) o0.getValue()).floatValue());
        boolean h = oq5Var.h(a7gVar4) | oq5Var.f(o0) | oq5Var.f(o02) | oq5Var.f(o03) | oq5Var.f(o04);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            oh3 oh3Var = new oh3(a7gVar4, o0, o02, o03, o04, null, 7);
            a7gVar = a7gVar4;
            aqiVar = o02;
            aqiVar2 = o03;
            aqiVar3 = o04;
            oq5Var.k0(oh3Var);
            K2 = oh3Var;
        } else {
            a7gVar = a7gVar4;
            aqiVar3 = o04;
            aqiVar2 = o03;
            aqiVar = o02;
        }
        gld.y(a7gVar, valueOf, (Function2) K2, oq5Var);
        Boolean bool = (Boolean) aqiVar2.getValue();
        bool.getClass();
        Float valueOf2 = Float.valueOf(((Number) aqiVar3.getValue()).floatValue());
        boolean h2 = oq5Var.h(a7gVar) | oq5Var.f(aqiVar2) | oq5Var.f(aqiVar3) | oq5Var.f(aqiVar);
        Object K3 = oq5Var.K();
        if (h2 || K3 == kjnVar) {
            aqi aqiVar7 = aqiVar;
            aqi aqiVar8 = aqiVar2;
            aqi aqiVar9 = aqiVar3;
            a7g a7gVar5 = a7gVar;
            v24 v24Var = new v24((Object) a7gVar5, aqiVar8, aqiVar9, (Object) aqiVar7, (Continuation) null, 6);
            a7gVar2 = a7gVar5;
            aqiVar4 = aqiVar8;
            aqiVar5 = aqiVar9;
            aqiVar6 = aqiVar7;
            oq5Var.k0(v24Var);
            K3 = v24Var;
        } else {
            a7gVar2 = a7gVar;
            aqiVar5 = aqiVar3;
            aqiVar4 = aqiVar2;
            aqiVar6 = aqiVar;
        }
        gld.x(a7gVar2, bool, valueOf2, (Function2) K3, oq5Var);
        boolean h3 = oq5Var.h(a7gVar2) | oq5Var.f(o0) | oq5Var.f(aqiVar4) | oq5Var.f(aqiVar5) | oq5Var.f(aqiVar6);
        Object K4 = oq5Var.K();
        if (h3 || K4 == kjnVar) {
            a7gVar3 = a7gVar2;
            ovVar = new ov(a7gVar3, o0, aqiVar4, aqiVar5, aqiVar6, (Continuation) null, 28);
            oq5Var.k0(ovVar);
        } else {
            ovVar = K4;
            a7gVar3 = a7gVar2;
        }
        gld.w(oq5Var, a7gVar3, (Function2) ovVar);
        t6k t6kVar = a7gVar3.b;
        oq5Var.p(false);
        return t6kVar;
    }

    public static boolean U(char c, los losVar) {
        return c == '@' && los.d(losVar) != '\\' && los.c(losVar) == '{';
    }

    public static final bg5 U0(xli xliVar, Context context, eli eliVar, hq5 hq5Var, int i) {
        xliVar.getClass();
        context.getClass();
        eliVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        boolean f = ((((i & 896) ^ 384) > 256 && oq5Var.f(eliVar)) || (i & 384) == 256) | oq5Var.f(mm6Var) | oq5Var.f(context);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            w2r b = eliVar.b();
            K2 = f8g.K(mm6Var, xliVar.h, (mqs) b.d, context, new wli(xliVar, b, eliVar));
            oq5Var.k0(K2);
        }
        return (bg5) K2;
    }

    public static boolean V(ArrayList arrayList) {
        return (T(arrayList) || (CollectionsKt.Z(arrayList) instanceof fns)) ? false : true;
    }

    public static qne V0(dq8 dq8Var) {
        dq8Var.getClass();
        ArrayList j = u75.j(dq8Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add(((dq8) it.next()).a);
        }
        String concat = "Запрос в Template Renderer, div_cards = ".concat(CollectionsKt.X(arrayList, ", ", null, null, null, 62));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        my0 my0Var = new my0();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            my0Var.b.add(new jkr((String) it2.next()));
        }
        linkedHashMap.put("div_cards", my0Var);
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "request_to_template_renderer", "request_to_template_renderer", vtmVar);
    }

    public static qne W0(String str, String str2) {
        String concat = "Переход в банк по ссылке из urlTemplate при оплате через СБП, scheme = ".concat(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scheme", new jkr(str2));
        linkedHashMap.put("url_template", new jkr(str));
        vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "sbp_bank_url_opened", "sbp_bank_url_opened", k);
    }

    public static yci X(oxn oxnVar, yci yciVar, Function1 function1) {
        xuj xujVar = xuj.H;
        oxnVar.getClass();
        yciVar.getClass();
        function1.getClass();
        return vnj.q(yciVar, new zk0(oxnVar, klx.d, function1, xujVar, 1));
    }

    public static qne X0(String str) {
        String concat = "Пользователь израсходовал все попытки на ввод кода, verification_id = ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_challenger_attempts_limit", "sbp_challenger_attempts_limit", vtmVar);
    }

    public static final boolean Y(n7q n7qVar, pbj pbjVar) {
        n7qVar.getClass();
        pbjVar.getClass();
        mqs a = n7qVar.b().a();
        if (a == null || !a4g.D(gys.MyMusic, a) || a.A) {
            return false;
        }
        a0q id = ((pbj) wdg.A(n7qVar, new o6m(5))).getId();
        if (pbjVar.equals(nbj.a)) {
            return false;
        }
        if ((pbjVar instanceof lbj) || (pbjVar instanceof obj) || (pbjVar instanceof mbj)) {
            return Intrinsics.d(id, pbjVar.getId());
        }
        b6e.s();
        return false;
    }

    public static qne Y0(String str, boolean z) {
        String r = hrg.r("Открытие приложения банка ", str, StringUtil.SPACE, z ? "успешно" : "неудачно");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("selected_bank", new jkr(str));
        linkedHashMap.put(CameraService.RESULT, new jkr(z ? "success" : "fail"));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_challenger_bank_open", "sbp_challenger_bank_open", vtmVar);
    }

    public static final Intent Z(Context context, String str) {
        str.getClass();
        int i = SkeletonScreenActivity.Z;
        return itk.l(context, "tag_".concat(str), 28, null, null);
    }

    public static qne Z0(String str) {
        String concat = "Пользователь заполнил текстовое поле на экране СБП Челленджера, verification_id = ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_challenger_fill_complete", "sbp_challenger_fill_complete", vtmVar);
    }

    public static final void a(String str, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(487553728);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            long j = ((gtu) oq5Var.j(htu.a)).b;
            v7g.p(j);
            long j2 = j & 1095216660480L;
            long D = v7g.D(kes.c(j) / 64, j2);
            v7g.p(D);
            long D2 = v7g.D(kes.c(D) * 46, D & 1095216660480L);
            v7g.p(j);
            float f = 2;
            long D3 = v7g.D(kes.c(j) / f, j2);
            v7g.p(D2);
            n7w.w(str, ((w3v) oq5Var.j(x3v.a)).b.a, uah.e(new Pair(1, new fds(j, D2, 0.9f, 0.01f)), new Pair(2, new fds(D3, v7g.D(kes.c(D2) / f, D2 & 1095216660480L), 0.9f, 0.01f))), null, 0, 0, oq5Var, i2 & 14, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i, 12);
        }
    }

    public static final yci a0(yci yciVar) {
        return vnj.q(yciVar, new ag0(3, 13));
    }

    public static qne a1(String str, boolean z) {
        String r = hrg.r("Результат попытки ввода кода или суммы ", z ? "успешный" : "неудачный", ", verification_id = ", str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(str));
        linkedHashMap.put(CameraService.RESULT, new jkr(z ? "success" : "fail"));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_challenger_guess_result", "sbp_challenger_guess_result", vtmVar);
    }

    public static final void b(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-369717935);
        if (oq5Var.P(i & 1, i != 0)) {
            q5g.k(null, null, 0L, 0L, null, 0.0f, xp3.e, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d6h(i, 10);
        }
    }

    public static qne b0(zso zsoVar) {
        String concat = "Кнопка Оплатить на экране ввода новой карты активна в сценарии ".concat(K(zsoVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "new_card-pay_button-active", "new_card-pay_button-active", vtmVar);
    }

    public static qne b1(String str) {
        String concat = "Пользователь повторно запросил СМС код, verification_id = ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("verification_id", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_challenger_resend_sms", "sbp_challenger_resend_sms", vtmVar);
    }

    public static final void c(lf5 lf5Var, final a3m a3mVar, hq5 hq5Var, int i) {
        final int i2;
        boolean z;
        lf5Var.getClass();
        a3mVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(542387965);
        if ((((oq5Var.h(lf5Var) ? 4 : 2) | i | (oq5Var.h(a3mVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(a3mVar.e, oq5Var);
            aqi O2 = gld.O(a3mVar.h, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            final aqi aqiVar = (aqi) K;
            boolean h = oq5Var.h(a3mVar);
            Object K2 = oq5Var.K();
            final int i3 = 0;
            if (h || K2 == kjnVar) {
                K2 = new Function0() { // from class: b3m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                gut.d(a3mVar, aqiVar);
                                break;
                            case 1:
                                gut.d(a3mVar, aqiVar);
                                break;
                            default:
                                aqiVar.setValue(Boolean.FALSE);
                                a3mVar.a.finish();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            pd.c(6, 0, oq5Var, (Function0) K2, true);
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(a3mVar);
            Object K3 = oq5Var.K();
            if (h2 || K3 == kjnVar) {
                K3 = new g2l(a3mVar, null, 10);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, unit, (Function2) K3);
            ogp.g.e(((k3m) O.getValue()) instanceof h3m, ((k3m) O.getValue()) instanceof i3m, null, oq5Var, 4096, 4);
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String a2 = ((k3m) O.getValue()).a();
            boolean h3 = oq5Var.h(a3mVar);
            Object K4 = oq5Var.K();
            if (h3 || K4 == kjnVar) {
                i2 = 1;
                K4 = new Function0() { // from class: b3m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                gut.d(a3mVar, aqiVar);
                                break;
                            case 1:
                                gut.d(a3mVar, aqiVar);
                                break;
                            default:
                                aqiVar.setValue(Boolean.FALSE);
                                a3mVar.a.finish();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K4);
            } else {
                i2 = 1;
            }
            final int i5 = 2;
            xp3.d(a2, a, null, null, (Function0) K4, ild.C(671235841, new gab(25, a3mVar, O2), oq5Var), false, false, null, null, null, ild.C(1335113657, new up(O, a3mVar, a, lf5Var, 26), oq5Var), oq5Var, 14352384, 48, 1804);
            oq5Var = oq5Var;
            String M = rvf.M(R.string.playlist_upload_cover_error_message, oq5Var);
            boolean f = oq5Var.f(M);
            Object K5 = oq5Var.K();
            if (f || K5 == kjnVar) {
                K5 = new ds(a3mVar.f, M, i5);
                oq5Var.k0(K5);
            }
            rzf.j((pjc) K5, androidx.compose.foundation.layout.a.l(b.a.a(vciVar, b2c.i), ghh.C(zs4.g(oq5Var), ogp.A(oq5Var))), oq5Var, 0, 0);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(528966530);
                Object K6 = oq5Var.K();
                if (K6 == kjnVar) {
                    K6 = new jc(aqiVar, 20);
                    oq5Var.k0(K6);
                }
                Function0 function0 = (Function0) K6;
                boolean h4 = oq5Var.h(a3mVar);
                Object K7 = oq5Var.K();
                if (h4 || K7 == kjnVar) {
                    K7 = new Function0() { // from class: b3m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    gut.d(a3mVar, aqiVar);
                                    break;
                                case 1:
                                    gut.d(a3mVar, aqiVar);
                                    break;
                                default:
                                    aqiVar.setValue(Boolean.FALSE);
                                    a3mVar.a.finish();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K7);
                }
                bcx.h(function0, (Function0) K7, oq5Var, 6);
                z = false;
            } else {
                z = false;
                oq5Var.Z(522952127);
            }
            oq5Var.p(z);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(lf5Var, a3mVar, i, 15);
        }
    }

    public static qne c0(zso zsoVar) {
        String concat = "Показывать CVN в карточной форме в сценарии ".concat(K(zsoVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "card_data_form_cvn_shown", "card_data_form_cvn_shown", vtmVar);
    }

    public static qne c1(String str, String str2) {
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("sbp_token_id", new jkr(str));
        linkedHashMap.put("verification_id", new jkr(str2));
        vtm k = su4.k("Открытие экрана СБП Челленджера, sbp_token_id = " + str + ", verification_id = " + str2, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "sbp_challenger_screen_opened", "sbp_challenger_screen_opened", k);
    }

    public static final void d(a3m a3mVar, aqi aqiVar) {
        k3m k3mVar = (k3m) a3mVar.b.n.getValue();
        j3m j3mVar = k3mVar instanceof j3m ? (j3m) k3mVar : null;
        if (j3mVar != null ? j3mVar.c : false) {
            aqiVar.setValue(Boolean.TRUE);
        } else {
            a3mVar.a.finish();
        }
    }

    public static qne d0(fbs fbsVar, zso zsoVar) {
        String r = hrg.r("Изменилось значение в поле ввода ", I(fbsVar), " на экране ввода новой карты в сценарии ", K(zsoVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        linkedHashMap.put("field", new jkr(fbsVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "card_data_form-input", "card_data_form-input", vtmVar);
    }

    public static qne d1(String str) {
        String concat = "Ошибка открытия банка ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scheme", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_failed_bank_open", "sbp_failed_bank_open", vtmVar);
    }

    public static final gom e(Function1 function1) {
        fom fomVar = new fom();
        function1.invoke(fomVar);
        jxj jxjVar = fomVar.a;
        String str = fomVar.b;
        DrmSecurityLevel drmSecurityLevel = fomVar.c;
        if (drmSecurityLevel == null) {
            drmSecurityLevel = DrmSecurityLevel.Default;
        }
        return new gom(jxjVar, str, drmSecurityLevel);
    }

    public static qne e0(zso zsoVar) {
        String concat = "Открытие экрана ввода новой карты в сценарии ".concat(K(zsoVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "card_data_form-shown", "card_data_form-shown", vtmVar);
    }

    public static qne e1(String str) {
        str.getClass();
        String concat = "Выбран банк из списка установленных: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("selected_bank", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_installed_bank_list-select_bank-tapped", "sbp_installed_bank_list-select_bank-tapped", vtmVar);
    }

    public static final void f(final ixg ixgVar, hq5 hq5Var, final int i) {
        Object rfgVar;
        fk0 fk0Var;
        oq5 oq5Var;
        xmn r;
        Function2 function2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1622126719);
        int i2 = (oq5Var2.f(ixgVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            ayg value = y1g.Q(new kyg(!((ma5) oq5Var2.j(pa5.a)).g() ? "q2v_history_dark.lottie" : "q2v_history_light.lottie"), oq5Var2).getValue();
            if (value == null) {
                r = oq5Var2.r();
                if (r != null) {
                    final int i3 = 0;
                    function2 = new Function2(ixgVar, i, i3) { // from class: p7n
                        public final /* synthetic */ int a;
                        public final /* synthetic */ ixg b;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    gut.f(this.b, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    gut.f(this.b, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            boolean f = oq5Var2.f(value);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = Integer.valueOf(eeh.b(value.b()));
                oq5Var2.k0(K);
            }
            int intValue = ((Number) K).intValue();
            boolean d = oq5Var2.d(intValue);
            Object K2 = oq5Var2.K();
            if (d || K2 == obj) {
                K2 = weo.S(intValue, 0, nya.d, 2);
                oq5Var2.k0(K2);
            }
            Object obj2 = (act) K2;
            Object K3 = oq5Var2.K();
            if (K3 == obj) {
                K3 = szf.g0(cxg.a);
                oq5Var2.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            Object K4 = oq5Var2.K();
            if (K4 == obj) {
                K4 = vq2.a(0.0f);
                oq5Var2.k0(K4);
            }
            fk0 fk0Var2 = (fk0) K4;
            boolean h = oq5Var2.h(fk0Var2) | ((i2 & 14) == 4) | oq5Var2.f(obj2);
            Object K5 = oq5Var2.K();
            if (h || K5 == obj) {
                fk0Var = fk0Var2;
                rfgVar = new rfg(ixgVar, fk0Var, obj2, aqiVar, null, 22);
                oq5Var2.k0(rfgVar);
            } else {
                rfgVar = K5;
                fk0Var = fk0Var2;
            }
            gld.w(oq5Var2, ixgVar, (Function2) rfgVar);
            iz2 iz2Var = b2c.e;
            boolean h2 = oq5Var2.h(value);
            Object K6 = oq5Var2.K();
            if (h2 || K6 == obj) {
                K6 = new tik(10, value);
                oq5Var2.k0(K6);
            }
            yci b = androidx.compose.ui.layout.a.b(vci.a, (pyc) K6);
            Object K7 = oq5Var2.K();
            if (K7 == obj) {
                K7 = new gkm(19);
                oq5Var2.k0(K7);
            }
            yci a = androidx.compose.ui.graphics.a.a(b, (Function1) K7);
            boolean h3 = oq5Var2.h(fk0Var);
            Object K8 = oq5Var2.K();
            if (h3 || K8 == obj) {
                K8 = new gn6(fk0Var, 2);
                oq5Var2.k0(K8);
            }
            oq5Var = oq5Var2;
            u1g.d(value, (Function0) K8, a, false, null, null, iz2Var, hd6.g, false, oq5Var, 0, 438, 123896);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i4 = 1;
            function2 = new Function2(ixgVar, i, i4) { // from class: p7n
                public final /* synthetic */ int a;
                public final /* synthetic */ ixg b;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj22) {
                    int i42 = this.a;
                    hq5 hq5Var2 = (hq5) obj3;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            gut.f(this.b, hq5Var2, rvf.R(1));
                            break;
                        default:
                            gut.f(this.b, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static qne f0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Данные, полученные от NFC, установлены", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "nfc_data_set_on_card", "nfc_data_set_on_card", k);
    }

    public static qne f1(String str) {
        str.getClass();
        String concat = "Выбран банк из полного списка: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("selected_bank", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_other_bank_list-select_bank-tapped", "sbp_other_bank_list-select_bank-tapped", vtmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(q7n q7nVar, r7n r7nVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        ixg ixgVar;
        boolean z;
        Object K;
        Object obj;
        boolean f;
        Object K2;
        int i3;
        kb5 kb5Var;
        int i4;
        y0h y0hVar;
        String str;
        kb5 kb5Var2;
        kb5 kb5Var3;
        int i5;
        String str2;
        boolean z2;
        r7nVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1526958251);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(q7nVar) : oq5Var.h(q7nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(r7nVar) : oq5Var.h(r7nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi M = gld.M(r7nVar.a.c(), oq5Var);
            int ordinal = ((qmu) M.getValue()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    ixgVar = exg.a;
                    z = ((qmu) M.getValue()) == qmu.a;
                    K = oq5Var.K();
                    obj = gq5.a;
                    if (K == obj) {
                        K = new gkm(18);
                        oq5Var.k0(K);
                    }
                    float f2 = 96;
                    yci e = d.e(d.d(nfp.b(yciVar, true, (Function1) K), 1.0f), f2);
                    f = ((i2 & 112) != 32 || ((i2 & 64) != 0 && oq5Var.h(r7nVar))) | oq5Var.f(M);
                    K2 = oq5Var.K();
                    if (!f || K2 == obj) {
                        K2 = new iik(25, r7nVar, M);
                        oq5Var.k0(K2);
                    }
                    yci e2 = androidx.compose.foundation.a.e(e, false, null, null, (Function0) K2, 7);
                    kfh d = ug3.d(b2c.b, false);
                    i3 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, e2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.n0();
                    } else {
                        oq5Var.k(grbVar);
                    }
                    kb5 kb5Var4 = wp5.f;
                    g0g.U(oq5Var, d, kb5Var4);
                    kb5 kb5Var5 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var5);
                    kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var, i3, kb5Var);
                    }
                    kb5 kb5Var6 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var6);
                    f(ixgVar, oq5Var, 0);
                    vci vciVar = vci.a;
                    yci r = d.r(d.e(androidx.compose.foundation.layout.a.q(vciVar, 8, 0.0f, 0.0f, 0.0f, 14), f2), 64);
                    kfh d2 = ug3.d(b2c.f, false);
                    i4 = oq5Var.P;
                    a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, r);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.n0();
                    } else {
                        oq5Var.k(grbVar);
                    }
                    g0g.U(oq5Var, d2, kb5Var4);
                    g0g.U(oq5Var, l2, kb5Var5);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var, i4, kb5Var);
                    }
                    g0g.U(oq5Var, H2, kb5Var6);
                    c1h c1hVar = (c1h) gld.M(r7nVar.d, oq5Var).getValue();
                    y0hVar = c1hVar == null ? c1hVar.b : null;
                    if (y0hVar != null) {
                        oq5Var.Z(1725763210);
                        oq5Var.p(false);
                        str = null;
                    } else {
                        oq5Var.Z(1725763211);
                        str = !((ma5) oq5Var.j(pa5.a)).g() ? y0hVar.b : y0hVar.a;
                        oq5Var.p(false);
                    }
                    int i6 = q7nVar.c;
                    boolean g = ((ma5) oq5Var.j(pa5.a)).g();
                    int i7 = 0;
                    a4g.c(str, a0g.E(i6 == 0 ? i6 != 1 ? !g ? 2131231772 : 2131231773 : !g ? 2131231770 : 2131231771 : !g ? 2131231768 : 2131231769, 0, oq5Var), null, oq5Var, 0);
                    if (z) {
                        kb5Var2 = kb5Var5;
                        kb5Var3 = kb5Var;
                        oq5Var.Z(1722147619);
                    } else {
                        oq5Var.Z(1726029408);
                        kb5Var3 = kb5Var;
                        kb5Var2 = kb5Var5;
                        jf0.a(new qzm[0], null, true, ild.C(1305860716, new o7n(M, i7), oq5Var), oq5Var, 3072, 2);
                    }
                    oq5Var.p(false);
                    oq5Var.p(true);
                    yci q = androidx.compose.foundation.layout.a.q(b.a.a(vciVar, b2c.e), 80, 0.0f, 16, 0.0f, 10);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    i5 = oq5Var.P;
                    a l3 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, q);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.n0();
                    } else {
                        oq5Var.k(grbVar);
                    }
                    g0g.U(oq5Var, a, kb5Var4);
                    g0g.U(oq5Var, l3, kb5Var2);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var6);
                    String str3 = q7nVar.a;
                    ges j = nu0.j();
                    agr agrVar = eq0.a;
                    xv7.j(str3, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j, oq5Var, 0, 3120, 55290);
                    oq5Var = oq5Var;
                    str2 = q7nVar.b;
                    if (str2 != null || str2.length() == 0) {
                        oq5Var.Z(317847083);
                        u1g.l(oq5Var, d.e(vciVar, 2));
                        xv7.j(str2, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55290);
                        oq5Var = oq5Var;
                        z2 = false;
                    } else {
                        z2 = false;
                        oq5Var.Z(313141779);
                    }
                    oq5Var.p(z2);
                    oq5Var.p(true);
                    oq5Var.p(true);
                } else if (ordinal != 3) {
                    b6e.s();
                    return;
                }
            }
            ixgVar = gxg.a;
            if (((qmu) M.getValue()) == qmu.a) {
            }
            K = oq5Var.K();
            obj = gq5.a;
            if (K == obj) {
            }
            float f22 = 96;
            yci e3 = d.e(d.d(nfp.b(yciVar, true, (Function1) K), 1.0f), f22);
            f = ((i2 & 112) != 32 || ((i2 & 64) != 0 && oq5Var.h(r7nVar))) | oq5Var.f(M);
            K2 = oq5Var.K();
            if (!f) {
            }
            K2 = new iik(25, r7nVar, M);
            oq5Var.k0(K2);
            yci e22 = androidx.compose.foundation.a.e(e3, false, null, null, (Function0) K2, 7);
            kfh d3 = ug3.d(b2c.b, false);
            i3 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, e22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            kb5 kb5Var42 = wp5.f;
            g0g.U(oq5Var, d3, kb5Var42);
            kb5 kb5Var52 = wp5.e;
            g0g.U(oq5Var, l4, kb5Var52);
            kb5Var = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i3, oq5Var, i3, kb5Var);
            kb5 kb5Var62 = wp5.d;
            g0g.U(oq5Var, H4, kb5Var62);
            f(ixgVar, oq5Var, 0);
            vci vciVar2 = vci.a;
            yci r2 = d.r(d.e(androidx.compose.foundation.layout.a.q(vciVar2, 8, 0.0f, 0.0f, 0.0f, 14), f22), 64);
            kfh d22 = ug3.d(b2c.f, false);
            i4 = oq5Var.P;
            a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, r2);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d22, kb5Var42);
            g0g.U(oq5Var, l22, kb5Var52);
            if (!oq5Var.O) {
            }
            ouj.x(i4, oq5Var, i4, kb5Var);
            g0g.U(oq5Var, H22, kb5Var62);
            c1h c1hVar2 = (c1h) gld.M(r7nVar.d, oq5Var).getValue();
            if (c1hVar2 == null) {
            }
            if (y0hVar != null) {
            }
            int i62 = q7nVar.c;
            boolean g2 = ((ma5) oq5Var.j(pa5.a)).g();
            int i72 = 0;
            a4g.c(str, a0g.E(i62 == 0 ? i62 != 1 ? !g2 ? 2131231772 : 2131231773 : !g2 ? 2131231770 : 2131231771 : !g2 ? 2131231768 : 2131231769, 0, oq5Var), null, oq5Var, 0);
            if (z) {
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yci q2 = androidx.compose.foundation.layout.a.q(b.a.a(vciVar2, b2c.e), 80, 0.0f, 16, 0.0f, 10);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            i5 = oq5Var.P;
            a l32 = oq5Var.l();
            yci H32 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a2, kb5Var42);
            g0g.U(oq5Var, l32, kb5Var2);
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var3);
            g0g.U(oq5Var, H32, kb5Var62);
            String str32 = q7nVar.a;
            ges j2 = nu0.j();
            agr agrVar2 = eq0.a;
            xv7.j(str32, null, ((dq0) oq5Var.j(agrVar2)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j2, oq5Var, 0, 3120, 55290);
            oq5Var = oq5Var;
            str2 = q7nVar.b;
            if (str2 != null || str2.length() == 0) {
            }
            oq5Var.p(z2);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            r3.d = new erj(q7nVar, r7nVar, yciVar, i, 7);
        }
    }

    public static qne g0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пользователь нажал на ActionButton", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "pay_button_tapped", "pay_button_tapped", k);
    }

    public static qne g1(String str) {
        String concat = "Отображение экрана ожидания ответа от банка ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("selected_bank", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "sbp_waiting_payment-shown", "sbp_waiting_payment-shown", vtmVar);
    }

    public static final void h(Function0 function0, Function0 function02, qbp qbpVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        wn5 wn5Var2;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(261774651);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(qbpVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            wn5Var2 = wn5Var;
        } else {
            vci vciVar = vci.a;
            float f = 24;
            yci a = androidx.compose.ui.platform.a.a(bfg.Q(androidx.compose.foundation.layout.a.m(d.d(vciVar, 1.0f), f), bfg.C(oq5Var), false, 14), "share_invite_to_family_details_screen");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
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
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float f2 = 12;
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 28, 0.0f, f2, 5);
            int i4 = i2;
            nho a3 = lho.a(qx0.e, b2c.k, oq5Var, 6);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float f3 = 64;
            irf.r(a0g.E(R.drawable.ic_plus_logo, 0, oq5Var), null, d.m(vciVar, f3), null, null, 0.0f, null, oq5Var, 432, 120);
            u1g.l(oq5Var, d.r(vciVar, f2));
            w4k E = a0g.E(((ma5) oq5Var.j(pa5.a)).g() ? R.drawable.ic_music_logo_light : R.drawable.ic_music_logo_dark, 0, oq5Var);
            yci m = d.m(vciVar, f3);
            agr agrVar = eq0.a;
            irf.r(E, null, androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(m, ((dq0) oq5Var.j(agrVar)).a.a, ugo.a), 8), null, null, 0.0f, null, oq5Var, 48, 120);
            oq5Var.p(true);
            xcs.b(rvf.M(R.string.invite_info_title, oq5Var), androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, f, 7), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.d(), oq5Var, 48, 0, 65016);
            xcs.b(rvf.M(R.string.invite_info_description, oq5Var), androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, f, 7), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
            oq5Var = oq5Var;
            yci d = d.d(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            wn5Var2 = wn5Var;
            eta.l((i4 >> 9) & 14, wn5Var2, oq5Var, true);
            float f4 = 5;
            nx0 g = qx0.g(f4);
            nx0 g2 = qx0.g(f4);
            yci q2 = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 16, 0.0f, 0.0f, 13);
            fu6 fu6Var = jnc.a;
            boolean d3 = oq5Var.d(Integer.MAX_VALUE);
            Object K = oq5Var.K();
            if (d3 || K == gq5.a) {
                float f5 = g.d;
                fu6 fu6Var2 = jnc.a;
                float f6 = g2.d;
                nnc.a.getClass();
                rmc rmcVar = rmc.a;
                K = new n5b(2, new enc(g, g2, f5, fu6Var2, f6, new wmc()));
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i7 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H4, kb5Var4);
            nt0.k(((i4 << 3) & 112) | 384, oq5Var, androidx.compose.ui.platform.a.a(vciVar, "conditions_link"), null, rvf.M(R.string.yandex_plus_conditions, oq5Var), function0);
            nt0.k((i4 & 112) | 384, oq5Var, androidx.compose.ui.platform.a.a(vciVar, "privilege_list"), null, rvf.M(R.string.yandex_plus_privilege_list, oq5Var), function02);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, f));
            hdg.t(rvf.M(R.string.share_invite_button_close, oq5Var), qbpVar, androidx.compose.ui.platform.a.a(d.d(d.g(vciVar, 40, 0.0f, 2), 1.0f), "button_close"), null, oq5Var, ((i4 >> 3) & 112) | 384, 8);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(function0, function02, false, qbpVar, wn5Var2, i, 8);
        }
    }

    public static qne h0(String str) {
        str.getClass();
        String concat = "Оплата завершилась с ошибкой: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("reason", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "failed_payment", "failed_payment", vtmVar);
    }

    public static final boolean h1(z66 z66Var) {
        z66Var.getClass();
        return !z66Var.g();
    }

    public static final void i(h8u h8uVar, tmb tmbVar, hq5 hq5Var, int i) {
        h8u h8uVar2;
        int i2;
        Object obj;
        vci vciVar;
        boolean z;
        boolean z2;
        vci vciVar2;
        Object obj2;
        eoe eoeVar;
        h8uVar.getClass();
        i9u i9uVar = h8uVar.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(636784855);
        int i3 = (oq5Var.h(h8uVar) ? 4 : 2) | i | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            d9u d9uVar = (d9u) gld.M(h8uVar.d, oq5Var).getValue();
            q84 q84Var = (q84) gld.M(h8uVar.e, oq5Var).getValue();
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var).f, oq5Var);
            aqi M = gld.M(h8uVar.f, oq5Var);
            int i4 = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).orientation;
            long j = ((dq0) oq5Var.j(eq0.a)).c.a;
            jzk jzkVar = vnj.i;
            vci vciVar3 = vci.a;
            yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.b(vciVar3, j, jzkVar), "video_clip_screen");
            Object K = oq5Var.K();
            Object obj3 = gq5.a;
            if (K == obj3) {
                K = new d4u(12);
                oq5Var.k0(K);
            }
            yci b = nfp.b(a, false, (Function1) K);
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (Intrinsics.d(d9uVar, b9u.a)) {
                oq5Var.Z(758626805);
                Object K2 = oq5Var.K();
                if (K2 == obj3) {
                    K2 = new d4u(13);
                    oq5Var.k0(K2);
                }
                z = false;
                j(nfp.b(vciVar3, false, (Function1) K2), oq5Var, 0);
                oq5Var.p(false);
                i2 = i4;
                obj = obj3;
                vciVar = vciVar3;
            } else if (d9uVar instanceof c9u) {
                oq5Var.Z(758877192);
                Object K3 = oq5Var.K();
                if (K3 == obj3) {
                    K3 = new z8u(i9uVar, h8uVar.b, h8uVar.c);
                    oq5Var.k0(K3);
                }
                y8u y8uVar = (y8u) K3;
                if (i4 == 1) {
                    i2 = i4;
                    obj = obj3;
                    vciVar = vciVar3;
                    oq5Var.Z(759744851);
                    i9uVar.p.a.set(false);
                    x8u x8uVar = (x8u) M.getValue();
                    boolean h = oq5Var.h(y8uVar);
                    Object K4 = oq5Var.K();
                    if (h || K4 == obj) {
                        K4 = new zts(y8uVar, null, 17);
                        oq5Var.k0(K4);
                    }
                    gld.w(oq5Var, x8uVar, (Function2) K4);
                    ArrayList arrayList = ((c9u) d9uVar).a;
                    yci l2 = l(androidx.compose.ui.platform.a.a(vciVar, "lazy_column"), y8uVar, arrayList, i2, oq5Var, 6);
                    oq5Var = oq5Var;
                    w8u.d(arrayList, y8uVar, l2, oq5Var, 0, 0);
                    z = false;
                    oq5Var.p(false);
                } else if (i4 != 2) {
                    oq5Var.Z(717267285);
                    z = false;
                    oq5Var.p(false);
                    i2 = i4;
                    obj = obj3;
                    vciVar = vciVar3;
                } else {
                    oq5Var.Z(759025465);
                    aqi M2 = gld.M(y8uVar.e(), oq5Var);
                    i9uVar.p.a.set(true);
                    ArrayList arrayList2 = ((c9u) d9uVar).a;
                    yci a2 = androidx.compose.ui.platform.a.a(vciVar3, "video_clip_player");
                    Boolean bool = (Boolean) M2.getValue();
                    bool.getClass();
                    vciVar = vciVar3;
                    obj = obj3;
                    yci l3 = l(com.yandex.music.core.ui.compose.b.c(a2, "video_clip_is_playing", bool), y8uVar, arrayList2, i4, oq5Var, 0);
                    i2 = i4;
                    oq5Var = oq5Var;
                    q5g.r(arrayList2, y8uVar, l3, oq5Var, 0, 0);
                    oq5Var.p(false);
                    z = false;
                }
                oq5Var.p(z);
            } else {
                i2 = i4;
                obj = obj3;
                vciVar = vciVar3;
                if (!(d9uVar instanceof a9u)) {
                    throw vz1.i(oq5Var, 717208536, false);
                }
                oq5Var.Z(760546945);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-1304487531, new f8u(h8uVar, tmbVar), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                z = false;
                oq5Var.p(false);
            }
            if (i2 == 1) {
                oq5Var.Z(761110308);
                String M3 = rvf.M(R.string.video_feed_title, oq5Var);
                boolean h2 = oq5Var.h(h8uVar);
                Object K5 = oq5Var.K();
                if (h2 || K5 == obj) {
                    vciVar2 = vciVar;
                    z2 = z;
                    obj2 = obj;
                    eoeVar = n;
                    j6u j6uVar = new j6u(0, h8uVar, h8u.class, "onCollapse", "onCollapse()V", 0, 3);
                    oq5Var.k0(j6uVar);
                    K5 = j6uVar;
                } else {
                    z2 = z;
                    vciVar2 = vciVar;
                    obj2 = obj;
                    eoeVar = n;
                }
                Function0 function0 = (Function0) ((h9f) K5);
                boolean h3 = oq5Var.h(h8uVar);
                Object K6 = oq5Var.K();
                if (h3 || K6 == obj2) {
                    j6u j6uVar2 = new j6u(0, h8uVar, h8u.class, "onCastClick", "onCastClick()V", 0, 4);
                    oq5Var.k0(j6uVar2);
                    K6 = j6uVar2;
                }
                Function0 function02 = (Function0) ((h9f) K6);
                yci l4 = androidx.compose.foundation.layout.a.l(vciVar2, eoeVar);
                Object K7 = oq5Var.K();
                if (K7 == obj2) {
                    K7 = new d4u(14);
                    oq5Var.k0(K7);
                }
                yci b2 = nfp.b(l4, z2, (Function1) K7);
                h8uVar2 = h8uVar;
                u7g.q(M3, function0, function02, q84Var, b2, oq5Var, 0);
            } else {
                z2 = z;
                h8uVar2 = h8uVar;
                oq5Var.Z(754945617);
            }
            oq5Var.p(z2);
            oq5Var.p(true);
        } else {
            h8uVar2 = h8uVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f8u(h8uVar2, tmbVar, i);
        }
    }

    public static qne i0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Платеж завершился с ошибкой, но разрешена новая попытка", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "payment_failed_but_new_attempt_allowed", "payment_failed_but_new_attempt_allowed", k);
    }

    public static qne i1(String str, yfk yfkVar, Integer num, Integer num2, ArrayList arrayList) {
        String str2;
        String str3 = "Ошибка при выборе метода оплаты";
        String str4 = null;
        if (yfkVar != null) {
            str2 = J(yfkVar);
            str3 = "Ошибка при выборе метода оплаты".concat(str2);
        } else {
            str2 = null;
        }
        String o = ouj.o(str3, ": ", str);
        if (num != null) {
            o = o + ", индекс = " + num;
        }
        if (num2 != null) {
            o = o + ", размер списка методов оплаты = " + num2;
        }
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(J((yfk) it.next()));
            }
            str4 = CollectionsKt.X(arrayList2, ", ", null, null, null, 62);
            o = ouj.o(o, ", методы оплаты: ", str4);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        w1g.B(linkedHashMap, DeviceService.KEY_DESC, new jkr(o));
        w1g.B(linkedHashMap, Constants.KEY_MESSAGE, new jkr(str));
        if (str2 != null) {
            w1g.B(linkedHashMap, "current_methods", new jkr(str2));
        }
        if (num != null) {
            w1g.B(linkedHashMap, "position", new oqe(num.intValue(), false));
        }
        if (num2 != null) {
            w1g.B(linkedHashMap, "methods_list_size", new oqe(num2.intValue(), false));
        }
        if (str4 != null) {
            w1g.B(linkedHashMap, "payment_methods", new jkr(str4));
        }
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "select_payment_method_error", "select_payment_method_error", vtmVar);
    }

    public static final void j(yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1455455003);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            wje s = fgq.s(fgq.D(null, oq5Var, 1), 1.0f, 0.5f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), null, oq5Var, 4536, 8);
            fvf a = hvf.a(1, 0, oq5Var, 6, 2);
            q0k c = androidx.compose.foundation.layout.a.c(0.0f, 108, 0.0f, 0.0f, 13);
            boolean f = oq5Var.f(s);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new xp(s, 18);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            weo.f(yciVar2, a, c, null, null, null, false, null, (Function1) K, oq5Var, (i2 & 14) | 12583296, 376);
            oq5Var = oq5Var;
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar2, i, 22);
        }
    }

    public static qne j0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Кнопка Оплатить заблокирована", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "payment_form_button_disabled", "payment_form_button_disabled", k);
    }

    public static qne j1(yfk yfkVar, boolean z) {
        String str;
        switch (yfkVar.ordinal()) {
            case 0:
                str = "Выбрана оплата привязанной картой в качестве метода оплаты";
                break;
            case 1:
                str = "Выбрана оплата новой картой в качестве метода оплаты";
                break;
            case 2:
                str = "Выбрана оплата через счёт в Яндекс-Банке в качестве метода оплаты";
                break;
            case 3:
                str = "Выбрана оплата через Систему Быстрых Платежей в качестве метода оплаты";
                break;
            case 4:
                str = "Выбрана оплата через Систему Быстрых Платежей с возможностью привязки СБП токена в качестве метода оплаты";
                break;
            case 5:
                str = "Выбрана оплата привязанным СБП токеном в качестве метода оплаты";
                break;
            case 6:
                str = "Выбрана оплата наличными в качестве метода оплаты";
                break;
            case 7:
                str = "Выбрана оплата через ApplePay в качестве метода оплаты";
                break;
            case 8:
                str = "Выбрана оплата через GooglePay в качестве метода оплаты";
                break;
            default:
                str = "Выбран метод оплаты";
                break;
        }
        if (z) {
            str = str.concat(" по тапу пользователя");
        }
        String str2 = "select_" + yfkVar + "_option";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("by_tap", new mc3(z));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(str));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", str2, str2, vtmVar);
    }

    public static final void k(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1059913932);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s7g.k(j66.e, j66.f, j66.g, ild.C(-1376623523, new xtp(4, function0), oq5Var), vciVar, false, null, oq5Var, ((i2 << 9) & 57344) | 3510, 224);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(function0, i, 6);
        }
    }

    public static qne k0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Кнопка Оплатить доступна для нажатия", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "payment_form_button_enabled", "payment_form_button_enabled", k);
    }

    public static qne k1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Открытие экрана ввода новой карточки", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "show_main_screen_add_new_card", "show_main_screen_add_new_card", k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0140, code lost:
    
        if (r0 == defpackage.gq5.a) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yci l(yci yciVar, final y8u y8uVar, ArrayList arrayList, final int i, hq5 hq5Var, int i2) {
        String str;
        final aqi M = gld.M(y8uVar.p(), hq5Var);
        m4u m4uVar = (m4u) arrayList.get(((Number) M.getValue()).intValue());
        final aqi M2 = gld.M(y8uVar.e(), hq5Var);
        z9u z9uVar = m4uVar.a;
        boolean z = m4uVar.c;
        if (z9uVar.h != null) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(1248162539);
            str = ", " + rvf.M(R.string.explicit_element_content_description, oq5Var);
            oq5Var.p(false);
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(38415939);
            oq5Var2.p(false);
            str = "";
        }
        final String str2 = str;
        final String o = ouj.o(rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, hq5Var), StringUtil.SPACE, rvf.M(R.string.menu_element_like, hq5Var));
        final String M3 = rvf.M(((Boolean) M2.getValue()).booleanValue() ? R.string.pause : R.string.listen, hq5Var);
        final String M4 = rvf.M(z ? R.string.actions_menu_unlike : R.string.actions_menu_like, hq5Var);
        final String M5 = rvf.M(((Boolean) gld.M(y8uVar.c(), hq5Var).getValue()).booleanValue() ? R.string.unmute_description : R.string.mute_description, hq5Var);
        final String M6 = rvf.M(R.string.player_skip_description, hq5Var);
        final String M7 = rvf.M(R.string.player_previous_description, hq5Var);
        final String M8 = rvf.M(R.string.overflow_menu_content_description, hq5Var);
        final String M9 = rvf.M(i == 1 ? R.string.expand_video_description : R.string.collapse_video_description, hq5Var);
        oq5 oq5Var3 = (oq5) hq5Var;
        boolean f = oq5Var3.f(m4uVar) | oq5Var3.f(str2) | oq5Var3.f(o) | oq5Var3.f(M3) | oq5Var3.f(M2) | oq5Var3.h(y8uVar) | oq5Var3.f(M) | oq5Var3.f(M7) | oq5Var3.f(M6) | oq5Var3.f(M5) | oq5Var3.f(M4) | oq5Var3.f(M9) | oq5Var3.d(i) | oq5Var3.f(M8);
        Object K = oq5Var3.K();
        m4u m4uVar2 = !f ? m4uVar : m4uVar;
        final m4u m4uVar3 = m4uVar2;
        K = new Function1() { // from class: g8u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                z9u z9uVar2 = m4u.this.a;
                String str3 = z9uVar2.e;
                String str4 = z9uVar2.c;
                String concat = str4 != null ? ", ".concat(str4) : "";
                String str5 = z9uVar2.f;
                String str6 = z9uVar2.j;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str2);
                sb.append(concat);
                sb.append(", ");
                sb.append(str5);
                wfp.k(jfpVar, ouj.q(sb, ", ", o, ", ", str6));
                wfp.s(jfpVar, M3);
                y8u y8uVar2 = y8uVar;
                wfp.h(jfpVar, new xes(12, y8uVar2, M2));
                jfpVar.o(hfp.c, new sa(null, new b6u(y8uVar2, 1)));
                wfp.l(jfpVar, xz0.w(new nw6[]{((Number) M.getValue()).intValue() > 0 ? new nw6(M7, new b6u(y8uVar2, 2)) : null, new nw6(M6, new b6u(y8uVar2, 3)), new nw6(M5, new b6u(y8uVar2, 4)), new nw6(M4, new b6u(y8uVar2, 5)), new nw6(M9, new as7(i, y8uVar2, 4)), new nw6(M8, new b6u(y8uVar2, 6))}));
                wfp.x(jfpVar, 1.0f);
                return Unit.a;
            }
        };
        oq5Var3.k0(K);
        return nfp.a(yciVar, (Function1) K);
    }

    public static qne l0(zso zsoVar) {
        String concat = zsoVar != null ? "Завершена валидация значения cvn в сценарии ".concat(K(zsoVar)) : "Завершена валидация значения cvn";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        String str = zsoVar != null ? zsoVar.a : null;
        if (str != null) {
            linkedHashMap.put("scenario", new jkr(str));
        }
        vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "payment_form_cvn_validation_completed", "payment_form_cvn_validation_completed", k);
    }

    public static qne l1() {
        String concat = "Открытие экрана со способами оплаты, предвыбранный метод оплаты ".concat("не существует");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("preferred", new mc3(false));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "show_main_screen_select_payment_method", "show_main_screen_select_payment_method", vtmVar);
    }

    public static qne m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Приложение перешло в бэкграунд", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "application_did_enter_background", "application_did_enter_background", k);
    }

    public static qne m0(zso zsoVar) {
        String concat = "Завершена валидация значения номера карты в сценарии ".concat(K(zsoVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "payment_form_card_validation_completed", "payment_form_card_validation_completed", vtmVar);
    }

    public static qne m1(d0n d0nVar) {
        String str;
        d0nVar.getClass();
        switch (d0nVar.ordinal()) {
            case 0:
                str = "нативного экрана привязки новой карты";
                break;
            case 1:
                str = "DivKit экрана привязки новой карты";
                break;
            case 2:
                str = "нативного экрана выбора способа оплаты";
                break;
            case 3:
                str = "DivKit экрана выбора способа оплаты";
                break;
            case 4:
                str = "нативного экрана предвыбора способа оплаты";
                break;
            case 5:
                str = "DivKit экрана предвыбора способа оплаты";
                break;
            case 6:
                str = "нативного экрана выбора банка";
                break;
            case 7:
                str = "DivKit экрана выбора банка";
                break;
            case 8:
                str = "нативного экрана лицензионного соглашения";
                break;
            case 9:
                str = "DivKit экрана лицензионного соглашения";
                break;
            case 10:
                str = "экрана ввода CVV";
                break;
            case 11:
                str = "экрана вебвью";
                break;
            case 12:
                str = "нативного экрана СМС Челленджа";
                break;
            case 13:
                str = "DivKit экрана СМС Челленджа";
                break;
            case 14:
                str = "нативного экрана Челленджа на сумму";
                break;
            case 15:
                str = "DivKit экрана Челленджа на сумму";
                break;
            default:
                str = "экрана";
                break;
        }
        String concat = "Показ ".concat(str);
        String str2 = "screen_shown_" + d0nVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", str2, str2, k);
    }

    public static qne n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Приложение перешло в форграунд", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "application_did_enter_foreground", "application_did_enter_foreground", k);
    }

    public static qne n0(zso zsoVar) {
        String concat = "Завершена валидация значения срока действия в сценарии ".concat(K(zsoVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "payment_form_date_validation_completed", "payment_form_date_validation_completed", vtmVar);
    }

    public static qne n1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Метод оплаты был предвыбран, экран со способами оплаты не требуется", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "skip_main_screen_select_payment_method", "skip_main_screen_select_payment_method", k);
    }

    public static qne o(boolean z, zso zsoVar, boolean z2) {
        String str = z2 ? "byDefault" : null;
        String r = hrg.r("Изменилось значение в чекбоксе Привязать карточку на ", z ? "Выбрано" : "Не выбрано", " в сценарии ", K(zsoVar));
        if (z2) {
            r = r.concat(", значение задано по умолчанию");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("scenario", new jkr(zsoVar.a));
        if (str != null) {
            linkedHashMap.put("check_box_status", new jkr(str));
        }
        linkedHashMap.put(Constants.KEY_VALUE, new mc3(z));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "link_card_checkbox-changed", "link_card_checkbox-changed", vtmVar);
    }

    public static qne o0(String str) {
        str.getClass();
        String concat = "Ошибка валидации текстового поля: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put(Constants.KEY_VALUE, new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "payment_form_validation_error", "payment_form_validation_error", vtmVar);
    }

    public static qne o1(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("method", new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Начало поллинга платежа без init_payment и supply_payment_data"));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "start_only_polling", "start_only_polling", vtmVar);
    }

    public static qne p() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Проверка с помощью Яндекс-Банк возможности совершения платежа", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "check_payment_called", "check_payment_called", k);
    }

    public static qne p0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Оплата успешно завершилась", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "success_payment", "success_payment", k);
    }

    public static final yci p1(yci yciVar) {
        return vnj.q(yciVar, new ag0(3, 14));
    }

    public static qne q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Нажатие на кнопку назад на экране ввода новой карты", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "clicked_back_button_new_card", "clicked_back_button_new_card", k);
    }

    public static qne q0(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        StringBuilder sb = new StringBuilder("Выполнение сетевого запроса по адресу ");
        su4.v(sb, str4, " в ручку ", str, " с параметрами: request_id = ");
        String s = vz1.s(sb, str3, ", traceparent = ", str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        w1g.B(linkedHashMap, "target_path", new jkr(str));
        w1g.B(linkedHashMap, "traceparent", new jkr(str2));
        w1g.B(linkedHashMap, CommonUrlParts.REQUEST_ID, new jkr(str3));
        w1g.B(linkedHashMap, DeviceService.KEY_DESC, new jkr(s));
        w1g.B(linkedHashMap, "host", new jkr(str4));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "perform_request", "perform_request", vtmVar);
    }

    public static final yci q1(int i, hq5 hq5Var, yci yciVar, Function1 function1) {
        yciVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = szf.g0(new enj(0L));
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Unit unit = Unit.a;
        boolean z = (((i & 112) ^ 48) > 32 && oq5Var.f(function1)) || (i & 48) == 32;
        Object K2 = oq5Var.K();
        if (z || K2 == kjnVar) {
            K2 = new pn4(function1, aqiVar);
            oq5Var.k0(K2);
        }
        return eur.a(yciVar, unit, (PointerInputEventHandler) K2);
    }

    public static qne r() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Нажатие на системную кнопку назад (Android)", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "clicked_back_button_system", "clicked_back_button_system", k);
    }

    public static qne r0(int i, long j, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        StringBuilder sb = new StringBuilder("Выполнение сетевого запроса по адресу ");
        su4.v(sb, str4, " в ручку ", str, " с параметрами: request_id = ");
        String s = vz1.s(sb, str3, ", traceparent = ", str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        w1g.B(linkedHashMap, "target_path", new jkr(str));
        w1g.B(linkedHashMap, "traceparent", new jkr(str2));
        w1g.B(linkedHashMap, CommonUrlParts.REQUEST_ID, new jkr(str3));
        w1g.B(linkedHashMap, DeviceService.KEY_DESC, new jkr(s));
        w1g.B(linkedHashMap, "host", new jkr(str4));
        w1g.B(linkedHashMap, "request_duration", new oqe(j, true));
        w1g.B(linkedHashMap, "code_response", new oqe(i, false));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "perform_request", "perform_request", vtmVar);
    }

    public static final yci r1(yci yciVar) {
        return vnj.q(yciVar, new ag0(3, 15));
    }

    public static qne s(lkp lkpVar, String str) {
        int ordinal = lkpVar.ordinal();
        String str2 = "успеха";
        if (ordinal != 0) {
            if (ordinal == 1) {
                str2 = "неудачи";
            } else if (ordinal == 2) {
                str2 = "отмены";
            } else if (ordinal == 3) {
                str2 = "закрытия пользователем";
            }
        }
        String concat = "Закрытие формы после ".concat(str2);
        if (str != null) {
            concat = ouj.o(concat, ", причина: ", str);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("status", new jkr(String.valueOf(lkpVar)));
        if (str != null) {
            linkedHashMap.put("reason", new jkr(str));
        }
        vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "closed", "closed", k);
    }

    public static qne s0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Карта Пэй отсутствует у пользователя - отображается пункт с открытием Карты Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_need_open_shown", "plus_card_need_open_shown", k);
    }

    public static qne s1(fbs fbsVar, boolean z, zso zsoVar) {
        String s = hrg.s("Фокус перешел на другое текстовое поле на экране ввода новой карты: поле ввода ", I(fbsVar), StringUtil.SPACE, z ? "получило" : "потеряло", " фокус");
        if (zsoVar != null) {
            s = ouj.o(s, " в сценарии ", K(zsoVar));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("field", new jkr(fbsVar.a));
        String str = zsoVar != null ? zsoVar.a : null;
        if (str != null) {
            linkedHashMap.put("scenario", new jkr(str));
        }
        linkedHashMap.put("focus", new mc3(z));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(s));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "text_field_focus_changed", "text_field_focus_changed", vtmVar);
    }

    public static qne t0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пользователь нажал на предложение открыть Карту Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_open_button_tapped", "plus_card_open_button_tapped", k);
    }

    public static final snq t1(SkeletonDataDto skeletonDataDto, gnq gnqVar, boolean z) {
        String type;
        fnq b;
        skeletonDataDto.getClass();
        gnqVar.getClass();
        String id = skeletonDataDto.getId();
        if (id != null) {
            String title = skeletonDataDto.getTitle();
            List<inq> blocks = skeletonDataDto.getBlocks();
            if (blocks != null) {
                ArrayList arrayList = new ArrayList();
                for (inq inqVar : blocks) {
                    drf b2 = (inqVar == null || (type = inqVar.getType()) == null || (b = gnqVar.b(type)) == null) ? null : b.b(inqVar);
                    if (b2 != null) {
                        arrayList.add(b2);
                    }
                }
                if (arrayList.isEmpty() && z) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return new snq(id, title, arrayList);
                }
            }
        }
        return null;
    }

    public static qne u() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Начался процесс 3DS", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "3ds_confirmation", "3ds_confirmation", k);
    }

    public static qne u0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пользователь закрыл шторку открытия Карты Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_open_sheet_dismissed_by_user", "plus_card_open_sheet_dismissed_by_user", k);
    }

    public static final ftq u1(SlideDisclaimerDto slideDisclaimerDto) {
        Integer b0;
        String text = slideDisclaimerDto.getText();
        d85 d85Var = null;
        if (text == null) {
            return null;
        }
        String textColor = slideDisclaimerDto.getTextColor();
        if (textColor != null && (b0 = y2x.b0(textColor)) != null) {
            d85Var = new d85(c3x.f(b0.intValue()));
        }
        return new ftq(text, d85Var);
    }

    public static ObjectAnimator v(View view, b9t b9tVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, wsq wsqVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) b9tVar.b.getTag(R.id.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        d9t d9tVar = new d9t(view, b9tVar.b, translationX, translationY);
        wsqVar.b(d9tVar);
        ofPropertyValuesHolder.addListener(d9tVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public static qne v0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Показ шторки открытия Карты Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_open_sheet_shown", "plus_card_open_sheet_shown", k);
    }

    public static int v1(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            gut gutVar = mut.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return mut.c(i, cmt.f(j, bArr));
        }
        if (i2 == 2) {
            return mut.d(i, cmt.f(j, bArr), cmt.f(j + 1, bArr));
        }
        wvs.b();
        return 0;
    }

    public static qne w0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пользователь нажал кнопку пополнения Карты Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_top_up_button_tapped", "plus_card_top_up_button_tapped", k);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qne x(String str) {
        String str2;
        str.getClass();
        switch (str.hashCode()) {
            case -2105971089:
                if (str.equals("NEW_CARD")) {
                    str2 = "оплата новой картой";
                    break;
                }
                str2 = str;
                break;
            case -1855318471:
                if (str.equals("SBP_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей";
                    break;
                }
                str2 = str;
                break;
            case -1048776318:
                if (str.equals("GOOGLE_PAY")) {
                    str2 = "оплата через GooglePay";
                    break;
                }
                str2 = str;
                break;
            case 2061107:
                if (str.equals("CASH")) {
                    str2 = "оплата наличными";
                    break;
                }
                str2 = str;
                break;
            case 693748227:
                if (str.equals("APPLE_PAY")) {
                    str2 = "оплата через ApplePay";
                    break;
                }
                str2 = str;
                break;
            case 1649876030:
                if (str.equals("NEW_SBP_TOKEN_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
                    break;
                }
                str2 = str;
                break;
            default:
                str2 = str;
                break;
        }
        String concat = "Выбран предвыбранный метод оплаты: ".concat(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put(Constants.KEY_VALUE, new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "default_payment_option_selected", "default_payment_option_selected", vtmVar);
    }

    public static qne x0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пополнение Карты Пэй завершилось с ошибкой", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_top_up_fail", "plus_card_top_up_fail", k);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qne y(String str) {
        String str2;
        str.getClass();
        switch (str.hashCode()) {
            case -2105971089:
                if (str.equals("NEW_CARD")) {
                    str2 = "оплата новой картой";
                    break;
                }
                str2 = str;
                break;
            case -1855318471:
                if (str.equals("SBP_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей";
                    break;
                }
                str2 = str;
                break;
            case -1048776318:
                if (str.equals("GOOGLE_PAY")) {
                    str2 = "оплата через GooglePay";
                    break;
                }
                str2 = str;
                break;
            case 2061107:
                if (str.equals("CASH")) {
                    str2 = "оплата наличными";
                    break;
                }
                str2 = str;
                break;
            case 693748227:
                if (str.equals("APPLE_PAY")) {
                    str2 = "оплата через ApplePay";
                    break;
                }
                str2 = str;
                break;
            case 1649876030:
                if (str.equals("NEW_SBP_TOKEN_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
                    break;
                }
                str2 = str;
                break;
            default:
                str2 = str;
                break;
        }
        String concat = "Не получилось предвыбрать метод оплаты: ".concat(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put(Constants.KEY_VALUE, new jkr(str));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(vtmVar, "event_name", "default_payment_option_selection_failed", "default_payment_option_selection_failed", vtmVar);
    }

    public static qne y0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пополнение Карты Пэй в ожидании", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_top_up_pending", "plus_card_top_up_pending", k);
    }

    public static final yci z(yci yciVar) {
        return vnj.q(yciVar, new ag0(3, 11));
    }

    public static qne z0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Пользователь закрыл шторку пополнения Карты Пэй", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        return su4.j(k, "event_name", "plus_card_top_up_sheet_dismissed_by_user", "plus_card_top_up_sheet_dismissed_by_user", k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return r25 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        long j;
        long j2;
        int i5;
        char charAt2;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (charAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) charAt;
                    i7++;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char charAt3 = str.charAt(i7);
                    if (charAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) charAt3;
                        i8++;
                    } else if (charAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                    throw new jut(i7, length);
                                }
                                wvs.c(charAt3, i8);
                                return 0;
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char charAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new jut(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((charAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j3 = i;
                long j4 = i2 + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i13 = 0;
                    while (true) {
                        j = 1;
                        if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                            cmt.j(bArr, (byte) charAt2, j3);
                            i13++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i13 != length2) {
                        while (i13 < length2) {
                            char charAt5 = str.charAt(i13);
                            if (charAt5 < 128 && j3 < j4) {
                                cmt.j(bArr, (byte) charAt5, j3);
                                j2 = j;
                                j3 += j;
                            } else if (charAt5 >= 2048 || j3 > j4 - 2) {
                                j2 = j;
                                if ((charAt5 < 55296 || 57343 < charAt5) && j3 <= j4 - 3) {
                                    cmt.j(bArr, (byte) ((charAt5 >>> '\f') | 480), j3);
                                    long j5 = 2 + j3;
                                    cmt.j(bArr, (byte) (((charAt5 >>> 6) & 63) | 128), j3 + j2);
                                    j3 += 3;
                                    cmt.j(bArr, (byte) ((charAt5 & '?') | 128), j5);
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i14 = i13 + 1;
                                        if (i14 != length2) {
                                            char charAt6 = str.charAt(i14);
                                            if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                cmt.j(bArr, (byte) ((codePoint2 >>> 18) | 240), j3);
                                                cmt.j(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j3 + j2);
                                                long j6 = j3 + 3;
                                                cmt.j(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), 2 + j3);
                                                j3 += 4;
                                                cmt.j(bArr, (byte) ((codePoint2 & 63) | 128), j6);
                                                i13 = i14;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                        throw new jut(i13 - 1, length2);
                                    }
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                        throw new jut(i13, length2);
                                    }
                                    wvs.d(charAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                cmt.j(bArr, (byte) ((charAt5 >>> 6) | 960), j3);
                                j3 += 2;
                                cmt.j(bArr, (byte) ((charAt5 & '?') | 128), j7);
                            }
                            i13++;
                            j = j2;
                        }
                    }
                    return (int) j3;
                }
                wvs.o(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean W(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        long j;
        int i6 = i;
        switch (this.a) {
            case 0:
                while (i6 < i2 && bArr[i6] >= 0) {
                    i6++;
                }
                if (i6 < i2) {
                    while (i6 < i2) {
                        int i7 = i6 + 1;
                        byte b = bArr[i6];
                        if (b < 0) {
                            if (b < -32) {
                                if (i7 >= i2) {
                                    i4 = b;
                                    break;
                                } else {
                                    if (b >= -62) {
                                        i6 += 2;
                                        if (bArr[i7] > -65) {
                                        }
                                    }
                                    i3 = -1;
                                }
                            } else if (b < -16) {
                                if (i7 >= i2 - 1) {
                                    i3 = mut.a(bArr, i7, i2);
                                } else {
                                    int i8 = i6 + 2;
                                    byte b2 = bArr[i7];
                                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                        i6 += 3;
                                        if (bArr[i8] > -65) {
                                        }
                                    }
                                    i3 = -1;
                                }
                            } else if (i7 >= i2 - 2) {
                                i3 = mut.a(bArr, i7, i2);
                            } else {
                                int i9 = i6 + 2;
                                byte b3 = bArr[i7];
                                if (b3 <= -65) {
                                    if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                        int i10 = i6 + 3;
                                        if (bArr[i9] <= -65) {
                                            i6 += 4;
                                            if (bArr[i10] > -65) {
                                            }
                                        }
                                    }
                                }
                                i3 = -1;
                            }
                            i4 = i3;
                            break;
                        } else {
                            i6 = i7;
                        }
                    }
                }
                i3 = 0;
                i4 = i3;
                break;
            default:
                if ((i6 | i2 | (bArr.length - i2)) >= 0) {
                    long j2 = i6;
                    int i11 = (int) (i2 - j2);
                    long j3 = 1;
                    if (i11 < 16) {
                        i5 = 0;
                    } else {
                        long j4 = j2;
                        i5 = 0;
                        while (true) {
                            if (i5 < i11) {
                                long j5 = j4 + 1;
                                if (cmt.f(j4, bArr) >= 0) {
                                    i5++;
                                    j4 = j5;
                                }
                            } else {
                                i5 = i11;
                            }
                        }
                    }
                    int i12 = i11 - i5;
                    long j6 = j2 + i5;
                    while (true) {
                        byte b4 = 0;
                        while (true) {
                            if (i12 > 0) {
                                long j7 = j6 + j3;
                                b4 = cmt.f(j6, bArr);
                                if (b4 >= 0) {
                                    i12--;
                                    j6 = j7;
                                } else {
                                    j6 = j7;
                                }
                            }
                        }
                        if (i12 != 0) {
                            int i13 = i12 - 1;
                            if (b4 < -32) {
                                if (i13 == 0) {
                                    i4 = b4;
                                    break;
                                } else {
                                    i12 -= 2;
                                    if (b4 >= -62) {
                                        long j8 = j6 + j3;
                                        if (cmt.f(j6, bArr) <= -65) {
                                            j = j3;
                                            j6 = j8;
                                            j3 = j;
                                        }
                                    }
                                }
                            } else if (b4 >= -16) {
                                j = j3;
                                if (i13 < 3) {
                                    i4 = v1(j6, bArr, b4, i13);
                                    break;
                                } else {
                                    i12 -= 4;
                                    long j9 = j6 + j;
                                    byte f = cmt.f(j6, bArr);
                                    if (f <= -65) {
                                        if ((((f + 112) + (b4 << 28)) >> 30) == 0) {
                                            long j10 = 2 + j6;
                                            if (cmt.f(j9, bArr) <= -65) {
                                                j6 += 3;
                                                if (cmt.f(j10, bArr) <= -65) {
                                                    j3 = j;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i13 < 2) {
                                i4 = v1(j6, bArr, b4, i13);
                                break;
                            } else {
                                i12 -= 3;
                                j = j3;
                                long j11 = j6 + j;
                                byte f2 = cmt.f(j6, bArr);
                                if (f2 <= -65 && ((b4 != -32 || f2 >= -96) && (b4 != -19 || f2 < -96))) {
                                    j6 += 2;
                                    if (cmt.f(j11, bArr) <= -65) {
                                        j3 = j;
                                    }
                                }
                            }
                        }
                    }
                    i4 = -1;
                } else {
                    wvs.j("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i2)});
                }
                i4 = 0;
                break;
        }
        return i4 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    wvs.j("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        int i5 = i4;
                        while (i < i3) {
                            int i6 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i7 = i5 + 1;
                                cArr[i5] = (char) b2;
                                int i8 = i6;
                                while (i8 < i3) {
                                    byte b3 = bArr[i8];
                                    if (b3 >= 0) {
                                        i8++;
                                        cArr[i7] = (char) b3;
                                        i7++;
                                    } else {
                                        i5 = i7;
                                        i = i8;
                                    }
                                }
                                i5 = i7;
                                i = i8;
                            } else if (b2 < -32) {
                                if (i6 >= i3) {
                                    throw aye.a();
                                }
                                i += 2;
                                v5g.j(b2, bArr[i6], cArr, i5);
                                i5++;
                            } else if (b2 < -16) {
                                if (i6 >= i3 - 1) {
                                    throw aye.a();
                                }
                                int i9 = i + 2;
                                i += 3;
                                v5g.k(b2, bArr[i6], bArr[i9], cArr, i5);
                                i5++;
                            } else {
                                if (i6 >= i3 - 2) {
                                    throw aye.a();
                                }
                                byte b4 = bArr[i6];
                                int i10 = i + 3;
                                byte b5 = bArr[i + 2];
                                i += 4;
                                v5g.i(b2, b4, b5, bArr[i10], cArr, i5);
                                i5 += 2;
                            }
                        }
                        return new String(cArr, 0, i5);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i52 = i4;
                while (i < i3) {
                }
                return new String(cArr, 0, i52);
            default:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    wvs.j("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i11 = i + i2;
                char[] cArr2 = new char[i2];
                int i12 = 0;
                while (i < i11) {
                    byte f = cmt.f(i, bArr);
                    if (f < 0) {
                        int i13 = i12;
                        while (i < i11) {
                            int i14 = i + 1;
                            byte f2 = cmt.f(i, bArr);
                            if (f2 >= 0) {
                                int i15 = i13 + 1;
                                cArr2[i13] = (char) f2;
                                while (i14 < i11) {
                                    byte f3 = cmt.f(i14, bArr);
                                    if (f3 >= 0) {
                                        i14++;
                                        cArr2[i15] = (char) f3;
                                        i15++;
                                    } else {
                                        i13 = i15;
                                        i = i14;
                                    }
                                }
                                i13 = i15;
                                i = i14;
                            } else if (f2 < -32) {
                                if (i14 >= i11) {
                                    throw aye.a();
                                }
                                i += 2;
                                v5g.j(f2, cmt.f(i14, bArr), cArr2, i13);
                                i13++;
                            } else if (f2 < -16) {
                                if (i14 >= i11 - 1) {
                                    throw aye.a();
                                }
                                int i16 = i + 2;
                                i += 3;
                                v5g.k(f2, cmt.f(i14, bArr), cmt.f(i16, bArr), cArr2, i13);
                                i13++;
                            } else {
                                if (i14 >= i11 - 2) {
                                    throw aye.a();
                                }
                                byte f4 = cmt.f(i14, bArr);
                                int i17 = i + 3;
                                byte f5 = cmt.f(i + 2, bArr);
                                i += 4;
                                v5g.i(f2, f4, f5, cmt.f(i17, bArr), cArr2, i13);
                                i13 += 2;
                            }
                        }
                        return new String(cArr2, 0, i13);
                    }
                    i++;
                    cArr2[i12] = (char) f;
                    i12++;
                }
                int i132 = i12;
                while (i < i11) {
                }
                return new String(cArr2, 0, i132);
        }
    }
}
