package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

/* loaded from: classes5.dex */
public final class zaq0 implements zo31 {
    public final SelectContactView a;
    public final View b;

    public zaq0(SelectContactView selectContactView, ButtonComponent buttonComponent, RecyclerView recyclerView, ImageView imageView, NestedScrollViewAdvanced nestedScrollViewAdvanced, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ShadowScrollIndicator shadowScrollIndicator, AnimatedListItemInputComponent animatedListItemInputComponent, FrameLayout frameLayout, AnimatedListItemInputComponent animatedListItemInputComponent2, View view, RobotoTextView robotoTextView, ListItemComponent listItemComponent) {
        this.a = selectContactView;
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
