package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends M1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, q qVar, int i2, int i3) {
        super(str, true);
        this.f1607e = qVar;
        this.f1608f = i2;
        this.f1609g = i3;
    }

    @Override // M1.a
    public final long a() {
        int i2 = this.f1608f;
        int i3 = this.f1609g;
        q qVar = this.f1607e;
        qVar.getClass();
        try {
            qVar.f1647w.l(i2, i3, true);
            return -1L;
        } catch (IOException e2) {
            qVar.b(e2);
            return -1L;
        }
    }
}
