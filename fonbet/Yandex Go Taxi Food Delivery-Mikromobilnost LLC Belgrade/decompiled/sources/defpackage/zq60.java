package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class zq60 implements Iterable {
    public final ArrayList a = new ArrayList();
    public int b;
    public int c;
    public boolean w;

    public static void a(zq60 zq60Var) {
        int i = zq60Var.b - 1;
        zq60Var.b = i;
        if (i <= 0 && zq60Var.w) {
            zq60Var.w = false;
            ArrayList arrayList = zq60Var.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    public final void b(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.a;
            if (arrayList.contains(obj)) {
                return;
            }
            arrayList.add(obj);
            this.c++;
        }
    }

    public final void clear() {
        this.c = 0;
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i == 0) {
            arrayList.clear();
            return;
        }
        int size = arrayList.size();
        this.w |= size != 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, null);
        }
    }

    public final void d(Object obj) {
        ArrayList arrayList;
        int indexOf;
        if (obj == null || (indexOf = (arrayList = this.a).indexOf(obj)) == -1) {
            return;
        }
        if (this.b == 0) {
            arrayList.remove(indexOf);
        } else {
            this.w = true;
            arrayList.set(indexOf, null);
        }
        this.c--;
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new sq60(this);
    }
}
