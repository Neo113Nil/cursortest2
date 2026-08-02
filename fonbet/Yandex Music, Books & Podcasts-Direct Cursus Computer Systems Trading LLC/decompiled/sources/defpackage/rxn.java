package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class rxn extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ayn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxn(ayn aynVar, int i) {
        super(0);
        this.r = i;
        this.s = aynVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        long g;
        float f2;
        long j;
        switch (this.r) {
            case 0:
                return Boolean.valueOf(this.s.k.getValue() != null);
            case 1:
                return this.s.a.s();
            case 2:
                ayn aynVar = this.s;
                zxn d = aynVar.d();
                if (d != null) {
                    bvf bvfVar = (bvf) aynVar.a.s().b;
                    int ordinal = bvfVar.p.ordinal();
                    if (ordinal == 0) {
                        g = bvfVar.g() & 4294967295L;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        g = bvfVar.g() >> 32;
                    }
                    long a = d.a();
                    f = (((int) g) - o8g.u(swf.i((int) (a >> 32), (int) (a & 4294967295L)), aynVar.f())) - 1.0f;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 3:
                ayn aynVar2 = this.s;
                zxn d2 = aynVar2.d();
                if (d2 != null) {
                    long a2 = d2.a();
                    float u = o8g.u(swf.i((int) (a2 >> 32), (int) (a2 & 4294967295L)), aynVar2.f());
                    long b = d2.b();
                    int ordinal2 = aynVar2.f().ordinal();
                    if (ordinal2 == 0) {
                        j = b & 4294967295L;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        j = b >> 32;
                    }
                    f2 = (u + ((int) j)) - 1.0f;
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(f2);
            default:
                return this.s.f();
        }
    }
}
