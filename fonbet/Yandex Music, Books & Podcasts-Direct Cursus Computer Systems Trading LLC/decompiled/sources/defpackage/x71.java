package defpackage;

import com.yandex.plus.bdui.action.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ x71(Object obj, ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new c81(c5b.a, a81.J(this.b), false);
            case 1:
                return new c81(a81.K(this.b), c5b.a, false);
            case 2:
                return new nv5(new yu5(this.b), new xu5());
            case 3:
                return ((u9f) this.b.get(0)).d();
            case 4:
                ArrayList<Pair> arrayList = this.b;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (Pair pair : arrayList) {
                    arrayList2.add(new Pair(Float.valueOf(((Number) pair.a).floatValue()), ((sdr) pair.b).getValue()));
                }
                return sk3.q(arrayList2);
            default:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : this.b) {
                    if (!((b) obj).e) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((b) it.next()).a);
                }
                return CollectionsKt.A0(arrayList4);
        }
    }

    public /* synthetic */ x71(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }
}
