package defpackage;

/* loaded from: classes4.dex */
public final class wkk {
    public final oec a;

    public wkk(oec oecVar) {
        this.a = oecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkk) && this.a.equals(((wkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + k5r.e(1480610363, 31, false);
    }

    public final String toString() {
        return "PermissionRequest(permissionName=android.permission.CAMERA, withShowDescriptionIfNeeded=false, onResult=" + this.a + ")";
    }
}
