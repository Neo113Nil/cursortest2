package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class isf extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ List t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isf(ArrayList arrayList, List list, boolean z, int i) {
        super(1);
        this.r = i;
        this.s = arrayList;
        this.t = list;
        this.u = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jsk jskVar = (jsk) obj;
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    boolean z = this.u;
                    if (i >= size) {
                        List list = this.t;
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((lsf) list.get(i2)).k(jskVar, z);
                        }
                        break;
                    } else {
                        ((lsf) arrayList.get(i)).k(jskVar, z);
                        i++;
                    }
                }
            default:
                jsk jskVar2 = (jsk) obj;
                ArrayList arrayList2 = this.s;
                int size3 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    boolean z2 = this.u;
                    if (i3 >= size3) {
                        List list2 = this.t;
                        int size4 = list2.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            ((cvf) list2.get(i4)).l(jskVar2, z2);
                        }
                        break;
                    } else {
                        ((cvf) arrayList2.get(i3)).l(jskVar2, z2);
                        i3++;
                    }
                }
        }
        return Unit.a;
    }
}
