package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes13.dex */
public final class y2j0 extends oc5 {
    public final ListItemCheckComponent N;
    public odf0 O;

    public y2j0(ViewGroup viewGroup) {
        super(viewGroup, luh0.item_check);
        ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) this.a;
        this.N = listItemCheckComponent;
        listItemCheckComponent.setOnClickListener(new d5b0(29, this));
    }
}
