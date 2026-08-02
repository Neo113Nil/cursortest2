package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class wbn implements zo31 {
    public final LinearLayoutCompat a;
    public final FragmentContainerView b;
    public final LinearLayoutCompat c;
    public final ListItemComponent d;

    public wbn(LinearLayoutCompat linearLayoutCompat, FragmentContainerView fragmentContainerView, LinearLayoutCompat linearLayoutCompat2, ListItemComponent listItemComponent) {
        this.a = linearLayoutCompat;
        this.b = fragmentContainerView;
        this.c = linearLayoutCompat2;
        this.d = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
