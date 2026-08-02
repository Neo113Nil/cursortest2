package defpackage;

import android.net.Uri;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;

/* loaded from: classes2.dex */
public final class qzg extends vzg {
    public final Uri a;
    public final boolean b;
    public final Deeplink$WebViewFormat c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final boolean h;

    public qzg(Uri uri, boolean z, Deeplink$WebViewFormat deeplink$WebViewFormat, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z2) {
        this.a = uri;
        this.b = z;
        this.c = deeplink$WebViewFormat;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = bool4;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzg)) {
            return false;
        }
        qzg qzgVar = (qzg) obj;
        return jl40.l(this.a, qzgVar.a) && this.b == qzgVar.b && this.c == qzgVar.c && jl40.l(this.d, qzgVar.d) && jl40.l(this.e, qzgVar.e) && jl40.l(this.f, qzgVar.f) && jl40.l(this.g, qzgVar.g) && this.h == qzgVar.h;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        Deeplink$WebViewFormat deeplink$WebViewFormat = this.c;
        int hashCode = (e + (deeplink$WebViewFormat == null ? 0 : deeplink$WebViewFormat.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Simple(url=");
        sb.append(this.a);
        sb.append(", shouldOpenInBrowser=");
        sb.append(this.b);
        sb.append(", webViewFormat=");
        sb.append(this.c);
        sb.append(", showToolbar=");
        sb.append(this.d);
        sb.append(", showDash=");
        sb.append(this.e);
        sb.append(", showCross=");
        sb.append(this.f);
        sb.append(", showArrow=");
        sb.append(this.g);
        sb.append(", needAuth=");
        return unr0.u(sb, this.h, ')');
    }
}
