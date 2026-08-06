package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xb implements v01 {
    public final /* synthetic */ int GWasM1elztuh;
    public final /* synthetic */ Object Yi7zF1RB1;

    public /* synthetic */ xb(int i, Object obj) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = obj;
    }

    @Override // defpackage.v01
    public final Iterator iterator() {
        switch (this.GWasM1elztuh) {
            case 0:
                return ((Iterable) this.Yi7zF1RB1).iterator();
            default:
                return (Iterator) this.Yi7zF1RB1;
        }
    }
}
