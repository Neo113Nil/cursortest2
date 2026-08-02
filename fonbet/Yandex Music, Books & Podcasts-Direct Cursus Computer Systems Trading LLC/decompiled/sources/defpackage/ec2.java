package defpackage;

/* loaded from: classes3.dex */
public final class ec2 {
    public long a;
    public String b;
    public eq6 c;
    public fq6 d;
    public gq6 e;
    public jq6 f;
    public byte g;

    public final fc2 a() {
        String str;
        eq6 eq6Var;
        fq6 fq6Var;
        if (this.g == 1 && (str = this.b) != null && (eq6Var = this.c) != null && (fq6Var = this.d) != null) {
            return new fc2(this.a, str, eq6Var, fq6Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }
}
