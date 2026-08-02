package defpackage;

/* loaded from: classes14.dex */
public abstract class row {
    public final String a;
    public final long b;
    public final String c;
    public final gau d;

    public row(String str, String str2, long j) {
        this.a = str2;
        this.b = j;
        this.c = "Perf.Intercity.".concat(str);
        this.d = new gau(27, this);
    }

    public /* synthetic */ row(String str) {
        this(str, "IntercityMain", 10000L);
    }
}
