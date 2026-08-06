package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s0 implements dq0 {
    public final int OOA6hdeuvCS;

    public s0(int i) {
        this.OOA6hdeuvCS = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && this.OOA6hdeuvCS == ((s0) obj).OOA6hdeuvCS;
    }

    public final int hashCode() {
        return Integer.hashCode(this.OOA6hdeuvCS);
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.OOA6hdeuvCS + ')';
    }
}
