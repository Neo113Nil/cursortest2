package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes4.dex */
public final class jfw extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ qfw n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jfw(int i, qfw qfwVar, Continuation continuation) {
        super(3, continuation);
        this.j = i;
        this.n = qfwVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                jfw jfwVar = new jfw(0, this.n, continuation);
                jfwVar.l = rjcVar;
                jfwVar.m = obj2;
                return jfwVar.invokeSuspend(Unit.a);
            case 1:
                jfw jfwVar2 = new jfw(1, this.n, continuation);
                jfwVar2.l = rjcVar;
                jfwVar2.m = obj2;
                return jfwVar2.invokeSuspend(Unit.a);
            default:
                jfw jfwVar3 = new jfw(2, this.n, continuation);
                jfwVar3.l = rjcVar;
                jfwVar3.m = obj2;
                return jfwVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        fs fsVar;
        switch (this.j) {
            case 0:
                qfw qfwVar = this.n;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    orw orwVar = (orw) this.m;
                    String str = qfw.H;
                    qfwVar.b().getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (!((bsw) ((byb) qdcVar.C(I)).b(bsw.class)).h() || MusicBrowserService.n) {
                        fsVar = new fs(15, orwVar);
                    } else {
                        yhw yhwVar = (yhw) qfwVar.G.getValue();
                        yhwVar.getClass();
                        if (orwVar == null) {
                            fsVar = new fs(15, orwVar);
                        } else {
                            nrw nrwVar = orwVar.b;
                            e0 e0Var = orwVar.a;
                            boolean z = nrwVar == nrw.a;
                            String b = yhwVar.b.b();
                            String p = uwf.p(e0Var);
                            boolean z2 = yhwVar.a.b().c.a;
                            boolean m = e0Var.n().k().m();
                            boolean d = Intrinsics.d(b, p);
                            if (!z || !d || m || z2) {
                                fsVar = new fs(15, orwVar);
                            } else {
                                g3d m30toBuilder = e0Var.m30toBuilder();
                                b5n b5nVar = (b5n) m30toBuilder;
                                g3d m30toBuilder2 = b5nVar.h().m30toBuilder();
                                pnl pnlVar = (pnl) m30toBuilder2;
                                g3d m30toBuilder3 = pnlVar.h().m30toBuilder();
                                ((qrl) m30toBuilder3).i(true);
                                pnlVar.j((c0) m30toBuilder3.b());
                                b5nVar.i((a0) m30toBuilder2.b());
                                orw orwVar2 = new orw((e0) m30toBuilder.b(), nrwVar);
                                yhwVar.c.a.a(new nhw("Server return play state on app start"));
                                fsVar = new fs(15, orwVar2);
                            }
                        }
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, fsVar, this) == nm6Var) {
                        break;
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    orw orwVar3 = (orw) this.m;
                    qfw qfwVar2 = this.n;
                    String str2 = qfw.H;
                    biw biwVar = ((jsw) qfwVar2.s.getValue()).d;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar2);
                    Object emit = rjcVar2.emit(orwVar3, this);
                    if (emit != nm6Var2) {
                        emit = Unit.a;
                    }
                    if (emit != nm6Var2) {
                        emit = Unit.a;
                    }
                    if (emit == nm6Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = this.l;
                    sqw sqwVar = (sqw) this.m;
                    qfw qfwVar3 = this.n;
                    String str3 = qfw.H;
                    pjc b2 = ((ykw) qfwVar3.B.getValue()).b(sqwVar);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar3, b2, this) == nm6Var3) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
