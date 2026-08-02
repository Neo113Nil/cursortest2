package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class t2f implements Runnable {
    public final /* synthetic */ v2f a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ t2f(v2f v2fVar, long j, String str) {
        this.a = v2fVar;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v2f v2fVar = this.a;
        v2fVar.p.b.a(new kx6(v2fVar, this.b, this.c));
    }
}
