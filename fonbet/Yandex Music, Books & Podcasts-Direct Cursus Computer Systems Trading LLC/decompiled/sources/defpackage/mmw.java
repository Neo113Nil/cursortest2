package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class mmw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ nmw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmw(nmw nmwVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = nmwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mmw(this.k, continuation, 0);
            case 1:
                return new mmw(this.k, continuation, 1);
            case 2:
                return new mmw(this.k, continuation, 2);
            case 3:
                return new mmw(this.k, continuation, 3);
            case 4:
                return new mmw(this.k, continuation, 4);
            case 5:
                return new mmw(this.k, continuation, 5);
            case 6:
                return new mmw(this.k, continuation, 6);
            case 7:
                return new mmw(this.k, continuation, 7);
            case 8:
                return new mmw(this.k, continuation, 8);
            case 9:
                return new mmw(this.k, continuation, 9);
            default:
                return new mmw(this.k, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 2:
                ((mmw) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((mmw) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        nmw nmwVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                nmwVar.y().getClass();
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    nmwVar.y().getClass();
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    epw y = nmwVar.y();
                    y.getClass();
                    ssg.a(4, "YnisonRemotePlayer", "pause", null);
                    xdr xdrVar = y.j;
                    Boolean bool = Boolean.FALSE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    y.e(new vow(y, 0));
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    epw y2 = nmwVar.y();
                    y2.getClass();
                    ssg.a(4, "YnisonRemotePlayer", "play", null);
                    xdr xdrVar2 = y2.j;
                    Boolean bool2 = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool2);
                    y2.e(new vow(y2, 2));
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                jyr jyrVar = nmwVar.c;
                if (((qfw) jyrVar.getValue()).d() == gfw.b) {
                    sqw sqwVar = (sqw) ((qfw) jyrVar.getValue()).F.getValue();
                    pqw t = sqwVar != null ? s7g.t(sqwVar) : null;
                    if (t != null) {
                        epw y3 = nmwVar.y();
                        y3.getClass();
                        ssg.a(4, "YnisonRemotePlayer", "refresh", null);
                        rmw b = y3.b();
                        qmw qmwVar = qmw.f;
                        zzp a = y3.a();
                        a.getClass();
                        fpw c = t.c(a);
                        b.a(new qmw(c.b, c.c, c.d));
                        v3w.n(t.a.a, y3.j, null);
                        y3.k.l(t.b.b());
                    }
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    nmwVar.y().d(0L);
                }
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    epw y4 = nmwVar.y();
                    y4.getClass();
                    ssg.a(4, "YnisonRemotePlayer", "stop", null);
                    y4.k.l(null);
                    epw.c(y4, null, false, 7);
                }
                break;
            default:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    nmwVar.y().getClass();
                }
                break;
        }
        return Unit.a;
    }
}
