package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class jvq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsq b;
    public final /* synthetic */ String c;

    public /* synthetic */ jvq(nvq nvqVar, zsq zsqVar, String str, int i) {
        this.a = i;
        this.b = zsqVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rmb rmbVar = (rmb) obj;
        switch (this.a) {
            case 0:
                rmbVar.getClass();
                rmbVar.m(null, nvq.B(this.b), this.c);
                break;
            case 1:
                rmbVar.getClass();
                rmb.k(rmbVar, this.c, nvq.B(this.b), null, 4);
                break;
            default:
                rmbVar.getClass();
                rmb.k(rmbVar, this.c, nvq.B(this.b), null, 4);
                break;
        }
        return Unit.a;
    }
}
