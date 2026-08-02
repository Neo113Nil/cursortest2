package ru.yandex.taxi.combo.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.hdh0;
import defpackage.ijc;
import defpackage.kjc;
import defpackage.lph0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/combo/ui/ComboInnerBubble;", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/drawable/Drawable;", "shadow", "Lzy11;", "setShadow", "(Landroid/graphics/drawable/Drawable;)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "subtitle", "setSubtitle", "", "color", "setBgColor", "(I)V", "icon", "setIcon", "Lijc;", "binding", "Lijc;", "Lkjc;", "currentDecorator", "Lkjc;", "combo"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComboInnerBubble extends BubbleComponent {
    private final ijc binding;
    private final kjc currentDecorator;

    public ComboInnerBubble(Context context) {
        super(context, null, 0, 6, null);
        View inflate = LayoutInflater.from(context).inflate(lph0.combo_inner_bubble, (ViewGroup) this, false);
        addView(inflate);
        int i = hdh0.content;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = hdh0.icon;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = hdh0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = hdh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        this.binding = new ijc((FrameLayout) inflate, linearLayout, imageView, robotoTextView, robotoTextView2);
                        kjc kjcVar = new kjc(context);
                        this.currentDecorator = kjcVar;
                        setDecorator(kjcVar);
                        kjcVar.b(new bdc(xng0.bgMain));
                        kjcVar.o(DefaultBubbleDecorator$Direction.DOWN);
                        xw31.B(tje.r(mrg0.go_design_s_space, getContext()), this);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void setBgColor(int color) {
        this.binding.b.setBackgroundTintList(ColorStateList.valueOf(color));
    }

    public final void setIcon(Drawable icon) {
        this.binding.c.setImageDrawable(icon);
    }

    public final void setShadow(Drawable shadow) {
        this.currentDecorator.n(shadow);
    }

    public final void setSubtitle(String subtitle) {
        this.binding.d.setText(subtitle);
    }

    public final void setTitle(String title) {
        this.binding.e.setText(title);
    }
}
