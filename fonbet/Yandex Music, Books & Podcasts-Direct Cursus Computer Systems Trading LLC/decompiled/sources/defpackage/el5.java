package defpackage;

/* loaded from: classes3.dex */
public final class el5 extends AssertionError {
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;

    public el5(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.a;
        String str2 = this.b;
        c1 c1Var = new c1(str, str2);
        String message = super.getMessage();
        if (str == null || str2 == null || str.equals(str2)) {
            return ghh.t(str, str2, message);
        }
        c1Var.b = 0;
        int min = Math.min(str.length(), str2.length());
        while (true) {
            int i = c1Var.b;
            if (i >= min || str.charAt(i) != str2.charAt(c1Var.b)) {
                break;
            }
            c1Var.b++;
        }
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (true) {
            int i2 = c1Var.b;
            if (length2 < i2 || length < i2 || str.charAt(length) != str2.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        c1Var.c = str.length() - length;
        return ghh.t(c1Var.a(str), c1Var.a(str2), message);
    }
}
