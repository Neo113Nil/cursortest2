package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class m37 extends bfu {
    public final k8c k;
    public final x0q l = y0q.b(0, 0, null, 7);
    public u9o m;

    public m37(k8c k8cVar) {
        this.k = k8cVar;
    }

    public static String a(wds wdsVar, Context context) {
        if (wdsVar instanceof vds) {
            return ((vds) wdsVar).a;
        }
        if (!(wdsVar instanceof uds)) {
            return "";
        }
        String string = context.getString(((uds) wdsVar).a);
        string.getClass();
        return string;
    }
}
