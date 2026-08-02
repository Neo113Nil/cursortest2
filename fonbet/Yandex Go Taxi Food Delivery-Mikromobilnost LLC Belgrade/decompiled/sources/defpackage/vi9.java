package defpackage;

/* loaded from: classes9.dex */
public class vi9 {
    public final x43 a = new x43();
    public int b;

    public final void a(char[] cArr) {
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < h63.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public final char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.a.n();
            if (cArr != null) {
                this.b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
