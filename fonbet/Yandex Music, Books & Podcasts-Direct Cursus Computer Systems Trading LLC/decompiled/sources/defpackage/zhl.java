package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class zhl implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ e6l c;

    public /* synthetic */ zhl(rjc rjcVar, e6l e6lVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = e6lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        yhl yhlVar;
        int i;
        mql mqlVar;
        int i2;
        zor zorVar;
        int i3;
        apr aprVar;
        int i4;
        switch (this.a) {
            case 0:
                if (continuation instanceof yhl) {
                    yhlVar = (yhl) continuation;
                    int i5 = yhlVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yhlVar.k = i5 - Integer.MIN_VALUE;
                        Object obj2 = yhlVar.j;
                        nm6 nm6Var = nm6.a;
                        i = yhlVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Object whlVar = ((Boolean) obj).booleanValue() ? vhl.a : new whl(((d6l) this.c).a);
                            yhlVar.k = 1;
                            if (this.b.emit(whlVar, yhlVar) == nm6Var) {
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
                yhlVar = new yhl(this, continuation);
                Object obj22 = yhlVar.j;
                nm6 nm6Var2 = nm6.a;
                i = yhlVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof mql) {
                    mqlVar = (mql) continuation;
                    int i6 = mqlVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        mqlVar.k = i6 - Integer.MIN_VALUE;
                        Object obj3 = mqlVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = mqlVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Object kqlVar = ((Boolean) obj).booleanValue() ? jql.a : new kql(((d6l) this.c).a);
                            mqlVar.k = 1;
                            if (this.b.emit(kqlVar, mqlVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                mqlVar = new mql(this, continuation);
                Object obj32 = mqlVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = mqlVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof zor) {
                    zorVar = (zor) continuation;
                    int i7 = zorVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        zorVar.k = i7 - Integer.MIN_VALUE;
                        Object obj4 = zorVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = zorVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            zorVar.k = 1;
                            if (this.b.emit(this.c, zorVar) == nm6Var4) {
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                zorVar = new zor(this, continuation);
                Object obj42 = zorVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = zorVar.k;
                if (i3 != 0) {
                }
                break;
            default:
                if (continuation instanceof apr) {
                    aprVar = (apr) continuation;
                    int i8 = aprVar.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        aprVar.k = i8 - Integer.MIN_VALUE;
                        Object obj5 = aprVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = aprVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            aprVar.k = 1;
                            if (this.b.emit(this.c, aprVar) == nm6Var5) {
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                aprVar = new apr(this, continuation);
                Object obj52 = aprVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = aprVar.k;
                if (i4 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
