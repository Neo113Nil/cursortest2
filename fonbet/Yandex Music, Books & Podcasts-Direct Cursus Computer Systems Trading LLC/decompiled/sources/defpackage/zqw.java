package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zqw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ mrw b;

    public /* synthetic */ zqw(mrw mrwVar, int i) {
        this.a = i;
        this.b = mrwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                xqw xqwVar = (xqw) obj;
                this.b.n.l(xqwVar);
                boolean z = xqwVar.a;
                mrw mrwVar = this.b;
                rjq rjqVar = mrwVar.b;
                if (!z) {
                    rjqVar.V();
                } else if (!rjqVar.d.a()) {
                    mrwVar.b.g();
                    mrwVar.b().a("ynison started");
                    ox6.B(new vpw(zsd.b0(new vpw(frc.a.g, 6)), 5), mrwVar.c, new zqw(mrwVar, 1));
                    ox6.B(new vpw(zsd.b0(new vpw(((oq7) mrwVar.e.getValue()).a.c, 8)), 7), mrwVar.c, new zqw(mrwVar, 3));
                    ox6.B(((q8b) mrwVar.f.getValue()).b, mrwVar.a, new zqw(mrwVar, 2));
                }
                return Unit.a;
            case 1:
                ((Boolean) obj).getClass();
                this.b.b().a("app in foreground");
                return Unit.a;
            case 2:
                c3t c3tVar = (c3t) obj;
                if (c3tVar instanceof b3t) {
                    tiw b = this.b.b();
                    String str = ((b3t) c3tVar).a;
                    b.getClass();
                    ssg.a(3, tiw.b, "user interaction occurred: ".concat(str), null);
                    xdr xdrVar = b.a;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                } else if (!Intrinsics.d(c3tVar, a3t.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                ((Boolean) obj).getClass();
                this.b.b().a("queue launched");
                return Unit.a;
        }
    }
}
