package defpackage;

/* loaded from: classes3.dex */
public final class oc2 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final pc2 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new pc2(str, this.d, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }
}
