package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class bwj extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ cwj l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bwj(cwj cwjVar, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = cwjVar;
        this.m = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new bwj(this.l, this.m, continuation, 0);
            default:
                return new bwj(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((bwj) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Set entrySet;
        Map.Entry entry;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    cwj cwjVar = this.l;
                    Object value = cwjVar.y.getValue();
                    tkj tkjVar = value instanceof tkj ? (tkj) value : null;
                    if (tkjVar != null && (entrySet = tkjVar.a.b.entrySet()) != null && (entry = (Map.Entry) CollectionsKt.R(entrySet)) != null) {
                        bve bveVar = (bve) entry.getValue();
                        this.k = 1;
                        if (cwj.a(cwjVar, bveVar, this.m, this) == nm6Var) {
                        }
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                cwj cwjVar2 = this.l;
                j0q j0qVar = cwjVar2.A;
                gvj gvjVar = cwjVar2.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                Continuation continuation = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    wrt wrtVar = cwjVar2.t;
                    this.k = 1;
                    wrtVar.getClass();
                    obj = x97.V(dm6.b, new zts(wrtVar, continuation, 8), this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2 && i2 != 3 && i2 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                bot botVar = (bot) obj;
                boolean z = botVar instanceof znt;
                boolean z2 = this.m;
                if (!z) {
                    if (!(botVar instanceof xnt)) {
                        b6e.s();
                        break;
                    } else {
                        ssg.a(6, null, "Error update user center", ((xnt) botVar).a);
                        if (z2) {
                            ((zhk) gvjVar.c.getValue()).c();
                            this.k = 4;
                            if (j0qVar.emit(puo.a, this) == nm6Var2) {
                            }
                        } else {
                            rar rarVar = cwjVar2.C;
                            if (rarVar != null) {
                                rarVar.g(null);
                            }
                            cwjVar2.C = x97.y(ot0.F(cwjVar2), null, null, new h1j(cwjVar2, continuation, 13), 3);
                        }
                    }
                } else {
                    znt zntVar = (znt) botVar;
                    v3w.n(zntVar.e, cwjVar2.z, null);
                    if (zntVar.d.contains(cwjVar2.l.R())) {
                        ((zhk) gvjVar.c.getValue()).c();
                        vuo vuoVar = new vuo(true);
                        this.k = 2;
                        if (j0qVar.emit(vuoVar, this) == nm6Var2) {
                        }
                    } else if (z2) {
                        ((zhk) gvjVar.c.getValue()).c();
                        vuo vuoVar2 = new vuo(false);
                        this.k = 3;
                        if (j0qVar.emit(vuoVar2, this) == nm6Var2) {
                        }
                    } else {
                        rar rarVar2 = cwjVar2.C;
                        if (rarVar2 != null) {
                            rarVar2.g(null);
                        }
                        cwjVar2.C = x97.y(ot0.F(cwjVar2), null, null, new h1j(cwjVar2, continuation, 13), 3);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
