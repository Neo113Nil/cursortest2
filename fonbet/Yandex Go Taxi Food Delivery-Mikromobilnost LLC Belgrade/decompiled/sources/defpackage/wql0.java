package defpackage;

import com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView;
import com.yandex.go.safety.center.contacts.a;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class wql0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ wql0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                hrl0 hrl0Var = aVar.y;
                if (list.isEmpty()) {
                    aVar.H = false;
                }
                ((SafetyCenterContactsMvpView) aVar.Dg()).showLoading(false);
                ((SafetyCenterContactsMvpView) aVar.Dg()).setContacts(list);
                aVar.Mg();
                if (!hrl0Var.a()) {
                    hrl0Var.c(new ajl0(i2, aVar, list), false);
                    break;
                }
                break;
            case 1:
                ((SafetyCenterContactsMvpView) aVar.Dg()).showError((String) obj);
                break;
            default:
                ShareStatus shareStatus = (ShareStatus) obj;
                aVar.getClass();
                int i3 = vql0.a[shareStatus.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    aVar.I = false;
                } else if (i3 == 4) {
                    aVar.I = true;
                } else if (i3 != 5) {
                    w511.b();
                    break;
                } else if (aVar.J != ShareStatus.SUCCESS) {
                    aVar.I = true;
                    ((SafetyCenterContactsMvpView) aVar.Dg()).resetShareButton();
                }
                ((SafetyCenterContactsMvpView) aVar.Dg()).setShareStatus(shareStatus);
                aVar.J = shareStatus;
                break;
        }
        return zy11Var;
    }
}
