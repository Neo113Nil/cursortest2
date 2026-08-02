package defpackage;

/* loaded from: classes.dex */
public final class hqh {
    public final Object a;
    public final int b;

    public hqh(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else if (obj instanceof irh) {
            this.b = 2;
        } else {
            e7o.e();
            throw null;
        }
    }
}
