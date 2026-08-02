package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class fpn {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            epn epnVar = (epn) sparseArray.valueAt(i);
            Iterator it = epnVar.a.iterator();
            while (it.hasNext()) {
                tyf.l(((opn) it.next()).a);
            }
            epnVar.a.clear();
            i++;
        }
    }

    public opn b(int i) {
        epn epnVar = (epn) this.a.get(i);
        if (epnVar == null) {
            return null;
        }
        ArrayList arrayList = epnVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((opn) arrayList.get(size)).g()) {
                return (opn) arrayList.remove(size);
            }
        }
        return null;
    }

    public final epn c(int i) {
        SparseArray sparseArray = this.a;
        epn epnVar = (epn) sparseArray.get(i);
        if (epnVar != null) {
            return epnVar;
        }
        epn epnVar2 = new epn();
        sparseArray.put(i, epnVar2);
        return epnVar2;
    }

    public void d(opn opnVar) {
        int i = opnVar.f;
        ArrayList arrayList = c(i).a;
        if (((epn) this.a.get(i)).b <= arrayList.size()) {
            tyf.l(opnVar.a);
        } else if (RecyclerView.j1 && arrayList.contains(opnVar)) {
            xq0.x("this scrap item already exists");
        } else {
            opnVar.p();
            arrayList.add(opnVar);
        }
    }
}
