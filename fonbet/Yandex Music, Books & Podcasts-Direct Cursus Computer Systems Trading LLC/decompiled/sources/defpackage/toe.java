package defpackage;

/* loaded from: classes5.dex */
public final class toe implements rzm, zqf {
    public static final toe b = new toe(null);
    public final Object a;

    public toe(Object obj) {
        this.a = obj;
    }

    public static toe a(Object obj) {
        a4g.r(obj, "instance cannot be null");
        return new toe(obj);
    }

    public static toe b(Object obj) {
        return obj == null ? b : new toe(obj);
    }

    @Override // defpackage.szm
    public final Object get() {
        return this.a;
    }
}
