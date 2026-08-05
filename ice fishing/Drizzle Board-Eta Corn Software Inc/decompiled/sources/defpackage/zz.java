package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class zz {
    public int NCTxEWno;
    public final Object[] qoPGr6Ce;

    public zz(int i) {
        if (i > 0) {
            this.qoPGr6Ce = new Object[i];
        } else {
            m1.sjUBp5pO("The max pool size must be > 0");
            throw null;
        }
    }

    public boolean MdtA4re8(Object obj) {
        int i = this.NCTxEWno;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.qoPGr6Ce;
            if (i2 >= i) {
                int i3 = this.NCTxEWno;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.NCTxEWno = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                m1.Ey6iv0m0("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public void NCTxEWno(Object obj) {
        int i = this.NCTxEWno;
        Object[] objArr = this.qoPGr6Ce;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.NCTxEWno = i + 1;
        }
    }

    public Object qoPGr6Ce() {
        int i = this.NCTxEWno;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.qoPGr6Ce;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.NCTxEWno--;
        return obj;
    }

    public zz() {
        this.qoPGr6Ce = new Object[256];
    }
}
