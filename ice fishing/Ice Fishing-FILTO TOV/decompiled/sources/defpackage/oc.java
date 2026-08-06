package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oc implements gh, Serializable {
    public final eh EljAMC1QTz;
    public final gh OOA6hdeuvCS;

    public oc(eh ehVar, gh ghVar) {
        ghVar.getClass();
        ehVar.getClass();
        this.OOA6hdeuvCS = ghVar;
        this.EljAMC1QTz = ehVar;
    }

    @Override // defpackage.gh
    public final eh E7jCp8Ls(fh fhVar) {
        fhVar.getClass();
        while (true) {
            eh E7jCp8Ls = this.EljAMC1QTz.E7jCp8Ls(fhVar);
            if (E7jCp8Ls != null) {
                return E7jCp8Ls;
            }
            gh ghVar = this.OOA6hdeuvCS;
            if (!(ghVar instanceof oc)) {
                return ghVar.E7jCp8Ls(fhVar);
            }
            this = (oc) ghVar;
        }
    }

    @Override // defpackage.gh
    public final Object WIEu4Ya2g8(lv lvVar, Object obj) {
        return lvVar.EljAMC1QTz(this.OOA6hdeuvCS.WIEu4Ya2g8(lvVar, obj), this.EljAMC1QTz);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof oc) {
            oc ocVar = (oc) obj;
            int i = 2;
            oc ocVar2 = ocVar;
            int i2 = 2;
            while (true) {
                gh ghVar = ocVar2.OOA6hdeuvCS;
                ocVar2 = ghVar instanceof oc ? (oc) ghVar : null;
                if (ocVar2 == null) {
                    break;
                }
                i2++;
            }
            oc ocVar3 = this;
            while (true) {
                gh ghVar2 = ocVar3.OOA6hdeuvCS;
                ocVar3 = ghVar2 instanceof oc ? (oc) ghVar2 : null;
                if (ocVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    eh ehVar = this.EljAMC1QTz;
                    if (!o30.rQPn8YBR(ocVar.E7jCp8Ls(ehVar.getKey()), ehVar)) {
                        z = false;
                        break;
                    }
                    gh ghVar3 = this.OOA6hdeuvCS;
                    if (!(ghVar3 instanceof oc)) {
                        ghVar3.getClass();
                        eh ehVar2 = (eh) ghVar3;
                        z = o30.rQPn8YBR(ocVar.E7jCp8Ls(ehVar2.getKey()), ehVar2);
                        break;
                    }
                    this = (oc) ghVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.EljAMC1QTz.hashCode() + this.OOA6hdeuvCS.hashCode();
    }

    @Override // defpackage.gh
    public final gh jivtDDk9H(fh fhVar) {
        fhVar.getClass();
        eh ehVar = this.EljAMC1QTz;
        eh E7jCp8Ls = ehVar.E7jCp8Ls(fhVar);
        gh ghVar = this.OOA6hdeuvCS;
        if (E7jCp8Ls != null) {
            return ghVar;
        }
        gh jivtDDk9H = ghVar.jivtDDk9H(fhVar);
        return jivtDDk9H == ghVar ? this : jivtDDk9H == vp.OOA6hdeuvCS ? ehVar : new oc(ehVar, jivtDDk9H);
    }

    @Override // defpackage.gh
    public final gh mOu10nynGul(gh ghVar) {
        ghVar.getClass();
        return ghVar == vp.OOA6hdeuvCS ? this : (gh) ghVar.WIEu4Ya2g8(new pd(14), this);
    }

    public final String toString() {
        return "[" + ((String) WIEu4Ya2g8(new pd(4), "")) + ']';
    }
}
