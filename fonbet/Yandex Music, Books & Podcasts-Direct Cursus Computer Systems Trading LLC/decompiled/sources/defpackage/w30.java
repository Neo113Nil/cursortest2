package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w30 extends uif implements Function1 {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ mfh s;
    public final /* synthetic */ float t;
    public final /* synthetic */ int u;
    public final /* synthetic */ ArrayList v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(ArrayList arrayList, mfh mfhVar, float f, int i, ArrayList arrayList2) {
        super(1);
        this.r = arrayList;
        this.s = mfhVar;
        this.t = f;
        this.u = i;
        this.v = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) arrayList.get(i);
            int size2 = list.size();
            int[] iArr = new int[size2];
            int i2 = 0;
            while (i2 < size2) {
                iArr[i2] = ((ksk) list.get(i2)).a + (i2 < list.size() + (-1) ? this.s.L(this.t) : 0);
                i2++;
            }
            x2i x2iVar = qx0.a;
            int[] iArr2 = new int[size2];
            qx0.c(this.u, iArr, iArr2, false);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                jskVar.d((ksk) list.get(i3), iArr2[i3], ((Number) this.v.get(i)).intValue(), 0.0f);
            }
        }
        return Unit.a;
    }
}
