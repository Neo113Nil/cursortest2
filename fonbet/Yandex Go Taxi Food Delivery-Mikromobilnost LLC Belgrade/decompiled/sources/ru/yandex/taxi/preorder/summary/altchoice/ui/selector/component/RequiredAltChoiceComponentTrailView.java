package ru.yandex.taxi.preorder.summary.altchoice.ui.selector.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import defpackage.dfb;
import defpackage.evu0;
import defpackage.lh;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.sls;
import defpackage.xbg0;
import defpackage.xng0;
import defpackage.xrh0;
import defpackage.yfh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentTrailView;", "Landroid/widget/LinearLayout;", "Llh;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Lzy11;", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "", "selected", "Landroid/graphics/drawable/Drawable;", "drawable", "setCheckMark", "(ZLandroid/graphics/drawable/Drawable;)V", "showChevron", "()V", "Lkotlin/Function0;", "listener", "setCheckBoxClickListener", "(Lsls;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "getTrailImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ldfb;", "externalAccessibilityDelegate", "Ldfb;", "Lru/yandex/taxi/widget/RobotoTextView;", "title", "Lru/yandex/taxi/widget/RobotoTextView;", "subtitle", "trailImage", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/yandex/taxi/design/CheckBoxComponent;", "checkBox", "Lru/yandex/taxi/design/CheckBoxComponent;", "Landroid/view/View;", "chevron", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequiredAltChoiceComponentTrailView extends LinearLayout implements lh, nwy0 {
    private final CheckBoxComponent checkBox;
    private final View chevron;
    private final dfb externalAccessibilityDelegate;
    private final RobotoTextView subtitle;
    private final RobotoTextView title;
    private final AppCompatImageView trailImage;

    public RequiredAltChoiceComponentTrailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.externalAccessibilityDelegate = new dfb();
        View.inflate(context, xrh0.layout_altchoice_trail_view, this);
        int i2 = yfh0.trail_title;
        WeakHashMap weakHashMap = b.a;
        this.title = (RobotoTextView) ((View) rp31.d(this, i2));
        this.subtitle = (RobotoTextView) ((View) rp31.d(this, yfh0.trail_subtitle));
        this.trailImage = (AppCompatImageView) ((View) rp31.d(this, yfh0.trail_image));
        this.checkBox = (CheckBoxComponent) ((View) rp31.d(this, yfh0.trail_checkbox));
        this.chevron = (View) rp31.d(this, yfh0.trail_chevron);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.title.setTextColor(qje.t(xng0.textMain, getContext()));
        this.subtitle.setTextColor(qje.t(xng0.textMinor, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    /* renamed from: getTrailImageView, reason: from getter */
    public final AppCompatImageView getTrailImage() {
        return this.trailImage;
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.externalAccessibilityDelegate;
    }

    public final void setCheckBoxClickListener(sls listener) {
        this.checkBox.setOnClickListener(new xbg0(5, listener));
    }

    public final void setCheckMark(boolean selected, Drawable drawable) {
        this.checkBox.setVisibility(0);
        this.checkBox.setImageDrawable(drawable);
        this.externalAccessibilityDelegate.a = selected;
        this.chevron.setVisibility(8);
    }

    public final void setSubtitle(CharSequence text) {
        this.subtitle.setText(text);
        this.subtitle.setVisibility(text == null || evu0.J(text) ? 8 : 0);
    }

    public final void setTitle(CharSequence text) {
        this.title.setText(text);
        this.title.setVisibility(text == null || evu0.J(text) ? 8 : 0);
    }

    public final void showChevron() {
        this.chevron.setVisibility(0);
        this.checkBox.setVisibility(8);
    }

    public RequiredAltChoiceComponentTrailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RequiredAltChoiceComponentTrailView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RequiredAltChoiceComponentTrailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
