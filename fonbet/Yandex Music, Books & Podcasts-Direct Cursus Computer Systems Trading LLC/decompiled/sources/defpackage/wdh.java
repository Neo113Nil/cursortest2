package defpackage;

/* loaded from: classes3.dex */
public final class wdh {
    public boolean a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdh)) {
            return false;
        }
        wdh wdhVar = (wdh) obj;
        return this.a == wdhVar.a && this.b == wdhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("TransactionStatus(markedSuccessful=", this.a, ", hasChildFailed=", this.b, ")");
    }
}
