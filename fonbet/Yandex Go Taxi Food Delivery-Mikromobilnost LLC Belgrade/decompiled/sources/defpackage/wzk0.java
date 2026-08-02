package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final /* synthetic */ class wzk0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0l0 b;

    public /* synthetic */ wzk0(d0l0 d0l0Var, int i) {
        this.a = i;
        this.b = d0l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = EmptyList.a;
        d0l0 d0l0Var = this.b;
        switch (i) {
            case 0:
                ZoneAddress zoneAddress = d0l0Var.a;
                List list = d0l0Var.b;
                if (zoneAddress == null) {
                    return obj;
                }
                ArrayList arrayList = new ArrayList(list.size() + 1);
                arrayList.add(zoneAddress.a);
                arrayList.addAll(list);
                return arrayList;
            case 1:
                List list2 = d0l0Var.b;
                if (list2.size() >= 2) {
                    int size = list2.size() - 1;
                    obj = new ArrayList(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        obj.add(((Address) list2.get(i2)).B());
                    }
                }
                return obj;
            default:
                return oyr.i(d0l0Var.a().size(), "Can't edit mid point due to route size of ");
        }
    }
}
