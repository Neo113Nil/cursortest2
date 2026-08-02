package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class fqh {
    public final Bundle a;
    public crh b;

    public fqh(crh crhVar, boolean z) {
        if (crhVar == null) {
            xq0.x("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = crhVar;
        bundle.putBundle("selector", crhVar.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            crh b = crh.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = crh.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fqh) {
            fqh fqhVar = (fqh) obj;
            a();
            crh crhVar = this.b;
            fqhVar.a();
            if (crhVar.equals(fqhVar.b) && b() == fqhVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ (b() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        return ouj.r(sb, !r1.b.contains(null), " }");
    }
}
