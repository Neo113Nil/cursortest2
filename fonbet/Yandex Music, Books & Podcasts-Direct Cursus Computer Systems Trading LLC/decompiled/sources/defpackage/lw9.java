package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lw9 {
    public final gc8 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;

    public lw9(gc8 gc8Var) {
        this.a = gc8Var;
    }

    public static ArrayList b(List list, View view) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jw9 jw9Var = (jw9) it.next();
            iw9 iw9Var = Intrinsics.d(jw9Var.b, view) ? (iw9) CollectionsKt.Z(jw9Var.d) : null;
            if (iw9Var != null) {
                arrayList.add(iw9Var);
            }
        }
        return arrayList;
    }

    public final void a(ViewGroup viewGroup, boolean z) {
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        ArrayList arrayList = this.b;
        if (!isAttachedToWindow) {
            arrayList.clear();
            return;
        }
        if (z) {
            l8t.b(viewGroup);
        }
        n8t n8tVar = new n8t();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n8tVar.W(((jw9) it.next()).a);
        }
        n8tVar.b(new kw9(0, n8tVar, this));
        l8t.a(viewGroup, n8tVar);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jw9 jw9Var = (jw9) it2.next();
            for (iw9 iw9Var : jw9Var.c) {
                jw9Var.b.setVisibility(iw9Var.a);
                jw9Var.d.add(iw9Var);
            }
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
    }
}
