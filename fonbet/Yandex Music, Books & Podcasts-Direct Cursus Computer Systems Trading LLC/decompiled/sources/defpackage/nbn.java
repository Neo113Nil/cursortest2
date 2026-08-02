package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class nbn implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ sbn c;

    public /* synthetic */ nbn(rjc rjcVar, sbn sbnVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = sbnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        mbn mbnVar;
        int i;
        rjc rjcVar;
        sbn sbnVar;
        Object obj2;
        int i2;
        boolean z;
        pbn pbnVar;
        int i3;
        rjc rjcVar2;
        sbn sbnVar2;
        Object obj3;
        int i4;
        boolean z2;
        switch (this.a) {
            case 0:
                if (continuation instanceof mbn) {
                    mbnVar = (mbn) continuation;
                    int i5 = mbnVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mbnVar.k = i5 - Integer.MIN_VALUE;
                        Object obj4 = mbnVar.j;
                        nm6 nm6Var = nm6.a;
                        i = mbnVar.k;
                        if (i != 0) {
                            qgg.h0(obj4);
                            sbn sbnVar3 = this.c;
                            uol uolVar = sbnVar3.a.c;
                            mbnVar.m = obj;
                            rjc rjcVar3 = this.b;
                            mbnVar.n = rjcVar3;
                            mbnVar.o = sbnVar3;
                            mbnVar.p = 0;
                            mbnVar.k = 1;
                            Object f = uolVar.f(mbnVar);
                            if (f != nm6Var) {
                                rjcVar = rjcVar3;
                                sbnVar = sbnVar3;
                                obj2 = f;
                                i2 = 0;
                            }
                        } else if (i == 1) {
                            int i6 = mbnVar.p;
                            sbn sbnVar4 = mbnVar.o;
                            rjc rjcVar4 = mbnVar.n;
                            Object obj5 = mbnVar.m;
                            qgg.h0(obj4);
                            i2 = i6;
                            obj = obj5;
                            rjcVar = rjcVar4;
                            sbnVar = sbnVar4;
                            obj2 = obj4;
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                            break;
                        }
                        long longValue = ((Number) obj2).longValue();
                        z = sbnVar.b != longValue;
                        sbnVar.b = longValue;
                        if (z) {
                            mbnVar.m = null;
                            mbnVar.n = null;
                            mbnVar.o = null;
                            mbnVar.p = i2;
                            mbnVar.k = 2;
                            if (rjcVar.emit(obj, mbnVar) == nm6Var) {
                            }
                        }
                    }
                }
                mbnVar = new mbn(this, continuation);
                Object obj42 = mbnVar.j;
                nm6 nm6Var2 = nm6.a;
                i = mbnVar.k;
                if (i != 0) {
                }
                long longValue2 = ((Number) obj2).longValue();
                if (sbnVar.b != longValue2) {
                }
                sbnVar.b = longValue2;
                if (z) {
                }
                break;
            default:
                if (continuation instanceof pbn) {
                    pbnVar = (pbn) continuation;
                    int i7 = pbnVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        pbnVar.k = i7 - Integer.MIN_VALUE;
                        Object obj6 = pbnVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i3 = pbnVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj6);
                            sbn sbnVar5 = this.c;
                            uol uolVar2 = sbnVar5.a.c;
                            pbnVar.m = obj;
                            rjc rjcVar5 = this.b;
                            pbnVar.n = rjcVar5;
                            pbnVar.o = sbnVar5;
                            pbnVar.p = 0;
                            pbnVar.k = 1;
                            Object f2 = uolVar2.f(pbnVar);
                            if (f2 != nm6Var3) {
                                rjcVar2 = rjcVar5;
                                sbnVar2 = sbnVar5;
                                obj3 = f2;
                                i4 = 0;
                            }
                        } else if (i3 == 1) {
                            int i8 = pbnVar.p;
                            sbn sbnVar6 = pbnVar.o;
                            rjc rjcVar6 = pbnVar.n;
                            Object obj7 = pbnVar.m;
                            qgg.h0(obj6);
                            i4 = i8;
                            obj = obj7;
                            rjcVar2 = rjcVar6;
                            sbnVar2 = sbnVar6;
                            obj3 = obj6;
                        } else if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                            break;
                        }
                        long longValue3 = ((Number) obj3).longValue();
                        z2 = sbnVar2.b != longValue3;
                        sbnVar2.b = longValue3;
                        if (z2) {
                            pbnVar.m = null;
                            pbnVar.n = null;
                            pbnVar.o = null;
                            pbnVar.p = i4;
                            pbnVar.k = 2;
                            if (rjcVar2.emit(obj, pbnVar) == nm6Var3) {
                            }
                        }
                    }
                }
                pbnVar = new pbn(this, continuation);
                Object obj62 = pbnVar.j;
                nm6 nm6Var32 = nm6.a;
                i3 = pbnVar.k;
                if (i3 != 0) {
                }
                long longValue32 = ((Number) obj3).longValue();
                if (sbnVar2.b != longValue32) {
                }
                sbnVar2.b = longValue32;
                if (z2) {
                }
                break;
        }
        return Unit.a;
    }
}
