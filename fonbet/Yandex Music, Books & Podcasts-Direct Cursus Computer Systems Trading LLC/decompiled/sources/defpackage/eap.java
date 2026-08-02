package defpackage;

/* loaded from: classes.dex */
public final class eap {
    public final iap a;
    public final iap b;

    public eap(iap iapVar, iap iapVar2) {
        this.a = iapVar;
        this.b = iapVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eap.class == obj.getClass()) {
            eap eapVar = (eap) obj;
            if (this.a.equals(eapVar.a) && this.b.equals(eapVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        iap iapVar = this.a;
        sb.append(iapVar);
        iap iapVar2 = this.b;
        if (iapVar.equals(iapVar2)) {
            str = "";
        } else {
            str = ", " + iapVar2;
        }
        return su4.o(sb, str, "]");
    }
}
