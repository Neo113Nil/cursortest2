package ru.yandex.taxi.design;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.hdu;
import defpackage.jl40;
import defpackage.pry0;
import defpackage.xw31;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0014¢\u0006\u0004\b*\u0010+J7\u00101\u001a\u00020\u00112\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0014¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/yandex/taxi/design/TextAndBadgeComponent;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/widget/TextView;", "leadTextView", "<init>", "(Landroid/content/Context;Landroid/widget/TextView;)V", "", "parentWidth", "parentHeight", "leftOffset", "topOffset", "rightOffset", "bottomOffset", "Landroid/view/View;", "view", "Lzy11;", "layoutChildView", "(IIIIIILandroid/view/View;)V", "applyEllipsizeLeadTextMiddle", "()V", "getFreeWidthLeadText", "()I", "width", "height", "Landroid/widget/FrameLayout$LayoutParams;", "createLayoutParams", "(II)Landroid/widget/FrameLayout$LayoutParams;", "Lru/yandex/taxi/design/BadgeView;", "initBadge", "()Lru/yandex/taxi/design/BadgeView;", "", "text", "setLeadText", "(Ljava/lang/CharSequence;)V", "", BackendConfig.Restrictions.ENABLED, "ellipsizeLeadTextMiddle", "(Z)Lru/yandex/taxi/design/TextAndBadgeComponent;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/widget/TextView;", "Lpry0;", "textMiddleEllipsizer", "Lpry0;", "notEllipsizedLeadText", "Ljava/lang/CharSequence;", "badge", "Lru/yandex/taxi/design/BadgeView;", "withUsedForBadge", CA20Status.STATUS_USER_I, "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextAndBadgeComponent extends ViewGroup {
    private BadgeView badge;
    private final TextView leadTextView;
    private CharSequence notEllipsizedLeadText;
    private pry0 textMiddleEllipsizer;
    private int withUsedForBadge;

    public TextAndBadgeComponent(Context context, TextView textView) {
        super(context);
        this.leadTextView = textView;
        this.notEllipsizedLeadText = "";
        addView(textView, createLayoutParams$default(this, 0, 0, 3, null));
    }

    private final void applyEllipsizeLeadTextMiddle() {
        pry0 pry0Var = this.textMiddleEllipsizer;
        if (pry0Var != null) {
            CharSequence a = pry0Var.a(this.notEllipsizedLeadText, TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE);
            if (jl40.l(this.leadTextView.getText(), a)) {
                return;
            }
            this.leadTextView.setText(a);
        }
    }

    private final FrameLayout.LayoutParams createLayoutParams(int width, int height) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static /* synthetic */ FrameLayout.LayoutParams createLayoutParams$default(TextAndBadgeComponent textAndBadgeComponent, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -2;
        }
        if ((i3 & 2) != 0) {
            i2 = -2;
        }
        return textAndBadgeComponent.createLayoutParams(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFreeWidthLeadText() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.withUsedForBadge;
    }

    private final void layoutChildView(int parentWidth, int parentHeight, int leftOffset, int topOffset, int rightOffset, int bottomOffset, View view) {
        int measuredHeight = (((parentHeight - topOffset) - bottomOffset) - view.getMeasuredHeight()) / 2;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        int i = topOffset + measuredHeight;
        int measuredHeight2 = view.getMeasuredHeight() + i;
        int i2 = parentHeight - bottomOffset;
        if (measuredHeight2 > i2) {
            measuredHeight2 = i2;
        }
        int measuredWidth = view.getMeasuredWidth() + leftOffset;
        int i3 = parentWidth - rightOffset;
        if (measuredWidth > i3) {
            measuredWidth = i3;
        }
        if (xw31.n(getContext())) {
            int i4 = parentWidth - measuredWidth;
            measuredWidth = parentWidth - leftOffset;
            leftOffset = i4;
        }
        view.layout(leftOffset, i, measuredWidth, measuredHeight2);
    }

    public final TextAndBadgeComponent ellipsizeLeadTextMiddle(boolean enabled) {
        this.textMiddleEllipsizer = enabled ? new pry0(new hdu(this.leadTextView, new TextAndBadgeComponent$ellipsizeLeadTextMiddle$1$1(this))) : null;
        return this;
    }

    public final BadgeView initBadge() {
        BadgeView badgeView = new BadgeView(getContext(), null, 0, 6, null);
        this.badge = badgeView;
        addView(badgeView, createLayoutParams$default(this, 0, 0, 3, null));
        return badgeView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int i;
        int i2 = r - l;
        int i3 = b - t;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.leadTextView.getLayoutParams();
        BadgeView badgeView = this.badge;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (badgeView != null ? badgeView.getLayoutParams() : null);
        int i4 = marginLayoutParams.rightMargin;
        if (marginLayoutParams2 != null) {
            int i5 = marginLayoutParams2.leftMargin;
            if (i5 >= i4) {
                i4 = i5;
            }
            i = i4;
            i4 = this.badge.getMeasuredWidth() + i4 + marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        layoutChildView(i2, i3, getPaddingLeft() + marginLayoutParams.leftMargin, getPaddingTop() + marginLayoutParams.topMargin, getPaddingRight() + i4, getPaddingBottom() + marginLayoutParams.bottomMargin, this.leadTextView);
        if (marginLayoutParams2 != null) {
            layoutChildView(i2, i3, this.leadTextView.getWidth() + i, getPaddingTop() + marginLayoutParams2.topMargin, getPaddingRight() + marginLayoutParams2.rightMargin, getPaddingBottom() + marginLayoutParams2.bottomMargin, this.badge);
            this.withUsedForBadge = this.badge.getWidth() + i + marginLayoutParams2.rightMargin;
        }
        applyEllipsizeLeadTextMiddle();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        BadgeView badgeView = this.badge;
        if (badgeView != null) {
            measureChildWithMargins(badgeView, widthMeasureSpec, paddingRight, heightMeasureSpec, paddingBottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) badgeView.getLayoutParams();
            i = badgeView.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            i2 = badgeView.getMeasuredHeight() + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        } else {
            i = 0;
            i2 = 0;
        }
        if (!jl40.l(this.leadTextView.getText(), this.notEllipsizedLeadText)) {
            this.leadTextView.setText(this.notEllipsizedLeadText);
        }
        measureChildWithMargins(this.leadTextView, widthMeasureSpec, paddingRight + i, heightMeasureSpec, paddingBottom);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.leadTextView.getLayoutParams();
        int measuredWidth = this.leadTextView.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        int measuredHeight = this.leadTextView.getMeasuredHeight() + marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin;
        int resolveSize = View.resolveSize(i + measuredWidth + paddingRight, widthMeasureSpec);
        if (i2 < measuredHeight) {
            i2 = measuredHeight;
        }
        setMeasuredDimension(resolveSize, View.resolveSize(i2 + paddingBottom, heightMeasureSpec));
    }

    public final void setLeadText(CharSequence text) {
        this.notEllipsizedLeadText = text;
        this.leadTextView.setText(text);
    }
}
