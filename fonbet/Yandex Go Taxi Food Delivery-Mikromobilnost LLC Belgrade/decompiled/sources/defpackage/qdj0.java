package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class qdj0 implements zo31 {
    public final /* synthetic */ int a;
    public final ListItemComponent b;

    public /* synthetic */ qdj0(ListItemComponent listItemComponent, int i) {
        this.a = i;
        this.b = listItemComponent;
    }

    public static qdj0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(mrh0.requirement_check_component_tinted_view_holder, viewGroup, false);
        if (inflate != null) {
            return new qdj0((ListItemComponent) inflate, i);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
