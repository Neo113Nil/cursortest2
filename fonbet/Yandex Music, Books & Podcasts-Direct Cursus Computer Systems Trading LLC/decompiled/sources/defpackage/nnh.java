package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class nnh {
    public final String a;
    public final hnh b;
    public final enh c;
    public final foh d;
    public final zmh e;
    public final inh f;

    static {
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        inh inhVar = inh.a;
        foh fohVar = foh.a;
        yut.d(0);
        yut.d(1);
        yut.d(2);
        yut.d(3);
        yut.d(4);
    }

    public nnh(String str, zmh zmhVar, hnh hnhVar, enh enhVar, foh fohVar, inh inhVar) {
        this.a = str;
        this.b = hnhVar;
        this.c = enhVar;
        this.d = fohVar;
        this.e = zmhVar;
        this.f = inhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnh)) {
            return false;
        }
        nnh nnhVar = (nnh) obj;
        return yut.a(this.a, nnhVar.a) && this.e.equals(nnhVar.e) && yut.a(this.b, nnhVar.b) && this.c.equals(nnhVar.c) && yut.a(this.d, nnhVar.d) && yut.a(this.f, nnhVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hnh hnhVar = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (hnhVar != null ? hnhVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode2;
    }
}
