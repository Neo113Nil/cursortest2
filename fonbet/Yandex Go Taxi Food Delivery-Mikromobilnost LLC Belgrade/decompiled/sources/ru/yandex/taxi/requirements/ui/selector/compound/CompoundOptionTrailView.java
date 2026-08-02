package ru.yandex.taxi.requirements.ui.selector.compound;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.jfh0;
import defpackage.jrh0;
import defpackage.lhc;
import defpackage.lvd;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/requirements/ui/selector/compound/CompoundOptionTrailView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/design/BadgeView;", "", "color", "Lzy11;", "setupShadow", "(Lru/yandex/taxi/design/BadgeView;I)V", "Landroid/graphics/drawable/Drawable;", "createShadow", "(I)Landroid/graphics/drawable/Drawable;", "", "elevation", "createShadowDrawable", "(IF)Landroid/graphics/drawable/Drawable;", "", "removeState", "updateState", "(Z)V", "Ljava/lang/Runnable;", "listener", "setRemoveListener", "(Ljava/lang/Runnable;)V", "hideBadge", "()V", "", "text", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "showBadge", "(Ljava/lang/String;II)V", "Llvd;", "binding", "Llvd;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompoundOptionTrailView extends LinearLayout {
    private final lvd binding;

    public CompoundOptionTrailView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(jrh0.compound_option_trail_view, this);
        int i = jfh0.badge_view;
        BadgeView badgeView = (BadgeView) cma1.O(i, this);
        if (badgeView != null) {
            i = jfh0.option_navigation;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, this);
            if (appCompatImageView != null) {
                i = jfh0.option_remove;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, this);
                if (appCompatImageView2 != null) {
                    this.binding = new lvd(this, badgeView, appCompatImageView, appCompatImageView2);
                    setOrientation(0);
                    updateState(false);
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
    }

    public final void hideBadge() {
        this.binding.b.setVisibility(8);
    }

    public final void setRemoveListener(Runnable listener) {
        c.B(this.binding.d, listener);
    }

    public final void showBadge(String text, int backgroundColor, int textColor) {
        BadgeView badgeView = this.binding.b;
        badgeView.setVisibility(0);
        badgeView.setText(text);
        badgeView.setTextColor(textColor);
        badgeView.setTintColor(backgroundColor);
        setupShadow(badgeView, backgroundColor);
    }

    public final void updateState(boolean removeState) {
        this.binding.c.setVisibility(!removeState ? 0 : 8);
        this.binding.d.setVisibility(removeState ? 0 : 8);
    }
}
