package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xo6 {
    public final Context a;
    public final mm6 b;
    public final x6k c;
    public List d;

    public xo6(Context context, mm6 mm6Var) {
        context.getClass();
        mm6Var.getClass();
        this.a = context;
        this.b = mm6Var;
        this.c = szf.g0(null);
    }

    public final bo6 a(xxk xxkVar) {
        arf arfVar;
        xxkVar.getClass();
        Map map = (Map) this.c.getValue();
        if (map == null || (arfVar = (arf) map.get(xxkVar.e)) == null) {
            return null;
        }
        return (bo6) arfVar.getValue();
    }
}
