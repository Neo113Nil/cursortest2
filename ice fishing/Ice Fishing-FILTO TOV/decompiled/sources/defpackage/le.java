package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class le {
    public final Object GWasM1elztuh;

    public le(int i) {
        switch (i) {
            case 1:
                this.GWasM1elztuh = new Object();
                break;
            case 2:
                this.GWasM1elztuh = z50.WRKkgoJXwDn(Boolean.FALSE);
                break;
            default:
                this.GWasM1elztuh = new ArrayList();
                break;
        }
    }

    public void AvO7iQsrTN(int i, Object obj, sx sxVar, Object obj2) {
        if (o30.rQPn8YBR(obj, ue.GWasM1elztuh)) {
            Yi7zF1RB1(i, sxVar, null);
        }
    }

    public abstract void E7jCp8Ls();

    public abstract Object EljAMC1QTz();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean GWasM1elztuh(int i, sx sxVar, Object obj) {
        ArrayList arrayList = sxVar.GWasM1elztuh;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof lx)) {
                    if (!(obj2 instanceof sx)) {
                        o4.EljAMC1QTz(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (GWasM1elztuh(i, (sx) obj2, obj)) {
                        Yi7zF1RB1(0, sxVar, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    Yi7zF1RB1(0, sxVar, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            Yi7zF1RB1(i, sxVar, null);
            return true;
        }
    }

    public abstract void JFJ3QoxA(Object obj);

    public abstract void OOA6hdeuvCS();

    public abstract void X1lG3V04pd(t01 t01Var);

    public void Yi7zF1RB1(int i, sx sxVar, Object obj) {
        ((ArrayList) this.GWasM1elztuh).add(new me(i, null, null));
    }

    public abstract hv encWxUiV2(t01 t01Var);

    public abstract void mOu10nynGul(z9 z9Var);

    public abstract void rQPn8YBR(qa1 qa1Var);

    public abstract void xqGvceK5x();
}
