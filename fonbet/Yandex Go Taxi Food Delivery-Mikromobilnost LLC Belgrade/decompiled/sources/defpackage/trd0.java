package defpackage;

import android.net.Uri;
import com.yandex.plus.webview.core.resource.WebViewNavigationReason;
import java.util.Map;

/* loaded from: classes2.dex */
public final class trd0 implements urd0 {
    public final Uri a;
    public final Uri b;
    public final Map c;
    public final WebViewNavigationReason d;

    public trd0(Uri uri, Uri uri2, Map map, WebViewNavigationReason webViewNavigationReason) {
        this.a = uri;
        this.b = uri2;
        this.c = map;
        this.d = webViewNavigationReason;
    }

    @Override // defpackage.urd0
    public final WebViewNavigationReason a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trd0)) {
            return false;
        }
        trd0 trd0Var = (trd0) obj;
        return jl40.l(this.a, trd0Var.a) && this.b.equals(trd0Var.b) && jl40.l(this.c, trd0Var.c) && this.d == trd0Var.d;
    }

    @Override // defpackage.urd0
    public final Uri getUri() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return this.d.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        return "Other(mainFrameUri=" + this.a + ", uri=" + this.b + ", headers=" + this.c + ", navigationReason=" + this.d + ')';
    }
}
