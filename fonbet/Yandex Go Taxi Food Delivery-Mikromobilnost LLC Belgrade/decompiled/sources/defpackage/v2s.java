package defpackage;

/* loaded from: classes10.dex */
public final class v2s implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String w;

    public v2s(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.w = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v2s v2sVar = (v2s) obj;
        int i = this.a - v2sVar.a;
        return i == 0 ? this.b - v2sVar.b : i;
    }
}
