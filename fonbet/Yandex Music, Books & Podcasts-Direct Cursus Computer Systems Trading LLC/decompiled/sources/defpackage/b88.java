package defpackage;

import android.app.Activity;
import androidx.fragment.app.t;
import defpackage.hmm;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b88 extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public long l;
    public long m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b88(uoi uoiVar, fk0 fk0Var, long j, long j2, act actVar, Continuation continuation) {
        super(2, continuation);
        this.n = uoiVar;
        this.o = fk0Var;
        this.l = j;
        this.m = j2;
        this.p = actVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b88((c88) this.p, continuation);
            case 1:
                return new b88((eqp) this.n, (msp) this.o, (fk0) this.p, this.l, this.m, continuation);
            default:
                return new b88((uoi) this.n, (fk0) this.o, this.l, this.m, (act) this.p, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b88) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
    
        if (r8 > ((r6 * 86400) * 1000)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0106, code lost:
    
        if (r6 == r5) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        p78 p78Var;
        long currentTimeMillis;
        Object a;
        g88 g88Var;
        t tVar;
        switch (this.j) {
            case 0:
                c88 c88Var = (c88) this.p;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    f88 a2 = c88Var.a.a();
                    if (a2 != null) {
                        c88.b(c88Var, a2);
                        j = a2.b;
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    j2 = j;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    p78Var = (p78) ((r78) ((byb) qdcVar.C(I)).b(r78.class)).e.getValue();
                    if (p78Var == null) {
                        return Unit.a;
                    }
                    if (frc.a.e.get()) {
                        if (j2 > p78Var.c) {
                            if (j2 <= p78Var.a) {
                                currentTimeMillis = System.currentTimeMillis();
                                this.n = p78Var;
                                this.l = j2;
                                this.m = currentTimeMillis;
                                this.k = 1;
                                a = c88.a(c88Var, this);
                                break;
                            }
                        }
                        ssg.a(4, "DiskSpaceDialogManager", "Not enough disk space, notify to show the dialog", null);
                        g88 g88Var2 = j2 <= p78Var.c ? fs7.c : l48.c;
                        this.n = null;
                        this.o = g88Var2;
                        this.l = j2;
                        this.k = 2;
                        Object a3 = lmm.a((wb7) c88Var.e.getValue(), new v78(2, null), this);
                        if (a3 != nm6Var) {
                            a3 = Unit.a;
                        }
                        if (a3 != nm6Var) {
                            g88Var = g88Var2;
                            Activity activity = (Activity) CollectionsKt.Z(frc.a.c);
                            if (!(activity instanceof t)) {
                            }
                            if (tVar != null) {
                            }
                        }
                        return nm6Var;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g88Var = (g88) this.o;
                    qgg.h0(obj);
                    Activity activity2 = (Activity) CollectionsKt.Z(frc.a.c);
                    tVar = !(activity2 instanceof t) ? (t) activity2 : null;
                    if (tVar != null) {
                        return Unit.a;
                    }
                    e88 e88Var = new e88(0);
                    pu0 t = pd.t(new qzm[0]);
                    g88Var.getClass();
                    sai saiVar = new sai(false);
                    n78 n78Var = new n78(tVar, e88Var, saiVar);
                    cvo cvoVar = cvo.i;
                    fxf.P(tVar, o6m.b(wjb.NotEnoughDiskSpaceScreen, null, 6), saiVar, t, null, new wn5(new jv(3, g88Var, n78Var), 1740434509, true), 20);
                    return Unit.a;
                }
                currentTimeMillis = this.m;
                j2 = this.l;
                p78Var = (p78) this.n;
                qgg.h0(obj);
                a = obj;
                long longValue = currentTimeMillis - ((Number) a).longValue();
                int i2 = p78Var.b;
                hmm.a aVar = d88.a;
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    eqp eqpVar = (eqp) this.n;
                    msp mspVar = (msp) this.o;
                    bun bunVar = new bun((fk0) this.p, this.l, this.m, null);
                    this.k = 1;
                    if (eqpVar.a(mspVar, bunVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = ((uoi) this.n).a;
                x8v x8vVar = new x8v((fk0) this.o, this.l, this.m, (act) this.p);
                this.k = 1;
                x0qVar.collect(x8vVar, this);
                return nm6Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b88(c88 c88Var, Continuation continuation) {
        super(2, continuation);
        this.p = c88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b88(eqp eqpVar, msp mspVar, fk0 fk0Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.n = eqpVar;
        this.o = mspVar;
        this.p = fk0Var;
        this.l = j;
        this.m = j2;
    }
}
