package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yf extends n8 {
    public final l8 jivtDDk9H;

    public yf(int i, l8 l8Var) {
        super(i);
        this.jivtDDk9H = l8Var;
        if (l8Var == l8.OOA6hdeuvCS) {
            o4.iwATDS1i01k("This implementation does not support suspension for senders, use ", st0.GWasM1elztuh(n8.class).Yi7zF1RB1(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        o4.OOA6hdeuvCS(mr0.encWxUiV2("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    @Override // defpackage.n8, defpackage.t01
    public final Object X1lG3V04pd(vg vgVar, Object obj) {
        if (rezfBrjOrqK(obj, true) instanceof ia) {
            throw Mjvvu5DE();
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.n8
    public final boolean arNh8D4Z5gB() {
        return this.jivtDDk9H == l8.EljAMC1QTz;
    }

    @Override // defpackage.n8, defpackage.t01
    public final Object mE4lRynR(Object obj) {
        return rezfBrjOrqK(obj, false);
    }

    public final Object rezfBrjOrqK(Object obj, boolean z) {
        if (this.jivtDDk9H != l8.AvO7iQsrTN) {
            return A1EKNP6CxJ(obj);
        }
        Object mE4lRynR = super.mE4lRynR(obj);
        return (!(mE4lRynR instanceof ja) || (mE4lRynR instanceof ia)) ? mE4lRynR : kc1.GWasM1elztuh;
    }
}
