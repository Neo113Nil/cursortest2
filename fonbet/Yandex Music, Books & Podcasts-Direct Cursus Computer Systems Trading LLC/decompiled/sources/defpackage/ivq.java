package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ivq implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zsq c;

    public /* synthetic */ ivq(nvq nvqVar, zsq zsqVar, boolean z) {
        this.c = zsqVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rmb rmbVar = (rmb) obj;
        switch (this.a) {
            case 0:
                rmbVar.getClass();
                thj B = nvq.B(this.c);
                if (this.b) {
                    rmb.a(rmbVar, sjb.MuteTrailer, B, null, 10);
                }
                break;
            default:
                rmbVar.getClass();
                rmb.a(rmbVar, this.b ? sjb.Unlike : sjb.Like, nvq.B(this.c), null, 10);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ivq(boolean z, nvq nvqVar, zsq zsqVar) {
        this.b = z;
        this.c = zsqVar;
    }
}
