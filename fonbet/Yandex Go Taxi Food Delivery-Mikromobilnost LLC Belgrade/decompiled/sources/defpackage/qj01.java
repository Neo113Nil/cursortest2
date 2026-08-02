package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsLoadedResult;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.TransferMainAnalyticsInteractor$Companion$LogType;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qj01 {
    public final AppAnalyticsReporter a;
    public final String b;
    public final String c;
    public final String d;
    public final TransferMainAnalyticsInteractor$Companion$LogType e;
    public final hwo0 f;
    public final r0 g;
    public final r0 h;
    public final r0 i;
    public final r0 j;
    public long k;

    public qj01(AppAnalyticsReporter appAnalyticsReporter, vfy0 vfy0Var, String str, String str2, String str3, TransferMainAnalyticsInteractor$Companion$LogType transferMainAnalyticsInteractor$Companion$LogType, TemplatePaymentTypeTransfers templatePaymentTypeTransfers, String str4, String str5) {
        hwo0 hwo0Var;
        this.a = appAnalyticsReporter;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = transferMainAnalyticsInteractor$Companion$LogType;
        if (templatePaymentTypeTransfers != null) {
            hwo0Var = new hwo0((AppAnalyticsReporter) vfy0Var.a.a.get(), templatePaymentTypeTransfers, str4 == null ? "" : str4, str5);
        } else {
            hwo0Var = null;
        }
        this.f = hwo0Var;
        this.g = bvf0.c(null);
        this.h = bvf0.c(null);
        this.i = bvf0.c(null);
        this.j = bvf0.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(xk01 xk01Var) {
        wk01 b = zk01.b(xk01Var);
        wjq0 wjq0Var = b != null ? b.i : null;
        if (wjq0Var instanceof jjq0) {
            v24 v24Var = ((jjq0) b.i).c.f;
            return (v24Var != null && v24Var.a) && (b.C != null);
        }
        if (wjq0Var instanceof ujq0) {
            v24 v24Var2 = ((ujq0) b.i).a.b;
            boolean z = v24Var2 != null && v24Var2.a;
            boolean z2 = b.C != null;
            if (!z || !z2) {
            }
        } else if (!(wjq0Var instanceof ajq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
            w511.b();
        }
    }

    public static String n(rvz0 rvz0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(rvz0Var.a);
        String str = rvz0Var.c;
        if (str != null) {
            sb.append(Extension.FIX_SPACE.concat(str));
        }
        return sb.toString();
    }

    public final void b(p39 p39Var) {
        int i;
        if (p39Var == null || (i = mj01.c[this.e.ordinal()]) == 1) {
            return;
        }
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        if (i == 2) {
            appAnalyticsReporter.L.a.a("payment.mobile_services.payment_amount_cashback_shown", g8e.w(1, "cashback", wsb1.c(p39Var)));
            return;
        }
        if (i == 3) {
            appAnalyticsReporter.E.a.a("payment.internet_tv.payment_amount_cashback_shown", g8e.w(1, "cashback", wsb1.c(p39Var)));
            return;
        }
        if (i != 4) {
            if (i != 5) {
                w511.b();
                return;
            }
            hwo0 hwo0Var = this.f;
            if (hwo0Var != null) {
                String c = wsb1.c(p39Var);
                z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                linkedHashMap.put("cashback", c);
                z94Var.a.a("template_transfer.amount_cashback_shown", linkedHashMap);
            }
        }
    }

    public final void c(String str) {
        int i = mj01.c[this.e.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return;
        }
        if (i != 5) {
            w511.b();
            return;
        }
        hwo0 hwo0Var = this.f;
        if (hwo0Var != null) {
            z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
            String str2 = (String) hwo0Var.b;
            String str3 = (String) hwo0Var.x;
            if (str3 == null) {
                str3 = "";
            }
            LinkedHashMap t = x4e.t(3, "scenario_hash", str2, "item_type", str3);
            t.put("value", str);
            z94Var.a.a("template_transfer.pill_change", t);
        }
    }

    public final void d(String str) {
        int i = mj01.c[this.e.ordinal()];
        if (i != 1) {
            AppAnalyticsReporter appAnalyticsReporter = this.a;
            if (i == 2) {
                qq7 qq7Var = appAnalyticsReporter.L;
                qq7Var.a.a("payment.mobile_services.payment_provider_click", g8e.w(1, "provider", str));
                return;
            }
            if (i == 3) {
                l0p l0pVar = appAnalyticsReporter.E;
                l0pVar.a.a("payment.internet_tv.payment_provider_click", g8e.w(1, "provider", str));
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    w511.b();
                    return;
                }
                hwo0 hwo0Var = this.f;
                if (hwo0Var != null) {
                    z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                    String str2 = (String) hwo0Var.b;
                    String str3 = (String) hwo0Var.x;
                    if (str3 == null) {
                        str3 = "";
                    }
                    LinkedHashMap t = x4e.t(3, "scenario_hash", str2, "value", str);
                    t.put("item_type", str3);
                    z94Var.a.a("template_transfer.pill_click", t);
                }
            }
        }
    }

    public final void e(wjq0 wjq0Var, String str) {
        gjq0 gjq0Var = wjq0Var instanceof gjq0 ? (gjq0) wjq0Var : null;
        if (gjq0Var == null) {
            return;
        }
        String plainString = gjq0Var.e.toPlainString();
        String str2 = gjq0Var.f;
        ejq0 ejq0Var = gjq0Var.h;
        lj01 lj01Var = new lj01(str, plainString, str2, ejq0Var != null ? ejq0Var.a : null);
        r0 r0Var = this.j;
        r0Var.getClass();
        r0Var.m(null, lj01Var);
    }

    public final void f(String str, TransferDirection transferDirection, ButtonTransferType buttonTransferType) {
        int i = mj01.b[transferDirection.ordinal()];
        if (i == 1) {
            g(str, buttonTransferType);
        } else if (i == 2) {
            j(str, buttonTransferType);
        } else {
            w511.b();
        }
    }

    public final void g(String str, ButtonTransferType buttonTransferType) {
        em3 em3Var = this.a.q0;
        String name = buttonTransferType != null ? buttonTransferType.name() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (name != null) {
            linkedHashMap.put("button_type", name);
        }
        linkedHashMap.put("transfer_session_id", this.b);
        String str2 = this.c;
        if (str2 != null) {
            linkedHashMap.put("transfer_direction", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            linkedHashMap.put("transfer_scenario", str3);
        }
        linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str);
        em3Var.a.a("transfer.receiver_accounts.click", linkedHashMap);
    }

    public final void h(String str, mfq0 mfq0Var) {
        em3 em3Var = this.a.q0;
        LinkedHashMap t = x4e.t(5, CreateApplicationWithProductJsonAdapter.productKey, str, "account", ssa1.b(mfq0Var.a));
        t.put("transfer_session_id", this.b);
        String str2 = this.c;
        if (str2 != null) {
            t.put("transfer_direction", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            t.put("transfer_scenario", str3);
        }
        em3Var.a.a("transfer.receiver_accounts.select.initiated2", t);
    }

    public final void i(String str, ArrayList arrayList) {
        em3 em3Var = this.a.q0;
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(ssa1.b(((mfq0) it.next()).a));
        }
        LinkedHashMap t = x4e.t(5, CreateApplicationWithProductJsonAdapter.productKey, str, "accounts_list", jSONArray.toString());
        t.put("transfer_session_id", this.b);
        String str2 = this.c;
        if (str2 != null) {
            t.put("transfer_direction", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            t.put("transfer_scenario", str3);
        }
        em3Var.a.a("transfer.receiver_accounts.shown2", t);
    }

    public final void j(String str, ButtonTransferType buttonTransferType) {
        em3 em3Var = this.a.q0;
        String name = buttonTransferType != null ? buttonTransferType.name() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (name != null) {
            linkedHashMap.put("button_type", name);
        }
        linkedHashMap.put("transfer_session_id", this.b);
        String str2 = this.c;
        if (str2 != null) {
            linkedHashMap.put("transfer_direction", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            linkedHashMap.put("transfer_scenario", str3);
        }
        linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str);
        em3Var.a.a("transfer.sending_accounts.click", linkedHashMap);
    }

    public final void k(String str, lfq0 lfq0Var, ButtonTransferType buttonTransferType) {
        mfq0 mfq0Var = lfq0Var instanceof mfq0 ? (mfq0) lfq0Var : null;
        String str2 = mfq0Var != null ? mfq0Var.a : null;
        phq0 phq0Var = lfq0Var instanceof phq0 ? (phq0) lfq0Var : null;
        String str3 = phq0Var != null ? phq0Var.a : null;
        tfq0 tfq0Var = lfq0Var instanceof tfq0 ? (tfq0) lfq0Var : null;
        String str4 = tfq0Var != null ? tfq0Var.a : null;
        em3 em3Var = this.a.q0;
        String b = str2 != null ? ssa1.b(str2) : null;
        String b2 = str3 != null ? ssa1.b(str3) : null;
        String b3 = str4 != null ? ssa1.b(str4) : null;
        String name = buttonTransferType != null ? buttonTransferType.name() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        if (b != null) {
            linkedHashMap.put("account", b);
        }
        if (b2 != null) {
            byte[] bArr = y5e.W;
            byte[] bArr2 = new byte[7];
            for (int i = 0; i < 7; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            linkedHashMap.put(new String(bArr2, uza.a), b2);
        }
        if (b3 != null) {
            linkedHashMap.put("card_id", b3);
        }
        if (name != null) {
            linkedHashMap.put("button_type", name);
        }
        linkedHashMap.put("transfer_session_id", this.b);
        String str5 = this.c;
        if (str5 != null) {
            linkedHashMap.put("transfer_direction", str5);
        }
        String str6 = this.d;
        if (str6 != null) {
            linkedHashMap.put("transfer_scenario", str6);
        }
        linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str);
        em3Var.a.a("transfer.sending_accounts.select.initiated2", linkedHashMap);
    }

    public final void l(String str, ArrayList arrayList, ButtonTransferType buttonTransferType) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof mfq0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof phq0) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof tfq0) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        em3 em3Var = this.a.q0;
        JSONArray jSONArray = new JSONArray();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jSONArray.put(ssa1.b(((mfq0) it.next()).a));
            }
        }
        String jSONArray2 = jSONArray.toString();
        JSONArray jSONArray3 = new JSONArray();
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                jSONArray3.put(ssa1.b(((phq0) it2.next()).a));
            }
        }
        String jSONArray4 = jSONArray3.toString();
        JSONArray jSONArray5 = new JSONArray();
        if (arrayList4 != null) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                jSONArray5.put(ssa1.b(((tfq0) it3.next()).a));
            }
        }
        String jSONArray6 = jSONArray5.toString();
        String name = buttonTransferType != null ? buttonTransferType.name() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        if (jSONArray2 != null) {
            linkedHashMap.put("accounts_list", jSONArray2);
        }
        if (jSONArray4 != null) {
            byte[] bArr = y5e.j;
            byte[] bArr2 = new byte[10];
            for (int i = 0; i < 10; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            linkedHashMap.put(new String(bArr2, uza.a), jSONArray4);
        }
        if (jSONArray6 != null) {
            linkedHashMap.put("cards_list", jSONArray6);
        }
        if (name != null) {
            linkedHashMap.put("button_type", name);
        }
        linkedHashMap.put("transfer_session_id", this.b);
        String str2 = this.c;
        if (str2 != null) {
            linkedHashMap.put("transfer_direction", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            linkedHashMap.put("transfer_scenario", str3);
        }
        linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str);
        em3Var.a.a("transfer.sending_accounts.shown2", linkedHashMap);
    }

    public final void m(TransferEvents$TransferByDetailsLoadedResult transferEvents$TransferByDetailsLoadedResult) {
        em3 em3Var = this.a.q0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferByDetailsLoadedResult.getOriginalValue());
        linkedHashMap.put("transfer_session_id", this.b);
        String str = this.c;
        if (str != null) {
            linkedHashMap.put("transfer_direction", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            linkedHashMap.put("transfer_scenario", str2);
        }
        em3Var.a.a("transfer.by_details.loaded", linkedHashMap);
    }
}
