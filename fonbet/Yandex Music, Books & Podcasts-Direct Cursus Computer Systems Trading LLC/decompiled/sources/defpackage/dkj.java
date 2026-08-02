package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class dkj implements Iterable {
    public final ArrayList a = new ArrayList();
    public int b;
    public boolean c;

    public static void a(dkj dkjVar) {
        int i = dkjVar.b - 1;
        dkjVar.b = i;
        if (i <= 0 && dkjVar.c) {
            dkjVar.c = false;
            ArrayList arrayList = dkjVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new akj(this);
    }
}
