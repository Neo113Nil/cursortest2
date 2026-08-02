package defpackage;

import com.yandex.go.chargers.order.details.ChargersOrderDetailsModalView;
import java.util.List;

/* loaded from: classes12.dex */
public final class uba implements xba {
    public final /* synthetic */ ChargersOrderDetailsModalView a;

    public uba(ChargersOrderDetailsModalView chargersOrderDetailsModalView) {
        this.a = chargersOrderDetailsModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        pba pbaVar;
        List list = ((dca) obj).a;
        pbaVar = this.a.itemsAdapter;
        pbaVar.submitList(list, null);
    }
}
