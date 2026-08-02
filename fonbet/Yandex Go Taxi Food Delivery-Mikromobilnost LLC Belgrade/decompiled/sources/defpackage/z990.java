package defpackage;

import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class z990 implements zo31 {
    public final ScrollView a;
    public final RobotoTextView b;
    public final ListHeaderComponent c;
    public final AppCompatImageView d;

    public z990(ScrollView scrollView, RobotoTextView robotoTextView, ListHeaderComponent listHeaderComponent, AppCompatImageView appCompatImageView) {
        this.a = scrollView;
        this.b = robotoTextView;
        this.c = listHeaderComponent;
        this.d = appCompatImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
