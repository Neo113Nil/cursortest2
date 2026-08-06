package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends M1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EnumC0079b f1621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i2, EnumC0079b enumC0079b) {
        super(str, true);
        this.f1619e = qVar;
        this.f1620f = i2;
        this.f1621g = enumC0079b;
    }

    @Override // M1.a
    public final long a() {
        q qVar = this.f1619e;
        try {
            qVar.f1647w.m(this.f1620f, this.f1621g);
            return -1L;
        } catch (IOException e2) {
            qVar.b(e2);
            return -1L;
        }
    }
}
