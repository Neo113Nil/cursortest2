package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public abstract class eme {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static final void a() {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ktm ktmVar = (ktm) ((dme) it.next()).a;
            ktmVar.getClass();
            etn.k0(ktmVar, Float.valueOf(1.0f));
            ktmVar.p0(null);
        }
    }
}
