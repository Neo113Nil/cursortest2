package defpackage;

import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.instruction.SafetyCenterInstructionView;
import com.yandex.go.safety.center.instruction.h;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class wrl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ wrl0(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                a aVar = hVar.L;
                String str = hVar.J.a;
                ppl0 ppl0Var = aVar.a;
                ppl0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("instruction_id", str);
                ppl0Var.a.a("SafetyCenter.Instruction.Shown", hashMap, 2, new HashMap());
                break;
            case 1:
                ppl0 ppl0Var2 = hVar.L.a;
                ppl0Var2.a.a("SafetyCenter.Instruction.Closed", tse0.o(ppl0Var2), 1, new HashMap());
                break;
            case 2:
                SafetyCenterInstructionView.renderNewOrderDialog$onMakeNewOrderClick(hVar);
                break;
            case 3:
                hVar.onBackPressed();
                break;
            default:
                SafetyCenterInstructionView.renderNewOrderItemIfNeed$onNewOrderClick(hVar);
                break;
        }
    }
}
