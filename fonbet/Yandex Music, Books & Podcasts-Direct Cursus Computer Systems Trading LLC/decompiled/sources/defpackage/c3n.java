package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class c3n {
    public final bml a;

    public c3n(bml bmlVar) {
        this.a = bmlVar;
    }

    public static b3n d(LinkedHashMap linkedHashMap) {
        b3n b3nVar;
        Iterator it = linkedHashMap.entrySet().iterator();
        do {
            b3nVar = null;
            if (!it.hasNext()) {
                break;
            }
            bve bveVar = (bve) ((Map.Entry) it.next()).getValue();
            String str = bveVar.l;
            if (str != null) {
                b3nVar = new b3n(new m(str, bveVar.m), false, bveVar);
            } else {
                String str2 = bveVar.n;
                if (str2 != null) {
                    b3nVar = new b3n(new m(str2, bveVar.o), true, bveVar);
                }
            }
        } while (b3nVar == null);
        return b3nVar;
    }

    public static boolean e(String str) {
        return Intrinsics.d(str, "top_button") || Intrinsics.d(str, "bottom_button") || Intrinsics.d(str, "left_button") || Intrinsics.d(str, "right_button");
    }

    public final m a(int i) {
        return new m((String) this.a.invoke(Integer.valueOf(i)), null);
    }

    public final m3n b(LinkedHashMap linkedHashMap) {
        m3n m3nVar;
        m a;
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            bve bveVar = (bve) ((Map.Entry) it.next()).getValue();
            String str = bveVar.b;
            String str2 = bveVar.g;
            String str3 = bveVar.i;
            if (str != null) {
                a = new m(str, bveVar.c);
            } else if (str2 == null || str2.length() == 0) {
                a = a(R.string.purchase_application_buy_title);
            } else {
                a = (str3 == null || str3.length() == 0) ? new m(str2, bveVar.h) : new m(ouj.o(str2, StringUtil.SPACE, str3), bveVar.k);
            }
            m3nVar = new m3n(a, a(R.string.generalised_paywall_subtitle));
        } else {
            m3nVar = null;
        }
        return m3nVar == null ? new m3n(a(R.string.purchase_application_title_without_offer), null) : m3nVar;
    }

    public final q2n c(bve bveVar, boolean z, Function1 function1, Function1 function12) {
        String str = bveVar.g;
        String str2 = (str == null || str.length() == 0) ? null : str;
        if (str2 == null) {
            str2 = (String) this.a.invoke(Integer.valueOf(R.string.subscribe_yandex_music));
        }
        return new q2n(str2, (str == null || str.length() == 0) ? null : bveVar.i, (str == null || str.length() == 0) ? null : bveVar.k, function1, function12, z ? r2n.a : r2n.b);
    }
}
