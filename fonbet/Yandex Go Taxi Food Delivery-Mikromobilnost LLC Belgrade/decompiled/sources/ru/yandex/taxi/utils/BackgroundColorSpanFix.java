package ru.yandex.taxi.utils;

import android.text.style.BackgroundColorSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0082\u0004J\n\u0010\u000b\u001a\u00020\u0003H\u0096\u0080\u0004¨\u0006\f"}, d2 = {"Lru/yandex/taxi/utils/BackgroundColorSpanFix;", "Landroid/text/style/BackgroundColorSpan;", "color", "", "Landroidx/annotation/ColorInt;", "<init>", "(I)V", "equals", "", "other", "", "hashCode", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackgroundColorSpanFix extends BackgroundColorSpan {
    public BackgroundColorSpanFix(int i) {
        super(i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return BackgroundColorSpanFix.class.equals(other != null ? other.getClass() : null) && getBackgroundColor() == ((BackgroundColorSpanFix) other).getBackgroundColor();
    }

    public int hashCode() {
        return getBackgroundColor();
    }
}
