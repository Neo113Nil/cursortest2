package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.g0;
import androidx.core.app.h0;
import androidx.core.app.w0;
import androidx.core.app.x0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class zz10 {
    public final Context a;

    public zz10(Context context) {
        this.a = context;
    }

    public final h0 a(List list, tls tlsVar) {
        w0 w0Var = new w0();
        w0Var.a = this.a.getResources().getString(oyh0.your_message_in_notification);
        h0 h0Var = new h0(w0Var.a());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ii60 ii60Var = (ii60) it.next();
            g0 g0Var = new g0(ii60Var.a, ii60Var.c, (x0) tlsVar.invoke(ii60Var));
            h2t h2tVar = ii60Var.g;
            if (h2tVar != null) {
                Uri uri = (Uri) h2tVar.a;
                g0Var.e = "image/";
                g0Var.f = uri;
            }
            h0Var.e(g0Var);
        }
        return h0Var;
    }
}
