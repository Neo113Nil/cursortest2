package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes8.dex */
public final class sw51 {
    public final hh51 a;
    public final Context b;

    public sw51(hh51 hh51Var, Context context) {
        this.a = hh51Var;
        this.b = context;
    }

    public final String a() {
        String str;
        Context context = this.b;
        String q = cvu0.q(((String) this.a.e.invoke()).getBytes(uza.d));
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                str = "";
            }
        } catch (Throwable unused) {
            str = null;
        }
        StringBuilder t = qv10.t(q);
        t.append(" app-id/" + context.getPackageName() + "/" + str);
        String[] strArr = {" yb-sdk/", "0.233.1"};
        for (int i = 0; i < 2; i++) {
            t.append(strArr[i]);
        }
        String[] strArr2 = {" divkit/", xsl.a};
        for (int i2 = 0; i2 < 2; i2++) {
            t.append(strArr2[i2]);
        }
        Object[] objArr = {" os-version/", Integer.valueOf(Build.VERSION.SDK_INT)};
        for (int i3 = 0; i3 < 2; i3++) {
            t.append(objArr[i3]);
        }
        t.append(" (android)");
        return t.toString();
    }
}
