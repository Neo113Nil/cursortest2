package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b1x {
    public final Context a;
    public final String b;
    public final p3x c;
    public final k74 d;
    public final l3x e;

    public b1x(Context context, k74 k74Var, l3x l3xVar) {
        String j;
        boolean isEmpty = Collections.unmodifiableList(k74Var.b).isEmpty();
        String str = k74Var.a;
        if (isEmpty) {
            j = vwb.J(str);
        } else {
            List unmodifiableList = Collections.unmodifiableList(k74Var.b);
            if (str == null) {
                xq0.x("applicationId cannot be null");
                throw null;
            }
            if (unmodifiableList == null) {
                xq0.x("namespaces cannot be null");
                throw null;
            }
            j = dxr.j(new dxr(str, unmodifiableList));
        }
        this.c = new p3x(this);
        this.a = context.getApplicationContext();
        y1g.C(j);
        this.b = j;
        this.d = k74Var;
        this.e = l3xVar;
    }
}
