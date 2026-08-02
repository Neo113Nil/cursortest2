package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rb5 {
    public pxi a;
    public final ArrayList b = new ArrayList();
    public final Handler c = new Handler(Looper.getMainLooper());

    public final void a(pxi pxiVar) {
        pxiVar.getClass();
        this.a = pxiVar;
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pxiVar.a((ob5[]) it.next());
        }
        arrayList.clear();
    }
}
