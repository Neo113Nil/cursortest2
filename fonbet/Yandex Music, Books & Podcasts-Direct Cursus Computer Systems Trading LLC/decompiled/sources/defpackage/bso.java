package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bso extends uif implements Function1 {
    public final /* synthetic */ c9n A;
    public final /* synthetic */ Integer B;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ ArrayList u;
    public final /* synthetic */ ArrayList v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bso(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i, int i2, int i3, Integer num, c9n c9nVar, Integer num2) {
        super(1);
        this.r = arrayList;
        this.s = arrayList2;
        this.t = arrayList3;
        this.u = arrayList4;
        this.v = arrayList5;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = num;
        this.A = c9nVar;
        this.B = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        jsk jskVar = (jsk) obj;
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jskVar.d((ksk) arrayList.get(i2), 0, this.w, 0.0f);
        }
        ArrayList arrayList2 = this.s;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            jskVar.d((ksk) arrayList2.get(i3), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.t;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            i = this.x;
            if (i4 >= size3) {
                break;
            }
            jskVar.d((ksk) arrayList3.get(i4), 0, i - this.y, 0.0f);
            i4++;
        }
        ArrayList arrayList4 = this.u;
        int size4 = arrayList4.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ksk kskVar = (ksk) arrayList4.get(i5);
            Integer num = this.z;
            jskVar.d(kskVar, 0, i - (num != null ? num.intValue() : 0), 0.0f);
        }
        ArrayList arrayList5 = this.v;
        int size5 = arrayList5.size();
        for (int i6 = 0; i6 < size5; i6++) {
            ksk kskVar2 = (ksk) arrayList5.get(i6);
            c9n c9nVar = this.A;
            int i7 = c9nVar != null ? c9nVar.b : 0;
            Integer num2 = this.B;
            jskVar.d(kskVar2, i7, i - (num2 != null ? num2.intValue() : 0), 0.0f);
        }
        return Unit.a;
    }
}
