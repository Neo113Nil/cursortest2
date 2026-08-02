package ru.yandex.taxi.favorites.list.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.dau;
import defpackage.evu0;
import defpackage.lhc;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.tdh0;
import defpackage.tje;
import defpackage.xph0;
import kotlin.Metadata;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/favorites/list/ui/HeaderView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/design/BadgeView;", "", "color", "Lzy11;", "setupShadow", "(Lru/yandex/taxi/design/BadgeView;I)V", "Landroid/graphics/drawable/Drawable;", "createShadow", "(I)Landroid/graphics/drawable/Drawable;", "", "elevation", "createShadowDrawable", "(IF)Landroid/graphics/drawable/Drawable;", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "hideBadge", "()V", "showBadge", "Ldau;", "binding", "Ldau;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderView extends GoLinearLayout {
    public static final int $stable = 8;
    private final dau binding;

    public HeaderView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(xph0.header_item, this);
        int i = tdh0.badge;
        BadgeView badgeView = (BadgeView) cma1.O(i, this);
        if (badgeView != null) {
            i = tdh0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                i = tdh0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                if (robotoTextView2 != null) {
                    this.binding = new dau(this, badgeView, robotoTextView, robotoTextView2);
                    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    setOrientation(1);
                    setClipChildren(false);
                    setPadding(tje.u(16, getContext()), tje.u(12, getContext()), tje.u(16, getContext()), tje.u(12, getContext()));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final Drawable createShadow(int color) {
        int u = tje.u(4, getContext());
        int u2 = tje.u(4, getContext());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{createShadowDrawable(color, u)});
        layerDrawable.setLayerInset(0, u, 0, u, u + u2);
        return layerDrawable;
    }

    private final Drawable createShadowDrawable(int color, float elevation) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setShadowLayer(elevation, 0.0f, elevation, lhc.f(color, Math.abs((int) (255.0f * 0.2f)) & 255));
        float r = tje.r(mrg0.go_design_m_space, getContext());
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = r;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        return shapeDrawable;
    }

    private final void setupShadow(BadgeView badgeView, int i) {
        badgeView.setBackground(createShadow(i));
        int u = tje.u(10, badgeView.getContext());
        badgeView.setPadding(u, tje.u(1, badgeView.getContext()), u, u);
        badgeView.setTranslationY(tje.u(6, badgeView.getContext()));
    }

    public final void hideBadge() {
        this.binding.b.setVisibility(8);
    }

    public final void setSubtitle(CharSequence text) {
        if (text == null || evu0.J(text)) {
            this.binding.c.setVisibility(8);
        } else {
            this.binding.c.setText(text);
            this.binding.c.setVisibility(0);
        }
    }

    public final void setTitle(CharSequence text) {
        this.binding.d.setText(text);
    }

    public final void showBadge(CharSequence text) {
        BadgeView badgeView = this.binding.b;
        badgeView.setVisibility(0);
        badgeView.setText(text);
        badgeView.setTextSize(tje.b0(badgeView.getContext(), 11.0f));
        badgeView.setTextTypeface(5, 1);
        badgeView.setTextColor(badgeView.getContext().getColor(mqg0.white));
        badgeView.setTintColor(badgeView.getContext().getColor(mqg0.component_cinnaban_toxic));
        setupShadow(badgeView, badgeView.getContext().getColor(mqg0.component_cinnaban_toxic));
    }
}
