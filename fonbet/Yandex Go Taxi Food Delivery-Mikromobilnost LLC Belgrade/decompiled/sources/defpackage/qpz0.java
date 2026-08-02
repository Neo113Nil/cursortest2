package defpackage;

import com.yandex.go.taxi.tariffs.interactor.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.orderbutton.toll_roads.interactors.b;
import ru.yandex.taxi.preorder.tollroad.o;

/* loaded from: classes6.dex */
public final class qpz0 extends ad5 {
    public final b A;
    public final v B;
    public boolean C;
    public final String D;
    public final teh x;
    public final tqz0 y;
    public final o z;

    public qpz0(teh tehVar, tqz0 tqz0Var, o oVar, b bVar, v vVar) {
        super(sqz0.class);
        this.x = tehVar;
        this.y = tqz0Var;
        this.z = oVar;
        this.A = bVar;
        this.B = vVar;
        this.D = oVar.d();
    }

    public static boolean Kg(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((ntk0) it.next()).k) {
                return true;
            }
        }
        return false;
    }
}
