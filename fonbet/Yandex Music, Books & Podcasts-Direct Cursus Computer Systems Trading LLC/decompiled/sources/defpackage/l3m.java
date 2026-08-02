package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class l3m extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ m3m l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ cvl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3m(m3m m3mVar, cvl cvlVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.l = m3mVar;
        this.n = cvlVar;
        this.m = arrayList;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new l3m(this.l, this.n, this.m, continuation);
            default:
                return new l3m(this.l, this.m, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((l3m) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r11.emit(r1, r10) != r0) goto L28;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.j;
        cvl cvlVar = this.n;
        m3m m3mVar = this.l;
        ArrayList arrayList = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    z2m z2mVar = m3mVar.l;
                    List list = m3mVar.m;
                    this.k = 1;
                    Object c = ((jul) z2mVar.c.getValue()).c(cvlVar, list, arrayList, this);
                    if (c != nm6Var) {
                        c = Unit.a;
                    }
                    if (c == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                try {
                    try {
                    } catch (IOException unused) {
                        x0q x0qVar = m3mVar.p;
                        Unit unit = Unit.a;
                        this.k = 3;
                        break;
                    }
                    if (i3 == 0) {
                        qgg.h0(obj);
                        dq7 dq7Var = ca8.a;
                        mn7 mn7Var = mn7.d;
                        l3m l3mVar = new l3m(m3mVar, cvlVar, arrayList, (Continuation) null);
                        this.k = 1;
                        if (x97.V(mn7Var, l3mVar, this) == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                qgg.h0(obj);
                            } else {
                                if (i3 != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj);
                            }
                            return Unit.a;
                        }
                        qgg.h0(obj);
                    }
                    m3mVar.m = arrayList;
                    xdr xdrVar = m3mVar.n;
                    k3m k3mVar = (k3m) xdrVar.getValue();
                    if (k3mVar instanceof j3m) {
                        do {
                            value = xdrVar.getValue();
                        } while (!xdrVar.k(value, j3m.b((j3m) k3mVar, null, false, 3)));
                    }
                    x0q x0qVar2 = m3mVar.r;
                    Unit unit2 = Unit.a;
                    this.k = 2;
                    break;
                } finally {
                    xdr xdrVar2 = m3mVar.t;
                    Boolean bool = Boolean.FALSE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3m(m3m m3mVar, ArrayList arrayList, cvl cvlVar, Continuation continuation) {
        super(2, continuation);
        this.l = m3mVar;
        this.m = arrayList;
        this.n = cvlVar;
    }
}
