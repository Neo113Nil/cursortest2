package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends M1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W1.g f1614g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, q qVar, int i2, W1.g gVar, int i3, boolean z2) {
        super(str, true);
        this.f1612e = qVar;
        this.f1613f = i2;
        this.f1614g = gVar;
        this.f1615h = i3;
    }

    @Override // M1.a
    public final long a() {
        try {
            C c2 = this.f1612e.f1636k;
            W1.g gVar = this.f1614g;
            int i2 = this.f1615h;
            c2.getClass();
            gVar.o(i2);
            this.f1612e.f1647w.m(this.f1613f, EnumC0079b.CANCEL);
            synchronized (this.f1612e) {
                this.f1612e.f1649y.remove(Integer.valueOf(this.f1613f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
