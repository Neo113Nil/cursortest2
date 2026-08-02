package defpackage;

/* loaded from: classes3.dex */
public final class psn extends nde {
    public static final psn i = new psn();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;
    public final transient psn h;

    public psn(int i2, Object[] objArr) {
        this.e = objArr;
        this.g = i2;
        this.f = 0;
        int t = i2 >= 2 ? hee.t(i2) : 0;
        Object h = vsn.h(objArr, i2, t, 0);
        if (h instanceof Object[]) {
            throw ((aee) ((Object[]) h)[2]).a();
        }
        this.d = h;
        Object h2 = vsn.h(objArr, i2, t, 1);
        if (h2 instanceof Object[]) {
            throw ((aee) ((Object[]) h2)[2]).a();
        }
        this.h = new psn(h2, objArr, i2, this);
    }

    @Override // defpackage.cee
    public final ssn b() {
        return new ssn(this, this.e, this.f, this.g);
    }

    @Override // defpackage.cee
    public final tsn c() {
        return new tsn(this, new usn(this.f, this.g, this.e));
    }

    @Override // defpackage.cee, java.util.Map
    public final Object get(Object obj) {
        Object i2 = vsn.i(this.d, this.e, this.g, this.f, obj);
        if (i2 == null) {
            return null;
        }
        return i2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.nde, defpackage.cee
    public Object writeReplace() {
        return super.writeReplace();
    }

    public psn() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.g = 0;
        this.h = this;
    }

    public psn(Object obj, Object[] objArr, int i2, psn psnVar) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.g = i2;
        this.h = psnVar;
    }
}
