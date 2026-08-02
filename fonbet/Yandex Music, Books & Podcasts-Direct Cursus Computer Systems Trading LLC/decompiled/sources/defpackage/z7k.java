package defpackage;

/* loaded from: classes3.dex */
public final class z7k extends RuntimeException {
    public final b8k a;
    public final q6k b;
    public final String c;

    public /* synthetic */ z7k(b8k b8kVar, String str, Throwable th, q6k q6kVar, String str2, int i) {
        this(b8kVar, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : q6kVar, (i & 16) != 0 ? null : str2);
    }

    public z7k(b8k b8kVar, String str, Throwable th, q6k q6kVar, String str2) {
        super(str, th);
        this.a = b8kVar;
        this.b = q6kVar;
        this.c = str2;
    }
}
