package defpackage;

/* loaded from: classes.dex */
public final class kyg implements oyg {
    public final String a;

    public /* synthetic */ kyg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyg) {
            return this.a.equals(((kyg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Asset(assetName=", this.a, ")");
    }
}
