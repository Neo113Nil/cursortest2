package defpackage;

/* loaded from: classes.dex */
public final class xa91 extends nb91 {
    public String a;
    public byte b;
    public int c;
    public int d;

    public final bb91 a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new bb91(this.a, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        ny61.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
