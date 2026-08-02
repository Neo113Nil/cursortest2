package defpackage;

import android.text.Editable;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class zln implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ amn b;

    public /* synthetic */ zln(amn amnVar, int i) {
        this.a = i;
        this.b = amnVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        amn amnVar = this.b;
        switch (i) {
            case 0:
                wln wlnVar = amnVar.c;
                bmn bmnVar = wlnVar.J;
                bmnVar.i = true;
                bmnVar.b = (Editable) obj;
                bmnVar.c = "";
                wlnVar.Og();
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    wln wlnVar2 = amnVar.c;
                    wlnVar2.D.m(wlnVar2.G.b, wlnVar2.H, wlnVar2.J, SharedPaymentAnalytics$Button.NAME);
                    break;
                }
                break;
            case 2:
                wln wlnVar3 = amnVar.c;
                bmn bmnVar2 = wlnVar3.J;
                bmnVar2.d = (Editable) obj;
                bmnVar2.i = true;
                bmnVar2.e = "";
                wlnVar3.Og();
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    wln wlnVar4 = amnVar.c;
                    wlnVar4.D.m(wlnVar4.G.b, wlnVar4.H, wlnVar4.J, SharedPaymentAnalytics$Button.NAME);
                    break;
                }
                break;
            case 4:
                wln wlnVar5 = amnVar.c;
                bmn bmnVar3 = wlnVar5.J;
                bmnVar3.g = (Editable) obj;
                bmnVar3.i = true;
                bmnVar3.h = "";
                wlnVar5.Og();
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    wln wlnVar6 = amnVar.c;
                    wlnVar6.D.m(wlnVar6.G.b, wlnVar6.H, wlnVar6.J, SharedPaymentAnalytics$Button.LIMIT_VALUE);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
