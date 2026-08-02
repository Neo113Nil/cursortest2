package androidx.glance.appwidget;

import androidx.glance.layout.Alignment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class BoxChildSelector {
    public final int horizontalAlignment;

    /* renamed from: type, reason: collision with root package name */
    public final LayoutType f867type;
    public final int verticalAlignment;

    public BoxChildSelector(LayoutType layoutType, int i, int i2) {
        this.f867type = layoutType;
        this.horizontalAlignment = i;
        this.verticalAlignment = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxChildSelector)) {
            return false;
        }
        BoxChildSelector boxChildSelector = (BoxChildSelector) obj;
        return this.f867type == boxChildSelector.f867type && this.horizontalAlignment == boxChildSelector.horizontalAlignment && this.verticalAlignment == boxChildSelector.verticalAlignment;
    }

    public final int hashCode() {
        return Integer.hashCode(this.verticalAlignment) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.horizontalAlignment, this.f867type.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f867type + ", horizontalAlignment=" + ((Object) Alignment.Horizontal.m1123toStringimpl(this.horizontalAlignment)) + ", verticalAlignment=" + ((Object) Alignment.Vertical.m1125toStringimpl(this.verticalAlignment)) + ')';
    }
}
