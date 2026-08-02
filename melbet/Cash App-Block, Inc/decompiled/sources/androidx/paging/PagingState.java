package androidx.paging;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PagingState {
    public final Integer anchorPosition;
    public final PagingConfig config;
    public final int leadingPlaceholderCount;
    public final List pages;

    public PagingState(List list, Integer num, PagingConfig pagingConfig, int i) {
        list.getClass();
        this.pages = list;
        this.anchorPosition = num;
        this.config = pagingConfig;
        this.leadingPlaceholderCount = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) obj;
        return Intrinsics.areEqual(this.pages, pagingState.pages) && Intrinsics.areEqual(this.anchorPosition, pagingState.anchorPosition) && this.config == pagingState.config && this.leadingPlaceholderCount == pagingState.leadingPlaceholderCount;
    }

    public final int hashCode() {
        int hashCode = this.pages.hashCode();
        Integer num = this.anchorPosition;
        return Integer.hashCode(this.leadingPlaceholderCount) + this.config.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.pages);
        sb.append(", anchorPosition=");
        sb.append(this.anchorPosition);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", leadingPlaceholderCount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.leadingPlaceholderCount, ')');
    }
}
