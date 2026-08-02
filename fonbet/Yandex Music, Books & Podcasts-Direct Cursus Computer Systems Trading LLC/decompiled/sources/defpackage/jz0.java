package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class jz0 extends jxt {
    public final ArrayList b;

    public jz0(ArrayList arrayList) {
        super(yxt.Array);
        this.b = arrayList;
    }

    @Override // defpackage.jxt
    public final q1f b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(new jkr((String) it.next()));
        }
        return new my0(arrayList);
    }
}
