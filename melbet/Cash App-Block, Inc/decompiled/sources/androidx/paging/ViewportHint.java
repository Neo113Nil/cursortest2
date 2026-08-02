package androidx.paging;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public abstract class ViewportHint {
    public final int originalPageOffsetFirst;
    public final int originalPageOffsetLast;
    public final int presentedItemsAfter;
    public final int presentedItemsBefore;

    public final class Access extends ViewportHint {
        public final int indexInPage;
        public final int pageOffset;

        public Access(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.pageOffset = i;
            this.indexInPage = i2;
        }

        @Override // androidx.paging.ViewportHint
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            Access access = (Access) obj;
            return this.pageOffset == access.pageOffset && this.indexInPage == access.indexInPage && this.presentedItemsBefore == access.presentedItemsBefore && this.presentedItemsAfter == access.presentedItemsAfter && this.originalPageOffsetFirst == access.originalPageOffsetFirst && this.originalPageOffsetLast == access.originalPageOffsetLast;
        }

        @Override // androidx.paging.ViewportHint
        public final int hashCode() {
            return Integer.hashCode(this.indexInPage) + Integer.hashCode(this.pageOffset) + super.hashCode();
        }

        public final String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + this.presentedItemsBefore + ",\n            |    presentedItemsAfter=" + this.presentedItemsAfter + ",\n            |    originalPageOffsetFirst=" + this.originalPageOffsetFirst + ",\n            |    originalPageOffsetLast=" + this.originalPageOffsetLast + ",\n            |)");
        }
    }

    public final class Initial extends ViewportHint {
        public final String toString() {
            return StringsKt__IndentKt.trimMargin$default("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.presentedItemsBefore + ",\n            |    presentedItemsAfter=" + this.presentedItemsAfter + ",\n            |    originalPageOffsetFirst=" + this.originalPageOffsetFirst + ",\n            |    originalPageOffsetLast=" + this.originalPageOffsetLast + ",\n            |)");
        }
    }

    public ViewportHint(int i, int i2, int i3, int i4) {
        this.presentedItemsBefore = i;
        this.presentedItemsAfter = i2;
        this.originalPageOffsetFirst = i3;
        this.originalPageOffsetLast = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewportHint)) {
            return false;
        }
        ViewportHint viewportHint = (ViewportHint) obj;
        return this.presentedItemsBefore == viewportHint.presentedItemsBefore && this.presentedItemsAfter == viewportHint.presentedItemsAfter && this.originalPageOffsetFirst == viewportHint.originalPageOffsetFirst && this.originalPageOffsetLast == viewportHint.originalPageOffsetLast;
    }

    public int hashCode() {
        return Integer.hashCode(this.originalPageOffsetLast) + Integer.hashCode(this.originalPageOffsetFirst) + Integer.hashCode(this.presentedItemsAfter) + Integer.hashCode(this.presentedItemsBefore);
    }

    public final int presentedItemsBeyondAnchor$paging_common(LoadType loadType) {
        loadType.getClass();
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (ordinal == 1) {
            return this.presentedItemsBefore;
        }
        if (ordinal == 2) {
            return this.presentedItemsAfter;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
