package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cd1 implements eh {
    public final fj EljAMC1QTz;
    public final cd1 OOA6hdeuvCS;

    public cd1(cd1 cd1Var, fj fjVar) {
        this.OOA6hdeuvCS = cd1Var;
        this.EljAMC1QTz = fjVar;
    }

    @Override // defpackage.gh
    public final /* bridge */ eh E7jCp8Ls(fh fhVar) {
        return n30.arNh8D4Z5gB(this, fhVar);
    }

    @Override // defpackage.gh
    public final Object WIEu4Ya2g8(lv lvVar, Object obj) {
        return lvVar.EljAMC1QTz(obj, this);
    }

    public final void X1lG3V04pd(fj fjVar) {
        if (this.EljAMC1QTz == fjVar) {
            o4.jivtDDk9H("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        cd1 cd1Var = this.OOA6hdeuvCS;
        if (cd1Var != null) {
            cd1Var.X1lG3V04pd(fjVar);
        }
    }

    @Override // defpackage.eh
    public final fh getKey() {
        return k61.mOu10nynGul;
    }

    @Override // defpackage.gh
    public final /* bridge */ gh jivtDDk9H(fh fhVar) {
        return n30.DmJncFq5(this, fhVar);
    }

    @Override // defpackage.gh
    public final /* bridge */ gh mOu10nynGul(gh ghVar) {
        return n30.HFYAaqMd6(this, ghVar);
    }
}
