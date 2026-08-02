package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class mm0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public mm0(Function0 function0, long j) {
        this.a = 1;
        this.c = function0;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new d85(d85.b(this.b, ((Number) ((sdr) this.c).getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14));
            case 1:
                Function0 function0 = (Function0) this.c;
                return new d85(function0 != null ? ((d85) function0.invoke()).a : this.b);
            case 2:
                return new d85(c3x.D(this.b, ((gvd) this.c).a()));
            case 3:
                return new d85(d85.b(this.b, ((cjc) this.c).e() * d85.d(this.b), 0.0f, 0.0f, 0.0f, 14));
            default:
                long j = this.b;
                return new d85(d85.b(j, ((Number) ((vm0) this.c).b.getValue()).floatValue() * d85.d(j), 0.0f, 0.0f, 0.0f, 14));
        }
    }

    public /* synthetic */ mm0(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }
}
