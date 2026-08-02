package defpackage;

import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.RootMapObjectCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class u35 extends ap00 {
    public final ArrayList h;

    public u35() {
        super(MapObjectCollection.class);
        this.h = new ArrayList();
    }

    @Override // defpackage.ap00
    public final void a(BaseMapObjectCollection baseMapObjectCollection) {
        super.a((MapObjectCollection) baseMapObjectCollection);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ap00) it.next()).a((BaseMapObjectCollection) this.g);
        }
    }

    @Override // defpackage.ap00
    public final void e() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ap00) it.next()).e();
        }
        super.e();
    }

    public final void l(RootMapObjectCollection rootMapObjectCollection) {
        d();
        super.a(rootMapObjectCollection);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ap00) it.next()).a((BaseMapObjectCollection) this.g);
        }
    }

    public final void m() {
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ap00) it.next()).e();
        }
        arrayList.clear();
    }

    public final ArrayList n() {
        return new ArrayList(this.h);
    }

    public final void o(ap00 ap00Var) {
        this.h.remove(ap00Var);
        ap00Var.e();
        ap00Var.b(null);
    }
}
