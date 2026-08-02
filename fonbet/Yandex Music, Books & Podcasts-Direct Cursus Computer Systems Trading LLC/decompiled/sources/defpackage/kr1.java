package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class kr1 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public kr1(nsh nshVar, sr1 sr1Var, int i, or1 or1Var, c6e c6eVar) {
        this.f = nshVar;
        this.c = sr1Var;
        this.b = i;
        this.d = or1Var;
        this.e = c6eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i2 = this.b;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((nsh) obj4).i((sr1) obj3, i2, (or1) obj2, (c6e) obj);
                return;
            case 1:
                ((ls1) obj4).c.execute(new x8x(this, zsd.H(new js1(this)), false, 8));
                return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            View view = (View) ((ArrayList) obj3).get(i3);
            String str = (String) ((ArrayList) obj2).get(i3);
            WeakHashMap weakHashMap = wdu.a;
            ndu.o(view, str);
            ndu.o((View) ((ArrayList) obj).get(i3), (String) ((ArrayList) obj4).get(i3));
        }
    }

    public kr1(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    public kr1(ls1 ls1Var, List list, List list2, int i, Runnable runnable) {
        this.f = ls1Var;
        this.c = list;
        this.d = list2;
        this.b = i;
        this.e = runnable;
    }
}
