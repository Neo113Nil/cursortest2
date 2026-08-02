package defpackage;

/* loaded from: classes6.dex */
public final class vrb1 extends esb1 {
    public String a;
    public boolean b;
    public int c;
    public byte d;

    public final yrb1 a() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new yrb1(str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" libraryName");
        }
        if ((this.d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        ny61.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
