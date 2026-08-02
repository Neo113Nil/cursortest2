package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t1a implements Runnable {
    public final /* synthetic */ w1a a;
    public final /* synthetic */ View b;
    public final /* synthetic */ gc8 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ xzb e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ ArrayList g;

    public t1a(w1a w1aVar, View view, gc8 gc8Var, String str, xzb xzbVar, Map map, ArrayList arrayList) {
        this.a = w1aVar;
        this.b = view;
        this.c = gc8Var;
        this.d = str;
        this.e = xzbVar;
        this.f = map;
        this.g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = i9f.a;
        w1a w1aVar = this.a;
        WeakHashMap weakHashMap = w1aVar.k;
        View view = this.b;
        Set set = (Set) weakHashMap.get(view);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.g) {
                if (obj instanceof tw8) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                set.remove((tw8) it.next());
            }
            if (set.isEmpty()) {
                weakHashMap.remove(view);
                w1aVar.j.remove(view);
            }
        }
        if (Intrinsics.d(this.c.getLogId(), this.d)) {
            m1a m1aVar = w1aVar.b;
            wj9[] wj9VarArr = (wj9[]) this.f.values().toArray(new wj9[0]);
            m1aVar.getClass();
            gc8 gc8Var = this.c;
            gc8Var.v(new vh0(wj9VarArr, m1aVar, gc8Var, this.e, this.b, 6));
        }
    }
}
