package defpackage;

import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public class tfl0 extends i95 {
    public static void b(tfl0 tfl0Var, Screen screen, ArrayList arrayList, boolean z, int i) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        tfl0Var.getClass();
        tfl0Var.a(new ujc(screen, arrayList, z));
    }

    public final void c(FragmentScreen fragmentScreen, FragmentScreen fragmentScreen2) {
        a(new ujc(fragmentScreen, 6), new vjc(fragmentScreen2));
    }

    public void d() {
    }

    public final void e() {
        a(tjc.a);
    }

    public final void f() {
        a(new ujc(null, 6), tjc.a);
    }

    public List g() {
        return EmptyList.a;
    }

    public final void h(Screen screen) {
        a(new vjc(screen));
    }

    public final void i(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        int i = 0;
        while (true) {
            FragmentScreen fragmentScreen = null;
            if (!it.hasNext()) {
                c2r0 c2r0Var = new c2r0(2, 1);
                c2r0Var.a(new ujc(fragmentScreen, 6));
                c2r0Var.b(arrayList.toArray(new dlc[0]));
                ArrayList arrayList2 = c2r0Var.b;
                a((dlc[]) arrayList2.toArray(new dlc[arrayList2.size()]));
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Screen screen = (Screen) next;
            arrayList.add(i == 0 ? new jkc(screen) : new vjc(screen));
            i = i2;
        }
    }

    public final void j(Screen... screenArr) {
        i(j73.d0(screenArr));
    }

    public final void k(FragmentScreen fragmentScreen) {
        a(new ujc(null, 6), new jkc(fragmentScreen));
    }

    public final void l(FragmentScreen fragmentScreen) {
        a(new jkc(fragmentScreen));
    }

    public final void m(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Screen screen = (Screen) obj;
            arrayList.add(i == 0 ? new jkc(screen) : new vjc(screen));
            i = i2;
        }
        dlc[] dlcVarArr = (dlc[]) arrayList.toArray(new dlc[0]);
        a((dlc[]) Arrays.copyOf(dlcVarArr, dlcVarArr.length));
    }
}
