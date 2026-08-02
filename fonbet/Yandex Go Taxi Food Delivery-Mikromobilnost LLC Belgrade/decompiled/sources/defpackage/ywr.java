package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ywr {
    public final hwr a;
    public final Set b;
    public final vwr c;

    public ywr(hwr hwrVar, Set set) {
        this.a = hwrVar;
        this.b = set;
        this.c = new vwr(hwrVar.a, hwrVar.c);
    }

    public final Set a() {
        Set set = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!((nwr) obj).d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nwr) it.next()).c);
        }
        return a.N0(arrayList2);
    }

    public final Set b() {
        Set set = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((nwr) obj).d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nwr) it.next()).c);
        }
        return a.N0(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywr)) {
            return false;
        }
        ywr ywrVar = (ywr) obj;
        return jl40.l(this.a, ywrVar.a) && jl40.l(this.b, ywrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderWithFilters(folder=" + this.a + ", filterRefs=" + this.b + Extension.C_BRAKE;
    }
}
