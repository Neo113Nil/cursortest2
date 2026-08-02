package defpackage;

import com.yandex.go.zone.dto.objects.TariffBranding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class qbx0 {
    public final qmp a;

    public qbx0(qmp qmpVar) {
        this.a = qmpVar;
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TariffBranding tariffBranding = (TariffBranding) it.next();
            ((ul51) this.a).getClass();
            arrayList.add(tariffBranding);
        }
        return arrayList;
    }
}
