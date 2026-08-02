package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sdv {
    public final WebResourceRequest a;
    public final WebResourceError b;

    public sdv(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdv)) {
            return false;
        }
        sdv sdvVar = (sdv) obj;
        return Intrinsics.d(this.a, sdvVar.a) && this.b.equals(sdvVar.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.a;
        return this.b.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.a + ", error=" + this.b + ")";
    }
}
