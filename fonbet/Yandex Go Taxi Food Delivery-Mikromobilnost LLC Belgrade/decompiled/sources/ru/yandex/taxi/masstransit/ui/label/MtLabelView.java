package ru.yandex.taxi.masstransit.ui.label;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.cvw;
import defpackage.fh4;
import defpackage.mrg0;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/masstransit/ui/label/MtLabelView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "content", "Landroid/graphics/drawable/Drawable;", "shadow", "Lzy11;", "render", "(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtLabelView extends FrameLayout {
    public static final int $stable = 8;
    private final RobotoTextView textView;

    public MtLabelView(Context context) {
        super(context);
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setTextTypeface(3);
        robotoTextView.setTextSize(0, tje.r(mrg0.component_text_size_caption, context));
        fh4.g(robotoTextView);
        this.textView = robotoTextView;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(robotoTextView, -2, -2);
    }

    public final void render(CharSequence content, Drawable shadow) {
        this.textView.setText(content);
        cvw.e0(this, shadow, null, Integer.valueOf(tje.u(4, getContext())), 10);
    }
}
