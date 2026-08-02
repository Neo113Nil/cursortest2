package defpackage;

import android.net.Uri;
import com.yandex.plus.webview.core.resource.WebViewNavigationReason;
import java.util.Map;

/* loaded from: classes2.dex */
public final class srd0 implements urd0 {
    public final Uri a;
    public final Map b;
    public final WebViewNavigationReason c;

    public srd0(Uri uri, Map map, WebViewNavigationReason webViewNavigationReason) {
        this.a = uri;
        this.b = map;
        this.c = webViewNavigationReason;
    }

    @Override // defpackage.urd0
    public final WebViewNavigationReason a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srd0)) {
            return false;
        }
        srd0 srd0Var = (srd0) obj;
        return jl40.l(this.a, srd0Var.a) && jl40.l(this.b, srd0Var.b) && this.c == srd0Var.c;
    }

    @Override // defpackage.urd0
    public final Uri getUri() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return this.c.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        return "MainFrame(uri=" + this.a + ", headers=" + this.b + ", navigationReason=" + this.c + ')';
    }
}
