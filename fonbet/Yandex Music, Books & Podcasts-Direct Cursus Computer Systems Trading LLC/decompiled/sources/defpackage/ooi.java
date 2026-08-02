package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ooi implements vzb {
    public final String a;
    public final ArrayList b;
    public final mag c;
    public final y7k d;
    public ArrayList e;

    public ooi(String str, ArrayList arrayList, mag magVar, y7k y7kVar) {
        this.a = str;
        this.b = arrayList;
        this.c = magVar;
        this.d = y7kVar;
    }

    @Override // defpackage.vzb
    public final List a(xzb xzbVar) {
        try {
            ArrayList c = c(xzbVar);
            this.e = c;
            return c;
        } catch (z7k e) {
            this.d.a(e);
            ArrayList arrayList = this.e;
            if (arrayList != null) {
                return arrayList;
            }
            throw e;
        }
    }

    @Override // defpackage.vzb
    public final ja8 b(xzb xzbVar, Function1 function1) {
        lma lmaVar = new lma(function1, this, xzbVar);
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((szb) CollectionsKt.Q(arrayList)).c(xzbVar, lmaVar);
        }
        vq5 vq5Var = new vq5();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vq5Var.a(((szb) it.next()).c(xzbVar, lmaVar));
        }
        return vq5Var;
    }

    public final ArrayList c(xzb xzbVar) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((szb) it.next()).a(xzbVar));
        }
        if (this.c.b(arrayList2)) {
            return arrayList2;
        }
        throw a8k.c(arrayList2, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ooi) {
            return this.b.equals(((ooi) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 16;
    }
}
