package defpackage;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class xl41 {
    public final ArrayList a;

    public xl41(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final WebResourceResponse a(Uri uri) {
        WebResourceResponse handle;
        Iterator it = this.a.iterator();
        while (true) {
            vl41 vl41Var = null;
            if (!it.hasNext()) {
                return null;
            }
            wl41 wl41Var = (wl41) it.next();
            wl41Var.getClass();
            String str = wl41Var.c;
            if ((!uri.getScheme().equals("http") || wl41Var.a) && ((uri.getScheme().equals("http") || uri.getScheme().equals(Constants.SCHEME)) && uri.getAuthority().equals(wl41Var.b) && uri.getPath().startsWith(str))) {
                vl41Var = wl41Var.d;
            }
            if (vl41Var != null && (handle = vl41Var.handle(uri.getPath().replaceFirst(str, ""))) != null) {
                return handle;
            }
        }
    }
}
