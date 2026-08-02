package ru.yandex.taxi.plaque.widgets;

import android.content.Context;
import defpackage.bg20;
import defpackage.jf20;
import defpackage.jl40;
import defpackage.o151;
import defpackage.wfz;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/plaque/widgets/ButtonMicroWidgetView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljf20;", "model", "Lzy11;", "updateModel", "(Ljf20;)V", "Ljf20;", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonMicroWidgetView extends RobotoTextView {
    private jf20 model;

    public ButtonMicroWidgetView(Context context) {
        super(context, null, 0, 6, null);
        setTransitionName("plaque_button_widget_transition_name");
    }

    public final void updateModel(jf20 model) {
        if (jl40.l(this.model, model)) {
            return;
        }
        bg20 bg20Var = model.e;
        o151 o151Var = model.d;
        setText(bg20Var.a);
        setGravity(o151Var.c);
        wfz.b(this, o151Var.a);
        wfz.a(this, null, "android.widget.Button");
        this.model = model;
    }
}
