package defpackage;

import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public interface nil {
    static boolean a(x xVar) {
        mse j;
        String str;
        if (xVar.z() > 0) {
            int size = xVar.A().size();
            int r = xVar.r();
            if (r < 0 || r >= size) {
                str = dfi.f("PlayerQueue.isValid() currentPlayableIndex(", xVar.r(), xVar.z(), ") out of 0..<playableListCount(", ")");
                dfi.r(str, "YnisonRequestValidator");
                return false;
            }
        }
        if ((xVar.F() ? xVar.C() : null) == null) {
            return false;
        }
        List A = xVar.A();
        A.getClass();
        List list = A;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f) it.next()).getClass();
            }
        }
        i0 C = y7g.C(xVar);
        if (C == null || C.i() == xVar.z()) {
            i0 C2 = y7g.C(xVar);
            if (C2 == null || (j = C2.j()) == null) {
                return true;
            }
            int size2 = j.size();
            List w0 = CollectionsKt.w0(CollectionsKt.z0(j));
            ArrayList arrayList = new ArrayList();
            for (Object obj : w0) {
                Integer num = (Integer) obj;
                int size3 = xVar.A().size();
                num.getClass();
                int intValue = num.intValue();
                if (intValue >= 0 && intValue < size3) {
                    arrayList.add(obj);
                }
            }
            if (size2 == arrayList.size()) {
                return true;
            }
            str = "PlayerQueue.isValid() shuffle contains non-unique indexes or index out playableList ";
        } else {
            i0 C3 = y7g.C(xVar);
            Integer valueOf = C3 != null ? Integer.valueOf(C3.i()) : null;
            str = "PlayerQueue.isValid() shuffle size(" + valueOf + ") not equals playableListCount(" + xVar.z() + ")";
        }
        dfi.r(str, "YnisonRequestValidator");
        return false;
    }

    boolean b(x xVar);
}
