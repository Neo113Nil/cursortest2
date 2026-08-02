package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class o4n extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ p4n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4n(p4n p4nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = p4nVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new o4n(this.l, continuation, 0);
            case 1:
                return new o4n(this.l, continuation, 1);
            default:
                return new o4n(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((o4n) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r9 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r9 == r0) goto L26;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        p4n p4nVar = this.l;
        switch (i) {
            case 0:
                jyr jyrVar = p4nVar.e;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    List h = u75.h(new gug((frt) jyrVar.getValue(), 0), new gug((frt) jyrVar.getValue(), 1));
                    h.getClass();
                    gfl gflVar = new gfl(20, p4nVar);
                    this.k = 1;
                    Object collect = zsd.t0(h).collect(gflVar, this);
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = mvn.S(this);
                    break;
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    rj6 rj6Var = (rj6) obj;
                    u4n u4nVar = p4nVar.a;
                    rj6Var.getClass();
                    u4nVar.a(rj6Var instanceof qj6);
                    break;
                }
                String str = (String) obj;
                ((srr) p4nVar.d.getValue()).b().q(str);
                x4n x4nVar = p4nVar.b;
                this.k = 2;
                obj = x4nVar.a(ConstantDeviceInfo.APP_PLATFORM, str, this);
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = mvn.S(this);
                    if (obj == nm6Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((srr) p4nVar.d.getValue()).b().q((String) obj);
                break;
        }
        return Unit.a;
    }
}
