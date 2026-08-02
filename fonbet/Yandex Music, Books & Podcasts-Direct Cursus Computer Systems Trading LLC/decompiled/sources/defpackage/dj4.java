package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dj4 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public dj4(cq4 cq4Var) {
        this.c = cq4Var;
        this.a = true;
        this.d = ydr.a(new k4k(true, i4k.a, false));
        this.e = new j0q();
    }

    public boolean a(Chip chip) {
        int id = chip.getId();
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        Chip chip2 = (Chip) ((HashMap) this.c).get(Integer.valueOf(c()));
        if (chip2 != null) {
            j(chip2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!chip.isChecked()) {
            chip.setChecked(true);
        }
        return add;
    }

    public ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.d);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof Chip) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        HashSet hashSet = (HashSet) this.d;
        if (!this.a || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void d() {
        Object value;
        this.a = true;
        xdr xdrVar = (xdr) this.d;
        do {
            value = xdrVar.getValue();
            ((k4k) value).getClass();
        } while (!xdrVar.k(value, new k4k(false, i4k.a, false)));
    }

    public void e() {
        ozw ozwVar = (ozw) this.e;
        if (ozwVar != null) {
            new HashSet((HashSet) this.d);
            vj4 vj4Var = (vj4) ozwVar.b;
            tj4 tj4Var = vj4Var.g;
            if (tj4Var != null) {
                vj4Var.h.b(vj4Var);
                vj4 vj4Var2 = (vj4) ((efo) tj4Var).b;
                if (vj4Var2.h.a) {
                    vj4Var2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public void f() {
        Object value;
        Object value2;
        this.b = false;
        boolean z = this.a;
        xdr xdrVar = (xdr) this.d;
        if (!z) {
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, k4k.a((k4k) value, null, 5)));
        } else {
            do {
                value2 = xdrVar.getValue();
                ((k4k) value2).getClass();
            } while (!xdrVar.k(value2, new k4k(false, null, true)));
        }
    }

    public void g() {
        Object value;
        Continuation continuation = null;
        if (this.a || this.b) {
            x97.y((cq4) this.c, null, null, new m1i(this, continuation, 22), 3);
        }
        this.b = false;
        this.a = false;
        xdr xdrVar = (xdr) this.d;
        do {
            value = xdrVar.getValue();
            ((k4k) value).getClass();
        } while (!xdrVar.k(value, new k4k(true, null, false)));
    }

    public void h() {
        Object value;
        this.b = true;
        xdr xdrVar = (xdr) this.d;
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, k4k.a((k4k) value, j4k.a, 5)));
    }

    public void i() {
        Object value;
        xdr xdrVar = (xdr) this.d;
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, k4k.a((k4k) value, i4k.a, 1)));
    }

    public boolean j(Chip chip, boolean z) {
        int id = chip.getId();
        HashSet hashSet = (HashSet) this.d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            chip.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (chip.isChecked()) {
            chip.setChecked(false);
        }
        return remove;
    }

    public dj4() {
        this.c = new HashMap();
        this.d = new HashSet();
    }
}
