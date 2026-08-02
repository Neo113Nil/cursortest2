package androidx.glance.appwidget;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class RowColumnChildSelector {
    public final boolean expandHeight;
    public final boolean expandWidth;

    /* renamed from: type, reason: collision with root package name */
    public final LayoutType f869type;

    public RowColumnChildSelector(LayoutType layoutType, boolean z, boolean z2) {
        this.f869type = layoutType;
        this.expandWidth = z;
        this.expandHeight = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnChildSelector)) {
            return false;
        }
        RowColumnChildSelector rowColumnChildSelector = (RowColumnChildSelector) obj;
        return this.f869type == rowColumnChildSelector.f869type && this.expandWidth == rowColumnChildSelector.expandWidth && this.expandHeight == rowColumnChildSelector.expandHeight;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.expandHeight) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f869type.hashCode() * 31, 31, this.expandWidth);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.f869type);
        sb.append(", expandWidth=");
        sb.append(this.expandWidth);
        sb.append(", expandHeight=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.expandHeight, ')');
    }
}
