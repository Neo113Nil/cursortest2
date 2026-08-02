package defpackage;

/* loaded from: classes10.dex */
public final class xi11 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public xi11(int i, int i2, int i3, int i4) {
        switch (i4) {
            case 1:
                this.a = i != Integer.MIN_VALUE ? b64.e(i, "/") : "";
                this.b = i2;
                this.c = i3;
                this.d = Integer.MIN_VALUE;
                this.e = "";
                break;
            default:
                this.a = i != Integer.MIN_VALUE ? b64.e(i, "/") : "";
                this.b = i2;
                this.c = i3;
                this.d = Integer.MIN_VALUE;
                this.e = "";
                break;
        }
    }

    public void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        ny61.r("generateNewId() must be called before retrieving ids.");
    }

    public void c() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public void d() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        ny61.r("generateNewId() must be called before retrieving ids.");
    }

    public xi11(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2, 0);
    }
}
