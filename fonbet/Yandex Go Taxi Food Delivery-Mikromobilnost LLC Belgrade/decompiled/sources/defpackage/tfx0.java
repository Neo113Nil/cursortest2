package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.model.Zone;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class tfx0 implements sfx0 {
    public final ck31 a;
    public final bfx0 b;
    public final n3a c;

    public tfx0(ck31 ck31Var, bfx0 bfx0Var, n3a n3aVar) {
        this.a = ck31Var;
        this.b = bfx0Var;
        this.c = n3aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0062, code lost:
    
        if (r0.isEmpty() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        if (defpackage.evu0.J(r0) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(pex0 pex0Var) {
        boolean z;
        Zone zone = ((k) this.a).j().c;
        this.b.getClass();
        na4 a = bfx0.a(zone);
        if (pex0Var.K0) {
            if (a.b) {
                Iterable iterable = pex0Var.U;
                if (iterable == null) {
                    iterable = EmptyList.a;
                }
                Iterable iterable2 = iterable;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        String str = ((pex0) it.next()).o;
                        if (str != null && !evu0.J(str)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
        } else {
            TariffCard tariffCard = pex0Var.i0;
            List list = tariffCard != null ? tariffCard.d : null;
            if (list != null) {
            }
            String str2 = pex0Var.o;
            if (str2 != null) {
            }
            z = false;
        }
        String str3 = pex0Var.b;
        qqo qqoVar = this.c.b;
        return (!((viu) qqoVar.b()).b || ((viu) qqoVar.b()).c.contains(str3)) && z;
    }
}
