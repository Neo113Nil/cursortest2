package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class kvq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsq b;

    public /* synthetic */ kvq(nvq nvqVar, zsq zsqVar, int i) {
        this.a = i;
        this.b = zsqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rmb rmbVar = (rmb) obj;
        switch (this.a) {
            case 0:
                rmbVar.getClass();
                rmb.a(rmbVar, sjb.SaveSlide, nvq.B(this.b), null, 10);
                break;
            default:
                rmbVar.getClass();
                rmb.a(rmbVar, sjb.SelectSlideItem, nvq.B(this.b), null, 10);
                break;
        }
        return Unit.a;
    }
}
