package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Quirks {
    public final ArrayList mQuirks;

    public Quirks(ArrayList arrayList) {
        this.mQuirks = new ArrayList(arrayList);
    }

    public static String toString(Quirks quirks) {
        ArrayList arrayList = new ArrayList();
        Iterator it = quirks.mQuirks.iterator();
        while (it.hasNext()) {
            arrayList.add(((Quirk) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean contains(Class cls) {
        Iterator it = this.mQuirks.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((Quirk) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final Quirk get(Class cls) {
        Iterator it = this.mQuirks.iterator();
        while (it.hasNext()) {
            Quirk quirk = (Quirk) it.next();
            if (quirk.getClass() == cls) {
                return quirk;
            }
        }
        return null;
    }

    public final ArrayList getAll(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mQuirks.iterator();
        while (it.hasNext()) {
            Quirk quirk = (Quirk) it.next();
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
