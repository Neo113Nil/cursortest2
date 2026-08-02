package defpackage;

/* loaded from: classes3.dex */
public final class wsn extends hee {
    public static final Object[] i;
    public static final wsn j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new wsn(0, 0, 0, objArr, objArr);
    }

    public wsn(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int J = ltg.J(obj);
                while (true) {
                    int i2 = J & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    J = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qde
    public final int g(int i2, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // defpackage.hee, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.qde
    public final Object[] n() {
        return this.d;
    }

    @Override // defpackage.qde
    public final int o() {
        return this.h;
    }

    @Override // defpackage.qde
    public final int q() {
        return 0;
    }

    @Override // defpackage.qde
    public final boolean r() {
        return false;
    }

    @Override // defpackage.qde
    public final xkt s() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // defpackage.hee
    public final yde w() {
        return yde.t(this.h, this.d);
    }

    @Override // defpackage.hee, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
