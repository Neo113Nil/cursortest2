package kotlinx.datetime.internal.format;

import defpackage.dai0;
import defpackage.eja1;
import defpackage.fie0;
import defpackage.i4e;
import defpackage.je60;
import defpackage.k7;
import defpackage.m9s;
import defpackage.ntf0;
import defpackage.nvc;
import defpackage.ox11;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.rxq;
import defpackage.scc;
import defpackage.tcc;
import defpackage.u6e;
import defpackage.ui11;
import defpackage.uwd;
import defpackage.vwd;
import defpackage.weu;
import defpackage.wf90;
import defpackage.yci0;
import defpackage.zf70;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class c implements je60 {
    public final String a;
    public final uwd b;
    public final ArrayList c;

    public c(String str, uwd uwdVar) {
        this.a = str;
        this.b = uwdVar;
        ListBuilder a = rcc.a();
        eja1.e(a, uwdVar);
        ListBuilder j = a.j();
        ArrayList arrayList = new ArrayList(tcc.n(j, 10));
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((rxq) qqyVar.next()).c());
            }
        }
        List<k7> I = kotlin.collections.a.I(arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(I, 10));
        for (k7 k7Var : I) {
            Object b = k7Var.b();
            if (b == null) {
                yci0.x("The field '", k7Var.c(), "' does not define a default value");
                throw null;
            }
            arrayList2.add(new zf70(k7Var.a(), b));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.s7s
    public final m9s a() {
        fie0 i4eVar;
        m9s a = this.b.a();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zf70 zf70Var = (zf70) it.next();
            arrayList2.add(new nvc(zf70Var.b, new OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(1, zf70Var.a, ntf0.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
        }
        boolean isEmpty = arrayList2.isEmpty();
        fie0 fie0Var = ui11.a;
        if (isEmpty) {
            i4eVar = fie0Var;
        } else {
            i4eVar = arrayList2.size() == 1 ? (fie0) kotlin.collections.a.s0(arrayList2) : new i4e(arrayList2);
        }
        if (i4eVar instanceof ui11) {
            return new vwd();
        }
        scc.g(new Pair(new OptionalFormatStructure$formatter$1(1, i4eVar, fie0.class, "test", "test(Ljava/lang/Object;)Z", 0), new vwd()), new Pair(new OptionalFormatStructure$formatter$2(1, fie0Var, ui11.class, "test", "test(Ljava/lang/Object;)Z", 0), a));
        return new vwd();
    }

    @Override // defpackage.s7s
    public final wf90 b() {
        wf90 b = this.b.b();
        wf90 b2 = new u6e(this.a).b();
        boolean isEmpty = this.c.isEmpty();
        EmptyList emptyList = EmptyList.a;
        return new wf90(emptyList, scc.g(b, dai0.e(scc.g(b2, new wf90(isEmpty ? emptyList : Collections.singletonList(new ox11(new weu(17, this))), emptyList)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + Extension.FIX_SPACE + this.b + ')';
    }
}
