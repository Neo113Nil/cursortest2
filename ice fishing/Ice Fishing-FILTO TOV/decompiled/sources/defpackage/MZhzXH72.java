package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class MZhzXH72 extends n30 {
    @Override // defpackage.n30
    public final void TpUsjqg3bxO(DmJncFq5 dmJncFq5, Thread thread) {
        dmJncFq5.GWasM1elztuh = thread;
    }

    @Override // defpackage.n30
    public final boolean XnEVoBF0td1l(HFYAaqMd6 hFYAaqMd6, eUH21U3apd euh21u3apd) {
        eUH21U3apd euh21u3apd2 = eUH21U3apd.Yi7zF1RB1;
        synchronized (hFYAaqMd6) {
            try {
                if (hFYAaqMd6.EljAMC1QTz != euh21u3apd) {
                    return false;
                }
                hFYAaqMd6.EljAMC1QTz = euh21u3apd2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n30
    public final boolean iwATDS1i01k(HFYAaqMd6 hFYAaqMd6, DmJncFq5 dmJncFq5, DmJncFq5 dmJncFq52) {
        synchronized (hFYAaqMd6) {
            try {
                if (hFYAaqMd6.AvO7iQsrTN != dmJncFq5) {
                    return false;
                }
                hFYAaqMd6.AvO7iQsrTN = dmJncFq52;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n30
    public final void rezfBrjOrqK(DmJncFq5 dmJncFq5, DmJncFq5 dmJncFq52) {
        dmJncFq5.Yi7zF1RB1 = dmJncFq52;
    }

    @Override // defpackage.n30
    public final boolean uFEq9NpZ(HFYAaqMd6 hFYAaqMd6, Object obj, Object obj2) {
        synchronized (hFYAaqMd6) {
            try {
                if (hFYAaqMd6.OOA6hdeuvCS != obj) {
                    return false;
                }
                hFYAaqMd6.OOA6hdeuvCS = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
