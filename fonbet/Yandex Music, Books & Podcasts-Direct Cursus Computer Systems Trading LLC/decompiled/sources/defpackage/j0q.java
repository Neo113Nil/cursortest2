package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class j0q implements dib {
    public final x0q a = y0q.b(0, 0, null, 7);

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        h0q h0qVar;
        int i;
        if (continuation instanceof h0q) {
            h0qVar = (h0q) continuation;
            int i2 = h0qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0qVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h0qVar.j;
                nm6 nm6Var = nm6.a;
                i = h0qVar.l;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                h0qVar.l = 1;
                this.a.collect(rjcVar, h0qVar);
                return nm6Var;
            }
        }
        h0qVar = new h0q(this, continuation);
        Object obj2 = h0qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = h0qVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r4.emit(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (defpackage.zsd.h0(r10, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        i0q i0qVar;
        int i;
        if (continuation instanceof i0q) {
            i0qVar = (i0q) continuation;
            int i2 = i0qVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0qVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = i0qVar.k;
                nm6 nm6Var = nm6.a;
                i = i0qVar.m;
                Continuation continuation2 = null;
                x0q x0qVar = this.a;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj2);
                    wor i4 = x0qVar.i();
                    dt0 dt0Var = new dt0(i3, 17, continuation2);
                    i0qVar.j = obj;
                    i0qVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = i0qVar.j;
                    qgg.h0(obj2);
                }
                i0qVar.j = null;
                i0qVar.m = 2;
            }
        }
        i0qVar = new i0q(this, continuation);
        Object obj22 = i0qVar.k;
        nm6 nm6Var2 = nm6.a;
        i = i0qVar.m;
        Continuation continuation22 = null;
        x0q x0qVar2 = this.a;
        int i32 = 2;
        if (i != 0) {
        }
        i0qVar.j = null;
        i0qVar.m = 2;
    }
}
