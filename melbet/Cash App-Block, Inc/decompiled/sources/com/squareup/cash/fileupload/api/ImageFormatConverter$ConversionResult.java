package com.squareup.cash.fileupload.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ImageFormatConverter$ConversionResult {
    public final FileMetadata metadata;
    public final String uri;

    public ImageFormatConverter$ConversionResult(String str, FileMetadata fileMetadata) {
        str.getClass();
        fileMetadata.getClass();
        this.uri = str;
        this.metadata = fileMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFormatConverter$ConversionResult)) {
            return false;
        }
        ImageFormatConverter$ConversionResult imageFormatConverter$ConversionResult = (ImageFormatConverter$ConversionResult) obj;
        return Intrinsics.areEqual(this.uri, imageFormatConverter$ConversionResult.uri) && Intrinsics.areEqual(this.metadata, imageFormatConverter$ConversionResult.metadata);
    }

    public final int hashCode() {
        return this.metadata.hashCode() + (this.uri.hashCode() * 31);
    }

    public final String toString() {
        return "ConversionResult(uri=" + UriString.m3554toStringimpl(this.uri) + ", metadata=" + this.metadata + ")";
    }
}
