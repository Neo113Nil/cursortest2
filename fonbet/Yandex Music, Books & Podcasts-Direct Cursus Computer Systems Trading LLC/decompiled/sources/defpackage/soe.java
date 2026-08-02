package defpackage;

/* loaded from: classes3.dex */
public final class soe implements o3c, xqf {
    public final Object a;

    public soe(Object obj) {
        this.a = obj;
    }

    public static soe a(Object obj) {
        if (obj != null) {
            return new soe(obj);
        }
        jj4.j("instance cannot be null");
        return null;
    }

    @Override // defpackage.szm
    public final Object get() {
        return this.a;
    }
}
