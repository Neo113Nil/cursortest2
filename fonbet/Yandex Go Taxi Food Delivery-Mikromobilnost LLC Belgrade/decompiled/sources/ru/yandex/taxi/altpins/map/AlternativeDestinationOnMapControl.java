package ru.yandex.taxi.altpins.map;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ax1;
import defpackage.bdh0;
import defpackage.bry0;
import defpackage.bx1;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.gph0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qy1;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.map.AddressOnMapControl;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/yandex/taxi/altpins/map/AlternativeDestinationOnMapControl;", "Lru/yandex/taxi/widget/map/AddressOnMapControl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "selected", "Lzy11;", "applySelected", "(Z)V", "Landroid/view/View;", "", "fullWidth", "(Landroid/view/View;)I", "Lqy1;", ClidProvider.STATE, "render", "(Lqy1;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lbx1;", "binding", "Lbx1;", "Lbry0;", "titleHelper", "Lbry0;", "Ldv31;", "stateHolder", "Ldv31;", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "iconView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AlternativeDestinationOnMapControl extends AddressOnMapControl {
    private final bx1 binding;
    private final dv31 stateHolder;
    private final bry0 titleHelper;

    public AlternativeDestinationOnMapControl(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(gph0.alternative_destination_on_map_control, this);
        int i = bdh0.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, this);
        if (appCompatImageView != null) {
            i = bdh0.title;
            ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i, this);
            if (shimmeringRobotoTextView != null) {
                this.binding = new bx1(this, appCompatImageView, shimmeringRobotoTextView);
                bry0 bry0Var = new bry0(shimmeringRobotoTextView);
                this.titleHelper = bry0Var;
                ax1 ax1Var = new ax1(this, qy1.f, this, 0);
                this.stateHolder = ax1Var;
                if (!bry0Var.c) {
                    bry0Var.c = true;
                    bry0Var.g = 0;
                    shimmeringRobotoTextView.requestLayout();
                }
                ax1Var.e();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelected(boolean selected) {
        int i = selected ? xng0.textInvert : xng0.textMain;
        int i2 = selected ? xng0.bgInvert : xng0.bgMain;
        this.binding.c.setTextColor(qje.t(i, getContext()));
        getIconView().setImageTintList(ColorStateList.valueOf(qje.t(i, getContext())));
        setBackgroundTintList(ColorStateList.valueOf(qje.t(i2, getContext())));
    }

    private final int fullWidth(View view) {
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = width + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIconView() {
        return this.binding.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (getIconView().getVisibility() == 0) {
            layoutVerticalCentred(getIconView(), true);
        }
        int fullWidth = getIconView().getVisibility() == 0 ? fullWidth(getIconView()) : this.defaultHorizontalSpace;
        int height = ((getHeight() - this.textsHeight) / 2) + this.textVerticalSpace;
        if (this.titleHelper.c()) {
            this.titleHelper.e(getWidth(), fullWidth, height, this.isRtl);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        AlternativeDestinationOnMapControl alternativeDestinationOnMapControl;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.defaultHorizontalSpace;
        int i6 = 0;
        if (getIconView().getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getIconView().getLayoutParams();
            alternativeDestinationOnMapControl = this;
            i = widthMeasureSpec;
            i2 = heightMeasureSpec;
            alternativeDestinationOnMapControl.measureChildWithMargins(getIconView(), i, 0, i2, 0);
            i3 = alternativeDestinationOnMapControl.getIconView().getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            i4 = Math.max(0, alternativeDestinationOnMapControl.getIconView().getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        } else {
            alternativeDestinationOnMapControl = this;
            i = widthMeasureSpec;
            i2 = heightMeasureSpec;
            i3 = i5;
            i4 = 0;
        }
        int resolveSize = View.resolveSize(alternativeDestinationOnMapControl.maxWidgetSize, i);
        int i7 = i3 + i5;
        boolean c = alternativeDestinationOnMapControl.titleHelper.c();
        alternativeDestinationOnMapControl.textsHeight = 0;
        if (c) {
            int max = Math.max(resolveSize - i7, 0);
            alternativeDestinationOnMapControl.textsHeight = alternativeDestinationOnMapControl.textVerticalSpace;
            if (c) {
                alternativeDestinationOnMapControl.titleHelper.f(max, i2);
                i6 = Math.max(0, alternativeDestinationOnMapControl.titleHelper.d());
                alternativeDestinationOnMapControl.textsHeight = alternativeDestinationOnMapControl.titleHelper.b() + alternativeDestinationOnMapControl.textsHeight;
            }
            int i8 = alternativeDestinationOnMapControl.textsHeight + alternativeDestinationOnMapControl.textVerticalSpace;
            alternativeDestinationOnMapControl.textsHeight = i8;
            i7 += i6;
            i4 = Math.max(i4, i8);
        }
        alternativeDestinationOnMapControl.setMeasuredDimension(View.resolveSize(i7, i), View.resolveSize(Math.max(i4, alternativeDestinationOnMapControl.minWidgetHeight), i2));
    }

    public final void render(qy1 state) {
        this.stateHolder.g(state, false, false);
    }
}
