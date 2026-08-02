package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class rpx0 implements zo31 {
    public final LinearLayout a;
    public final ListItemComponent b;
    public final ButtonComponent c;
    public final ImageView d;
    public final AppCompatImageView e;
    public final ListItemComponent f;
    public final ListHeaderComponent g;

    public rpx0(LinearLayout linearLayout, ListItemComponent listItemComponent, ButtonComponent buttonComponent, ImageView imageView, AppCompatImageView appCompatImageView, ListItemComponent listItemComponent2, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = listItemComponent;
        this.c = buttonComponent;
        this.d = imageView;
        this.e = appCompatImageView;
        this.f = listItemComponent2;
        this.g = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
