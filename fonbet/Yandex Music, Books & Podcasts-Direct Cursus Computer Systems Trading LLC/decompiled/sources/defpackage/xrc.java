package defpackage;

/* loaded from: classes.dex */
public final class xrc implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public xrc(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xrc xrcVar = (xrc) obj;
        xrcVar.getClass();
        int i = this.a - xrcVar.a;
        return i == 0 ? this.b - xrcVar.b : i;
    }
}
