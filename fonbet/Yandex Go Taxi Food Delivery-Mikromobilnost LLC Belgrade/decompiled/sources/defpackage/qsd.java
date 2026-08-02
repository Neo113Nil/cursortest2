package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.search.common.presenter.a;
import java.util.List;

/* loaded from: classes12.dex */
public final class qsd {
    public boolean a;
    public List b;
    public pzt0 c;
    public final /* synthetic */ a d;

    public qsd(a aVar, List list) {
        this.d = aVar;
        this.a = list.size() > 1;
        this.b = list;
        aVar.W = list.isEmpty() ? null : new pv0((Address) list.get(0), null, null, null, null, null, null, null, 1022);
    }
}
