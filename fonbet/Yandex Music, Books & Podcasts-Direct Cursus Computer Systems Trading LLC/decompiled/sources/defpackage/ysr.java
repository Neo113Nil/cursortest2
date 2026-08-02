package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ysr {
    public static final Pattern h = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    public final String a;
    public boolean b;
    public String[] c;
    public String d;
    public Object[] e;
    public String f;
    public String g;

    public ysr(String str) {
        this.a = str;
    }

    public final atn a() {
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.b) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.c;
        if (strArr == null || strArr.length == 0) {
            sb.append("* ");
        } else {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
            sb.append(' ');
        }
        sb.append("FROM ");
        sb.append(this.a);
        String str2 = this.d;
        if (str2 != null && str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String str3 = this.f;
        if (str3 != null && str3.length() != 0) {
            sb.append(" ORDER BY ");
            sb.append(str3);
        }
        String str4 = this.g;
        if (str4 != null && str4.length() != 0) {
            sb.append(" LIMIT ");
            sb.append(str4);
        }
        return new atn(sb.toString(), this.e);
    }

    public final void b(String str) {
        str.getClass();
        boolean matches = h.matcher(str).matches();
        if (str.length() == 0 || matches) {
            this.g = str;
        } else {
            xq0.o("invalid LIMIT clauses:".concat(str));
        }
    }
}
