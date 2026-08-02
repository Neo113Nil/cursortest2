package defpackage;

/* loaded from: classes3.dex */
public final class tc2 {
    public vc2 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final uc2 a() {
        vc2 vc2Var;
        String str;
        String str2;
        if (this.e == 1 && (vc2Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new uc2(vc2Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }
}
