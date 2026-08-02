package ru.yandex.taxi.plaque.widgets;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.jl40;
import defpackage.nf20;
import defpackage.wfz;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/plaque/widgets/IconMicroWidgetView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lnf20;", "model", "Lzy11;", "updateModel", "(Lnf20;)V", "Lnf20;", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconMicroWidgetView extends AppCompatImageView {
    private nf20 model;

    public IconMicroWidgetView(Context context) {
        super(context);
        setTransitionName("plaque_icon_widget_transition_name");
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void updateModel(nf20 model) {
        if (jl40.l(this.model, model)) {
            return;
        }
        setImageDrawable(model.f.a);
        wfz.b(this, model.d.a);
        wfz.a(this, model.e, "android.widget.ImageView");
        this.model = model;
    }
}
