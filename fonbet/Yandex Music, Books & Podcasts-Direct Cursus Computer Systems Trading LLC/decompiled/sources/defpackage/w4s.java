package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class w4s implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ c5s c;

    public /* synthetic */ w4s(rjc rjcVar, c5s c5sVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = c5sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        v4s v4sVar;
        Object obj2;
        int i;
        rjc rjcVar;
        int i2;
        z4s z4sVar;
        Object obj3;
        int i3;
        rjc rjcVar2;
        int i4;
        switch (this.a) {
            case 0:
                if (continuation instanceof v4s) {
                    v4sVar = (v4s) continuation;
                    int i5 = v4sVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        v4sVar.k = i5 - Integer.MIN_VALUE;
                        obj2 = v4sVar.j;
                        nm6 nm6Var = nm6.a;
                        i = v4sVar.k;
                        Continuation continuation2 = null;
                        if (i != 0) {
                            qgg.h0(obj2);
                            ((Boolean) obj).getClass();
                            k5s k5sVar = this.c.k;
                            v4sVar.m = obj;
                            rjcVar = this.b;
                            v4sVar.n = rjcVar;
                            i2 = 0;
                            v4sVar.o = 0;
                            v4sVar.k = 1;
                            obj2 = x97.V(dm6.b, new v0r(k5sVar, continuation2, 19), v4sVar);
                            if (obj2 == nm6Var) {
                            }
                        } else if (i == 1) {
                            int i6 = v4sVar.o;
                            rjcVar = v4sVar.n;
                            Object obj4 = v4sVar.m;
                            qgg.h0(obj2);
                            i2 = i6;
                            obj = obj4;
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            v4sVar.m = null;
                            v4sVar.n = null;
                            v4sVar.o = i2;
                            v4sVar.k = 2;
                            if (rjcVar.emit(obj, v4sVar) == nm6Var) {
                            }
                        }
                    }
                }
                v4sVar = new v4s(this, continuation);
                obj2 = v4sVar.j;
                nm6 nm6Var2 = nm6.a;
                i = v4sVar.k;
                Continuation continuation22 = null;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                break;
            default:
                if (continuation instanceof z4s) {
                    z4sVar = (z4s) continuation;
                    int i7 = z4sVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        z4sVar.k = i7 - Integer.MIN_VALUE;
                        obj3 = z4sVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i3 = z4sVar.k;
                        Continuation continuation3 = null;
                        if (i3 != 0) {
                            qgg.h0(obj3);
                            ((Boolean) obj).getClass();
                            k5s k5sVar2 = this.c.k;
                            z4sVar.m = obj;
                            rjcVar2 = this.b;
                            z4sVar.n = rjcVar2;
                            i4 = 0;
                            z4sVar.o = 0;
                            z4sVar.k = 1;
                            obj3 = x97.V(dm6.b, new v0r(k5sVar2, continuation3, 19), z4sVar);
                            if (obj3 == nm6Var3) {
                            }
                        } else if (i3 == 1) {
                            int i8 = z4sVar.o;
                            rjcVar2 = z4sVar.n;
                            Object obj5 = z4sVar.m;
                            qgg.h0(obj3);
                            i4 = i8;
                            obj = obj5;
                        } else if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            z4sVar.m = null;
                            z4sVar.n = null;
                            z4sVar.o = i4;
                            z4sVar.k = 2;
                            if (rjcVar2.emit(obj, z4sVar) == nm6Var3) {
                            }
                        }
                    }
                }
                z4sVar = new z4s(this, continuation);
                obj3 = z4sVar.j;
                nm6 nm6Var32 = nm6.a;
                i3 = z4sVar.k;
                Continuation continuation32 = null;
                if (i3 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
                break;
        }
        return Unit.a;
    }
}
