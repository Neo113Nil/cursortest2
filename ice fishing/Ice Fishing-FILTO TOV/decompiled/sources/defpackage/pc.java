package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pc implements ie0 {
    public final ie0 GWasM1elztuh;
    public final ie0 Yi7zF1RB1;

    public pc(ie0 ie0Var, ie0 ie0Var2) {
        this.GWasM1elztuh = ie0Var;
        this.Yi7zF1RB1 = ie0Var2;
    }

    @Override // defpackage.ie0
    public final Object GWasM1elztuh(lv lvVar, Object obj) {
        return this.Yi7zF1RB1.GWasM1elztuh(lvVar, this.GWasM1elztuh.GWasM1elztuh(lvVar, obj));
    }

    @Override // defpackage.ie0
    public final boolean Yi7zF1RB1(hv hvVar) {
        return this.GWasM1elztuh.Yi7zF1RB1(hvVar) && this.Yi7zF1RB1.Yi7zF1RB1(hvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        return this.GWasM1elztuh.equals(pcVar.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, pcVar.Yi7zF1RB1);
    }

    public final int hashCode() {
        return (this.Yi7zF1RB1.hashCode() * 31) + this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "[" + ((String) GWasM1elztuh(r2.encWxUiV2, "")) + ']';
    }
}
