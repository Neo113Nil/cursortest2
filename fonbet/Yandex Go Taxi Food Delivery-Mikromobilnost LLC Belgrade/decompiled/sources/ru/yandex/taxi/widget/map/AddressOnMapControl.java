package ru.yandex.taxi.widget.map;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.payment.common.result.ResultType;
import defpackage.f1h0;
import defpackage.hg;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.sb2;
import defpackage.tje;
import defpackage.usg0;
import defpackage.vng;
import defpackage.w511;
import defpackage.xw31;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001d\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b0\u0010*J\u0017\u00104\u001a\u00020\n2\u0006\u00102\u001a\u00020'H\u0000¢\u0006\u0004\b3\u0010*J\u001f\u00108\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-H\u0004¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u00020\n*\u00020:2\u0006\u0010;\u001a\u00020-H\u0004¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0004¢\u0006\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010C\u001a\u00020\u00078\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010D\u001a\u00020\u00078\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u0014\u0010E\u001a\u00020-8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00078\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010H\u001a\u00020-8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010R\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lru/yandex/taxi/widget/map/AddressOnMapControl;", "Landroid/view/ViewGroup;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "w", "h", "Lzy11;", "refreshShadowOffsets", "(II)V", "", "Landroid/graphics/drawable/Drawable;", "shadows", "updateShadows", "(Ljava/util/List;)V", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/util/AttributeSet;", "attrs", "Landroid/view/ViewGroup$LayoutParams;", "generateLayoutParams", "(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;", "p", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "translationY", "setTranslationY", "(F)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "additionTranslationY$taxi_design", "additionTranslationY", CaretView.ALPHA_PROPERTY, "shadowsAlpha$taxi_design", "shadowsAlpha", "Landroid/view/View;", "child", "start", "layoutVerticalCentred", "(Landroid/view/View;Z)I", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", ResultType.RESULT_TYPE_LOADING, "updateAnimation", "(Lru/yandex/taxi/widget/ShimmeringRobotoTextView;Z)V", "updateBg", "()V", "maxWidgetSize", CA20Status.STATUS_USER_I, "minWidgetHeight", "defaultHorizontalSpace", "textVerticalSpace", "isRtl", "Z", "textsHeight", "isClickBelowViewDisabled", "Ljava/util/List;", "Landroid/graphics/Rect;", "offset", "Landroid/graphics/Rect;", "controlAdditionalYOffset", "F", "controlOriginalYOffset", "getItemsBg", "()I", "itemsBg", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class AddressOnMapControl extends ViewGroup implements nwy0 {
    public static final int $stable = 8;
    private float controlAdditionalYOffset;
    private float controlOriginalYOffset;
    protected final int defaultHorizontalSpace;
    protected boolean isClickBelowViewDisabled;
    protected final boolean isRtl;
    public final int maxWidgetSize;
    public final int minWidgetHeight;
    private final Rect offset;
    private List<? extends Drawable> shadows;
    protected final int textVerticalSpace;
    protected int textsHeight;

    public AddressOnMapControl(Context context) {
        super(context);
        this.maxWidgetSize = tje.r(usg0.address_on_map_max_width, context);
        this.minWidgetHeight = context.getResources().getDimensionPixelSize(usg0.address_on_map_size);
        this.defaultHorizontalSpace = tje.r(mrg0.go_design_m_space, getContext());
        this.textVerticalSpace = tje.r(usg0.address_on_map_text_vertical_space, getContext());
        this.isRtl = xw31.n(context);
        this.shadows = EmptyList.a;
        this.offset = new Rect();
        updateBg();
        hg.a(this);
    }

    private final void refreshShadowOffsets(int w, int h) {
        for (Drawable drawable : this.shadows) {
            drawable.getPadding(this.offset);
            Rect rect = this.offset;
            drawable.setBounds(-rect.left, -rect.top, rect.right + w, rect.bottom + h);
        }
    }

    public static /* synthetic */ void refreshShadowOffsets$default(AddressOnMapControl addressOnMapControl, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: refreshShadowOffsets");
            return;
        }
        if ((i3 & 1) != 0) {
            i = addressOnMapControl.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = addressOnMapControl.getHeight();
        }
        addressOnMapControl.refreshShadowOffsets(i, i2);
    }

    public final void additionTranslationY$taxi_design(float translationY) {
        this.controlAdditionalYOffset = translationY;
        setTranslationY(this.controlOriginalYOffset);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateBg();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Iterator<? extends Drawable> it = this.shadows.iterator();
        while (it.hasNext()) {
            it.next().draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof ViewGroup.MarginLayoutParams ? new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) p) : new ViewGroup.MarginLayoutParams(p);
    }

    public int getItemsBg() {
        return f1h0.address_on_map_background;
    }

    public final int layoutVerticalCentred(View child, boolean start) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int width = this.isRtl == start ? (getWidth() - marginLayoutParams.rightMargin) - child.getMeasuredWidth() : marginLayoutParams.leftMargin;
        int height = ((getHeight() - (child.getMeasuredHeight() + (marginLayoutParams.topMargin + marginLayoutParams.bottomMargin))) / 2) + marginLayoutParams.topMargin;
        child.layout(width, height, child.getMeasuredWidth() + width, child.getMeasuredHeight() + height);
        return child.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        refreshShadowOffsets(w, h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        return this.isClickBelowViewDisabled;
    }

    @Override // android.view.View
    public void setTranslationY(float translationY) {
        this.controlOriginalYOffset = translationY;
        super.setTranslationY(translationY + this.controlAdditionalYOffset);
    }

    public final void shadowsAlpha$taxi_design(float alpha) {
        Iterator<T> it = this.shadows.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setAlpha(sb2.k((int) (255.0f * alpha), 0, 255));
        }
    }

    public final void updateAnimation(ShimmeringRobotoTextView shimmeringRobotoTextView, boolean z) {
        if (!z) {
            shimmeringRobotoTextView.stopAnimation();
        } else {
            shimmeringRobotoTextView.setAnimationDuration(900);
            shimmeringRobotoTextView.startAnimation();
        }
    }

    public final void updateBg() {
        Integer valueOf = Integer.valueOf(getItemsBg());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        setBackground(valueOf != null ? vng.t(valueOf.intValue(), getContext()) : null);
    }

    public void updateShadows(List<? extends Drawable> shadows) {
        this.shadows = shadows;
        refreshShadowOffsets$default(this, 0, 0, 3, null);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }
}
