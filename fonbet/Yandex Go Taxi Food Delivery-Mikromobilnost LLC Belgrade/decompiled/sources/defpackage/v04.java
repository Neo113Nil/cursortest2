package defpackage;

import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsAccountClickVersion;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class v04 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ v04(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.h0();
                break;
            case 1:
                m04 m04Var = bVar.J;
                thq0 thq0Var = ((u04) bVar.X()).h;
                h5a0 h5a0Var = thq0Var != null ? thq0Var.a : null;
                m04Var.getClass();
                e5a0 e5a0Var = h5a0Var instanceof e5a0 ? (e5a0) h5a0Var : null;
                String str = e5a0Var != null ? e5a0Var.f : null;
                f5a0 f5a0Var = h5a0Var instanceof f5a0 ? (f5a0) h5a0Var : null;
                String str2 = f5a0Var != null ? f5a0Var.e : null;
                z94 z94Var = m04Var.a.e;
                AutotopupEvents$AutoTopupSettingsAccountClickVersion autotopupEvents$AutoTopupSettingsAccountClickVersion = AutotopupEvents$AutoTopupSettingsAccountClickVersion.V2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                if (str != null) {
                    linkedHashMap.put("nspk_id", str);
                }
                if (str2 != null) {
                    linkedHashMap.put("agreement_id", str2);
                }
                linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsAccountClickVersion.getOriginalValue());
                z94Var.a.a("auto_topup.settings.account.click", linkedHashMap);
                bVar.g0(((u04) bVar.X()).h);
                break;
            case 2:
                bVar.I.e();
                break;
            case 3:
                bVar.v0(((u04) bVar.X()).h);
                break;
            default:
                pz40 Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, u04.a((u04) value, null, null, null, null, null, null, qu3.a, null, null, null, null, null, null, null, false, 32703)));
        }
        return zy11Var;
    }
}
