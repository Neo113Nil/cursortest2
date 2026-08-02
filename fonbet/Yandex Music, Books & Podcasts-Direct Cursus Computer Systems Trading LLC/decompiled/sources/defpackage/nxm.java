package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class nxm extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ aqi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxm(boolean z, aqi aqiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z;
        this.m = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nxm(this.l, this.m, continuation, 0);
            default:
                return new nxm(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nxm) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (defpackage.y2x.o(400, r9) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (defpackage.y2x.o(3300, r9) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (defpackage.y2x.o(300, r9) == r0) goto L38;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        boolean z = this.l;
        aqi aqiVar = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (!z) {
                        break;
                    } else {
                        this.k = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 == 2) {
                    qgg.h0(obj);
                    mxm mxmVar = mxm.a;
                    int i3 = oxm.b;
                    aqiVar.setValue(mxmVar);
                    this.k = 3;
                    break;
                } else if (i2 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    mxm mxmVar2 = mxm.c;
                    int i4 = oxm.b;
                    aqiVar.setValue(mxmVar2);
                    break;
                }
                mxm mxmVar3 = mxm.b;
                int i5 = oxm.b;
                aqiVar.setValue(mxmVar3);
                this.k = 2;
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    if (!z) {
                        aqiVar.setValue(Boolean.FALSE);
                        break;
                    } else {
                        this.k = 1;
                        if (y2x.o(350L, this) == nm6Var2) {
                            break;
                        }
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                aqiVar.setValue(Boolean.TRUE);
        }
        return Unit.a;
    }
}
