package defpackage;

/* loaded from: classes3.dex */
public final class zes {
    public final oht a;
    public final boolean b;

    public zes(oht ohtVar, boolean z) {
        this.a = ohtVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zes)) {
            return false;
        }
        zes zesVar = (zes) obj;
        return this.a == zesVar.a && this.b == zesVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ThemeItem(uiTheme=" + this.a + ", isSelected=" + this.b + ")";
    }
}
