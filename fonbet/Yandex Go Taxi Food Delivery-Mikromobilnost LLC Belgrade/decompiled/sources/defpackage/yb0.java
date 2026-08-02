package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class yb0 implements ac0 {
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final Set i;
    public final Set j;

    public yb0(int i, int i2, String str, List list, List list2, List list3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = z;
        this.h = i <= i2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            q5f q5fVar = (q5f) it.next();
            m5f m5fVar = q5fVar instanceof m5f ? (m5f) q5fVar : null;
            String str2 = m5fVar != null ? m5fVar.a : null;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        this.i = a.N0(arrayList);
        List<q5f> list4 = this.d;
        ArrayList arrayList2 = new ArrayList();
        for (q5f q5fVar2 : list4) {
            l5f l5fVar = q5fVar2 instanceof l5f ? (l5f) q5fVar2 : null;
            String id = l5fVar != null ? l5fVar.getId() : null;
            if (id != null) {
                arrayList2.add(id);
            }
        }
        this.j = a.N0(arrayList2);
    }

    @Override // defpackage.ac0
    public final boolean a() {
        return this.g;
    }

    @Override // defpackage.ac0
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.ac0
    public final int c() {
        return this.b;
    }

    @Override // defpackage.ac0
    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        return this.a == yb0Var.a && this.b == yb0Var.b && jl40.l(this.c, yb0Var.c) && jl40.l(this.d, yb0Var.d) && jl40.l(this.e, yb0Var.e) && jl40.l(this.f, yb0Var.f) && this.g == yb0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.c(unr0.c(unr0.c(unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "Content(chatsChosenCount=", ", chatsTotalCount=", ", searchText=");
        tse0.x(this.c, ", chosenItems=", ", allChatFilters=", s, this.d);
        nnm.w(s, this.e, ", allChatItems=", this.f, ", canCloseScreen=");
        return x4e.i(s, this.g, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yb0() {
        this(0, 0, "", r4, r4, r4, false);
        EmptyList emptyList = EmptyList.a;
    }
}
