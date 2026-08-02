package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SelectContent {
    public final LocalCashInformationalContent content;

    public SelectContent(LocalCashInformationalContent localCashInformationalContent) {
        this.content = localCashInformationalContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectContent) && Intrinsics.areEqual(this.content, ((SelectContent) obj).content);
    }

    public final int hashCode() {
        LocalCashInformationalContent localCashInformationalContent = this.content;
        if (localCashInformationalContent == null) {
            return 0;
        }
        return localCashInformationalContent.hashCode();
    }

    public final String toString() {
        return "SelectContent(content=" + this.content + ")";
    }
}
