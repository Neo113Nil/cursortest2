package app.cash.directoryui.viewmodels;

import com.squareup.cash.cdf.shophub.Metadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MissingMetadata {
    public final DirectoryAnalyticsData data;
    public final String imageUrl;
    public final Metadata missingMetadata;

    public MissingMetadata(DirectoryAnalyticsData directoryAnalyticsData, Metadata metadata, String str) {
        directoryAnalyticsData.getClass();
        this.data = directoryAnalyticsData;
        this.missingMetadata = metadata;
        this.imageUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissingMetadata)) {
            return false;
        }
        MissingMetadata missingMetadata = (MissingMetadata) obj;
        return Intrinsics.areEqual(this.data, missingMetadata.data) && this.missingMetadata == missingMetadata.missingMetadata && Intrinsics.areEqual(this.imageUrl, missingMetadata.imageUrl);
    }

    public final int hashCode() {
        int hashCode = (this.missingMetadata.hashCode() + (this.data.hashCode() * 31)) * 31;
        String str = this.imageUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissingMetadata(data=");
        sb.append(this.data);
        sb.append(", missingMetadata=");
        sb.append(this.missingMetadata);
        sb.append(", imageUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.imageUrl, ")");
    }
}
