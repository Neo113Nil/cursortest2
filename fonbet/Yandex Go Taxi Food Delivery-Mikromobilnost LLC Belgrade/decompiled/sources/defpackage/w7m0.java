package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountThemeChangeSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountThemeChangeSaveResultType;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.entities.AccountType;
import com.ybsdk.feature.savings.internal.screens.account.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class w7m0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ w7m0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r7m0 r7m0Var;
        s7m0 s7m0Var;
        Object obj2;
        int i = this.a;
        SavingsEvents$SavingsAccountThemeChangeSaveResultType savingsEvents$SavingsAccountThemeChangeSaveResultType = null;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                pzt0 pzt0Var = aVar.N;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    aVar.d0(true);
                    break;
                }
                break;
            case 1:
                w9m0 w9m0Var = (w9m0) obj;
                if (aVar.P && w9m0Var.a == SavingsActionStatus.SUCCESS) {
                    ((gdm0) aVar.I).b();
                    break;
                }
                break;
            case 2:
                if (((t9m0) obj).c == SavingsActionStatus.SUCCESS) {
                    aVar.d0(true);
                    break;
                }
                break;
            case 3:
                x9m0 x9m0Var = (x9m0) obj;
                SavingsActionStatus savingsActionStatus = x9m0Var.b;
                boolean z = x9m0Var.a;
                aVar.Q = savingsActionStatus;
                if (savingsActionStatus != SavingsActionStatus.SUCCESS) {
                    if (savingsActionStatus == SavingsActionStatus.ERROR) {
                        Throwable th = x9m0Var.c;
                        if (th != null) {
                            aVar.W("IDEMPOTENCY_KEY_FOR_UNLOCK", th);
                        }
                        aVar.y0(true);
                        break;
                    }
                } else {
                    aVar.Z(a8m0.a);
                    if (!z) {
                        aVar.Z(b8m0.a);
                    }
                    aVar.O = z;
                    aVar.d0(true);
                    break;
                }
                break;
            case 4:
                u9m0 u9m0Var = (u9m0) obj;
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, r7m0.a((r7m0) value, null, null, null, u9m0Var.b == SavingsActionStatus.ERROR ? null : u9m0Var.a, null, null, false, false, 503)));
            default:
                v9m0 v9m0Var = (v9m0) obj;
                s7m0 s7m0Var2 = ((r7m0) aVar.X()).f;
                String str = s7m0Var2 != null ? s7m0Var2.a : null;
                String str2 = v9m0Var.a;
                SavingsActionStatus savingsActionStatus2 = v9m0Var.b;
                if (!jl40.l(str, str2)) {
                    aVar.a0(new g8m0(i2, v9m0Var));
                } else if (savingsActionStatus2 == SavingsActionStatus.ERROR) {
                    Throwable th2 = v9m0Var.c;
                    if (th2 != null) {
                        aVar.W("IDEMPOTENCY_KEY_FOR_THEME", th2);
                    }
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                        r7m0Var = (r7m0) value2;
                        x6m0 x6m0Var = r7m0Var.b;
                        if (x6m0Var != null) {
                            Iterator it = x6m0Var.n.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((s7m0) obj2).b) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            s7m0Var = (s7m0) obj2;
                        } else {
                            s7m0Var = null;
                        }
                    } while (!r0Var2.k(value2, r7m0.a(r7m0Var, null, null, null, null, null, s7m0Var, false, false, 479)));
                }
                if (savingsActionStatus2 != SavingsActionStatus.IN_PROGRESS) {
                    rt1 rt1Var = aVar.E.f0;
                    String str3 = v9m0Var.a;
                    SavingsEvents$SavingsAccountThemeChangeSaveResultResult savingsEvents$SavingsAccountThemeChangeSaveResultResult = savingsActionStatus2 == SavingsActionStatus.SUCCESS ? SavingsEvents$SavingsAccountThemeChangeSaveResultResult.OK : SavingsEvents$SavingsAccountThemeChangeSaveResultResult.ERROR;
                    x6m0 x6m0Var2 = ((r7m0) aVar.X()).b;
                    AccountType accountType = x6m0Var2 != null ? x6m0Var2.d : null;
                    int i3 = accountType == null ? -1 : h8m0.a[accountType.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            savingsEvents$SavingsAccountThemeChangeSaveResultType = SavingsEvents$SavingsAccountThemeChangeSaveResultType.SAVER;
                        } else if (i3 == 2) {
                            savingsEvents$SavingsAccountThemeChangeSaveResultType = SavingsEvents$SavingsAccountThemeChangeSaveResultType.DEPOSIT;
                        } else if (i3 != 3) {
                            w511.b();
                            break;
                        } else {
                            savingsEvents$SavingsAccountThemeChangeSaveResultType = SavingsEvents$SavingsAccountThemeChangeSaveResultType.FUND;
                        }
                    }
                    LinkedHashMap w = g8e.w(3, "theme_id", str3);
                    w.put(TarifficatorScenarioActivity.RESULT_KEY, savingsEvents$SavingsAccountThemeChangeSaveResultResult.getOriginalValue());
                    if (savingsEvents$SavingsAccountThemeChangeSaveResultType != null) {
                        w.put("type", savingsEvents$SavingsAccountThemeChangeSaveResultType.getOriginalValue());
                    }
                    rt1Var.a.a("savings.account.theme_change.save.result", w);
                }
                break;
        }
        return zy11Var;
    }
}
