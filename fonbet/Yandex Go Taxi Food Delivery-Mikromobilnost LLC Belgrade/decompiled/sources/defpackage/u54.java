package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class u54 extends c3f.e.AbstractC0027e.a {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final v54 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new v54(str, this.a, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }
}
