package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class wyl extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyl(ArrayList arrayList, int i) {
        super(1);
        this.r = i;
        this.s = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.get(((Number) obj).intValue());
                return null;
            case 1:
                this.s.get(((Number) obj).intValue());
                return null;
            case 2:
                jsk jskVar = (jsk) obj;
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jsk.j(jskVar, (ksk) arrayList.get(i), 0, 0, null, 12);
                }
                return Unit.a;
            case 3:
                this.s.get(((Number) obj).intValue());
                return null;
            case 4:
                jsk jskVar2 = (jsk) obj;
                ArrayList arrayList2 = this.s;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jskVar2.d((ksk) arrayList2.get(i2), 0, 0, 0.0f);
                }
                return Unit.a;
            case 5:
                this.s.get(((Number) obj).intValue());
                return null;
            default:
                this.s.get(((Number) obj).intValue());
                return null;
        }
    }
}
