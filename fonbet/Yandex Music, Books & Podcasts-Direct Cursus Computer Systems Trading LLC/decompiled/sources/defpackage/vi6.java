package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class vi6 extends aur implements pyc {
    public final /* synthetic */ int j;
    public rqm k;
    public int l;
    public /* synthetic */ pqm m;
    public /* synthetic */ long n;
    public final /* synthetic */ uoi o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ aqi q;
    public final /* synthetic */ aqi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi6(uoi uoiVar, Function1 function1, aqi aqiVar, aqi aqiVar2, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.o = uoiVar;
        this.p = function1;
        this.q = aqiVar;
        this.r = aqiVar2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pqm pqmVar = (pqm) obj;
        enj enjVar = (enj) obj2;
        switch (this.j) {
            case 0:
                long j = enjVar.a;
                aqi aqiVar = this.r;
                vi6 vi6Var = new vi6(this.o, this.p, this.q, aqiVar, (Continuation) obj3, 0);
                vi6Var.m = pqmVar;
                vi6Var.n = j;
                return vi6Var.invokeSuspend(Unit.a);
            default:
                long j2 = enjVar.a;
                aqi aqiVar2 = this.r;
                vi6 vi6Var2 = new vi6(this.o, this.p, this.q, aqiVar2, (Continuation) obj3, 1);
                vi6Var2.m = pqmVar;
                vi6Var2.n = j2;
                return vi6Var2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r6.a(r15, r14) != r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        if (r6.a(r15, r14) != r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rqm rqmVar;
        rqm rqmVar2;
        int i = this.j;
        Function1 function1 = this.p;
        aqi aqiVar = this.q;
        uoi uoiVar = this.o;
        aqi aqiVar2 = this.r;
        switch (i) {
            case 0:
                pqm pqmVar = this.m;
                long j = this.n;
                nm6 nm6Var = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) aqiVar.getValue()).booleanValue()) {
                        rqm rqmVar3 = new rqm(j);
                        uoiVar.b(rqmVar3);
                        this.m = null;
                        this.k = rqmVar3;
                        this.n = j;
                        this.l = 1;
                        Object h = pqmVar.h(this);
                        if (h != nm6Var) {
                            rqmVar = rqmVar3;
                            obj = h;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                            }
                            if (!booleanValue) {
                            }
                            this.m = null;
                            this.k = null;
                            this.n = j;
                            this.l = 2;
                        }
                        break;
                    }
                } else if (i2 == 1) {
                    rqmVar = this.k;
                    qgg.h0(obj);
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                        aqiVar2.setValue(Boolean.FALSE);
                        function1.invoke(zug.b);
                    }
                    tre sqmVar = !booleanValue2 ? new sqm(rqmVar) : new qqm(rqmVar);
                    this.m = null;
                    this.k = null;
                    this.n = j;
                    this.l = 2;
                    break;
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
            default:
                pqm pqmVar2 = this.m;
                long j2 = this.n;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    float f = fj6.a;
                    if (((Boolean) aqiVar.getValue()).booleanValue()) {
                        rqm rqmVar4 = new rqm(j2);
                        uoiVar.b(rqmVar4);
                        this.m = null;
                        this.k = rqmVar4;
                        this.n = j2;
                        this.l = 1;
                        Object h2 = pqmVar2.h(this);
                        if (h2 != nm6Var2) {
                            rqmVar2 = rqmVar4;
                            obj = h2;
                            boolean booleanValue3 = ((Boolean) obj).booleanValue();
                            float f2 = fj6.a;
                            if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                            }
                            if (!booleanValue3) {
                            }
                            this.m = null;
                            this.k = null;
                            this.n = j2;
                            this.l = 2;
                        }
                        break;
                    }
                } else if (i3 == 1) {
                    rqmVar2 = this.k;
                    qgg.h0(obj);
                    boolean booleanValue32 = ((Boolean) obj).booleanValue();
                    float f22 = fj6.a;
                    if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                        aqiVar2.setValue(Boolean.FALSE);
                        function1.invoke(b6h.b);
                    }
                    tre sqmVar2 = !booleanValue32 ? new sqm(rqmVar2) : new qqm(rqmVar2);
                    this.m = null;
                    this.k = null;
                    this.n = j2;
                    this.l = 2;
                    break;
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
        }
        return Unit.a;
    }
}
