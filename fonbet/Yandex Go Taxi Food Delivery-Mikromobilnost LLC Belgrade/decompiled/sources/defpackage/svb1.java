package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g;
import java.util.List;
import kotlinx.datetime.internal.format.b;

/* loaded from: classes.dex */
public final class svb1 implements u93 {
    public final Object a;

    public /* synthetic */ svb1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.u93
    public Object a(Object obj, Object obj2) {
        b bVar = (b) this.a;
        e421 e421Var = bVar.a;
        ntf0 ntf0Var = e421Var.a;
        List list = bVar.b;
        Integer num = (Integer) ntf0Var.a(obj, Integer.valueOf(list.indexOf((String) obj2) + e421Var.b));
        if (num != null) {
            return (String) list.get(num.intValue() - e421Var.b);
        }
        return null;
    }

    public void b(Bundle bundle, String str) {
        String uri;
        g gVar = (g) this.a;
        aaa1 aaa1Var = gVar.z;
        o5a1 o5a1Var = gVar.x;
        g.g(aaa1Var);
        aaa1Var.Gg();
        if (gVar.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        g.e(o5a1Var);
        o5a1Var.Q.p(uri);
        u4a1 u4a1Var = o5a1Var.R;
        gVar.D.getClass();
        u4a1Var.b(System.currentTimeMillis());
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        g gVar = (g) this.a;
        gVar.D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        o5a1 o5a1Var = gVar.x;
        g.e(o5a1Var);
        return currentTimeMillis - o5a1Var.R.a() > gVar.w.Ng(null, nw91.j0);
    }

    public boolean d() {
        o5a1 o5a1Var = ((g) this.a).x;
        g.e(o5a1Var);
        return o5a1Var.R.a() > 0;
    }
}
