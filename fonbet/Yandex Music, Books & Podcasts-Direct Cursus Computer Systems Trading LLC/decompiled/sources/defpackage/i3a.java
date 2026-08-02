package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class i3a {
    public final /* synthetic */ o3a a;

    public /* synthetic */ i3a(o3a o3aVar) {
        this.a = o3aVar;
    }

    public final void a(ArrayList arrayList) {
        g06 g06Var = this.a.q;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new uqg((String) it.next()));
        }
        String str = (String) g06Var.d;
        if (str != null) {
            fsg.b.put(new aic(str), CollectionsKt.w0(arrayList2));
        }
    }
}
