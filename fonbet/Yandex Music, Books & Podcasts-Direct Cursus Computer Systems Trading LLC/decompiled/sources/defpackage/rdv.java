package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rdv {
    public final WebResourceRequest a;
    public final WebResourceError b;

    public rdv(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webResourceError.getClass();
        this.a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdv)) {
            return false;
        }
        rdv rdvVar = (rdv) obj;
        return Intrinsics.d(this.a, rdvVar.a) && Intrinsics.d(this.b, rdvVar.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.a;
        return this.b.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.a + ", error=" + this.b + ")";
    }
}
