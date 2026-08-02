package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneGetSenderHistoryResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneAllowContactsInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneAllowContactsResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneBankCacheInitiatedReceiverType;
import com.ybsdk.core.permissions.RequestPermissionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sh01 implements zm01 {
    public final AppAnalyticsReporter a;
    public final String b;

    public sh01(AppAnalyticsReporter appAnalyticsReporter, String str) {
        this.a = appAnalyticsReporter;
        this.b = str;
    }

    @Override // defpackage.zm01
    public final void a(String str) {
        this.a.q0.v(TransferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult.ERROR, str, "", this.b);
    }

    @Override // defpackage.zm01
    public final void b(TransferEvents$TransferPhoneBankCacheInitiatedReceiverType transferEvents$TransferPhoneBankCacheInitiatedReceiverType, Integer num) {
        TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType transferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType;
        em3 em3Var = this.a.q0;
        int i = rh01.a[transferEvents$TransferPhoneBankCacheInitiatedReceiverType.ordinal()];
        if (i == 1) {
            transferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType = TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType.CONTACT_LIST;
        } else if (i == 2) {
            transferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType = TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType.CLIPBOARD;
        } else if (i == 3) {
            transferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType = TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType.MYSELF;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            transferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType = TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType.MANUAL;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put("receiver_type", transferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType.getOriginalValue());
        if (num != null) {
            linkedHashMap.put("contact_idx", num);
        }
        linkedHashMap.put("is_valid", Boolean.TRUE);
        linkedHashMap.put("transfer_session_id", this.b);
        a aVar = em3Var.a;
        byte[] bArr = y5e.B;
        byte[] bArr2 = new byte[51];
        for (int i2 = 0; i2 < 51; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
        }
        aVar.a(new String(bArr2, uza.a), linkedHashMap);
    }

    @Override // defpackage.zm01
    public final void c(RequestPermissionResult requestPermissionResult) {
        this.a.q0.D(requestPermissionResult.getIsGranted() ? TransferEvents$TransferPhoneAllowContactsResultResult.ALLOWED : TransferEvents$TransferPhoneAllowContactsResultResult.DENIED, this.b);
    }

    @Override // defpackage.zm01
    public final void d() {
        this.a.q0.C(TransferEvents$TransferPhoneAllowContactsInitiatedType.IN_APP_INFO, this.b);
    }

    @Override // defpackage.zm01
    public final void e() {
        this.a.q0.C(TransferEvents$TransferPhoneAllowContactsInitiatedType.SYSTEM, this.b);
    }

    @Override // defpackage.zm01
    public final void f() {
        this.a.q0.C(TransferEvents$TransferPhoneAllowContactsInitiatedType.IN_APP_SETTINGS, this.b);
    }

    @Override // defpackage.zm01
    public final void g(String str) {
        this.a.q0.w(TransferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult.OK, str, null, this.b);
    }

    @Override // defpackage.zm01
    public final void h(boolean z) {
        this.a.q0.w(TransferEvents$TransferCrossBorderByPhoneBankCacheSelectLoadedResult.OK, null, Boolean.valueOf(z), this.b);
    }

    @Override // defpackage.zm01
    public final void i(boolean z) {
        TransferEvents$TransferCrossBorderByPhoneGetSenderHistoryResultResult transferEvents$TransferCrossBorderByPhoneGetSenderHistoryResultResult = z ? TransferEvents$TransferCrossBorderByPhoneGetSenderHistoryResultResult.OK : TransferEvents$TransferCrossBorderByPhoneGetSenderHistoryResultResult.ERROR;
        em3 em3Var = this.a.q0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, transferEvents$TransferCrossBorderByPhoneGetSenderHistoryResultResult.getOriginalValue());
        em3Var.a.a("transfer.cross_border_by_phone.get_sender_history.result", linkedHashMap);
    }

    @Override // defpackage.zm01
    public final Object j(g801 g801Var, Continuation continuation) {
        Object collect = e.t(g801Var).collect(new jpx0(4, this), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }

    @Override // defpackage.zm01
    public final void k(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", (String) obj);
            jSONObject.put("is_default", i == 0);
            jSONArray.put(jSONObject);
            i = i2;
        }
        this.a.q0.v(TransferEvents$TransferCrossBorderByPhoneBankCacheLoadedResult.OK, null, jSONArray.toString(), this.b);
    }

    @Override // defpackage.zm01
    public final void l(int i, String str) {
        em3 em3Var = this.a.q0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(y5e.o(y5e.R), Integer.valueOf(i));
        linkedHashMap.put(y5e.o(y5e.d), str);
        linkedHashMap.put("transfer_session_id", this.b);
        em3Var.a.a(y5e.o(y5e.e), linkedHashMap);
    }

    @Override // defpackage.zm01
    public final void m() {
        this.a.q0.a.a("transfer.cross_border_by_phone.get_sender_history.initiated", null);
    }
}
