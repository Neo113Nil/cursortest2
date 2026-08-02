package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.combo.ui.AcceptComboOrderModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SegmentedComponent;

/* loaded from: classes5.dex */
public final class rb implements zo31 {
    public final AcceptComboOrderModalView a;
    public final ConstraintLayout b;
    public final ButtonComponent c;
    public final SegmentedComponent d;
    public final TextView e;

    public rb(AcceptComboOrderModalView acceptComboOrderModalView, ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ImageView imageView, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ButtonComponent buttonComponent2, SegmentedComponent segmentedComponent, ListItemComponent listItemComponent3, TextView textView) {
        this.a = acceptComboOrderModalView;
        this.b = constraintLayout;
        this.c = buttonComponent2;
        this.d = segmentedComponent;
        this.e = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
