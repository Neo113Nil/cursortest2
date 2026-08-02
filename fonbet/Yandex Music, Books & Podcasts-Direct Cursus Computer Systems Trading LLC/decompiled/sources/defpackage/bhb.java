package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bhb extends jhb {
    public final String d;
    public final ArrayList e;
    public jhb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhb(String str) {
        super(str);
        str.getClass();
        this.d = str;
        char[] charArray = str.toCharArray();
        charArray.getClass();
        los losVar = new los(charArray);
        ArrayList arrayList = losVar.c;
        try {
            gut.G0(losVar, arrayList, false);
            this.e = arrayList;
        } catch (khb e) {
            if (!(e instanceof mos)) {
                throw e;
            }
            throw new khb("Error tokenizing '" + new String(charArray) + "'.", e);
        }
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        e();
        jhb jhbVar = this.f;
        if (jhbVar == null) {
            Intrinsics.j("expression");
            throw null;
        }
        Object a = jhbVar.a(h4bVar);
        jhb jhbVar2 = this.f;
        if (jhbVar2 != null) {
            d(jhbVar2.b);
            return a;
        }
        Intrinsics.j("expression");
        throw null;
    }

    @Override // defpackage.jhb
    public final List b() {
        e();
        jhb jhbVar = this.f;
        if (jhbVar != null) {
            return jhbVar.b();
        }
        Intrinsics.j("expression");
        throw null;
    }

    @Override // defpackage.jhb
    public final List c() {
        jhb jhbVar = this.f;
        if (jhbVar != null) {
            return jhbVar.c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof bms) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((bms) it2.next()).a);
        }
        return arrayList2;
    }

    public final void e() {
        if (this.f == null) {
            ArrayList arrayList = this.e;
            arrayList.getClass();
            String str = this.a;
            str.getClass();
            if (arrayList.isEmpty()) {
                kac.h("Expression expected", null);
                return;
            }
            k7k k7kVar = new k7k(arrayList, str);
            jhb D = u1g.D(k7kVar);
            if (k7kVar.c()) {
                kac.h("Expression expected", null);
            } else {
                this.f = D;
            }
        }
    }

    public final String toString() {
        return this.d;
    }
}
