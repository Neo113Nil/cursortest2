package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k3e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ k3e(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.j(jfpVar, new my4(this.b, 1, this.c, 1));
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.j(jfpVar2, new my4(this.b, 1, this.c, 1));
                return Unit.a;
            case 2:
                nxk nxkVar = (nxk) obj;
                nxkVar.getClass();
                return Integer.valueOf(Intrinsics.d(nxkVar, fxk.a) ? this.b : this.c);
            default:
                nxk nxkVar2 = (nxk) obj;
                nxkVar2.getClass();
                return Integer.valueOf(Intrinsics.d(nxkVar2, fxk.a) ? this.b : this.c);
        }
    }
}
