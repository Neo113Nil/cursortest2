package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends M1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i2, long j2) {
        super(str, true);
        this.f1622e = qVar;
        this.f1623f = i2;
        this.f1624g = j2;
    }

    @Override // M1.a
    public final long a() {
        q qVar = this.f1622e;
        try {
            qVar.f1647w.n(this.f1623f, this.f1624g);
            return -1L;
        } catch (IOException e2) {
            qVar.b(e2);
            return -1L;
        }
    }
}
