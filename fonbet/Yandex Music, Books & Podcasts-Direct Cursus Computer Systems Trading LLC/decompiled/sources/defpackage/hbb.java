package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class hbb implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ aab c;

    public /* synthetic */ hbb(rjc rjcVar, aab aabVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = aabVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        gbb gbbVar;
        int i;
        lbb lbbVar;
        int i2;
        boolean f0;
        switch (this.a) {
            case 0:
                if (continuation instanceof gbb) {
                    gbbVar = (gbb) continuation;
                    int i3 = gbbVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gbbVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = gbbVar.j;
                        nm6 nm6Var = nm6.a;
                        i = gbbVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            d6l x = p6g.x((e6l) obj);
                            boolean z = false;
                            if (x != null && sj2.m(x.a, this.c) && p6g.C(x)) {
                                z = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            gbbVar.k = 1;
                            if (this.b.emit(valueOf, gbbVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                gbbVar = new gbb(this, continuation);
                Object obj22 = gbbVar.j;
                nm6 nm6Var2 = nm6.a;
                i = gbbVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof lbb) {
                    lbbVar = (lbb) continuation;
                    int i4 = lbbVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lbbVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = lbbVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = lbbVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            d6l x2 = p6g.x((e6l) obj);
                            boolean z2 = false;
                            if (x2 != null) {
                                n7q n7qVar = x2.a;
                                aab aabVar = this.c;
                                if (!(aabVar instanceof lt)) {
                                    if (!(aabVar instanceof u51)) {
                                        if (!(aabVar instanceof eul)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            f0 = szf.f0(n7qVar, ((eul) aabVar).d(), o3q.b, null, null, 28);
                                        }
                                    } else {
                                        f0 = zc4.K(n7qVar, ((u51) aabVar).a, k3q.a, null);
                                    }
                                } else {
                                    f0 = wct.E(n7qVar, ((lt) aabVar).a, i3q.a, null, 12);
                                }
                                if (f0 && p6g.C(x2)) {
                                    z2 = true;
                                }
                            }
                            Boolean valueOf2 = Boolean.valueOf(z2);
                            lbbVar.k = 1;
                            if (this.b.emit(valueOf2, lbbVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                    }
                }
                lbbVar = new lbb(this, continuation);
                Object obj32 = lbbVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = lbbVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
