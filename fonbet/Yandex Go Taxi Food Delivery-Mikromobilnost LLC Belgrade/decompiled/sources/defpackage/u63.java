package defpackage;

import com.yandex.xplat.xflags.VariableType;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class u63 extends b231 {
    public final ArrayList b;

    public u63(ArrayList arrayList) {
        super(VariableType.Array);
        this.b = arrayList;
    }

    @Override // defpackage.b231
    public final y3x b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(new ktu0((String) it.next()));
        }
        return new n53(arrayList);
    }
}
