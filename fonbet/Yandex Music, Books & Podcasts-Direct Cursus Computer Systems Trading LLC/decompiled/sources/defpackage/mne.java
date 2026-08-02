package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class mne implements rr2 {
    public final ArrayList a;
    public String b = "";
    public int c;

    public mne(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.rr2
    public final boolean a(String str) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((rr2) it.next()).a(str)) {
                return false;
            }
        }
        return true;
    }
}
