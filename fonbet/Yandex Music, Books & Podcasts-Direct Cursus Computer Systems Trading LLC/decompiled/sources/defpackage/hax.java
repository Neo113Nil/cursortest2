package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class hax implements a8o {
    public final bax a;

    public hax(bax baxVar) {
        this.a = baxVar;
    }

    @Override // defpackage.a8o
    public final Status getStatus() {
        return Status.e;
    }

    public final String toString() {
        bax baxVar = this.a;
        y1g.G(baxVar);
        return vz1.q("OptInOptionsResultImpl[", "]", baxVar.a == 1);
    }
}
