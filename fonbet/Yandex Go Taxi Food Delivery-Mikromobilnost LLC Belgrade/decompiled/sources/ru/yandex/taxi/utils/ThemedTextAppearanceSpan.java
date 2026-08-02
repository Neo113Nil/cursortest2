package ru.yandex.taxi.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import defpackage.jl40;
import defpackage.n4i0;
import defpackage.nxy0;
import defpackage.pwy0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/utils/ThemedTextAppearanceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/content/Context;", "context", "Lpwy0;", "themeProvider", "", "appearance", "<init>", "(Landroid/content/Context;Lpwy0;I)V", "Lzy11;", "updateTextAppearance", "()V", "Lnxy0;", "createTextAppearance", "()Lnxy0;", "Landroid/text/TextPaint;", XAdESParameters.XML_SIGNATURE_PREFIX, "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/content/Context;", "Lpwy0;", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/theme/ThemeType;", "currentThemeType", "Lru/yandex/taxi/theme/ThemeType;", "textAppearance", "Lnxy0;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThemedTextAppearanceSpan extends MetricAffectingSpan {
    private final int appearance;
    private final Context context;
    private ThemeType currentThemeType;
    private nxy0 textAppearance = createTextAppearance();
    private final pwy0 themeProvider;

    public ThemedTextAppearanceSpan(Context context, pwy0 pwy0Var, int i) {
        this.context = context;
        this.themeProvider = pwy0Var;
        this.appearance = i;
        this.currentThemeType = pwy0Var.getThemeType();
    }

    private final nxy0 createTextAppearance() {
        TypedArray obtainStyledAttributes = this.context.obtainStyledAttributes(this.appearance, n4i0.TextAppearance);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n4i0.TextAppearance_android_textSize, -1);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(n4i0.TextAppearance_android_textColor);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(n4i0.TextAppearance_android_textColorLink);
        obtainStyledAttributes.recycle();
        return new nxy0(dimensionPixelSize, colorStateList, colorStateList2);
    }

    private final void updateTextAppearance() {
        if (this.themeProvider.getThemeType() == this.currentThemeType) {
            return;
        }
        this.currentThemeType = this.themeProvider.getThemeType();
        this.textAppearance = createTextAppearance();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ThemedTextAppearanceSpan.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ThemedTextAppearanceSpan themedTextAppearanceSpan = (ThemedTextAppearanceSpan) other;
        return this.appearance == themedTextAppearanceSpan.appearance && jl40.l(this.textAppearance, themedTextAppearanceSpan.textAppearance);
    }

    public int hashCode() {
        return this.textAppearance.hashCode() + (this.appearance * 31);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        updateTextAppearance();
        updateMeasureState(ds);
        ColorStateList colorStateList = this.textAppearance.b;
        if (colorStateList != null) {
            ds.setColor(colorStateList.getColorForState(ds.drawableState, 0));
        }
        ColorStateList colorStateList2 = this.textAppearance.c;
        if (colorStateList2 != null) {
            ds.linkColor = colorStateList2.getColorForState(ds.drawableState, 0);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint ds) {
        float f = this.textAppearance.a;
        if (f > 0.0f) {
            ds.setTextSize(f);
        }
    }
}
