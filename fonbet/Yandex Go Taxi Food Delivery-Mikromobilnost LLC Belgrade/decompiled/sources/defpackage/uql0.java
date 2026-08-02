package defpackage;

import com.yandex.go.safety.center.contacts.SafetyCenterContactsView;
import com.yandex.go.safety.center.contacts.a;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class uql0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ uql0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.F.a(aVar.z.f().size(), false);
                break;
            case 1:
                ppl0 ppl0Var = aVar.F.a;
                ppl0Var.a.a("SafetyCenter.TrustedContacts.Closed", tse0.o(ppl0Var), 1, new HashMap());
                break;
            case 2:
                SafetyCenterContactsView._init_$onActionClick(aVar);
                break;
            case 3:
                SafetyCenterContactsView._init_$onAddMoreButtonClick(aVar);
                break;
            case 4:
                SafetyCenterContactsView._init_$onAddButtonClick(aVar);
                break;
            default:
                SafetyCenterContactsView._init_$onShareClick(aVar);
                break;
        }
    }
}
