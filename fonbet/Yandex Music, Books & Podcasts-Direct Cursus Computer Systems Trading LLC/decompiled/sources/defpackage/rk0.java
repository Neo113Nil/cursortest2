package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rk0 extends aur implements Function2 {
    public int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ qxg l;
    public final /* synthetic */ ayg m;
    public final /* synthetic */ int n;
    public final /* synthetic */ float o;
    public final /* synthetic */ aqi p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk0(boolean z, qxg qxgVar, ayg aygVar, int i, float f, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        zxg zxgVar = zxg.a;
        this.k = z;
        this.l = qxgVar;
        this.m = aygVar;
        this.n = i;
        this.o = f;
        this.p = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        zxg zxgVar = zxg.a;
        return new rk0(this.k, this.l, this.m, this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rk0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        if (r12 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r12 == r0) goto L48;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        qxg qxgVar = this.l;
        aqi aqiVar = this.p;
        boolean z = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (z && !((Boolean) aqiVar.getValue()).booleanValue()) {
                this.j = 1;
                ayg aygVar = (ayg) qxgVar.i.getValue();
                if (qxgVar.e.getValue() != null) {
                    l1j.f();
                    return null;
                }
                float floatValue = ((Number) qxgVar.f.getValue()).floatValue();
                float f = 0.0f;
                if ((floatValue < 0.0f && aygVar == null) || (aygVar != null && floatValue < 0.0f)) {
                    f = 1.0f;
                }
                float f2 = f;
                Object b = qxgVar.n.b(hqi.a, new pxg(qxgVar, (ayg) qxgVar.i.getValue(), f2, !(f2 == ((Number) qxgVar.k.getValue()).floatValue()), null), this);
                if (b != nm6Var) {
                    b = Unit.a;
                }
                if (b != nm6Var) {
                    b = Unit.a;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        aqiVar.setValue(Boolean.valueOf(z));
        if (!z) {
            return Unit.a;
        }
        float floatValue2 = ((Number) qxgVar.k.getValue()).floatValue();
        zxg zxgVar = zxg.a;
        this.j = 2;
        Object b2 = qxgVar.n.b(hqi.a, new mxg(qxgVar, qxgVar.g(), this.n, this.o, this.m, floatValue2, zxgVar, null), this);
        if (b2 != nm6Var) {
            b2 = Unit.a;
        }
    }
}
