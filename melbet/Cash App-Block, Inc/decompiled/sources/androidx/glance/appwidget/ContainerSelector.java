package androidx.glance.appwidget;

import androidx.glance.layout.Alignment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ContainerSelector {
    public final Alignment.Horizontal horizontalAlignment;
    public final int numChildren;

    /* renamed from: type, reason: collision with root package name */
    public final LayoutType f868type;
    public final Alignment.Vertical verticalAlignment;

    public /* synthetic */ ContainerSelector(LayoutType layoutType, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, int i2) {
        this(layoutType, i, (i2 & 4) != 0 ? null : horizontal, (i2 & 8) != 0 ? null : vertical);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContainerSelector)) {
            return false;
        }
        ContainerSelector containerSelector = (ContainerSelector) obj;
        return this.f868type == containerSelector.f868type && this.numChildren == containerSelector.numChildren && Intrinsics.areEqual(this.horizontalAlignment, containerSelector.horizontalAlignment) && Intrinsics.areEqual(this.verticalAlignment, containerSelector.verticalAlignment);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.numChildren, this.f868type.hashCode() * 31, 31);
        Alignment.Horizontal horizontal = this.horizontalAlignment;
        int hashCode = (m + (horizontal == null ? 0 : Integer.hashCode(horizontal.value))) * 31;
        Alignment.Vertical vertical = this.verticalAlignment;
        return hashCode + (vertical != null ? Integer.hashCode(vertical.value) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f868type + ", numChildren=" + this.numChildren + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ')';
    }

    public ContainerSelector(LayoutType layoutType, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.f868type = layoutType;
        this.numChildren = i;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
    }
}
