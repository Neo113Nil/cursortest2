package defpackage;

import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class snk implements sr51 {
    public final /* synthetic */ tnk a;
    public final /* synthetic */ Div2View b;

    public snk(tnk tnkVar, Div2View div2View) {
        this.a = tnkVar;
        this.b = div2View;
    }

    public final void a() {
        List list;
        tnk tnkVar = this.a;
        if (tnkVar == null || (list = tnkVar.a) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Div2View.handleAction$default(this.b, (v3k) it.next(), null, null, 6, null);
        }
    }

    public final void b(y2l y2lVar) {
        List list;
        tnk tnkVar = this.a;
        if (tnkVar != null && (list = tnkVar.b) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Div2View.handleAction$default(this.b, (v3k) it.next(), null, null, 6, null);
            }
        }
        if (y2lVar != null) {
            this.b.applyPatch(y2lVar);
        }
    }
}
