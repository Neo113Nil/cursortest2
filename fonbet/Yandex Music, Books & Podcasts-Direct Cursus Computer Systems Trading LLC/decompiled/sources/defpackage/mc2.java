package defpackage;

/* loaded from: classes3.dex */
public final class mc2 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final nc2 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new nc2(this.e, this.a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }
}
