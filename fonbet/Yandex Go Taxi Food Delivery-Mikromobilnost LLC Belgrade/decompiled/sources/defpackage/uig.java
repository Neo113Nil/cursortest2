package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes12.dex */
public final class uig implements zo31 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final ListTitleComponent c;
    public final ButtonComponent d;
    public final ButtonComponent e;

    public uig(ConstraintLayout constraintLayout, RecyclerView recyclerView, ListTitleComponent listTitleComponent, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = listTitleComponent;
        this.d = buttonComponent;
        this.e = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
