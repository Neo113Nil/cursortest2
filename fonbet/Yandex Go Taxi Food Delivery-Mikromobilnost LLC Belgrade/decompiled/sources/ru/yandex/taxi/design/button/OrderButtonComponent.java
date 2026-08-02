package ru.yandex.taxi.design.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.bj70;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lhc;
import defpackage.mrg0;
import defpackage.qi70;
import defpackage.ri70;
import defpackage.s8o;
import defpackage.tje;
import defpackage.wi70;
import defpackage.yty0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/yandex/taxi/design/button/OrderButtonComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "newAlpha", "", "animating", "Lzy11;", "updateButtonAlpha", "(FZ)V", "Lwi70;", "model", "render", "(Lwi70;)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "allowTraverse", "()Z", "Lri70;", "styleHolder", "Lri70;", "viewIsVisible", "Z", "Companion", "qi70", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderButtonComponent extends ListItemComponent {
    public static final int $stable = 8;
    public static final qi70 Companion = new qi70();
    private static final float SHIMMERING_ALPHA = 0.2f;
    private static final int SHIMMERING_DURATION = 900;
    private final ri70 styleHolder;
    private boolean viewIsVisible;

    public OrderButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ri70 ri70Var = new ri70(this);
        this.styleHolder = ri70Var;
        setTitleAlignment(1);
        setSubtitleAlignment(1);
        setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(mrg0.button_component_default_rounded_corners_radius, getContext())));
        setClipToOutline(true);
        setBackground(ri70Var.n);
        ri70Var.e();
        setTitleTypeface(3);
        setVerticalPadding(0);
        setTitleEllipsizeMode(1);
    }

    private final void updateButtonAlpha(float newAlpha, boolean animating) {
        animate().cancel();
        if (getAlpha() == newAlpha) {
            return;
        }
        if (animating) {
            animate().alpha(newAlpha).setDuration(300L).start();
        } else {
            setAlpha(newAlpha);
        }
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        ri70 ri70Var = this.styleHolder;
        ri70Var.g(ri70Var.d, false, true);
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.styleHolder.c();
        this.styleHolder.b();
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        this.viewIsVisible = visibility == 0;
    }

    public final void render(wi70 model) {
        CharSequence charSequence = model.a;
        bj70 bj70Var = model.d;
        boolean z = model.e;
        if (!jl40.l(charSequence, title().getText())) {
            setTitle(model.a);
            WeakHashMap weakHashMap = b.a;
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.design.button.OrderButtonComponent$render$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        TextView title = OrderButtonComponent.this.title();
                        CharSequence text = title.getText();
                        int measuredHeight = OrderButtonComponent.this.getMeasuredHeight();
                        StaticLayout a = yty0.a(title, text);
                        int lineCount = a.getLineCount();
                        int i = 0;
                        for (int i2 = 0; i2 < lineCount && a.getLineBottom(i2) <= measuredHeight; i2++) {
                            i++;
                        }
                        if (i == 0 && text.length() > 0) {
                            jst.e.v("OrderButtonComponent", new IllegalStateException("measureFullFitTextLineCount returned 0, title=" + ((Object) text) + ", height=" + OrderButtonComponent.this.getMeasuredHeight()));
                        }
                        OrderButtonComponent orderButtonComponent = OrderButtonComponent.this;
                        if (i < 1) {
                            i = 1;
                        }
                        orderButtonComponent.setTitleMaxLines(i);
                    }
                });
            } else {
                TextView title = title();
                CharSequence text = title.getText();
                int measuredHeight = getMeasuredHeight();
                StaticLayout a = yty0.a(title, text);
                int lineCount = a.getLineCount();
                int i = 0;
                for (int i2 = 0; i2 < lineCount && a.getLineBottom(i2) <= measuredHeight; i2++) {
                    i++;
                }
                if (i == 0 && text.length() > 0) {
                    jst.e.v("OrderButtonComponent", new IllegalStateException("measureFullFitTextLineCount returned 0, title=" + ((Object) text) + ", height=" + getMeasuredHeight()));
                }
                if (i < 1) {
                    i = 1;
                }
                setTitleMaxLines(i);
            }
        }
        setSubtitle(model.b);
        setContentDescription(model.c);
        setEnabled(z);
        if (model.f) {
            startTitleProgressAnimation(Integer.valueOf(lhc.f(s8o.m(bj70Var.b, getContext()), Math.abs(51) & 255)), SHIMMERING_DURATION);
            startSubtitleProgressAnimation(Integer.valueOf(lhc.f(s8o.m(bj70Var.b, getContext()), Math.abs(51) & 255)), SHIMMERING_DURATION);
        } else {
            stopProgressAnimation();
        }
        boolean z2 = isAttachedToWindow() && this.viewIsVisible;
        updateButtonAlpha(z ? 1.0f : 0.5f, z2);
        this.styleHolder.g(bj70Var, z2, false);
    }

    public OrderButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderButtonComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
