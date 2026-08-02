package ru.yandex.taxi.banners.presentation.fullscreen;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.idh0;
import defpackage.lis;
import defpackage.mis;
import defpackage.nis;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 '2\u00020\u0001:\u0003(\u0014)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&¨\u0006*"}, d2 = {"Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerPageContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/design/ListTextComponent;", "textComponent", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "isTouchOnClickableSpan", "(Lru/yandex/taxi/design/ListTextComponent;Landroid/view/MotionEvent;)Z", "Lzy11;", "onFinishInflate", "()V", "Lnis;", "listener", "setListener", "(Lnis;)V", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Landroid/view/View;", "bottomContainer", "Landroid/view/View;", "Lru/yandex/taxi/design/BadgeView;", "label", "Lru/yandex/taxi/design/BadgeView;", "subtitle", "Lru/yandex/taxi/design/ListTextComponent;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Lnis;", "Companion", "GestureListener", "mis", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FullScreenBannerPageContainer extends LinearLayout {
    public static final mis Companion = new mis();
    private static final lis EMPTY_LISTENER = new lis();
    private static final float LEFT_SIDE_CLICK_AREA_PERCENT = 0.35f;
    private View bottomContainer;
    private final GestureDetector gestureDetector;
    private BadgeView label;
    private nis listener;
    private ListTextComponent subtitle;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerPageContainer$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerPageContainer;)V", "onSingleTapConfirmed", "", "e", "Landroid/view/MotionEvent;", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e) {
            float width = FullScreenBannerPageContainer.this.getWidth() * 0.35f;
            float x = e.getX();
            FullScreenBannerPageContainer fullScreenBannerPageContainer = FullScreenBannerPageContainer.this;
            if (x < width) {
                fullScreenBannerPageContainer.listener.d();
                return true;
            }
            fullScreenBannerPageContainer.listener.f();
            return true;
        }
    }

    public FullScreenBannerPageContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.listener = EMPTY_LISTENER;
    }

    private final boolean isTouchOnClickableSpan(ListTextComponent textComponent, MotionEvent event) {
        if (textComponent == null) {
            return false;
        }
        CharSequence text = textComponent.getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        RobotoTextView textView = textComponent.getTextView();
        textView.getLocationOnScreen(new int[2]);
        int offsetForPosition = textView.getOffsetForPosition(event.getRawX() - r1[0], event.getRawY() - r1[1]);
        return !(((Spanned) text).getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class).length == 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.bottomContainer = findViewById(idh0.banner_bottom_container);
        this.label = (BadgeView) findViewById(idh0.banner_label);
        this.subtitle = (ListTextComponent) findViewById(idh0.banner_text);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        View view = this.bottomContainer;
        if (view == null) {
            view = null;
        }
        if (!xw31.m(view, event)) {
            BadgeView badgeView = this.label;
            if (badgeView == null) {
                badgeView = null;
            }
            if (!xw31.m(badgeView, event)) {
                ListTextComponent listTextComponent = this.subtitle;
                if (listTextComponent == null) {
                    listTextComponent = null;
                }
                if (xw31.m(listTextComponent, event)) {
                    ListTextComponent listTextComponent2 = this.subtitle;
                    if (isTouchOnClickableSpan(listTextComponent2 != null ? listTextComponent2 : null, event)) {
                        return false;
                    }
                }
                return this.gestureDetector.onTouchEvent(event);
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 0) {
            return true;
        }
        return this.gestureDetector.onTouchEvent(event);
    }

    public void setListener(nis listener) {
        this.listener = listener;
    }

    public FullScreenBannerPageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FullScreenBannerPageContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FullScreenBannerPageContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
