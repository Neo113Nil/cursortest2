package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class xjd implements plk {
    public final List b;
    public final LinkedHashMap c = new LinkedHashMap();

    public xjd(List list) {
        this.b = list;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        plk plkVar = (plk) this.c.get(clkVar.j);
        if (plkVar == null) {
            return;
        }
        plkVar.bindView(view, clkVar, div2View, rvoVar, bVar);
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        plk plkVar = (plk) this.c.get(clkVar.j);
        return plkVar == null ? new View(div2View.getContext()) : plkVar.createView(clkVar, div2View, rvoVar, bVar);
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        Object obj;
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(str)) {
            return true;
        }
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((plk) obj).isCustomTypeSupported(str)) {
                break;
            }
        }
        plk plkVar = (plk) obj;
        if (plkVar == null) {
            return false;
        }
        linkedHashMap.put(str, plkVar);
        return true;
    }

    @Override // defpackage.plk
    public final f5l preload(clk clkVar, c5l c5lVar) {
        plk plkVar = (plk) this.c.get(clkVar.j);
        return plkVar == null ? ngd0.x : plkVar.preload(clkVar, c5lVar);
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        plk plkVar = (plk) this.c.get(clkVar.j);
        if (plkVar != null) {
            plkVar.release(view, clkVar);
        }
    }
}
