package kotlinx.datetime.internal.format;

import defpackage.dai0;
import defpackage.eja1;
import defpackage.je60;
import defpackage.jid;
import defpackage.lbs0;
import defpackage.m9s;
import defpackage.ny61;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.rxq;
import defpackage.scc;
import defpackage.vbs0;
import defpackage.wf90;
import defpackage.xd5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final class e implements je60 {
    public final xd5 a;
    public final Set b;

    public e(xd5 xd5Var) {
        this.a = xd5Var;
        ListBuilder a = rcc.a();
        eja1.e(a, xd5Var);
        ListBuilder j = a.j();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            kotlinx.datetime.format.f d = ((rxq) qqyVar.next()).c().d();
            if (d != null) {
                arrayList.add(d);
            }
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        this.b = N0;
        if (N0.isEmpty()) {
            ny61.g("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // defpackage.s7s
    public final m9s a() {
        this.a.a();
        return new vbs0(new SignedFormatStructure$formatter$1(this));
    }

    @Override // defpackage.s7s
    public final wf90 b() {
        return dai0.e(scc.g(new wf90(Collections.singletonList(new lbs0(new jid(6, this), "sign for " + this.b)), EmptyList.a), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
