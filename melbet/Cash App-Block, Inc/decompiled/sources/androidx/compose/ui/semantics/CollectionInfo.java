package androidx.compose.ui.semantics;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CollectionInfo {
    public final int columnCount;
    public final int rowCount;

    public CollectionInfo(int i, int i2) {
        this.rowCount = i;
        this.columnCount = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionInfo)) {
            return false;
        }
        CollectionInfo collectionInfo = (CollectionInfo) obj;
        return this.rowCount == collectionInfo.rowCount && this.columnCount == collectionInfo.columnCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.columnCount) + (Integer.hashCode(this.rowCount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.rowCount);
        sb.append(", columnCount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.columnCount, ')');
    }
}
