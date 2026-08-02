package androidx.paging;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public final class PagingDataEvent$DropPrepend extends FlowExtKt {
    public final int dropCount;
    public final int newPlaceholdersBefore;
    public final int oldPlaceholdersBefore;

    public PagingDataEvent$DropPrepend(int i, int i2, int i3) {
        this.dropCount = i;
        this.newPlaceholdersBefore = i2;
        this.oldPlaceholdersBefore = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PagingDataEvent$DropPrepend)) {
            return false;
        }
        PagingDataEvent$DropPrepend pagingDataEvent$DropPrepend = (PagingDataEvent$DropPrepend) obj;
        return this.dropCount == pagingDataEvent$DropPrepend.dropCount && this.newPlaceholdersBefore == pagingDataEvent$DropPrepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == pagingDataEvent$DropPrepend.oldPlaceholdersBefore;
    }

    public final int hashCode() {
        return Integer.hashCode(this.oldPlaceholdersBefore) + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.dropCount);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.dropCount;
        Recorder$$ExternalSyntheticOutline1.m105m(i, i, " items (\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb);
        sb.append(this.newPlaceholdersBefore);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.oldPlaceholdersBefore);
        sb.append("\n                    |)\n                    |");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }
}
