package defpackage;

import com.yandex.div.core.timer.b;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class whl {
    public final l6o a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public whl(l6o l6oVar) {
        this.a = l6oVar;
    }

    public final void a(Div2View div2View) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            b bVar = (b) this.b.get((String) it.next());
            if (bVar != null && !bVar.d(div2View)) {
                bVar.e(div2View);
            }
        }
    }
}
