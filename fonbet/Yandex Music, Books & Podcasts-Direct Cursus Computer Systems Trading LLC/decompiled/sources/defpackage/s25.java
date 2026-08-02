package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class s25 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3k b;

    public /* synthetic */ s25(o3k o3kVar, int i) {
        this.a = i;
        this.b = o3kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int j;
        switch (this.a) {
            case 0:
                j = this.b.j();
                break;
            case 1:
                j = this.b.j();
                break;
            case 2:
                j = this.b.j();
                break;
            default:
                o3k o3kVar = this.b;
                o3kVar.getClass();
                return Boolean.valueOf(o3kVar.j() == o3kVar.n() - 1);
        }
        return Integer.valueOf(j);
    }
}
