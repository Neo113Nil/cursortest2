package ru.yandex.taxi.preorder.source.points;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.c0h0;
import defpackage.cvw;
import defpackage.kdc;
import defpackage.s8o;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/preorder/source/points/MapPointWithDrawableFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "shadow", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V", "icon", "Lkdc;", "iconColor", "bgColor", "Lzy11;", "render", "(Landroid/graphics/drawable/Drawable;Lkdc;Lkdc;)V", "Lcom/yandex/go/design/view/GoImageView;", "iconView", "Lcom/yandex/go/design/view/GoImageView;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapPointWithDrawableFrameLayout extends FrameLayout {
    private final GoImageView iconView;

    public MapPointWithDrawableFrameLayout(Context context, Drawable drawable) {
        super(context);
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        goImageView.setBackgroundResource(c0h0.ic_map_object_bg_8);
        int u = tje.u(4, goImageView.getContext());
        goImageView.setPadding(u, u, u, u);
        this.iconView = goImageView;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(goImageView);
        cvw.e0(this, drawable, null, Integer.valueOf(tje.u(2, getContext())), 10);
    }

    public final void render(Drawable icon, kdc iconColor, kdc bgColor) {
        if (icon == null) {
            return;
        }
        Drawable mutate = icon.mutate();
        mutate.setTint(s8o.m(iconColor, getContext()));
        this.iconView.setImageDrawable(mutate);
        this.iconView.setBackgroundTintList(ColorStateList.valueOf(s8o.m(bgColor, getContext())));
    }
}
