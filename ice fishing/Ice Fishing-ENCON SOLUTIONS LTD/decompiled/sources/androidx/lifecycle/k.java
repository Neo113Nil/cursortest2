package androidx.lifecycle;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public e f2472a;

    /* renamed from: b, reason: collision with root package name */
    public i f2473b;

    public final void a(j jVar, d dVar) {
        e a2 = dVar.a();
        e state1 = this.f2472a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a2.compareTo(state1) < 0) {
            state1 = a2;
        }
        this.f2472a = state1;
        this.f2473b.a(jVar, dVar);
        this.f2472a = a2;
    }
}
