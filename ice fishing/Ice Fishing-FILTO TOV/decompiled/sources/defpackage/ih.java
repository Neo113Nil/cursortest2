package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ih extends Mjvvu5DE implements eh {
    public static final hh EljAMC1QTz = new hh(b9xEq24R1.arNh8D4Z5gB, new bCsSzSHkbaQ(17));

    public ih() {
        super(b9xEq24R1.arNh8D4Z5gB);
    }

    public ih AvO7iQsrTN(int i) {
        q70.JFJ3QoxA(i);
        return new da0(this, i);
    }

    @Override // defpackage.Mjvvu5DE, defpackage.gh
    public final eh E7jCp8Ls(fh fhVar) {
        eh ehVar;
        fhVar.getClass();
        if (fhVar instanceof hh) {
            hh hhVar = (hh) fhVar;
            fh fhVar2 = this.OOA6hdeuvCS;
            if ((fhVar2 == hhVar || hhVar.EljAMC1QTz == fhVar2) && (ehVar = (eh) hhVar.OOA6hdeuvCS.mOu10nynGul(this)) != null) {
                return ehVar;
            }
        } else if (b9xEq24R1.arNh8D4Z5gB == fhVar) {
            return this;
        }
        return null;
    }

    public boolean EljAMC1QTz(gh ghVar) {
        return !(this instanceof gc1);
    }

    public abstract void OOA6hdeuvCS(gh ghVar, Runnable runnable);

    @Override // defpackage.Mjvvu5DE, defpackage.gh
    public final gh jivtDDk9H(fh fhVar) {
        fhVar.getClass();
        if (fhVar instanceof hh) {
            hh hhVar = (hh) fhVar;
            fh fhVar2 = this.OOA6hdeuvCS;
            if (fhVar2 != hhVar && hhVar.EljAMC1QTz != fhVar2) {
                return this;
            }
            if (((eh) hhVar.OOA6hdeuvCS.mOu10nynGul(this)) == null) {
                return this;
            }
        } else if (b9xEq24R1.arNh8D4Z5gB != fhVar) {
            return this;
        }
        return vp.OOA6hdeuvCS;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + qj.WdrkLMV3xh(this);
    }
}
