package defpackage;

/* loaded from: classes.dex */
public class dhm implements chm {
    public final Object[] a;
    public int b;

    public dhm(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            xq0.x("The max pool size must be > 0");
            throw null;
        }
    }

    public void a(bz0 bz0Var) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = bz0Var;
            this.b = i + 1;
        }
    }

    @Override // defpackage.chm
    public boolean c(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                xq0.q("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.chm
    public Object f() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public dhm() {
        this.a = new Object[256];
    }
}
