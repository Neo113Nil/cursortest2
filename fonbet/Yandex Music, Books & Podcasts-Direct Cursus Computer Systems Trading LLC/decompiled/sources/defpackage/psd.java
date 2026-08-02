package defpackage;

/* loaded from: classes.dex */
public final class psd {
    public static final psd c = new psd("FOLD");
    public static final psd d = new psd("HINGE");
    public final /* synthetic */ int a;
    public String b;

    public psd(String str) {
        this.a = 0;
        this.b = str;
    }

    public void a(String str) {
        this.b = ouj.o(this.b, ".", str);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ psd(int i) {
        this.a = i;
    }
}
