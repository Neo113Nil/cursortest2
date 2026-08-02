package com.squareup.cash.fileupload.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FileMetadata {
    public final Long byteCount;
    public final String displayName;
    public final String extension;
    public final String mimeType;

    public FileMetadata(String str, String str2, String str3, Long l) {
        str.getClass();
        str2.getClass();
        this.mimeType = str;
        this.displayName = str2;
        this.extension = str3;
        this.byteCount = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileMetadata)) {
            return false;
        }
        FileMetadata fileMetadata = (FileMetadata) obj;
        return Intrinsics.areEqual(this.mimeType, fileMetadata.mimeType) && Intrinsics.areEqual(this.displayName, fileMetadata.displayName) && Intrinsics.areEqual(this.extension, fileMetadata.extension) && Intrinsics.areEqual(this.byteCount, fileMetadata.byteCount);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mimeType.hashCode() * 31, 31, this.displayName);
        String str = this.extension;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.byteCount;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileMetadata(mimeType=", this.mimeType, ", displayName=", this.displayName, ", extension=");
        m.append(this.extension);
        m.append(", byteCount=");
        m.append(this.byteCount);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ FileMetadata(String str, String str2, int i) {
        this(str, str2, null, null);
    }
}
