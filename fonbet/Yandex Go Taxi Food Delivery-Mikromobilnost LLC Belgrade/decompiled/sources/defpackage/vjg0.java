package defpackage;

/* loaded from: classes.dex */
public final class vjg0 {
    public static final vjg0 d = new vjg0(0, 0);
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public vjg0() {
        this.a = 1;
        this.b = Math.min(0, 100);
        this.c = Math.max(0, 100);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(vjg0.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return oyr.m(this.c, "]", sb);
            default:
                return super.toString();
        }
    }

    public vjg0(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }
}
