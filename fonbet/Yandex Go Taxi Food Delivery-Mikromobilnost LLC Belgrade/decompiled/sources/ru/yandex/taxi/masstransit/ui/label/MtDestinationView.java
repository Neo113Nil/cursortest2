package ru.yandex.taxi.masstransit.ui.label;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.cvw;
import defpackage.e0h0;
import defpackage.kdc;
import defpackage.s8o;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/masstransit/ui/label/MtDestinationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/drawable/Drawable;", "icon", "Lkdc;", "iconColor", "bgColor", "shadow", "Lzy11;", "render", "(Landroid/graphics/drawable/Drawable;Lkdc;Lkdc;Landroid/graphics/drawable/Drawable;)V", "Lcom/yandex/go/design/view/GoImageView;", "iconView", "Lcom/yandex/go/design/view/GoImageView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtDestinationView extends FrameLayout {
    public static final int $stable = 8;
    private final GoImageView iconView;

    public MtDestinationView(Context context) {
        super(context);
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        goImageView.setBackgroundResource(e0h0.ic_map_object_bg);
        int u = tje.u(3, goImageView.getContext());
        goImageView.setPadding(u, u, u, u);
        this.iconView = goImageView;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(goImageView);
    }

    public final void render(Drawable icon, kdc iconColor, kdc bgColor, Drawable shadow) {
        Drawable mutate = icon.mutate();
        mutate.setTint(s8o.m(iconColor, getContext()));
        this.iconView.setImageDrawable(mutate);
        this.iconView.setBackgroundTintList(ColorStateList.valueOf(s8o.m(bgColor, getContext())));
        cvw.e0(this, shadow, null, Integer.valueOf(tje.u(2, getContext())), 10);
    }
}
