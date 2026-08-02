package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b05 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ e15 c;
    public final /* synthetic */ String d;

    public /* synthetic */ b05(rjc rjcVar, e15 e15Var, String str, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = e15Var;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        a05 a05Var;
        Object obj2;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        int i2;
        d05 d05Var;
        Object obj3;
        nm6 nm6Var2;
        int i3;
        rjc rjcVar2;
        int i4;
        y05 y05Var;
        Object obj4;
        nm6 nm6Var3;
        int i5;
        rjc rjcVar3;
        int i6;
        z05 z05Var;
        Object obj5;
        nm6 nm6Var4;
        int i7;
        rjc rjcVar4;
        int i8;
        switch (this.a) {
            case 0:
                if (continuation instanceof a05) {
                    a05Var = (a05) continuation;
                    int i9 = a05Var.k;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        a05Var.k = i9 - Integer.MIN_VALUE;
                        obj2 = a05Var.j;
                        nm6Var = nm6.a;
                        i = a05Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjcVar = this.b;
                            a05Var.m = rjcVar;
                            i2 = 0;
                            a05Var.n = 0;
                            a05Var.k = 1;
                            List list = dw.MyMusicAlbums.a;
                            obj2 = x97.V(dm6.b, new m05(this.c, vz1.k(list, list), this.d, null), a05Var);
                            if (obj2 == nm6Var) {
                            }
                        } else if (i == 1) {
                            i2 = a05Var.n;
                            rjcVar = a05Var.m;
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        a05Var.m = null;
                        a05Var.n = i2;
                        a05Var.k = 2;
                        if (rjcVar.emit(obj2, a05Var) == nm6Var) {
                        }
                    }
                }
                a05Var = new a05(this, continuation);
                obj2 = a05Var.j;
                nm6Var = nm6.a;
                i = a05Var.k;
                if (i != 0) {
                }
                a05Var.m = null;
                a05Var.n = i2;
                a05Var.k = 2;
                if (rjcVar.emit(obj2, a05Var) == nm6Var) {
                }
                break;
            case 1:
                if (continuation instanceof d05) {
                    d05Var = (d05) continuation;
                    int i10 = d05Var.k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        d05Var.k = i10 - Integer.MIN_VALUE;
                        obj3 = d05Var.j;
                        nm6Var2 = nm6.a;
                        i3 = d05Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj3);
                            rjcVar2 = this.b;
                            d05Var.m = rjcVar2;
                            i4 = 0;
                            d05Var.n = 0;
                            d05Var.k = 1;
                            e15 e15Var = this.c;
                            e15Var.getClass();
                            List list2 = dw.MyMusicAlbums.a;
                            obj3 = x97.V(dm6.b, new n05(e15Var, null, vz1.k(list2, list2), Boolean.FALSE, this.d, null), d05Var);
                            if (obj3 == nm6Var2) {
                            }
                        } else if (i3 == 1) {
                            i4 = d05Var.n;
                            rjcVar2 = d05Var.m;
                            qgg.h0(obj3);
                        } else if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                        d05Var.m = null;
                        d05Var.n = i4;
                        d05Var.k = 2;
                        if (rjcVar2.emit(obj3, d05Var) == nm6Var2) {
                        }
                    }
                }
                d05Var = new d05(this, continuation);
                obj3 = d05Var.j;
                nm6Var2 = nm6.a;
                i3 = d05Var.k;
                if (i3 != 0) {
                }
                d05Var.m = null;
                d05Var.n = i4;
                d05Var.k = 2;
                if (rjcVar2.emit(obj3, d05Var) == nm6Var2) {
                }
                break;
            case 2:
                if (continuation instanceof y05) {
                    y05Var = (y05) continuation;
                    int i11 = y05Var.k;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        y05Var.k = i11 - Integer.MIN_VALUE;
                        obj4 = y05Var.j;
                        nm6Var3 = nm6.a;
                        i5 = y05Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj4);
                            rjcVar3 = this.b;
                            y05Var.m = rjcVar3;
                            i6 = 0;
                            y05Var.n = 0;
                            y05Var.k = 1;
                            List list3 = gys.MyMusicWithKids.a;
                            list3.getClass();
                            obj4 = x97.V(dm6.b, new r05(this.c, new thn(list3), this.d, null), y05Var);
                            if (obj4 == nm6Var3) {
                            }
                        } else if (i5 == 1) {
                            i6 = y05Var.n;
                            rjcVar3 = y05Var.m;
                            qgg.h0(obj4);
                        } else if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                            break;
                        }
                        y05Var.m = null;
                        y05Var.n = i6;
                        y05Var.k = 2;
                        if (rjcVar3.emit(obj4, y05Var) == nm6Var3) {
                        }
                    }
                }
                y05Var = new y05(this, continuation);
                obj4 = y05Var.j;
                nm6Var3 = nm6.a;
                i5 = y05Var.k;
                if (i5 != 0) {
                }
                y05Var.m = null;
                y05Var.n = i6;
                y05Var.k = 2;
                if (rjcVar3.emit(obj4, y05Var) == nm6Var3) {
                }
                break;
            default:
                if (continuation instanceof z05) {
                    z05Var = (z05) continuation;
                    int i12 = z05Var.k;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        z05Var.k = i12 - Integer.MIN_VALUE;
                        obj5 = z05Var.j;
                        nm6Var4 = nm6.a;
                        i7 = z05Var.k;
                        if (i7 != 0) {
                            qgg.h0(obj5);
                            rjcVar4 = this.b;
                            z05Var.m = rjcVar4;
                            i8 = 0;
                            z05Var.n = 0;
                            z05Var.k = 1;
                            List list4 = gys.MyMusicWithKids.a;
                            list4.getClass();
                            obj5 = x97.V(dm6.b, new o05(this.c, null, new thn(list4), Boolean.FALSE, this.d, null), z05Var);
                            if (obj5 == nm6Var4) {
                            }
                        } else if (i7 == 1) {
                            i8 = z05Var.n;
                            rjcVar4 = z05Var.m;
                            qgg.h0(obj5);
                        } else if (i7 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                            break;
                        }
                        z05Var.m = null;
                        z05Var.n = i8;
                        z05Var.k = 2;
                        if (rjcVar4.emit(obj5, z05Var) == nm6Var4) {
                        }
                    }
                }
                z05Var = new z05(this, continuation);
                obj5 = z05Var.j;
                nm6Var4 = nm6.a;
                i7 = z05Var.k;
                if (i7 != 0) {
                }
                z05Var.m = null;
                z05Var.n = i8;
                z05Var.k = 2;
                if (rjcVar4.emit(obj5, z05Var) == nm6Var4) {
                }
                break;
        }
        return Unit.a;
    }
}
