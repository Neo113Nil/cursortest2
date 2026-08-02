package defpackage;

/* loaded from: classes4.dex */
public final class sra0 {
    public final String a;
    public final String b;

    public sra0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sra0) {
            sra0 sra0Var = (sra0) obj;
            if (sra0Var != this) {
                Object obj2 = sra0Var.a;
                String str = this.a;
                if (str == obj2 ? true : str.equals(obj2)) {
                    Object obj3 = sra0Var.b;
                    String str2 = this.b;
                    if (str2 == obj3 ? true : (str2 == null || obj3 == null) ? false : str2.equals(obj3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        return ((str == null ? 1 : str.hashCode()) * 31) + hashCode;
    }
}
