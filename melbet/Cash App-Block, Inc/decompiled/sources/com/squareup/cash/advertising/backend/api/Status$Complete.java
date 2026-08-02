package com.squareup.cash.advertising.backend.api;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes5.dex */
public final class Status$Complete extends RenderTreeStringKt {
    public final Uri assetUri;

    public Status$Complete(Uri uri) {
        this.assetUri = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Status$Complete) && Intrinsics.areEqual(this.assetUri, ((Status$Complete) obj).assetUri);
    }

    public final int hashCode() {
        Uri uri = this.assetUri;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "Complete(assetUri=" + this.assetUri + ")";
    }
}
