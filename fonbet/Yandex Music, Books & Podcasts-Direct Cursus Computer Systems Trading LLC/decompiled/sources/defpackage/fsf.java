package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fsf extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ utf s;
    public final /* synthetic */ long t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsf(utf utfVar, long j, int i, int i2, int i3) {
        super(3);
        this.r = i3;
        this.s = utfVar;
        this.t = j;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                int i = intValue + this.u;
                long j = this.t;
                int g = ia6.g(i, j);
                int f = ia6.f(intValue2 + this.v, j);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return this.s.b.w0(g, f, e5bVar, (Function1) obj3);
            case 1:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                int i2 = intValue3 + this.u;
                long j2 = this.t;
                int g2 = ia6.g(i2, j2);
                int f2 = ia6.f(intValue4 + this.v, j2);
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                return this.s.b.w0(g2, f2, e5bVar2, (Function1) obj3);
            default:
                int intValue5 = ((Number) obj).intValue();
                int intValue6 = ((Number) obj2).intValue();
                int i3 = intValue5 + this.u;
                long j3 = this.t;
                int g3 = ia6.g(i3, j3);
                int f3 = ia6.f(intValue6 + this.v, j3);
                e5b e5bVar3 = e5b.a;
                e5bVar3.getClass();
                return this.s.b.w0(g3, f3, e5bVar3, (Function1) obj3);
        }
    }
}
