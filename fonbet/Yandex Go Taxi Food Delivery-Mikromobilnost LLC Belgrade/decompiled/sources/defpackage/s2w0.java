package defpackage;

import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import java.util.List;

/* loaded from: classes.dex */
public final class s2w0 implements q2w0 {
    public boolean a = true;
    public final /* synthetic */ SuperAppMainScreenOrdersView b;

    public s2w0(SuperAppMainScreenOrdersView superAppMainScreenOrdersView) {
        this.b = superAppMainScreenOrdersView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        bys bysVar;
        bys bysVar2;
        List list = (List) obj;
        int size = list.size();
        SuperAppMainScreenOrdersView superAppMainScreenOrdersView = this.b;
        bysVar = superAppMainScreenOrdersView.cardAdapter;
        boolean z = (size == (bysVar != null ? bysVar.getItemCount() : 0) || this.a) ? false : true;
        if (!list.isEmpty()) {
            this.a = false;
        }
        bysVar2 = superAppMainScreenOrdersView.cardAdapter;
        if (bysVar2 != null) {
            bysVar2.submitList(list, new c40(z, superAppMainScreenOrdersView, 3));
        }
    }
}
