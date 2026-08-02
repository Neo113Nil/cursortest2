package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public class uwd implements s7s {
    public final List a;

    public uwd(List list) {
        this.a = list;
    }

    @Override // defpackage.s7s
    public m9s a() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((je60) it.next()).a());
        }
        return arrayList.size() == 1 ? (m9s) a.s0(arrayList) : new vwd();
    }

    @Override // defpackage.s7s
    public wf90 b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((je60) it.next()).b());
        }
        return dai0.e(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uwd) {
            return jl40.l(this.a, ((uwd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ConcatenatedFormatStructure("), a.X(this.a, Extension.FIX_SPACE, null, null, null, 62), ')');
    }
}
