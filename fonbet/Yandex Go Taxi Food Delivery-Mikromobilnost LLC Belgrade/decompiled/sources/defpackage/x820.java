package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class x820 {
    public final kjz a;
    public final am2 b;
    public final HashMap c;

    public x820(Context context, am2 am2Var) {
        kjz kjzVar = new kjz(context, 6);
        this.c = new HashMap();
        this.a = kjzVar;
        this.b = am2Var;
    }

    public final synchronized d011 a(String str) {
        if (this.c.containsKey(str)) {
            return (d011) this.c.get(str);
        }
        CctBackendFactory e = this.a.e(str);
        if (e == null) {
            return null;
        }
        am2 am2Var = this.b;
        d011 create = e.create(new y54((Context) am2Var.a, (s3c) am2Var.b, (s3c) am2Var.c, str));
        this.c.put(str, create);
        return create;
    }
}
