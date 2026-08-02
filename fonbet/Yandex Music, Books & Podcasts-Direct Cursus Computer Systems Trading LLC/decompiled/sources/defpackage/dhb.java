package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class dhb extends jhb {
    public final ArrayList d;
    public final String e;
    public final List f;
    public final List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhb(String str, ArrayList arrayList) {
        super(str);
        str.getClass();
        this.d = arrayList;
        this.e = str;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jhb) it.next()).c());
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            qq6.d("Empty collection can't be reduced.");
            throw null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = CollectionsKt.g0((List) next, (List) it2.next());
        }
        this.f = (List) next;
        ArrayList arrayList3 = this.d;
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((jhb) it3.next()).b());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            qq6.d("Empty collection can't be reduced.");
            throw null;
        }
        Object next2 = it4.next();
        while (it4.hasNext()) {
            next2 = CollectionsKt.g0((List) next2, (List) it4.next());
        }
        this.g = (List) next2;
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        String obj;
        String str = this.e;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        boolean M = StringsKt.M(str, "://", false);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            jhb jhbVar = (jhb) it.next();
            Object h = h4bVar.h(jhbVar);
            if (M && (h instanceof c85)) {
                String hexString = Integer.toHexString(((c85) h).a);
                hexString.getClass();
                String upperCase = StringsKt.X(8, hexString).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                obj = "%23".concat(upperCase);
            } else {
                obj = h.toString();
            }
            arrayList.add(obj);
            d(jhbVar.b);
        }
        return CollectionsKt.X(arrayList, "", null, null, null, 62);
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.g;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhb)) {
            return false;
        }
        dhb dhbVar = (dhb) obj;
        return Intrinsics.d(this.d, dhbVar.d) && Intrinsics.d(this.e, dhbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return CollectionsKt.X(this.d, "", null, null, null, 62);
    }
}
