package defpackage;

import flex.engine.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final /* synthetic */ class wxl {
    public final /* synthetic */ a a;

    public /* synthetic */ wxl(a aVar) {
        this.a = aVar;
    }

    public final void a(ArrayList arrayList) {
        zjr zjrVar = this.a.N;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new eez((String) it.next()));
        }
        String str = zjrVar.d;
        if (str != null) {
            xfz.b.put(new yjr(str), kotlin.collections.a.J0(arrayList2));
        }
    }
}
