package defpackage;

import android.net.Uri;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$ModalHeightType;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;

/* loaded from: classes2.dex */
public final class rzg extends vzg {
    public final Uri a;
    public final Deeplink$WebViewFormat b;
    public final Deeplink$ModalHeightType c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final String l;

    public rzg(Uri uri, Deeplink$WebViewFormat deeplink$WebViewFormat, Deeplink$ModalHeightType deeplink$ModalHeightType, Integer num, String str, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2) {
        this.a = uri;
        this.b = deeplink$WebViewFormat;
        this.c = deeplink$ModalHeightType;
        this.d = num;
        this.e = str;
        this.f = num2;
        this.g = bool;
        this.h = bool2;
        this.i = bool3;
        this.j = bool4;
        this.k = bool5;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzg)) {
            return false;
        }
        rzg rzgVar = (rzg) obj;
        return this.a.equals(rzgVar.a) && this.b == rzgVar.b && this.c == rzgVar.c && jl40.l(this.d, rzgVar.d) && jl40.l(this.e, rzgVar.e) && jl40.l(this.f, rzgVar.f) && jl40.l(this.g, rzgVar.g) && jl40.l(this.h, rzgVar.h) && jl40.l(this.i, rzgVar.i) && jl40.l(this.j, rzgVar.j) && jl40.l(this.k, rzgVar.k) && jl40.l(this.l, rzgVar.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Deeplink$WebViewFormat deeplink$WebViewFormat = this.b;
        int hashCode2 = (hashCode + (deeplink$WebViewFormat == null ? 0 : deeplink$WebViewFormat.hashCode())) * 31;
        Deeplink$ModalHeightType deeplink$ModalHeightType = this.c;
        int hashCode3 = (hashCode2 + (deeplink$ModalHeightType == null ? 0 : deeplink$ModalHeightType.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.k;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.l;
        return hashCode11 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Smart(url=");
        sb.append(this.a);
        sb.append(", webViewFormat=");
        sb.append(this.b);
        sb.append(", modalHeightType=");
        sb.append(this.c);
        sb.append(", modalHeightValue=");
        sb.append(this.d);
        sb.append(", screenId=");
        sb.append(this.e);
        sb.append(", shadowAlpha=");
        sb.append(this.f);
        sb.append(", disableClose=");
        sb.append(this.g);
        sb.append(", showToolbar=");
        sb.append(this.h);
        sb.append(", showDash=");
        sb.append(this.i);
        sb.append(", showCross=");
        sb.append(this.j);
        sb.append(", showArrow=");
        sb.append(this.k);
        sb.append(", message=");
        return b64.p(sb, this.l, ')');
    }
}
