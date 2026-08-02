package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.h2r;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tpt;
import defpackage.upt;
import defpackage.xng0;
import defpackage.zng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/widget/GoNumberPicker;", "Lru/yandex/taxi/widget/BackportNumberPicker;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lupt;", "onValueChangedListener", "Lzy11;", "setOnValueChangedListener", "(Lupt;)V", "Ltpt;", "onScrollListener", "setOnScrollListener", "(Ltpt;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoNumberPicker extends BackportNumberPicker implements nwy0 {
    public /* synthetic */ GoNumberPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? zng0.numberPickerStyle : i);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean allowTraverse() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setSelectorBackgroundColor(qje.t(xng0.controlMinor, getContext()));
        getInputText().setTextColor(qje.t(xng0.textMain, getContext()));
        syncSelectorWheelPaintColor();
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void setOnScrollListener(tpt onScrollListener) {
        super.setOnScrollListener(new h2r(7, onScrollListener, this));
    }

    public final void setOnValueChangedListener(upt onValueChangedListener) {
        super.setOnValueChangedListener(new h2r(6, onValueChangedListener, this));
    }

    public GoNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GoNumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        applyTheme(ThemeType.LIGHT);
        installAccessibilityDelegate();
    }

    public GoNumberPicker(Context context) {
        this(context, null, 0, 6, null);
    }
}
