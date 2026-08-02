package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ztf extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o3k s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztf(o3k o3kVar, int i) {
        super(0);
        this.r = i;
        this.s = o3kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int j;
        switch (this.r) {
            case 0:
                return Integer.valueOf(this.s.n());
            case 1:
                return Integer.valueOf(this.s.n());
            case 2:
                o3k o3kVar = this.s;
                return Integer.valueOf(o3kVar.k.b() ? o3kVar.t.h() : o3kVar.j());
            default:
                o3k o3kVar2 = this.s;
                boolean b = o3kVar2.k.b();
                u6k u6kVar = o3kVar2.s;
                if (!b) {
                    j = o3kVar2.j();
                } else if (u6kVar.h() != -1) {
                    j = u6kVar.h();
                } else if (Math.abs(o3kVar2.k()) >= Math.abs(Math.min(o3kVar2.q.n0(r3k.a), o3kVar2.o() / 2.0f) / o3kVar2.o())) {
                    boolean booleanValue = ((Boolean) o3kVar2.H.getValue()).booleanValue();
                    int i = o3kVar2.e;
                    j = booleanValue ? i + 1 : i;
                } else {
                    j = o3kVar2.j();
                }
                return Integer.valueOf(o3kVar2.i(j));
        }
    }
}
