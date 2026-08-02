package defpackage;

/* loaded from: classes11.dex */
public final class wqc {
    public final Object a;
    public int b = 1;

    public wqc(Object obj) {
        this.a = obj;
    }

    public static boolean a(wqc[] wqcVarArr, String str) {
        for (wqc wqcVar : wqcVarArr) {
            if (wqcVar.a == str) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wqc)) {
            return false;
        }
        wqc wqcVar = (wqc) obj;
        Object obj2 = wqcVar.a;
        Object obj3 = this.a;
        if (obj3.getClass() == obj2.getClass() && this.b == wqcVar.b) {
            return obj3 instanceof StringBuilder ? obj3.toString().equals(obj2.toString()) : obj3 instanceof Number ? obj3.equals(obj2) : obj3 == obj2;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        int i = this.b;
        if (obj == null) {
            return null;
        }
        if (i <= 0) {
            return " ";
        }
        int length = obj.length();
        if (i == 1 || length == 0) {
            return obj;
        }
        if (length == 1 && i <= 8192) {
            return rob1.d(obj.charAt(0), i);
        }
        int i2 = length * i;
        if (length == 1) {
            return rob1.d(obj.charAt(0), i);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i2);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(obj);
            }
            return sb.toString();
        }
        char charAt = obj.charAt(0);
        char charAt2 = obj.charAt(1);
        char[] cArr = new char[i2];
        for (int i4 = (i * 2) - 2; i4 >= 0; i4 -= 2) {
            cArr[i4] = charAt;
            cArr[i4 + 1] = charAt2;
        }
        return new String(cArr);
    }
}
